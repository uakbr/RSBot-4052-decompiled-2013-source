
package org.powerbot.core.event.impl;

import java.awt.Graphics;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawInventory implements PaintListener
{
    @Override
    public void onRepaint(final Graphics p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //     8: ifeq            24
        //    11: invokestatic    org/powerbot/game/api/methods/Tabs.getCurrent:()Lorg/powerbot/game/api/methods/Tabs;
        //    14: getstatic       org/powerbot/game/api/methods/Tabs.INVENTORY:Lorg/powerbot/game/api/methods/Tabs;
        //    17: if_acmpeq       26
        //    20: goto            24
        //    23: athrow         
        //    24: return         
        //    25: athrow         
        //    26: aload_1        
        //    27: getstatic       java/awt/Color.green:Ljava/awt/Color;
        //    30: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //    33: aload_1        
        //    34: invokevirtual   java/awt/Graphics.getFontMetrics:()Ljava/awt/FontMetrics;
        //    37: astore_2       
        //    38: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    41: astore_3       
        //    42: aload_3        
        //    43: iload           11
        //    45: ifne            56
        //    48: ifnull          201
        //    51: goto            55
        //    54: athrow         
        //    55: aload_3        
        //    56: astore          4
        //    58: aload           4
        //    60: arraylength    
        //    61: istore          5
        //    63: iconst_0       
        //    64: istore          6
        //    66: iload           6
        //    68: iload           5
        //    70: if_icmpge       201
        //    73: aload           4
        //    75: iload           6
        //    77: aaload         
        //    78: astore          7
        //    80: iload           11
        //    82: ifne            196
        //    85: aload           7
        //    87: ifnull          193
        //    90: goto            94
        //    93: athrow         
        //    94: aload           7
        //    96: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    99: astore          8
        //   101: iload           11
        //   103: ifne            196
        //   106: aload           8
        //   108: ifnull          193
        //   111: goto            115
        //   114: athrow         
        //   115: aload           8
        //   117: iload           11
        //   119: ifne            142
        //   122: goto            126
        //   125: athrow         
        //   126: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   129: ifeq            193
        //   132: goto            136
        //   135: athrow         
        //   136: aload           8
        //   138: goto            142
        //   141: athrow         
        //   142: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteLocation:()Ljava/awt/Point;
        //   145: astore          9
        //   147: new             Ljava/lang/StringBuilder;
        //   150: dup            
        //   151: invokespecial   java/lang/StringBuilder.<init>:()V
        //   154: aload           7
        //   156: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
        //   159: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   162: ldc             ""
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   170: astore          10
        //   172: aload_1        
        //   173: aload           10
        //   175: aload           9
        //   177: getfield        java/awt/Point.x:I
        //   180: aload           9
        //   182: getfield        java/awt/Point.y:I
        //   185: aload_2        
        //   186: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   189: iadd           
        //   190: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   193: iinc            6, 1
        //   196: iload           11
        //   198: ifeq            66
        //   201: return         
        //    StackMapTable: 00 15 FF 00 17 00 0C 07 00 17 07 00 27 00 00 00 00 00 00 00 00 00 01 00 01 07 00 6F 00 40 07 00 6F 00 FF 00 1B 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 00 00 00 00 00 00 00 01 00 01 07 00 6F 00 40 07 00 72 FF 00 09 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 07 00 72 01 01 00 00 00 00 01 00 00 FF 00 1A 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 07 00 72 01 01 07 00 2C 00 00 00 01 00 01 07 00 6F 00 FF 00 13 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 07 00 72 01 01 07 00 2C 07 00 2E 00 00 01 00 01 07 00 6F 00 49 07 00 6F 40 07 00 2E 48 07 00 6F 00 44 07 00 6F 40 07 00 2E FF 00 32 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 07 00 72 01 01 07 00 2C 00 00 00 01 00 00 02 FF 00 04 00 0C 07 00 17 07 00 27 07 00 3A 07 00 72 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  126    138    141    142    Ljava/lang/RuntimeException;
        //  115    132    135    136    Ljava/lang/RuntimeException;
        //  106    122    125    126    Ljava/lang/RuntimeException;
        //  101    111    114    115    Ljava/lang/RuntimeException;
        //  80     90     93     94     Ljava/lang/RuntimeException;
        //  42     51     54     55     Ljava/lang/RuntimeException;
        //  11     25     25     26     Ljava/lang/RuntimeException;
        //  5      20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0115:
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
