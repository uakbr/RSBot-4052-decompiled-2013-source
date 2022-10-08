
package org.powerbot.core.event.impl;

import java.awt.Point;
import org.powerbot.gb;
import org.powerbot.game.client.RandomAccessFile;
import org.powerbot.a;
import org.powerbot.game.api.methods.input.Mouse;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TMousePosition implements TextPaintListener
{
    private static final String[] z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        final Point location = Mouse.getLocation();
        gb.a(graphics, n++, a.a(TMousePosition.z[1]) + location.x + RandomAccessFile.e(TMousePosition.z[0]) + location.y);
        return n;
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "g$";
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
                Label_0117: {
                    if (n4 > 1) {
                        break Label_0117;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '<';
                                break;
                            }
                            case 1: {
                                c2 = '\\';
                                break;
                            }
                            case 2: {
                                c2 = '\u0005';
                                break;
                            }
                            case 3: {
                                c2 = 'L';
                                break;
                            }
                            default: {
                                c2 = 'K';
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
                    s = "<\u0010=\u001cc?aIr\u0001\u0005\u0016'\u0001<?";
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
