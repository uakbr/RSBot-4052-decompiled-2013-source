
package org.powerbot;

import java.util.EventObject;
import java.awt.Canvas;
import org.powerbot.core.bot.RSLoader;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ComponentListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import java.awt.LayoutManager;
import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;
import org.powerbot.core.Bot;
import javax.swing.JPanel;

public class wb extends JPanel
{
    private int a;
    private static final long serialVersionUID = 1L;
    private Bot b;
    private int c;
    private int d;
    public final vb e;
    public static boolean f;
    
    public wb(final Component component) {
        final Dimension minimumSize = new Dimension(765, 553);
        this.setSize(minimumSize);
        this.setPreferredSize(minimumSize);
        this.setMinimumSize(minimumSize);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
        this.setBackground(Color.black);
        this.b = null;
        final int n = 0;
        this.d = n;
        this.c = n;
        this.a = 3;
        this.setLayout(new GridBagLayout());
        this.add(this.e = new vb(component));
        this.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(final ComponentEvent componentEvent) {
                wb.this.b();
                wb.this.requestFocus();
            }
        });
        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                wb wb2 = null;
                Label_0028: {
                    wb wb;
                    try {
                        org.powerbot.wb.this.a(mouseEvent);
                        wb = (wb2 = org.powerbot.wb.this);
                        if (org.powerbot.wb.f) {
                            break Label_0028;
                        }
                        final boolean b = wb.hasFocus();
                        if (!b) {
                            break Label_0028;
                        }
                        return;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final boolean b = wb.hasFocus();
                        if (b) {
                            return;
                        }
                        wb2 = org.powerbot.wb.this;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                wb2.requestFocus();
            }
            
            @Override
            public void mouseEntered(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
            
            @Override
            public void mouseExited(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
            
            @Override
            public void mousePressed(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
            
            @Override
            public void mouseReleased(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
        });
        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
            
            @Override
            public void mouseMoved(final MouseEvent mouseEvent) {
                wb.this.a(mouseEvent);
            }
        });
        this.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
                wb.this.a(mouseWheelEvent);
            }
        });
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(final KeyEvent keyEvent) {
                wb.this.a(keyEvent);
            }
            
            @Override
            public void keyReleased(final KeyEvent keyEvent) {
                wb.this.a(keyEvent);
            }
            
            @Override
            public void keyTyped(final KeyEvent keyEvent) {
                wb.this.a(keyEvent);
            }
        });
    }
    
    public void paintComponent(final Graphics g) {
        final boolean f = wb.f;
        wb wb = null;
        Label_0040: {
            Label_0025: {
                Label_0020: {
                    try {
                        if (f) {
                            break Label_0025;
                        }
                        final boolean b = qb.e;
                        if (b) {
                            return;
                        }
                        break Label_0020;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final boolean b = qb.e;
                        if (b) {
                            return;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                super.paintComponent(g);
                try {
                    wb = this;
                    if (f) {
                        break Label_0040;
                    }
                    final Bot bot = this.b;
                    if (bot != null) {
                        break Label_0040;
                    }
                    return;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                final Bot bot = this.b;
                if (bot == null) {
                    return;
                }
                wb = this;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        wb.e.setVisible(false);
        g.drawImage(this.b.image, this.c, this.d, null);
    }
    
    public void a(final Bot p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //     8: iload_2        
        //     9: ifne            53
        //    12: ifnull          31
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    23: aconst_null    
        //    24: invokevirtual   org/powerbot/core/Bot.setPanel:(Lorg/powerbot/wb;)V
        //    27: goto            31
        //    30: athrow         
        //    31: aload_0        
        //    32: aload_1        
        //    33: putfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    36: aload_0        
        //    37: getfield        org/powerbot/wb.e:Lorg/powerbot/vb;
        //    40: iload_2        
        //    41: ifne            152
        //    44: iconst_1       
        //    45: invokevirtual   org/powerbot/vb.setVisible:(Z)V
        //    48: aload_1        
        //    49: goto            53
        //    52: athrow         
        //    53: ifnull          144
        //    56: aload_0        
        //    57: invokevirtual   org/powerbot/wb.getGraphics:()Ljava/awt/Graphics;
        //    60: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
        //    63: invokevirtual   java/awt/Graphics.setColor:(Ljava/awt/Color;)V
        //    66: aload_0        
        //    67: invokevirtual   org/powerbot/wb.getGraphics:()Ljava/awt/Graphics;
        //    70: iconst_0       
        //    71: iconst_0       
        //    72: aload_0        
        //    73: invokevirtual   org/powerbot/wb.getWidth:()I
        //    76: aload_0        
        //    77: invokevirtual   org/powerbot/wb.getHeight:()I
        //    80: invokevirtual   java/awt/Graphics.fillRect:(IIII)V
        //    83: aload_0        
        //    84: getfield        org/powerbot/wb.e:Lorg/powerbot/vb;
        //    87: invokevirtual   org/powerbot/vb.validate:()V
        //    90: aload_0        
        //    91: getfield        org/powerbot/wb.e:Lorg/powerbot/vb;
        //    94: invokevirtual   org/powerbot/vb.repaint:()V
        //    97: aload_0        
        //    98: getfield        org/powerbot/wb.e:Lorg/powerbot/vb;
        //   101: aload_1        
        //   102: getfield        org/powerbot/core/Bot.threadGroup:Ljava/lang/ThreadGroup;
        //   105: invokevirtual   org/powerbot/vb.a:(Ljava/lang/ThreadGroup;)V
        //   108: aload_1        
        //   109: aload_0        
        //   110: invokevirtual   org/powerbot/core/Bot.setPanel:(Lorg/powerbot/wb;)V
        //   113: iload_2        
        //   114: ifne            140
        //   117: goto            121
        //   120: athrow         
        //   121: aload_1        
        //   122: invokevirtual   org/powerbot/core/Bot.getCanvas:()Ljava/awt/Canvas;
        //   125: ifnull          156
        //   128: goto            132
        //   131: athrow         
        //   132: aload_0        
        //   133: invokevirtual   org/powerbot/wb.c:()V
        //   136: goto            140
        //   139: athrow         
        //   140: iload_2        
        //   141: ifeq            156
        //   144: aload_0        
        //   145: getfield        org/powerbot/wb.e:Lorg/powerbot/vb;
        //   148: goto            152
        //   151: athrow         
        //   152: aconst_null    
        //   153: invokevirtual   org/powerbot/vb.a:(Ljava/lang/ThreadGroup;)V
        //   156: return         
        //    StackMapTable: 00 10 FF 00 12 00 03 07 00 59 07 00 A1 01 00 01 07 01 38 00 4A 07 01 38 00 54 07 01 38 40 07 00 A1 F7 00 42 07 01 38 00 49 07 01 38 00 46 07 01 38 00 03 46 07 01 38 40 07 00 14 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  140    148    151    152    Ljava/lang/RuntimeException;
        //  121    136    139    140    Ljava/lang/RuntimeException;
        //  56     128    131    132    Ljava/lang/RuntimeException;
        //  53     117    120    121    Ljava/lang/RuntimeException;
        //  31     49     52     53     Ljava/lang/RuntimeException;
        //  12     27     30     31     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0121:
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
    
    public void a(final int a) {
        this.a = a;
    }
    
    public int a() {
        return this.a;
    }
    
    public void b() {
        final boolean f = wb.f;
        Bot bot2 = null;
        Label_0041: {
            Bot b = null;
            Label_0027: {
                Label_0019: {
                    Bot bot;
                    try {
                        bot = (b = (bot2 = this.b));
                        if (f) {
                            break Label_0027;
                        }
                        if (bot != null) {
                            break Label_0019;
                        }
                        return;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (bot == null) {
                            return;
                        }
                        bot2 = (b = this.b);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (f) {
                        break Label_0041;
                    }
                    final RSLoader rsLoader = b.appletContainer;
                    if (rsLoader != null) {
                        break Label_0041;
                    }
                    return;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                final RSLoader rsLoader = b.appletContainer;
                if (rsLoader == null) {
                    return;
                }
                bot2 = this.b;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        bot2.resize(this.getWidth(), this.getHeight());
        this.c();
    }
    
    public void c() {
        final boolean f = wb.f;
        Bot bot2 = null;
        Label_0019: {
            Bot bot;
            try {
                bot = (bot2 = this.b);
                if (f) {
                    break Label_0019;
                }
                if (bot != null) {
                    break Label_0019;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (bot == null) {
                    return;
                }
                bot2 = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Canvas canvas = bot2.getCanvas();
        Label_0043: {
            try {
                if (f) {
                    break Label_0043;
                }
                final Canvas canvas2 = canvas;
                if (canvas2 != null) {
                    break Label_0043;
                }
                return;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            try {
                final Canvas canvas2 = canvas;
                if (canvas2 == null) {
                    return;
                }
                this.c = (this.getWidth() - canvas.getWidth()) / 2;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        this.d = (this.getHeight() - canvas.getHeight()) / 2;
    }
    
    private void a(final MouseEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_1        
        //     6: ifnull          88
        //     9: aload_0        
        //    10: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    13: iload           10
        //    15: ifne            37
        //    18: goto            22
        //    21: athrow         
        //    22: ifnull          88
        //    25: goto            29
        //    28: athrow         
        //    29: aload_0        
        //    30: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    33: goto            37
        //    36: athrow         
        //    37: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //    40: iload           10
        //    42: ifne            63
        //    45: ifnull          88
        //    48: goto            52
        //    51: athrow         
        //    52: aload_0        
        //    53: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    56: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //    59: goto            63
        //    62: athrow         
        //    63: invokevirtual   org/powerbot/core/bot/RSLoader.getComponentCount:()I
        //    66: ifeq            88
        //    69: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //    72: iload           10
        //    74: ifne            106
        //    77: goto            81
        //    80: athrow         
        //    81: ifnonnull       89
        //    84: goto            88
        //    87: athrow         
        //    88: return         
        //    89: aload_1        
        //    90: aload_0        
        //    91: getfield        org/powerbot/wb.c:I
        //    94: ineg           
        //    95: aload_0        
        //    96: getfield        org/powerbot/wb.d:I
        //    99: ineg           
        //   100: invokevirtual   java/awt/event/MouseEvent.translatePoint:(II)V
        //   103: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //   106: invokeinterface org/powerbot/game/client/Client.getMouse:()Lorg/powerbot/game/client/input/Mouse;
        //   111: astore_2       
        //   112: aload_2        
        //   113: iload           10
        //   115: ifne            127
        //   118: ifnonnull       126
        //   121: goto            125
        //   124: athrow         
        //   125: return         
        //   126: aload_2        
        //   127: invokevirtual   org/powerbot/game/client/input/Mouse.isPresent:()Z
        //   130: istore_3       
        //   131: aload_0        
        //   132: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //   135: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //   138: iconst_0       
        //   139: invokevirtual   org/powerbot/core/bot/RSLoader.getComponent:(I)Ljava/awt/Component;
        //   142: astore          4
        //   144: aload_0        
        //   145: aload           4
        //   147: aload_1        
        //   148: invokespecial   org/powerbot/wb.a:(Ljava/awt/Component;Ljava/awt/event/MouseEvent;)V
        //   151: aload_0        
        //   152: getfield        org/powerbot/wb.a:I
        //   155: iconst_1       
        //   156: iand           
        //   157: iload           10
        //   159: ifne            174
        //   162: ifne            170
        //   165: goto            169
        //   168: athrow         
        //   169: return         
        //   170: aload_1        
        //   171: invokevirtual   java/awt/event/MouseEvent.getX:()I
        //   174: istore          5
        //   176: aload_1        
        //   177: invokevirtual   java/awt/event/MouseEvent.getY:()I
        //   180: istore          6
        //   182: aload_1        
        //   183: invokevirtual   java/awt/event/MouseEvent.getModifiers:()I
        //   186: istore          7
        //   188: aload_1        
        //   189: invokevirtual   java/awt/event/MouseEvent.getClickCount:()I
        //   192: istore          8
        //   194: aload_1        
        //   195: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   198: iload           10
        //   200: ifne            480
        //   203: sipush          505
        //   206: if_icmpeq       475
        //   209: goto            213
        //   212: athrow         
        //   213: iload           5
        //   215: iload           10
        //   217: ifne            480
        //   220: goto            224
        //   223: athrow         
        //   224: ifle            475
        //   227: goto            231
        //   230: athrow         
        //   231: iload           5
        //   233: iload           10
        //   235: ifne            480
        //   238: goto            242
        //   241: athrow         
        //   242: aload           4
        //   244: invokevirtual   java/awt/Component.getWidth:()I
        //   247: if_icmpge       475
        //   250: goto            254
        //   253: athrow         
        //   254: iload           6
        //   256: iload           10
        //   258: ifne            480
        //   261: goto            265
        //   264: athrow         
        //   265: ifle            475
        //   268: goto            272
        //   271: athrow         
        //   272: iload           6
        //   274: iload           10
        //   276: ifne            480
        //   279: goto            283
        //   282: athrow         
        //   283: aload           4
        //   285: invokevirtual   java/awt/Component.getHeight:()I
        //   288: if_icmpge       475
        //   291: goto            295
        //   294: athrow         
        //   295: iload_3        
        //   296: iload           10
        //   298: ifne            329
        //   301: goto            305
        //   304: athrow         
        //   305: ifeq            437
        //   308: goto            312
        //   311: athrow         
        //   312: aload_1        
        //   313: iload           10
        //   315: ifne            333
        //   318: goto            322
        //   321: athrow         
        //   322: instanceof      Ljava/awt/event/MouseWheelEvent;
        //   325: goto            329
        //   328: athrow         
        //   329: ifeq            391
        //   332: aload_1        
        //   333: checkcast       Ljava/awt/event/MouseWheelEvent;
        //   336: astore          9
        //   338: aload           4
        //   340: new             Ljava/awt/event/MouseWheelEvent;
        //   343: dup            
        //   344: aload           4
        //   346: aload_1        
        //   347: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   350: invokestatic    java/lang/System.currentTimeMillis:()J
        //   353: iload           7
        //   355: iload           5
        //   357: iload           6
        //   359: iload           8
        //   361: aload_1        
        //   362: invokevirtual   java/awt/event/MouseEvent.isPopupTrigger:()Z
        //   365: aload           9
        //   367: invokevirtual   java/awt/event/MouseWheelEvent.getScrollType:()I
        //   370: aload           9
        //   372: invokevirtual   java/awt/event/MouseWheelEvent.getScrollAmount:()I
        //   375: aload           9
        //   377: invokevirtual   java/awt/event/MouseWheelEvent.getWheelRotation:()I
        //   380: invokespecial   java/awt/event/MouseWheelEvent.<init>:(Ljava/awt/Component;IJIIIIZIII)V
        //   383: invokevirtual   java/awt/Component.dispatchEvent:(Ljava/awt/AWTEvent;)V
        //   386: iload           10
        //   388: ifeq            516
        //   391: aload           4
        //   393: new             Ljava/awt/event/MouseEvent;
        //   396: dup            
        //   397: aload           4
        //   399: aload_1        
        //   400: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   403: invokestatic    java/lang/System.currentTimeMillis:()J
        //   406: iload           7
        //   408: iload           5
        //   410: iload           6
        //   412: iload           8
        //   414: aload_1        
        //   415: invokevirtual   java/awt/event/MouseEvent.isPopupTrigger:()Z
        //   418: aload_1        
        //   419: invokevirtual   java/awt/event/MouseEvent.getButton:()I
        //   422: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZI)V
        //   425: invokevirtual   java/awt/Component.dispatchEvent:(Ljava/awt/AWTEvent;)V
        //   428: iload           10
        //   430: ifeq            516
        //   433: goto            437
        //   436: athrow         
        //   437: aload           4
        //   439: new             Ljava/awt/event/MouseEvent;
        //   442: dup            
        //   443: aload           4
        //   445: sipush          504
        //   448: invokestatic    java/lang/System.currentTimeMillis:()J
        //   451: iload           7
        //   453: iload           5
        //   455: iload           6
        //   457: iload           8
        //   459: iconst_0       
        //   460: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //   463: invokevirtual   java/awt/Component.dispatchEvent:(Ljava/awt/AWTEvent;)V
        //   466: iload           10
        //   468: ifeq            516
        //   471: goto            475
        //   474: athrow         
        //   475: iload_3        
        //   476: goto            480
        //   479: athrow         
        //   480: ifeq            516
        //   483: aload           4
        //   485: new             Ljava/awt/event/MouseEvent;
        //   488: dup            
        //   489: aload           4
        //   491: sipush          505
        //   494: invokestatic    java/lang/System.currentTimeMillis:()J
        //   497: iload           7
        //   499: iload           5
        //   501: iload           6
        //   503: iload           8
        //   505: iconst_0       
        //   506: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //   509: invokevirtual   java/awt/Component.dispatchEvent:(Ljava/awt/AWTEvent;)V
        //   512: goto            516
        //   515: athrow         
        //   516: return         
        //    StackMapTable: 00 3C FF 00 15 00 0B 07 00 59 07 00 53 00 00 00 00 00 00 00 00 01 00 01 07 01 38 40 07 00 A1 45 07 01 38 00 46 07 01 38 40 07 00 A1 4D 07 01 38 00 49 07 01 38 40 07 00 B5 50 07 01 38 40 07 00 B9 45 07 01 38 00 00 50 07 00 B9 FF 00 11 00 0B 07 00 59 07 00 53 07 00 BB 00 00 00 00 00 00 00 01 00 01 07 01 38 00 00 40 07 00 BB FF 00 28 00 0B 07 00 59 07 00 53 07 00 BB 01 07 00 C4 00 00 00 00 00 01 00 01 07 01 38 00 00 43 01 FF 00 25 00 0B 07 00 59 07 00 53 07 00 BB 01 07 00 C4 01 01 01 01 00 01 00 01 07 01 38 00 49 07 01 38 40 01 45 07 01 38 00 49 07 01 38 40 01 4A 07 01 38 00 49 07 01 38 40 01 45 07 01 38 00 49 07 01 38 40 01 4A 07 01 38 00 48 07 01 38 40 01 45 07 01 38 00 48 07 01 38 40 07 00 53 45 07 01 38 40 01 43 07 00 53 39 6C 07 01 38 00 64 07 01 38 00 43 07 01 38 40 01 62 07 01 38 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  480    512    515    516    Ljava/lang/RuntimeException;
        //  437    476    479    480    Ljava/lang/RuntimeException;
        //  391    471    474    475    Ljava/lang/RuntimeException;
        //  338    433    436    437    Ljava/lang/RuntimeException;
        //  312    325    328    329    Ljava/lang/RuntimeException;
        //  305    318    321    322    Ljava/lang/RuntimeException;
        //  295    308    311    312    Ljava/lang/RuntimeException;
        //  283    301    304    305    Ljava/lang/RuntimeException;
        //  272    291    294    295    Ljava/lang/RuntimeException;
        //  265    279    282    283    Ljava/lang/RuntimeException;
        //  254    268    271    272    Ljava/lang/RuntimeException;
        //  242    261    264    265    Ljava/lang/RuntimeException;
        //  231    250    253    254    Ljava/lang/RuntimeException;
        //  224    238    241    242    Ljava/lang/RuntimeException;
        //  213    227    230    231    Ljava/lang/RuntimeException;
        //  203    220    223    224    Ljava/lang/RuntimeException;
        //  194    209    212    213    Ljava/lang/RuntimeException;
        //  144    165    168    169    Ljava/lang/RuntimeException;
        //  112    121    124    125    Ljava/lang/RuntimeException;
        //  69     84     87     88     Ljava/lang/RuntimeException;
        //  63     77     80     81     Ljava/lang/RuntimeException;
        //  45     59     62     63     Ljava/lang/RuntimeException;
        //  37     48     51     52     Ljava/lang/RuntimeException;
        //  22     33     36     37     Ljava/lang/RuntimeException;
        //  9      25     28     29     Ljava/lang/RuntimeException;
        //  5      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    private void a(final KeyEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: ifnull          76
        //     8: aload_0        
        //     9: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    12: iload_3        
        //    13: ifne            35
        //    16: goto            20
        //    19: athrow         
        //    20: ifnull          76
        //    23: goto            27
        //    26: athrow         
        //    27: aload_0        
        //    28: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    31: goto            35
        //    34: athrow         
        //    35: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //    38: iload_3        
        //    39: ifne            60
        //    42: ifnull          76
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    53: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //    56: goto            60
        //    59: athrow         
        //    60: invokevirtual   org/powerbot/core/bot/RSLoader.getComponentCount:()I
        //    63: ifeq            76
        //    66: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //    69: ifnonnull       78
        //    72: goto            76
        //    75: athrow         
        //    76: return         
        //    77: athrow         
        //    78: aload_0        
        //    79: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //    82: invokevirtual   org/powerbot/core/Bot.getEventManager:()Lorg/powerbot/core/event/EventManager;
        //    85: aload_1        
        //    86: invokeinterface org/powerbot/core/event/EventManager.dispatch:(Ljava/util/EventObject;)V
        //    91: aload_0        
        //    92: iload_3        
        //    93: ifne            121
        //    96: getfield        org/powerbot/wb.a:I
        //    99: iconst_2       
        //   100: iand           
        //   101: ifne            110
        //   104: goto            108
        //   107: athrow         
        //   108: return         
        //   109: athrow         
        //   110: aload_0        
        //   111: getfield        org/powerbot/wb.b:Lorg/powerbot/core/Bot;
        //   114: getfield        org/powerbot/core/Bot.appletContainer:Lorg/powerbot/core/bot/RSLoader;
        //   117: iconst_0       
        //   118: invokevirtual   org/powerbot/core/bot/RSLoader.getComponent:(I)Ljava/awt/Component;
        //   121: astore_2       
        //   122: aload_2        
        //   123: iload_3        
        //   124: ifne            135
        //   127: ifnull          139
        //   130: goto            134
        //   133: athrow         
        //   134: aload_2        
        //   135: aload_1        
        //   136: invokevirtual   java/awt/Component.dispatchEvent:(Ljava/awt/AWTEvent;)V
        //   139: return         
        //    StackMapTable: 00 17 FF 00 13 00 04 07 00 59 07 01 3B 00 01 00 01 07 01 38 40 07 00 A1 45 07 01 38 00 46 07 01 38 40 07 00 A1 4C 07 01 38 00 49 07 01 38 40 07 00 B5 4E 07 01 38 00 40 07 01 38 00 5C 07 01 38 00 40 07 01 38 00 4A 07 00 C4 FF 00 0B 00 04 07 00 59 07 01 3B 07 00 C4 01 00 01 07 01 38 00 40 07 00 C4 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  122    130    133    134    Ljava/lang/RuntimeException;
        //  96     109    109    110    Ljava/lang/RuntimeException;
        //  78     104    107    108    Ljava/lang/RuntimeException;
        //  66     77     77     78     Ljava/lang/RuntimeException;
        //  60     72     75     76     Ljava/lang/RuntimeException;
        //  42     56     59     60     Ljava/lang/RuntimeException;
        //  35     45     48     49     Ljava/lang/RuntimeException;
        //  20     31     34     35     Ljava/lang/RuntimeException;
        //  8      23     26     27     Ljava/lang/RuntimeException;
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
    
    private void a(final Component component, final MouseEvent mouseEvent) {
        Label_0012: {
            try {
                if (component == null) {
                    return;
                }
                final MouseEvent mouseEvent2 = mouseEvent;
                if (mouseEvent2 != null) {
                    break Label_0012;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final MouseEvent mouseEvent2 = mouseEvent;
                if (mouseEvent2 != null) {
                    this.b.getEventManager().dispatch(mouseEvent);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
    }
}
