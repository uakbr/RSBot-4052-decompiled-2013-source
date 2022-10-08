
package org.powerbot.game.api.methods.tab;

import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.methods.Settings;

public class Attack
{
    public static final int WIDGET = 884;
    public static final int WIDGET_BUTTON_AUTO_RETALIATE = 12;
    public static final int WIDGET_BUTTON_SPECIAL_ATTACK = 36;
    private static final String z;
    
    public static int getFightMode() {
        return Settings.get(43);
    }
    
    public static int getSpecialEnergy() {
        return Settings.get(300) / 10;
    }
    
    public static String getWeaponName() {
        final WidgetChild value = Widgets.get(884, 0);
        WidgetChild widgetChild;
        try {
            widgetChild = value;
            if (Inventory.a != 0) {
                return widgetChild.getText();
            }
            if (widgetChild == null) {
                return "";
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return widgetChild.getText();
        text = "";
        return text;
    }
    
    public static boolean isAutoRetaliateEnabled() {
        int value = 0;
        Label_0023: {
            try {
                value = Settings.get(172);
                if (Inventory.a != 0) {
                    return value != 0;
                }
                if (value != 0) {
                    break Label_0023;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return value != 0;
        }
        return value != 0;
    }
    
    public static boolean isSpecialEnabled() {
        int value = 0;
        Label_0020: {
            int n;
            try {
                n = (value = Settings.get(301));
                if (Inventory.a != 0) {
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
    
    public static void setAutoRetaliate(final boolean b) {
        final int a = Inventory.a;
        int autoRetaliateEnabled = 0;
        int n2 = 0;
        Label_0019: {
            int n;
            try {
                n = (autoRetaliateEnabled = (isAutoRetaliateEnabled() ? 1 : 0));
                n2 = (b ? 1 : 0);
                if (a != 0) {
                    break Label_0019;
                }
                if (n != (b ? 1 : 0)) {
                    break Label_0019;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (n == (b ? 1 : 0)) {
                    return;
                }
                Tabs.ATTACK.open();
                autoRetaliateEnabled = 884;
                n2 = 12;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final WidgetChild value = Widgets.get(autoRetaliateEnabled, n2);
        WidgetChild widgetChild = null;
        Label_0052: {
            try {
                widgetChild = value;
                if (a != 0) {
                    break Label_0052;
                }
                if (widgetChild == null) {
                    return;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        widgetChild.click(true);
    }
    
    public static boolean setFightMode(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: getstatic       org/powerbot/game/api/methods/Tabs.ATTACK:Lorg/powerbot/game/api/methods/Tabs;
        //     7: invokevirtual   org/powerbot/game/api/methods/Tabs.isOpen:()Z
        //    10: iload_3        
        //    11: ifne            46
        //    14: ifne            43
        //    17: goto            21
        //    20: athrow         
        //    21: getstatic       org/powerbot/game/api/methods/Tabs.ATTACK:Lorg/powerbot/game/api/methods/Tabs;
        //    24: iconst_1       
        //    25: invokevirtual   org/powerbot/game/api/methods/Tabs.open:(Z)Z
        //    28: iload_3        
        //    29: ifne            137
        //    32: goto            36
        //    35: athrow         
        //    36: ifeq            134
        //    39: goto            43
        //    42: athrow         
        //    43: sipush          884
        //    46: iload_0        
        //    47: bipush          7
        //    49: iadd           
        //    50: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    53: astore_1       
        //    54: aload_1        
        //    55: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    58: iload_3        
        //    59: ifne            137
        //    62: ifeq            134
        //    65: goto            69
        //    68: athrow         
        //    69: aload_1        
        //    70: iconst_1       
        //    71: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    74: iload_3        
        //    75: ifne            137
        //    78: goto            82
        //    81: athrow         
        //    82: ifeq            134
        //    85: goto            89
        //    88: athrow         
        //    89: iconst_0       
        //    90: istore_2       
        //    91: iload_2        
        //    92: bipush          20
        //    94: if_icmpge       134
        //    97: invokestatic    org/powerbot/game/api/methods/tab/Attack.getFightMode:()I
        //   100: iload_0        
        //   101: iload_3        
        //   102: ifne            146
        //   105: iload_3        
        //   106: ifne            146
        //   109: goto            113
        //   112: athrow         
        //   113: if_icmpeq       134
        //   116: goto            120
        //   119: athrow         
        //   120: iload_2        
        //   121: iconst_1       
        //   122: iadd           
        //   123: i2b            
        //   124: istore_2       
        //   125: bipush          100
        //   127: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   130: iload_3        
        //   131: ifeq            91
        //   134: invokestatic    org/powerbot/game/api/methods/tab/Attack.getFightMode:()I
        //   137: iload_3        
        //   138: ifne            150
        //   141: iload_0        
        //   142: goto            146
        //   145: athrow         
        //   146: if_icmpne       153
        //   149: iconst_1       
        //   150: goto            154
        //   153: iconst_0       
        //   154: ireturn        
        //    StackMapTable: 00 19 FF 00 14 00 04 01 00 00 01 00 01 07 00 67 00 4D 07 00 67 40 01 45 07 00 67 00 42 01 FF 00 15 00 04 01 07 00 32 00 01 00 01 07 00 67 00 4B 07 00 67 40 01 45 07 00 67 00 FF 00 01 00 04 01 07 00 32 01 01 00 00 54 07 00 67 FF 00 00 00 04 01 07 00 32 01 01 00 02 01 01 45 07 00 67 00 FF 00 0D 00 04 01 00 00 01 00 00 42 01 47 07 00 67 FF 00 00 00 04 01 00 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  137    142    145    146    Ljava/lang/RuntimeException;
        //  105    116    119    120    Ljava/lang/RuntimeException;
        //  97     109    112    113    Ljava/lang/RuntimeException;
        //  69     85     88     89     Ljava/lang/RuntimeException;
        //  62     78     81     82     Ljava/lang/RuntimeException;
        //  54     65     68     69     Ljava/lang/RuntimeException;
        //  21     39     42     43     Ljava/lang/RuntimeException;
        //  14     32     35     36     Ljava/lang/RuntimeException;
        //  4      17     20     21     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
    
    public static boolean setSpecial(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/tab/Attack.isSpecialEnabled:()Z
        //     7: iload_0        
        //     8: iload_3        
        //     9: ifne            167
        //    12: if_icmpeq       155
        //    15: goto            19
        //    18: athrow         
        //    19: getstatic       org/powerbot/game/api/methods/Tabs.ATTACK:Lorg/powerbot/game/api/methods/Tabs;
        //    22: invokevirtual   org/powerbot/game/api/methods/Tabs.isOpen:()Z
        //    25: iload_3        
        //    26: ifne            64
        //    29: goto            33
        //    32: athrow         
        //    33: ifne            61
        //    36: goto            40
        //    39: athrow         
        //    40: getstatic       org/powerbot/game/api/methods/Tabs.ATTACK:Lorg/powerbot/game/api/methods/Tabs;
        //    43: invokevirtual   org/powerbot/game/api/methods/Tabs.open:()Z
        //    46: iload_3        
        //    47: ifne            158
        //    50: goto            54
        //    53: athrow         
        //    54: ifeq            155
        //    57: goto            61
        //    60: athrow         
        //    61: sipush          884
        //    64: bipush          36
        //    66: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    69: astore_1       
        //    70: aload_1        
        //    71: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.isOnScreen:()Z
        //    74: iload_3        
        //    75: ifne            158
        //    78: ifeq            155
        //    81: goto            85
        //    84: athrow         
        //    85: aload_1        
        //    86: getstatic       org/powerbot/game/api/methods/tab/Attack.z:Ljava/lang/String;
        //    89: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    92: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //    95: iload_3        
        //    96: ifne            158
        //    99: goto            103
        //   102: athrow         
        //   103: ifeq            155
        //   106: goto            110
        //   109: athrow         
        //   110: iconst_0       
        //   111: istore_2       
        //   112: iload_2        
        //   113: bipush          10
        //   115: if_icmpge       155
        //   118: invokestatic    org/powerbot/game/api/methods/tab/Attack.isSpecialEnabled:()Z
        //   121: iload_0        
        //   122: iload_3        
        //   123: ifne            167
        //   126: iload_3        
        //   127: ifne            167
        //   130: goto            134
        //   133: athrow         
        //   134: if_icmpeq       155
        //   137: goto            141
        //   140: athrow         
        //   141: iload_2        
        //   142: iconst_1       
        //   143: iadd           
        //   144: i2b            
        //   145: istore_2       
        //   146: bipush          100
        //   148: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   151: iload_3        
        //   152: ifeq            112
        //   155: invokestatic    org/powerbot/game/api/methods/tab/Attack.isSpecialEnabled:()Z
        //   158: iload_3        
        //   159: ifne            171
        //   162: iload_0        
        //   163: goto            167
        //   166: athrow         
        //   167: if_icmpne       174
        //   170: iconst_1       
        //   171: goto            175
        //   174: iconst_0       
        //   175: ireturn        
        //    StackMapTable: 00 1D FF 00 12 00 04 01 00 00 01 00 01 07 00 67 00 4C 07 00 67 40 01 45 07 00 67 00 4C 07 00 67 40 01 45 07 00 67 00 42 01 FF 00 13 00 04 01 07 00 32 00 01 00 01 07 00 67 00 50 07 00 67 40 01 45 07 00 67 00 FF 00 01 00 04 01 07 00 32 01 01 00 00 54 07 00 67 FF 00 00 00 04 01 07 00 32 01 01 00 02 01 01 45 07 00 67 00 FF 00 0D 00 04 01 00 00 01 00 00 42 01 47 07 00 67 FF 00 00 00 04 01 00 00 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  158    163    166    167    Ljava/lang/RuntimeException;
        //  126    137    140    141    Ljava/lang/RuntimeException;
        //  118    130    133    134    Ljava/lang/RuntimeException;
        //  85     106    109    110    Ljava/lang/RuntimeException;
        //  78     99     102    103    Ljava/lang/RuntimeException;
        //  70     81     84     85     Ljava/lang/RuntimeException;
        //  40     57     60     61     Ljava/lang/RuntimeException;
        //  33     50     53     54     Ljava/lang/RuntimeException;
        //  19     36     39     40     Ljava/lang/RuntimeException;
        //  12     29     32     33     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
        final char[] charArray = "\u001ep\u0003\u0014]\u0016\u0006\u000e:m)v\u0005\u001f\u00112R)+k!".toCharArray();
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
                            c2 = '\n';
                            break;
                        }
                        case 1: {
                            c2 = 'f';
                            break;
                        }
                        case 2: {
                            c2 = '$';
                            break;
                        }
                        case 3: {
                            c2 = '\n';
                            break;
                        }
                        default: {
                            c2 = 'q';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
