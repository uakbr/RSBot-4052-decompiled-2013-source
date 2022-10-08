
package org.powerbot.core.event;

import java.util.EventListener;
import java.util.EventObject;

public interface EventManager extends Runnable
{
    void dispatch(final EventObject p0);
    
    void fire(final EventObject p0);
    
    void addListener(final EventListener p0);
    
    void removeListener(final EventListener p0);
    
    EventListener[] getListeners();
    
    void stop();
}
