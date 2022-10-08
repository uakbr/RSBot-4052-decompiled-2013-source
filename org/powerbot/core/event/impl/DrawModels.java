
package org.powerbot.core.event.impl;

import java.util.HashMap;
import java.awt.Graphics;
import java.awt.Color;
import java.util.Map;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawModels implements PaintListener
{
    private static final Map<Integer, Color> interactivePalette;
    
    @Override
    public void onRepaint(final Graphics p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getLoaded:()[Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //     8: astore_2       
        //     9: aload_2        
        //    10: astore_3       
        //    11: aload_3        
        //    12: arraylength    
        //    13: istore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload           5
        //    20: iload           4
        //    22: if_icmpge       171
        //    25: aload_3        
        //    26: iload           5
        //    28: aaload         
        //    29: astore          6
        //    31: aload           6
        //    33: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.getModel:()Lorg/powerbot/game/api/wrappers/graphics/CapturedModel;
        //    36: astore          7
        //    38: iload           11
        //    40: ifne            178
        //    43: iload           11
        //    45: ifne            153
        //    48: goto            52
        //    51: athrow         
        //    52: aload           7
        //    54: ifnull          150
        //    57: goto            61
        //    60: athrow         
        //    61: aload           7
        //    63: iload           11
        //    65: ifne            118
        //    68: goto            72
        //    71: athrow         
        //    72: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.nextTriangle:()I
        //    75: iconst_m1      
        //    76: if_icmpne       87
        //    79: goto            83
        //    82: athrow         
        //    83: goto            150
        //    86: athrow         
        //    87: aload_1        
        //    88: getstatic       org/powerbot/core/event/impl/DrawModels.interactivePalette:Ljava/util/Map;
        //    91: aload           6
        //    93: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.getType:()I
        //    96: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    99: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   104: checkcast       Ljava/awt/Color;
        //   107: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   110: aload           7
        //   112: aload_1        
        //   113: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.drawWireFrame:(Ljava/awt/Graphics;)V
        //   116: aload           7
        //   118: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.getCenterPoint:()Ljava/awt/Point;
        //   121: astore          8
        //   123: aload_1        
        //   124: getstatic       java/awt/Color.green:Ljava/awt/Color;
        //   127: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   130: aload_1        
        //   131: aload           8
        //   133: getfield        java/awt/Point.x:I
        //   136: iconst_2       
        //   137: isub           
        //   138: aload           8
        //   140: getfield        java/awt/Point.y:I
        //   143: iconst_2       
        //   144: isub           
        //   145: iconst_5       
        //   146: iconst_5       
        //   147: invokevirtual   java/awt/Graphics.fillOval:(IIII)V
        //   150: iinc            5, 1
        //   153: iload           11
        //   155: ifeq            18
        //   158: getstatic       org/powerbot/core/script/job/Task.a:I
        //   161: istore          12
        //   163: iinc            12, 1
        //   166: iload           12
        //   168: putstatic       org/powerbot/core/script/job/Task.a:I
        //   171: aload_1        
        //   172: getstatic       java/awt/Color.blue:Ljava/awt/Color;
        //   175: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   178: invokestatic    org/powerbot/game/api/methods/node/GroundItems.getLoaded:()[Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //   181: astore_3       
        //   182: aload_3        
        //   183: astore          4
        //   185: aload           4
        //   187: arraylength    
        //   188: istore          5
        //   190: iconst_0       
        //   191: istore          6
        //   193: iload           6
        //   195: iload           5
        //   197: if_icmpge       277
        //   200: aload           4
        //   202: iload           6
        //   204: aaload         
        //   205: astore          7
        //   207: aload           7
        //   209: invokevirtual   org/powerbot/game/api/wrappers/node/GroundItem.getModel:()Lorg/powerbot/game/api/wrappers/graphics/CapturedModel;
        //   212: astore          8
        //   214: iload           11
        //   216: ifne            284
        //   219: iload           11
        //   221: ifne            272
        //   224: goto            228
        //   227: athrow         
        //   228: aload           8
        //   230: ifnull          269
        //   233: goto            237
        //   236: athrow         
        //   237: aload           8
        //   239: iload           11
        //   241: ifne            265
        //   244: goto            248
        //   247: athrow         
        //   248: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.nextTriangle:()I
        //   251: iconst_m1      
        //   252: if_icmpne       263
        //   255: goto            259
        //   258: athrow         
        //   259: goto            269
        //   262: athrow         
        //   263: aload           8
        //   265: aload_1        
        //   266: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.drawWireFrame:(Ljava/awt/Graphics;)V
        //   269: iinc            6, 1
        //   272: iload           11
        //   274: ifeq            193
        //   277: aload_1        
        //   278: getstatic       java/awt/Color.red:Ljava/awt/Color;
        //   281: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   284: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLoaded:()[Lorg/powerbot/game/api/wrappers/interactive/Player;
        //   287: astore          4
        //   289: aload           4
        //   291: astore          5
        //   293: aload           5
        //   295: arraylength    
        //   296: istore          6
        //   298: iconst_0       
        //   299: istore          7
        //   301: iload           7
        //   303: iload           6
        //   305: if_icmpge       385
        //   308: aload           5
        //   310: iload           7
        //   312: aaload         
        //   313: astore          8
        //   315: aload           8
        //   317: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getModel:()Lorg/powerbot/game/api/wrappers/graphics/CapturedModel;
        //   320: astore          9
        //   322: iload           11
        //   324: ifne            392
        //   327: iload           11
        //   329: ifne            380
        //   332: goto            336
        //   335: athrow         
        //   336: aload           9
        //   338: ifnull          377
        //   341: goto            345
        //   344: athrow         
        //   345: aload           9
        //   347: iload           11
        //   349: ifne            373
        //   352: goto            356
        //   355: athrow         
        //   356: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.nextTriangle:()I
        //   359: iconst_m1      
        //   360: if_icmpne       371
        //   363: goto            367
        //   366: athrow         
        //   367: goto            377
        //   370: athrow         
        //   371: aload           9
        //   373: aload_1        
        //   374: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.drawWireFrame:(Ljava/awt/Graphics;)V
        //   377: iinc            7, 1
        //   380: iload           11
        //   382: ifeq            301
        //   385: aload_1        
        //   386: getstatic       java/awt/Color.magenta:Ljava/awt/Color;
        //   389: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   392: invokestatic    org/powerbot/game/api/methods/interactive/NPCs.getLoaded:()[Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //   395: astore          5
        //   397: aload           5
        //   399: astore          6
        //   401: aload           6
        //   403: arraylength    
        //   404: istore          7
        //   406: iconst_0       
        //   407: istore          8
        //   409: iload           8
        //   411: iload           7
        //   413: if_icmpge       484
        //   416: aload           6
        //   418: iload           8
        //   420: aaload         
        //   421: astore          9
        //   423: aload           9
        //   425: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getModel:()Lorg/powerbot/game/api/wrappers/graphics/CapturedModel;
        //   428: astore          10
        //   430: iload           11
        //   432: ifne            479
        //   435: aload           10
        //   437: ifnull          476
        //   440: goto            444
        //   443: athrow         
        //   444: aload           10
        //   446: iload           11
        //   448: ifne            472
        //   451: goto            455
        //   454: athrow         
        //   455: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.nextTriangle:()I
        //   458: iconst_m1      
        //   459: if_icmpne       470
        //   462: goto            466
        //   465: athrow         
        //   466: goto            476
        //   469: athrow         
        //   470: aload           10
        //   472: aload_1        
        //   473: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.drawWireFrame:(Ljava/awt/Graphics;)V
        //   476: iinc            8, 1
        //   479: iload           11
        //   481: ifeq            409
        //   484: return         
        //    StackMapTable: 00 3D FF 00 12 00 0C 07 00 21 07 00 3C 07 00 96 07 00 96 01 01 00 00 00 00 00 01 00 00 FF 00 20 00 0C 07 00 21 07 00 3C 07 00 96 07 00 96 01 01 07 00 31 07 00 33 00 00 00 01 00 01 07 00 93 00 47 07 00 93 00 49 07 00 93 40 07 00 33 49 07 00 93 00 42 07 00 93 00 5E 07 00 33 1F 02 FF 00 11 00 0C 07 00 21 07 00 3C 07 00 96 07 00 96 01 01 00 00 00 00 00 01 00 00 06 FF 00 0E 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 98 01 01 00 00 00 00 01 00 00 FF 00 21 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 98 01 01 07 00 48 07 00 33 00 00 01 00 01 07 00 93 00 47 07 00 93 00 49 07 00 93 40 07 00 33 49 07 00 93 00 42 07 00 93 00 41 07 00 33 03 02 FF 00 04 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 98 01 01 00 00 00 00 01 00 00 06 FF 00 10 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9A 01 01 00 00 00 01 00 00 FF 00 21 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9A 01 01 07 00 4C 07 00 33 00 01 00 01 07 00 93 00 47 07 00 93 00 49 07 00 93 40 07 00 33 49 07 00 93 00 42 07 00 93 00 41 07 00 33 03 02 FF 00 04 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9A 01 01 00 00 00 01 00 00 06 FF 00 10 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9C 07 00 9C 01 01 00 00 01 00 00 FF 00 21 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9C 07 00 9C 01 01 07 00 50 07 00 33 01 00 01 07 00 93 00 49 07 00 93 40 07 00 33 49 07 00 93 00 42 07 00 93 00 41 07 00 33 03 02 FF 00 04 00 0C 07 00 21 07 00 3C 07 00 96 07 00 98 07 00 9A 07 00 9C 07 00 9C 01 01 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  455    469    469    470    Ljava/lang/RuntimeException;
        //  444    462    465    466    Ljava/lang/RuntimeException;
        //  435    451    454    455    Ljava/lang/RuntimeException;
        //  430    440    443    444    Ljava/lang/RuntimeException;
        //  356    370    370    371    Ljava/lang/RuntimeException;
        //  345    363    366    367    Ljava/lang/RuntimeException;
        //  336    352    355    356    Ljava/lang/RuntimeException;
        //  327    341    344    345    Ljava/lang/RuntimeException;
        //  322    332    335    336    Ljava/lang/RuntimeException;
        //  248    262    262    263    Ljava/lang/RuntimeException;
        //  237    255    258    259    Ljava/lang/RuntimeException;
        //  228    244    247    248    Ljava/lang/RuntimeException;
        //  219    233    236    237    Ljava/lang/RuntimeException;
        //  214    224    227    228    Ljava/lang/RuntimeException;
        //  72     86     86     87     Ljava/lang/RuntimeException;
        //  61     79     82     83     Ljava/lang/RuntimeException;
        //  52     68     71     72     Ljava/lang/RuntimeException;
        //  43     57     60     61     Ljava/lang/RuntimeException;
        //  38     48     51     52     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
        (interactivePalette = new HashMap<Integer, Color>()).put(4, Color.black);
        DrawModels.interactivePalette.put(2, Color.yellow);
        DrawModels.interactivePalette.put(1, Color.white);
        DrawModels.interactivePalette.put(8, Color.gray);
    }
}
