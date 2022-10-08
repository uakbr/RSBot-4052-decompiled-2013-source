
package org.powerbot.game.api.util.node;

import org.powerbot.game.client.HashTable;

public class Nodes
{
    public static Object lookup(final HashTable p0, final long p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: iload           6
        //     8: ifne            19
        //    11: ifnull          39
        //    14: goto            18
        //    17: athrow         
        //    18: aload_0        
        //    19: invokeinterface org/powerbot/game/client/HashTable.getBuckets:()[Lorg/powerbot/game/client/Node;
        //    24: dup            
        //    25: astore_3       
        //    26: ifnull          39
        //    29: lload_1        
        //    30: lconst_0       
        //    31: lcmp           
        //    32: ifge            42
        //    35: goto            39
        //    38: athrow         
        //    39: aconst_null    
        //    40: areturn        
        //    41: athrow         
        //    42: aload_3        
        //    43: lload_1        
        //    44: aload_3        
        //    45: arraylength    
        //    46: iconst_1       
        //    47: isub           
        //    48: i2l            
        //    49: land           
        //    50: l2i            
        //    51: aaload         
        //    52: astore          4
        //    54: aload           4
        //    56: invokeinterface org/powerbot/game/client/Node.getNext:()Lorg/powerbot/game/client/Node;
        //    61: astore          5
        //    63: aload           5
        //    65: aload           4
        //    67: if_acmpeq       190
        //    70: aload           5
        //    72: iload           6
        //    74: ifne            86
        //    77: ifnull          190
        //    80: goto            84
        //    83: athrow         
        //    84: aload           5
        //    86: iload           6
        //    88: ifne            183
        //    91: invokeinterface org/powerbot/game/client/Node.getId:()J
        //    96: lload_1        
        //    97: lcmp           
        //    98: ifne            176
        //   101: goto            105
        //   104: athrow         
        //   105: aload           5
        //   107: instanceof      Lorg/powerbot/game/client/SoftReference;
        //   110: iload           6
        //   112: ifne            158
        //   115: goto            119
        //   118: athrow         
        //   119: ifeq            144
        //   122: goto            126
        //   125: athrow         
        //   126: aload           5
        //   128: checkcast       Lorg/powerbot/game/client/SoftReference;
        //   131: invokeinterface org/powerbot/game/client/SoftReference.get:()Ljava/lang/Object;
        //   136: checkcast       Ljava/lang/ref/SoftReference;
        //   139: invokevirtual   java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        //   142: areturn        
        //   143: athrow         
        //   144: aload           5
        //   146: iload           6
        //   148: ifne            175
        //   151: instanceof      Lorg/powerbot/game/client/HardReference;
        //   154: goto            158
        //   157: athrow         
        //   158: ifeq            173
        //   161: aload           5
        //   163: checkcast       Lorg/powerbot/game/client/HardReference;
        //   166: invokeinterface org/powerbot/game/client/HardReference.get:()Ljava/lang/Object;
        //   171: areturn        
        //   172: athrow         
        //   173: aload           5
        //   175: areturn        
        //   176: aload           5
        //   178: invokeinterface org/powerbot/game/client/Node.getNext:()Lorg/powerbot/game/client/Node;
        //   183: astore          5
        //   185: iload           6
        //   187: ifeq            63
        //   190: aconst_null    
        //   191: areturn        
        //    StackMapTable: 00 1B FF 00 11 00 06 07 00 13 04 00 00 00 01 00 01 07 00 2F 00 40 07 00 13 FF 00 12 00 06 07 00 13 04 07 00 32 00 00 01 00 01 07 00 2F FF 00 00 00 06 07 00 13 04 00 00 00 01 00 00 41 07 00 2F FF 00 00 00 06 07 00 13 04 07 00 32 00 00 01 00 00 FF 00 14 00 06 07 00 13 04 07 00 32 07 00 15 07 00 15 01 00 00 53 07 00 2F 00 41 07 00 15 51 07 00 2F 00 4C 07 00 2F 40 01 45 07 00 2F 00 50 07 00 2F 00 4C 07 00 2F 40 01 4D 07 00 2F 00 41 07 00 15 00 46 07 00 15 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  158    172    172    173    Ljava/lang/RuntimeException;
        //  144    154    157    158    Ljava/lang/RuntimeException;
        //  119    143    143    144    Ljava/lang/RuntimeException;
        //  105    122    125    126    Ljava/lang/RuntimeException;
        //  91     115    118    119    Ljava/lang/RuntimeException;
        //  86     101    104    105    Ljava/lang/RuntimeException;
        //  70     80     83     84     Ljava/lang/RuntimeException;
        //  29     41     41     42     Ljava/lang/RuntimeException;
        //  26     35     38     39     Ljava/lang/RuntimeException;
        //  5      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0105:
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
