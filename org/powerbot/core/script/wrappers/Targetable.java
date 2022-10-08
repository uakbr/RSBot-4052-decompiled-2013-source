
package org.powerbot.core.script.wrappers;

import java.awt.Point;

public interface Targetable
{
    Point getInteractPoint();
    
    Point getNextPoint();
    
    Point getCenterPoint();
    
    boolean contains(final Point p0);
}
