
package org.powerbot.game.api.methods;

import org.powerbot.core.randoms.AntiRandom;
import org.powerbot.game.api.util.node.Queue;
import java.io.File;
import java.awt.image.BufferedImage;
import org.powerbot.game.bot.Context;

public class Environment
{
    private static final String z;
    
    public static String getDisplayName() {
        return Context.get().getDisplayName();
    }
    
    public static int getUserId() {
        return Context.get().getUserId();
    }
    
    public static BufferedImage captureScreen() {
        return Context.captureScreen();
    }
    
    public static BufferedImage getScreenBuffer() {
        return Context.getScreenBuffer();
    }
    
    public static void saveScreenCapture() {
        Context.saveScreenCapture();
    }
    
    public static void saveScreenCapture(final String s) {
        Context.saveScreenCapture(s);
    }
    
    public static File getStorageDirectory() {
        final File file = new File(System.getProperty(Queue.e(Environment.z)), Context.get().getScriptHandler().getDefinition().a().replace('.', File.pathSeparatorChar));
        Label_0054: {
            File file2;
            try {
                final File file3;
                file2 = (file3 = file);
                if (Widgets.a != 0) {
                    return file3;
                }
                final boolean b = file2.isDirectory();
                if (!b) {
                    break Label_0054;
                }
                return file;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = file2.isDirectory();
                if (!b) {
                    file.mkdirs();
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return file;
    }
    
    public static void enableRandom(final Class<? extends AntiRandom> clazz, final boolean b) {
        Context.get().getScriptHandler().getRandomHandler().enable(clazz, b);
    }
    
    public static boolean isRandomEnabled(final Class<? extends AntiRandom> clazz) {
        return Context.get().getScriptHandler().getRandomHandler().isEnabled(clazz);
    }
    
    static {
        final char[] charArray = "<?>\u0015PU[\fjy&:!\u0006".toCharArray();
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
                            c2 = '\r';
                            break;
                        }
                        case 1: {
                            c2 = 'o';
                            break;
                        }
                        case 2: {
                            c2 = '\u0013';
                            break;
                        }
                        case 3: {
                            c2 = 'E';
                            break;
                        }
                        default: {
                            c2 = '%';
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
