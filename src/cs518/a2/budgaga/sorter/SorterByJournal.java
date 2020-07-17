
package cs518.a2.budgaga.sorter;

import cs518.a2.budgaga.core.BibtexEntry;

/**
 *
 * @author budgaga
 */
public class SorterByJournal extends Sorter{
    @Override
    protected String getValue(BibtexEntry entry){
        return entry.getJournal() + entry.getTitle();
    }
}
