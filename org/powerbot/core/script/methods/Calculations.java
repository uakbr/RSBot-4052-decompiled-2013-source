
package org.powerbot.core.script.methods;

import org.powerbot.game.client.RenderData;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.core.Bot;
import org.powerbot.game.client.Render;
import org.powerbot.core.script.wrappers.Player;
import org.powerbot.core.script.wrappers.Tile;
import org.powerbot.core.script.wrappers.Locatable;
import org.powerbot.core.script.job.Task;
import java.awt.Point;

public class Calculations
{
    public static final int[] SIN_TABLE;
    public static final int[] COS_TABLE;
    public static final Toolkit toolkit;
    public static final Viewport viewport;
    public static boolean a;
    
    public static boolean isPointOnScreen(final Point point) {
        return isPointOnScreen(point.x, point.y);
    }
    
    public static boolean isPointOnScreen(final int n, final int n2) {
        return false;
    }
    
    public static int tileHeight(final int n, final int n2) {
        return tileHeight(n, n2, -1);
    }
    
    public static int tileHeight(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          14
        //     5: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_3       
        //     9: aload_3        
        //    10: ifnonnull       16
        //    13: iconst_0       
        //    14: ireturn        
        //    15: athrow         
        //    16: iload_2        
        //    17: iload           14
        //    19: ifne            40
        //    22: iconst_m1      
        //    23: if_icmpne       41
        //    26: goto            30
        //    29: athrow         
        //    30: aload_3        
        //    31: invokeinterface org/powerbot/game/client/Client.getPlane:()I
        //    36: goto            40
        //    39: athrow         
        //    40: istore_2       
        //    41: aload_3        
        //    42: invokeinterface org/powerbot/game/client/Client.getRSGroundInfo:()Lorg/powerbot/game/client/RSInfo;
        //    47: astore          4
        //    49: aload           4
        //    51: iload           14
        //    53: ifne            65
        //    56: ifnull          73
        //    59: goto            63
        //    62: athrow         
        //    63: aload           4
        //    65: invokeinterface org/powerbot/game/client/RSInfo.getGroundBytes:()Lorg/powerbot/game/client/RSGroundBytes;
        //    70: goto            74
        //    73: aconst_null    
        //    74: astore          5
        //    76: aload           5
        //    78: iload           14
        //    80: ifne            92
        //    83: ifnull          100
        //    86: goto            90
        //    89: athrow         
        //    90: aload           5
        //    92: invokeinterface org/powerbot/game/client/RSGroundBytes.getBytes:()[[[B
        //    97: goto            104
        //   100: aconst_null    
        //   101: checkcast       [[[B
        //   104: astore          6
        //   106: aload           6
        //   108: ifnull          504
        //   111: iload_0        
        //   112: sipush          512
        //   115: iload           14
        //   117: ifne            167
        //   120: goto            124
        //   123: athrow         
        //   124: if_icmplt       150
        //   127: goto            131
        //   130: athrow         
        //   131: iload_0        
        //   132: ldc             52224
        //   134: iload           14
        //   136: ifne            197
        //   139: goto            143
        //   142: athrow         
        //   143: if_icmple       189
        //   146: goto            150
        //   149: athrow         
        //   150: iload_1        
        //   151: iload           14
        //   153: ifne            200
        //   156: goto            160
        //   159: athrow         
        //   160: sipush          512
        //   163: goto            167
        //   166: athrow         
        //   167: if_icmplt       199
        //   170: iload_1        
        //   171: iload           14
        //   173: ifne            200
        //   176: goto            180
        //   179: athrow         
        //   180: ldc             52224
        //   182: if_icmpgt       199
        //   185: goto            189
        //   188: athrow         
        //   189: iload_0        
        //   190: bipush          9
        //   192: ishr           
        //   193: istore_0       
        //   194: iload_1        
        //   195: bipush          9
        //   197: ishr           
        //   198: istore_1       
        //   199: iload_0        
        //   200: iload           14
        //   202: ifne            268
        //   205: iflt            267
        //   208: goto            212
        //   211: athrow         
        //   212: iload_0        
        //   213: iload           14
        //   215: ifne            268
        //   218: goto            222
        //   221: athrow         
        //   222: bipush          103
        //   224: if_icmpgt       267
        //   227: goto            231
        //   230: athrow         
        //   231: iload_1        
        //   232: iload           14
        //   234: ifne            268
        //   237: goto            241
        //   240: athrow         
        //   241: iflt            267
        //   244: goto            248
        //   247: athrow         
        //   248: iload_1        
        //   249: bipush          103
        //   251: iload           14
        //   253: ifne            271
        //   256: goto            260
        //   259: athrow         
        //   260: if_icmple       269
        //   263: goto            267
        //   266: athrow         
        //   267: iconst_0       
        //   268: ireturn        
        //   269: iload_2        
        //   270: iconst_3       
        //   271: iload           14
        //   273: ifne            296
        //   276: if_icmpgt       307
        //   279: goto            283
        //   282: athrow         
        //   283: aload           6
        //   285: iconst_1       
        //   286: aaload         
        //   287: iload_0        
        //   288: aaload         
        //   289: iload_1        
        //   290: baload         
        //   291: iconst_2       
        //   292: goto            296
        //   295: athrow         
        //   296: iand           
        //   297: ifeq            307
        //   300: iinc            2, 1
        //   303: goto            307
        //   306: athrow         
        //   307: aload           4
        //   309: invokeinterface org/powerbot/game/client/RSInfo.getRSGroundInfo:()Lorg/powerbot/game/client/RSGroundInfo;
        //   314: astore          7
        //   316: aload           7
        //   318: iload           14
        //   320: ifne            332
        //   323: ifnull          340
        //   326: goto            330
        //   329: athrow         
        //   330: aload           7
        //   332: invokeinterface org/powerbot/game/client/RSGroundInfo.getTileData:()[Lorg/powerbot/game/client/TileData;
        //   337: goto            341
        //   340: aconst_null    
        //   341: astore          8
        //   343: aload           8
        //   345: ifnull          385
        //   348: iload_2        
        //   349: iload           14
        //   351: ifne            390
        //   354: goto            358
        //   357: athrow         
        //   358: iflt            385
        //   361: goto            365
        //   364: athrow         
        //   365: iload_2        
        //   366: iload           14
        //   368: ifne            390
        //   371: goto            375
        //   374: athrow         
        //   375: aload           8
        //   377: arraylength    
        //   378: if_icmplt       391
        //   381: goto            385
        //   384: athrow         
        //   385: iconst_0       
        //   386: goto            390
        //   389: athrow         
        //   390: ireturn        
        //   391: aload           8
        //   393: iload_2        
        //   394: aaload         
        //   395: invokeinterface org/powerbot/game/client/TileData.getHeights:()[[I
        //   400: astore          9
        //   402: aload           9
        //   404: ifnull          504
        //   407: iload_0        
        //   408: sipush          511
        //   411: iand           
        //   412: istore          10
        //   414: iload_1        
        //   415: sipush          511
        //   418: iand           
        //   419: istore          11
        //   421: aload           9
        //   423: iload_0        
        //   424: aaload         
        //   425: iload_1        
        //   426: iaload         
        //   427: sipush          512
        //   430: iload           10
        //   432: isub           
        //   433: imul           
        //   434: aload           9
        //   436: iload_0        
        //   437: iconst_1       
        //   438: iadd           
        //   439: aaload         
        //   440: iload_1        
        //   441: iaload         
        //   442: iload           10
        //   444: imul           
        //   445: iadd           
        //   446: bipush          9
        //   448: ishr           
        //   449: istore          12
        //   451: aload           9
        //   453: iload_0        
        //   454: aaload         
        //   455: iconst_1       
        //   456: iload_1        
        //   457: iadd           
        //   458: iaload         
        //   459: sipush          512
        //   462: iload           10
        //   464: isub           
        //   465: imul           
        //   466: aload           9
        //   468: iload_0        
        //   469: iconst_1       
        //   470: iadd           
        //   471: aaload         
        //   472: iload_1        
        //   473: iconst_1       
        //   474: iadd           
        //   475: iaload         
        //   476: iload           10
        //   478: imul           
        //   479: iadd           
        //   480: bipush          9
        //   482: ishr           
        //   483: istore          13
        //   485: iload           12
        //   487: sipush          512
        //   490: iload           11
        //   492: isub           
        //   493: imul           
        //   494: iload           13
        //   496: iload           11
        //   498: imul           
        //   499: iadd           
        //   500: bipush          9
        //   502: ishr           
        //   503: ireturn        
        //   504: iconst_0       
        //   505: ireturn        
        //    StackMapTable: 00 4C FF 00 0F 00 0F 01 01 01 07 00 7D 00 00 00 00 00 00 00 00 00 00 01 00 01 07 01 2B 00 4C 07 01 2B 00 48 07 01 2B 40 01 00 FF 00 14 00 0F 01 01 01 07 00 7D 07 00 80 00 00 00 00 00 00 00 00 00 01 00 01 07 01 2B 00 41 07 00 80 07 40 07 00 82 FF 00 0E 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 00 00 00 00 00 00 00 00 01 00 01 07 01 2B 00 41 07 00 82 07 43 07 00 0B FF 00 12 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 01 07 01 2B FF 00 00 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 45 07 01 2B 00 4A 07 01 2B FF 00 00 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 45 07 01 2B 00 48 07 01 2B 40 01 45 07 01 2B FF 00 00 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 4B 07 01 2B 40 01 47 07 01 2B 00 FF 00 07 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 01 40 01 4A 07 01 2B 00 48 07 01 2B 40 01 47 07 01 2B 00 48 07 01 2B 40 01 45 07 01 2B 00 4A 07 01 2B FF 00 00 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 45 07 01 2B 00 40 01 00 FF 00 01 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 4A 07 01 2B 00 4B 07 01 2B FF 00 00 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 02 01 01 49 07 01 2B 00 FF 00 15 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 07 00 86 00 00 00 00 00 00 01 00 01 07 01 2B 00 41 07 00 86 07 40 07 01 2E FF 00 0F 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 07 00 86 07 01 2E 00 00 00 00 00 01 00 01 07 01 2B 40 01 45 07 01 2B 00 48 07 01 2B 40 01 48 07 01 2B 00 43 07 01 2B 40 01 00 FF 00 70 00 0F 01 01 01 07 00 7D 07 00 80 07 00 82 07 00 0B 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  375    386    389    390    Ljava/lang/RuntimeException;
        //  365    381    384    385    Ljava/lang/RuntimeException;
        //  358    371    374    375    Ljava/lang/RuntimeException;
        //  348    361    364    365    Ljava/lang/RuntimeException;
        //  343    354    357    358    Ljava/lang/RuntimeException;
        //  316    326    329    330    Ljava/lang/RuntimeException;
        //  296    303    306    307    Ljava/lang/RuntimeException;
        //  276    292    295    296    Ljava/lang/RuntimeException;
        //  271    279    282    283    Ljava/lang/RuntimeException;
        //  248    263    266    267    Ljava/lang/RuntimeException;
        //  241    256    259    260    Ljava/lang/RuntimeException;
        //  231    244    247    248    Ljava/lang/RuntimeException;
        //  222    237    240    241    Ljava/lang/RuntimeException;
        //  212    227    230    231    Ljava/lang/RuntimeException;
        //  205    218    221    222    Ljava/lang/RuntimeException;
        //  200    208    211    212    Ljava/lang/RuntimeException;
        //  170    185    188    189    Ljava/lang/RuntimeException;
        //  167    176    179    180    Ljava/lang/RuntimeException;
        //  150    163    166    167    Ljava/lang/RuntimeException;
        //  143    156    159    160    Ljava/lang/RuntimeException;
        //  131    146    149    150    Ljava/lang/RuntimeException;
        //  124    139    142    143    Ljava/lang/RuntimeException;
        //  111    127    130    131    Ljava/lang/RuntimeException;
        //  106    120    123    124    Ljava/lang/RuntimeException;
        //  76     86     89     90     Ljava/lang/RuntimeException;
        //  49     59     62     63     Ljava/lang/RuntimeException;
        //  22     36     39     40     Ljava/lang/RuntimeException;
        //  16     26     29     30     Ljava/lang/RuntimeException;
        //  9      15     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
        final boolean a = Calculations.a;
        Label_0079: {
            int n5 = 0;
            int n11 = 0;
            Label_0067: {
                int tileHeight = 0;
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
                                        tileHeight = n;
                                        n5 = n;
                                        n6 = n;
                                        n7 = n;
                                        n8 = (n9 = (n10 = (n11 = (n12 = 512))));
                                        if (a) {
                                            break Label_0029;
                                        }
                                        if (n >= n8) {
                                            break Label_0021;
                                        }
                                        break Label_0079;
                                    }
                                    catch (RuntimeException ex) {
                                        throw ex;
                                    }
                                    try {
                                        if (n < n8) {
                                            break Label_0079;
                                        }
                                        tileHeight = n2;
                                        n5 = n2;
                                        n6 = n2;
                                        n7 = n2;
                                        n10 = (n9 = (n11 = (n12 = 512)));
                                    }
                                    catch (RuntimeException ex2) {
                                        throw ex2;
                                    }
                                }
                                try {
                                    if (a) {
                                        break Label_0048;
                                    }
                                    if (n7 >= n9) {
                                        break Label_0041;
                                    }
                                    break Label_0079;
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                            }
                            try {
                                if (n7 < n9) {
                                    break Label_0079;
                                }
                                tileHeight = n;
                                n5 = n;
                                n6 = n;
                                n11 = (n10 = (n12 = 52224));
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                        }
                        try {
                            if (a) {
                                break Label_0067;
                            }
                            if (n6 <= n10) {
                                break Label_0060;
                            }
                            break Label_0079;
                        }
                        catch (RuntimeException ex5) {
                            throw ex5;
                        }
                    }
                    try {
                        if (n6 > n10) {
                            break Label_0079;
                        }
                        tileHeight = n2;
                        n5 = n2;
                        n12 = (n11 = 52224);
                    }
                    catch (RuntimeException ex6) {
                        throw ex6;
                    }
                }
                try {
                    if (a) {
                        return worldToScreen(n, tileHeight + n12, n2);
                    }
                    if (n5 > n11) {
                        break Label_0079;
                    }
                    break Label_0079;
                }
                catch (RuntimeException ex7) {
                    throw ex7;
                }
            }
            try {
                if (n5 > n11) {
                    return new Point(-1, -1);
                }
            }
            catch (RuntimeException ex8) {
                throw ex8;
            }
        }
        int tileHeight = tileHeight(n, n2, n3);
        int n12 = n4;
        return worldToScreen(n, tileHeight + n12, n2);
    }
    
    public static Point worldToScreen(final int n, final int n2, final int n3) {
        final boolean a = Calculations.a;
        final float n4 = Calculations.viewport.zOff + (Calculations.viewport.zX * n + Calculations.viewport.zY * n2 + Calculations.viewport.zZ * n3);
        final float n5 = Calculations.viewport.xOff + (Calculations.viewport.xX * n + Calculations.viewport.xY * n2 + Calculations.viewport.xZ * n3);
        final float n6 = Calculations.viewport.yOff + (Calculations.viewport.yX * n + Calculations.viewport.yY * n2 + Calculations.viewport.yZ * n3);
        Label_0184: {
            float n10 = 0.0f;
            Label_0176: {
                float n9 = 0.0f;
                Label_0164: {
                    Label_0155: {
                        float n8 = 0.0f;
                        Label_0143: {
                            Label_0135: {
                                int n7;
                                try {
                                    n7 = (int)(n8 = (n9 = (n10 = fcmpl(n5, -n4))));
                                    if (a) {
                                        break Label_0143;
                                    }
                                    if (n7 >= 0) {
                                        break Label_0135;
                                    }
                                    break Label_0184;
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                                try {
                                    if (n7 < 0) {
                                        break Label_0184;
                                    }
                                    n9 = (n8 = (n10 = fcmpg(n5, n4)));
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                if (a) {
                                    break Label_0164;
                                }
                                if (n8 <= 0) {
                                    break Label_0155;
                                }
                                break Label_0184;
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            if (n8 > 0) {
                                break Label_0184;
                            }
                            n10 = (n9 = fcmpl(n6, -n4));
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        if (a) {
                            break Label_0184;
                        }
                        if (n9 >= 0) {
                            break Label_0176;
                        }
                        break Label_0184;
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (n9 < 0) {
                        break Label_0184;
                    }
                    n10 = fcmpg(n6, n4);
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            try {
                if (n10 <= 0) {
                    return new Point(Math.round(Calculations.toolkit.absoluteX + Calculations.toolkit.xMultiplier * n5 / n4), Math.round(Calculations.toolkit.absoluteY + Calculations.toolkit.yMultiplier * n6 / n4));
                }
            }
            catch (RuntimeException ex7) {
                throw ex7;
            }
        }
        final Point point = new Point(-1, -1);
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
        return point;
    }
    
    public static double distance(final int n, final int n2, final int n3, final int n4) {
        return Math.sqrt(Math.pow(n - n3, 2.0) + Math.pow(n2 - n4, 2.0));
    }
    
    public static double distance(final Locatable locatable, final Locatable locatable2) {
        final boolean a = Calculations.a;
        Tile location = null;
        Label_0028: {
            Label_0027: {
                Locatable locatable3 = null;
                Label_0019: {
                    try {
                        locatable3 = locatable;
                        if (a) {
                            break Label_0019;
                        }
                        if (locatable == null) {
                            break Label_0027;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    locatable3 = locatable;
                }
                location = locatable3.getLocation();
                break Label_0028;
            }
            location = null;
        }
        final Tile tile = location;
        Tile location2 = null;
        Label_0052: {
            Label_0051: {
                Locatable locatable4 = null;
                Label_0043: {
                    try {
                        locatable4 = locatable2;
                        if (a) {
                            break Label_0043;
                        }
                        if (locatable2 == null) {
                            break Label_0051;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    locatable4 = locatable2;
                }
                location2 = locatable4.getLocation();
                break Label_0052;
            }
            location2 = null;
        }
        final Tile tile2 = location2;
        Label_0084: {
            Tile tile4 = null;
            Label_0067: {
                try {
                    final Tile tile5;
                    final Tile tile3 = tile4 = (tile5 = tile);
                    if (a) {
                        break Label_0067;
                    }
                    if (tile3 == null) {
                        return Double.MAX_VALUE;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                Tile tile5 = tile4 = tile2;
                try {
                    if (a) {
                        return distance(tile5.x, tile.y, tile2.x, tile2.y);
                    }
                    if (tile4 == null) {
                        return Double.MAX_VALUE;
                    }
                    break Label_0084;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            try {
                if (tile4 == null) {
                    return Double.MAX_VALUE;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        Tile tile5 = tile;
        return distance(tile5.x, tile.y, tile2.x, tile2.y);
    }
    
    public static double distanceTo(final int n, final int n2) {
        final boolean a = Calculations.a;
        final Player local = Players.getLocal();
        Player player = null;
        Label_0023: {
            try {
                player = local;
                if (a) {
                    break Label_0023;
                }
                if (player == null) {
                    return Double.MAX_VALUE;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        Tile location;
        final Tile tile2;
        final Tile tile = tile2 = (location = player.getLocation());
        Label_0045: {
            try {
                if (a) {
                    return distance(location.x, tile2.y, n, n2);
                }
                if (tile == null) {
                    return Double.MAX_VALUE;
                }
                break Label_0045;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            try {
                if (tile == null) {
                    return Double.MAX_VALUE;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        location = tile2;
        return distance(location.x, tile2.y, n, n2);
    }
    
    public static double distanceTo(final Locatable locatable) {
        return distance(Players.getLocal(), locatable);
    }
    
    public static void updateToolkit(final Render render) {
        Label_0076: {
            Label_0016: {
                try {
                    if (Calculations.a) {
                        break Label_0076;
                    }
                    final Render render2 = render;
                    if (render2 == null) {
                        return;
                    }
                    break Label_0016;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final Render render2 = render;
                    if (render2 == null) {
                        return;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            Calculations.toolkit.absoluteX = render.getAbsoluteX();
            Calculations.toolkit.absoluteY = render.getAbsoluteY();
            Calculations.toolkit.xMultiplier = render.getXMultiplier();
            Calculations.toolkit.yMultiplier = render.getYMultiplier();
            Calculations.toolkit.graphicsIndex = render.getGraphicsIndex();
        }
        final Constants constants = Bot.constants();
        final RenderData renderData = render.getRenderData();
        try {
            if (Calculations.viewport == null || constants == null) {
                return;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final float[] floats;
        if ((floats = renderData.getFloats()) != null) {
            Calculations.viewport.xOff = floats[constants.VIEWPORT_XOFF];
            Calculations.viewport.xX = floats[constants.VIEWPORT_XX];
            Calculations.viewport.xY = floats[constants.VIEWPORT_XY];
            Calculations.viewport.xZ = floats[constants.VIEWPORT_XZ];
            Calculations.viewport.yOff = floats[constants.VIEWPORT_YOFF];
            Calculations.viewport.yX = floats[constants.VIEWPORT_YX];
            Calculations.viewport.yY = floats[constants.VIEWPORT_YY];
            Calculations.viewport.yZ = floats[constants.VIEWPORT_YZ];
            Calculations.viewport.zOff = floats[constants.VIEWPORT_ZOFF];
            Calculations.viewport.zX = floats[constants.VIEWPORT_ZX];
            Calculations.viewport.zY = floats[constants.VIEWPORT_ZY];
            Calculations.viewport.zZ = floats[constants.VIEWPORT_ZZ];
        }
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
        catch (RuntimeException ex) {
            throw ex;
        }
        toolkit = new Toolkit();
        viewport = new Viewport();
    }
    
    public static class Viewport
    {
        public float xOff;
        public float xX;
        public float xY;
        public float xZ;
        public float yOff;
        public float yX;
        public float yY;
        public float yZ;
        public float zOff;
        public float zX;
        public float zY;
        public float zZ;
    }
    
    public static class Toolkit
    {
        public float absoluteX;
        public float absoluteY;
        public float xMultiplier;
        public float yMultiplier;
        public int graphicsIndex;
    }
}
