
package org.powerbot.game.bot.handler;

import java.util.Iterator;
import java.io.OutputStream;
import org.powerbot.core.script.job.Task;
import java.io.InputStream;
import org.powerbot.game.api.util.node.Queue;
import org.powerbot.cb;
import java.io.IOException;
import org.powerbot.game.api.util.node.Deque;
import java.util.HashMap;
import org.powerbot.z;

public class a
{
    private static String a;
    private static String b;
    private final z c;
    private HashMap<String, byte[]> d;
    private String e;
    public static boolean f;
    private static final String[] z;
    
    public a() {
        final boolean f = org.powerbot.game.bot.handler.a.f;
        this.d = new HashMap<String, byte[]>();
        this.e = "";
        this.c = new z(Deque.e(org.powerbot.game.bot.handler.a.z[2]), (Class<?>[])new Class[] { a.class });
        InputStream c;
        try {
            c = this.c.c();
        }
        catch (IOException ex5) {
            return;
        }
        final String[] split = cb.b(c).split(Queue.e(";"));
        final int length = split.length;
        int i = 0;
        Label_0186: {
            while (i < length) {
                final String s = split[i];
                Label_0177: {
                    Label_0174: {
                        Label_0112: {
                            try {
                                if (f) {
                                    break Label_0186;
                                }
                                final boolean b = f;
                                if (!b) {
                                    break Label_0112;
                                }
                                break Label_0177;
                            }
                            catch (IOException ex) {
                                throw ex;
                            }
                            try {
                                final boolean b = f;
                                if (b) {
                                    break Label_0177;
                                }
                                if (s.isEmpty()) {
                                    break Label_0174;
                                }
                            }
                            catch (IOException ex2) {
                                throw ex2;
                            }
                        }
                        final String[] split2 = s.split(org.powerbot.game.bot.handler.a.b, 2);
                        Label_0151: {
                            try {
                                if (f) {
                                    break Label_0177;
                                }
                                final String[] array = split2;
                                final int n = array.length;
                                final int n2 = 2;
                                if (n == n2) {
                                    break Label_0151;
                                }
                                break Label_0174;
                            }
                            catch (IOException ex3) {
                                throw ex3;
                            }
                            try {
                                final String[] array = split2;
                                final int n = array.length;
                                final int n2 = 2;
                                if (n == n2) {
                                    this.d.put(split2[0], split2[1].getBytes());
                                }
                            }
                            catch (IOException ex4) {
                                throw ex4;
                            }
                        }
                    }
                    ++i;
                }
                if (f) {
                    break;
                }
            }
            try {
                c.close();
            }
            catch (IOException ex6) {}
        }
    }
    
    public String a() {
        return this.e;
    }
    
    public byte[] a(String e) {
        final boolean f = org.powerbot.game.bot.handler.a.f;
        byte[] value = null;
        Label_0043: {
            Label_0030: {
                try {
                    final String s = (Object)(value = (byte[])(Object)e);
                    if (f) {
                        break Label_0043;
                    }
                    if (!s.equals("")) {
                        break Label_0030;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                e = Deque.e(org.powerbot.game.bot.handler.a.z[0]);
            }
            this.e = e;
            value = this.d.get(e);
        }
        final byte[] array = value;
        byte[] array3 = null;
        Label_0065: {
            Label_0059: {
                byte[] array2;
                try {
                    array2 = (array3 = array);
                    if (f) {
                        break Label_0065;
                    }
                    if (array2 == null) {
                        break Label_0059;
                    }
                    break Label_0059;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    if (array2 == null) {
                        return new byte[0];
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            array3 = array;
        }
        if (f) {
            int a = Task.a;
            Task.a = ++a;
        }
        return array3;
    }
    
    public void a(String e, final byte[] value) {
        final boolean f = org.powerbot.game.bot.handler.a.f;
        boolean f2 = false;
        Label_0060: {
            Label_0054: {
                Label_0039: {
                    Label_0030: {
                        try {
                            final String s = e;
                            if (f) {
                                break Label_0039;
                            }
                            if (!s.equals("")) {
                                break Label_0030;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        e = Queue.e(org.powerbot.game.bot.handler.a.z[1]);
                    }
                    this.d.put(e, value);
                    try {
                        if (Task.a == 0) {
                            return;
                        }
                        final boolean b = f;
                        if (b) {
                            break Label_0054;
                        }
                        break Label_0054;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    final boolean b = f;
                    if (b) {
                        f2 = false;
                        break Label_0060;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            f2 = true;
        }
        org.powerbot.game.bot.handler.a.f = f2;
    }
    
    public void b() {
        final boolean f = org.powerbot.game.bot.handler.a.f;
        OutputStream d = null;
        try {
            d = this.c.d();
            for (final String key : this.d.keySet()) {
                try {
                    d.write(key.getBytes());
                    d.write(org.powerbot.game.bot.handler.a.b.getBytes());
                    d.write(this.d.get(key));
                    d.write(org.powerbot.game.bot.handler.a.a.getBytes());
                    if (f) {
                        return;
                    }
                    if (!f) {
                        continue;
                    }
                }
                catch (IOException ex) {
                    throw ex;
                }
                break;
            }
        }
        catch (IOException ex3) {}
        finally {
            Label_0177: {
                OutputStream outputStream;
                try {
                    outputStream = d;
                    if (!f) {
                        if (outputStream == null) {
                            break Label_0177;
                        }
                    }
                }
                catch (IOException ex2) {
                    throw ex2;
                }
                try {
                    outputStream.close();
                }
                catch (IOException ex4) {}
            }
        }
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "[+\u0001*Vx\u0011";
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
                                c2 = 'u';
                                break;
                            }
                            case 1: {
                                c2 = '/';
                                break;
                            }
                            case 2: {
                                c2 = '-';
                                break;
                            }
                            case 3: {
                                c2 = '*';
                                break;
                            }
                            default: {
                                c2 = 'i';
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
                    s = "\u00001Z0\rbJ";
                    n4 = 0;
                    continue Label_0053_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "A,\b-Iq\u000f \u000eq";
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
        final char[] charArray2 = "X,\u0002%\u0006l\u000b7\nqU1\u00032".toCharArray();
        int length2;
        int n9;
        final int n8 = n9 = (length2 = charArray2.length);
        int n10 = 0;
        while (true) {
            Label_0266: {
                if (n8 > 1) {
                    break Label_0266;
                }
                length2 = (n9 = n10);
                do {
                    final char c3 = charArray2[n9];
                    char c4 = '\0';
                    switch (n10 % 5) {
                        case 0: {
                            c4 = 'u';
                            break;
                        }
                        case 1: {
                            c4 = '/';
                            break;
                        }
                        case 2: {
                            c4 = '-';
                            break;
                        }
                        case 3: {
                            c4 = '*';
                            break;
                        }
                        default: {
                            c4 = 'i';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n10;
                } while (n8 == 0);
            }
            if (n8 <= n10) {
                org.powerbot.game.bot.handler.a.a = System.getProperty(Deque.e(new String(charArray2).intern()));
                org.powerbot.game.bot.handler.a.b = Queue.e("\u0012");
                return;
            }
            continue;
        }
    }
}
