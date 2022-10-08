
package org.powerbot.core.script.job;

import java.util.EventListener;

public interface Job extends EventListener
{
    void work();
    
    boolean join();
    
    boolean isAlive();
    
    void interrupt();
    
    boolean isInterrupted();
    
    void setContainer(final Container p0);
    
    Container getContainer();
}
