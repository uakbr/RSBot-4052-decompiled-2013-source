
package org.powerbot.game.api.methods.widget;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.a;
import org.powerbot.game.api.util.Time;
import org.powerbot.kb;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.game.api.wrappers.interactive.NPC;
import java.util.Arrays;
import org.powerbot.game.api.wrappers.Locatable;
import java.awt.Rectangle;
import java.awt.Dimension;
import org.powerbot.game.api.methods.Settings;
import org.powerbot.game.api.methods.tab.Inventory;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.wrappers.Entity;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.core.script.wrappers.Component;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.wrappers.Identifiable;
import org.powerbot.game.api.util.Filter;
import org.powerbot.game.api.wrappers.Tile;

public class Bank
{
    public static final int[] BANK_NPC_IDS;
    public static final int[] BANK_BOOTH_IDS;
    public static final int[] BANK_COUNTER_IDS;
    public static final int[] BANK_CHEST_IDS;
    public static final int[] UNDEPOSITABLE_ITEM_IDS;
    public static final Tile[] UNREACHABLE_BANK_TILES;
    public static final int WIDGET_BANK = 762;
    public static final int WIDGET_SLOTS_CONTAINER = 95;
    public static final int WIDGET_SCROLLBAR = 116;
    public static final int WIDGET_BUTTON_CLOSE_BANK = 45;
    public static final int WIDGET_BUTTON_DEPOSIT_INVENTORY = 34;
    public static final int WIDGET_BUTTON_DEPOSIT_EQUIPMENT = 38;
    public static final int WIDGET_BUTTON_DEPOSIT_FAMILIAR = 40;
    public static final int WIDGET_BUTTON_DEPOSIT_POUCH = 36;
    public static final int WIDGET_BUTTON_SEARCH = 18;
    public static final int WIDGET_BUTTON_WITHDRAW_NOTED = 20;
    public static final int WIDGET_BANKPIN = 13;
    public static final int SETTING_WITHDRAWAL_MODE = 160;
    public static final int SETTING_BANK_TAB = 110;
    private static final Filter<Identifiable> ALL_FILTER;
    public static int a;
    private static final String[] z;
    
    public static Widget getWidget() {
        return Widgets.get(762);
    }
    
    public static boolean isOpen() {
        final int a = Bank.a;
        final Widget widget = getWidget();
        boolean validate = false;
        Label_0039: {
            Label_0021: {
                Widget widget2;
                try {
                    widget2 = widget;
                    if (a != 0) {
                        break Label_0021;
                    }
                    if (widget2 == null) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    validate = widget2.validate();
                    if (a != 0) {
                        return validate;
                    }
                    if (!validate) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return validate;
        }
        return validate;
    }
    
    public static boolean open() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     8: iload           4
        //    10: ifne            21
        //    13: ifeq            22
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_1       
        //    21: ireturn        
        //    22: invokestatic    org/powerbot/game/api/methods/widget/Bank.getNearest:()Lorg/powerbot/game/api/wrappers/Entity;
        //    25: astore_0       
        //    26: aload_0        
        //    27: iload           4
        //    29: ifne            43
        //    32: ifnonnull       42
        //    35: goto            39
        //    38: athrow         
        //    39: iconst_0       
        //    40: ireturn        
        //    41: athrow         
        //    42: aload_0        
        //    43: invokeinterface org/powerbot/game/api/wrappers/Entity.isOnScreen:()Z
        //    48: iload           4
        //    50: ifne            144
        //    53: ifne            138
        //    56: goto            60
        //    59: athrow         
        //    60: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    63: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isMoving:()Z
        //    66: iload           4
        //    68: ifne            132
        //    71: goto            75
        //    74: athrow         
        //    75: ifeq            117
        //    78: goto            82
        //    81: athrow         
        //    82: invokestatic    org/powerbot/game/api/methods/Walking.getDestination:()Lorg/powerbot/game/api/wrappers/Tile;
        //    85: aload_0        
        //    86: checkcast       Lorg/powerbot/game/api/wrappers/Locatable;
        //    89: invokeinterface org/powerbot/game/api/wrappers/Locatable.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //    94: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/wrappers/Locatable;)D
        //    97: ldc2_w          4.0
        //   100: dcmpl          
        //   101: iload           4
        //   103: ifne            144
        //   106: goto            110
        //   109: athrow         
        //   110: ifle            138
        //   113: goto            117
        //   116: athrow         
        //   117: aload_0        
        //   118: checkcast       Lorg/powerbot/game/api/wrappers/Locatable;
        //   121: invokestatic    org/powerbot/game/api/methods/Walking.walk:(Lorg/powerbot/game/api/wrappers/Locatable;)Z
        //   124: pop            
        //   125: sipush          200
        //   128: goto            132
        //   131: athrow         
        //   132: sipush          400
        //   135: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   138: aload_0        
        //   139: invokeinterface org/powerbot/game/api/wrappers/Entity.isOnScreen:()Z
        //   144: iload           4
        //   146: ifne            512
        //   149: ifeq            509
        //   152: goto            156
        //   155: athrow         
        //   156: iconst_0       
        //   157: istore_1       
        //   158: aload_0        
        //   159: checkcast       Lorg/powerbot/game/api/wrappers/Identifiable;
        //   162: invokestatic    org/powerbot/game/api/methods/widget/Bank.isBanker:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
        //   165: iload           4
        //   167: ifne            209
        //   170: ifeq            198
        //   173: goto            177
        //   176: athrow         
        //   177: aload_0        
        //   178: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   181: bipush          7
        //   183: aaload         
        //   184: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   187: invokeinterface org/powerbot/game/api/wrappers/Entity.interact:(Ljava/lang/String;)Z
        //   192: istore_1       
        //   193: iload           4
        //   195: ifeq            397
        //   198: aload_0        
        //   199: checkcast       Lorg/powerbot/game/api/wrappers/Identifiable;
        //   202: invokestatic    org/powerbot/game/api/methods/widget/Bank.isBankBooth:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
        //   205: goto            209
        //   208: athrow         
        //   209: iload           4
        //   211: ifne            262
        //   214: ifeq            251
        //   217: goto            221
        //   220: athrow         
        //   221: aload_0        
        //   222: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   225: bipush          9
        //   227: aaload         
        //   228: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   231: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   234: bipush          8
        //   236: aaload         
        //   237: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   240: invokeinterface org/powerbot/game/api/wrappers/Entity.interact:(Ljava/lang/String;Ljava/lang/String;)Z
        //   245: istore_1       
        //   246: iload           4
        //   248: ifeq            397
        //   251: aload_0        
        //   252: checkcast       Lorg/powerbot/game/api/wrappers/Identifiable;
        //   255: invokestatic    org/powerbot/game/api/methods/widget/Bank.isBankChest:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
        //   258: goto            262
        //   261: athrow         
        //   262: iload           4
        //   264: ifne            360
        //   267: ifeq            349
        //   270: goto            274
        //   273: athrow         
        //   274: aload_0        
        //   275: iload           4
        //   277: ifne            329
        //   280: goto            284
        //   283: athrow         
        //   284: invokeinterface org/powerbot/game/api/wrappers/Entity.hover:()Z
        //   289: pop            
        //   290: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   293: bipush          11
        //   295: aaload         
        //   296: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   299: invokestatic    org/powerbot/game/api/methods/node/Menu.contains:(Ljava/lang/String;)Z
        //   302: ifeq            328
        //   305: goto            309
        //   308: athrow         
        //   309: aload_0        
        //   310: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   313: bipush          6
        //   315: aaload         
        //   316: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   319: invokeinterface org/powerbot/game/api/wrappers/Entity.interact:(Ljava/lang/String;)Z
        //   324: goto            343
        //   327: athrow         
        //   328: aload_0        
        //   329: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   332: bipush          12
        //   334: aaload         
        //   335: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   338: invokeinterface org/powerbot/game/api/wrappers/Entity.interact:(Ljava/lang/String;)Z
        //   343: istore_1       
        //   344: iload           4
        //   346: ifeq            397
        //   349: aload_0        
        //   350: checkcast       Lorg/powerbot/game/api/wrappers/Identifiable;
        //   353: invokestatic    org/powerbot/game/api/methods/widget/Bank.isBankCounter:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
        //   356: goto            360
        //   359: athrow         
        //   360: iload           4
        //   362: ifne            399
        //   365: ifeq            397
        //   368: goto            372
        //   371: athrow         
        //   372: aload_0        
        //   373: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   376: bipush          7
        //   378: aaload         
        //   379: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   382: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   385: bipush          10
        //   387: aaload         
        //   388: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   391: invokeinterface org/powerbot/game/api/wrappers/Entity.interact:(Ljava/lang/String;Ljava/lang/String;)Z
        //   396: istore_1       
        //   397: bipush          13
        //   399: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //   402: astore_2       
        //   403: new             Lorg/powerbot/game/api/util/Timer;
        //   406: dup            
        //   407: ldc2_w          4000
        //   410: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   413: astore_3       
        //   414: aload_3        
        //   415: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   418: ifeq            509
        //   421: iload_1        
        //   422: iload           4
        //   424: ifne            512
        //   427: iload           4
        //   429: ifne            512
        //   432: goto            436
        //   435: athrow         
        //   436: ifeq            509
        //   439: goto            443
        //   442: athrow         
        //   443: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //   446: iload           4
        //   448: ifne            512
        //   451: goto            455
        //   454: athrow         
        //   455: ifne            509
        //   458: goto            462
        //   461: athrow         
        //   462: aload_2        
        //   463: iload           4
        //   465: ifne            480
        //   468: goto            472
        //   471: athrow         
        //   472: ifnull          495
        //   475: goto            479
        //   478: athrow         
        //   479: aload_2        
        //   480: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //   483: iload           4
        //   485: ifne            512
        //   488: ifne            509
        //   491: goto            495
        //   494: athrow         
        //   495: bipush          10
        //   497: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   500: iload           4
        //   502: ifeq            414
        //   505: goto            509
        //   508: athrow         
        //   509: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //   512: ireturn        
        //    StackMapTable: 00 47 FF 00 13 00 05 00 00 00 00 01 00 01 07 02 31 00 40 01 00 FF 00 0F 00 05 07 00 26 00 00 00 01 00 01 07 02 31 00 41 07 02 31 00 40 07 00 26 4F 07 02 31 00 4D 07 02 31 40 01 45 07 02 31 00 5A 07 02 31 40 01 45 07 02 31 00 4D 07 02 31 40 01 05 45 01 4A 07 02 31 00 FF 00 13 00 05 07 00 26 01 00 00 01 00 01 07 02 31 00 14 49 07 02 31 40 01 4A 07 02 31 00 1D 49 07 02 31 40 01 4A 07 02 31 00 48 07 02 31 40 07 00 26 57 07 02 31 00 51 07 02 31 00 40 07 00 26 4D 01 05 49 07 02 31 40 01 4A 07 02 31 00 18 41 01 FF 00 0E 00 05 07 00 26 01 07 01 17 07 00 1B 01 00 00 54 07 02 31 40 01 45 07 02 31 00 4A 07 02 31 40 01 45 07 02 31 00 48 07 02 31 40 07 01 17 45 07 02 31 00 40 07 01 17 4D 07 02 31 00 4C 07 02 31 FF 00 00 00 05 07 00 26 00 00 00 01 00 00 42 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  488    505    508    509    Ljava/lang/RuntimeException;
        //  480    491    494    495    Ljava/lang/RuntimeException;
        //  462    475    478    479    Ljava/lang/RuntimeException;
        //  455    468    471    472    Ljava/lang/RuntimeException;
        //  443    458    461    462    Ljava/lang/RuntimeException;
        //  436    451    454    455    Ljava/lang/RuntimeException;
        //  427    439    442    443    Ljava/lang/RuntimeException;
        //  421    432    435    436    Ljava/lang/RuntimeException;
        //  360    368    371    372    Ljava/lang/RuntimeException;
        //  344    356    359    360    Ljava/lang/RuntimeException;
        //  284    327    327    328    Ljava/lang/RuntimeException;
        //  274    305    308    309    Ljava/lang/RuntimeException;
        //  267    280    283    284    Ljava/lang/RuntimeException;
        //  262    270    273    274    Ljava/lang/RuntimeException;
        //  246    258    261    262    Ljava/lang/RuntimeException;
        //  209    217    220    221    Ljava/lang/RuntimeException;
        //  193    205    208    209    Ljava/lang/RuntimeException;
        //  158    173    176    177    Ljava/lang/RuntimeException;
        //  144    152    155    156    Ljava/lang/RuntimeException;
        //  110    128    131    132    Ljava/lang/RuntimeException;
        //  82     113    116    117    Ljava/lang/RuntimeException;
        //  75     106    109    110    Ljava/lang/RuntimeException;
        //  60     78     81     82     Ljava/lang/RuntimeException;
        //  53     71     74     75     Ljava/lang/RuntimeException;
        //  43     56     59     60     Ljava/lang/RuntimeException;
        //  32     41     41     42     Ljava/lang/RuntimeException;
        //  26     35     38     39     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0060:
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
    
    public static boolean close() {
        final int a = Bank.a;
        int open = 0;
        Label_0024: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (n == 0) {
                        return true;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return true;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 762;
        }
        final WidgetChild value = Widgets.get(open, 45);
        boolean interact = false;
        Label_0069: {
            Label_0043: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0043;
                    }
                    if (widgetChild == null) {
                        break Label_0069;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    interact = widgetChild.interact(Component.e(Bank.z[0]));
                    if (a != 0) {
                        return interact;
                    }
                    if (!interact) {
                        break Label_0069;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return interact;
        }
        return interact;
    }
    
    public static Entity getNearest() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank.getLoadedBanks:()[Lorg/powerbot/game/api/wrappers/Locatable;
        //     8: astore_0       
        //     9: aconst_null    
        //    10: astore_1       
        //    11: aload_0        
        //    12: astore_2       
        //    13: aload_2        
        //    14: arraylength    
        //    15: istore_3       
        //    16: iconst_0       
        //    17: istore          4
        //    19: iload           4
        //    21: iload_3        
        //    22: if_icmpge       145
        //    25: aload_2        
        //    26: iload           4
        //    28: aaload         
        //    29: iload           6
        //    31: ifne            146
        //    34: astore          5
        //    36: iload           6
        //    38: ifne            140
        //    41: getstatic       org/powerbot/game/api/methods/widget/Bank.ALL_FILTER:Lorg/powerbot/game/api/util/Filter;
        //    44: aload           5
        //    46: checkcast       Lorg/powerbot/game/api/wrappers/Identifiable;
        //    49: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    54: ifeq            137
        //    57: goto            61
        //    60: athrow         
        //    61: aload           5
        //    63: iload           6
        //    65: ifne            92
        //    68: goto            72
        //    71: athrow         
        //    72: checkcast       Lorg/powerbot/game/api/wrappers/Entity;
        //    75: invokeinterface org/powerbot/game/api/wrappers/Entity.validate:()Z
        //    80: ifeq            137
        //    83: goto            87
        //    86: athrow         
        //    87: aload_1        
        //    88: goto            92
        //    91: athrow         
        //    92: iload           6
        //    94: ifne            136
        //    97: ifnull          130
        //   100: goto            104
        //   103: athrow         
        //   104: aload           5
        //   106: iload           6
        //   108: ifne            136
        //   111: goto            115
        //   114: athrow         
        //   115: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   118: aload_1        
        //   119: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   122: dcmpg          
        //   123: ifge            137
        //   126: goto            130
        //   129: athrow         
        //   130: aload           5
        //   132: goto            136
        //   135: athrow         
        //   136: astore_1       
        //   137: iinc            4, 1
        //   140: iload           6
        //   142: ifeq            19
        //   145: aload_1        
        //   146: checkcast       Lorg/powerbot/game/api/wrappers/Entity;
        //   149: areturn        
        //    StackMapTable: 00 15 FF 00 13 00 07 07 00 7E 07 00 0F 07 00 7E 01 01 00 01 00 00 FF 00 28 00 07 07 00 7E 07 00 0F 07 00 7E 01 01 07 00 0F 01 00 01 07 02 31 00 49 07 02 31 40 07 00 0F 4D 07 02 31 00 43 07 02 31 40 07 00 0F 4A 07 02 31 00 49 07 02 31 40 07 00 0F 4D 07 02 31 00 44 07 02 31 40 07 00 0F 00 02 FF 00 04 00 07 07 00 7E 07 00 0F 07 00 7E 01 01 00 01 00 00 40 07 00 0F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  115    132    135    136    Ljava/lang/RuntimeException;
        //  104    126    129    130    Ljava/lang/RuntimeException;
        //  97     111    114    115    Ljava/lang/RuntimeException;
        //  92     100    103    104    Ljava/lang/RuntimeException;
        //  72     88     91     92     Ljava/lang/RuntimeException;
        //  61     83     86     87     Ljava/lang/RuntimeException;
        //  41     68     71     72     Ljava/lang/RuntimeException;
        //  36     57     60     61     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
    
    public static boolean withdraw(final int n, final Amount amount) {
        return withdraw(n, amount.getValue());
    }
    
    public static boolean withdraw(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: iconst_1       
        //     6: newarray        I
        //     8: dup            
        //     9: iconst_0       
        //    10: iload_0        
        //    11: iastore        
        //    12: invokestatic    org/powerbot/game/api/methods/widget/Bank.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    15: astore_2       
        //    16: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //    19: iload           6
        //    21: ifne            44
        //    24: ifeq            39
        //    27: goto            31
        //    30: athrow         
        //    31: aload_2        
        //    32: ifnonnull       45
        //    35: goto            39
        //    38: athrow         
        //    39: iconst_0       
        //    40: goto            44
        //    43: athrow         
        //    44: ireturn        
        //    45: new             Lorg/powerbot/game/api/util/Timer;
        //    48: dup            
        //    49: ldc2_w          500
        //    52: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    55: astore_3       
        //    56: aload_3        
        //    57: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    60: ifeq            136
        //    63: aload_2        
        //    64: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    67: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeY:()I
        //    70: iload           6
        //    72: ifne            143
        //    75: iload           6
        //    77: ifne            143
        //    80: goto            84
        //    83: athrow         
        //    84: ifne            136
        //    87: goto            91
        //    90: athrow         
        //    91: invokestatic    org/powerbot/game/api/methods/widget/Bank.getCurrentTab:()Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    94: iload           6
        //    96: ifne            120
        //    99: goto            103
        //   102: athrow         
        //   103: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.ALL:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //   106: if_acmpeq       136
        //   109: goto            113
        //   112: athrow         
        //   113: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.ALL:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //   116: goto            120
        //   119: athrow         
        //   120: invokestatic    org/powerbot/game/api/methods/widget/Bank.setCurrentTab:(Lorg/powerbot/game/api/methods/widget/Bank$Tab;)Z
        //   123: pop            
        //   124: bipush          50
        //   126: bipush          70
        //   128: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   131: iload           6
        //   133: ifeq            56
        //   136: aload_2        
        //   137: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   140: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSlotVisible:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)Z
        //   143: iload           6
        //   145: ifne            158
        //   148: ifne            206
        //   151: goto            155
        //   154: athrow         
        //   155: sipush          762
        //   158: bipush          116
        //   160: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   163: astore          4
        //   165: aload           4
        //   167: iload           6
        //   169: ifne            187
        //   172: ifnull          204
        //   175: goto            179
        //   178: athrow         
        //   179: aload_2        
        //   180: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   183: goto            187
        //   186: athrow         
        //   187: aload           4
        //   189: invokestatic    org/powerbot/game/api/methods/Widgets.scroll:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)Z
        //   192: iload           6
        //   194: ifne            205
        //   197: ifne            206
        //   200: goto            204
        //   203: athrow         
        //   204: iconst_0       
        //   205: ireturn        
        //   206: new             Ljava/lang/StringBuilder;
        //   209: dup            
        //   210: invokespecial   java/lang/StringBuilder.<init>:()V
        //   213: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   216: iconst_3       
        //   217: aaload         
        //   218: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   221: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   224: iload_1        
        //   225: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   228: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   231: astore          4
        //   233: iload_1        
        //   234: iload           6
        //   236: ifne            310
        //   239: aload_2        
        //   240: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //   243: if_icmplt       305
        //   246: goto            250
        //   249: athrow         
        //   250: iload_1        
        //   251: iload           6
        //   253: ifne            310
        //   256: goto            260
        //   259: athrow         
        //   260: iconst_1       
        //   261: if_icmpeq       305
        //   264: goto            268
        //   267: athrow         
        //   268: iload_1        
        //   269: iload           6
        //   271: ifne            310
        //   274: goto            278
        //   277: athrow         
        //   278: iconst_5       
        //   279: if_icmpeq       305
        //   282: goto            286
        //   285: athrow         
        //   286: iload_1        
        //   287: iload           6
        //   289: ifne            310
        //   292: goto            296
        //   295: athrow         
        //   296: bipush          10
        //   298: if_icmpne       322
        //   301: goto            305
        //   304: athrow         
        //   305: iload_1        
        //   306: goto            310
        //   309: athrow         
        //   310: iload           6
        //   312: ifne            342
        //   315: ifne            337
        //   318: goto            322
        //   321: athrow         
        //   322: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   325: iconst_4       
        //   326: aaload         
        //   327: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   330: astore          4
        //   332: iload           6
        //   334: ifeq            388
        //   337: iload_1        
        //   338: goto            342
        //   341: athrow         
        //   342: aload_2        
        //   343: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //   346: iconst_1       
        //   347: isub           
        //   348: iload           6
        //   350: ifne            375
        //   353: if_icmpeq       378
        //   356: goto            360
        //   359: athrow         
        //   360: iload_1        
        //   361: iload           6
        //   363: ifne            392
        //   366: goto            370
        //   369: athrow         
        //   370: iconst_m1      
        //   371: goto            375
        //   374: athrow         
        //   375: if_icmpne       388
        //   378: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   381: iconst_2       
        //   382: aaload         
        //   383: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   386: astore          4
        //   388: iconst_1       
        //   389: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   392: istore          5
        //   394: aload_2        
        //   395: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   398: aload           4
        //   400: invokestatic    org/powerbot/game/api/methods/widget/Bank.slotContainsAction:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;Ljava/lang/String;)Z
        //   403: iload           6
        //   405: ifne            457
        //   408: ifeq            442
        //   411: goto            415
        //   414: athrow         
        //   415: aload_2        
        //   416: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   419: aload           4
        //   421: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   424: iload           6
        //   426: ifne            441
        //   429: goto            433
        //   432: athrow         
        //   433: ifne            510
        //   436: goto            440
        //   439: athrow         
        //   440: iconst_0       
        //   441: ireturn        
        //   442: aload_2        
        //   443: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   446: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   449: iconst_1       
        //   450: aaload         
        //   451: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   454: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   457: iload           6
        //   459: ifne            477
        //   462: ifeq            510
        //   465: goto            469
        //   468: athrow         
        //   469: iconst_1       
        //   470: invokestatic    org/powerbot/game/api/methods/widget/Bank.waitForInputWidget:(Z)Z
        //   473: goto            477
        //   476: athrow         
        //   477: iload           6
        //   479: ifne            503
        //   482: ifeq            510
        //   485: goto            489
        //   488: athrow         
        //   489: sipush          200
        //   492: sipush          800
        //   495: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   498: iload_1        
        //   499: goto            503
        //   502: athrow         
        //   503: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   506: iconst_1       
        //   507: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //   510: aload_3        
        //   511: ldc2_w          2000
        //   514: invokevirtual   org/powerbot/game/api/util/Timer.setEndIn:(J)J
        //   517: pop2           
        //   518: aload_3        
        //   519: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   522: ifeq            565
        //   525: iconst_1       
        //   526: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   529: iload           5
        //   531: iload           6
        //   533: ifne            580
        //   536: iload           6
        //   538: ifne            580
        //   541: goto            545
        //   544: athrow         
        //   545: if_icmpne       565
        //   548: goto            552
        //   551: athrow         
        //   552: iconst_5       
        //   553: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   556: iload           6
        //   558: ifeq            518
        //   561: goto            565
        //   564: athrow         
        //   565: iconst_1       
        //   566: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   569: iload           6
        //   571: ifne            584
        //   574: iload           5
        //   576: goto            580
        //   579: athrow         
        //   580: if_icmpeq       587
        //   583: iconst_1       
        //   584: goto            588
        //   587: iconst_0       
        //   588: ireturn        
        //    StackMapTable: 00 5B FF 00 1E 00 07 01 01 07 00 4C 00 00 00 01 00 01 07 02 31 00 46 07 02 31 00 43 07 02 31 40 01 00 FF 00 0A 00 07 01 01 07 00 4C 07 00 1B 00 00 01 00 00 5A 07 02 31 40 01 45 07 02 31 00 4A 07 02 31 40 07 00 9E 48 07 02 31 00 45 07 02 31 40 07 00 9E 0F 46 01 4A 07 02 31 00 42 01 FF 00 13 00 07 01 01 07 00 4C 07 00 1B 07 01 34 00 01 00 01 07 02 31 00 46 07 02 31 40 07 01 34 4F 07 02 31 00 40 01 FF 00 00 00 07 01 01 07 00 4C 07 00 1B 00 00 01 00 00 FF 00 2A 00 07 01 01 07 00 4C 07 00 1B 07 01 4E 00 01 00 01 07 02 31 00 48 07 02 31 40 01 46 07 02 31 00 48 07 02 31 40 01 46 07 02 31 00 48 07 02 31 40 01 47 07 02 31 00 43 07 02 31 40 01 4A 07 02 31 00 0E 43 07 02 31 40 01 50 07 02 31 00 48 07 02 31 40 01 43 07 02 31 FF 00 00 00 07 01 01 07 00 4C 07 00 1B 07 01 4E 00 01 00 02 01 01 02 09 43 01 FF 00 15 00 07 01 01 07 00 4C 07 00 1B 07 01 4E 01 01 00 01 07 02 31 00 50 07 02 31 40 01 45 07 02 31 00 40 01 00 4E 01 4A 07 02 31 00 46 07 02 31 40 01 4A 07 02 31 00 4C 07 02 31 40 01 06 07 59 07 02 31 FF 00 00 00 07 01 01 07 00 4C 07 00 1B 07 01 4E 01 01 00 02 01 01 45 07 02 31 00 4B 07 02 31 00 4D 07 02 31 FF 00 00 00 07 01 01 07 00 4C 07 00 1B 07 01 4E 01 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  565    576    579    580    Ljava/lang/RuntimeException;
        //  545    561    564    565    Ljava/lang/RuntimeException;
        //  536    548    551    552    Ljava/lang/RuntimeException;
        //  525    541    544    545    Ljava/lang/RuntimeException;
        //  482    499    502    503    Ljava/lang/RuntimeException;
        //  477    485    488    489    Ljava/lang/RuntimeException;
        //  462    473    476    477    Ljava/lang/RuntimeException;
        //  457    465    468    469    Ljava/lang/RuntimeException;
        //  415    436    439    440    Ljava/lang/RuntimeException;
        //  408    429    432    433    Ljava/lang/RuntimeException;
        //  394    411    414    415    Ljava/lang/RuntimeException;
        //  360    371    374    375    Ljava/lang/RuntimeException;
        //  353    366    369    370    Ljava/lang/RuntimeException;
        //  342    356    359    360    Ljava/lang/RuntimeException;
        //  332    338    341    342    Ljava/lang/RuntimeException;
        //  310    318    321    322    Ljava/lang/RuntimeException;
        //  296    306    309    310    Ljava/lang/RuntimeException;
        //  286    301    304    305    Ljava/lang/RuntimeException;
        //  278    292    295    296    Ljava/lang/RuntimeException;
        //  268    282    285    286    Ljava/lang/RuntimeException;
        //  260    274    277    278    Ljava/lang/RuntimeException;
        //  250    264    267    268    Ljava/lang/RuntimeException;
        //  239    256    259    260    Ljava/lang/RuntimeException;
        //  233    246    249    250    Ljava/lang/RuntimeException;
        //  187    200    203    204    Ljava/lang/RuntimeException;
        //  172    183    186    187    Ljava/lang/RuntimeException;
        //  165    175    178    179    Ljava/lang/RuntimeException;
        //  143    151    154    155    Ljava/lang/RuntimeException;
        //  103    116    119    120    Ljava/lang/RuntimeException;
        //  91     109    112    113    Ljava/lang/RuntimeException;
        //  84     99     102    103    Ljava/lang/RuntimeException;
        //  75     87     90     91     Ljava/lang/RuntimeException;
        //  63     80     83     84     Ljava/lang/RuntimeException;
        //  31     40     43     44     Ljava/lang/RuntimeException;
        //  24     35     38     39     Ljava/lang/RuntimeException;
        //  16     27     30     31     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public static boolean deposit(final int n, final Amount amount) {
        return deposit(n, amount.getValue());
    }
    
    public static boolean deposit(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: iconst_1       
        //     6: newarray        I
        //     8: dup            
        //     9: iconst_0       
        //    10: iload_0        
        //    11: iastore        
        //    12: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    15: astore_2       
        //    16: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //    19: iload           6
        //    21: ifne            57
        //    24: ifeq            56
        //    27: goto            31
        //    30: athrow         
        //    31: aload_2        
        //    32: ifnull          56
        //    35: goto            39
        //    38: athrow         
        //    39: iload_1        
        //    40: iload           6
        //    42: ifne            57
        //    45: goto            49
        //    48: athrow         
        //    49: ifge            58
        //    52: goto            56
        //    55: athrow         
        //    56: iconst_0       
        //    57: ireturn        
        //    58: new             Ljava/lang/StringBuilder;
        //    61: dup            
        //    62: invokespecial   java/lang/StringBuilder.<init>:()V
        //    65: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //    68: bipush          13
        //    70: aaload         
        //    71: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: iload_1        
        //    78: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    81: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    84: astore_3       
        //    85: iconst_1       
        //    86: iconst_1       
        //    87: newarray        I
        //    89: dup            
        //    90: iconst_0       
        //    91: iload_0        
        //    92: iastore        
        //    93: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z[I)I
        //    96: iload           6
        //    98: ifne            114
        //   101: iload_1        
        //   102: if_icmple       126
        //   105: goto            109
        //   108: athrow         
        //   109: iload_1        
        //   110: goto            114
        //   113: athrow         
        //   114: iload           6
        //   116: ifne            150
        //   119: ifne            136
        //   122: goto            126
        //   125: athrow         
        //   126: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   129: bipush          14
        //   131: aaload         
        //   132: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   135: astore_3       
        //   136: iconst_1       
        //   137: iconst_1       
        //   138: newarray        I
        //   140: dup            
        //   141: iconst_0       
        //   142: aload_2        
        //   143: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
        //   146: iastore        
        //   147: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z[I)I
        //   150: iload           6
        //   152: ifne            177
        //   155: iconst_1       
        //   156: if_icmpne       173
        //   159: goto            163
        //   162: athrow         
        //   163: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   166: bipush          16
        //   168: aaload         
        //   169: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   172: astore_3       
        //   173: iconst_1       
        //   174: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   177: istore          4
        //   179: aload_2        
        //   180: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   183: aload_3        
        //   184: invokestatic    org/powerbot/game/api/methods/widget/Bank.slotContainsAction:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;Ljava/lang/String;)Z
        //   187: iload           6
        //   189: ifne            241
        //   192: ifeq            225
        //   195: goto            199
        //   198: athrow         
        //   199: aload_2        
        //   200: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   203: aload_3        
        //   204: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   207: iload           6
        //   209: ifne            224
        //   212: goto            216
        //   215: athrow         
        //   216: ifne            294
        //   219: goto            223
        //   222: athrow         
        //   223: iconst_0       
        //   224: ireturn        
        //   225: aload_2        
        //   226: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   229: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //   232: bipush          15
        //   234: aaload         
        //   235: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //   238: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   241: iload           6
        //   243: ifne            261
        //   246: ifeq            294
        //   249: goto            253
        //   252: athrow         
        //   253: iconst_1       
        //   254: invokestatic    org/powerbot/game/api/methods/widget/Bank.waitForInputWidget:(Z)Z
        //   257: goto            261
        //   260: athrow         
        //   261: iload           6
        //   263: ifne            287
        //   266: ifeq            294
        //   269: goto            273
        //   272: athrow         
        //   273: sipush          200
        //   276: sipush          800
        //   279: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   282: iload_1        
        //   283: goto            287
        //   286: athrow         
        //   287: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   290: iconst_1       
        //   291: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //   294: new             Lorg/powerbot/game/api/util/Timer;
        //   297: dup            
        //   298: ldc2_w          2000
        //   301: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   304: astore          5
        //   306: aload           5
        //   308: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   311: ifeq            354
        //   314: iconst_1       
        //   315: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   318: iload           4
        //   320: iload           6
        //   322: ifne            369
        //   325: iload           6
        //   327: ifne            369
        //   330: goto            334
        //   333: athrow         
        //   334: if_icmpne       354
        //   337: goto            341
        //   340: athrow         
        //   341: iconst_5       
        //   342: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   345: iload           6
        //   347: ifeq            306
        //   350: goto            354
        //   353: athrow         
        //   354: iconst_1       
        //   355: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:(Z)I
        //   358: iload           6
        //   360: ifne            373
        //   363: iload           4
        //   365: goto            369
        //   368: athrow         
        //   369: if_icmpeq       376
        //   372: iconst_1       
        //   373: goto            377
        //   376: iconst_0       
        //   377: ireturn        
        //    StackMapTable: 00 34 FF 00 1E 00 07 01 01 07 00 4C 00 00 00 01 00 01 07 02 31 00 46 07 02 31 00 48 07 02 31 40 01 45 07 02 31 00 40 01 00 FF 00 31 00 07 01 01 07 00 4C 07 01 4E 00 00 01 00 01 07 02 31 00 43 07 02 31 40 01 4A 07 02 31 00 09 4D 01 4B 07 02 31 00 09 43 01 FF 00 14 00 07 01 01 07 00 4C 07 01 4E 01 00 01 00 01 07 02 31 00 4F 07 02 31 40 01 45 07 02 31 00 40 01 00 4F 01 4A 07 02 31 00 46 07 02 31 40 01 4A 07 02 31 00 4C 07 02 31 40 01 06 FF 00 0B 00 07 01 01 07 00 4C 07 01 4E 01 07 00 1B 01 00 00 5A 07 02 31 FF 00 00 00 07 01 01 07 00 4C 07 01 4E 01 07 00 1B 01 00 02 01 01 45 07 02 31 00 4B 07 02 31 00 4D 07 02 31 FF 00 00 00 07 01 01 07 00 4C 07 01 4E 01 07 00 1B 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  354    365    368    369    Ljava/lang/RuntimeException;
        //  334    350    353    354    Ljava/lang/RuntimeException;
        //  325    337    340    341    Ljava/lang/RuntimeException;
        //  314    330    333    334    Ljava/lang/RuntimeException;
        //  266    283    286    287    Ljava/lang/RuntimeException;
        //  261    269    272    273    Ljava/lang/RuntimeException;
        //  246    257    260    261    Ljava/lang/RuntimeException;
        //  241    249    252    253    Ljava/lang/RuntimeException;
        //  199    219    222    223    Ljava/lang/RuntimeException;
        //  192    212    215    216    Ljava/lang/RuntimeException;
        //  179    195    198    199    Ljava/lang/RuntimeException;
        //  150    159    162    163    Ljava/lang/RuntimeException;
        //  114    122    125    126    Ljava/lang/RuntimeException;
        //  101    110    113    114    Ljava/lang/RuntimeException;
        //  85     105    108    109    Ljava/lang/RuntimeException;
        //  39     52     55     56     Ljava/lang/RuntimeException;
        //  31     45     48     49     Ljava/lang/RuntimeException;
        //  24     35     38     39     Ljava/lang/RuntimeException;
        //  16     27     30     31     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0031:
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
    
    public static boolean depositInventory() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     7: iload_3        
        //     8: ifne            24
        //    11: ifne            21
        //    14: goto            18
        //    17: athrow         
        //    18: iconst_0       
        //    19: ireturn        
        //    20: athrow         
        //    21: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:()I
        //    24: iload_3        
        //    25: ifne            41
        //    28: ifne            38
        //    31: goto            35
        //    34: athrow         
        //    35: iconst_1       
        //    36: ireturn        
        //    37: athrow         
        //    38: sipush          762
        //    41: bipush          34
        //    43: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    46: astore_0       
        //    47: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:()I
        //    50: istore_1       
        //    51: aload_0        
        //    52: iload_3        
        //    53: ifne            64
        //    56: ifnull          132
        //    59: goto            63
        //    62: athrow         
        //    63: aload_0        
        //    64: iconst_1       
        //    65: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    68: iload_3        
        //    69: ifne            133
        //    72: ifeq            132
        //    75: goto            79
        //    78: athrow         
        //    79: new             Lorg/powerbot/game/api/util/Timer;
        //    82: dup            
        //    83: ldc2_w          2000
        //    86: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    89: astore_2       
        //    90: aload_2        
        //    91: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    94: ifeq            132
        //    97: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:()I
        //   100: iload_1        
        //   101: iload_3        
        //   102: ifne            144
        //   105: iload_3        
        //   106: ifne            144
        //   109: goto            113
        //   112: athrow         
        //   113: if_icmpne       132
        //   116: goto            120
        //   119: athrow         
        //   120: iconst_5       
        //   121: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   124: iload_3        
        //   125: ifeq            90
        //   128: goto            132
        //   131: athrow         
        //   132: iload_1        
        //   133: iload_3        
        //   134: ifne            148
        //   137: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getCount:()I
        //   140: goto            144
        //   143: athrow         
        //   144: if_icmpeq       151
        //   147: iconst_1       
        //   148: goto            152
        //   151: iconst_0       
        //   152: ireturn        
        //    StackMapTable: 00 1C FF 00 11 00 04 00 00 00 01 00 01 07 02 31 00 41 07 02 31 00 42 01 49 07 02 31 00 41 07 02 31 00 42 01 FF 00 14 00 04 07 01 34 01 00 01 00 01 07 02 31 00 40 07 01 34 4D 07 02 31 00 FF 00 0A 00 04 07 01 34 01 07 00 1B 01 00 00 55 07 02 31 FF 00 00 00 04 07 01 34 01 07 00 1B 01 00 02 01 01 45 07 02 31 00 4A 07 02 31 FF 00 00 00 04 07 01 34 01 00 01 00 00 40 01 49 07 02 31 FF 00 00 00 04 07 01 34 01 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  133    140    143    144    Ljava/lang/RuntimeException;
        //  113    128    131    132    Ljava/lang/RuntimeException;
        //  105    116    119    120    Ljava/lang/RuntimeException;
        //  97     109    112    113    Ljava/lang/RuntimeException;
        //  64     75     78     79     Ljava/lang/RuntimeException;
        //  51     59     62     63     Ljava/lang/RuntimeException;
        //  28     37     37     38     Ljava/lang/RuntimeException;
        //  24     31     34     35     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0113:
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
    
    public static boolean depositEquipment() {
        final int a = Bank.a;
        int open = 0;
        Label_0024: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (n == 0) {
                        return false;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 762;
        }
        final WidgetChild value = Widgets.get(open, 38);
        boolean click = false;
        Label_0062: {
            Label_0043: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0043;
                    }
                    if (widgetChild == null) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    click = widgetChild.click(true);
                    if (a != 0) {
                        return click;
                    }
                    if (!click) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return click;
        }
        return click;
    }
    
    public static boolean depositFamiliarInventory() {
        final int a = Bank.a;
        int open = 0;
        Label_0024: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (n == 0) {
                        return false;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 762;
        }
        final WidgetChild value = Widgets.get(open, 40);
        boolean click = false;
        Label_0062: {
            Label_0043: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0043;
                    }
                    if (widgetChild == null) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    click = widgetChild.click(true);
                    if (a != 0) {
                        return click;
                    }
                    if (!click) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return click;
        }
        return click;
    }
    
    public static boolean depositMoneyPouch() {
        final int a = Bank.a;
        int open = 0;
        Label_0024: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (n == 0) {
                        return false;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 762;
        }
        final WidgetChild value = Widgets.get(open, 36);
        boolean click = false;
        Label_0062: {
            Label_0043: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0043;
                    }
                    if (widgetChild == null) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    click = widgetChild.click(true);
                    if (a != 0) {
                        return click;
                    }
                    if (!click) {
                        break Label_0062;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return click;
        }
        return click;
    }
    
    public static Item[] getItems() {
        return getItems(false);
    }
    
    public static Item[] getItems(final boolean b) {
        return getItems(b, Inventory.ALL_FILTER);
    }
    
    public static Item[] getItems(final Filter<Item> filter) {
        return getItems(false, filter);
    }
    
    public static Item[] getItems(final boolean p0, final Filter<Item> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     8: iload           9
        //    10: ifne            29
        //    13: ifne            26
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_0       
        //    21: anewarray       Lorg/powerbot/game/api/wrappers/node/Item;
        //    24: areturn        
        //    25: athrow         
        //    26: sipush          762
        //    29: bipush          95
        //    31: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    34: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    37: astore_2       
        //    38: new             Ljava/util/ArrayList;
        //    41: dup            
        //    42: aload_2        
        //    43: arraylength    
        //    44: invokespecial   java/util/ArrayList.<init>:(I)V
        //    47: astore_3       
        //    48: aload_2        
        //    49: astore          4
        //    51: aload           4
        //    53: arraylength    
        //    54: istore          5
        //    56: iconst_0       
        //    57: istore          6
        //    59: iload           6
        //    61: iload           5
        //    63: if_icmpge       193
        //    66: aload           4
        //    68: iload           9
        //    70: ifne            204
        //    73: iload           6
        //    75: aaload         
        //    76: astore          7
        //    78: iload           9
        //    80: ifne            188
        //    83: aload           7
        //    85: ifnull          185
        //    88: goto            92
        //    91: athrow         
        //    92: aload           7
        //    94: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildId:()I
        //    97: iload           9
        //    99: ifne            119
        //   102: goto            106
        //   105: athrow         
        //   106: iconst_m1      
        //   107: if_icmpeq       185
        //   110: goto            114
        //   113: athrow         
        //   114: iload_0        
        //   115: goto            119
        //   118: athrow         
        //   119: iload           9
        //   121: ifne            140
        //   124: ifeq            143
        //   127: goto            131
        //   130: athrow         
        //   131: aload           7
        //   133: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeY:()I
        //   136: goto            140
        //   139: athrow         
        //   140: ifeq            185
        //   143: new             Lorg/powerbot/game/api/wrappers/node/Item;
        //   146: dup            
        //   147: aload           7
        //   149: invokespecial   org/powerbot/game/api/wrappers/node/Item.<init>:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)V
        //   152: astore          8
        //   154: iload           9
        //   156: ifne            188
        //   159: aload_1        
        //   160: aload           8
        //   162: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   167: ifeq            185
        //   170: goto            174
        //   173: athrow         
        //   174: aload_3        
        //   175: aload           8
        //   177: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: goto            185
        //   184: athrow         
        //   185: iinc            6, 1
        //   188: iload           9
        //   190: ifeq            59
        //   193: aload_3        
        //   194: aload_3        
        //   195: invokevirtual   java/util/ArrayList.size:()I
        //   198: anewarray       Lorg/powerbot/game/api/wrappers/node/Item;
        //   201: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   204: checkcast       [Lorg/powerbot/game/api/wrappers/node/Item;
        //   207: areturn        
        //    Signature:
        //  (ZLorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/Item;>;)[Lorg/powerbot/game/api/wrappers/node/Item;
        //    StackMapTable: 00 1A FF 00 13 00 0A 01 07 01 37 00 00 00 00 00 00 00 01 00 01 07 02 31 00 44 07 02 31 00 42 01 FF 00 1D 00 0A 01 07 01 37 07 02 42 07 00 4E 07 02 42 01 01 00 00 01 00 00 FF 00 1F 00 0A 01 07 01 37 07 02 42 07 00 4E 07 02 42 01 01 07 01 34 00 01 00 01 07 02 31 00 4C 07 02 31 40 01 46 07 02 31 00 43 07 02 31 40 01 4A 07 02 31 00 47 07 02 31 40 01 02 FF 00 1D 00 0A 01 07 01 37 07 02 42 07 00 4E 07 02 42 01 01 07 01 34 07 00 4C 01 00 01 07 02 31 00 49 07 02 31 FF 00 00 00 0A 01 07 01 37 07 02 42 07 00 4E 07 02 42 01 01 07 01 34 00 01 00 00 02 FF 00 04 00 0A 01 07 01 37 07 02 42 07 00 4E 07 02 42 01 01 00 00 01 00 00 4A 07 02 44
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  159    181    184    185    Ljava/lang/RuntimeException;
        //  154    170    173    174    Ljava/lang/RuntimeException;
        //  124    136    139    140    Ljava/lang/RuntimeException;
        //  119    127    130    131    Ljava/lang/RuntimeException;
        //  106    115    118    119    Ljava/lang/RuntimeException;
        //  92     110    113    114    Ljava/lang/RuntimeException;
        //  83     102    105    106    Ljava/lang/RuntimeException;
        //  78     88     91     92     Ljava/lang/RuntimeException;
        //  13     25     25     26     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    public static Item getItem(final int... array) {
        return getItem(new Filter<Item>() {
            @Override
            public boolean accept(final Item p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/api/methods/widget/Bank$2.val$ids:[I
                //     9: astore_2       
                //    10: aload_2        
                //    11: arraylength    
                //    12: istore_3       
                //    13: iconst_0       
                //    14: istore          4
                //    16: iload           4
                //    18: iload_3        
                //    19: if_icmpge       66
                //    22: aload_2        
                //    23: iload           4
                //    25: iaload         
                //    26: istore          5
                //    28: iload           6
                //    30: ifne            61
                //    33: iload           5
                //    35: iload           6
                //    37: ifne            67
                //    40: goto            44
                //    43: athrow         
                //    44: aload_1        
                //    45: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
                //    48: if_icmpne       58
                //    51: goto            55
                //    54: athrow         
                //    55: iconst_1       
                //    56: ireturn        
                //    57: athrow         
                //    58: iinc            4, 1
                //    61: iload           6
                //    63: ifeq            16
                //    66: iconst_0       
                //    67: ireturn        
                //    StackMapTable: 00 0A FF 00 10 00 07 07 00 06 07 00 04 07 00 2E 01 01 00 01 00 00 FF 00 1A 00 07 07 00 06 07 00 04 07 00 2E 01 01 01 01 00 01 07 00 2B 40 01 49 07 00 2B 00 41 07 00 2B 00 02 FF 00 04 00 07 07 00 06 07 00 04 07 00 2E 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  44     57     57     58     Ljava/lang/RuntimeException;
                //  33     51     54     55     Ljava/lang/RuntimeException;
                //  28     40     43     44     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static Item getItem(final Filter<Item> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //     8: astore_1       
        //     9: aload_1        
        //    10: arraylength    
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_3        
        //    15: iload_2        
        //    16: if_icmpge       65
        //    19: aload_1        
        //    20: iload_3        
        //    21: aaload         
        //    22: astore          4
        //    24: iload           5
        //    26: ifne            60
        //    29: aload           4
        //    31: ifnull          57
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: aload           4
        //    41: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    46: ifeq            57
        //    49: goto            53
        //    52: athrow         
        //    53: aload           4
        //    55: areturn        
        //    56: athrow         
        //    57: iinc            3, 1
        //    60: iload           5
        //    62: ifeq            14
        //    65: aconst_null    
        //    66: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/Item;>;)Lorg/powerbot/game/api/wrappers/node/Item;
        //    StackMapTable: 00 09 FF 00 0E 00 06 07 01 37 07 00 55 01 01 00 01 00 00 FF 00 16 00 06 07 01 37 07 00 55 01 01 07 00 4C 01 00 01 07 02 31 00 4D 07 02 31 00 42 07 02 31 00 02 FF 00 04 00 06 07 01 37 07 00 55 01 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  38     56     56     57     Ljava/lang/RuntimeException;
        //  29     49     52     53     Ljava/lang/RuntimeException;
        //  24     34     37     38     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public static int getItemCount(final int... array) {
        return getItemCount(false, array);
    }
    
    public static int getItemCount(final boolean b, final int... array) {
        return getItemCount(b, new Filter<Item>() {
            @Override
            public boolean accept(final Item p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/api/methods/widget/Bank$3.val$ids:[I
                //     9: astore_2       
                //    10: aload_2        
                //    11: arraylength    
                //    12: istore_3       
                //    13: iconst_0       
                //    14: istore          4
                //    16: iload           4
                //    18: iload_3        
                //    19: if_icmpge       66
                //    22: aload_2        
                //    23: iload           4
                //    25: iaload         
                //    26: istore          5
                //    28: iload           6
                //    30: ifne            61
                //    33: aload_1        
                //    34: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
                //    37: iload           6
                //    39: ifne            67
                //    42: goto            46
                //    45: athrow         
                //    46: iload           5
                //    48: if_icmpne       58
                //    51: goto            55
                //    54: athrow         
                //    55: iconst_1       
                //    56: ireturn        
                //    57: athrow         
                //    58: iinc            4, 1
                //    61: iload           6
                //    63: ifeq            16
                //    66: iconst_0       
                //    67: ireturn        
                //    StackMapTable: 00 0A FF 00 10 00 07 07 00 06 07 00 04 07 00 2E 01 01 00 01 00 00 FF 00 1C 00 07 07 00 06 07 00 04 07 00 2E 01 01 01 01 00 01 07 00 2B 40 01 47 07 00 2B 00 41 07 00 2B 00 02 FF 00 04 00 07 07 00 06 07 00 04 07 00 2E 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  46     57     57     58     Ljava/lang/RuntimeException;
                //  33     51     54     55     Ljava/lang/RuntimeException;
                //  28     42     45     46     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static int getItemCount(final boolean b) {
        return getItemCount(b, Inventory.ALL_FILTER);
    }
    
    public static int getItemCount(final boolean p0, final Filter<Item> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: iconst_0       
        //     6: istore_2       
        //     7: invokestatic    org/powerbot/game/api/methods/widget/Bank.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    10: astore_3       
        //    11: aload_3        
        //    12: arraylength    
        //    13: istore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload           5
        //    20: iload           4
        //    22: if_icmpge       106
        //    25: aload_3        
        //    26: iload           5
        //    28: aaload         
        //    29: astore          6
        //    31: iload           7
        //    33: ifne            101
        //    36: aload           6
        //    38: ifnull          98
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: aload           6
        //    48: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    53: iload           7
        //    55: ifne            70
        //    58: goto            62
        //    61: athrow         
        //    62: ifeq            98
        //    65: goto            69
        //    68: athrow         
        //    69: iload_2        
        //    70: iload_0        
        //    71: iload           7
        //    73: ifne            92
        //    76: ifeq            95
        //    79: goto            83
        //    82: athrow         
        //    83: aload           6
        //    85: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //    88: goto            92
        //    91: athrow         
        //    92: goto            96
        //    95: iconst_1       
        //    96: iadd           
        //    97: istore_2       
        //    98: iinc            5, 1
        //   101: iload           7
        //   103: ifeq            18
        //   106: iload_2        
        //   107: ireturn        
        //    Signature:
        //  (ZLorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/Item;>;)I
        //    StackMapTable: 00 11 FF 00 12 00 08 01 07 01 37 01 07 00 55 01 01 00 01 00 00 FF 00 19 00 08 01 07 01 37 01 07 00 55 01 01 07 00 4C 01 00 01 07 02 31 00 4F 07 02 31 40 01 45 07 02 31 00 40 01 4B 07 02 31 40 01 47 07 02 31 FF 00 00 00 08 01 07 01 37 01 07 00 55 01 01 07 00 4C 01 00 02 01 01 42 01 FF 00 00 00 08 01 07 01 37 01 07 00 55 01 01 07 00 4C 01 00 02 01 01 01 02 FF 00 04 00 08 01 07 01 37 01 07 00 55 01 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  76     88     91     92     Ljava/lang/RuntimeException;
        //  70     79     82     83     Ljava/lang/RuntimeException;
        //  45     65     68     69     Ljava/lang/RuntimeException;
        //  36     58     61     62     Ljava/lang/RuntimeException;
        //  31     41     44     45     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public static boolean isWithdrawNotedEnabled() {
        int value = 0;
        Label_0020: {
            int n;
            try {
                n = (value = Settings.get(160));
                if (Bank.a != 0) {
                    return value != 0;
                }
                final int n2 = 1;
                if (n == n2) {
                    break Label_0020;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = 1;
                if (n != n2) {
                    return false;
                }
                value = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return value != 0;
        value = 0;
        return value != 0;
    }
    
    public static boolean setWithdrawNoted(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     7: iload_3        
        //     8: ifne            24
        //    11: ifne            21
        //    14: goto            18
        //    17: athrow         
        //    18: iconst_0       
        //    19: ireturn        
        //    20: athrow         
        //    21: sipush          762
        //    24: bipush          20
        //    26: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    29: astore_1       
        //    30: invokestatic    org/powerbot/game/api/methods/widget/Bank.isWithdrawNotedEnabled:()Z
        //    33: iload_0        
        //    34: iload_3        
        //    35: ifne            142
        //    38: if_icmpeq       130
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: iload_3        
        //    47: ifne            62
        //    50: goto            54
        //    53: athrow         
        //    54: ifnull          130
        //    57: goto            61
        //    60: athrow         
        //    61: aload_1        
        //    62: iconst_1       
        //    63: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    66: iload_3        
        //    67: ifne            133
        //    70: ifeq            130
        //    73: goto            77
        //    76: athrow         
        //    77: new             Lorg/powerbot/game/api/util/Timer;
        //    80: dup            
        //    81: ldc2_w          500
        //    84: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    87: astore_2       
        //    88: aload_2        
        //    89: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    92: ifeq            130
        //    95: invokestatic    org/powerbot/game/api/methods/widget/Bank.isWithdrawNotedEnabled:()Z
        //    98: iload_0        
        //    99: iload_3        
        //   100: ifne            142
        //   103: iload_3        
        //   104: ifne            142
        //   107: goto            111
        //   110: athrow         
        //   111: if_icmpeq       130
        //   114: goto            118
        //   117: athrow         
        //   118: iconst_5       
        //   119: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   122: iload_3        
        //   123: ifeq            88
        //   126: goto            130
        //   129: athrow         
        //   130: invokestatic    org/powerbot/game/api/methods/widget/Bank.isWithdrawNotedEnabled:()Z
        //   133: iload_3        
        //   134: ifne            146
        //   137: iload_0        
        //   138: goto            142
        //   141: athrow         
        //   142: if_icmpne       149
        //   145: iconst_1       
        //   146: goto            150
        //   149: iconst_0       
        //   150: ireturn        
        //    StackMapTable: 00 1B FF 00 11 00 04 01 00 00 01 00 01 07 02 31 00 41 07 02 31 00 42 01 FF 00 13 00 04 01 07 01 34 00 01 00 01 07 02 31 00 47 07 02 31 40 07 01 34 45 07 02 31 00 40 07 01 34 4D 07 02 31 00 FF 00 0A 00 04 01 07 01 34 07 00 1B 01 00 00 55 07 02 31 FF 00 00 00 04 01 07 01 34 07 00 1B 01 00 02 01 01 45 07 02 31 00 4A 07 02 31 FF 00 00 00 04 01 07 01 34 00 01 00 00 42 01 47 07 02 31 FF 00 00 00 04 01 07 01 34 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  133    138    141    142    Ljava/lang/RuntimeException;
        //  111    126    129    130    Ljava/lang/RuntimeException;
        //  103    114    117    118    Ljava/lang/RuntimeException;
        //  95     107    110    111    Ljava/lang/RuntimeException;
        //  62     73     76     77     Ljava/lang/RuntimeException;
        //  45     57     60     61     Ljava/lang/RuntimeException;
        //  38     50     53     54     Ljava/lang/RuntimeException;
        //  30     41     44     45     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public static boolean isSearchEnabled() {
        try {
            if (getCurrentTab() == Tab.SEARCH) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    public static boolean setSearchMode(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     7: iload_3        
        //     8: ifne            24
        //    11: ifne            21
        //    14: goto            18
        //    17: athrow         
        //    18: iconst_0       
        //    19: ireturn        
        //    20: athrow         
        //    21: sipush          762
        //    24: bipush          18
        //    26: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    29: astore_1       
        //    30: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSearchEnabled:()Z
        //    33: iload_0        
        //    34: iload_3        
        //    35: ifne            142
        //    38: if_icmpeq       130
        //    41: goto            45
        //    44: athrow         
        //    45: aload_1        
        //    46: iload_3        
        //    47: ifne            62
        //    50: goto            54
        //    53: athrow         
        //    54: ifnull          130
        //    57: goto            61
        //    60: athrow         
        //    61: aload_1        
        //    62: iconst_1       
        //    63: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    66: iload_3        
        //    67: ifne            133
        //    70: ifeq            130
        //    73: goto            77
        //    76: athrow         
        //    77: new             Lorg/powerbot/game/api/util/Timer;
        //    80: dup            
        //    81: ldc2_w          500
        //    84: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    87: astore_2       
        //    88: aload_2        
        //    89: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    92: ifeq            130
        //    95: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSearchEnabled:()Z
        //    98: iload_0        
        //    99: iload_3        
        //   100: ifne            142
        //   103: iload_3        
        //   104: ifne            142
        //   107: goto            111
        //   110: athrow         
        //   111: if_icmpeq       130
        //   114: goto            118
        //   117: athrow         
        //   118: iconst_5       
        //   119: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   122: iload_3        
        //   123: ifeq            88
        //   126: goto            130
        //   129: athrow         
        //   130: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSearchEnabled:()Z
        //   133: iload_3        
        //   134: ifne            146
        //   137: iload_0        
        //   138: goto            142
        //   141: athrow         
        //   142: if_icmpne       149
        //   145: iconst_1       
        //   146: goto            150
        //   149: iconst_0       
        //   150: ireturn        
        //    StackMapTable: 00 1B FF 00 11 00 04 01 00 00 01 00 01 07 02 31 00 41 07 02 31 00 42 01 FF 00 13 00 04 01 07 01 34 00 01 00 01 07 02 31 00 47 07 02 31 40 07 01 34 45 07 02 31 00 40 07 01 34 4D 07 02 31 00 FF 00 0A 00 04 01 07 01 34 07 00 1B 01 00 00 55 07 02 31 FF 00 00 00 04 01 07 01 34 07 00 1B 01 00 02 01 01 45 07 02 31 00 4A 07 02 31 FF 00 00 00 04 01 07 01 34 00 01 00 00 42 01 47 07 02 31 FF 00 00 00 04 01 07 01 34 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  133    138    141    142    Ljava/lang/RuntimeException;
        //  111    126    129    130    Ljava/lang/RuntimeException;
        //  103    114    117    118    Ljava/lang/RuntimeException;
        //  95     107    110    111    Ljava/lang/RuntimeException;
        //  62     73     76     77     Ljava/lang/RuntimeException;
        //  45     57     60     61     Ljava/lang/RuntimeException;
        //  38     50     53     54     Ljava/lang/RuntimeException;
        //  30     41     44     45     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    
    public static Item[] search(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     7: iload_1        
        //     8: ifne            24
        //    11: ifne            21
        //    14: goto            18
        //    17: athrow         
        //    18: aconst_null    
        //    19: areturn        
        //    20: athrow         
        //    21: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSearchEnabled:()Z
        //    24: iload_1        
        //    25: ifne            79
        //    28: ifeq            76
        //    31: goto            35
        //    34: athrow         
        //    35: invokestatic    org/powerbot/game/api/methods/widget/Bank.isInputWidgetOpen:()Z
        //    38: iload_1        
        //    39: ifne            79
        //    42: goto            46
        //    45: athrow         
        //    46: ifne            76
        //    49: goto            53
        //    52: athrow         
        //    53: iconst_0       
        //    54: invokestatic    org/powerbot/game/api/methods/widget/Bank.setSearchMode:(Z)Z
        //    57: pop            
        //    58: sipush          1000
        //    61: sipush          2000
        //    64: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //    67: iconst_1       
        //    68: invokestatic    org/powerbot/game/api/methods/widget/Bank.setSearchMode:(Z)Z
        //    71: pop            
        //    72: goto            76
        //    75: athrow         
        //    76: invokestatic    org/powerbot/game/api/methods/widget/Bank.isSearchEnabled:()Z
        //    79: iload_1        
        //    80: ifne            117
        //    83: ifne            109
        //    86: goto            90
        //    89: athrow         
        //    90: iconst_1       
        //    91: invokestatic    org/powerbot/game/api/methods/widget/Bank.setSearchMode:(Z)Z
        //    94: iload_1        
        //    95: ifne            117
        //    98: goto            102
        //   101: athrow         
        //   102: ifeq            166
        //   105: goto            109
        //   108: athrow         
        //   109: iconst_1       
        //   110: invokestatic    org/powerbot/game/api/methods/widget/Bank.waitForInputWidget:(Z)Z
        //   113: goto            117
        //   116: athrow         
        //   117: iload_1        
        //   118: ifne            150
        //   121: ifeq            166
        //   124: goto            128
        //   127: athrow         
        //   128: sipush          200
        //   131: sipush          400
        //   134: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   137: aload_0        
        //   138: iconst_1       
        //   139: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //   142: iconst_0       
        //   143: invokestatic    org/powerbot/game/api/methods/widget/Bank.waitForInputWidget:(Z)Z
        //   146: goto            150
        //   149: athrow         
        //   150: iload_1        
        //   151: ifne            162
        //   154: ifeq            166
        //   157: goto            161
        //   160: athrow         
        //   161: iconst_1       
        //   162: invokestatic    org/powerbot/game/api/methods/widget/Bank.getItems:(Z)[Lorg/powerbot/game/api/wrappers/node/Item;
        //   165: areturn        
        //   166: aconst_null    
        //   167: areturn        
        //    StackMapTable: 00 1E FF 00 11 00 02 07 01 4E 01 00 01 07 02 31 00 41 07 02 31 00 42 01 49 07 02 31 00 49 07 02 31 40 01 45 07 02 31 00 55 07 02 31 00 42 01 49 07 02 31 00 4A 07 02 31 40 01 45 07 02 31 00 46 07 02 31 40 01 49 07 02 31 00 54 07 02 31 40 01 49 07 02 31 00 40 01 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  150    157    160    161    Ljava/lang/RuntimeException;
        //  121    146    149    150    Ljava/lang/RuntimeException;
        //  117    124    127    128    Ljava/lang/RuntimeException;
        //  102    113    116    117    Ljava/lang/RuntimeException;
        //  90     105    108    109    Ljava/lang/RuntimeException;
        //  83     98     101    102    Ljava/lang/RuntimeException;
        //  79     86     89     90     Ljava/lang/RuntimeException;
        //  46     72     75     76     Ljava/lang/RuntimeException;
        //  35     49     52     53     Ljava/lang/RuntimeException;
        //  28     42     45     46     Ljava/lang/RuntimeException;
        //  24     31     34     35     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0035:
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
    
    public static Tab getCurrentTab() {
        Label_0016: {
            int n;
            try {
                final int open;
                n = (open = (isOpen() ? 1 : 0));
                if (Bank.a != 0) {
                    return Tab.getTab(open);
                }
                if (n == 0) {
                    break Label_0016;
                }
                break Label_0016;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (n == 0) {
                    return Tab.NONE;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        int open = Settings.get(110) >>> 27 ^ 0x10;
        return Tab.getTab(open);
    }
    
    public static boolean setCurrentTab(final Tab p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     7: ifeq            108
        //    10: aload_0        
        //    11: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.NONE:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    14: iload_1        
        //    15: ifne            45
        //    18: goto            22
        //    21: athrow         
        //    22: if_acmpeq       108
        //    25: goto            29
        //    28: athrow         
        //    29: aload_0        
        //    30: iload_1        
        //    31: ifne            49
        //    34: goto            38
        //    37: athrow         
        //    38: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.SEARCH:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    41: goto            45
        //    44: athrow         
        //    45: if_acmpeq       108
        //    48: aload_0        
        //    49: iload_1        
        //    50: ifne            73
        //    53: invokestatic    org/powerbot/game/api/methods/widget/Bank$Tab.access$400:(Lorg/powerbot/game/api/methods/widget/Bank$Tab;)I
        //    56: invokestatic    org/powerbot/game/api/methods/widget/Bank.getTabCount:()I
        //    59: if_icmpgt       108
        //    62: goto            66
        //    65: athrow         
        //    66: invokestatic    org/powerbot/game/api/methods/widget/Bank.getCurrentTab:()Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    69: goto            73
        //    72: athrow         
        //    73: iload_1        
        //    74: ifne            90
        //    77: aload_0        
        //    78: if_acmpeq       104
        //    81: goto            85
        //    84: athrow         
        //    85: aload_0        
        //    86: goto            90
        //    89: athrow         
        //    90: invokevirtual   org/powerbot/game/api/methods/widget/Bank$Tab.open:()Z
        //    93: iload_1        
        //    94: ifne            105
        //    97: ifeq            108
        //   100: goto            104
        //   103: athrow         
        //   104: iconst_1       
        //   105: goto            109
        //   108: iconst_0       
        //   109: ireturn        
        //    StackMapTable: 00 16 FF 00 15 00 02 07 00 9E 01 00 01 07 02 31 FF 00 00 00 02 07 00 9E 01 00 02 07 00 9E 07 00 9E 45 07 02 31 00 47 07 02 31 40 07 00 9E 45 07 02 31 FF 00 00 00 02 07 00 9E 01 00 02 07 00 9E 07 00 9E 43 07 00 9E 4F 07 02 31 00 45 07 02 31 40 07 00 9E 4A 07 02 31 00 43 07 02 31 40 07 00 9E 4C 07 02 31 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  90     100    103    104    Ljava/lang/RuntimeException;
        //  77     86     89     90     Ljava/lang/RuntimeException;
        //  73     81     84     85     Ljava/lang/RuntimeException;
        //  53     69     72     73     Ljava/lang/RuntimeException;
        //  49     62     65     66     Ljava/lang/RuntimeException;
        //  29     41     44     45     Ljava/lang/RuntimeException;
        //  22     34     37     38     Ljava/lang/RuntimeException;
        //  10     25     28     29     Ljava/lang/RuntimeException;
        //  4      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    public static int getTabCount() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank.isOpen:()Z
        //     8: iload           6
        //    10: ifne            24
        //    13: ifne            23
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_m1      
        //    21: ireturn        
        //    22: athrow         
        //    23: iconst_1       
        //    24: istore_0       
        //    25: invokestatic    org/powerbot/game/api/methods/widget/Bank$Tab.values:()[Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    28: astore_1       
        //    29: aload_1        
        //    30: arraylength    
        //    31: istore_2       
        //    32: iconst_0       
        //    33: istore_3       
        //    34: iload_3        
        //    35: iload_2        
        //    36: if_icmpge       105
        //    39: aload_1        
        //    40: iload_3        
        //    41: aaload         
        //    42: astore          4
        //    44: aload           4
        //    46: invokevirtual   org/powerbot/game/api/methods/widget/Bank$Tab.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    49: astore          5
        //    51: iload           6
        //    53: ifne            100
        //    56: aload           5
        //    58: ifnull          97
        //    61: goto            65
        //    64: athrow         
        //    65: aload           5
        //    67: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildId:()I
        //    70: iconst_m1      
        //    71: if_icmpeq       97
        //    74: goto            78
        //    77: athrow         
        //    78: aload           4
        //    80: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.SEARCH:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
        //    83: if_acmpeq       97
        //    86: goto            90
        //    89: athrow         
        //    90: iinc            0, 1
        //    93: goto            97
        //    96: athrow         
        //    97: iinc            3, 1
        //   100: iload           6
        //   102: ifeq            34
        //   105: iload_0        
        //   106: ireturn        
        //    StackMapTable: 00 10 FF 00 13 00 07 00 00 00 00 00 00 01 00 01 07 02 31 00 41 07 02 31 00 40 01 FF 00 09 00 07 01 07 02 47 01 01 00 00 01 00 00 FF 00 1D 00 07 01 07 02 47 01 01 07 00 9E 07 01 34 01 00 01 07 02 31 00 4B 07 02 31 00 4A 07 02 31 00 45 07 02 31 00 02 FF 00 04 00 07 01 07 02 47 01 01 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  78     93     96     97     Ljava/lang/RuntimeException;
        //  65     86     89     90     Ljava/lang/RuntimeException;
        //  56     74     77     78     Ljava/lang/RuntimeException;
        //  51     61     64     65     Ljava/lang/RuntimeException;
        //  13     22     22     23     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    protected static boolean slotContainsAction(final WidgetChild p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getActions:()[Ljava/lang/String;
        //     9: astore_2       
        //    10: aload_2        
        //    11: iload           7
        //    13: ifne            24
        //    16: ifnull          124
        //    19: goto            23
        //    22: athrow         
        //    23: aload_2        
        //    24: astore_3       
        //    25: aload_3        
        //    26: arraylength    
        //    27: istore          4
        //    29: iconst_0       
        //    30: istore          5
        //    32: iload           5
        //    34: iload           4
        //    36: if_icmpge       124
        //    39: aload_3        
        //    40: iload           5
        //    42: aaload         
        //    43: astore          6
        //    45: iload           7
        //    47: ifne            119
        //    50: aload           6
        //    52: ifnull          116
        //    55: goto            59
        //    58: athrow         
        //    59: aload           6
        //    61: new             Ljava/lang/StringBuilder;
        //    64: dup            
        //    65: invokespecial   java/lang/StringBuilder.<init>:()V
        //    68: ldc_w           "}"
        //    71: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: aload_1        
        //    78: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    81: getstatic       org/powerbot/game/api/methods/widget/Bank.z:[Ljava/lang/String;
        //    84: iconst_5       
        //    85: aaload         
        //    86: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
        //    89: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    92: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    95: invokevirtual   java/lang/String.matches:(Ljava/lang/String;)Z
        //    98: iload           7
        //   100: ifne            115
        //   103: goto            107
        //   106: athrow         
        //   107: ifeq            116
        //   110: goto            114
        //   113: athrow         
        //   114: iconst_1       
        //   115: ireturn        
        //   116: iinc            5, 1
        //   119: iload           7
        //   121: ifeq            32
        //   124: iconst_0       
        //   125: ireturn        
        //    StackMapTable: 00 0E FF 00 16 00 08 07 01 34 07 01 4E 07 02 49 00 00 00 00 01 00 01 07 02 31 00 40 07 02 49 FF 00 07 00 08 07 01 34 07 01 4E 07 02 49 07 02 49 01 01 00 01 00 00 FF 00 19 00 08 07 01 34 07 01 4E 07 02 49 07 02 49 01 01 07 01 4E 01 00 01 07 02 31 00 6E 07 02 31 40 01 45 07 02 31 00 40 01 00 02 FF 00 04 00 08 07 01 34 07 01 4E 07 02 49 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  59     110    113    114    Ljava/lang/RuntimeException;
        //  50     103    106    107    Ljava/lang/RuntimeException;
        //  45     55     58     59     Ljava/lang/RuntimeException;
        //  10     19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0059:
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
    
    private static boolean isSlotVisible(final WidgetChild widgetChild) {
        final WidgetChild value = Widgets.get(762, 95);
        return new Rectangle(value.getAbsoluteLocation(), new Dimension(value.getWidth() - widgetChild.getWidth(), value.getHeight() - widgetChild.getHeight())).contains(widgetChild.getAbsoluteLocation());
    }
    
    protected static boolean waitForInputWidget(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: new             Lorg/powerbot/game/api/util/Timer;
        //     7: dup            
        //     8: ldc2_w          3000
        //    11: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    14: astore_1       
        //    15: aload_1        
        //    16: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    19: ifeq            57
        //    22: invokestatic    org/powerbot/game/api/methods/widget/Bank.isInputWidgetOpen:()Z
        //    25: iload_0        
        //    26: iload_2        
        //    27: ifne            69
        //    30: iload_2        
        //    31: ifne            69
        //    34: goto            38
        //    37: athrow         
        //    38: if_icmpeq       57
        //    41: goto            45
        //    44: athrow         
        //    45: iconst_5       
        //    46: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //    49: iload_2        
        //    50: ifeq            15
        //    53: goto            57
        //    56: athrow         
        //    57: invokestatic    org/powerbot/game/api/methods/widget/Bank.isInputWidgetOpen:()Z
        //    60: iload_2        
        //    61: ifne            73
        //    64: iload_0        
        //    65: goto            69
        //    68: athrow         
        //    69: if_icmpne       76
        //    72: iconst_1       
        //    73: goto            77
        //    76: iconst_0       
        //    77: ireturn        
        //    StackMapTable: 00 0C FD 00 0F 07 00 1B 01 55 07 02 31 FF 00 00 00 03 01 07 00 1B 01 00 02 01 01 45 07 02 31 00 4A 07 02 31 00 4A 07 02 31 FF 00 00 00 03 01 07 00 1B 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  57     65     68     69     Ljava/lang/RuntimeException;
        //  38     53     56     57     Ljava/lang/RuntimeException;
        //  30     41     44     45     Ljava/lang/RuntimeException;
        //  22     34     37     38     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    private static boolean isInputWidgetOpen() {
        final int a = Bank.a;
        final WidgetChild value = Widgets.get(752, 3);
        boolean onScreen = false;
        Label_0043: {
            Label_0025: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0025;
                    }
                    if (widgetChild == null) {
                        break Label_0043;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    onScreen = widgetChild.isOnScreen();
                    if (a != 0) {
                        return onScreen;
                    }
                    if (!onScreen) {
                        break Label_0043;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return onScreen;
        }
        return onScreen;
    }
    
    private static Locatable[] getLoadedBanks() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: astore_0       
        //    13: getstatic       org/powerbot/game/api/methods/widget/Bank.BANK_NPC_IDS:[I
        //    16: invokestatic    org/powerbot/game/api/methods/interactive/NPCs.getLoaded:([I)[Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //    19: astore_1       
        //    20: aload_1        
        //    21: astore_2       
        //    22: aload_2        
        //    23: arraylength    
        //    24: istore_3       
        //    25: iconst_0       
        //    26: istore          4
        //    28: iload           4
        //    30: iload_3        
        //    31: if_icmpge       102
        //    34: aload_2        
        //    35: iload           4
        //    37: aaload         
        //    38: astore          5
        //    40: iload           7
        //    42: ifne            97
        //    45: aload           5
        //    47: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.validate:()Z
        //    50: ifeq            94
        //    53: goto            57
        //    56: athrow         
        //    57: getstatic       org/powerbot/game/api/methods/widget/Bank.ALL_FILTER:Lorg/powerbot/game/api/util/Filter;
        //    60: aload           5
        //    62: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    67: iload           7
        //    69: ifne            93
        //    72: goto            76
        //    75: athrow         
        //    76: ifeq            94
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: aload           5
        //    86: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    89: goto            93
        //    92: athrow         
        //    93: pop            
        //    94: iinc            4, 1
        //    97: iload           7
        //    99: ifeq            28
        //   102: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getLoaded:()[Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   105: astore_2       
        //   106: aload_2        
        //   107: astore_3       
        //   108: aload_3        
        //   109: arraylength    
        //   110: istore          4
        //   112: iconst_0       
        //   113: istore          5
        //   115: iload           5
        //   117: iload           4
        //   119: if_icmpge       195
        //   122: aload_3        
        //   123: iload           7
        //   125: ifne            209
        //   128: iload           5
        //   130: aaload         
        //   131: astore          6
        //   133: iload           7
        //   135: ifne            190
        //   138: aload           6
        //   140: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.validate:()Z
        //   143: ifeq            187
        //   146: goto            150
        //   149: athrow         
        //   150: getstatic       org/powerbot/game/api/methods/widget/Bank.ALL_FILTER:Lorg/powerbot/game/api/util/Filter;
        //   153: aload           6
        //   155: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   160: iload           7
        //   162: ifne            186
        //   165: goto            169
        //   168: athrow         
        //   169: ifeq            187
        //   172: goto            176
        //   175: athrow         
        //   176: aload_0        
        //   177: aload           6
        //   179: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   182: goto            186
        //   185: athrow         
        //   186: pop            
        //   187: iinc            5, 1
        //   190: iload           7
        //   192: ifeq            115
        //   195: aload_0        
        //   196: aload_0        
        //   197: invokevirtual   java/util/ArrayList.size:()I
        //   200: anewarray       Lorg/powerbot/game/api/wrappers/Locatable;
        //   203: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   206: checkcast       [Lorg/powerbot/game/api/wrappers/Locatable;
        //   209: areturn        
        //    StackMapTable: 00 19 FF 00 1C 00 08 07 00 4E 07 02 4A 07 02 4A 01 01 00 00 01 00 00 FF 00 1B 00 08 07 00 4E 07 02 4A 07 02 4A 01 01 07 00 80 00 01 00 01 07 02 31 00 51 07 02 31 40 01 45 07 02 31 00 48 07 02 31 40 01 00 02 FF 00 04 00 08 07 00 4E 07 02 4A 07 02 4A 01 01 00 00 01 00 00 FF 00 0C 00 08 07 00 4E 07 02 4A 07 02 4C 07 02 4C 01 01 00 01 00 00 FF 00 21 00 08 07 00 4E 07 02 4A 07 02 4C 07 02 4C 01 01 07 00 84 01 00 01 07 02 31 00 51 07 02 31 40 01 45 07 02 31 00 48 07 02 31 40 01 00 02 FF 00 04 00 08 07 00 4E 07 02 4A 07 02 4C 07 02 4C 01 01 00 01 00 00 4D 07 00 7E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  169    182    185    186    Ljava/lang/RuntimeException;
        //  150    172    175    176    Ljava/lang/RuntimeException;
        //  138    165    168    169    Ljava/lang/RuntimeException;
        //  133    146    149    150    Ljava/lang/RuntimeException;
        //  76     89     92     93     Ljava/lang/RuntimeException;
        //  57     79     82     83     Ljava/lang/RuntimeException;
        //  45     72     75     76     Ljava/lang/RuntimeException;
        //  40     53     56     57     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    
    private static boolean isBanker(final Identifiable identifiable) {
        final int a = Bank.a;
        Label_0041: {
            int n2 = 0;
            int binarySearch = 0;
            Label_0025: {
                int n;
                try {
                    Arrays.sort(Bank.BANK_NPC_IDS);
                    n = (binarySearch = (n2 = ((identifiable instanceof NPC) ? 1 : 0)));
                    if (a != 0) {
                        break Label_0041;
                    }
                    if (n != 0) {
                        break Label_0025;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                    n2 = (binarySearch = Arrays.binarySearch(Bank.BANK_NPC_IDS, identifiable.getId()));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return n2 != 0;
                }
                if (binarySearch < 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int n2 = true ? 1 : 0;
        return n2 != 0;
        n2 = (false ? 1 : 0);
        return n2 != 0;
    }
    
    private static boolean isBankBooth(final Identifiable identifiable) {
        final int a = Bank.a;
        Label_0041: {
            int n2 = 0;
            int binarySearch = 0;
            Label_0025: {
                int n;
                try {
                    Arrays.sort(Bank.BANK_BOOTH_IDS);
                    n = (binarySearch = (n2 = ((identifiable instanceof SceneObject) ? 1 : 0)));
                    if (a != 0) {
                        break Label_0041;
                    }
                    if (n != 0) {
                        break Label_0025;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                    n2 = (binarySearch = Arrays.binarySearch(Bank.BANK_BOOTH_IDS, identifiable.getId()));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return n2 != 0;
                }
                if (binarySearch < 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int n2 = true ? 1 : 0;
        return n2 != 0;
        n2 = (false ? 1 : 0);
        return n2 != 0;
    }
    
    private static boolean isBankCounter(final Identifiable identifiable) {
        final int a = Bank.a;
        Label_0041: {
            int n2 = 0;
            int binarySearch = 0;
            Label_0025: {
                int n;
                try {
                    Arrays.sort(Bank.BANK_COUNTER_IDS);
                    n = (binarySearch = (n2 = ((identifiable instanceof SceneObject) ? 1 : 0)));
                    if (a != 0) {
                        break Label_0041;
                    }
                    if (n != 0) {
                        break Label_0025;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                    n2 = (binarySearch = Arrays.binarySearch(Bank.BANK_COUNTER_IDS, identifiable.getId()));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return n2 != 0;
                }
                if (binarySearch < 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int n2 = true ? 1 : 0;
        return n2 != 0;
        n2 = (false ? 1 : 0);
        return n2 != 0;
    }
    
    private static boolean isBankChest(final Identifiable identifiable) {
        final int a = Bank.a;
        Label_0041: {
            int n2 = 0;
            int binarySearch = 0;
            Label_0025: {
                int n;
                try {
                    Arrays.sort(Bank.BANK_CHEST_IDS);
                    n = (binarySearch = (n2 = ((identifiable instanceof SceneObject) ? 1 : 0)));
                    if (a != 0) {
                        break Label_0041;
                    }
                    if (n != 0) {
                        break Label_0025;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                    n2 = (binarySearch = Arrays.binarySearch(Bank.BANK_CHEST_IDS, identifiable.getId()));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return n2 != 0;
                }
                if (binarySearch < 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int n2 = true ? 1 : 0;
        return n2 != 0;
        n2 = (false ? 1 : 0);
        return n2 != 0;
    }
    
    static {
        final String[] z2 = new String[17];
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 0)))))))))))))));
        String s = "\u0011\u001euz\u000b";
        int n18 = -1;
        String intern = null;
    Label_0218_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n20;
            final int n19 = n20 = (length = charArray.length);
            int n21 = 0;
            while (true) {
                Label_0294: {
                    if (n19 > 1) {
                        break Label_0294;
                    }
                    length = (n20 = n21);
                    do {
                        final char c = charArray[n20];
                        char c2 = '\0';
                        switch (n21 % 5) {
                            case 0: {
                                c2 = '+';
                                break;
                            }
                            case 1: {
                                c2 = 'B';
                                break;
                            }
                            case 2: {
                                c2 = 'c';
                                break;
                            }
                            case 3: {
                                c2 = '9';
                                break;
                            }
                            default: {
                                c2 = '\u0017';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n21;
                    } while (n19 == 0);
                }
                if (n19 > n21) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n18) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 1))))))))))))))));
                    s = "LR'(C \u0013m$6";
                    n18 = 0;
                    continue Label_0218_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 2))))))))))))))));
                    s = "v\b\u001dryz)7\u001euM\rIxh|h/]Q";
                    n18 = 1;
                    continue Label_0218_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 3))))))))))))))));
                    s = "_!4[PS\u0000\u001e7";
                    n18 = 2;
                    continue Label_0218_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 4))))))))))))))));
                    s = "LR'(C \u0013m$/wW";
                    n18 = 3;
                    continue Label_0218_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 5))))))))))))))));
                    s = "3\u0007}j\u0019{M>";
                    n18 = 4;
                    continue Label_0218_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 6))))))))))))))));
                    s = "TK6.";
                    n18 = 5;
                    continue Label_0218_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 7))))))))))))))));
                    s = "YZ=+";
                    n18 = 6;
                    continue Label_0218_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 8))))))))))))))));
                    s = "YZ=+\u00070\u001du}\u0006";
                    n18 = 7;
                    continue Label_0218_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 9))))))))))))))));
                    s = "c\u0000\u0007q";
                    n18 = 8;
                    continue Label_0218_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 10))))))))))))))));
                    s = "K'5]@D\u0013";
                    n18 = 9;
                    continue Label_0218_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 11))))))))))))))));
                    s = "n\u0011\ft";
                    n18 = 10;
                    continue Label_0218_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 12))))))))))))))));
                    s = "];%";
                    n18 = 11;
                    continue Label_0218_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 13))))))))))))))));
                    s = "e\u0004\u0019una<m";
                    n18 = 12;
                    continue Label_0218_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 14))))))))))))))));
                    s = "\u0016\u0017jf\u001drO~\u0001K>";
                    n18 = 13;
                    continue Label_0218_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 15))))))))))))))));
                    s = "\u0016\u0017jf\u001drO~\u0018";
                    n18 = 14;
                    continue Label_0218_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = 16))))))))))))))));
                    s = "L-0\\GH\u0015";
                    n18 = 15;
                    continue Label_0218_Outer;
                }
                case 15: {
                    break Label_0218_Outer;
                }
            }
        }
        z2[n17] = intern;
        z = z2;
        BANK_NPC_IDS = new int[] { 44, 45, 166, 494, 495, 496, 497, 498, 499, 553, 909, 953, 958, 1036, 1360, 1702, 2163, 2164, 2354, 2355, 2568, 2569, 2570, 2617, 2618, 2619, 2718, 2759, 3046, 3198, 3199, 3293, 3416, 3418, 3824, 4456, 4457, 4458, 4459, 4519, 4907, 5257, 5258, 5259, 5260, 5488, 5776, 5777, 5901, 6200, 6362, 7049, 7050, 7605, 8948, 9710, 13932, 14707, 14923, 14924, 14925, 15194 };
        BANK_BOOTH_IDS = new int[] { 782, 2213, 3045, 5276, 6084, 10517, 11338, 11758, 12759, 12798, 12799, 12800, 12801, 14369, 14370, 16700, 19230, 20325, 20326, 20327, 20328, 22819, 24914, 25808, 26972, 29085, 34752, 35647, 36262, 36786, 37474, 49018, 49019, 52397, 52589 };
        BANK_COUNTER_IDS = new int[] { 42217, 42377, 42378 };
        BANK_CHEST_IDS = new int[] { 2693, 4483, 8981, 12308, 14382, 20607, 21301, 27663, 42192, 57437, 62691 };
        UNDEPOSITABLE_ITEM_IDS = new int[] { 2528, 6796, 14664, 23713, 23714, 23715, 23716, 23717, 23718, 23719, 23720, 23721, 23722, 23723, 23724, 23725, 23726, 23727, 23728, 23729, 23730, 23731, 23732, 23733, 23734, 23735, 23736, 23737, 23738, 23739, 23740, 23741, 23742, 23743, 23744, 23745, 23746, 23747, 23748, 23749, 23750, 23751, 23752, 23753, 23754, 23755, 23756, 23757, 23758, 23759, 23760, 23761, 23762, 23763, 23764, 23765, 23766, 23767, 23768, 23769, 23770, 23771, 23773, 23774, 23775, 23776, 23777, 23778, 23779, 23780, 23781, 23782, 23783, 23784, 23785, 23786, 23787, 23788, 23789, 23790, 23791, 23792, 23793, 23794, 23795, 23796, 23797, 23798, 23799, 23800, 23801, 23802, 23803, 23804, 23805, 23806, 23807, 23808, 23809, 23810, 23811, 23812, 23813, 23814, 23815, 23816, 23817, 24154, 24155 };
        UNREACHABLE_BANK_TILES = new Tile[] { new Tile(3191, 3445, 0), new Tile(3180, 3433, 0) };
        ALL_FILTER = new Filter<Identifiable>() {
            @Override
            public boolean accept(final Identifiable p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_1        
                //     6: invokestatic    org/powerbot/game/api/methods/widget/Bank.access$000:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
                //     9: iload           6
                //    11: ifne            29
                //    14: ifne            83
                //    17: goto            21
                //    20: athrow         
                //    21: aload_1        
                //    22: invokestatic    org/powerbot/game/api/methods/widget/Bank.access$100:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
                //    25: goto            29
                //    28: athrow         
                //    29: iload           6
                //    31: ifne            49
                //    34: ifne            83
                //    37: goto            41
                //    40: athrow         
                //    41: aload_1        
                //    42: invokestatic    org/powerbot/game/api/methods/widget/Bank.access$200:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
                //    45: goto            49
                //    48: athrow         
                //    49: iload           6
                //    51: ifne            69
                //    54: ifne            83
                //    57: goto            61
                //    60: athrow         
                //    61: aload_1        
                //    62: invokestatic    org/powerbot/game/api/methods/widget/Bank.access$300:(Lorg/powerbot/game/api/wrappers/Identifiable;)Z
                //    65: goto            69
                //    68: athrow         
                //    69: iload           6
                //    71: ifne            82
                //    74: ifne            83
                //    77: goto            81
                //    80: athrow         
                //    81: iconst_0       
                //    82: ireturn        
                //    83: getstatic       org/powerbot/game/api/methods/widget/Bank.UNREACHABLE_BANK_TILES:[Lorg/powerbot/game/api/wrappers/Tile;
                //    86: astore_2       
                //    87: aload_2        
                //    88: arraylength    
                //    89: istore_3       
                //    90: iconst_0       
                //    91: istore          4
                //    93: iload           4
                //    95: iload_3        
                //    96: if_icmpge       151
                //    99: aload_2        
                //   100: iload           4
                //   102: aaload         
                //   103: astore          5
                //   105: iload           6
                //   107: ifne            146
                //   110: aload_1        
                //   111: checkcast       Lorg/powerbot/game/api/wrappers/Locatable;
                //   114: invokeinterface org/powerbot/game/api/wrappers/Locatable.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
                //   119: aload           5
                //   121: invokevirtual   org/powerbot/game/api/wrappers/Tile.equals:(Ljava/lang/Object;)Z
                //   124: iload           6
                //   126: ifne            152
                //   129: goto            133
                //   132: athrow         
                //   133: ifeq            143
                //   136: goto            140
                //   139: athrow         
                //   140: iconst_0       
                //   141: ireturn        
                //   142: athrow         
                //   143: iinc            4, 1
                //   146: iload           6
                //   148: ifeq            93
                //   151: iconst_1       
                //   152: ireturn        
                //    StackMapTable: 00 1A FF 00 14 00 07 07 00 0C 07 00 0A 00 00 00 00 01 00 01 07 00 3A 00 46 07 00 3A 40 01 4A 07 00 3A 00 46 07 00 3A 40 01 4A 07 00 3A 00 46 07 00 3A 40 01 4A 07 00 3A 00 40 01 00 FF 00 09 00 07 07 00 0C 07 00 0A 07 00 3D 01 01 00 01 00 00 FF 00 26 00 07 07 00 0C 07 00 0A 07 00 3D 01 01 07 00 21 01 00 01 07 00 3A 40 01 45 07 00 3A 00 41 07 00 3A 00 02 FF 00 04 00 07 07 00 0C 07 00 0A 07 00 3D 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  133    142    142    143    Ljava/lang/RuntimeException;
                //  110    136    139    140    Ljava/lang/RuntimeException;
                //  105    129    132    133    Ljava/lang/RuntimeException;
                //  69     77     80     81     Ljava/lang/RuntimeException;
                //  54     65     68     69     Ljava/lang/RuntimeException;
                //  49     57     60     61     Ljava/lang/RuntimeException;
                //  34     45     48     49     Ljava/lang/RuntimeException;
                //  29     37     40     41     Ljava/lang/RuntimeException;
                //  14     25     28     29     Ljava/lang/RuntimeException;
                //  5      17     20     21     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0133:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        };
    }
    
    public enum Tab
    {
        NONE(-1), 
        SEARCH(0), 
        ALL(1), 
        SECOND(2), 
        THIRD(3), 
        FOURTH(4), 
        FIFTH(5), 
        SIXTH(6), 
        SEVENTH(7), 
        EIGHTH(8), 
        NINTH(9);
        
        private final int index;
        private static final String[] z;
        
        private Tab(final int index) {
            this.index = index;
        }
        
        public WidgetChild getWidgetChild() {
            final int a = Bank.a;
            Label_0041: {
                Label_0027: {
                    Tab tab = null;
                    Tab tab3 = null;
                    Label_0019: {
                        Tab tab2;
                        try {
                            tab = this;
                            tab2 = (tab3 = Tab.NONE);
                            if (a != 0) {
                                break Label_0027;
                            }
                            if (this != tab2) {
                                break Label_0019;
                            }
                            return null;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (this == tab2) {
                                return null;
                            }
                            tab = this;
                            tab3 = Tab.SEARCH;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (tab == tab3) {
                            return null;
                        }
                        final boolean b;
                        final int n = (b = Bank.isOpen()) ? 1 : 0;
                        final int n2 = a;
                        if (n2 == 0) {
                            break Label_0041;
                        }
                        return Widgets.get(n, 67 - this.index * 2);
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final boolean b;
                    final int n = (b = Bank.isOpen()) ? 1 : 0;
                    final int n2 = a;
                    if (n2 != 0) {
                        return Widgets.get(n, 67 - this.index * 2);
                    }
                    if (!b) {
                        return null;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            final int n = 762;
            return Widgets.get(n, 67 - this.index * 2);
        }
        
        public boolean open() {
            final int a = Bank.a;
            final WidgetChild widgetChild = this.getWidgetChild();
            boolean click = false;
            Label_0041: {
                Label_0022: {
                    WidgetChild widgetChild2;
                    try {
                        widgetChild2 = widgetChild;
                        if (a != 0) {
                            break Label_0022;
                        }
                        if (widgetChild2 == null) {
                            break Label_0041;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        click = widgetChild2.click(true);
                        if (a != 0) {
                            return click;
                        }
                        if (!click) {
                            break Label_0041;
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
        
        public Item getSymbolItem() {
            final WidgetChild widgetChild = this.getWidgetChild();
            Label_0020: {
                WidgetChild widgetChild2;
                try {
                    widgetChild2 = widgetChild;
                    if (Bank.a != 0) {
                        break Label_0020;
                    }
                    if (widgetChild2 == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (widgetChild2.getChildId() != -1) {
                        return new Item(widgetChild);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return null;
        }
        
        public static Tab getTab(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore          5
            //     5: invokestatic    org/powerbot/game/api/methods/widget/Bank$Tab.values:()[Lorg/powerbot/game/api/methods/widget/Bank$Tab;
            //     8: astore_1       
            //     9: aload_1        
            //    10: arraylength    
            //    11: istore_2       
            //    12: iconst_0       
            //    13: istore_3       
            //    14: iload_3        
            //    15: iload_2        
            //    16: if_icmpge       63
            //    19: aload_1        
            //    20: iload_3        
            //    21: aaload         
            //    22: astore          4
            //    24: iload           5
            //    26: ifne            58
            //    29: aload           4
            //    31: iload           5
            //    33: ifne            66
            //    36: goto            40
            //    39: athrow         
            //    40: getfield        org/powerbot/game/api/methods/widget/Bank$Tab.index:I
            //    43: iload_0        
            //    44: if_icmpne       55
            //    47: goto            51
            //    50: athrow         
            //    51: aload           4
            //    53: areturn        
            //    54: athrow         
            //    55: iinc            3, 1
            //    58: iload           5
            //    60: ifeq            14
            //    63: getstatic       org/powerbot/game/api/methods/widget/Bank$Tab.NONE:Lorg/powerbot/game/api/methods/widget/Bank$Tab;
            //    66: areturn        
            //    StackMapTable: 00 0A FF 00 0E 00 06 01 07 00 47 01 01 00 01 00 00 FF 00 18 00 06 01 07 00 47 01 01 07 00 05 01 00 01 07 00 97 40 07 00 05 49 07 00 97 00 42 07 00 97 00 02 FF 00 04 00 06 01 07 00 47 01 01 00 01 00 00 42 07 00 05
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  40     54     54     55     Ljava/lang/RuntimeException;
            //  29     47     50     51     Ljava/lang/RuntimeException;
            //  24     36     39     40     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
            final String[] z2 = new String[11];
            int n11;
            int n10;
            int n9;
            int n8;
            int n7;
            int n6;
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 0)))))))));
            String s = "a(M\u001f\u0012S";
            int n12 = -1;
            String intern = null;
        Label_0135_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n14;
                final int n13 = n14 = (length = charArray.length);
                int n15 = 0;
                while (true) {
                    Label_0210: {
                        if (n13 > 1) {
                            break Label_0210;
                        }
                        length = (n14 = n15);
                        do {
                            final char c = charArray[n14];
                            char c2 = '\0';
                            switch (n15 % 5) {
                                case 0: {
                                    c2 = '\u0006';
                                    break;
                                }
                                case 1: {
                                    c2 = 'p';
                                    break;
                                }
                                case 2: {
                                    c2 = '8';
                                    break;
                                }
                                case 3: {
                                    c2 = 'P';
                                    break;
                                }
                                default: {
                                    c2 = 'e';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n15;
                        } while (n13 == 0);
                    }
                    if (n13 > n15) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n12) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 1))))))))));
                        s = "_iaC";
                        n12 = 0;
                        continue Label_0135_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 2))))))))));
                        s = "a(O\u0002\u001f_";
                        n12 = 1;
                        continue Label_0135_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 3))))))))));
                        s = "\u0003\"8\u0002}En";
                        n12 = 2;
                        continue Label_0135_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 4))))))))));
                        s = "\u0011+\"";
                        n12 = 3;
                        continue Label_0135_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 5))))))))));
                        s = "\u001e. \u0013{";
                        n12 = 4;
                        continue Label_0135_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 6))))))))));
                        s = "t\"Y\u001f\u0005S";
                        n12 = 5;
                        continue Label_0135_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 7))))))))));
                        s = "w$K\u0005\u0005S";
                        n12 = 6;
                        continue Label_0135_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 8))))))))));
                        s = "\u0016.(\u0013{";
                        n12 = 7;
                        continue Label_0135_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 9))))))))));
                        s = "H\r}00";
                        n12 = 8;
                        continue Label_0135_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = 10))))))))));
                        s = "\u0004/'\u0015w";
                        n12 = 9;
                        continue Label_0135_Outer;
                    }
                    case 9: {
                        break Label_0135_Outer;
                    }
                }
            }
            z2[n11] = intern;
            z = z2;
        }
    }
    
    public enum Amount
    {
        ONE(1), 
        FIVE(5), 
        TEN(10), 
        ALL_BUT_ONE(-1), 
        ALL(0);
        
        private final int value;
        private static final String[] z;
        
        private Amount(final int value) {
            this.value = value;
        }
        
        public int getValue() {
            return this.value;
        }
        
        static {
            final String[] z2 = new String[5];
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = 0)));
            String s = "{#\u001f";
            int n6 = -1;
            String intern = null;
        Label_0071_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n8;
                final int n7 = n8 = (length = charArray.length);
                int n9 = 0;
                while (true) {
                    Label_0146: {
                        if (n7 > 1) {
                            break Label_0146;
                        }
                        length = (n8 = n9);
                        do {
                            final char c = charArray[n8];
                            char c2 = '\0';
                            switch (n9 % 5) {
                                case 0: {
                                    c2 = '\u0017';
                                    break;
                                }
                                case 1: {
                                    c2 = ' ';
                                    break;
                                }
                                case 2: {
                                    c2 = 'y';
                                    break;
                                }
                                case 3: {
                                    c2 = '=';
                                    break;
                                }
                                default: {
                                    c2 = '\u000e';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n9;
                        } while (n7 == 0);
                    }
                    if (n7 > n9) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n6) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 1))));
                        s = "aU\u001fD";
                        n6 = 0;
                        continue Label_0071_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 2))));
                        s = "`(\u0014";
                        n6 = 1;
                        continue Label_0071_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 3))));
                        s = "u!\u0016";
                        n6 = 2;
                        continue Label_0071_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 4))));
                        s = "j\\\tRprH\u0016Npn";
                        n6 = 3;
                        continue Label_0071_Outer;
                    }
                    case 3: {
                        break Label_0071_Outer;
                    }
                }
            }
            z2[n5] = intern;
            z = z2;
        }
    }
}
