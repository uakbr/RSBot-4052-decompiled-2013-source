
package org;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.game.api.util.SkillData;

public class g extends f
{
    static final byte[] d;
    e e;
    int f;
    int g;
    final d h;
    n[] i;
    int j;
    final n k;
    final n l;
    final n m;
    final n n;
    n[] o;
    private short p;
    private int q;
    private int r;
    String s;
    private int t;
    private int u;
    private int v;
    private int[] w;
    private int x;
    private d y;
    private int z;
    private int A;
    private b B;
    private b C;
    private c D;
    private int E;
    private d F;
    int G;
    d H;
    j I;
    j J;
    q K;
    q L;
    private final boolean M;
    private final boolean N;
    boolean O;
    private static final String[] P;
    
    public g(final int n) {
        final boolean c = org.f.c;
        super(262144);
        this.g = 1;
        this.h = new d();
        this.i = new n[256];
        this.j = (int)(0.75 * this.i.length);
        this.k = new n();
        this.l = new n();
        this.m = new n();
        this.n = new n();
        final int m = n & 0x1;
        if (!c && m == 0) {}
        int n2 = 0;
        Label_0133: {
            Label_0130: {
                try {
                    this.M = (m != 0);
                    n2 = (n & 0x2);
                    if (c) {
                        break Label_0130;
                    }
                    if (n2 == 0) {
                        break Label_0133;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            break Label_0133;
        }
        this.N = (n2 != 0);
    }
    
    @Override
    public final void a(final int f, final int q, final String s, final String s2, final String s3, final String[] array) {
        final boolean c = f.c;
        int length = 0;
        Label_0106: {
            int n = 0;
            Label_0093: {
                Label_0074: {
                    g g = null;
                    Label_0060: {
                        Label_0043: {
                            try {
                                this.f = f;
                                this.q = q;
                                this.r = this.c(s);
                                g = this;
                                final String s4 = s;
                                if (c) {
                                    break Label_0060;
                                }
                                this.s = s;
                                final String s5 = s2;
                                if (s5 != null) {
                                    break Label_0043;
                                }
                                break Label_0043;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                this.s = s;
                                final String s5 = s2;
                                if (s5 != null) {
                                    this.t = this.a(s2);
                                }
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        g = this;
                        final String s4 = s3;
                        try {
                            if (s4 == null) {
                                final int c2 = 0;
                                break Label_0074;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    final int c2 = this.c(s3);
                    try {
                        g.u = c2;
                        final String[] array2 = array;
                        if (c) {
                            break Label_0093;
                        }
                        if (array == null) {
                            return;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                final String[] array2 = array;
                try {
                    n = (length = array2.length);
                    if (c) {
                        break Label_0106;
                    }
                    if (n > 0) {
                        break Label_0106;
                    }
                    return;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            try {
                if (n <= 0) {
                    return;
                }
                this.v = array.length;
                this.w = new int[this.v];
                length = 0;
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
        }
        int i = length;
        while (i < this.v) {
            this.w[i] = this.c(array[i]);
            ++i;
            if (c) {
                break;
            }
        }
    }
    
    @Override
    public final void a(final String s, final String s2) {
        Label_0028: {
            Label_0014: {
                try {
                    final String s3 = s;
                    if (org.f.c) {
                        break Label_0028;
                    }
                    if (s != null) {
                        break Label_0014;
                    }
                    break Label_0014;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (s != null) {
                        this.x = this.a(s);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            final String s3 = s2;
            try {
                if (s3 != null) {
                    this.y = new d().a(s2);
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public final void a(final String s, final String s2, final String s3) {
        Label_0024: {
            try {
                this.z = this.c(s);
                final String s4 = s2;
                if (org.f.c) {
                    break Label_0024;
                }
                if (s2 == null) {
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final String s4 = s3;
            try {
                if (s4 != null) {
                    this.A = this.a(s2, s3);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public final a a(final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: new             Lorg/d;
        //     8: dup            
        //     9: invokespecial   org/d.<init>:()V
        //    12: astore_3       
        //    13: aload_3        
        //    14: aload_0        
        //    15: aload_1        
        //    16: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //    19: invokevirtual   org/d.b:(I)Lorg/d;
        //    22: iconst_0       
        //    23: invokevirtual   org/d.b:(I)Lorg/d;
        //    26: pop            
        //    27: new             Lorg/b;
        //    30: dup            
        //    31: aload_0        
        //    32: iconst_1       
        //    33: aload_3        
        //    34: aload_3        
        //    35: iconst_2       
        //    36: invokespecial   org/b.<init>:(Lorg/g;ZLorg/d;Lorg/d;I)V
        //    39: astore          4
        //    41: iload           5
        //    43: ifne            91
        //    46: iload_2        
        //    47: ifeq            78
        //    50: goto            54
        //    53: athrow         
        //    54: aload           4
        //    56: aload_0        
        //    57: getfield        org/g.B:Lorg/b;
        //    60: putfield        org/b.i:Lorg/b;
        //    63: aload_0        
        //    64: aload           4
        //    66: putfield        org/g.B:Lorg/b;
        //    69: iload           5
        //    71: ifeq            97
        //    74: goto            78
        //    77: athrow         
        //    78: aload           4
        //    80: aload_0        
        //    81: getfield        org/g.C:Lorg/b;
        //    84: putfield        org/b.i:Lorg/b;
        //    87: goto            91
        //    90: athrow         
        //    91: aload_0        
        //    92: aload           4
        //    94: putfield        org/g.C:Lorg/b;
        //    97: aload           4
        //    99: areturn        
        //    StackMapTable: 00 07 FF 00 35 00 06 07 00 4D 07 00 66 01 07 00 04 07 00 25 01 00 01 07 00 32 00 56 07 00 32 00 4B 07 00 32 00 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  54     87     90     91     Ljava/lang/RuntimeException;
        //  46     74     77     78     Ljava/lang/RuntimeException;
        //  41     50     53     54     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    @Override
    public final void a(final c d) {
        d.c = this.D;
        this.D = d;
    }
    
    @Override
    public final void a(final String s, final String s2, final String s3, final int n) {
        d f2 = null;
        int a = 0;
        Label_0104: {
            Label_0082: {
                d f = null;
                Label_0060: {
                    d d2 = null;
                    Label_0046: {
                        Label_0017: {
                            d d;
                            try {
                                d = (d2 = this.F);
                                if (org.f.c) {
                                    break Label_0046;
                                }
                                if (d == null) {
                                    break Label_0017;
                                }
                                break Label_0017;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                if (d == null) {
                                    this.F = new d();
                                }
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        ++this.E;
                        d2 = this.F;
                        try {
                            if (s == null) {
                                final int c = 0;
                                break Label_0060;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    final int c = this.c(s);
                    try {
                        d2.b(c);
                        f = this.F;
                        if (s2 == null) {
                            final int c2 = 0;
                            break Label_0082;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                final int c2 = this.c(s2);
                try {
                    f.b(c2);
                    f2 = this.F;
                    if (s3 == null) {
                        a = 0;
                        break Label_0104;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            a = this.a(s3);
        }
        f2.b(a);
        this.F.b(n);
    }
    
    @Override
    public final i a(final int n, final String s, final String s2, final String s3, final Object o) {
        return new j(this, n, s, s2, s3, o);
    }
    
    @Override
    public final p a(final int n, final String s, final String s2, final String s3, final String[] array) {
        return new q(this, n, s, s2, s3, array, this.M, this.N);
    }
    
    @Override
    public final void a() {
    }
    
    public byte[] a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: getfield        org/g.g:I
        //     9: sipush          32767
        //    12: iload           10
        //    14: ifne            49
        //    17: if_icmple       41
        //    20: goto            24
        //    23: athrow         
        //    24: new             Ljava/lang/RuntimeException;
        //    27: dup            
        //    28: getstatic       org/g.P:[Ljava/lang/String;
        //    31: iconst_5       
        //    32: aaload         
        //    33: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //    36: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    39: athrow         
        //    40: athrow         
        //    41: bipush          24
        //    43: iconst_2       
        //    44: aload_0        
        //    45: getfield        org/g.v:I
        //    48: imul           
        //    49: iadd           
        //    50: istore_1       
        //    51: iconst_0       
        //    52: istore_2       
        //    53: aload_0        
        //    54: getfield        org/g.I:Lorg/j;
        //    57: astore_3       
        //    58: aload_3        
        //    59: ifnull          103
        //    62: iinc            2, 1
        //    65: iload_1        
        //    66: aload_3        
        //    67: invokevirtual   org/j.a:()I
        //    70: iadd           
        //    71: iload           10
        //    73: ifne            104
        //    76: istore_1       
        //    77: aload_3        
        //    78: getfield        org/j.b:Lorg/i;
        //    81: checkcast       Lorg/j;
        //    84: astore_3       
        //    85: iload           10
        //    87: ifeq            58
        //    90: getstatic       org/powerbot/core/script/job/Task.a:I
        //    93: istore          11
        //    95: iinc            11, 1
        //    98: iload           11
        //   100: putstatic       org/powerbot/core/script/job/Task.a:I
        //   103: iconst_0       
        //   104: istore          4
        //   106: aload_0        
        //   107: getfield        org/g.K:Lorg/q;
        //   110: astore          5
        //   112: aload           5
        //   114: ifnull          148
        //   117: iinc            4, 1
        //   120: iload_1        
        //   121: aload           5
        //   123: invokevirtual   org/q.f:()I
        //   126: iadd           
        //   127: iload           10
        //   129: ifne            149
        //   132: istore_1       
        //   133: aload           5
        //   135: getfield        org/q.b:Lorg/p;
        //   138: checkcast       Lorg/q;
        //   141: astore          5
        //   143: iload           10
        //   145: ifeq            112
        //   148: iconst_0       
        //   149: istore          6
        //   151: aload_0        
        //   152: iload           10
        //   154: ifne            198
        //   157: getfield        org/g.H:Lorg/d;
        //   160: ifnull          197
        //   163: goto            167
        //   166: athrow         
        //   167: iinc            6, 1
        //   170: iload_1        
        //   171: bipush          8
        //   173: aload_0        
        //   174: getfield        org/g.H:Lorg/d;
        //   177: getfield        org/d.b:I
        //   180: iadd           
        //   181: iadd           
        //   182: istore_1       
        //   183: aload_0        
        //   184: getstatic       org/g.P:[Ljava/lang/String;
        //   187: bipush          7
        //   189: aaload         
        //   190: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   193: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   196: pop            
        //   197: aload_0        
        //   198: getfield        org/g.t:I
        //   201: iload           10
        //   203: ifne            250
        //   206: ifeq            237
        //   209: goto            213
        //   212: athrow         
        //   213: iinc            6, 1
        //   216: iinc            1, 8
        //   219: aload_0        
        //   220: getstatic       org/g.P:[Ljava/lang/String;
        //   223: bipush          10
        //   225: aaload         
        //   226: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   229: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   232: pop            
        //   233: goto            237
        //   236: athrow         
        //   237: aload_0        
        //   238: iload           10
        //   240: ifne            277
        //   243: getfield        org/g.x:I
        //   246: goto            250
        //   249: athrow         
        //   250: ifeq            276
        //   253: iinc            6, 1
        //   256: iinc            1, 8
        //   259: aload_0        
        //   260: getstatic       org/g.P:[Ljava/lang/String;
        //   263: iconst_0       
        //   264: aaload         
        //   265: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   268: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   271: pop            
        //   272: goto            276
        //   275: athrow         
        //   276: aload_0        
        //   277: iload           10
        //   279: ifne            322
        //   282: getfield        org/g.y:Lorg/d;
        //   285: ifnull          321
        //   288: goto            292
        //   291: athrow         
        //   292: iinc            6, 1
        //   295: iload_1        
        //   296: aload_0        
        //   297: getfield        org/g.y:Lorg/d;
        //   300: getfield        org/d.b:I
        //   303: iconst_4       
        //   304: iadd           
        //   305: iadd           
        //   306: istore_1       
        //   307: aload_0        
        //   308: getstatic       org/g.P:[Ljava/lang/String;
        //   311: bipush          6
        //   313: aaload         
        //   314: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   317: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   320: pop            
        //   321: aload_0        
        //   322: getfield        org/g.z:I
        //   325: iload           10
        //   327: ifne            368
        //   330: ifeq            361
        //   333: goto            337
        //   336: athrow         
        //   337: iinc            6, 1
        //   340: iinc            1, 10
        //   343: aload_0        
        //   344: getstatic       org/g.P:[Ljava/lang/String;
        //   347: bipush          9
        //   349: aaload         
        //   350: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   353: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   356: pop            
        //   357: goto            361
        //   360: athrow         
        //   361: aload_0        
        //   362: getfield        org/g.q:I
        //   365: ldc             131072
        //   367: iand           
        //   368: iload           10
        //   370: ifne            420
        //   373: ifeq            403
        //   376: goto            380
        //   379: athrow         
        //   380: iinc            6, 1
        //   383: iinc            1, 6
        //   386: aload_0        
        //   387: getstatic       org/g.P:[Ljava/lang/String;
        //   390: iconst_2       
        //   391: aaload         
        //   392: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   395: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   398: pop            
        //   399: goto            403
        //   402: athrow         
        //   403: aload_0        
        //   404: iload           10
        //   406: ifne            495
        //   409: getfield        org/g.q:I
        //   412: sipush          4096
        //   415: iand           
        //   416: goto            420
        //   419: athrow         
        //   420: ifeq            494
        //   423: aload_0        
        //   424: getfield        org/g.f:I
        //   427: ldc             65535
        //   429: iand           
        //   430: iload           10
        //   432: ifne            493
        //   435: goto            439
        //   438: athrow         
        //   439: bipush          49
        //   441: if_icmplt       471
        //   444: goto            448
        //   447: athrow         
        //   448: aload_0        
        //   449: iload           10
        //   451: ifne            495
        //   454: goto            458
        //   457: athrow         
        //   458: getfield        org/g.q:I
        //   461: ldc             262144
        //   463: iand           
        //   464: ifeq            494
        //   467: goto            471
        //   470: athrow         
        //   471: iinc            6, 1
        //   474: iinc            1, 6
        //   477: aload_0        
        //   478: getstatic       org/g.P:[Ljava/lang/String;
        //   481: iconst_4       
        //   482: aaload         
        //   483: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   486: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   489: goto            493
        //   492: athrow         
        //   493: pop            
        //   494: aload_0        
        //   495: iload           10
        //   497: ifne            540
        //   500: getfield        org/g.F:Lorg/d;
        //   503: ifnull          539
        //   506: goto            510
        //   509: athrow         
        //   510: iinc            6, 1
        //   513: iload_1        
        //   514: bipush          8
        //   516: aload_0        
        //   517: getfield        org/g.F:Lorg/d;
        //   520: getfield        org/d.b:I
        //   523: iadd           
        //   524: iadd           
        //   525: istore_1       
        //   526: aload_0        
        //   527: getstatic       org/g.P:[Ljava/lang/String;
        //   530: iconst_3       
        //   531: aaload         
        //   532: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   535: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   538: pop            
        //   539: aload_0        
        //   540: getfield        org/g.B:Lorg/b;
        //   543: iload           10
        //   545: ifne            597
        //   548: ifnull          584
        //   551: goto            555
        //   554: athrow         
        //   555: iinc            6, 1
        //   558: iload_1        
        //   559: bipush          8
        //   561: aload_0        
        //   562: getfield        org/g.B:Lorg/b;
        //   565: invokevirtual   org/b.a:()I
        //   568: iadd           
        //   569: iadd           
        //   570: istore_1       
        //   571: aload_0        
        //   572: getstatic       org/g.P:[Ljava/lang/String;
        //   575: iconst_1       
        //   576: aaload         
        //   577: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   580: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   583: pop            
        //   584: aload_0        
        //   585: iload           10
        //   587: ifne            631
        //   590: getfield        org/g.C:Lorg/b;
        //   593: goto            597
        //   596: athrow         
        //   597: ifnull          630
        //   600: iinc            6, 1
        //   603: iload_1        
        //   604: bipush          8
        //   606: aload_0        
        //   607: getfield        org/g.C:Lorg/b;
        //   610: invokevirtual   org/b.a:()I
        //   613: iadd           
        //   614: iadd           
        //   615: istore_1       
        //   616: aload_0        
        //   617: getstatic       org/g.P:[Ljava/lang/String;
        //   620: bipush          8
        //   622: aaload         
        //   623: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //   626: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   629: pop            
        //   630: aload_0        
        //   631: getfield        org/g.D:Lorg/c;
        //   634: ifnull          664
        //   637: iload           6
        //   639: aload_0        
        //   640: getfield        org/g.D:Lorg/c;
        //   643: invokevirtual   org/c.c:()I
        //   646: iadd           
        //   647: istore          6
        //   649: iload_1        
        //   650: aload_0        
        //   651: getfield        org/g.D:Lorg/c;
        //   654: aload_0        
        //   655: aconst_null    
        //   656: iconst_0       
        //   657: iconst_m1      
        //   658: iconst_m1      
        //   659: invokevirtual   org/c.b:(Lorg/g;[BIII)I
        //   662: iadd           
        //   663: istore_1       
        //   664: iload_1        
        //   665: aload_0        
        //   666: getfield        org/g.h:Lorg/d;
        //   669: getfield        org/d.b:I
        //   672: iadd           
        //   673: istore_1       
        //   674: new             Lorg/d;
        //   677: dup            
        //   678: iload_1        
        //   679: invokespecial   org/d.<init>:(I)V
        //   682: astore          7
        //   684: aload           7
        //   686: ldc             -889275714
        //   688: invokevirtual   org/d.c:(I)Lorg/d;
        //   691: aload_0        
        //   692: getfield        org/g.f:I
        //   695: invokevirtual   org/d.c:(I)Lorg/d;
        //   698: pop            
        //   699: aload           7
        //   701: aload_0        
        //   702: getfield        org/g.g:I
        //   705: invokevirtual   org/d.b:(I)Lorg/d;
        //   708: aload_0        
        //   709: getfield        org/g.h:Lorg/d;
        //   712: getfield        org/d.a:[B
        //   715: iconst_0       
        //   716: aload_0        
        //   717: getfield        org/g.h:Lorg/d;
        //   720: getfield        org/d.b:I
        //   723: invokevirtual   org/d.a:([BII)Lorg/d;
        //   726: pop            
        //   727: ldc             393216
        //   729: aload_0        
        //   730: getfield        org/g.q:I
        //   733: ldc             262144
        //   735: iand           
        //   736: bipush          64
        //   738: idiv           
        //   739: ior            
        //   740: istore          8
        //   742: aload           7
        //   744: aload_0        
        //   745: getfield        org/g.q:I
        //   748: iload           8
        //   750: iconst_m1      
        //   751: ixor           
        //   752: iand           
        //   753: invokevirtual   org/d.b:(I)Lorg/d;
        //   756: aload_0        
        //   757: getfield        org/g.r:I
        //   760: invokevirtual   org/d.b:(I)Lorg/d;
        //   763: aload_0        
        //   764: getfield        org/g.u:I
        //   767: invokevirtual   org/d.b:(I)Lorg/d;
        //   770: pop            
        //   771: aload           7
        //   773: aload_0        
        //   774: getfield        org/g.v:I
        //   777: invokevirtual   org/d.b:(I)Lorg/d;
        //   780: pop            
        //   781: iconst_0       
        //   782: istore          9
        //   784: iload           9
        //   786: aload_0        
        //   787: getfield        org/g.v:I
        //   790: if_icmpge       823
        //   793: aload           7
        //   795: aload_0        
        //   796: getfield        org/g.w:[I
        //   799: iload           9
        //   801: iaload         
        //   802: invokevirtual   org/d.b:(I)Lorg/d;
        //   805: pop            
        //   806: iinc            9, 1
        //   809: iload           10
        //   811: ifne            830
        //   814: iload           10
        //   816: ifeq            784
        //   819: goto            823
        //   822: athrow         
        //   823: aload           7
        //   825: iload_2        
        //   826: invokevirtual   org/d.b:(I)Lorg/d;
        //   829: pop            
        //   830: aload_0        
        //   831: getfield        org/g.I:Lorg/j;
        //   834: astore_3       
        //   835: aload_3        
        //   836: ifnull          867
        //   839: aload_3        
        //   840: aload           7
        //   842: invokevirtual   org/j.a:(Lorg/d;)V
        //   845: aload_3        
        //   846: getfield        org/j.b:Lorg/i;
        //   849: checkcast       Lorg/j;
        //   852: astore_3       
        //   853: iload           10
        //   855: ifne            875
        //   858: iload           10
        //   860: ifeq            835
        //   863: goto            867
        //   866: athrow         
        //   867: aload           7
        //   869: iload           4
        //   871: invokevirtual   org/d.b:(I)Lorg/d;
        //   874: pop            
        //   875: aload_0        
        //   876: getfield        org/g.K:Lorg/q;
        //   879: astore          5
        //   881: aload           5
        //   883: ifnull          917
        //   886: aload           5
        //   888: aload           7
        //   890: invokevirtual   org/q.a:(Lorg/d;)V
        //   893: aload           5
        //   895: getfield        org/q.b:Lorg/p;
        //   898: checkcast       Lorg/q;
        //   901: astore          5
        //   903: iload           10
        //   905: ifne            925
        //   908: iload           10
        //   910: ifeq            881
        //   913: goto            917
        //   916: athrow         
        //   917: aload           7
        //   919: iload           6
        //   921: invokevirtual   org/d.b:(I)Lorg/d;
        //   924: pop            
        //   925: aload_0        
        //   926: iload           10
        //   928: ifne            1008
        //   931: getfield        org/g.H:Lorg/d;
        //   934: ifnull          1007
        //   937: goto            941
        //   940: athrow         
        //   941: aload           7
        //   943: aload_0        
        //   944: getstatic       org/g.P:[Ljava/lang/String;
        //   947: bipush          7
        //   949: aaload         
        //   950: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   953: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   956: invokevirtual   org/d.b:(I)Lorg/d;
        //   959: pop            
        //   960: aload           7
        //   962: aload_0        
        //   963: getfield        org/g.H:Lorg/d;
        //   966: getfield        org/d.b:I
        //   969: iconst_2       
        //   970: iadd           
        //   971: invokevirtual   org/d.c:(I)Lorg/d;
        //   974: aload_0        
        //   975: getfield        org/g.G:I
        //   978: invokevirtual   org/d.b:(I)Lorg/d;
        //   981: pop            
        //   982: aload           7
        //   984: aload_0        
        //   985: getfield        org/g.H:Lorg/d;
        //   988: getfield        org/d.a:[B
        //   991: iconst_0       
        //   992: aload_0        
        //   993: getfield        org/g.H:Lorg/d;
        //   996: getfield        org/d.b:I
        //   999: invokevirtual   org/d.a:([BII)Lorg/d;
        //  1002: pop            
        //  1003: goto            1007
        //  1006: athrow         
        //  1007: aload_0        
        //  1008: getfield        org/g.t:I
        //  1011: iload           10
        //  1013: ifne            1070
        //  1016: ifeq            1057
        //  1019: goto            1023
        //  1022: athrow         
        //  1023: aload           7
        //  1025: aload_0        
        //  1026: getstatic       org/g.P:[Ljava/lang/String;
        //  1029: bipush          10
        //  1031: aaload         
        //  1032: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1035: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1038: invokevirtual   org/d.b:(I)Lorg/d;
        //  1041: iconst_2       
        //  1042: invokevirtual   org/d.c:(I)Lorg/d;
        //  1045: aload_0        
        //  1046: getfield        org/g.t:I
        //  1049: invokevirtual   org/d.b:(I)Lorg/d;
        //  1052: pop            
        //  1053: goto            1057
        //  1056: athrow         
        //  1057: aload_0        
        //  1058: iload           10
        //  1060: ifne            1107
        //  1063: getfield        org/g.x:I
        //  1066: goto            1070
        //  1069: athrow         
        //  1070: ifeq            1106
        //  1073: aload           7
        //  1075: aload_0        
        //  1076: getstatic       org/g.P:[Ljava/lang/String;
        //  1079: iconst_0       
        //  1080: aaload         
        //  1081: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1084: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1087: invokevirtual   org/d.b:(I)Lorg/d;
        //  1090: iconst_2       
        //  1091: invokevirtual   org/d.c:(I)Lorg/d;
        //  1094: aload_0        
        //  1095: getfield        org/g.x:I
        //  1098: invokevirtual   org/d.b:(I)Lorg/d;
        //  1101: pop            
        //  1102: goto            1106
        //  1105: athrow         
        //  1106: aload_0        
        //  1107: iload           10
        //  1109: ifne            1174
        //  1112: getfield        org/g.y:Lorg/d;
        //  1115: ifnull          1173
        //  1118: goto            1122
        //  1121: athrow         
        //  1122: aload_0        
        //  1123: getfield        org/g.y:Lorg/d;
        //  1126: getfield        org/d.b:I
        //  1129: iconst_2       
        //  1130: isub           
        //  1131: istore          9
        //  1133: aload           7
        //  1135: aload_0        
        //  1136: getstatic       org/g.P:[Ljava/lang/String;
        //  1139: bipush          6
        //  1141: aaload         
        //  1142: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1145: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1148: invokevirtual   org/d.b:(I)Lorg/d;
        //  1151: iload           9
        //  1153: invokevirtual   org/d.c:(I)Lorg/d;
        //  1156: pop            
        //  1157: aload           7
        //  1159: aload_0        
        //  1160: getfield        org/g.y:Lorg/d;
        //  1163: getfield        org/d.a:[B
        //  1166: iconst_2       
        //  1167: iload           9
        //  1169: invokevirtual   org/d.a:([BII)Lorg/d;
        //  1172: pop            
        //  1173: aload_0        
        //  1174: getfield        org/g.z:I
        //  1177: iload           10
        //  1179: ifne            1240
        //  1182: ifeq            1233
        //  1185: goto            1189
        //  1188: athrow         
        //  1189: aload           7
        //  1191: aload_0        
        //  1192: getstatic       org/g.P:[Ljava/lang/String;
        //  1195: bipush          9
        //  1197: aaload         
        //  1198: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1201: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1204: invokevirtual   org/d.b:(I)Lorg/d;
        //  1207: iconst_4       
        //  1208: invokevirtual   org/d.c:(I)Lorg/d;
        //  1211: pop            
        //  1212: aload           7
        //  1214: aload_0        
        //  1215: getfield        org/g.z:I
        //  1218: invokevirtual   org/d.b:(I)Lorg/d;
        //  1221: aload_0        
        //  1222: getfield        org/g.A:I
        //  1225: invokevirtual   org/d.b:(I)Lorg/d;
        //  1228: pop            
        //  1229: goto            1233
        //  1232: athrow         
        //  1233: aload_0        
        //  1234: getfield        org/g.q:I
        //  1237: ldc             131072
        //  1239: iand           
        //  1240: iload           10
        //  1242: ifne            1295
        //  1245: ifeq            1278
        //  1248: goto            1252
        //  1251: athrow         
        //  1252: aload           7
        //  1254: aload_0        
        //  1255: getstatic       org/g.P:[Ljava/lang/String;
        //  1258: iconst_2       
        //  1259: aaload         
        //  1260: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1263: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1266: invokevirtual   org/d.b:(I)Lorg/d;
        //  1269: iconst_0       
        //  1270: invokevirtual   org/d.c:(I)Lorg/d;
        //  1273: pop            
        //  1274: goto            1278
        //  1277: athrow         
        //  1278: aload_0        
        //  1279: iload           10
        //  1281: ifne            1373
        //  1284: getfield        org/g.q:I
        //  1287: sipush          4096
        //  1290: iand           
        //  1291: goto            1295
        //  1294: athrow         
        //  1295: ifeq            1372
        //  1298: aload_0        
        //  1299: getfield        org/g.f:I
        //  1302: ldc             65535
        //  1304: iand           
        //  1305: bipush          49
        //  1307: iload           10
        //  1309: ifne            1342
        //  1312: goto            1316
        //  1315: athrow         
        //  1316: if_icmplt       1346
        //  1319: goto            1323
        //  1322: athrow         
        //  1323: aload_0        
        //  1324: iload           10
        //  1326: ifne            1373
        //  1329: goto            1333
        //  1332: athrow         
        //  1333: getfield        org/g.q:I
        //  1336: ldc             262144
        //  1338: goto            1342
        //  1341: athrow         
        //  1342: iand           
        //  1343: ifeq            1372
        //  1346: aload           7
        //  1348: aload_0        
        //  1349: getstatic       org/g.P:[Ljava/lang/String;
        //  1352: iconst_4       
        //  1353: aaload         
        //  1354: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1357: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1360: invokevirtual   org/d.b:(I)Lorg/d;
        //  1363: iconst_0       
        //  1364: invokevirtual   org/d.c:(I)Lorg/d;
        //  1367: pop            
        //  1368: goto            1372
        //  1371: athrow         
        //  1372: aload_0        
        //  1373: iload           10
        //  1375: ifne            1454
        //  1378: getfield        org/g.F:Lorg/d;
        //  1381: ifnull          1453
        //  1384: goto            1388
        //  1387: athrow         
        //  1388: aload           7
        //  1390: aload_0        
        //  1391: getstatic       org/g.P:[Ljava/lang/String;
        //  1394: iconst_3       
        //  1395: aaload         
        //  1396: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1399: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1402: invokevirtual   org/d.b:(I)Lorg/d;
        //  1405: pop            
        //  1406: aload           7
        //  1408: aload_0        
        //  1409: getfield        org/g.F:Lorg/d;
        //  1412: getfield        org/d.b:I
        //  1415: iconst_2       
        //  1416: iadd           
        //  1417: invokevirtual   org/d.c:(I)Lorg/d;
        //  1420: aload_0        
        //  1421: getfield        org/g.E:I
        //  1424: invokevirtual   org/d.b:(I)Lorg/d;
        //  1427: pop            
        //  1428: aload           7
        //  1430: aload_0        
        //  1431: getfield        org/g.F:Lorg/d;
        //  1434: getfield        org/d.a:[B
        //  1437: iconst_0       
        //  1438: aload_0        
        //  1439: getfield        org/g.F:Lorg/d;
        //  1442: getfield        org/d.b:I
        //  1445: invokevirtual   org/d.a:([BII)Lorg/d;
        //  1448: pop            
        //  1449: goto            1453
        //  1452: athrow         
        //  1453: aload_0        
        //  1454: getfield        org/g.B:Lorg/b;
        //  1457: iload           10
        //  1459: ifne            1513
        //  1462: ifnull          1500
        //  1465: goto            1469
        //  1468: athrow         
        //  1469: aload           7
        //  1471: aload_0        
        //  1472: getstatic       org/g.P:[Ljava/lang/String;
        //  1475: iconst_1       
        //  1476: aaload         
        //  1477: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1480: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1483: invokevirtual   org/d.b:(I)Lorg/d;
        //  1486: pop            
        //  1487: aload_0        
        //  1488: getfield        org/g.B:Lorg/b;
        //  1491: aload           7
        //  1493: invokevirtual   org/b.a:(Lorg/d;)V
        //  1496: goto            1500
        //  1499: athrow         
        //  1500: aload_0        
        //  1501: iload           10
        //  1503: ifne            1549
        //  1506: getfield        org/g.C:Lorg/b;
        //  1509: goto            1513
        //  1512: athrow         
        //  1513: ifnull          1548
        //  1516: aload           7
        //  1518: aload_0        
        //  1519: getstatic       org/g.P:[Ljava/lang/String;
        //  1522: bipush          8
        //  1524: aaload         
        //  1525: invokestatic    org/powerbot/game/api/util/SkillData.e:(Ljava/lang/String;)Ljava/lang/String;
        //  1528: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //  1531: invokevirtual   org/d.b:(I)Lorg/d;
        //  1534: pop            
        //  1535: aload_0        
        //  1536: getfield        org/g.C:Lorg/b;
        //  1539: aload           7
        //  1541: invokevirtual   org/b.a:(Lorg/d;)V
        //  1544: goto            1548
        //  1547: athrow         
        //  1548: aload_0        
        //  1549: iload           10
        //  1551: ifne            1583
        //  1554: getfield        org/g.D:Lorg/c;
        //  1557: ifnull          1582
        //  1560: goto            1564
        //  1563: athrow         
        //  1564: aload_0        
        //  1565: getfield        org/g.D:Lorg/c;
        //  1568: aload_0        
        //  1569: aconst_null    
        //  1570: iconst_0       
        //  1571: iconst_m1      
        //  1572: iconst_m1      
        //  1573: aload           7
        //  1575: invokevirtual   org/c.a:(Lorg/g;[BIIILorg/d;)V
        //  1578: goto            1582
        //  1581: athrow         
        //  1582: aload_0        
        //  1583: iload           10
        //  1585: ifne            1610
        //  1588: getfield        org/g.O:Z
        //  1591: ifeq            1636
        //  1594: goto            1598
        //  1597: athrow         
        //  1598: new             Lorg/g;
        //  1601: dup            
        //  1602: iconst_2       
        //  1603: invokespecial   org/g.<init>:(I)V
        //  1606: goto            1610
        //  1609: athrow         
        //  1610: astore          9
        //  1612: new             Lorg/e;
        //  1615: dup            
        //  1616: aload           7
        //  1618: getfield        org/d.a:[B
        //  1621: invokespecial   org/e.<init>:([B)V
        //  1624: aload           9
        //  1626: iconst_4       
        //  1627: invokevirtual   org/e.a:(Lorg/f;I)V
        //  1630: aload           9
        //  1632: invokevirtual   org/g.a:()[B
        //  1635: areturn        
        //  1636: aload           7
        //  1638: getfield        org/d.a:[B
        //  1641: areturn        
        //    StackMapTable: 00 8C FF 00 17 00 0B 07 00 4D 00 00 00 00 00 00 00 00 00 01 00 01 07 00 32 00 4F 07 00 32 00 FF 00 07 00 0B 07 00 4D 00 00 00 00 00 00 00 00 00 01 00 02 01 01 FF 00 08 00 0B 07 00 4D 01 01 07 00 2E 00 00 00 00 00 00 01 00 00 2C 40 01 FF 00 07 00 0B 07 00 4D 01 01 07 00 2E 01 07 00 30 00 00 00 00 01 00 00 23 40 01 FF 00 10 00 0B 07 00 4D 01 01 07 00 2E 01 07 00 30 01 00 00 00 01 00 01 07 00 32 00 1D 40 07 00 4D 4D 07 00 32 00 56 07 00 32 00 4B 07 00 32 40 01 58 07 00 32 00 40 07 00 4D 4D 07 00 32 00 1C 40 07 00 4D 4D 07 00 32 00 56 07 00 32 00 46 01 4A 07 00 32 00 55 07 00 32 00 4F 07 00 32 40 01 51 07 00 32 40 01 47 07 00 32 00 48 07 00 32 40 07 00 4D 4B 07 00 32 00 54 07 00 32 40 01 00 40 07 00 4D 4D 07 00 32 00 1C 40 07 00 4D 4D 07 00 32 00 1C 4B 07 00 32 40 07 00 25 20 40 07 00 4D 20 FF 00 77 00 0B 07 00 4D 01 01 07 00 2E 01 07 00 30 01 07 00 04 01 01 01 00 00 65 07 00 32 00 06 04 5E 07 00 32 00 07 05 62 07 00 32 00 07 4E 07 00 32 00 F7 00 40 07 00 32 00 40 07 00 4D 4D 07 00 32 00 60 07 00 32 00 4B 07 00 32 40 01 62 07 00 32 00 40 07 00 4D 4D 07 00 32 00 32 40 07 00 4D 4D 07 00 32 00 6A 07 00 32 00 46 01 4A 07 00 32 00 58 07 00 32 00 4F 07 00 32 40 01 53 07 00 32 FF 00 00 00 0B 07 00 4D 01 01 07 00 2E 01 07 00 30 01 07 00 04 01 01 01 00 02 01 01 45 07 00 32 00 48 07 00 32 40 07 00 4D 47 07 00 32 FF 00 00 00 0B 07 00 4D 01 01 07 00 2E 01 07 00 30 01 07 00 04 01 01 01 00 02 01 01 03 58 07 00 32 00 40 07 00 4D 4D 07 00 32 00 7F 07 00 32 00 40 07 00 4D 4D 07 00 32 00 5D 07 00 32 00 4B 07 00 32 40 07 00 25 61 07 00 32 00 40 07 00 4D 4D 07 00 32 00 50 07 00 32 00 40 07 00 4D 4D 07 00 32 00 4A 07 00 32 40 07 00 4D 19
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  1588   1606   1609   1610   Ljava/lang/RuntimeException;
        //  1583   1594   1597   1598   Ljava/lang/RuntimeException;
        //  1554   1578   1581   1582   Ljava/lang/RuntimeException;
        //  1549   1560   1563   1564   Ljava/lang/RuntimeException;
        //  1513   1544   1547   1548   Ljava/lang/RuntimeException;
        //  1500   1509   1512   1513   Ljava/lang/RuntimeException;
        //  1462   1496   1499   1500   Ljava/lang/RuntimeException;
        //  1454   1465   1468   1469   Ljava/lang/RuntimeException;
        //  1378   1449   1452   1453   Ljava/lang/RuntimeException;
        //  1373   1384   1387   1388   Ljava/lang/RuntimeException;
        //  1342   1368   1371   1372   Ljava/lang/RuntimeException;
        //  1323   1338   1341   1342   Ljava/lang/RuntimeException;
        //  1316   1329   1332   1333   Ljava/lang/RuntimeException;
        //  1298   1319   1322   1323   Ljava/lang/RuntimeException;
        //  1295   1312   1315   1316   Ljava/lang/RuntimeException;
        //  1278   1291   1294   1295   Ljava/lang/RuntimeException;
        //  1245   1274   1277   1278   Ljava/lang/RuntimeException;
        //  1240   1248   1251   1252   Ljava/lang/RuntimeException;
        //  1182   1229   1232   1233   Ljava/lang/RuntimeException;
        //  1174   1185   1188   1189   Ljava/lang/RuntimeException;
        //  1107   1118   1121   1122   Ljava/lang/RuntimeException;
        //  1070   1102   1105   1106   Ljava/lang/RuntimeException;
        //  1057   1066   1069   1070   Ljava/lang/RuntimeException;
        //  1016   1053   1056   1057   Ljava/lang/RuntimeException;
        //  1008   1019   1022   1023   Ljava/lang/RuntimeException;
        //  931    1003   1006   1007   Ljava/lang/RuntimeException;
        //  925    937    940    941    Ljava/lang/RuntimeException;
        //  903    913    916    917    Ljava/lang/RuntimeException;
        //  853    863    866    867    Ljava/lang/RuntimeException;
        //  793    819    822    823    Ljava/lang/RuntimeException;
        //  584    593    596    597    Ljava/lang/RuntimeException;
        //  540    551    554    555    Ljava/lang/RuntimeException;
        //  495    506    509    510    Ljava/lang/RuntimeException;
        //  458    489    492    493    Ljava/lang/RuntimeException;
        //  448    467    470    471    Ljava/lang/RuntimeException;
        //  439    454    457    458    Ljava/lang/RuntimeException;
        //  423    444    447    448    Ljava/lang/RuntimeException;
        //  420    435    438    439    Ljava/lang/RuntimeException;
        //  403    416    419    420    Ljava/lang/RuntimeException;
        //  373    399    402    403    Ljava/lang/RuntimeException;
        //  368    376    379    380    Ljava/lang/RuntimeException;
        //  330    357    360    361    Ljava/lang/RuntimeException;
        //  322    333    336    337    Ljava/lang/RuntimeException;
        //  277    288    291    292    Ljava/lang/RuntimeException;
        //  250    272    275    276    Ljava/lang/RuntimeException;
        //  237    246    249    250    Ljava/lang/RuntimeException;
        //  206    233    236    237    Ljava/lang/RuntimeException;
        //  198    209    212    213    Ljava/lang/RuntimeException;
        //  151    163    166    167    Ljava/lang/RuntimeException;
        //  17     40     40     41     Ljava/lang/RuntimeException;
        //  5      20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0439:
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
    
    n a(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_1        
        //     6: instanceof      Ljava/lang/Integer;
        //     9: iload           4
        //    11: ifne            39
        //    14: ifeq            35
        //    17: goto            21
        //    20: athrow         
        //    21: aload_1        
        //    22: checkcast       Ljava/lang/Integer;
        //    25: invokevirtual   java/lang/Integer.intValue:()I
        //    28: istore_2       
        //    29: aload_0        
        //    30: iload_2        
        //    31: invokevirtual   org/g.a:(I)Lorg/n;
        //    34: areturn        
        //    35: aload_1        
        //    36: instanceof      Ljava/lang/Byte;
        //    39: iload           4
        //    41: ifne            69
        //    44: ifeq            65
        //    47: goto            51
        //    50: athrow         
        //    51: aload_1        
        //    52: checkcast       Ljava/lang/Byte;
        //    55: invokevirtual   java/lang/Byte.intValue:()I
        //    58: istore_2       
        //    59: aload_0        
        //    60: iload_2        
        //    61: invokevirtual   org/g.a:(I)Lorg/n;
        //    64: areturn        
        //    65: aload_1        
        //    66: instanceof      Ljava/lang/Character;
        //    69: iload           4
        //    71: ifne            99
        //    74: ifeq            95
        //    77: goto            81
        //    80: athrow         
        //    81: aload_1        
        //    82: checkcast       Ljava/lang/Character;
        //    85: invokevirtual   java/lang/Character.charValue:()C
        //    88: istore_2       
        //    89: aload_0        
        //    90: iload_2        
        //    91: invokevirtual   org/g.a:(I)Lorg/n;
        //    94: areturn        
        //    95: aload_1        
        //    96: instanceof      Ljava/lang/Short;
        //    99: iload           4
        //   101: ifne            129
        //   104: ifeq            125
        //   107: goto            111
        //   110: athrow         
        //   111: aload_1        
        //   112: checkcast       Ljava/lang/Short;
        //   115: invokevirtual   java/lang/Short.intValue:()I
        //   118: istore_2       
        //   119: aload_0        
        //   120: iload_2        
        //   121: invokevirtual   org/g.a:(I)Lorg/n;
        //   124: areturn        
        //   125: aload_1        
        //   126: instanceof      Ljava/lang/Boolean;
        //   129: iload           4
        //   131: ifne            180
        //   134: ifeq            176
        //   137: goto            141
        //   140: athrow         
        //   141: aload_1        
        //   142: checkcast       Ljava/lang/Boolean;
        //   145: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   148: iload           4
        //   150: ifne            165
        //   153: goto            157
        //   156: athrow         
        //   157: ifeq            168
        //   160: goto            164
        //   163: athrow         
        //   164: iconst_1       
        //   165: goto            169
        //   168: iconst_0       
        //   169: istore_2       
        //   170: aload_0        
        //   171: iload_2        
        //   172: invokevirtual   org/g.a:(I)Lorg/n;
        //   175: areturn        
        //   176: aload_1        
        //   177: instanceof      Ljava/lang/Float;
        //   180: iload           4
        //   182: ifne            210
        //   185: ifeq            206
        //   188: goto            192
        //   191: athrow         
        //   192: aload_1        
        //   193: checkcast       Ljava/lang/Float;
        //   196: invokevirtual   java/lang/Float.floatValue:()F
        //   199: fstore_2       
        //   200: aload_0        
        //   201: fload_2        
        //   202: invokevirtual   org/g.a:(F)Lorg/n;
        //   205: areturn        
        //   206: aload_1        
        //   207: instanceof      Ljava/lang/Long;
        //   210: iload           4
        //   212: ifne            240
        //   215: ifeq            236
        //   218: goto            222
        //   221: athrow         
        //   222: aload_1        
        //   223: checkcast       Ljava/lang/Long;
        //   226: invokevirtual   java/lang/Long.longValue:()J
        //   229: lstore_2       
        //   230: aload_0        
        //   231: lload_2        
        //   232: invokevirtual   org/g.a:(J)Lorg/n;
        //   235: areturn        
        //   236: aload_1        
        //   237: instanceof      Ljava/lang/Double;
        //   240: iload           4
        //   242: ifne            270
        //   245: ifeq            266
        //   248: goto            252
        //   251: athrow         
        //   252: aload_1        
        //   253: checkcast       Ljava/lang/Double;
        //   256: invokevirtual   java/lang/Double.doubleValue:()D
        //   259: dstore_2       
        //   260: aload_0        
        //   261: dload_2        
        //   262: invokevirtual   org/g.a:(D)Lorg/n;
        //   265: areturn        
        //   266: aload_1        
        //   267: instanceof      Ljava/lang/String;
        //   270: iload           4
        //   272: ifne            296
        //   275: ifeq            292
        //   278: goto            282
        //   281: athrow         
        //   282: aload_0        
        //   283: aload_1        
        //   284: checkcast       Ljava/lang/String;
        //   287: invokespecial   org/g.e:(Ljava/lang/String;)Lorg/n;
        //   290: areturn        
        //   291: athrow         
        //   292: aload_1        
        //   293: instanceof      Lorg/u;
        //   296: iload           4
        //   298: ifne            381
        //   301: ifeq            368
        //   304: goto            308
        //   307: athrow         
        //   308: aload_1        
        //   309: checkcast       Lorg/u;
        //   312: astore_2       
        //   313: aload_2        
        //   314: invokevirtual   org/u.a:()I
        //   317: istore_3       
        //   318: iload_3        
        //   319: bipush          9
        //   321: iload           4
        //   323: ifne            346
        //   326: if_icmpne       343
        //   329: goto            333
        //   332: athrow         
        //   333: aload_0        
        //   334: aload_2        
        //   335: invokevirtual   org/u.c:()Ljava/lang/String;
        //   338: invokevirtual   org/g.b:(Ljava/lang/String;)Lorg/n;
        //   341: areturn        
        //   342: athrow         
        //   343: iload_3        
        //   344: bipush          10
        //   346: if_icmpne       359
        //   349: aload_0        
        //   350: aload_2        
        //   351: invokevirtual   org/u.b:()Ljava/lang/String;
        //   354: invokevirtual   org/g.b:(Ljava/lang/String;)Lorg/n;
        //   357: areturn        
        //   358: athrow         
        //   359: aload_0        
        //   360: aload_2        
        //   361: invokevirtual   org/u.c:()Ljava/lang/String;
        //   364: invokevirtual   org/g.d:(Ljava/lang/String;)Lorg/n;
        //   367: areturn        
        //   368: aload_1        
        //   369: iload           4
        //   371: ifne            385
        //   374: instanceof      Lorg/l;
        //   377: goto            381
        //   380: athrow         
        //   381: ifeq            410
        //   384: aload_1        
        //   385: checkcast       Lorg/l;
        //   388: astore_2       
        //   389: aload_0        
        //   390: aload_2        
        //   391: getfield        org/l.a:I
        //   394: aload_2        
        //   395: getfield        org/l.b:Ljava/lang/String;
        //   398: aload_2        
        //   399: getfield        org/l.c:Ljava/lang/String;
        //   402: aload_2        
        //   403: getfield        org/l.d:Ljava/lang/String;
        //   406: invokevirtual   org/g.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lorg/n;
        //   409: areturn        
        //   410: new             Ljava/lang/IllegalArgumentException;
        //   413: dup            
        //   414: new             Ljava/lang/StringBuilder;
        //   417: dup            
        //   418: invokespecial   java/lang/StringBuilder.<init>:()V
        //   421: getstatic       org/g.P:[Ljava/lang/String;
        //   424: bipush          11
        //   426: aaload         
        //   427: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   430: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   433: aload_1        
        //   434: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   437: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   440: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   443: athrow         
        //    StackMapTable: 00 3A FF 00 14 00 05 07 00 4D 07 01 81 00 00 01 00 01 07 00 32 00 0D 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 4E 07 00 32 40 01 45 07 00 32 00 40 01 02 40 01 06 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 0D 43 01 4A 07 00 32 00 48 07 00 32 00 43 01 4A 07 00 32 00 FF 00 17 00 05 07 00 4D 07 01 81 07 00 68 01 01 00 01 07 00 32 00 48 07 00 32 00 FF 00 02 00 05 07 00 4D 07 01 81 07 00 68 01 01 00 02 01 01 4B 07 00 32 00 FF 00 08 00 05 07 00 4D 07 01 81 00 00 01 00 00 4B 07 00 32 40 01 43 07 01 81 18
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  368    377    380    381    Ljava/lang/RuntimeException;
        //  346    358    358    359    Ljava/lang/RuntimeException;
        //  326    342    342    343    Ljava/lang/RuntimeException;
        //  318    329    332    333    Ljava/lang/RuntimeException;
        //  296    304    307    308    Ljava/lang/RuntimeException;
        //  275    291    291    292    Ljava/lang/RuntimeException;
        //  270    278    281    282    Ljava/lang/RuntimeException;
        //  240    248    251    252    Ljava/lang/RuntimeException;
        //  210    218    221    222    Ljava/lang/RuntimeException;
        //  180    188    191    192    Ljava/lang/RuntimeException;
        //  141    160    163    164    Ljava/lang/RuntimeException;
        //  134    153    156    157    Ljava/lang/RuntimeException;
        //  129    137    140    141    Ljava/lang/RuntimeException;
        //  99     107    110    111    Ljava/lang/RuntimeException;
        //  69     77     80     81     Ljava/lang/RuntimeException;
        //  39     47     50     51     Ljava/lang/RuntimeException;
        //  5      17     20     21     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0141:
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
    
    public int b(final Object o) {
        return this.a(o).a;
    }
    
    public int a(final String s) {
        this.k.a(1, s, null, null);
        n b = this.b(this.k);
        n n = null;
        Label_0075: {
            try {
                n = b;
                if (org.f.c) {
                    return n.a;
                }
                if (n != null) {
                    break Label_0075;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.a(1).a(s);
            b = new n(this.g++, this.k);
            this.c(b);
        }
        return n.a;
    }
    
    n b(final String s) {
        this.l.a(7, s, null, null);
        n b = this.b(this.l);
        n n = null;
        Label_0078: {
            try {
                n = b;
                if (org.f.c) {
                    return n;
                }
                if (n != null) {
                    break Label_0078;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.b(7, this.a(s));
            b = new n(this.g++, this.l);
            this.c(b);
        }
        return n;
    }
    
    public int c(final String s) {
        return this.b(s).a;
    }
    
    n d(final String s) {
        this.l.a(16, s, null, null);
        n b = this.b(this.l);
        n n = null;
        Label_0078: {
            try {
                n = b;
                if (org.f.c) {
                    return n;
                }
                if (n != null) {
                    break Label_0078;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.b(16, this.a(s));
            b = new n(this.g++, this.l);
            this.c(b);
        }
        return n;
    }
    
    n a(final int p0, final String p1, final String p2, final String p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_0        
        //     6: getfield        org/g.n:Lorg/n;
        //     9: bipush          20
        //    11: iload_1        
        //    12: iadd           
        //    13: aload_2        
        //    14: aload_3        
        //    15: aload           4
        //    17: invokevirtual   org/n.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //    20: aload_0        
        //    21: aload_0        
        //    22: getfield        org/g.n:Lorg/n;
        //    25: invokespecial   org/g.b:(Lorg/n;)Lorg/n;
        //    28: astore          5
        //    30: aload           5
        //    32: iload           6
        //    34: ifne            152
        //    37: ifnonnull       150
        //    40: goto            44
        //    43: athrow         
        //    44: iload_1        
        //    45: iconst_4       
        //    46: if_icmpgt       77
        //    49: goto            53
        //    52: athrow         
        //    53: aload_0        
        //    54: bipush          15
        //    56: iload_1        
        //    57: aload_0        
        //    58: aload_2        
        //    59: aload_3        
        //    60: aload           4
        //    62: invokevirtual   org/g.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //    65: invokespecial   org/g.b:(III)V
        //    68: iload           6
        //    70: ifeq            120
        //    73: goto            77
        //    76: athrow         
        //    77: aload_0        
        //    78: bipush          15
        //    80: iload_1        
        //    81: aload_0        
        //    82: aload_2        
        //    83: aload_3        
        //    84: aload           4
        //    86: iload_1        
        //    87: iload           6
        //    89: ifne            110
        //    92: goto            96
        //    95: athrow         
        //    96: bipush          9
        //    98: if_icmpne       113
        //   101: goto            105
        //   104: athrow         
        //   105: iconst_1       
        //   106: goto            110
        //   109: athrow         
        //   110: goto            114
        //   113: iconst_0       
        //   114: invokevirtual   org/g.b:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)I
        //   117: invokespecial   org/g.b:(III)V
        //   120: new             Lorg/n;
        //   123: dup            
        //   124: aload_0        
        //   125: dup            
        //   126: getfield        org/g.g:I
        //   129: dup_x1         
        //   130: iconst_1       
        //   131: iadd           
        //   132: putfield        org/g.g:I
        //   135: aload_0        
        //   136: getfield        org/g.n:Lorg/n;
        //   139: invokespecial   org/n.<init>:(ILorg/n;)V
        //   142: astore          5
        //   144: aload_0        
        //   145: aload           5
        //   147: invokespecial   org/g.c:(Lorg/n;)V
        //   150: aload           5
        //   152: areturn        
        //    StackMapTable: 00 11 FF 00 2B 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 01 07 00 32 00 47 07 00 32 00 56 07 00 32 00 51 07 00 32 FF 00 00 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 08 07 00 4D 01 01 07 00 4D 07 00 66 07 00 66 07 00 66 01 47 07 00 32 FF 00 00 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 07 07 00 4D 01 01 07 00 4D 07 00 66 07 00 66 07 00 66 43 07 00 32 FF 00 00 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 08 07 00 4D 01 01 07 00 4D 07 00 66 07 00 66 07 00 66 01 FF 00 02 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 07 07 00 4D 01 01 07 00 4D 07 00 66 07 00 66 07 00 66 FF 00 00 00 07 07 00 4D 01 07 00 66 07 00 66 07 00 66 07 00 07 01 00 08 07 00 4D 01 01 07 00 4D 07 00 66 07 00 66 07 00 66 01 05 1D 41 07 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  96     106    109    110    Ljava/lang/RuntimeException;
        //  77     101    104    105    Ljava/lang/RuntimeException;
        //  53     92     95     96     Ljava/lang/RuntimeException;
        //  44     73     76     77     Ljava/lang/RuntimeException;
        //  37     49     52     53     Ljava/lang/RuntimeException;
        //  30     40     43     44     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public int b(final int n, final String s, final String s2, final String s3) {
        return this.a(n, s, s2, s3).a;
    }
    
    n a(final String p0, final String p1, final l p2, final Object... p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          14
        //     5: aload_0        
        //     6: getfield        org/g.H:Lorg/d;
        //     9: astore          5
        //    11: aload           5
        //    13: iload           14
        //    15: ifne            41
        //    18: ifnonnull       39
        //    21: goto            25
        //    24: athrow         
        //    25: aload_0        
        //    26: new             Lorg/d;
        //    29: dup            
        //    30: invokespecial   org/d.<init>:()V
        //    33: dup_x1         
        //    34: putfield        org/g.H:Lorg/d;
        //    37: astore          5
        //    39: aload           5
        //    41: getfield        org/d.b:I
        //    44: istore          6
        //    46: aload_3        
        //    47: invokevirtual   org/l.hashCode:()I
        //    50: istore          7
        //    52: aload           5
        //    54: aload_0        
        //    55: aload_3        
        //    56: getfield        org/l.a:I
        //    59: aload_3        
        //    60: getfield        org/l.b:Ljava/lang/String;
        //    63: aload_3        
        //    64: getfield        org/l.c:Ljava/lang/String;
        //    67: aload_3        
        //    68: getfield        org/l.d:Ljava/lang/String;
        //    71: invokevirtual   org/g.b:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
        //    74: invokevirtual   org/d.b:(I)Lorg/d;
        //    77: pop            
        //    78: aload           4
        //    80: arraylength    
        //    81: istore          8
        //    83: aload           5
        //    85: iload           8
        //    87: invokevirtual   org/d.b:(I)Lorg/d;
        //    90: pop            
        //    91: iconst_0       
        //    92: istore          9
        //    94: iload           9
        //    96: iload           8
        //    98: if_icmpge       147
        //   101: aload           4
        //   103: iload           9
        //   105: aaload         
        //   106: astore          10
        //   108: iload           7
        //   110: aload           10
        //   112: invokevirtual   java/lang/Object.hashCode:()I
        //   115: ixor           
        //   116: istore          7
        //   118: aload           5
        //   120: aload_0        
        //   121: aload           10
        //   123: invokevirtual   org/g.b:(Ljava/lang/Object;)I
        //   126: invokevirtual   org/d.b:(I)Lorg/d;
        //   129: iload           14
        //   131: ifne            149
        //   134: pop            
        //   135: iinc            9, 1
        //   138: iload           14
        //   140: ifeq            94
        //   143: goto            147
        //   146: athrow         
        //   147: aload           5
        //   149: getfield        org/d.a:[B
        //   152: astore          9
        //   154: iconst_2       
        //   155: iload           8
        //   157: iadd           
        //   158: iconst_1       
        //   159: ishl           
        //   160: istore          10
        //   162: iload           7
        //   164: ldc             2147483647
        //   166: iand           
        //   167: istore          7
        //   169: aload_0        
        //   170: getfield        org/g.i:[Lorg/n;
        //   173: iload           7
        //   175: aload_0        
        //   176: getfield        org/g.i:[Lorg/n;
        //   179: arraylength    
        //   180: irem           
        //   181: aaload         
        //   182: astore          11
        //   184: aload           11
        //   186: ifnull          324
        //   189: aload           11
        //   191: iload           14
        //   193: ifne            249
        //   196: getfield        org/n.b:I
        //   199: iload           14
        //   201: ifne            372
        //   204: goto            208
        //   207: athrow         
        //   208: bipush          33
        //   210: if_icmpne       240
        //   213: goto            217
        //   216: athrow         
        //   217: aload           11
        //   219: getfield        org/n.h:I
        //   222: iload           14
        //   224: ifne            261
        //   227: goto            231
        //   230: athrow         
        //   231: iload           7
        //   233: if_icmpeq       256
        //   236: goto            240
        //   239: athrow         
        //   240: aload           11
        //   242: getfield        org/n.i:Lorg/n;
        //   245: goto            249
        //   248: athrow         
        //   249: astore          11
        //   251: iload           14
        //   253: ifeq            184
        //   256: aload           11
        //   258: getfield        org/n.c:I
        //   261: istore          12
        //   263: iconst_0       
        //   264: istore          13
        //   266: iload           13
        //   268: iload           10
        //   270: if_icmpge       321
        //   273: aload           9
        //   275: iload           6
        //   277: iload           13
        //   279: iadd           
        //   280: baload         
        //   281: iload           14
        //   283: ifne            372
        //   286: aload           9
        //   288: iload           12
        //   290: iload           13
        //   292: iadd           
        //   293: baload         
        //   294: if_icmpeq       313
        //   297: goto            301
        //   300: athrow         
        //   301: aload           11
        //   303: getfield        org/n.i:Lorg/n;
        //   306: astore          11
        //   308: iload           14
        //   310: ifeq            184
        //   313: iinc            13, 1
        //   316: iload           14
        //   318: ifeq            266
        //   321: goto            324
        //   324: aload           11
        //   326: iload           14
        //   328: ifne            340
        //   331: ifnull          357
        //   334: goto            338
        //   337: athrow         
        //   338: aload           11
        //   340: getfield        org/n.a:I
        //   343: istore          12
        //   345: aload           5
        //   347: iload           6
        //   349: putfield        org/d.b:I
        //   352: iload           14
        //   354: ifeq            400
        //   357: aload_0        
        //   358: dup            
        //   359: getfield        org/g.G:I
        //   362: dup_x1         
        //   363: iconst_1       
        //   364: iadd           
        //   365: putfield        org/g.G:I
        //   368: goto            372
        //   371: athrow         
        //   372: istore          12
        //   374: new             Lorg/n;
        //   377: dup            
        //   378: iload           12
        //   380: invokespecial   org/n.<init>:(I)V
        //   383: astore          11
        //   385: aload           11
        //   387: iload           6
        //   389: iload           7
        //   391: invokevirtual   org/n.a:(II)V
        //   394: aload_0        
        //   395: aload           11
        //   397: invokespecial   org/g.c:(Lorg/n;)V
        //   400: aload_0        
        //   401: getfield        org/g.m:Lorg/n;
        //   404: aload_1        
        //   405: aload_2        
        //   406: iload           12
        //   408: invokevirtual   org/n.a:(Ljava/lang/String;Ljava/lang/String;I)V
        //   411: aload_0        
        //   412: aload_0        
        //   413: getfield        org/g.m:Lorg/n;
        //   416: invokespecial   org/g.b:(Lorg/n;)Lorg/n;
        //   419: astore          11
        //   421: aload           11
        //   423: iload           14
        //   425: ifne            481
        //   428: ifnonnull       479
        //   431: goto            435
        //   434: athrow         
        //   435: aload_0        
        //   436: bipush          18
        //   438: iload           12
        //   440: aload_0        
        //   441: aload_1        
        //   442: aload_2        
        //   443: invokevirtual   org/g.a:(Ljava/lang/String;Ljava/lang/String;)I
        //   446: invokespecial   org/g.a:(III)V
        //   449: new             Lorg/n;
        //   452: dup            
        //   453: aload_0        
        //   454: dup            
        //   455: getfield        org/g.g:I
        //   458: dup_x1         
        //   459: iconst_1       
        //   460: iadd           
        //   461: putfield        org/g.g:I
        //   464: aload_0        
        //   465: getfield        org/g.m:Lorg/n;
        //   468: invokespecial   org/n.<init>:(ILorg/n;)V
        //   471: astore          11
        //   473: aload_0        
        //   474: aload           11
        //   476: invokespecial   org/g.c:(Lorg/n;)V
        //   479: aload           11
        //   481: areturn        
        //    StackMapTable: 00 26 FF 00 18 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 00 00 00 00 00 00 00 00 01 00 01 07 00 32 00 0D 41 07 00 04 FF 00 34 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 01 00 00 00 00 01 00 00 FF 00 33 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 01 07 01 81 00 00 00 01 00 01 07 00 32 FF 00 00 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 01 00 00 00 00 01 00 00 41 07 00 04 FF 00 22 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 07 02 26 01 07 00 07 00 00 01 00 00 56 07 00 32 40 01 47 07 00 32 00 4C 07 00 32 40 01 47 07 00 32 00 47 07 00 32 40 07 00 07 06 44 01 FF 00 04 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 07 02 26 01 07 00 07 01 01 01 00 00 61 07 00 32 00 0B 07 FF 00 02 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 07 02 26 01 07 00 07 00 00 01 00 00 4C 07 00 32 00 41 07 00 07 10 4D 07 00 32 40 01 FF 00 1B 00 0F 07 00 4D 07 00 66 07 00 66 07 00 6E 07 02 24 07 00 04 01 01 01 07 02 26 01 07 00 07 01 00 01 00 00 61 07 00 32 00 2B 41 07 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  421    431    434    435    Ljava/lang/RuntimeException;
        //  345    368    371    372    Ljava/lang/RuntimeException;
        //  324    334    337    338    Ljava/lang/RuntimeException;
        //  273    297    300    301    Ljava/lang/RuntimeException;
        //  231    245    248    249    Ljava/lang/RuntimeException;
        //  217    236    239    240    Ljava/lang/RuntimeException;
        //  208    227    230    231    Ljava/lang/RuntimeException;
        //  196    213    216    217    Ljava/lang/RuntimeException;
        //  189    204    207    208    Ljava/lang/RuntimeException;
        //  118    143    146    147    Ljava/lang/RuntimeException;
        //  11     21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0208:
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
    
    n a(final String s, final String s2, final String s3) {
        this.m.a(9, s, s2, s3);
        n b = this.b(this.m);
        n n = null;
        Label_0084: {
            try {
                n = b;
                if (org.f.c) {
                    return n;
                }
                if (n != null) {
                    break Label_0084;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.a(9, this.c(s), this.a(s2, s3));
            b = new n(this.g++, this.m);
            this.c(b);
        }
        return n;
    }
    
    public int b(final String s, final String s2, final String s3) {
        return this.a(s, s2, s3).a;
    }
    
    n a(final String s, final String s2, final String s3, final boolean b) {
        final boolean c = org.f.c;
        int n = 0;
        Label_0026: {
            Label_0024: {
                Label_0021: {
                    try {
                        n = (b ? 1 : 0);
                        if (c) {
                            break Label_0021;
                        }
                        if (!b) {
                            break Label_0024;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    n = 11;
                }
                break Label_0026;
            }
            n = 10;
        }
        final int n2 = n;
        this.m.a(n2, s, s2, s3);
        n b2 = this.b(this.m);
        n n3 = null;
        Label_0111: {
            try {
                n3 = b2;
                if (c) {
                    return n3;
                }
                if (n3 != null) {
                    break Label_0111;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            this.a(n2, this.c(s), this.a(s2, s3));
            b2 = new n(this.g++, this.m);
            this.c(b2);
        }
        return n3;
    }
    
    public int b(final String s, final String s2, final String s3, final boolean b) {
        return this.a(s, s2, s3, b).a;
    }
    
    n a(final int n) {
        this.k.a(n);
        n b = this.b(this.k);
        n n2 = null;
        Label_0072: {
            try {
                n2 = b;
                if (org.f.c) {
                    return n2;
                }
                if (n2 != null) {
                    break Label_0072;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.a(3).c(n);
            b = new n(this.g++, this.k);
            this.c(b);
        }
        return n2;
    }
    
    n a(final float n) {
        this.k.a(n);
        n b = this.b(this.k);
        n n2 = null;
        Label_0078: {
            try {
                n2 = b;
                if (org.f.c) {
                    return n2;
                }
                if (n2 != null) {
                    break Label_0078;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.a(4).c(this.k.c);
            b = new n(this.g++, this.k);
            this.c(b);
        }
        return n2;
    }
    
    n a(final long n) {
        this.k.a(n);
        n b = this.b(this.k);
        n n2 = null;
        Label_0075: {
            try {
                n2 = b;
                if (org.f.c) {
                    return n2;
                }
                if (n2 != null) {
                    break Label_0075;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.a(5).a(n);
            b = new n(this.g, this.k);
            this.g += 2;
            this.c(b);
        }
        return n2;
    }
    
    n a(final double n) {
        this.k.a(n);
        n b = this.b(this.k);
        n n2 = null;
        Label_0082: {
            try {
                n2 = b;
                if (org.f.c) {
                    return n2;
                }
                if (n2 != null) {
                    break Label_0082;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.a(6).a(this.k.d);
            b = new n(this.g, this.k);
            this.g += 2;
            this.c(b);
        }
        return n2;
    }
    
    private n e(final String s) {
        this.l.a(8, s, null, null);
        n b = this.b(this.l);
        n n = null;
        Label_0078: {
            try {
                n = b;
                if (org.f.c) {
                    return n;
                }
                if (n != null) {
                    break Label_0078;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.h.b(8, this.a(s));
            b = new n(this.g++, this.l);
            this.c(b);
        }
        return n;
    }
    
    public int a(final String s, final String s2) {
        return this.b(s, s2).a;
    }
    
    n b(final String s, final String s2) {
        this.l.a(12, s, s2, null);
        n b = this.b(this.l);
        n n = null;
        Label_0079: {
            try {
                n = b;
                if (org.f.c) {
                    return n;
                }
                if (n != null) {
                    break Label_0079;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.a(12, this.a(s), this.a(s2));
            b = new n(this.g++, this.l);
            this.c(b);
        }
        return n;
    }
    
    int f(final String s) {
        this.k.a(30, s, null, null);
        n n = this.b(this.k);
        n n2 = null;
        Label_0044: {
            try {
                n2 = n;
                if (org.f.c) {
                    return n2.a;
                }
                if (n2 != null) {
                    break Label_0044;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            n = this.a(this.k);
        }
        return n2.a;
    }
    
    int a(final String e, final int c) {
        this.k.b = 31;
        this.k.c = c;
        this.k.e = e;
        this.k.h = (Integer.MAX_VALUE & 31 + e.hashCode() + c);
        n n = this.b(this.k);
        n n2 = null;
        Label_0076: {
            try {
                n2 = n;
                if (org.f.c) {
                    return n2.a;
                }
                if (n2 != null) {
                    break Label_0076;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            n = this.a(this.k);
        }
        return n2.a;
    }
    
    private n a(final n n) {
        final boolean c = org.f.c;
        ++this.p;
        final n n2 = new n(this.p, this.k);
        Label_0118: {
            Label_0067: {
                Label_0053: {
                    try {
                        this.c(n2);
                        final g g = this;
                        final g g2 = this;
                        if (c) {
                            break Label_0067;
                        }
                        final n[] array = this.o;
                        if (array == null) {
                            break Label_0053;
                        }
                        break Label_0053;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final n[] array = this.o;
                        if (array == null) {
                            this.o = new n[16];
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final g g = this;
                final g g2 = this;
                try {
                    if (c) {
                        return g.o[this.p] = n2;
                    }
                    if (g2.p != this.o.length) {
                        break Label_0118;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            final n[] o = new n[2 * this.o.length];
            System.arraycopy(this.o, 0, o, 0, this.o.length);
            this.o = o;
        }
        final g g = this;
        return g.o[this.p] = n2;
    }
    
    int a(final int n, final int n2) {
        this.l.b = 32;
        this.l.d = ((long)n | (long)n2 << 32);
        this.l.h = (Integer.MAX_VALUE & 32 + n + n2);
        n b = this.b(this.l);
        n n3 = null;
        Label_0122: {
            try {
                n3 = b;
                if (org.f.c) {
                    return n3.c;
                }
                if (n3 != null) {
                    break Label_0122;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.l.c = this.f(this.c(this.o[n].e, this.o[n2].e));
            b = new n(0, this.l);
            this.c(b);
        }
        return n3.c;
    }
    
    protected String c(final String s, final String s2) {
        final boolean c = org.f.c;
        final ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?> forName;
        Class<?> forName2;
        try {
            forName = Class.forName(s.replace('/', '.'), false, classLoader);
            forName2 = Class.forName(s2.replace('/', '.'), false, classLoader);
        }
        catch (Exception ex) {
            throw new RuntimeException(ex.toString());
        }
        while (true) {
            while (true) {
                boolean b4 = false;
                Label_0164: {
                    Label_0142: {
                        boolean interface1 = false;
                        Label_0130: {
                            Label_0121: {
                                boolean b3 = false;
                                Label_0109: {
                                    Label_0105: {
                                        boolean b2 = false;
                                        Label_0090: {
                                            Label_0084: {
                                                boolean b;
                                                try {
                                                    b = (b2 = (b3 = (interface1 = (b4 = forName.isAssignableFrom(forName2)))));
                                                    if (c) {
                                                        break Label_0090;
                                                    }
                                                    if (b) {
                                                        return s;
                                                    }
                                                    break Label_0084;
                                                }
                                                catch (Exception ex2) {
                                                    throw ex2;
                                                }
                                                try {
                                                    if (b) {
                                                        return s;
                                                    }
                                                }
                                                catch (Exception ex3) {
                                                    throw ex3;
                                                }
                                            }
                                            b3 = (b2 = (interface1 = (b4 = forName2.isAssignableFrom(forName))));
                                            try {
                                                if (c) {
                                                    break Label_0109;
                                                }
                                                if (b2) {
                                                    return s2;
                                                }
                                                break Label_0105;
                                            }
                                            catch (Exception ex4) {
                                                throw ex4;
                                            }
                                        }
                                        try {
                                            if (b2) {
                                                return s2;
                                            }
                                        }
                                        catch (Exception ex5) {
                                            throw ex5;
                                        }
                                    }
                                    interface1 = (b3 = (b4 = forName.isInterface()));
                                    try {
                                        if (c) {
                                            break Label_0130;
                                        }
                                        if (!b3) {
                                            break Label_0121;
                                        }
                                        break Label_0142;
                                    }
                                    catch (Exception ex6) {
                                        throw ex6;
                                    }
                                }
                                try {
                                    if (b3) {
                                        break Label_0142;
                                    }
                                    b4 = (interface1 = forName2.isInterface());
                                }
                                catch (Exception ex7) {
                                    throw ex7;
                                }
                            }
                            try {
                                if (c) {
                                    break Label_0164;
                                }
                                if (interface1) {
                                    break Label_0142;
                                }
                                break Label_0153;
                            }
                            catch (Exception ex8) {
                                throw ex8;
                            }
                        }
                        try {
                            if (interface1) {
                                return SkillData.e(org.g.P[12]);
                            }
                        }
                        catch (Exception ex9) {
                            throw ex9;
                        }
                    }
                    final Class<?> superclass;
                    forName = (superclass = forName.getSuperclass());
                    final Class<?> clazz;
                    b4 = clazz.isAssignableFrom(forName2);
                }
                if (!b4) {
                    continue;
                }
                break;
            }
            final Class<?> clazz = forName;
            if (!c) {
                return clazz.getName().replace('.', '/');
            }
            continue;
        }
    }
    
    private n b(final n p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/g.i:[Lorg/n;
        //     8: aload_1        
        //     9: getfield        org/n.h:I
        //    12: aload_0        
        //    13: getfield        org/g.i:[Lorg/n;
        //    16: arraylength    
        //    17: irem           
        //    18: aaload         
        //    19: astore_2       
        //    20: aload_2        
        //    21: ifnull          84
        //    24: aload_2        
        //    25: iload_3        
        //    26: ifne            85
        //    29: iload_3        
        //    30: ifne            79
        //    33: goto            37
        //    36: athrow         
        //    37: getfield        org/n.b:I
        //    40: aload_1        
        //    41: getfield        org/n.b:I
        //    44: if_icmpne       71
        //    47: goto            51
        //    50: athrow         
        //    51: aload_1        
        //    52: iload_3        
        //    53: ifne            85
        //    56: goto            60
        //    59: athrow         
        //    60: aload_2        
        //    61: invokevirtual   org/n.a:(Lorg/n;)Z
        //    64: ifne            84
        //    67: goto            71
        //    70: athrow         
        //    71: aload_2        
        //    72: getfield        org/n.i:Lorg/n;
        //    75: goto            79
        //    78: athrow         
        //    79: astore_2       
        //    80: iload_3        
        //    81: ifeq            20
        //    84: aload_2        
        //    85: areturn        
        //    StackMapTable: 00 0D FD 00 14 07 00 07 01 4F 07 00 32 40 07 00 07 4C 07 00 32 00 47 07 00 32 40 07 00 07 49 07 00 32 00 46 07 00 32 40 07 00 07 04 40 07 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  60     75     78     79     Ljava/lang/RuntimeException;
        //  51     67     70     71     Ljava/lang/RuntimeException;
        //  37     56     59     60     Ljava/lang/RuntimeException;
        //  29     47     50     51     Ljava/lang/RuntimeException;
        //  24     33     36     37     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    private void c(final n n) {
        final boolean c = org.f.c;
        int length = 0;
        n n4 = null;
        Label_0167: {
            int n2 = 0;
            int j = 0;
            Label_0164: {
                Label_0155: {
                    try {
                        n2 = this.g + this.p;
                        j = this.j;
                        if (c) {
                            break Label_0164;
                        }
                        if (n2 <= j) {
                            break Label_0155;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    length = this.i.length;
                    final int n3 = length * 2 + 1;
                    final n[] i = new n[n3];
                    int k = length - 1;
                Label_0133_Outer:
                    while (k >= 0) {
                        n4 = this.i[k];
                        if (!c) {
                            n n5 = n4;
                        Label_0133:
                            while (true) {
                                while (n5 != null) {
                                    final int n6 = n5.h % i.length;
                                    final n l = n5.i;
                                    n5.i = i[n6];
                                    i[n6] = n5;
                                    n5 = l;
                                    try {
                                        if (c) {
                                            break Label_0133;
                                        }
                                        if (!c) {
                                            continue Label_0133_Outer;
                                        }
                                    }
                                    catch (RuntimeException ex2) {
                                        throw ex2;
                                    }
                                    break;
                                    if (c) {
                                        break Label_0133_Outer;
                                    }
                                    continue Label_0133_Outer;
                                }
                                --k;
                                continue Label_0133;
                            }
                        }
                        break Label_0167;
                    }
                    this.i = i;
                    this.j = (int)(n3 * 0.75);
                }
                final int h = n.h;
                final int length2 = this.i.length;
            }
            length = n2 % j;
        }
        n4.i = this.i[length];
        this.i[length] = n;
    }
    
    private void a(final int n, final int n2, final int n3) {
        this.h.b(n, n2).b(n3);
    }
    
    private void b(final int n, final int n2, final int n3) {
        this.h.a(n, n2).b(n3);
    }
    
    static {
        final String[] p = new String[13];
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
        String s = "-\u000eL~>\u0017+\\l4";
        int n14 = -1;
        String intern = null;
    Label_0170_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n16;
            final int n15 = n16 = (length = charArray.length);
            int n17 = 0;
            while (true) {
                Label_0246: {
                    if (n15 > 1) {
                        break Label_0246;
                    }
                    length = (n16 = n17);
                    do {
                        final char c = charArray[n16];
                        char c2 = '\0';
                        switch (n17 % 5) {
                            case 0: {
                                c2 = 'N';
                                break;
                            }
                            case 1: {
                                c2 = ']';
                                break;
                            }
                            case 2: {
                                c2 = '\t';
                                break;
                            }
                            case 3: {
                                c2 = '0';
                                break;
                            }
                            default: {
                                c2 = 'm';
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
                    p[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 1))))))))))));
                    s = " \u0018[t8\u0013\u0004oe.\u001b\u000fYe\u0010\u0010\u000fVx<\u0006\u0004Zn\"";
                    n14 = 0;
                    continue Label_0170_Outer;
                }
                case 0: {
                    p[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 2))))))))))));
                    s = "P\u0005#\u007fR\u0010f@\u000f4";
                    n14 = 1;
                    continue Label_0170_Outer;
                }
                case 1: {
                    p[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 3))))))))))));
                    s = "]\u000e=hE0kU\u0019#q\u0013";
                    n14 = 2;
                    continue Label_0170_Outer;
                }
                case 2: {
                    p[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 4))))))))))));
                    s = "!\u0014[t9\u001b\u0015Po";
                    n14 = 3;
                    continue Label_0170_Outer;
                }
                case 3: {
                    p[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 5))))))))))));
                    s = "0kU\u0019#4\u0006:aRSs[\u0005px\u0001!jRR";
                    n14 = 4;
                    continue Label_0170_Outer;
                }
                case 4: {
                    p[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 6))))))))))));
                    s = "G\u000f&\u007fT\u0016CQ\b%s%+yR\u001dt]\u0005>";
                    n14 = 5;
                    continue Label_0170_Outer;
                }
                case 5: {
                    p[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 7))))))))))));
                    s = "<\u000eVx.\u0006\u001fTp\u001c\u001b\u0015Qc9\u0001";
                    n14 = 6;
                    continue Label_0170_Outer;
                }
                case 6: {
                    p[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 8))))))))))));
                    s = "!rZ\u001e9y\u0005\u001acA\u001at]\b<q!=cX\u0007f@\u0003?z\u0013";
                    n14 = 7;
                    continue Label_0170_Outer;
                }
                case 7: {
                    p[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 9))))))))))));
                    s = "7\u0003Vl>\r\bWk\u0010\u0017\u0019]o5";
                    n14 = 8;
                    continue Label_0170_Outer;
                }
                case 8: {
                    p[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 10))))))))))));
                    s = " nS\u00041`\u0015!h";
                    n14 = 9;
                    continue Label_0170_Outer;
                }
                case 9: {
                    p[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 11))))))))))));
                    s = "\b\u0000Uy8R";
                    n14 = 10;
                    continue Label_0170_Outer;
                }
                case 10: {
                    p[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 12))))))))))));
                    s = "~\u0001%l\u0018\u001ffZ\r\u007f[\u00029hT\u0007";
                    n14 = 11;
                    continue Label_0170_Outer;
                }
                case 11: {
                    break Label_0170_Outer;
                }
            }
        }
        p[n13] = intern;
        P = p;
        final byte[] d2 = new byte[220];
        int index = 0;
        byte[] array;
        int n18;
        String s2 = null;
        String intern2;
        char[] charArray2;
        int length2;
        int n20;
        int n19;
        int n21;
        char c3;
        char c4 = '\0';
        Label_0470_Outer:Label_0346_Outer:
        while (true) {
            while (true) {
                while (true) {
                    Label_0331: {
                        try {
                            if (index < d2.length) {
                                array = d2;
                                n18 = index;
                                s2 = "? xM\u001c3,tA\u0010? xM\u001c3/vL\u001c3%}H\u00196(pE\u0014;$|I\u00187(pE\u0014;$|I\u00187,tA\u0010? xM\u00196)qD\u0014;$|I\u00187(pE\u0014;$|I\u00187(pE\u0010? xM\u001c3,tA\u0010? xM\u001c3,tA\u0010? xM\u001c3,tA\u0010? xM\u001c3,tA\u0010? xM\u001c3,tA\u0010? wM\u001c3,tA\u0010? xM\u001c3,tA\u0010? xF\u00178'\u007fJ\u001b4+sF\u00178'\u007fJ\u001511xM\u001c3,tG\u00169&~K\u001a:$sB\u0017? \u007fJ\u001c3?dJ\u001b5*sF\u00178'\u007fJ\u001b4+sF\u00178'\u007fJ\u001b";
                                break Label_0331;
                            }
                            break;
                            array[n18] = (byte)(HashTable.e(intern2).charAt(index) - 'A');
                            ++index;
                            continue Label_0470_Outer;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        break;
                    }
                    charArray2 = s2.toCharArray();
                    n19 = (n20 = (length2 = charArray2.length));
                    n21 = 0;
                    Label_0422: {
                        if (n19 > 1) {
                            break Label_0422;
                        }
                        length2 = (n20 = n21);
                        do {
                            c3 = charArray2[n20];
                            switch (n21 % 5) {
                                case 0: {
                                    c4 = 'N';
                                    break;
                                }
                                case 1: {
                                    c4 = ']';
                                    break;
                                }
                                case 2: {
                                    c4 = '\t';
                                    break;
                                }
                                case 3: {
                                    c4 = '0';
                                    break;
                                }
                                default: {
                                    c4 = 'm';
                                    break;
                                }
                            }
                            charArray2[length2] = (char)(c3 ^ c4);
                            ++n21;
                        } while (n19 == 0);
                    }
                    if (n19 <= n21) {
                        intern2 = new String(charArray2).intern();
                        continue Label_0346_Outer;
                    }
                    break;
                }
                continue;
            }
        }
        d = d2;
    }
}
