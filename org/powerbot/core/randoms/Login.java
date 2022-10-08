
package org.powerbot.core.randoms;

import org.powerbot.game.bot.Context;
import org.powerbot.core.bot.handlers.ScriptHandler;
import org.powerbot.game.api.util.Time;
import org.powerbot.a;
import org.powerbot.core.script.job.Job;
import org.t;
import java.awt.Color;
import java.awt.Graphics;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.input.Keyboard;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.core.Bot;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.Manifest;

@Manifest(name = "Login", description = "Logs into the game and handles errors", version = 0.1, authors = { "Timer" })
public class Login extends AntiRandom
{
    private static final int WIDGET = 596;
    private static final int WIDGET_LOGIN_ERROR = 13;
    private static final int WIDGET_LOGIN_TRY_AGAIN = 65;
    private static final int WIDGET_LOGIN_USERNAME_TEXT = 70;
    private static final int WIDGET_LOGIN_PASSWORD_TEXT = 76;
    private static final int WIDGET_LOBBY = 906;
    private static final int WIDGET_LOBBY_ERROR = 249;
    private static final int WIDGET_LOBBY_TRY_AGAIN = 259;
    private volatile Timer re_load_timer;
    private final Bot bot;
    private static final String[] z;
    
    public Login() {
        this.re_load_timer = null;
        this.bot = Bot.instance();
    }
    
    @Override
    public boolean activate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //     7: istore_1       
        //     8: iload_1        
        //     9: iconst_3       
        //    10: iload_2        
        //    11: ifne            28
        //    14: if_icmpeq       49
        //    17: goto            21
        //    20: athrow         
        //    21: iload_1        
        //    22: bipush          7
        //    24: goto            28
        //    27: athrow         
        //    28: iload_2        
        //    29: ifne            46
        //    32: if_icmpeq       49
        //    35: goto            39
        //    38: athrow         
        //    39: iload_1        
        //    40: bipush          9
        //    42: goto            46
        //    45: athrow         
        //    46: if_icmpne       68
        //    49: aload_0        
        //    50: getfield        org/powerbot/core/randoms/Login.bot:Lorg/powerbot/core/Bot;
        //    53: invokevirtual   org/powerbot/core/Bot.getAccount:()Lorg/powerbot/jb$a_;
        //    56: ifnull          68
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_1       
        //    64: goto            69
        //    67: athrow         
        //    68: iconst_0       
        //    69: ireturn        
        //    StackMapTable: 00 0E FF 00 14 00 03 07 00 53 01 01 00 01 07 01 70 00 45 07 01 70 FF 00 00 00 03 07 00 53 01 01 00 02 01 01 49 07 01 70 00 45 07 01 70 FF 00 00 00 03 07 00 53 01 01 00 02 01 01 02 4C 07 01 70 00 43 07 01 70 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  49     67     67     68     Ljava/lang/RuntimeException;
        //  46     59     62     63     Ljava/lang/RuntimeException;
        //  32     42     45     46     Ljava/lang/RuntimeException;
        //  28     35     38     39     Ljava/lang/RuntimeException;
        //  14     24     27     28     Ljava/lang/RuntimeException;
        //  8      17     20     21     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
        //     3: istore          8
        //     5: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //     8: bipush          7
        //    10: iload           8
        //    12: ifne            368
        //    15: if_icmpne       364
        //    18: goto            22
        //    21: athrow         
        //    22: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.values:()[Lorg/powerbot/core/randoms/Login$LobbyEvent;
        //    25: astore_1       
        //    26: aload_1        
        //    27: arraylength    
        //    28: istore_2       
        //    29: iconst_0       
        //    30: istore_3       
        //    31: iload_3        
        //    32: iload_2        
        //    33: if_icmpge       290
        //    36: aload_1        
        //    37: iload_3        
        //    38: aaload         
        //    39: astore          4
        //    41: sipush          906
        //    44: iload           8
        //    46: ifne            296
        //    49: aload           4
        //    51: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$000:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)I
        //    54: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    57: astore          5
        //    59: iload           8
        //    61: ifne            285
        //    64: aload           5
        //    66: ifnull          282
        //    69: goto            73
        //    72: athrow         
        //    73: aload           5
        //    75: iload           8
        //    77: ifne            100
        //    80: goto            84
        //    83: athrow         
        //    84: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    87: ifeq            282
        //    90: goto            94
        //    93: athrow         
        //    94: aload           5
        //    96: goto            100
        //    99: athrow         
        //   100: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   103: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   106: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   109: astore          6
        //   111: iload           8
        //   113: ifne            285
        //   116: aload           6
        //   118: aload           4
        //   120: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$100:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)Ljava/lang/String;
        //   123: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   126: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   129: ifeq            282
        //   132: goto            136
        //   135: athrow         
        //   136: aload_0        
        //   137: getfield        org/powerbot/core/randoms/Login.log:Ljava/util/logging/Logger;
        //   140: new             Ljava/lang/StringBuilder;
        //   143: dup            
        //   144: invokespecial   java/lang/StringBuilder.<init>:()V
        //   147: getstatic       org/powerbot/core/randoms/Login.z:[Ljava/lang/String;
        //   150: iconst_2       
        //   151: aaload         
        //   152: invokestatic    org/t.a:(Ljava/lang/String;)Ljava/lang/String;
        //   155: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   158: aload           4
        //   160: invokevirtual   org/powerbot/core/randoms/Login$LobbyEvent.name:()Ljava/lang/String;
        //   163: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   166: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   169: invokevirtual   java/util/logging/Logger.info:(Ljava/lang/String;)V
        //   172: sipush          906
        //   175: sipush          259
        //   178: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   181: iconst_1       
        //   182: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //   185: pop            
        //   186: aload           4
        //   188: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$200:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)I
        //   191: iload           8
        //   193: ifne            242
        //   196: goto            200
        //   199: athrow         
        //   200: ifle            224
        //   203: goto            207
        //   206: athrow         
        //   207: aload           4
        //   209: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$200:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)I
        //   212: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   215: iload           8
        //   217: ifeq            255
        //   220: goto            224
        //   223: athrow         
        //   224: aload           4
        //   226: iload           8
        //   228: ifne            257
        //   231: goto            235
        //   234: athrow         
        //   235: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$200:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)I
        //   238: goto            242
        //   241: athrow         
        //   242: iconst_m1      
        //   243: if_icmpne       255
        //   246: aload_0        
        //   247: getfield        org/powerbot/core/randoms/Login.bot:Lorg/powerbot/core/Bot;
        //   250: invokevirtual   org/powerbot/core/Bot.stopScript:()V
        //   253: return         
        //   254: athrow         
        //   255: aload           4
        //   257: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$300:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)Lorg/powerbot/core/script/job/Job;
        //   260: ifnull          281
        //   263: aload_0        
        //   264: invokevirtual   org/powerbot/core/randoms/Login.getContainer:()Lorg/powerbot/core/script/job/Container;
        //   267: aload           4
        //   269: invokestatic    org/powerbot/core/randoms/Login$LobbyEvent.access$300:(Lorg/powerbot/core/randoms/Login$LobbyEvent;)Lorg/powerbot/core/script/job/Job;
        //   272: invokeinterface org/powerbot/core/script/job/Container.submit:(Lorg/powerbot/core/script/job/Job;)V
        //   277: goto            281
        //   280: athrow         
        //   281: return         
        //   282: iinc            3, 1
        //   285: iload           8
        //   287: ifeq            31
        //   290: invokestatic    org/powerbot/game/bot/Context.get:()Lorg/powerbot/game/bot/Context;
        //   293: getfield        org/powerbot/game/bot/Context.world:I
        //   296: istore_1       
        //   297: iload_1        
        //   298: iload           8
        //   300: ifne            360
        //   303: ifle            347
        //   306: goto            310
        //   309: athrow         
        //   310: iload_1        
        //   311: iload           8
        //   313: ifne            360
        //   316: goto            320
        //   319: athrow         
        //   320: invokestatic    org/powerbot/game/api/methods/widget/Lobby.getWorld:(I)Lorg/powerbot/game/api/methods/widget/Lobby$World;
        //   323: dup            
        //   324: astore_2       
        //   325: ifnull          347
        //   328: aload_2        
        //   329: invokestatic    org/powerbot/game/api/methods/widget/Lobby.enterGame:(Lorg/powerbot/game/api/methods/widget/Lobby$World;)Z
        //   332: pop            
        //   333: sipush          200
        //   336: sipush          500
        //   339: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   342: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   345: return         
        //   346: athrow         
        //   347: invokestatic    org/powerbot/game/api/methods/widget/Lobby.enterGame:()Z
        //   350: pop            
        //   351: sipush          200
        //   354: sipush          500
        //   357: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   360: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   363: return         
        //   364: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //   367: iconst_3       
        //   368: if_icmpne       1015
        //   371: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.values:()[Lorg/powerbot/core/randoms/Login$LoginEvent;
        //   374: astore_1       
        //   375: aload_1        
        //   376: arraylength    
        //   377: istore_2       
        //   378: iconst_0       
        //   379: istore_3       
        //   380: iload_3        
        //   381: iload_2        
        //   382: if_icmpge       729
        //   385: aload_1        
        //   386: iload_3        
        //   387: aaload         
        //   388: astore          4
        //   390: sipush          596
        //   393: aload           4
        //   395: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$400:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   398: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   401: astore          5
        //   403: iload           8
        //   405: ifne            790
        //   408: iload           8
        //   410: ifne            724
        //   413: goto            417
        //   416: athrow         
        //   417: aload           5
        //   419: ifnull          721
        //   422: goto            426
        //   425: athrow         
        //   426: aload           5
        //   428: iload           8
        //   430: ifne            453
        //   433: goto            437
        //   436: athrow         
        //   437: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   440: ifeq            721
        //   443: goto            447
        //   446: athrow         
        //   447: aload           5
        //   449: goto            453
        //   452: athrow         
        //   453: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   456: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   459: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   462: astore          6
        //   464: sipush          596
        //   467: bipush          65
        //   469: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   472: iconst_1       
        //   473: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.click:(Z)Z
        //   476: pop            
        //   477: iload           8
        //   479: ifne            724
        //   482: aload           6
        //   484: aload           4
        //   486: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$500:(Lorg/powerbot/core/randoms/Login$LoginEvent;)Ljava/lang/String;
        //   489: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   492: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   495: ifeq            721
        //   498: goto            502
        //   501: athrow         
        //   502: aload_0        
        //   503: getfield        org/powerbot/core/randoms/Login.log:Ljava/util/logging/Logger;
        //   506: new             Ljava/lang/StringBuilder;
        //   509: dup            
        //   510: invokespecial   java/lang/StringBuilder.<init>:()V
        //   513: getstatic       org/powerbot/core/randoms/Login.z:[Ljava/lang/String;
        //   516: iconst_1       
        //   517: aaload         
        //   518: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   521: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   524: aload           4
        //   526: invokevirtual   org/powerbot/core/randoms/Login$LoginEvent.name:()Ljava/lang/String;
        //   529: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   532: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   535: invokevirtual   java/util/logging/Logger.info:(Ljava/lang/String;)V
        //   538: aload           4
        //   540: getstatic       org/powerbot/core/randoms/Login$LoginEvent.TOKEN_FAILURE:Lorg/powerbot/core/randoms/Login$LoginEvent;
        //   543: invokevirtual   org/powerbot/core/randoms/Login$LoginEvent.equals:(Ljava/lang/Object;)Z
        //   546: istore          7
        //   548: iload           7
        //   550: iload           8
        //   552: ifne            609
        //   555: ifeq            604
        //   558: goto            562
        //   561: athrow         
        //   562: aload           4
        //   564: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$600:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   567: iload           8
        //   569: ifne            609
        //   572: goto            576
        //   575: athrow         
        //   576: ifle            604
        //   579: goto            583
        //   582: athrow         
        //   583: aload_0        
        //   584: new             Lorg/powerbot/game/api/util/Timer;
        //   587: dup            
        //   588: aload           4
        //   590: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$600:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   593: i2l            
        //   594: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   597: putfield        org/powerbot/core/randoms/Login.re_load_timer:Lorg/powerbot/game/api/util/Timer;
        //   600: goto            604
        //   603: athrow         
        //   604: aload           4
        //   606: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$600:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   609: iload           8
        //   611: ifne            656
        //   614: ifle            638
        //   617: goto            621
        //   620: athrow         
        //   621: aload           4
        //   623: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$600:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   626: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   629: iload           8
        //   631: ifeq            669
        //   634: goto            638
        //   637: athrow         
        //   638: aload           4
        //   640: iload           8
        //   642: ifne            676
        //   645: goto            649
        //   648: athrow         
        //   649: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$600:(Lorg/powerbot/core/randoms/Login$LoginEvent;)I
        //   652: goto            656
        //   655: athrow         
        //   656: iconst_m1      
        //   657: if_icmpne       669
        //   660: aload_0        
        //   661: getfield        org/powerbot/core/randoms/Login.bot:Lorg/powerbot/core/Bot;
        //   664: invokevirtual   org/powerbot/core/Bot.stopScript:()V
        //   667: return         
        //   668: athrow         
        //   669: aload_0        
        //   670: aconst_null    
        //   671: putfield        org/powerbot/core/randoms/Login.re_load_timer:Lorg/powerbot/game/api/util/Timer;
        //   674: aload           4
        //   676: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$700:(Lorg/powerbot/core/randoms/Login$LoginEvent;)Lorg/powerbot/core/script/job/Job;
        //   679: iload           8
        //   681: ifne            714
        //   684: ifnull          720
        //   687: goto            691
        //   690: athrow         
        //   691: aload_0        
        //   692: invokevirtual   org/powerbot/core/randoms/Login.getContainer:()Lorg/powerbot/core/script/job/Container;
        //   695: aload           4
        //   697: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$700:(Lorg/powerbot/core/randoms/Login$LoginEvent;)Lorg/powerbot/core/script/job/Job;
        //   700: invokeinterface org/powerbot/core/script/job/Container.submit:(Lorg/powerbot/core/script/job/Job;)V
        //   705: aload           4
        //   707: invokestatic    org/powerbot/core/randoms/Login$LoginEvent.access$700:(Lorg/powerbot/core/randoms/Login$LoginEvent;)Lorg/powerbot/core/script/job/Job;
        //   710: goto            714
        //   713: athrow         
        //   714: invokeinterface org/powerbot/core/script/job/Job.join:()Z
        //   719: pop            
        //   720: return         
        //   721: iinc            3, 1
        //   724: iload           8
        //   726: ifeq            380
        //   729: aload_0        
        //   730: invokespecial   org/powerbot/core/randoms/Login.isUsernameCorrect:()Z
        //   733: iload           8
        //   735: ifne            794
        //   738: ifeq            790
        //   741: goto            745
        //   744: athrow         
        //   745: aload_0        
        //   746: invokespecial   org/powerbot/core/randoms/Login.isPasswordValid:()Z
        //   749: iload           8
        //   751: ifne            794
        //   754: goto            758
        //   757: athrow         
        //   758: ifeq            790
        //   761: goto            765
        //   764: athrow         
        //   765: aload_0        
        //   766: invokespecial   org/powerbot/core/randoms/Login.attemptLogin:()V
        //   769: sipush          1200
        //   772: sipush          2000
        //   775: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   778: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   781: iload           8
        //   783: ifeq            1015
        //   786: goto            790
        //   789: athrow         
        //   790: aload_0        
        //   791: invokespecial   org/powerbot/core/randoms/Login.isUsernameCorrect:()Z
        //   794: iload           8
        //   796: ifne            917
        //   799: ifne            904
        //   802: goto            806
        //   805: athrow         
        //   806: aload_0        
        //   807: getfield        org/powerbot/core/randoms/Login.bot:Lorg/powerbot/core/Bot;
        //   810: invokevirtual   org/powerbot/core/Bot.getAccount:()Lorg/powerbot/jb$a_;
        //   813: invokevirtual   org/powerbot/jb$a_.toString:()Ljava/lang/String;
        //   816: astore_1       
        //   817: sipush          596
        //   820: bipush          70
        //   822: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   825: astore_2       
        //   826: aload_0        
        //   827: aload_2        
        //   828: invokespecial   org/powerbot/core/randoms/Login.clickLoginInterface:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)Z
        //   831: iload           8
        //   833: ifne            865
        //   836: ifne            844
        //   839: goto            843
        //   842: athrow         
        //   843: return         
        //   844: sipush          500
        //   847: sipush          700
        //   850: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   853: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   856: aload_2        
        //   857: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   860: invokevirtual   java/lang/String.length:()I
        //   863: istore_3       
        //   864: iload_3        
        //   865: iload           8
        //   867: ifne            898
        //   870: ifle            884
        //   873: goto            877
        //   876: athrow         
        //   877: aload_0        
        //   878: iload_3        
        //   879: invokespecial   org/powerbot/core/randoms/Login.erase:(I)V
        //   882: return         
        //   883: athrow         
        //   884: aload_1        
        //   885: iconst_0       
        //   886: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //   889: sipush          500
        //   892: sipush          700
        //   895: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   898: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   901: goto            1015
        //   904: aload_0        
        //   905: iload           8
        //   907: ifne            921
        //   910: invokespecial   org/powerbot/core/randoms/Login.isPasswordValid:()Z
        //   913: goto            917
        //   916: athrow         
        //   917: ifne            1015
        //   920: aload_0        
        //   921: getfield        org/powerbot/core/randoms/Login.bot:Lorg/powerbot/core/Bot;
        //   924: invokevirtual   org/powerbot/core/Bot.getAccount:()Lorg/powerbot/jb$a_;
        //   927: invokevirtual   org/powerbot/jb$a_.a:()Ljava/lang/String;
        //   930: astore_1       
        //   931: sipush          596
        //   934: bipush          76
        //   936: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   939: astore_2       
        //   940: aload_0        
        //   941: aload_2        
        //   942: invokespecial   org/powerbot/core/randoms/Login.clickLoginInterface:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)Z
        //   945: iload           8
        //   947: ifne            979
        //   950: ifne            958
        //   953: goto            957
        //   956: athrow         
        //   957: return         
        //   958: sipush          500
        //   961: sipush          700
        //   964: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   967: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //   970: aload_2        
        //   971: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   974: invokevirtual   java/lang/String.length:()I
        //   977: istore_3       
        //   978: iload_3        
        //   979: iload           8
        //   981: ifne            1012
        //   984: ifle            998
        //   987: goto            991
        //   990: athrow         
        //   991: aload_0        
        //   992: iload_3        
        //   993: invokespecial   org/powerbot/core/randoms/Login.erase:(I)V
        //   996: return         
        //   997: athrow         
        //   998: aload_1        
        //   999: iconst_0       
        //  1000: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendText:(Ljava/lang/String;Z)V
        //  1003: sipush          500
        //  1006: sipush          700
        //  1009: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //  1012: invokestatic    org/powerbot/core/randoms/Login.sleep:(I)V
        //  1015: return         
        //    StackMapTable: 00 74 FF 00 15 00 09 07 00 53 00 00 00 00 00 00 00 01 00 01 07 01 70 00 FF 00 08 00 09 07 00 53 07 01 82 01 01 00 00 00 00 01 00 00 FF 00 28 00 09 07 00 53 07 01 82 01 01 07 00 55 07 00 97 00 00 01 00 01 07 01 70 00 49 07 01 70 40 07 00 97 48 07 01 70 00 44 07 01 70 40 07 00 97 FF 00 22 00 09 07 00 53 07 01 82 01 01 07 00 55 07 00 97 07 00 9A 00 01 00 01 07 01 70 00 7E 07 01 70 40 01 45 07 01 70 00 4F 07 01 70 00 49 07 01 70 40 07 00 55 45 07 01 70 40 01 4B 07 01 70 00 41 07 00 55 56 07 01 70 00 FF 00 00 00 09 07 00 53 07 01 82 01 01 07 00 55 07 00 97 00 00 01 00 00 02 FF 00 04 00 09 07 00 53 07 01 82 01 01 00 00 00 00 01 00 00 45 01 FF 00 0C 00 09 07 00 53 01 01 01 00 00 00 00 01 00 01 07 01 70 00 48 07 01 70 40 01 FF 00 19 00 09 07 00 53 01 07 01 1E 01 00 00 00 00 01 00 01 07 01 70 FF 00 00 00 09 07 00 53 01 00 01 00 00 00 00 01 00 00 4C 01 FF 00 03 00 09 07 00 53 00 00 00 00 00 00 00 01 00 00 FF 00 03 00 09 07 00 53 00 00 00 00 00 00 00 01 00 02 01 01 FF 00 0B 00 09 07 00 53 07 01 84 01 01 00 00 00 00 01 00 00 FF 00 23 00 09 07 00 53 07 01 84 01 01 07 00 58 07 00 97 00 00 01 00 01 07 01 70 00 47 07 01 70 00 49 07 01 70 40 07 00 97 48 07 01 70 00 44 07 01 70 40 07 00 97 FF 00 2F 00 09 07 00 53 07 01 84 01 01 07 00 58 07 00 97 07 00 9A 00 01 00 01 07 01 70 00 FF 00 3A 00 09 07 00 53 07 01 84 01 01 07 00 58 07 00 97 07 00 9A 01 01 00 01 07 01 70 00 4C 07 01 70 40 01 45 07 01 70 00 53 07 01 70 00 44 01 4A 07 01 70 00 4F 07 01 70 00 49 07 01 70 40 07 00 58 45 07 01 70 40 01 4B 07 01 70 00 46 07 00 58 4D 07 01 70 00 55 07 01 70 40 07 00 C0 05 FF 00 00 00 09 07 00 53 07 01 84 01 01 07 00 58 07 00 97 00 00 01 00 00 02 FF 00 04 00 09 07 00 53 07 01 84 01 01 00 00 00 00 01 00 00 4E 07 01 70 00 4B 07 01 70 40 01 45 07 01 70 00 57 07 01 70 00 43 01 4A 07 01 70 00 FF 00 23 00 09 07 00 53 07 00 9A 07 00 97 01 00 00 00 00 01 00 01 07 01 70 00 00 54 01 4A 07 01 70 00 45 07 01 70 00 4D 01 FF 00 05 00 09 07 00 53 07 01 84 01 01 00 00 00 00 01 00 00 4B 07 01 70 40 01 43 07 00 53 FF 00 22 00 09 07 00 53 07 00 9A 07 00 97 01 00 00 00 00 01 00 01 07 01 70 00 00 54 01 4A 07 01 70 00 45 07 01 70 00 4D 01 FF 00 02 00 09 07 00 53 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  984    997    997    998    Ljava/lang/RuntimeException;
        //  979    987    990    991    Ljava/lang/RuntimeException;
        //  940    953    956    957    Ljava/lang/RuntimeException;
        //  904    913    916    917    Ljava/lang/RuntimeException;
        //  870    883    883    884    Ljava/lang/RuntimeException;
        //  865    873    876    877    Ljava/lang/RuntimeException;
        //  826    839    842    843    Ljava/lang/RuntimeException;
        //  794    802    805    806    Ljava/lang/RuntimeException;
        //  758    786    789    790    Ljava/lang/RuntimeException;
        //  745    761    764    765    Ljava/lang/RuntimeException;
        //  738    754    757    758    Ljava/lang/RuntimeException;
        //  729    741    744    745    Ljava/lang/RuntimeException;
        //  684    710    713    714    Ljava/lang/RuntimeException;
        //  676    687    690    691    Ljava/lang/RuntimeException;
        //  656    668    668    669    Ljava/lang/RuntimeException;
        //  638    652    655    656    Ljava/lang/RuntimeException;
        //  621    645    648    649    Ljava/lang/RuntimeException;
        //  614    634    637    638    Ljava/lang/RuntimeException;
        //  609    617    620    621    Ljava/lang/RuntimeException;
        //  576    600    603    604    Ljava/lang/RuntimeException;
        //  562    579    582    583    Ljava/lang/RuntimeException;
        //  555    572    575    576    Ljava/lang/RuntimeException;
        //  548    558    561    562    Ljava/lang/RuntimeException;
        //  464    498    501    502    Ljava/lang/RuntimeException;
        //  437    449    452    453    Ljava/lang/RuntimeException;
        //  426    443    446    447    Ljava/lang/RuntimeException;
        //  417    433    436    437    Ljava/lang/RuntimeException;
        //  408    422    425    426    Ljava/lang/RuntimeException;
        //  403    413    416    417    Ljava/lang/RuntimeException;
        //  325    346    346    347    Ljava/lang/RuntimeException;
        //  303    316    319    320    Ljava/lang/RuntimeException;
        //  297    306    309    310    Ljava/lang/RuntimeException;
        //  257    277    280    281    Ljava/lang/RuntimeException;
        //  242    254    254    255    Ljava/lang/RuntimeException;
        //  224    238    241    242    Ljava/lang/RuntimeException;
        //  207    231    234    235    Ljava/lang/RuntimeException;
        //  200    220    223    224    Ljava/lang/RuntimeException;
        //  136    203    206    207    Ljava/lang/RuntimeException;
        //  116    196    199    200    Ljava/lang/RuntimeException;
        //  111    132    135    136    Ljava/lang/RuntimeException;
        //  84     96     99     100    Ljava/lang/RuntimeException;
        //  73     90     93     94     Ljava/lang/RuntimeException;
        //  64     80     83     84     Ljava/lang/RuntimeException;
        //  59     69     72     73     Ljava/lang/RuntimeException;
        //  5      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0073:
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
    
    private boolean clickLoginInterface(final WidgetChild p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_1        
        //     6: iload           7
        //     8: ifne            25
        //    11: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    14: ifne            24
        //    17: goto            21
        //    20: athrow         
        //    21: iconst_0       
        //    22: ireturn        
        //    23: athrow         
        //    24: aload_1        
        //    25: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundingRectangle:()Ljava/awt/Rectangle;
        //    28: astore_2       
        //    29: aload_2        
        //    30: getfield        java/awt/Rectangle.x:I
        //    33: iload           7
        //    35: ifne            110
        //    38: iconst_m1      
        //    39: if_icmpeq       109
        //    42: goto            46
        //    45: athrow         
        //    46: aload_2        
        //    47: getfield        java/awt/Rectangle.y:I
        //    50: iload           7
        //    52: ifne            110
        //    55: goto            59
        //    58: athrow         
        //    59: iconst_m1      
        //    60: if_icmpeq       109
        //    63: goto            67
        //    66: athrow         
        //    67: aload_2        
        //    68: getfield        java/awt/Rectangle.width:I
        //    71: iload           7
        //    73: ifne            110
        //    76: goto            80
        //    79: athrow         
        //    80: iconst_m1      
        //    81: if_icmpeq       109
        //    84: goto            88
        //    87: athrow         
        //    88: aload_2        
        //    89: getfield        java/awt/Rectangle.height:I
        //    92: iconst_m1      
        //    93: iload           7
        //    95: ifne            121
        //    98: goto            102
        //   101: athrow         
        //   102: if_icmpne       111
        //   105: goto            109
        //   108: athrow         
        //   109: iconst_0       
        //   110: ireturn        
        //   111: aload_2        
        //   112: invokevirtual   java/awt/Rectangle.getHeight:()D
        //   115: ldc2_w          4.0
        //   118: dsub           
        //   119: d2i            
        //   120: iconst_2       
        //   121: idiv           
        //   122: istore_3       
        //   123: aload_2        
        //   124: invokevirtual   java/awt/Rectangle.getMaxX:()D
        //   127: aload_2        
        //   128: invokevirtual   java/awt/Rectangle.getCenterX:()D
        //   131: dsub           
        //   132: d2i            
        //   133: istore          4
        //   135: aload_2        
        //   136: invokevirtual   java/awt/Rectangle.getCenterX:()D
        //   139: d2i            
        //   140: istore          5
        //   142: aload_2        
        //   143: invokevirtual   java/awt/Rectangle.getMinY:()D
        //   146: aload_2        
        //   147: invokevirtual   java/awt/Rectangle.getHeight:()D
        //   150: ldc2_w          2.0
        //   153: ddiv           
        //   154: dadd           
        //   155: d2i            
        //   156: istore          6
        //   158: aload_1        
        //   159: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //   162: bipush          76
        //   164: iload           7
        //   166: ifne            214
        //   169: if_icmpne       196
        //   172: goto            176
        //   175: athrow         
        //   176: aload_0        
        //   177: aload_1        
        //   178: invokespecial   org/powerbot/core/randoms/Login.getPasswordX:(Lorg/powerbot/game/api/wrappers/widget/WidgetChild;)I
        //   181: iload           6
        //   183: iload_3        
        //   184: ineg           
        //   185: iload_3        
        //   186: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   189: iadd           
        //   190: iconst_1       
        //   191: invokestatic    org/powerbot/game/api/methods/input/Mouse.click:(IIZ)Z
        //   194: ireturn        
        //   195: athrow         
        //   196: iload           5
        //   198: iconst_1       
        //   199: iload           4
        //   201: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   204: iadd           
        //   205: iload           6
        //   207: iload_3        
        //   208: ineg           
        //   209: iload_3        
        //   210: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   213: iadd           
        //   214: iconst_1       
        //   215: invokestatic    org/powerbot/game/api/methods/input/Mouse.click:(IIZ)Z
        //   218: ireturn        
        //    StackMapTable: 00 1B FF 00 14 00 08 07 00 53 07 00 97 00 00 00 00 00 01 00 01 07 01 70 00 41 07 01 70 00 40 07 00 97 FF 00 13 00 08 07 00 53 07 00 97 07 00 CD 00 00 00 00 01 00 01 07 01 70 00 4B 07 01 70 40 01 46 07 01 70 00 4B 07 01 70 40 01 46 07 01 70 00 4C 07 01 70 FF 00 00 00 08 07 00 53 07 00 97 07 00 CD 00 00 00 00 01 00 02 01 01 45 07 01 70 00 40 01 00 FF 00 09 00 08 07 00 53 07 00 97 07 00 CD 00 00 00 00 01 00 02 01 01 FF 00 35 00 08 07 00 53 07 00 97 07 00 CD 01 01 01 01 01 00 01 07 01 70 00 52 07 01 70 00 FF 00 11 00 08 07 00 53 07 00 97 07 00 CD 01 01 01 01 01 00 02 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  169    195    195    196    Ljava/lang/RuntimeException;
        //  158    172    175    176    Ljava/lang/RuntimeException;
        //  88     105    108    109    Ljava/lang/RuntimeException;
        //  80     98     101    102    Ljava/lang/RuntimeException;
        //  67     84     87     88     Ljava/lang/RuntimeException;
        //  59     76     79     80     Ljava/lang/RuntimeException;
        //  46     63     66     67     Ljava/lang/RuntimeException;
        //  38     55     58     59     Ljava/lang/RuntimeException;
        //  29     42     45     46     Ljava/lang/RuntimeException;
        //  11     23     23     24     Ljava/lang/RuntimeException;
        //  5      17     20     21     Ljava/lang/RuntimeException;
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
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int getPasswordX(final WidgetChild p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: iconst_0       
        //     6: istore_2       
        //     7: aload_1        
        //     8: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundingRectangle:()Ljava/awt/Rectangle;
        //    11: astore_3       
        //    12: aload_3        
        //    13: invokevirtual   java/awt/Rectangle.getWidth:()D
        //    16: ldc2_w          4.0
        //    19: dsub           
        //    20: d2i            
        //    21: iconst_2       
        //    22: idiv           
        //    23: istore          4
        //    25: aload_3        
        //    26: invokevirtual   java/awt/Rectangle.getMinX:()D
        //    29: aload_3        
        //    30: invokevirtual   java/awt/Rectangle.getWidth:()D
        //    33: ldc2_w          2.0
        //    36: ddiv           
        //    37: dadd           
        //    38: d2i            
        //    39: istore          5
        //    41: aload_3        
        //    42: getfield        java/awt/Rectangle.x:I
        //    45: iload           7
        //    47: ifne            126
        //    50: iconst_m1      
        //    51: if_icmpeq       121
        //    54: goto            58
        //    57: athrow         
        //    58: aload_3        
        //    59: getfield        java/awt/Rectangle.y:I
        //    62: iload           7
        //    64: ifne            126
        //    67: goto            71
        //    70: athrow         
        //    71: iconst_m1      
        //    72: if_icmpeq       121
        //    75: goto            79
        //    78: athrow         
        //    79: aload_3        
        //    80: getfield        java/awt/Rectangle.width:I
        //    83: iload           7
        //    85: ifne            126
        //    88: goto            92
        //    91: athrow         
        //    92: iconst_m1      
        //    93: if_icmpeq       121
        //    96: goto            100
        //    99: athrow         
        //   100: aload_3        
        //   101: getfield        java/awt/Rectangle.height:I
        //   104: iload           7
        //   106: ifne            128
        //   109: goto            113
        //   112: athrow         
        //   113: iconst_m1      
        //   114: if_icmpne       127
        //   117: goto            121
        //   120: athrow         
        //   121: iconst_0       
        //   122: goto            126
        //   125: athrow         
        //   126: ireturn        
        //   127: iconst_0       
        //   128: istore          6
        //   130: iload           6
        //   132: sipush          596
        //   135: bipush          76
        //   137: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   140: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   143: invokevirtual   java/lang/String.length:()I
        //   146: if_icmpge       169
        //   149: iinc            2, 11
        //   152: iinc            6, 1
        //   155: iload           7
        //   157: ifne            198
        //   160: iload           7
        //   162: ifeq            130
        //   165: goto            169
        //   168: athrow         
        //   169: iload_2        
        //   170: bipush          44
        //   172: iload           7
        //   174: ifne            208
        //   177: if_icmple       198
        //   180: goto            184
        //   183: athrow         
        //   184: aload_3        
        //   185: invokevirtual   java/awt/Rectangle.getMinX:()D
        //   188: iload_2        
        //   189: i2d            
        //   190: dadd           
        //   191: ldc2_w          15.0
        //   194: dadd           
        //   195: d2i            
        //   196: ireturn        
        //   197: athrow         
        //   198: iload           5
        //   200: iload           4
        //   202: ineg           
        //   203: iload           4
        //   205: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   208: iadd           
        //   209: ireturn        
        //    StackMapTable: 00 1A FF 00 39 00 08 07 00 53 07 00 97 01 07 00 CD 01 01 00 01 00 01 07 01 70 00 4B 07 01 70 40 01 46 07 01 70 00 4B 07 01 70 40 01 46 07 01 70 00 4B 07 01 70 40 01 46 07 01 70 00 43 07 01 70 40 01 00 40 01 FF 00 01 00 08 07 00 53 07 00 97 01 07 00 CD 01 01 01 01 00 00 65 07 01 70 00 4D 07 01 70 00 4C 07 01 70 00 FF 00 09 00 08 07 00 53 07 00 97 01 07 00 CD 01 01 01 01 00 02 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  177    197    197    198    Ljava/lang/RuntimeException;
        //  169    180    183    184    Ljava/lang/RuntimeException;
        //  149    165    168    169    Ljava/lang/RuntimeException;
        //  113    122    125    126    Ljava/lang/RuntimeException;
        //  100    117    120    121    Ljava/lang/RuntimeException;
        //  92     109    112    113    Ljava/lang/RuntimeException;
        //  79     96     99     100    Ljava/lang/RuntimeException;
        //  71     88     91     92     Ljava/lang/RuntimeException;
        //  58     75     78     79     Ljava/lang/RuntimeException;
        //  50     67     70     71     Ljava/lang/RuntimeException;
        //  41     54     57     58     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0058:
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
    
    private boolean isUsernameCorrect() {
        return Widgets.get(596, 70).getText().toLowerCase().equalsIgnoreCase(this.bot.getAccount().toString());
    }
    
    private boolean isPasswordValid() {
        final String a = this.bot.getAccount().a();
        Label_0048: {
            int length = 0;
            String s2 = null;
            Label_0045: {
                Label_0039: {
                    String s;
                    try {
                        length = Widgets.get(596, 76).getText().length();
                        s = (s2 = a);
                        if (AntiRandom.c != 0) {
                            break Label_0045;
                        }
                        if (s == null) {
                            break Label_0039;
                        }
                        break Label_0039;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (s == null) {
                            final int length2 = 0;
                            break Label_0048;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                s2 = a;
            }
            final int length2 = s2.length();
            try {
                if (length == length2) {
                    return true;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return false;
    }
    
    private void attemptLogin() {
        Keyboard.sendKey('\n', Random.nextInt(100, 200));
    }
    
    private void erase(final int n) {
        final int c = AntiRandom.c;
        int i = 0;
        while (i <= n + Random.nextInt(1, 5)) {
            Label_0064: {
                Label_0047: {
                    try {
                        Keyboard.sendKey('\b', Random.nextInt(50, 150));
                        if (c != 0) {
                            break Label_0064;
                        }
                        final int n2 = 0;
                        final int n3 = 2;
                        final int n4 = Random.nextInt(n2, n3);
                        final int n5 = 1;
                        if (n4 == n5) {
                            break Label_0047;
                        }
                        break Label_0047;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int n2 = 0;
                        final int n3 = 2;
                        final int n4 = Random.nextInt(n2, n3);
                        final int n5 = 1;
                        if (n4 == n5) {
                            Task.sleep(Random.nextInt(25, 100));
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                ++i;
            }
            if (c != 0) {
                break;
            }
        }
    }
    
    @Override
    public void onRepaint(final Graphics graphics) {
        Label_0022: {
            try {
                super.onRepaint(graphics);
                if (AntiRandom.c != 0) {
                    break Label_0022;
                }
                final Login login = this;
                final Timer timer = login.re_load_timer;
                if (timer != null) {
                    break Label_0022;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Login login = this;
                final Timer timer = login.re_load_timer;
                if (timer == null) {
                    return;
                }
                graphics.setColor(Color.white);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        graphics.drawString(t.a(Login.z[0]) + this.re_load_timer.toRemainingString(), 8, 30);
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "9W%C\u0007Q\u0005y\u0015\u0018\fS$IF\\\u0002-R";
        int n4 = -1;
        String intern = null;
    Label_0056_Outer:
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
                                c2 = '\u000b';
                                break;
                            }
                            case 1: {
                                c2 = '\f';
                                break;
                            }
                            case 2: {
                                c2 = ')';
                                break;
                            }
                            case 3: {
                                c2 = '\u0012';
                                break;
                            }
                            default: {
                                c2 = '\u0006';
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
                    s = "8i<r\u0011f\u0019JIn\u001fo;x]j\u0001H\u0007vJ(";
                    n4 = 0;
                    continue Label_0056_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "}\ry\u0016T\u0002\\.\f\nZ\u000eu\u000b\u0018\u000eD,B\u0012\u000fL";
                    n4 = 1;
                    continue Label_0056_Outer;
                }
                case 1: {
                    break Label_0056_Outer;
                }
            }
        }
        z2[n3] = intern;
        z = z2;
    }
    
    private enum LobbyEvent
    {
        LOGGED_IN(249, Time.e(LobbyEvent.z[1]), Random.nextInt(1000, 4000));
        
        private final String message;
        private final int child;
        private final int wait;
        private final Job task;
        private static final String[] z;
        
        private LobbyEvent(final int child, final String message, final int wait, final Job task) {
            this.child = child;
            this.message = message;
            this.wait = wait;
            this.task = task;
        }
        
        private LobbyEvent(final int n2, final String s2, final int n3) {
            this(n2, s2, n3, null);
        }
        
        static {
            final String[] z2 = new String[2];
            int n2;
            int n = n2 = 0;
            String s = "\u000em\u000f\u0004Gh\u0013oc";
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
                    Label_0118: {
                        if (n4 > 1) {
                            break Label_0118;
                        }
                        length = (n5 = n6);
                        do {
                            final char c = charArray[n5];
                            char c2 = '\0';
                            switch (n6 % 5) {
                                case 0: {
                                    c2 = 'a';
                                    break;
                                }
                                case 1: {
                                    c2 = 'o';
                                    break;
                                }
                                case 2: {
                                    c2 = 'k';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u000e';
                                    break;
                                }
                                default: {
                                    c2 = '!';
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
                        s = "9\u0013,g5\u000f>\u0005IU:\u001c";
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
    
    private enum LoginEvent
    {
        TOKEN_FAILURE(13, ScriptHandler.e(LoginEvent.z[0]), 300000, (Job)new Task() {
            @Override
            public void execute() {
                Context.resolve().refresh();
            }
        }), 
        INVALID_PASSWORD(13, ScriptHandler.e(LoginEvent.z[3]), -1);
        
        private final String message;
        private final int child;
        private final int wait;
        private final Job task;
        private static final String[] z;
        
        private LoginEvent(final int child, final String message, final int wait, final Job task) {
            this.child = child;
            this.message = message;
            this.wait = wait;
            this.task = task;
        }
        
        private LoginEvent(final int n2, final String s2, final int n3) {
            this(n2, s2, n3, null);
        }
        
        static {
            final String[] z2 = new String[4];
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = 0));
            String s = "\u000f\u0001q_'\u001a\u0004nHo\u0007\u000e";
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
                                    c2 = '7';
                                    break;
                                }
                                case 1: {
                                    c2 = '>';
                                    break;
                                }
                                case 2: {
                                    c2 = 'C';
                                    break;
                                }
                                case 3: {
                                    c2 = 'd';
                                    break;
                                }
                                default: {
                                    c2 = 'X';
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
                        s = "tS\u001f\u0006\u001e]p?>:nN\u001e\b\u0000P";
                        n5 = 0;
                        continue Label_0062_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = 2)));
                        s = "@{++5b[\b\u000e\u001eAf%";
                        n5 = 1;
                        continue Label_0062_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = 3)));
                        s = "!\u000ej[k\u0000\u0005=Nu\r\u0012r[j\fArI&\u0018\u0001oIp\u0006\u0013y";
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
    }
}
