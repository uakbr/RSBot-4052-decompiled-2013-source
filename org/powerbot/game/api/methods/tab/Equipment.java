
package org.powerbot.game.api.methods.tab;

import org.powerbot.core.script.wrappers.Component;
import org.powerbot.a;
import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.methods.widget.Bank;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.node.Item;

public class Equipment
{
    public static final int WIDGET = 387;
    public static final int WIDGET_BANK = 667;
    public static final int COMPONENT_EQUIP_INVENTORY = 9;
    public static final int NUM_APPEARANCE_SLOTS = 9;
    public static final int NUM_SLOTS = 13;
    private static final String[] z;
    
    public static boolean appearanceContainsAll(final int... array) {
        final int i = Inventory.a;
        final int[] appearanceIds = getAppearanceIds();
        final int length = array.length;
        int n = 0;
        int n5 = 0;
        do {
            int j = 0;
            int n2 = 0;
        Label_0020:
            while (j < n2) {
                final int n3 = array[n];
                int n4 = 0;
                final int[] array2 = appearanceIds;
                final int length2 = array2.length;
                n5 = 0;
                if (i == 0) {
                    int k = n5;
                    while (k < length2) {
                        final int n6 = array2[k];
                        Label_0098: {
                            try {
                                if (i != 0) {
                                    break Label_0098;
                                }
                                j = n6;
                                n2 = n3;
                                if (i != 0) {
                                    continue Label_0020;
                                }
                            }
                            catch (IndexOutOfBoundsException ex) {
                                throw ex;
                            }
                            Label_0091: {
                                if (j != n2) {
                                    break Label_0091;
                                }
                                n4 = 1;
                                try {
                                    if (i == 0) {
                                        break;
                                    }
                                    ++k;
                                }
                                catch (IndexOutOfBoundsException ex2) {
                                    throw ex2;
                                }
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    int n7 = 0;
                    Label_0117: {
                        Label_0119: {
                            try {
                                n7 = n4;
                                if (i != 0) {
                                    return n7 != 0;
                                }
                                if (n7 != 0) {
                                    break Label_0119;
                                }
                            }
                            catch (IndexOutOfBoundsException ex3) {
                                throw ex3;
                            }
                            break Label_0117;
                        }
                        ++n;
                        continue Label_0020;
                    }
                    return n7 != 0;
                }
                return n5 != 0;
            }
            break;
        } while (i == 0);
        return n5 != 0;
    }
    
    public static boolean appearanceContainsOneOf(final int... array) {
        final int i = Inventory.a;
        final int[] appearanceIds = getAppearanceIds();
        final int length = appearanceIds.length;
        int n = 0;
        int n4 = 0;
        do {
            int j = 0;
            int n2 = 0;
        Label_0016:
            while (j < n2) {
                final int n3 = appearanceIds[n];
                final int length2 = array.length;
                n4 = 0;
                if (i == 0) {
                    int k = n4;
                    while (k < length2) {
                        final int n5 = array[k];
                        Label_0081: {
                            try {
                                if (i != 0) {
                                    break Label_0081;
                                }
                                j = n5;
                                n2 = n3;
                                if (i != 0) {
                                    continue Label_0016;
                                }
                            }
                            catch (IndexOutOfBoundsException ex) {
                                throw ex;
                            }
                            try {
                                if (j == n2) {
                                    return true;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            ++k;
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    ++n;
                    continue Label_0016;
                }
                return n4 != 0;
            }
            break;
        } while (i == 0);
        return n4 != 0;
    }
    
    public static boolean containsAll(final int... array) {
        final int i = Inventory.a;
        final Item[] items = getItems();
        final int length = items.length;
        int n = 0;
        do {
            int j = 0;
            int n2 = 0;
        Label_0020:
            while (j < n2) {
                final Item item = items[n];
                Label_0130: {
                    try {
                        if (item == null) {
                            break Label_0130;
                        }
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw ex;
                    }
                    int n3 = 0;
                    final int id = item.getId();
                    final int length2 = array.length;
                    int k = 0;
                    while (k < length2) {
                        final int n4 = array[k];
                        Label_0109: {
                            try {
                                if (i != 0) {
                                    break Label_0109;
                                }
                                j = id;
                                n2 = n4;
                                if (i != 0) {
                                    continue Label_0020;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            Label_0102: {
                                if (j != n2) {
                                    break Label_0102;
                                }
                                n3 = 1;
                                try {
                                    if (i == 0) {
                                        break;
                                    }
                                    ++k;
                                }
                                catch (IndexOutOfBoundsException ex3) {
                                    throw ex3;
                                }
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    int n5;
                    try {
                        n5 = n3;
                        if (i != 0) {
                            return n5 != 0;
                        }
                        if (n5 != 0) {
                            break Label_0130;
                        }
                    }
                    catch (IndexOutOfBoundsException ex4) {
                        throw ex4;
                    }
                    return n5 != 0;
                }
                ++n;
                continue Label_0020;
            }
            break;
        } while (i == 0);
        return true;
    }
    
    public static boolean containsOneOf(final int... array) {
        final int i = Inventory.a;
        final Item[] items = getItems();
        final int length = items.length;
        int n = 0;
        int n3 = 0;
        do {
            int j = 0;
            int n2 = 0;
        Label_0016:
            while (j < n2) {
                final int id = items[n].getId();
                final int length2 = array.length;
                n3 = 0;
                if (i == 0) {
                    int k = n3;
                    while (k < length2) {
                        final int n4 = array[k];
                        Label_0088: {
                            try {
                                if (i != 0) {
                                    break Label_0088;
                                }
                                j = id;
                                n2 = n4;
                                if (i != 0) {
                                    continue Label_0016;
                                }
                            }
                            catch (IndexOutOfBoundsException ex) {
                                throw ex;
                            }
                            try {
                                if (j == n2) {
                                    return true;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            ++k;
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    ++n;
                    continue Label_0016;
                }
                return n3 != 0;
            }
            break;
        } while (i == 0);
        return n3 != 0;
    }
    
    public static int getAppearanceId(final Slot p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getAppearanceIndex:()I
        //     8: iload_3        
        //     9: ifne            25
        //    12: iconst_m1      
        //    13: if_icmpne       26
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_m1      
        //    21: goto            25
        //    24: athrow         
        //    25: ireturn        
        //    26: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    29: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getAppearance:()[I
        //    32: astore_1       
        //    33: aload_1        
        //    34: aload_0        
        //    35: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getAppearanceIndex:()I
        //    38: iaload         
        //    39: istore_2       
        //    40: iload_2        
        //    41: iload_3        
        //    42: ifne            80
        //    45: ifgt            79
        //    48: goto            52
        //    51: athrow         
        //    52: aload_0        
        //    53: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getSheathedAppearanceIndex:()I
        //    56: iload_3        
        //    57: ifne            80
        //    60: goto            64
        //    63: athrow         
        //    64: iconst_m1      
        //    65: if_icmpeq       79
        //    68: goto            72
        //    71: athrow         
        //    72: aload_1        
        //    73: aload_0        
        //    74: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getSheathedAppearanceIndex:()I
        //    77: iaload         
        //    78: istore_2       
        //    79: iload_2        
        //    80: iload_3        
        //    81: ifne            92
        //    84: ifle            95
        //    87: goto            91
        //    90: athrow         
        //    91: iload_2        
        //    92: goto            96
        //    95: iconst_m1      
        //    96: ireturn        
        //    StackMapTable: 00 12 FF 00 13 00 04 07 00 2A 00 00 01 00 01 07 00 16 00 43 07 00 16 40 01 00 FF 00 18 00 04 07 00 2A 07 00 DE 01 01 00 01 07 00 16 00 4A 07 00 16 40 01 46 07 00 16 00 06 40 01 49 07 00 16 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  80     87     90     91     Ljava/lang/IndexOutOfBoundsException;
        //  52     68     71     72     Ljava/lang/IndexOutOfBoundsException;
        //  45     60     63     64     Ljava/lang/IndexOutOfBoundsException;
        //  40     48     51     52     Ljava/lang/IndexOutOfBoundsException;
        //  12     21     24     25     Ljava/lang/IndexOutOfBoundsException;
        //  4      16     19     20     Ljava/lang/IndexOutOfBoundsException;
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
    
    public static int[] getAppearanceIds() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: bipush          9
        //     7: newarray        I
        //     9: astore_0       
        //    10: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    13: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getAppearance:()[I
        //    16: astore_1       
        //    17: invokestatic    org/powerbot/game/api/methods/tab/Equipment$Slot.values:()[Lorg/powerbot/game/api/methods/tab/Equipment$Slot;
        //    20: astore_2       
        //    21: iconst_0       
        //    22: istore_3       
        //    23: iload_3        
        //    24: aload_0        
        //    25: arraylength    
        //    26: if_icmpge       131
        //    29: aload_1        
        //    30: iload           6
        //    32: ifne            132
        //    35: aload_2        
        //    36: iload_3        
        //    37: aaload         
        //    38: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getAppearanceIndex:()I
        //    41: iaload         
        //    42: iload           6
        //    44: ifne            68
        //    47: goto            51
        //    50: athrow         
        //    51: ifle            71
        //    54: goto            58
        //    57: athrow         
        //    58: aload_2        
        //    59: iload_3        
        //    60: aaload         
        //    61: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getAppearanceIndex:()I
        //    64: goto            68
        //    67: athrow         
        //    68: goto            77
        //    71: aload_2        
        //    72: iload_3        
        //    73: aaload         
        //    74: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getSheathedAppearanceIndex:()I
        //    77: istore          4
        //    79: iload           6
        //    81: ifne            126
        //    84: iload           4
        //    86: iconst_m1      
        //    87: if_icmpeq       123
        //    90: goto            94
        //    93: athrow         
        //    94: aload_1        
        //    95: iload           4
        //    97: iaload         
        //    98: istore          5
        //   100: aload_0        
        //   101: iload_3        
        //   102: iload           5
        //   104: iload           6
        //   106: ifne            118
        //   109: ifle            121
        //   112: goto            116
        //   115: athrow         
        //   116: iload           5
        //   118: goto            122
        //   121: iconst_m1      
        //   122: iastore        
        //   123: iinc            3, 1
        //   126: iload           6
        //   128: ifeq            23
        //   131: aload_0        
        //   132: areturn        
        //    StackMapTable: 00 14 FF 00 17 00 07 07 00 DE 07 00 DE 07 00 E2 01 00 00 01 00 00 5A 07 00 16 40 01 45 07 00 16 00 48 07 00 16 40 01 02 45 01 FF 00 0F 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 00 01 00 01 07 00 16 00 FF 00 14 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 01 01 00 01 07 00 16 FF 00 00 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 01 01 00 02 07 00 DE 01 FF 00 01 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 01 01 00 03 07 00 DE 01 01 FF 00 02 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 01 01 00 02 07 00 DE 01 FF 00 00 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 01 01 00 03 07 00 DE 01 01 FF 00 00 00 07 07 00 DE 07 00 DE 07 00 E2 01 01 00 01 00 00 02 FF 00 04 00 07 07 00 DE 07 00 DE 07 00 E2 01 00 00 01 00 00 40 07 00 DE
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  100    112    115    116    Ljava/lang/IndexOutOfBoundsException;
        //  79     90     93     94     Ljava/lang/IndexOutOfBoundsException;
        //  51     64     67     68     Ljava/lang/IndexOutOfBoundsException;
        //  35     54     57     58     Ljava/lang/IndexOutOfBoundsException;
        //  29     47     50     51     Ljava/lang/IndexOutOfBoundsException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static Item[] getCachedItems() {
        final int a = Inventory.a;
        final Widget value = Widgets.get(387);
        int length = 0;
        Label_0103: {
            Widget widget = null;
            Label_0026: {
                try {
                    widget = value;
                    if (a != 0) {
                        break Label_0026;
                    }
                    if (widget == null) {
                        break Label_0103;
                    }
                }
                catch (IndexOutOfBoundsException ex) {
                    throw ex;
                }
            }
            final WidgetChild[] children = widget.getChildren();
            try {
                length = children.length;
                if (a != 0) {
                    return new Item[length];
                }
                if (length <= 0) {
                    break Label_0103;
                }
            }
            catch (IndexOutOfBoundsException ex2) {
                throw ex2;
            }
            final Item[] array = new Item[13];
            final Slot[] values = Slot.values();
            int i = 0;
            Item[] array2 = null;
            while (i < 13) {
                try {
                    array2 = array;
                    if (a != 0) {
                        return array2;
                    }
                    array2[i] = new Item(children[values[i].getComponentIndex()]);
                    ++i;
                    if (a == 0) {
                        continue;
                    }
                }
                catch (IndexOutOfBoundsException ex3) {
                    throw ex3;
                }
                break;
            }
            return array2;
        }
        return new Item[length];
    }
    
    public static int getCount() {
        return 13 - getCount(-1);
    }
    
    public static int getCount(final int... array) {
        final int i = Inventory.a;
        int n = 0;
        final Item[] items = getItems();
        final int length = items.length;
        int n2 = 0;
        do {
            int j = 0;
            int n3 = 0;
        Label_0020:
            while (j < n3) {
                final Item item = items[n2];
                Label_0043: {
                    Item item2 = null;
                    Label_0046: {
                        try {
                            item2 = item;
                            if (i != 0) {
                                break Label_0046;
                            }
                            if (item2 != null) {
                                break Label_0046;
                            }
                        }
                        catch (IndexOutOfBoundsException ex) {
                            throw ex;
                        }
                        break Label_0043;
                    }
                    final int id = item2.getId();
                    final int length2 = array.length;
                    int k = 0;
                    while (k < length2) {
                        final int n4 = array[k];
                        Label_0118: {
                            try {
                                if (i != 0) {
                                    break Label_0118;
                                }
                                j = id;
                                n3 = n4;
                                if (i != 0) {
                                    continue Label_0020;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            Label_0111: {
                                try {
                                    if (j != n3) {
                                        break Label_0111;
                                    }
                                    ++n;
                                    final int n5 = i;
                                    if (n5 != 0) {
                                        break Label_0111;
                                    }
                                    break;
                                }
                                catch (IndexOutOfBoundsException ex3) {
                                    throw ex3;
                                }
                                try {
                                    ++n;
                                    final int n5 = i;
                                    if (n5 == 0) {
                                        break;
                                    }
                                    ++k;
                                }
                                catch (IndexOutOfBoundsException ex4) {
                                    throw ex4;
                                }
                            }
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                }
                ++n2;
                continue Label_0020;
            }
            break;
        } while (i == 0);
        return n;
    }
    
    public static Item getItem(final Slot slot) {
        final int a = Inventory.a;
        final Widget widget = getWidget();
        Label_0047: {
            Label_0021: {
                Widget widget2;
                try {
                    widget2 = widget;
                    if (a != 0) {
                        break Label_0021;
                    }
                    if (widget2 == null) {
                        return null;
                    }
                }
                catch (IndexOutOfBoundsException ex) {
                    throw ex;
                }
                try {
                    final int n;
                    final boolean b = (n = (widget2.validate() ? 1 : 0)) != 0;
                    if (a != 0) {
                        break Label_0047;
                    }
                    if (!b) {
                        return null;
                    }
                }
                catch (IndexOutOfBoundsException ex2) {
                    throw ex2;
                }
            }
            try {
                WidgetChild widgetChild = null;
                Label_0078: {
                    Widget widget3 = null;
                    Label_0071: {
                        int n;
                        try {
                            widget3 = widget;
                            if (a != 0) {
                                break Label_0071;
                            }
                            n = widget3.getIndex();
                        }
                        catch (IndexOutOfBoundsException ex3) {
                            throw ex3;
                        }
                        try {
                            if (n == 667) {
                                widgetChild = widget.getChild(9).getChild(slot.getBankComponentIndex());
                                break Label_0078;
                            }
                        }
                        catch (IndexOutOfBoundsException ex4) {
                            throw ex4;
                        }
                    }
                    widgetChild = widget3.getChild(slot.getComponentIndex());
                }
                final WidgetChild widgetChild2 = widgetChild;
                if (widgetChild2 != null) {
                    return new Item(widgetChild2);
                }
            }
            catch (IndexOutOfBoundsException ex5) {}
        }
        return null;
    }
    
    public static Item getItem(final int... array) {
        final int i = Inventory.a;
        final Item[] items = getItems();
        final int length = items.length;
        int n = 0;
        do {
            int j = 0;
            int id = 0;
        Label_0016:
            while (j < id) {
                final Item item = items[n];
                Label_0094: {
                    try {
                        if (item == null) {
                            break Label_0094;
                        }
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw ex;
                    }
                    final int length2 = array.length;
                    int k = 0;
                    while (k < length2) {
                        final int n2 = array[k];
                        Label_0089: {
                            try {
                                if (i != 0) {
                                    break Label_0089;
                                }
                                j = n2;
                                id = item.getId();
                                if (i != 0) {
                                    continue Label_0016;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            try {
                                if (j == id) {
                                    return item;
                                }
                            }
                            catch (IndexOutOfBoundsException ex3) {
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
                continue Label_0016;
            }
            break;
        } while (i == 0);
        return null;
    }
    
    public static Item getCachedItem(final int... array) {
        final int i = Inventory.a;
        final Item[] cachedItems = getCachedItems();
        final int length = cachedItems.length;
        int n = 0;
        do {
            int j = 0;
            int id = 0;
        Label_0016:
            while (j < id) {
                final Item item = cachedItems[n];
                Label_0094: {
                    try {
                        if (item == null) {
                            break Label_0094;
                        }
                    }
                    catch (IndexOutOfBoundsException ex) {
                        throw ex;
                    }
                    final int length2 = array.length;
                    int k = 0;
                    while (k < length2) {
                        final int n2 = array[k];
                        Label_0089: {
                            try {
                                if (i != 0) {
                                    break Label_0089;
                                }
                                j = n2;
                                id = item.getId();
                                if (i != 0) {
                                    continue Label_0016;
                                }
                            }
                            catch (IndexOutOfBoundsException ex2) {
                                throw ex2;
                            }
                            try {
                                if (j == id) {
                                    return item;
                                }
                            }
                            catch (IndexOutOfBoundsException ex3) {
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
                continue Label_0016;
            }
            break;
        } while (i == 0);
        return null;
    }
    
    public static Item getCachedItem(final Slot slot) {
        final Widget value = Widgets.get(387);
        Label_0022: {
            Widget widget;
            try {
                widget = value;
                if (Inventory.a != 0) {
                    break Label_0022;
                }
                if (widget == null) {
                    return null;
                }
            }
            catch (ArrayIndexOutOfBoundsException ex) {
                throw ex;
            }
            try {
                if (widget.validate()) {
                    final Widget widget2 = value;
                    final Slot slot2 = slot;
                    final int n = slot2.getComponentIndex();
                    final WidgetChild widgetChild = widget2.getChild(n);
                    return new Item(widgetChild);
                }
                return null;
            }
            catch (SecurityException ex2) {
                throw ex2;
            }
        }
        try {
            final Widget widget2 = value;
            final Slot slot2 = slot;
            final int n = slot2.getComponentIndex();
            final WidgetChild widgetChild = widget2.getChild(n);
            return new Item(widgetChild);
        }
        catch (ArrayIndexOutOfBoundsException ex3) {}
        return null;
    }
    
    public static Item[] getItems() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/game/api/methods/tab/Equipment.getWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
        //     8: astore_0       
        //     9: aload_0        
        //    10: iload           6
        //    12: ifne            23
        //    15: ifnull          215
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getIndex:()I
        //    26: iload           6
        //    28: ifne            46
        //    31: sipush          387
        //    34: if_icmpeq       49
        //    37: goto            41
        //    40: athrow         
        //    41: iconst_1       
        //    42: goto            46
        //    45: athrow         
        //    46: goto            50
        //    49: iconst_0       
        //    50: istore_1       
        //    51: iload_1        
        //    52: ifeq            68
        //    55: aload_0        
        //    56: bipush          9
        //    58: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    61: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    64: goto            72
        //    67: athrow         
        //    68: aload_0        
        //    69: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    72: astore_2       
        //    73: aload_2        
        //    74: arraylength    
        //    75: iload           6
        //    77: ifne            216
        //    80: ifle            215
        //    83: goto            87
        //    86: athrow         
        //    87: iload_1        
        //    88: iload           6
        //    90: ifne            167
        //    93: goto            97
        //    96: athrow         
        //    97: ifne            165
        //   100: goto            104
        //   103: athrow         
        //   104: bipush          13
        //   106: anewarray       Lorg/powerbot/game/api/wrappers/node/Item;
        //   109: astore_3       
        //   110: invokestatic    org/powerbot/game/api/methods/tab/Equipment$Slot.values:()[Lorg/powerbot/game/api/methods/tab/Equipment$Slot;
        //   113: astore          4
        //   115: iconst_0       
        //   116: istore          5
        //   118: iload           5
        //   120: bipush          13
        //   122: if_icmpge       163
        //   125: aload_3        
        //   126: iload           6
        //   128: ifne            164
        //   131: iload           5
        //   133: new             Lorg/powerbot/game/api/wrappers/node/Item;
        //   136: dup            
        //   137: aload_2        
        //   138: aload           4
        //   140: iload           5
        //   142: aaload         
        //   143: invokevirtual   org/powerbot/game/api/methods/tab/Equipment$Slot.getComponentIndex:()I
        //   146: aaload         
        //   147: invokespecial   org/powerbot/game/api/wrappers/node/Item.<init>:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)V
        //   150: aastore        
        //   151: iinc            5, 1
        //   154: iload           6
        //   156: ifeq            118
        //   159: goto            163
        //   162: athrow         
        //   163: aload_3        
        //   164: areturn        
        //   165: aload_2        
        //   166: arraylength    
        //   167: anewarray       Lorg/powerbot/game/api/wrappers/node/Item;
        //   170: astore_3       
        //   171: iconst_0       
        //   172: istore          4
        //   174: iload           4
        //   176: aload_3        
        //   177: arraylength    
        //   178: if_icmpge       213
        //   181: aload_3        
        //   182: iload           6
        //   184: ifne            214
        //   187: iload           4
        //   189: new             Lorg/powerbot/game/api/wrappers/node/Item;
        //   192: dup            
        //   193: aload_2        
        //   194: iload           4
        //   196: aaload         
        //   197: invokespecial   org/powerbot/game/api/wrappers/node/Item.<init>:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)V
        //   200: aastore        
        //   201: iinc            4, 1
        //   204: iload           6
        //   206: ifeq            174
        //   209: goto            213
        //   212: athrow         
        //   213: aload_3        
        //   214: areturn        
        //   215: iconst_0       
        //   216: anewarray       Lorg/powerbot/game/api/wrappers/node/Item;
        //   219: areturn        
        //    StackMapTable: 00 1E FF 00 15 00 07 07 00 5F 00 00 00 00 00 01 00 01 07 00 16 00 40 07 00 5F 50 07 00 16 00 43 07 00 16 40 01 02 40 01 FF 00 10 00 07 07 00 5F 01 00 00 00 00 01 00 01 07 00 16 00 43 07 00 E4 FF 00 0D 00 07 07 00 5F 01 07 00 E4 00 00 00 01 00 01 07 00 16 00 48 07 00 16 40 01 45 07 00 16 00 FF 00 0D 00 07 07 00 5F 01 07 00 E4 07 00 E0 07 00 E2 01 01 00 00 6B 07 00 16 00 40 07 00 E0 FF 00 00 00 07 07 00 5F 01 07 00 E4 00 00 00 01 00 00 41 01 FF 00 06 00 07 07 00 5F 01 07 00 E4 07 00 E0 01 00 01 00 00 65 07 00 16 00 40 07 00 E0 FF 00 00 00 07 07 00 5F 00 00 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  181    209    212    213    Ljava/lang/IndexOutOfBoundsException;
        //  125    159    162    163    Ljava/lang/IndexOutOfBoundsException;
        //  87     100    103    104    Ljava/lang/IndexOutOfBoundsException;
        //  80     93     96     97     Ljava/lang/IndexOutOfBoundsException;
        //  73     83     86     87     Ljava/lang/IndexOutOfBoundsException;
        //  51     67     67     68     Ljava/lang/IndexOutOfBoundsException;
        //  31     42     45     46     Ljava/lang/IndexOutOfBoundsException;
        //  23     37     40     41     Ljava/lang/IndexOutOfBoundsException;
        //  9      18     21     22     Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0087:
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
    
    public static Widget getWidget() {
        Label_0016: {
            int n;
            try {
                final int open;
                n = (open = (Bank.isOpen() ? 1 : 0));
                if (Inventory.a != 0) {
                    return Widgets.get(open);
                }
                if (n == 0) {
                    break Label_0016;
                }
                break Label_0016;
            }
            catch (IndexOutOfBoundsException ex) {
                throw ex;
            }
            try {
                if (n == 0) {
                    Tabs.EQUIPMENT.open();
                    return Widgets.get(387);
                }
            }
            catch (IndexOutOfBoundsException ex2) {
                throw ex2;
            }
        }
        int open = 667;
        return Widgets.get(open);
    }
    
    public static boolean equip(final int... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_0        
        //     6: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnull          297
        //    14: iconst_m1      
        //    15: istore_2       
        //    16: aload_0        
        //    17: astore_3       
        //    18: aload_3        
        //    19: arraylength    
        //    20: istore          4
        //    22: iconst_0       
        //    23: istore          5
        //    25: iload           5
        //    27: iload           4
        //    29: if_icmpge       81
        //    32: aload_3        
        //    33: iload           5
        //    35: iaload         
        //    36: istore          6
        //    38: iload           8
        //    40: ifne            76
        //    43: iconst_1       
        //    44: newarray        I
        //    46: dup            
        //    47: iconst_0       
        //    48: iload           6
        //    50: iastore        
        //    51: invokestatic    org/powerbot/game/api/methods/tab/Inventory.indexOf:([I)I
        //    54: dup            
        //    55: istore_2       
        //    56: iload           8
        //    58: ifne            298
        //    61: iconst_m1      
        //    62: if_icmpeq       73
        //    65: goto            69
        //    68: athrow         
        //    69: goto            81
        //    72: athrow         
        //    73: iinc            5, 1
        //    76: iload           8
        //    78: ifeq            25
        //    81: aload_1        
        //    82: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    85: astore_3       
        //    86: aload_3        
        //    87: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getActions:()[Ljava/lang/String;
        //    90: astore          4
        //    92: aload           4
        //    94: arraylength    
        //    95: istore          5
        //    97: iconst_0       
        //    98: istore          6
        //   100: iload           6
        //   102: iload           5
        //   104: if_icmpge       242
        //   107: aload           4
        //   109: iload           6
        //   111: aaload         
        //   112: astore          7
        //   114: iload           8
        //   116: ifne            297
        //   119: aload           7
        //   121: iload           8
        //   123: ifne            142
        //   126: goto            130
        //   129: athrow         
        //   130: ifnonnull       140
        //   133: goto            137
        //   136: athrow         
        //   137: goto            234
        //   140: aload           7
        //   142: getstatic       org/powerbot/game/api/methods/tab/Equipment.z:[Ljava/lang/String;
        //   145: iconst_0       
        //   146: aaload         
        //   147: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   150: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   153: iload           8
        //   155: ifne            233
        //   158: ifne            223
        //   161: goto            165
        //   164: athrow         
        //   165: aload           7
        //   167: getstatic       org/powerbot/game/api/methods/tab/Equipment.z:[Ljava/lang/String;
        //   170: iconst_1       
        //   171: aaload         
        //   172: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //   175: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   178: iload           8
        //   180: ifne            233
        //   183: goto            187
        //   186: athrow         
        //   187: ifne            223
        //   190: goto            194
        //   193: athrow         
        //   194: aload           7
        //   196: getstatic       org/powerbot/game/api/methods/tab/Equipment.z:[Ljava/lang/String;
        //   199: iconst_2       
        //   200: aaload         
        //   201: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   204: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   207: iload           8
        //   209: ifne            233
        //   212: goto            216
        //   215: athrow         
        //   216: ifeq            234
        //   219: goto            223
        //   222: athrow         
        //   223: aload_3        
        //   224: aload           7
        //   226: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   229: goto            233
        //   232: athrow         
        //   233: pop            
        //   234: iinc            6, 1
        //   237: iload           8
        //   239: ifeq            100
        //   242: iconst_0       
        //   243: istore          4
        //   245: iload           4
        //   247: bipush          100
        //   249: if_icmpge       297
        //   252: aload_1        
        //   253: iload_2        
        //   254: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItemAt:(I)Lorg/powerbot/game/api/wrappers/node/Item;
        //   257: invokevirtual   org/powerbot/game/api/wrappers/node/Item.equals:(Ljava/lang/Object;)Z
        //   260: iload           8
        //   262: ifne            298
        //   265: iload           8
        //   267: ifne            286
        //   270: goto            274
        //   273: athrow         
        //   274: ifne            284
        //   277: goto            281
        //   280: athrow         
        //   281: iconst_1       
        //   282: ireturn        
        //   283: athrow         
        //   284: bipush          10
        //   286: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   289: iinc            4, 1
        //   292: iload           8
        //   294: ifeq            245
        //   297: iconst_0       
        //   298: ireturn        
        //    StackMapTable: 00 26 FF 00 19 00 09 07 00 DE 07 00 0C 01 07 00 DE 01 01 00 00 01 00 00 FF 00 2A 00 09 07 00 DE 07 00 0C 01 07 00 DE 01 01 01 00 01 00 01 07 00 16 00 42 07 00 16 00 02 FF 00 04 00 09 07 00 DE 07 00 0C 01 07 00 DE 01 01 00 00 01 00 00 FF 00 12 00 09 07 00 DE 07 00 0C 01 07 00 6A 07 00 E6 01 01 00 01 00 00 FF 00 1C 00 09 07 00 DE 07 00 0C 01 07 00 6A 07 00 E6 01 01 07 00 78 01 00 01 07 00 16 40 07 00 78 45 07 00 16 00 02 41 07 00 78 55 07 00 16 00 54 07 00 16 40 01 45 07 00 16 00 54 07 00 16 40 01 45 07 00 16 00 48 07 00 16 40 01 00 FF 00 07 00 09 07 00 DE 07 00 0C 01 07 00 6A 07 00 E6 01 01 00 01 00 00 FF 00 02 00 09 07 00 DE 07 00 0C 01 07 00 6A 01 01 01 00 01 00 00 5B 07 00 16 40 01 45 07 00 16 00 41 07 00 16 00 41 01 FF 00 0A 00 09 07 00 DE 07 00 0C 00 00 00 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  274    283    283    284    Ljava/lang/IndexOutOfBoundsException;
        //  265    277    280    281    Ljava/lang/IndexOutOfBoundsException;
        //  252    270    273    274    Ljava/lang/IndexOutOfBoundsException;
        //  216    229    232    233    Ljava/lang/IndexOutOfBoundsException;
        //  194    219    222    223    Ljava/lang/IndexOutOfBoundsException;
        //  187    212    215    216    Ljava/lang/IndexOutOfBoundsException;
        //  165    190    193    194    Ljava/lang/IndexOutOfBoundsException;
        //  158    183    186    187    Ljava/lang/IndexOutOfBoundsException;
        //  142    161    164    165    Ljava/lang/IndexOutOfBoundsException;
        //  119    133    136    137    Ljava/lang/IndexOutOfBoundsException;
        //  114    126    129    130    Ljava/lang/IndexOutOfBoundsException;
        //  61     72     72     73     Ljava/lang/IndexOutOfBoundsException;
        //  56     65     68     69     Ljava/lang/IndexOutOfBoundsException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0165:
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
    
    public static boolean unequip(final int... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokestatic    org/powerbot/game/api/methods/tab/Equipment.getCount:([I)I
        //     8: istore_1       
        //     9: aload_0        
        //    10: invokestatic    org/powerbot/game/api/methods/tab/Equipment.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    13: astore_2       
        //    14: aload_2        
        //    15: iload_3        
        //    16: ifne            27
        //    19: ifnull          91
        //    22: goto            26
        //    25: athrow         
        //    26: aload_2        
        //    27: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    30: getstatic       org/powerbot/game/api/methods/tab/Equipment.z:[Ljava/lang/String;
        //    33: iconst_3       
        //    34: aaload         
        //    35: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
        //    38: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //    41: iload_3        
        //    42: ifne            92
        //    45: ifeq            91
        //    48: goto            52
        //    51: athrow         
        //    52: sipush          250
        //    55: sipush          500
        //    58: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //    61: aload_0        
        //    62: invokestatic    org/powerbot/game/api/methods/tab/Equipment.getCount:([I)I
        //    65: iload_3        
        //    66: ifne            86
        //    69: goto            73
        //    72: athrow         
        //    73: iload_1        
        //    74: if_icmpge       89
        //    77: goto            81
        //    80: athrow         
        //    81: iconst_1       
        //    82: goto            86
        //    85: athrow         
        //    86: goto            90
        //    89: iconst_0       
        //    90: ireturn        
        //    91: iconst_0       
        //    92: ireturn        
        //    StackMapTable: 00 0F FF 00 19 00 04 07 00 DE 01 07 00 0C 01 00 01 07 00 16 00 40 07 00 0C 57 07 00 16 00 53 07 00 16 40 01 46 07 00 16 00 43 07 00 16 40 01 02 40 01 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                 
        //  -----  -----  -----  -----  -------------------------------------
        //  73     82     85     86     Ljava/lang/IndexOutOfBoundsException;
        //  52     77     80     81     Ljava/lang/IndexOutOfBoundsException;
        //  45     69     72     73     Ljava/lang/IndexOutOfBoundsException;
        //  27     48     51     52     Ljava/lang/IndexOutOfBoundsException;
        //  14     22     25     26     Ljava/lang/IndexOutOfBoundsException;
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
        final String[] z2 = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "\f \r\u0011-";
        int n5 = -1;
        String intern = null;
    Label_0062_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0138: {
                    if (n6 > 1) {
                        break Label_0138;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = 'e';
                                break;
                            }
                            case 1: {
                                c2 = 'V';
                                break;
                            }
                            case 2: {
                                c2 = 'T';
                                break;
                            }
                            case 3: {
                                c2 = '\u007f';
                                break;
                            }
                            default: {
                                c2 = 'q';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n8;
                    } while (n6 == 0);
                }
                if (n6 > n8) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n5) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = 1)));
                    s = "%e\"[";
                    n5 = 0;
                    continue Label_0062_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "\u001e8\u001d\u00149";
                    n5 = 1;
                    continue Label_0062_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = " e.F\u0010V";
                    n5 = 2;
                    continue Label_0062_Outer;
                }
                case 2: {
                    break Label_0062_Outer;
                }
            }
        }
        z2[n4] = intern;
        z = z2;
    }
    
    public enum Slot
    {
        HELMET(7, 0, 0, -1), 
        CAPE(10, 1, 1, -1), 
        NECK(13, 2, 2, -1), 
        WEAPON(16, 3, 3, 15), 
        BODY(19, 4, 4, -1), 
        SHIELD(22, 5, 5, 16), 
        LEGS(25, 7, 7, -1), 
        HANDS(28, 9, 9, -1), 
        FEET(31, 10, 10, -1), 
        RING(34, 12, -1, -1), 
        AMMO(39, 13, -1, -1), 
        AURA(48, 14, 14, -1), 
        POCKET(70, 15, -1, -1);
        
        private final int componentIndex;
        private final int bankComponentIndex;
        private final int appearanceIndex;
        private final int sheathedAppearanceIndex;
        private static final String[] z;
        
        private Slot(final int componentIndex, final int bankComponentIndex, final int appearanceIndex, final int sheathedAppearanceIndex) {
            this.componentIndex = componentIndex;
            this.bankComponentIndex = bankComponentIndex;
            this.appearanceIndex = appearanceIndex;
            this.sheathedAppearanceIndex = sheathedAppearanceIndex;
        }
        
        public int getIndex() {
            return this.getIndex(Bank.isOpen());
        }
        
        public int getIndex(final boolean b) {
            int n = 0;
            Label_0014: {
                try {
                    n = (b ? 1 : 0);
                    if (Inventory.a != 0) {
                        return n;
                    }
                    if (b) {
                        break Label_0014;
                    }
                    return this.getComponentIndex();
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (!b) {
                        return this.getComponentIndex();
                    }
                    n = this.getBankComponentIndex();
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return n;
            n = this.getComponentIndex();
            return n;
        }
        
        public int getComponentIndex() {
            return this.componentIndex;
        }
        
        public int getBankComponentIndex() {
            return this.bankComponentIndex;
        }
        
        public int getAppearanceIndex() {
            return this.appearanceIndex;
        }
        
        public int getSheathedAppearanceIndex() {
            return this.sheathedAppearanceIndex;
        }
        
        static {
            final String[] z2 = new String[13];
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
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 0)))))))))));
            String s = "\u0016H;\u001d";
            int n14 = -1;
            String intern = null;
        Label_0157_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n16;
                final int n15 = n16 = (length = charArray.length);
                int n17 = 0;
                while (true) {
                    Label_0234: {
                        if (n15 > 1) {
                            break Label_0234;
                        }
                        length = (n16 = n17);
                        do {
                            final char c = charArray[n16];
                            char c2 = '\0';
                            switch (n17 % 5) {
                                case 0: {
                                    c2 = '\u0017';
                                    break;
                                }
                                case 1: {
                                    c2 = '.';
                                    break;
                                }
                                case 2: {
                                    c2 = '1';
                                    break;
                                }
                                case 3: {
                                    c2 = 'm';
                                    break;
                                }
                                default: {
                                    c2 = 'q';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n17;
                        } while (n15 == 0);
                    }
                    if (n15 > n17) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n14) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 1))))))))))));
                        s = "t\u001fHQ\r*";
                        n14 = 0;
                        continue Label_0157_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 2))))))))))));
                        s = "f\u0002SU";
                        n14 = 1;
                        continue Label_0157_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 3))))))))))));
                        s = "\u001cH9\u001a";
                        n14 = 2;
                        continue Label_0157_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 4))))))))))));
                        s = "&_\u0006\u0019[";
                        n14 = 3;
                        continue Label_0157_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 5))))))))))));
                        s = "\u0014H?\u0005";
                        n14 = 4;
                        continue Label_0157_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 6))))))))))));
                        s = "u\u001eOS";
                        n14 = 5;
                        continue Label_0157_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 7))))))))))));
                        s = "d\u0016QQ";
                        n14 = 6;
                        continue Label_0157_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 8))))))))))));
                        s = "\u0018B8\u0017";
                        n14 = 7;
                        continue Label_0157_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 9))))))))))));
                        s = "\u0012H0\u0003y`";
                        n14 = 8;
                        continue Label_0157_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 10))))))))))));
                        s = "\nB?\u0005y`";
                        n14 = 9;
                        continue Label_0157_Outer;
                    }
                    case 9: {
                        z2[n11] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 11))))))))))));
                        s = "p\u0012@D\u000e ";
                        n14 = 10;
                        continue Label_0157_Outer;
                    }
                    case 10: {
                        z2[n12] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = 12))))))))))));
                        s = "\u001b@1\u0001";
                        n14 = 11;
                        continue Label_0157_Outer;
                    }
                    case 11: {
                        break Label_0157_Outer;
                    }
                }
            }
            z2[n13] = intern;
            z = z2;
        }
    }
}
