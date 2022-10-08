
package org.powerbot.game.api.wrappers;

public interface Locatable
{
    @Deprecated
    RegionOffset getRegionOffset();
    
    Tile getLocation();
}
