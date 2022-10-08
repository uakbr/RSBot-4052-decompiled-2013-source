
package org;

import org.powerbot.game.api.util.node.HashTable;

public class o
{
    int a;
    int b;
    int c;
    private int d;
    private int[] e;
    int f;
    int g;
    k h;
    o i;
    h j;
    o k;
    
    void a(final q p0, final d p1, final int p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_0        
        //     6: getfield        org/o.a:I
        //     9: iconst_2       
        //    10: iand           
        //    11: iload           5
        //    13: ifne            88
        //    16: ifne            82
        //    19: goto            23
        //    22: athrow         
        //    23: iload           4
        //    25: ifeq            58
        //    28: goto            32
        //    31: athrow         
        //    32: aload_0        
        //    33: iconst_m1      
        //    34: iload_3        
        //    35: isub           
        //    36: aload_2        
        //    37: getfield        org/d.b:I
        //    40: invokespecial   org/o.a:(II)V
        //    43: aload_2        
        //    44: iconst_m1      
        //    45: invokevirtual   org/d.c:(I)Lorg/d;
        //    48: pop            
        //    49: iload           5
        //    51: ifeq            126
        //    54: goto            58
        //    57: athrow         
        //    58: aload_0        
        //    59: iload_3        
        //    60: aload_2        
        //    61: getfield        org/d.b:I
        //    64: invokespecial   org/o.a:(II)V
        //    67: aload_2        
        //    68: iconst_m1      
        //    69: invokevirtual   org/d.b:(I)Lorg/d;
        //    72: pop            
        //    73: iload           5
        //    75: ifeq            126
        //    78: goto            82
        //    81: athrow         
        //    82: iload           4
        //    84: goto            88
        //    87: athrow         
        //    88: ifeq            111
        //    91: aload_2        
        //    92: aload_0        
        //    93: getfield        org/o.c:I
        //    96: iload_3        
        //    97: isub           
        //    98: invokevirtual   org/d.c:(I)Lorg/d;
        //   101: pop            
        //   102: iload           5
        //   104: ifeq            126
        //   107: goto            111
        //   110: athrow         
        //   111: aload_2        
        //   112: aload_0        
        //   113: getfield        org/o.c:I
        //   116: iload_3        
        //   117: isub           
        //   118: invokevirtual   org/d.b:(I)Lorg/d;
        //   121: pop            
        //   122: goto            126
        //   125: athrow         
        //   126: return         
        //    StackMapTable: 00 0E FF 00 16 00 06 07 00 1E 07 00 83 07 00 41 01 01 01 00 01 07 00 80 00 47 07 00 80 00 58 07 00 80 00 56 07 00 80 00 44 07 00 80 40 01 55 07 00 80 00 4D 07 00 80 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  91     122    125    126    Ljava/lang/RuntimeException;
        //  88     107    110    111    Ljava/lang/RuntimeException;
        //  58     84     87     88     Ljava/lang/RuntimeException;
        //  32     78     81     82     Ljava/lang/RuntimeException;
        //  23     54     57     58     Ljava/lang/RuntimeException;
        //  16     28     31     32     Ljava/lang/RuntimeException;
        //  5      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    private void a(final int n, final int n2) {
        final boolean c = org.f.c;
        o o = null;
        Label_0103: {
            Label_0085: {
                Label_0034: {
                    Label_0021: {
                        try {
                            o = this;
                            final o o2 = this;
                            if (c) {
                                break Label_0034;
                            }
                            final int[] array = this.e;
                            if (array == null) {
                                break Label_0021;
                            }
                            break Label_0021;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final int[] array = this.e;
                            if (array == null) {
                                this.e = new int[6];
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    o = this;
                    final o o2 = this;
                    try {
                        if (c) {
                            break Label_0103;
                        }
                        if (o2.d < this.e.length) {
                            break Label_0085;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                final int[] e = new int[this.e.length + 6];
                System.arraycopy(this.e, 0, e, 0, this.e.length);
                this.e = e;
            }
            this.e[this.d++] = n;
            o = this;
        }
        o.e[this.d++] = n2;
    }
    
    boolean a(final q p0, final int p1, final byte[] p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: iconst_0       
        //     6: istore          4
        //     8: aload_0        
        //     9: dup            
        //    10: getfield        org/o.a:I
        //    13: iconst_2       
        //    14: ior            
        //    15: putfield        org/o.a:I
        //    18: aload_0        
        //    19: iload_2        
        //    20: putfield        org/o.c:I
        //    23: iconst_0       
        //    24: istore          5
        //    26: iload           5
        //    28: aload_0        
        //    29: getfield        org/o.d:I
        //    32: if_icmpge       287
        //    35: aload_0        
        //    36: getfield        org/o.e:[I
        //    39: iload           5
        //    41: iinc            5, 1
        //    44: iaload         
        //    45: istore          6
        //    47: aload_0        
        //    48: getfield        org/o.e:[I
        //    51: iload           5
        //    53: iinc            5, 1
        //    56: iaload         
        //    57: istore          7
        //    59: iload           6
        //    61: iload           10
        //    63: ifne            289
        //    66: iload           10
        //    68: ifne            234
        //    71: goto            75
        //    74: athrow         
        //    75: iflt            224
        //    78: goto            82
        //    81: athrow         
        //    82: iload_2        
        //    83: iload           6
        //    85: isub           
        //    86: istore          8
        //    88: iload           8
        //    90: sipush          -32768
        //    93: iload           10
        //    95: ifne            139
        //    98: if_icmplt       126
        //   101: goto            105
        //   104: athrow         
        //   105: iload           8
        //   107: sipush          32767
        //   110: iload           10
        //   112: ifne            139
        //   115: goto            119
        //   118: athrow         
        //   119: if_icmple       199
        //   122: goto            126
        //   125: athrow         
        //   126: aload_3        
        //   127: iload           7
        //   129: iconst_1       
        //   130: isub           
        //   131: baload         
        //   132: sipush          255
        //   135: goto            139
        //   138: athrow         
        //   139: iand           
        //   140: istore          9
        //   142: iload           10
        //   144: ifne            175
        //   147: iload           9
        //   149: sipush          168
        //   152: if_icmpgt       180
        //   155: goto            159
        //   158: athrow         
        //   159: aload_3        
        //   160: iload           7
        //   162: iconst_1       
        //   163: isub           
        //   164: iload           9
        //   166: bipush          49
        //   168: iadd           
        //   169: i2b            
        //   170: bastore        
        //   171: goto            175
        //   174: athrow         
        //   175: iload           10
        //   177: ifeq            196
        //   180: aload_3        
        //   181: iload           7
        //   183: iconst_1       
        //   184: isub           
        //   185: iload           9
        //   187: bipush          20
        //   189: iadd           
        //   190: i2b            
        //   191: bastore        
        //   192: goto            196
        //   195: athrow         
        //   196: iconst_1       
        //   197: istore          4
        //   199: aload_3        
        //   200: iload           7
        //   202: iinc            7, 1
        //   205: iload           8
        //   207: bipush          8
        //   209: iushr          
        //   210: i2b            
        //   211: bastore        
        //   212: aload_3        
        //   213: iload           7
        //   215: iload           8
        //   217: i2b            
        //   218: bastore        
        //   219: iload           10
        //   221: ifeq            282
        //   224: iload_2        
        //   225: iload           6
        //   227: iadd           
        //   228: iconst_1       
        //   229: iadd           
        //   230: goto            234
        //   233: athrow         
        //   234: istore          8
        //   236: aload_3        
        //   237: iload           7
        //   239: iinc            7, 1
        //   242: iload           8
        //   244: bipush          24
        //   246: iushr          
        //   247: i2b            
        //   248: bastore        
        //   249: aload_3        
        //   250: iload           7
        //   252: iinc            7, 1
        //   255: iload           8
        //   257: bipush          16
        //   259: iushr          
        //   260: i2b            
        //   261: bastore        
        //   262: aload_3        
        //   263: iload           7
        //   265: iinc            7, 1
        //   268: iload           8
        //   270: bipush          8
        //   272: iushr          
        //   273: i2b            
        //   274: bastore        
        //   275: aload_3        
        //   276: iload           7
        //   278: iload           8
        //   280: i2b            
        //   281: bastore        
        //   282: iload           10
        //   284: ifeq            26
        //   287: iload           4
        //   289: ireturn        
        //    StackMapTable: 00 1B FF 00 1A 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 00 00 00 00 01 00 00 FF 00 2F 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 00 00 01 00 01 07 00 80 40 01 45 07 00 80 00 FF 00 15 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 00 01 00 01 07 00 80 00 4C 07 00 80 FF 00 00 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 00 01 00 02 01 01 45 07 00 80 00 4B 07 00 80 FF 00 00 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 00 01 00 02 01 01 FF 00 12 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 01 01 00 01 07 00 80 00 4E 07 00 80 00 04 4E 07 00 80 00 FF 00 02 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 00 01 00 00 FF 00 18 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 00 00 01 00 00 48 07 00 80 40 01 FF 00 2F 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 01 01 01 00 01 00 00 FF 00 04 00 0B 07 00 1E 07 00 83 01 07 00 85 01 01 00 00 00 00 01 00 00 41 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  199    230    233    234    Ljava/lang/RuntimeException;
        //  175    192    195    196    Ljava/lang/RuntimeException;
        //  147    171    174    175    Ljava/lang/RuntimeException;
        //  142    155    158    159    Ljava/lang/RuntimeException;
        //  119    135    138    139    Ljava/lang/RuntimeException;
        //  105    122    125    126    Ljava/lang/RuntimeException;
        //  98     115    118    119    Ljava/lang/RuntimeException;
        //  88     101    104    105    Ljava/lang/RuntimeException;
        //  66     78     81     82     Ljava/lang/RuntimeException;
        //  59     71     74     75     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
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
    
    o a() {
        Label_0017: {
            k k;
            try {
                final k i;
                k = (i = this.h);
                if (org.f.c) {
                    return i.b;
                }
                if (k == null) {
                    break Label_0017;
                }
                break Label_0017;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (k == null) {
                    return this;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        k i = this.h;
        return i.b;
    }
    
    boolean a(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: aload_0        
        //     5: getfield        org/o.a:I
        //     8: sipush          1024
        //    11: iand           
        //    12: iload_3        
        //    13: ifne            58
        //    16: ifeq            57
        //    19: goto            23
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        org/o.e:[I
        //    27: lload_1        
        //    28: bipush          32
        //    30: lushr          
        //    31: l2i            
        //    32: iaload         
        //    33: lload_1        
        //    34: l2i            
        //    35: iand           
        //    36: iload_3        
        //    37: ifne            52
        //    40: goto            44
        //    43: athrow         
        //    44: ifeq            55
        //    47: goto            51
        //    50: athrow         
        //    51: iconst_1       
        //    52: goto            56
        //    55: iconst_0       
        //    56: ireturn        
        //    57: iconst_0       
        //    58: ireturn        
        //    StackMapTable: 00 0B FF 00 16 00 03 07 00 1E 04 01 00 01 07 00 80 00 53 07 00 80 40 01 45 07 00 80 00 40 01 02 40 01 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  23     47     50     51     Ljava/lang/RuntimeException;
        //  16     40     43     44     Ljava/lang/RuntimeException;
        //  4      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    boolean a(final o p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     4: aload_0        
        //     5: getfield        org/o.a:I
        //     8: sipush          1024
        //    11: iand           
        //    12: iload_3        
        //    13: ifne            47
        //    16: ifeq            46
        //    19: goto            23
        //    22: athrow         
        //    23: aload_1        
        //    24: getfield        org/o.a:I
        //    27: sipush          1024
        //    30: iand           
        //    31: iload_3        
        //    32: ifne            49
        //    35: goto            39
        //    38: athrow         
        //    39: ifne            48
        //    42: goto            46
        //    45: athrow         
        //    46: iconst_0       
        //    47: ireturn        
        //    48: iconst_0       
        //    49: istore_2       
        //    50: iload_2        
        //    51: aload_0        
        //    52: getfield        org/o.e:[I
        //    55: arraylength    
        //    56: if_icmpge       100
        //    59: aload_0        
        //    60: getfield        org/o.e:[I
        //    63: iload_2        
        //    64: iaload         
        //    65: aload_1        
        //    66: getfield        org/o.e:[I
        //    69: iload_2        
        //    70: iaload         
        //    71: iand           
        //    72: iload_3        
        //    73: ifne            101
        //    76: iload_3        
        //    77: ifne            92
        //    80: goto            84
        //    83: athrow         
        //    84: ifeq            93
        //    87: goto            91
        //    90: athrow         
        //    91: iconst_1       
        //    92: ireturn        
        //    93: iinc            2, 1
        //    96: iload_3        
        //    97: ifeq            50
        //   100: iconst_0       
        //   101: ireturn        
        //    StackMapTable: 00 12 FF 00 16 00 04 07 00 1E 07 00 1E 00 01 00 01 07 00 80 00 4E 07 00 80 40 01 45 07 00 80 00 40 01 00 40 01 FF 00 00 00 04 07 00 1E 07 00 1E 01 01 00 00 60 07 00 80 40 01 45 07 00 80 00 40 01 00 06 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  76     87     90     91     Ljava/lang/RuntimeException;
        //  59     80     83     84     Ljava/lang/RuntimeException;
        //  23     42     45     46     Ljava/lang/RuntimeException;
        //  16     35     38     39     Ljava/lang/RuntimeException;
        //  4      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    void a(final long n, final int n2) {
        o o = null;
        Label_0052: {
            Label_0021: {
                try {
                    o = this;
                    if (org.f.c) {
                        break Label_0052;
                    }
                    final int n3 = this.a;
                    final int n4 = 1024;
                    final int n5 = n3 & n4;
                    if (n5 == 0) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n3 = this.a;
                    final int n4 = 1024;
                    final int n5 = n3 & n4;
                    if (n5 == 0) {
                        this.a |= 0x400;
                        this.e = new int[(n2 - 1) / 32 + 1];
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            o = this;
        }
        final int[] e = o.e;
        final int n6 = (int)(n >>> 32);
        e[n6] |= (int)n;
    }
    
    void a(final o p0, final long p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: aload_0        
        //     6: astore          5
        //     8: aload           5
        //    10: ifnull          335
        //    13: aload           5
        //    15: astore          6
        //    17: aload           6
        //    19: getfield        org/o.k:Lorg/o;
        //    22: astore          5
        //    24: aload           6
        //    26: aconst_null    
        //    27: putfield        org/o.k:Lorg/o;
        //    30: aload_1        
        //    31: iload           8
        //    33: ifne            186
        //    36: ifnull          180
        //    39: goto            43
        //    42: athrow         
        //    43: aload           6
        //    45: getfield        org/o.a:I
        //    48: sipush          2048
        //    51: iand           
        //    52: iload           8
        //    54: ifne            102
        //    57: goto            61
        //    60: athrow         
        //    61: ifeq            71
        //    64: goto            68
        //    67: athrow         
        //    68: goto            8
        //    71: aload           6
        //    73: dup            
        //    74: getfield        org/o.a:I
        //    77: sipush          2048
        //    80: ior            
        //    81: putfield        org/o.a:I
        //    84: aload           6
        //    86: iload           8
        //    88: ifne            215
        //    91: getfield        org/o.a:I
        //    94: sipush          256
        //    97: iand           
        //    98: goto            102
        //   101: athrow         
        //   102: ifeq            213
        //   105: aload           6
        //   107: iload           8
        //   109: ifne            215
        //   112: goto            116
        //   115: athrow         
        //   116: aload_1        
        //   117: invokevirtual   org/o.a:(Lorg/o;)Z
        //   120: ifne            213
        //   123: goto            127
        //   126: athrow         
        //   127: new             Lorg/h;
        //   130: dup            
        //   131: invokespecial   org/h.<init>:()V
        //   134: astore          7
        //   136: aload           7
        //   138: aload           6
        //   140: getfield        org/o.f:I
        //   143: putfield        org/h.a:I
        //   146: aload           7
        //   148: aload_1        
        //   149: getfield        org/o.j:Lorg/h;
        //   152: getfield        org/h.b:Lorg/o;
        //   155: putfield        org/h.b:Lorg/o;
        //   158: aload           7
        //   160: aload           6
        //   162: getfield        org/o.j:Lorg/h;
        //   165: putfield        org/h.c:Lorg/h;
        //   168: aload           6
        //   170: aload           7
        //   172: putfield        org/o.j:Lorg/h;
        //   175: iload           8
        //   177: ifeq            213
        //   180: aload           6
        //   182: goto            186
        //   185: athrow         
        //   186: lload_2        
        //   187: iload           8
        //   189: ifne            208
        //   192: invokevirtual   org/o.a:(J)Z
        //   195: goto            199
        //   198: athrow         
        //   199: ifeq            205
        //   202: goto            8
        //   205: aload           6
        //   207: lload_2        
        //   208: iload           4
        //   210: invokevirtual   org/o.a:(JI)V
        //   213: aload           6
        //   215: getfield        org/o.j:Lorg/h;
        //   218: astore          7
        //   220: aload           7
        //   222: ifnull          330
        //   225: aload           6
        //   227: iload           8
        //   229: ifne            298
        //   232: getfield        org/o.a:I
        //   235: sipush          128
        //   238: iand           
        //   239: iload           8
        //   241: ifne            199
        //   244: goto            248
        //   247: athrow         
        //   248: ifeq            277
        //   251: aload           7
        //   253: iload           8
        //   255: ifne            323
        //   258: goto            262
        //   261: athrow         
        //   262: aload           6
        //   264: getfield        org/o.j:Lorg/h;
        //   267: getfield        org/h.c:Lorg/h;
        //   270: if_acmpeq       318
        //   273: goto            277
        //   276: athrow         
        //   277: aload           7
        //   279: iload           8
        //   281: ifne            323
        //   284: goto            288
        //   287: athrow         
        //   288: getfield        org/h.b:Lorg/o;
        //   291: getfield        org/o.k:Lorg/o;
        //   294: goto            298
        //   297: athrow         
        //   298: ifnonnull       318
        //   301: aload           7
        //   303: getfield        org/h.b:Lorg/o;
        //   306: aload           5
        //   308: putfield        org/o.k:Lorg/o;
        //   311: aload           7
        //   313: getfield        org/h.b:Lorg/o;
        //   316: astore          5
        //   318: aload           7
        //   320: getfield        org/h.c:Lorg/h;
        //   323: astore          7
        //   325: iload           8
        //   327: ifeq            220
        //   330: iload           8
        //   332: ifeq            8
        //   335: return         
        //    StackMapTable: 00 26 FF 00 08 00 08 07 00 1E 07 00 1E 04 01 07 00 1E 00 00 01 00 00 FF 00 21 00 08 07 00 1E 07 00 1E 04 01 07 00 1E 07 00 1E 00 01 00 01 07 00 80 00 50 07 00 80 40 01 45 07 00 80 00 02 5D 07 00 80 40 01 4C 07 00 80 40 07 00 1E 49 07 00 80 00 34 44 07 00 80 40 07 00 1E 4B 07 00 80 40 01 05 FF 00 02 00 08 07 00 1E 07 00 1E 04 01 07 00 1E 07 00 1E 00 01 00 02 07 00 1E 04 04 41 07 00 1E FF 00 04 00 08 07 00 1E 07 00 1E 04 01 07 00 1E 07 00 1E 07 00 0F 01 00 00 5A 07 00 80 40 01 4C 07 00 80 40 07 00 0F 4D 07 00 80 00 49 07 00 80 40 07 00 0F 48 07 00 80 40 07 00 1E 13 44 07 00 0F 06 FF 00 04 00 08 07 00 1E 07 00 1E 04 01 07 00 1E 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  277    294    297    298    Ljava/lang/RuntimeException;
        //  262    284    287    288    Ljava/lang/RuntimeException;
        //  251    273    276    277    Ljava/lang/RuntimeException;
        //  248    258    261    262    Ljava/lang/RuntimeException;
        //  225    244    247    248    Ljava/lang/RuntimeException;
        //  186    195    198    199    Ljava/lang/RuntimeException;
        //  136    182    185    186    Ljava/lang/RuntimeException;
        //  105    123    126    127    Ljava/lang/RuntimeException;
        //  102    112    115    116    Ljava/lang/RuntimeException;
        //  71     98     101    102    Ljava/lang/RuntimeException;
        //  43     64     67     68     Ljava/lang/RuntimeException;
        //  36     57     60     61     Ljava/lang/RuntimeException;
        //  24     39     42     43     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    public String toString() {
        return HashTable.e("\f") + System.identityHashCode(this);
    }
    
    public static String a(final String s) {
        final int n = 5 << 4 ^ 0x3;
        final int n2 = 4;
        final int n3 = n2 << n2;
        final int length = s.length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] value = array;
        final char c = (char)n3;
        final int n5 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n4;
            final char char1 = s.charAt(index);
            --n4;
            array2[index] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n4;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n4;
            array3[index2] = c2;
            i = n4;
        }
        return new String(value);
    }
}
