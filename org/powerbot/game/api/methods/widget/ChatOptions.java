
package org.powerbot.game.api.methods.widget;

import org.powerbot.game.api.util.Filter;
import java.util.Iterator;
import java.util.LinkedList;
import org.powerbot.game.api.wrappers.widget.ChatOption;
import java.util.List;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.Widget;

public class ChatOptions
{
    private static final int WIDGET_CHAT = 1188;
    private static final int[][] OPTION_ARRAY;
    
    public static Widget getWidget() {
        return Widgets.get(1188);
    }
    
    public static List<ChatOption> getOptions() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: invokestatic    org/powerbot/game/api/methods/widget/ChatOptions.getWidget:()Lorg/powerbot/game/api/wrappers/widget/Widget;
        //     8: astore_0       
        //     9: new             Ljava/util/LinkedList;
        //    12: dup            
        //    13: invokespecial   java/util/LinkedList.<init>:()V
        //    16: astore_1       
        //    17: aload_0        
        //    18: ifnull          210
        //    21: iconst_1       
        //    22: istore_2       
        //    23: iload_2        
        //    24: bipush          6
        //    26: if_icmpge       210
        //    29: getstatic       org/powerbot/game/api/methods/widget/ChatOptions.OPTION_ARRAY:[[I
        //    32: iload_2        
        //    33: iconst_1       
        //    34: isub           
        //    35: aaload         
        //    36: astore_3       
        //    37: aload_0        
        //    38: aload_3        
        //    39: iconst_0       
        //    40: iaload         
        //    41: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    44: astore          4
        //    46: aload_0        
        //    47: aload_3        
        //    48: iconst_1       
        //    49: iaload         
        //    50: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    53: astore          5
        //    55: aload           4
        //    57: iload           7
        //    59: ifne            71
        //    62: ifnull          210
        //    65: goto            69
        //    68: athrow         
        //    69: aload           5
        //    71: iload           7
        //    73: ifne            85
        //    76: ifnull          210
        //    79: goto            83
        //    82: athrow         
        //    83: aload           4
        //    85: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //    88: iload           7
        //    90: ifne            118
        //    93: ifeq            210
        //    96: goto            100
        //    99: athrow         
        //   100: aload           5
        //   102: iload           7
        //   104: ifne            123
        //   107: goto            111
        //   110: athrow         
        //   111: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.validate:()Z
        //   114: goto            118
        //   117: athrow         
        //   118: ifeq            210
        //   121: aload           5
        //   123: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getText:()Ljava/lang/String;
        //   126: astore          6
        //   128: aload           6
        //   130: iload           7
        //   132: ifne            144
        //   135: ifnull          189
        //   138: goto            142
        //   141: athrow         
        //   142: aload           6
        //   144: iload_2        
        //   145: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   148: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   151: iload           7
        //   153: ifne            183
        //   156: ifeq            189
        //   159: goto            163
        //   162: athrow         
        //   163: aload_1        
        //   164: new             Lorg/powerbot/game/api/wrappers/widget/ChatOption;
        //   167: dup            
        //   168: iload_2        
        //   169: aload           4
        //   171: invokespecial   org/powerbot/game/api/wrappers/widget/ChatOption.<init>:(ILorg/powerbot/game/api/wrappers/widget/WidgetChild;)V
        //   174: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   179: goto            183
        //   182: athrow         
        //   183: pop            
        //   184: iload           7
        //   186: ifeq            198
        //   189: iload           7
        //   191: ifeq            210
        //   194: goto            198
        //   197: athrow         
        //   198: iinc            2, 1
        //   201: iload           7
        //   203: ifeq            23
        //   206: goto            210
        //   209: athrow         
        //   210: aload_1        
        //   211: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lorg/powerbot/game/api/wrappers/widget/ChatOption;>;
        //    StackMapTable: 00 1A FF 00 17 00 08 07 00 42 07 00 04 01 00 00 00 00 01 00 00 FF 00 2C 00 08 07 00 42 07 00 04 01 07 00 1D 07 00 44 07 00 44 00 01 00 01 07 00 8C 00 41 07 00 44 4A 07 00 8C 00 41 07 00 44 4D 07 00 8C 00 49 07 00 8C 40 07 00 44 45 07 00 8C 40 01 44 07 00 44 FF 00 11 00 08 07 00 42 07 00 04 01 07 00 1D 07 00 44 07 00 44 07 00 49 01 00 01 07 00 8C 00 41 07 00 49 51 07 00 8C 00 52 07 00 8C 40 01 05 47 07 00 8C 00 4A 07 00 8C FF 00 00 00 08 07 00 42 07 00 04 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  189    206    209    210    Ljava/lang/RuntimeException;
        //  183    194    197    198    Ljava/lang/RuntimeException;
        //  156    179    182    183    Ljava/lang/RuntimeException;
        //  144    159    162    163    Ljava/lang/RuntimeException;
        //  128    138    141    142    Ljava/lang/RuntimeException;
        //  100    114    117    118    Ljava/lang/RuntimeException;
        //  93     107    110    111    Ljava/lang/RuntimeException;
        //  85     96     99     100    Ljava/lang/RuntimeException;
        //  71     79     82     83     Ljava/lang/RuntimeException;
        //  55     65     68     69     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    public static List<ChatOption> getOptions(final String s) {
        final int a = Bank.a;
        final LinkedList<ChatOption> list = new LinkedList<ChatOption>();
        for (final ChatOption chatOption : getOptions()) {
            Label_0070: {
                boolean contains;
                try {
                    contains = chatOption.getWidgetChild().getText().toLowerCase().contains(s.toLowerCase());
                    if (a != 0) {
                        break Label_0070;
                    }
                    if (contains) {
                        break Label_0070;
                    }
                    break Label_0070;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (contains) {
                        list.add(chatOption);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (a != 0) {
                break;
            }
        }
        return list;
    }
    
    public static List<ChatOption> getOptions(final Filter<ChatOption> filter) {
        final int a = Bank.a;
        final LinkedList<ChatOption> list = new LinkedList<ChatOption>();
        for (final ChatOption chatOption : getOptions()) {
            Label_0060: {
                boolean accept;
                try {
                    accept = filter.accept(chatOption);
                    if (a != 0) {
                        break Label_0060;
                    }
                    if (accept) {
                        break Label_0060;
                    }
                    break Label_0060;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (accept) {
                        list.add(chatOption);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (a != 0) {
                break;
            }
        }
        return list;
    }
    
    public static ChatOption getOption(final String s) {
        final List<ChatOption> options = getOptions(s);
        Label_0024: {
            List<ChatOption> list;
            try {
                final Object value;
                list = (List<ChatOption>)(value = options);
                if (Bank.a != 0) {
                    return (ChatOption)value;
                }
                final boolean b = list.isEmpty();
                if (b) {
                    break Label_0024;
                }
                break Label_0024;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = list.isEmpty();
                if (b) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        Object value = options.get(0);
        return (ChatOption)value;
    }
    
    public static ChatOption getOption(final Filter<ChatOption> filter) {
        final List<ChatOption> options = getOptions(filter);
        Label_0024: {
            List<ChatOption> list;
            try {
                final Object value;
                list = (List<ChatOption>)(value = options);
                if (Bank.a != 0) {
                    return (ChatOption)value;
                }
                final boolean b = list.isEmpty();
                if (b) {
                    break Label_0024;
                }
                break Label_0024;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = list.isEmpty();
                if (b) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        Object value = options.get(0);
        return (ChatOption)value;
    }
    
    public static boolean canContinue() {
        return Widgets.canContinue();
    }
    
    public static ChatOption getContinueOption() {
        return new ChatOption(-1, Widgets.getContinue());
    }
    
    static {
        OPTION_ARRAY = new int[][] { { 3, 12 }, { 24, 25 }, { 29, 30 }, { 34, 35 }, { 39, 40 } };
    }
}
