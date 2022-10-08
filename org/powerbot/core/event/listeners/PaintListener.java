
package org.powerbot.core.event.listeners;

import java.awt.Graphics;
import java.util.EventListener;

public interface PaintListener extends EventListener
{
    void onRepaint(final Graphics p0);
}
