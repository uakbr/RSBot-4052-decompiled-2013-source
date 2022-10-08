
package org.powerbot.game.bot;

import org.powerbot.core.script.job.Task;
import java.util.EventObject;
import org.powerbot.core.event.events.MessageEvent;
import org.powerbot.core.script.methods.Calculations;
import org.powerbot.game.client.Render;
import org.powerbot.core.Bot;
import org.powerbot.game.client.Callback;

public class a implements Callback
{
    private final Bot a;
    
    public a(final Bot a) {
        this.a = a;
    }
    
    @Override
    public void updateRenderInfo(final Render render) {
        Calculations.updateToolkit(render);
    }
    
    @Override
    public void notifyMessage(final int n, final String s, final String s2) {
        final int a = Context.a;
        this.a.getEventManager().dispatch(new MessageEvent(n, s, s2));
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
}
