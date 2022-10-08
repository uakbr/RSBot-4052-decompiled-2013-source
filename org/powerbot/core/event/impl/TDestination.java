
package org.powerbot.core.event.impl;

import org.powerbot.gb;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.util.SkillData;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TDestination implements TextPaintListener
{
    private static final String z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        gb.a(graphics, n++, SkillData.e(TDestination.z) + Walking.getDestination().toString());
        return n;
    }
    
    static {
        final char[] charArray = "\u0001\u0000#9\fLcCCm+_p".toCharArray();
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
                            c2 = 'x';
                            break;
                        }
                        case 1: {
                            c2 = '?';
                            break;
                        }
                        case 2: {
                            c2 = 'm';
                            break;
                        }
                        case 3: {
                            c2 = '\u0017';
                            break;
                        }
                        default: {
                            c2 = 'X';
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
