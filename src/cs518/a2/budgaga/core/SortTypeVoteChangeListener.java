package cs518.a2.budgaga.core;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;

/**
 *
 * @author budgaga
 */
public class SortTypeVoteChangeListener  implements VetoableChangeListener {

    @Override
    public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
       if (evt.getNewValue() == false)
           throw new PropertyVetoException(evt.getPropertyName()+": False setting is not allowed", evt);
       ((Bibliography)evt.getOldValue()).reset();
    }
    
}
