
package org.powerbot.game.client.input;

import java.awt.event.FocusEvent;
import java.awt.AWTEvent;
import java.awt.image.ColorModel;
import java.awt.image.BufferedImage;
import java.util.Hashtable;
import java.awt.Point;
import java.awt.image.DataBuffer;
import java.awt.image.Raster;
import java.awt.image.DirectColorModel;
import java.awt.image.DataBufferInt;
import java.awt.Image;
import java.awt.Dimension;
import org.powerbot.core.script.job.Task;
import org.powerbot.qb;
import java.awt.Graphics;
import org.powerbot.core.Bot;

public class Canvas extends java.awt.Canvas
{
    private static final long serialVersionUID = -2276037172265300477L;
    private static final int GRAPHICS_DELAY = 6;
    private static final int MINIMISED_GRAPHICS_DELAY = 50;
    private boolean visible;
    private boolean focused;
    private boolean loader_identified;
    private Bot bot;
    
    @Override
    public final Graphics getGraphics() {
        final boolean a = Focus.a;
        boolean e = false;
        Label_0084: {
            Label_0065: {
                Canvas canvas = null;
                Label_0061: {
                    Label_0038: {
                        Canvas canvas2 = null;
                        Label_0024: {
                            Label_0019: {
                                try {
                                    canvas = this;
                                    canvas2 = this;
                                    if (a) {
                                        break Label_0024;
                                    }
                                    final Bot bot = this.bot;
                                    if (bot == null) {
                                        break Label_0019;
                                    }
                                    break Label_0065;
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                                try {
                                    final Bot bot = this.bot;
                                    if (bot != null) {
                                        break Label_0065;
                                    }
                                    canvas = this;
                                    canvas2 = this;
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                if (a) {
                                    break Label_0061;
                                }
                                final boolean b = canvas2.loader_identified;
                                if (b) {
                                    break Label_0038;
                                }
                                break Label_0038;
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            final boolean b = canvas2.loader_identified;
                            if (b) {
                                return super.getGraphics();
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    this.bot = Bot.instance();
                    qb.a().c.c();
                    canvas = this;
                }
                canvas.loader_identified = true;
                try {
                    e = qb.e;
                    if (a) {
                        break Label_0065;
                    }
                    if (!e) {
                        break Label_0084;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            break Label_0084;
        }
        Task.sleep(e ? 1 : 0);
        return this.bot.getBufferGraphics();
    }
    
    @Override
    public final boolean hasFocus() {
        return this.focused;
    }
    
    @Override
    public final boolean isValid() {
        return this.visible;
    }
    
    @Override
    public final boolean isVisible() {
        return this.visible;
    }
    
    @Override
    public final boolean isDisplayable() {
        return true;
    }
    
    @Override
    public final Dimension getSize() {
        Bot bot2 = null;
        Label_0017: {
            Bot bot;
            try {
                bot = (bot2 = this.bot);
                if (Focus.a) {
                    return bot2.appletContainer.getSize();
                }
                if (bot != null) {
                    break Label_0017;
                }
                return qb.a().c.getSize();
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (bot == null) {
                    return qb.a().c.getSize();
                }
                bot2 = this.bot;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return bot2.appletContainer.getSize();
    }
    
    @Override
    public final void setVisible(final boolean b) {
        super.setVisible(b);
        this.visible = b;
    }
    
    public final void setFocused(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_1        
        //     5: iload_2        
        //     6: ifne            76
        //     9: ifeq            60
        //    12: goto            16
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        org/powerbot/game/client/input/Canvas.focused:Z
        //    20: iload_2        
        //    21: ifne            76
        //    24: goto            28
        //    27: athrow         
        //    28: ifne            60
        //    31: goto            35
        //    34: athrow         
        //    35: aload_0        
        //    36: new             Ljava/awt/event/FocusEvent;
        //    39: dup            
        //    40: aload_0        
        //    41: sipush          1004
        //    44: iconst_0       
        //    45: aconst_null    
        //    46: invokespecial   java/awt/event/FocusEvent.<init>:(Ljava/awt/Component;IZLjava/awt/Component;)V
        //    49: invokespecial   java/awt/Canvas.processEvent:(Ljava/awt/AWTEvent;)V
        //    52: iload_2        
        //    53: ifeq            100
        //    56: goto            60
        //    59: athrow         
        //    60: aload_0        
        //    61: iload_2        
        //    62: ifne            101
        //    65: goto            69
        //    68: athrow         
        //    69: getfield        org/powerbot/game/client/input/Canvas.focused:Z
        //    72: goto            76
        //    75: athrow         
        //    76: ifeq            100
        //    79: aload_0        
        //    80: new             Ljava/awt/event/FocusEvent;
        //    83: dup            
        //    84: aload_0        
        //    85: sipush          1005
        //    88: iconst_1       
        //    89: aconst_null    
        //    90: invokespecial   java/awt/event/FocusEvent.<init>:(Ljava/awt/Component;IZLjava/awt/Component;)V
        //    93: invokespecial   java/awt/Canvas.processEvent:(Ljava/awt/AWTEvent;)V
        //    96: goto            100
        //    99: athrow         
        //   100: aload_0        
        //   101: iload_1        
        //   102: putfield        org/powerbot/game/client/input/Canvas.focused:Z
        //   105: return         
        //    StackMapTable: 00 0F FF 00 0F 00 03 07 00 21 01 01 00 01 07 00 8B 00 4A 07 00 8B 40 01 45 07 00 8B 00 57 07 00 8B 00 47 07 00 8B 40 07 00 21 45 07 00 8B 40 01 56 07 00 8B 00 40 07 00 21
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  76     96     99     100    Ljava/lang/RuntimeException;
        //  60     72     75     76     Ljava/lang/RuntimeException;
        //  35     65     68     69     Ljava/lang/RuntimeException;
        //  28     56     59     60     Ljava/lang/RuntimeException;
        //  16     31     34     35     Ljava/lang/RuntimeException;
        //  9      24     27     28     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
    public Image createImage(final int w, final int h) {
        final boolean a = Focus.a;
        final int[] dataArray = new int[h * w];
        final DataBufferInt db = new DataBufferInt(dataArray, dataArray.length);
        final DirectColorModel cm = new DirectColorModel(32, 16711680, 65280, 255);
        final BufferedImage bufferedImage = new BufferedImage(cm, Raster.createWritableRaster(cm.createCompatibleSampleModel(w, h), db, null), false, new Hashtable<Object, Object>());
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
        return bufferedImage;
    }
    
    @Override
    protected final void processEvent(final AWTEvent e) {
        try {
            if (!(e instanceof FocusEvent)) {
                super.processEvent(e);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
}
