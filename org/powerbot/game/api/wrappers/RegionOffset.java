
package org.powerbot.game.api.wrappers;

@Deprecated
public class RegionOffset
{
    protected final int x;
    protected final int y;
    protected final int plane;
    
    public RegionOffset(final int x, final int y, final int plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getPlane() {
        return this.plane;
    }
}
