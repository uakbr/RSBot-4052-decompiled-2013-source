
package org.powerbot.game.client;

public interface Render
{
    float getAbsoluteX();
    
    float getAbsoluteY();
    
    float getXMultiplier();
    
    float getYMultiplier();
    
    int getGraphicsIndex();
    
    RenderData getRenderData();
}
