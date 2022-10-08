
package org.powerbot.core.event.events;

import java.util.EventListener;
import org.powerbot.core.script.job.Task;
import java.awt.Graphics;
import org.powerbot.core.event.GameEvent;

public class TextPaintEvent extends GameEvent
{
    private static final long serialVersionUID = 1L;
    public Graphics graphics;
    public int id;
    
    public TextPaintEvent() {
        int b = MessageEvent.b;
        this.id = 0;
        this.setType(128);
        this.graphics = null;
        if (Task.a != 0) {
            MessageEvent.b = ++b;
        }
    }
    
    @Override
    public void dispatch(final EventListener p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        org/powerbot/core/event/events/TextPaintEvent.graphics:Ljava/awt/Graphics;
        //     4: getstatic       org/powerbot/core/event/events/MessageEvent.b:I
        //     7: ifne            37
        //    10: ifnonnull       33
        //    13: goto            17
        //    16: athrow         
        //    17: aload_1        
        //    18: checkcast       Lorg/powerbot/core/event/listeners/PaintListener;
        //    21: aconst_null    
        //    22: invokeinterface org/powerbot/core/event/listeners/PaintListener.onRepaint:(Ljava/awt/Graphics;)V
        //    27: goto            32
        //    30: athrow         
        //    31: astore_2       
        //    32: return         
        //    33: aload_0        
        //    34: getfield        org/powerbot/core/event/events/TextPaintEvent.graphics:Ljava/awt/Graphics;
        //    37: checkcast       Ljava/awt/Graphics2D;
        //    40: astore_2       
        //    41: aload_2        
        //    42: invokevirtual   java/awt/Graphics2D.getBackground:()Ljava/awt/Color;
        //    45: astore_3       
        //    46: aload_2        
        //    47: invokevirtual   java/awt/Graphics2D.getClip:()Ljava/awt/Shape;
        //    50: astore          4
        //    52: aload_2        
        //    53: invokevirtual   java/awt/Graphics2D.getColor:()Ljava/awt/Color;
        //    56: astore          5
        //    58: aload_2        
        //    59: invokevirtual   java/awt/Graphics2D.getComposite:()Ljava/awt/Composite;
        //    62: astore          6
        //    64: aload_2        
        //    65: invokevirtual   java/awt/Graphics2D.getFont:()Ljava/awt/Font;
        //    68: astore          7
        //    70: aload_2        
        //    71: invokevirtual   java/awt/Graphics2D.getPaint:()Ljava/awt/Paint;
        //    74: astore          8
        //    76: aload_2        
        //    77: invokevirtual   java/awt/Graphics2D.getRenderingHints:()Ljava/awt/RenderingHints;
        //    80: astore          9
        //    82: aload_2        
        //    83: invokevirtual   java/awt/Graphics2D.getStroke:()Ljava/awt/Stroke;
        //    86: astore          10
        //    88: aload_2        
        //    89: invokevirtual   java/awt/Graphics2D.getTransform:()Ljava/awt/geom/AffineTransform;
        //    92: astore          11
        //    94: aload_0        
        //    95: aload_1        
        //    96: checkcast       Lorg/powerbot/core/event/listeners/TextPaintListener;
        //    99: aload_0        
        //   100: getfield        org/powerbot/core/event/events/TextPaintEvent.id:I
        //   103: aload_0        
        //   104: getfield        org/powerbot/core/event/events/TextPaintEvent.graphics:Ljava/awt/Graphics;
        //   107: invokeinterface org/powerbot/core/event/listeners/TextPaintListener.draw:(ILjava/awt/Graphics;)I
        //   112: putfield        org/powerbot/core/event/events/TextPaintEvent.id:I
        //   115: aload_2        
        //   116: aload_3        
        //   117: invokevirtual   java/awt/Graphics2D.setBackground:(Ljava/awt/Color;)V
        //   120: aload_2        
        //   121: aload           4
        //   123: invokevirtual   java/awt/Graphics2D.setClip:(Ljava/awt/Shape;)V
        //   126: aload_2        
        //   127: aload           5
        //   129: invokevirtual   java/awt/Graphics2D.setColor:(Ljava/awt/Color;)V
        //   132: aload_2        
        //   133: aload           6
        //   135: invokevirtual   java/awt/Graphics2D.setComposite:(Ljava/awt/Composite;)V
        //   138: aload_2        
        //   139: aload           7
        //   141: invokevirtual   java/awt/Graphics2D.setFont:(Ljava/awt/Font;)V
        //   144: aload_2        
        //   145: aload           8
        //   147: invokevirtual   java/awt/Graphics2D.setPaint:(Ljava/awt/Paint;)V
        //   150: aload_2        
        //   151: aload           9
        //   153: invokevirtual   java/awt/Graphics2D.setRenderingHints:(Ljava/util/Map;)V
        //   156: aload_2        
        //   157: aload           10
        //   159: invokevirtual   java/awt/Graphics2D.setStroke:(Ljava/awt/Stroke;)V
        //   162: aload_2        
        //   163: aload           11
        //   165: invokevirtual   java/awt/Graphics2D.setTransform:(Ljava/awt/geom/AffineTransform;)V
        //   168: return         
        //    StackMapTable: 00 07 50 07 00 07 00 4C 07 00 7E 40 07 00 07 00 00 43 07 00 83
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  0      13     16     17     Ljava/lang/NullPointerException;
        //  17     27     31     32     Ljava/lang/NullPointerException;
        //  10     30     30     31     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0017:
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
}
