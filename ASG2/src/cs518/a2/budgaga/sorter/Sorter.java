package cs518.a2.budgaga.sorter;

import cs518.a2.budgaga.core.BibtexEntry;
import java.util.*;

/**
 *
 * @author budgaga
 */
public abstract class Sorter {
    private HashMap<String,String>  listToBeSorted  = new HashMap<> ();
    private int                     currentIndex    = -1;
         
    protected void addEntry(String key, String Value){
        if (!listToBeSorted.containsKey(key))
            listToBeSorted.put(key, Value);
    }
    
    public void setList(HashMap<String, BibtexEntry> list){
        listToBeSorted.clear();
        for (BibtexEntry entry : list.values()) {
            addEntry(entry.getKey(),getValue(entry));
        }
        sortByValue ();
    }
    
    public void sortByValue() {
        currentIndex    = -1;
        List<Map.Entry<String, String>> list = new LinkedList<>(listToBeSorted.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> m1, Map.Entry<String, String> m2) {
                return (m1.getValue()).compareTo(m2.getValue());
            }
        });

        Map<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        listToBeSorted = (HashMap<String, String>) result;
    }
    
    public String nextKey(){ 
        int idx =-1;
        ++currentIndex;
        for (String key:listToBeSorted.keySet()){
            if (++idx == currentIndex)
                return key;
       }
       return null;
    }
    
    protected abstract String getValue(BibtexEntry entry); 
}
