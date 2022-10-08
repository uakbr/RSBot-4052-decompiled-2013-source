
package org;

public class u
{
    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    public static final u e;
    public static final u f;
    public static final u g;
    public static final u h;
    public static final u i;
    private final int j;
    private final char[] k;
    private final int l;
    private final int m;
    
    private u(final int j, final char[] k, final int l, final int m) {
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static u a(final String s) {
        return a(s.toCharArray(), 0);
    }
    
    public static u b(final String s) {
        final char[] charArray = s.toCharArray();
        return new u((charArray[0] == '[') ? 9 : 10, charArray, 0, charArray.length);
    }
    
    public static u c(final String s) {
        return a(s.toCharArray(), 0);
    }
    
    public static u[] d(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: invokevirtual   java/lang/String.toCharArray:()[C
        //     9: astore_1       
        //    10: iconst_1       
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: aload_1        
        //    15: iload_2        
        //    16: iinc            2, 1
        //    19: caload         
        //    20: istore          4
        //    22: iload           4
        //    24: bipush          41
        //    26: if_icmpne       32
        //    29: goto            94
        //    32: iload           4
        //    34: bipush          76
        //    36: iload           5
        //    38: ifne            83
        //    41: if_icmpne       75
        //    44: goto            48
        //    47: athrow         
        //    48: aload_1        
        //    49: iload_2        
        //    50: iinc            2, 1
        //    53: caload         
        //    54: bipush          59
        //    56: if_icmpeq       67
        //    59: goto            63
        //    62: athrow         
        //    63: goto            48
        //    66: athrow         
        //    67: iinc            3, 1
        //    70: iload           5
        //    72: ifeq            89
        //    75: iload           4
        //    77: bipush          91
        //    79: goto            83
        //    82: athrow         
        //    83: if_icmpeq       89
        //    86: iinc            3, 1
        //    89: iload           5
        //    91: ifeq            14
        //    94: iload_3        
        //    95: anewarray       Lorg/u;
        //    98: astore          4
        //   100: iconst_1       
        //   101: istore_2       
        //   102: iconst_0       
        //   103: istore_3       
        //   104: aload_1        
        //   105: iload_2        
        //   106: caload         
        //   107: bipush          41
        //   109: if_icmpeq       179
        //   112: aload           4
        //   114: iload           5
        //   116: ifne            181
        //   119: iload_3        
        //   120: aload_1        
        //   121: iload_2        
        //   122: invokestatic    org/u.a:([CI)Lorg/u;
        //   125: aastore        
        //   126: iload_2        
        //   127: aload           4
        //   129: iload_3        
        //   130: aaload         
        //   131: getfield        org/u.m:I
        //   134: aload           4
        //   136: iload_3        
        //   137: aaload         
        //   138: getfield        org/u.j:I
        //   141: iload           5
        //   143: ifne            164
        //   146: goto            150
        //   149: athrow         
        //   150: bipush          10
        //   152: if_icmpne       167
        //   155: goto            159
        //   158: athrow         
        //   159: iconst_2       
        //   160: goto            164
        //   163: athrow         
        //   164: goto            168
        //   167: iconst_0       
        //   168: iadd           
        //   169: iadd           
        //   170: istore_2       
        //   171: iinc            3, 1
        //   174: iload           5
        //   176: ifeq            104
        //   179: aload           4
        //   181: areturn        
        //    StackMapTable: 00 18 FF 00 0E 00 06 07 00 16 07 00 75 01 01 00 01 00 00 FF 00 11 00 06 07 00 16 07 00 75 01 01 01 01 00 00 4E 07 00 72 00 4D 07 00 72 00 42 07 00 72 00 07 46 07 00 72 FF 00 00 00 06 07 00 16 07 00 75 01 01 01 01 00 02 01 01 05 04 FF 00 09 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 00 6C 07 00 72 FF 00 00 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 03 01 01 01 47 07 00 72 FF 00 00 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 02 01 01 43 07 00 72 FF 00 00 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 03 01 01 01 FF 00 02 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 02 01 01 FF 00 00 00 06 07 00 16 07 00 75 01 01 07 00 76 01 00 03 01 01 01 0A 41 07 00 76
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  150    160    163    164    Ljava/lang/RuntimeException;
        //  119    155    158    159    Ljava/lang/RuntimeException;
        //  112    146    149    150    Ljava/lang/RuntimeException;
        //  67     79     82     83     Ljava/lang/RuntimeException;
        //  41     59     62     63     Ljava/lang/RuntimeException;
        //  32     44     47     48     Ljava/lang/RuntimeException;
        //  48     66     66     67     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    public static int e(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iconst_1       
        //     6: istore_1       
        //     7: iconst_1       
        //     8: istore_2       
        //     9: aload_0        
        //    10: iload_2        
        //    11: iinc            2, 1
        //    14: invokevirtual   java/lang/String.charAt:(I)C
        //    17: istore_3       
        //    18: iload_3        
        //    19: bipush          41
        //    21: if_icmpne       107
        //    24: aload_0        
        //    25: iload_2        
        //    26: invokevirtual   java/lang/String.charAt:(I)C
        //    29: istore_3       
        //    30: iload_1        
        //    31: iconst_2       
        //    32: ishl           
        //    33: iload_3        
        //    34: iload           4
        //    36: ifne            110
        //    39: bipush          86
        //    41: iload           4
        //    43: ifne            74
        //    46: goto            50
        //    49: athrow         
        //    50: if_icmpne       62
        //    53: goto            57
        //    56: athrow         
        //    57: iconst_0       
        //    58: goto            105
        //    61: athrow         
        //    62: iload_3        
        //    63: iload           4
        //    65: ifne            101
        //    68: bipush          68
        //    70: goto            74
        //    73: athrow         
        //    74: if_icmpeq       96
        //    77: iload_3        
        //    78: iload           4
        //    80: ifne            101
        //    83: goto            87
        //    86: athrow         
        //    87: bipush          74
        //    89: if_icmpne       104
        //    92: goto            96
        //    95: athrow         
        //    96: iconst_2       
        //    97: goto            101
        //   100: athrow         
        //   101: goto            105
        //   104: iconst_1       
        //   105: ior            
        //   106: ireturn        
        //   107: iload_3        
        //   108: bipush          76
        //   110: iload           4
        //   112: ifne            158
        //   115: if_icmpne       151
        //   118: goto            122
        //   121: athrow         
        //   122: aload_0        
        //   123: iload_2        
        //   124: iinc            2, 1
        //   127: invokevirtual   java/lang/String.charAt:(I)C
        //   130: bipush          59
        //   132: if_icmpeq       143
        //   135: goto            139
        //   138: athrow         
        //   139: goto            122
        //   142: athrow         
        //   143: iinc            1, 1
        //   146: iload           4
        //   148: ifeq            280
        //   151: iload_3        
        //   152: bipush          91
        //   154: goto            158
        //   157: athrow         
        //   158: iload           4
        //   160: ifne            239
        //   163: if_icmpne       232
        //   166: goto            170
        //   169: athrow         
        //   170: aload_0        
        //   171: iload_2        
        //   172: invokevirtual   java/lang/String.charAt:(I)C
        //   175: dup            
        //   176: istore_3       
        //   177: bipush          91
        //   179: if_icmpne       199
        //   182: iinc            2, 1
        //   185: iload           4
        //   187: ifne            227
        //   190: iload           4
        //   192: ifeq            170
        //   195: goto            199
        //   198: athrow         
        //   199: iload_3        
        //   200: bipush          68
        //   202: iload           4
        //   204: ifne            221
        //   207: if_icmpeq       224
        //   210: goto            214
        //   213: athrow         
        //   214: iload_3        
        //   215: bipush          74
        //   217: goto            221
        //   220: athrow         
        //   221: if_icmpne       280
        //   224: iinc            1, -1
        //   227: iload           4
        //   229: ifeq            280
        //   232: iload_3        
        //   233: bipush          68
        //   235: goto            239
        //   238: athrow         
        //   239: iload           4
        //   241: ifne            258
        //   244: if_icmpeq       261
        //   247: goto            251
        //   250: athrow         
        //   251: iload_3        
        //   252: bipush          74
        //   254: goto            258
        //   257: athrow         
        //   258: if_icmpne       273
        //   261: iinc            1, 2
        //   264: iload           4
        //   266: ifeq            280
        //   269: goto            273
        //   272: athrow         
        //   273: iinc            1, 1
        //   276: goto            280
        //   279: athrow         
        //   280: goto            9
        //    StackMapTable: 00 32 FF 00 09 00 05 07 00 16 01 01 00 01 00 00 FF 00 27 00 05 07 00 16 01 01 01 01 00 01 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 03 01 01 01 45 07 00 72 40 01 43 07 00 72 40 01 4A 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 03 01 01 01 4B 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 47 07 00 72 40 01 43 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 42 01 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 01 FF 00 02 00 05 07 00 16 01 01 01 01 00 02 01 01 4A 07 00 72 00 4F 07 00 72 00 42 07 00 72 00 07 45 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 4A 07 00 72 00 5B 07 00 72 00 4D 07 00 72 00 45 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 02 02 04 45 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 4A 07 00 72 00 45 07 00 72 FF 00 00 00 05 07 00 16 01 01 01 01 00 02 01 01 02 4A 07 00 72 00 45 07 00 72 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  261    276    279    280    Ljava/lang/RuntimeException;
        //  258    269    272    273    Ljava/lang/RuntimeException;
        //  244    254    257    258    Ljava/lang/RuntimeException;
        //  239    247    250    251    Ljava/lang/RuntimeException;
        //  227    235    238    239    Ljava/lang/RuntimeException;
        //  207    217    220    221    Ljava/lang/RuntimeException;
        //  199    210    213    214    Ljava/lang/RuntimeException;
        //  182    195    198    199    Ljava/lang/RuntimeException;
        //  158    166    169    170    Ljava/lang/RuntimeException;
        //  143    154    157    158    Ljava/lang/RuntimeException;
        //  115    135    138    139    Ljava/lang/RuntimeException;
        //  110    118    121    122    Ljava/lang/RuntimeException;
        //  87     97     100    101    Ljava/lang/RuntimeException;
        //  77     92     95     96     Ljava/lang/RuntimeException;
        //  74     83     86     87     Ljava/lang/RuntimeException;
        //  62     70     73     74     Ljava/lang/RuntimeException;
        //  50     61     61     62     Ljava/lang/RuntimeException;
        //  39     53     56     57     Ljava/lang/RuntimeException;
        //  30     46     49     50     Ljava/lang/RuntimeException;
        //  122    142    142    143    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
    
    private static u a(final char[] array, final int n) {
        final boolean c = org.f.c;
        Label_0237: {
            Label_0161: {
                try {
                    switch (array[n]) {
                        case 'V': {
                            return u.a;
                        }
                        case 'Z': {
                            break;
                        }
                        case 'C': {
                            return u.c;
                        }
                        case 'B': {
                            return u.d;
                        }
                        case 'S': {
                            return u.e;
                        }
                        case 'I': {
                            return u.f;
                        }
                        case 'F': {
                            return u.g;
                        }
                        case 'J': {
                            return u.h;
                        }
                        case 'D': {
                            return u.i;
                        }
                        case '[': {
                            break Label_0161;
                        }
                        case 'L': {
                            break Label_0237;
                        }
                        default: {
                            return new u(11, array, 0, array.length);
                        }
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return u.b;
            }
            int n2 = 1;
            while (array[n + n2] == '[') {
                try {
                    ++n2;
                    if (c) {
                        return new u(9, array, n, n2 + 1);
                    }
                    if (!c) {
                        continue;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                break;
            }
            try {
                if (array[n + n2] != 'L') {
                    return new u(9, array, n, n2 + 1);
                }
                ++n2;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            while (array[n + n2] != ';') {
                ++n2;
                if (c) {
                    break;
                }
            }
            return new u(9, array, n, n2 + 1);
        }
        int n3 = 1;
        while (array[n + n3] != ';') {
            ++n3;
            if (c) {
                break;
            }
        }
        return new u(10, array, n + 1, n3 - 1);
    }
    
    public int a() {
        return this.j;
    }
    
    public String b() {
        return new String(this.k, this.l, this.m);
    }
    
    public String c() {
        final StringBuffer sb = new StringBuffer();
        this.a(sb);
        return sb.toString();
    }
    
    private void a(final StringBuffer p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: iload_2        
        //     6: ifne            48
        //     9: getfield        org/u.k:[C
        //    12: ifnonnull       43
        //    15: goto            19
        //    18: athrow         
        //    19: aload_1        
        //    20: aload_0        
        //    21: getfield        org/u.l:I
        //    24: ldc             -16777216
        //    26: iand           
        //    27: bipush          24
        //    29: iushr          
        //    30: i2c            
        //    31: invokevirtual   java/lang/StringBuffer.append:(C)Ljava/lang/StringBuffer;
        //    34: pop            
        //    35: iload_2        
        //    36: ifeq            116
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0        
        //    44: goto            48
        //    47: athrow         
        //    48: getfield        org/u.j:I
        //    51: bipush          10
        //    53: if_icmpne       95
        //    56: aload_1        
        //    57: bipush          76
        //    59: invokevirtual   java/lang/StringBuffer.append:(C)Ljava/lang/StringBuffer;
        //    62: pop            
        //    63: aload_1        
        //    64: aload_0        
        //    65: getfield        org/u.k:[C
        //    68: aload_0        
        //    69: getfield        org/u.l:I
        //    72: aload_0        
        //    73: getfield        org/u.m:I
        //    76: invokevirtual   java/lang/StringBuffer.append:([CII)Ljava/lang/StringBuffer;
        //    79: pop            
        //    80: aload_1        
        //    81: bipush          59
        //    83: invokevirtual   java/lang/StringBuffer.append:(C)Ljava/lang/StringBuffer;
        //    86: pop            
        //    87: iload_2        
        //    88: ifeq            116
        //    91: goto            95
        //    94: athrow         
        //    95: aload_1        
        //    96: aload_0        
        //    97: getfield        org/u.k:[C
        //   100: aload_0        
        //   101: getfield        org/u.l:I
        //   104: aload_0        
        //   105: getfield        org/u.m:I
        //   108: invokevirtual   java/lang/StringBuffer.append:([CII)Ljava/lang/StringBuffer;
        //   111: pop            
        //   112: goto            116
        //   115: athrow         
        //   116: return         
        //    StackMapTable: 00 0A FF 00 12 00 03 07 00 08 07 00 14 01 00 01 07 00 72 00 56 07 00 72 00 43 07 00 72 40 07 00 08 6D 07 00 72 00 53 07 00 72 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  56     112    115    116    Ljava/lang/RuntimeException;
        //  48     91     94     95     Ljava/lang/RuntimeException;
        //  19     44     47     48     Ljava/lang/RuntimeException;
        //  9      39     42     43     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: iload           6
        //     8: ifne            23
        //    11: aload_1        
        //    12: if_acmpne       22
        //    15: goto            19
        //    18: athrow         
        //    19: iconst_1       
        //    20: ireturn        
        //    21: athrow         
        //    22: aload_1        
        //    23: iload           6
        //    25: ifne            42
        //    28: instanceof      Lorg/u;
        //    31: ifne            41
        //    34: goto            38
        //    37: athrow         
        //    38: iconst_0       
        //    39: ireturn        
        //    40: athrow         
        //    41: aload_1        
        //    42: checkcast       Lorg/u;
        //    45: astore_2       
        //    46: aload_0        
        //    47: getfield        org/u.j:I
        //    50: aload_2        
        //    51: getfield        org/u.j:I
        //    54: iload           6
        //    56: ifne            84
        //    59: if_icmpeq       69
        //    62: goto            66
        //    65: athrow         
        //    66: iconst_0       
        //    67: ireturn        
        //    68: athrow         
        //    69: aload_0        
        //    70: getfield        org/u.j:I
        //    73: iload           6
        //    75: ifne            191
        //    78: bipush          9
        //    80: goto            84
        //    83: athrow         
        //    84: if_icmplt       190
        //    87: aload_0        
        //    88: getfield        org/u.m:I
        //    91: iload           6
        //    93: ifne            118
        //    96: goto            100
        //    99: athrow         
        //   100: aload_2        
        //   101: getfield        org/u.m:I
        //   104: if_icmpeq       114
        //   107: goto            111
        //   110: athrow         
        //   111: iconst_0       
        //   112: ireturn        
        //   113: athrow         
        //   114: aload_0        
        //   115: getfield        org/u.l:I
        //   118: istore_3       
        //   119: aload_2        
        //   120: getfield        org/u.l:I
        //   123: istore          4
        //   125: iload_3        
        //   126: aload_0        
        //   127: getfield        org/u.m:I
        //   130: iadd           
        //   131: istore          5
        //   133: iload_3        
        //   134: iload           5
        //   136: if_icmpge       190
        //   139: aload_0        
        //   140: getfield        org/u.k:[C
        //   143: iload_3        
        //   144: caload         
        //   145: iload           6
        //   147: ifne            191
        //   150: iload           6
        //   152: ifne            178
        //   155: goto            159
        //   158: athrow         
        //   159: aload_2        
        //   160: getfield        org/u.k:[C
        //   163: iload           4
        //   165: caload         
        //   166: if_icmpeq       179
        //   169: goto            173
        //   172: athrow         
        //   173: iconst_0       
        //   174: goto            178
        //   177: athrow         
        //   178: ireturn        
        //   179: iinc            3, 1
        //   182: iinc            4, 1
        //   185: iload           6
        //   187: ifeq            133
        //   190: iconst_1       
        //   191: ireturn        
        //    StackMapTable: 00 21 FF 00 12 00 07 07 00 08 07 00 27 00 00 00 00 01 00 01 07 00 72 00 41 07 00 72 00 40 07 00 27 4D 07 00 72 00 41 07 00 72 00 40 07 00 27 FF 00 16 00 07 07 00 08 07 00 27 07 00 08 00 00 00 01 00 01 07 00 72 00 41 07 00 72 00 4D 07 00 72 FF 00 00 00 07 07 00 08 07 00 27 07 00 08 00 00 00 01 00 02 01 01 4E 07 00 72 40 01 49 07 00 72 00 41 07 00 72 00 43 01 FF 00 0E 00 07 07 00 08 07 00 27 07 00 08 01 01 01 01 00 00 58 07 00 72 40 01 4C 07 00 72 00 43 07 00 72 40 01 00 FF 00 0A 00 07 07 00 08 07 00 27 07 00 08 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  159    174    177    178    Ljava/lang/RuntimeException;
        //  150    169    172    173    Ljava/lang/RuntimeException;
        //  139    155    158    159    Ljava/lang/RuntimeException;
        //  100    113    113    114    Ljava/lang/RuntimeException;
        //  87     107    110    111    Ljava/lang/RuntimeException;
        //  84     96     99     100    Ljava/lang/RuntimeException;
        //  69     80     83     84     Ljava/lang/RuntimeException;
        //  59     68     68     69     Ljava/lang/RuntimeException;
        //  46     62     65     66     Ljava/lang/RuntimeException;
        //  28     40     40     41     Ljava/lang/RuntimeException;
        //  23     34     37     38     Ljava/lang/RuntimeException;
        //  11     21     21     22     Ljava/lang/RuntimeException;
        //  5      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    public int hashCode() {
        final boolean c = org.f.c;
        int n = 13 * this.j;
        int n2 = 0;
        try {
            final int j = this.j;
            if (c) {
                return n2;
            }
            if (j < 9) {
                return n2;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        int i = this.l;
        while (i < i + this.m) {
            n2 = 17 * (n + this.k[i]);
            if (c) {
                break;
            }
            n = n2;
            ++i;
            if (c) {
                break;
            }
        }
        return n2;
    }
    
    @Override
    public String toString() {
        return this.c();
    }
    
    static {
        a = new u(0, null, 1443168256, 1);
        b = new u(1, null, 1509950721, 1);
        c = new u(2, null, 1124075009, 1);
        d = new u(3, null, 1107297537, 1);
        e = new u(4, null, 1392510721, 1);
        f = new u(5, null, 1224736769, 1);
        g = new u(6, null, 1174536705, 1);
        h = new u(7, null, 1241579778, 1);
        i = new u(8, null, 1141048066, 1);
    }
}
