
package org.powerbot.core.script.internal.input;

import java.awt.Point;

public interface MouseImpl
{
    int getPressDuration();
    
    Point getNextPoint(final Point p0);
}
