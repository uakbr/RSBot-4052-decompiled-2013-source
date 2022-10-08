
package org.powerbot.game.api.methods;

import java.util.HashMap;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.core.script.wrappers.Component;
import org.powerbot.game.client.RandomAccessFile;
import org.powerbot.game.client.RSInterfaceBase;
import java.util.ArrayList;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.client.Client;
import java.util.Map;

public class Widgets
{
    private static final Map<Client, Widget[]> caches;
    public static int a;
    private static final String z;
    
    public static Widget[] getLoaded() {
        final int a = Widgets.a;
        final Client client = Context.client();
        Client client3 = null;
        Label_0033: {
            Label_0022: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (a != 0) {
                        break Label_0033;
                    }
                    if (client2 == null) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return new Widget[0];
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            ensureCapacity(client);
            client3 = client;
        }
        final RSInterfaceBase[] rsInterfaceCache = client3.getRSInterfaceCache();
        try {
            if (rsInterfaceCache == null) {
                return new Widget[0];
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final ArrayList<Widget> list = new ArrayList<Widget>();
        int i = 0;
        while (i < rsInterfaceCache.length) {
            Label_0117: {
                Label_0114: {
                    try {
                        final Object[] array2;
                        final RSInterfaceBase[] array = (RSInterfaceBase[])(array2 = rsInterfaceCache);
                        if (a != 0) {
                            return (Widget[])array2;
                        }
                        if (array[i] == null) {
                            break Label_0114;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    final Widget value = get(i);
                    Label_0103: {
                        try {
                            if (a != 0) {
                                break Label_0117;
                            }
                            final Widget widget = value;
                            final boolean b = widget.validate();
                            if (b) {
                                break Label_0103;
                            }
                            break Label_0114;
                        }
                        catch (RuntimeException ex5) {
                            throw ex5;
                        }
                        try {
                            final Widget widget = value;
                            final boolean b = widget.validate();
                            if (b) {
                                list.add(value);
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        Object[] array2 = list.toArray(new Widget[list.size()]);
        return (Widget[])array2;
    }
    
    public static Widget get(final int i) {
        final int a = Widgets.a;
        try {
            if (i < 0) {
                throw new RuntimeException(RandomAccessFile.e(Widgets.z) + i + Component.e("P"));
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final Client client = Context.client();
        Widget[] array = Widgets.caches.get(client);
        Label_0095: {
            try {
                final Widget[] array2 = array;
                if (a != 0) {
                    break Label_0095;
                }
                if (array2 != null) {
                    break Label_0095;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            array = new Widget[100];
            Widgets.caches.put(client, array);
        }
        Widget widget2 = null;
        Label_0182: {
            if (i < array.length) {
                Widget widget = array[i];
                try {
                    widget2 = widget;
                    if (a != 0) {
                        return widget2;
                    }
                    if (widget2 != null) {
                        break Label_0182;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                widget = new Widget(i);
                array[i] = widget;
                if (a == 0) {
                    break Label_0182;
                }
            }
            Widget widget = new Widget(i);
            ensureCapacity(client);
            final Widget[] array3 = Widgets.caches.get(client);
            if (a == 0) {
                final Widget[] array4 = array3;
                try {
                    if (i >= array4.length) {
                        break Label_0182;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            array3[i] = widget;
        }
        return widget2;
    }
    
    public static WidgetChild get(final int n, final int n2) {
        return get(n).getChild(n2);
    }
    
    public static WidgetChild getChild(final int n) {
        return get(n >> 16).getChild(n & 0xFFFF);
    }
    
    public static WidgetChild getContinue() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: sipush          752
        //     7: iconst_5       
        //     8: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    11: astore_0       
        //    12: aload_0        
        //    13: iload_1        
        //    14: ifne            97
        //    17: ifnull          87
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    28: iload_1        
        //    29: ifne            90
        //    32: goto            36
        //    35: athrow         
        //    36: ifeq            87
        //    39: goto            43
        //    42: athrow         
        //    43: aload_0        
        //    44: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getTextColor:()I
        //    47: sipush          128
        //    50: iload_1        
        //    51: ifne            92
        //    54: goto            58
        //    57: athrow         
        //    58: if_icmpne       87
        //    61: goto            65
        //    64: athrow         
        //    65: aload_0        
        //    66: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeX:()I
        //    69: iload_1        
        //    70: ifne            90
        //    73: goto            77
        //    76: athrow         
        //    77: ifne            87
        //    80: goto            84
        //    83: athrow         
        //    84: aload_0        
        //    85: areturn        
        //    86: athrow         
        //    87: sipush          1184
        //    90: bipush          18
        //    92: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    95: astore_0       
        //    96: aload_0        
        //    97: iload_1        
        //    98: ifne            140
        //   101: ifnull          130
        //   104: goto            108
        //   107: athrow         
        //   108: aload_0        
        //   109: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   112: iload_1        
        //   113: ifne            133
        //   116: goto            120
        //   119: athrow         
        //   120: ifeq            130
        //   123: goto            127
        //   126: athrow         
        //   127: aload_0        
        //   128: areturn        
        //   129: athrow         
        //   130: sipush          1186
        //   133: bipush          8
        //   135: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   138: astore_0       
        //   139: aload_0        
        //   140: iload_1        
        //   141: ifne            183
        //   144: ifnull          173
        //   147: goto            151
        //   150: athrow         
        //   151: aload_0        
        //   152: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   155: iload_1        
        //   156: ifne            176
        //   159: goto            163
        //   162: athrow         
        //   163: ifeq            173
        //   166: goto            170
        //   169: athrow         
        //   170: aload_0        
        //   171: areturn        
        //   172: athrow         
        //   173: sipush          1191
        //   176: bipush          18
        //   178: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   181: astore_0       
        //   182: aload_0        
        //   183: iload_1        
        //   184: ifne            195
        //   187: ifnull          215
        //   190: goto            194
        //   193: athrow         
        //   194: aload_0        
        //   195: iload_1        
        //   196: ifne            214
        //   199: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   202: ifeq            215
        //   205: goto            209
        //   208: athrow         
        //   209: aload_0        
        //   210: goto            214
        //   213: athrow         
        //   214: areturn        
        //   215: aconst_null    
        //   216: areturn        
        //    StackMapTable: 00 2F FF 00 17 00 02 07 00 65 01 00 01 07 00 0E 00 4A 07 00 0E 40 01 45 07 00 0E 00 4D 07 00 0E FF 00 00 00 02 07 00 65 01 00 02 01 01 45 07 00 0E 00 4A 07 00 0E 40 01 45 07 00 0E 00 41 07 00 0E 00 42 01 FF 00 01 00 02 07 00 65 01 00 02 01 01 44 07 00 65 49 07 00 0E 00 4A 07 00 0E 40 01 45 07 00 0E 00 41 07 00 0E 00 42 01 46 07 00 65 49 07 00 0E 00 4A 07 00 0E 40 01 45 07 00 0E 00 41 07 00 0E 00 42 01 46 07 00 65 49 07 00 0E 00 40 07 00 65 4C 07 00 0E 00 43 07 00 0E 40 07 00 65 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  199    210    213    214    Ljava/lang/RuntimeException;
        //  195    205    208    209    Ljava/lang/RuntimeException;
        //  183    190    193    194    Ljava/lang/RuntimeException;
        //  163    172    172    173    Ljava/lang/RuntimeException;
        //  151    166    169    170    Ljava/lang/RuntimeException;
        //  144    159    162    163    Ljava/lang/RuntimeException;
        //  140    147    150    151    Ljava/lang/RuntimeException;
        //  120    129    129    130    Ljava/lang/RuntimeException;
        //  108    123    126    127    Ljava/lang/RuntimeException;
        //  101    116    119    120    Ljava/lang/RuntimeException;
        //  97     104    107    108    Ljava/lang/RuntimeException;
        //  77     86     86     87     Ljava/lang/RuntimeException;
        //  65     80     83     84     Ljava/lang/RuntimeException;
        //  58     73     76     77     Ljava/lang/RuntimeException;
        //  43     61     64     65     Ljava/lang/RuntimeException;
        //  36     54     57     58     Ljava/lang/RuntimeException;
        //  24     39     42     43     Ljava/lang/RuntimeException;
        //  17     32     35     36     Ljava/lang/RuntimeException;
        //  12     20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    
    public static boolean canContinue() {
        try {
            if (getContinue() != null) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    public static boolean clickContinue() {
        final int a = Widgets.a;
        final WidgetChild continue1 = getContinue();
        boolean click = false;
        Label_0040: {
            Label_0021: {
                WidgetChild widgetChild;
                try {
                    widgetChild = continue1;
                    if (a != 0) {
                        break Label_0021;
                    }
                    if (widgetChild == null) {
                        break Label_0040;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    click = widgetChild.click(true);
                    if (a != 0) {
                        return click;
                    }
                    if (!click) {
                        break Label_0040;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return click;
        }
        return click;
    }
    
    public static boolean scroll(final WidgetChild p0, final WidgetChild p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: iload           9
        //     8: ifne            19
        //    11: ifnull          70
        //    14: goto            18
        //    17: athrow         
        //    18: aload_1        
        //    19: iload           9
        //    21: ifne            32
        //    24: ifnull          70
        //    27: goto            31
        //    30: athrow         
        //    31: aload_0        
        //    32: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    35: iload           9
        //    37: ifne            75
        //    40: ifeq            70
        //    43: goto            47
        //    46: athrow         
        //    47: aload_1        
        //    48: iload           9
        //    50: ifne            77
        //    53: goto            57
        //    56: athrow         
        //    57: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    60: arraylength    
        //    61: bipush          6
        //    63: if_icmpeq       76
        //    66: goto            70
        //    69: athrow         
        //    70: iconst_1       
        //    71: goto            75
        //    74: athrow         
        //    75: ireturn        
        //    76: aload_0        
        //    77: astore_2       
        //    78: aload_2        
        //    79: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getScrollableContentHeight:()I
        //    82: ifne            124
        //    85: aload_2        
        //    86: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getParentId:()I
        //    89: iload           9
        //    91: ifne            128
        //    94: iload           9
        //    96: ifne            128
        //    99: goto            103
        //   102: athrow         
        //   103: iconst_m1      
        //   104: if_icmpeq       124
        //   107: goto            111
        //   110: athrow         
        //   111: aload_2        
        //   112: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getParentId:()I
        //   115: invokestatic    org/powerbot/game/api/methods/Widgets.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   118: astore_2       
        //   119: iload           9
        //   121: ifeq            78
        //   124: aload_2        
        //   125: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getScrollableContentHeight:()I
        //   128: iload           9
        //   130: ifne            147
        //   133: ifne            143
        //   136: goto            140
        //   139: athrow         
        //   140: iconst_0       
        //   141: ireturn        
        //   142: athrow         
        //   143: aload_2        
        //   144: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   147: istore_3       
        //   148: aload_2        
        //   149: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   152: istore          4
        //   154: aload_0        
        //   155: iload           9
        //   157: ifne            209
        //   160: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   163: iload_3        
        //   164: if_icmplt       203
        //   167: goto            171
        //   170: athrow         
        //   171: aload_0        
        //   172: iload           9
        //   174: ifne            209
        //   177: goto            181
        //   180: athrow         
        //   181: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   184: iload_3        
        //   185: iload           4
        //   187: iadd           
        //   188: aload_0        
        //   189: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   192: isub           
        //   193: if_icmpgt       203
        //   196: goto            200
        //   199: athrow         
        //   200: iconst_1       
        //   201: ireturn        
        //   202: athrow         
        //   203: aload_1        
        //   204: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   207: iconst_0       
        //   208: aaload         
        //   209: astore          5
        //   211: aload_2        
        //   212: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getScrollableContentHeight:()I
        //   215: istore          6
        //   217: aload           5
        //   219: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   222: i2f            
        //   223: iload           6
        //   225: i2f            
        //   226: fdiv           
        //   227: aload_0        
        //   228: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeY:()I
        //   231: iload           4
        //   233: ineg           
        //   234: iconst_2       
        //   235: idiv           
        //   236: iload           4
        //   238: iconst_2       
        //   239: idiv           
        //   240: aload_0        
        //   241: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   244: isub           
        //   245: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   248: iadd           
        //   249: i2f            
        //   250: fmul           
        //   251: f2i            
        //   252: istore          7
        //   254: iload           7
        //   256: iload           9
        //   258: ifne            282
        //   261: ifge            276
        //   264: goto            268
        //   267: athrow         
        //   268: iconst_0       
        //   269: istore          7
        //   271: iload           9
        //   273: ifeq            308
        //   276: iload           7
        //   278: goto            282
        //   281: athrow         
        //   282: aload           5
        //   284: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   287: iload           9
        //   289: ifne            342
        //   292: if_icmplt       308
        //   295: goto            299
        //   298: athrow         
        //   299: aload           5
        //   301: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   304: iconst_1       
        //   305: isub           
        //   306: istore          7
        //   308: aload           5
        //   310: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteX:()I
        //   313: iconst_0       
        //   314: aload           5
        //   316: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getWidth:()I
        //   319: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   322: iadd           
        //   323: aload           5
        //   325: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   328: iload           7
        //   330: iadd           
        //   331: iconst_1       
        //   332: invokestatic    org/powerbot/game/api/methods/input/Mouse.click:(IIZ)Z
        //   335: pop            
        //   336: sipush          200
        //   339: sipush          400
        //   342: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   345: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   348: aload_0        
        //   349: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   352: iload_3        
        //   353: if_icmplt       390
        //   356: aload_0        
        //   357: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   360: iload_3        
        //   361: iload           4
        //   363: iadd           
        //   364: aload_0        
        //   365: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   368: isub           
        //   369: iload           9
        //   371: ifne            408
        //   374: iload           9
        //   376: ifne            468
        //   379: goto            383
        //   382: athrow         
        //   383: if_icmple       463
        //   386: goto            390
        //   389: athrow         
        //   390: aload_0        
        //   391: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   394: iload           9
        //   396: ifne            412
        //   399: goto            403
        //   402: athrow         
        //   403: iload_3        
        //   404: goto            408
        //   407: athrow         
        //   408: if_icmpge       415
        //   411: iconst_1       
        //   412: goto            416
        //   415: iconst_0       
        //   416: istore          8
        //   418: aload_1        
        //   419: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   422: iload           8
        //   424: iload           9
        //   426: ifne            437
        //   429: ifeq            440
        //   432: goto            436
        //   435: athrow         
        //   436: iconst_4       
        //   437: goto            441
        //   440: iconst_5       
        //   441: aaload         
        //   442: iconst_1       
        //   443: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //   446: pop            
        //   447: bipush          100
        //   449: sipush          200
        //   452: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   455: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   458: iload           9
        //   460: ifeq            348
        //   463: aload_0        
        //   464: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   467: iload_3        
        //   468: iload           9
        //   470: ifne            506
        //   473: if_icmplt       513
        //   476: goto            480
        //   479: athrow         
        //   480: aload_0        
        //   481: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteY:()I
        //   484: iload           9
        //   486: ifne            510
        //   489: goto            493
        //   492: athrow         
        //   493: iload_3        
        //   494: iload           4
        //   496: iadd           
        //   497: aload_0        
        //   498: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
        //   501: isub           
        //   502: goto            506
        //   505: athrow         
        //   506: if_icmpgt       513
        //   509: iconst_1       
        //   510: goto            514
        //   513: iconst_0       
        //   514: ireturn        
        //    StackMapTable: 00 4A FF 00 11 00 0A 07 00 65 07 00 65 00 00 00 00 00 00 00 01 00 01 07 00 0E 00 40 07 00 65 4A 07 00 0E 00 40 07 00 65 4D 07 00 0E 00 48 07 00 0E 40 07 00 65 4B 07 00 0E 00 43 07 00 0E 40 01 00 40 07 00 65 FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 00 00 00 00 00 00 01 00 00 57 07 00 0E 40 01 46 07 00 0E 00 0C 43 01 4A 07 00 0E 00 41 07 00 0E 00 43 01 FF 00 16 00 0A 07 00 65 07 00 65 07 00 65 01 01 00 00 00 00 01 00 01 07 00 0E 00 48 07 00 0E 40 07 00 65 51 07 00 0E 00 41 07 00 0E 00 45 07 00 65 FF 00 39 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 01 07 00 0E 00 07 44 07 00 0E 40 01 4F 07 00 0E 00 08 FF 00 21 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 02 01 01 05 61 07 00 0E FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 02 01 01 45 07 00 0E 00 4B 07 00 0E 40 01 43 07 00 0E FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 02 01 01 43 01 02 40 01 FF 00 12 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 01 01 00 01 07 00 0E 40 07 00 D4 FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 01 01 00 02 07 00 D4 01 42 07 00 D4 FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 01 01 00 02 07 00 D4 01 FF 00 15 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 00 FF 00 04 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 02 01 01 4A 07 00 0E 00 4B 07 00 0E 40 01 4B 07 00 0E FF 00 00 00 0A 07 00 65 07 00 65 07 00 65 01 01 07 00 65 01 01 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  480    502    505    506    Ljava/lang/RuntimeException;
        //  473    489    492    493    Ljava/lang/RuntimeException;
        //  468    476    479    480    Ljava/lang/RuntimeException;
        //  418    432    435    436    Ljava/lang/RuntimeException;
        //  390    404    407    408    Ljava/lang/RuntimeException;
        //  383    399    402    403    Ljava/lang/RuntimeException;
        //  374    386    389    390    Ljava/lang/RuntimeException;
        //  356    379    382    383    Ljava/lang/RuntimeException;
        //  282    295    298    299    Ljava/lang/RuntimeException;
        //  271    278    281    282    Ljava/lang/RuntimeException;
        //  254    264    267    268    Ljava/lang/RuntimeException;
        //  181    202    202    203    Ljava/lang/RuntimeException;
        //  171    196    199    200    Ljava/lang/RuntimeException;
        //  160    177    180    181    Ljava/lang/RuntimeException;
        //  154    167    170    171    Ljava/lang/RuntimeException;
        //  133    142    142    143    Ljava/lang/RuntimeException;
        //  128    136    139    140    Ljava/lang/RuntimeException;
        //  94     107    110    111    Ljava/lang/RuntimeException;
        //  85     99     102    103    Ljava/lang/RuntimeException;
        //  57     71     74     75     Ljava/lang/RuntimeException;
        //  47     66     69     70     Ljava/lang/RuntimeException;
        //  40     53     56     57     Ljava/lang/RuntimeException;
        //  32     43     46     47     Ljava/lang/RuntimeException;
        //  19     27     30     31     Ljava/lang/RuntimeException;
        //  5      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    private static void ensureCapacity(final Client p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_3        
        //     6: ifne            18
        //     9: ifnonnull       17
        //    12: goto            16
        //    15: athrow         
        //    16: return         
        //    17: aload_0        
        //    18: invokeinterface org/powerbot/game/client/Client.getRSInterfaceCache:()[Lorg/powerbot/game/client/RSInterfaceBase;
        //    23: astore_1       
        //    24: getstatic       org/powerbot/game/api/methods/Widgets.caches:Ljava/util/Map;
        //    27: aload_0        
        //    28: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       [Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    36: astore_2       
        //    37: aload_2        
        //    38: iload_3        
        //    39: ifne            65
        //    42: ifnonnull       66
        //    45: goto            49
        //    48: athrow         
        //    49: bipush          100
        //    51: anewarray       Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    54: astore_2       
        //    55: getstatic       org/powerbot/game/api/methods/Widgets.caches:Ljava/util/Map;
        //    58: aload_0        
        //    59: aload_2        
        //    60: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    65: pop            
        //    66: aload_1        
        //    67: ifnull          109
        //    70: aload_2        
        //    71: iload_3        
        //    72: ifne            108
        //    75: goto            79
        //    78: athrow         
        //    79: arraylength    
        //    80: aload_1        
        //    81: arraylength    
        //    82: if_icmpge       109
        //    85: goto            89
        //    88: athrow         
        //    89: getstatic       org/powerbot/game/api/methods/Widgets.caches:Ljava/util/Map;
        //    92: aload_0        
        //    93: aload_2        
        //    94: aload_1        
        //    95: arraylength    
        //    96: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //    99: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   104: goto            108
        //   107: athrow         
        //   108: pop            
        //   109: return         
        //    StackMapTable: 00 0F FF 00 0F 00 04 07 00 4F 00 00 01 00 01 07 00 0E 00 00 40 07 00 4F FF 00 1D 00 04 07 00 4F 07 00 D0 07 00 0D 01 00 01 07 00 0E 00 4F 07 00 31 00 4B 07 00 0E 40 07 00 0D 48 07 00 0E 00 51 07 00 0E 40 07 00 31 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  79     104    107    108    Ljava/lang/RuntimeException;
        //  70     85     88     89     Ljava/lang/RuntimeException;
        //  66     75     78     79     Ljava/lang/RuntimeException;
        //  37     45     48     49     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
        final char[] charArray = "Ck:y\u0007%\u0016Q\u0003p\u0002".toCharArray();
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
                            c2 = 'r';
                            break;
                        }
                        case 1: {
                            c2 = 'r';
                            break;
                        }
                        case 2: {
                            c2 = '\u0006';
                            break;
                        }
                        case 3: {
                            c2 = 'k';
                            break;
                        }
                        default: {
                            c2 = '\'';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                caches = new HashMap<Client, Widget[]>();
                return;
            }
            continue;
        }
    }
}
