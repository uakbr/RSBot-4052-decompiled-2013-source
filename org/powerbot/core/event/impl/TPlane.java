
package org.powerbot.core.event.impl;

import org.powerbot.gb;
import org.powerbot.game.api.methods.Game;
import org.powerbot.core.script.methods.GroundItems;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TPlane implements TextPaintListener
{
    public static int a;
    private static final String z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        gb.a(graphics, n++, GroundItems.e(TPlane.z) + Game.getPlane());
        return n;
    }
    
    static {
        final char[] charArray = "\tIu\t\u000b\u001ex".toCharArray();
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
                            c2 = '\u0006';
                            break;
                        }
                        case 1: {
                            c2 = '\u0007';
                            break;
                        }
                        case 2: {
                            c2 = 'K';
                            break;
                        }
                        case 3: {
                            c2 = 'E';
                            break;
                        }
                        default: {
                            c2 = '1';
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
