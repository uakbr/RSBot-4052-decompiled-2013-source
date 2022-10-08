
package org.powerbot;

import java.net.URLDecoder;
import java.net.URLEncoder;
import org.powerbot.core.bot.ClientStub;
import java.io.UnsupportedEncodingException;
import java.awt.Color;
import java.awt.Graphics;
import org.powerbot.core.script.methods.GroundItems;

public class gb
{
    public static int a;
    private static final String[] z;
    
    public static String a(final String s) {
        return s.replaceAll(GroundItems.e(gb.z[1]), "");
    }
    
    public static void a(final Graphics graphics, final int n, final String s) {
        final int n2 = graphics.getFontMetrics().getHeight() + 4;
        final int n3 = n * n2 + n2 + 19 + 50;
        graphics.setColor(Color.GREEN);
        graphics.drawString(s, 7, n3);
    }
    
    public static String b(final String s) {
        try {
            if (s == null) {
                return null;
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        try {
            return URLEncoder.encode(s, ClientStub.e(gb.z[0]));
        }
        catch (UnsupportedEncodingException ex2) {
            return s;
        }
    }
    
    public static String c(final String s) {
        try {
            return URLDecoder.decode(s, GroundItems.e(gb.z[2]));
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    public static byte[] d(final String s) {
        try {
            return s.getBytes(ClientStub.e(gb.z[0]));
        }
        catch (UnsupportedEncodingException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public static String a(final byte[] bytes) {
        try {
            if (bytes == null) {
                return null;
            }
        }
        catch (UnsupportedEncodingException ex) {
            throw ex;
        }
        try {
            return new String(bytes, GroundItems.e(gb.z[2]));
        }
        catch (UnsupportedEncodingException cause) {
            throw new IllegalStateException(cause);
        }
    }
    
    public static String b(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int length = array.length, i = 0; i < length; ++i) {
            sb.append(Integer.toString((array[i] & 0xFF) + 256, 16).substring(1));
        }
        return sb.toString();
    }
    
    public static byte[] e(final String s) {
        final int a = gb.a;
        final byte[] array = new byte[s.length() / 2];
        int i = 0;
        byte[] array2 = null;
        while (i < s.length()) {
            try {
                array2 = array;
                if (a != 0) {
                    return array2;
                }
                array2[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
                i += 2;
                if (a == 0) {
                    continue;
                }
            }
            catch (IllegalStateException ex) {
                throw ex;
            }
            break;
        }
        return array2;
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "\u001ej^es";
        int n4 = -1;
        String intern = null;
    Label_0053_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0130: {
                    if (n5 > 1) {
                        break Label_0130;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = 'O';
                                break;
                            }
                            case 1: {
                                c2 = 'E';
                                break;
                            }
                            case 2: {
                                c2 = '\u001c';
                                break;
                            }
                            case 3: {
                                c2 = '3';
                                break;
                            }
                            default: {
                                c2 = 'O';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "L[m;/1$";
                    n4 = 0;
                    continue Label_0053_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "E3\u0005<(";
                    n4 = 1;
                    continue Label_0053_Outer;
                }
                case 1: {
                    break Label_0053_Outer;
                }
            }
        }
        z2[n3] = intern;
        z = z2;
    }
}
