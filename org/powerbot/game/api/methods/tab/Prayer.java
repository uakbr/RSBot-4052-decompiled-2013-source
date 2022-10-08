
package org.powerbot.game.api.methods.tab;

import org.powerbot.kb;
import org.powerbot.eb;
import org.f;
import org.powerbot.core.script.wrappers.Component;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.methods.Tabs;
import java.awt.Point;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.core.script.job.Task;
import java.util.LinkedHashSet;
import org.powerbot.game.api.methods.Settings;

public class Prayer
{
    public static final int WIDGET_PRAYER = 271;
    public static final int WIDGET_PRAYER_ORB = 749;
    public static final int PRAYER_BOOK_CURSES = 23;
    public static final int PRAYER_BOOK_NORMAL = 22;
    public static final int ICON_PROTECT_FROM_MELEE = 0;
    public static final int ICON_PROTECT_FROM_MISSILES = 1;
    public static final int ICON_PROTECT_FROM_MAGIC = 2;
    public static final int ICON_RETRIBUTION = 3;
    public static final int ICON_REDEMPTION = 4;
    public static final int ICON_SMITE = 5;
    public static final int ICON_PROTECT_FROM_SUMMONING = 7;
    public static final int ICON_PROTECT_FROM_SUMMONING_AND_MELEE = 8;
    public static final int ICON_PROTECT_FROM_SUMMONING_AND_MISSILES = 9;
    public static final int ICON_PROTECT_FROM_SUMMONING_AND_MAGIC = 10;
    public static final int ICON_DEFLECT_MELEE = 12;
    public static final int ICON_DEFLECT_MAGIC = 13;
    public static final int ICON_DEFLECT_MISSILES = 14;
    public static final int ICON_DEFLECT_SUMMONING = 15;
    public static final int ICON_DEFLECT_SUMMONING_AND_MELEE = 16;
    public static final int ICON_DEFLECT_SUMMONING_AND_MISSILES = 17;
    public static final int ICON_DEFLECT_SUMMONING_AND_MAGIC = 18;
    public static final int ICON_WRATH = 19;
    public static final int ICON_SOUL_SPLIT = 20;
    private static final String[] z;
    
    public static int getPoints() {
        return Settings.get(3274, 32767) / 10;
    }
    
    public static boolean isCursesOn() {
        int n = 0;
        Label_0025: {
            try {
                n = Settings.get(3277) % 2;
                if (Inventory.a != 0) {
                    return n != 0;
                }
                if (n == 0) {
                    break Label_0025;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return n != 0;
        }
        return n != 0;
    }
    
    public static boolean isQuickOn() {
        int value = 0;
        Label_0020: {
            int n;
            try {
                n = (value = Settings.get(1769));
                if (Inventory.a != 0) {
                    return value != 0;
                }
                final int n2 = 2;
                if (n == n2) {
                    break Label_0020;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = 2;
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
    
    public static PrayerBook[] getActive() {
        int a = Inventory.a;
        final LinkedHashSet<PrayerBook> set = new LinkedHashSet<PrayerBook>();
        PrayerBook[] array = null;
        Label_0029: {
            try {
                if (isCursesOn()) {
                    array = Curses.values();
                    break Label_0029;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            array = Normal.values();
        }
        final PrayerBook[] array2 = array;
        final int length = array2.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final PrayerBook[] array3 = array2;
                if (a != 0) {
                    PrayerBook[] array4;
                    try {
                        array4 = array3;
                        if (Task.a != 0) {
                            Inventory.a = ++a;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    return array4;
                }
                final PrayerBook prayerBook = array3[i];
                Label_0085: {
                    Label_0069: {
                        try {
                            if (a != 0) {
                                break Label_0085;
                            }
                            final PrayerBook prayerBook2 = prayerBook;
                            final boolean b = prayerBook2.isActive();
                            if (b) {
                                break Label_0069;
                            }
                            break Label_0069;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            final PrayerBook prayerBook2 = prayerBook;
                            final boolean b = prayerBook2.isActive();
                            if (b) {
                                set.add(prayerBook);
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
            set.toArray(new PrayerBook[set.size()]);
            continue;
        }
    }
    
    public static PrayerBook[] getQuick() {
        final int a = Inventory.a;
        final LinkedHashSet<PrayerBook> set = new LinkedHashSet<PrayerBook>();
        PrayerBook[] array = null;
        Label_0029: {
            try {
                if (isCursesOn()) {
                    array = Curses.values();
                    break Label_0029;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            array = Normal.values();
        }
        final PrayerBook[] array2 = array;
        final int length = array2.length;
        int i = 0;
        PrayerBook[] array3 = null;
        while (i < length) {
            array3 = array2;
            if (a != 0) {
                return array3;
            }
            final PrayerBook prayerBook = array3[i];
            Label_0085: {
                Label_0069: {
                    try {
                        if (a != 0) {
                            break Label_0085;
                        }
                        final PrayerBook prayerBook2 = prayerBook;
                        final boolean b = prayerBook2.isSetQuick();
                        if (b) {
                            break Label_0069;
                        }
                        break Label_0069;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        final PrayerBook prayerBook2 = prayerBook;
                        final boolean b = prayerBook2.isSetQuick();
                        if (b) {
                            set.add(prayerBook);
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                ++i;
            }
            if (a != 0) {
                int a2 = Task.a;
                Task.a = ++a2;
                break;
            }
        }
        set.toArray(new PrayerBook[set.size()]);
        return array3;
    }
    
    public static boolean toggleQuick(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: invokestatic    org/powerbot/game/api/methods/tab/Prayer.isQuickOn:()Z
        //     7: iload_1        
        //     8: ifne            53
        //    11: iload_0        
        //    12: if_icmpeq       52
        //    15: goto            19
        //    18: athrow         
        //    19: sipush          749
        //    22: iconst_2       
        //    23: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    26: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //    29: iconst_2       
        //    30: aaload         
        //    31: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //    34: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //    37: iload_1        
        //    38: ifne            53
        //    41: goto            45
        //    44: athrow         
        //    45: ifeq            56
        //    48: goto            52
        //    51: athrow         
        //    52: iconst_1       
        //    53: goto            57
        //    56: iconst_0       
        //    57: ireturn        
        //    StackMapTable: 00 09 FF 00 12 00 02 01 01 00 01 07 00 F6 00 58 07 00 F6 40 01 45 07 00 F6 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  19     48     51     52     Ljava/lang/RuntimeException;
        //  11     41     44     45     Ljava/lang/RuntimeException;
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
    
    public static boolean setQuick(final PrayerBook... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: astore_1       
        //     7: aload_1        
        //     8: arraylength    
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iload_3        
        //    13: iload_2        
        //    14: if_icmpge       104
        //    17: aload_1        
        //    18: iload_3        
        //    19: aaload         
        //    20: astore          4
        //    22: aload           4
        //    24: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getBook:()I
        //    29: invokestatic    org/powerbot/game/api/methods/tab/Prayer.isCursesOn:()Z
        //    32: iload           7
        //    34: ifne            108
        //    37: iload           7
        //    39: ifne            55
        //    42: goto            46
        //    45: athrow         
        //    46: ifeq            58
        //    49: goto            53
        //    52: athrow         
        //    53: bipush          23
        //    55: goto            60
        //    58: bipush          22
        //    60: if_icmpne       90
        //    63: aload           4
        //    65: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getRequiredLevel:()I
        //    70: iload           7
        //    72: ifne            95
        //    75: goto            79
        //    78: athrow         
        //    79: iconst_5       
        //    80: invokestatic    org/powerbot/game/api/methods/tab/Skills.getRealLevel:(I)I
        //    83: if_icmple       96
        //    86: goto            90
        //    89: athrow         
        //    90: iconst_0       
        //    91: goto            95
        //    94: athrow         
        //    95: ireturn        
        //    96: iinc            3, 1
        //    99: iload           7
        //   101: ifeq            12
        //   104: sipush          749
        //   107: iconst_2       
        //   108: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   111: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   114: iconst_3       
        //   115: aaload         
        //   116: invokestatic    org/powerbot/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   119: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   122: iload           7
        //   124: ifne            599
        //   127: ifeq            598
        //   130: goto            134
        //   133: athrow         
        //   134: new             Lorg/powerbot/game/api/util/Timer;
        //   137: dup            
        //   138: ldc2_w          1000
        //   141: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   144: astore_1       
        //   145: aload_1        
        //   146: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   149: ifeq            194
        //   152: sipush          1769
        //   155: invokestatic    org/powerbot/game/api/methods/Settings.get:(I)I
        //   158: iload           7
        //   160: ifne            196
        //   163: iload           7
        //   165: ifne            196
        //   168: goto            172
        //   171: athrow         
        //   172: iconst_1       
        //   173: if_icmpeq       194
        //   176: goto            180
        //   179: athrow         
        //   180: bipush          15
        //   182: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   185: iload           7
        //   187: ifeq            145
        //   190: goto            194
        //   193: athrow         
        //   194: bipush          100
        //   196: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   199: aload_0        
        //   200: astore_2       
        //   201: aload_2        
        //   202: arraylength    
        //   203: istore_3       
        //   204: iconst_0       
        //   205: istore          4
        //   207: iload           4
        //   209: iload_3        
        //   210: if_icmpge       386
        //   213: aload_2        
        //   214: iload           4
        //   216: aaload         
        //   217: astore          5
        //   219: aload           5
        //   221: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.isSetQuick:()Z
        //   226: iload           7
        //   228: ifne            398
        //   231: iload           7
        //   233: ifne            280
        //   236: goto            240
        //   239: athrow         
        //   240: ifeq            250
        //   243: goto            247
        //   246: athrow         
        //   247: goto            378
        //   250: sipush          271
        //   253: bipush          11
        //   255: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   258: aload           5
        //   260: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getId:()I
        //   265: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   268: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   271: bipush          6
        //   273: aaload         
        //   274: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   277: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   280: iload           7
        //   282: ifne            377
        //   285: ifeq            351
        //   288: goto            292
        //   291: athrow         
        //   292: new             Lorg/powerbot/game/api/util/Timer;
        //   295: dup            
        //   296: ldc2_w          500
        //   299: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   302: astore          6
        //   304: aload           6
        //   306: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   309: ifeq            346
        //   312: aload           5
        //   314: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.isSetQuick:()Z
        //   319: iload           7
        //   321: ifne            209
        //   324: iload           7
        //   326: ifne            338
        //   329: ifne            346
        //   332: goto            336
        //   335: athrow         
        //   336: bipush          15
        //   338: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   341: iload           7
        //   343: ifeq            304
        //   346: iload           7
        //   348: ifeq            378
        //   351: sipush          271
        //   354: bipush          12
        //   356: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   359: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   362: bipush          7
        //   364: aaload         
        //   365: invokestatic    org/powerbot/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   368: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   371: pop            
        //   372: iconst_0       
        //   373: goto            377
        //   376: athrow         
        //   377: ireturn        
        //   378: iinc            4, 1
        //   381: iload           7
        //   383: ifeq            207
        //   386: aload_0        
        //   387: invokestatic    java/util/Arrays.sort:([Ljava/lang/Object;)V
        //   390: invokestatic    org/powerbot/game/api/methods/tab/Prayer.getQuick:()[Lorg/powerbot/game/api/methods/tab/Prayer$PrayerBook;
        //   393: astore_2       
        //   394: aload_2        
        //   395: arraylength    
        //   396: istore_3       
        //   397: iconst_0       
        //   398: istore          4
        //   400: iload           4
        //   402: iload_3        
        //   403: if_icmpge       578
        //   406: aload_2        
        //   407: iload           4
        //   409: aaload         
        //   410: astore          5
        //   412: iload           7
        //   414: ifne            573
        //   417: aload_0        
        //   418: aload           5
        //   420: invokestatic    java/util/Arrays.binarySearch:([Ljava/lang/Object;Ljava/lang/Object;)I
        //   423: iload           7
        //   425: ifne            597
        //   428: goto            432
        //   431: athrow         
        //   432: ifge            570
        //   435: goto            439
        //   438: athrow         
        //   439: sipush          271
        //   442: bipush          11
        //   444: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   447: aload           5
        //   449: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getId:()I
        //   454: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   457: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   460: iconst_5       
        //   461: aaload         
        //   462: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   465: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   468: iload           7
        //   470: ifne            569
        //   473: goto            477
        //   476: athrow         
        //   477: ifeq            543
        //   480: goto            484
        //   483: athrow         
        //   484: new             Lorg/powerbot/game/api/util/Timer;
        //   487: dup            
        //   488: ldc2_w          500
        //   491: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   494: astore          6
        //   496: aload           6
        //   498: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   501: ifeq            538
        //   504: aload           5
        //   506: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.isSetQuick:()Z
        //   511: iload           7
        //   513: ifne            402
        //   516: iload           7
        //   518: ifne            530
        //   521: ifne            538
        //   524: goto            528
        //   527: athrow         
        //   528: bipush          15
        //   530: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   533: iload           7
        //   535: ifeq            496
        //   538: iload           7
        //   540: ifeq            570
        //   543: sipush          271
        //   546: bipush          12
        //   548: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   551: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   554: bipush          7
        //   556: aaload         
        //   557: invokestatic    org/powerbot/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   560: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   563: pop            
        //   564: iconst_0       
        //   565: goto            569
        //   568: athrow         
        //   569: ireturn        
        //   570: iinc            4, 1
        //   573: iload           7
        //   575: ifeq            400
        //   578: sipush          271
        //   581: bipush          12
        //   583: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   586: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   589: iconst_4       
        //   590: aaload         
        //   591: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   594: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   597: ireturn        
        //   598: iconst_0       
        //   599: ireturn        
        //    StackMapTable: 00 48 FF 00 0C 00 08 07 00 0E 07 00 0E 01 01 00 00 00 01 00 00 FF 00 20 00 08 07 00 0E 07 00 0E 01 01 07 00 0C 00 00 01 00 01 07 00 F6 FF 00 00 00 08 07 00 0E 07 00 0E 01 01 07 00 0C 00 00 01 00 02 01 01 45 07 00 F6 40 01 FF 00 01 00 08 07 00 0E 07 00 0E 01 01 07 00 0C 00 00 01 00 02 01 01 42 01 FF 00 01 00 08 07 00 0E 07 00 0E 01 01 07 00 0C 00 00 01 00 02 01 01 51 07 00 F6 40 01 49 07 00 F6 00 43 07 00 F6 40 01 00 FF 00 07 00 08 07 00 0E 07 00 0E 01 01 00 00 00 01 00 00 FF 00 03 00 08 07 00 0E 07 00 0E 01 01 00 00 00 01 00 02 01 01 58 07 00 F6 00 FF 00 0A 00 08 07 00 0E 07 00 16 01 01 00 00 00 01 00 00 59 07 00 F6 40 01 46 07 00 F6 00 4C 07 00 F6 00 41 01 FF 00 0A 00 08 07 00 0E 07 00 16 07 00 0E 01 01 00 00 01 00 00 41 01 FF 00 1D 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 00 01 00 01 07 00 F6 40 01 45 07 00 F6 00 02 5D 01 4A 07 00 F6 00 FF 00 0B 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 07 00 16 01 00 00 5E 07 00 F6 00 41 01 07 FF 00 04 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 00 01 00 00 58 07 00 F6 40 01 00 FF 00 07 00 08 07 00 0E 07 00 16 07 00 0E 01 01 00 00 01 00 00 4B 01 01 41 01 FF 00 1C 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 00 01 00 01 07 00 F6 40 01 45 07 00 F6 00 64 07 00 F6 40 01 45 07 00 F6 00 FF 00 0B 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 07 00 16 01 00 00 5E 07 00 F6 00 41 01 07 FF 00 04 00 08 07 00 0E 07 00 16 07 00 0E 01 01 07 00 0C 00 01 00 00 58 07 00 F6 40 01 00 02 FF 00 04 00 08 07 00 0E 07 00 16 07 00 0E 01 01 00 00 01 00 00 52 01 FF 00 00 00 08 07 00 0E 07 00 0E 01 01 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  538    565    568    569    Ljava/lang/RuntimeException;
        //  516    524    527    528    Ljava/lang/RuntimeException;
        //  439    480    483    484    Ljava/lang/RuntimeException;
        //  432    473    476    477    Ljava/lang/RuntimeException;
        //  417    435    438    439    Ljava/lang/RuntimeException;
        //  412    428    431    432    Ljava/lang/RuntimeException;
        //  346    373    376    377    Ljava/lang/RuntimeException;
        //  324    332    335    336    Ljava/lang/RuntimeException;
        //  280    288    291    292    Ljava/lang/RuntimeException;
        //  231    243    246    247    Ljava/lang/RuntimeException;
        //  219    236    239    240    Ljava/lang/RuntimeException;
        //  172    190    193    194    Ljava/lang/RuntimeException;
        //  163    176    179    180    Ljava/lang/RuntimeException;
        //  152    168    171    172    Ljava/lang/RuntimeException;
        //  108    130    133    134    Ljava/lang/RuntimeException;
        //  79     91     94     95     Ljava/lang/RuntimeException;
        //  63     86     89     90     Ljava/lang/RuntimeException;
        //  60     75     78     79     Ljava/lang/RuntimeException;
        //  37     49     52     53     Ljava/lang/RuntimeException;
        //  22     42     45     46     Ljava/lang/RuntimeException;
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
    
    public static boolean flashQuick() {
        final Point nextViewportPoint = Widgets.get(749, 2).getNextViewportPoint();
        Label_0029: {
            boolean b;
            try {
                final boolean click;
                b = (click = Mouse.click(nextViewportPoint, (boolean)(1 != 0)));
                if (Inventory.a != 0) {
                    return click;
                }
                if (b) {
                    break Label_0029;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (b) {
                    Task.sleep(250, 350);
                    return Mouse.click(nextViewportPoint, true);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public static boolean togglePrayer(final PrayerBook p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getBook:()I
        //    10: invokestatic    org/powerbot/game/api/methods/tab/Prayer.isCursesOn:()Z
        //    13: iload_2        
        //    14: ifne            26
        //    17: ifeq            29
        //    20: goto            24
        //    23: athrow         
        //    24: bipush          23
        //    26: goto            31
        //    29: bipush          22
        //    31: if_icmpne       59
        //    34: aload_0        
        //    35: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getRequiredLevel:()I
        //    40: iconst_5       
        //    41: invokestatic    org/powerbot/game/api/methods/tab/Skills.getRealLevel:(I)I
        //    44: iload_2        
        //    45: ifne            77
        //    48: goto            52
        //    51: athrow         
        //    52: if_icmple       62
        //    55: goto            59
        //    58: athrow         
        //    59: iconst_0       
        //    60: ireturn        
        //    61: athrow         
        //    62: aload_0        
        //    63: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.isActive:()Z
        //    68: iload_2        
        //    69: ifne            90
        //    72: iload_1        
        //    73: goto            77
        //    76: athrow         
        //    77: if_icmpne       83
        //    80: iconst_1       
        //    81: ireturn        
        //    82: athrow         
        //    83: getstatic       org/powerbot/game/api/methods/Tabs.PRAYER:Lorg/powerbot/game/api/methods/Tabs;
        //    86: iconst_0       
        //    87: invokevirtual   org/powerbot/game/api/methods/Tabs.open:(Z)Z
        //    90: iload_2        
        //    91: ifne            151
        //    94: ifeq            150
        //    97: goto            101
        //   100: athrow         
        //   101: sipush          271
        //   104: bipush          9
        //   106: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   109: aload_0        
        //   110: invokeinterface org/powerbot/game/api/methods/tab/Prayer$PrayerBook.getId:()I
        //   115: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   118: iload_1        
        //   119: ifeq            138
        //   122: goto            126
        //   125: athrow         
        //   126: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   129: iconst_0       
        //   130: aaload         
        //   131: invokestatic    org/powerbot/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   134: goto            146
        //   137: athrow         
        //   138: getstatic       org/powerbot/game/api/methods/tab/Prayer.z:[Ljava/lang/String;
        //   141: iconst_1       
        //   142: aaload         
        //   143: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   146: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   149: ireturn        
        //   150: iconst_0       
        //   151: ireturn        
        //    StackMapTable: 00 19 FF 00 17 00 03 07 00 0C 01 01 00 01 07 00 F6 40 01 FF 00 01 00 03 07 00 0C 01 01 00 02 01 01 42 01 FF 00 01 00 03 07 00 0C 01 01 00 02 01 01 53 07 00 F6 FF 00 00 00 03 07 00 0C 01 01 00 02 01 01 45 07 00 F6 00 41 07 00 F6 00 4D 07 00 F6 FF 00 00 00 03 07 00 0C 01 01 00 02 01 01 44 07 00 F6 00 46 01 49 07 00 F6 00 57 07 00 F6 40 07 00 8A 4A 07 00 F6 40 07 00 8A FF 00 07 00 03 07 00 0C 01 01 00 02 07 00 8A 07 00 FB 03 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  101    137    137    138    Ljava/lang/RuntimeException;
        //  94     122    125    126    Ljava/lang/RuntimeException;
        //  90     97     100    101    Ljava/lang/RuntimeException;
        //  77     82     82     83     Ljava/lang/RuntimeException;
        //  62     73     76     77     Ljava/lang/RuntimeException;
        //  52     61     61     62     Ljava/lang/RuntimeException;
        //  34     55     58     59     Ljava/lang/RuntimeException;
        //  31     48     51     52     Ljava/lang/RuntimeException;
        //  4      20     23     24     Ljava/lang/RuntimeException;
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
    
    public static boolean flashPrayer(final PrayerBook prayerBook) {
        final int a = Inventory.a;
        boolean open = false;
        Label_0075: {
            try {
                open = Tabs.PRAYER.open(false);
                if (a != 0) {
                    return open;
                }
                if (!open) {
                    break Label_0075;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Point nextViewportPoint = Widgets.get(271, 9).getChild(prayerBook.getId()).getNextViewportPoint();
            Label_0059: {
                boolean click;
                try {
                    click = Mouse.click(nextViewportPoint, true);
                    if (a != 0) {
                        return open;
                    }
                    if (click) {
                        break Label_0059;
                    }
                    break Label_0075;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    if (click) {
                        Task.sleep(250, 350);
                        return Mouse.click(nextViewportPoint, true);
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
        }
        return open;
    }
    
    public static boolean deactivateAll() {
        final int i = Inventory.a;
        PrayerBook[] array2 = null;
        Label_0027: {
            Label_0024: {
                PrayerBook[] array;
                try {
                    array = (array2 = getActive());
                    if (i != 0) {
                        break Label_0027;
                    }
                    final int n = array.length;
                    if (n == 0) {
                        return true;
                    }
                    break Label_0024;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n = array.length;
                    if (n == 0) {
                        return true;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            array2 = getActive();
        }
        final PrayerBook[] array3 = array2;
        final int length = array3.length;
        int n2 = 0;
        while (true) {
            do {
                int j = 0;
            Label_0034:
                while (j < length) {
                    final PrayerBook prayerBook = array3[n2];
                    Label_0133: {
                        Label_0121: {
                            Label_0061: {
                                try {
                                    if (i != 0) {
                                        continue;
                                    }
                                    final PrayerBook prayerBook2 = prayerBook;
                                    final boolean b = false;
                                    final int n3;
                                    final boolean b2;
                                    final boolean length2 = b2 = ((n3 = (togglePrayer(prayerBook2, b) ? 1 : 0)) != 0);
                                    final int n4 = i;
                                    if (n4 == 0) {
                                        break Label_0061;
                                    }
                                    break Label_0133;
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                                try {
                                    final PrayerBook prayerBook2 = prayerBook;
                                    final boolean b = false;
                                    final int n3;
                                    final boolean b2;
                                    final boolean length2 = b2 = ((n3 = (togglePrayer(prayerBook2, b) ? 1 : 0)) != 0);
                                    final int n4 = i;
                                    if (n4 != 0) {
                                        break Label_0133;
                                    }
                                    if (!b2) {
                                        break Label_0121;
                                    }
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            while (new Timer(500L).isRunning()) {
                                int active;
                                j = (active = (prayerBook.isActive() ? 1 : 0));
                                if (i != 0) {
                                    continue Label_0034;
                                }
                                Label_0113: {
                                    try {
                                        if (i != 0) {
                                            break Label_0113;
                                        }
                                        if (j == 0) {
                                            break;
                                        }
                                    }
                                    catch (RuntimeException ex5) {
                                        throw ex5;
                                    }
                                    active = 15;
                                }
                                Task.sleep(active);
                                if (i != 0) {
                                    break;
                                }
                            }
                        }
                        ++n2;
                        continue;
                        try {
                            if (i != 0) {
                                final int n3;
                                return n3 != 0;
                            }
                            final boolean length2;
                            if (length2) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    int n3 = 1;
                    return n3 != 0;
                    n3 = 0;
                    return n3 != 0;
                }
                break;
            } while (i == 0);
            boolean length2;
            int n3 = (length2 = (getActive().length != 0)) ? 1 : 0;
            continue;
        }
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
        String s = "oy\u0010\u00132!\u0000o";
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
                                c2 = 'c';
                                break;
                            }
                            case 1: {
                                c2 = '9';
                                break;
                            }
                            case 2: {
                                c2 = ')';
                                break;
                            }
                            case 3: {
                                c2 = 'Y';
                                break;
                            }
                            default: {
                                c2 = '\t';
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
                    s = "\u0019\u0016vpC@q\u0002\u0013&";
                    n9 = 0;
                    continue Label_0102_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "\t\u0006e}";
                    n9 = 1;
                    continue Label_0102_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "}\u007f\b\u001f'4T{aCMq";
                    n9 = 2;
                    continue Label_0102_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "jh\r\u0001*/\u001e";
                    n9 = 3;
                    continue Label_0102_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "\u0019\u0016dv[Ld\u0017";
                    n9 = 4;
                    continue Label_0102_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "\u000e\u0016{vT]";
                    n9 = 5;
                    continue Label_0102_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = "\u0003\u001bdrC\\w";
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
    
    public enum Normal implements PrayerBook
    {
        THICK_SKIN(0, 0, 1), 
        BURST_OF_STRENGTH(1, 1, 4), 
        CLARITY_OF_THOUGHT(2, 2, 7), 
        SHARP_EYE(3, 12, 8), 
        UNSTOPPABLE_FORCE(4, 14, 8), 
        MYSTIC_WILL(5, 13, 9), 
        CHARGE(6, 15, 9), 
        ROCK_SKIN(0, 0, 10), 
        SUPERHUMAN_STRENGTH(1, 1, 13), 
        IMPROVED_REFLEXES(2, 2, 16), 
        RAPID_RESTORE(7, 3, 19), 
        RAPID_HEAL(8, 4, 22), 
        PROTECT_ITEM_REGULAR(9, 5, 25), 
        HAWK_EYE(3, 12, 26), 
        UNRELENTING_FORCE(4, 14, 26), 
        MYSTIC_LORE(5, 13, 27), 
        SUPER_CHARGE(6, 15, 27), 
        STEEL_SKIN(0, 0, 28), 
        ULTIMATE_STRENGTH(1, 1, 31), 
        INCREDIBLE_REFLEXES(2, 2, 34), 
        PROTECT_FROM_SUMMONING(10, 16, 35), 
        PROTECT_FROM_MAGIC(11, 6, 37), 
        PROTECT_FROM_MISSILES(12, 7, 40), 
        PROTECT_FROM_MELEE(13, 8, 43), 
        EAGLE_EYE(3, 12, 44), 
        OVERPOWERING_FORCE(4, 14, 44), 
        MYSTIC_MIGHT(5, 13, 45), 
        OVERCHARGE(6, 15, 45), 
        RETRIBUTION(14, 9, 46), 
        REDEMPTION(15, 10, 49), 
        SMITE(16, 11, 52), 
        CHIVALRY(17, 27, 60), 
        RAPID_RENEWAL(18, 18, 65), 
        PIETY(19, 19, 70), 
        RIGOUR(20, 21, 74), 
        AUGURY(21, 20, 77);
        
        private final int id;
        private final int shift;
        private final int level;
        private static final String[] z;
        
        private Normal(final int id, final int shift, final int level) {
            this.id = id;
            this.shift = shift;
            this.level = level;
        }
        
        @Override
        public int getId() {
            return this.id;
        }
        
        @Override
        public int getBook() {
            return 22;
        }
        
        @Override
        public int getRequiredLevel() {
            return this.level;
        }
        
        @Override
        public boolean isActive() {
            int value = 0;
            Label_0025: {
                int n;
                try {
                    n = (value = Settings.get(3272, this.shift, 1));
                    if (Inventory.a != 0) {
                        return value != 0;
                    }
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0025;
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
        
        @Override
        public boolean isSetQuick() {
            int value = 0;
            Label_0025: {
                int n;
                try {
                    n = (value = Settings.get(1770, this.shift, 1));
                    if (Inventory.a != 0) {
                        return value != 0;
                    }
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0025;
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
        
        static {
            final String[] z2 = new String[36];
            int n36;
            int n35;
            int n34;
            int n33;
            int n32;
            int n31;
            int n30;
            int n29;
            int n28;
            int n27;
            int n26;
            int n25;
            int n24;
            int n23;
            int n22;
            int n21;
            int n20;
            int n19;
            int n18;
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
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 0))))))))))))))))))))))))))))))))));
            String s = "\u0012O\u0004;wi!`";
            int n37 = -1;
            String intern = null;
        Label_0410_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n39;
                final int n38 = n39 = (length = charArray.length);
                int n40 = 0;
                while (true) {
                    Label_0486: {
                        if (n38 > 1) {
                            break Label_0486;
                        }
                        length = (n39 = n40);
                        do {
                            final char c = charArray[n39];
                            char c2 = '\0';
                            switch (n40 % 5) {
                                case 0: {
                                    c2 = 'o';
                                    break;
                                }
                                case 1: {
                                    c2 = 'M';
                                    break;
                                }
                                case 2: {
                                    c2 = 's';
                                    break;
                                }
                                case 3: {
                                    c2 = '\'';
                                    break;
                                }
                                default: {
                                    c2 = '\b';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n40;
                        } while (n38 == 0);
                    }
                    if (n38 > n40) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n37) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 1)))))))))))))))))))))))))))))))))));
                        s = "\u0001U\u00029sf'f_\u0010\u001eJ\u0012 wb:z";
                        n37 = 0;
                        continue Label_0410_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 2)))))))))))))))))))))))))))))))))));
                        s = "\r}\u0004\u0011mD";
                        n37 = 1;
                        continue Label_0410_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 3)))))))))))))))))))))))))))))))))));
                        s = "v;xK\u0012\u000eB\u0014(";
                        n37 = 2;
                        continue Label_0410_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 4)))))))))))))))))))))))))))))))))));
                        s = "\u001eQ\b?fj$|K\u000b\u001f@\u0012+yw0|";
                        n37 = 3;
                        continue Label_0410_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 5)))))))))))))))))))))))))))))))))));
                        s = "\u001cx\u0002\fqB$UX7\u0000`\u000b\u0011mQ5^";
                        n37 = 4;
                        continue Label_0410_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 6)))))))))))))))))))))))))))))))))));
                        s = "g&kJ\u0016\u000eH\u000b2eq!|W\u0005\u0005O";
                        n37 = 5;
                        continue Label_0410_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 7)))))))))))))))))))))))))))))))))));
                        s = "E(ZR#\u0017a\u000e\u001fvI.^E4\u0011s\u0017\u0016";
                        n37 = 6;
                        continue Label_0410_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 8)))))))))))))))))))))))))))))))))));
                        s = "u:|M\u001b";
                        n37 = 7;
                        continue Label_0410_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 9)))))))))))))))))))))))))))))))))));
                        s = "\u0001U\u00029sf'f_\u0010\u001eJ\u0012 si6|";
                        n37 = 8;
                        continue Label_0410_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 10)))))))))))))))))))))))))))))))))));
                        s = "C3XR=\u001az\u0017\u0017vQ\"LX#\u001cq";
                        n37 = 9;
                        continue Label_0410_Outer;
                    }
                    case 9: {
                        z2[n11] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 11)))))))))))))))))))))))))))))))))));
                        s = "\u0019F\u001a&i`*|";
                        n37 = 10;
                        continue Label_0410_Outer;
                    }
                    case 10: {
                        z2[n12] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 12)))))))))))))))))))))))))))))))))));
                        s = "\u0003F\u001d$rz;|X\u000e";
                        n37 = 11;
                        continue Label_0410_Outer;
                    }
                    case 11: {
                        z2[n13] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 13)))))))))))))))))))))))))))))))))));
                        s = "\u001eQ\b?um2k^\u0007";
                        n37 = 12;
                        continue Label_0410_Outer;
                    }
                    case 12: {
                        z2[n14] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 14)))))))))))))))))))))))))))))))))));
                        s = "F/EC4\u001c`\u001c\u0018jY0UZ8\fg\n\u0012}E";
                        n37 = 13;
                        continue Label_0410_Outer;
                    }
                    case 13: {
                        z2[n15] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 15)))))))))))))))))))))))))))))))))));
                        s = "h*jM\u000b\u0012X\u001a$zi";
                        n37 = 14;
                        continue Label_0410_Outer;
                    }
                    case 14: {
                        z2[n16] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 16)))))))))))))))))))))))))))))))))));
                        s = "E0CC4";
                        n37 = 15;
                        continue Label_0410_Outer;
                    }
                    case 15: {
                        z2[n17] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 17)))))))))))))))))))))))))))))))))));
                        s = "\fa\u0013\u001bjI>BV#\u0018q";
                        n37 = 16;
                        continue Label_0410_Outer;
                    }
                    case 16: {
                        z2[n18] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 18)))))))))))))))))))))))))))))))))));
                        s = "D<Z^5\u0000f\u0006\u0010}A<F";
                        n37 = 17;
                        continue Label_0410_Outer;
                    }
                    case 17: {
                        z2[n19] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 19)))))))))))))))))))))))))))))))))));
                        s = "\u001c|\u0002\f\u007fS";
                        n37 = 18;
                        continue Label_0410_Outer;
                    }
                    case 18: {
                        z2[n20] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 20)))))))))))))))))))))))))))))))))));
                        s = "l>iK\r\u0007B\t2d`5u\\\u001a\u0014T";
                        n37 = 19;
                        continue Label_0410_Outer;
                    }
                    case 19: {
                        z2[n21] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 21)))))))))))))))))))))))))))))))))));
                        s = "\u0012m\u0010\nqU\"G^6\u0017`";
                        n37 = 20;
                        continue Label_0410_Outer;
                    }
                    case 20: {
                        z2[n22] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 22)))))))))))))))))))))))))))))))))));
                        s = "S<M[4\u0000q\u001a\u001b";
                        n37 = 21;
                        continue Label_0410_Outer;
                    }
                    case 21: {
                        z2[n23] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 23)))))))))))))))))))))))))))))))))));
                        s = "\u000ff\f\n}U)UQ#\u0010y\u001c\rm[0EY8\u0011s";
                        n37 = 22;
                        continue Label_0410_Outer;
                    }
                    case 22: {
                        z2[n24] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 24)))))))))))))))))))))))))))))))))));
                        s = "\u000ff\f\n}U)U^%\u001ay\u001c\f}Q(FV#";
                        n37 = 23;
                        continue Label_0410_Outer;
                    }
                    case 23: {
                        z2[n25] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 25)))))))))))))))))))))))))))))))))));
                        s = "\u0010R\n8d|";
                        n37 = 24;
                        continue Label_0410_Outer;
                    }
                    case 24: {
                        z2[n26] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 26)))))))))))))))))))))))))))))))))));
                        s = "h*jM\u000b\u0012X\u0001\"d`";
                        n37 = 25;
                        continue Label_0410_Outer;
                    }
                    case 25: {
                        z2[n27] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 27)))))))))))))))))))))))))))))))))));
                        s = "\u0002S\b(zz rP\f";
                        n37 = 26;
                        continue Label_0410_Outer;
                    }
                    case 26: {
                        z2[n28] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 28)))))))))))))))))))))))))))))))))));
                        s = "l=zK\u0007\u0015N\u000f!sz!|_\u000e\u0014_\b>";
                        n37 = 27;
                        continue Label_0410_Outer;
                    }
                    case 27: {
                        z2[n29] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 29)))))))))))))))))))))))))))))))))));
                        s = "C1^^<\u001e`\u0006\u0001kB/OY6\u000b|";
                        n37 = 28;
                        continue Label_0410_Outer;
                    }
                    case 28: {
                        z2[n30] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 30)))))))))))))))))))))))))))))))))));
                        s = "\u000b|\n\u001dsI.A^?";
                        n37 = 29;
                        continue Label_0410_Outer;
                    }
                    case 29: {
                        z2[n31] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 31)))))))))))))))))))))))))))))))))));
                        s = "\u0003B\t({u'pV\f";
                        n37 = 30;
                        continue Label_0410_Outer;
                    }
                    case 30: {
                        z2[n32] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 32)))))))))))))))))))))))))))))))))));
                        s = "D8^E8\u001da\u0017\u0017wX";
                        n37 = 31;
                        continue Label_0410_Outer;
                    }
                    case 31: {
                        z2[n33] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 33)))))))))))))))))))))))))))))))))));
                        s = "w<zR\u001d\u0002L\u0004#";
                        n37 = 32;
                        continue Label_0410_Outer;
                    }
                    case 32: {
                        z2[n34] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 34)))))))))))))))))))))))))))))))))));
                        s = "C3YC>\u000fd\u0002\u001ctS\"LX#\u001cq";
                        n37 = 33;
                        continue Label_0410_Outer;
                    }
                    case 33: {
                        z2[n35] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = 35)))))))))))))))))))))))))))))))))));
                        s = "D<Z^5\u0000f\u0006\rlY/O";
                        n37 = 34;
                        continue Label_0410_Outer;
                    }
                    case 34: {
                        break Label_0410_Outer;
                    }
                }
            }
            z2[n36] = intern;
            z = z2;
        }
    }
    
    public interface PrayerBook
    {
        int getId();
        
        int getBook();
        
        int getRequiredLevel();
        
        boolean isActive();
        
        boolean isSetQuick();
    }
    
    public enum Curses implements PrayerBook
    {
        PROTECT_ITEM_CURSE(0, 0, 50), 
        SAP_WARRIOR(1, 1, 50), 
        SAP_RANGER(2, 2, 52), 
        SAP_RANGE_STRENGTH(3, 25, 53), 
        SAP_MAGE(4, 3, 54), 
        SAP_MAGIC_STRENGTH(5, 24, 55), 
        SAP_SPIRIT(6, 4, 56), 
        SAP_DEFENCE(7, 27, 57), 
        SAP_STRENGTH(8, 26, 58), 
        BERSERKER(9, 5, 59), 
        DEFLECT_SUMMONING(10, 6, 62), 
        DEFLECT_MAGIC(11, 7, 65), 
        DEFLECT_MISSILE(12, 8, 68), 
        DEFLECT_MELEE(13, 9, 71), 
        LEECH_ATTACK(14, 10, 74), 
        LEECH_RANGED(15, 11, 76), 
        LEECH_RANGE_STRENGTH(16, 20, 77), 
        LEECH_MAGIC(17, 12, 78), 
        LEECH_MAGIC_STRENGTH(18, 21, 79), 
        LEECH_DEFENCE(19, 13, 80), 
        LEECH_STRENGTH(20, 14, 82), 
        LEECH_ENERGY(21, 15, 84), 
        LEECH_ADRENALINE(22, 16, 86), 
        WRATH(23, 17, 89), 
        SOUL_SPLIT(24, 18, 92), 
        TURMOIL(25, 19, 95), 
        ANGUISH(26, 22, 95), 
        TORMENT(27, 23, 95);
        
        private final int id;
        private final int shift;
        private final int level;
        private static final String[] z;
        
        private Curses(final int id, final int shift, final int level) {
            this.id = id;
            this.shift = shift;
            this.level = level;
        }
        
        @Override
        public int getId() {
            return this.id;
        }
        
        @Override
        public int getBook() {
            return 23;
        }
        
        @Override
        public int getRequiredLevel() {
            return this.level;
        }
        
        @Override
        public boolean isActive() {
            int value = 0;
            Label_0025: {
                int n;
                try {
                    n = (value = Settings.get(3275, this.shift, 1));
                    if (Inventory.a != 0) {
                        return value != 0;
                    }
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0025;
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
        
        @Override
        public boolean isSetQuick() {
            int value = 0;
            Label_0025: {
                int n;
                try {
                    n = (value = Settings.get(1768, this.shift, 1));
                    if (Inventory.a != 0) {
                        return value != 0;
                    }
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0025;
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
        
        static {
            final String[] z2 = new String[28];
            int n28;
            int n27;
            int n26;
            int n25;
            int n24;
            int n23;
            int n22;
            int n21;
            int n20;
            int n19;
            int n18;
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
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 0))))))))))))))))))))))))));
            String s = "$6e\u000egJG\u0012e\u0002";
            int n29 = -1;
            String intern = null;
        Label_0322_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n31;
                final int n30 = n31 = (length = charArray.length);
                int n32 = 0;
                while (true) {
                    Label_0397: {
                        if (n30 > 1) {
                            break Label_0397;
                        }
                        length = (n31 = n32);
                        do {
                            final char c = charArray[n31];
                            char c2 = '\0';
                            switch (n32 % 5) {
                                case 0: {
                                    c2 = '\u0002';
                                    break;
                                }
                                case 1: {
                                    c2 = 'b';
                                    break;
                                }
                                case 2: {
                                    c2 = 'E';
                                    break;
                                }
                                case 3: {
                                    c2 = 'Y';
                                    break;
                                }
                                default: {
                                    c2 = 'M';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n32;
                        } while (n30 == 0);
                    }
                    if (n30 > n32) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n29) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 1)))))))))))))))))))))))))));
                        s = "$8`\u001djXY\u0019i\u0004";
                        n29 = 0;
                        continue Label_0322_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 2)))))))))))))))))))))))))));
                        s = "\u00074C\u0011LTf\u0000F\u0015\u0006";
                        n29 = 1;
                        continue Label_0322_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 3)))))))))))))))))))))))))));
                        s = "Fu\u0002P\u0017\u00152Z\rDF`\u0000J\u0014\u0013![";
                        n29 = 2;
                        continue Label_0322_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 4)))))))))))))))))))))))))));
                        s = "\u00074C\u0011_Pr\u0017A\u0019\u0011";
                        n29 = 3;
                        continue Label_0322_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 5)))))))))))))))))))))))))));
                        s = "\u00180V\rSJy\u0013H\u0013\u0017";
                        n29 = 4;
                        continue Label_0322_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 6)))))))))))))))))))))))))));
                        s = ";<u\u0001pFE\u001fb\u00112&c\u0016j\\Y\u0019x\u001e";
                        n29 = 5;
                        continue Label_0322_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 7)))))))))))))))))))))))))));
                        s = "\u00100U\u0002^V`\rB\u001f\u00180V";
                        n29 = 6;
                        continue Label_0322_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 8)))))))))))))))))))))))))));
                        s = ";<u\u0001pFD\n~\u00139>d\n";
                        n29 = 7;
                        continue Label_0322_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 9)))))))))))))))))))))))))));
                        s = "'+\u007f\u0016}ZC\u0001e\u000224o\u0001mKD\u001b";
                        n29 = 8;
                        continue Label_0322_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 10)))))))))))))))))))))))))));
                        s = "\u0000:A\u0003^[`";
                        n29 = 9;
                        continue Label_0322_Outer;
                    }
                    case 9: {
                        z2[n11] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 11)))))))))))))))))))))))))));
                        s = "\u00180V\rSJp\u0017I\u001f\u001a6V";
                        n29 = 10;
                        continue Label_0322_Outer;
                    }
                    case 10: {
                        z2[n12] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 12)))))))))))))))))))))))))));
                        s = ";<u\u0001pFZ\u001fk\u001f4&c\u0016j\\Y\u0019x\u001e";
                        n29 = 11;
                        continue Label_0322_Outer;
                    }
                    case 11: {
                        z2[n13] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 13)))))))))))))))))))))))))));
                        s = "XY\u0019y\u001f$1";
                        n29 = 12;
                        continue Label_0322_Outer;
                    }
                    case 12: {
                        z2[n14] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 14)))))))))))))))))))))))))));
                        s = "Fu\u0002P\b\u0015;T\u000bDF`\u0000J\u0014\u0013![";
                        n29 = 13;
                        continue Label_0322_Outer;
                    }
                    case 13: {
                        z2[n15] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 15)))))))))))))))))))))))))));
                        s = "\u00100U\u0002^V`\rB\u001b\u0013<P";
                        n29 = 14;
                        continue Label_0322_Outer;
                    }
                    case 14: {
                        z2[n16] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 16)))))))))))))))))))))))))));
                        s = "]R\u0018`\u00134-o\u0011mTZ\u0011b\u001f9>";
                        n29 = 15;
                        continue Label_0322_Outer;
                    }
                    case 15: {
                        z2[n17] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 17)))))))))))))))))))))))))));
                        s = ";<u\u0001pFV\u001a~\u001398|\u000bv\\";
                        n29 = 16;
                        continue Label_0322_Outer;
                    }
                    case 16: {
                        z2[n18] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 18)))))))))))))))))))))))))));
                        s = ";<u\u0001pFV\nx\u001742";
                        n29 = 17;
                        continue Label_0322_Outer;
                    }
                    case 17: {
                        z2[n19] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 19)))))))))))))))))))))))))));
                        s = "Yq\u0017L\u0012\u000b'R\u0000\\Pp";
                        n29 = 18;
                        continue Label_0322_Outer;
                    }
                    case 18: {
                        z2[n20] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 20)))))))))))))))))))))))))));
                        s = "\u00160A\u001d^G\u007f\u0017]";
                        n29 = 19;
                        continue Label_0322_Outer;
                    }
                    case 19: {
                        z2[n21] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 21)))))))))))))))))))))))))));
                        s = "\u0003'R\u001aS";
                        n29 = 20;
                        continue Label_0322_Outer;
                    }
                    case 20: {
                        z2[n22] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 22)))))))))))))))))))))))))));
                        s = "]R\u0018`\u00134-o\u000fqJD\u0017`\u0013";
                        n29 = 21;
                        continue Label_0322_Outer;
                    }
                    case 21: {
                        z2[n23] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 23)))))))))))))))))))))))))));
                        s = "Yq\u0017L\u0012\u000b0]\u000bIRm";
                        n29 = 22;
                        continue Label_0322_Outer;
                    }
                    case 22: {
                        z2[n24] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 24)))))))))))))))))))))))))));
                        s = "$8`\u001dkI^\fe\u0002";
                        n29 = 23;
                        continue Label_0322_Outer;
                    }
                    case 23: {
                        z2[n25] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 25)))))))))))))))))))))))))));
                        s = "$8`\u001dkME\u001bb\u0011#1";
                        n29 = 24;
                        continue Label_0322_Outer;
                    }
                    case 24: {
                        z2[n26] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 26)))))))))))))))))))))))))));
                        s = "\u0000 A\u0003T\\x";
                        n29 = 25;
                        continue Label_0322_Outer;
                    }
                    case 25: {
                        z2[n27] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = 27)))))))))))))))))))))))))));
                        s = "$8`\u001duXP\u001b";
                        n29 = 26;
                        continue Label_0322_Outer;
                    }
                    case 26: {
                        break Label_0322_Outer;
                    }
                }
            }
            z2[n28] = intern;
            z = z2;
        }
    }
}
