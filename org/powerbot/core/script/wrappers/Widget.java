
package org.powerbot.core.script.wrappers;

import java.util.Iterator;
import java.util.Arrays;
import org.powerbot.game.client.RSInterface;

public class Widget implements Iterable<Component>
{
    private final int index;
    private final Object LOCK;
    private Component[] cache;
    
    public Widget(final int index) {
        this.index = index;
        this.LOCK = new Object();
        this.cache = new Component[0];
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getComponentCount() {
        final RSInterface[] internalComponents = this.getInternalComponents();
        RSInterface[] array;
        try {
            array = internalComponents;
            if (Component.a != 0) {
                return array.length;
            }
            if (array == null) {
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return array.length;
        length = 0;
        return length;
    }
    
    public Component[] getComponents() {
        final int a = Component.a;
        synchronized (this.LOCK) {
            final RSInterface[] internalComponents = this.getInternalComponents();
            if (internalComponents == null) {
                return this.cache;
            }
            Component[] cache = null;
            Label_0113: {
                try {
                    cache = this.cache;
                    if (a != 0) {
                        return cache;
                    }
                    if (cache.length >= internalComponents.length) {
                        break Label_0113;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final int length = this.cache.length;
                this.cache = Arrays.copyOf(this.cache, internalComponents.length);
                int i = length;
                while (i < internalComponents.length) {
                    try {
                        final Component[] cache2 = this.cache;
                        if (a != 0) {
                            return cache;
                        }
                        cache2[i] = new Component(this, i);
                        ++i;
                        if (a == 0) {
                            continue;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    break;
                }
            }
            final Component[] array = this.cache.clone();
            return cache;
        }
    }
    
    public Component getComponent(final int n) {
        final int a = Component.a;
        synchronized (this.LOCK) {
            if (n < this.cache.length) {
                return this.cache[n];
            }
            final RSInterface[] internalComponents = this.getInternalComponents();
            int length = 0;
            Label_0054: {
                Label_0053: {
                    RSInterface[] array = null;
                    Label_0049: {
                        try {
                            array = internalComponents;
                            if (a != 0) {
                                break Label_0049;
                            }
                            if (array == null) {
                                break Label_0053;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                    }
                    length = array.length;
                    break Label_0054;
                }
                length = 0;
            }
            final int max = Math.max(length, n + 1);
            Component[] cache = null;
            int n2 = 0;
            Label_0153: {
                Label_0149: {
                    try {
                        cache = this.cache;
                        if (a != 0) {
                            break Label_0153;
                        }
                        if (cache.length >= max) {
                            break Label_0149;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    final int length2 = this.cache.length;
                    this.cache = Arrays.copyOf(this.cache, max);
                    int i = length2;
                    while (i < max) {
                        try {
                            final Component[] cache2 = this.cache;
                            n2 = i;
                            if (a != 0) {
                                return cache[n2];
                            }
                            cache2[n2] = new Component(this, i);
                            ++i;
                            if (a == 0) {
                                continue;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        break;
                    }
                }
                final Component[] cache3 = this.cache;
            }
            return cache[n2];
        }
    }
    
    public boolean isValid() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //     7: astore_1       
        //     8: aload_1        
        //     9: iload_3        
        //    10: ifne            24
        //    13: ifnonnull       23
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_0       
        //    21: ireturn        
        //    22: athrow         
        //    23: aload_1        
        //    24: invokeinterface org/powerbot/game/client/Client.getRSInterfaceCache:()[Lorg/powerbot/game/client/RSInterfaceBase;
        //    29: astore_2       
        //    30: aload_2        
        //    31: ifnull          91
        //    34: aload_0        
        //    35: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    38: aload_2        
        //    39: arraylength    
        //    40: if_icmpge       91
        //    43: goto            47
        //    46: athrow         
        //    47: aload_2        
        //    48: aload_0        
        //    49: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    52: aaload         
        //    53: iload_3        
        //    54: ifne            78
        //    57: goto            61
        //    60: athrow         
        //    61: ifnull          91
        //    64: goto            68
        //    67: athrow         
        //    68: aload_2        
        //    69: aload_0        
        //    70: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    73: aaload         
        //    74: goto            78
        //    77: athrow         
        //    78: invokeinterface org/powerbot/game/client/RSInterfaceBase.getComponents:()[Lorg/powerbot/game/client/RSInterface;
        //    83: ifnull          91
        //    86: iconst_1       
        //    87: goto            92
        //    90: athrow         
        //    91: iconst_0       
        //    92: ireturn        
        //    StackMapTable: 00 10 FF 00 13 00 04 07 00 12 07 00 3F 00 01 00 01 07 00 5D 00 41 07 00 5D 00 40 07 00 3F FF 00 15 00 04 07 00 12 07 00 3F 07 00 64 01 00 01 07 00 5D 00 4C 07 00 5D 40 07 00 41 45 07 00 5D 00 48 07 00 5D 40 07 00 41 4B 07 00 5D 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  78     90     90     91     Ljava/lang/RuntimeException;
        //  61     74     77     78     Ljava/lang/RuntimeException;
        //  47     64     67     68     Ljava/lang/RuntimeException;
        //  34     57     60     61     Ljava/lang/RuntimeException;
        //  30     43     46     47     Ljava/lang/RuntimeException;
        //  13     22     22     23     Ljava/lang/RuntimeException;
        //  8      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0047:
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
    
    RSInterface[] getInternalComponents() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_1        
        //    10: iload           4
        //    12: ifne            26
        //    15: ifnonnull       25
        //    18: goto            22
        //    21: athrow         
        //    22: aconst_null    
        //    23: areturn        
        //    24: athrow         
        //    25: aload_1        
        //    26: invokeinterface org/powerbot/game/client/Client.getRSInterfaceCache:()[Lorg/powerbot/game/client/RSInterfaceBase;
        //    31: astore_2       
        //    32: aload_2        
        //    33: ifnull          83
        //    36: aload_0        
        //    37: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    40: iload           4
        //    42: ifne            64
        //    45: goto            49
        //    48: athrow         
        //    49: iflt            83
        //    52: goto            56
        //    55: athrow         
        //    56: aload_0        
        //    57: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    60: goto            64
        //    63: athrow         
        //    64: aload_2        
        //    65: arraylength    
        //    66: if_icmpge       83
        //    69: aload_2        
        //    70: aload_0        
        //    71: getfield        org/powerbot/core/script/wrappers/Widget.index:I
        //    74: aaload         
        //    75: astore_3       
        //    76: aload_3        
        //    77: invokeinterface org/powerbot/game/client/RSInterfaceBase.getComponents:()[Lorg/powerbot/game/client/RSInterface;
        //    82: areturn        
        //    83: aconst_null    
        //    84: areturn        
        //    StackMapTable: 00 0C FF 00 15 00 05 07 00 12 07 00 3F 00 00 01 00 01 07 00 5D 00 41 07 00 5D 00 40 07 00 3F FF 00 15 00 05 07 00 12 07 00 3F 07 00 64 00 01 00 01 07 00 5D 40 01 45 07 00 5D 00 46 07 00 5D 40 01 12
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  49     60     63     64     Ljava/lang/RuntimeException;
        //  36     52     55     56     Ljava/lang/RuntimeException;
        //  32     45     48     49     Ljava/lang/RuntimeException;
        //  15     24     24     25     Ljava/lang/RuntimeException;
        //  9      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0049:
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
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            private int nextId = 0;
            
            @Override
            public boolean hasNext() {
                final int a = Component.a;
                final int componentCount = Widget.this.getComponentCount();
                Label_0039: {
                    int nextId = 0;
                    int valid = 0;
                    Label_0028: {
                        int n;
                        try {
                            n = (valid = (nextId = this.nextId));
                            if (a != 0) {
                                break Label_0039;
                            }
                            final int n2 = componentCount;
                            if (n < n2) {
                                break Label_0028;
                            }
                            return false;
                        }
                        catch (UnsupportedOperationException ex) {
                            throw ex;
                        }
                        try {
                            final int n2 = componentCount;
                            if (n >= n2) {
                                return false;
                            }
                            nextId = (valid = (Widget.this.isValid() ? 1 : 0));
                        }
                        catch (UnsupportedOperationException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (a != 0) {
                            return nextId != 0;
                        }
                        if (valid == 0) {
                            return false;
                        }
                    }
                    catch (UnsupportedOperationException ex3) {
                        throw ex3;
                    }
                }
                int nextId = 1;
                return nextId != 0;
                nextId = 0;
                return nextId != 0;
            }
            
            @Override
            public Component next() {
                return Widget.this.getComponent(this.nextId++);
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }
}
