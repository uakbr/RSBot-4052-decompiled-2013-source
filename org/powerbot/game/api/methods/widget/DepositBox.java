
package org.powerbot.game.api.methods.widget;

import org.powerbot.game.api.wrappers.Identifiable;
import java.util.ArrayList;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.api.util.Filter;
import java.util.Arrays;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.util.Time;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.methods.Widgets;

public class DepositBox
{
    public static final int[] DEPOSIT_BOX_IDS;
    public static final int WIDGET_DEPOSIT_BOX = 11;
    public static final int WIDGET_SLOTS_CONTAINER = 17;
    public static final int WIDGET_BUTTON_CLOSE_DEPOSIT_BOX = 15;
    public static final int WIDGET_BUTTON_DEPOSIT_INVENTORY = 19;
    public static final int WIDGET_BUTTON_DEPOSIT_EQUIPMENT = 23;
    public static final int WIDGET_BUTTON_DEPOSIT_FAMILIAR = 25;
    public static final int WIDGET_BUTTON_DEPOSIT_POUCH = 21;
    private static final String[] z;
    
    public static boolean isOpen() {
        final int a = Bank.a;
        final Widget value = Widgets.get(11);
        boolean validate = false;
        Label_0041: {
            Label_0023: {
                Widget widget;
                try {
                    widget = value;
                    if (a != 0) {
                        break Label_0023;
                    }
                    if (widget == null) {
                        break Label_0041;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    validate = widget.validate();
                    if (a != 0) {
                        return validate;
                    }
                    if (!validate) {
                        break Label_0041;
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
        //     3: istore_2       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getNearest:()Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //     7: astore_0       
        //     8: aload_0        
        //     9: iload_2        
        //    10: ifne            24
        //    13: ifnonnull       23
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_0       
        //    21: ireturn        
        //    22: athrow         
        //    23: aload_0        
        //    24: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.isOnScreen:()Z
        //    27: iload_2        
        //    28: ifne            110
        //    31: ifne            106
        //    34: goto            38
        //    37: athrow         
        //    38: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    41: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isMoving:()Z
        //    44: iload_2        
        //    45: ifne            100
        //    48: goto            52
        //    51: athrow         
        //    52: ifeq            88
        //    55: goto            59
        //    58: athrow         
        //    59: invokestatic    org/powerbot/game/api/methods/Walking.getDestination:()Lorg/powerbot/game/api/wrappers/Tile;
        //    62: aload_0        
        //    63: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //    66: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/wrappers/Locatable;)D
        //    69: ldc2_w          4.0
        //    72: dcmpl          
        //    73: iload_2        
        //    74: ifne            110
        //    77: goto            81
        //    80: athrow         
        //    81: ifle            106
        //    84: goto            88
        //    87: athrow         
        //    88: aload_0        
        //    89: invokestatic    org/powerbot/game/api/methods/Walking.walk:(Lorg/powerbot/game/api/wrappers/Locatable;)Z
        //    92: pop            
        //    93: sipush          200
        //    96: goto            100
        //    99: athrow         
        //   100: sipush          400
        //   103: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   106: aload_0        
        //   107: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.isOnScreen:()Z
        //   110: iload_2        
        //   111: ifne            204
        //   114: ifeq            201
        //   117: goto            121
        //   120: athrow         
        //   121: aload_0        
        //   122: getstatic       org/powerbot/game/api/methods/widget/DepositBox.z:[Ljava/lang/String;
        //   125: iconst_4       
        //   126: aaload         
        //   127: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   130: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.interact:(Ljava/lang/String;)Z
        //   133: iload_2        
        //   134: ifne            204
        //   137: goto            141
        //   140: athrow         
        //   141: ifeq            201
        //   144: goto            148
        //   147: athrow         
        //   148: new             Lorg/powerbot/game/api/util/Timer;
        //   151: dup            
        //   152: ldc2_w          4000
        //   155: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   158: astore_1       
        //   159: aload_1        
        //   160: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   163: ifeq            201
        //   166: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.isOpen:()Z
        //   169: iload_2        
        //   170: ifne            204
        //   173: iload_2        
        //   174: ifne            204
        //   177: goto            181
        //   180: athrow         
        //   181: ifne            201
        //   184: goto            188
        //   187: athrow         
        //   188: bipush          10
        //   190: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   193: iload_2        
        //   194: ifeq            159
        //   197: goto            201
        //   200: athrow         
        //   201: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.isOpen:()Z
        //   204: ireturn        
        //    StackMapTable: 00 21 FF 00 13 00 03 07 00 8D 00 01 00 01 07 01 2F 00 41 07 01 2F 00 40 07 00 8D 4C 07 01 2F 00 4C 07 01 2F 40 01 45 07 01 2F 00 54 07 01 2F 40 01 45 07 01 2F 00 4A 07 01 2F 40 01 05 43 01 49 07 01 2F 00 52 07 01 2F 40 01 45 07 01 2F 00 FF 00 0A 00 03 07 00 8D 07 00 10 01 00 00 54 07 01 2F 40 01 45 07 01 2F 00 4B 07 01 2F FF 00 00 00 03 07 00 8D 00 01 00 00 42 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  181    197    200    201    Ljava/lang/RuntimeException;
        //  173    184    187    188    Ljava/lang/RuntimeException;
        //  166    177    180    181    Ljava/lang/RuntimeException;
        //  121    144    147    148    Ljava/lang/RuntimeException;
        //  114    137    140    141    Ljava/lang/RuntimeException;
        //  110    117    120    121    Ljava/lang/RuntimeException;
        //  81     96     99     100    Ljava/lang/RuntimeException;
        //  59     84     87     88     Ljava/lang/RuntimeException;
        //  52     77     80     81     Ljava/lang/RuntimeException;
        //  38     55     58     59     Ljava/lang/RuntimeException;
        //  31     48     51     52     Ljava/lang/RuntimeException;
        //  24     34     37     38     Ljava/lang/RuntimeException;
        //  13     22     22     23     Ljava/lang/RuntimeException;
        //  8      16     19     20     Ljava/lang/RuntimeException;
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
    
    public static boolean close() {
        final int a = Bank.a;
        int open = 0;
        Label_0023: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0023;
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
            open = 11;
        }
        final WidgetChild value = Widgets.get(open, 15);
        boolean interact = false;
        Label_0068: {
            Label_0042: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0042;
                    }
                    if (widgetChild == null) {
                        break Label_0068;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    interact = widgetChild.interact(Time.e(DepositBox.z[0]));
                    if (a != 0) {
                        return interact;
                    }
                    if (!interact) {
                        break Label_0068;
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
    
    public static SceneObject getNearest() {
        Arrays.sort(DepositBox.DEPOSIT_BOX_IDS);
        return SceneEntities.getNearest(new Filter<SceneObject>() {
            @Override
            public boolean accept(final SceneObject sceneObject) {
                Label_0024: {
                    try {
                        if (sceneObject == null) {
                            return false;
                        }
                        final int[] array = DepositBox.DEPOSIT_BOX_IDS;
                        final SceneObject sceneObject2 = sceneObject;
                        final int n = sceneObject2.getId();
                        final int n3;
                        final int n2 = n3 = Arrays.binarySearch(array, n);
                        final int n4 = Bank.a;
                        if (n4 == 0) {
                            break Label_0024;
                        }
                        return n2 != 0;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int[] array = DepositBox.DEPOSIT_BOX_IDS;
                        final SceneObject sceneObject2 = sceneObject;
                        final int n = sceneObject2.getId();
                        final int n3;
                        final int n2 = n3 = Arrays.binarySearch(array, n);
                        final int n4 = Bank.a;
                        if (n4 != 0) {
                            return n2 != 0;
                        }
                        if (n3 < 0) {
                            return false;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                int n2 = 1;
                return n2 != 0;
                n2 = (false ? 1 : 0);
                return n2 != 0;
            }
        });
    }
    
    public static boolean deposit(final int n, final Bank.Amount amount) {
        return deposit(n, amount.getValue());
    }
    
    public static boolean deposit(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: iload_0        
        //     6: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItem:(I)Lorg/powerbot/game/api/wrappers/node/Item;
        //     9: astore_2       
        //    10: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.isOpen:()Z
        //    13: iload           6
        //    15: ifne            51
        //    18: ifeq            50
        //    21: goto            25
        //    24: athrow         
        //    25: aload_2        
        //    26: ifnull          50
        //    29: goto            33
        //    32: athrow         
        //    33: iload_1        
        //    34: iload           6
        //    36: ifne            51
        //    39: goto            43
        //    42: athrow         
        //    43: ifge            52
        //    46: goto            50
        //    49: athrow         
        //    50: iconst_0       
        //    51: ireturn        
        //    52: new             Ljava/lang/StringBuilder;
        //    55: dup            
        //    56: invokespecial   java/lang/StringBuilder.<init>:()V
        //    59: getstatic       org/powerbot/game/api/methods/widget/DepositBox.z:[Ljava/lang/String;
        //    62: iconst_1       
        //    63: aaload         
        //    64: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //    67: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    70: iload_1        
        //    71: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    74: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    77: astore_3       
        //    78: iconst_1       
        //    79: iconst_1       
        //    80: newarray        I
        //    82: dup            
        //    83: iconst_0       
        //    84: iload_0        
        //    85: iastore        
        //    86: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItemCount:(Z[I)I
        //    89: iload           6
        //    91: ifne            107
        //    94: iload_1        
        //    95: if_icmple       119
        //    98: goto            102
        //   101: athrow         
        //   102: iload_1        
        //   103: goto            107
        //   106: athrow         
        //   107: iload           6
        //   109: ifne            132
        //   112: ifne            128
        //   115: goto            119
        //   118: athrow         
        //   119: getstatic       org/powerbot/game/api/methods/widget/DepositBox.z:[Ljava/lang/String;
        //   122: iconst_2       
        //   123: aaload         
        //   124: invokestatic    org/powerbot/game/api/util/Time.e:(Ljava/lang/String;)Ljava/lang/String;
        //   127: astore_3       
        //   128: iconst_1       
        //   129: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItemCount:(Z)I
        //   132: istore          4
        //   134: aload_2        
        //   135: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   138: aload_3        
        //   139: invokestatic    org/powerbot/game/api/methods/widget/Bank.slotContainsAction:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;Ljava/lang/String;)Z
        //   142: iload           6
        //   144: ifne            195
        //   147: ifeq            180
        //   150: goto            154
        //   153: athrow         
        //   154: aload_2        
        //   155: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   158: aload_3        
        //   159: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   162: iload           6
        //   164: ifne            179
        //   167: goto            171
        //   170: athrow         
        //   171: ifne            248
        //   174: goto            178
        //   177: athrow         
        //   178: iconst_0       
        //   179: ireturn        
        //   180: aload_2        
        //   181: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   184: getstatic       org/powerbot/game/api/methods/widget/DepositBox.z:[Ljava/lang/String;
        //   187: iconst_3       
        //   188: aaload         
        //   189: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   192: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   195: iload           6
        //   197: ifne            215
        //   200: ifeq            248
        //   203: goto            207
        //   206: athrow         
        //   207: iconst_1       
        //   208: invokestatic    org/powerbot/game/api/methods/widget/Bank.waitForInputWidget:(Z)Z
        //   211: goto            215
        //   214: athrow         
        //   215: iload           6
        //   217: ifne            241
        //   220: ifeq            248
        //   223: goto            227
        //   226: athrow         
        //   227: sipush          200
        //   230: sipush          800
        //   233: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   236: iload_1        
        //   237: goto            241
        //   240: athrow         
        //   241: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   244: iconst_1       
        //   245: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //   248: new             Lorg/powerbot/game/api/util/Timer;
        //   251: dup            
        //   252: ldc2_w          2000
        //   255: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   258: astore          5
        //   260: aload           5
        //   262: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   265: ifeq            308
        //   268: iconst_1       
        //   269: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItemCount:(Z)I
        //   272: iload           4
        //   274: iload           6
        //   276: ifne            323
        //   279: iload           6
        //   281: ifne            323
        //   284: goto            288
        //   287: athrow         
        //   288: if_icmpne       308
        //   291: goto            295
        //   294: athrow         
        //   295: iconst_5       
        //   296: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   299: iload           6
        //   301: ifeq            260
        //   304: goto            308
        //   307: athrow         
        //   308: iconst_1       
        //   309: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItemCount:(Z)I
        //   312: iload           6
        //   314: ifne            327
        //   317: iload           4
        //   319: goto            323
        //   322: athrow         
        //   323: if_icmpeq       330
        //   326: iconst_1       
        //   327: goto            331
        //   330: iconst_0       
        //   331: ireturn        
        //    StackMapTable: 00 30 FF 00 18 00 07 01 01 07 00 35 00 00 00 01 00 01 07 01 2F 00 46 07 01 2F 00 48 07 01 2F 40 01 45 07 01 2F 00 40 01 00 FF 00 30 00 07 01 01 07 00 35 07 00 B6 00 00 01 00 01 07 01 2F 00 43 07 01 2F 40 01 4A 07 01 2F 00 08 43 01 FF 00 14 00 07 01 01 07 00 35 07 00 B6 01 00 01 00 01 07 01 2F 00 4F 07 01 2F 40 01 45 07 01 2F 00 40 01 00 4E 01 4A 07 01 2F 00 46 07 01 2F 40 01 4A 07 01 2F 00 4C 07 01 2F 40 01 06 FF 00 0B 00 07 01 01 07 00 35 07 00 B6 01 07 00 10 01 00 00 5A 07 01 2F FF 00 00 00 07 01 01 07 00 35 07 00 B6 01 07 00 10 01 00 02 01 01 45 07 01 2F 00 4B 07 01 2F 00 4D 07 01 2F FF 00 00 00 07 01 01 07 00 35 07 00 B6 01 07 00 10 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  308    319    322    323    Ljava/lang/RuntimeException;
        //  288    304    307    308    Ljava/lang/RuntimeException;
        //  279    291    294    295    Ljava/lang/RuntimeException;
        //  268    284    287    288    Ljava/lang/RuntimeException;
        //  220    237    240    241    Ljava/lang/RuntimeException;
        //  215    223    226    227    Ljava/lang/RuntimeException;
        //  200    211    214    215    Ljava/lang/RuntimeException;
        //  195    203    206    207    Ljava/lang/RuntimeException;
        //  154    174    177    178    Ljava/lang/RuntimeException;
        //  147    167    170    171    Ljava/lang/RuntimeException;
        //  134    150    153    154    Ljava/lang/RuntimeException;
        //  107    115    118    119    Ljava/lang/RuntimeException;
        //  94     103    106    107    Ljava/lang/RuntimeException;
        //  78     98     101    102    Ljava/lang/RuntimeException;
        //  33     46     49     50     Ljava/lang/RuntimeException;
        //  25     39     42     43     Ljava/lang/RuntimeException;
        //  18     29     32     33     Ljava/lang/RuntimeException;
        //  10     21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
        //     4: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.isOpen:()Z
        //     7: iload_3        
        //     8: ifne            25
        //    11: ifne            21
        //    14: goto            18
        //    17: athrow         
        //    18: iconst_0       
        //    19: ireturn        
        //    20: athrow         
        //    21: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    24: arraylength    
        //    25: iload_3        
        //    26: ifne            41
        //    29: ifne            39
        //    32: goto            36
        //    35: athrow         
        //    36: iconst_1       
        //    37: ireturn        
        //    38: athrow         
        //    39: bipush          11
        //    41: bipush          19
        //    43: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    46: astore_0       
        //    47: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    50: arraylength    
        //    51: istore_1       
        //    52: aload_0        
        //    53: iload_3        
        //    54: ifne            65
        //    57: ifnull          134
        //    60: goto            64
        //    63: athrow         
        //    64: aload_0        
        //    65: iconst_1       
        //    66: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    69: iload_3        
        //    70: ifne            135
        //    73: ifeq            134
        //    76: goto            80
        //    79: athrow         
        //    80: new             Lorg/powerbot/game/api/util/Timer;
        //    83: dup            
        //    84: ldc2_w          2000
        //    87: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    90: astore_2       
        //    91: aload_2        
        //    92: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    95: ifeq            134
        //    98: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //   101: arraylength    
        //   102: iload_1        
        //   103: iload_3        
        //   104: ifne            147
        //   107: iload_3        
        //   108: ifne            147
        //   111: goto            115
        //   114: athrow         
        //   115: if_icmpne       134
        //   118: goto            122
        //   121: athrow         
        //   122: iconst_5       
        //   123: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   126: iload_3        
        //   127: ifeq            91
        //   130: goto            134
        //   133: athrow         
        //   134: iload_1        
        //   135: iload_3        
        //   136: ifne            151
        //   139: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //   142: arraylength    
        //   143: goto            147
        //   146: athrow         
        //   147: if_icmpeq       154
        //   150: iconst_1       
        //   151: goto            155
        //   154: iconst_0       
        //   155: ireturn        
        //    StackMapTable: 00 1C FF 00 11 00 04 00 00 00 01 00 01 07 01 2F 00 41 07 01 2F 00 43 01 49 07 01 2F 00 41 07 01 2F 00 41 01 FF 00 15 00 04 07 00 A2 01 00 01 00 01 07 01 2F 00 40 07 00 A2 4D 07 01 2F 00 FF 00 0A 00 04 07 00 A2 01 07 00 10 01 00 00 56 07 01 2F FF 00 00 00 04 07 00 A2 01 07 00 10 01 00 02 01 01 45 07 01 2F 00 4A 07 01 2F FF 00 00 00 04 07 00 A2 01 00 01 00 00 40 01 4A 07 01 2F FF 00 00 00 04 07 00 A2 01 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  135    143    146    147    Ljava/lang/RuntimeException;
        //  115    130    133    134    Ljava/lang/RuntimeException;
        //  107    118    121    122    Ljava/lang/RuntimeException;
        //  98     111    114    115    Ljava/lang/RuntimeException;
        //  65     76     79     80     Ljava/lang/RuntimeException;
        //  52     60     63     64     Ljava/lang/RuntimeException;
        //  29     38     38     39     Ljava/lang/RuntimeException;
        //  25     32     35     36     Ljava/lang/RuntimeException;
        //  11     20     20     21     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
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
    
    public static boolean depositEquipment() {
        final int a = Bank.a;
        int open = 0;
        Label_0023: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0023;
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
            open = 11;
        }
        final WidgetChild value = Widgets.get(open, 23);
        boolean click = false;
        Label_0061: {
            Label_0042: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0042;
                    }
                    if (widgetChild == null) {
                        break Label_0061;
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
                        break Label_0061;
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
        Label_0023: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0023;
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
            open = 11;
        }
        final WidgetChild value = Widgets.get(open, 25);
        boolean click = false;
        Label_0061: {
            Label_0042: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0042;
                    }
                    if (widgetChild == null) {
                        break Label_0061;
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
                        break Label_0061;
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
        Label_0023: {
            Label_0021: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0023;
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
            open = 11;
        }
        final WidgetChild value = Widgets.get(open, 21);
        boolean click = false;
        Label_0061: {
            Label_0042: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (a != 0) {
                        break Label_0042;
                    }
                    if (widgetChild == null) {
                        break Label_0061;
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
                        break Label_0061;
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
    
    public static Item getItem(final Filter<Item> filter) {
        final int a = Bank.a;
        final Item[] items = getItems();
        final int length = items.length;
        int i = 0;
        while (i < length) {
            final Item item = items[i];
            Label_0051: {
                Label_0048: {
                    try {
                        if (a != 0) {
                            break Label_0051;
                        }
                        final Filter<Item> filter2 = filter;
                        final Item item2 = item;
                        final boolean b = filter2.accept(item2);
                        if (b) {
                            return item;
                        }
                        break Label_0048;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Filter<Item> filter2 = filter;
                        final Item item2 = item;
                        final boolean b = filter2.accept(item2);
                        if (b) {
                            return item;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        return null;
    }
    
    public static Item getItem(final int n) {
        return getItem(new Filter<Item>() {
            @Override
            public boolean accept(final Item item) {
                int id = 0;
                Label_0021: {
                    int n;
                    try {
                        n = (id = item.getId());
                        if (Bank.a != 0) {
                            return id != 0;
                        }
                        final Filter<Item> filter = this;
                        final int n2 = n;
                        if (n == n2) {
                            break Label_0021;
                        }
                        return false;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Filter<Item> filter = this;
                        final int n2 = n;
                        if (n != n2) {
                            return false;
                        }
                        id = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return id != 0;
                id = (false ? 1 : 0);
                return id != 0;
            }
        });
    }
    
    public static Item[] getItems() {
        final int a = Bank.a;
        int open = 0;
        Label_0028: {
            Label_0020: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0028;
                    }
                    if (n == 0) {
                        break Label_0020;
                    }
                    break Label_0020;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return new Item[0];
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 11;
        }
        final WidgetChild[] children = Widgets.get(open, 17).getChildren();
        final ArrayList<Item> list = new ArrayList<Item>();
        final WidgetChild[] array = children;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Identifiable[] array3;
            final WidgetChild[] array2 = (WidgetChild[])(array3 = array);
            if (a != 0) {
                return (Item[])array3;
            }
            final WidgetChild widgetChild = array2[i];
            Label_0109: {
                Label_0088: {
                    try {
                        if (a != 0) {
                            break Label_0109;
                        }
                        final WidgetChild widgetChild2 = widgetChild;
                        final int n2 = widgetChild2.getChildId();
                        final int n3 = -1;
                        if (n2 != n3) {
                            break Label_0088;
                        }
                        break Label_0088;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final WidgetChild widgetChild2 = widgetChild;
                        final int n2 = widgetChild2.getChildId();
                        final int n3 = -1;
                        if (n2 != n3) {
                            list.add(new Item(widgetChild));
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        Identifiable[] array3 = list.toArray(new Item[list.size()]);
        return (Item[])array3;
    }
    
    public static Item[] getItems(final Filter<Item> filter) {
        final int a = Bank.a;
        int open = 0;
        Label_0028: {
            Label_0020: {
                int n;
                try {
                    n = (open = (isOpen() ? 1 : 0));
                    if (a != 0) {
                        break Label_0028;
                    }
                    if (n == 0) {
                        break Label_0020;
                    }
                    break Label_0020;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return new Item[0];
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            open = 11;
        }
        final WidgetChild[] children = Widgets.get(open, 17).getChildren();
        final ArrayList<Item> list = new ArrayList<Item>();
        final WidgetChild[] array = children;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Identifiable[] array3;
            final WidgetChild[] array2 = (WidgetChild[])(array3 = array);
            if (a != 0) {
                return (Item[])array3;
            }
            final WidgetChild widgetChild = array2[i];
            Label_0134: {
                Label_0130: {
                    try {
                        if (a != 0) {
                            break Label_0134;
                        }
                        if (widgetChild.getChildId() == -1) {
                            break Label_0130;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    final Item e = new Item(widgetChild);
                    Label_0120: {
                        boolean accept;
                        try {
                            accept = filter.accept(e);
                            if (a != 0) {
                                break Label_0130;
                            }
                            if (accept) {
                                break Label_0120;
                            }
                            break Label_0130;
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                        try {
                            if (accept) {
                                list.add(e);
                            }
                        }
                        catch (RuntimeException ex5) {
                            throw ex5;
                        }
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        Identifiable[] array3 = list.toArray(new Item[list.size()]);
        return (Item[])array3;
    }
    
    public static int getItemCount(final int... array) {
        return getItemCount(false, new Filter<Item>() {
            @Override
            public boolean accept(final Item p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/game/api/methods/widget/DepositBox$3.val$ids:[I
                //    14: astore_3       
                //    15: aload_3        
                //    16: arraylength    
                //    17: istore          4
                //    19: iconst_0       
                //    20: istore          5
                //    22: iload           5
                //    24: iload           4
                //    26: if_icmpge       70
                //    29: aload_3        
                //    30: iload           5
                //    32: iaload         
                //    33: istore          6
                //    35: iload           7
                //    37: ifne            65
                //    40: iload           6
                //    42: iload           7
                //    44: ifne            71
                //    47: goto            51
                //    50: athrow         
                //    51: iload_2        
                //    52: if_icmpne       62
                //    55: goto            59
                //    58: athrow         
                //    59: iconst_1       
                //    60: ireturn        
                //    61: athrow         
                //    62: iinc            5, 1
                //    65: iload           7
                //    67: ifeq            22
                //    70: iconst_0       
                //    71: ireturn        
                //    StackMapTable: 00 0A FF 00 16 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 FF 00 1B 00 08 07 00 06 07 00 04 01 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 46 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  51     61     61     62     Ljava/lang/RuntimeException;
                //  40     55     58     59     Ljava/lang/RuntimeException;
                //  35     47     50     51     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public static int getItemCount(final boolean b, final int... array) {
        return getItemCount(b, new Filter<Item>() {
            @Override
            public boolean accept(final Item p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/game/api/methods/widget/DepositBox$4.val$ids:[I
                //    14: astore_3       
                //    15: aload_3        
                //    16: arraylength    
                //    17: istore          4
                //    19: iconst_0       
                //    20: istore          5
                //    22: iload           5
                //    24: iload           4
                //    26: if_icmpge       70
                //    29: aload_3        
                //    30: iload           5
                //    32: iaload         
                //    33: istore          6
                //    35: iload           7
                //    37: ifne            65
                //    40: iload           6
                //    42: iload           7
                //    44: ifne            71
                //    47: goto            51
                //    50: athrow         
                //    51: iload_2        
                //    52: if_icmpne       62
                //    55: goto            59
                //    58: athrow         
                //    59: iconst_1       
                //    60: ireturn        
                //    61: athrow         
                //    62: iinc            5, 1
                //    65: iload           7
                //    67: ifeq            22
                //    70: iconst_0       
                //    71: getstatic       org/powerbot/core/script/job/Task.a:I
                //    74: ifeq            89
                //    77: iinc            7, 1
                //    80: iload           7
                //    82: putstatic       org/powerbot/game/api/methods/widget/Bank.a:I
                //    85: goto            89
                //    88: athrow         
                //    89: ireturn        
                //    StackMapTable: 00 0C FF 00 16 00 08 07 00 06 07 00 04 01 07 00 33 01 01 00 01 00 00 FF 00 1B 00 08 07 00 06 07 00 04 01 07 00 33 01 01 01 01 00 01 07 00 30 40 01 46 07 00 30 00 41 07 00 30 00 02 FF 00 04 00 08 07 00 06 07 00 04 01 07 00 33 01 01 00 01 00 00 40 01 50 07 00 30 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  71     85     88     89     Ljava/lang/RuntimeException;
                //  51     61     61     62     Ljava/lang/RuntimeException;
                //  40     55     58     59     Ljava/lang/RuntimeException;
                //  35     47     50     51     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
    
    public static int getItemCount(final boolean p0, final Filter<Item> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: iconst_0       
        //     6: istore_2       
        //     7: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    10: astore_3       
        //    11: aload_3        
        //    12: arraylength    
        //    13: istore          4
        //    15: iconst_0       
        //    16: istore          5
        //    18: iload           5
        //    20: iload           4
        //    22: if_icmpge       101
        //    25: aload_3        
        //    26: iload           5
        //    28: aaload         
        //    29: astore          6
        //    31: iload           7
        //    33: ifne            96
        //    36: aload_1        
        //    37: aload           6
        //    39: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    44: iload           7
        //    46: ifne            102
        //    49: goto            53
        //    52: athrow         
        //    53: ifeq            93
        //    56: goto            60
        //    59: athrow         
        //    60: iload_2        
        //    61: iload_0        
        //    62: iload           7
        //    64: ifne            87
        //    67: goto            71
        //    70: athrow         
        //    71: ifeq            90
        //    74: goto            78
        //    77: athrow         
        //    78: aload           6
        //    80: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //    83: goto            87
        //    86: athrow         
        //    87: goto            91
        //    90: iconst_1       
        //    91: iadd           
        //    92: istore_2       
        //    93: iinc            5, 1
        //    96: iload           7
        //    98: ifeq            18
        //   101: iload_2        
        //   102: ireturn        
        //    Signature:
        //  (ZLorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/Item;>;)I
        //    StackMapTable: 00 11 FF 00 12 00 08 01 07 00 BC 01 07 00 3E 01 01 00 01 00 00 FF 00 21 00 08 01 07 00 BC 01 07 00 3E 01 01 07 00 35 01 00 01 07 01 2F 40 01 45 07 01 2F 00 49 07 01 2F FF 00 00 00 08 01 07 00 BC 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 45 07 01 2F 40 01 47 07 01 2F FF 00 00 00 08 01 07 00 BC 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 42 01 FF 00 00 00 08 01 07 00 BC 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 01 02 FF 00 04 00 08 01 07 00 BC 01 07 00 3E 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  71     83     86     87     Ljava/lang/RuntimeException;
        //  60     74     77     78     Ljava/lang/RuntimeException;
        //  53     67     70     71     Ljava/lang/RuntimeException;
        //  36     56     59     60     Ljava/lang/RuntimeException;
        //  31     49     52     53     Ljava/lang/RuntimeException;
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
    
    public static int getItemCount(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: iconst_0       
        //     6: istore_1       
        //     7: invokestatic    org/powerbot/game/api/methods/widget/DepositBox.getItems:()[Lorg/powerbot/game/api/wrappers/node/Item;
        //    10: astore_2       
        //    11: aload_2        
        //    12: arraylength    
        //    13: istore_3       
        //    14: iconst_0       
        //    15: istore          4
        //    17: iload           4
        //    19: iload_3        
        //    20: if_icmpge       75
        //    23: aload_2        
        //    24: iload           4
        //    26: aaload         
        //    27: astore          5
        //    29: iload_1        
        //    30: iload           6
        //    32: ifne            76
        //    35: iload_0        
        //    36: iload           6
        //    38: ifne            61
        //    41: goto            45
        //    44: athrow         
        //    45: ifeq            64
        //    48: goto            52
        //    51: athrow         
        //    52: aload           5
        //    54: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //    57: goto            61
        //    60: athrow         
        //    61: goto            65
        //    64: iconst_1       
        //    65: iadd           
        //    66: istore_1       
        //    67: iinc            4, 1
        //    70: iload           6
        //    72: ifeq            17
        //    75: iload_1        
        //    76: ireturn        
        //    StackMapTable: 00 0B FF 00 11 00 07 01 01 07 00 3E 01 01 00 01 00 00 FF 00 1A 00 07 01 01 07 00 3E 01 01 07 00 35 01 00 01 07 01 2F FF 00 00 00 07 01 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 45 07 01 2F 40 01 47 07 01 2F FF 00 00 00 07 01 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 42 01 FF 00 00 00 07 01 01 07 00 3E 01 01 07 00 35 01 00 02 01 01 FF 00 09 00 07 01 01 07 00 3E 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  45     57     60     61     Ljava/lang/RuntimeException;
        //  35     48     51     52     Ljava/lang/RuntimeException;
        //  29     41     44     45     Ljava/lang/RuntimeException;
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
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "U\u0019p\u0018_";
        int n6 = -1;
        String intern = null;
    Label_0076_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0149: {
                    if (n7 > 1) {
                        break Label_0149;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\u000b';
                                break;
                            }
                            case 1: {
                                c2 = 'A';
                                break;
                            }
                            case 2: {
                                c2 = '\u0002';
                                break;
                            }
                            case 3: {
                                c2 = '_';
                                break;
                            }
                            default: {
                                c2 = '\'';
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
                    s = "qnLzj(\u000be";
                    n6 = 0;
                    continue Label_0076_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "R\u0010o\u0004IV(\u001b\u0003\u007fz";
                    n6 = 1;
                    continue Label_0076_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "\u0005\u001a8\u000e\u001e\\\u007f\u0011M";
                    n6 = 2;
                    continue Label_0076_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\u0005\u001a8\u000e\u001e\\\u007f";
                    n6 = 3;
                    continue Label_0076_Outer;
                }
                case 3: {
                    break Label_0076_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
        DEPOSIT_BOX_IDS = new int[] { 2045, 2133, 6396, 6402, 6404, 6417, 6418, 6453, 6457, 6478, 6836, 9398, 15985, 20228, 24995, 25937, 26969, 32924, 32930, 32931, 34755, 36788, 39830, 45079, 66668, 70512, 73268 };
    }
}
