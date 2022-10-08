
package org.powerbot;

import java.awt.Toolkit;
import java.awt.Image;
import org.powerbot.core.script.job.Task;
import java.io.File;
import org.powerbot.game.api.util.Time;
import java.net.URL;

public class db
{
    public static URL a(final String s) {
        final boolean c = kb.c;
        URL url = null;
        boolean c2 = false;
        Label_0075: {
            Label_0069: {
                Label_0055: {
                    try {
                        if (y.b) {
                            url = y.class.getResource(Time.e("2") + s);
                            break Label_0055;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    url = new File(s).toURI().toURL();
                    try {
                        if (Task.a == 0) {
                            return url;
                        }
                        final boolean b = c;
                        if (b) {
                            break Label_0069;
                        }
                        break Label_0069;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    final boolean b = c;
                    if (b) {
                        c2 = false;
                        break Label_0075;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            c2 = true;
        }
        kb.c = c2;
        return url;
    }
    
    public static Image b(final String s) {
        try {
            return Toolkit.getDefaultToolkit().getImage(a(s));
        }
        catch (Exception ex) {
            return null;
        }
    }
}
