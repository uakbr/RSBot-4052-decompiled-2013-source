
package org.powerbot.core.event.impl;

import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.gb;
import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.game.api.methods.interactive.Players;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TLocation implements TextPaintListener
{
    private static final String z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        final Player local = Players.getLocal();
        Player player = null;
        Label_0019: {
            try {
                player = local;
                if (TPlane.a != 0) {
                    break Label_0019;
                }
                if (player == null) {
                    return n;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        gb.a(graphics, n++, HashTable.e(TLocation.z) + player.getLocation().toString());
        return n;
    }
    
    static {
        final char[] charArray = "+^:[s\u001eR+\u0004+".toCharArray();
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
                            c2 = 'K';
                            break;
                        }
                        case 1: {
                            c2 = '\r';
                            break;
                        }
                        case 2: {
                            c2 = 'y';
                            break;
                        }
                        case 3: {
                            c2 = '\u000e';
                            break;
                        }
                        default: {
                            c2 = '7';
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
