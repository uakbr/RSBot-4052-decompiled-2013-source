
package org.powerbot.core.event.impl;

import java.awt.Graphics;
import java.awt.Point;
import org.powerbot.core.event.listeners.PaintListener;

public class DrawBoundaries implements PaintListener
{
    private final Point[][] minimapPoints;
    private final Point[][] screenPoints;
    
    public DrawBoundaries() {
        this.minimapPoints = new Point[105][105];
        this.screenPoints = new Point[105][105];
    }
    
    @Override
    public void onRepaint(final Graphics p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          17
        //     5: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //     8: iload           17
        //    10: ifne            24
        //    13: ifne            21
        //    16: goto            20
        //    19: athrow         
        //    20: return         
        //    21: invokestatic    org/powerbot/game/api/methods/Game.getPlane:()I
        //    24: istore_2       
        //    25: iload_2        
        //    26: invokestatic    org/powerbot/game/api/methods/Walking.getCollisionFlags:(I)[[I
        //    29: astore_3       
        //    30: invokestatic    org/powerbot/game/api/methods/Game.getBaseX:()I
        //    33: istore          4
        //    35: invokestatic    org/powerbot/game/api/methods/Game.getBaseY:()I
        //    38: istore          5
        //    40: iconst_0       
        //    41: istore          6
        //    43: iload           6
        //    45: aload_0        
        //    46: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //    49: arraylength    
        //    50: if_icmpge       253
        //    53: iconst_0       
        //    54: iload           17
        //    56: ifne            261
        //    59: istore          7
        //    61: iload           7
        //    63: aload_0        
        //    64: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //    67: iload           6
        //    69: aaload         
        //    70: arraylength    
        //    71: if_icmpge       245
        //    74: iload           6
        //    76: iload           4
        //    78: iadd           
        //    79: iconst_1       
        //    80: isub           
        //    81: istore          8
        //    83: iload           7
        //    85: iload           5
        //    87: iadd           
        //    88: iconst_1       
        //    89: isub           
        //    90: istore          9
        //    92: iload           8
        //    94: i2d            
        //    95: ldc2_w          0.5
        //    98: dsub           
        //    99: iload           9
        //   101: i2d            
        //   102: ldc2_w          0.5
        //   105: dsub           
        //   106: invokestatic    org/powerbot/game/api/methods/Calculations.worldToMap:(DD)Ljava/awt/Point;
        //   109: astore          10
        //   111: aload           10
        //   113: getfield        java/awt/Point.x:I
        //   116: iconst_m1      
        //   117: iload           17
        //   119: ifne            50
        //   122: iload           17
        //   124: ifne            153
        //   127: if_icmpeq       156
        //   130: goto            134
        //   133: athrow         
        //   134: aload           10
        //   136: iload           17
        //   138: ifne            189
        //   141: goto            145
        //   144: athrow         
        //   145: getfield        java/awt/Point.y:I
        //   148: iconst_m1      
        //   149: goto            153
        //   152: athrow         
        //   153: if_icmpne       159
        //   156: aconst_null    
        //   157: astore          10
        //   159: aload_0        
        //   160: getfield        org/powerbot/core/event/impl/DrawBoundaries.minimapPoints:[[Ljava/awt/Point;
        //   163: iload           6
        //   165: aaload         
        //   166: iload           7
        //   168: aload           10
        //   170: aastore        
        //   171: new             Lorg/powerbot/game/api/wrappers/Tile;
        //   174: dup            
        //   175: iload           8
        //   177: iload           9
        //   179: iload_2        
        //   180: invokespecial   org/powerbot/game/api/wrappers/Tile.<init>:(III)V
        //   183: dconst_0       
        //   184: dconst_0       
        //   185: iconst_0       
        //   186: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //   189: astore          11
        //   191: aload           11
        //   193: getfield        java/awt/Point.x:I
        //   196: iconst_m1      
        //   197: iload           17
        //   199: ifne            219
        //   202: if_icmpeq       222
        //   205: goto            209
        //   208: athrow         
        //   209: aload           11
        //   211: getfield        java/awt/Point.y:I
        //   214: iconst_m1      
        //   215: goto            219
        //   218: athrow         
        //   219: if_icmpne       225
        //   222: aconst_null    
        //   223: astore          11
        //   225: aload_0        
        //   226: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //   229: iload           6
        //   231: aaload         
        //   232: iload           7
        //   234: aload           11
        //   236: aastore        
        //   237: iinc            7, 1
        //   240: iload           17
        //   242: ifeq            61
        //   245: iinc            6, 1
        //   248: iload           17
        //   250: ifeq            43
        //   253: aload_1        
        //   254: getstatic       java/awt/Color.YELLOW:Ljava/awt/Color;
        //   257: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   260: iconst_1       
        //   261: istore          6
        //   263: iload           6
        //   265: bipush          104
        //   267: if_icmpge       1350
        //   270: iconst_1       
        //   271: istore          7
        //   273: iload           7
        //   275: bipush          104
        //   277: if_icmpge       1342
        //   280: aload_3        
        //   281: iload           6
        //   283: aaload         
        //   284: iload           7
        //   286: iaload         
        //   287: istore          8
        //   289: aload_0        
        //   290: getfield        org/powerbot/core/event/impl/DrawBoundaries.minimapPoints:[[Ljava/awt/Point;
        //   293: iload           6
        //   295: aaload         
        //   296: iload           7
        //   298: aaload         
        //   299: astore          9
        //   301: aload_0        
        //   302: getfield        org/powerbot/core/event/impl/DrawBoundaries.minimapPoints:[[Ljava/awt/Point;
        //   305: iload           6
        //   307: aaload         
        //   308: iload           7
        //   310: iconst_1       
        //   311: iadd           
        //   312: aaload         
        //   313: astore          10
        //   315: aload_0        
        //   316: getfield        org/powerbot/core/event/impl/DrawBoundaries.minimapPoints:[[Ljava/awt/Point;
        //   319: iload           6
        //   321: iconst_1       
        //   322: iadd           
        //   323: aaload         
        //   324: iload           7
        //   326: aaload         
        //   327: astore          11
        //   329: aload_0        
        //   330: getfield        org/powerbot/core/event/impl/DrawBoundaries.minimapPoints:[[Ljava/awt/Point;
        //   333: iload           6
        //   335: iconst_1       
        //   336: iadd           
        //   337: aaload         
        //   338: iload           7
        //   340: iconst_1       
        //   341: iadd           
        //   342: aaload         
        //   343: astore          12
        //   345: aload_0        
        //   346: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //   349: iload           6
        //   351: aaload         
        //   352: iload           7
        //   354: aaload         
        //   355: astore          13
        //   357: aload_0        
        //   358: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //   361: iload           6
        //   363: aaload         
        //   364: iload           7
        //   366: iconst_1       
        //   367: iadd           
        //   368: aaload         
        //   369: astore          14
        //   371: aload_0        
        //   372: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //   375: iload           6
        //   377: iconst_1       
        //   378: iadd           
        //   379: aaload         
        //   380: iload           7
        //   382: aaload         
        //   383: astore          15
        //   385: aload_0        
        //   386: getfield        org/powerbot/core/event/impl/DrawBoundaries.screenPoints:[[Ljava/awt/Point;
        //   389: iload           6
        //   391: iconst_1       
        //   392: iadd           
        //   393: aaload         
        //   394: iload           7
        //   396: iconst_1       
        //   397: iadd           
        //   398: aaload         
        //   399: astore          16
        //   401: iload           8
        //   403: ldc             19398912
        //   405: iand           
        //   406: iload           17
        //   408: ifne            265
        //   411: iload           17
        //   413: ifne            719
        //   416: ifeq            707
        //   419: goto            423
        //   422: athrow         
        //   423: aload_1        
        //   424: getstatic       java/awt/Color.black:Ljava/awt/Color;
        //   427: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   430: aload           15
        //   432: iload           17
        //   434: ifne            583
        //   437: goto            441
        //   440: athrow         
        //   441: ifnull          581
        //   444: goto            448
        //   447: athrow         
        //   448: aload           14
        //   450: iload           17
        //   452: ifne            583
        //   455: goto            459
        //   458: athrow         
        //   459: ifnull          581
        //   462: goto            466
        //   465: athrow         
        //   466: aload           16
        //   468: iload           17
        //   470: ifne            583
        //   473: goto            477
        //   476: athrow         
        //   477: ifnull          581
        //   480: goto            484
        //   483: athrow         
        //   484: aload           13
        //   486: iload           17
        //   488: ifne            583
        //   491: goto            495
        //   494: athrow         
        //   495: ifnull          581
        //   498: goto            502
        //   501: athrow         
        //   502: aload_1        
        //   503: iconst_4       
        //   504: newarray        I
        //   506: dup            
        //   507: iconst_0       
        //   508: aload           13
        //   510: getfield        java/awt/Point.x:I
        //   513: iastore        
        //   514: dup            
        //   515: iconst_1       
        //   516: aload           14
        //   518: getfield        java/awt/Point.x:I
        //   521: iastore        
        //   522: dup            
        //   523: iconst_2       
        //   524: aload           16
        //   526: getfield        java/awt/Point.x:I
        //   529: iastore        
        //   530: dup            
        //   531: iconst_3       
        //   532: aload           15
        //   534: getfield        java/awt/Point.x:I
        //   537: iastore        
        //   538: iconst_4       
        //   539: newarray        I
        //   541: dup            
        //   542: iconst_0       
        //   543: aload           13
        //   545: getfield        java/awt/Point.y:I
        //   548: iastore        
        //   549: dup            
        //   550: iconst_1       
        //   551: aload           14
        //   553: getfield        java/awt/Point.y:I
        //   556: iastore        
        //   557: dup            
        //   558: iconst_2       
        //   559: aload           16
        //   561: getfield        java/awt/Point.y:I
        //   564: iastore        
        //   565: dup            
        //   566: iconst_3       
        //   567: aload           15
        //   569: getfield        java/awt/Point.y:I
        //   572: iastore        
        //   573: iconst_4       
        //   574: invokevirtual   java/awt/Graphics.fillPolygon:([I[II)V
        //   577: goto            581
        //   580: athrow         
        //   581: aload           9
        //   583: iload           17
        //   585: ifne            597
        //   588: ifnull          707
        //   591: goto            595
        //   594: athrow         
        //   595: aload           10
        //   597: iload           17
        //   599: ifne            611
        //   602: ifnull          707
        //   605: goto            609
        //   608: athrow         
        //   609: aload           12
        //   611: iload           17
        //   613: ifne            625
        //   616: ifnull          707
        //   619: goto            623
        //   622: athrow         
        //   623: aload           11
        //   625: ifnull          707
        //   628: aload_1        
        //   629: iconst_4       
        //   630: newarray        I
        //   632: dup            
        //   633: iconst_0       
        //   634: aload           9
        //   636: getfield        java/awt/Point.x:I
        //   639: iastore        
        //   640: dup            
        //   641: iconst_1       
        //   642: aload           10
        //   644: getfield        java/awt/Point.x:I
        //   647: iastore        
        //   648: dup            
        //   649: iconst_2       
        //   650: aload           12
        //   652: getfield        java/awt/Point.x:I
        //   655: iastore        
        //   656: dup            
        //   657: iconst_3       
        //   658: aload           11
        //   660: getfield        java/awt/Point.x:I
        //   663: iastore        
        //   664: iconst_4       
        //   665: newarray        I
        //   667: dup            
        //   668: iconst_0       
        //   669: aload           9
        //   671: getfield        java/awt/Point.y:I
        //   674: iastore        
        //   675: dup            
        //   676: iconst_1       
        //   677: aload           10
        //   679: getfield        java/awt/Point.y:I
        //   682: iastore        
        //   683: dup            
        //   684: iconst_2       
        //   685: aload           12
        //   687: getfield        java/awt/Point.y:I
        //   690: iastore        
        //   691: dup            
        //   692: iconst_3       
        //   693: aload           11
        //   695: getfield        java/awt/Point.y:I
        //   698: iastore        
        //   699: iconst_4       
        //   700: invokevirtual   java/awt/Graphics.fillPolygon:([I[II)V
        //   703: goto            707
        //   706: athrow         
        //   707: aload_3        
        //   708: iload           6
        //   710: aaload         
        //   711: iload           7
        //   713: iconst_1       
        //   714: isub           
        //   715: iaload         
        //   716: ldc             19398914
        //   718: iand           
        //   719: iload           17
        //   721: ifne            740
        //   724: ifne            752
        //   727: goto            731
        //   730: athrow         
        //   731: iload           8
        //   733: ldc             19398944
        //   735: iand           
        //   736: goto            740
        //   739: athrow         
        //   740: iload           17
        //   742: ifne            882
        //   745: ifeq            870
        //   748: goto            752
        //   751: athrow         
        //   752: aload_1        
        //   753: getstatic       java/awt/Color.red:Ljava/awt/Color;
        //   756: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   759: aload           15
        //   761: iload           17
        //   763: ifne            825
        //   766: goto            770
        //   769: athrow         
        //   770: ifnull          823
        //   773: goto            777
        //   776: athrow         
        //   777: aload           13
        //   779: iload           17
        //   781: ifne            825
        //   784: goto            788
        //   787: athrow         
        //   788: ifnull          823
        //   791: goto            795
        //   794: athrow         
        //   795: aload_1        
        //   796: aload           13
        //   798: getfield        java/awt/Point.x:I
        //   801: aload           13
        //   803: getfield        java/awt/Point.y:I
        //   806: aload           15
        //   808: getfield        java/awt/Point.x:I
        //   811: aload           15
        //   813: getfield        java/awt/Point.y:I
        //   816: invokevirtual   java/awt/Graphics.drawLine:(IIII)V
        //   819: goto            823
        //   822: athrow         
        //   823: aload           9
        //   825: iload           17
        //   827: ifne            839
        //   830: ifnull          870
        //   833: goto            837
        //   836: athrow         
        //   837: aload           11
        //   839: ifnull          870
        //   842: aload_1        
        //   843: aload           9
        //   845: getfield        java/awt/Point.x:I
        //   848: aload           9
        //   850: getfield        java/awt/Point.y:I
        //   853: aload           11
        //   855: getfield        java/awt/Point.x:I
        //   858: aload           11
        //   860: getfield        java/awt/Point.y:I
        //   863: invokevirtual   java/awt/Graphics.drawLine:(IIII)V
        //   866: goto            870
        //   869: athrow         
        //   870: aload_3        
        //   871: iload           6
        //   873: iconst_1       
        //   874: isub           
        //   875: aaload         
        //   876: iload           7
        //   878: iaload         
        //   879: ldc             19398920
        //   881: iand           
        //   882: iload           17
        //   884: ifne            903
        //   887: ifne            915
        //   890: goto            894
        //   893: athrow         
        //   894: iload           8
        //   896: ldc             19399040
        //   898: iand           
        //   899: goto            903
        //   902: athrow         
        //   903: iload           17
        //   905: ifne            1054
        //   908: ifeq            1033
        //   911: goto            915
        //   914: athrow         
        //   915: aload_1        
        //   916: getstatic       java/awt/Color.red:Ljava/awt/Color;
        //   919: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //   922: aload           14
        //   924: iload           17
        //   926: ifne            988
        //   929: goto            933
        //   932: athrow         
        //   933: ifnull          986
        //   936: goto            940
        //   939: athrow         
        //   940: aload           13
        //   942: iload           17
        //   944: ifne            988
        //   947: goto            951
        //   950: athrow         
        //   951: ifnull          986
        //   954: goto            958
        //   957: athrow         
        //   958: aload_1        
        //   959: aload           13
        //   961: getfield        java/awt/Point.x:I
        //   964: aload           13
        //   966: getfield        java/awt/Point.y:I
        //   969: aload           14
        //   971: getfield        java/awt/Point.x:I
        //   974: aload           14
        //   976: getfield        java/awt/Point.y:I
        //   979: invokevirtual   java/awt/Graphics.drawLine:(IIII)V
        //   982: goto            986
        //   985: athrow         
        //   986: aload           10
        //   988: iload           17
        //   990: ifne            1002
        //   993: ifnull          1033
        //   996: goto            1000
        //   999: athrow         
        //  1000: aload           9
        //  1002: ifnull          1033
        //  1005: aload_1        
        //  1006: aload           9
        //  1008: getfield        java/awt/Point.x:I
        //  1011: aload           9
        //  1013: getfield        java/awt/Point.y:I
        //  1016: aload           10
        //  1018: getfield        java/awt/Point.x:I
        //  1021: aload           10
        //  1023: getfield        java/awt/Point.y:I
        //  1026: invokevirtual   java/awt/Graphics.drawLine:(IIII)V
        //  1029: goto            1033
        //  1032: athrow         
        //  1033: aload_1        
        //  1034: getstatic       java/awt/Color.cyan:Ljava/awt/Color;
        //  1037: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //  1040: iload           17
        //  1042: ifne            1337
        //  1045: iload           8
        //  1047: ldc             1048576
        //  1049: iand           
        //  1050: goto            1054
        //  1053: athrow         
        //  1054: ifeq            1334
        //  1057: aload           9
        //  1059: iload           17
        //  1061: ifne            1210
        //  1064: goto            1068
        //  1067: athrow         
        //  1068: ifnull          1208
        //  1071: goto            1075
        //  1074: athrow         
        //  1075: aload           10
        //  1077: iload           17
        //  1079: ifne            1210
        //  1082: goto            1086
        //  1085: athrow         
        //  1086: ifnull          1208
        //  1089: goto            1093
        //  1092: athrow         
        //  1093: aload           12
        //  1095: iload           17
        //  1097: ifne            1210
        //  1100: goto            1104
        //  1103: athrow         
        //  1104: ifnull          1208
        //  1107: goto            1111
        //  1110: athrow         
        //  1111: aload           11
        //  1113: iload           17
        //  1115: ifne            1210
        //  1118: goto            1122
        //  1121: athrow         
        //  1122: ifnull          1208
        //  1125: goto            1129
        //  1128: athrow         
        //  1129: aload_1        
        //  1130: iconst_4       
        //  1131: newarray        I
        //  1133: dup            
        //  1134: iconst_0       
        //  1135: aload           9
        //  1137: getfield        java/awt/Point.x:I
        //  1140: iastore        
        //  1141: dup            
        //  1142: iconst_1       
        //  1143: aload           10
        //  1145: getfield        java/awt/Point.x:I
        //  1148: iastore        
        //  1149: dup            
        //  1150: iconst_2       
        //  1151: aload           12
        //  1153: getfield        java/awt/Point.x:I
        //  1156: iastore        
        //  1157: dup            
        //  1158: iconst_3       
        //  1159: aload           11
        //  1161: getfield        java/awt/Point.x:I
        //  1164: iastore        
        //  1165: iconst_4       
        //  1166: newarray        I
        //  1168: dup            
        //  1169: iconst_0       
        //  1170: aload           9
        //  1172: getfield        java/awt/Point.y:I
        //  1175: iastore        
        //  1176: dup            
        //  1177: iconst_1       
        //  1178: aload           10
        //  1180: getfield        java/awt/Point.y:I
        //  1183: iastore        
        //  1184: dup            
        //  1185: iconst_2       
        //  1186: aload           12
        //  1188: getfield        java/awt/Point.y:I
        //  1191: iastore        
        //  1192: dup            
        //  1193: iconst_3       
        //  1194: aload           11
        //  1196: getfield        java/awt/Point.y:I
        //  1199: iastore        
        //  1200: iconst_4       
        //  1201: invokevirtual   java/awt/Graphics.fillPolygon:([I[II)V
        //  1204: goto            1208
        //  1207: athrow         
        //  1208: aload           15
        //  1210: iload           17
        //  1212: ifne            1224
        //  1215: ifnull          1334
        //  1218: goto            1222
        //  1221: athrow         
        //  1222: aload           14
        //  1224: iload           17
        //  1226: ifne            1238
        //  1229: ifnull          1334
        //  1232: goto            1236
        //  1235: athrow         
        //  1236: aload           16
        //  1238: iload           17
        //  1240: ifne            1252
        //  1243: ifnull          1334
        //  1246: goto            1250
        //  1249: athrow         
        //  1250: aload           13
        //  1252: ifnull          1334
        //  1255: aload_1        
        //  1256: iconst_4       
        //  1257: newarray        I
        //  1259: dup            
        //  1260: iconst_0       
        //  1261: aload           13
        //  1263: getfield        java/awt/Point.x:I
        //  1266: iastore        
        //  1267: dup            
        //  1268: iconst_1       
        //  1269: aload           14
        //  1271: getfield        java/awt/Point.x:I
        //  1274: iastore        
        //  1275: dup            
        //  1276: iconst_2       
        //  1277: aload           16
        //  1279: getfield        java/awt/Point.x:I
        //  1282: iastore        
        //  1283: dup            
        //  1284: iconst_3       
        //  1285: aload           15
        //  1287: getfield        java/awt/Point.x:I
        //  1290: iastore        
        //  1291: iconst_4       
        //  1292: newarray        I
        //  1294: dup            
        //  1295: iconst_0       
        //  1296: aload           13
        //  1298: getfield        java/awt/Point.y:I
        //  1301: iastore        
        //  1302: dup            
        //  1303: iconst_1       
        //  1304: aload           14
        //  1306: getfield        java/awt/Point.y:I
        //  1309: iastore        
        //  1310: dup            
        //  1311: iconst_2       
        //  1312: aload           16
        //  1314: getfield        java/awt/Point.y:I
        //  1317: iastore        
        //  1318: dup            
        //  1319: iconst_3       
        //  1320: aload           15
        //  1322: getfield        java/awt/Point.y:I
        //  1325: iastore        
        //  1326: iconst_4       
        //  1327: invokevirtual   java/awt/Graphics.fillPolygon:([I[II)V
        //  1330: goto            1334
        //  1333: athrow         
        //  1334: iinc            7, 1
        //  1337: iload           17
        //  1339: ifeq            273
        //  1342: iinc            6, 1
        //  1345: iload           17
        //  1347: ifeq            263
        //  1350: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //  1353: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //  1356: astore          6
        //  1358: aload           6
        //  1360: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //  1363: i2d            
        //  1364: aload           6
        //  1366: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //  1369: i2d            
        //  1370: invokestatic    org/powerbot/game/api/methods/Calculations.worldToMap:(DD)Ljava/awt/Point;
        //  1373: astore          7
        //  1375: aload_1        
        //  1376: getstatic       java/awt/Color.red:Ljava/awt/Color;
        //  1379: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //  1382: aload_1        
        //  1383: aload           7
        //  1385: invokevirtual   java/awt/Point.getX:()D
        //  1388: d2i            
        //  1389: iconst_1       
        //  1390: isub           
        //  1391: aload           7
        //  1393: invokevirtual   java/awt/Point.getY:()D
        //  1396: d2i            
        //  1397: iconst_1       
        //  1398: isub           
        //  1399: iconst_2       
        //  1400: iconst_2       
        //  1401: invokevirtual   java/awt/Graphics.fillRect:(IIII)V
        //  1404: return         
        //    StackMapTable: 00 8D FF 00 13 00 12 07 00 26 07 00 45 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 89 00 00 42 01 FF 00 12 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 06 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 00 00 00 00 00 00 00 00 00 00 01 00 02 01 01 FF 00 0A 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 47 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 01 01 07 00 3D 00 00 00 00 00 00 01 00 01 07 00 89 00 49 07 00 89 40 07 00 3D 46 07 00 89 FF 00 00 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 01 01 07 00 3D 00 00 00 00 00 00 01 00 02 01 01 02 02 5D 07 00 3D FF 00 12 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 01 01 07 00 3D 07 00 3D 00 00 00 00 00 01 00 01 07 00 89 00 48 07 00 89 FF 00 00 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 01 01 07 00 3D 07 00 3D 00 00 00 00 00 01 00 02 01 01 02 02 FF 00 13 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 00 00 00 00 00 00 00 00 00 00 01 00 00 47 01 01 41 01 FF 00 07 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 94 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 01 07 00 3D 07 00 3D 07 00 3D 07 00 3D 07 00 3D 07 00 3D 07 00 3D 07 00 3D 01 00 01 07 00 89 00 50 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 F7 00 4D 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D F7 00 50 07 00 89 00 4B 01 4A 07 00 89 00 47 07 00 89 40 01 4A 07 00 89 00 50 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 5A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 5D 07 00 89 00 4B 01 4A 07 00 89 00 47 07 00 89 40 01 4A 07 00 89 00 50 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 5A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 5D 07 00 89 00 53 07 00 89 40 01 4C 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 49 07 00 89 40 07 00 3D 45 07 00 89 00 F7 00 4D 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D 4A 07 00 89 00 41 07 00 3D F7 00 50 07 00 89 00 02 FF 00 04 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 01 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 12 07 00 26 07 00 45 01 07 00 8C 01 01 01 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  1252   1330   1333   1334   Ljava/lang/RuntimeException;
        //  1238   1246   1249   1250   Ljava/lang/RuntimeException;
        //  1224   1232   1235   1236   Ljava/lang/RuntimeException;
        //  1210   1218   1221   1222   Ljava/lang/RuntimeException;
        //  1122   1204   1207   1208   Ljava/lang/RuntimeException;
        //  1111   1125   1128   1129   Ljava/lang/RuntimeException;
        //  1104   1118   1121   1122   Ljava/lang/RuntimeException;
        //  1093   1107   1110   1111   Ljava/lang/RuntimeException;
        //  1086   1100   1103   1104   Ljava/lang/RuntimeException;
        //  1075   1089   1092   1093   Ljava/lang/RuntimeException;
        //  1068   1082   1085   1086   Ljava/lang/RuntimeException;
        //  1057   1071   1074   1075   Ljava/lang/RuntimeException;
        //  1054   1064   1067   1068   Ljava/lang/RuntimeException;
        //  1033   1050   1053   1054   Ljava/lang/RuntimeException;
        //  1002   1029   1032   1033   Ljava/lang/RuntimeException;
        //  988    996    999    1000   Ljava/lang/RuntimeException;
        //  951    982    985    986    Ljava/lang/RuntimeException;
        //  940    954    957    958    Ljava/lang/RuntimeException;
        //  933    947    950    951    Ljava/lang/RuntimeException;
        //  915    936    939    940    Ljava/lang/RuntimeException;
        //  908    929    932    933    Ljava/lang/RuntimeException;
        //  903    911    914    915    Ljava/lang/RuntimeException;
        //  887    899    902    903    Ljava/lang/RuntimeException;
        //  882    890    893    894    Ljava/lang/RuntimeException;
        //  839    866    869    870    Ljava/lang/RuntimeException;
        //  825    833    836    837    Ljava/lang/RuntimeException;
        //  788    819    822    823    Ljava/lang/RuntimeException;
        //  777    791    794    795    Ljava/lang/RuntimeException;
        //  770    784    787    788    Ljava/lang/RuntimeException;
        //  752    773    776    777    Ljava/lang/RuntimeException;
        //  745    766    769    770    Ljava/lang/RuntimeException;
        //  740    748    751    752    Ljava/lang/RuntimeException;
        //  724    736    739    740    Ljava/lang/RuntimeException;
        //  719    727    730    731    Ljava/lang/RuntimeException;
        //  625    703    706    707    Ljava/lang/RuntimeException;
        //  611    619    622    623    Ljava/lang/RuntimeException;
        //  597    605    608    609    Ljava/lang/RuntimeException;
        //  583    591    594    595    Ljava/lang/RuntimeException;
        //  495    577    580    581    Ljava/lang/RuntimeException;
        //  484    498    501    502    Ljava/lang/RuntimeException;
        //  477    491    494    495    Ljava/lang/RuntimeException;
        //  466    480    483    484    Ljava/lang/RuntimeException;
        //  459    473    476    477    Ljava/lang/RuntimeException;
        //  448    462    465    466    Ljava/lang/RuntimeException;
        //  441    455    458    459    Ljava/lang/RuntimeException;
        //  423    444    447    448    Ljava/lang/RuntimeException;
        //  416    437    440    441    Ljava/lang/RuntimeException;
        //  411    419    422    423    Ljava/lang/RuntimeException;
        //  202    215    218    219    Ljava/lang/RuntimeException;
        //  191    205    208    209    Ljava/lang/RuntimeException;
        //  134    149    152    153    Ljava/lang/RuntimeException;
        //  127    141    144    145    Ljava/lang/RuntimeException;
        //  122    130    133    134    Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0134:
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
