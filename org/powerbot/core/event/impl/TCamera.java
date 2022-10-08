
package org.powerbot.core.event.impl;

import org.powerbot.core.script.job.Task;
import org.powerbot.gb;
import org.powerbot.game.api.methods.widget.Camera;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.eb;
import java.awt.Graphics;
import org.powerbot.core.event.listeners.TextPaintListener;

public class TCamera implements TextPaintListener
{
    private static final String[] z;
    
    @Override
    public int draw(int n, final Graphics graphics) {
        int a = TPlane.a;
        int n2;
        try {
            gb.a(graphics, n++, eb.a(TCamera.z[1]) + org.powerbot.game.bot.handler.input.a.a(TCamera.z[3]) + Camera.getX() + eb.a(TCamera.z[0]) + Camera.getY() + org.powerbot.game.bot.handler.input.a.a(TCamera.z[4]) + Camera.getZ() + eb.a(TCamera.z[2]) + Camera.getYaw() + org.powerbot.game.bot.handler.input.a.a(TCamera.z[5]) + Camera.getPitch());
            n2 = n;
            if (Task.a != 0) {
                TPlane.a = ++a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return n2;
    }
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "*4RX";
        int n7 = -1;
        String intern = null;
    Label_0081_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0158: {
                    if (n8 > 1) {
                        break Label_0158;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = '\u007f';
                                break;
                            }
                            case 1: {
                                c2 = 'v';
                                break;
                            }
                            case 2: {
                                c2 = '\u001d';
                                break;
                            }
                            case 3: {
                                c2 = 'c';
                                break;
                            }
                            default: {
                                c2 = '\f';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "I\f\u0005\u001d\u000b\u00059&";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "*4\t\u000fCD";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "=x'";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "k6\u0013Y";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "k<@\r[\rx'";
                    n7 = 4;
                    continue Label_0081_Outer;
                }
                case 4: {
                    break Label_0081_Outer;
                }
            }
        }
        z2[n6] = intern;
        z = z2;
    }
}
