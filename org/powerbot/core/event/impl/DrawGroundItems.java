
package org.powerbot.core.event.impl;

import org.powerbot.game.api.wrappers.node.ItemDefinition;
import java.awt.Point;
import org.powerbot.game.api.wrappers.node.GroundItem;
import java.awt.FontMetrics;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.eb;
import java.awt.Color;
import org.powerbot.game.api.methods.node.GroundItems;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.Game;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawGroundItems implements PaintListener
{
    private static final String z;
    
    @Override
    public void onRepaint(final Graphics graphics) {
        final int i = TPlane.a;
        try {
            if (!Game.isLoggedIn()) {
                return;
            }
            final Player local = Players.getLocal();
            Player player = null;
            Label_0030: {
                try {
                    player = local;
                    if (i != 0) {
                        break Label_0030;
                    }
                    if (player != null) {
                        break Label_0030;
                    }
                }
                catch (Throwable t) {
                    throw t;
                }
                return;
            }
            final Tile location = player.getLocation();
            final FontMetrics fontMetrics = graphics.getFontMetrics();
            final int height = fontMetrics.getHeight();
            final int x = location.getX();
            final int y = location.getY();
            int n = x - 10;
            do {
                int j = 0;
            Label_0069:
                while (j < x + 10) {
                    int n2 = y - 10;
                    do {
                        int k = 0;
                        int n3 = 0;
                    Label_0091:
                        while (k < n3) {
                            final GroundItem[] loaded = GroundItems.getLoadedAt(n, n2);
                            int n4 = 0;
                            final GroundItem[] array = loaded;
                            final int length = array.length;
                            j = 0;
                            if (i == 0) {
                                int l = j;
                                while (l < length) {
                                    final GroundItem groundItem = array[l];
                                    final Point centralPoint = groundItem.getLocation().getCentralPoint();
                                    Label_0405: {
                                        try {
                                            if (i != 0) {
                                                break Label_0405;
                                            }
                                            k = centralPoint.x;
                                            n3 = -1;
                                            if (i != 0) {
                                                continue Label_0091;
                                            }
                                        }
                                        catch (Throwable t2) {
                                            throw t2;
                                        }
                                        Label_0402: {
                                            Label_0187: {
                                                try {
                                                    if (k == n3) {
                                                        break Label_0402;
                                                    }
                                                    final Point point = centralPoint;
                                                    final int n5 = point.y;
                                                    final int n6 = -1;
                                                    if (n5 == n6) {
                                                        break Label_0187;
                                                    }
                                                    break Label_0187;
                                                }
                                                catch (Throwable t3) {
                                                    throw t3;
                                                }
                                                try {
                                                    final Point point = centralPoint;
                                                    final int n5 = point.y;
                                                    final int n6 = -1;
                                                    if (n5 == n6) {
                                                        break Label_0402;
                                                    }
                                                }
                                                catch (Throwable t4) {
                                                    throw t4;
                                                }
                                            }
                                            graphics.setColor(Color.red);
                                            graphics.fillRect((int)centralPoint.getX() - 1, (int)centralPoint.getY() - 1, 2, 2);
                                            final ItemDefinition definition = groundItem.getGroundItem().getDefinition();
                                            final StringBuilder sb = new StringBuilder();
                                            Label_0298: {
                                                Label_0284: {
                                                    try {
                                                        if (i != 0) {
                                                            break Label_0298;
                                                        }
                                                        if (definition == null) {
                                                            break Label_0284;
                                                        }
                                                    }
                                                    catch (Throwable t5) {
                                                        throw t5;
                                                    }
                                                    final String name = definition.getName();
                                                    try {
                                                        if (name != null) {
                                                            sb.append(name);
                                                            sb.append(' ');
                                                        }
                                                    }
                                                    catch (Throwable t6) {
                                                        throw t6;
                                                    }
                                                }
                                                sb.append(groundItem.getGroundItem().getId());
                                            }
                                            final int stackSize = groundItem.getGroundItem().getStackSize();
                                            try {
                                                if (stackSize > 1) {
                                                    sb.append(eb.a(DrawGroundItems.z)).append(stackSize).append(')');
                                                }
                                            }
                                            catch (Throwable t7) {
                                                throw t7;
                                            }
                                            final String string = sb.toString();
                                            final int n7 = centralPoint.y - height * ++n4 + height / 2;
                                            final int n8 = centralPoint.x - fontMetrics.stringWidth(string) / 2;
                                            graphics.setColor(Color.green);
                                            graphics.drawString(string, n8, n7);
                                        }
                                        ++l;
                                    }
                                    if (i != 0) {
                                        break;
                                    }
                                }
                                ++n2;
                                continue Label_0091;
                            }
                            continue Label_0069;
                        }
                        break;
                    } while (i == 0);
                    ++n;
                }
                break;
            } while (i == 0);
        }
        catch (Throwable t8) {
            t8.printStackTrace();
        }
    }
    
    static {
        final char[] charArray = "M_".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0102: {
                if (n > 1) {
                    break Label_0102;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0018';
                            break;
                        }
                        case 1: {
                            c2 = 'l';
                            break;
                        }
                        case 2: {
                            c2 = 'L';
                            break;
                        }
                        case 3: {
                            c2 = 'r';
                            break;
                        }
                        default: {
                            c2 = 't';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
