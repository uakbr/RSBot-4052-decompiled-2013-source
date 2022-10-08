
package org.powerbot.core;

import org.powerbot.core.event.EventMulticaster;
import org.powerbot.game.bot.Context;
import org.powerbot.core.bot.handlers.ScriptHandler;
import org.powerbot.core.event.EventManager;
import org.powerbot.game.bot.handler.input.a;

public class BotComposite
{
    private final Bot bot;
    a executor;
    EventManager eventManager;
    ScriptHandler scriptHandler;
    Context context;
    private static final String z;
    
    public BotComposite(final Bot bot) {
        this.bot = bot;
        this.executor = null;
        this.eventManager = new EventMulticaster();
        this.scriptHandler = new ScriptHandler(this.eventManager);
    }
    
    public void reload() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: getstatic       org/powerbot/core/Bot.log:Ljava/util/logging/Logger;
        //     8: getstatic       org/powerbot/core/BotComposite.z:Ljava/lang/String;
        //    11: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //    14: invokevirtual   java/util/logging/Logger.info:(Ljava/lang/String;)V
        //    17: aload_0        
        //    18: iload           7
        //    20: ifne            269
        //    23: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //    26: ifnull          261
        //    29: goto            33
        //    32: athrow         
        //    33: aload_0        
        //    34: iload           7
        //    36: ifne            269
        //    39: goto            43
        //    42: athrow         
        //    43: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //    46: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.isActive:()Z
        //    49: ifeq            261
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0        
        //    57: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //    60: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.pause:()V
        //    63: aload_0        
        //    64: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //    67: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.getScriptContainer:()Lorg/powerbot/core/script/job/Container;
        //    70: invokeinterface org/powerbot/core/script/job/Container.enumerate:()[Lorg/powerbot/core/script/job/Job;
        //    75: astore_1       
        //    76: new             Ljava/util/ArrayList;
        //    79: dup            
        //    80: invokespecial   java/util/ArrayList.<init>:()V
        //    83: astore_2       
        //    84: aload_1        
        //    85: astore_3       
        //    86: aload_3        
        //    87: arraylength    
        //    88: istore          4
        //    90: iconst_0       
        //    91: istore          5
        //    93: iload           5
        //    95: iload           4
        //    97: if_icmpge       156
        //   100: aload_3        
        //   101: iload           5
        //   103: aaload         
        //   104: astore          6
        //   106: iload           7
        //   108: ifne            151
        //   111: aload           6
        //   113: instanceof      Lorg/powerbot/core/script/job/LoopTask;
        //   116: iload           7
        //   118: ifne            352
        //   121: goto            125
        //   124: athrow         
        //   125: ifeq            148
        //   128: goto            132
        //   131: athrow         
        //   132: aload_2        
        //   133: aload           6
        //   135: checkcast       Lorg/powerbot/core/script/job/LoopTask;
        //   138: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   143: pop            
        //   144: goto            148
        //   147: athrow         
        //   148: iinc            5, 1
        //   151: iload           7
        //   153: ifeq            93
        //   156: invokestatic    java/lang/System.currentTimeMillis:()J
        //   159: lstore_3       
        //   160: aload_2        
        //   161: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   166: astore          5
        //   168: aload           5
        //   170: invokeinterface java/util/Iterator.hasNext:()Z
        //   175: ifeq            261
        //   178: aload           5
        //   180: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   185: checkcast       Lorg/powerbot/core/script/job/LoopTask;
        //   188: astore          6
        //   190: aload           6
        //   192: invokevirtual   org/powerbot/core/script/job/LoopTask.isPaused:()Z
        //   195: ifne            256
        //   198: aload           6
        //   200: invokevirtual   org/powerbot/core/script/job/LoopTask.isAlive:()Z
        //   203: iload           7
        //   205: ifne            175
        //   208: iload           7
        //   210: ifne            233
        //   213: ifeq            256
        //   216: goto            220
        //   219: athrow         
        //   220: invokestatic    java/lang/System.currentTimeMillis:()J
        //   223: lload_3        
        //   224: lsub           
        //   225: ldc2_w          120000
        //   228: lcmp           
        //   229: goto            233
        //   232: athrow         
        //   233: iload           7
        //   235: ifne            248
        //   238: ifge            256
        //   241: goto            245
        //   244: athrow         
        //   245: sipush          1000
        //   248: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   251: iload           7
        //   253: ifeq            190
        //   256: iload           7
        //   258: ifeq            168
        //   261: aload_0        
        //   262: getfield        org/powerbot/core/BotComposite.bot:Lorg/powerbot/core/Bot;
        //   265: invokevirtual   org/powerbot/core/Bot.terminateApplet:()V
        //   268: aload_0        
        //   269: getfield        org/powerbot/core/BotComposite.bot:Lorg/powerbot/core/Bot;
        //   272: sipush          765
        //   275: sipush          553
        //   278: invokevirtual   org/powerbot/core/Bot.resize:(II)V
        //   281: new             Ljava/lang/Thread;
        //   284: dup            
        //   285: aload_0        
        //   286: getfield        org/powerbot/core/BotComposite.bot:Lorg/powerbot/core/Bot;
        //   289: getfield        org/powerbot/core/Bot.threadGroup:Ljava/lang/ThreadGroup;
        //   292: invokestatic    org/powerbot/core/Bot.instance:()Lorg/powerbot/core/Bot;
        //   295: invokespecial   java/lang/Thread.<init>:(Ljava/lang/ThreadGroup;Ljava/lang/Runnable;)V
        //   298: invokevirtual   java/lang/Thread.start:()V
        //   301: invokestatic    org/powerbot/qb.a:()Lorg/powerbot/qb;
        //   304: getfield        org/powerbot/qb.c:Lorg/powerbot/wb;
        //   307: aload_0        
        //   308: getfield        org/powerbot/core/BotComposite.bot:Lorg/powerbot/core/Bot;
        //   311: invokevirtual   org/powerbot/wb.a:(Lorg/powerbot/core/Bot;)V
        //   314: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //   317: ifnull          345
        //   320: invokestatic    org/powerbot/core/script/methods/Game.getClientState:()I
        //   323: iload           7
        //   325: ifne            352
        //   328: iload           7
        //   330: ifne            352
        //   333: goto            337
        //   336: athrow         
        //   337: iconst_m1      
        //   338: if_icmpne       360
        //   341: goto            345
        //   344: athrow         
        //   345: sipush          1000
        //   348: goto            352
        //   351: athrow         
        //   352: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   355: iload           7
        //   357: ifeq            314
        //   360: aload_0        
        //   361: iload           7
        //   363: ifne            411
        //   366: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   369: ifnull          410
        //   372: goto            376
        //   375: athrow         
        //   376: aload_0        
        //   377: iload           7
        //   379: ifne            411
        //   382: goto            386
        //   385: athrow         
        //   386: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   389: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.isActive:()Z
        //   392: ifeq            410
        //   395: goto            399
        //   398: athrow         
        //   399: aload_0        
        //   400: getfield        org/powerbot/core/BotComposite.scriptHandler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   403: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.resume:()V
        //   406: goto            410
        //   409: athrow         
        //   410: aload_0        
        //   411: getfield        org/powerbot/core/BotComposite.bot:Lorg/powerbot/core/Bot;
        //   414: iconst_0       
        //   415: putfield        org/powerbot/core/Bot.refreshing:Z
        //   418: getstatic       org/powerbot/core/script/job/Task.a:I
        //   421: ifeq            436
        //   424: iinc            7, 1
        //   427: iload           7
        //   429: putstatic       org/powerbot/core/Bot.a:I
        //   432: goto            436
        //   435: athrow         
        //   436: return         
        //    StackMapTable: 00 2F FF 00 20 00 08 07 00 2B 00 00 00 00 00 00 01 00 01 07 00 B2 00 48 07 00 B2 40 07 00 2B 4B 07 00 B2 00 FF 00 24 00 08 07 00 2B 07 00 C7 07 00 10 07 00 C7 01 01 00 01 00 00 FF 00 1E 00 08 07 00 2B 07 00 C7 07 00 10 07 00 C7 01 01 07 00 C9 01 00 01 07 00 B2 40 01 45 07 00 B2 00 4E 07 00 B2 00 02 FF 00 04 00 08 07 00 2B 07 00 C7 07 00 10 07 00 C7 01 01 00 01 00 00 FF 00 0B 00 07 07 00 2B 07 00 C7 07 00 10 04 07 00 54 00 01 00 00 46 01 FF 00 0E 00 07 07 00 2B 07 00 C7 07 00 10 04 07 00 54 07 00 12 01 00 00 5C 07 00 B2 00 4B 07 00 B2 40 01 4A 07 00 B2 00 42 01 07 FF 00 04 00 08 07 00 2B 00 00 00 00 00 00 01 00 00 47 07 00 2B 2C 55 07 00 B2 40 01 46 07 00 B2 00 45 07 00 B2 40 01 07 4E 07 00 B2 00 48 07 00 B2 40 07 00 2B 4B 07 00 B2 00 49 07 00 B2 00 40 07 00 2B 57 07 00 B2 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  411    432    435    436    Ljava/lang/RuntimeException;
        //  386    406    409    410    Ljava/lang/RuntimeException;
        //  376    395    398    399    Ljava/lang/RuntimeException;
        //  366    382    385    386    Ljava/lang/RuntimeException;
        //  360    372    375    376    Ljava/lang/RuntimeException;
        //  337    348    351    352    Ljava/lang/RuntimeException;
        //  328    341    344    345    Ljava/lang/RuntimeException;
        //  320    333    336    337    Ljava/lang/RuntimeException;
        //  233    241    244    245    Ljava/lang/RuntimeException;
        //  213    229    232    233    Ljava/lang/RuntimeException;
        //  208    216    219    220    Ljava/lang/RuntimeException;
        //  125    144    147    148    Ljava/lang/RuntimeException;
        //  111    128    131    132    Ljava/lang/RuntimeException;
        //  106    121    124    125    Ljava/lang/RuntimeException;
        //  33     52     55     56     Ljava/lang/RuntimeException;
        //  23     39     42     43     Ljava/lang/RuntimeException;
        //  5      29     32     33     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0033:
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
        final char[] charArray = "I(5\u0007%A\f\u00132\u000e;(=\u0003)@\u000b\u00141\fu9".toCharArray();
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
                            c2 = '\u0011';
                            break;
                        }
                        case 1: {
                            c2 = 'n';
                            break;
                        }
                        case 2: {
                            c2 = 'Y';
                            break;
                        }
                        case 3: {
                            c2 = 'V';
                            break;
                        }
                        default: {
                            c2 = 'J';
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
