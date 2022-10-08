
package org.powerbot.core.script.job;

public interface Container
{
    void submit(final Job p0);
    
    void setPaused(final boolean p0);
    
    boolean isPaused();
    
    Job[] enumerate();
    
    int getActiveCount();
    
    Container branch();
    
    Container[] getChildren();
    
    void shutdown();
    
    boolean isShutdown();
    
    void interrupt();
    
    boolean isTerminated();
    
    void addListener(final JobListener p0);
    
    void removeListener(final JobListener p0);
}
