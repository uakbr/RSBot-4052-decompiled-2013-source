
package org.powerbot.core.event.listeners;

import java.awt.Graphics;
import java.util.EventListener;

public interface TextPaintListener extends EventListener
{
    int draw(final int p0, final Graphics p1);
}
