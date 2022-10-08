
package org.powerbot.game.client;

public interface RSItemDef
{
    String[] getActions();
    
    RSItemDefLoader getLoader();
    
    int getID();
    
    String getName();
    
    boolean isMembersObject();
    
    String[] getGroundActions();
}
