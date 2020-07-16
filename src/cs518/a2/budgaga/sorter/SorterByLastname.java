/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.sorter;

import cs518.a2.budgaga.core.BibtexEntry;

/**
 *
 * @author budgaga
 */
public class SorterByLastname extends Sorter{
     //getFirstAuthorLastname
    @Override
    protected String getValue(BibtexEntry entry){
       String[] names = entry.getAuthor().split("and");
       String[] firstAuthor = names[0].split(" ");
       return firstAuthor[firstAuthor.length - 1];
    }
 }
