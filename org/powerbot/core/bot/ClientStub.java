
package org.powerbot.core.bot;

import java.applet.AudioClip;
import java.util.Vector;
import java.util.Enumeration;
import java.lang.ref.Reference;
import java.awt.Toolkit;
import java.util.Set;
import java.util.Iterator;
import org.powerbot.core.script.util.Timer;
import org.powerbot.core.script.job.Task;
import java.awt.Dimension;
import org.powerbot.o;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.HashMap;
import java.applet.Applet;
import java.io.InputStream;
import java.awt.Image;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.Map;
import java.applet.AppletContext;
import java.applet.AppletStub;

public class ClientStub implements AppletStub, AppletContext
{
    private final Map<URL, WeakReference<Image>> IMAGE_CACHE;
    private final Map<String, InputStream> INPUT_CACHE;
    private boolean active;
    private final Map<String, String> parameters;
    private URL documentBase;
    private URL codeBase;
    public Applet applet;
    public static int a;
    private static final String[] z;
    
    public ClientStub(final RSLoader rsLoader) {
        this.IMAGE_CACHE = new HashMap<URL, WeakReference<Image>>();
        this.INPUT_CACHE = Collections.synchronizedMap(new HashMap<String, InputStream>(2));
        this.active = false;
        final o clientLoader = rsLoader.getClientLoader();
        this.parameters = clientLoader.c.j;
        try {
            this.documentBase = new URL(clientLoader.c.g);
            this.codeBase = new URL(clientLoader.c.h);
        }
        catch (MalformedURLException ex) {}
    }
    
    public void setActive(final boolean active) {
        this.active = active;
    }
    
    public void setApplet(final Applet applet) {
        this.applet = applet;
    }
    
    @Override
    public boolean isActive() {
        return this.active;
    }
    
    @Override
    public URL getDocumentBase() {
        return this.documentBase;
    }
    
    @Override
    public URL getCodeBase() {
        return this.codeBase;
    }
    
    @Override
    public String getParameter(final String s) {
        final String s2 = this.parameters.get(s);
        String s3 = null;
        Label_0033: {
            try {
                s3 = s2;
                if (ClientStub.a != 0) {
                    return s3;
                }
                if (s3 != null) {
                    break Label_0033;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return s3;
        }
        return s3;
    }
    
    @Override
    public void appletResize(final int width, final int height) {
        int a = ClientStub.a;
        final Dimension dimension = new Dimension(width, height);
        try {
            this.applet.setSize(dimension);
            this.applet.setPreferredSize(dimension);
            if (Task.a != 0) {
                ClientStub.a = ++a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    @Override
    public AppletContext getAppletContext() {
        return this;
    }
    
    @Override
    public void showStatus(final String str) {
        System.out.println(Timer.e(ClientStub.z[0]) + str);
    }
    
    @Override
    public void showDocument(final URL url) {
        this.showDocument(url, "");
    }
    
    @Override
    public void showDocument(final URL url, final String str) {
        try {
            if (!str.equals(e(ClientStub.z[3]))) {
                System.out.println(Timer.e(ClientStub.z[2]) + url.toString() + e(ClientStub.z[1]) + str + Timer.e("~"));
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    @Override
    public void setStream(final String s, final InputStream inputStream) {
        this.INPUT_CACHE.put(s, inputStream);
    }
    
    @Override
    public InputStream getStream(final String s) {
        return this.INPUT_CACHE.get(s);
    }
    
    @Override
    public Iterator<String> getStreamKeys() {
        return Collections.unmodifiableSet((Set<? extends String>)this.INPUT_CACHE.keySet()).iterator();
    }
    
    @Override
    public Image getImage(final URL url) {
        final int a = ClientStub.a;
        synchronized (this.IMAGE_CACHE) {
            final WeakReference<Image> weakReference = this.IMAGE_CACHE.get(url);
            // monitorexit(this.IMAGE_CACHE)
            Image image3 = null;
            Label_0100: {
                Image image2 = null;
                Label_0096: {
                    Label_0065: {
                        Object value = null;
                        Label_0039: {
                            Reference<Object> reference;
                            try {
                                reference = (Reference<Object>)(value = weakReference);
                                if (a != 0) {
                                    break Label_0039;
                                }
                                if (reference != null) {
                                    break Label_0039;
                                }
                                break Label_0065;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                if (reference == null) {
                                    break Label_0065;
                                }
                                value = weakReference.get();
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        final Image image = image2 = (image3 = (Image)value);
                        try {
                            if (a != 0) {
                                break Label_0100;
                            }
                            if (image != null) {
                                break Label_0096;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    image2 = Toolkit.getDefaultToolkit().createImage(url);
                    this.IMAGE_CACHE.put(url, new WeakReference<Image>(image2));
                }
                image3 = image2;
            }
            if (a != 0) {
                int a2 = Task.a;
                Task.a = ++a2;
            }
            return image3;
        }
    }
    
    @Override
    public Applet getApplet(final String anObject) {
        final String s = this.parameters.get(e(ClientStub.z[4]));
        Label_0039: {
            Label_0035: {
                String s2;
                try {
                    final String s3;
                    s2 = (s3 = s);
                    if (ClientStub.a != 0) {
                        break Label_0039;
                    }
                    if (s2 == null) {
                        break Label_0035;
                    }
                    break Label_0035;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (s2 == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            String s3 = s;
            try {
                if (s3.equals(anObject)) {
                    return this.applet;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return null;
    }
    
    @Override
    public Enumeration<Applet> getApplets() {
        final Vector<Applet> vector = new Vector<Applet>();
        vector.add(this.applet);
        return vector.elements();
    }
    
    @Override
    public AudioClip getAudioClip(final URL url) {
        return new org.powerbot.core.bot.AudioClip(url);
    }
    
    public static String e(final String s) {
        final int n = 0x2 ^ 0x5;
        final char c = '\u0004';
        final int n2 = n << c;
        final int n3 = 2;
        final int n4 = n2 ^ (n3 << n3 ^ 0x3);
        final int length = s.length();
        final char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        final char[] value = array;
        final char c2 = (char)n4;
        final char c3 = c;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n5;
            final char char1 = s.charAt(index);
            --n5;
            array2[index] = (char)(char1 ^ c3);
            if (n5 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n5;
            final char c4 = (char)(s.charAt(index2) ^ c2);
            --n5;
            array3[index2] = c4;
            i = n5;
        }
        return new String(value);
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u0010(A9\t\u0019O)";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0146: {
                    if (n7 > 1) {
                        break Label_0146;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'I';
                                break;
                            }
                            case 1: {
                                c2 = '\u007f';
                                break;
                            }
                            case 2: {
                                c2 = '*';
                                break;
                            }
                            case 3: {
                                c2 = 'n';
                                break;
                            }
                            default: {
                                c2 = 'v';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "\u0012 ";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "\u0002(T(\u0011\u001a\u0001`\n2c(Om\u000f\u0002\u001a~^u";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "9fG";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\\\u001a<\u000f";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
    }
}
