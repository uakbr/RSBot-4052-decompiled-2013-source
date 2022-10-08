
package org.powerbot.core.event.impl;

import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.gb;
import org.powerbot.core.script.internal.wrappers.HashTable;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TMenu implements TextPaintListener
{
    private static final String[] z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        final int a = TPlane.a;
        gb.a(graphics, n++, HashTable.e(TMenu.z[1]));
        final String[] items = Menu.getItems();
        final int length = items.length;
        int i = 0;
        while (i < length) {
            gb.a(graphics, n++, Deque.e(TMenu.z[0]) + items[i]);
            ++i;
            if (a != 0) {
                break;
            }
        }
        return n;
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "(IZ\u0003";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0118: {
                    if (n4 > 1) {
                        break Label_0118;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '\u000f';
                                break;
                            }
                            case 1: {
                                c2 = 'H';
                                break;
                            }
                            case 2: {
                                c2 = 'c';
                                break;
                            }
                            case 3: {
                                c2 = '\u000f';
                                break;
                            }
                            default: {
                                c2 = 'F';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "r\u0011=F";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
}
