
package org.powerbot.core.event.listeners;

import org.powerbot.core.event.events.MessageEvent;
import java.util.EventListener;

public interface MessageListener extends EventListener
{
    void messageReceived(final MessageEvent p0);
}
