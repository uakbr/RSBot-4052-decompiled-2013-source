
package org.powerbot.game.client;

public interface RSGround
{
    RSAnimableNode getRSAnimableList();
    
    RSObject getBoundary1();
    
    RSObject getBoundary2();
    
    RSObject getWallDecoration1();
    
    RSObject getWallDecoration2();
    
    RSObject getFloorDecoration();
    
    RSItemPile getRSItemPile();
}
