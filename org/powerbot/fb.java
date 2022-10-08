
package org.powerbot;

import java.util.logging.Level;
import java.net.SocketTimeoutException;
import java.net.SocketException;
import org.powerbot.core.script.internal.Constants;
import java.net.URL;
import org.powerbot.game.client.RandomAccessFile;
import java.util.logging.Logger;
import java.util.concurrent.Callable;

public final class fb implements Callable<Boolean>
{
    private static final Logger a;
    private static final String[] z;
    
    public Boolean a() {
        final int a = gb.a;
        int int1;
        try {
            int1 = Integer.parseInt(cb.b(ab.d(new URL(RandomAccessFile.e(fb.z[3])))).trim());
        }
        catch (Exception ex) {
            String msg = Constants.e(fb.z[5]);
            Label_0101: {
                Label_0080: {
                    boolean assignable2 = false;
                    boolean assignable = false;
                    Label_0067: {
                        boolean b;
                        try {
                            b = (assignable = (assignable2 = SocketException.class.isAssignableFrom(ex.getClass())));
                            if (a != 0) {
                                break Label_0080;
                            }
                            if (!b) {
                                break Label_0067;
                            }
                            break Label_0080;
                        }
                        catch (Exception ex2) {
                            throw ex2;
                        }
                        try {
                            if (b) {
                                break Label_0080;
                            }
                            assignable2 = (assignable = SocketTimeoutException.class.isAssignableFrom(ex.getClass()));
                        }
                        catch (Exception ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (a != 0) {
                            return assignable2;
                        }
                        if (!assignable) {
                            break Label_0101;
                        }
                    }
                    catch (Exception ex4) {
                        throw ex4;
                    }
                }
                msg = RandomAccessFile.e(fb.z[2]);
            }
            fb.a.log(Level.SEVERE, msg, Constants.e(fb.z[6]));
            return false;
        }
        Label_0141: {
            int n;
            try {
                final int n2;
                n = (n2 = int1);
                if (a != 0) {
                    return (boolean)(n2 != 0);
                }
                final int n3 = 4052;
                if (n > n3) {
                    break Label_0141;
                }
                break Label_0141;
            }
            catch (Exception ex5) {
                throw ex5;
            }
            try {
                final int n3 = 4052;
                if (n > n3) {
                    fb.a.log(Level.SEVERE, String.format(RandomAccessFile.e(fb.z[1]), Constants.e(fb.z[0])), RandomAccessFile.e(fb.z[4]));
                    return false;
                }
            }
            catch (Exception ex6) {
                throw ex6;
            }
        }
        y.d = int1;
        int n2 = 1;
        return (boolean)(n2 != 0);
    }
    
    static {
        final String[] z2 = new String[7];
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 0)))));
        String s = "{@_^!;\u0012\u000eGnyH";
        int n8 = -1;
        String intern = null;
    Label_0091_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n10;
            final int n9 = n10 = (length = charArray.length);
            int n11 = 0;
            while (true) {
                Label_0166: {
                    if (n9 > 1) {
                        break Label_0166;
                    }
                    length = (n10 = n11);
                    do {
                        final char c = charArray[n10];
                        char c2 = '\0';
                        switch (n11 % 5) {
                            case 0: {
                                c2 = '\u000e';
                                break;
                            }
                            case 1: {
                                c2 = 'x';
                                break;
                            }
                            case 2: {
                                c2 = '-';
                                break;
                            }
                            case 3: {
                                c2 = 'l';
                                break;
                            }
                            default: {
                                c2 = 'V';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n11;
                    } while (n9 == 0);
                }
                if (n9 > n11) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n8) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 1))))));
                    s = "\u0017/\u001b~y\u001cRzBD$|\u001ct`YI)\u0014@ n\u001cwo\u001bL?\u0018\u0001&c\u0010z}\u001c\u0000>[V8c\u001azjYF([Lv*\u0006";
                    n8 = 0;
                    continue Label_0091_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 2))))));
                    s = ":O/XEva\u001ao.\u001aO4ZD5{UoaYP5CD$m\u001ao \u0016R=\u0014R3}\u0003~|";
                    n8 = 1;
                    continue Label_0091_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 3))))));
                    s = ">{\u0001k4V\u000f6]O=|[ka\u000eE(VN\"!\u001aiiVV?FR?`\u001b5z\u0001T";
                    n8 = 2;
                    continue Label_0091_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 4))))));
                    s = ",P>UU3";
                    n8 = 3;
                    continue Label_0091_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 5))))));
                    s = "\u001c\u000f\b\u0006s+]MZ70\u0013\u001dIrn]^^!y\u0019\u001b\u001d`";
                    n8 = 4;
                    continue Label_0091_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 6))))));
                    s = "\u001c\u000f\b\u0006s";
                    n8 = 5;
                    continue Label_0091_Outer;
                }
                case 5: {
                    break Label_0091_Outer;
                }
            }
        }
        z2[n7] = intern;
        z = z2;
        a = Logger.getLogger(fb.class.getName());
    }
}
