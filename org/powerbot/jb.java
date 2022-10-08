
package org.powerbot;

import org.powerbot.core.bot.ClientStub;
import org.powerbot.core.script.job.Task;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.io.InputStream;
import org.t;
import java.util.Map;
import java.io.IOException;
import java.util.ArrayList;

public final class jb extends ArrayList<a_>
{
    private static final long serialVersionUID = 1L;
    private static final jb a;
    private final z b;
    private static final String[] z;
    
    private jb() {
        this.b = new z(org.powerbot.a.a(jb.z[5]), (Class<?>[])new Class[] { jb.class });
        this.b();
    }
    
    public static jb a() {
        return jb.a;
    }
    
    private synchronized void b() {
        InputStream c;
        try {
            c = this.b.c();
        }
        catch (IOException ex7) {
            return;
        }
        Map<String, Map<String, String>> a;
        try {
            a = bb.a(c);
        }
        catch (IOException ex8) {
            return;
        }
        finally {
            try {
                c.close();
            }
            catch (IOException ex9) {}
        }
        try {
            if (a == null) {
                return;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        for (final Map.Entry<String, Map<String, String>> entry : a.entrySet()) {
            final a_ e = new a_(entry.getKey());
            for (final Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                final String s = entry2.getKey();
                final String s2 = entry2.getValue();
                try {
                    if (s.equalsIgnoreCase(t.a(jb.z[0]))) {
                        e.b = s2;
                        continue;
                    }
                }
                catch (IOException ex2) {
                    throw ex2;
                }
                try {
                    if (s.equalsIgnoreCase(org.powerbot.a.a(jb.z[3]))) {
                        e.c = Integer.parseInt(s2);
                        continue;
                    }
                }
                catch (IOException ex3) {
                    throw ex3;
                }
                Label_0281: {
                    a_ a_ = null;
                    boolean d = false;
                    Label_0275: {
                        Label_0269: {
                            try {
                                if (!s.equalsIgnoreCase(t.a(jb.z[1]))) {
                                    break Label_0281;
                                }
                                a_ = e;
                                final String s3 = s2;
                                final int n = Integer.parseInt(s3);
                                final int n2 = 1;
                                if (n == n2) {
                                    break Label_0269;
                                }
                                break Label_0269;
                            }
                            catch (IOException ex4) {
                                throw ex4;
                            }
                            try {
                                a_ = e;
                                final String s3 = s2;
                                final int n = Integer.parseInt(s3);
                                final int n2 = 1;
                                if (n == n2) {
                                    d = true;
                                    break Label_0275;
                                }
                            }
                            catch (IOException ex5) {
                                throw ex5;
                            }
                        }
                        d = false;
                    }
                    a_.d = d;
                    continue;
                    try {
                        if (!s.equalsIgnoreCase(org.powerbot.a.a(jb.z[2]))) {
                            continue;
                        }
                        e.e = s2;
                    }
                    catch (IOException ex6) {
                        throw ex6;
                    }
                }
            }
            this.add(e);
        }
    }
    
    public synchronized void c() {
        final int g = v.g;
        final HashMap<String, HashMap<String, String>> hashMap = new HashMap<String, HashMap<String, String>>();
        for (final a_ a_ : this) {
            final HashMap<String, String> hashMap2 = new HashMap<String, String>();
            HashMap<String, String> hashMap4 = null;
            String s2 = null;
            String s5 = null;
            Label_0129: {
                String string = null;
                Label_0126: {
                    Label_0115: {
                        HashMap<String, String> hashMap3;
                        String s;
                        String s3;
                        try {
                            hashMap2.put(t.a(jb.z[0]), a_.b);
                            hashMap3 = (hashMap4 = hashMap2);
                            s = (s2 = org.powerbot.a.a(jb.z[3]));
                            s3 = (string = Integer.toString(a_.c));
                            if (g != 0) {
                                break Label_0126;
                            }
                            hashMap3.put(s, s3);
                            hashMap4 = hashMap2;
                            final String[] array = jb.z;
                            final int n = 1;
                            final String s4 = array[n];
                            s2 = t.a(s4);
                            final a_ a_2 = a_;
                            final boolean b = a_2.d;
                            if (b) {
                                break Label_0115;
                            }
                            break Label_0115;
                        }
                        catch (IOException ex) {
                            throw ex;
                        }
                        try {
                            hashMap3.put(s, s3);
                            hashMap4 = hashMap2;
                            final String[] array = jb.z;
                            final int n = 1;
                            final String s4 = array[n];
                            s2 = t.a(s4);
                            final a_ a_2 = a_;
                            final boolean b = a_2.d;
                            if (b) {
                                s5 = org.powerbot.a.a("\u0012");
                                break Label_0129;
                            }
                        }
                        catch (IOException ex2) {
                            throw ex2;
                        }
                    }
                    string = "P";
                }
                s5 = t.a(string);
            }
            hashMap4.put(s2, s5);
            hashMap2.put(org.powerbot.a.a(jb.z[2]), a_.e);
            hashMap.put(a_.toString(), hashMap2);
            if (g != 0) {
                break;
            }
        }
        OutputStream d = null;
        try {
            d = this.b.d();
            bb.a((Map<String, Map<String, String>>)hashMap, d);
            final OutputStream outputStream = d;
            if (g == 0) {
                if (outputStream == null) {
                    return;
                }
            }
            try {
                outputStream.close();
            }
            catch (IOException ex4) {}
        }
        catch (Exception ex5) {}
        finally {
            Label_0257: {
                OutputStream outputStream2;
                try {
                    outputStream2 = d;
                    if (g == 0) {
                        if (outputStream2 == null) {
                            break Label_0257;
                        }
                    }
                }
                catch (IOException ex3) {
                    throw ex3;
                }
                try {
                    outputStream2.close();
                }
                catch (IOException ex6) {}
            }
        }
    }
    
    public a_ a(String b) {
        final int g = v.g;
        b = b(b);
        for (final a_ a_ : this) {
            Label_0060: {
                a_ a_3 = null;
                Label_0054: {
                    a_ a_2;
                    try {
                        a_2 = (a_3 = a_);
                        if (g != 0) {
                            return a_3;
                        }
                        final String s = a_2.a;
                        final String s2 = b;
                        final boolean b2 = s.equalsIgnoreCase(s2);
                        if (b2) {
                            break Label_0054;
                        }
                        break Label_0060;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final String s = a_2.a;
                        final String s2 = b;
                        final boolean b2 = s.equalsIgnoreCase(s2);
                        if (!b2) {
                            break Label_0060;
                        }
                        a_3 = a_;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return a_3;
            }
            if (g != 0) {
                int a = Task.a;
                Task.a = ++a;
                break;
            }
        }
        return null;
    }
    
    public static String b(String replaceAll) {
        replaceAll = replaceAll.toLowerCase().trim().replaceAll(t.a(jb.z[4]), org.powerbot.a.a("|"));
        return replaceAll;
    }
    
    public a_ c(final String s) {
        int g = v.g;
        final a_ e = new a_(s);
        a_ a_;
        try {
            this.add(e);
            a_ = e;
            if (Task.a != 0) {
                v.g = ++g;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return a_;
    }
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "\u001e\nG\u0011B_G\u000e";
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
                Label_0157: {
                    if (n8 > 1) {
                        break Label_0157;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = 'P';
                                break;
                            }
                            case 1: {
                                c2 = '\u000b';
                                break;
                            }
                            case 2: {
                                c2 = '\n';
                                break;
                            }
                            case 3: {
                                c2 = '\u0002';
                                break;
                            }
                            default: {
                                c2 = '\u000b';
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
                    s = "\u0003\u000eY\u0000PB";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "oM0@4\u0017";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "\u0003/G";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "2\u0018";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "\u0014'D*I~K3R";
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
        a = new jb();
    }
    
    public final class a_
    {
        private String a;
        private String b;
        public int c;
        public boolean d;
        public String e;
        private static final String z;
        
        public a_(final String s) {
            this.c = -1;
            this.d = false;
            this.a = jb.b(s);
        }
        
        public String a() {
            return this.b;
        }
        
        public void a(final String b) {
            this.b = b;
        }
        
        public String b() {
            return String.format(ClientStub.e(a_.z), this.c);
        }
        
        @Override
        public String toString() {
            return this.a;
        }
        
        static {
            final char[] charArray = "\u001e\u0011VG".toCharArray();
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
                                c2 = '@';
                                break;
                            }
                            case 1: {
                                c2 = '%';
                                break;
                            }
                            case 2: {
                                c2 = '\u0019';
                                break;
                            }
                            case 3: {
                                c2 = '\'';
                                break;
                            }
                            default: {
                                c2 = 'u';
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
}
