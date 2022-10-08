
package org.powerbot.game.api.util;

public class Time
{
    public static String format(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          15
        //     5: new             Ljava/lang/StringBuilder;
        //     8: dup            
        //     9: invokespecial   java/lang/StringBuilder.<init>:()V
        //    12: astore_2       
        //    13: lload_0        
        //    14: ldc2_w          1000
        //    17: ldiv           
        //    18: lstore_3       
        //    19: lload_3        
        //    20: ldc2_w          60
        //    23: ldiv           
        //    24: lstore          5
        //    26: lload           5
        //    28: ldc2_w          60
        //    31: ldiv           
        //    32: lstore          7
        //    34: lload           7
        //    36: ldc2_w          24
        //    39: ldiv           
        //    40: lstore          9
        //    42: lload_3        
        //    43: l2i            
        //    44: bipush          60
        //    46: irem           
        //    47: istore          11
        //    49: lload           5
        //    51: l2i            
        //    52: bipush          60
        //    54: irem           
        //    55: istore          12
        //    57: lload           7
        //    59: l2i            
        //    60: bipush          24
        //    62: irem           
        //    63: istore          13
        //    65: lload           9
        //    67: l2i            
        //    68: istore          14
        //    70: iload           14
        //    72: iload           15
        //    74: ifne            128
        //    77: ifle            126
        //    80: goto            84
        //    83: athrow         
        //    84: iload           14
        //    86: bipush          10
        //    88: if_icmpge       109
        //    91: goto            95
        //    94: athrow         
        //    95: aload_2        
        //    96: ldc             "Z"
        //    98: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: goto            109
        //   108: athrow         
        //   109: aload_2        
        //   110: iload           14
        //   112: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: aload_2        
        //   117: ldc             "C"
        //   119: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: pop            
        //   126: iload           13
        //   128: bipush          10
        //   130: iload           15
        //   132: ifne            177
        //   135: if_icmpge       156
        //   138: goto            142
        //   141: athrow         
        //   142: aload_2        
        //   143: ldc             "Z"
        //   145: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: pop            
        //   152: goto            156
        //   155: athrow         
        //   156: aload_2        
        //   157: iload           13
        //   159: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   162: pop            
        //   163: aload_2        
        //   164: ldc             "C"
        //   166: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   169: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   172: pop            
        //   173: iload           12
        //   175: bipush          10
        //   177: iload           15
        //   179: ifne            233
        //   182: if_icmpge       203
        //   185: goto            189
        //   188: athrow         
        //   189: aload_2        
        //   190: ldc             "Z"
        //   192: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: pop            
        //   199: goto            203
        //   202: athrow         
        //   203: aload_2        
        //   204: iload           12
        //   206: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   209: pop            
        //   210: aload_2        
        //   211: ldc             "C"
        //   213: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: pop            
        //   220: iload           15
        //   222: ifne            257
        //   225: iload           11
        //   227: bipush          10
        //   229: goto            233
        //   232: athrow         
        //   233: if_icmpge       250
        //   236: aload_2        
        //   237: ldc             "Z"
        //   239: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   245: pop            
        //   246: goto            250
        //   249: athrow         
        //   250: aload_2        
        //   251: iload           11
        //   253: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   256: pop            
        //   257: aload_2        
        //   258: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   261: iload           15
        //   263: ifeq            279
        //   266: getstatic       org/powerbot/core/script/job/Task.a:I
        //   269: istore          16
        //   271: iinc            16, 1
        //   274: iload           16
        //   276: putstatic       org/powerbot/core/script/job/Task.a:I
        //   279: areturn        
        //    StackMapTable: 00 17 FF 00 53 00 0B 04 07 00 02 04 04 04 04 01 01 01 01 01 00 01 07 00 45 00 49 07 00 45 00 4C 07 00 45 00 10 41 01 4C 07 00 45 00 4C 07 00 45 00 FF 00 14 00 0B 04 07 00 02 04 04 04 04 01 01 01 01 01 00 02 01 01 4A 07 00 45 00 4C 07 00 45 00 5C 07 00 45 FF 00 00 00 0B 04 07 00 02 04 04 04 04 01 01 01 01 01 00 02 01 01 4F 07 00 45 00 06 55 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  233    246    249    250    Ljava/lang/RuntimeException;
        //  203    229    232    233    Ljava/lang/RuntimeException;
        //  182    199    202    203    Ljava/lang/RuntimeException;
        //  177    185    188    189    Ljava/lang/RuntimeException;
        //  135    152    155    156    Ljava/lang/RuntimeException;
        //  128    138    141    142    Ljava/lang/RuntimeException;
        //  84     105    108    109    Ljava/lang/RuntimeException;
        //  77     91     94     95     Ljava/lang/RuntimeException;
        //  70     80     83     84     Ljava/lang/RuntimeException;
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
    
    public static String e(final String s) {
        final int n = 3;
        final int n2 = n << n ^ 0x5;
        final int n3 = (0x3 ^ 0x5) << 3 ^ 0x4;
        final int length = s.length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] value = array;
        final char c = (char)n3;
        final int n5 = n2;
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
