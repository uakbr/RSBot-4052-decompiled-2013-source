
package org.powerbot.game.api.wrappers;

import java.awt.Point;

public interface ViewportEntity extends Verifiable
{
    Point getCentralPoint();
    
    Point getNextViewportPoint();
    
    boolean contains(final Point p0);
}
