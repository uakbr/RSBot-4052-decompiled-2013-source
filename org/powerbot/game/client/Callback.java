
package org.powerbot.game.client;

public interface Callback
{
    void updateRenderInfo(final Render p0);
    
    void notifyMessage(final int p0, final String p1, final String p2);
}
