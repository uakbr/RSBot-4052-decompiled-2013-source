
package org.powerbot.core.script.job.util;

import org.powerbot.core.script.job.Container;

public class Containers
{
    public static boolean a;
    
    public static boolean awaitTermination(final Container container) {
        return awaitTermination(container, 0);
    }
    
    public static boolean awaitTermination(final Container p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: aload_0        
        //     6: iload           11
        //     8: ifne            33
        //    11: invokeinterface org/powerbot/core/script/job/Container.isTerminated:()Z
        //    16: ifeq            26
        //    19: goto            23
        //    22: athrow         
        //    23: iconst_1       
        //    24: ireturn        
        //    25: athrow         
        //    26: new             Ljava/lang/Object;
        //    29: dup            
        //    30: invokespecial   java/lang/Object.<init>:()V
        //    33: astore_2       
        //    34: new             Lorg/powerbot/core/script/job/util/Containers$1;
        //    37: dup            
        //    38: aload_2        
        //    39: invokespecial   org/powerbot/core/script/job/util/Containers$1.<init>:(Ljava/lang/Object;)V
        //    42: astore_3       
        //    43: aload_0        
        //    44: aload_3        
        //    45: invokeinterface org/powerbot/core/script/job/Container.addListener:(Lorg/powerbot/core/script/job/JobListener;)V
        //    50: invokestatic    java/lang/System.currentTimeMillis:()J
        //    53: iload_1        
        //    54: i2l            
        //    55: ladd           
        //    56: lstore          4
        //    58: iload_1        
        //    59: ifeq            89
        //    62: invokestatic    java/lang/System.currentTimeMillis:()J
        //    65: lload           4
        //    67: lcmp           
        //    68: iload           11
        //    70: ifne            99
        //    73: iload           11
        //    75: ifne            215
        //    78: goto            82
        //    81: athrow         
        //    82: ifge            202
        //    85: goto            89
        //    88: athrow         
        //    89: aload_0        
        //    90: invokeinterface org/powerbot/core/script/job/Container.isTerminated:()Z
        //    95: goto            99
        //    98: athrow         
        //    99: iload           11
        //   101: ifne            215
        //   104: ifne            202
        //   107: goto            111
        //   110: athrow         
        //   111: iload_1        
        //   112: ifne            129
        //   115: goto            119
        //   118: athrow         
        //   119: ldc2_w          500
        //   122: lstore          6
        //   124: iload           11
        //   126: ifeq            152
        //   129: invokestatic    java/lang/System.currentTimeMillis:()J
        //   132: lstore          8
        //   134: lload           4
        //   136: lload           8
        //   138: lsub           
        //   139: lstore          6
        //   141: lload           6
        //   143: lconst_0       
        //   144: lcmp           
        //   145: ifgt            152
        //   148: goto            202
        //   151: athrow         
        //   152: aload_2        
        //   153: dup            
        //   154: astore          8
        //   156: monitorenter   
        //   157: aload_2        
        //   158: lload           6
        //   160: invokevirtual   java/lang/Object.wait:(J)V
        //   163: goto            183
        //   166: astore          9
        //   168: aload_0        
        //   169: aload_3        
        //   170: invokeinterface org/powerbot/core/script/job/Container.removeListener:(Lorg/powerbot/core/script/job/JobListener;)V
        //   175: new             Ljava/lang/ThreadDeath;
        //   178: dup            
        //   179: invokespecial   java/lang/ThreadDeath.<init>:()V
        //   182: athrow         
        //   183: aload           8
        //   185: monitorexit    
        //   186: goto            197
        //   189: astore          10
        //   191: aload           8
        //   193: monitorexit    
        //   194: aload           10
        //   196: athrow         
        //   197: iload           11
        //   199: ifeq            58
        //   202: aload_0        
        //   203: aload_3        
        //   204: invokeinterface org/powerbot/core/script/job/Container.removeListener:(Lorg/powerbot/core/script/job/JobListener;)V
        //   209: aload_0        
        //   210: invokeinterface org/powerbot/core/script/job/Container.isTerminated:()Z
        //   215: ireturn        
        //    StackMapTable: 00 19 FF 00 16 00 0C 07 00 1B 01 00 00 00 00 00 00 00 00 00 01 00 01 07 00 0C 00 41 07 00 0C 00 46 07 00 04 FF 00 18 00 0B 07 00 1B 01 07 00 04 07 00 05 04 00 00 00 00 00 01 00 00 56 07 00 0C 40 01 45 07 00 0C 00 48 07 00 0C 40 01 4A 07 00 0C 00 46 07 00 0C 00 09 FF 00 15 00 09 07 00 1B 01 07 00 04 07 00 05 04 04 04 00 01 00 01 07 00 0C FF 00 00 00 0A 07 00 1B 01 07 00 04 07 00 05 04 04 00 00 00 01 00 00 FF 00 0D 00 0A 07 00 1B 01 07 00 04 07 00 05 04 04 07 00 04 00 00 01 00 01 07 00 0C 10 45 07 00 3A 07 FF 00 04 00 0B 07 00 1B 01 07 00 04 07 00 05 04 00 00 00 00 00 01 00 00 4C 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  141    151    151    152    Ljava/lang/InterruptedException;
        //  104    115    118    119    Ljava/lang/InterruptedException;
        //  99     107    110    111    Ljava/lang/InterruptedException;
        //  82     95     98     99     Ljava/lang/InterruptedException;
        //  73     85     88     89     Ljava/lang/InterruptedException;
        //  62     78     81     82     Ljava/lang/InterruptedException;
        //  11     25     25     26     Ljava/lang/InterruptedException;
        //  5      19     22     23     Ljava/lang/InterruptedException;
        //  157    163    166    183    Ljava/lang/InterruptedException;
        //  157    186    189    197    Any
        //  189    194    189    197    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
