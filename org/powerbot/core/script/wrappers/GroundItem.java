
package org.powerbot.core.script.wrappers;

public class GroundItem implements Locatable
{
    private final Tile tile;
    private final Item item;
    
    public GroundItem(final Tile tile, final Item item) {
        this.tile = tile;
        this.item = item;
    }
    
    @Override
    public Tile getLocation() {
        return this.tile;
    }
}
