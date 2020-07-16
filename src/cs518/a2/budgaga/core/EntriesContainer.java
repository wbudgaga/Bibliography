/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.core;

import java.util.HashMap;

/**
 *
 * @author budgaga
 */
public class EntriesContainer {
    private HashMap<String,BibtexEntry> entries = new HashMap<> (); //<key,BibtexEntry>
    
    public EntriesContainer(String bibtexEntries){ 
        String[] entriesText = bibtexEntries.split("@article");
        for(int i=1;i<entriesText.length;++i){
             BibtexEntry entry = new BibtexEntry(entriesText[i].replaceAll("\n", ""));
             if (!entries.containsKey(entry.getKey()))
                entries.put(entry.getKey(), entry);
        }
    }
         
    public HashMap<String,BibtexEntry> getEntries(){
        return entries;
    }
    
    public String getEntry(String key){
        return entries.get(key).toString();
    }
}
