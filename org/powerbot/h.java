
package org.powerbot;

import org.p;
import org.f;

public class h extends f
{
    private final a_[] d;
    
    public h(final f f, final a_[] d) {
        super(262144, f);
        this.d = d;
    }
    
    @Override
    public p a(final int p0, final String p1, final String p2, final String p3, final String[] p4) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: getfield        org/powerbot/h.d:[Lorg/powerbot/h$a_;
        //     9: astore          6
        //    11: aload           6
        //    13: arraylength    
        //    14: istore          7
        //    16: iconst_0       
        //    17: istore          8
        //    19: iload           8
        //    21: iload           7
        //    23: if_icmpge       182
        //    26: aload           6
        //    28: iload           8
        //    30: aaload         
        //    31: astore          9
        //    33: iload           10
        //    35: ifne            177
        //    38: aload           9
        //    40: getfield        org/powerbot/h$a_.a:Ljava/lang/String;
        //    43: aload_2        
        //    44: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    47: ifeq            174
        //    50: goto            54
        //    53: athrow         
        //    54: aload           9
        //    56: getfield        org/powerbot/h$a_.b:Ljava/lang/String;
        //    59: ldc             ""
        //    61: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    64: iload           10
        //    66: ifne            93
        //    69: goto            73
        //    72: athrow         
        //    73: ifne            96
        //    76: goto            80
        //    79: athrow         
        //    80: aload           9
        //    82: getfield        org/powerbot/h$a_.b:Ljava/lang/String;
        //    85: aload_3        
        //    86: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    89: goto            93
        //    92: athrow         
        //    93: ifeq            174
        //    96: aload_0        
        //    97: aload           9
        //    99: iload           10
        //   101: ifne            126
        //   104: goto            108
        //   107: athrow         
        //   108: getfield        org/powerbot/h$a_.c:I
        //   111: iconst_m1      
        //   112: if_icmpne       124
        //   115: goto            119
        //   118: athrow         
        //   119: iload_1        
        //   120: goto            129
        //   123: athrow         
        //   124: aload           9
        //   126: getfield        org/powerbot/h$a_.c:I
        //   129: aload           9
        //   131: getfield        org/powerbot/h$a_.d:Ljava/lang/String;
        //   134: aload           9
        //   136: iload           10
        //   138: ifne            163
        //   141: getfield        org/powerbot/h$a_.e:Ljava/lang/String;
        //   144: ldc             ""
        //   146: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   149: ifeq            161
        //   152: goto            156
        //   155: athrow         
        //   156: aload_3        
        //   157: goto            166
        //   160: athrow         
        //   161: aload           9
        //   163: getfield        org/powerbot/h$a_.e:Ljava/lang/String;
        //   166: aload           4
        //   168: aload           5
        //   170: invokespecial   org/f.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/p;
        //   173: areturn        
        //   174: iinc            8, 1
        //   177: iload           10
        //   179: ifeq            19
        //   182: aload_0        
        //   183: iload_1        
        //   184: aload_2        
        //   185: aload_3        
        //   186: aload           4
        //   188: aload           5
        //   190: invokespecial   org/f.a:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lorg/p;
        //   193: areturn        
        //    StackMapTable: 00 1B FF 00 13 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 00 01 00 00 FF 00 21 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 01 07 00 35 00 51 07 00 35 40 01 45 07 00 35 00 4B 07 00 35 40 01 02 4A 07 00 35 FF 00 00 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 02 07 00 0C 07 00 0E 49 07 00 35 40 07 00 0C 43 07 00 35 40 07 00 0C FF 00 01 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 02 07 00 0C 07 00 0E FF 00 02 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 02 07 00 0C 01 59 07 00 35 FF 00 00 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 03 07 00 0C 01 07 00 1B 43 07 00 35 FF 00 00 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 03 07 00 0C 01 07 00 1B FF 00 01 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 04 07 00 0C 01 07 00 1B 07 00 0E FF 00 02 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 07 00 0E 01 00 04 07 00 0C 01 07 00 1B 07 00 1B 07 02 FF 00 04 00 0B 07 00 0C 01 07 00 1B 07 00 1B 07 00 1B 07 00 39 07 00 38 01 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  141    160    160    161    Ljava/lang/RuntimeException;
        //  129    152    155    156    Ljava/lang/RuntimeException;
        //  108    123    123    124    Ljava/lang/RuntimeException;
        //  96     115    118    119    Ljava/lang/RuntimeException;
        //  93     104    107    108    Ljava/lang/RuntimeException;
        //  73     89     92     93     Ljava/lang/RuntimeException;
        //  54     76     79     80     Ljava/lang/RuntimeException;
        //  38     69     72     73     Ljava/lang/RuntimeException;
        //  33     50     53     54     Ljava/lang/RuntimeException;
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
    
    public static class a_
    {
        public String a;
        public String b;
        public int c;
        public String d;
        public String e;
    }
}
