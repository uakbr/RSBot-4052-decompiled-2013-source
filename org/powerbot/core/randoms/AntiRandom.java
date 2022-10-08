
package org.powerbot.core.randoms;

import java.awt.Canvas;
import java.awt.Point;
import org.powerbot.core.script.job.Task;
import java.awt.Color;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.methods.input.Mouse;
import java.awt.Graphics;
import java.util.logging.Logger;
import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.script.job.state.Node;

public abstract class AntiRandom extends Node implements PaintListener
{
    public final Logger log;
    private static final boolean DEBUG = false;
    public static int c;
    
    public AntiRandom() {
        this.log = Logger.getLogger(this.getClass().getName());
    }
    
    protected void log(final String s) {
    }
    
    @Override
    public void onRepaint(final Graphics graphics) {
        final int c = AntiRandom.c;
        final Point location = Mouse.getLocation();
        final Canvas canvas = Context.client().getCanvas();
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        graphics.setColor(new Color(51, 153, 255, 30));
        graphics.fillRect(0, 0, location.x - 1, location.y - 1);
        graphics.fillRect(location.x + 1, 0, width - (location.x + 1), location.y - 1);
        graphics.fillRect(0, location.y + 1, location.x - 1, height - (location.y - 1));
        graphics.fillRect(location.x + 1, location.y + 1, width - (location.x + 1), height - (location.y - 1));
        if (c != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
}
