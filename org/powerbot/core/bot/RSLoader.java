
package org.powerbot.core.bot;

import java.util.logging.Level;
import java.awt.Graphics;
import java.net.URL;
import org.powerbot.s;
import org.powerbot.o;
import java.awt.Dimension;
import java.util.logging.Logger;
import java.applet.Applet;

public class RSLoader extends Applet implements Runnable
{
    private static Logger log;
    private Runnable callback;
    private Dimension size;
    private Class<?> clazz;
    private Object client;
    private o clientLoader;
    private RSClassLoader classLoader;
    private static final String[] z;
    
    public void load() {
        try {
            (this.clientLoader = new o()).a();
            this.classLoader = new RSClassLoader(this.clientLoader.b(), new URL(s.a(RSLoader.z[2])));
        }
        catch (Exception ex) {
            RSLoader.log.severe(ClientStub.e(RSLoader.z[3]) + ex.getMessage());
        }
    }
    
    public o getClientLoader() {
        return this.clientLoader;
    }
    
    public Object getClient() {
        return this.client;
    }
    
    public void setCallback(final Runnable callback) {
        this.callback = callback;
    }
    
    @Override
    public void run() {
        try {
            this.clazz = this.classLoader.loadClass(s.a(RSLoader.z[6]));
            this.client = this.clazz.getConstructor((Class<?>[])null).newInstance((Object[])null);
            this.invokeMethod(new Object[] { this }, new Class[] { Applet.class }, ClientStub.e(RSLoader.z[7]));
            this.callback.run();
            this.init();
            this.start();
        }
        catch (Exception ex) {
            RSLoader.log.severe(s.a(RSLoader.z[8]));
        }
    }
    
    @Override
    public final void init() {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(null, null, ClientStub.e(RSLoader.z[9]));
    }
    
    @Override
    public final void start() {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(null, null, s.a(RSLoader.z[1]));
    }
    
    @Override
    public final void stop() {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(null, null, ClientStub.e(RSLoader.z[11]));
    }
    
    @Override
    public final void destroy() {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(null, null, s.a(RSLoader.z[4]));
    }
    
    @Override
    public final void paint(final Graphics graphics) {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(new Object[] { graphics }, new Class[] { Graphics.class }, ClientStub.e(RSLoader.z[10]));
    }
    
    @Override
    public final void update(final Graphics graphics) {
        RSLoader rsLoader = null;
        Label_0017: {
            try {
                rsLoader = this;
                if (ClientStub.a != 0) {
                    break Label_0017;
                }
                final Object o = this.client;
                if (o != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Object o = this.client;
                if (o == null) {
                    return;
                }
                rsLoader = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader.invokeMethod(new Object[] { graphics }, new Class[] { Graphics.class }, s.a(RSLoader.z[0]));
    }
    
    @Override
    public final void setSize(final int n, final int n2) {
        super.setSize(n, n2);
        this.size = new Dimension(n, n2);
    }
    
    @Override
    public final Dimension getSize() {
        return this.size;
    }
    
    @Override
    public boolean isShowing() {
        return true;
    }
    
    private void invokeMethod(final Object[] args, final Class<?>[] parameterTypes, final String name) {
        try {
            this.clazz.getMethod(name, parameterTypes).invoke(this.client, args);
        }
        catch (Exception thrown) {
            RSLoader.log.log(Level.SEVERE, ClientStub.e(RSLoader.z[5]), thrown);
        }
    }
    
    static {
        final String[] z2 = new String[12];
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 0))))))))));
        String s = "F;E\u0003\\7";
        int n13 = -1;
        String intern = null;
    Label_0146_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n15;
            final int n14 = n15 = (length = charArray.length);
            int n16 = 0;
            while (true) {
                Label_0222: {
                    if (n14 > 1) {
                        break Label_0222;
                    }
                    length = (n15 = n16);
                    do {
                        final char c = charArray[n15];
                        char c2 = '\0';
                        switch (n16 % 5) {
                            case 0: {
                                c2 = '<';
                                break;
                            }
                            case 1: {
                                c2 = '%';
                                break;
                            }
                            case 2: {
                                c2 = '.';
                                break;
                            }
                            case 3: {
                                c2 = '\f';
                                break;
                            }
                            default: {
                                c2 = '\'';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n16;
                    } while (n14 == 0);
                }
                if (n14 > n16) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n13) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 1)))))))))));
                    s = "!^!q=";
                    n13 = 0;
                    continue Label_0146_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 2)))))))))));
                    s = ":^4ss\u001cdS\u0017F7Y#b9VeB\rE}";
                    n13 = 1;
                    continue Label_0146_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 3)))))))))));
                    s = "m0K\u0015O\"\u0001!g|T1K\u0013\u0003$M<m2Ld\n";
                    n13 = 2;
                    continue Label_0146_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 4)))))))))));
                    s = "6O3w;\\2";
                    n13 = 3;
                    continue Label_0146_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 5)))))))))));
                    s = "\u0002S'g.\u00187D\u0001L,H;o|[2C\u0012M3\u00018m(P1NM\u0003";
                    n13 = 4;
                    continue Label_0146_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 6)))))))))));
                    s = "P'H\u0007F&";
                    n13 = 5;
                    continue Label_0146_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 7)))))))))));
                    s = "4T%x0A\u001fZ\u0007O\"U";
                    n13 = 6;
                    continue Label_0146_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 8)))))))))));
                    s = "f%@\u0000D7\n4li_$@\u0006\b1F)f'Gg\u0001\u0012D7K3fiP#D\u0001CrS/v;\u0013-H\u0010M%K,oiR%EBA<^%q'V?\u0001\u0001G<D%`=Z$OL";
                    n13 = 7;
                    continue Label_0146_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 9)))))))))));
                    s = ".O<|";
                    n13 = 8;
                    continue Label_0146_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 10)))))))))));
                    s = "H?C\u0019W";
                    n13 = 9;
                    continue Label_0146_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = 11)))))))))));
                    s = "4U:x";
                    n13 = 10;
                    continue Label_0146_Outer;
                }
                case 10: {
                    break Label_0146_Outer;
                }
            }
        }
        z2[n12] = intern;
        z = z2;
        RSLoader.log = Logger.getLogger(RSLoader.class.getName());
    }
}
