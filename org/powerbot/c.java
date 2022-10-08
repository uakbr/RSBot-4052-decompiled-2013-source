
package org.powerbot;

import org.powerbot.core.script.internal.wrappers.Deque;
import org.r;
import org.f;

public class c extends f implements r
{
    private final boolean h;
    private final a_[] i;
    private String j;
    private static final String z;
    
    public c(final f f, final boolean h, final a_[] i) {
        super(262144, f);
        this.h = h;
        this.i = i;
    }
    
    @Override
    public void a(final int n, final int n2, final String j, final String s, final String s2, final String[] array) {
        super.a(n, n2, this.j = j, s, s2, array);
    }
    
    @Override
    public void a() {
        final int i = f.i;
        final a_[] j = this.i;
        final int length = j.length;
        int k = 0;
    Label_0099:
        while (true) {
            while (k < length) {
                final a_ a_ = j[k];
                int n = 0;
                String s = null;
                String s2 = null;
                String d = null;
                Label_0067: {
                    Label_0057: {
                        try {
                            final c c = this;
                            if (i != 0) {
                                break Label_0099;
                            }
                            final a_ a_2 = a_;
                            n = a_2.a;
                            final a_ a_3 = a_;
                            s = a_3.b;
                            final a_ a_4 = a_;
                            s2 = a_4.c;
                            final c c2 = this;
                            final boolean b = c2.h;
                            if (b) {
                                break Label_0057;
                            }
                            break Label_0057;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final a_ a_2 = a_;
                            n = a_2.a;
                            final a_ a_3 = a_;
                            s = a_3.b;
                            final a_ a_4 = a_;
                            s2 = a_4.c;
                            final c c2 = this;
                            final boolean b = c2.h;
                            if (b) {
                                d = null;
                                break Label_0067;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    d = a_.d;
                }
                this.a(n, s, s2, d, a_.e, a_.f, a_.g, a_.h);
                ++k;
                if (i != 0) {
                    break;
                }
                continue;
                c c = null;
                c.a();
                return;
            }
            final c c = this;
            continue Label_0099;
        }
    }
    
    private void a(final int p0, final String p1, final String p2, final String p3, final String p4, final String p5, final int p6, final long p7) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: aload_0        
        //     6: iload_1        
        //     7: aload_2        
        //     8: aload_3        
        //     9: aconst_null    
        //    10: aconst_null    
        //    11: invokespecial   org/f.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/p;
        //    14: astore          10
        //    16: aload           10
        //    18: iload           12
        //    20: ifne            74
        //    23: invokevirtual   org/p.b:()V
        //    26: aload           4
        //    28: ifnonnull       68
        //    31: goto            35
        //    34: athrow         
        //    35: aload           10
        //    37: bipush          25
        //    39: iconst_0       
        //    40: invokevirtual   org/p.b:(II)V
        //    43: aload           10
        //    45: sipush          180
        //    48: aload_0        
        //    49: getfield        org/powerbot/c.j:Ljava/lang/String;
        //    52: aload           5
        //    54: aload           6
        //    56: invokevirtual   org/p.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    59: iload           12
        //    61: ifeq            86
        //    64: goto            68
        //    67: athrow         
        //    68: aload           10
        //    70: goto            74
        //    73: athrow         
        //    74: sipush          178
        //    77: aload           4
        //    79: aload           5
        //    81: aload           6
        //    83: invokevirtual   org/p.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    86: iload           7
        //    88: iload           12
        //    90: ifne            363
        //    93: lookupswitch {
        //                1: 121
        //                2: 332
        //          default: 357
        //        }
        //   120: athrow         
        //   121: lload           8
        //   123: ldc2_w          -1
        //   126: lcmp           
        //   127: iload           12
        //   129: ifne            194
        //   132: goto            136
        //   135: athrow         
        //   136: iflt            184
        //   139: goto            143
        //   142: athrow         
        //   143: lload           8
        //   145: ldc2_w          5
        //   148: lcmp           
        //   149: iload           12
        //   151: ifne            194
        //   154: goto            158
        //   157: athrow         
        //   158: ifgt            184
        //   161: goto            165
        //   164: athrow         
        //   165: aload           10
        //   167: iconst_3       
        //   168: lload           8
        //   170: l2i            
        //   171: iadd           
        //   172: invokevirtual   org/p.a:(I)V
        //   175: iload           12
        //   177: ifeq            320
        //   180: goto            184
        //   183: athrow         
        //   184: lload           8
        //   186: ldc2_w          -128
        //   189: lcmp           
        //   190: goto            194
        //   193: athrow         
        //   194: iload           12
        //   196: ifne            257
        //   199: iflt            247
        //   202: goto            206
        //   205: athrow         
        //   206: lload           8
        //   208: ldc2_w          127
        //   211: lcmp           
        //   212: iload           12
        //   214: ifne            257
        //   217: goto            221
        //   220: athrow         
        //   221: ifgt            247
        //   224: goto            228
        //   227: athrow         
        //   228: aload           10
        //   230: bipush          16
        //   232: lload           8
        //   234: l2i            
        //   235: invokevirtual   org/p.a:(II)V
        //   238: iload           12
        //   240: ifeq            320
        //   243: goto            247
        //   246: athrow         
        //   247: lload           8
        //   249: ldc2_w          -32768
        //   252: lcmp           
        //   253: goto            257
        //   256: athrow         
        //   257: iload           12
        //   259: ifne            279
        //   262: iflt            301
        //   265: goto            269
        //   268: athrow         
        //   269: lload           8
        //   271: ldc2_w          32767
        //   274: lcmp           
        //   275: goto            279
        //   278: athrow         
        //   279: ifgt            301
        //   282: aload           10
        //   284: bipush          17
        //   286: lload           8
        //   288: l2i            
        //   289: invokevirtual   org/p.a:(II)V
        //   292: iload           12
        //   294: ifeq            320
        //   297: goto            301
        //   300: athrow         
        //   301: aload           10
        //   303: new             Ljava/lang/Integer;
        //   306: dup            
        //   307: lload           8
        //   309: l2i            
        //   310: invokespecial   java/lang/Integer.<init>:(I)V
        //   313: invokevirtual   org/p.a:(Ljava/lang/Object;)V
        //   316: goto            320
        //   319: athrow         
        //   320: aload           10
        //   322: bipush          104
        //   324: invokevirtual   org/p.a:(I)V
        //   327: iload           12
        //   329: ifeq            357
        //   332: aload           10
        //   334: new             Ljava/lang/Long;
        //   337: dup            
        //   338: lload           8
        //   340: invokespecial   java/lang/Long.<init>:(J)V
        //   343: invokevirtual   org/p.a:(Ljava/lang/Object;)V
        //   346: aload           10
        //   348: bipush          105
        //   350: invokevirtual   org/p.a:(I)V
        //   353: goto            357
        //   356: athrow         
        //   357: aload_0        
        //   358: aload           6
        //   360: invokespecial   org/powerbot/c.a:(Ljava/lang/String;)I
        //   363: istore          11
        //   365: aload           10
        //   367: iload           11
        //   369: invokevirtual   org/p.a:(I)V
        //   372: aload           10
        //   374: iload           11
        //   376: sipush          173
        //   379: iload           12
        //   381: ifne            419
        //   384: if_icmpeq       412
        //   387: goto            391
        //   390: athrow         
        //   391: iload           11
        //   393: sipush          175
        //   396: iload           12
        //   398: ifne            463
        //   401: goto            405
        //   404: athrow         
        //   405: if_icmpne       460
        //   408: goto            412
        //   411: athrow         
        //   412: iload           7
        //   414: iconst_2       
        //   415: goto            419
        //   418: athrow         
        //   419: iload           12
        //   421: ifne            448
        //   424: if_icmpne       436
        //   427: goto            431
        //   430: athrow         
        //   431: iconst_4       
        //   432: goto            500
        //   435: athrow         
        //   436: iload           7
        //   438: iload           12
        //   440: ifne            457
        //   443: iconst_1       
        //   444: goto            448
        //   447: athrow         
        //   448: if_icmpne       456
        //   451: iconst_3       
        //   452: goto            500
        //   455: athrow         
        //   456: iconst_2       
        //   457: goto            500
        //   460: iload           7
        //   462: iconst_2       
        //   463: iload           12
        //   465: ifne            492
        //   468: if_icmpne       480
        //   471: goto            475
        //   474: athrow         
        //   475: iconst_3       
        //   476: goto            500
        //   479: athrow         
        //   480: iload           7
        //   482: iload           12
        //   484: ifne            496
        //   487: iconst_1       
        //   488: goto            492
        //   491: athrow         
        //   492: if_icmpne       499
        //   495: iconst_2       
        //   496: goto            500
        //   499: iconst_1       
        //   500: iload_1        
        //   501: bipush          8
        //   503: iand           
        //   504: iload           12
        //   506: ifne            517
        //   509: ifne            520
        //   512: goto            516
        //   515: athrow         
        //   516: iconst_1       
        //   517: goto            521
        //   520: iconst_0       
        //   521: invokevirtual   org/p.d:(II)V
        //   524: aload           10
        //   526: invokevirtual   org/p.c:()V
        //   529: return         
        //    StackMapTable: 00 4C FF 00 22 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 00 01 00 01 07 00 2F 00 5F 07 00 2F 00 44 07 00 2F 40 07 00 55 0B 61 07 00 2F 00 4D 07 00 2F 40 01 45 07 00 2F 00 4D 07 00 2F 40 01 45 07 00 2F 00 51 07 00 2F 00 48 07 00 2F 40 01 4A 07 00 2F 00 4D 07 00 2F 40 01 45 07 00 2F 00 51 07 00 2F 00 48 07 00 2F 40 01 4A 07 00 2F 00 48 07 00 2F 40 01 54 07 00 2F 00 51 07 00 2F 00 0B 57 07 00 2F 00 45 01 FF 00 1A 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 01 07 00 2F 40 07 00 55 4C 07 00 2F FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 45 07 00 2F 40 07 00 55 45 07 00 2F FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 4A 07 00 2F 40 07 00 55 43 07 00 2F 40 07 00 55 4A 07 00 2F FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 46 07 00 2F 40 07 00 55 FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 02 07 00 55 01 42 07 00 55 FF 00 02 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 4A 07 00 2F 40 07 00 55 43 07 00 2F 40 07 00 55 4A 07 00 2F FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 FF 00 03 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 02 07 00 55 01 42 07 00 55 FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 02 07 00 55 01 4E 07 00 2F FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 02 07 00 55 01 FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01 FF 00 02 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 02 07 00 55 01 FF 00 00 00 0C 07 00 31 01 07 00 62 07 00 62 07 00 62 07 00 62 07 00 62 01 04 07 00 55 01 01 00 03 07 00 55 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  500    512    515    516    Ljava/lang/RuntimeException;
        //  480    488    491    492    Ljava/lang/RuntimeException;
        //  468    479    479    480    Ljava/lang/RuntimeException;
        //  463    471    474    475    Ljava/lang/RuntimeException;
        //  448    455    455    456    Ljava/lang/RuntimeException;
        //  436    444    447    448    Ljava/lang/RuntimeException;
        //  424    435    435    436    Ljava/lang/RuntimeException;
        //  419    427    430    431    Ljava/lang/RuntimeException;
        //  405    415    418    419    Ljava/lang/RuntimeException;
        //  391    408    411    412    Ljava/lang/RuntimeException;
        //  384    401    404    405    Ljava/lang/RuntimeException;
        //  365    387    390    391    Ljava/lang/RuntimeException;
        //  320    356    356    357    Ljava/lang/RuntimeException;
        //  282    316    319    320    Ljava/lang/RuntimeException;
        //  279    297    300    301    Ljava/lang/RuntimeException;
        //  262    275    278    279    Ljava/lang/RuntimeException;
        //  257    265    268    269    Ljava/lang/RuntimeException;
        //  228    253    256    257    Ljava/lang/RuntimeException;
        //  221    243    246    247    Ljava/lang/RuntimeException;
        //  206    224    227    228    Ljava/lang/RuntimeException;
        //  199    217    220    221    Ljava/lang/RuntimeException;
        //  194    202    205    206    Ljava/lang/RuntimeException;
        //  165    190    193    194    Ljava/lang/RuntimeException;
        //  158    180    183    184    Ljava/lang/RuntimeException;
        //  143    161    164    165    Ljava/lang/RuntimeException;
        //  136    154    157    158    Ljava/lang/RuntimeException;
        //  121    139    142    143    Ljava/lang/RuntimeException;
        //  93     132    135    136    Ljava/lang/RuntimeException;
        //  86     120    120    121    Ljava/lang/RuntimeException;
        //  35     70     73     74     Ljava/lang/RuntimeException;
        //  23     64     67     68     Ljava/lang/RuntimeException;
        //  16     31     34     35     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    private int a(String substring) {
        final int i = f.i;
        substring = substring.substring(substring.indexOf(t.b(">")) + 1);
        int n2 = 0;
        Label_0046: {
            Label_0041: {
                int n;
                try {
                    n = (n2 = substring.length());
                    if (i != 0) {
                        break Label_0046;
                    }
                    final int n3 = 1;
                    if (n > n3) {
                        return 176;
                    }
                    break Label_0041;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n3 = 1;
                    if (n > n3) {
                        return 176;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            n2 = substring.charAt(0);
        }
        final int n4 = n2;
        int n5;
        try {
            n5 = n4;
            if (i != 0) {
                return n5;
            }
            switch (n5) {
                case 66:
                case 67:
                case 73:
                case 83:
                case 90: {
                    break;
                }
                case 74: {
                    return 173;
                }
                case 70: {
                    return 174;
                }
                case 68: {
                    return 175;
                }
                default: {
                    throw new RuntimeException(Deque.e(c.z));
                }
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return n5;
    }
    
    static {
        final char[] charArray = "\u001cy\u001aO`0G IW".toCharArray();
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
                            c2 = 'y';
                            break;
                        }
                        case 1: {
                            c2 = '4';
                            break;
                        }
                        case 2: {
                            c2 = 'y';
                            break;
                        }
                        case 3: {
                            c2 = '<';
                            break;
                        }
                        default: {
                            c2 = '\u0015';
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
    
    public static class a_
    {
        public int a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public int g;
        public long h;
    }
}
