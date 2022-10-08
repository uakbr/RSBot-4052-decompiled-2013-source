
package org;

final class j extends i
{
    private final g c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private b i;
    private b j;
    private c k;
    private static final String[] z;
    
    j(final g c, final int d, final String s, final String s2, final String s3, final Object o) {
        final boolean c2 = org.f.c;
        super(262144);
        final j i = c.I;
        Label_0113: {
            Label_0097: {
                Label_0049: {
                    if (!c2) {
                        Label_0037: {
                            try {
                                if (i != null) {
                                    break Label_0037;
                                }
                                final g g = c;
                                final j j = this;
                                g.I = j;
                                final boolean b = c2;
                                if (b) {
                                    break Label_0037;
                                }
                                break Label_0049;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                final g g = c;
                                final j j = this;
                                g.I = j;
                                final boolean b = c2;
                                if (!b) {
                                    break Label_0049;
                                }
                                final j k = c.J;
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                    }
                    i.b = this;
                    try {
                        c.J = this;
                        this.c = c;
                        this.d = d;
                        this.e = c.a(s);
                        this.f = c.a(s2);
                        final Object o2 = s3;
                        if (c2) {
                            break Label_0113;
                        }
                        if (s3 != null) {
                            break Label_0097;
                        }
                        break Label_0097;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (s3 != null) {
                        this.g = c.a(s3);
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            final Object o2 = o;
            try {
                if (o2 != null) {
                    this.h = c.a(o).a;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
    }
    
    @Override
    public a a(final String p0, final boolean p1) {
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
        //    15: getfield        org/j.c:Lorg/g;
        //    18: aload_1        
        //    19: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //    22: invokevirtual   org/d.b:(I)Lorg/d;
        //    25: iconst_0       
        //    26: invokevirtual   org/d.b:(I)Lorg/d;
        //    29: pop            
        //    30: new             Lorg/b;
        //    33: dup            
        //    34: aload_0        
        //    35: getfield        org/j.c:Lorg/g;
        //    38: iconst_1       
        //    39: aload_3        
        //    40: aload_3        
        //    41: iconst_2       
        //    42: invokespecial   org/b.<init>:(Lorg/g;ZLorg/d;Lorg/d;I)V
        //    45: astore          4
        //    47: iload           5
        //    49: ifne            97
        //    52: iload_2        
        //    53: ifeq            84
        //    56: goto            60
        //    59: athrow         
        //    60: aload           4
        //    62: aload_0        
        //    63: getfield        org/j.i:Lorg/b;
        //    66: putfield        org/b.i:Lorg/b;
        //    69: aload_0        
        //    70: aload           4
        //    72: putfield        org/j.i:Lorg/b;
        //    75: iload           5
        //    77: ifeq            103
        //    80: goto            84
        //    83: athrow         
        //    84: aload           4
        //    86: aload_0        
        //    87: getfield        org/j.j:Lorg/b;
        //    90: putfield        org/b.i:Lorg/b;
        //    93: goto            97
        //    96: athrow         
        //    97: aload_0        
        //    98: aload           4
        //   100: putfield        org/j.j:Lorg/b;
        //   103: aload           4
        //   105: areturn        
        //    StackMapTable: 00 07 FF 00 3B 00 06 07 00 23 07 00 89 01 07 00 0F 07 00 12 01 00 01 07 00 84 00 56 07 00 84 00 4B 07 00 84 00 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  60     93     96     97     Ljava/lang/RuntimeException;
        //  52     80     83     84     Ljava/lang/RuntimeException;
        //  47     56     59     60     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    public void a(final c k) {
        k.c = this.k;
        this.k = k;
    }
    
    @Override
    public void a() {
    }
    
    int a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: bipush          8
        //     6: istore_1       
        //     7: aload_0        
        //     8: getfield        org/j.h:I
        //    11: iload_2        
        //    12: ifne            53
        //    15: ifeq            45
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        org/j.c:Lorg/g;
        //    26: getstatic       org/j.z:[Ljava/lang/String;
        //    29: iconst_4       
        //    30: aaload         
        //    31: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //    34: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //    37: pop            
        //    38: iinc            1, 8
        //    41: goto            45
        //    44: athrow         
        //    45: aload_0        
        //    46: getfield        org/j.d:I
        //    49: sipush          4096
        //    52: iand           
        //    53: iload_2        
        //    54: ifne            143
        //    57: ifeq            136
        //    60: goto            64
        //    63: athrow         
        //    64: aload_0        
        //    65: getfield        org/j.c:Lorg/g;
        //    68: getfield        org/g.f:I
        //    71: ldc             65535
        //    73: iand           
        //    74: iload_2        
        //    75: ifne            132
        //    78: goto            82
        //    81: athrow         
        //    82: bipush          49
        //    84: if_icmplt       113
        //    87: goto            91
        //    90: athrow         
        //    91: aload_0        
        //    92: getfield        org/j.d:I
        //    95: ldc             262144
        //    97: iand           
        //    98: iload_2        
        //    99: ifne            143
        //   102: goto            106
        //   105: athrow         
        //   106: ifeq            136
        //   109: goto            113
        //   112: athrow         
        //   113: aload_0        
        //   114: getfield        org/j.c:Lorg/g;
        //   117: getstatic       org/j.z:[Ljava/lang/String;
        //   120: iconst_3       
        //   121: aaload         
        //   122: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   125: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   128: goto            132
        //   131: athrow         
        //   132: pop            
        //   133: iinc            1, 6
        //   136: aload_0        
        //   137: getfield        org/j.d:I
        //   140: ldc             131072
        //   142: iand           
        //   143: iload_2        
        //   144: ifne            189
        //   147: ifeq            177
        //   150: goto            154
        //   153: athrow         
        //   154: aload_0        
        //   155: getfield        org/j.c:Lorg/g;
        //   158: getstatic       org/j.z:[Ljava/lang/String;
        //   161: iconst_2       
        //   162: aaload         
        //   163: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   166: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   169: pop            
        //   170: iinc            1, 6
        //   173: goto            177
        //   176: athrow         
        //   177: aload_0        
        //   178: iload_2        
        //   179: ifne            216
        //   182: getfield        org/j.g:I
        //   185: goto            189
        //   188: athrow         
        //   189: ifeq            215
        //   192: aload_0        
        //   193: getfield        org/j.c:Lorg/g;
        //   196: getstatic       org/j.z:[Ljava/lang/String;
        //   199: iconst_1       
        //   200: aaload         
        //   201: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   204: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   207: pop            
        //   208: iinc            1, 8
        //   211: goto            215
        //   214: athrow         
        //   215: aload_0        
        //   216: getfield        org/j.i:Lorg/b;
        //   219: iload_2        
        //   220: ifne            271
        //   223: ifnull          259
        //   226: goto            230
        //   229: athrow         
        //   230: aload_0        
        //   231: getfield        org/j.c:Lorg/g;
        //   234: getstatic       org/j.z:[Ljava/lang/String;
        //   237: iconst_0       
        //   238: aaload         
        //   239: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   242: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   245: pop            
        //   246: iload_1        
        //   247: bipush          8
        //   249: aload_0        
        //   250: getfield        org/j.i:Lorg/b;
        //   253: invokevirtual   org/b.a:()I
        //   256: iadd           
        //   257: iadd           
        //   258: istore_1       
        //   259: aload_0        
        //   260: iload_2        
        //   261: ifne            304
        //   264: getfield        org/j.j:Lorg/b;
        //   267: goto            271
        //   270: athrow         
        //   271: ifnull          303
        //   274: aload_0        
        //   275: getfield        org/j.c:Lorg/g;
        //   278: getstatic       org/j.z:[Ljava/lang/String;
        //   281: iconst_5       
        //   282: aaload         
        //   283: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   286: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   289: pop            
        //   290: iload_1        
        //   291: bipush          8
        //   293: aload_0        
        //   294: getfield        org/j.j:Lorg/b;
        //   297: invokevirtual   org/b.a:()I
        //   300: iadd           
        //   301: iadd           
        //   302: istore_1       
        //   303: aload_0        
        //   304: getfield        org/j.k:Lorg/c;
        //   307: ifnull          328
        //   310: iload_1        
        //   311: aload_0        
        //   312: getfield        org/j.k:Lorg/c;
        //   315: aload_0        
        //   316: getfield        org/j.c:Lorg/g;
        //   319: aconst_null    
        //   320: iconst_0       
        //   321: iconst_m1      
        //   322: iconst_m1      
        //   323: invokevirtual   org/c.b:(Lorg/g;[BIII)I
        //   326: iadd           
        //   327: istore_1       
        //   328: iload_1        
        //   329: ireturn        
        //    StackMapTable: 00 24 FF 00 15 00 03 07 00 23 01 01 00 01 07 00 84 00 55 07 00 84 00 47 01 49 07 00 84 00 50 07 00 84 40 01 47 07 00 84 00 4D 07 00 84 40 01 45 07 00 84 00 51 07 00 84 40 01 03 46 01 49 07 00 84 00 55 07 00 84 00 4A 07 00 84 40 01 58 07 00 84 00 40 07 00 23 4C 07 00 84 00 1C 4A 07 00 84 40 07 00 12 1F 40 07 00 23 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  259    267    270    271    Ljava/lang/RuntimeException;
        //  216    226    229    230    Ljava/lang/RuntimeException;
        //  189    211    214    215    Ljava/lang/RuntimeException;
        //  177    185    188    189    Ljava/lang/RuntimeException;
        //  147    173    176    177    Ljava/lang/RuntimeException;
        //  143    150    153    154    Ljava/lang/RuntimeException;
        //  106    128    131    132    Ljava/lang/RuntimeException;
        //  91     109    112    113    Ljava/lang/RuntimeException;
        //  82     102    105    106    Ljava/lang/RuntimeException;
        //  64     87     90     91     Ljava/lang/RuntimeException;
        //  57     78     81     82     Ljava/lang/RuntimeException;
        //  53     60     63     64     Ljava/lang/RuntimeException;
        //  15     41     44     45     Ljava/lang/RuntimeException;
        //  7      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
    
    void a(final d p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: ldc             393216
        //     7: aload_0        
        //     8: getfield        org/j.d:I
        //    11: ldc             262144
        //    13: iand           
        //    14: bipush          64
        //    16: idiv           
        //    17: ior            
        //    18: istore_2       
        //    19: aload_1        
        //    20: aload_0        
        //    21: getfield        org/j.d:I
        //    24: iload_2        
        //    25: iconst_m1      
        //    26: ixor           
        //    27: iand           
        //    28: invokevirtual   org/d.b:(I)Lorg/d;
        //    31: aload_0        
        //    32: getfield        org/j.e:I
        //    35: invokevirtual   org/d.b:(I)Lorg/d;
        //    38: aload_0        
        //    39: getfield        org/j.f:I
        //    42: invokevirtual   org/d.b:(I)Lorg/d;
        //    45: pop            
        //    46: iconst_0       
        //    47: istore_3       
        //    48: aload_0        
        //    49: getfield        org/j.h:I
        //    52: iload           4
        //    54: ifne            75
        //    57: ifeq            67
        //    60: goto            64
        //    63: athrow         
        //    64: iinc            3, 1
        //    67: aload_0        
        //    68: getfield        org/j.d:I
        //    71: sipush          4096
        //    74: iand           
        //    75: iload           4
        //    77: ifne            148
        //    80: ifeq            141
        //    83: goto            87
        //    86: athrow         
        //    87: aload_0        
        //    88: getfield        org/j.c:Lorg/g;
        //    91: getfield        org/g.f:I
        //    94: ldc             65535
        //    96: iand           
        //    97: bipush          49
        //    99: iload           4
        //   101: ifne            125
        //   104: goto            108
        //   107: athrow         
        //   108: if_icmplt       138
        //   111: goto            115
        //   114: athrow         
        //   115: aload_0        
        //   116: getfield        org/j.d:I
        //   119: ldc             262144
        //   121: goto            125
        //   124: athrow         
        //   125: iand           
        //   126: iload           4
        //   128: ifne            148
        //   131: ifeq            141
        //   134: goto            138
        //   137: athrow         
        //   138: iinc            3, 1
        //   141: aload_0        
        //   142: getfield        org/j.d:I
        //   145: ldc             131072
        //   147: iand           
        //   148: iload           4
        //   150: ifne            176
        //   153: ifeq            163
        //   156: goto            160
        //   159: athrow         
        //   160: iinc            3, 1
        //   163: aload_0        
        //   164: iload           4
        //   166: ifne            183
        //   169: getfield        org/j.g:I
        //   172: goto            176
        //   175: athrow         
        //   176: ifeq            182
        //   179: iinc            3, 1
        //   182: aload_0        
        //   183: getfield        org/j.i:Lorg/b;
        //   186: iload           4
        //   188: ifne            214
        //   191: ifnull          201
        //   194: goto            198
        //   197: athrow         
        //   198: iinc            3, 1
        //   201: aload_0        
        //   202: iload           4
        //   204: ifne            221
        //   207: getfield        org/j.j:Lorg/b;
        //   210: goto            214
        //   213: athrow         
        //   214: ifnull          220
        //   217: iinc            3, 1
        //   220: aload_0        
        //   221: iload           4
        //   223: ifne            253
        //   226: getfield        org/j.k:Lorg/c;
        //   229: ifnull          246
        //   232: goto            236
        //   235: athrow         
        //   236: iload_3        
        //   237: aload_0        
        //   238: getfield        org/j.k:Lorg/c;
        //   241: invokevirtual   org/c.c:()I
        //   244: iadd           
        //   245: istore_3       
        //   246: aload_1        
        //   247: iload_3        
        //   248: invokevirtual   org/d.b:(I)Lorg/d;
        //   251: pop            
        //   252: aload_0        
        //   253: getfield        org/j.h:I
        //   256: iload           4
        //   258: ifne            313
        //   261: ifeq            305
        //   264: goto            268
        //   267: athrow         
        //   268: aload_1        
        //   269: aload_0        
        //   270: getfield        org/j.c:Lorg/g;
        //   273: getstatic       org/j.z:[Ljava/lang/String;
        //   276: iconst_4       
        //   277: aaload         
        //   278: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   281: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   284: invokevirtual   org/d.b:(I)Lorg/d;
        //   287: pop            
        //   288: aload_1        
        //   289: iconst_2       
        //   290: invokevirtual   org/d.c:(I)Lorg/d;
        //   293: aload_0        
        //   294: getfield        org/j.h:I
        //   297: invokevirtual   org/d.b:(I)Lorg/d;
        //   300: pop            
        //   301: goto            305
        //   304: athrow         
        //   305: aload_0        
        //   306: getfield        org/j.d:I
        //   309: sipush          4096
        //   312: iand           
        //   313: iload           4
        //   315: ifne            411
        //   318: ifeq            404
        //   321: goto            325
        //   324: athrow         
        //   325: aload_0        
        //   326: getfield        org/j.c:Lorg/g;
        //   329: getfield        org/g.f:I
        //   332: ldc             65535
        //   334: iand           
        //   335: bipush          49
        //   337: iload           4
        //   339: ifne            363
        //   342: goto            346
        //   345: athrow         
        //   346: if_icmplt       376
        //   349: goto            353
        //   352: athrow         
        //   353: aload_0        
        //   354: getfield        org/j.d:I
        //   357: ldc             262144
        //   359: goto            363
        //   362: athrow         
        //   363: iand           
        //   364: iload           4
        //   366: ifne            411
        //   369: ifeq            404
        //   372: goto            376
        //   375: athrow         
        //   376: aload_1        
        //   377: aload_0        
        //   378: getfield        org/j.c:Lorg/g;
        //   381: getstatic       org/j.z:[Ljava/lang/String;
        //   384: iconst_3       
        //   385: aaload         
        //   386: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   389: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   392: invokevirtual   org/d.b:(I)Lorg/d;
        //   395: iconst_0       
        //   396: invokevirtual   org/d.c:(I)Lorg/d;
        //   399: pop            
        //   400: goto            404
        //   403: athrow         
        //   404: aload_0        
        //   405: getfield        org/j.d:I
        //   408: ldc             131072
        //   410: iand           
        //   411: iload           4
        //   413: ifne            464
        //   416: ifeq            451
        //   419: goto            423
        //   422: athrow         
        //   423: aload_1        
        //   424: aload_0        
        //   425: getfield        org/j.c:Lorg/g;
        //   428: getstatic       org/j.z:[Ljava/lang/String;
        //   431: iconst_2       
        //   432: aaload         
        //   433: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   436: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   439: invokevirtual   org/d.b:(I)Lorg/d;
        //   442: iconst_0       
        //   443: invokevirtual   org/d.c:(I)Lorg/d;
        //   446: pop            
        //   447: goto            451
        //   450: athrow         
        //   451: aload_0        
        //   452: iload           4
        //   454: ifne            505
        //   457: getfield        org/j.g:I
        //   460: goto            464
        //   463: athrow         
        //   464: ifeq            504
        //   467: aload_1        
        //   468: aload_0        
        //   469: getfield        org/j.c:Lorg/g;
        //   472: getstatic       org/j.z:[Ljava/lang/String;
        //   475: iconst_1       
        //   476: aaload         
        //   477: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   480: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   483: invokevirtual   org/d.b:(I)Lorg/d;
        //   486: pop            
        //   487: aload_1        
        //   488: iconst_2       
        //   489: invokevirtual   org/d.c:(I)Lorg/d;
        //   492: aload_0        
        //   493: getfield        org/j.g:I
        //   496: invokevirtual   org/d.b:(I)Lorg/d;
        //   499: pop            
        //   500: goto            504
        //   503: athrow         
        //   504: aload_0        
        //   505: getfield        org/j.i:Lorg/b;
        //   508: iload           4
        //   510: ifne            565
        //   513: ifnull          552
        //   516: goto            520
        //   519: athrow         
        //   520: aload_1        
        //   521: aload_0        
        //   522: getfield        org/j.c:Lorg/g;
        //   525: getstatic       org/j.z:[Ljava/lang/String;
        //   528: iconst_0       
        //   529: aaload         
        //   530: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   533: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   536: invokevirtual   org/d.b:(I)Lorg/d;
        //   539: pop            
        //   540: aload_0        
        //   541: getfield        org/j.i:Lorg/b;
        //   544: aload_1        
        //   545: invokevirtual   org/b.a:(Lorg/d;)V
        //   548: goto            552
        //   551: athrow         
        //   552: aload_0        
        //   553: iload           4
        //   555: ifne            601
        //   558: getfield        org/j.j:Lorg/b;
        //   561: goto            565
        //   564: athrow         
        //   565: ifnull          600
        //   568: aload_1        
        //   569: aload_0        
        //   570: getfield        org/j.c:Lorg/g;
        //   573: getstatic       org/j.z:[Ljava/lang/String;
        //   576: iconst_5       
        //   577: aaload         
        //   578: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   581: invokevirtual   org/g.a:(Ljava/lang/String;)I
        //   584: invokevirtual   org/d.b:(I)Lorg/d;
        //   587: pop            
        //   588: aload_0        
        //   589: getfield        org/j.j:Lorg/b;
        //   592: aload_1        
        //   593: invokevirtual   org/b.a:(Lorg/d;)V
        //   596: goto            600
        //   599: athrow         
        //   600: aload_0        
        //   601: getfield        org/j.k:Lorg/c;
        //   604: iload           4
        //   606: ifne            624
        //   609: ifnull          636
        //   612: goto            616
        //   615: athrow         
        //   616: aload_0        
        //   617: getfield        org/j.k:Lorg/c;
        //   620: goto            624
        //   623: athrow         
        //   624: aload_0        
        //   625: getfield        org/j.c:Lorg/g;
        //   628: aconst_null    
        //   629: iconst_0       
        //   630: iconst_m1      
        //   631: iconst_m1      
        //   632: aload_1        
        //   633: invokevirtual   org/c.a:(Lorg/g;[BIIILorg/d;)V
        //   636: return         
        //    StackMapTable: 00 4B FF 00 3F 00 05 07 00 23 07 00 0F 01 01 01 00 01 07 00 84 00 02 47 01 4A 07 00 84 00 53 07 00 84 FF 00 00 00 05 07 00 23 07 00 0F 01 01 01 00 02 01 01 45 07 00 84 00 48 07 00 84 FF 00 00 00 05 07 00 23 07 00 0F 01 01 01 00 02 01 01 4B 07 00 84 00 02 46 01 4A 07 00 84 00 02 4B 07 00 84 40 01 05 40 07 00 23 4D 07 00 84 00 02 4B 07 00 84 40 07 00 12 05 40 07 00 23 4D 07 00 84 00 09 46 07 00 23 4D 07 00 84 00 63 07 00 84 00 47 01 4A 07 00 84 00 53 07 00 84 FF 00 00 00 05 07 00 23 07 00 0F 01 01 01 00 02 01 01 45 07 00 84 00 48 07 00 84 FF 00 00 00 05 07 00 23 07 00 0F 01 01 01 00 02 01 01 4B 07 00 84 00 5A 07 00 84 00 46 01 4A 07 00 84 00 5A 07 00 84 00 4B 07 00 84 40 01 66 07 00 84 00 40 07 00 23 4D 07 00 84 00 5E 07 00 84 00 4B 07 00 84 40 07 00 12 61 07 00 84 00 40 07 00 23 4D 07 00 84 00 46 07 00 84 40 07 00 53 0B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  609    620    623    624    Ljava/lang/RuntimeException;
        //  601    612    615    616    Ljava/lang/RuntimeException;
        //  565    596    599    600    Ljava/lang/RuntimeException;
        //  552    561    564    565    Ljava/lang/RuntimeException;
        //  513    548    551    552    Ljava/lang/RuntimeException;
        //  505    516    519    520    Ljava/lang/RuntimeException;
        //  464    500    503    504    Ljava/lang/RuntimeException;
        //  451    460    463    464    Ljava/lang/RuntimeException;
        //  416    447    450    451    Ljava/lang/RuntimeException;
        //  411    419    422    423    Ljava/lang/RuntimeException;
        //  369    400    403    404    Ljava/lang/RuntimeException;
        //  363    372    375    376    Ljava/lang/RuntimeException;
        //  346    359    362    363    Ljava/lang/RuntimeException;
        //  325    349    352    353    Ljava/lang/RuntimeException;
        //  318    342    345    346    Ljava/lang/RuntimeException;
        //  313    321    324    325    Ljava/lang/RuntimeException;
        //  261    301    304    305    Ljava/lang/RuntimeException;
        //  253    264    267    268    Ljava/lang/RuntimeException;
        //  221    232    235    236    Ljava/lang/RuntimeException;
        //  201    210    213    214    Ljava/lang/RuntimeException;
        //  183    194    197    198    Ljava/lang/RuntimeException;
        //  163    172    175    176    Ljava/lang/RuntimeException;
        //  148    156    159    160    Ljava/lang/RuntimeException;
        //  125    134    137    138    Ljava/lang/RuntimeException;
        //  108    121    124    125    Ljava/lang/RuntimeException;
        //  87     111    114    115    Ljava/lang/RuntimeException;
        //  80     104    107    108    Ljava/lang/RuntimeException;
        //  75     83     86     87     Ljava/lang/RuntimeException;
        //  48     60     63     64     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "+:)dlFxC+$\u0010-+uDEsz66\r&(~v";
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
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = '.';
                                break;
                            }
                            case 1: {
                                c2 = 'J';
                                break;
                            }
                            case 2: {
                                c2 = '\u0010';
                                break;
                            }
                            case 3: {
                                c2 = '\u0015';
                                break;
                            }
                            default: {
                                c2 = 'R';
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
                    s = "^)Tq\u0010P\u001chS";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "oxe02\u001a.3ua";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "^9]k\u0019A\u001dsU";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = ": )cqJsa\u00146\u0015:\"";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "_5]k\u0018I\fSX.d3Z}\u001dA(tX7y!Gv\u001eJ\u001a";
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
    }
}
