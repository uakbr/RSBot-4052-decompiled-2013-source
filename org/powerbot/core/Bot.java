
package org.powerbot.core;

import java.awt.Canvas;
import org.powerbot.game.client.Callback;
import org.powerbot.game.bot.a;
import org.powerbot.core.event.EventManager;
import org.powerbot.core.bot.handlers.ScriptHandler;
import org.powerbot.core.script.job.Task;
import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Graphics;
import org.powerbot.game.api.methods.widget.WidgetCache;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.bot.Context;
import java.awt.Dimension;
import org.powerbot.jb;
import org.powerbot.wb;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.client.Client;
import java.awt.image.BufferedImage;
import org.powerbot.t;
import org.powerbot.core.bot.ClientStub;
import org.powerbot.core.bot.RSLoader;
import org.powerbot.core.event.events.TextPaintEvent;
import org.powerbot.core.event.events.PaintEvent;
import java.util.logging.Logger;

public final class Bot implements Runnable
{
    static final Logger log;
    private static Bot instance;
    public final BotComposite composite;
    private final PaintEvent paintEvent;
    private final TextPaintEvent textPaintEvent;
    public volatile RSLoader appletContainer;
    public volatile ClientStub stub;
    public Runnable callback;
    public ThreadGroup threadGroup;
    public t modScript;
    public BufferedImage image;
    public volatile boolean refreshing;
    private Client client;
    private Constants constants;
    private wb panel;
    private jb.a_ account;
    private BufferedImage backBuffer;
    public static int a;
    private static final String[] z;
    
    private Bot() {
        this.appletContainer = null;
        this.callback = null;
        this.stub = null;
        this.threadGroup = new ThreadGroup(Bot.class.getName() + ClientStub.e("D") + this.hashCode());
        this.composite = new BotComposite(this);
        this.panel = null;
        this.account = null;
        final Dimension dimension = new Dimension(765, 553);
        this.image = new BufferedImage(dimension.width, dimension.height, 1);
        this.backBuffer = new BufferedImage(dimension.width, dimension.height, 1);
        this.paintEvent = new PaintEvent();
        this.textPaintEvent = new TextPaintEvent();
        new Thread(this.threadGroup, this.composite.eventManager, this.composite.eventManager.getClass().getName()).start();
        this.refreshing = false;
    }
    
    public static synchronized Bot instance() {
        Label_0016: {
            Bot bot;
            try {
                final Bot bot2;
                bot = (bot2 = Bot.instance);
                if (Bot.a != 0) {
                    return bot2;
                }
                if (bot == null) {
                    break Label_0016;
                }
                return Bot.instance;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (bot == null) {
                    Bot.instance = new Bot();
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return Bot.instance;
    }
    
    public static boolean instantiated() {
        try {
            if (Bot.instance != null) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    public static Client client() {
        return Bot.instance.client;
    }
    
    public static Constants constants() {
        return Bot.instance.constants;
    }
    
    public static Context context() {
        return Bot.instance.composite.context;
    }
    
    public static void setSpeed(final Mouse.Speed p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //     7: invokevirtual   java/lang/Thread.getThreadGroup:()Ljava/lang/ThreadGroup;
        //    10: astore_1       
        //    11: getstatic       org/powerbot/core/Bot$4.$SwitchMap$org$powerbot$game$api$methods$input$Mouse$Speed:[I
        //    14: iload_2        
        //    15: ifne            192
        //    18: aload_0        
        //    19: invokevirtual   org/powerbot/game/api/methods/input/Mouse$Speed.ordinal:()I
        //    22: iaload         
        //    23: tableswitch {
        //                2: 57
        //                3: 81
        //                4: 105
        //                5: 127
        //                6: 151
        //          default: 175
        //        }
        //    56: athrow         
        //    57: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //    60: aload_1        
        //    61: ldc2_w          0.5
        //    64: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    67: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    72: pop            
        //    73: iload_2        
        //    74: ifeq            193
        //    77: goto            81
        //    80: athrow         
        //    81: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //    84: aload_1        
        //    85: ldc2_w          0.8
        //    88: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //    91: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    96: pop            
        //    97: iload_2        
        //    98: ifeq            193
        //   101: goto            105
        //   104: athrow         
        //   105: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //   108: aload_1        
        //   109: dconst_1       
        //   110: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   113: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   118: pop            
        //   119: iload_2        
        //   120: ifeq            193
        //   123: goto            127
        //   126: athrow         
        //   127: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //   130: aload_1        
        //   131: ldc2_w          1.7
        //   134: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   137: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   142: pop            
        //   143: iload_2        
        //   144: ifeq            193
        //   147: goto            151
        //   150: athrow         
        //   151: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //   154: aload_1        
        //   155: ldc2_w          2.5
        //   158: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   161: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   166: pop            
        //   167: iload_2        
        //   168: ifeq            193
        //   171: goto            175
        //   174: athrow         
        //   175: getstatic       org/powerbot/game/bot/handler/input/util/MouseNode.a:Ljava/util/Map;
        //   178: aload_1        
        //   179: dconst_1       
        //   180: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   183: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   188: goto            192
        //   191: athrow         
        //   192: pop            
        //   193: return         
        //    StackMapTable: 00 0F FF 00 38 00 03 07 00 AF 07 00 07 01 00 01 07 00 5B 00 56 07 00 5B 00 56 07 00 5B 00 54 07 00 5B 00 56 07 00 5B 00 56 07 00 5B 00 4F 07 00 5B 40 07 00 7B 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  151    188    191    192    Ljava/lang/RuntimeException;
        //  127    171    174    175    Ljava/lang/RuntimeException;
        //  105    147    150    151    Ljava/lang/RuntimeException;
        //  81     123    126    127    Ljava/lang/RuntimeException;
        //  57     101    104    105    Ljava/lang/RuntimeException;
        //  18     77     80     81     Ljava/lang/RuntimeException;
        //  11     56     56     57     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0057:
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
    public void run() {
        this.start();
    }
    
    public void start() {
        final int a = Bot.a;
        Bot.log.info(Constants.e(Bot.z[4]));
        final Context context = this.composite.context;
        Label_0093: {
            Label_0053: {
                Context context2;
                try {
                    this.composite.context = new Context(this);
                    context2 = context;
                    if (a != 0) {
                        break Label_0093;
                    }
                    if (context2 != null) {
                        break Label_0053;
                    }
                    break Label_0053;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (context2 != null) {
                        WidgetCache.purge();
                        this.composite.context.world = context.world;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            Context.context.put(this.threadGroup, this.composite.context);
        }
        (this.appletContainer = new RSLoader()).setCallback(new Runnable() {
            @Override
            public void run() {
                Bot.this.setClient((Client)Bot.this.appletContainer.getClient());
                final Graphics graphics = Bot.this.image.getGraphics();
                Bot.this.appletContainer.update(graphics);
                graphics.dispose();
                Bot.this.resize(765, 553);
            }
        });
        this.appletContainer.load();
        this.stub = new ClientStub(this.appletContainer);
        this.appletContainer.setStub(this.stub);
        this.stub.setApplet(this.appletContainer);
        this.stub.setActive(true);
        Bot.log.info(ClientStub.e(Bot.z[6]));
        new Thread(this.threadGroup, this.appletContainer, Constants.e(Bot.z[5])).start();
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    public void stop() {
        final int a = Bot.a;
        Label_0119: {
            Label_0069: {
                EventManager eventManager = null;
                Label_0055: {
                    Label_0022: {
                        BotComposite botComposite;
                        try {
                            final BotComposite botComposite2;
                            botComposite = (botComposite2 = this.composite);
                            if (a != 0) {
                                break Label_0055;
                            }
                            final ScriptHandler scriptHandler = botComposite.scriptHandler;
                            if (scriptHandler != null) {
                                break Label_0022;
                            }
                            break Label_0022;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final ScriptHandler scriptHandler = botComposite.scriptHandler;
                            if (scriptHandler != null) {
                                this.composite.scriptHandler.stop();
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    Bot.log.info(ClientStub.e(Bot.z[7]));
                    BotComposite botComposite2 = this.composite;
                    try {
                        eventManager = botComposite2.eventManager;
                        if (a != 0) {
                            break Label_0119;
                        }
                        if (eventManager != null) {
                            break Label_0069;
                        }
                        break Label_0069;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (eventManager != null) {
                        this.composite.eventManager.stop();
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            new Thread(this.threadGroup, new Runnable() {
                @Override
                public void run() {
                    Bot.this.terminateApplet();
                }
            }).start();
            Context.context.remove(this.threadGroup);
        }
        Bot.instance = null;
    }
    
    void terminateApplet() {
        final int a = Bot.a;
        RSLoader rsLoader2 = null;
        Label_0060: {
            RSLoader rsLoader = null;
            Label_0046: {
                Label_0019: {
                    try {
                        final Bot bot = this;
                        if (a != 0) {
                            break Label_0046;
                        }
                        final ClientStub clientStub = this.stub;
                        if (clientStub != null) {
                            break Label_0019;
                        }
                        break Label_0019;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final ClientStub clientStub = this.stub;
                        if (clientStub != null) {
                            Bot.log.fine(Constants.e(Bot.z[2]));
                            this.stub.setActive(false);
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final Bot bot = this;
                try {
                    rsLoader = (rsLoader2 = bot.appletContainer);
                    if (a != 0) {
                        break Label_0060;
                    }
                    if (rsLoader != null) {
                        break Label_0060;
                    }
                    return;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (rsLoader == null) {
                    return;
                }
                Bot.log.fine(ClientStub.e(Bot.z[3]));
                this.appletContainer.stop();
                rsLoader2 = this.appletContainer;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        rsLoader2.destroy();
        this.appletContainer = null;
        this.stub = null;
        this.client = null;
    }
    
    public void stopScript() {
        ScriptHandler scriptHandler2 = null;
        Label_0058: {
            Label_0020: {
                ScriptHandler scriptHandler;
                try {
                    scriptHandler = (scriptHandler2 = this.composite.scriptHandler);
                    if (Bot.a != 0) {
                        break Label_0058;
                    }
                    if (scriptHandler == null) {
                        break Label_0020;
                    }
                    break Label_0020;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (scriptHandler == null) {
                        throw new RuntimeException(Constants.e(Bot.z[1]));
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            Bot.log.info(ClientStub.e(Bot.z[0]));
            scriptHandler2 = this.composite.scriptHandler;
        }
        scriptHandler2.shutdown();
    }
    
    public BufferedImage getImage() {
        return this.image;
    }
    
    public BufferedImage getBuffer() {
        return this.backBuffer;
    }
    
    public void resize(final int n, final int n2) {
        RSLoader rsLoader2 = null;
        Label_0045: {
            RSLoader rsLoader;
            try {
                this.backBuffer = new BufferedImage(n, n2, 1);
                this.image = new BufferedImage(n, n2, 1);
                rsLoader = (rsLoader2 = this.appletContainer);
                if (Bot.a != 0) {
                    break Label_0045;
                }
                if (rsLoader != null) {
                    break Label_0045;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (rsLoader == null) {
                    return;
                }
                rsLoader2 = this.appletContainer;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        rsLoader2.setSize(n, n2);
        final Graphics graphics = this.backBuffer.getGraphics();
        this.appletContainer.update(graphics);
        graphics.dispose();
    }
    
    public Graphics getBufferGraphics() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/powerbot/core/Bot.backBuffer:Ljava/awt/image/BufferedImage;
        //     8: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //    11: astore_1       
        //    12: aload_0        
        //    13: iload_3        
        //    14: ifne            125
        //    17: getfield        org/powerbot/core/Bot.client:Lorg/powerbot/game/client/Client;
        //    20: ifnull          120
        //    23: goto            27
        //    26: athrow         
        //    27: aload_0        
        //    28: iload_3        
        //    29: ifne            125
        //    32: goto            36
        //    35: athrow         
        //    36: getfield        org/powerbot/core/Bot.panel:Lorg/powerbot/wb;
        //    39: ifnull          120
        //    42: goto            46
        //    45: athrow         
        //    46: getstatic       org/powerbot/qb.e:Z
        //    49: ifne            120
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0        
        //    57: getfield        org/powerbot/core/Bot.paintEvent:Lorg/powerbot/core/event/events/PaintEvent;
        //    60: aload_1        
        //    61: putfield        org/powerbot/core/event/events/PaintEvent.graphics:Ljava/awt/Graphics;
        //    64: aload_0        
        //    65: getfield        org/powerbot/core/Bot.textPaintEvent:Lorg/powerbot/core/event/events/TextPaintEvent;
        //    68: aload_1        
        //    69: putfield        org/powerbot/core/event/events/TextPaintEvent.graphics:Ljava/awt/Graphics;
        //    72: aload_0        
        //    73: getfield        org/powerbot/core/Bot.textPaintEvent:Lorg/powerbot/core/event/events/TextPaintEvent;
        //    76: iconst_0       
        //    77: putfield        org/powerbot/core/event/events/TextPaintEvent.id:I
        //    80: aload_0        
        //    81: getfield        org/powerbot/core/Bot.composite:Lorg/powerbot/core/BotComposite;
        //    84: getfield        org/powerbot/core/BotComposite.eventManager:Lorg/powerbot/core/event/EventManager;
        //    87: aload_0        
        //    88: getfield        org/powerbot/core/Bot.paintEvent:Lorg/powerbot/core/event/events/PaintEvent;
        //    91: invokeinterface org/powerbot/core/event/EventManager.fire:(Ljava/util/EventObject;)V
        //    96: aload_0        
        //    97: getfield        org/powerbot/core/Bot.composite:Lorg/powerbot/core/BotComposite;
        //   100: getfield        org/powerbot/core/BotComposite.eventManager:Lorg/powerbot/core/event/EventManager;
        //   103: aload_0        
        //   104: getfield        org/powerbot/core/Bot.textPaintEvent:Lorg/powerbot/core/event/events/TextPaintEvent;
        //   107: invokeinterface org/powerbot/core/event/EventManager.fire:(Ljava/util/EventObject;)V
        //   112: goto            120
        //   115: astore_2       
        //   116: aload_2        
        //   117: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   120: aload_1        
        //   121: invokevirtual   java/awt/Graphics.dispose:()V
        //   124: aload_0        
        //   125: getfield        org/powerbot/core/Bot.image:Ljava/awt/image/BufferedImage;
        //   128: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //   131: astore_2       
        //   132: aload_2        
        //   133: aload_0        
        //   134: getfield        org/powerbot/core/Bot.backBuffer:Ljava/awt/image/BufferedImage;
        //   137: iconst_0       
        //   138: iconst_0       
        //   139: aconst_null    
        //   140: invokevirtual   java/awt/Graphics.drawImage:(Ljava/awt/Image;IILjava/awt/image/ImageObserver;)Z
        //   143: pop            
        //   144: aload_2        
        //   145: invokevirtual   java/awt/Graphics.dispose:()V
        //   148: aload_0        
        //   149: iload_3        
        //   150: ifne            175
        //   153: getfield        org/powerbot/core/Bot.panel:Lorg/powerbot/wb;
        //   156: ifnull          174
        //   159: goto            163
        //   162: athrow         
        //   163: aload_0        
        //   164: getfield        org/powerbot/core/Bot.panel:Lorg/powerbot/wb;
        //   167: invokevirtual   org/powerbot/wb.repaint:()V
        //   170: goto            174
        //   173: athrow         
        //   174: aload_0        
        //   175: getfield        org/powerbot/core/Bot.backBuffer:Ljava/awt/image/BufferedImage;
        //   178: invokevirtual   java/awt/image/BufferedImage.getGraphics:()Ljava/awt/Graphics;
        //   181: areturn        
        //    StackMapTable: 00 10 FF 00 1A 00 04 07 00 0A 07 01 29 00 01 00 01 07 00 67 00 47 07 00 67 40 07 00 0A 48 07 00 67 00 48 07 00 67 00 7A 07 00 67 04 44 07 00 0A FF 00 24 00 04 07 00 0A 07 01 29 07 01 29 01 00 01 07 00 67 00 49 07 00 67 00 40 07 00 0A
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  36     52     55     56     Ljava/lang/Exception;
        //  27     42     45     46     Ljava/lang/Exception;
        //  17     32     35     36     Ljava/lang/Exception;
        //  12     23     26     27     Ljava/lang/Exception;
        //  80     112    115    120    Ljava/lang/Exception;
        //  153    170    173    174    Ljava/lang/Exception;
        //  132    159    162    163    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    public void setPanel(final wb panel) {
        this.panel = panel;
    }
    
    private void setClient(final Client client) {
        (this.client = client).setCallback(new a(this));
        this.constants = new Constants(this.modScript.d);
        new Thread(this.threadGroup, new SafeMode(this)).start();
        this.composite.executor = new org.powerbot.game.bot.handler.input.a();
    }
    
    public Context getContext() {
        return this.composite.context;
    }
    
    public Canvas getCanvas() {
        Client client2 = null;
        Label_0017: {
            Client client;
            try {
                client = (client2 = this.client);
                if (Bot.a != 0) {
                    return client2.getCanvas();
                }
                if (client != null) {
                    break Label_0017;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (client == null) {
                    return null;
                }
                client2 = this.client;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return client2.getCanvas();
        canvas = null;
        return canvas;
    }
    
    public org.powerbot.game.bot.handler.input.a getMouseExecutor() {
        return this.composite.executor;
    }
    
    public EventManager getEventManager() {
        return this.composite.eventManager;
    }
    
    public jb.a_ getAccount() {
        return this.account;
    }
    
    public void setAccount(final jb.a_ account) {
        this.account = account;
    }
    
    public ScriptHandler getScriptHandler() {
        return this.composite.scriptHandler;
    }
    
    public synchronized void refresh() {
        Bot bot = null;
        Label_0020: {
            Label_0019: {
                try {
                    bot = this;
                    if (Bot.a != 0) {
                        break Label_0020;
                    }
                    final boolean b = this.refreshing;
                    if (b) {
                        return;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.refreshing;
                    if (b) {
                        return;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            bot = this;
        }
        bot.refreshing = true;
        new Thread(this.threadGroup, new Runnable() {
            @Override
            public void run() {
                Bot.this.composite.reload();
            }
        }).start();
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
        String s = "\u0007\u000bR^\rBn%qq7\rT^\t";
        int n9 = -1;
        String intern = null;
    Label_0110_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n11;
            final int n10 = n11 = (length = charArray.length);
            int n12 = 0;
            while (true) {
                Label_0185: {
                    if (n10 > 1) {
                        break Label_0185;
                    }
                    length = (n11 = n12);
                    do {
                        final char c = charArray[n11];
                        char c2 = '\0';
                        switch (n12 % 5) {
                            case 0: {
                                c2 = 'P';
                                break;
                            }
                            case 1: {
                                c2 = '\u0004';
                                break;
                            }
                            case 2: {
                                c2 = '9';
                                break;
                            }
                            case 3: {
                                c2 = 'U';
                                break;
                            }
                            default: {
                                c2 = 'y';
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
                    s = "tb\u001c9^!sUq\\in\u0000pK-:Ov\u0019iuO";
                    n9 = 0;
                    continue Label_0110_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "Sd\u001c=G;2Hk\u0012`!\u001d$[7s]a\bnw\u0007$G0 ";
                    n9 = 1;
                    continue Label_0110_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "xh7%v=\u0011Z\u000e\u0019Dw,qc$\u000fQK\t";
                    n9 = 2;
                    continue Label_0110_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "\u0006']p\bno\tpL:'";
                    n9 = 3;
                    continue Label_0110_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "\u0019<]f\u0019u";
                    n9 = 4;
                    continue Label_0110_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "\u0007\u000b\\\\\tBn%qe5\u0012X";
                    n9 = 5;
                    continue Label_0110_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = "\u0001\u0011QA\u001cOi,6\"1\u0011KG\u000fDn/4l ";
                    n9 = 6;
                    continue Label_0110_Outer;
                }
                case 6: {
                    break Label_0110_Outer;
                }
            }
        }
        z2[n8] = intern;
        z = z2;
        log = Logger.getLogger(Bot.class.getName());
    }
    
    private static final class SafeMode implements Runnable
    {
        private final Bot bot;
        
        public SafeMode(final Bot bot) {
            this.bot = bot;
        }
        
        @Override
        public void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore_1       
            //     4: aload_0        
            //     5: getfield        org/powerbot/core/Bot$SafeMode.bot:Lorg/powerbot/core/Bot;
            //     8: iload_1        
            //     9: ifne            27
            //    12: ifnull          108
            //    15: goto            19
            //    18: athrow         
            //    19: aload_0        
            //    20: getfield        org/powerbot/core/Bot$SafeMode.bot:Lorg/powerbot/core/Bot;
            //    23: goto            27
            //    26: athrow         
            //    27: invokestatic    org/powerbot/core/Bot.access$100:(Lorg/powerbot/core/Bot;)Lorg/powerbot/game/client/Client;
            //    30: ifnull          108
            //    33: invokestatic    org/powerbot/game/api/methods/input/Keyboard.isReady:()Z
            //    36: iload_1        
            //    37: ifne            54
            //    40: goto            44
            //    43: athrow         
            //    44: ifne            108
            //    47: goto            51
            //    50: athrow         
            //    51: invokestatic    org/powerbot/game/api/methods/input/Keyboard.isReady:()Z
            //    54: ifne            97
            //    57: invokestatic    org/powerbot/game/api/methods/input/Mouse.isReady:()Z
            //    60: iload_1        
            //    61: ifne            105
            //    64: goto            68
            //    67: athrow         
            //    68: iload_1        
            //    69: ifne            105
            //    72: goto            76
            //    75: athrow         
            //    76: ifne            97
            //    79: goto            83
            //    82: athrow         
            //    83: sipush          1000
            //    86: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
            //    89: iload_1        
            //    90: ifeq            51
            //    93: goto            97
            //    96: athrow         
            //    97: sipush          800
            //   100: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
            //   103: bipush          115
            //   105: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendKey:(C)V
            //   108: return         
            //    StackMapTable: 00 13 FF 00 12 00 02 07 00 08 01 00 01 07 00 32 00 46 07 00 32 40 07 00 14 4F 07 00 32 40 01 45 07 00 32 00 42 01 4C 07 00 32 40 01 46 07 00 32 40 01 45 07 00 32 00 4C 07 00 32 00 47 01 02
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  76     93     96     97     Ljava/lang/RuntimeException;
            //  68     79     82     83     Ljava/lang/RuntimeException;
            //  57     72     75     76     Ljava/lang/RuntimeException;
            //  54     64     67     68     Ljava/lang/RuntimeException;
            //  33     47     50     51     Ljava/lang/RuntimeException;
            //  27     40     43     44     Ljava/lang/RuntimeException;
            //  12     23     26     27     Ljava/lang/RuntimeException;
            //  4      15     18     19     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    }
}
