
package org.powerbot.core.event;

import java.awt.event.KeyEvent;
import java.awt.event.FocusEvent;
import org.powerbot.core.bot.ClientStub;
import java.awt.event.MouseEvent;
import org.powerbot.core.event.listeners.TextPaintListener;
import org.powerbot.core.event.listeners.PaintListener;
import org.powerbot.core.event.listeners.MessageListener;
import java.awt.event.FocusListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseListener;
import org.powerbot.core.script.job.Task;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.EventObject;
import java.util.Queue;
import java.util.Map;
import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;

public class EventMulticaster implements EventManager
{
    private final CopyOnWriteArrayList<EventListener> listeners;
    private final Map<EventListener, Long> listenerMasks;
    private final Queue<EventObject> queue;
    private boolean active;
    public static final int MOUSE_EVENT = 1;
    public static final int MOUSE_MOTION_EVENT = 2;
    public static final int MOUSE_WHEEL_EVENT = 4;
    public static final int FOCUS_EVENT = 8;
    public static final int KEY_EVENT = 16;
    public static final int MESSAGE_EVENT = 32;
    public static final int PAINT_EVENT = 64;
    public static final int TEXT_PAINT_EVENT = 128;
    private static final String z;
    
    public EventMulticaster() {
        final int a = GameEvent.a;
        this.listeners = new CopyOnWriteArrayList<EventListener>();
        this.listenerMasks = new ConcurrentHashMap<EventListener, Long>();
        this.queue = new ConcurrentLinkedQueue<EventObject>();
        this.active = true;
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    @Override
    public void dispatch(final EventObject eventObject) {
        this.queue.offer(eventObject);
        synchronized (this.queue) {
            try {
                this.queue.notify();
            }
            catch (IllegalThreadStateException ex) {}
        }
    }
    
    @Override
    public void fire(final EventObject eventObject) {
        this.fire(eventObject, getType(eventObject));
    }
    
    private void fire(final EventObject p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: iload           7
        //     8: ifne            24
        //    11: getfield        org/powerbot/core/event/EventMulticaster.active:Z
        //    14: ifne            23
        //    17: goto            21
        //    20: athrow         
        //    21: return         
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        org/powerbot/core/event/EventMulticaster.listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    27: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.iterator:()Ljava/util/Iterator;
        //    30: astore_3       
        //    31: aload_3        
        //    32: invokeinterface java/util/Iterator.hasNext:()Z
        //    37: ifeq            630
        //    40: aload_3        
        //    41: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    46: checkcast       Ljava/util/EventListener;
        //    49: astore          4
        //    51: aload_0        
        //    52: getfield        org/powerbot/core/event/EventMulticaster.listenerMasks:Ljava/util/Map;
        //    55: aload           4
        //    57: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    62: checkcast       Ljava/lang/Long;
        //    65: astore          5
        //    67: aload           5
        //    69: iload           7
        //    71: ifne            86
        //    74: ifnonnull       84
        //    77: goto            81
        //    80: athrow         
        //    81: goto            31
        //    84: aload           5
        //    86: invokevirtual   java/lang/Long.longValue:()J
        //    89: iload_2        
        //    90: i2l            
        //    91: land           
        //    92: lconst_0       
        //    93: lcmp           
        //    94: iload           7
        //    96: ifne            113
        //    99: ifne            109
        //   102: goto            106
        //   105: athrow         
        //   106: goto            31
        //   109: aload_1        
        //   110: instanceof      Ljava/awt/event/MouseEvent;
        //   113: iload           7
        //   115: ifne            368
        //   118: ifeq            360
        //   121: goto            125
        //   124: athrow         
        //   125: aload_1        
        //   126: checkcast       Ljava/awt/event/MouseEvent;
        //   129: astore          6
        //   131: iload           7
        //   133: ifne            205
        //   136: aload           6
        //   138: invokevirtual   java/awt/event/MouseEvent.getID:()I
        //   141: tableswitch {
        //             1000: 231
        //             1001: 189
        //             1002: 210
        //             1003: 294
        //             1004: 252
        //             1005: 273
        //             1006: 315
        //             1007: 336
        //          default: 355
        //        }
        //   188: athrow         
        //   189: aload           4
        //   191: checkcast       Ljava/awt/event/MouseListener;
        //   194: aload           6
        //   196: invokeinterface java/awt/event/MouseListener.mousePressed:(Ljava/awt/event/MouseEvent;)V
        //   201: goto            205
        //   204: athrow         
        //   205: iload           7
        //   207: ifeq            355
        //   210: aload           4
        //   212: checkcast       Ljava/awt/event/MouseListener;
        //   215: aload           6
        //   217: invokeinterface java/awt/event/MouseListener.mouseReleased:(Ljava/awt/event/MouseEvent;)V
        //   222: iload           7
        //   224: ifeq            355
        //   227: goto            231
        //   230: athrow         
        //   231: aload           4
        //   233: checkcast       Ljava/awt/event/MouseListener;
        //   236: aload           6
        //   238: invokeinterface java/awt/event/MouseListener.mouseClicked:(Ljava/awt/event/MouseEvent;)V
        //   243: iload           7
        //   245: ifeq            355
        //   248: goto            252
        //   251: athrow         
        //   252: aload           4
        //   254: checkcast       Ljava/awt/event/MouseListener;
        //   257: aload           6
        //   259: invokeinterface java/awt/event/MouseListener.mouseEntered:(Ljava/awt/event/MouseEvent;)V
        //   264: iload           7
        //   266: ifeq            355
        //   269: goto            273
        //   272: athrow         
        //   273: aload           4
        //   275: checkcast       Ljava/awt/event/MouseListener;
        //   278: aload           6
        //   280: invokeinterface java/awt/event/MouseListener.mouseExited:(Ljava/awt/event/MouseEvent;)V
        //   285: iload           7
        //   287: ifeq            355
        //   290: goto            294
        //   293: athrow         
        //   294: aload           4
        //   296: checkcast       Ljava/awt/event/MouseMotionListener;
        //   299: aload           6
        //   301: invokeinterface java/awt/event/MouseMotionListener.mouseMoved:(Ljava/awt/event/MouseEvent;)V
        //   306: iload           7
        //   308: ifeq            355
        //   311: goto            315
        //   314: athrow         
        //   315: aload           4
        //   317: checkcast       Ljava/awt/event/MouseMotionListener;
        //   320: aload           6
        //   322: invokeinterface java/awt/event/MouseMotionListener.mouseDragged:(Ljava/awt/event/MouseEvent;)V
        //   327: iload           7
        //   329: ifeq            355
        //   332: goto            336
        //   335: athrow         
        //   336: aload           4
        //   338: checkcast       Ljava/awt/event/MouseWheelListener;
        //   341: aload           6
        //   343: checkcast       Ljava/awt/event/MouseWheelEvent;
        //   346: invokeinterface java/awt/event/MouseWheelListener.mouseWheelMoved:(Ljava/awt/event/MouseWheelEvent;)V
        //   351: goto            355
        //   354: athrow         
        //   355: iload           7
        //   357: ifeq            630
        //   360: aload_1        
        //   361: instanceof      Ljava/awt/event/FocusEvent;
        //   364: goto            368
        //   367: athrow         
        //   368: iload           7
        //   370: ifne            475
        //   373: ifeq            467
        //   376: goto            380
        //   379: athrow         
        //   380: aload           4
        //   382: checkcast       Ljava/awt/event/FocusEvent;
        //   385: astore          6
        //   387: iload           7
        //   389: ifne            441
        //   392: aload           6
        //   394: invokevirtual   java/awt/event/FocusEvent.getID:()I
        //   397: lookupswitch {
        //             1004: 425
        //             1005: 446
        //          default: 462
        //        }
        //   424: athrow         
        //   425: aload           4
        //   427: checkcast       Ljava/awt/event/FocusListener;
        //   430: aload           6
        //   432: invokeinterface java/awt/event/FocusListener.focusGained:(Ljava/awt/event/FocusEvent;)V
        //   437: goto            441
        //   440: athrow         
        //   441: iload           7
        //   443: ifeq            462
        //   446: aload           4
        //   448: checkcast       Ljava/awt/event/FocusListener;
        //   451: aload           6
        //   453: invokeinterface java/awt/event/FocusListener.focusLost:(Ljava/awt/event/FocusEvent;)V
        //   458: goto            462
        //   461: athrow         
        //   462: iload           7
        //   464: ifeq            625
        //   467: aload_1        
        //   468: instanceof      Ljava/awt/event/KeyEvent;
        //   471: goto            475
        //   474: athrow         
        //   475: iload           7
        //   477: ifne            609
        //   480: ifeq            592
        //   483: goto            487
        //   486: athrow         
        //   487: aload_1        
        //   488: checkcast       Ljava/awt/event/KeyEvent;
        //   491: astore          6
        //   493: iload           7
        //   495: ifne            545
        //   498: aload           6
        //   500: invokevirtual   java/awt/event/KeyEvent.getID:()I
        //   503: tableswitch {
        //              800: 529
        //              801: 550
        //              802: 571
        //          default: 587
        //        }
        //   528: athrow         
        //   529: aload           4
        //   531: checkcast       Ljava/awt/event/KeyListener;
        //   534: aload           6
        //   536: invokeinterface java/awt/event/KeyListener.keyTyped:(Ljava/awt/event/KeyEvent;)V
        //   541: goto            545
        //   544: athrow         
        //   545: iload           7
        //   547: ifeq            587
        //   550: aload           4
        //   552: checkcast       Ljava/awt/event/KeyListener;
        //   555: aload           6
        //   557: invokeinterface java/awt/event/KeyListener.keyPressed:(Ljava/awt/event/KeyEvent;)V
        //   562: iload           7
        //   564: ifeq            587
        //   567: goto            571
        //   570: athrow         
        //   571: aload           4
        //   573: checkcast       Ljava/awt/event/KeyListener;
        //   576: aload           6
        //   578: invokeinterface java/awt/event/KeyListener.keyReleased:(Ljava/awt/event/KeyEvent;)V
        //   583: goto            587
        //   586: athrow         
        //   587: iload           7
        //   589: ifeq            625
        //   592: aload_1        
        //   593: iload           7
        //   595: ifne            613
        //   598: goto            602
        //   601: athrow         
        //   602: instanceof      Lorg/powerbot/core/event/GameEvent;
        //   605: goto            609
        //   608: athrow         
        //   609: ifeq            625
        //   612: aload_1        
        //   613: checkcast       Lorg/powerbot/core/event/GameEvent;
        //   616: astore          6
        //   618: aload           6
        //   620: aload           4
        //   622: invokevirtual   org/powerbot/core/event/GameEvent.dispatch:(Ljava/util/EventListener;)V
        //   625: iload           7
        //   627: ifeq            31
        //   630: return         
        //    StackMapTable: 00 45 FF 00 14 00 08 07 00 57 07 00 3D 01 00 00 00 00 01 00 01 07 00 0E 00 40 07 00 0E 00 40 07 00 57 FF 00 06 00 08 07 00 57 07 00 3D 01 07 00 99 00 00 00 01 00 00 FF 00 30 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 00 01 00 01 07 00 0E 00 02 41 07 00 16 52 07 00 0E 00 02 43 01 4A 07 00 0E 00 FF 00 3E 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 07 00 18 01 00 01 07 00 0E 00 4E 07 00 0E 00 04 53 07 00 0E 00 53 07 00 0E 00 53 07 00 0E 00 53 07 00 0E 00 53 07 00 0E 00 53 07 00 0E 00 51 07 00 0E 00 FF 00 04 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 00 01 00 00 46 07 00 0E 40 01 4A 07 00 0E 00 FF 00 2B 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 07 00 26 01 00 01 07 00 0E 00 4E 07 00 0E 00 04 4E 07 00 0E 00 FF 00 04 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 00 01 00 00 46 07 00 0E 40 01 4A 07 00 0E 00 FF 00 28 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 07 00 2B 01 00 01 07 00 0E 00 4E 07 00 0E 00 04 53 07 00 0E 00 4E 07 00 0E 00 FF 00 04 00 08 07 00 57 07 00 3D 01 07 00 99 07 00 14 07 00 16 00 01 00 00 48 07 00 0E 40 07 00 3D 45 07 00 0E 40 01 43 07 00 3D 0B FF 00 04 00 08 07 00 57 07 00 3D 01 07 00 99 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                   
        //  -----  -----  -----  -----  ---------------------------------------
        //  592    605    608    609    Ljava/lang/IllegalThreadStateException;
        //  587    598    601    602    Ljava/lang/IllegalThreadStateException;
        //  550    583    586    587    Ljava/lang/IllegalThreadStateException;
        //  545    567    570    571    Ljava/lang/IllegalThreadStateException;
        //  498    541    544    545    Ljava/lang/IllegalThreadStateException;
        //  493    528    528    529    Ljava/lang/IllegalThreadStateException;
        //  475    483    486    487    Ljava/lang/IllegalThreadStateException;
        //  462    471    474    475    Ljava/lang/IllegalThreadStateException;
        //  441    458    461    462    Ljava/lang/IllegalThreadStateException;
        //  392    437    440    441    Ljava/lang/IllegalThreadStateException;
        //  387    424    424    425    Ljava/lang/IllegalThreadStateException;
        //  368    376    379    380    Ljava/lang/IllegalThreadStateException;
        //  355    364    367    368    Ljava/lang/IllegalThreadStateException;
        //  315    351    354    355    Ljava/lang/IllegalThreadStateException;
        //  294    332    335    336    Ljava/lang/IllegalThreadStateException;
        //  273    311    314    315    Ljava/lang/IllegalThreadStateException;
        //  252    290    293    294    Ljava/lang/IllegalThreadStateException;
        //  231    269    272    273    Ljava/lang/IllegalThreadStateException;
        //  210    248    251    252    Ljava/lang/IllegalThreadStateException;
        //  205    227    230    231    Ljava/lang/IllegalThreadStateException;
        //  136    201    204    205    Ljava/lang/IllegalThreadStateException;
        //  131    188    188    189    Ljava/lang/IllegalThreadStateException;
        //  113    121    124    125    Ljava/lang/IllegalThreadStateException;
        //  86     102    105    106    Ljava/lang/IllegalThreadStateException;
        //  67     77     80     81     Ljava/lang/IllegalThreadStateException;
        //  11     22     22     23     Ljava/lang/IllegalThreadStateException;
        //  5      17     20     21     Ljava/lang/IllegalThreadStateException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0210:
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
    public void addListener(final EventListener eventListener) {
        Label_0021: {
            CopyOnWriteArrayList<EventListener> listeners;
            try {
                listeners = this.listeners;
                if (GameEvent.a != 0) {
                    return;
                }
                final EventListener eventListener2 = eventListener;
                final boolean b = listeners.addIfAbsent(eventListener2);
                if (b) {
                    break Label_0021;
                }
                return;
            }
            catch (IllegalThreadStateException ex) {
                throw ex;
            }
            try {
                final EventListener eventListener2 = eventListener;
                final boolean b = listeners.addIfAbsent(eventListener2);
                if (b) {
                    this.listenerMasks.put(eventListener, getMask(eventListener));
                }
            }
            catch (IllegalThreadStateException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public void removeListener(final EventListener o) {
        this.listeners.remove(o);
        this.listenerMasks.remove(o);
    }
    
    @Override
    public EventListener[] getListeners() {
        int a = GameEvent.a;
        final int size = this.listeners.size();
        EventListener[] array;
        try {
            array = this.listeners.toArray(new EventListener[size]);
            if (Task.a != 0) {
                GameEvent.a = ++a;
            }
        }
        catch (IllegalThreadStateException ex) {
            throw ex;
        }
        return array;
    }
    
    @Override
    public void stop() {
        this.active = false;
        synchronized (this.queue) {
            try {
                this.queue.notify();
            }
            catch (IllegalThreadStateException ex) {}
        }
    }
    
    @Override
    public void run() {
        final int a = GameEvent.a;
        while (this.active) {
            final EventObject eventObject = this.queue.poll();
            Label_0052: {
                Label_0043: {
                    try {
                        if (a != 0) {
                            break Label_0043;
                        }
                        if (eventObject == null) {
                            break Label_0052;
                        }
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    try {
                        this.fire(eventObject);
                        continue;
                    }
                    catch (Exception ex2) {
                        if (a == 0) {
                            continue;
                        }
                    }
                }
                try {
                    synchronized (this.queue) {
                        this.queue.wait();
                    }
                }
                catch (InterruptedException ex3) {
                    this.stop();
                    return;
                }
            }
            if (a != 0) {
                break;
            }
        }
    }
    
    private static long getMask(final EventListener eventListener) {
        final int a = GameEvent.a;
        long n = 0L;
        boolean b8 = false;
        Label_0155: {
            Label_0151: {
                Label_0134: {
                    Label_0130: {
                        Label_0113: {
                            Label_0109: {
                                Label_0092: {
                                    Label_0088: {
                                        Label_0071: {
                                            Label_0067: {
                                                Label_0050: {
                                                    Label_0046: {
                                                        Label_0029: {
                                                            Label_0025: {
                                                                try {
                                                                    final boolean b7;
                                                                    final boolean b6;
                                                                    final boolean b5;
                                                                    final boolean b4;
                                                                    final boolean b3;
                                                                    final boolean b2;
                                                                    final boolean b = b2 = (b3 = (b4 = (b5 = (b6 = (b7 = (b8 = (eventListener instanceof MouseListener)))))));
                                                                    if (a != 0) {
                                                                        break Label_0029;
                                                                    }
                                                                    if (!b) {
                                                                        break Label_0025;
                                                                    }
                                                                }
                                                                catch (IllegalThreadStateException ex) {
                                                                    throw ex;
                                                                }
                                                                n |= 0x1L;
                                                            }
                                                            boolean b7;
                                                            boolean b6;
                                                            boolean b5;
                                                            boolean b4;
                                                            boolean b2;
                                                            boolean b3 = b2 = (b4 = (b5 = (b6 = (b7 = (b8 = (eventListener instanceof MouseMotionListener))))));
                                                            try {
                                                                if (a != 0) {
                                                                    break Label_0050;
                                                                }
                                                                if (!b2) {
                                                                    break Label_0046;
                                                                }
                                                            }
                                                            catch (IllegalThreadStateException ex2) {
                                                                throw ex2;
                                                            }
                                                        }
                                                        n |= 0x2L;
                                                    }
                                                    boolean b7;
                                                    boolean b6;
                                                    boolean b5;
                                                    boolean b3;
                                                    boolean b4 = b3 = (b5 = (b6 = (b7 = (b8 = (eventListener instanceof MouseWheelListener)))));
                                                    try {
                                                        if (a != 0) {
                                                            break Label_0071;
                                                        }
                                                        if (!b3) {
                                                            break Label_0067;
                                                        }
                                                    }
                                                    catch (IllegalThreadStateException ex3) {
                                                        throw ex3;
                                                    }
                                                }
                                                n |= 0x4L;
                                            }
                                            boolean b7;
                                            boolean b6;
                                            boolean b4;
                                            boolean b5 = b4 = (b6 = (b7 = (b8 = (eventListener instanceof KeyListener))));
                                            try {
                                                if (a != 0) {
                                                    break Label_0092;
                                                }
                                                if (!b4) {
                                                    break Label_0088;
                                                }
                                            }
                                            catch (IllegalThreadStateException ex4) {
                                                throw ex4;
                                            }
                                        }
                                        n |= 0x10L;
                                    }
                                    boolean b7;
                                    boolean b5;
                                    boolean b6 = b5 = (b7 = (b8 = (eventListener instanceof FocusListener)));
                                    try {
                                        if (a != 0) {
                                            break Label_0113;
                                        }
                                        if (!b5) {
                                            break Label_0109;
                                        }
                                    }
                                    catch (IllegalThreadStateException ex5) {
                                        throw ex5;
                                    }
                                }
                                n |= 0x8L;
                            }
                            boolean b6;
                            boolean b7 = b6 = (b8 = (eventListener instanceof MessageListener));
                            try {
                                if (a != 0) {
                                    break Label_0134;
                                }
                                if (!b6) {
                                    break Label_0130;
                                }
                            }
                            catch (IllegalThreadStateException ex6) {
                                throw ex6;
                            }
                        }
                        n |= 0x20L;
                    }
                    boolean b7;
                    b8 = (b7 = (eventListener instanceof PaintListener));
                    try {
                        if (a != 0) {
                            break Label_0155;
                        }
                        if (!b7) {
                            break Label_0151;
                        }
                    }
                    catch (IllegalThreadStateException ex7) {
                        throw ex7;
                    }
                }
                n |= 0x40L;
            }
            b8 = (eventListener instanceof TextPaintListener);
        }
        if (b8) {
            n |= 0x80L;
        }
        return n;
    }
    
    private static int getType(final EventObject eventObject) {
        final int a = GameEvent.a;
        int type = 0;
        Label_0243: {
            int n = 0;
            Label_0232: {
                Label_0224: {
                    Label_0164: {
                        boolean b3 = false;
                        Label_0156: {
                            Label_0099: {
                                boolean b2 = false;
                                Label_0091: {
                                    try {
                                        final boolean b = b2 = (b3 = ((n = (type = ((eventObject instanceof MouseEvent) ? 1 : 0))) != 0));
                                        if (a != 0) {
                                            break Label_0099;
                                        }
                                        if (!b) {
                                            break Label_0091;
                                        }
                                    }
                                    catch (IllegalThreadStateException ex) {
                                        throw ex;
                                    }
                                    final MouseEvent mouseEvent = (MouseEvent)eventObject;
                                    Label_0087: {
                                        int id;
                                        try {
                                            id = mouseEvent.getID();
                                            if (a != 0) {
                                                return id;
                                            }
                                            switch (id) {
                                                case 500:
                                                case 501:
                                                case 502:
                                                case 504:
                                                case 505: {
                                                    break;
                                                }
                                                case 503:
                                                case 506: {
                                                    return 2;
                                                }
                                                case 507: {
                                                    return 4;
                                                }
                                                default: {
                                                    break Label_0087;
                                                }
                                            }
                                        }
                                        catch (IllegalThreadStateException ex2) {
                                            throw ex2;
                                        }
                                        return id;
                                        try {
                                            if (a == 0) {
                                                throw new RuntimeException(ClientStub.e(EventMulticaster.z));
                                            }
                                            b3 = (b2 = ((n = (type = ((eventObject instanceof FocusEvent) ? 1 : 0))) != 0));
                                        }
                                        catch (IllegalThreadStateException ex3) {
                                            throw ex3;
                                        }
                                    }
                                }
                                try {
                                    if (a != 0) {
                                        break Label_0164;
                                    }
                                    if (!b2) {
                                        break Label_0156;
                                    }
                                }
                                catch (IllegalThreadStateException ex4) {
                                    throw ex4;
                                }
                            }
                            final FocusEvent focusEvent = (FocusEvent)eventObject;
                            Label_0152: {
                                int id2;
                                try {
                                    id2 = focusEvent.getID();
                                    if (a != 0) {
                                        return id2;
                                    }
                                    switch (id2) {
                                        case 1004:
                                        case 1005: {
                                            break;
                                        }
                                        default: {
                                            break Label_0152;
                                        }
                                    }
                                }
                                catch (IllegalThreadStateException ex5) {
                                    throw ex5;
                                }
                                return id2;
                                try {
                                    if (a == 0) {
                                        throw new RuntimeException(ClientStub.e(EventMulticaster.z));
                                    }
                                    n = ((b3 = ((type = ((eventObject instanceof KeyEvent) ? 1 : 0)) != 0)) ? 1 : 0);
                                }
                                catch (IllegalThreadStateException ex6) {
                                    throw ex6;
                                }
                            }
                        }
                        try {
                            if (a != 0) {
                                break Label_0232;
                            }
                            if (!b3) {
                                break Label_0224;
                            }
                        }
                        catch (IllegalThreadStateException ex7) {
                            throw ex7;
                        }
                    }
                    final KeyEvent keyEvent = (KeyEvent)eventObject;
                    Label_0220: {
                        int id3;
                        try {
                            id3 = keyEvent.getID();
                            if (a != 0) {
                                return id3;
                            }
                            switch (id3) {
                                case 400:
                                case 401:
                                case 402: {
                                    break;
                                }
                                default: {
                                    break Label_0220;
                                }
                            }
                        }
                        catch (IllegalThreadStateException ex8) {
                            throw ex8;
                        }
                        return id3;
                        try {
                            if (a == 0) {
                                throw new RuntimeException(ClientStub.e(EventMulticaster.z));
                            }
                            type = (n = ((eventObject instanceof GameEvent) ? 1 : 0));
                        }
                        catch (IllegalThreadStateException ex9) {
                            throw ex9;
                        }
                    }
                }
                try {
                    if (a != 0) {
                        return type;
                    }
                    if (n != 0) {
                        break Label_0243;
                    }
                    throw new RuntimeException(ClientStub.e(EventMulticaster.z));
                }
                catch (IllegalThreadStateException ex10) {
                    throw ex10;
                }
            }
            try {
                if (n == 0) {
                    throw new RuntimeException(ClientStub.e(EventMulticaster.z));
                }
                type = ((GameEvent)eventObject).type;
            }
            catch (IllegalThreadStateException ex11) {
                throw ex11;
            }
        }
        return type;
    }
    
    static {
        final char[] charArray = "-D@\u0015\u0005F?5>".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0106: {
                if (n > 1) {
                    break Label_0106;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'K';
                            break;
                        }
                        case 1: {
                            c2 = '^';
                            break;
                        }
                        case 2: {
                            c2 = ' ';
                            break;
                        }
                        case 3: {
                            c2 = 'N';
                            break;
                        }
                        default: {
                            c2 = 'd';
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
