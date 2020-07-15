/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cs518.a2.budgaga.sorter;

import cs518.a2.budgaga.core.BibtexEntry;
import java.util.HashMap;

/**
 *
 * @author budgaga
 */
public class SorterByPublicationDate extends Sorter{
 
    @Override
    protected String getValue(BibtexEntry entry){
        int month = entry.getMonth(); 
        if (month<10)
            return entry.getYear()+"0"+month;
        return entry.getYear()+""+month;
    }
}
