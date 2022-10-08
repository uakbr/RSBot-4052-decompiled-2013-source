
package org.powerbot.core.event.impl;

import org.powerbot.gb;
import org.powerbot.game.api.methods.Game;
import org.powerbot.core.script.methods.GroundItems;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TClientState implements TextPaintListener
{
    private static final String z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        gb.a(graphics, n++, GroundItems.e(TClientState.z) + Game.getClientState());
        return n;
    }
    
    static {
        final char[] charArray = "i9hm3#\b\u000f\u0001A^0;(".toCharArray();
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
                            c2 = '\b';
                            break;
                        }
                        case 1: {
                            c2 = '\n';
                            break;
                        }
                        case 2: {
                            c2 = '#';
                            break;
                        }
                        case 3: {
                            c2 = 'W';
                            break;
                        }
                        default: {
                            c2 = '\u007f';
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
