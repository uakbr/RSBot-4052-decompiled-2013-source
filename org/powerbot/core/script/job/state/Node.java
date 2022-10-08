
package org.powerbot.core.script.job.state;

import org.powerbot.core.script.job.Task;

public abstract class Node extends Task
{
    public static boolean b;
    
    public abstract boolean activate();
}
