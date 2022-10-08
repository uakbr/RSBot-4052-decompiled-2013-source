
package org;

class m
{
    o a;
    o b;
    o c;
    String d;
    int e;
    m f;
    
    static m a(final m p0, final o p1, final o p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_0        
        //     6: iload           8
        //     8: ifne            35
        //    11: ifnonnull       21
        //    14: goto            18
        //    17: athrow         
        //    18: aconst_null    
        //    19: areturn        
        //    20: athrow         
        //    21: aload_0        
        //    22: aload_0        
        //    23: getfield        org/m.f:Lorg/m;
        //    26: aload_1        
        //    27: aload_2        
        //    28: invokestatic    org/m.a:(Lorg/m;Lorg/o;Lorg/o;)Lorg/m;
        //    31: putfield        org/m.f:Lorg/m;
        //    34: aload_0        
        //    35: getfield        org/m.a:Lorg/o;
        //    38: getfield        org/o.c:I
        //    41: istore_3       
        //    42: aload_0        
        //    43: getfield        org/m.b:Lorg/o;
        //    46: getfield        org/o.c:I
        //    49: istore          4
        //    51: aload_1        
        //    52: getfield        org/o.c:I
        //    55: istore          5
        //    57: aload_2        
        //    58: iload           8
        //    60: ifne            77
        //    63: ifnonnull       76
        //    66: goto            70
        //    69: athrow         
        //    70: ldc             2147483647
        //    72: goto            80
        //    75: athrow         
        //    76: aload_2        
        //    77: getfield        org/o.c:I
        //    80: istore          6
        //    82: iload           5
        //    84: iload           4
        //    86: iload           8
        //    88: ifne            105
        //    91: if_icmpge       267
        //    94: goto            98
        //    97: athrow         
        //    98: iload           6
        //   100: iload_3        
        //   101: goto            105
        //   104: athrow         
        //   105: iload           8
        //   107: ifne            124
        //   110: if_icmple       267
        //   113: goto            117
        //   116: athrow         
        //   117: iload           5
        //   119: iload_3        
        //   120: goto            124
        //   123: athrow         
        //   124: iload           8
        //   126: ifne            179
        //   129: if_icmpgt       171
        //   132: goto            136
        //   135: athrow         
        //   136: iload           6
        //   138: iload           4
        //   140: if_icmplt       157
        //   143: goto            147
        //   146: athrow         
        //   147: aload_0        
        //   148: getfield        org/m.f:Lorg/m;
        //   151: astore_0       
        //   152: iload           8
        //   154: ifeq            267
        //   157: aload_0        
        //   158: aload_2        
        //   159: putfield        org/m.a:Lorg/o;
        //   162: iload           8
        //   164: ifeq            267
        //   167: goto            171
        //   170: athrow         
        //   171: iload           6
        //   173: iload           4
        //   175: goto            179
        //   178: athrow         
        //   179: if_icmplt       196
        //   182: aload_0        
        //   183: aload_1        
        //   184: putfield        org/m.b:Lorg/o;
        //   187: iload           8
        //   189: ifeq            267
        //   192: goto            196
        //   195: athrow         
        //   196: new             Lorg/m;
        //   199: dup            
        //   200: invokespecial   org/m.<init>:()V
        //   203: astore          7
        //   205: aload           7
        //   207: aload_2        
        //   208: putfield        org/m.a:Lorg/o;
        //   211: aload           7
        //   213: aload_0        
        //   214: getfield        org/m.b:Lorg/o;
        //   217: putfield        org/m.b:Lorg/o;
        //   220: aload           7
        //   222: aload_0        
        //   223: getfield        org/m.c:Lorg/o;
        //   226: putfield        org/m.c:Lorg/o;
        //   229: aload           7
        //   231: aload_0        
        //   232: getfield        org/m.d:Ljava/lang/String;
        //   235: putfield        org/m.d:Ljava/lang/String;
        //   238: aload           7
        //   240: aload_0        
        //   241: getfield        org/m.e:I
        //   244: putfield        org/m.e:I
        //   247: aload           7
        //   249: aload_0        
        //   250: getfield        org/m.f:Lorg/m;
        //   253: putfield        org/m.f:Lorg/m;
        //   256: aload_0        
        //   257: aload_1        
        //   258: putfield        org/m.b:Lorg/o;
        //   261: aload_0        
        //   262: aload           7
        //   264: putfield        org/m.f:Lorg/m;
        //   267: aload_0        
        //   268: areturn        
        //    StackMapTable: 00 1F FF 00 11 00 09 07 00 08 07 00 21 07 00 21 00 00 00 00 00 01 00 01 07 00 2F 00 41 07 00 2F 00 4D 07 00 08 FF 00 21 00 09 07 00 08 07 00 21 07 00 21 01 01 01 00 00 01 00 01 07 00 2F 00 44 07 00 2F 00 40 07 00 21 42 01 FF 00 10 00 09 07 00 08 07 00 21 07 00 21 01 01 01 01 00 01 00 01 07 00 2F 00 45 07 00 2F FF 00 00 00 09 07 00 08 07 00 21 07 00 21 01 01 01 01 00 01 00 02 01 01 4A 07 00 2F 00 45 07 00 2F FF 00 00 00 09 07 00 08 07 00 21 07 00 21 01 01 01 01 00 01 00 02 01 01 4A 07 00 2F 00 49 07 00 2F 00 09 4C 07 00 2F 00 46 07 00 2F FF 00 00 00 09 07 00 08 07 00 21 07 00 21 01 01 01 01 00 01 00 02 01 01 4F 07 00 2F 00 FB 00 46
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  179    192    195    196    Ljava/lang/RuntimeException;
        //  157    175    178    179    Ljava/lang/RuntimeException;
        //  152    167    170    171    Ljava/lang/RuntimeException;
        //  129    143    146    147    Ljava/lang/RuntimeException;
        //  124    132    135    136    Ljava/lang/RuntimeException;
        //  110    120    123    124    Ljava/lang/RuntimeException;
        //  105    113    116    117    Ljava/lang/RuntimeException;
        //  91     101    104    105    Ljava/lang/RuntimeException;
        //  82     94     97     98     Ljava/lang/RuntimeException;
        //  63     75     75     76     Ljava/lang/RuntimeException;
        //  57     66     69     70     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  5      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0157:
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
}
