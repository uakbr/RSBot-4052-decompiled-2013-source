
package org.powerbot.core.script.wrappers;

public interface Interactive extends Targetable
{
    boolean hover();
    
    boolean click(final boolean p0);
    
    boolean interact(final String p0);
    
    boolean interact(final String p0, final String p1);
}
