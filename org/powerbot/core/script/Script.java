
package org.powerbot.core.script;

import org.powerbot.core.script.job.Container;
import org.powerbot.core.script.job.Job;
import java.util.List;

public interface Script
{
    List<Job> getStartupJobs();
    
    void start();
    
    boolean isActive();
    
    boolean isPaused();
    
    void setPaused(final boolean p0);
    
    void shutdown();
    
    boolean isShutdown();
    
    void stop();
    
    Container getContainer();
}
