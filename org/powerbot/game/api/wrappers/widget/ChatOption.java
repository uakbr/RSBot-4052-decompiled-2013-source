
package org.powerbot.game.api.wrappers.widget;

import org.powerbot.core.script.job.Task;
import org.o;

public class ChatOption
{
    private int number;
    private WidgetChild child;
    private static final String z;
    
    public ChatOption(final int number, final WidgetChild child) {
        this.number = number;
        this.child = child;
    }
    
    public int getOptionNumber() {
        return this.number;
    }
    
    public WidgetChild getWidgetChild() {
        return this.child;
    }
    
    public boolean revalidate(final boolean p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.child:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //     9: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getParent:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    12: astore_3       
        //    13: aload_3        
        //    14: iload           4
        //    16: ifne            42
        //    19: ifnull          41
        //    22: goto            26
        //    25: athrow         
        //    26: aload_3        
        //    27: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //    30: aload_0        
        //    31: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.child:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    34: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //    37: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    40: astore_3       
        //    41: aload_3        
        //    42: ifnull          119
        //    45: iload_1        
        //    46: iload           4
        //    48: ifne            83
        //    51: goto            55
        //    54: athrow         
        //    55: ifeq            82
        //    58: goto            62
        //    61: athrow         
        //    62: aload_3        
        //    63: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    66: iload           4
        //    68: ifne            83
        //    71: goto            75
        //    74: athrow         
        //    75: ifeq            119
        //    78: goto            82
        //    81: athrow         
        //    82: iload_2        
        //    83: iload           4
        //    85: ifne            116
        //    88: ifeq            115
        //    91: goto            95
        //    94: athrow         
        //    95: aload_3        
        //    96: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.visible:()Z
        //    99: iload           4
        //   101: ifne            116
        //   104: goto            108
        //   107: athrow         
        //   108: ifeq            119
        //   111: goto            115
        //   114: athrow         
        //   115: iconst_1       
        //   116: goto            120
        //   119: iconst_0       
        //   120: ireturn        
        //    StackMapTable: 00 16 FF 00 19 00 05 07 00 18 01 01 07 00 2F 01 00 01 07 00 7E 00 0E 40 07 00 2F 4B 07 00 7E 40 01 45 07 00 7E 00 4B 07 00 7E 40 01 45 07 00 7E 00 40 01 4A 07 00 7E 00 4B 07 00 7E 40 01 45 07 00 7E 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  95     111    114    115    Ljava/lang/RuntimeException;
        //  88     104    107    108    Ljava/lang/RuntimeException;
        //  83     91     94     95     Ljava/lang/RuntimeException;
        //  62     78     81     82     Ljava/lang/RuntimeException;
        //  55     71     74     75     Ljava/lang/RuntimeException;
        //  45     58     61     62     Ljava/lang/RuntimeException;
        //  42     51     54     55     Ljava/lang/RuntimeException;
        //  13     22     25     26     Ljava/lang/RuntimeException;
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
    
    public int select(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_1        
        //     5: iload_2        
        //     6: ifne            66
        //     9: ifeq            58
        //    12: goto            16
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.number:I
        //    20: iload_2        
        //    21: ifne            49
        //    24: goto            28
        //    27: athrow         
        //    28: iconst_m1      
        //    29: if_icmpne       45
        //    32: goto            36
        //    35: athrow         
        //    36: ldc             "s"
        //    38: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //    41: goto            52
        //    44: athrow         
        //    45: aload_0        
        //    46: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.number:I
        //    49: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //    52: iconst_0       
        //    53: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //    56: iconst_0       
        //    57: ireturn        
        //    58: aload_0        
        //    59: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.child:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    62: iconst_1       
        //    63: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    66: iload_2        
        //    67: ifne            78
        //    70: ifeq            81
        //    73: goto            77
        //    76: athrow         
        //    77: iconst_1       
        //    78: goto            82
        //    81: iconst_m1      
        //    82: ireturn        
        //    StackMapTable: 00 11 FF 00 0F 00 03 07 00 18 01 01 00 01 07 00 7E 00 4A 07 00 7E 40 01 46 07 00 7E 00 47 07 00 7E 00 43 01 42 07 00 82 05 47 01 49 07 00 7E 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  66     73     76     77     Ljava/lang/RuntimeException;
        //  28     44     44     45     Ljava/lang/RuntimeException;
        //  16     32     35     36     Ljava/lang/RuntimeException;
        //  9      24     27     28     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    
    public boolean select(final boolean p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: iload_1        
        //     7: invokevirtual   org/powerbot/game/api/wrappers/widget/ChatOption.select:(Z)I
        //    10: iload           5
        //    12: ifne            93
        //    15: iconst_m1      
        //    16: if_icmple       92
        //    19: goto            23
        //    22: athrow         
        //    23: invokestatic    java/lang/System.currentTimeMillis:()J
        //    26: iload_2        
        //    27: i2l            
        //    28: ladd           
        //    29: lstore_3       
        //    30: invokestatic    java/lang/System.currentTimeMillis:()J
        //    33: lload_3        
        //    34: lcmp           
        //    35: ifge            92
        //    38: aload_0        
        //    39: aload_0        
        //    40: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.child:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    43: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    46: aload_0        
        //    47: getfield        org/powerbot/game/api/wrappers/widget/ChatOption.child:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    50: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.visible:()Z
        //    53: invokevirtual   org/powerbot/game/api/wrappers/widget/ChatOption.revalidate:(ZZ)Z
        //    56: iload           5
        //    58: ifne            93
        //    61: iload           5
        //    63: ifne            82
        //    66: goto            70
        //    69: athrow         
        //    70: ifne            80
        //    73: goto            77
        //    76: athrow         
        //    77: iconst_1       
        //    78: ireturn        
        //    79: athrow         
        //    80: bipush          50
        //    82: bipush          100
        //    84: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //    87: iload           5
        //    89: ifeq            30
        //    92: iconst_0       
        //    93: ireturn        
        //    StackMapTable: 00 0C FF 00 16 00 06 07 00 18 01 01 00 00 01 00 01 07 00 7E 00 FF 00 06 00 05 07 00 18 01 01 04 01 00 00 66 07 00 7E 40 01 45 07 00 7E 00 41 07 00 7E 00 41 01 FF 00 09 00 06 07 00 18 01 01 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  70     79     79     80     Ljava/lang/RuntimeException;
        //  61     73     76     77     Ljava/lang/RuntimeException;
        //  38     66     69     70     Ljava/lang/RuntimeException;
        //  5      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0070:
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
        final boolean a = WidgetChild.a;
        String string = null;
        boolean a2 = false;
        Label_0086: {
            Label_0080: {
                try {
                    string = this.getClass().getName() + o.a("{") + this.number + o.a(ChatOption.z) + this.child.getText() + o.a("z");
                    if (Task.a == 0) {
                        return string;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0080;
                    }
                    break Label_0080;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0086;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        WidgetChild.a = a2;
        return string;
    }
    
    static {
        final char[] charArray = "\fY".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0102: {
                if (n > 1) {
                    break Label_0102;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '`';
                            break;
                        }
                        case 1: {
                            c2 = '*';
                            break;
                        }
                        case 2: {
                            c2 = '\u000f';
                            break;
                        }
                        case 3: {
                            c2 = 'N';
                            break;
                        }
                        default: {
                            c2 = 'B';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
