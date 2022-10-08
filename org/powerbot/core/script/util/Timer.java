
package org.powerbot.core.script.util;

import org.powerbot.core.script.job.Task;

public class Timer
{
    private final long start;
    private final long period;
    private long end;
    public static boolean a;
    
    public Timer(final long n) {
        final boolean a = Timer.a;
        this.period = n * 1000000L;
        this.start = System.nanoTime();
        this.end = this.start + this.period;
        if (Task.a != 0) {
            boolean a2 = false;
            Label_0053: {
                try {
                    if (a) {
                        a2 = false;
                        break Label_0053;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                a2 = true;
            }
            Timer.a = a2;
        }
    }
    
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
        //    96: ldc             "z"
        //    98: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   101: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   104: pop            
        //   105: goto            109
        //   108: athrow         
        //   109: aload_2        
        //   110: iload           14
        //   112: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   115: pop            
        //   116: aload_2        
        //   117: ldc             "b"
        //   119: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
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
        //   143: ldc             "z"
        //   145: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   148: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   151: pop            
        //   152: goto            156
        //   155: athrow         
        //   156: aload_2        
        //   157: iload           13
        //   159: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   162: pop            
        //   163: aload_2        
        //   164: ldc             "b"
        //   166: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
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
        //   190: ldc             "z"
        //   192: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   195: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   198: pop            
        //   199: goto            203
        //   202: athrow         
        //   203: aload_2        
        //   204: iload           12
        //   206: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   209: pop            
        //   210: aload_2        
        //   211: ldc             "b"
        //   213: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
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
        //   237: ldc             "z"
        //   239: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
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
        //    StackMapTable: 00 17 FF 00 53 00 0B 04 07 00 08 04 04 04 04 01 01 01 01 01 00 01 07 00 69 00 49 07 00 69 00 4C 07 00 69 00 10 41 01 4C 07 00 69 00 4C 07 00 69 00 FF 00 14 00 0B 04 07 00 08 04 04 04 04 01 01 01 01 01 00 02 01 01 4A 07 00 69 00 4C 07 00 69 00 5C 07 00 69 FF 00 00 00 0B 04 07 00 08 04 04 04 04 01 01 01 01 01 00 02 01 01 4F 07 00 69 00 06 55 07 00 45
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
    
    public long getElapsed() {
        return (System.nanoTime() - this.start) / 1000000L;
    }
    
    public long getRemaining() {
        Timer timer = null;
        Label_0017: {
            try {
                timer = this;
                if (Timer.a) {
                    return (timer.end - System.nanoTime()) / 1000000L;
                }
                final boolean b = this.isRunning();
                if (b) {
                    break Label_0017;
                }
                return 0L;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = this.isRunning();
                if (!b) {
                    return 0L;
                }
                timer = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return (timer.end - System.nanoTime()) / 1000000L;
    }
    
    public boolean isRunning() {
        long n = 0L;
        Label_0025: {
            try {
                n = lcmp(System.nanoTime(), this.end);
                if (Timer.a) {
                    return n != 0L;
                }
                if (n >= 0) {
                    break Label_0025;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return n != 0L;
        }
        return n != 0L;
    }
    
    public void reset() {
        this.end = System.nanoTime() + this.period;
    }
    
    public long setEndIn(final long n) {
        return this.end = System.nanoTime() + n * 1000000L;
    }
    
    public String toElapsedString() {
        return format(this.getElapsed());
    }
    
    public String toRemainingString() {
        return format(this.getRemaining());
    }
    
    public static String e(final String s) {
        final int n = 4 << 3 ^ 0x3;
        final int n2 = 1 << 3 ^ 0x2;
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int i = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            i = n3;
        }
        return new String(value);
    }
}
