
package org.powerbot.game.api.methods.tab;

import org.powerbot.game.api.wrappers.Identifiable;
import java.util.LinkedList;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.util.Filter;

public class Inventory
{
    public static final int WIDGET = 679;
    public static final int WIDGET_BANK = 763;
    public static final int WIDGET_PRICE_CHECK = 204;
    public static final int WIDGET_EQUIPMENT_BONUSES = 670;
    public static final int WIDGET_EXCHANGE = 644;
    public static final int WIDGET_SHOP = 621;
    public static final int WIDGET_DUNGEONEERING_SHOP = 957;
    public static final int WIDGET_BEAST_OF_BURDEN_STORAGE = 665;
    public static final int WIDGET_STORE = 1266;
    public static final int WIDGET_SAWMILL_CART = 771;
    public static final int[] ALT_WIDGETS;
    public static final Filter<Item> ALL_FILTER;
    public static int a;
    private static final String[] z;
    
    public static boolean contains(final int... array) {
        try {
            final int count;
            final int n = count = getCount((boolean)(0 != 0), array);
            if (Inventory.a != 0) {
                return count != 0;
            }
            if (n <= 0) {
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        int count = 1;
        return count != 0;
        count = 0;
        return count != 0;
    }
    
    public static boolean containsAll(final int... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: astore_1       
        //     7: aload_1        
        //     8: arraylength    
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iload_3        
        //    13: iload_2        
        //    14: if_icmpge       65
        //    17: aload_1        
        //    18: iload_3        
        //    19: iaload         
        //    20: istore          4
        //    22: iload           5
        //    24: ifne            60
        //    27: iconst_1       
        //    28: iload           5
        //    30: ifne            66
        //    33: goto            37
        //    36: athrow         
        //    37: newarray        I
        //    39: dup            
        //    40: iconst_0       
        //    41: iload           4
        //    43: iastore        
        //    44: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    47: ifnonnull       57
        //    50: goto            54
        //    53: athrow         
        //    54: iconst_0       
        //    55: ireturn        
        //    56: athrow         
        //    57: iinc            3, 1
        //    60: iload           5
        //    62: ifeq            12
        //    65: iconst_1       
        //    66: ireturn        
        //    StackMapTable: 00 0A FF 00 0C 00 06 07 01 22 07 01 22 01 01 00 01 00 00 FF 00 17 00 06 07 01 22 07 01 22 01 01 01 01 00 01 07 01 11 40 01 4F 07 01 11 00 41 07 01 11 00 02 FF 00 04 00 06 07 01 22 07 01 22 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  37     56     56     57     Ljava/lang/RuntimeException;
        //  27     50     53     54     Ljava/lang/RuntimeException;
        //  22     33     36     37     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0037:
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
    
    @Deprecated
    public static boolean containsOneOf(final int... array) {
        return contains(array);
    }
    
    public static void dragItem(final int n, final int n2) {
        dragItem(getItem(n), n2);
    }
    
    public static void dragItem(final Item p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: ifnull          155
        //     9: iload_1        
        //    10: iload           5
        //    12: ifne            27
        //    15: goto            19
        //    18: athrow         
        //    19: iflt            155
        //    22: goto            26
        //    25: athrow         
        //    26: iload_1        
        //    27: iload           5
        //    29: ifne            48
        //    32: bipush          27
        //    34: if_icmpgt       155
        //    37: goto            41
        //    40: athrow         
        //    41: invokestatic    org/powerbot/game/api/methods/tab/Inventory.isItemSelected:()Z
        //    44: goto            48
        //    47: athrow         
        //    48: iload           5
        //    50: ifne            82
        //    53: ifeq            81
        //    56: goto            60
        //    59: athrow         
        //    60: aconst_null    
        //    61: invokestatic    org/powerbot/game/api/methods/tab/Inventory.selectItem:(Lorg/powerbot/game/api/wrappers/node/Item;)Z
        //    64: iload           5
        //    66: ifne            82
        //    69: goto            73
        //    72: athrow         
        //    73: ifne            81
        //    76: goto            80
        //    79: athrow         
        //    80: return         
        //    81: iconst_0       
        //    82: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getWidget:(Z)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    85: iload_1        
        //    86: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    89: astore_2       
        //    90: aload_2        
        //    91: iload           5
        //    93: ifne            105
        //    96: ifnonnull       104
        //    99: goto            103
        //   102: athrow         
        //   103: return         
        //   104: aload_2        
        //   105: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundingRectangle:()Ljava/awt/Rectangle;
        //   108: astore_3       
        //   109: aload_0        
        //   110: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   113: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundingRectangle:()Ljava/awt/Rectangle;
        //   116: astore          4
        //   118: aload_3        
        //   119: aload           4
        //   121: invokevirtual   java/awt/Rectangle.contains:(Ljava/awt/Rectangle;)Z
        //   124: iload           5
        //   126: ifne            147
        //   129: ifeq            137
        //   132: goto            136
        //   135: athrow         
        //   136: return         
        //   137: aload_0        
        //   138: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   141: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getNextViewportPoint:()Ljava/awt/Point;
        //   144: invokestatic    org/powerbot/game/api/methods/input/Mouse.move:(Ljava/awt/Point;)Z
        //   147: pop            
        //   148: aload_2        
        //   149: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getNextViewportPoint:()Ljava/awt/Point;
        //   152: invokestatic    org/powerbot/game/api/methods/input/Mouse.drag:(Ljava/awt/Point;)V
        //   155: return         
        //    StackMapTable: 00 1A FF 00 12 00 06 07 00 10 01 00 00 00 01 00 01 07 01 11 40 01 45 07 01 11 00 40 01 4C 07 01 11 00 45 07 01 11 40 01 4A 07 01 11 00 4B 07 01 11 40 01 45 07 01 11 00 00 40 01 FF 00 13 00 06 07 00 10 01 07 00 93 00 00 01 00 01 07 01 11 00 00 40 07 00 93 FF 00 1D 00 06 07 00 10 01 07 00 93 07 00 97 07 00 97 01 00 01 07 01 11 00 00 49 01 FF 00 07 00 06 07 00 10 01 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  118    132    135    136    Ljava/lang/RuntimeException;
        //  90     99     102    103    Ljava/lang/RuntimeException;
        //  60     76     79     80     Ljava/lang/RuntimeException;
        //  53     69     72     73     Ljava/lang/RuntimeException;
        //  48     56     59     60     Ljava/lang/RuntimeException;
        //  32     44     47     48     Ljava/lang/RuntimeException;
        //  27     37     40     41     Ljava/lang/RuntimeException;
        //  9      22     25     26     Ljava/lang/RuntimeException;
        //  5      15     18     19     Ljava/lang/RuntimeException;
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
    
    public static Item[] getAllItems(final boolean b) {
        final int a = Inventory.a;
        final Item[] array = new Item[28];
        final WidgetChild widget = getWidget(b);
        Item[] array3 = null;
        Label_0128: {
            WidgetChild widgetChild = null;
            Label_0030: {
                try {
                    widgetChild = widget;
                    if (a != 0) {
                        break Label_0030;
                    }
                    if (widgetChild == null) {
                        break Label_0128;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            final WidgetChild[] children = widgetChild.getChildren();
            int length = 0;
            Label_0050: {
                int n;
                try {
                    n = (length = children.length);
                    if (a != 0) {
                        break Label_0050;
                    }
                    final Item[] array2 = array;
                    final int n2 = array2.length;
                    if (n >= n2) {
                        break Label_0050;
                    }
                    break Label_0128;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    final Item[] array2 = array;
                    final int n2 = array2.length;
                    if (n < n2) {
                        break Label_0128;
                    }
                    length = 0;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            int i = length;
            while (i < array.length) {
                final WidgetChild widgetChild2 = children[i];
                int n3 = 0;
                Item item = null;
                Label_0119: {
                    Label_0105: {
                        Label_0089: {
                            try {
                                array3 = array;
                                if (a != 0) {
                                    return array3;
                                }
                                n3 = i;
                                final WidgetChild widgetChild4;
                                final WidgetChild widgetChild3 = widgetChild4 = widgetChild2;
                                final int n4 = a;
                                if (n4 == 0) {
                                    break Label_0089;
                                }
                                break Label_0105;
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                            try {
                                n3 = i;
                                final WidgetChild widgetChild4;
                                final WidgetChild widgetChild3 = widgetChild4 = widgetChild2;
                                final int n4 = a;
                                if (n4 != 0) {
                                    break Label_0105;
                                }
                                if (widgetChild4 == null) {
                                    break Label_0105;
                                }
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        final WidgetChild widgetChild3 = widgetChild2;
                        try {
                            if (widgetChild3.getChildId() == -1) {
                                item = null;
                                break Label_0119;
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    item = new Item(widgetChild2);
                }
                array3[n3] = item;
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
        return array3;
    }
    
    public static int getCount() {
        return getItems().length;
    }
    
    public static int getCount(final boolean b) {
        return getCount(b, Inventory.ALL_FILTER);
    }
    
    public static int getCount(final Filter<Item> filter) {
        return getCount(false, filter);
    }
    
    public static int getCount(final int... array) {
        return getCount(false, array);
    }
    
    public static int getCount(final boolean b, final int... array) {
        return getCount(b, new Filter<Item>() {
            @Override
            public boolean accept(final Item p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/api/methods/tab/Inventory$2.val$ids:[I
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
    
    public static int getCount(final boolean p0, final Filter<Item> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aload_1        
        //     8: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItems:(Lorg/powerbot/game/api/util/Filter;)[Lorg/powerbot/game/api/wrappers/node/Item;
        //    11: astore_3       
        //    12: aload_3        
        //    13: arraylength    
        //    14: istore          4
        //    16: iconst_0       
        //    17: istore          5
        //    19: iload           5
        //    21: iload           4
        //    23: if_icmpge       78
        //    26: aload_3        
        //    27: iload           5
        //    29: aaload         
        //    30: astore          6
        //    32: iload_2        
        //    33: iload           7
        //    35: ifne            79
        //    38: iload_0        
        //    39: iload           7
        //    41: ifne            64
        //    44: goto            48
        //    47: athrow         
        //    48: ifeq            67
        //    51: goto            55
        //    54: athrow         
        //    55: aload           6
        //    57: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //    60: goto            64
        //    63: athrow         
        //    64: goto            68
        //    67: iconst_1       
        //    68: iadd           
        //    69: istore_2       
        //    70: iinc            5, 1
        //    73: iload           7
        //    75: ifeq            19
        //    78: iload_2        
        //    79: ireturn        
        //    Signature:
        //  (ZLorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/Item;>;)I
        //    StackMapTable: 00 0B FF 00 13 00 08 01 07 00 AA 01 07 00 25 01 01 00 01 00 00 FF 00 1B 00 08 01 07 00 AA 01 07 00 25 01 01 07 00 10 01 00 01 07 01 11 FF 00 00 00 08 01 07 00 AA 01 07 00 25 01 01 07 00 10 01 00 02 01 01 45 07 01 11 40 01 47 07 01 11 FF 00 00 00 08 01 07 00 AA 01 07 00 25 01 01 07 00 10 01 00 02 01 01 42 01 FF 00 00 00 08 01 07 00 AA 01 07 00 25 01 01 07 00 10 01 00 02 01 01 FF 00 09 00 08 01 07 00 AA 01 07 00 25 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  48     60     63     64     Ljava/lang/RuntimeException;
        //  38     51     54     55     Ljava/lang/RuntimeException;
        //  32     44     47     48     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
        final int i = Inventory.a;
        final Item[] items = getItems(false);
        final int length = items.length;
        int n = 0;
        do {
            int j = 0;
            int n2 = 0;
        Label_0021:
            while (j < n2) {
                final Item item = items[n];
                final int id = item.getId();
                final int length2 = array.length;
                int k = 0;
                while (k < length2) {
                    final int n3 = array[k];
                    Label_0090: {
                        try {
                            if (i != 0) {
                                break Label_0090;
                            }
                            j = id;
                            n2 = n3;
                            if (i != 0) {
                                continue Label_0021;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (j == n2) {
                                return item;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                        ++k;
                    }
                    if (i != 0) {
                        break;
                    }
                }
                ++n;
                continue Label_0021;
            }
            break;
        } while (i == 0);
        return null;
    }
    
    public static Item getItem(final Filter<Item> filter) {
        final int a = Inventory.a;
        final Item[] items = getItems(false);
        final int length = items.length;
        int i = 0;
        while (i < length) {
            final Item item = items[i];
            Label_0057: {
                Label_0054: {
                    try {
                        if (a != 0) {
                            break Label_0057;
                        }
                        final Filter<Item> filter2 = filter;
                        final Item item2 = item;
                        final boolean b = filter2.accept(item2);
                        if (b) {
                            return item;
                        }
                        break Label_0054;
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
    
    public static Item getItemAt(final int n) {
        return getAllItems(false)[n];
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
    
    public static Item[] getItems(final boolean b, final Filter<Item> filter) {
        final int a = Inventory.a;
        final WidgetChild widget = getWidget(b);
        int length = 0;
        Label_0166: {
            WidgetChild widgetChild = null;
            Label_0024: {
                try {
                    widgetChild = widget;
                    if (a != 0) {
                        break Label_0024;
                    }
                    if (widgetChild == null) {
                        break Label_0166;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            final WidgetChild[] children = widgetChild.getChildren();
            try {
                length = children.length;
                if (a != 0) {
                    return new Item[length];
                }
                if (length <= 27) {
                    break Label_0166;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            final LinkedList<Item> list = new LinkedList<Item>();
            int i = 0;
            while (i < 28) {
                final Identifiable[] array2;
                final WidgetChild[] array = (WidgetChild[])(array2 = children);
                if (a != 0) {
                    return (Item[])array2;
                }
                final WidgetChild widgetChild2 = array[i];
                Label_0140: {
                    Label_0137: {
                        try {
                            if (a != 0) {
                                break Label_0140;
                            }
                            if (widgetChild2.getChildId() == -1) {
                                break Label_0137;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        final Item item = new Item(widgetChild2);
                        Label_0123: {
                            try {
                                if (a != 0) {
                                    break Label_0140;
                                }
                                final Filter<Item> filter2 = filter;
                                final Item item2 = item;
                                final boolean b2 = filter2.accept(item2);
                                if (b2) {
                                    break Label_0123;
                                }
                                break Label_0137;
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                            try {
                                final Filter<Item> filter2 = filter;
                                final Item item2 = item;
                                final boolean b2 = filter2.accept(item2);
                                if (b2) {
                                    list.add(item);
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
            Identifiable[] array2 = list.toArray(new Item[list.size()]);
            return (Item[])array2;
        }
        return new Item[length];
    }
    
    public static Item getSelectedItem() {
        final int selectedItemIndex = getSelectedItemIndex();
        Label_0019: {
            int n;
            try {
                final int n2;
                n = (n2 = selectedItemIndex);
                if (Inventory.a != 0) {
                    return getItemAt(n2);
                }
                final int n3 = -1;
                if (n == n3) {
                    break Label_0019;
                }
                break Label_0019;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n3 = -1;
                if (n == n3) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        int n2 = selectedItemIndex;
        return getItemAt(n2);
    }
    
    public static int getSelectedItemIndex() {
        final int a = Inventory.a;
        final Item[] allItems = getAllItems(false);
        int i = 0;
        while (i < allItems.length) {
            final Item item = allItems[i];
            Label_0061: {
                int borderThickness = 0;
                Label_0055: {
                    int n = 0;
                    Label_0037: {
                        Item item2 = null;
                        Label_0036: {
                            try {
                                item2 = item;
                                if (a != 0) {
                                    break Label_0037;
                                }
                                if (item2 != null) {
                                    break Label_0036;
                                }
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            break Label_0061;
                        }
                        try {
                            n = (borderThickness = item2.getWidgetChild().getBorderThickness());
                            if (a != 0) {
                                return borderThickness;
                            }
                            final int n2 = 2;
                            if (n == n2) {
                                break Label_0055;
                            }
                            break Label_0061;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        final int n2 = 2;
                        if (n != n2) {
                            break Label_0061;
                        }
                        borderThickness = i;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                return borderThickness;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return -1;
    }
    
    public static WidgetChild getWidget(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: getstatic       org/powerbot/game/api/methods/tab/Inventory.ALT_WIDGETS:[I
        //     8: astore_1       
        //     9: aload_1        
        //    10: arraylength    
        //    11: istore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: iload_3        
        //    15: iload_2        
        //    16: if_icmpge       93
        //    19: aload_1        
        //    20: iload_3        
        //    21: iaload         
        //    22: istore          4
        //    24: iload           4
        //    26: iconst_0       
        //    27: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    30: astore          5
        //    32: iload           6
        //    34: ifne            88
        //    37: aload           5
        //    39: iload           6
        //    41: ifne            125
        //    44: goto            48
        //    47: athrow         
        //    48: ifnull          85
        //    51: goto            55
        //    54: athrow         
        //    55: aload           5
        //    57: iload           6
        //    59: ifne            84
        //    62: goto            66
        //    65: athrow         
        //    66: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteX:()I
        //    69: bipush          50
        //    71: if_icmple       85
        //    74: goto            78
        //    77: athrow         
        //    78: aload           5
        //    80: goto            84
        //    83: athrow         
        //    84: areturn        
        //    85: iinc            3, 1
        //    88: iload           6
        //    90: ifeq            14
        //    93: iload_0        
        //    94: iload           6
        //    96: ifne            121
        //    99: ifne            118
        //   102: goto            106
        //   105: athrow         
        //   106: getstatic       org/powerbot/game/api/methods/Tabs.INVENTORY:Lorg/powerbot/game/api/methods/Tabs;
        //   109: iconst_0       
        //   110: invokevirtual   org/powerbot/game/api/methods/Tabs.open:(Z)Z
        //   113: pop            
        //   114: goto            118
        //   117: athrow         
        //   118: sipush          679
        //   121: iconst_0       
        //   122: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   125: areturn        
        //    StackMapTable: 00 14 FF 00 0E 00 07 01 07 01 22 01 01 00 00 01 00 00 FF 00 20 00 07 01 07 01 22 01 01 01 07 00 93 01 00 01 07 01 11 40 07 00 93 45 07 01 11 00 49 07 01 11 40 07 00 93 4A 07 01 11 00 44 07 01 11 40 07 00 93 00 02 FF 00 04 00 07 01 07 01 22 01 01 00 00 01 00 00 4B 07 01 11 00 4A 07 01 11 00 42 01 43 07 00 93
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  99     114    117    118    Ljava/lang/RuntimeException;
        //  93     102    105    106    Ljava/lang/RuntimeException;
        //  66     80     83     84     Ljava/lang/RuntimeException;
        //  55     74     77     78     Ljava/lang/RuntimeException;
        //  48     62     65     66     Ljava/lang/RuntimeException;
        //  37     51     54     55     Ljava/lang/RuntimeException;
        //  32     44     47     48     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0048:
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
    
    public static int indexOf(final int... array) {
        return indexOf(false, array);
    }
    
    public static int indexOf(final boolean b, final int... array) {
        final int i = Inventory.a;
        final Item[] allItems = getAllItems(b);
        int n = 0;
        do {
            Label_0012: {
                final int length = allItems.length;
            }
            int j = 0;
            int n2 = 0;
            Label_0015:
            while (j < n2) {
                final Item item = allItems[n];
                Label_0037: {
                    Item item2 = null;
                    Label_0042: {
                        Label_0040: {
                            try {
                                item2 = item;
                                if (i != 0) {
                                    break Label_0042;
                                }
                                if (item2 != null) {
                                    break Label_0040;
                                }
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            break Label_0037;
                        }
                    }
                    final int id = item2.getId();
                    final int length2 = array.length;
                    int k = 0;
                    while (k < length2) {
                        final int n3 = array[k];
                        Label_0099: {
                            try {
                                if (i != 0) {
                                    break Label_0099;
                                }
                                j = id;
                                n2 = n3;
                                if (i != 0) {
                                    continue Label_0015;
                                }
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                            try {
                                if (j == n2) {
                                    return n;
                                }
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                            ++k;
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                }
                ++n;
                continue Label_0012;
            }
            break;
        } while (i == 0);
        return -1;
    }
    
    public static int indexOf(final String s) {
        return indexOf(false, s);
    }
    
    public static int indexOf(final boolean b, final String s) {
        final int a = Inventory.a;
        Label_0019: {
            try {
                final String s2 = s;
                if (a != 0) {
                    break Label_0019;
                }
                if (s == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final String s2 = s;
            try {
                final int empty;
                final boolean b2 = (empty = (s2.isEmpty() ? 1 : 0)) != 0;
                if (a != 0) {
                    return empty;
                }
                if (b2) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Item[] allItems = getAllItems(b);
        int i = 0;
        while (i < allItems.length) {
            final Item item = allItems[i];
            Label_0084: {
                try {
                    if (item == null) {
                        break Label_0084;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    final int equalsIgnoreCase;
                    final boolean b3 = (equalsIgnoreCase = (s.equalsIgnoreCase(item.getName()) ? 1 : 0)) != 0;
                    if (a != 0) {
                        return equalsIgnoreCase;
                    }
                    if (!b3) {
                        break Label_0084;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
                return i;
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return -1;
    }
    
    public static boolean isFull() {
        int count = 0;
        Label_0018: {
            int n;
            try {
                n = (count = getCount());
                if (Inventory.a != 0) {
                    return count != 0;
                }
                final int n2 = 28;
                if (n == n2) {
                    break Label_0018;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = 28;
                if (n != n2) {
                    return false;
                }
                count = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return count != 0;
        count = 0;
        return count != 0;
    }
    
    public static boolean isItemSelected() {
        int selectedItemIndex = 0;
        Label_0017: {
            int n;
            try {
                n = (selectedItemIndex = getSelectedItemIndex());
                if (Inventory.a != 0) {
                    return selectedItemIndex != 0;
                }
                final int n2 = -1;
                if (n != n2) {
                    break Label_0017;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = -1;
                if (n == n2) {
                    return false;
                }
                selectedItemIndex = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return selectedItemIndex != 0;
        selectedItemIndex = 0;
        return selectedItemIndex != 0;
    }
    
    public static boolean selectItem(final int n) {
        return selectItem(getItem(n));
    }
    
    public static boolean selectItem(final Item p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getSelectedItem:()Lorg/powerbot/game/api/wrappers/node/Item;
        //     7: astore_1       
        //     8: aload_1        
        //     9: iload_2        
        //    10: ifne            86
        //    13: ifnull          85
        //    16: goto            20
        //    19: athrow         
        //    20: aload_1        
        //    21: aload_0        
        //    22: invokevirtual   org/powerbot/game/api/wrappers/node/Item.equals:(Ljava/lang/Object;)Z
        //    25: iload_2        
        //    26: ifne            62
        //    29: goto            33
        //    32: athrow         
        //    33: ifeq            43
        //    36: goto            40
        //    39: athrow         
        //    40: iconst_1       
        //    41: ireturn        
        //    42: athrow         
        //    43: aload_1        
        //    44: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    47: getstatic       org/powerbot/game/api/methods/tab/Inventory.z:[Ljava/lang/String;
        //    50: iconst_0       
        //    51: aaload         
        //    52: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    55: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //    58: pop            
        //    59: sipush          500
        //    62: sipush          700
        //    65: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //    68: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getSelectedItem:()Lorg/powerbot/game/api/wrappers/node/Item;
        //    71: iload_2        
        //    72: ifne            86
        //    75: ifnull          85
        //    78: goto            82
        //    81: athrow         
        //    82: iconst_0       
        //    83: ireturn        
        //    84: athrow         
        //    85: aload_0        
        //    86: iload_2        
        //    87: ifne            126
        //    90: ifnonnull       100
        //    93: goto            97
        //    96: athrow         
        //    97: iconst_1       
        //    98: ireturn        
        //    99: athrow         
        //   100: aload_0        
        //   101: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   104: getstatic       org/powerbot/game/api/methods/tab/Inventory.z:[Ljava/lang/String;
        //   107: iconst_1       
        //   108: aaload         
        //   109: invokestatic    org/powerbot/core/bot/handlers/ScriptHandler.e:(Ljava/lang/String;)Ljava/lang/String;
        //   112: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   115: pop            
        //   116: sipush          500
        //   119: sipush          700
        //   122: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   125: aload_0        
        //   126: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getSelectedItem:()Lorg/powerbot/game/api/wrappers/node/Item;
        //   129: invokevirtual   org/powerbot/game/api/wrappers/node/Item.equals:(Ljava/lang/Object;)Z
        //   132: ireturn        
        //    StackMapTable: 00 13 FF 00 13 00 03 07 00 10 07 00 10 01 00 01 07 01 11 00 4B 07 01 11 40 01 45 07 01 11 00 41 07 01 11 00 52 01 52 07 01 11 00 41 07 01 11 00 40 07 00 10 49 07 01 11 00 41 07 01 11 00 59 07 00 10
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  90     99     99     100    Ljava/lang/RuntimeException;
        //  86     93     96     97     Ljava/lang/RuntimeException;
        //  75     84     84     85     Ljava/lang/RuntimeException;
        //  62     78     81     82     Ljava/lang/RuntimeException;
        //  33     42     42     43     Ljava/lang/RuntimeException;
        //  20     36     39     40     Ljava/lang/RuntimeException;
        //  13     29     32     33     Ljava/lang/RuntimeException;
        //  8      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\u0011\u007f<";
        int n3 = -1;
        String intern = null;
    Label_0046_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0122: {
                    if (n4 > 1) {
                        break Label_0122;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = 'h';
                                break;
                            }
                            case 1: {
                                c2 = '\u000b';
                                break;
                            }
                            case 2: {
                                c2 = 'u';
                                break;
                            }
                            case 3: {
                                c2 = 'b';
                                break;
                            }
                            default: {
                                c2 = '\"';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "c'N";
                    n3 = 0;
                    continue Label_0046_Outer;
                }
                case 0: {
                    break Label_0046_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
        ALT_WIDGETS = new int[] { 763, 204, 670, 644, 621, 957, 665, 1266, 771 };
        ALL_FILTER = new Filter<Item>() {
            @Override
            public boolean accept(final Item item) {
                return true;
            }
        };
    }
}
