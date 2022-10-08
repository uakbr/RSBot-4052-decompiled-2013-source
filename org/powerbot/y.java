
package org.powerbot;

import org.powerbot.core.script.internal.wrappers.Deque;
import org.f;
import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.net.SocketException;
import java.net.NetworkInterface;
import org.powerbot.game.api.util.SkillData;
import java.util.zip.Adler32;

public class y
{
    public static final String a;
    public static final boolean b;
    public static final boolean c;
    public static volatile int d;
    public static final a_ e;
    private static final String[] z;
    
    public static boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //     7: iconst_4       
        //     8: aaload         
        //     9: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //    12: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    15: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //    18: iconst_5       
        //    19: aaload         
        //    20: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //    23: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //    26: iload_3        
        //    27: ifne            43
        //    30: iconst_m1      
        //    31: if_icmpeq       44
        //    34: goto            38
        //    37: athrow         
        //    38: iconst_1       
        //    39: goto            43
        //    42: athrow         
        //    43: ireturn        
        //    44: getstatic       org/powerbot/y.e:Lorg/powerbot/y$a_;
        //    47: getstatic       org/powerbot/y$a_.LINUX:Lorg/powerbot/y$a_;
        //    50: if_acmpne       301
        //    53: new             Ljava/io/File;
        //    56: dup            
        //    57: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //    60: iconst_1       
        //    61: aaload         
        //    62: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //    65: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    68: astore_0       
        //    69: aload_0        
        //    70: invokevirtual   java/io/File.exists:()Z
        //    73: iload_3        
        //    74: ifne            100
        //    77: ifeq            151
        //    80: goto            84
        //    83: athrow         
        //    84: aload_0        
        //    85: iload_3        
        //    86: ifne            104
        //    89: goto            93
        //    92: athrow         
        //    93: invokevirtual   java/io/File.canRead:()Z
        //    96: goto            100
        //    99: athrow         
        //   100: ifeq            151
        //   103: aload_0        
        //   104: invokestatic    org/powerbot/cb.b:(Ljava/io/File;)Ljava/lang/String;
        //   107: astore_1       
        //   108: aload_1        
        //   109: iload_3        
        //   110: ifne            174
        //   113: ifnull          151
        //   116: goto            120
        //   119: athrow         
        //   120: aload_1        
        //   121: iload_3        
        //   122: ifne            174
        //   125: goto            129
        //   128: athrow         
        //   129: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //   132: iconst_3       
        //   133: aaload         
        //   134: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //   137: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   140: iconst_m1      
        //   141: if_icmpeq       151
        //   144: goto            148
        //   147: athrow         
        //   148: iconst_1       
        //   149: ireturn        
        //   150: athrow         
        //   151: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   154: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //   157: bipush          7
        //   159: aaload         
        //   160: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   163: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //   166: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //   169: invokestatic    org/powerbot/cb.b:(Ljava/io/InputStream;)Ljava/lang/String;
        //   172: astore_1       
        //   173: aload_1        
        //   174: iload_3        
        //   175: ifne            186
        //   178: ifnull          215
        //   181: goto            185
        //   184: athrow         
        //   185: aload_1        
        //   186: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //   189: iconst_2       
        //   190: aaload         
        //   191: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //   194: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   197: iload_3        
        //   198: ifne            214
        //   201: iconst_m1      
        //   202: if_icmpeq       215
        //   205: goto            209
        //   208: athrow         
        //   209: iconst_1       
        //   210: goto            214
        //   213: athrow         
        //   214: ireturn        
        //   215: goto            219
        //   218: astore_2       
        //   219: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   222: getstatic       org/powerbot/y.z:[Ljava/lang/String;
        //   225: bipush          6
        //   227: aaload         
        //   228: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   231: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //   234: invokevirtual   java/lang/Process.getInputStream:()Ljava/io/InputStream;
        //   237: invokestatic    org/powerbot/cb.b:(Ljava/io/InputStream;)Ljava/lang/String;
        //   240: astore_1       
        //   241: aload_1        
        //   242: iload_3        
        //   243: ifne            254
        //   246: ifnull          297
        //   249: goto            253
        //   252: athrow         
        //   253: aload_1        
        //   254: invokevirtual   java/lang/String.isEmpty:()Z
        //   257: iload_3        
        //   258: ifne            284
        //   261: ifne            297
        //   264: goto            268
        //   267: athrow         
        //   268: aload_1        
        //   269: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   272: ldc             "f"
        //   274: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //   277: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   280: goto            284
        //   283: athrow         
        //   284: iload_3        
        //   285: ifne            296
        //   288: ifne            297
        //   291: goto            295
        //   294: athrow         
        //   295: iconst_1       
        //   296: ireturn        
        //   297: goto            301
        //   300: astore_2       
        //   301: iconst_0       
        //   302: ireturn        
        //    StackMapTable: 00 2C FF 00 25 00 04 00 00 00 01 00 01 07 00 0F 00 43 07 00 0F 40 01 00 FF 00 26 00 04 07 00 06 00 00 01 00 01 07 00 0F 00 47 07 00 0F 40 07 00 06 45 07 00 0F 40 01 43 07 00 06 FF 00 0E 00 04 07 00 06 07 00 45 00 01 00 01 07 00 0F 00 47 07 00 0F 40 07 00 45 51 07 00 0F 00 41 07 00 0F FF 00 00 00 04 07 00 06 00 00 01 00 00 FF 00 16 00 04 07 00 06 07 00 45 00 01 00 01 07 00 45 49 07 00 0F 00 40 07 00 45 55 07 00 0F 00 43 07 00 0F 40 01 00 FF 00 02 00 04 07 00 06 00 00 01 00 01 07 00 0F 00 FF 00 20 00 04 07 00 06 07 00 45 00 01 00 01 07 00 0F 00 40 07 00 45 4C 07 00 0F 00 4E 07 00 0F 40 01 49 07 00 0F 00 40 01 00 FF 00 02 00 04 07 00 06 00 00 01 00 01 07 00 0F FF 00 00 00 04 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  201    210    213    214    Ljava/io/IOException;
        //  186    205    208    209    Ljava/io/IOException;
        //  174    181    184    185    Ljava/io/IOException;
        //  129    150    150    151    Ljava/io/IOException;
        //  120    144    147    148    Ljava/io/IOException;
        //  113    125    128    129    Ljava/io/IOException;
        //  108    116    119    120    Ljava/io/IOException;
        //  84     96     99     100    Ljava/io/IOException;
        //  77     89     92     93     Ljava/io/IOException;
        //  69     80     83     84     Ljava/io/IOException;
        //  30     39     42     43     Ljava/io/IOException;
        //  4      34     37     38     Ljava/io/IOException;
        //  151    214    218    219    Ljava/io/IOException;
        //  284    291    294    295    Ljava/io/IOException;
        //  261    280    283    284    Ljava/io/IOException;
        //  254    264    267    268    Ljava/io/IOException;
        //  241    249    252    253    Ljava/io/IOException;
        //  219    296    300    301    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0084:
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
    
    public static long b() {
        final Adler32 adler32 = new Adler32();
        adler32.update(gb.d(SkillData.e(y.z[0])));
        try {
            final Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                final byte[] hardwareAddress = networkInterfaces.nextElement().getHardwareAddress();
                try {
                    if (hardwareAddress == null) {
                        continue;
                    }
                    adler32.update(hardwareAddress);
                }
                catch (SocketException ex) {
                    throw ex;
                }
            }
        }
        catch (SocketException ex2) {}
        return adler32.getValue();
    }
    
    static {
        final String[] z2 = new String[10];
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 0))))))));
        String s = "E-AT>";
        int n11 = -1;
        String z3 = null;
    Label_0102:
        while (true) {
            z3 = z(z(s));
            switch (n11) {
                default: {
                    z2[n2] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 1)))))))));
                    s = "_|\u0010?\u0002d\u0007pX%\u001e\u007f\r;\u0002y\u001bwL%\u0002r";
                    n11 = 0;
                    continue;
                }
                case 0: {
                    z2[n] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 2)))))))));
                    s = "Q\u001bGX\u0004\u0019";
                    n11 = 1;
                    continue;
                }
                case 1: {
                    z2[n3] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 3)))))))));
                    s = "\nV\u0006\u0013U";
                    n11 = 2;
                    continue;
                }
                case 2: {
                    z2[n4] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 4)))))))));
                    s = "x\r-U+\u001d|";
                    n11 = 3;
                    continue;
                }
                case 3: {
                    z2[n5] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 5)))))))));
                    s = "\u0019A\u001e\u0013S";
                    n11 = 4;
                    continue;
                }
                case 4: {
                    z2[n6] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 6)))))))));
                    s = "8\u001cjUe\u0003qD8@r\rd\u001b6P|\u0003.Hg^.RjWa\u00012Qq\flU>WeD+N7So";
                    n11 = 5;
                    continue;
                }
                case 5: {
                    z2[n7] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 7)))))))));
                    s = "_{\r2\u0002d\u0016#N$\u0011t\u0001|\u0000e";
                    n11 = 6;
                    continue;
                }
                case 6: {
                    z2[n8] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 8)))))))));
                    s = "\u0010Z\n";
                    n11 = 7;
                    continue;
                }
                case 7: {
                    z2[n9] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = 9)))))))));
                    s = "t\u0011mO8\u001fuJ(Uc";
                    n11 = 8;
                    continue;
                }
                case 8: {
                    break Label_0102;
                }
            }
        }
        z2[n10] = z3;
        z = z2;
        boolean b2 = false;
    Label_0277_Outer:
        while (true) {
        Label_0291:
            while (true) {
                String s3 = null;
            Label_0201:
                while (true) {
                    String s2 = null;
                    Label_0171: {
                        try {
                            s2 = ".`*\u0019U";
                            break Label_0171;
                            final String z4;
                            a = kb.a(z4);
                            y.d = -1;
                            final ClassLoader classLoader = y.class.getClassLoader();
                            s3 = "e\u001bpT?\u0002z\u0001/\u0002~\u0013b\\/\u00036\r?ByPsU-";
                            break Label_0201;
                            // iftrue(Label_0291:, classLoader.getResource(SkillData.e(z5)) == null)
                            b2 = true;
                            break;
                        }
                        catch (IOException ex) {
                            throw ex;
                        }
                        break Label_0291;
                    }
                    final String z4 = z(z(s2));
                    continue Label_0277_Outer;
                }
                final String z5 = z(z(s3));
                continue;
            }
            b2 = false;
            break;
        }
        b = b2;
        long n12 = 0L;
        try {
            final File file = new File(kb.a(y.z[8]), SkillData.e(y.z[9]));
            long c2 = 0L;
            Label_0341: {
                try {
                    if (file.isFile()) {
                        c2 = cb.c(file);
                        break Label_0341;
                    }
                }
                catch (IOException ex2) {
                    throw ex2;
                }
                c2 = -1L;
            }
            n12 = c2;
        }
        catch (IOException ex8) {}
        while (true) {
            Label_0369: {
                Label_0364: {
                    try {
                        if (y.b) {
                            break Label_0369;
                        }
                        final long n13 = n12;
                        final long n14 = 3286621395L;
                        final long n15 = lcmp(n13, n14);
                        if (n15 == 0) {
                            break Label_0364;
                        }
                        break Label_0369;
                    }
                    catch (IOException ex3) {
                        throw ex3;
                    }
                    try {
                        final long n13 = n12;
                        final long n14 = 3286621395L;
                        final long n15 = lcmp(n13, n14);
                        if (n15 == 0) {
                            final boolean c3 = true;
                            break Label_0370;
                        }
                    }
                    catch (IOException ex4) {
                        throw ex4;
                    }
                }
                break Label_0369;
            Label_0472:
                while (true) {
                    final boolean c3;
                    c = c3;
                    final String property = System.getProperty(kb.a(z(z("\u0013@F\u0018@P\u0017"))));
                Label_0395_Outer:
                    while (true) {
                        while (true) {
                            try {
                                final String s6;
                                final String s5;
                                final String s4 = s5 = (s6 = property);
                                final String s7 = "Z\u001f`";
                                final int n16 = -1;
                                break Label_0216;
                                // iftrue(Label_0414:, !s5.contains((CharSequence)SkillData.e(z6)))
                                e = a_.MAC;
                                break;
                            }
                            catch (IOException ex5) {
                                throw ex5;
                            }
                            Block_6: {
                                break Block_6;
                                String s7 = null;
                                final String z6 = z(z(s7));
                                int n16 = 0;
                                switch (n16) {
                                    default: {
                                        continue;
                                    }
                                    case 0: {
                                        Label_0421: {
                                            break Label_0421;
                                            try {
                                                Label_0414: {
                                                    final String s6;
                                                    final String s5;
                                                    final String s4 = s5 = (s6 = property);
                                                }
                                                s7 = "+Z\u0006\u0012NJ\u0001";
                                                n16 = 0;
                                                continue Label_0395_Outer;
                                                // iftrue(Label_0440:, !s4.contains((CharSequence)kb.a(z6)))
                                                e = a_.WINDOWS;
                                                break Label_0472;
                                            }
                                            catch (IOException ex6) {
                                                throw ex6;
                                            }
                                        }
                                    }
                                    case 1: {
                                        Label_0447: {
                                            break Label_0447;
                                            try {
                                                Label_0440: {
                                                    final String s6;
                                                    final String s5;
                                                    final String s4 = s5 = (s6 = property);
                                                }
                                                s7 = "[\u0017mN2";
                                                n16 = 1;
                                                continue Label_0395_Outer;
                                                // iftrue(Label_0466:, !s6.contains((CharSequence)SkillData.e(z6)))
                                                e = a_.LINUX;
                                                break Label_0472;
                                            }
                                            catch (IOException ex7) {
                                                throw ex7;
                                            }
                                        }
                                        Label_0466: {
                                            e = a_.UNKNOWN;
                                        }
                                        break Label_0472;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    }
                }
                return;
            }
            final boolean c3 = false;
            continue;
        }
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        int i;
        do {
            i = charArray.length;
            if (i < 2) {
                continue;
            }
            return charArray;
        } while (i == 0);
        final int n = 0;
        charArray[n] ^= 'w';
        return charArray;
    }
    
    private static String z(final char[] value) {
        int length;
        int n2;
        final int n = n2 = (length = value.length);
        int n3 = 0;
        while (true) {
            Label_0086: {
                if (n > 1) {
                    break Label_0086;
                }
                length = (n2 = n3);
                do {
                    final char c = value[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '*';
                            break;
                        }
                        case 1: {
                            c2 = '$';
                            break;
                        }
                        case 2: {
                            c2 = '>';
                            break;
                        }
                        case 3: {
                            c2 = 'a';
                            break;
                        }
                        default: {
                            c2 = 'w';
                            break;
                        }
                    }
                    value[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                return new String(value).intern();
            }
            continue;
        }
    }
    
    public enum a_
    {
        MAC, 
        WINDOWS, 
        LINUX, 
        UNKNOWN;
        
        private static final String[] z;
        
        static {
            final String[] z2 = new String[4];
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = 0));
            String s = "%f\u0011\u0005:\u000eW";
            int n5 = -1;
            String intern = null;
        Label_0062_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n7;
                final int n6 = n7 = (length = charArray.length);
                int n8 = 0;
                while (true) {
                    Label_0138: {
                        if (n6 > 1) {
                            break Label_0138;
                        }
                        length = (n7 = n8);
                        do {
                            final char c = charArray[n7];
                            char c2 = '\0';
                            switch (n8 % 5) {
                                case 0: {
                                    c2 = '^';
                                    break;
                                }
                                case 1: {
                                    c2 = '(';
                                    break;
                                }
                                case 2: {
                                    c2 = 's';
                                    break;
                                }
                                case 3: {
                                    c2 = 'F';
                                    break;
                                }
                                default: {
                                    c2 = 'Y';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n8;
                        } while (n6 == 0);
                    }
                    if (n6 > n8) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n5) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = 1)));
                        s = "'a\u0014\u000f:\u000eJ";
                        n5 = 0;
                        continue Label_0062_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = 2)));
                        s = "X_w-K";
                        n5 = 1;
                        continue Label_0062_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = 3)));
                        s = "YWz";
                        n5 = 2;
                        continue Label_0062_Outer;
                    }
                    case 2: {
                        break Label_0062_Outer;
                    }
                }
            }
            z2[n4] = intern;
            z = z2;
        }
    }
}
