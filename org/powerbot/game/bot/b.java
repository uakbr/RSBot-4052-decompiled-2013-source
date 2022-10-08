
package org.powerbot.game.bot;

import java.util.Hashtable;
import java.awt.image.WritableRaster;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import javax.imageio.ImageIO;
import org.powerbot.game.api.methods.Environment;
import org.powerbot.core.script.job.Task;
import java.io.File;
import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.core.script.internal.Constants;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Logger;

public class b
{
    private static final Logger a;
    private static final SimpleDateFormat b;
    public static int c;
    private static final String[] z;
    
    public static void a(final Context context) {
        final int c = org.powerbot.game.bot.b.c;
        final String string = org.powerbot.game.bot.b.b.format(new Date()) + Constants.e(org.powerbot.game.bot.b.z[4]);
        final File parent = new File(Deque.e("\u0002"));
        Label_0081: {
            boolean b2 = false;
            Label_0070: {
                boolean b;
                try {
                    b = (b2 = parent.isDirectory());
                    if (c != 0) {
                        break Label_0081;
                    }
                    if (!b) {
                        break Label_0070;
                    }
                    break Label_0081;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (b) {
                        break Label_0081;
                    }
                    b2 = parent.mkdirs();
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (b2) {
                    a(context, new File(parent, string), Constants.e(org.powerbot.game.bot.b.z[5]));
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        if (c != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
    
    public static void a(final Context context, String concat) {
        final int c = org.powerbot.game.bot.b.c;
        Label_0044: {
            String s2 = null;
            String str = null;
            Label_0027: {
                String s;
                String s3;
                try {
                    s = (s2 = concat);
                    s3 = (str = Deque.e(org.powerbot.game.bot.b.z[2]));
                    if (c != 0) {
                        break Label_0027;
                    }
                    final boolean b = s.endsWith(s3);
                    if (!b) {
                        break Label_0027;
                    }
                    break Label_0044;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = s.endsWith(s3);
                    if (b) {
                        break Label_0044;
                    }
                    s2 = concat;
                    str = Constants.e(org.powerbot.game.bot.b.z[4]);
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            concat = s2.concat(str);
        }
        final File storageDirectory = Environment.getStorageDirectory();
        Label_0074: {
            boolean b3 = false;
            Label_0063: {
                boolean b2;
                try {
                    b2 = (b3 = storageDirectory.isDirectory());
                    if (c != 0) {
                        break Label_0074;
                    }
                    if (!b2) {
                        break Label_0063;
                    }
                    break Label_0074;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    if (b2) {
                        break Label_0074;
                    }
                    b3 = storageDirectory.mkdirs();
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            try {
                if (b3) {
                    a(context, new File(storageDirectory, concat), Deque.e(org.powerbot.game.bot.b.z[3]));
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
    }
    
    private static void a(final Context context, final File output, final String formatName) {
        try {
            ImageIO.write(b(context), formatName, output);
            org.powerbot.game.bot.b.a.severe(Constants.e(org.powerbot.game.bot.b.z[1]) + output.getName());
        }
        catch (Exception ex) {
            org.powerbot.game.bot.b.a.severe(Deque.e(org.powerbot.game.bot.b.z[0]) + output.getName() + Constants.e("~"));
        }
    }
    
    public static BufferedImage b(final Context context) {
        final BufferedImage image = context.getImage();
        return new BufferedImage(image.getColorModel(), image.copyData(null), image.isAlphaPremultiplied(), null);
    }
    
    public static BufferedImage c(final Context context) {
        int c = org.powerbot.game.bot.b.c;
        final BufferedImage buffer = context.getBuffer();
        final BufferedImage bufferedImage = new BufferedImage(buffer.getColorModel(), buffer.copyData(null), buffer.isAlphaPremultiplied(), null);
        if (Task.a != 0) {
            org.powerbot.game.bot.b.c = ++c;
        }
        return bufferedImage;
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
        String s = "\u0001:Wr\r\bPaZc4:H{H\u001f\u0013gP&){]\u007f\u0018\u0018\u0005gPco";
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
                                c2 = 'k';
                                break;
                            }
                            case 1: {
                                c2 = '\\';
                                break;
                            }
                            case 2: {
                                c2 = '\u0012';
                                break;
                            }
                            case 3: {
                                c2 = '\u0019';
                                break;
                            }
                            default: {
                                c2 = 'D';
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
                    s = "=ja+%\u001c*&nv\u000be7- L-0nvNjdn";
                    n8 = 0;
                    continue Label_0091_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 2))))));
                    s = "B\u0000{R";
                    n8 = 1;
                    continue Label_0091_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 3))))));
                    s = "75Y";
                    n8 = 2;
                    continue Label_0091_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 4))))));
                    s = "@{y)";
                    n8 = 3;
                    continue Label_0091_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 5))))));
                    s = "L7\"";
                    n8 = 4;
                    continue Label_0091_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 6))))));
                    s = ">\"Gg%!\u0014q\u0018+/6Sm\u001b";
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
        a = Logger.getLogger(b.class.getName());
        b = new SimpleDateFormat(Deque.e(org.powerbot.game.bot.b.z[6]));
    }
}
