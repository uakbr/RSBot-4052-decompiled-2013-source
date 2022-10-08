
package org.powerbot.core.script.internal.input;

import java.awt.Point;
import org.powerbot.core.script.util.Filter;
import org.powerbot.core.script.wrappers.Targetable;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.input.Mouse;
import java.applet.Applet;
import org.powerbot.game.client.Client;

public class MouseHandler implements Runnable
{
    private static final int MAX_STEPS = 20;
    private final MouseImpl mouseImpl;
    private final Object LOCK;
    private final Client client;
    private final Applet applet;
    private final Mouse mouse;
    private boolean running;
    private Target target;
    public static int a;
    
    public MouseHandler(final Client client) {
        final int a = MouseHandler.a;
        this.LOCK = new Object();
        this.client = client;
        this.applet = (Applet)client;
        this.mouse = client.getMouse();
        this.mouseImpl = null;
        this.target = null;
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    private void clickMouse(final boolean b) {
        final int x = this.mouse.getX();
        final int y = this.mouse.getY();
        this.press(x, y, b);
        Task.sleep(this.mouseImpl.getPressDuration());
        this.release(x, y, b);
    }
    
    private void press(final int n, final int n2, final boolean b) {
        boolean b3 = false;
        Label_0020: {
            boolean b2;
            try {
                b2 = (b3 = this.mouse.isPresent());
                if (MouseHandler.a != 0) {
                    break Label_0020;
                }
                if (b2) {
                    break Label_0020;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (!b2) {
                    return;
                }
                b3 = this.mouse.isPressed();
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        if (!b3) {
            return;
        }
    }
    
    private void release(final int n, final int n2, final boolean b) {
        boolean b3 = false;
        Label_0020: {
            boolean b2;
            try {
                b2 = (b3 = this.mouse.isPresent());
                if (MouseHandler.a != 0) {
                    break Label_0020;
                }
                if (b2) {
                    break Label_0020;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (!b2) {
                    return;
                }
                b3 = this.mouse.isPressed();
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        if (b3) {
            System.currentTimeMillis();
        }
    }
    
    private void moveMouse(final int n, final int n2) {
    }
    
    @Override
    public void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: iconst_1       
        //     7: putfield        org/powerbot/core/script/internal/input/MouseHandler.running:Z
        //    10: aload_0        
        //    11: getfield        org/powerbot/core/script/internal/input/MouseHandler.running:Z
        //    14: ifeq            648
        //    17: aload_0        
        //    18: getfield        org/powerbot/core/script/internal/input/MouseHandler.LOCK:Ljava/lang/Object;
        //    21: dup            
        //    22: astore_1       
        //    23: monitorenter   
        //    24: aload_0        
        //    25: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //    28: iload           10
        //    30: ifne            49
        //    33: ifnonnull       48
        //    36: aload_0        
        //    37: getfield        org/powerbot/core/script/internal/input/MouseHandler.LOCK:Ljava/lang/Object;
        //    40: invokevirtual   java/lang/Object.wait:()V
        //    43: goto            48
        //    46: athrow         
        //    47: astore_2       
        //    48: aload_1        
        //    49: monitorexit    
        //    50: goto            58
        //    53: astore_3       
        //    54: aload_1        
        //    55: monitorexit    
        //    56: aload_3        
        //    57: athrow         
        //    58: aload_0        
        //    59: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //    62: iload           10
        //    64: ifne            81
        //    67: ifnonnull       77
        //    70: goto            74
        //    73: athrow         
        //    74: goto            10
        //    77: aload_0        
        //    78: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //    81: getfield        org/powerbot/core/script/internal/input/Target.targetable:Lorg/powerbot/core/script/wrappers/Targetable;
        //    84: invokeinterface org/powerbot/core/script/wrappers/Targetable.getInteractPoint:()Ljava/awt/Point;
        //    89: astore_1       
        //    90: aload_0        
        //    91: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //    94: getfield        org/powerbot/core/script/internal/input/Target.interactPoint:Ljava/awt/Point;
        //    97: iload           10
        //    99: ifne            128
        //   102: ifnonnull       121
        //   105: goto            109
        //   108: athrow         
        //   109: aload_0        
        //   110: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   113: aload_1        
        //   114: putfield        org/powerbot/core/script/internal/input/Target.interactPoint:Ljava/awt/Point;
        //   117: goto            121
        //   120: athrow         
        //   121: aload_0        
        //   122: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   125: getfield        org/powerbot/core/script/internal/input/Target.interactPoint:Ljava/awt/Point;
        //   128: astore_2       
        //   129: iload           10
        //   131: ifne            179
        //   134: aload_1        
        //   135: getfield        java/awt/Point.x:I
        //   138: iconst_m1      
        //   139: if_icmpeq       167
        //   142: goto            146
        //   145: athrow         
        //   146: aload_1        
        //   147: iload           10
        //   149: ifne            192
        //   152: goto            156
        //   155: athrow         
        //   156: getfield        java/awt/Point.y:I
        //   159: iconst_m1      
        //   160: if_icmpne       180
        //   163: goto            167
        //   166: athrow         
        //   167: aload_0        
        //   168: aload_0        
        //   169: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   172: invokevirtual   org/powerbot/core/script/internal/input/MouseHandler.complete:(Lorg/powerbot/core/script/internal/input/Target;)V
        //   175: goto            179
        //   178: athrow         
        //   179: return         
        //   180: aload_0        
        //   181: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   184: getfield        org/powerbot/core/script/internal/input/Target.targetable:Lorg/powerbot/core/script/wrappers/Targetable;
        //   187: invokeinterface org/powerbot/core/script/wrappers/Targetable.getCenterPoint:()Ljava/awt/Point;
        //   192: astore_3       
        //   193: iload           10
        //   195: ifne            243
        //   198: aload_3        
        //   199: getfield        java/awt/Point.x:I
        //   202: iconst_m1      
        //   203: if_icmpeq       231
        //   206: goto            210
        //   209: athrow         
        //   210: aload_3        
        //   211: getfield        java/awt/Point.y:I
        //   214: iconst_m1      
        //   215: iload           10
        //   217: ifne            269
        //   220: goto            224
        //   223: athrow         
        //   224: if_icmpne       244
        //   227: goto            231
        //   230: athrow         
        //   231: aload_0        
        //   232: aload_0        
        //   233: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   236: invokevirtual   org/powerbot/core/script/internal/input/MouseHandler.complete:(Lorg/powerbot/core/script/internal/input/Target;)V
        //   239: goto            243
        //   242: athrow         
        //   243: return         
        //   244: aload_0        
        //   245: iload           10
        //   247: ifne            290
        //   250: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   253: dup            
        //   254: getfield        org/powerbot/core/script/internal/input/Target.steps:I
        //   257: iconst_1       
        //   258: iadd           
        //   259: dup_x1         
        //   260: putfield        org/powerbot/core/script/internal/input/Target.steps:I
        //   263: bipush          20
        //   265: goto            269
        //   268: athrow         
        //   269: if_icmple       289
        //   272: aload_0        
        //   273: aload_0        
        //   274: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   277: invokevirtual   org/powerbot/core/script/internal/input/MouseHandler.complete:(Lorg/powerbot/core/script/internal/input/Target;)V
        //   280: iload           10
        //   282: ifeq            10
        //   285: goto            289
        //   288: athrow         
        //   289: aload_0        
        //   290: getfield        org/powerbot/core/script/internal/input/MouseHandler.mouse:Lorg/powerbot/game/client/input/Mouse;
        //   293: invokevirtual   org/powerbot/game/client/input/Mouse.getLocation:()Ljava/awt/Point;
        //   296: astore          4
        //   298: aload_2        
        //   299: getfield        java/awt/Point.x:I
        //   302: aload           4
        //   304: getfield        java/awt/Point.x:I
        //   307: isub           
        //   308: i2d            
        //   309: ldc2_w          2.0
        //   312: invokestatic    java/lang/Math.pow:(DD)D
        //   315: aload_2        
        //   316: getfield        java/awt/Point.y:I
        //   319: aload           4
        //   321: getfield        java/awt/Point.y:I
        //   324: isub           
        //   325: i2d            
        //   326: ldc2_w          2.0
        //   329: invokestatic    java/lang/Math.pow:(DD)D
        //   332: dadd           
        //   333: invokestatic    java/lang/Math.sqrt:(D)D
        //   336: dstore          5
        //   338: ldc2_w          2.5
        //   341: aload_1        
        //   342: getfield        java/awt/Point.x:I
        //   345: aload_3        
        //   346: getfield        java/awt/Point.x:I
        //   349: isub           
        //   350: i2d            
        //   351: ldc2_w          2.0
        //   354: invokestatic    java/lang/Math.pow:(DD)D
        //   357: aload_1        
        //   358: getfield        java/awt/Point.y:I
        //   361: aload_3        
        //   362: getfield        java/awt/Point.y:I
        //   365: isub           
        //   366: i2d            
        //   367: ldc2_w          2.0
        //   370: invokestatic    java/lang/Math.pow:(DD)D
        //   373: dadd           
        //   374: invokestatic    java/lang/Math.sqrt:(D)D
        //   377: dadd           
        //   378: dstore          7
        //   380: dload           5
        //   382: dload           7
        //   384: dcmpg          
        //   385: iload           10
        //   387: ifne            584
        //   390: ifge            580
        //   393: goto            397
        //   396: athrow         
        //   397: aload_0        
        //   398: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   401: getfield        org/powerbot/core/script/internal/input/Target.targetable:Lorg/powerbot/core/script/wrappers/Targetable;
        //   404: iload           10
        //   406: ifne            486
        //   409: goto            413
        //   412: athrow         
        //   413: aload           4
        //   415: invokeinterface org/powerbot/core/script/wrappers/Targetable.contains:(Ljava/awt/Point;)Z
        //   420: ifeq            479
        //   423: goto            427
        //   426: athrow         
        //   427: aload_0        
        //   428: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   431: iload           10
        //   433: ifne            483
        //   436: goto            440
        //   439: athrow         
        //   440: getfield        org/powerbot/core/script/internal/input/Target.filter:Lorg/powerbot/core/script/util/Filter;
        //   443: aload           4
        //   445: invokeinterface org/powerbot/core/script/util/Filter.accept:(Ljava/lang/Object;)Z
        //   450: ifeq            479
        //   453: goto            457
        //   456: athrow         
        //   457: aload_0        
        //   458: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   461: getfield        org/powerbot/core/script/internal/input/Target.callback:Lorg/powerbot/core/script/internal/input/MouseCallback;
        //   464: aload_0        
        //   465: invokeinterface org/powerbot/core/script/internal/input/MouseCallback.execute:(Lorg/powerbot/core/script/internal/input/MouseHandler;)V
        //   470: iload           10
        //   472: ifeq            10
        //   475: goto            479
        //   478: athrow         
        //   479: aload_0        
        //   480: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   483: getfield        org/powerbot/core/script/internal/input/Target.targetable:Lorg/powerbot/core/script/wrappers/Targetable;
        //   486: invokeinterface org/powerbot/core/script/wrappers/Targetable.getNextPoint:()Ljava/awt/Point;
        //   491: astore          9
        //   493: dload           5
        //   495: dconst_0       
        //   496: dcmpl          
        //   497: iload           10
        //   499: ifne            557
        //   502: ifeq            569
        //   505: goto            509
        //   508: athrow         
        //   509: aload_2        
        //   510: getfield        java/awt/Point.x:I
        //   513: aload           9
        //   515: getfield        java/awt/Point.x:I
        //   518: isub           
        //   519: i2d            
        //   520: ldc2_w          2.0
        //   523: invokestatic    java/lang/Math.pow:(DD)D
        //   526: aload_2        
        //   527: getfield        java/awt/Point.y:I
        //   530: aload           9
        //   532: getfield        java/awt/Point.y:I
        //   535: isub           
        //   536: i2d            
        //   537: ldc2_w          2.0
        //   540: invokestatic    java/lang/Math.pow:(DD)D
        //   543: dadd           
        //   544: dload           7
        //   546: ldc2_w          2.0
        //   549: invokestatic    java/lang/Math.pow:(DD)D
        //   552: dcmpg          
        //   553: goto            557
        //   556: athrow         
        //   557: iload           10
        //   559: ifne            584
        //   562: ifge            580
        //   565: goto            569
        //   568: athrow         
        //   569: aload_0        
        //   570: getfield        org/powerbot/core/script/internal/input/MouseHandler.target:Lorg/powerbot/core/script/internal/input/Target;
        //   573: aload           9
        //   575: dup_x1         
        //   576: putfield        org/powerbot/core/script/internal/input/Target.interactPoint:Ljava/awt/Point;
        //   579: astore_2       
        //   580: aload_2        
        //   581: getfield        java/awt/Point.x:I
        //   584: iconst_m1      
        //   585: iload           10
        //   587: ifne            611
        //   590: if_icmpeq       10
        //   593: goto            597
        //   596: athrow         
        //   597: aload_2        
        //   598: iload           10
        //   600: ifne            627
        //   603: getfield        java/awt/Point.y:I
        //   606: iconst_m1      
        //   607: goto            611
        //   610: athrow         
        //   611: if_icmpne       617
        //   614: goto            10
        //   617: aload_0        
        //   618: getfield        org/powerbot/core/script/internal/input/MouseHandler.mouseImpl:Lorg/powerbot/core/script/internal/input/MouseImpl;
        //   621: aload_2        
        //   622: invokeinterface org/powerbot/core/script/internal/input/MouseImpl.getNextPoint:(Ljava/awt/Point;)Ljava/awt/Point;
        //   627: astore          9
        //   629: aload_0        
        //   630: aload           9
        //   632: getfield        java/awt/Point.x:I
        //   635: aload           9
        //   637: getfield        java/awt/Point.y:I
        //   640: invokespecial   org/powerbot/core/script/internal/input/MouseHandler.moveMouse:(II)V
        //   643: iload           10
        //   645: ifeq            10
        //   648: return         
        //    StackMapTable: 00 45 FF 00 0A 00 0B 07 00 33 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 23 00 0B 07 00 33 07 00 02 00 00 00 00 00 00 00 00 01 00 01 07 00 CF 40 07 00 16 00 40 07 00 02 43 07 00 D2 04 4E 07 00 16 00 02 43 07 00 2E FF 00 1A 00 0B 07 00 33 07 00 79 00 00 00 00 00 00 00 00 01 00 01 07 00 16 00 4A 07 00 16 00 46 07 00 79 FF 00 10 00 0B 07 00 33 07 00 79 07 00 79 00 00 00 00 00 00 00 01 00 01 07 00 16 00 48 07 00 16 40 07 00 79 49 07 00 16 00 4A 07 00 16 00 00 4B 07 00 79 FF 00 10 00 0B 07 00 33 07 00 79 07 00 79 07 00 79 00 00 00 00 00 00 01 00 01 07 00 16 00 4C 07 00 16 FF 00 00 00 0B 07 00 33 07 00 79 07 00 79 07 00 79 00 00 00 00 00 00 01 00 02 01 01 45 07 00 16 00 4A 07 00 16 00 00 57 07 00 16 FF 00 00 00 0B 07 00 33 07 00 79 07 00 79 07 00 79 00 00 00 00 00 00 01 00 02 01 01 52 07 00 16 00 40 07 00 33 FF 00 69 00 09 07 00 33 07 00 79 07 00 79 07 00 79 07 00 79 03 03 00 01 00 01 07 00 16 00 4E 07 00 16 40 07 00 76 4C 07 00 16 00 4B 07 00 16 40 07 00 2E 4F 07 00 16 00 54 07 00 16 00 43 07 00 2E 42 07 00 76 FF 00 15 00 09 07 00 33 07 00 79 07 00 79 07 00 79 07 00 79 03 03 07 00 79 01 00 01 07 00 16 00 6E 07 00 16 40 01 4A 07 00 16 00 FF 00 0A 00 09 07 00 33 07 00 79 07 00 79 07 00 79 07 00 79 03 03 00 01 00 00 43 01 4B 07 00 16 00 4C 07 00 16 FF 00 00 00 09 07 00 33 07 00 79 07 00 79 07 00 79 07 00 79 03 03 00 01 00 02 01 01 05 49 07 00 79 FF 00 14 00 0B 07 00 33 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  36     43     47     48     Ljava/lang/InterruptedException;
        //  33     46     46     47     Ljava/lang/RuntimeException;
        //  24     50     53     58     Any
        //  53     56     53     58     Any
        //  597    607    610    611    Ljava/lang/InterruptedException;
        //  584    593    596    597    Ljava/lang/InterruptedException;
        //  557    565    568    569    Ljava/lang/InterruptedException;
        //  502    553    556    557    Ljava/lang/InterruptedException;
        //  493    505    508    509    Ljava/lang/InterruptedException;
        //  440    475    478    479    Ljava/lang/InterruptedException;
        //  427    453    456    457    Ljava/lang/InterruptedException;
        //  413    436    439    440    Ljava/lang/InterruptedException;
        //  397    423    426    427    Ljava/lang/InterruptedException;
        //  390    409    412    413    Ljava/lang/InterruptedException;
        //  380    393    396    397    Ljava/lang/InterruptedException;
        //  269    285    288    289    Ljava/lang/InterruptedException;
        //  244    265    268    269    Ljava/lang/InterruptedException;
        //  224    239    242    243    Ljava/lang/InterruptedException;
        //  210    227    230    231    Ljava/lang/InterruptedException;
        //  198    220    223    224    Ljava/lang/InterruptedException;
        //  193    206    209    210    Ljava/lang/InterruptedException;
        //  156    175    178    179    Ljava/lang/InterruptedException;
        //  146    163    166    167    Ljava/lang/InterruptedException;
        //  134    152    155    156    Ljava/lang/InterruptedException;
        //  129    142    145    146    Ljava/lang/InterruptedException;
        //  102    117    120    121    Ljava/lang/InterruptedException;
        //  90     105    108    109    Ljava/lang/InterruptedException;
        //  58     70     73     74     Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0146:
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
    
    public void handle(final Targetable targetable, final Filter<Point> filter, final MouseCallback mouseCallback) {
        final int a = MouseHandler.a;
        synchronized (this.LOCK) {
            boolean b = false;
            Label_0074: {
                Label_0063: {
                    Label_0036: {
                        Label_0035: {
                            try {
                                final MouseHandler mouseHandler = this;
                                if (a != 0) {
                                    break Label_0036;
                                }
                                if (this.target != null) {
                                    break Label_0035;
                                }
                            }
                            catch (InterruptedException ex) {
                                throw ex;
                            }
                            b = true;
                        }
                        final MouseHandler mouseHandler = this;
                        try {
                            mouseHandler.target = new Target(targetable, filter, mouseCallback);
                            if (a != 0) {
                                break Label_0074;
                            }
                            final boolean b2 = b;
                            if (b2) {
                                break Label_0063;
                            }
                            break Label_0074;
                        }
                        catch (InterruptedException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        final boolean b2 = b;
                        if (b2) {
                            this.LOCK.notify();
                        }
                    }
                    catch (InterruptedException ex3) {
                        throw ex3;
                    }
                }
                try {
                    this.LOCK.wait();
                }
                catch (InterruptedException ex4) {}
            }
        }
    }
    
    public void complete(final Target target) {
        synchronized (this.LOCK) {
            if (MouseHandler.a == 0) {
                try {
                    if (target.equals(this.target)) {
                        this.target = null;
                        this.LOCK.notifyAll();
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
        }
    }
    
    public void stop() {
        this.running = false;
    }
}
