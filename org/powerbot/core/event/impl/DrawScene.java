
package org.powerbot.core.event.impl;

import org.powerbot.game.api.wrappers.node.SceneObject;
import java.awt.Point;
import java.awt.FontMetrics;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.Game;
import java.awt.Graphics;
import java.awt.Color;
import java.util.HashMap;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawScene implements PaintListener
{
    private static final HashMap<Integer, Color> color_map;
    
    @Override
    public void onRepaint(final Graphics graphics) {
        final int i = TPlane.a;
        try {
            if (!Game.isLoggedIn()) {
                return;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final Player local = Players.getLocal();
        try {
            if (local == null) {
                return;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        final FontMetrics fontMetrics = graphics.getFontMetrics();
        final Tile location = local.getLocation();
        final int height = fontMetrics.getHeight();
        int n = location.getX() - 25;
        do {
            int j = 0;
        Label_0052:
            while (j < location.getX() + 25) {
                int n2 = location.getY() - 25;
                do {
                    int k = 0;
                Label_0075:
                    while (k < location.getY() + 25) {
                        final Tile tile = new Tile(n, n2, Game.getPlane());
                        final Point centralPoint = tile.getCentralPoint();
                        j = (Calculations.isOnScreen(centralPoint) ? 1 : 0);
                        if (i != 0) {
                            continue Label_0052;
                        }
                        if (j != 0) {
                            final SceneObject[] loaded = SceneEntities.getLoaded(tile);
                            int n3 = 0;
                            final SceneObject[] array = loaded;
                            final int length = array.length;
                            int l = 0;
                            while (l < length) {
                                final SceneObject sceneObject = array[l];
                                final Point centralPoint2 = sceneObject.getLocation().getCentralPoint();
                                int n4;
                                k = (n4 = (Calculations.isOnScreen(centralPoint2) ? 1 : 0));
                                if (i != 0) {
                                    continue Label_0075;
                                }
                                Label_0360: {
                                    Label_0201: {
                                        Label_0196: {
                                            try {
                                                if (i != 0) {
                                                    break Label_0201;
                                                }
                                                if (k != 0) {
                                                    break Label_0196;
                                                }
                                            }
                                            catch (RuntimeException ex3) {
                                                throw ex3;
                                            }
                                            break Label_0360;
                                        }
                                        n4 = centralPoint.x;
                                        try {
                                            if (n4 > -1) {
                                                graphics.setColor(Color.GREEN);
                                                graphics.fillRect(centralPoint.x - 1, centralPoint.y - 1, 2, 2);
                                                graphics.setColor(Color.RED);
                                                graphics.drawLine(centralPoint.x, centralPoint.y, centralPoint2.x, centralPoint2.y);
                                            }
                                        }
                                        catch (RuntimeException ex4) {
                                            throw ex4;
                                        }
                                    }
                                    final String string = "" + sceneObject.getId();
                                    final int n5 = centralPoint2.y - height / 2 - n3++ * 15;
                                    final int n6 = centralPoint2.x - fontMetrics.stringWidth(string) / 2;
                                    graphics.setColor(DrawScene.color_map.get(sceneObject.getType()));
                                    graphics.drawString(string, n6, n5);
                                }
                                ++l;
                                if (i != 0) {
                                    break;
                                }
                            }
                        }
                        ++n2;
                    }
                    break;
                } while (i == 0);
                ++n;
            }
            break;
        } while (i == 0);
    }
    
    static {
        (color_map = new HashMap<Integer, Color>()).put(4, Color.BLACK);
        DrawScene.color_map.put(2, Color.YELLOW);
        DrawScene.color_map.put(1, Color.WHITE);
        DrawScene.color_map.put(8, Color.GRAY);
    }
}
