
package org.powerbot.core.event.impl;

import java.awt.Graphics;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawNPCs implements PaintListener
{
    private static final String[] z;
    
    @Override
    public void onRepaint(final Graphics p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //     8: ifne            13
        //    11: return         
        //    12: athrow         
        //    13: invokestatic    org/powerbot/game/api/methods/interactive/NPCs.getLoaded:()[Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //    16: astore_2       
        //    17: aload_1        
        //    18: invokevirtual   java/awt/Graphics.getFontMetrics:()Ljava/awt/FontMetrics;
        //    21: astore_3       
        //    22: aload_2        
        //    23: astore          4
        //    25: aload           4
        //    27: arraylength    
        //    28: istore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload           6
        //    35: iload           5
        //    37: if_icmpge       597
        //    40: aload           4
        //    42: iload           6
        //    44: aaload         
        //    45: astore          7
        //    47: aload           7
        //    49: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getCentralPoint:()Ljava/awt/Point;
        //    52: astore          8
        //    54: iload           12
        //    56: ifne            592
        //    59: aload           8
        //    61: getfield        java/awt/Point.x:I
        //    64: iconst_m1      
        //    65: if_icmpeq       589
        //    68: goto            72
        //    71: athrow         
        //    72: aload           8
        //    74: getfield        java/awt/Point.y:I
        //    77: iconst_m1      
        //    78: if_icmpne       89
        //    81: goto            85
        //    84: athrow         
        //    85: goto            589
        //    88: athrow         
        //    89: aload_1        
        //    90: getstatic       java/awt/Color.red:Ljava/awt/Color;
        //    93: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //    96: aload_1        
        //    97: aload           8
        //    99: invokevirtual   java/awt/Point.getX:()D
        //   102: d2i            
        //   103: iconst_1       
        //   104: isub           
        //   105: aload           8
        //   107: invokevirtual   java/awt/Point.getY:()D
        //   110: d2i            
        //   111: iconst_1       
        //   112: isub           
        //   113: iconst_2       
        //   114: iconst_2       
        //   115: invokevirtual   java/awt/Graphics.fillRect:(IIII)V
        //   118: new             Ljava/lang/StringBuilder;
        //   121: dup            
        //   122: invokespecial   java/lang/StringBuilder.<init>:()V
        //   125: aload           7
        //   127: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getName:()Ljava/lang/String;
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   136: iconst_3       
        //   137: aaload         
        //   138: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload           7
        //   146: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getLevel:()I
        //   149: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   152: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   155: iconst_2       
        //   156: aaload         
        //   157: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   160: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   163: aload           7
        //   165: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getId:()I
        //   168: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   171: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   174: astore          9
        //   176: aload_1        
        //   177: aload           7
        //   179: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.isInCombat:()Z
        //   182: iload           12
        //   184: ifne            206
        //   187: ifeq            201
        //   190: goto            194
        //   193: athrow         
        //   194: getstatic       java/awt/Color.RED:Ljava/awt/Color;
        //   197: goto            219
        //   200: athrow         
        //   201: aload           7
        //   203: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.isMoving:()Z
        //   206: ifeq            216
        //   209: getstatic       java/awt/Color.GREEN:Ljava/awt/Color;
        //   212: goto            219
        //   215: athrow         
        //   216: getstatic       java/awt/Color.WHITE:Ljava/awt/Color;
        //   219: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   222: aload_1        
        //   223: aload           9
        //   225: aload           8
        //   227: getfield        java/awt/Point.x:I
        //   230: aload_3        
        //   231: aload           9
        //   233: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   236: iconst_2       
        //   237: idiv           
        //   238: isub           
        //   239: aload           8
        //   241: getfield        java/awt/Point.y:I
        //   244: aload_3        
        //   245: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   248: iconst_2       
        //   249: idiv           
        //   250: isub           
        //   251: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   254: aload           7
        //   256: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getMessage:()Ljava/lang/String;
        //   259: astore          10
        //   261: iconst_0       
        //   262: istore          11
        //   264: aload           7
        //   266: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getAnimation:()I
        //   269: iconst_m1      
        //   270: iload           12
        //   272: ifne            344
        //   275: if_icmpne       304
        //   278: goto            282
        //   281: athrow         
        //   282: aload           7
        //   284: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getPassiveAnimation:()I
        //   287: iconst_m1      
        //   288: iload           12
        //   290: ifne            344
        //   293: goto            297
        //   296: athrow         
        //   297: if_icmpeq       521
        //   300: goto            304
        //   303: athrow         
        //   304: ldc             ""
        //   306: astore          9
        //   308: new             Ljava/lang/StringBuilder;
        //   311: dup            
        //   312: invokespecial   java/lang/StringBuilder.<init>:()V
        //   315: aload           9
        //   317: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   320: ldc             "q"
        //   322: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   325: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   328: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   331: iload           12
        //   333: ifne            436
        //   336: astore          9
        //   338: aload           7
        //   340: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getAnimation:()I
        //   343: iconst_m1      
        //   344: if_icmpne       368
        //   347: aload           7
        //   349: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getPassiveAnimation:()I
        //   352: iload           12
        //   354: ifne            519
        //   357: goto            361
        //   360: athrow         
        //   361: ifle            438
        //   364: goto            368
        //   367: athrow         
        //   368: new             Ljava/lang/StringBuilder;
        //   371: dup            
        //   372: invokespecial   java/lang/StringBuilder.<init>:()V
        //   375: aload           9
        //   377: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   380: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   383: iconst_1       
        //   384: aaload         
        //   385: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   388: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   391: aload           7
        //   393: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getAnimation:()I
        //   396: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   399: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   402: iconst_0       
        //   403: aaload         
        //   404: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   410: aload           7
        //   412: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getPassiveAnimation:()I
        //   415: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   418: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   421: iconst_4       
        //   422: aaload         
        //   423: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   429: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   432: goto            436
        //   435: athrow         
        //   436: astore          9
        //   438: aload           9
        //   440: iconst_0       
        //   441: aload           9
        //   443: getstatic       org/powerbot/core/event/impl/DrawNPCs.z:[Ljava/lang/String;
        //   446: iconst_5       
        //   447: aaload         
        //   448: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   451: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   454: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   457: astore          9
        //   459: new             Ljava/lang/StringBuilder;
        //   462: dup            
        //   463: invokespecial   java/lang/StringBuilder.<init>:()V
        //   466: aload           9
        //   468: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   471: ldc             "3"
        //   473: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   476: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   479: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   482: astore          9
        //   484: aload_1        
        //   485: aload           9
        //   487: aload           8
        //   489: getfield        java/awt/Point.x:I
        //   492: aload_3        
        //   493: aload           9
        //   495: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   498: iconst_2       
        //   499: idiv           
        //   500: isub           
        //   501: aload           8
        //   503: getfield        java/awt/Point.y:I
        //   506: aload_3        
        //   507: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   510: iconst_3       
        //   511: imul           
        //   512: iconst_2       
        //   513: idiv           
        //   514: isub           
        //   515: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   518: iconst_1       
        //   519: istore          11
        //   521: aload           10
        //   523: ifnull          589
        //   526: aload_1        
        //   527: getstatic       java/awt/Color.ORANGE:Ljava/awt/Color;
        //   530: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   533: aload_1        
        //   534: aload           10
        //   536: aload           8
        //   538: getfield        java/awt/Point.x:I
        //   541: aload_3        
        //   542: aload           10
        //   544: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   547: iconst_2       
        //   548: idiv           
        //   549: isub           
        //   550: aload           8
        //   552: getfield        java/awt/Point.y:I
        //   555: aload_3        
        //   556: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   559: iload           11
        //   561: iload           12
        //   563: ifne            578
        //   566: goto            570
        //   569: athrow         
        //   570: ifeq            581
        //   573: goto            577
        //   576: athrow         
        //   577: iconst_5       
        //   578: goto            582
        //   581: iconst_3       
        //   582: imul           
        //   583: iconst_2       
        //   584: idiv           
        //   585: isub           
        //   586: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   589: iinc            6, 1
        //   592: iload           12
        //   594: ifeq            33
        //   597: return         
        //    StackMapTable: 00 2B FF 00 0C 00 0D 07 00 24 07 00 31 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 AF 00 FF 00 13 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 00 00 00 00 00 01 00 00 FF 00 25 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 00 00 00 01 00 01 07 00 AF 00 4B 07 00 AF 00 42 07 00 AF 00 FF 00 67 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 00 00 01 00 01 07 00 AF 40 07 00 31 45 07 00 AF 40 07 00 31 FF 00 04 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 00 00 01 00 02 07 00 31 01 48 07 00 AF 40 07 00 31 FF 00 02 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 00 00 01 00 02 07 00 31 07 00 38 FF 00 3D 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 01 07 00 AF 00 4D 07 00 AF FF 00 00 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 02 01 01 45 07 00 AF 00 FF 00 27 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 02 01 01 4F 07 00 AF 40 01 45 07 00 AF 00 F7 00 42 07 00 AF 40 07 00 52 01 F7 00 50 01 01 6F 07 00 AF FF 00 00 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 06 07 00 31 07 00 52 01 01 01 01 45 07 00 AF FF 00 00 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 05 07 00 31 07 00 52 01 01 01 FF 00 00 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 06 07 00 31 07 00 52 01 01 01 01 FF 00 02 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 05 07 00 31 07 00 52 01 01 01 FF 00 00 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 07 00 52 07 00 52 01 01 00 06 07 00 31 07 00 52 01 01 01 01 FF 00 06 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 07 00 33 07 00 35 00 00 00 01 00 00 02 FF 00 04 00 0D 07 00 24 07 00 31 07 00 C1 07 00 4A 07 00 C1 01 01 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  526    573    576    577    Ljava/lang/RuntimeException;
        //  521    566    569    570    Ljava/lang/RuntimeException;
        //  361    432    435    436    Ljava/lang/RuntimeException;
        //  347    364    367    368    Ljava/lang/RuntimeException;
        //  344    357    360    361    Ljava/lang/RuntimeException;
        //  282    300    303    304    Ljava/lang/RuntimeException;
        //  275    293    296    297    Ljava/lang/RuntimeException;
        //  264    278    281    282    Ljava/lang/RuntimeException;
        //  206    215    215    216    Ljava/lang/RuntimeException;
        //  187    200    200    201    Ljava/lang/RuntimeException;
        //  176    190    193    194    Ljava/lang/RuntimeException;
        //  72     88     88     89     Ljava/lang/RuntimeException;
        //  59     81     84     85     Ljava/lang/RuntimeException;
        //  54     68     71     72     Ljava/lang/RuntimeException;
        //  5      12     12     13     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "\u001207!if\u0002";
        int n7 = -1;
        String intern = null;
    Label_0081_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0158: {
                    if (n8 > 1) {
                        break Label_0158;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = 'k';
                                break;
                            }
                            case 1: {
                                c2 = '{';
                                break;
                            }
                            case 2: {
                                c2 = 'N';
                                break;
                            }
                            case 3: {
                                c2 = 'E';
                                break;
                            }
                            default: {
                                c2 = 'd';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "0ut";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "vAW\u007f";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "|\n";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "Q3t";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "\u001207";
                    n7 = 4;
                    continue Label_0081_Outer;
                }
                case 4: {
                    break Label_0081_Outer;
                }
            }
        }
        z2[n6] = intern;
        z = z2;
    }
}
