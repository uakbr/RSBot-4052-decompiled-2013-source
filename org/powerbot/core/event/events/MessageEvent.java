
package org.powerbot.core.event.events;

import org.powerbot.core.event.listeners.MessageListener;
import java.util.EventListener;
import org.powerbot.core.script.job.Task;
import org.powerbot.core.event.GameEvent;

public class MessageEvent extends GameEvent
{
    private static final long serialVersionUID = 1L;
    private final int id;
    private final String sender;
    private final String message;
    public static int b;
    
    public MessageEvent(final int id, final String sender, final String message) {
        final int b = MessageEvent.b;
        this.setType(32);
        this.id = id;
        this.sender = sender;
        this.message = message;
        if (b != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
    
    @Override
    public void dispatch(final EventListener eventListener) {
        ((MessageListener)eventListener).messageReceived(this);
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getSender() {
        return this.sender;
    }
    
    public String getMessage() {
        return this.message;
    }
}
