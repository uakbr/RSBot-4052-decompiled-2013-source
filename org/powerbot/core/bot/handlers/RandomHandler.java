
package org.powerbot.core.bot.handlers;

import java.util.ArrayList;
import org.o;
import java.util.Iterator;
import java.lang.annotation.Annotation;
import org.powerbot.core.script.job.Job;
import org.powerbot.core.script.job.Task;
import java.util.Collection;
import java.util.Arrays;
import org.powerbot.core.randoms.BankPin;
import org.powerbot.core.randoms.SpinTickets;
import org.powerbot.core.randoms.WidgetCloser;
import org.powerbot.core.randoms.Login;
import java.util.EventListener;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.api.Manifest;
import java.util.concurrent.CopyOnWriteArrayList;
import org.powerbot.core.randoms.AntiRandom;
import java.util.logging.Logger;
import org.powerbot.core.script.job.LoopTask;

public class RandomHandler extends LoopTask
{
    private static final Logger log;
    private final AntiRandom[] randoms;
    private final CopyOnWriteArrayList<AntiRandom> activeRandoms;
    private final ScriptHandler handler;
    private AntiRandom random;
    private Manifest manifest;
    private final Timer timeout;
    private EventListener[] listeners;
    private static final String[] z;
    
    public RandomHandler(final ScriptHandler handler) {
        final boolean a = ScriptHandler.a;
        this.randoms = new AntiRandom[] { new Login(), new WidgetCloser(), new SpinTickets(), new BankPin() };
        (this.activeRandoms = new CopyOnWriteArrayList<AntiRandom>()).addAllAbsent(Arrays.asList(this.randoms));
        this.handler = handler;
        this.random = null;
        this.timeout = new Timer(0L);
        this.listeners = null;
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    @Override
    public int loop() {
        final boolean a = ScriptHandler.a;
        Label_0181: {
            AntiRandom random = null;
            Label_0107: {
                try {
                    random = this.random;
                    if (a) {
                        break Label_0107;
                    }
                    if (random == null) {
                        break Label_0107;
                    }
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    Label_0048: {
                        boolean activate = false;
                        Label_0037: {
                            boolean b;
                            try {
                                b = (activate = this.random.activate());
                                if (a) {
                                    return activate ? 1 : 0;
                                }
                                if (!b) {
                                    break Label_0037;
                                }
                                break Label_0048;
                            }
                            catch (Exception ex2) {
                                throw ex2;
                            }
                            try {
                                if (b) {
                                    break Label_0048;
                                }
                                this.process(false);
                                activate = false;
                            }
                            catch (Exception ex3) {
                                throw ex3;
                            }
                        }
                        return activate ? 1 : 0;
                    }
                }
                catch (Exception ex10) {
                    this.random = null;
                    return 0;
                }
                Label_0077: {
                    boolean b2;
                    try {
                        final boolean running;
                        b2 = (running = this.timeout.isRunning());
                        if (a) {
                            return running ? 1 : 0;
                        }
                        if (!b2) {
                            break Label_0077;
                        }
                        break Label_0077;
                    }
                    catch (Exception ex4) {
                        throw ex4;
                    }
                    try {
                        if (!b2) {
                            this.terminate();
                            return -1;
                        }
                    }
                    catch (Exception ex5) {
                        throw ex5;
                    }
                }
                this.getContainer().submit(this.random);
                this.random.join();
                boolean running = false;
                return running ? 1 : 0;
                try {
                    final RandomHandler randomHandler = this;
                    if (a) {
                        break Label_0181;
                    }
                    this.random = this.next();
                }
                catch (Exception ex6) {
                    throw ex6;
                }
            }
            if (random != null) {
                final Class<? extends AntiRandom> class1 = this.random.getClass();
                Manifest manifest = null;
                Label_0170: {
                    Label_0169: {
                        Class<? extends AntiRandom> clazz2 = null;
                        Class<Manifest> annotationClass = null;
                        Label_0153: {
                            Class<? extends AntiRandom> clazz;
                            Class<Manifest> clazz3;
                            try {
                                clazz = (clazz2 = class1);
                                clazz3 = (annotationClass = Manifest.class);
                                if (a) {
                                    break Label_0153;
                                }
                                final boolean b3 = clazz.isAnnotationPresent(clazz3);
                                if (b3) {
                                    break Label_0153;
                                }
                                break Label_0169;
                            }
                            catch (Exception ex7) {
                                throw ex7;
                            }
                            try {
                                final boolean b3 = clazz.isAnnotationPresent(clazz3);
                                if (!b3) {
                                    break Label_0169;
                                }
                                clazz2 = class1;
                                annotationClass = Manifest.class;
                            }
                            catch (Exception ex8) {
                                throw ex8;
                            }
                        }
                        manifest = clazz2.getAnnotation(annotationClass);
                        break Label_0170;
                    }
                    manifest = null;
                }
                this.manifest = manifest;
                this.process(true);
                return 0;
            }
            final RandomHandler randomHandler = this;
            try {
                final int active;
                final boolean b4 = (active = (randomHandler.handler.isActive() ? 1 : 0)) != 0;
                if (a) {
                    return active;
                }
                if (!b4) {
                    return -1;
                }
            }
            catch (Exception ex9) {
                throw ex9;
            }
        }
        return 2000;
        active = -1;
        return active;
    }
    
    public void enable(final Class<? extends AntiRandom> p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aconst_null    
        //     6: astore_3       
        //     7: aload_1        
        //     8: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    11: astore          4
        //    13: aload_0        
        //    14: getfield        org/powerbot/core/bot/handlers/RandomHandler.randoms:[Lorg/powerbot/core/randoms/AntiRandom;
        //    17: astore          5
        //    19: aload           5
        //    21: arraylength    
        //    22: istore          6
        //    24: iconst_0       
        //    25: istore          7
        //    27: iload           7
        //    29: iload           6
        //    31: if_icmpge       78
        //    34: aload           5
        //    36: iload           7
        //    38: aaload         
        //    39: astore          8
        //    41: iload           9
        //    43: ifne            75
        //    46: aload           8
        //    48: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    51: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
        //    54: aload           4
        //    56: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    59: ifeq            72
        //    62: goto            66
        //    65: athrow         
        //    66: aload           8
        //    68: astore_3       
        //    69: goto            78
        //    72: iinc            7, 1
        //    75: goto            27
        //    78: aload_3        
        //    79: ifnull          130
        //    82: iload_2        
        //    83: iload           9
        //    85: ifne            129
        //    88: goto            92
        //    91: athrow         
        //    92: ifeq            117
        //    95: goto            99
        //    98: athrow         
        //    99: aload_0        
        //   100: getfield        org/powerbot/core/bot/handlers/RandomHandler.activeRandoms:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   103: aload_3        
        //   104: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.addIfAbsent:(Ljava/lang/Object;)Z
        //   107: pop            
        //   108: iload           9
        //   110: ifeq            130
        //   113: goto            117
        //   116: athrow         
        //   117: aload_0        
        //   118: getfield        org/powerbot/core/bot/handlers/RandomHandler.activeRandoms:Ljava/util/concurrent/CopyOnWriteArrayList;
        //   121: aload_3        
        //   122: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.remove:(Ljava/lang/Object;)Z
        //   125: goto            129
        //   128: athrow         
        //   129: pop            
        //   130: getstatic       org/powerbot/core/script/job/Task.a:I
        //   133: ifeq            154
        //   136: iload           9
        //   138: ifeq            150
        //   141: goto            145
        //   144: athrow         
        //   145: iconst_0       
        //   146: goto            151
        //   149: athrow         
        //   150: iconst_1       
        //   151: putstatic       org/powerbot/core/bot/handlers/ScriptHandler.a:Z
        //   154: return         
        //    Signature:
        //  (Ljava/lang/Class<+Lorg/powerbot/core/randoms/AntiRandom;>;Z)V
        //    StackMapTable: 00 15 FF 00 1B 00 0A 07 00 47 07 00 8F 01 05 07 00 96 07 01 2F 01 01 00 01 00 00 FF 00 25 00 0A 07 00 47 07 00 8F 01 05 07 00 96 07 01 2F 01 01 07 00 02 01 00 01 07 01 1E 00 05 02 FF 00 02 00 0A 07 00 47 07 00 8F 01 07 00 02 07 00 96 07 01 2F 01 01 00 01 00 00 4C 07 01 1E 40 01 45 07 01 1E 00 50 07 01 1E 00 4A 07 01 1E 40 01 00 4D 07 01 1E 00 43 07 01 1E 00 40 01 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  136    149    149    150    Ljava/lang/RuntimeException;
        //  130    141    144    145    Ljava/lang/RuntimeException;
        //  99     125    128    129    Ljava/lang/RuntimeException;
        //  92     113    116    117    Ljava/lang/RuntimeException;
        //  82     95     98     99     Ljava/lang/RuntimeException;
        //  78     88     91     92     Ljava/lang/RuntimeException;
        //  41     62     65     66     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0092:
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
    
    public boolean isEnabled(final Class<? extends AntiRandom> clazz) {
        final boolean a = ScriptHandler.a;
        final String name = clazz.getName();
        for (final AntiRandom antiRandom : this.activeRandoms) {
            boolean b = false;
            Label_0071: {
                Label_0073: {
                    Label_0064: {
                        try {
                            final boolean equals;
                            b = (equals = antiRandom.getClass().getName().equals(name));
                            if (a) {
                                return equals;
                            }
                            final boolean b2 = a;
                            if (!b2) {
                                break Label_0064;
                            }
                            return b;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final boolean b2 = a;
                            if (b2) {
                                return b;
                            }
                            if (!b) {
                                break Label_0073;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    break Label_0071;
                }
                if (a) {
                    break;
                }
                continue;
            }
            return b;
        }
        return false;
    }
    
    private AntiRandom next() {
        final boolean a = ScriptHandler.a;
        for (final AntiRandom antiRandom : this.activeRandoms) {
            try {
                Label_0054: {
                    AntiRandom antiRandom3 = null;
                    Label_0048: {
                        AntiRandom antiRandom2;
                        try {
                            antiRandom2 = (antiRandom3 = antiRandom);
                            if (a) {
                                return antiRandom3;
                            }
                            final boolean b = antiRandom2.activate();
                            if (b) {
                                break Label_0048;
                            }
                            break Label_0054;
                        }
                        catch (Exception ex) {
                            throw ex;
                        }
                        try {
                            final boolean b = antiRandom2.activate();
                            if (!b) {
                                break Label_0054;
                            }
                            antiRandom3 = antiRandom;
                        }
                        catch (Exception ex2) {
                            throw ex2;
                        }
                    }
                    return antiRandom3;
                }
            }
            catch (Exception ex3) {}
            if (a) {
                break;
            }
        }
        return null;
    }
    
    private void process(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: getfield        org/powerbot/core/bot/handlers/RandomHandler.manifest:Lorg/powerbot/game/api/Manifest;
        //     9: ifnull          102
        //    12: getstatic       org/powerbot/core/bot/handlers/RandomHandler.log:Ljava/util/logging/Logger;
        //    15: new             Ljava/lang/StringBuilder;
        //    18: dup            
        //    19: invokespecial   java/lang/StringBuilder.<init>:()V
        //    22: getstatic       org/powerbot/core/bot/handlers/RandomHandler.z:[Ljava/lang/String;
        //    25: iconst_1       
        //    26: aaload         
        //    27: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //    30: iload           6
        //    32: ifne            67
        //    35: goto            39
        //    38: athrow         
        //    39: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    42: iload_1        
        //    43: ifeq            62
        //    46: goto            50
        //    49: athrow         
        //    50: getstatic       org/powerbot/core/bot/handlers/RandomHandler.z:[Ljava/lang/String;
        //    53: iconst_2       
        //    54: aaload         
        //    55: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    58: goto            70
        //    61: athrow         
        //    62: getstatic       org/powerbot/core/bot/handlers/RandomHandler.z:[Ljava/lang/String;
        //    65: iconst_3       
        //    66: aaload         
        //    67: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: getstatic       org/powerbot/core/bot/handlers/RandomHandler.z:[Ljava/lang/String;
        //    76: iconst_0       
        //    77: aaload         
        //    78: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    84: aload_0        
        //    85: getfield        org/powerbot/core/bot/handlers/RandomHandler.manifest:Lorg/powerbot/game/api/Manifest;
        //    88: invokeinterface org/powerbot/game/api/Manifest.name:()Ljava/lang/String;
        //    93: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    96: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    99: invokevirtual   java/util/logging/Logger.info:(Ljava/lang/String;)V
        //   102: iload_1        
        //   103: ifeq            272
        //   106: aload_0        
        //   107: aload_0        
        //   108: invokespecial   org/powerbot/core/bot/handlers/RandomHandler.getJobListeners:()[Ljava/util/EventListener;
        //   111: putfield        org/powerbot/core/bot/handlers/RandomHandler.listeners:[Ljava/util/EventListener;
        //   114: aload_0        
        //   115: getfield        org/powerbot/core/bot/handlers/RandomHandler.listeners:[Ljava/util/EventListener;
        //   118: astore_2       
        //   119: aload_2        
        //   120: arraylength    
        //   121: istore_3       
        //   122: iconst_0       
        //   123: istore          4
        //   125: iload           4
        //   127: iload_3        
        //   128: if_icmpge       168
        //   131: aload_2        
        //   132: iload           4
        //   134: aaload         
        //   135: astore          5
        //   137: aload_0        
        //   138: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   141: getfield        org/powerbot/core/bot/handlers/ScriptHandler.eventManager:Lorg/powerbot/core/event/EventManager;
        //   144: aload           5
        //   146: invokeinterface org/powerbot/core/event/EventManager.removeListener:(Ljava/util/EventListener;)V
        //   151: iinc            4, 1
        //   154: iload           6
        //   156: ifne            184
        //   159: iload           6
        //   161: ifeq            125
        //   164: goto            168
        //   167: athrow         
        //   168: aload_0        
        //   169: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   172: getfield        org/powerbot/core/bot/handlers/ScriptHandler.eventManager:Lorg/powerbot/core/event/EventManager;
        //   175: aload_0        
        //   176: getfield        org/powerbot/core/bot/handlers/RandomHandler.random:Lorg/powerbot/core/randoms/AntiRandom;
        //   179: invokeinterface org/powerbot/core/event/EventManager.addListener:(Ljava/util/EventListener;)V
        //   184: aload_0        
        //   185: iload           6
        //   187: ifne            239
        //   190: getfield        org/powerbot/core/bot/handlers/RandomHandler.random:Lorg/powerbot/core/randoms/AntiRandom;
        //   193: instanceof      Lorg/powerbot/core/randoms/Login;
        //   196: ifeq            234
        //   199: goto            203
        //   202: athrow         
        //   203: aload_0        
        //   204: getfield        org/powerbot/core/bot/handlers/RandomHandler.timeout:Lorg/powerbot/game/api/util/Timer;
        //   207: sipush          600
        //   210: sipush          720
        //   213: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   216: sipush          1000
        //   219: imul           
        //   220: i2l            
        //   221: invokevirtual   org/powerbot/game/api/util/Timer.setEndIn:(J)J
        //   224: pop2           
        //   225: iload           6
        //   227: ifeq            260
        //   230: goto            234
        //   233: athrow         
        //   234: aload_0        
        //   235: goto            239
        //   238: athrow         
        //   239: getfield        org/powerbot/core/bot/handlers/RandomHandler.timeout:Lorg/powerbot/game/api/util/Timer;
        //   242: sipush          300
        //   245: sipush          420
        //   248: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   251: sipush          1000
        //   254: imul           
        //   255: i2l            
        //   256: invokevirtual   org/powerbot/game/api/util/Timer.setEndIn:(J)J
        //   259: pop2           
        //   260: aload_0        
        //   261: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   264: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.pause:()V
        //   267: iload           6
        //   269: ifeq            384
        //   272: aload_0        
        //   273: iload           6
        //   275: ifne            378
        //   278: goto            282
        //   281: athrow         
        //   282: getfield        org/powerbot/core/bot/handlers/RandomHandler.listeners:[Ljava/util/EventListener;
        //   285: ifnull          351
        //   288: goto            292
        //   291: athrow         
        //   292: aload_0        
        //   293: getfield        org/powerbot/core/bot/handlers/RandomHandler.listeners:[Ljava/util/EventListener;
        //   296: astore_2       
        //   297: aload_2        
        //   298: arraylength    
        //   299: istore_3       
        //   300: iconst_0       
        //   301: istore          4
        //   303: iload           4
        //   305: iload_3        
        //   306: if_icmpge       346
        //   309: aload_2        
        //   310: iload           4
        //   312: aaload         
        //   313: astore          5
        //   315: aload_0        
        //   316: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   319: getfield        org/powerbot/core/bot/handlers/ScriptHandler.eventManager:Lorg/powerbot/core/event/EventManager;
        //   322: aload           5
        //   324: invokeinterface org/powerbot/core/event/EventManager.addListener:(Ljava/util/EventListener;)V
        //   329: iinc            4, 1
        //   332: iload           6
        //   334: ifne            377
        //   337: iload           6
        //   339: ifeq            303
        //   342: goto            346
        //   345: athrow         
        //   346: aload_0        
        //   347: aconst_null    
        //   348: putfield        org/powerbot/core/bot/handlers/RandomHandler.listeners:[Ljava/util/EventListener;
        //   351: aload_0        
        //   352: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   355: getfield        org/powerbot/core/bot/handlers/ScriptHandler.eventManager:Lorg/powerbot/core/event/EventManager;
        //   358: aload_0        
        //   359: getfield        org/powerbot/core/bot/handlers/RandomHandler.random:Lorg/powerbot/core/randoms/AntiRandom;
        //   362: invokeinterface org/powerbot/core/event/EventManager.removeListener:(Ljava/util/EventListener;)V
        //   367: aload_0        
        //   368: aconst_null    
        //   369: putfield        org/powerbot/core/bot/handlers/RandomHandler.random:Lorg/powerbot/core/randoms/AntiRandom;
        //   372: aload_0        
        //   373: aconst_null    
        //   374: putfield        org/powerbot/core/bot/handlers/RandomHandler.manifest:Lorg/powerbot/game/api/Manifest;
        //   377: aload_0        
        //   378: getfield        org/powerbot/core/bot/handlers/RandomHandler.handler:Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   381: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.resume:()V
        //   384: return         
        //    StackMapTable: 00 20 FF 00 26 00 07 07 00 47 01 00 00 00 00 01 00 01 07 01 1E FF 00 00 00 07 07 00 47 01 00 00 00 00 01 00 03 07 00 A3 07 00 2E 07 00 96 49 07 01 1E FF 00 00 00 07 07 00 47 01 00 00 00 00 01 00 02 07 00 A3 07 00 2E 4A 07 01 1E FF 00 00 00 07 07 00 47 01 00 00 00 00 01 00 02 07 00 A3 07 00 2E FF 00 04 00 07 07 00 47 01 00 00 00 00 01 00 03 07 00 A3 07 00 2E 07 00 96 FF 00 02 00 07 07 00 47 01 00 00 00 00 01 00 03 07 00 A3 07 00 2E 07 00 96 1F FF 00 16 00 07 07 00 47 01 07 00 46 01 01 00 01 00 00 FF 00 29 00 07 07 00 47 01 07 00 46 01 01 07 00 44 01 00 01 07 01 1E FF 00 00 00 07 07 00 47 01 07 00 46 01 01 00 01 00 00 0F 51 07 01 1E 00 5D 07 01 1E 00 43 07 01 1E 40 07 00 47 14 FF 00 0B 00 07 07 00 47 01 00 00 00 00 01 00 00 48 07 01 1E 40 07 00 47 48 07 01 1E 00 FF 00 0A 00 07 07 00 47 01 07 00 46 01 01 00 01 00 00 FF 00 29 00 07 07 00 47 01 07 00 46 01 01 07 00 44 01 00 01 07 01 1E FF 00 00 00 07 07 00 47 01 07 00 46 01 01 00 01 00 00 FF 00 04 00 07 07 00 47 01 00 00 00 00 01 00 00 19 40 07 00 47 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  315    342    345    346    Ljava/lang/RuntimeException;
        //  272    288    291    292    Ljava/lang/RuntimeException;
        //  260    278    281    282    Ljava/lang/RuntimeException;
        //  203    235    238    239    Ljava/lang/RuntimeException;
        //  190    230    233    234    Ljava/lang/RuntimeException;
        //  184    199    202    203    Ljava/lang/RuntimeException;
        //  137    164    167    168    Ljava/lang/RuntimeException;
        //  39     61     61     62     Ljava/lang/RuntimeException;
        //  12     46     49     50     Ljava/lang/RuntimeException;
        //  5      35     38     39     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0039:
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
    
    private void terminate() {
        try {
            this.handler.stop();
            if (this.manifest != null) {
                RandomHandler.log.warning(o.a(RandomHandler.z[4]) + this.manifest.name());
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    private EventListener[] getJobListeners() {
        final boolean a = ScriptHandler.a;
        final EventListener[] listeners = this.handler.eventManager.getListeners();
        final ArrayList list = new ArrayList<EventListener>(listeners.length);
        final EventListener[] array = listeners;
        final int length = array.length;
        int i = 0;
        EventListener[] array2 = null;
        while (i < length) {
            array2 = array;
            if (a) {
                return array2;
            }
            final EventListener eventListener = array2[i];
            Label_0088: {
                Label_0072: {
                    try {
                        if (a) {
                            break Label_0088;
                        }
                        final EventListener eventListener2 = eventListener;
                        final boolean b = eventListener2 instanceof Job;
                        if (b) {
                            break Label_0072;
                        }
                        break Label_0072;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final EventListener eventListener2 = eventListener;
                        final boolean b = eventListener2 instanceof Job;
                        if (b) {
                            list.add(eventListener);
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                ++i;
            }
            if (a) {
                break;
            }
        }
        final EventListener[] array3 = list.toArray(new EventListener[list.size()]);
        return array2;
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "6\u0013";
        int n6 = -1;
        String intern = null;
    Label_0076_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0150: {
                    if (n7 > 1) {
                        break Label_0150;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'u';
                                break;
                            }
                            case 1: {
                                c2 = 's';
                                break;
                            }
                            case 2: {
                                c2 = 'H';
                                break;
                            }
                            case 3: {
                                c2 = '~';
                                break;
                            }
                            default: {
                                c2 = 'c';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "gAfILK\u0013hQ\\CEz\r";
                    n6 = 0;
                    continue Label_0076_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "F~iuWiW";
                    n6 = 1;
                    continue Label_0076_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "E\\vN\\PTmI";
                    n6 = 2;
                    continue Label_0076_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "gAfILK\u0013hQ\\CEz\rEGZw[T\u000f\u0000";
                    n6 = 3;
                    continue Label_0076_Outer;
                }
                case 3: {
                    break Label_0076_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
        log = Logger.getLogger(RandomHandler.class.getName());
    }
}
