
package org.powerbot.game.api.wrappers.widget;

import org.powerbot.core.script.job.Task;
import java.util.Arrays;
import java.awt.Point;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.game.client.RSInterfaceBase;
import org.powerbot.game.client.RSInterface;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.wrappers.Identifiable;

public class Widget implements Identifiable
{
    private WidgetChild[] childCache;
    private final Object CACHE_LOCK;
    private final int index;
    
    public Widget(final int index) {
        this.childCache = new WidgetChild[0];
        this.CACHE_LOCK = new Object();
        this.index = index;
    }
    
    public boolean validate() {
        final boolean a = WidgetChild.a;
        Widget widget = null;
        Label_0025: {
            Label_0024: {
                try {
                    widget = this;
                    if (a) {
                        break Label_0025;
                    }
                    final RSInterface[] array = this.getChildrenInternal();
                    if (array == null) {
                        return false;
                    }
                    break Label_0024;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final RSInterface[] array = this.getChildrenInternal();
                    if (array == null) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            widget = this;
        }
        final int index = widget.getIndex();
        final RSInterfaceBase[] rsInterfaceCache = Context.client().getRSInterfaceCache();
        Label_0055: {
            int n;
            try {
                final int n2;
                n = (n2 = index);
                if (a) {
                    return n2 != 0;
                }
                final RSInterfaceBase[] array2 = rsInterfaceCache;
                final int n3 = array2.length;
                if (n < n3) {
                    break Label_0055;
                }
                return false;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            try {
                final RSInterfaceBase[] array2 = rsInterfaceCache;
                final int n3 = array2.length;
                if (n >= n3) {
                    return false;
                }
                if (rsInterfaceCache[index] == null) {
                    return false;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        final WidgetChild[] children = this.getChildren();
        int n4 = 0;
        final WidgetChild[] array3 = children;
        final int length = array3.length;
        int i = 0;
    Label_0152:
        while (true) {
            while (i < length) {
                final WidgetChild widgetChild = array3[i];
                Label_0133: {
                    Label_0130: {
                        Label_0120: {
                            try {
                                if (a) {
                                    break Label_0133;
                                }
                                final WidgetChild widgetChild2 = widgetChild;
                                final int n6;
                                final int n5 = n6 = widgetChild2.getBoundsArrayIndex();
                                final int n7;
                                final int length2 = n7 = -1;
                                final boolean b = a;
                                if (!b) {
                                    break Label_0120;
                                }
                                break Label_0152;
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                            try {
                                final WidgetChild widgetChild2 = widgetChild;
                                final int n6;
                                final int n5 = n6 = widgetChild2.getBoundsArrayIndex();
                                final int n7;
                                final int length2 = n7 = -1;
                                final boolean b = a;
                                if (b) {
                                    break Label_0152;
                                }
                                if (n6 != n7) {
                                    break Label_0130;
                                }
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        ++n4;
                    }
                    ++i;
                }
                if (a) {
                    break;
                }
                continue;
                int n5 = 0;
                int length2 = 0;
                int n8;
                if (n5 != length2) {
                    n8 = 1;
                }
                else {
                    n8 = 0;
                }
                return n8 != 0;
            }
            try {
                final int n5;
                final int n8 = n5 = n4;
                if (a) {
                    return n8 != 0;
                }
                final int length2 = children.length;
            }
            catch (RuntimeException ex7) {
                throw ex7;
            }
            continue Label_0152;
        }
        int n2 = 0;
        return n2 != 0;
    }
    
    public int getChildrenCount() {
        final RSInterface[] childrenInternal = this.getChildrenInternal();
        RSInterface[] array;
        try {
            array = childrenInternal;
            if (WidgetChild.a) {
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
    }
    
    public String getText() {
        final boolean a = WidgetChild.a;
        final StringBuilder sb = new StringBuilder();
        final RSInterface[] childrenInternal = this.getChildrenInternal();
        Label_0138: {
            StringBuilder sb2 = null;
            Label_0121: {
                RSInterface[] array = null;
                Label_0032: {
                    try {
                        array = childrenInternal;
                        if (a) {
                            break Label_0032;
                        }
                        if (array == null) {
                            break Label_0121;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                final RSInterface[] array2 = array;
                final int length = array2.length;
                int i = 0;
                while (i < length) {
                    final RSInterface rsInterface = array2[i];
                    Label_0116: {
                        Label_0113: {
                            Label_0067: {
                                try {
                                    if (a) {
                                        break Label_0138;
                                    }
                                    final boolean b = a;
                                    if (!b) {
                                        break Label_0067;
                                    }
                                    break Label_0116;
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                                try {
                                    final boolean b = a;
                                    if (b) {
                                        break Label_0116;
                                    }
                                    if (rsInterface == null) {
                                        break Label_0113;
                                    }
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                            }
                            final String text = rsInterface.getText();
                            try {
                                if (text != null) {
                                    sb.append(text);
                                    sb.append(org.powerbot.game.bot.handler.input.a.a("\u0010"));
                                }
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                        }
                        ++i;
                    }
                    if (a) {
                        break;
                    }
                }
                try {
                    final StringBuilder sb3;
                    sb2 = (sb3 = sb);
                    if (a) {
                        return sb3.toString();
                    }
                    final int n = sb2.length();
                    final int n2 = 1;
                    if (n > n2) {
                        break Label_0138;
                    }
                    break Label_0138;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            try {
                final int n = sb2.length();
                final int n2 = 1;
                if (n > n2) {
                    sb.setLength(sb.length() - 1);
                }
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
        }
        StringBuilder sb3 = sb;
        return sb3.toString();
    }
    
    public int getIndex() {
        return this.index;
    }
    
    @Override
    public int getId() {
        return this.index;
    }
    
    public Point getLocation() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_0        
        //    10: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildrenInternal:()[Lorg/powerbot/game/client/RSInterface;
        //    13: astore_2       
        //    14: aload_2        
        //    15: iload           9
        //    17: ifne            28
        //    20: ifnull          127
        //    23: goto            27
        //    26: athrow         
        //    27: aload_2        
        //    28: astore_3       
        //    29: aload_3        
        //    30: arraylength    
        //    31: istore          4
        //    33: iconst_0       
        //    34: istore          5
        //    36: iload           5
        //    38: iload           4
        //    40: if_icmpge       127
        //    43: aload_3        
        //    44: iload           5
        //    46: aaload         
        //    47: astore          6
        //    49: iload           9
        //    51: ifne            122
        //    54: aload           6
        //    56: ifnull          119
        //    59: goto            63
        //    62: athrow         
        //    63: aload           6
        //    65: checkcast       Lorg/powerbot/game/client/RSInterface;
        //    68: invokeinterface org/powerbot/game/client/RSInterface.getBoundsArrayIndex:()I
        //    73: istore          7
        //    75: aload_1        
        //    76: invokeinterface org/powerbot/game/client/Client.getRSInterfaceBoundsArray:()[Ljava/awt/Rectangle;
        //    81: astore          8
        //    83: iload           9
        //    85: ifne            122
        //    88: iload           7
        //    90: ifle            119
        //    93: goto            97
        //    96: athrow         
        //    97: iload           7
        //    99: aload           8
        //   101: arraylength    
        //   102: if_icmpge       119
        //   105: goto            109
        //   108: athrow         
        //   109: aload           8
        //   111: iload           7
        //   113: aaload         
        //   114: invokevirtual   java/awt/Rectangle.getLocation:()Ljava/awt/Point;
        //   117: areturn        
        //   118: athrow         
        //   119: iinc            5, 1
        //   122: iload           9
        //   124: ifeq            36
        //   127: new             Ljava/awt/Point;
        //   130: dup            
        //   131: iconst_m1      
        //   132: iconst_m1      
        //   133: invokespecial   java/awt/Point.<init>:(II)V
        //   136: areturn        
        //    StackMapTable: 00 0E FF 00 1A 00 0A 07 00 20 07 00 4A 07 00 96 00 00 00 00 00 00 01 00 01 07 00 91 00 40 07 00 96 FF 00 07 00 0A 07 00 20 07 00 4A 07 00 96 07 00 96 01 01 00 00 00 01 00 00 FF 00 19 00 0A 07 00 20 07 00 4A 07 00 96 07 00 96 01 01 07 00 0F 00 00 01 00 01 07 00 91 00 FF 00 20 00 0A 07 00 20 07 00 4A 07 00 96 07 00 96 01 01 07 00 0F 01 07 00 9A 01 00 01 07 00 91 00 4A 07 00 91 00 48 07 00 91 FF 00 00 00 0A 07 00 20 07 00 4A 07 00 96 07 00 96 01 01 07 00 0F 00 00 01 00 00 02 FF 00 04 00 0A 07 00 20 07 00 4A 07 00 96 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  97     118    118    119    Ljava/lang/RuntimeException;
        //  88     105    108    109    Ljava/lang/RuntimeException;
        //  83     93     96     97     Ljava/lang/RuntimeException;
        //  49     59     62     63     Ljava/lang/RuntimeException;
        //  14     23     26     27     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0097:
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
    
    public WidgetChild[] getChildren() {
        final boolean a = WidgetChild.a;
        synchronized (this.CACHE_LOCK) {
            final RSInterface[] childrenInternal = this.getChildrenInternal();
            WidgetChild[] childCache = null;
            Label_0135: {
                Label_0047: {
                    Object[] clone = null;
                    Label_0030: {
                        RSInterface[] array;
                        try {
                            array = (RSInterface[])(clone = childrenInternal);
                            if (a) {
                                return (WidgetChild[])clone;
                            }
                            if (array == null) {
                                break Label_0030;
                            }
                            break Label_0047;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (array != null) {
                                break Label_0047;
                            }
                            clone = this.childCache.clone();
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    return (WidgetChild[])clone;
                    try {
                        childCache = this.childCache;
                        if (a) {
                            return childCache;
                        }
                        if (childCache.length >= childrenInternal.length) {
                            break Label_0135;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                final int length = this.childCache.length;
                this.childCache = Arrays.copyOf(this.childCache, childrenInternal.length);
                int i = length;
                while (i < this.childCache.length) {
                    try {
                        final WidgetChild[] childCache2 = this.childCache;
                        if (a) {
                            return childCache;
                        }
                        childCache2[i] = new WidgetChild(this, i);
                        ++i;
                        if (!a) {
                            continue;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    break;
                }
            }
            final WidgetChild[] array2 = this.childCache.clone();
            return childCache;
        }
    }
    
    public WidgetChild getChild(final int n) {
        final boolean a = WidgetChild.a;
        synchronized (this.CACHE_LOCK) {
            final RSInterface[] childrenInternal = this.getChildrenInternal();
            int length = 0;
            Label_0036: {
                Label_0035: {
                    RSInterface[] array = null;
                    Label_0031: {
                        try {
                            array = childrenInternal;
                            if (a) {
                                break Label_0031;
                            }
                            if (array == null) {
                                break Label_0035;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                    }
                    length = array.length;
                    break Label_0036;
                }
                length = 0;
            }
            final int max = Math.max(length, n + 1);
            WidgetChild[] childCache = null;
            int n2 = 0;
            Label_0148: {
                Label_0144: {
                    try {
                        childCache = this.childCache;
                        if (a) {
                            break Label_0148;
                        }
                        if (childCache.length >= max) {
                            break Label_0144;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    final int length2 = this.childCache.length;
                    this.childCache = Arrays.copyOf(this.childCache, max);
                    int i = length2;
                    while (i < max) {
                        try {
                            final WidgetChild[] childCache2 = this.childCache;
                            n2 = i;
                            if (a) {
                                return childCache[n2];
                            }
                            childCache2[n2] = new WidgetChild(this, i);
                            ++i;
                            if (!a) {
                                continue;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        int a2 = Task.a;
                        Task.a = ++a2;
                        break;
                    }
                }
                final WidgetChild[] childCache3 = this.childCache;
            }
            return childCache[n2];
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean a = WidgetChild.a;
        boolean b = false;
        Label_0069: {
            Label_0021: {
                Label_0020: {
                    try {
                        final Object o2 = o;
                        if (a) {
                            break Label_0021;
                        }
                        final Widget widget = this;
                        if (o == widget) {
                            return true;
                        }
                        break Label_0020;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Widget widget = this;
                        if (o == widget) {
                            return true;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final Object o2 = o;
                try {
                    b = (o2 instanceof Widget);
                    if (a) {
                        return b;
                    }
                    if (!b) {
                        break Label_0069;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            final Widget widget2 = (Widget)o;
            int index = 0;
            Label_0059: {
                int n;
                try {
                    n = (index = widget2.index);
                    if (a) {
                        return index != 0;
                    }
                    final Widget widget3 = this;
                    final int n2 = widget3.index;
                    if (n == n2) {
                        break Label_0059;
                    }
                    return false;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
                try {
                    final Widget widget3 = this;
                    final int n2 = widget3.index;
                    if (n != n2) {
                        return false;
                    }
                    index = (true ? 1 : 0);
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            return index != 0;
            index = (false ? 1 : 0);
            return index != 0;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.getIndex();
    }
    
    RSInterface[] getChildrenInternal() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
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
        //    33: ifnull          92
        //    36: aload_0        
        //    37: getfield        org/powerbot/game/api/wrappers/widget/Widget.index:I
        //    40: aload_2        
        //    41: arraylength    
        //    42: if_icmpge       92
        //    45: goto            49
        //    48: athrow         
        //    49: aload_2        
        //    50: aload_0        
        //    51: getfield        org/powerbot/game/api/wrappers/widget/Widget.index:I
        //    54: aaload         
        //    55: iload           4
        //    57: ifne            84
        //    60: goto            64
        //    63: athrow         
        //    64: ifnull          92
        //    67: goto            71
        //    70: athrow         
        //    71: aload_2        
        //    72: aload_0        
        //    73: getfield        org/powerbot/game/api/wrappers/widget/Widget.index:I
        //    76: aaload         
        //    77: checkcast       Lorg/powerbot/game/client/RSInterfaceBase;
        //    80: goto            84
        //    83: athrow         
        //    84: astore_3       
        //    85: aload_3        
        //    86: invokeinterface org/powerbot/game/client/RSInterfaceBase.getComponents:()[Lorg/powerbot/game/client/RSInterface;
        //    91: areturn        
        //    92: aconst_null    
        //    93: areturn        
        //    StackMapTable: 00 0E FF 00 15 00 05 07 00 20 07 00 4A 00 00 01 00 01 07 00 91 00 41 07 00 91 00 40 07 00 4A FF 00 15 00 05 07 00 20 07 00 4A 07 00 94 00 01 00 01 07 00 91 00 4D 07 00 91 40 07 00 21 45 07 00 91 00 4B 07 00 91 40 07 00 21 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  64     80     83     84     Ljava/lang/RuntimeException;
        //  49     67     70     71     Ljava/lang/RuntimeException;
        //  36     60     63     64     Ljava/lang/RuntimeException;
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
}
