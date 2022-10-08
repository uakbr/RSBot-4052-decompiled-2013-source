
package org.powerbot.core.event.impl;

import java.awt.Graphics;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawPlayers implements PaintListener
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
        //    13: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLoaded:()[Lorg/powerbot/game/api/wrappers/interactive/Player;
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
        //    37: if_icmpge       852
        //    40: aload           4
        //    42: iload           6
        //    44: aaload         
        //    45: astore          7
        //    47: aload           7
        //    49: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getCentralPoint:()Ljava/awt/Point;
        //    52: astore          8
        //    54: iload           12
        //    56: ifne            847
        //    59: aload           8
        //    61: getfield        java/awt/Point.x:I
        //    64: iconst_m1      
        //    65: if_icmpeq       844
        //    68: goto            72
        //    71: athrow         
        //    72: aload           8
        //    74: getfield        java/awt/Point.y:I
        //    77: iconst_m1      
        //    78: if_icmpne       89
        //    81: goto            85
        //    84: athrow         
        //    85: goto            844
        //    88: athrow         
        //    89: aload_1        
        //    90: getstatic       java/awt/Color.RED:Ljava/awt/Color;
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
        //   127: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getName:()Ljava/lang/String;
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   136: iconst_1       
        //   137: aaload         
        //   138: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: aload           7
        //   146: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getLevel:()I
        //   149: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   152: ldc             "v"
        //   154: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   157: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   163: astore          9
        //   165: aload_1        
        //   166: aload           7
        //   168: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isInCombat:()Z
        //   171: iload           12
        //   173: ifne            195
        //   176: ifeq            190
        //   179: goto            183
        //   182: athrow         
        //   183: getstatic       java/awt/Color.RED:Ljava/awt/Color;
        //   186: goto            208
        //   189: athrow         
        //   190: aload           7
        //   192: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isMoving:()Z
        //   195: ifeq            205
        //   198: getstatic       java/awt/Color.GREEN:Ljava/awt/Color;
        //   201: goto            208
        //   204: athrow         
        //   205: getstatic       java/awt/Color.WHITE:Ljava/awt/Color;
        //   208: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   211: aload_1        
        //   212: aload           9
        //   214: aload           8
        //   216: getfield        java/awt/Point.x:I
        //   219: aload_3        
        //   220: aload           9
        //   222: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   225: iconst_2       
        //   226: idiv           
        //   227: isub           
        //   228: aload           8
        //   230: getfield        java/awt/Point.y:I
        //   233: aload_3        
        //   234: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   237: iconst_2       
        //   238: idiv           
        //   239: isub           
        //   240: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   243: aload           7
        //   245: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getMessage:()Ljava/lang/String;
        //   248: astore          10
        //   250: iconst_0       
        //   251: istore          11
        //   253: aload           7
        //   255: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getAnimation:()I
        //   258: iconst_m1      
        //   259: iload           12
        //   261: ifne            394
        //   264: if_icmpne       359
        //   267: goto            271
        //   270: athrow         
        //   271: aload           7
        //   273: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPassiveAnimation:()I
        //   276: iconst_m1      
        //   277: iload           12
        //   279: ifne            394
        //   282: goto            286
        //   285: athrow         
        //   286: if_icmpne       359
        //   289: goto            293
        //   292: athrow         
        //   293: aload           7
        //   295: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getNpcId:()I
        //   298: iconst_m1      
        //   299: iload           12
        //   301: ifne            394
        //   304: goto            308
        //   307: athrow         
        //   308: if_icmpne       359
        //   311: goto            315
        //   314: athrow         
        //   315: aload           7
        //   317: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPrayerIcon:()I
        //   320: iconst_m1      
        //   321: iload           12
        //   323: ifne            394
        //   326: goto            330
        //   329: athrow         
        //   330: if_icmpne       359
        //   333: goto            337
        //   336: athrow         
        //   337: aload           7
        //   339: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getSkullIcon:()I
        //   342: iconst_m1      
        //   343: iload           12
        //   345: ifne            394
        //   348: goto            352
        //   351: athrow         
        //   352: if_icmpeq       776
        //   355: goto            359
        //   358: athrow         
        //   359: ldc             ""
        //   361: astore          9
        //   363: new             Ljava/lang/StringBuilder;
        //   366: dup            
        //   367: invokespecial   java/lang/StringBuilder.<init>:()V
        //   370: aload           9
        //   372: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   375: ldc             "B"
        //   377: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   380: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   383: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   386: astore          9
        //   388: aload           7
        //   390: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getNpcId:()I
        //   393: iconst_m1      
        //   394: iload           12
        //   396: ifne            460
        //   399: if_icmpeq       454
        //   402: goto            406
        //   405: athrow         
        //   406: new             Ljava/lang/StringBuilder;
        //   409: dup            
        //   410: invokespecial   java/lang/StringBuilder.<init>:()V
        //   413: aload           9
        //   415: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   418: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   421: iconst_4       
        //   422: aaload         
        //   423: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   426: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   429: aload           7
        //   431: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getNpcId:()I
        //   434: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   437: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   440: bipush          6
        //   442: aaload         
        //   443: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   446: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   449: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   452: astore          9
        //   454: aload           7
        //   456: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPrayerIcon:()I
        //   459: iconst_m1      
        //   460: iload           12
        //   462: ifne            526
        //   465: if_icmpeq       520
        //   468: goto            472
        //   471: athrow         
        //   472: new             Ljava/lang/StringBuilder;
        //   475: dup            
        //   476: invokespecial   java/lang/StringBuilder.<init>:()V
        //   479: aload           9
        //   481: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   484: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   487: iconst_0       
        //   488: aaload         
        //   489: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   492: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   495: aload           7
        //   497: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPrayerIcon:()I
        //   500: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   503: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   506: bipush          6
        //   508: aaload         
        //   509: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   512: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   515: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   518: astore          9
        //   520: aload           7
        //   522: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getSkullIcon:()I
        //   525: iconst_m1      
        //   526: iload           12
        //   528: ifne            601
        //   531: if_icmpeq       586
        //   534: goto            538
        //   537: athrow         
        //   538: new             Ljava/lang/StringBuilder;
        //   541: dup            
        //   542: invokespecial   java/lang/StringBuilder.<init>:()V
        //   545: aload           9
        //   547: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   550: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   553: iconst_5       
        //   554: aaload         
        //   555: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   558: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   561: aload           7
        //   563: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getSkullIcon:()I
        //   566: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   569: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   572: bipush          6
        //   574: aaload         
        //   575: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   578: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   581: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   584: astore          9
        //   586: aload           7
        //   588: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getAnimation:()I
        //   591: iload           12
        //   593: ifne            613
        //   596: iconst_m1      
        //   597: goto            601
        //   600: athrow         
        //   601: if_icmpne       625
        //   604: aload           7
        //   606: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPassiveAnimation:()I
        //   609: goto            613
        //   612: athrow         
        //   613: iload           12
        //   615: ifne            774
        //   618: ifle            692
        //   621: goto            625
        //   624: athrow         
        //   625: new             Ljava/lang/StringBuilder;
        //   628: dup            
        //   629: invokespecial   java/lang/StringBuilder.<init>:()V
        //   632: aload           9
        //   634: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   637: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   640: iconst_2       
        //   641: aaload         
        //   642: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   645: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   648: aload           7
        //   650: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getAnimation:()I
        //   653: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   656: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   659: bipush          7
        //   661: aaload         
        //   662: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   665: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   668: aload           7
        //   670: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getPassiveAnimation:()I
        //   673: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   676: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   679: iconst_3       
        //   680: aaload         
        //   681: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   684: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   687: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   690: astore          9
        //   692: aload           9
        //   694: iconst_0       
        //   695: aload           9
        //   697: getstatic       org/powerbot/core/event/impl/DrawPlayers.z:[Ljava/lang/String;
        //   700: bipush          6
        //   702: aaload         
        //   703: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   706: invokevirtual   java/lang/String.lastIndexOf:(Ljava/lang/String;)I
        //   709: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   712: astore          9
        //   714: new             Ljava/lang/StringBuilder;
        //   717: dup            
        //   718: invokespecial   java/lang/StringBuilder.<init>:()V
        //   721: aload           9
        //   723: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   726: ldc             "v"
        //   728: invokestatic    org/powerbot/core/script/methods/GroundItems.e:(Ljava/lang/String;)Ljava/lang/String;
        //   731: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   734: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   737: astore          9
        //   739: aload_1        
        //   740: aload           9
        //   742: aload           8
        //   744: getfield        java/awt/Point.x:I
        //   747: aload_3        
        //   748: aload           9
        //   750: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   753: iconst_2       
        //   754: idiv           
        //   755: isub           
        //   756: aload           8
        //   758: getfield        java/awt/Point.y:I
        //   761: aload_3        
        //   762: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   765: iconst_3       
        //   766: imul           
        //   767: iconst_2       
        //   768: idiv           
        //   769: isub           
        //   770: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   773: iconst_1       
        //   774: istore          11
        //   776: aload           10
        //   778: ifnull          844
        //   781: aload_1        
        //   782: getstatic       java/awt/Color.ORANGE:Ljava/awt/Color;
        //   785: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   788: aload_1        
        //   789: aload           10
        //   791: aload           8
        //   793: getfield        java/awt/Point.x:I
        //   796: aload_3        
        //   797: aload           10
        //   799: invokevirtual   java/awt/FontMetrics.stringWidth:(Ljava/lang/String;)I
        //   802: iconst_2       
        //   803: idiv           
        //   804: isub           
        //   805: aload           8
        //   807: getfield        java/awt/Point.y:I
        //   810: aload_3        
        //   811: invokevirtual   java/awt/FontMetrics.getHeight:()I
        //   814: iload           11
        //   816: iload           12
        //   818: ifne            833
        //   821: goto            825
        //   824: athrow         
        //   825: ifeq            836
        //   828: goto            832
        //   831: athrow         
        //   832: iconst_5       
        //   833: goto            837
        //   836: iconst_3       
        //   837: imul           
        //   838: iconst_2       
        //   839: idiv           
        //   840: isub           
        //   841: invokevirtual   java/awt/Graphics.drawString:(Ljava/lang/String;II)V
        //   844: iinc            6, 1
        //   847: iload           12
        //   849: ifeq            33
        //   852: return         
        //    StackMapTable: 00 42 FF 00 0C 00 0D 07 00 25 07 00 32 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 B5 00 FF 00 13 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 00 00 00 00 00 01 00 00 FF 00 25 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 00 00 00 01 00 01 07 00 B5 00 4B 07 00 B5 00 42 07 00 B5 00 FF 00 5C 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 00 00 01 00 01 07 00 B5 40 07 00 32 45 07 00 B5 40 07 00 32 FF 00 04 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 00 00 01 00 02 07 00 32 01 48 07 00 B5 40 07 00 32 FF 00 02 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 00 00 01 00 02 07 00 32 07 00 39 FF 00 3D 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 01 07 00 B5 00 4D 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 45 07 00 B5 00 4D 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 45 07 00 B5 00 4D 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 45 07 00 B5 00 4D 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 45 07 00 B5 00 FF 00 22 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 4A 07 00 B5 00 2F FF 00 05 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 4A 07 00 B5 00 2F FF 00 05 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 4A 07 00 B5 00 2F 4D 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 02 01 01 4A 07 00 B5 40 01 4A 07 00 B5 00 FB 00 42 F7 00 51 01 01 6F 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 06 07 00 32 07 00 54 01 01 01 01 45 07 00 B5 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 05 07 00 32 07 00 54 01 01 01 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 06 07 00 32 07 00 54 01 01 01 01 FF 00 02 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 05 07 00 32 07 00 54 01 01 01 FF 00 00 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 07 00 54 07 00 54 01 01 00 06 07 00 32 07 00 54 01 01 01 01 FF 00 06 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 07 00 34 07 00 36 00 00 00 01 00 00 02 FF 00 04 00 0D 07 00 25 07 00 32 07 00 C7 07 00 49 07 00 C7 01 01 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  781    828    831    832    Ljava/lang/RuntimeException;
        //  776    821    824    825    Ljava/lang/RuntimeException;
        //  613    621    624    625    Ljava/lang/RuntimeException;
        //  601    609    612    613    Ljava/lang/RuntimeException;
        //  586    597    600    601    Ljava/lang/RuntimeException;
        //  526    534    537    538    Ljava/lang/RuntimeException;
        //  460    468    471    472    Ljava/lang/RuntimeException;
        //  394    402    405    406    Ljava/lang/RuntimeException;
        //  337    355    358    359    Ljava/lang/RuntimeException;
        //  330    348    351    352    Ljava/lang/RuntimeException;
        //  315    333    336    337    Ljava/lang/RuntimeException;
        //  308    326    329    330    Ljava/lang/RuntimeException;
        //  293    311    314    315    Ljava/lang/RuntimeException;
        //  286    304    307    308    Ljava/lang/RuntimeException;
        //  271    289    292    293    Ljava/lang/RuntimeException;
        //  264    282    285    286    Ljava/lang/RuntimeException;
        //  253    267    270    271    Ljava/lang/RuntimeException;
        //  195    204    204    205    Ljava/lang/RuntimeException;
        //  176    189    189    190    Ljava/lang/RuntimeException;
        //  165    179    182    183    Ljava/lang/RuntimeException;
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
        final String[] z2 = new String[8];
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 0))))));
        String s = "\u0013\u0004t";
        int n9 = -1;
        String intern = null;
    Label_0102_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n11;
            final int n10 = n11 = (length = charArray.length);
            int n12 = 0;
            while (true) {
                Label_0178: {
                    if (n10 > 1) {
                        break Label_0178;
                    }
                    length = (n11 = n12);
                    do {
                        final char c = charArray[n11];
                        char c2 = '\0';
                        switch (n12 % 5) {
                            case 0: {
                                c2 = '\u001c';
                                break;
                            }
                            case 1: {
                                c2 = '\u001c';
                                break;
                            }
                            case 2: {
                                c2 = '\u000b';
                                break;
                            }
                            case 3: {
                                c2 = '\u0012';
                                break;
                            }
                            default: {
                                c2 = 'K';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n12;
                    } while (n10 == 0);
                }
                if (n10 > n12) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n9) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 1)))))));
                    s = "}^";
                    n9 = 0;
                    continue Label_0102_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "\u0002\u0004t";
                    n9 = 1;
                    continue Label_0102_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "cBt";
                    n9 = 2;
                    continue Label_0102_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "\rn\u0017\n4";
                    n9 = 3;
                    continue Label_0102_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "m\b\u0013m";
                    n9 = 4;
                    continue Label_0102_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "V!A";
                    n9 = 5;
                    continue Label_0102_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = "V!A\u0000ugV";
                    n9 = 6;
                    continue Label_0102_Outer;
                }
                case 6: {
                    break Label_0102_Outer;
                }
            }
        }
        z2[n8] = intern;
        z = z2;
    }
}
