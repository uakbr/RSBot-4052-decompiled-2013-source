
package org.powerbot.core.script.job;

import org.o;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import org.s;
import java.util.Deque;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TaskContainer implements Container
{
    private final CopyOnWriteArrayList<JobListener> listeners;
    private final List<Container> children;
    private Container[] childrenCache;
    private final ThreadGroup group;
    private final ExecutorService executor;
    private Deque<Job> jobs;
    private volatile boolean paused;
    private volatile boolean shutdown;
    private volatile boolean interrupted;
    private final TaskContainer parent_container;
    
    public TaskContainer() {
        this(Thread.currentThread().getThreadGroup());
    }
    
    public TaskContainer(final ThreadGroup threadGroup) {
        this(threadGroup, null);
    }
    
    private TaskContainer(final ThreadGroup parent, final TaskContainer parent_container) {
        this.listeners = new CopyOnWriteArrayList<JobListener>();
        this.children = new CopyOnWriteArrayList<Container>();
        this.childrenCache = new Container[0];
        this.group = new ThreadGroup(parent, this.getClass().getName() + s.a(" ") + this.hashCode());
        this.executor = Executors.newCachedThreadPool(new ThreadPool(this.group));
        this.jobs = new ConcurrentLinkedDeque<Job>();
        this.paused = false;
        this.shutdown = false;
        this.interrupted = false;
        this.parent_container = parent_container;
    }
    
    @Override
    public final void submit(final Job p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_3        
        //     6: ifne            29
        //     9: invokevirtual   org/powerbot/core/script/job/TaskContainer.isShutdown:()Z
        //    12: ifeq            21
        //    15: goto            19
        //    18: athrow         
        //    19: return         
        //    20: athrow         
        //    21: aload_1        
        //    22: aload_0        
        //    23: invokeinterface org/powerbot/core/script/job/Job.setContainer:(Lorg/powerbot/core/script/job/Container;)V
        //    28: aload_0        
        //    29: getfield        org/powerbot/core/script/job/TaskContainer.executor:Ljava/util/concurrent/ExecutorService;
        //    32: aload_0        
        //    33: aload_1        
        //    34: invokespecial   org/powerbot/core/script/job/TaskContainer.createWorker:(Lorg/powerbot/core/script/job/Job;)Ljava/lang/Runnable;
        //    37: invokeinterface java/util/concurrent/ExecutorService.submit:(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
        //    42: astore_2       
        //    43: aload_2        
        //    44: ifnull          78
        //    47: aload_1        
        //    48: iload_3        
        //    49: ifne            71
        //    52: goto            56
        //    55: athrow         
        //    56: instanceof      Lorg/powerbot/core/script/job/Task;
        //    59: ifeq            78
        //    62: goto            66
        //    65: athrow         
        //    66: aload_1        
        //    67: goto            71
        //    70: athrow         
        //    71: checkcast       Lorg/powerbot/core/script/job/Task;
        //    74: aload_2        
        //    75: putfield        org/powerbot/core/script/job/Task.future:Ljava/util/concurrent/Future;
        //    78: return         
        //    StackMapTable: 00 0C FF 00 12 00 04 07 00 2F 07 00 2C 00 01 00 01 07 01 01 00 40 07 01 01 00 47 07 00 2F FF 00 19 00 04 07 00 2F 07 00 2C 07 01 04 01 00 01 07 01 01 40 07 00 2C 48 07 01 01 00 43 07 01 01 40 07 00 2C 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  56     67     70     71     Ljava/lang/RuntimeException;
        //  47     62     65     66     Ljava/lang/RuntimeException;
        //  43     52     55     56     Ljava/lang/RuntimeException;
        //  9      20     20     21     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0056:
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
    public final void setPaused(final boolean b) {
        final int b2 = LoopTask.b;
        TaskContainer taskContainer = null;
        Label_0049: {
            Label_0035: {
                boolean shutdown = false;
                Label_0022: {
                    try {
                        shutdown = this.isShutdown();
                        if (b2 != 0) {
                            break Label_0035;
                        }
                        if (!shutdown) {
                            break Label_0022;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    return;
                    try {
                        taskContainer = this;
                        if (b2 != 0) {
                            break Label_0049;
                        }
                        final boolean paused = this.paused;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (shutdown != b) {
                        this.paused = b;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            taskContainer = this;
        }
        final Container[] children = taskContainer.getChildren();
        final int length = children.length;
        int i = 0;
        while (i < length) {
            children[i].setPaused(b);
            ++i;
            if (b2 != 0) {
                break;
            }
        }
    }
    
    @Override
    public final boolean isPaused() {
        return this.paused;
    }
    
    @Override
    public Job[] enumerate() {
        return this.jobs.toArray(new Job[this.jobs.size()]);
    }
    
    @Override
    public final int getActiveCount() {
        return this.jobs.size();
    }
    
    @Override
    public final Container branch() {
        final TaskContainer taskContainer = new TaskContainer(this.group, this);
        this.children.add(taskContainer);
        return taskContainer;
    }
    
    @Override
    public final Container[] getChildren() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        org/powerbot/core/script/job/TaskContainer.children:Ljava/util/List;
        //     4: invokeinterface java/util/List.size:()I
        //     9: dup            
        //    10: istore_1       
        //    11: getstatic       org/powerbot/core/script/job/LoopTask.b:I
        //    14: ifne            66
        //    17: ifle            65
        //    20: goto            24
        //    23: athrow         
        //    24: iload_1        
        //    25: aload_0        
        //    26: getfield        org/powerbot/core/script/job/TaskContainer.childrenCache:[Lorg/powerbot/core/script/job/Container;
        //    29: arraylength    
        //    30: if_icmpne       43
        //    33: goto            37
        //    36: athrow         
        //    37: aload_0        
        //    38: getfield        org/powerbot/core/script/job/TaskContainer.childrenCache:[Lorg/powerbot/core/script/job/Container;
        //    41: areturn        
        //    42: athrow         
        //    43: aload_0        
        //    44: aload_0        
        //    45: getfield        org/powerbot/core/script/job/TaskContainer.children:Ljava/util/List;
        //    48: iload_1        
        //    49: anewarray       Lorg/powerbot/core/script/job/Container;
        //    52: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    57: checkcast       [Lorg/powerbot/core/script/job/Container;
        //    60: dup_x1         
        //    61: putfield        org/powerbot/core/script/job/TaskContainer.childrenCache:[Lorg/powerbot/core/script/job/Container;
        //    64: areturn        
        //    65: iconst_0       
        //    66: anewarray       Lorg/powerbot/core/script/job/Container;
        //    69: areturn        
        //    StackMapTable: 00 08 FF 00 17 00 02 07 00 2F 01 00 01 07 01 01 00 4B 07 01 01 00 44 07 01 01 00 15 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  24     42     42     43     Ljava/lang/RuntimeException;
        //  17     33     36     37     Ljava/lang/RuntimeException;
        //  11     20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
    public final void shutdown() {
        final int b = LoopTask.b;
        TaskContainer taskContainer = null;
        Label_0031: {
            Label_0021: {
                try {
                    taskContainer = this;
                    if (b != 0) {
                        break Label_0031;
                    }
                    final boolean b2 = this.isShutdown();
                    if (!b2) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b2 = this.isShutdown();
                    if (!b2) {
                        this.shutdown = true;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            taskContainer = this;
        }
        final Container[] children = taskContainer.getChildren();
        final int length = children.length;
        int i = 0;
        while (i < length) {
            children[i].shutdown();
            ++i;
            if (b != 0) {
                break;
            }
        }
    }
    
    @Override
    public final boolean isShutdown() {
        return this.shutdown;
    }
    
    @Override
    public final void interrupt() {
        int b = LoopTask.b;
        TaskContainer taskContainer = null;
        Label_0035: {
            Label_0025: {
                try {
                    this.shutdown();
                    taskContainer = this;
                    if (b != 0) {
                        break Label_0035;
                    }
                    final boolean b2 = this.interrupted;
                    if (!b2) {
                        break Label_0025;
                    }
                    break Label_0025;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b2 = this.interrupted;
                    if (!b2) {
                        this.interrupted = true;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            taskContainer = this;
        }
        final Container[] children = taskContainer.getChildren();
        final int length = children.length;
        int i = 0;
        while (i < length) {
            children[i].interrupt();
            ++i;
            if (b != 0) {
                break;
            }
        }
        final Iterator<Job> iterator = this.jobs.iterator();
        while (iterator.hasNext()) {
            iterator.next().interrupt();
            if (b != 0) {
                break;
            }
        }
        try {
            if (Task.a != 0) {
                LoopTask.b = ++b;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
    }
    
    @Override
    public final boolean isTerminated() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        org/powerbot/core/script/job/TaskContainer.shutdown:Z
        //     8: iload_1        
        //     9: ifne            46
        //    12: ifne            38
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: getfield        org/powerbot/core/script/job/TaskContainer.interrupted:Z
        //    23: iload_1        
        //    24: ifne            46
        //    27: goto            31
        //    30: athrow         
        //    31: ifeq            61
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: invokevirtual   org/powerbot/core/script/job/TaskContainer.getActiveCount:()I
        //    42: goto            46
        //    45: athrow         
        //    46: iload_1        
        //    47: ifne            58
        //    50: ifne            61
        //    53: goto            57
        //    56: athrow         
        //    57: iconst_1       
        //    58: goto            62
        //    61: iconst_0       
        //    62: ireturn        
        //    StackMapTable: 00 0D FF 00 12 00 02 07 00 2F 01 00 01 07 01 01 00 4A 07 01 01 40 01 45 07 01 01 00 46 07 01 01 40 01 49 07 01 01 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  46     53     56     57     Ljava/lang/RuntimeException;
        //  31     42     45     46     Ljava/lang/RuntimeException;
        //  19     34     37     38     Ljava/lang/RuntimeException;
        //  12     27     30     31     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    public final void addListener(final JobListener e) {
        this.listeners.addIfAbsent(e);
    }
    
    @Override
    public final void removeListener(final JobListener o) {
        this.listeners.remove(o);
    }
    
    private Runnable createWorker(final Job job) {
        return new Runnable() {
            @Override
            public void run() {
                TaskContainer.this.jobs.add(job);
                TaskContainer.this.notifyListeners(job, true);
                try {
                    job.work();
                }
                catch (Exception ex) {}
                catch (Throwable t) {
                    t.printStackTrace();
                }
                TaskContainer.this.jobs.remove(job);
                TaskContainer.this.notifyListeners(job, false);
                job.setContainer(null);
            }
        };
    }
    
    private void notifyListeners(final Job p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: getfield        org/powerbot/core/script/job/TaskContainer.listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
        //     9: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.size:()I
        //    12: anewarray       Lorg/powerbot/core/script/job/JobListener;
        //    15: astore_3       
        //    16: aload_0        
        //    17: getfield        org/powerbot/core/script/job/TaskContainer.listeners:Ljava/util/concurrent/CopyOnWriteArrayList;
        //    20: aload_3        
        //    21: invokevirtual   java/util/concurrent/CopyOnWriteArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //    24: pop            
        //    25: aload_3        
        //    26: astore          4
        //    28: aload           4
        //    30: arraylength    
        //    31: istore          5
        //    33: iconst_0       
        //    34: istore          6
        //    36: iload           6
        //    38: iload           5
        //    40: if_icmpge       114
        //    43: aload           4
        //    45: iload           6
        //    47: aaload         
        //    48: astore          7
        //    50: iload           9
        //    52: ifne            143
        //    55: iload           9
        //    57: ifne            84
        //    60: goto            64
        //    63: athrow         
        //    64: iload_2        
        //    65: ifeq            89
        //    68: goto            72
        //    71: athrow         
        //    72: aload           7
        //    74: aload_1        
        //    75: invokeinterface org/powerbot/core/script/job/JobListener.jobStarted:(Lorg/powerbot/core/script/job/Job;)V
        //    80: goto            84
        //    83: athrow         
        //    84: iload           9
        //    86: ifeq            101
        //    89: aload           7
        //    91: aload_1        
        //    92: invokeinterface org/powerbot/core/script/job/JobListener.jobStopped:(Lorg/powerbot/core/script/job/Job;)V
        //    97: goto            101
        //   100: athrow         
        //   101: goto            106
        //   104: astore          8
        //   106: iinc            6, 1
        //   109: iload           9
        //   111: ifeq            36
        //   114: aload_0        
        //   115: getfield        org/powerbot/core/script/job/TaskContainer.parent_container:Lorg/powerbot/core/script/job/TaskContainer;
        //   118: iload           9
        //   120: ifne            138
        //   123: ifnull          143
        //   126: goto            130
        //   129: athrow         
        //   130: aload_0        
        //   131: getfield        org/powerbot/core/script/job/TaskContainer.parent_container:Lorg/powerbot/core/script/job/TaskContainer;
        //   134: goto            138
        //   137: athrow         
        //   138: aload_1        
        //   139: iload_2        
        //   140: invokespecial   org/powerbot/core/script/job/TaskContainer.notifyListeners:(Lorg/powerbot/core/script/job/Job;Z)V
        //   143: return         
        //    StackMapTable: 00 12 FF 00 24 00 0A 07 00 2F 07 00 2C 01 07 01 06 07 01 06 01 01 00 00 01 00 00 FF 00 1A 00 0A 07 00 2F 07 00 2C 01 07 01 06 07 01 06 01 01 07 00 41 00 01 00 01 07 00 45 00 46 07 00 45 00 4A 07 00 45 00 04 4A 07 00 45 00 42 07 00 45 01 FF 00 07 00 0A 07 00 2F 07 00 2C 01 07 01 06 07 01 06 01 01 00 00 01 00 00 4E 07 00 45 00 46 07 00 45 40 07 00 2F 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  84     97     100    101    Ljava/lang/Throwable;
        //  64     80     83     84     Ljava/lang/Throwable;
        //  55     68     71     72     Ljava/lang/Throwable;
        //  50     101    104    106    Ljava/lang/Throwable;
        //  123    134    137    138    Ljava/lang/Throwable;
        //  114    126    129    130    Ljava/lang/Throwable;
        //  50     60     63     64     Ljava/lang/Throwable;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0064:
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
    
    private final class ThreadPool implements ThreadFactory
    {
        private final ThreadGroup group;
        private final AtomicInteger worker;
        private static final String z;
        
        private ThreadPool(final ThreadGroup group) {
            this.group = group;
            this.worker = new AtomicInteger(1);
        }
        
        @Override
        public Thread newThread(final Runnable target) {
            final int b = LoopTask.b;
            final Thread thread = new Thread(this.group, target, this.group.getName() + o.a(ThreadPool.z) + this.worker.getAndIncrement());
            Thread thread2 = null;
            Label_0092: {
                int n = 0;
                Label_0080: {
                    Label_0071: {
                        boolean b2;
                        try {
                            b2 = ((n = (thread.isDaemon() ? 1 : 0)) != 0);
                            if (b != 0) {
                                break Label_0092;
                            }
                            if (!b2) {
                                break Label_0071;
                            }
                            break Label_0080;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (!b2) {
                                thread.setDaemon(false);
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        thread2 = thread;
                        if (b != 0) {
                            break Label_0092;
                        }
                        n = thread2.getPriority();
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (n != 5) {
                        thread.setPriority(5);
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            if (b != 0) {
                int a = Task.a;
                Task.a = ++a;
            }
            return thread2;
        }
        
        static {
            final char[] charArray = "Lq\u0016(jzgG".toCharArray();
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
                                c2 = 'L';
                                break;
                            }
                            case 1: {
                                c2 = 'U';
                                break;
                            }
                            case 2: {
                                c2 = '9';
                                break;
                            }
                            case 3: {
                                c2 = '\t';
                                break;
                            }
                            default: {
                                c2 = 'A';
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
}
