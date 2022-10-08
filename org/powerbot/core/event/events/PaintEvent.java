
package org.powerbot.core.event.events;

import java.awt.geom.AffineTransform;
import java.awt.Stroke;
import java.awt.RenderingHints;
import java.awt.Paint;
import java.awt.Font;
import java.awt.Composite;
import java.awt.Shape;
import java.awt.Color;
import java.util.Map;
import java.awt.Graphics2D;
import org.powerbot.core.event.listeners.PaintListener;
import java.util.EventListener;
import java.awt.Graphics;
import org.powerbot.core.event.GameEvent;

public class PaintEvent extends GameEvent
{
    private static final long serialVersionUID = 1L;
    public Graphics graphics;
    
    public PaintEvent() {
        this.setType(64);
        this.graphics = null;
    }
    
    @Override
    public void dispatch(final EventListener eventListener) {
        Graphics graphics = null;
        Label_0036: {
            Label_0032: {
                try {
                    graphics = this.graphics;
                    if (MessageEvent.b != 0) {
                        break Label_0036;
                    }
                    if (graphics != null) {
                        break Label_0032;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    ((PaintListener)eventListener).onRepaint(null);
                }
                catch (Exception ex3) {}
                return;
            }
            final Graphics graphics2 = this.graphics;
        }
        final Graphics2D graphics2D = (Graphics2D)graphics;
        final Color background = graphics2D.getBackground();
        final Shape clip = graphics2D.getClip();
        final Color color = graphics2D.getColor();
        final Composite composite = graphics2D.getComposite();
        final Font font = graphics2D.getFont();
        final Paint paint = graphics2D.getPaint();
        final RenderingHints renderingHints = graphics2D.getRenderingHints();
        final Stroke stroke = graphics2D.getStroke();
        final AffineTransform transform = graphics2D.getTransform();
        try {
            ((PaintListener)eventListener).onRepaint(this.graphics);
        }
        catch (Exception ex2) {
            ex2.printStackTrace();
        }
        graphics2D.setBackground(background);
        graphics2D.setClip(clip);
        graphics2D.setColor(color);
        graphics2D.setComposite(composite);
        graphics2D.setFont(font);
        graphics2D.setPaint(paint);
        graphics2D.setRenderingHints(renderingHints);
        graphics2D.setStroke(stroke);
        graphics2D.setTransform(transform);
    }
}
