
package org.powerbot.core.randoms;

import org.powerbot.game.api.Manifest;

@Manifest(name = "Squeal of Fortune Ticket Claim", authors = { "Timer" }, description = "Destroys tickets.")
public class SpinTickets extends AntiRandom
{
    public static final int ITEM_ID_SPIN_TICKET = 24154;
    public static final int ITEM_ID_SPIN_TICKET_X2 = 24155;
    private static final String[] z;
    
    @Override
    public boolean activate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //     7: ifeq            102
        //    10: invokestatic    org/powerbot/game/api/methods/Tabs.getCurrent:()Lorg/powerbot/game/api/methods/Tabs;
        //    13: getstatic       org/powerbot/game/api/methods/Tabs.INVENTORY:Lorg/powerbot/game/api/methods/Tabs;
        //    16: if_acmpne       102
        //    19: goto            23
        //    22: athrow         
        //    23: iconst_1       
        //    24: iload_1        
        //    25: ifne            87
        //    28: goto            32
        //    31: athrow         
        //    32: newarray        I
        //    34: dup            
        //    35: iconst_0       
        //    36: sipush          24154
        //    39: iastore        
        //    40: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    43: ifnonnull       77
        //    46: goto            50
        //    49: athrow         
        //    50: iconst_1       
        //    51: iload_1        
        //    52: ifne            87
        //    55: goto            59
        //    58: athrow         
        //    59: newarray        I
        //    61: dup            
        //    62: iconst_0       
        //    63: sipush          24155
        //    66: iastore        
        //    67: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    70: ifnull          102
        //    73: goto            77
        //    76: athrow         
        //    77: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    80: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isIdle:()Z
        //    83: goto            87
        //    86: athrow         
        //    87: iload_1        
        //    88: ifne            99
        //    91: ifeq            102
        //    94: goto            98
        //    97: athrow         
        //    98: iconst_1       
        //    99: goto            103
        //   102: iconst_0       
        //   103: ireturn        
        //    StackMapTable: 00 11 FF 00 16 00 02 07 00 18 01 00 01 07 00 8E 00 47 07 00 8E 40 01 50 07 00 8E 00 47 07 00 8E 40 01 50 07 00 8E 00 48 07 00 8E 40 01 49 07 00 8E 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  87     94     97     98     Ljava/lang/RuntimeException;
        //  59     83     86     87     Ljava/lang/RuntimeException;
        //  50     73     76     77     Ljava/lang/RuntimeException;
        //  32     55     58     59     Ljava/lang/RuntimeException;
        //  23     46     49     50     Ljava/lang/RuntimeException;
        //  10     28     31     32     Ljava/lang/RuntimeException;
        //  4      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
    
    @Override
    public void execute() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: iconst_1       
        //     6: newarray        I
        //     8: dup            
        //     9: iconst_0       
        //    10: sipush          24154
        //    13: iastore        
        //    14: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    17: astore_1       
        //    18: aload_1        
        //    19: iload           11
        //    21: ifne            45
        //    24: ifnonnull       44
        //    27: goto            31
        //    30: athrow         
        //    31: iconst_1       
        //    32: newarray        I
        //    34: dup            
        //    35: iconst_0       
        //    36: sipush          24155
        //    39: iastore        
        //    40: invokestatic    org/powerbot/game/api/methods/tab/Inventory.getItem:([I)Lorg/powerbot/game/api/wrappers/node/Item;
        //    43: astore_1       
        //    44: aload_1        
        //    45: iload           11
        //    47: ifne            58
        //    50: ifnull          368
        //    53: goto            57
        //    56: athrow         
        //    57: aload_1        
        //    58: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    61: astore_2       
        //    62: aload_2        
        //    63: getstatic       org/powerbot/core/randoms/SpinTickets.z:[Ljava/lang/String;
        //    66: iconst_1       
        //    67: aaload         
        //    68: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //    71: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //    74: ifeq            368
        //    77: new             Lorg/powerbot/game/api/util/Timer;
        //    80: dup            
        //    81: sipush          2000
        //    84: sipush          3500
        //    87: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //    90: i2l            
        //    91: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    94: astore_3       
        //    95: aload_3        
        //    96: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    99: ifeq            147
        //   102: sipush          1183
        //   105: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //   108: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //   111: iload           11
        //   113: ifne            150
        //   116: iload           11
        //   118: ifne            150
        //   121: goto            125
        //   124: athrow         
        //   125: ifne            147
        //   128: goto            132
        //   131: athrow         
        //   132: sipush          150
        //   135: invokestatic    org/powerbot/core/randoms/SpinTickets.sleep:(I)V
        //   138: iload           11
        //   140: ifeq            95
        //   143: goto            147
        //   146: athrow         
        //   147: sipush          1183
        //   150: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //   153: astore          4
        //   155: aload           4
        //   157: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //   160: ifeq            368
        //   163: aconst_null    
        //   164: astore          5
        //   166: aload           4
        //   168: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   171: astore          6
        //   173: aload           6
        //   175: arraylength    
        //   176: istore          7
        //   178: iconst_0       
        //   179: istore          8
        //   181: iload           8
        //   183: iload           7
        //   185: if_icmpge       286
        //   188: aload           6
        //   190: iload           8
        //   192: aaload         
        //   193: astore          9
        //   195: iload           11
        //   197: ifne            368
        //   200: aload           9
        //   202: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getTooltip:()Ljava/lang/String;
        //   205: dup            
        //   206: astore          10
        //   208: iload           11
        //   210: ifne            229
        //   213: ifnull          280
        //   216: goto            220
        //   219: athrow         
        //   220: aload           10
        //   222: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   225: goto            229
        //   228: athrow         
        //   229: getstatic       org/powerbot/core/randoms/SpinTickets.z:[Ljava/lang/String;
        //   232: iconst_0       
        //   233: aaload         
        //   234: invokestatic    org/powerbot/game/api/util/Time.e:(Ljava/lang/String;)Ljava/lang/String;
        //   237: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   240: iload           11
        //   242: ifne            270
        //   245: ifeq            280
        //   248: goto            252
        //   251: athrow         
        //   252: aload           9
        //   254: iload           11
        //   256: ifne            275
        //   259: goto            263
        //   262: athrow         
        //   263: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.visible:()Z
        //   266: goto            270
        //   269: athrow         
        //   270: ifeq            280
        //   273: aload           9
        //   275: astore          5
        //   277: goto            286
        //   280: iinc            8, 1
        //   283: goto            181
        //   286: aload           5
        //   288: iload           11
        //   290: ifne            303
        //   293: ifnonnull       301
        //   296: goto            300
        //   299: athrow         
        //   300: return         
        //   301: aload           5
        //   303: getstatic       org/powerbot/core/randoms/SpinTickets.z:[Ljava/lang/String;
        //   306: iconst_1       
        //   307: aaload         
        //   308: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   311: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   314: ifeq            368
        //   317: aload_3        
        //   318: invokevirtual   org/powerbot/game/api/util/Timer.reset:()V
        //   321: goto            325
        //   324: athrow         
        //   325: aload_3        
        //   326: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   329: ifeq            368
        //   332: aload_2        
        //   333: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   336: iload           11
        //   338: ifne            360
        //   341: ifeq            368
        //   344: goto            348
        //   347: athrow         
        //   348: bipush          100
        //   350: sipush          300
        //   353: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   356: goto            360
        //   359: athrow         
        //   360: invokestatic    org/powerbot/core/randoms/SpinTickets.sleep:(I)V
        //   363: iload           11
        //   365: ifeq            325
        //   368: return         
        //    StackMapTable: 00 28 FF 00 1E 00 0C 07 00 18 07 00 39 00 00 00 00 00 00 00 00 00 01 00 01 07 00 8E 00 0C 40 07 00 39 4A 07 00 8E 00 40 07 00 39 FF 00 24 00 0C 07 00 18 07 00 39 07 00 3B 07 00 0A 00 00 00 00 00 00 00 01 00 00 5C 07 00 8E 40 01 45 07 00 8E 00 4D 07 00 8E 00 42 01 FF 00 1E 00 0C 07 00 18 07 00 39 07 00 3B 07 00 0A 07 00 44 05 07 00 A0 01 01 00 00 01 00 00 FF 00 25 00 0C 07 00 18 07 00 39 07 00 3B 07 00 0A 07 00 44 05 07 00 A0 01 01 07 00 3B 07 00 49 01 00 01 07 00 8E 00 47 07 00 8E 40 07 00 49 55 07 00 8E 00 49 07 00 8E 40 07 00 3B 45 07 00 8E 40 01 44 07 00 3B 04 FF 00 05 00 0C 07 00 18 07 00 39 07 00 3B 07 00 0A 07 00 44 07 00 3B 07 00 A0 01 01 00 00 01 00 00 4C 07 00 8E 00 00 41 07 00 3B 54 07 00 8E 00 55 07 00 8E 00 4A 07 00 8E 40 01 FF 00 07 00 0C 07 00 18 07 00 39 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  341    356    359    360    Ljava/lang/RuntimeException;
        //  332    344    347    348    Ljava/lang/RuntimeException;
        //  303    321    324    325    Ljava/lang/RuntimeException;
        //  286    296    299    300    Ljava/lang/RuntimeException;
        //  252    266    269    270    Ljava/lang/RuntimeException;
        //  245    259    262    263    Ljava/lang/RuntimeException;
        //  229    248    251    252    Ljava/lang/RuntimeException;
        //  213    225    228    229    Ljava/lang/RuntimeException;
        //  208    216    219    220    Ljava/lang/RuntimeException;
        //  125    143    146    147    Ljava/lang/RuntimeException;
        //  116    128    131    132    Ljava/lang/RuntimeException;
        //  102    121    124    125    Ljava/lang/RuntimeException;
        //  45     53     56     57     Ljava/lang/RuntimeException;
        //  18     27     30     31     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0125:
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
        String s = "or%7jmG";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0117: {
                    if (n4 > 1) {
                        break Label_0117;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '6';
                                break;
                            }
                            case 1: {
                                c2 = '#';
                                break;
                            }
                            case 2: {
                                c2 = 'K';
                                break;
                            }
                            case 3: {
                                c2 = 'w';
                                break;
                            }
                            default: {
                                c2 = '\u0005';
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
                    s = "l$&ai;D";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
}
