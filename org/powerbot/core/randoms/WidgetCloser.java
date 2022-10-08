
package org.powerbot.core.randoms;

import java.util.HashMap;
import org.powerbot.game.api.util.Timer;
import java.util.Map;
import org.powerbot.game.api.Manifest;

@Manifest(name = "Widget Closer", description = "Closes widgets that interrupt scripts", version = 0.1, authors = { "Timer" })
public class WidgetCloser extends AntiRandom
{
    private static final Map<Integer, Integer> children;
    private int failure;
    private Timer timer;
    
    public WidgetCloser() {
        this.failure = 0;
    }
    
    @Override
    public boolean activate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //     8: iload           4
        //    10: ifne            260
        //    13: ifeq            259
        //    16: goto            20
        //    19: athrow         
        //    20: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    23: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isIdle:()Z
        //    26: iload           4
        //    28: ifne            260
        //    31: goto            35
        //    34: athrow         
        //    35: ifeq            259
        //    38: goto            42
        //    41: athrow         
        //    42: aload_0        
        //    43: iload           4
        //    45: ifne            99
        //    48: goto            52
        //    51: athrow         
        //    52: getfield        org/powerbot/core/randoms/WidgetCloser.timer:Lorg/powerbot/game/api/util/Timer;
        //    55: ifnull          98
        //    58: goto            62
        //    61: athrow         
        //    62: aload_0        
        //    63: iload           4
        //    65: ifne            94
        //    68: goto            72
        //    71: athrow         
        //    72: getfield        org/powerbot/core/randoms/WidgetCloser.timer:Lorg/powerbot/game/api/util/Timer;
        //    75: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    78: ifeq            88
        //    81: goto            85
        //    84: athrow         
        //    85: iconst_0       
        //    86: ireturn        
        //    87: athrow         
        //    88: aload_0        
        //    89: aconst_null    
        //    90: putfield        org/powerbot/core/randoms/WidgetCloser.timer:Lorg/powerbot/game/api/util/Timer;
        //    93: aload_0        
        //    94: iconst_0       
        //    95: putfield        org/powerbot/core/randoms/WidgetCloser.failure:I
        //    98: aload_0        
        //    99: getfield        org/powerbot/core/randoms/WidgetCloser.failure:I
        //   102: iload           4
        //   104: ifne            135
        //   107: iconst_3       
        //   108: if_icmplt       132
        //   111: goto            115
        //   114: athrow         
        //   115: aload_0        
        //   116: new             Lorg/powerbot/game/api/util/Timer;
        //   119: dup            
        //   120: ldc2_w          60000
        //   123: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   126: putfield        org/powerbot/core/randoms/WidgetCloser.timer:Lorg/powerbot/game/api/util/Timer;
        //   129: iconst_0       
        //   130: ireturn        
        //   131: athrow         
        //   132: invokestatic    org/powerbot/game/api/methods/Widgets.canContinue:()Z
        //   135: iload           4
        //   137: ifne            260
        //   140: ifne            259
        //   143: goto            147
        //   146: athrow         
        //   147: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //   150: iload           4
        //   152: ifne            260
        //   155: goto            159
        //   158: athrow         
        //   159: ifne            259
        //   162: goto            166
        //   165: athrow         
        //   166: getstatic       org/powerbot/core/randoms/WidgetCloser.children:Ljava/util/Map;
        //   169: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   174: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   179: astore_1       
        //   180: aload_1        
        //   181: invokeinterface java/util/Iterator.hasNext:()Z
        //   186: ifeq            259
        //   189: aload_1        
        //   190: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   195: checkcast       Ljava/util/Map$Entry;
        //   198: astore_2       
        //   199: aload_2        
        //   200: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   205: checkcast       Ljava/lang/Integer;
        //   208: invokevirtual   java/lang/Integer.intValue:()I
        //   211: aload_2        
        //   212: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   217: checkcast       Ljava/lang/Integer;
        //   220: invokevirtual   java/lang/Integer.intValue:()I
        //   223: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   226: astore_3       
        //   227: aload_3        
        //   228: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   231: iload           4
        //   233: ifne            260
        //   236: iload           4
        //   238: ifne            253
        //   241: goto            245
        //   244: athrow         
        //   245: ifeq            254
        //   248: goto            252
        //   251: athrow         
        //   252: iconst_1       
        //   253: ireturn        
        //   254: iload           4
        //   256: ifeq            180
        //   259: iconst_0       
        //   260: ireturn        
        //    StackMapTable: 00 27 FF 00 13 00 05 07 00 23 00 00 00 01 00 01 07 00 9B 00 4D 07 00 9B 40 01 45 07 00 9B 00 48 07 00 9B 40 07 00 23 48 07 00 9B 00 48 07 00 9B 40 07 00 23 4B 07 00 9B 00 41 07 00 9B 00 45 07 00 23 03 40 07 00 23 4E 07 00 9B 00 4F 07 00 9B 00 42 01 4A 07 00 9B 00 4A 07 00 9B 40 01 45 07 00 9B 00 FF 00 0D 00 05 07 00 23 07 00 53 00 00 01 00 00 FF 00 3F 00 05 07 00 23 07 00 53 07 00 13 07 00 5E 01 00 01 07 00 9B 40 01 45 07 00 9B 00 40 01 00 FF 00 04 00 05 07 00 23 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  236    248    251    252    Ljava/lang/RuntimeException;
        //  227    241    244    245    Ljava/lang/RuntimeException;
        //  147    162    165    166    Ljava/lang/RuntimeException;
        //  140    155    158    159    Ljava/lang/RuntimeException;
        //  135    143    146    147    Ljava/lang/RuntimeException;
        //  107    131    131    132    Ljava/lang/RuntimeException;
        //  99     111    114    115    Ljava/lang/RuntimeException;
        //  72     87     87     88     Ljava/lang/RuntimeException;
        //  62     81     84     85     Ljava/lang/RuntimeException;
        //  52     68     71     72     Ljava/lang/RuntimeException;
        //  42     58     61     62     Ljava/lang/RuntimeException;
        //  35     48     51     52     Ljava/lang/RuntimeException;
        //  20     38     41     42     Ljava/lang/RuntimeException;
        //  13     31     34     35     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    public void execute() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: getstatic       org/powerbot/core/randoms/WidgetCloser.children:Ljava/util/Map;
        //     8: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    13: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    18: astore_1       
        //    19: aload_1        
        //    20: invokeinterface java/util/Iterator.hasNext:()Z
        //    25: ifeq            139
        //    28: aload_1        
        //    29: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    34: checkcast       Ljava/util/Map$Entry;
        //    37: astore_2       
        //    38: aload_2        
        //    39: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //    44: checkcast       Ljava/lang/Integer;
        //    47: invokevirtual   java/lang/Integer.intValue:()I
        //    50: aload_2        
        //    51: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    56: checkcast       Ljava/lang/Integer;
        //    59: invokevirtual   java/lang/Integer.intValue:()I
        //    62: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    65: astore_3       
        //    66: iload           4
        //    68: ifne            147
        //    71: aload_3        
        //    72: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    75: iload           4
        //    77: ifne            117
        //    80: goto            84
        //    83: athrow         
        //    84: ifeq            134
        //    87: goto            91
        //    90: athrow         
        //    91: aload_3        
        //    92: iconst_1       
        //    93: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    96: pop            
        //    97: sipush          1200
        //   100: sipush          2400
        //   103: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   106: invokestatic    org/powerbot/core/randoms/WidgetCloser.sleep:(I)V
        //   109: aload_3        
        //   110: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   113: goto            117
        //   116: athrow         
        //   117: ifeq            134
        //   120: aload_0        
        //   121: dup            
        //   122: getfield        org/powerbot/core/randoms/WidgetCloser.failure:I
        //   125: iconst_1       
        //   126: iadd           
        //   127: putfield        org/powerbot/core/randoms/WidgetCloser.failure:I
        //   130: goto            134
        //   133: athrow         
        //   134: iload           4
        //   136: ifeq            19
        //   139: goto            147
        //   142: astore_1       
        //   143: aload_1        
        //   144: invokevirtual   java/lang/Throwable.printStackTrace:()V
        //   147: return         
        //    StackMapTable: 00 0C FF 00 13 00 05 07 00 23 07 00 53 00 00 01 00 00 FF 00 3F 00 05 07 00 23 07 00 53 07 00 13 07 00 5E 01 00 01 07 00 1D 40 01 45 07 00 1D 00 58 07 00 1D 40 01 4F 07 00 1D 00 FF 00 04 00 05 07 00 23 07 00 53 00 00 01 00 00 FF 00 02 00 05 07 00 23 00 00 00 01 00 01 07 00 1D FF 00 04 00 05 07 00 23 07 00 9E 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  117    130    133    134    Ljava/lang/Throwable;
        //  84     113    116    117    Ljava/lang/Throwable;
        //  71     87     90     91     Ljava/lang/Throwable;
        //  66     80     83     84     Ljava/lang/Throwable;
        //  5      139    142    147    Ljava/lang/Throwable;
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
    
    static {
        (children = new HashMap<Integer, Integer>()).put(21, 43);
        WidgetCloser.children.put(1234, 15);
        WidgetCloser.children.put(906, 354);
        WidgetCloser.children.put(906, 493);
        WidgetCloser.children.put(1252, 8);
        WidgetCloser.children.put(1253, 16);
        WidgetCloser.children.put(1218, 77);
        WidgetCloser.children.put(1107, 157);
        WidgetCloser.children.put(755, 44);
    }
}
