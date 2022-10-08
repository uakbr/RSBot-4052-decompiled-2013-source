
package org.powerbot.game.api.methods.widget;

import org.powerbot.s;
import org.powerbot.core.bot.handlers.ScriptHandler;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.p;
import org.powerbot.game.api.util.node.HashTable;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.api.util.Filter;
import org.powerbot.game.api.methods.Game;

public class Lobby
{
    public static final int STATE_LOBBY_IDLE = 7;
    public static final int STATE_LOGGING_IN = 9;
    public static final int LOGIN_DEFAULT_TIMEOUT = 30000;
    public static final int WIDGET_MAIN_LOBBY = 906;
    public static final int WIDGET_BUTTON_PLAY_GAME = 197;
    public static final int WIDGET_BUTTON_LOGOUT = 221;
    public static final int WIDGET_LABEL_CURRENT_WORLD = 11;
    public static final int WIDGET_WORLDS_TABLE = 62;
    public static final int WIDGET_WORLDS_TABLE_SCROLLBAR = 86;
    public static final int WIDGET_WORLDS_ROWS = 77;
    public static final int WIDGET_WORLDS_COLUMN_FAVOURITE = 68;
    public static final int WIDGET_WORLDS_COLUMN_WORLD_NUMBER = 69;
    public static final int WIDGET_WORLDS_COLUMN_MEMBERS = 70;
    public static final int WIDGET_WORLDS_COLUMN_PLAYERS = 71;
    public static final int WIDGET_WORLDS_COLUMN_ACTIVITY = 72;
    public static final int WIDGET_WORLDS_COLUMN_LOOT_SHARE = 75;
    public static final int WIDGET_WORLDS_COLUMN_PING = 76;
    private static final String z;
    
    public static boolean isOpen() {
        int clientState = 0;
        Label_0018: {
            int n;
            try {
                n = (clientState = Game.getClientState());
                if (Bank.a != 0) {
                    return clientState != 0;
                }
                final int n2 = 7;
                if (n == n2) {
                    break Label_0018;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = 7;
                if (n != n2) {
                    return false;
                }
                clientState = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return clientState != 0;
        clientState = 0;
        return clientState != 0;
    }
    
    public static boolean close() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Lobby.isOpen:()Z
        //     7: iload_1        
        //     8: ifne            37
        //    11: ifeq            36
        //    14: goto            18
        //    17: athrow         
        //    18: invokestatic    org/powerbot/game/api/methods/widget/Lobby.closeDialog:()Z
        //    21: iload_1        
        //    22: ifne            41
        //    25: goto            29
        //    28: athrow         
        //    29: ifne            38
        //    32: goto            36
        //    35: athrow         
        //    36: iconst_0       
        //    37: ireturn        
        //    38: sipush          906
        //    41: sipush          221
        //    44: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    47: astore_0       
        //    48: aload_0        
        //    49: iload_1        
        //    50: ifne            61
        //    53: ifnull          99
        //    56: goto            60
        //    59: athrow         
        //    60: aload_0        
        //    61: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    64: iload_1        
        //    65: ifne            84
        //    68: ifeq            99
        //    71: goto            75
        //    74: athrow         
        //    75: aload_0        
        //    76: iconst_1       
        //    77: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //    80: goto            84
        //    83: athrow         
        //    84: iload_1        
        //    85: ifne            96
        //    88: ifeq            99
        //    91: goto            95
        //    94: athrow         
        //    95: iconst_1       
        //    96: goto            100
        //    99: iconst_0       
        //   100: ireturn        
        //    StackMapTable: 00 15 FF 00 11 00 02 00 01 00 01 07 01 09 00 49 07 01 09 40 01 45 07 01 09 00 40 01 00 42 01 FF 00 11 00 02 07 00 84 01 00 01 07 01 09 00 40 07 00 84 4C 07 01 09 00 47 07 01 09 40 01 49 07 01 09 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  84     91     94     95     Ljava/lang/RuntimeException;
        //  68     80     83     84     Ljava/lang/RuntimeException;
        //  61     71     74     75     Ljava/lang/RuntimeException;
        //  48     56     59     60     Ljava/lang/RuntimeException;
        //  18     32     35     36     Ljava/lang/RuntimeException;
        //  11     25     28     29     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    public static boolean enterGame() {
        return enterGame(30000);
    }
    
    public static boolean enterGame(final int n) {
        return enterGame(null, n);
    }
    
    public static boolean enterGame(final World world) {
        return enterGame(world, 30000);
    }
    
    public static boolean enterGame(final World p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //     8: iload           4
        //    10: ifne            29
        //    13: bipush          7
        //    15: if_icmpne       223
        //    18: goto            22
        //    21: athrow         
        //    22: invokestatic    org/powerbot/game/api/methods/widget/Lobby.closeDialog:()Z
        //    25: goto            29
        //    28: athrow         
        //    29: iload           4
        //    31: ifne            86
        //    34: ifeq            85
        //    37: goto            41
        //    40: athrow         
        //    41: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.OPTIONS:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    44: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.isOpen:()Z
        //    47: iload           4
        //    49: ifne            73
        //    52: goto            56
        //    55: athrow         
        //    56: ifeq            87
        //    59: goto            63
        //    62: athrow         
        //    63: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.PLAYER_INFO:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    66: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.open:()Z
        //    69: goto            73
        //    72: athrow         
        //    73: iload           4
        //    75: ifne            86
        //    78: ifne            87
        //    81: goto            85
        //    84: athrow         
        //    85: iconst_0       
        //    86: ireturn        
        //    87: aload_0        
        //    88: iload           4
        //    90: ifne            103
        //    93: ifnull          106
        //    96: goto            100
        //    99: athrow         
        //   100: invokestatic    org/powerbot/game/api/methods/widget/Lobby.getSelectedWorld:()Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   103: goto            107
        //   106: aconst_null    
        //   107: astore_2       
        //   108: aload_2        
        //   109: iload           4
        //   111: ifne            122
        //   114: ifnull          161
        //   117: goto            121
        //   120: athrow         
        //   121: aload_2        
        //   122: aload_0        
        //   123: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$World.equals:(Ljava/lang/Object;)Z
        //   126: iload           4
        //   128: ifne            164
        //   131: ifne            161
        //   134: goto            138
        //   137: athrow         
        //   138: aload_0        
        //   139: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$World.click:()Z
        //   142: iload           4
        //   144: ifne            164
        //   147: goto            151
        //   150: athrow         
        //   151: ifne            161
        //   154: goto            158
        //   157: athrow         
        //   158: iconst_0       
        //   159: ireturn        
        //   160: athrow         
        //   161: sipush          906
        //   164: sipush          197
        //   167: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   170: astore_3       
        //   171: aload_3        
        //   172: iload           4
        //   174: ifne            185
        //   177: ifnull          221
        //   180: goto            184
        //   183: athrow         
        //   184: aload_3        
        //   185: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   188: iload           4
        //   190: ifne            222
        //   193: ifeq            221
        //   196: goto            200
        //   199: athrow         
        //   200: aload_3        
        //   201: iconst_1       
        //   202: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //   205: iload           4
        //   207: ifne            222
        //   210: goto            214
        //   213: athrow         
        //   214: ifne            223
        //   217: goto            221
        //   220: athrow         
        //   221: iconst_0       
        //   222: ireturn        
        //   223: new             Lorg/powerbot/game/api/util/Timer;
        //   226: dup            
        //   227: iload_1        
        //   228: i2l            
        //   229: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   232: astore_2       
        //   233: aload_2        
        //   234: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   237: ifeq            373
        //   240: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //   243: iload           4
        //   245: ifne            376
        //   248: iload           4
        //   250: ifne            376
        //   253: goto            257
        //   256: athrow         
        //   257: ifne            373
        //   260: goto            264
        //   263: athrow         
        //   264: invokestatic    org/powerbot/game/api/methods/widget/Lobby.getOpenDialog:()Lorg/powerbot/game/api/methods/widget/Lobby$Dialog;
        //   267: astore_3       
        //   268: iload           4
        //   270: ifne            329
        //   273: aload_3        
        //   274: getstatic       org/powerbot/game/api/methods/widget/Lobby$Dialog.TRANSFER_COUNTDOWN:Lorg/powerbot/game/api/methods/widget/Lobby$Dialog;
        //   277: if_acmpeq       321
        //   280: goto            284
        //   283: athrow         
        //   284: aload_3        
        //   285: iload           4
        //   287: ifne            339
        //   290: goto            294
        //   293: athrow         
        //   294: ifnull          334
        //   297: goto            301
        //   300: athrow         
        //   301: aload_3        
        //   302: iload           4
        //   304: ifne            339
        //   307: goto            311
        //   310: athrow         
        //   311: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Dialog.clickContinue:()Z
        //   314: ifeq            334
        //   317: goto            321
        //   320: athrow         
        //   321: aload_2        
        //   322: invokevirtual   org/powerbot/game/api/util/Timer.reset:()V
        //   325: goto            329
        //   328: athrow         
        //   329: iload           4
        //   331: ifeq            360
        //   334: aload_3        
        //   335: goto            339
        //   338: athrow         
        //   339: ifnull          360
        //   342: sipush          500
        //   345: sipush          1000
        //   348: invokestatic    org/powerbot/core/script/job/Task.sleep:(II)V
        //   351: iload           4
        //   353: ifeq            373
        //   356: goto            360
        //   359: athrow         
        //   360: iconst_5       
        //   361: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   364: iload           4
        //   366: ifeq            233
        //   369: goto            373
        //   372: athrow         
        //   373: invokestatic    org/powerbot/game/api/methods/Game.isLoggedIn:()Z
        //   376: ireturn        
        //    StackMapTable: 00 45 FF 00 15 00 05 07 00 2B 01 00 00 01 00 01 07 01 09 00 45 07 01 09 40 01 4A 07 01 09 00 4D 07 01 09 40 01 45 07 01 09 00 48 07 01 09 40 01 4A 07 01 09 00 40 01 00 4B 07 01 09 00 42 07 00 2B 02 40 07 00 2B FF 00 0C 00 05 07 00 2B 01 07 00 2B 00 01 00 01 07 01 09 00 40 07 00 2B 4E 07 01 09 00 4B 07 01 09 40 01 45 07 01 09 00 41 07 01 09 00 42 01 FF 00 12 00 05 07 00 2B 01 07 00 2B 07 00 84 01 00 01 07 01 09 00 40 07 00 84 4D 07 01 09 00 4C 07 01 09 40 01 45 07 01 09 00 40 01 FF 00 00 00 05 07 00 2B 01 00 00 01 00 00 FF 00 09 00 05 07 00 2B 01 07 00 11 00 01 00 00 56 07 01 09 40 01 45 07 01 09 00 FF 00 12 00 05 07 00 2B 01 07 00 11 07 00 3E 01 00 01 07 01 09 00 48 07 01 09 40 07 00 3E 45 07 01 09 00 48 07 01 09 40 07 00 3E 48 07 01 09 00 46 07 01 09 00 04 43 07 01 09 40 07 00 3E 53 07 01 09 00 4B 07 01 09 FF 00 00 00 05 07 00 2B 01 07 00 11 00 01 00 00 42 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  342    369    372    373    Ljava/lang/RuntimeException;
        //  339    356    359    360    Ljava/lang/RuntimeException;
        //  329    335    338    339    Ljava/lang/RuntimeException;
        //  311    325    328    329    Ljava/lang/RuntimeException;
        //  301    317    320    321    Ljava/lang/RuntimeException;
        //  294    307    310    311    Ljava/lang/RuntimeException;
        //  284    297    300    301    Ljava/lang/RuntimeException;
        //  273    290    293    294    Ljava/lang/RuntimeException;
        //  268    280    283    284    Ljava/lang/RuntimeException;
        //  248    260    263    264    Ljava/lang/RuntimeException;
        //  240    253    256    257    Ljava/lang/RuntimeException;
        //  200    217    220    221    Ljava/lang/RuntimeException;
        //  193    210    213    214    Ljava/lang/RuntimeException;
        //  185    196    199    200    Ljava/lang/RuntimeException;
        //  171    180    183    184    Ljava/lang/RuntimeException;
        //  151    160    160    161    Ljava/lang/RuntimeException;
        //  138    154    157    158    Ljava/lang/RuntimeException;
        //  131    147    150    151    Ljava/lang/RuntimeException;
        //  122    134    137    138    Ljava/lang/RuntimeException;
        //  108    117    120    121    Ljava/lang/RuntimeException;
        //  87     96     99     100    Ljava/lang/RuntimeException;
        //  73     81     84     85     Ljava/lang/RuntimeException;
        //  56     69     72     73     Ljava/lang/RuntimeException;
        //  41     59     62     63     Ljava/lang/RuntimeException;
        //  34     52     55     56     Ljava/lang/RuntimeException;
        //  29     37     40     41     Ljava/lang/RuntimeException;
        //  13     25     28     29     Ljava/lang/RuntimeException;
        //  5      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0041:
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
    
    public static World getSelectedWorld() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/widget/Lobby.isOpen:()Z
        //     7: iload_3        
        //     8: ifne            21
        //    11: ifeq            77
        //    14: goto            18
        //    17: athrow         
        //    18: invokestatic    org/powerbot/game/api/methods/widget/Lobby.closeDialog:()Z
        //    21: iload_3        
        //    22: ifne            53
        //    25: ifeq            77
        //    28: goto            32
        //    31: athrow         
        //    32: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    35: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getPanelWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    38: iload_3        
        //    39: ifne            86
        //    42: goto            46
        //    45: athrow         
        //    46: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //    49: goto            53
        //    52: athrow         
        //    53: ifne            80
        //    56: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    59: iload_3        
        //    60: ifne            83
        //    63: goto            67
        //    66: athrow         
        //    67: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.open:()Z
        //    70: ifne            80
        //    73: goto            77
        //    76: athrow         
        //    77: aconst_null    
        //    78: areturn        
        //    79: athrow         
        //    80: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    83: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getPanelWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    86: astore_0       
        //    87: aload_0        
        //    88: iload_3        
        //    89: ifne            107
        //    92: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //    95: ifeq            118
        //    98: goto            102
        //   101: athrow         
        //   102: aload_0        
        //   103: goto            107
        //   106: athrow         
        //   107: bipush          11
        //   109: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   112: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   115: goto            119
        //   118: aconst_null    
        //   119: astore_1       
        //   120: aload_1        
        //   121: iload_3        
        //   122: ifne            142
        //   125: ifnull          181
        //   128: goto            132
        //   131: athrow         
        //   132: getstatic       org/powerbot/game/api/methods/widget/Lobby.z:Ljava/lang/String;
        //   135: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   138: goto            142
        //   141: athrow         
        //   142: invokestatic    java/util/regex/Pattern.compile:(Ljava/lang/String;)Ljava/util/regex/Pattern;
        //   145: aload_1        
        //   146: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   149: astore_2       
        //   150: aload_2        
        //   151: invokevirtual   java/util/regex/Matcher.find:()Z
        //   154: iload_3        
        //   155: ifne            177
        //   158: ifeq            181
        //   161: goto            165
        //   164: athrow         
        //   165: aload_2        
        //   166: iconst_1       
        //   167: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   170: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   173: goto            177
        //   176: athrow         
        //   177: invokestatic    org/powerbot/game/api/methods/widget/Lobby.getWorld:(I)Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   180: areturn        
        //   181: aconst_null    
        //   182: areturn        
        //    StackMapTable: 00 20 FF 00 11 00 04 00 00 00 01 00 01 07 01 09 00 42 01 49 07 01 09 00 4C 07 01 09 40 07 00 9C 45 07 01 09 40 01 4C 07 01 09 40 07 00 40 48 07 01 09 00 41 07 01 09 00 42 07 00 40 42 07 00 9C FF 00 0E 00 04 07 00 9C 00 00 01 00 01 07 01 09 00 43 07 01 09 40 07 00 9C 0A 40 07 01 0E FF 00 0B 00 04 07 00 9C 07 01 0E 00 01 00 01 07 01 09 00 48 07 01 09 40 07 01 0E FF 00 15 00 04 07 00 9C 07 01 0E 07 00 A2 01 00 01 07 01 09 00 4A 07 01 09 40 01 FF 00 03 00 04 07 00 9C 07 01 0E 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  158    173    176    177    Ljava/lang/RuntimeException;
        //  150    161    164    165    Ljava/lang/RuntimeException;
        //  125    138    141    142    Ljava/lang/RuntimeException;
        //  120    128    131    132    Ljava/lang/RuntimeException;
        //  92     103    106    107    Ljava/lang/RuntimeException;
        //  87     98     101    102    Ljava/lang/RuntimeException;
        //  67     79     79     80     Ljava/lang/RuntimeException;
        //  56     73     76     77     Ljava/lang/RuntimeException;
        //  53     63     66     67     Ljava/lang/RuntimeException;
        //  32     49     52     53     Ljava/lang/RuntimeException;
        //  25     42     45     46     Ljava/lang/RuntimeException;
        //  21     28     31     32     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0032:
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
    
    public static World getWorld(final int n) {
        final World[] worlds = getWorlds(new Filter<World>() {
            @Override
            public boolean accept(final World world) {
                int number = 0;
                Label_0021: {
                    int n;
                    try {
                        n = (number = world.getNumber());
                        if (Bank.a != 0) {
                            return number != 0;
                        }
                        final Filter<World> filter = this;
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
                        final Filter<World> filter = this;
                        final int n2 = n;
                        if (n != n2) {
                            return false;
                        }
                        number = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return number != 0;
                number = (false ? 1 : 0);
                return number != 0;
            }
        });
        World[] array2 = null;
        Label_0028: {
            World[] array;
            try {
                array = (array2 = worlds);
                if (Bank.a != 0) {
                    return array2[0];
                }
                final int n2 = array.length;
                final int n3 = 1;
                if (n2 == n3) {
                    break Label_0028;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = array.length;
                final int n3 = 1;
                if (n2 != n3) {
                    return null;
                }
                array2 = worlds;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return array2[0];
        world = null;
        return world;
    }
    
    public static World[] getWorlds() {
        return getWorlds(new Filter<World>() {
            @Override
            public boolean accept(final World world) {
                return true;
            }
        });
    }
    
    public static World[] getWorlds(final Filter<World> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Lobby.isOpen:()Z
        //     8: iload           9
        //    10: ifne            40
        //    13: ifeq            39
        //    16: goto            20
        //    19: athrow         
        //    20: invokestatic    org/powerbot/game/api/methods/widget/Lobby.closeDialog:()Z
        //    23: iload           9
        //    25: ifne            40
        //    28: goto            32
        //    31: athrow         
        //    32: ifne            44
        //    35: goto            39
        //    38: athrow         
        //    39: iconst_0       
        //    40: anewarray       Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //    43: areturn        
        //    44: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    47: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getPanelWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    50: astore_1       
        //    51: aload_1        
        //    52: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
        //    55: iload           9
        //    57: ifne            77
        //    60: ifne            94
        //    63: goto            67
        //    66: athrow         
        //    67: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
        //    70: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.open:()Z
        //    73: goto            77
        //    76: athrow         
        //    77: iload           9
        //    79: ifne            90
        //    82: ifne            94
        //    85: goto            89
        //    88: athrow         
        //    89: iconst_0       
        //    90: anewarray       Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //    93: areturn        
        //    94: new             Ljava/util/ArrayList;
        //    97: dup            
        //    98: invokespecial   java/util/ArrayList.<init>:()V
        //   101: astore_2       
        //   102: aload_1        
        //   103: bipush          77
        //   105: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   108: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   111: astore_3       
        //   112: aload_3        
        //   113: astore          4
        //   115: aload           4
        //   117: arraylength    
        //   118: istore          5
        //   120: iconst_0       
        //   121: istore          6
        //   123: iload           6
        //   125: iload           5
        //   127: if_icmpge       196
        //   130: aload           4
        //   132: iload           9
        //   134: ifne            207
        //   137: iload           6
        //   139: aaload         
        //   140: astore          7
        //   142: new             Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   145: dup            
        //   146: aload           7
        //   148: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //   151: aconst_null    
        //   152: invokespecial   org/powerbot/game/api/methods/widget/Lobby$World.<init>:(ILorg/powerbot/game/api/methods/widget/Lobby$1;)V
        //   155: astore          8
        //   157: iload           9
        //   159: ifne            191
        //   162: aload_0        
        //   163: aload           8
        //   165: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   170: ifeq            188
        //   173: goto            177
        //   176: athrow         
        //   177: aload_2        
        //   178: aload           8
        //   180: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   183: pop            
        //   184: goto            188
        //   187: athrow         
        //   188: iinc            6, 1
        //   191: iload           9
        //   193: ifeq            123
        //   196: aload_2        
        //   197: aload_2        
        //   198: invokevirtual   java/util/ArrayList.size:()I
        //   201: anewarray       Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   204: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   207: checkcast       [Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   210: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/methods/widget/Lobby$World;>;)[Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //    StackMapTable: 00 18 FF 00 13 00 0A 07 00 B1 00 00 00 00 00 00 00 00 01 00 01 07 01 09 00 4A 07 01 09 40 01 45 07 01 09 00 40 01 03 FF 00 15 00 0A 07 00 B1 07 00 9C 00 00 00 00 00 00 00 01 00 01 07 01 09 00 48 07 01 09 40 01 4A 07 01 09 00 40 01 03 FF 00 1C 00 0A 07 00 B1 07 00 9C 07 00 2C 07 01 1D 07 01 1D 01 01 00 00 01 00 00 FF 00 34 00 0A 07 00 B1 07 00 9C 07 00 2C 07 01 1D 07 01 1D 01 01 07 00 84 07 00 2B 01 00 01 07 01 09 00 49 07 01 09 00 02 FF 00 04 00 0A 07 00 B1 07 00 9C 07 00 2C 07 01 1D 07 01 1D 01 01 00 00 01 00 00 4A 07 01 1F
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  162    184    187    188    Ljava/lang/RuntimeException;
        //  157    173    176    177    Ljava/lang/RuntimeException;
        //  77     85     88     89     Ljava/lang/RuntimeException;
        //  60     73     76     77     Ljava/lang/RuntimeException;
        //  51     63     66     67     Ljava/lang/RuntimeException;
        //  20     35     38     39     Ljava/lang/RuntimeException;
        //  13     28     31     32     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
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
    
    public static Dialog getOpenDialog() {
        final int a = Bank.a;
        final Dialog[] values = Dialog.values();
        final int length = values.length;
        int i = 0;
        while (i < length) {
            final Dialog dialog = values[i];
            Label_0045: {
                Label_0042: {
                    try {
                        if (a != 0) {
                            break Label_0045;
                        }
                        final Dialog dialog2 = dialog;
                        final boolean b = dialog2.isOpen();
                        if (b) {
                            return dialog;
                        }
                        break Label_0042;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Dialog dialog2 = dialog;
                        final boolean b = dialog2.isOpen();
                        if (b) {
                            return dialog;
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
    
    private static boolean closeDialog() {
        final int a = Bank.a;
        final Dialog openDialog = getOpenDialog();
        Label_0043: {
            boolean hasBack = false;
            boolean clickBack = false;
            Label_0035: {
                boolean b = false;
                Label_0021: {
                    Dialog dialog;
                    try {
                        dialog = openDialog;
                        if (a != 0) {
                            break Label_0021;
                        }
                        if (dialog == null) {
                            return true;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        b = (clickBack = (hasBack = dialog.hasBack()));
                        if (a != 0) {
                            break Label_0043;
                        }
                        if (b) {
                            break Label_0035;
                        }
                        return false;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (!b) {
                        return false;
                    }
                    hasBack = (clickBack = openDialog.clickBack());
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (a != 0) {
                    return hasBack;
                }
                if (!clickBack) {
                    return false;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        return true;
        return false;
        hasBack = true;
        return hasBack;
    }
    
    static {
        final char[] charArray = "Nq3S<&(}[^t\fu\u0005".toCharArray();
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
                            c2 = '\u0015';
                            break;
                        }
                        case 1: {
                            c2 = 'q';
                            break;
                        }
                        case 2: {
                            c2 = 'Y';
                            break;
                        }
                        case 3: {
                            c2 = 'v';
                            break;
                        }
                        default: {
                            c2 = 'U';
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
    
    public static class World
    {
        private final int number;
        private final boolean members;
        private final String activity;
        private final boolean lootShare;
        private int players;
        private int ping;
        private boolean favorite;
        
        private World(final int n) {
            final int a = Bank.a;
            final Widget panelWidget = Tab.WORLD_SELECT.getPanelWidget();
            int textureId2 = 0;
            Label_0129: {
                Label_0128: {
                    Label_0120: {
                        int n4 = 0;
                        Label_0072: {
                            Label_0071: {
                                Label_0063: {
                                    int n2;
                                    try {
                                        this.number = Integer.parseInt(panelWidget.getChild(69).getChild(n).getText());
                                        final int textureId;
                                        n2 = (textureId = panelWidget.getChild(70).getChild(n).getTextureId());
                                        if (a != 0) {
                                            break Label_0063;
                                        }
                                        final int n3 = 1531;
                                        if (n2 == n3) {
                                            break Label_0063;
                                        }
                                        break Label_0071;
                                    }
                                    catch (NumberFormatException ex) {
                                        throw ex;
                                    }
                                    try {
                                        final int n3 = 1531;
                                        if (n2 != n3) {
                                            break Label_0071;
                                        }
                                        final int textureId = 1;
                                    }
                                    catch (NumberFormatException ex2) {
                                        throw ex2;
                                    }
                                }
                                break Label_0072;
                            }
                            int textureId = 0;
                            try {
                                this.members = (textureId != 0);
                                this.activity = panelWidget.getChild(72).getChild(n).getText();
                                n4 = (textureId2 = panelWidget.getChild(75).getChild(n).getTextureId());
                                if (a != 0) {
                                    break Label_0120;
                                }
                                final int n5 = 699;
                                if (n4 == n5) {
                                    break Label_0120;
                                }
                                break Label_0128;
                            }
                            catch (NumberFormatException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            final int n5 = 699;
                            if (n4 != n5) {
                                break Label_0128;
                            }
                            textureId2 = 1;
                        }
                        catch (NumberFormatException ex4) {
                            throw ex4;
                        }
                    }
                    break Label_0129;
                }
                textureId2 = 0;
            }
            this.lootShare = (textureId2 != 0);
            this.players = this.getPlayers();
            this.ping = this.getPing();
            this.favorite = this.isFavorite();
        }
        
        private static int getWidgetIndex(final int p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore          6
            //     5: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
            //     8: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getPanelWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
            //    11: astore_1       
            //    12: aload_1        
            //    13: iload           6
            //    15: ifne            26
            //    18: ifnull          41
            //    21: goto            25
            //    24: athrow         
            //    25: aload_1        
            //    26: iload           6
            //    28: ifne            45
            //    31: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.validate:()Z
            //    34: ifne            44
            //    37: goto            41
            //    40: athrow         
            //    41: iconst_m1      
            //    42: ireturn        
            //    43: athrow         
            //    44: aload_1        
            //    45: bipush          69
            //    47: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //    50: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //    53: astore_2       
            //    54: aload_2        
            //    55: arraylength    
            //    56: istore_3       
            //    57: iconst_0       
            //    58: istore          4
            //    60: iload           4
            //    62: iload_3        
            //    63: if_icmpge       120
            //    66: aload_2        
            //    67: iload           4
            //    69: aaload         
            //    70: astore          5
            //    72: iload           6
            //    74: ifne            115
            //    77: aload           5
            //    79: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
            //    82: iload_0        
            //    83: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
            //    86: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //    89: iload           6
            //    91: ifne            121
            //    94: goto            98
            //    97: athrow         
            //    98: ifeq            112
            //   101: goto            105
            //   104: athrow         
            //   105: aload           5
            //   107: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
            //   110: ireturn        
            //   111: athrow         
            //   112: iinc            4, 1
            //   115: iload           6
            //   117: ifeq            60
            //   120: iconst_m1      
            //   121: ireturn        
            //    StackMapTable: 00 12 FF 00 18 00 07 01 07 00 52 00 00 00 00 01 00 01 07 00 1A 00 40 07 00 52 4D 07 00 1A 00 41 07 00 1A 00 40 07 00 52 FF 00 0E 00 07 01 07 00 52 07 00 AD 01 01 00 01 00 00 FF 00 24 00 07 01 07 00 52 07 00 AD 01 01 07 00 54 01 00 01 07 00 1A 40 01 45 07 00 1A 00 45 07 00 1A 00 02 FF 00 04 00 07 01 07 00 52 07 00 AD 01 01 00 01 00 00 40 01
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  98     111    111    112    Ljava/lang/NumberFormatException;
            //  77     101    104    105    Ljava/lang/NumberFormatException;
            //  72     94     97     98     Ljava/lang/NumberFormatException;
            //  31     43     43     44     Ljava/lang/NumberFormatException;
            //  26     37     40     41     Ljava/lang/NumberFormatException;
            //  12     21     24     25     Ljava/lang/NumberFormatException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
        
        public int getNumber() {
            return this.number;
        }
        
        public boolean isMembers() {
            return this.members;
        }
        
        public String getActivity() {
            return this.activity;
        }
        
        public boolean isLootShare() {
            return this.lootShare;
        }
        
        public int getPlayers() {
            final int widgetIndex = getWidgetIndex(this.number);
            int n = 0;
            Label_0059: {
                try {
                    n = widgetIndex;
                    if (Bank.a != 0) {
                        return n;
                    }
                    if (n == -1) {
                        break Label_0059;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Widget panelWidget = Tab.WORLD_SELECT.getPanelWidget();
                try {
                    this.players = Integer.parseInt(panelWidget.getChild(71).getChild(widgetIndex).getText());
                }
                catch (NumberFormatException ex2) {
                    this.players = -1;
                }
            }
            final int players = this.players;
            return n;
        }
        
        public int getPing() {
            final int widgetIndex = getWidgetIndex(this.number);
            int n = 0;
            Label_0061: {
                try {
                    n = widgetIndex;
                    if (Bank.a != 0) {
                        return n;
                    }
                    if (n == -1) {
                        break Label_0061;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Widget panelWidget = Tab.WORLD_SELECT.getPanelWidget();
                try {
                    this.ping = Integer.parseInt(panelWidget.getChild(76).getChild(widgetIndex).getText());
                }
                catch (NumberFormatException ex2) {
                    this.ping = 999;
                }
            }
            final int ping = this.ping;
            return n;
        }
        
        public boolean isFavorite() {
            final int a = Bank.a;
            final int widgetIndex = getWidgetIndex(this.number);
            int n = 0;
            Label_0072: {
                try {
                    n = widgetIndex;
                    if (a != 0) {
                        return n != 0;
                    }
                    if (n == -1) {
                        break Label_0072;
                    }
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                final Widget panelWidget = Tab.WORLD_SELECT.getPanelWidget();
                int textureId = 0;
                Label_0069: {
                    Label_0068: {
                        Label_0060: {
                            int n2;
                            try {
                                n2 = (textureId = panelWidget.getChild(68).getChild(widgetIndex).getTextureId());
                                if (a != 0) {
                                    break Label_0060;
                                }
                                final int n3 = 1541;
                                if (n2 == n3) {
                                    break Label_0060;
                                }
                                break Label_0068;
                            }
                            catch (NumberFormatException ex2) {
                                throw ex2;
                            }
                            try {
                                final int n3 = 1541;
                                if (n2 != n3) {
                                    break Label_0068;
                                }
                                textureId = 1;
                            }
                            catch (NumberFormatException ex3) {
                                throw ex3;
                            }
                        }
                        break Label_0069;
                    }
                    textureId = 0;
                }
                this.favorite = (textureId != 0);
            }
            final boolean favorite = this.favorite;
            return n != 0;
        }
        
        public boolean click() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore          8
            //     5: invokestatic    org/powerbot/game/api/methods/widget/Lobby.isOpen:()Z
            //     8: iload           8
            //    10: ifne            65
            //    13: ifeq            64
            //    16: goto            20
            //    19: athrow         
            //    20: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
            //    23: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.isOpen:()Z
            //    26: iload           8
            //    28: ifne            52
            //    31: goto            35
            //    34: athrow         
            //    35: ifne            66
            //    38: goto            42
            //    41: athrow         
            //    42: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
            //    45: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.open:()Z
            //    48: goto            52
            //    51: athrow         
            //    52: iload           8
            //    54: ifne            65
            //    57: ifne            66
            //    60: goto            64
            //    63: athrow         
            //    64: iconst_0       
            //    65: ireturn        
            //    66: invokestatic    org/powerbot/game/api/methods/widget/Lobby.getSelectedWorld:()Lorg/powerbot/game/api/methods/widget/Lobby$World;
            //    69: astore_1       
            //    70: aload_1        
            //    71: iload           8
            //    73: ifne            108
            //    76: ifnull          107
            //    79: goto            83
            //    82: athrow         
            //    83: aload_1        
            //    84: aload_0        
            //    85: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$World.equals:(Ljava/lang/Object;)Z
            //    88: iload           8
            //    90: ifne            114
            //    93: goto            97
            //    96: athrow         
            //    97: ifeq            107
            //   100: goto            104
            //   103: athrow         
            //   104: iconst_1       
            //   105: ireturn        
            //   106: athrow         
            //   107: aload_0        
            //   108: getfield        org/powerbot/game/api/methods/widget/Lobby$World.number:I
            //   111: invokestatic    org/powerbot/game/api/methods/widget/Lobby$World.getWidgetIndex:(I)I
            //   114: istore_2       
            //   115: iload_2        
            //   116: iload           8
            //   118: ifne            134
            //   121: iconst_m1      
            //   122: if_icmpne       135
            //   125: goto            129
            //   128: athrow         
            //   129: iconst_0       
            //   130: goto            134
            //   133: athrow         
            //   134: ireturn        
            //   135: getstatic       org/powerbot/game/api/methods/widget/Lobby$Tab.WORLD_SELECT:Lorg/powerbot/game/api/methods/widget/Lobby$Tab;
            //   138: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getPanelWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
            //   141: astore_3       
            //   142: aload_3        
            //   143: bipush          62
            //   145: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //   148: astore          4
            //   150: aload_3        
            //   151: bipush          77
            //   153: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //   156: iload_2        
            //   157: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //   160: astore          5
            //   162: aload           4
            //   164: iload           8
            //   166: ifne            178
            //   169: ifnull          338
            //   172: goto            176
            //   175: athrow         
            //   176: aload           4
            //   178: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
            //   181: iload           8
            //   183: ifne            339
            //   186: ifeq            338
            //   189: goto            193
            //   192: athrow         
            //   193: aload           5
            //   195: iload           8
            //   197: ifne            213
            //   200: goto            204
            //   203: athrow         
            //   204: ifnull          338
            //   207: goto            211
            //   210: athrow         
            //   211: aload           5
            //   213: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
            //   216: iload           8
            //   218: ifne            339
            //   221: ifeq            338
            //   224: goto            228
            //   227: athrow         
            //   228: new             Ljava/awt/Rectangle;
            //   231: dup            
            //   232: aload           4
            //   234: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteLocation:()Ljava/awt/Point;
            //   237: new             Ljava/awt/Dimension;
            //   240: dup            
            //   241: aload           4
            //   243: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getWidth:()I
            //   246: aload           4
            //   248: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
            //   251: aload           5
            //   253: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHeight:()I
            //   256: isub           
            //   257: invokespecial   java/awt/Dimension.<init>:(II)V
            //   260: invokespecial   java/awt/Rectangle.<init>:(Ljava/awt/Point;Ljava/awt/Dimension;)V
            //   263: astore          6
            //   265: aload           6
            //   267: aload           5
            //   269: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteLocation:()Ljava/awt/Point;
            //   272: invokevirtual   java/awt/Rectangle.contains:(Ljava/awt/Point;)Z
            //   275: iload           8
            //   277: ifne            337
            //   280: ifne            331
            //   283: goto            287
            //   286: athrow         
            //   287: aload_3        
            //   288: bipush          86
            //   290: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //   293: astore          7
            //   295: aload           7
            //   297: iload           8
            //   299: ifne            311
            //   302: ifnull          328
            //   305: goto            309
            //   308: athrow         
            //   309: aload           5
            //   311: aload           7
            //   313: invokestatic    org/powerbot/game/api/methods/Widgets.scroll:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)Z
            //   316: iload           8
            //   318: ifne            337
            //   321: ifne            331
            //   324: goto            328
            //   327: athrow         
            //   328: iconst_0       
            //   329: ireturn        
            //   330: athrow         
            //   331: aload           5
            //   333: iconst_1       
            //   334: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
            //   337: ireturn        
            //   338: iconst_0       
            //   339: ireturn        
            //    StackMapTable: 00 33 FF 00 13 00 09 07 00 2B 00 00 00 00 00 00 00 01 00 01 07 00 1A 00 4D 07 00 1A 40 01 45 07 00 1A 00 48 07 00 1A 40 01 4A 07 00 1A 00 40 01 00 FF 00 0F 00 09 07 00 2B 07 00 2B 00 00 00 00 00 00 01 00 01 07 00 1A 00 4C 07 00 1A 40 01 45 07 00 1A 00 41 07 00 1A 00 40 07 00 2B 45 01 FF 00 0D 00 09 07 00 2B 07 00 2B 01 00 00 00 00 00 01 00 01 07 00 1A 00 43 07 00 1A 40 01 00 FF 00 27 00 09 07 00 2B 07 00 2B 01 07 00 52 07 00 54 07 00 54 00 00 01 00 01 07 00 1A 00 41 07 00 54 4D 07 00 1A 00 49 07 00 1A 40 07 00 54 45 07 00 1A 00 41 07 00 54 4D 07 00 1A 00 FF 00 39 00 09 07 00 2B 07 00 2B 01 07 00 52 07 00 54 07 00 54 07 00 21 00 01 00 01 07 00 1A 00 FF 00 14 00 09 07 00 2B 07 00 2B 01 07 00 52 07 00 54 07 00 54 07 00 21 07 00 54 01 00 01 07 00 1A 00 41 07 00 54 4F 07 00 1A 00 41 07 00 1A FF 00 00 00 09 07 00 2B 07 00 2B 01 07 00 52 07 00 54 07 00 54 07 00 21 00 01 00 00 45 01 FF 00 00 00 09 07 00 2B 07 00 2B 01 07 00 52 07 00 54 07 00 54 00 00 01 00 00 40 01
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  321    330    330    331    Ljava/lang/NumberFormatException;
            //  311    324    327    328    Ljava/lang/NumberFormatException;
            //  295    305    308    309    Ljava/lang/NumberFormatException;
            //  265    283    286    287    Ljava/lang/NumberFormatException;
            //  213    224    227    228    Ljava/lang/NumberFormatException;
            //  193    207    210    211    Ljava/lang/NumberFormatException;
            //  186    200    203    204    Ljava/lang/NumberFormatException;
            //  178    189    192    193    Ljava/lang/NumberFormatException;
            //  162    172    175    176    Ljava/lang/NumberFormatException;
            //  121    130    133    134    Ljava/lang/NumberFormatException;
            //  115    125    128    129    Ljava/lang/NumberFormatException;
            //  97     106    106    107    Ljava/lang/NumberFormatException;
            //  83     100    103    104    Ljava/lang/NumberFormatException;
            //  76     93     96     97     Ljava/lang/NumberFormatException;
            //  70     79     82     83     Ljava/lang/NumberFormatException;
            //  52     60     63     64     Ljava/lang/NumberFormatException;
            //  35     48     51     52     Ljava/lang/NumberFormatException;
            //  20     38     41     42     Ljava/lang/NumberFormatException;
            //  13     31     34     35     Ljava/lang/NumberFormatException;
            //  5      16     19     20     Ljava/lang/NumberFormatException;
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
        
        @Override
        public boolean equals(final Object o) {
            final int a = Bank.a;
            int n = 0;
            Label_0045: {
                boolean number = false;
                Label_0030: {
                    Label_0019: {
                        boolean b;
                        try {
                            b = (number = ((n = ((o instanceof World) ? 1 : 0)) != 0));
                            if (a != 0) {
                                break Label_0030;
                            }
                            if (b) {
                                break Label_0019;
                            }
                            return false;
                        }
                        catch (NumberFormatException ex) {
                            throw ex;
                        }
                        try {
                            if (!b) {
                                return false;
                            }
                            n = ((number = (((World)o).number != 0)) ? 1 : 0);
                        }
                        catch (NumberFormatException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (a != 0) {
                            return n != 0;
                        }
                        final World world = this;
                        final int n2 = world.number;
                        if ((number ? 1 : 0) == n2) {
                            break Label_0045;
                        }
                        return false;
                    }
                    catch (NumberFormatException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final World world = this;
                    final int n2 = world.number;
                    if ((number ? 1 : 0) != n2) {
                        return false;
                    }
                    n = 1;
                }
                catch (NumberFormatException ex4) {
                    throw ex4;
                }
            }
            return n != 0;
            n = 0;
            return n != 0;
        }
    }
    
    public enum Tab
    {
        PLAYER_INFO(230, 907), 
        WORLD_SELECT(28, 910), 
        FRIENDS(27, 909), 
        FRIENDS_CHAT(280, 589), 
        CLAN_CHAT(26, 912), 
        OPTIONS(25, 911);
        
        private final int widgetTabIndex;
        private final int widgetPanelIndex;
        private static final String[] z;
        
        private Tab(final int widgetTabIndex, final int widgetPanelIndex) {
            this.widgetTabIndex = widgetTabIndex;
            this.widgetPanelIndex = widgetPanelIndex;
        }
        
        public WidgetChild getWidget() {
            Label_0016: {
                int n;
                try {
                    final int open;
                    n = (open = (Lobby.isOpen() ? 1 : 0));
                    if (Bank.a != 0) {
                        return Widgets.get(open, this.widgetTabIndex);
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
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            int open = 906;
            return Widgets.get(open, this.widgetTabIndex);
        }
        
        public Widget getPanelWidget() {
            Label_0016: {
                int n;
                try {
                    final int n2;
                    n = (n2 = (Lobby.isOpen() ? 1 : 0));
                    if (Bank.a != 0) {
                        return Widgets.get(n2);
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
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            int n2 = this.widgetPanelIndex;
            return Widgets.get(n2);
        }
        
        public boolean isOpen() {
            final int a = Bank.a;
            final WidgetChild widget = this.getWidget();
            int validate = 0;
            Label_0058: {
                int textureId = 0;
                Label_0044: {
                    Label_0036: {
                        int n = 0;
                        Label_0022: {
                            WidgetChild widgetChild;
                            try {
                                widgetChild = widget;
                                if (a != 0) {
                                    break Label_0022;
                                }
                                if (widgetChild == null) {
                                    return false;
                                }
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                n = (textureId = (validate = (widgetChild.validate() ? 1 : 0)));
                                if (a != 0) {
                                    break Label_0044;
                                }
                                if (n != 0) {
                                    break Label_0036;
                                }
                                return false;
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            if (n == 0) {
                                return false;
                            }
                            validate = (textureId = widget.getTextureId());
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (a != 0) {
                            return validate != 0;
                        }
                        final int n2 = 4671;
                        if (textureId == n2) {
                            break Label_0058;
                        }
                        return false;
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                try {
                    final int n2 = 4671;
                    if (textureId != n2) {
                        return false;
                    }
                    validate = 1;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            return validate != 0;
            validate = 0;
            return validate != 0;
        }
        
        public boolean open() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore_2       
            //     4: aload_0        
            //     5: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.getWidget:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
            //     8: astore_1       
            //     9: aload_0        
            //    10: invokevirtual   org/powerbot/game/api/methods/widget/Lobby$Tab.isOpen:()Z
            //    13: iload_2        
            //    14: ifne            25
            //    17: ifeq            26
            //    20: goto            24
            //    23: athrow         
            //    24: iconst_1       
            //    25: ireturn        
            //    26: aload_1        
            //    27: iload_2        
            //    28: ifne            39
            //    31: ifnull          88
            //    34: goto            38
            //    37: athrow         
            //    38: aload_1        
            //    39: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
            //    42: iload_2        
            //    43: ifne            89
            //    46: ifeq            88
            //    49: goto            53
            //    52: athrow         
            //    53: aload_1        
            //    54: iconst_1       
            //    55: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
            //    58: iload_2        
            //    59: ifne            89
            //    62: goto            66
            //    65: athrow         
            //    66: ifeq            88
            //    69: goto            73
            //    72: athrow         
            //    73: sipush          1200
            //    76: sipush          2000
            //    79: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
            //    82: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
            //    85: iconst_1       
            //    86: ireturn        
            //    87: athrow         
            //    88: iconst_0       
            //    89: ireturn        
            //    StackMapTable: 00 10 FF 00 17 00 03 07 00 04 07 00 4A 01 00 01 07 00 8B 00 40 01 00 4A 07 00 8B 00 40 07 00 4A 4C 07 00 8B 00 4B 07 00 8B 40 01 45 07 00 8B 00 4D 07 00 8B 00 40 01
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  66     87     87     88     Ljava/lang/RuntimeException;
            //  53     69     72     73     Ljava/lang/RuntimeException;
            //  46     62     65     66     Ljava/lang/RuntimeException;
            //  39     49     52     53     Ljava/lang/RuntimeException;
            //  26     34     37     38     Ljava/lang/RuntimeException;
            //  9      20     23     24     Ljava/lang/RuntimeException;
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
            final String[] z2 = new String[6];
            int n6;
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
            String s = "S2B[bh\n";
            int n7 = -1;
            String intern = null;
        Label_0081_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n9;
                final int n8 = n9 = (length = charArray.length);
                int n10 = 0;
                while (true) {
                    Label_0158: {
                        if (n8 > 1) {
                            break Label_0158;
                        }
                        length = (n9 = n10);
                        do {
                            final char c = charArray[n9];
                            char c2 = '\0';
                            switch (n10 % 5) {
                                case 0: {
                                    c2 = 'U';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u0019';
                                    break;
                                }
                                case 2: {
                                    c2 = 'K';
                                    break;
                                }
                                case 3: {
                                    c2 = 'g';
                                    break;
                                }
                                default: {
                                    c2 = 'l';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n10;
                        } while (n8 == 0);
                    }
                    if (n8 > n10) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n7) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                        s = "qU`<@\u000f(\nF:vS";
                        n7 = 0;
                        continue Label_0081_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                        s = "`H{5J\u0014(\u0010I7tS";
                        n7 = 1;
                        continue Label_0081_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                        s = "E,JGi~\u0006{iSZ";
                        n7 = 2;
                        continue Label_0081_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                        s = "\u0004+\u0001L=yT";
                        n7 = 3;
                        continue Label_0081_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                        s = "V,JPso\u0011ss";
                        n7 = 4;
                        continue Label_0081_Outer;
                    }
                    case 4: {
                        break Label_0081_Outer;
                    }
                }
            }
            z2[n6] = intern;
            z = z2;
        }
    }
    
    public enum Dialog
    {
        TRANSFER_COUNTDOWN(255, -1, 252, s.a(Dialog.z[9])), 
        ACCOUNT_IN_USE(260, -1, 252, s.a(Dialog.z[6])), 
        LOGIN_LIMIT_EXCEEDED(260, -1, 252, s.a(Dialog.z[0])), 
        MEMBERS_ONLY_WORLD(260, -1, 252, s.a(Dialog.z[2])), 
        INSUFFICIENT_SKILL_TOTAL(260, -1, 252, s.a(Dialog.z[12])), 
        WILDERNESS_WARNING(118, 120, 113, s.a(Dialog.z[11])), 
        VALIDATE_EMAIL(379, 379, 352, s.a(Dialog.z[4]));
        
        private final int backButtonIndex;
        private final int continueButtonIndex;
        private final int textIndex;
        private final Pattern textPattern;
        private static final String[] z;
        
        private Dialog(final int backButtonIndex, final int continueButtonIndex, final int textIndex, final String regex) {
            this.backButtonIndex = backButtonIndex;
            this.continueButtonIndex = continueButtonIndex;
            this.textIndex = textIndex;
            this.textPattern = Pattern.compile(regex);
        }
        
        public boolean isOpen() {
            final int a = Bank.a;
            final WidgetChild value = Widgets.get(906, this.textIndex);
            boolean onScreen = false;
            Label_0083: {
                Label_0028: {
                    WidgetChild widgetChild;
                    try {
                        widgetChild = value;
                        if (a != 0) {
                            break Label_0028;
                        }
                        if (widgetChild == null) {
                            break Label_0083;
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
                            break Label_0083;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final String text = value.getText();
                Label_0070: {
                    try {
                        if (text == null) {
                            return false;
                        }
                        final Dialog dialog = this;
                        final Pattern pattern = dialog.textPattern;
                        final String s = text;
                        final Matcher matcher = pattern.matcher(s);
                        final boolean b2;
                        final boolean b = b2 = matcher.find();
                        final int n = a;
                        if (n == 0) {
                            break Label_0070;
                        }
                        return b;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final Dialog dialog = this;
                        final Pattern pattern = dialog.textPattern;
                        final String s = text;
                        final Matcher matcher = pattern.matcher(s);
                        final boolean b2;
                        final boolean b = b2 = matcher.find();
                        final int n = a;
                        if (n != 0) {
                            return b;
                        }
                        if (!b2) {
                            return false;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                return true;
                b = false;
                return b;
            }
            return onScreen;
        }
        
        public boolean hasContinue() {
            int continueButtonIndex = 0;
            Label_0018: {
                int n;
                try {
                    n = (continueButtonIndex = this.continueButtonIndex);
                    if (Bank.a != 0) {
                        return continueButtonIndex != 0;
                    }
                    final int n2 = -1;
                    if (n != n2) {
                        break Label_0018;
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
                    continueButtonIndex = 1;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return continueButtonIndex != 0;
            continueButtonIndex = 0;
            return continueButtonIndex != 0;
        }
        
        public boolean clickContinue() {
            final int a = Bank.a;
            int hasContinue = 0;
            Label_0025: {
                Label_0022: {
                    int n;
                    try {
                        n = (hasContinue = (this.hasContinue() ? 1 : 0));
                        if (a != 0) {
                            break Label_0025;
                        }
                        if (n == 0) {
                            return false;
                        }
                        break Label_0022;
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
                hasContinue = 906;
            }
            final WidgetChild value = Widgets.get(hasContinue, this.continueButtonIndex);
            Label_0069: {
                boolean onScreen = false;
                boolean click = false;
                Label_0060: {
                    boolean b = false;
                    Label_0046: {
                        WidgetChild widgetChild;
                        try {
                            widgetChild = value;
                            if (a != 0) {
                                break Label_0046;
                            }
                            if (widgetChild == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            b = (click = (onScreen = widgetChild.isOnScreen()));
                            if (a != 0) {
                                break Label_0069;
                            }
                            if (b) {
                                break Label_0060;
                            }
                            return false;
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        if (!b) {
                            return false;
                        }
                        onScreen = (click = value.click((boolean)(1 != 0)));
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (a != 0) {
                        return onScreen;
                    }
                    if (!click) {
                        return false;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            return true;
            onScreen = false;
            return onScreen;
        }
        
        public boolean hasBack() {
            int backButtonIndex = 0;
            Label_0018: {
                int n;
                try {
                    n = (backButtonIndex = this.backButtonIndex);
                    if (Bank.a != 0) {
                        return backButtonIndex != 0;
                    }
                    final int n2 = -1;
                    if (n != n2) {
                        break Label_0018;
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
                    backButtonIndex = 1;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return backButtonIndex != 0;
            backButtonIndex = 0;
            return backButtonIndex != 0;
        }
        
        public boolean clickBack() {
            final int a = Bank.a;
            int hasBack = 0;
            Label_0025: {
                Label_0022: {
                    int n;
                    try {
                        n = (hasBack = (this.hasBack() ? 1 : 0));
                        if (a != 0) {
                            break Label_0025;
                        }
                        if (n == 0) {
                            return false;
                        }
                        break Label_0022;
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
                hasBack = 906;
            }
            final WidgetChild value = Widgets.get(hasBack, this.backButtonIndex);
            Label_0069: {
                boolean onScreen = false;
                boolean click = false;
                Label_0060: {
                    boolean b = false;
                    Label_0046: {
                        WidgetChild widgetChild;
                        try {
                            widgetChild = value;
                            if (a != 0) {
                                break Label_0046;
                            }
                            if (widgetChild == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            b = (click = (onScreen = widgetChild.isOnScreen()));
                            if (a != 0) {
                                break Label_0069;
                            }
                            if (b) {
                                break Label_0060;
                            }
                            return false;
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        if (!b) {
                            return false;
                        }
                        onScreen = (click = value.click((boolean)(1 != 0)));
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (a != 0) {
                        return onScreen;
                    }
                    if (!click) {
                        return false;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            return true;
            onScreen = false;
            return onScreen;
        }
        
        static {
            final String[] z2 = new String[14];
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
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 0))))))))))));
            String s = "cT\u0004\u000bv2Yfd\u0013TlK\tg?\u001coi\u001bY\"K\u0018p3Ygl\u0010D8\b\u0003q2\u001ciy\u0017Rv\u0018Ly.\u0016g-\u0007Rm\u0019L~8\u001dxh\rN6";
            int n15 = -1;
            String intern = null;
        Label_0168_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n17;
                final int n16 = n17 = (length = charArray.length);
                int n18 = 0;
                while (true) {
                    Label_0241: {
                        if (n16 > 1) {
                            break Label_0241;
                        }
                        length = (n17 = n18);
                        do {
                            final char c = charArray[n17];
                            char c2 = '\0';
                            switch (n18 % 5) {
                                case 0: {
                                    c2 = '2';
                                    break;
                                }
                                case 1: {
                                    c2 = 'v';
                                    break;
                                }
                                case 2: {
                                    c2 = 'd';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0002';
                                    break;
                                }
                                default: {
                                    c2 = '\u0010';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n18;
                        } while (n16 == 0);
                    }
                    if (n16 > n18) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n15) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 1)))))))))))));
                        s = ":aw\u0018\n>g\u007f\u000e\u001d2\u007fz\u000e\u0001%g}";
                        n15 = 0;
                        continue Label_0168_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 2)))))))))))));
                        s = "\u0002 ex^S}\u000e\b?=Ygh\u0013_}\u0019Kl|\u0018in\u0011Hv\u001fLk3Yfb\u0019\u001dq\u0005Lk3Y~e\u0017N8\u001c\u0003m0\u001d$";
                        n15 = 1;
                        continue Label_0168_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 3)))))))))))));
                        s = ";iw\u0015\u000b-}\u007f\u0002\u000b ir\u0010";
                        n15 = 2;
                        continue Label_0168_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 4)))))))))))));
                        s = "\u0002/ka\u0017Yy\u001f\t?%\u0016\u007f\u007f^Xu\n\u0005s|\u0017ez^[w\u0019Lv2\u001axh\u001fN}\u000fL~?\u001aex\u0010I8\u0018\t|)\u000bcy\u0007";
                        n15 = 3;
                        continue Label_0168_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 5)))))))))))));
                        s = ",kx\u0013\u001a\"}e\u0014\u00002}h\u0019";
                        n15 = 4;
                        continue Label_0168_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 6)))))))))))));
                        s = "\u0002 ex\f\u001dy\b\u000fp)\u0017~-\u0016\\kK\u0002p(Yfb\u0019Z}\u000fLp)\r*k\fRuK\u0005k/Yfl\rI8\u0018\tl/\u0010ecP";
                        n15 = 5;
                        continue Label_0168_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 7)))))))))))));
                        s = "!g|\u0015\u00013es\u0010\u00079w~\u0004\f)l~\u0018\n";
                        n15 = 6;
                        continue Label_0168_Outer;
                    }
                    case 6: {
                        z2[n8] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 8)))))))))))));
                        s = "$fh\t\t*`y\u0014\u000b#|d\u000f\u0004%ev\u0002\u001a\"|z\u0010";
                        n15 = 7;
                        continue Label_0168_Outer;
                    }
                    case 7: {
                        z2[n9] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 9)))))))))))));
                        s = "\u0002 ex^Uy\u001d\t?3\u0017ft^Wm\u0018\u0018?0\u001cly^\\v\u0004\u0018w9\u000b*z\u0011Ot\u000fB";
                        n15 = 8;
                        continue Label_0168_Outer;
                    }
                    case 8: {
                        z2[n10] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 10)))))))))))));
                        s = " mv\u001e\n>ze\u0012\u0000!qd\u000b\u0000>e~";
                        n15 = 9;
                        continue Label_0168_Outer;
                    }
                    case 9: {
                        z2[n11] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 11)))))))))))));
                        s = "\u0002.k\u007f\u0010Tv\fV?\b\u0011c~^TkK\r?\u0014\u0010meSOq\u0018\u0007?\u000b\u0010fi\u001bOv\u000e\u001fl|\u000ee\u007f\u0012Y6";
                        n15 = 10;
                        continue Label_0168_Outer;
                    }
                    case 10: {
                        z2[n12] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 12)))))))))))));
                        s = "\u0002 ex^Pm\u0018\u0018?4\u0018|h^\\8\u001f\u0003k=\u0015*~\u0015Tt\u0007Ls9\u000foa^R~";
                        n15 = 11;
                        continue Label_0168_Outer;
                    }
                    case 11: {
                        z2[n13] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 13)))))))))))));
                        s = "9zz\u0012\u001c*lh\u0002\r\"}u\b\u000b#~t";
                        n15 = 12;
                        continue Label_0168_Outer;
                    }
                    case 12: {
                        break Label_0168_Outer;
                    }
                }
            }
            z2[n14] = intern;
            z = z2;
        }
    }
}
