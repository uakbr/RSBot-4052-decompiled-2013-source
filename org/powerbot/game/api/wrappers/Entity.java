
package org.powerbot.game.api.wrappers;

import java.awt.Graphics;
import java.awt.Polygon;

public interface Entity extends ViewportEntity
{
    boolean isOnScreen();
    
    Polygon[] getBounds();
    
    boolean hover();
    
    boolean click(final boolean p0);
    
    boolean interact(final String p0);
    
    boolean interact(final String p0, final String p1);
    
    void draw(final Graphics p0);
}
