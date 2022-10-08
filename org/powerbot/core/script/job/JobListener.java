
package org.powerbot.core.script.job;

public interface JobListener
{
    void jobStarted(final Job p0);
    
    void jobStopped(final Job p0);
}
