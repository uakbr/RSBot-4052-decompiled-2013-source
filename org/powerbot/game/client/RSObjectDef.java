
package org.powerbot.game.client;

public interface RSObjectDef
{
    String getName();
    
    String[] getActions();
    
    RSObjectDefLoader getLoader();
    
    int getID();
}
