
package org.powerbot.game.api.methods;

import java.awt.Canvas;
import java.awt.Dimension;
import org.powerbot.game.client.BaseInfo;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.client.RSHintArrow;
import java.util.HashSet;
import org.powerbot.game.api.wrappers.HintArrow;
import java.util.Set;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.client.Client;
import org.powerbot.core.Bot;
import org.powerbot.game.bot.Context;

public class Game
{
    public static final int INDEX_LOGIN_SCREEN = 3;
    public static final int INDEX_LOBBY_SCREEN = 7;
    public static final int INDEX_LOGGING_IN = 9;
    public static final int INDEX_MAP_LOADED = 11;
    public static final int INDEX_MAP_LOADING = 12;
    public static final int[] INDEX_LOGGED_IN;
    private static final String[] z;
    
    public static int getClientState() {
        final int a = Widgets.a;
        final Client client = Context.client();
        final Constants constants = Bot.constants();
        final int loginIndex = client.getLoginIndex();
        Label_0111: {
            int n5 = 0;
            int n9 = 0;
            Label_0098: {
                int n4 = 0;
                int clientstate_11 = 0;
                Label_0083: {
                    Label_0078: {
                        int n3 = 0;
                        int n8 = 0;
                        Label_0063: {
                            Label_0058: {
                                int n2 = 0;
                                int n7 = 0;
                                Label_0043: {
                                    Label_0038: {
                                        int n;
                                        int n6;
                                        try {
                                            n = (n2 = (n3 = (n4 = (n5 = loginIndex))));
                                            n6 = (n7 = (n8 = (clientstate_11 = (n9 = constants.CLIENTSTATE_3))));
                                            if (a != 0) {
                                                break Label_0043;
                                            }
                                            if (n == n6) {
                                                return 3;
                                            }
                                            break Label_0038;
                                        }
                                        catch (RuntimeException ex) {
                                            throw ex;
                                        }
                                        try {
                                            if (n == n6) {
                                                return 3;
                                            }
                                        }
                                        catch (RuntimeException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    n3 = (n2 = (n4 = (n5 = loginIndex)));
                                    n8 = (n7 = (clientstate_11 = (n9 = constants.CLIENTSTATE_7)));
                                    try {
                                        if (a != 0) {
                                            break Label_0063;
                                        }
                                        if (n2 == n7) {
                                            return 7;
                                        }
                                        break Label_0058;
                                    }
                                    catch (RuntimeException ex3) {
                                        throw ex3;
                                    }
                                }
                                try {
                                    if (n2 == n7) {
                                        return 7;
                                    }
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            n4 = (n3 = (n5 = loginIndex));
                            clientstate_11 = (n8 = (n9 = constants.CLIENTSTATE_9));
                            try {
                                if (a != 0) {
                                    break Label_0083;
                                }
                                if (n3 == n8) {
                                    return 9;
                                }
                                break Label_0078;
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            if (n3 == n8) {
                                return 9;
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    n5 = (n4 = loginIndex);
                    n9 = (clientstate_11 = constants.CLIENTSTATE_11);
                    try {
                        if (a != 0) {
                            break Label_0111;
                        }
                        if (n4 == clientstate_11) {
                            return 11;
                        }
                        break Label_0098;
                    }
                    catch (RuntimeException ex7) {
                        throw ex7;
                    }
                }
                try {
                    if (n4 == clientstate_11) {
                        return 11;
                    }
                }
                catch (RuntimeException ex8) {
                    throw ex8;
                }
                try {
                    final int n10 = n5 = loginIndex;
                    if (a != 0) {
                        return n10;
                    }
                    n9 = constants.CLIENTSTATE_12;
                }
                catch (RuntimeException ex9) {
                    throw ex9;
                }
            }
            try {
                if (n5 == n9) {
                    return 12;
                }
            }
            catch (RuntimeException ex10) {
                throw ex10;
            }
        }
        return -1;
    }
    
    public static boolean isLoggedIn() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //     8: istore_0       
        //     9: getstatic       org/powerbot/game/api/methods/Game.INDEX_LOGGED_IN:[I
        //    12: astore_1       
        //    13: aload_1        
        //    14: arraylength    
        //    15: istore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_2        
        //    20: if_icmpge       63
        //    23: aload_1        
        //    24: iload_3        
        //    25: iaload         
        //    26: istore          4
        //    28: iload           5
        //    30: ifne            58
        //    33: iload_0        
        //    34: iload           5
        //    36: ifne            64
        //    39: goto            43
        //    42: athrow         
        //    43: iload           4
        //    45: if_icmpne       55
        //    48: goto            52
        //    51: athrow         
        //    52: iconst_1       
        //    53: ireturn        
        //    54: athrow         
        //    55: iinc            3, 1
        //    58: iload           5
        //    60: ifeq            18
        //    63: iconst_0       
        //    64: ireturn        
        //    StackMapTable: 00 0A FF 00 12 00 06 01 07 00 E3 01 01 00 01 00 00 FF 00 17 00 06 01 07 00 E3 01 01 01 01 00 01 07 00 D0 40 01 47 07 00 D0 00 41 07 00 D0 00 02 FF 00 04 00 06 01 07 00 E3 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  43     54     54     55     Ljava/lang/RuntimeException;
        //  33     48     51     52     Ljava/lang/RuntimeException;
        //  28     39     42     43     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    public static int getPlane() {
        return Context.client().getPlane();
    }
    
    public static int getBaseX() {
        return Context.client().getRSGroundInfo().getBaseInfo().getX();
    }
    
    public static int getBaseY() {
        return Context.client().getRSGroundInfo().getBaseInfo().getY();
    }
    
    public static Set<HintArrow> getHintArrows() {
        final int a = Widgets.a;
        final HashSet<HintArrow> set = new HashSet<HintArrow>();
        final RSHintArrow[] rsHintArrows = Context.client().getRSHintArrows();
        RSHintArrow[] array = null;
        Label_0043: {
            Label_0039: {
                Label_0036: {
                    try {
                        array = rsHintArrows;
                        if (a != 0) {
                            break Label_0036;
                        }
                        if (array == null) {
                            break Label_0039;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                break Label_0043;
            }
            final RSHintArrow[] array2 = new RSHintArrow[0];
        }
        final RSHintArrow[] array3 = array;
        final int length = array3.length;
        int i = 0;
        while (i < length) {
            final RSHintArrow rsHintArrow = array3[i];
            Label_0099: {
                Label_0076: {
                    try {
                        if (a != 0) {
                            break Label_0099;
                        }
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        if (rsHintArrow2 != null) {
                            break Label_0076;
                        }
                        break Label_0076;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        if (rsHintArrow2 != null) {
                            set.add(new HintArrow(rsHintArrow));
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        return set;
    }
    
    public static Tile getMapBase() {
        final BaseInfo baseInfo = Context.client().getRSGroundInfo().getBaseInfo();
        return new Tile(baseInfo.getX(), baseInfo.getY(), getPlane());
    }
    
    public static int getLoopCycle() {
        return Context.client().getLoopCycle();
    }
    
    public static int getCrossHairType() {
        return Context.client().getCrossHairType();
    }
    
    public static Dimension getDimensions() {
        final Canvas canvas = Context.client().getCanvas();
        return new Dimension(canvas.getWidth(), canvas.getHeight());
    }
    
    public static boolean logout(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //     7: bipush          7
        //     9: iload_3        
        //    10: ifne            52
        //    13: if_icmpne       36
        //    16: goto            20
        //    19: athrow         
        //    20: iload_0        
        //    21: iload_3        
        //    22: ifne            72
        //    25: goto            29
        //    28: athrow         
        //    29: ifne            71
        //    32: goto            36
        //    35: athrow         
        //    36: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //    39: iload_3        
        //    40: ifne            79
        //    43: goto            47
        //    46: athrow         
        //    47: iconst_3       
        //    48: goto            52
        //    51: athrow         
        //    52: if_icmpne       73
        //    55: iload_0        
        //    56: iload_3        
        //    57: ifne            79
        //    60: goto            64
        //    63: athrow         
        //    64: ifne            73
        //    67: goto            71
        //    70: athrow         
        //    71: iconst_1       
        //    72: ireturn        
        //    73: getstatic       org/powerbot/game/api/methods/Tabs.LOGOUT:Lorg/powerbot/game/api/methods/Tabs;
        //    76: invokevirtual   org/powerbot/game/api/methods/Tabs.open:()Z
        //    79: iload_3        
        //    80: ifne            323
        //    83: ifeq            322
        //    86: goto            90
        //    89: athrow         
        //    90: sipush          182
        //    93: iload_0        
        //    94: iload_3        
        //    95: ifne            111
        //    98: goto            102
        //   101: athrow         
        //   102: ifeq            114
        //   105: goto            109
        //   108: athrow         
        //   109: bipush          6
        //   111: goto            116
        //   114: bipush          13
        //   116: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   119: astore_1       
        //   120: aload_1        
        //   121: iload_3        
        //   122: ifne            133
        //   125: ifnull          322
        //   128: goto            132
        //   131: athrow         
        //   132: aload_1        
        //   133: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   136: iload_3        
        //   137: ifne            323
        //   140: ifeq            322
        //   143: goto            147
        //   146: athrow         
        //   147: aload_1        
        //   148: new             Ljava/lang/StringBuilder;
        //   151: dup            
        //   152: invokespecial   java/lang/StringBuilder.<init>:()V
        //   155: getstatic       org/powerbot/game/api/methods/Game.z:[Ljava/lang/String;
        //   158: iconst_2       
        //   159: aaload         
        //   160: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
        //   163: iload_3        
        //   164: ifne            199
        //   167: goto            171
        //   170: athrow         
        //   171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   174: iload_0        
        //   175: ifeq            194
        //   178: goto            182
        //   181: athrow         
        //   182: getstatic       org/powerbot/game/api/methods/Game.z:[Ljava/lang/String;
        //   185: iconst_1       
        //   186: aaload         
        //   187: invokestatic    org/powerbot/game/api/util/Time.e:(Ljava/lang/String;)Ljava/lang/String;
        //   190: goto            202
        //   193: athrow         
        //   194: getstatic       org/powerbot/game/api/methods/Game.z:[Ljava/lang/String;
        //   197: iconst_0       
        //   198: aaload         
        //   199: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
        //   202: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   205: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   208: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.interact:(Ljava/lang/String;)Z
        //   211: iload_3        
        //   212: ifne            323
        //   215: ifeq            322
        //   218: goto            222
        //   221: athrow         
        //   222: iconst_0       
        //   223: istore_2       
        //   224: iload_2        
        //   225: bipush          10
        //   227: if_icmpge       322
        //   230: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //   233: iload_3        
        //   234: ifne            323
        //   237: bipush          7
        //   239: iload_3        
        //   240: ifne            278
        //   243: goto            247
        //   246: athrow         
        //   247: if_icmpne       270
        //   250: goto            254
        //   253: athrow         
        //   254: iload_0        
        //   255: iload_3        
        //   256: ifne            306
        //   259: goto            263
        //   262: athrow         
        //   263: ifne            305
        //   266: goto            270
        //   269: athrow         
        //   270: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //   273: iconst_3       
        //   274: goto            278
        //   277: athrow         
        //   278: iload_3        
        //   279: ifne            315
        //   282: if_icmpne       307
        //   285: goto            289
        //   288: athrow         
        //   289: iload_0        
        //   290: iload_3        
        //   291: ifne            312
        //   294: goto            298
        //   297: athrow         
        //   298: ifne            307
        //   301: goto            305
        //   304: athrow         
        //   305: iconst_1       
        //   306: ireturn        
        //   307: iinc            2, 1
        //   310: bipush          100
        //   312: sipush          200
        //   315: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   318: iload_3        
        //   319: ifeq            224
        //   322: iconst_0       
        //   323: ireturn        
        //    StackMapTable: 00 40 FF 00 13 00 04 01 00 00 01 00 01 07 00 D0 00 47 07 00 D0 40 01 45 07 00 D0 00 49 07 00 D0 40 01 43 07 00 D0 FF 00 00 00 04 01 00 00 01 00 02 01 01 4A 07 00 D0 40 01 45 07 00 D0 00 40 01 00 45 01 49 07 00 D0 00 4A 07 00 D0 FF 00 00 00 04 01 00 00 01 00 02 01 01 45 07 00 D0 40 01 FF 00 01 00 04 01 00 00 01 00 02 01 01 42 01 FF 00 01 00 04 01 00 00 01 00 02 01 01 FF 00 0E 00 04 01 07 00 7F 00 01 00 01 07 00 D0 00 40 07 00 7F 4C 07 00 D0 00 56 07 00 D0 FF 00 00 00 04 01 07 00 7F 00 01 00 03 07 00 7F 07 00 26 07 00 D4 49 07 00 D0 FF 00 00 00 04 01 07 00 7F 00 01 00 02 07 00 7F 07 00 26 4A 07 00 D0 FF 00 00 00 04 01 07 00 7F 00 01 00 02 07 00 7F 07 00 26 FF 00 04 00 04 01 07 00 7F 00 01 00 03 07 00 7F 07 00 26 07 00 D4 FF 00 02 00 04 01 07 00 7F 00 01 00 03 07 00 7F 07 00 26 07 00 D4 52 07 00 D0 00 FF 00 01 00 04 01 07 00 7F 01 01 00 00 55 07 00 D0 FF 00 00 00 04 01 07 00 7F 01 01 00 02 01 01 45 07 00 D0 00 47 07 00 D0 40 01 45 07 00 D0 00 46 07 00 D0 FF 00 00 00 04 01 07 00 7F 01 01 00 02 01 01 49 07 00 D0 00 47 07 00 D0 40 01 45 07 00 D0 00 40 01 00 44 01 FF 00 02 00 04 01 07 00 7F 01 01 00 02 01 01 FF 00 06 00 04 01 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  289    301    304    305    Ljava/lang/RuntimeException;
        //  282    294    297    298    Ljava/lang/RuntimeException;
        //  278    285    288    289    Ljava/lang/RuntimeException;
        //  263    274    277    278    Ljava/lang/RuntimeException;
        //  254    266    269    270    Ljava/lang/RuntimeException;
        //  247    259    262    263    Ljava/lang/RuntimeException;
        //  237    250    253    254    Ljava/lang/RuntimeException;
        //  230    243    246    247    Ljava/lang/RuntimeException;
        //  202    218    221    222    Ljava/lang/RuntimeException;
        //  171    193    193    194    Ljava/lang/RuntimeException;
        //  147    178    181    182    Ljava/lang/RuntimeException;
        //  140    167    170    171    Ljava/lang/RuntimeException;
        //  133    143    146    147    Ljava/lang/RuntimeException;
        //  120    128    131    132    Ljava/lang/RuntimeException;
        //  90     105    108    109    Ljava/lang/RuntimeException;
        //  83     98     101    102    Ljava/lang/RuntimeException;
        //  79     86     89     90     Ljava/lang/RuntimeException;
        //  55     67     70     71     Ljava/lang/RuntimeException;
        //  52     60     63     64     Ljava/lang/RuntimeException;
        //  36     48     51     52     Ljava/lang/RuntimeException;
        //  29     43     46     47     Ljava/lang/RuntimeException;
        //  20     32     35     36     Ljava/lang/RuntimeException;
        //  13     25     28     29     Ljava/lang/RuntimeException;
        //  4      16     19     20     Ljava/lang/RuntimeException;
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
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "NjDM\u0014";
        int n4 = -1;
        String intern = null;
    Label_0053_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0130: {
                    if (n5 > 1) {
                        break Label_0130;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = 'Z';
                                break;
                            }
                            case 1: {
                                c2 = 'r';
                                break;
                            }
                            case 2: {
                                c2 = '{';
                                break;
                            }
                            case 3: {
                                c2 = 'S';
                                break;
                            }
                            default: {
                                c2 = '\"';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "\u000b)\u0004\u0005F";
                    n4 = 0;
                    continue Label_0053_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "hRe\u007fuvj\u0003";
                    n4 = 1;
                    continue Label_0053_Outer;
                }
                case 1: {
                    break Label_0053_Outer;
                }
            }
        }
        z2[n3] = intern;
        z = z2;
        INDEX_LOGGED_IN = new int[] { 11, 12 };
    }
}
