
package org.powerbot;

public class q
{
    private static final int[] a;
    
    public static byte[] a(final String s) {
        final int b = b(s);
        Label_0019: {
            int n;
            try {
                final int n2;
                n = (n2 = b);
                if (o.d != 0) {
                    return a(n2, s);
                }
                if (n == 0) {
                    break Label_0019;
                }
                break Label_0019;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (n == 0) {
                    return new byte[0];
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        int n2 = b;
        return a(n2, s);
    }
    
    private static int b(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   java/lang/String.length:()I
        //     9: istore_1       
        //    10: iload_1        
        //    11: iload           4
        //    13: ifne            32
        //    16: ifne            26
        //    19: goto            23
        //    22: athrow         
        //    23: iconst_0       
        //    24: ireturn        
        //    25: athrow         
        //    26: bipush          -4
        //    28: iload_1        
        //    29: iconst_3       
        //    30: iadd           
        //    31: iand           
        //    32: istore_2       
        //    33: iload_2        
        //    34: iconst_4       
        //    35: idiv           
        //    36: iconst_3       
        //    37: imul           
        //    38: istore_3       
        //    39: iload           4
        //    41: ifne            85
        //    44: iload_1        
        //    45: iload_2        
        //    46: iconst_2       
        //    47: isub           
        //    48: if_icmple       82
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0        
        //    56: iload_2        
        //    57: iconst_2       
        //    58: isub           
        //    59: invokevirtual   java/lang/String.charAt:(I)C
        //    62: invokestatic    org/powerbot/q.a:(C)I
        //    65: iconst_m1      
        //    66: iload           4
        //    68: ifne            98
        //    71: goto            75
        //    74: athrow         
        //    75: if_icmpne       90
        //    78: goto            82
        //    81: athrow         
        //    82: iinc            3, -2
        //    85: iload           4
        //    87: ifeq            140
        //    90: iload_1        
        //    91: iload_2        
        //    92: iconst_1       
        //    93: isub           
        //    94: goto            98
        //    97: athrow         
        //    98: iload           4
        //   100: ifne            134
        //   103: if_icmple       137
        //   106: goto            110
        //   109: athrow         
        //   110: aload_0        
        //   111: iload_2        
        //   112: iconst_1       
        //   113: isub           
        //   114: invokevirtual   java/lang/String.charAt:(I)C
        //   117: invokestatic    org/powerbot/q.a:(C)I
        //   120: iload           4
        //   122: ifne            141
        //   125: goto            129
        //   128: athrow         
        //   129: iconst_m1      
        //   130: goto            134
        //   133: athrow         
        //   134: if_icmpne       140
        //   137: iinc            3, -1
        //   140: iload_3        
        //   141: ireturn        
        //    StackMapTable: 00 18 FF 00 16 00 05 07 00 15 01 00 00 01 00 01 07 00 28 00 41 07 00 28 00 45 01 FF 00 15 00 05 07 00 15 01 01 01 01 00 01 07 00 28 00 52 07 00 28 FF 00 00 00 05 07 00 15 01 01 01 01 00 02 01 01 45 07 00 28 00 02 04 46 07 00 28 FF 00 00 00 05 07 00 15 01 01 01 01 00 02 01 01 4A 07 00 28 00 51 07 00 28 40 01 43 07 00 28 FF 00 00 00 05 07 00 15 01 01 01 01 00 02 01 01 02 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  110    130    133    134    Ljava/lang/RuntimeException;
        //  103    125    128    129    Ljava/lang/RuntimeException;
        //  98     106    109    110    Ljava/lang/RuntimeException;
        //  85     94     97     98     Ljava/lang/RuntimeException;
        //  55     78     81     82     Ljava/lang/RuntimeException;
        //  44     71     74     75     Ljava/lang/RuntimeException;
        //  39     51     54     55     Ljava/lang/RuntimeException;
        //  16     25     25     26     Ljava/lang/RuntimeException;
        //  10     19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    private static int a(final char c) {
        final int d = o.d;
        int n = 0;
        Label_0032: {
            char c2 = '\0';
            Label_0017: {
                try {
                    n = c;
                    c2 = c;
                    if (d != 0) {
                        break Label_0017;
                    }
                    if (c < '\0') {
                        return -1;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                n = c;
                c2 = c;
                try {
                    if (d != 0) {
                        return n;
                    }
                    final int[] array = q.a;
                    final int n2 = array.length;
                    if (c2 < n2) {
                        break Label_0032;
                    }
                    return -1;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                final int[] array = q.a;
                final int n2 = array.length;
                if (c2 >= n2) {
                    return -1;
                }
                n = q.a[c];
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return n;
        n = -1;
        return n;
    }
    
    private static byte[] a(final int p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: iload_0        
        //     6: newarray        B
        //     8: astore_2       
        //     9: aload_1        
        //    10: invokevirtual   java/lang/String.length:()I
        //    13: istore_3       
        //    14: iconst_0       
        //    15: istore          4
        //    17: iconst_0       
        //    18: istore          5
        //    20: iload_3        
        //    21: iload           4
        //    23: if_icmple       258
        //    26: aload_1        
        //    27: iload           4
        //    29: invokevirtual   java/lang/String.charAt:(I)C
        //    32: invokestatic    org/powerbot/q.a:(C)I
        //    35: istore          6
        //    37: iload_3        
        //    38: iload           10
        //    40: ifne            69
        //    43: iload           4
        //    45: iconst_1       
        //    46: iadd           
        //    47: if_icmple       72
        //    50: goto            54
        //    53: athrow         
        //    54: aload_1        
        //    55: iload           4
        //    57: iconst_1       
        //    58: iadd           
        //    59: invokevirtual   java/lang/String.charAt:(I)C
        //    62: invokestatic    org/powerbot/q.a:(C)I
        //    65: goto            69
        //    68: athrow         
        //    69: goto            73
        //    72: iconst_m1      
        //    73: istore          7
        //    75: iload           4
        //    77: iconst_2       
        //    78: iadd           
        //    79: iload           10
        //    81: ifne            107
        //    84: iload_3        
        //    85: if_icmpge       110
        //    88: goto            92
        //    91: athrow         
        //    92: aload_1        
        //    93: iload           4
        //    95: iconst_2       
        //    96: iadd           
        //    97: invokevirtual   java/lang/String.charAt:(I)C
        //   100: invokestatic    org/powerbot/q.a:(C)I
        //   103: goto            107
        //   106: athrow         
        //   107: goto            111
        //   110: iconst_m1      
        //   111: istore          8
        //   113: iload_3        
        //   114: iload           10
        //   116: ifne            145
        //   119: iload           4
        //   121: iconst_3       
        //   122: iadd           
        //   123: if_icmple       148
        //   126: goto            130
        //   129: athrow         
        //   130: aload_1        
        //   131: iload           4
        //   133: iconst_3       
        //   134: iadd           
        //   135: invokevirtual   java/lang/String.charAt:(I)C
        //   138: invokestatic    org/powerbot/q.a:(C)I
        //   141: goto            145
        //   144: athrow         
        //   145: goto            149
        //   148: iconst_m1      
        //   149: istore          9
        //   151: aload_2        
        //   152: iload           5
        //   154: iinc            5, 1
        //   157: iload           7
        //   159: iconst_4       
        //   160: iushr          
        //   161: iload           6
        //   163: iconst_2       
        //   164: ishl           
        //   165: ior            
        //   166: i2b            
        //   167: bastore        
        //   168: iload           8
        //   170: iconst_m1      
        //   171: iload           10
        //   173: ifne            220
        //   176: if_icmpeq       255
        //   179: goto            183
        //   182: athrow         
        //   183: aload_2        
        //   184: iload           5
        //   186: iinc            5, 1
        //   189: iload           7
        //   191: iconst_4       
        //   192: ishl           
        //   193: sipush          240
        //   196: iand           
        //   197: iload           8
        //   199: iconst_2       
        //   200: iushr          
        //   201: ior            
        //   202: i2b            
        //   203: bastore        
        //   204: iload           10
        //   206: ifne            250
        //   209: goto            213
        //   212: athrow         
        //   213: iload           9
        //   215: iconst_m1      
        //   216: goto            220
        //   219: athrow         
        //   220: if_icmpeq       255
        //   223: aload_2        
        //   224: iload           5
        //   226: iinc            5, 1
        //   229: sipush          192
        //   232: iload           8
        //   234: bipush          6
        //   236: ishl           
        //   237: iand           
        //   238: iload           9
        //   240: ior            
        //   241: i2b            
        //   242: bastore        
        //   243: iinc            4, 4
        //   246: goto            250
        //   249: athrow         
        //   250: iload           10
        //   252: ifeq            20
        //   255: goto            258
        //   258: aload_2        
        //   259: areturn        
        //    StackMapTable: 00 1D FF 00 14 00 0B 01 07 00 15 07 00 2B 01 01 01 00 00 00 00 01 00 00 FF 00 20 00 0B 01 07 00 15 07 00 2B 01 01 01 01 00 00 00 01 00 01 07 00 28 00 4D 07 00 28 40 01 02 40 01 FF 00 11 00 0B 01 07 00 15 07 00 2B 01 01 01 01 01 00 00 01 00 01 07 00 28 00 4D 07 00 28 40 01 02 40 01 FF 00 11 00 0B 01 07 00 15 07 00 2B 01 01 01 01 01 01 00 01 00 01 07 00 28 00 4D 07 00 28 40 01 02 40 01 FF 00 20 00 0B 01 07 00 15 07 00 2B 01 01 01 01 01 01 01 01 00 01 07 00 28 00 5C 07 00 28 00 45 07 00 28 FF 00 00 00 0B 01 07 00 15 07 00 2B 01 01 01 01 01 01 01 01 00 02 01 01 5C 07 00 28 00 04 FF 00 02 00 0B 01 07 00 15 07 00 2B 01 01 01 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  220    246    249    250    Ljava/lang/RuntimeException;
        //  183    216    219    220    Ljava/lang/RuntimeException;
        //  176    209    212    213    Ljava/lang/RuntimeException;
        //  151    179    182    183    Ljava/lang/RuntimeException;
        //  119    141    144    145    Ljava/lang/RuntimeException;
        //  113    126    129    130    Ljava/lang/RuntimeException;
        //  84     103    106    107    Ljava/lang/RuntimeException;
        //  75     88     91     92     Ljava/lang/RuntimeException;
        //  43     65     68     69     Ljava/lang/RuntimeException;
        //  37     50     53     54     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0183:
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
        a = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, 62, -1, 63, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1 };
    }
}
