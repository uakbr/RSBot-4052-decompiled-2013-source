
package org.powerbot.game.client.input;

import org.powerbot.core.script.job.Task;
import java.awt.Point;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;

public abstract class Mouse extends Focus implements MouseListener, MouseMotionListener, MouseWheelListener
{
    private int clientX;
    private int clientY;
    private int clientPressX;
    private int clientPressY;
    private long clientPressTime;
    private boolean clientPresent;
    private boolean clientPressed;
    
    public Mouse() {
        this.clientPressX = -1;
        this.clientPressY = -1;
        this.clientPressTime = -1L;
    }
    
    public abstract void _mouseClicked(final MouseEvent p0);
    
    public abstract void _mouseDragged(final MouseEvent p0);
    
    public abstract void _mouseEntered(final MouseEvent p0);
    
    public abstract void _mouseExited(final MouseEvent p0);
    
    public abstract void _mouseMoved(final MouseEvent p0);
    
    public abstract void _mousePressed(final MouseEvent p0);
    
    public abstract void _mouseReleased(final MouseEvent p0);
    
    public abstract void _mouseWheelMoved(final MouseWheelEvent p0);
    
    public int getX() {
        int n;
        try {
            final int n2;
            n = (n2 = this.clientX);
            if (Focus.a) {
                return n2;
            }
            final int n3 = -1;
            if (n == n3) {
                return 0;
            }
            return this.clientX;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final int n3 = -1;
            if (n == n3) {
                return 0;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return this.clientX;
    }
    
    public int getY() {
        int n;
        try {
            final int n2;
            n = (n2 = this.clientY);
            if (Focus.a) {
                return n2;
            }
            final int n3 = -1;
            if (n == n3) {
                return 0;
            }
            return this.clientY;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final int n3 = -1;
            if (n == n3) {
                return 0;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return this.clientY;
    }
    
    public Point getLocation() {
        try {
            if (this.clientX == -1) {
                final int clientX = 0;
                return new Point(clientX, (this.clientY == -1) ? 0 : this.clientY);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final int clientX = this.clientX;
        return new Point(clientX, (this.clientY == -1) ? 0 : this.clientY);
    }
    
    public int getPressX() {
        return this.clientPressX;
    }
    
    public int getPressY() {
        return this.clientPressY;
    }
    
    public long getPressTime() {
        return this.clientPressTime;
    }
    
    public boolean isPressed() {
        return this.clientPressed;
    }
    
    public boolean isPresent() {
        return this.clientPresent;
    }
    
    @Override
    public final void mouseClicked(final MouseEvent mouseEvent) {
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this._mouseClicked(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public final void mouseDragged(final MouseEvent mouseEvent) {
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this._mouseDragged(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public final void mouseEntered(final MouseEvent mouseEvent) {
        this.clientPresent = true;
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this._mouseEntered(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public final void mouseExited(final MouseEvent mouseEvent) {
        this.clientPresent = false;
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this._mouseExited(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public final void mouseMoved(final MouseEvent mouseEvent) {
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this._mouseMoved(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public final void mousePressed(final MouseEvent mouseEvent) {
        final boolean a = Focus.a;
        boolean a2 = false;
        Label_0077: {
            Label_0071: {
                try {
                    this.clientPressed = true;
                    this.clientX = mouseEvent.getX();
                    this.clientY = mouseEvent.getY();
                    this.clientPressX = mouseEvent.getX();
                    this.clientPressY = mouseEvent.getY();
                    this.clientPressTime = System.currentTimeMillis();
                    this._mousePressed(mouseEvent);
                    mouseEvent.consume();
                    if (Task.a == 0) {
                        return;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0071;
                    }
                    break Label_0071;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0077;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        Focus.a = a2;
    }
    
    @Override
    public final void mouseReleased(final MouseEvent mouseEvent) {
        this.clientX = mouseEvent.getX();
        this.clientY = mouseEvent.getY();
        this.clientPressed = false;
        this._mouseReleased(mouseEvent);
        mouseEvent.consume();
    }
    
    @Override
    public void mouseWheelMoved(final MouseWheelEvent mouseWheelEvent) {
        try {
            this._mouseWheelMoved(mouseWheelEvent);
        }
        catch (AbstractMethodError abstractMethodError) {}
        mouseWheelEvent.consume();
    }
    
    @Deprecated
    public final void move(final Point point) {
        this.update(point.x, point.y);
    }
    
    @Deprecated
    public final void update(final int clientX, final int clientY) {
        this.clientX = clientX;
        this.clientY = clientY;
    }
    
    public final void sendEvent(final MouseEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_1        
        //     5: iload_2        
        //     6: ifne            34
        //     9: ifnonnull       17
        //    12: goto            16
        //    15: athrow         
        //    16: return         
        //    17: aload_0        
        //    18: aload_1        
        //    19: invokevirtual   java/awt/event/MouseEvent.getX:()I
        //    22: putfield        org/powerbot/game/client/input/Mouse.clientX:I
        //    25: aload_0        
        //    26: aload_1        
        //    27: invokevirtual   java/awt/event/MouseEvent.getY:()I
        //    30: putfield        org/powerbot/game/client/input/Mouse.clientY:I
        //    33: aload_1        
        //    34: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //    37: sipush          500
        //    40: iload_2        
        //    41: ifne            75
        //    44: if_icmpne       64
        //    47: goto            51
        //    50: athrow         
        //    51: aload_0        
        //    52: aload_1        
        //    53: invokevirtual   org/powerbot/game/client/input/Mouse._mouseClicked:(Ljava/awt/event/MouseEvent;)V
        //    56: iload_2        
        //    57: ifeq            361
        //    60: goto            64
        //    63: athrow         
        //    64: aload_1        
        //    65: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //    68: sipush          506
        //    71: goto            75
        //    74: athrow         
        //    75: iload_2        
        //    76: ifne            110
        //    79: if_icmpne       99
        //    82: goto            86
        //    85: athrow         
        //    86: aload_0        
        //    87: aload_1        
        //    88: invokevirtual   org/powerbot/game/client/input/Mouse._mouseDragged:(Ljava/awt/event/MouseEvent;)V
        //    91: iload_2        
        //    92: ifeq            361
        //    95: goto            99
        //    98: athrow         
        //    99: aload_1        
        //   100: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   103: sipush          504
        //   106: goto            110
        //   109: athrow         
        //   110: iload_2        
        //   111: ifne            150
        //   114: if_icmpne       139
        //   117: goto            121
        //   120: athrow         
        //   121: aload_0        
        //   122: iconst_1       
        //   123: putfield        org/powerbot/game/client/input/Mouse.clientPresent:Z
        //   126: aload_0        
        //   127: aload_1        
        //   128: invokevirtual   org/powerbot/game/client/input/Mouse._mouseEntered:(Ljava/awt/event/MouseEvent;)V
        //   131: iload_2        
        //   132: ifeq            361
        //   135: goto            139
        //   138: athrow         
        //   139: aload_1        
        //   140: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   143: sipush          505
        //   146: goto            150
        //   149: athrow         
        //   150: iload_2        
        //   151: ifne            190
        //   154: if_icmpne       179
        //   157: goto            161
        //   160: athrow         
        //   161: aload_0        
        //   162: iconst_0       
        //   163: putfield        org/powerbot/game/client/input/Mouse.clientPresent:Z
        //   166: aload_0        
        //   167: aload_1        
        //   168: invokevirtual   org/powerbot/game/client/input/Mouse._mouseExited:(Ljava/awt/event/MouseEvent;)V
        //   171: iload_2        
        //   172: ifeq            361
        //   175: goto            179
        //   178: athrow         
        //   179: aload_1        
        //   180: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   183: sipush          503
        //   186: goto            190
        //   189: athrow         
        //   190: iload_2        
        //   191: ifne            225
        //   194: if_icmpne       214
        //   197: goto            201
        //   200: athrow         
        //   201: aload_0        
        //   202: aload_1        
        //   203: invokevirtual   org/powerbot/game/client/input/Mouse._mouseMoved:(Ljava/awt/event/MouseEvent;)V
        //   206: iload_2        
        //   207: ifeq            361
        //   210: goto            214
        //   213: athrow         
        //   214: aload_1        
        //   215: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   218: sipush          501
        //   221: goto            225
        //   224: athrow         
        //   225: iload_2        
        //   226: ifne            289
        //   229: if_icmpne       278
        //   232: goto            236
        //   235: athrow         
        //   236: aload_0        
        //   237: aload_1        
        //   238: invokevirtual   java/awt/event/MouseEvent.getX:()I
        //   241: putfield        org/powerbot/game/client/input/Mouse.clientPressX:I
        //   244: aload_0        
        //   245: aload_1        
        //   246: invokevirtual   java/awt/event/MouseEvent.getY:()I
        //   249: putfield        org/powerbot/game/client/input/Mouse.clientPressY:I
        //   252: aload_0        
        //   253: aload_1        
        //   254: invokevirtual   java/awt/event/MouseEvent.getWhen:()J
        //   257: putfield        org/powerbot/game/client/input/Mouse.clientPressTime:J
        //   260: aload_0        
        //   261: iconst_1       
        //   262: putfield        org/powerbot/game/client/input/Mouse.clientPressed:Z
        //   265: aload_0        
        //   266: aload_1        
        //   267: invokevirtual   org/powerbot/game/client/input/Mouse._mousePressed:(Ljava/awt/event/MouseEvent;)V
        //   270: iload_2        
        //   271: ifeq            361
        //   274: goto            278
        //   277: athrow         
        //   278: aload_1        
        //   279: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   282: sipush          502
        //   285: goto            289
        //   288: athrow         
        //   289: iload_2        
        //   290: ifne            329
        //   293: if_icmpne       318
        //   296: goto            300
        //   299: athrow         
        //   300: aload_0        
        //   301: iconst_0       
        //   302: putfield        org/powerbot/game/client/input/Mouse.clientPressed:Z
        //   305: aload_0        
        //   306: aload_1        
        //   307: invokevirtual   org/powerbot/game/client/input/Mouse._mouseReleased:(Ljava/awt/event/MouseEvent;)V
        //   310: iload_2        
        //   311: ifeq            361
        //   314: goto            318
        //   317: athrow         
        //   318: aload_1        
        //   319: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   322: sipush          507
        //   325: goto            329
        //   328: athrow         
        //   329: if_icmpne       348
        //   332: aload_0        
        //   333: aload_1        
        //   334: checkcast       Ljava/awt/event/MouseWheelEvent;
        //   337: invokevirtual   org/powerbot/game/client/input/Mouse._mouseWheelMoved:(Ljava/awt/event/MouseWheelEvent;)V
        //   340: iload_2        
        //   341: ifeq            361
        //   344: goto            348
        //   347: athrow         
        //   348: new             Ljava/lang/InternalError;
        //   351: dup            
        //   352: aload_1        
        //   353: invokevirtual   java/awt/event/MouseEvent.toString:()Ljava/lang/String;
        //   356: invokespecial   java/lang/InternalError.<init>:(Ljava/lang/String;)V
        //   359: athrow         
        //   360: athrow         
        //   361: return         
        //    StackMapTable: 00 32 FF 00 0F 00 03 07 00 24 07 00 66 01 00 01 07 00 96 00 00 50 07 00 66 4F 07 00 96 00 4B 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 4B 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 50 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 50 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 4B 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 68 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 49 07 00 96 00 50 07 00 96 00 49 07 00 96 FF 00 00 00 03 07 00 24 07 00 66 01 00 02 01 01 51 07 00 96 00 4B 07 00 96 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  332    360    360    361    Ljava/lang/RuntimeException;
        //  329    344    347    348    Ljava/lang/RuntimeException;
        //  300    325    328    329    Ljava/lang/RuntimeException;
        //  293    314    317    318    Ljava/lang/RuntimeException;
        //  289    296    299    300    Ljava/lang/RuntimeException;
        //  236    285    288    289    Ljava/lang/RuntimeException;
        //  229    274    277    278    Ljava/lang/RuntimeException;
        //  225    232    235    236    Ljava/lang/RuntimeException;
        //  201    221    224    225    Ljava/lang/RuntimeException;
        //  194    210    213    214    Ljava/lang/RuntimeException;
        //  190    197    200    201    Ljava/lang/RuntimeException;
        //  161    186    189    190    Ljava/lang/RuntimeException;
        //  154    175    178    179    Ljava/lang/RuntimeException;
        //  150    157    160    161    Ljava/lang/RuntimeException;
        //  121    146    149    150    Ljava/lang/RuntimeException;
        //  114    135    138    139    Ljava/lang/RuntimeException;
        //  110    117    120    121    Ljava/lang/RuntimeException;
        //  86     106    109    110    Ljava/lang/RuntimeException;
        //  79     95     98     99     Ljava/lang/RuntimeException;
        //  75     82     85     86     Ljava/lang/RuntimeException;
        //  51     71     74     75     Ljava/lang/RuntimeException;
        //  44     60     63     64     Ljava/lang/RuntimeException;
        //  34     47     50     51     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0051:
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
