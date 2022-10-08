
package org.powerbot.core.event.impl;

import org.powerbot.game.client.input.Mouse;
import org.powerbot.game.client.Client;
import java.awt.Color;
import java.awt.Graphics;
import org.powerbot.core.Bot;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawMouse implements PaintListener
{
    private final Bot bot;
    
    public DrawMouse(final Bot bot) {
        this.bot = bot;
    }
    
    @Override
    public void onRepaint(final Graphics graphics) {
        final int a = TPlane.a;
        final Client client = Bot.client();
        Client client2 = null;
        Label_0023: {
            try {
                client2 = client;
                if (a != 0) {
                    break Label_0023;
                }
                if (client2 != null) {
                    break Label_0023;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return;
        }
        final Mouse mouse = client2.getMouse();
        Mouse mouse2 = null;
        Label_0044: {
            try {
                mouse2 = mouse;
                if (a != 0) {
                    break Label_0044;
                }
                if (mouse2 == null) {
                    return;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final int x = mouse2.getX();
        final int y = mouse.getY();
        final int pressX = mouse.getPressX();
        final int pressY = mouse.getPressY();
        final long pressTime = mouse.getPressTime();
        Label_0145: {
            try {
                graphics.setColor(Color.YELLOW.darker());
                graphics.drawLine(x - 5, y - 5, x + 5, y + 5);
                graphics.drawLine(x + 5, y - 5, x - 5, y + 5);
                if (a != 0) {
                    break Label_0145;
                }
                final long n = System.currentTimeMillis();
                final long n2 = pressTime;
                final long n3 = n - n2;
                final long n4 = 1000L;
                final long n5 = lcmp(n3, n4);
                if (n5 < 0) {
                    break Label_0145;
                }
                return;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            try {
                final long n = System.currentTimeMillis();
                final long n2 = pressTime;
                final long n3 = n - n2;
                final long n4 = 1000L;
                final long n5 = lcmp(n3, n4);
                if (n5 >= 0) {
                    return;
                }
                graphics.setColor(Color.RED);
                graphics.drawLine(pressX - 5, pressY - 5, pressX + 5, pressY + 5);
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        graphics.drawLine(pressX + 5, pressY - 5, pressX - 5, pressY + 5);
    }
}
