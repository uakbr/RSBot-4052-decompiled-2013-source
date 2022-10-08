
package org.powerbot.game.api.methods;

import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.methods.widget.WidgetCache;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.core.script.job.Task;
import java.awt.Point;
import org.powerbot.game.bot.Context;

public class Calculations
{
    public static final int[] SIN_TABLE;
    public static final int[] COS_TABLE;
    
    public static int calculateTileHeight(final int n, final int n2) {
        return calculateTileHeight(n, n2, Context.client().getPlane());
    }
    
    public static int calculateTileHeight(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          13
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_3       
        //     9: iload_0        
        //    10: bipush          9
        //    12: ishr           
        //    13: istore          4
        //    15: iload_1        
        //    16: bipush          9
        //    18: ishr           
        //    19: istore          5
        //    21: aload_3        
        //    22: invokeinterface org/powerbot/game/client/Client.getRSGroundInfo:()Lorg/powerbot/game/client/RSInfo;
        //    27: invokeinterface org/powerbot/game/client/RSInfo.getGroundBytes:()Lorg/powerbot/game/client/RSGroundBytes;
        //    32: invokeinterface org/powerbot/game/client/RSGroundBytes.getBytes:()[[[B
        //    37: astore          6
        //    39: aload           6
        //    41: ifnull          335
        //    44: iload           4
        //    46: iload           13
        //    48: ifne            64
        //    51: goto            55
        //    54: athrow         
        //    55: iflt            335
        //    58: goto            62
        //    61: athrow         
        //    62: iload           4
        //    64: iload           13
        //    66: ifne            84
        //    69: bipush          104
        //    71: if_icmpge       335
        //    74: goto            78
        //    77: athrow         
        //    78: iload           5
        //    80: goto            84
        //    83: athrow         
        //    84: iload           13
        //    86: ifne            98
        //    89: iflt            335
        //    92: goto            96
        //    95: athrow         
        //    96: iload           5
        //    98: bipush          104
        //   100: iload           13
        //   102: ifne            118
        //   105: if_icmpge       335
        //   108: goto            112
        //   111: athrow         
        //   112: iload_2        
        //   113: iconst_3       
        //   114: goto            118
        //   117: athrow         
        //   118: iload           13
        //   120: ifne            145
        //   123: if_icmpgt       156
        //   126: goto            130
        //   129: athrow         
        //   130: aload           6
        //   132: iconst_1       
        //   133: aaload         
        //   134: iload           4
        //   136: aaload         
        //   137: iload           5
        //   139: baload         
        //   140: iconst_2       
        //   141: goto            145
        //   144: athrow         
        //   145: iand           
        //   146: ifeq            156
        //   149: iinc            2, 1
        //   152: goto            156
        //   155: athrow         
        //   156: aload_3        
        //   157: invokeinterface org/powerbot/game/client/Client.getRSGroundInfo:()Lorg/powerbot/game/client/RSInfo;
        //   162: invokeinterface org/powerbot/game/client/RSInfo.getRSGroundInfo:()Lorg/powerbot/game/client/RSGroundInfo;
        //   167: invokeinterface org/powerbot/game/client/RSGroundInfo.getTileData:()[Lorg/powerbot/game/client/TileData;
        //   172: astore          7
        //   174: aload           7
        //   176: ifnull          335
        //   179: iload_2        
        //   180: aload           7
        //   182: arraylength    
        //   183: if_icmpge       335
        //   186: goto            190
        //   189: athrow         
        //   190: aload           7
        //   192: iload_2        
        //   193: aaload         
        //   194: iload           13
        //   196: ifne            218
        //   199: goto            203
        //   202: athrow         
        //   203: ifnull          335
        //   206: goto            210
        //   209: athrow         
        //   210: aload           7
        //   212: iload_2        
        //   213: aaload         
        //   214: goto            218
        //   217: athrow         
        //   218: invokeinterface org/powerbot/game/client/TileData.getHeights:()[[I
        //   223: astore          8
        //   225: aload           8
        //   227: ifnull          335
        //   230: iload_0        
        //   231: sipush          511
        //   234: iand           
        //   235: istore          9
        //   237: iload_1        
        //   238: sipush          511
        //   241: iand           
        //   242: istore          10
        //   244: aload           8
        //   246: iload           4
        //   248: aaload         
        //   249: iload           5
        //   251: iaload         
        //   252: sipush          512
        //   255: iload           9
        //   257: isub           
        //   258: imul           
        //   259: aload           8
        //   261: iload           4
        //   263: iconst_1       
        //   264: iadd           
        //   265: aaload         
        //   266: iload           5
        //   268: iaload         
        //   269: iload           9
        //   271: imul           
        //   272: iadd           
        //   273: bipush          9
        //   275: ishr           
        //   276: istore          11
        //   278: aload           8
        //   280: iload           4
        //   282: aaload         
        //   283: iconst_1       
        //   284: iload           5
        //   286: iadd           
        //   287: iaload         
        //   288: sipush          512
        //   291: iload           9
        //   293: isub           
        //   294: imul           
        //   295: aload           8
        //   297: iload           4
        //   299: iconst_1       
        //   300: iadd           
        //   301: aaload         
        //   302: iload           5
        //   304: iconst_1       
        //   305: iadd           
        //   306: iaload         
        //   307: iload           9
        //   309: imul           
        //   310: iadd           
        //   311: bipush          9
        //   313: ishr           
        //   314: istore          12
        //   316: iload           11
        //   318: sipush          512
        //   321: iload           10
        //   323: isub           
        //   324: imul           
        //   325: iload           12
        //   327: iload           10
        //   329: imul           
        //   330: iadd           
        //   331: bipush          9
        //   333: ishr           
        //   334: ireturn        
        //   335: goto            340
        //   338: astore          6
        //   340: iconst_0       
        //   341: ireturn        
        //    StackMapTable: 00 21 FF 00 36 00 0E 01 01 01 07 00 77 01 01 07 01 33 00 00 00 00 00 00 01 00 01 07 00 0B 40 01 45 07 00 0B 00 41 01 4C 07 00 0B 00 44 07 00 0B 40 01 4A 07 00 0B 00 41 01 4C 07 00 0B 00 44 07 00 0B FF 00 00 00 0E 01 01 01 07 00 77 01 01 07 01 33 00 00 00 00 00 00 01 00 02 01 01 4A 07 00 0B 00 4D 07 00 0B FF 00 00 00 0E 01 01 01 07 00 77 01 01 07 01 33 00 00 00 00 00 00 01 00 02 01 01 49 07 00 0B 00 FF 00 20 00 0E 01 01 01 07 00 77 01 01 07 01 33 07 01 35 00 00 00 00 00 01 00 01 07 00 0B 00 4B 07 00 0B 40 07 00 82 45 07 00 0B 00 46 07 00 0B 40 07 00 82 FF 00 74 00 0E 01 01 01 07 00 77 01 01 07 01 33 00 00 00 00 00 00 01 00 00 FF 00 02 00 0E 01 01 01 07 00 77 01 01 00 00 00 00 00 00 00 01 00 01 07 00 0B FF 00 01 00 0E 01 01 01 07 00 77 01 01 07 00 52 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  203    214    217    218    Ljava/lang/NullPointerException;
        //  190    206    209    210    Ljava/lang/NullPointerException;
        //  179    199    202    203    Ljava/lang/NullPointerException;
        //  174    186    189    190    Ljava/lang/NullPointerException;
        //  145    152    155    156    Ljava/lang/NullPointerException;
        //  123    141    144    145    Ljava/lang/NullPointerException;
        //  118    126    129    130    Ljava/lang/NullPointerException;
        //  105    114    117    118    Ljava/lang/NullPointerException;
        //  98     108    111    112    Ljava/lang/NullPointerException;
        //  84     92     95     96     Ljava/lang/NullPointerException;
        //  69     80     83     84     Ljava/lang/NullPointerException;
        //  64     74     77     78     Ljava/lang/NullPointerException;
        //  44     58     61     62     Ljava/lang/NullPointerException;
        //  39     51     54     55     Ljava/lang/NullPointerException;
        //  21     334    338    340    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0190:
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
    
    public static Point groundToScreen(final int n, final int n2, final int n3, final int n4) {
        final int a = Widgets.a;
        Label_0079: {
            int n5 = 0;
            int n11 = 0;
            Label_0067: {
                int calculateTileHeight = 0;
                int n12 = 0;
                Label_0060: {
                    int n6 = 0;
                    int n10 = 0;
                    Label_0048: {
                        Label_0041: {
                            int n7 = 0;
                            int n9 = 0;
                            Label_0029: {
                                Label_0021: {
                                    int n8;
                                    try {
                                        calculateTileHeight = n;
                                        n5 = n;
                                        n6 = n;
                                        n7 = n;
                                        n8 = (n9 = (n10 = (n11 = (n12 = 512))));
                                        if (a != 0) {
                                            break Label_0029;
                                        }
                                        if (n >= n8) {
                                            break Label_0021;
                                        }
                                        break Label_0079;
                                    }
                                    catch (NullPointerException ex) {
                                        throw ex;
                                    }
                                    try {
                                        if (n < n8) {
                                            break Label_0079;
                                        }
                                        calculateTileHeight = n2;
                                        n5 = n2;
                                        n6 = n2;
                                        n7 = n2;
                                        n10 = (n9 = (n11 = (n12 = 512)));
                                    }
                                    catch (NullPointerException ex2) {
                                        throw ex2;
                                    }
                                }
                                try {
                                    if (a != 0) {
                                        break Label_0048;
                                    }
                                    if (n7 >= n9) {
                                        break Label_0041;
                                    }
                                    break Label_0079;
                                }
                                catch (NullPointerException ex3) {
                                    throw ex3;
                                }
                            }
                            try {
                                if (n7 < n9) {
                                    break Label_0079;
                                }
                                calculateTileHeight = n;
                                n5 = n;
                                n6 = n;
                                n11 = (n10 = (n12 = 52224));
                            }
                            catch (NullPointerException ex4) {
                                throw ex4;
                            }
                        }
                        try {
                            if (a != 0) {
                                break Label_0067;
                            }
                            if (n6 <= n10) {
                                break Label_0060;
                            }
                            break Label_0079;
                        }
                        catch (NullPointerException ex5) {
                            throw ex5;
                        }
                    }
                    try {
                        if (n6 > n10) {
                            break Label_0079;
                        }
                        calculateTileHeight = n2;
                        n5 = n2;
                        n12 = (n11 = 52224);
                    }
                    catch (NullPointerException ex6) {
                        throw ex6;
                    }
                }
                try {
                    if (a != 0) {
                        return worldToScreen(n, calculateTileHeight - n12, n2);
                    }
                    if (n5 > n11) {
                        break Label_0079;
                    }
                    break Label_0079;
                }
                catch (NullPointerException ex7) {
                    throw ex7;
                }
            }
            try {
                if (n5 > n11) {
                    return new Point(-1, -1);
                }
            }
            catch (NullPointerException ex8) {
                throw ex8;
            }
        }
        int calculateTileHeight = calculateTileHeight(n, n2, n3);
        int n12 = n4;
        return worldToScreen(n, calculateTileHeight - n12, n2);
    }
    
    public static Point worldToScreen(final int n, final int n2, final int n3) {
        return worldToScreen(org.powerbot.core.script.methods.Calculations.toolkit, org.powerbot.core.script.methods.Calculations.viewport, n, n2, n3);
    }
    
    public static Point worldToScreen(final org.powerbot.core.script.methods.Calculations.Toolkit toolkit, final org.powerbot.core.script.methods.Calculations.Viewport viewport, final int n, final int n2, final int n3) {
        final int a = Widgets.a;
        final float n4 = viewport.zOff + (viewport.zX * n + viewport.zY * n2 + viewport.zZ * n3);
        final float n5 = viewport.xOff + (viewport.xX * n + viewport.xY * n2 + viewport.xZ * n3);
        final float n6 = viewport.yOff + (viewport.yX * n + viewport.yY * n2 + viewport.yZ * n3);
        Label_0168: {
            float n10 = 0.0f;
            Label_0159: {
                float n9 = 0.0f;
                Label_0147: {
                    Label_0137: {
                        float n8 = 0.0f;
                        Label_0125: {
                            Label_0116: {
                                int n7;
                                try {
                                    n7 = (int)(n8 = (n9 = (n10 = fcmpl(n5, -n4))));
                                    if (a != 0) {
                                        break Label_0125;
                                    }
                                    if (n7 >= 0) {
                                        break Label_0116;
                                    }
                                    break Label_0168;
                                }
                                catch (NullPointerException ex) {
                                    throw ex;
                                }
                                try {
                                    if (n7 < 0) {
                                        break Label_0168;
                                    }
                                    n9 = (n8 = (n10 = fcmpg(n5, n4)));
                                }
                                catch (NullPointerException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                if (a != 0) {
                                    break Label_0147;
                                }
                                if (n8 <= 0) {
                                    break Label_0137;
                                }
                                break Label_0168;
                            }
                            catch (NullPointerException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            if (n8 > 0) {
                                break Label_0168;
                            }
                            n10 = (n9 = fcmpl(n6, -n4));
                        }
                        catch (NullPointerException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        if (a != 0) {
                            break Label_0168;
                        }
                        if (n9 >= 0) {
                            break Label_0159;
                        }
                        break Label_0168;
                    }
                    catch (NullPointerException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (n9 < 0) {
                        break Label_0168;
                    }
                    n10 = fcmpg(n6, n4);
                }
                catch (NullPointerException ex6) {
                    throw ex6;
                }
            }
            try {
                if (n10 <= 0) {
                    return new Point(Math.round(toolkit.absoluteX + toolkit.xMultiplier * n5 / n4), Math.round(toolkit.absoluteY + toolkit.yMultiplier * n6 / n4));
                }
            }
            catch (NullPointerException ex7) {
                throw ex7;
            }
        }
        final Point point = new Point(-1, -1);
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
        return point;
    }
    
    public static Point worldToMap(double n, double n2) {
        int a = Widgets.a;
        final Client client = Context.client();
        final Player local = Players.getLocal();
        n -= Game.getBaseX();
        n2 -= Game.getBaseY();
        final RegionOffset regionOffset = local.getRegionOffset();
        final int n3 = (int)(n * 4.0 + 2.0) - (regionOffset.getX() << 9) / 128;
        final int n4 = (int)(n2 * 4.0 + 2.0) - (regionOffset.getY() << 9) / 128;
        final WidgetChild map = WidgetCache.getMap();
        try {
            if (map == null) {
                return new Point(-1, -1);
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
        final int n5 = n3 * n3 + n4 * n4;
        final int n6 = Math.max(map.getWidth() / 2, map.getHeight() / 2) - 8;
        Point point = null;
        Label_0397: {
            int n8 = 0;
            int n10 = 0;
            Label_0161: {
                int n7;
                int n9;
                try {
                    n7 = (n8 = n6 * n6);
                    n9 = (n10 = n5);
                    if (a != 0) {
                        break Label_0161;
                    }
                    if (n7 >= n9) {
                        break Label_0161;
                    }
                    break Label_0397;
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
                try {
                    if (n7 < n9) {
                        break Label_0397;
                    }
                    n8 = 16383;
                    n10 = (int)client.getMinimapAngle();
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
            }
            int n11 = n8 & n10;
            int minimapSettings = 0;
            Label_0213: {
                Label_0212: {
                    Label_0204: {
                        int n12;
                        try {
                            n12 = (minimapSettings = client.getMinimapSettings());
                            if (a != 0) {
                                break Label_0204;
                            }
                            final Constants constants = Context.constants();
                            final int n13 = constants.MINIMAP_SETTINGS_ON;
                            if (n12 == n13) {
                                break Label_0204;
                            }
                            break Label_0212;
                        }
                        catch (NullPointerException ex4) {
                            throw ex4;
                        }
                        try {
                            final Constants constants = Context.constants();
                            final int n13 = constants.MINIMAP_SETTINGS_ON;
                            if (n12 != n13) {
                                break Label_0212;
                            }
                            minimapSettings = 1;
                        }
                        catch (NullPointerException ex5) {
                            throw ex5;
                        }
                    }
                    break Label_0213;
                }
                minimapSettings = 0;
            }
            final int n14 = minimapSettings;
            int n15 = 0;
            Label_0257: {
                Label_0251: {
                    try {
                        n15 = n14;
                        if (a != 0) {
                            break Label_0257;
                        }
                        if (n15 != 0) {
                            break Label_0251;
                        }
                    }
                    catch (NullPointerException ex6) {
                        throw ex6;
                    }
                    n11 = (0x3FFF & client.getMinimapOffset() + (int)client.getMinimapAngle());
                }
                final int n16 = Calculations.SIN_TABLE[n11];
            }
            int n17 = n15;
            int n18 = Calculations.COS_TABLE[n11];
            int n19 = 0;
            Label_0316: {
                try {
                    n19 = n14;
                    if (a != 0) {
                        return new Point(n19 + map.getAbsoluteX() + map.getWidth() / 2, -(n18 * n4 - n17 * n3 >> 15) + map.getAbsoluteY() + map.getHeight() / 2);
                    }
                    if (n19 != 0) {
                        break Label_0316;
                    }
                }
                catch (NullPointerException ex7) {
                    throw ex7;
                }
                final int n20 = 256 + client.getMinimapScale();
                n17 = 256 * n17 / n20;
                n18 = 256 * n18 / n20;
            }
            return new Point(n19 + map.getAbsoluteX() + map.getWidth() / 2, -(n18 * n4 - n17 * n3 >> 15) + map.getAbsoluteY() + map.getHeight() / 2);
            try {
                point = new Point(-1, -1);
                if (Task.a != 0) {
                    Widgets.a = ++a;
                }
            }
            catch (NullPointerException ex8) {
                throw ex8;
            }
        }
        return point;
    }
    
    public static boolean isOnScreen(final Point point) {
        return isOnScreen(point.x, point.y);
    }
    
    public static boolean isOnScreen(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     7: invokeinterface org/powerbot/game/client/Client.getCanvas:()Ljava/awt/Canvas;
        //    12: astore_2       
        //    13: iload_0        
        //    14: iload_3        
        //    15: ifne            26
        //    18: iflt            77
        //    21: goto            25
        //    24: athrow         
        //    25: iload_1        
        //    26: iload_3        
        //    27: ifne            38
        //    30: iflt            77
        //    33: goto            37
        //    36: athrow         
        //    37: iload_0        
        //    38: aload_2        
        //    39: invokevirtual   java/awt/Canvas.getWidth:()I
        //    42: iload_3        
        //    43: ifne            70
        //    46: if_icmpge       77
        //    49: goto            53
        //    52: athrow         
        //    53: iload_1        
        //    54: iload_3        
        //    55: ifne            74
        //    58: goto            62
        //    61: athrow         
        //    62: aload_2        
        //    63: invokevirtual   java/awt/Canvas.getHeight:()I
        //    66: goto            70
        //    69: athrow         
        //    70: if_icmpge       77
        //    73: iconst_1       
        //    74: goto            78
        //    77: iconst_0       
        //    78: ireturn        
        //    StackMapTable: 00 0F FF 00 18 00 04 01 01 07 00 BD 01 00 01 07 00 0B 00 40 01 49 07 00 0B 00 40 01 4D 07 00 0B 00 47 07 00 0B 40 01 46 07 00 0B FF 00 00 00 04 01 01 07 00 BD 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  53     66     69     70     Ljava/lang/NullPointerException;
        //  46     58     61     62     Ljava/lang/NullPointerException;
        //  38     49     52     53     Ljava/lang/NullPointerException;
        //  26     33     36     37     Ljava/lang/NullPointerException;
        //  13     21     24     25     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public static double distance(final Locatable locatable, final Locatable locatable2) {
        final Tile location = locatable.getLocation();
        final Tile location2 = locatable2.getLocation();
        return Math.sqrt(Math.pow(location.getX() - location2.getX(), 2.0) + Math.pow(location.getY() - location2.getY(), 2.0));
    }
    
    public static double distance(final RegionOffset regionOffset, final RegionOffset regionOffset2) {
        return Math.sqrt(Math.pow(regionOffset.getX() - regionOffset2.getX(), 2.0) + Math.pow(regionOffset.getY() - regionOffset2.getY(), 2.0));
    }
    
    public static double distance(final int n, final int n2, final int n3, final int n4) {
        return Math.sqrt(Math.pow(n - n3, 2.0) + Math.pow(n2 - n4, 2.0));
    }
    
    public static double distanceTo(final Locatable locatable) {
        return distance(locatable, Players.getLocal());
    }
    
    public static double distanceTo(final RegionOffset regionOffset) {
        return distance(regionOffset, Players.getLocal().getRegionOffset());
    }
    
    public static double distanceTo(final int n, final int n2) {
        final Tile location = Players.getLocal().getLocation();
        return distance(n, n2, location.getX(), location.getY());
    }
    
    static {
        SIN_TABLE = new int[16384];
        COS_TABLE = new int[16384];
        int i = 0;
        try {
            while (i < 16384) {
                Calculations.SIN_TABLE[i] = (int)(32768.0 * Math.sin(i * 3.834951969714103E-4));
                Calculations.COS_TABLE[i] = (int)(32768.0 * Math.cos(i * 3.834951969714103E-4));
                ++i;
            }
        }
        catch (NullPointerException ex) {
            throw ex;
        }
    }
}
