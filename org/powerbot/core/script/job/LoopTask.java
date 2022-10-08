
package org.powerbot.core.script.job;

public abstract class LoopTask extends Task
{
    private boolean paused;
    public static int b;
    
    @Override
    public final void execute() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   org/powerbot/core/script/job/LoopTask.getContainer:()Lorg/powerbot/core/script/job/Container;
        //     8: invokeinterface org/powerbot/core/script/job/Container.isShutdown:()Z
        //    13: ifne            116
        //    16: aload_0        
        //    17: invokevirtual   org/powerbot/core/script/job/LoopTask.getContainer:()Lorg/powerbot/core/script/job/Container;
        //    20: invokeinterface org/powerbot/core/script/job/Container.isPaused:()Z
        //    25: iload_3        
        //    26: ifne            64
        //    29: ifeq            55
        //    32: goto            36
        //    35: athrow         
        //    36: aload_0        
        //    37: iconst_1       
        //    38: putfield        org/powerbot/core/script/job/LoopTask.paused:Z
        //    41: sipush          1000
        //    44: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //    47: iload_3        
        //    48: ifeq            4
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0        
        //    56: iconst_0       
        //    57: putfield        org/powerbot/core/script/job/LoopTask.paused:Z
        //    60: aload_0        
        //    61: invokevirtual   org/powerbot/core/script/job/LoopTask.loop:()I
        //    64: istore_1       
        //    65: goto            75
        //    68: astore_2       
        //    69: aload_2        
        //    70: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //    73: iconst_m1      
        //    74: istore_1       
        //    75: iload_1        
        //    76: iload_3        
        //    77: ifne            104
        //    80: iflt            99
        //    83: goto            87
        //    86: athrow         
        //    87: iload_1        
        //    88: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //    91: iload_3        
        //    92: ifeq            112
        //    95: goto            99
        //    98: athrow         
        //    99: iload_1        
        //   100: goto            104
        //   103: athrow         
        //   104: iconst_m1      
        //   105: if_icmpne       112
        //   108: goto            116
        //   111: athrow         
        //   112: iload_3        
        //   113: ifeq            4
        //   116: return         
        //    StackMapTable: 00 11 FE 00 04 00 00 01 5E 07 00 08 00 51 07 00 08 00 48 01 43 07 00 08 FF 00 06 00 04 07 00 0A 01 00 01 00 00 4A 07 00 08 00 4A 07 00 08 00 43 07 00 08 40 01 46 07 00 08 00 FF 00 03 00 04 07 00 0A 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  29     51     54     55     Ljava/lang/Throwable;
        //  16     32     35     36     Ljava/lang/Throwable;
        //  60     65     68     75     Ljava/lang/Throwable;
        //  104    111    111    112    Ljava/lang/Throwable;
        //  87     100    103    104    Ljava/lang/Throwable;
        //  80     95     98     99     Ljava/lang/Throwable;
        //  75     83     86     87     Ljava/lang/Throwable;
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
    
    public abstract int loop();
    
    public boolean isPaused() {
        return this.paused;
    }
}
