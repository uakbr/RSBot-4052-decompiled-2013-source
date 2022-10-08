
package org.powerbot;

import org.powerbot.core.script.methods.GroundItems;
import java.io.InputStream;
import java.util.HashMap;
import java.io.IOException;
import org.powerbot.core.script.internal.wrappers.Deque;
import java.util.Map;
import org.powerbot.game.bot.handler.input.a;

public final class v
{
    private static v a;
    private static final String b;
    private static final String c;
    private static final String d;
    private final z e;
    private a_ f;
    public static int g;
    private static final String[] z;
    
    private v() {
        this.e = new z(org.powerbot.game.bot.handler.input.a.a(v.z[4]), (Class<?>[])new Class[] { v.class });
        this.d();
    }
    
    public static synchronized v a() {
        try {
            if (v.a == null) {
                v.a = new v();
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        return v.a;
    }
    
    public boolean b() {
        Label_0021: {
            try {
                if (this.f == null) {
                    return false;
                }
                final v v = this;
                final a_ a_ = v.f;
                final int n = a_.b();
                if (n != 0) {
                    break Label_0021;
                }
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final v v = this;
                final a_ a_ = v.f;
                final int n = a_.b();
                if (n != 0) {
                    return true;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public boolean a(final int n) {
        final int g = v.g;
        long n2 = 0L;
        Label_0051: {
            Label_0027: {
                a_ a_2 = null;
                Label_0019: {
                    a_ a_;
                    try {
                        a_ = (a_2 = this.f);
                        if (g != 0) {
                            break Label_0027;
                        }
                        if (a_ != null) {
                            break Label_0019;
                        }
                        break Label_0051;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    try {
                        if (a_ == null) {
                            break Label_0051;
                        }
                        a_2 = this.f;
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
                try {
                    n2 = lcmp(a_2.g() & (long)n, (long)n);
                    if (g != 0) {
                        return n2 != 0L;
                    }
                    if (n2 != 0) {
                        break Label_0051;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
            }
            return n2 != 0L;
        }
        return n2 != 0L;
    }
    
    public a_ c() {
        return this.f;
    }
    
    public synchronized void d() {
        this.f = null;
        if (this.e.a()) {
            try {
                final Map<String, String> map = bb.a(this.e.c()).get("");
                Label_0126: {
                    Label_0088: {
                        try {
                            if (!map.containsKey(Deque.e(v.z[1]))) {
                                break Label_0088;
                            }
                            final Map<String, String> map2 = map;
                            final String[] array = v.z;
                            final int n = 3;
                            final String s = array[n];
                            final String s2 = org.powerbot.game.bot.handler.input.a.a(s);
                            final String s3 = map2.get(s2);
                            final String s4 = s3;
                            final long n2 = Long.parseLong(s4);
                            final long n3 = 86400000L;
                            final long n4 = n2 + n3;
                            final long n5 = System.currentTimeMillis();
                            final long n6 = lcmp(n4, n5);
                            if (n6 > 0) {
                                break Label_0088;
                            }
                            break Label_0088;
                        }
                        catch (IOException ex) {
                            throw ex;
                        }
                        try {
                            final Map<String, String> map2 = map;
                            final String[] array = v.z;
                            final int n = 3;
                            final String s = array[n];
                            final String s2 = org.powerbot.game.bot.handler.input.a.a(s);
                            final String s3 = map2.get(s2);
                            final String s4 = s3;
                            final long n2 = Long.parseLong(s4);
                            final long n3 = 86400000L;
                            final long n4 = n2 + n3;
                            final long n5 = System.currentTimeMillis();
                            final long n6 = lcmp(n4, n5);
                            if (n6 > 0) {
                                this.f = a_.a(map);
                                break Label_0126;
                            }
                        }
                        catch (IOException ex2) {
                            throw ex2;
                        }
                    }
                    this.a("", "", map.get(Deque.e(v.z[2])));
                }
            }
            catch (IOException ex5) {}
            Label_0151: {
                try {
                    if (!this.b()) {
                        break Label_0151;
                    }
                    final v v = this;
                    final a_ a_ = v.f;
                    final boolean b = a_.a();
                    if (!b) {
                        break Label_0151;
                    }
                    return;
                }
                catch (IOException ex3) {
                    throw ex3;
                }
                try {
                    final v v = this;
                    final a_ a_ = v.f;
                    final boolean b = a_.a();
                    if (!b) {
                        this.e.b();
                    }
                }
                catch (IOException ex4) {
                    throw ex4;
                }
            }
        }
    }
    
    public synchronized boolean a(final String s, final String s2, final String s3) {
        InputStream a;
        try {
            a = ab.a(org.powerbot.game.bot.handler.input.a.a(v.z[0]), gb.b(s), gb.b(s2), gb.b(s3));
        }
        catch (NullPointerException ex) {
            ex.printStackTrace();
            return false;
        }
        boolean b2 = false;
        Label_0076: {
            Label_0070: {
                try {
                    if (!this.a(a)) {
                        break Label_0070;
                    }
                    final v v = this;
                    final boolean b = v.b();
                    if (b) {
                        break Label_0070;
                    }
                    break Label_0070;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
                try {
                    final v v = this;
                    final boolean b = v.b();
                    if (b) {
                        b2 = true;
                        break Label_0076;
                    }
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
            }
            b2 = false;
        }
        final boolean b3 = b2;
        if (b3) {
            final Map<String, String> h = this.f.h();
            h.put(Deque.e(v.z[1]), Long.toString(System.currentTimeMillis()));
            final HashMap<String, Map<String, String>> hashMap = new HashMap<String, Map<String, String>>();
            hashMap.put("", h);
            bb.a(hashMap, this.e.d());
        }
        else {
            this.e.b();
        }
        this.f();
        return b3;
    }
    
    private boolean a(final InputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    org/powerbot/bb.a:(Ljava/io/InputStream;)Ljava/util/Map;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          43
        //     9: aload_2        
        //    10: invokeinterface java/util/Map.size:()I
        //    15: ifeq            43
        //    18: goto            22
        //    21: athrow         
        //    22: aload_2        
        //    23: getstatic       org/powerbot/v.z:[Ljava/lang/String;
        //    26: iconst_5       
        //    27: aaload         
        //    28: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //    31: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    36: ifne            46
        //    39: goto            43
        //    42: athrow         
        //    43: iconst_0       
        //    44: ireturn        
        //    45: athrow         
        //    46: aload_2        
        //    47: getstatic       org/powerbot/v.z:[Ljava/lang/String;
        //    50: iconst_2       
        //    51: aaload         
        //    52: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    55: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    60: checkcast       Ljava/util/Map;
        //    63: astore_3       
        //    64: aload_0        
        //    65: aload_3        
        //    66: invokestatic    org/powerbot/v$a_.a:(Ljava/util/Map;)Lorg/powerbot/v$a_;
        //    69: putfield        org/powerbot/v.f:Lorg/powerbot/v$a_;
        //    72: iconst_1       
        //    73: ireturn        
        //    StackMapTable: 00 06 FF 00 15 00 03 07 00 04 07 00 CE 07 00 12 00 01 07 00 22 00 53 07 00 22 00 41 07 00 22 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  22     45     45     46     Ljava/lang/NullPointerException;
        //  9      39     42     43     Ljava/lang/NullPointerException;
        //  5      18     21     22     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public synchronized void e() {
        this.f = null;
        this.e.b();
        this.f();
    }
    
    private synchronized void f() {
        k.a().a(new m(false, -96216451));
    }
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = ":Lg,#F9\u0012\u0005\t%\u0016c3'\u0019d_\u001d\n|Wa;\u007f\u001dfT]\u0012=_z2\u007fCmm=-\u0006Efau\u000f0MO[!\u001erau\u000f";
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
                        final char c2 = charArray[n9];
                        char c3 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c3 = 'f';
                                break;
                            }
                            case 1: {
                                c3 = '\"';
                                break;
                            }
                            case 2: {
                                c3 = '\'';
                                break;
                            }
                            case 3: {
                                c3 = 'F';
                                break;
                            }
                            default: {
                                c3 = 'd';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
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
                    s = ")Wn <\u0004j";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "\u0000{T\u0002";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "\u001fdX\u0013\n7\\";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "\u0012sI\u0013\u001d1L";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "3Mg4";
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
        b = org.powerbot.game.bot.handler.input.a.a(v.z[4]);
        c = Deque.e(v.z[2]);
        d = org.powerbot.game.bot.handler.input.a.a(v.z[3]);
        v.a = null;
    }
    
    public static final class a_
    {
        private final int a;
        private final long b;
        private final String c;
        private final String d;
        private final String e;
        private final String f;
        private final int[] g;
        private static final String[] z;
        
        public a_(final int a, final String c, final String d, final String e, final String f, final long b, final int[] g) {
            this.a = a;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.b = b;
            this.g = g;
        }
        
        public boolean a() {
            final String upperCase = (this.d() + this.f()).toUpperCase();
            long a;
            try {
                a = cb.a(gb.d(upperCase));
            }
            catch (IOException ex2) {
                return false;
            }
            try {
                if (this.g() >> 8 == a >> 8) {
                    return true;
                }
            }
            catch (IOException ex) {
                throw ex;
            }
            return false;
        }
        
        public int b() {
            return this.a;
        }
        
        public String c() {
            return this.c;
        }
        
        public String d() {
            return this.d;
        }
        
        public String e() {
            return this.e;
        }
        
        public String f() {
            return this.f;
        }
        
        public long g() {
            return this.b;
        }
        
        public Map<String, String> h() {
            final HashMap<String, String> hashMap = new HashMap<String, String>();
            hashMap.put(GroundItems.e(a_.z[4]), Integer.toString(this.a));
            hashMap.put(org.powerbot.game.bot.handler.input.a.a(a_.z[0]), this.c);
            hashMap.put(GroundItems.e(a_.z[3]), this.d);
            hashMap.put(org.powerbot.game.bot.handler.input.a.a(a_.z[1]), this.e);
            hashMap.put(GroundItems.e(a_.z[5]), this.f);
            hashMap.put(org.powerbot.game.bot.handler.input.a.a(a_.z[6]), Long.toString(this.b));
            final StringBuilder sb = new StringBuilder(this.g.length * 2);
            for (final int j : this.g) {
                sb.append(',');
                sb.append(Integer.toString(j));
            }
            sb.deleteCharAt(0);
            hashMap.put(GroundItems.e(a_.z[2]), sb.toString());
            return hashMap;
        }
        
        public static a_ a(final Map<String, String> map) {
            final int int1 = Integer.parseInt(map.get(org.powerbot.game.bot.handler.input.a.a(a_.z[8])));
            final String[] split = map.get(GroundItems.e(a_.z[2])).split(org.powerbot.game.bot.handler.input.a.a("6"));
            final int[] array = new int[split.length];
            int i = 0;
            try {
                while (i < split.length) {
                    array[i] = Integer.parseInt(split[i]);
                    ++i;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return new a_(int1, map.get(GroundItems.e(a_.z[7])), map.get(org.powerbot.game.bot.handler.input.a.a(a_.z[10])), map.get(GroundItems.e(a_.z[12])), map.get(org.powerbot.game.bot.handler.input.a.a(a_.z[11])), Long.parseLong(map.get(GroundItems.e(a_.z[9]))), array);
        }
        
        static {
            final String[] z2 = new String[13];
            int n13;
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
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 0)))))))))));
            String s = "\u0015Sk*";
            int n14 = -1;
            String intern = null;
        Label_0157_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n16;
                final int n15 = n16 = (length = charArray.length);
                int n17 = 0;
                while (true) {
                    Label_0234: {
                        if (n15 > 1) {
                            break Label_0234;
                        }
                        length = (n16 = n17);
                        do {
                            final char c = charArray[n16];
                            char c2 = '\0';
                            switch (n17 % 5) {
                                case 0: {
                                    c2 = '@';
                                    break;
                                }
                                case 1: {
                                    c2 = '<';
                                    break;
                                }
                                case 2: {
                                    c2 = '+';
                                    break;
                                }
                                case 3: {
                                    c2 = 'X';
                                    break;
                                }
                                default: {
                                    c2 = '\u001c';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n17;
                        } while (n15 == 0);
                    }
                    if (n15 > n17) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n14) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 1))))))))))));
                        s = ">aB\u001cj\u0015_";
                        n14 = 0;
                        continue Label_0157_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 2))))))))))));
                        s = "\u0005\u0011frNl";
                        n14 = 1;
                        continue Label_0157_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 3))))))))))));
                        s = "\f\u0002db";
                        n14 = 2;
                        continue Label_0157_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 4))))))))))));
                        s = "r{\u0019\u0018&\u0010<`c";
                        n14 = 3;
                        continue Label_0157_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 5))))))))))));
                        s = "zs\u0015\u0013/";
                        n14 = 4;
                        continue Label_0157_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 6))))))))))));
                        s = "*mC\u0001o\u0007Uv-F)";
                        n14 = 5;
                        continue Label_0157_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 7))))))))))));
                        s = "\u0003\u0016}o";
                        n14 = 6;
                        continue Label_0157_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 8))))))))))));
                        s = "7m\\\u000ec\u0006yv&";
                        n14 = 7;
                        continue Label_0157_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 9))))))))))));
                        s = "o{\u0006\u0017*\u0011\u0010`hPl";
                        n14 = 8;
                        continue Label_0157_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 10))))))))))));
                        s = "\u001aGr'";
                        n14 = 9;
                        continue Label_0157_Outer;
                    }
                    case 9: {
                        z2[n11] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 11))))))))))));
                        s = "?eP\u0005j";
                        n14 = 10;
                        continue Label_0157_Outer;
                    }
                    case 10: {
                        z2[n12] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 12))))))))))));
                        s = "{w\u0007\n/\u0003\u001a";
                        n14 = 11;
                        continue Label_0157_Outer;
                    }
                    case 11: {
                        break Label_0157_Outer;
                    }
                }
            }
            z2[n13] = intern;
            z = z2;
        }
    }
}
