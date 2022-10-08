
package org.powerbot.game.api.methods.node;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.client.Client;
import org.powerbot.game.bot.Context;
import java.awt.Point;
import java.util.regex.Pattern;

public class Menu
{
    private static final Pattern HTML_TAG;
    public static int a;
    private static final String[] z;
    
    public static Point getLocation() {
        final Client client = Context.client();
        return new Point(client.getMenuX(), client.getMenuY());
    }
    
    public static Point getSubLocation() {
        final Client client = Context.client();
        return new Point(client.getSubMenuX(), client.getSubMenuY());
    }
    
    public static int getWidth() {
        return Context.client().getMenuWidth();
    }
    
    public static int getHeight() {
        return Context.client().getMenuHeight();
    }
    
    public static int getSubWidth() {
        return Context.client().getSubMenuWidth();
    }
    
    public static boolean isOpen() {
        return Context.client().isMenuOpen();
    }
    
    public static boolean isCollapsed() {
        return Context.client().isMenuCollapsed();
    }
    
    public static boolean select(final String s) {
        return select(s, null);
    }
    
    public static boolean select(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: aload_1        
        //     7: invokestatic    org/powerbot/game/api/methods/node/Menu.getIndex:(Ljava/lang/String;Ljava/lang/String;)I
        //    10: istore_2       
        //    11: invokestatic    org/powerbot/game/api/methods/node/Menu.isOpen:()Z
        //    14: iload           4
        //    16: ifne            175
        //    19: ifne            174
        //    22: goto            26
        //    25: athrow         
        //    26: iload_2        
        //    27: iload           4
        //    29: ifne            48
        //    32: goto            36
        //    35: athrow         
        //    36: iconst_m1      
        //    37: if_icmpne       47
        //    40: goto            44
        //    43: athrow         
        //    44: iconst_0       
        //    45: ireturn        
        //    46: athrow         
        //    47: iload_2        
        //    48: iload           4
        //    50: ifne            72
        //    53: ifne            68
        //    56: goto            60
        //    59: athrow         
        //    60: iconst_1       
        //    61: invokestatic    org/powerbot/game/api/methods/input/Mouse.click:(Z)Z
        //    64: pop            
        //    65: iconst_1       
        //    66: ireturn        
        //    67: athrow         
        //    68: iconst_0       
        //    69: invokestatic    org/powerbot/game/api/methods/input/Mouse.click:(Z)Z
        //    72: pop            
        //    73: new             Lorg/powerbot/game/api/util/Timer;
        //    76: dup            
        //    77: ldc2_w          100
        //    80: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    83: astore_3       
        //    84: aload_3        
        //    85: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    88: ifeq            128
        //    91: invokestatic    org/powerbot/game/api/methods/node/Menu.isOpen:()Z
        //    94: iload           4
        //    96: ifne            135
        //    99: iload           4
        //   101: ifne            135
        //   104: goto            108
        //   107: athrow         
        //   108: ifne            128
        //   111: goto            115
        //   114: athrow         
        //   115: iconst_5       
        //   116: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   119: iload           4
        //   121: ifeq            84
        //   124: goto            128
        //   127: athrow         
        //   128: aload_0        
        //   129: aload_1        
        //   130: invokestatic    org/powerbot/game/api/methods/node/Menu.getIndex:(Ljava/lang/String;Ljava/lang/String;)I
        //   133: istore_2       
        //   134: iload_2        
        //   135: iload           4
        //   137: ifne            156
        //   140: iconst_m1      
        //   141: if_icmpeq       172
        //   144: goto            148
        //   147: athrow         
        //   148: iload_2        
        //   149: invokestatic    org/powerbot/game/api/methods/node/Menu.clickIndex:(I)Z
        //   152: goto            156
        //   155: athrow         
        //   156: iload           4
        //   158: ifne            169
        //   161: ifeq            172
        //   164: goto            168
        //   167: athrow         
        //   168: iconst_1       
        //   169: goto            173
        //   172: iconst_0       
        //   173: ireturn        
        //   174: iload_2        
        //   175: iload           4
        //   177: ifne            235
        //   180: iconst_m1      
        //   181: if_icmpne       231
        //   184: goto            188
        //   187: athrow         
        //   188: invokestatic    org/powerbot/game/api/methods/node/Menu.isOpen:()Z
        //   191: ifeq            229
        //   194: goto            198
        //   197: athrow         
        //   198: iconst_0       
        //   199: iconst_0       
        //   200: invokestatic    org/powerbot/game/api/methods/input/Mouse.move:(II)Z
        //   203: pop            
        //   204: bipush          100
        //   206: sipush          500
        //   209: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   212: iload           4
        //   214: ifne            230
        //   217: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   220: iload           4
        //   222: ifeq            188
        //   225: goto            229
        //   228: athrow         
        //   229: iconst_0       
        //   230: ireturn        
        //   231: iload_2        
        //   232: invokestatic    org/powerbot/game/api/methods/node/Menu.clickIndex:(I)Z
        //   235: ireturn        
        //    StackMapTable: 00 2A FF 00 19 00 05 07 00 33 07 00 33 01 00 01 00 01 07 00 45 00 48 07 00 45 40 01 46 07 00 45 00 41 07 00 45 00 40 01 4A 07 00 45 00 46 07 00 45 00 43 01 FF 00 0B 00 05 07 00 33 07 00 33 01 07 00 12 01 00 00 56 07 00 45 40 01 45 07 00 45 00 4B 07 00 45 00 46 01 4B 07 00 45 00 46 07 00 45 40 01 4A 07 00 45 00 40 01 02 40 01 FF 00 00 00 05 07 00 33 07 00 33 01 00 01 00 00 40 01 4B 07 00 45 00 48 07 00 45 00 5D 07 00 45 00 40 01 00 43 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  198    225    228    229    Ljava/lang/NullPointerException;
        //  180    194    197    198    Ljava/lang/NullPointerException;
        //  175    184    187    188    Ljava/lang/NullPointerException;
        //  156    164    167    168    Ljava/lang/NullPointerException;
        //  140    152    155    156    Ljava/lang/NullPointerException;
        //  135    144    147    148    Ljava/lang/NullPointerException;
        //  108    124    127    128    Ljava/lang/NullPointerException;
        //  99     111    114    115    Ljava/lang/NullPointerException;
        //  91     104    107    108    Ljava/lang/NullPointerException;
        //  53     67     67     68     Ljava/lang/NullPointerException;
        //  48     56     59     60     Ljava/lang/NullPointerException;
        //  36     46     46     47     Ljava/lang/NullPointerException;
        //  26     40     43     44     Ljava/lang/NullPointerException;
        //  19     32     35     36     Ljava/lang/NullPointerException;
        //  11     22     25     26     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public static boolean clickIndex(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/game/api/methods/node/Menu.isOpen:()Z
        //     8: iload           9
        //    10: ifne            21
        //    13: ifne            22
        //    16: goto            20
        //    19: athrow         
        //    20: iconst_0       
        //    21: ireturn        
        //    22: invokestatic    org/powerbot/game/api/methods/node/Menu.getItems:()[Ljava/lang/String;
        //    25: astore_1       
        //    26: aload_1        
        //    27: arraylength    
        //    28: iload           9
        //    30: ifne            47
        //    33: iload_0        
        //    34: if_icmpgt       44
        //    37: goto            41
        //    40: athrow         
        //    41: iconst_0       
        //    42: ireturn        
        //    43: athrow         
        //    44: invokestatic    org/powerbot/game/api/methods/node/Menu.isCollapsed:()Z
        //    47: iload           9
        //    49: ifne            241
        //    52: ifeq            236
        //    55: goto            59
        //    58: athrow         
        //    59: new             Lorg/powerbot/game/api/util/node/Queue;
        //    62: dup            
        //    63: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //    66: invokeinterface org/powerbot/game/client/Client.getCollapsedMenuItems:()Lorg/powerbot/game/client/NodeSubQueue;
        //    71: invokespecial   org/powerbot/game/api/util/node/Queue.<init>:(Lorg/powerbot/game/client/NodeSubQueue;)V
        //    74: astore_2       
        //    75: iconst_0       
        //    76: istore_3       
        //    77: iconst_0       
        //    78: istore          4
        //    80: aload_2        
        //    81: invokevirtual   org/powerbot/game/api/util/node/Queue.getHead:()Lorg/powerbot/game/client/NodeSub;
        //    84: checkcast       Lorg/powerbot/game/client/MenuGroupNode;
        //    87: astore          5
        //    89: aload           5
        //    91: ifnull          234
        //    94: new             Lorg/powerbot/game/api/util/node/Queue;
        //    97: dup            
        //    98: aload           5
        //   100: invokeinterface org/powerbot/game/client/MenuGroupNode.getItems:()Lorg/powerbot/game/client/NodeSubQueue;
        //   105: invokespecial   org/powerbot/game/api/util/node/Queue.<init>:(Lorg/powerbot/game/client/NodeSubQueue;)V
        //   108: astore          6
        //   110: iconst_0       
        //   111: iload           9
        //   113: ifne            235
        //   116: istore          7
        //   118: aload           6
        //   120: invokevirtual   org/powerbot/game/api/util/node/Queue.getHead:()Lorg/powerbot/game/client/NodeSub;
        //   123: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //   126: astore          8
        //   128: aload           8
        //   130: ifnull          217
        //   133: iload_3        
        //   134: iinc            3, 1
        //   137: iload           9
        //   139: ifne            235
        //   142: iload           9
        //   144: ifne            165
        //   147: goto            151
        //   150: athrow         
        //   151: iload_0        
        //   152: if_icmpne       199
        //   155: goto            159
        //   158: athrow         
        //   159: iload           7
        //   161: goto            165
        //   164: athrow         
        //   165: iload           9
        //   167: ifne            187
        //   170: ifne            190
        //   173: goto            177
        //   176: athrow         
        //   177: aload_1        
        //   178: iload           4
        //   180: invokestatic    org/powerbot/game/api/methods/node/Menu.clickMain:([Ljava/lang/String;I)Z
        //   183: goto            187
        //   186: athrow         
        //   187: goto            198
        //   190: aload_1        
        //   191: iload           4
        //   193: iload           7
        //   195: invokestatic    org/powerbot/game/api/methods/node/Menu.clickSub:([Ljava/lang/String;II)Z
        //   198: ireturn        
        //   199: aload           6
        //   201: invokevirtual   org/powerbot/game/api/util/node/Queue.getNext:()Lorg/powerbot/game/client/NodeSub;
        //   204: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //   207: astore          8
        //   209: iinc            7, 1
        //   212: iload           9
        //   214: ifeq            128
        //   217: aload_2        
        //   218: invokevirtual   org/powerbot/game/api/util/node/Queue.getNext:()Lorg/powerbot/game/client/NodeSub;
        //   221: checkcast       Lorg/powerbot/game/client/MenuGroupNode;
        //   224: astore          5
        //   226: iinc            4, 1
        //   229: iload           9
        //   231: ifeq            89
        //   234: iconst_0       
        //   235: ireturn        
        //   236: aload_1        
        //   237: iload_0        
        //   238: invokestatic    org/powerbot/game/api/methods/node/Menu.clickMain:([Ljava/lang/String;I)Z
        //   241: ireturn        
        //    StackMapTable: 00 1F FF 00 13 00 0A 01 00 00 00 00 00 00 00 00 01 00 01 07 00 45 00 40 01 00 FF 00 11 00 0A 01 07 00 35 00 00 00 00 00 00 00 01 00 01 07 00 45 00 41 07 00 45 00 42 01 4A 07 00 45 00 FF 00 1D 00 0A 01 07 00 35 07 00 1D 01 01 07 00 21 00 00 00 01 00 00 FF 00 26 00 0A 01 07 00 35 07 00 1D 01 01 07 00 21 07 00 1D 01 07 00 23 01 00 00 55 07 00 45 40 01 46 07 00 45 00 44 07 00 45 40 01 4A 07 00 45 00 48 07 00 45 40 01 02 47 01 00 11 FF 00 10 00 0A 01 07 00 35 07 00 1D 01 01 07 00 21 00 00 00 01 00 00 40 01 FF 00 00 00 0A 01 07 00 35 00 00 00 00 00 00 00 01 00 00 44 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  170    183    186    187    Ljava/lang/NullPointerException;
        //  165    173    176    177    Ljava/lang/NullPointerException;
        //  151    161    164    165    Ljava/lang/NullPointerException;
        //  142    155    158    159    Ljava/lang/NullPointerException;
        //  133    147    150    151    Ljava/lang/NullPointerException;
        //  47     55     58     59     Ljava/lang/NullPointerException;
        //  33     43     43     44     Ljava/lang/NullPointerException;
        //  26     37     40     41     Ljava/lang/NullPointerException;
        //  5      16     19     20     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0151:
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
    
    public static String[] getItems() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: invokestatic    org/powerbot/game/api/methods/node/Menu.getOptions:()[Ljava/lang/String;
        //     8: astore_0       
        //     9: invokestatic    org/powerbot/game/api/methods/node/Menu.getActions:()[Ljava/lang/String;
        //    12: astore_1       
        //    13: new             Ljava/util/LinkedList;
        //    16: dup            
        //    17: invokespecial   java/util/LinkedList.<init>:()V
        //    20: astore_2       
        //    21: aload_0        
        //    22: arraylength    
        //    23: aload_1        
        //    24: arraylength    
        //    25: invokestatic    java/lang/Math.min:(II)I
        //    28: istore_3       
        //    29: iconst_0       
        //    30: istore          4
        //    32: iload           4
        //    34: iload_3        
        //    35: if_icmpge       140
        //    38: aload_0        
        //    39: iload           4
        //    41: aaload         
        //    42: astore          5
        //    44: aload_1        
        //    45: iload           8
        //    47: ifne            154
        //    50: iload           4
        //    52: aaload         
        //    53: astore          6
        //    55: iload           8
        //    57: ifne            135
        //    60: aload           5
        //    62: ifnull          132
        //    65: goto            69
        //    68: athrow         
        //    69: aload           6
        //    71: iload           8
        //    73: ifne            120
        //    76: goto            80
        //    79: athrow         
        //    80: ifnull          132
        //    83: goto            87
        //    86: athrow         
        //    87: new             Ljava/lang/StringBuilder;
        //    90: dup            
        //    91: invokespecial   java/lang/StringBuilder.<init>:()V
        //    94: aload           6
        //    96: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    99: ldc_w           "\f"
        //   102: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   105: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   108: aload           5
        //   110: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   116: goto            120
        //   119: athrow         
        //   120: astore          7
        //   122: aload_2        
        //   123: aload           7
        //   125: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   128: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   131: pop            
        //   132: iinc            4, 1
        //   135: iload           8
        //   137: ifeq            32
        //   140: aload_2        
        //   141: aload_2        
        //   142: invokevirtual   java/util/LinkedList.size:()I
        //   145: anewarray       Ljava/lang/String;
        //   148: invokevirtual   java/util/LinkedList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   151: checkcast       [Ljava/lang/String;
        //   154: areturn        
        //    StackMapTable: 00 0D FF 00 20 00 09 07 00 35 07 00 35 07 00 29 01 01 00 00 00 01 00 00 FF 00 23 00 09 07 00 35 07 00 35 07 00 29 01 01 07 00 33 07 00 33 00 01 00 01 07 00 45 00 49 07 00 45 40 07 00 33 45 07 00 45 00 5F 07 00 45 40 07 00 33 0B 02 FF 00 04 00 09 07 00 35 07 00 35 07 00 29 01 01 00 00 00 01 00 00 4D 07 00 35
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  80     116    119    120    Ljava/lang/NullPointerException;
        //  69     83     86     87     Ljava/lang/NullPointerException;
        //  60     76     79     80     Ljava/lang/NullPointerException;
        //  55     65     68     69     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    public static boolean contains(final String s) {
        int index = 0;
        Label_0018: {
            int n;
            try {
                n = (index = getIndex(s));
                if (Menu.a != 0) {
                    return index != 0;
                }
                final int n2 = -1;
                if (n != n2) {
                    break Label_0018;
                }
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final int n2 = -1;
                if (n == n2) {
                    return false;
                }
                index = 1;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return index != 0;
        index = 0;
        return index != 0;
    }
    
    public static boolean contains(final String s, final String s2) {
        int index = 0;
        Label_0019: {
            int n;
            try {
                n = (index = getIndex(s, s2));
                if (Menu.a != 0) {
                    return index != 0;
                }
                final int n2 = -1;
                if (n != n2) {
                    break Label_0019;
                }
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                final int n2 = -1;
                if (n == n2) {
                    return false;
                }
                index = 1;
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return index != 0;
        index = 0;
        return index != 0;
    }
    
    public static boolean clickMain(final String[] array, final int n) {
        final Point location = getLocation();
        final int nextInt = Random.nextInt(4, array[n].length() * 4);
        final int n2 = 21 + 16 * n + Random.nextInt(3, 12);
        Label_0068: {
            boolean b;
            try {
                Mouse.move(location.x + nextInt, location.y + n2, 2, 2);
                final boolean open;
                b = (open = isOpen());
                if (Menu.a != 0) {
                    return open;
                }
                if (b) {
                    break Label_0068;
                }
                return false;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (b) {
                    Mouse.click(true);
                    return true;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public static boolean clickSub(final String[] array, final int n, final int n2) {
        final int a = Menu.a;
        final Point location = getLocation();
        final int nextInt = Random.nextInt(4, array[n].length() * 4);
        final int n3 = 21 + 16 * n + Random.nextInt(3, 12);
        boolean open = false;
        Label_0226: {
            try {
                Mouse.move(location.x + nextInt, location.y + n3, 2, 2);
                Task.sleep(Random.nextInt(125, 150));
                open = isOpen();
                if (a != 0) {
                    return open;
                }
                if (!open) {
                    break Label_0226;
                }
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            final Point subLocation = getSubLocation();
            final Point location2 = Mouse.getLocation();
            final int nextInt2 = Random.nextInt(4, array[n2].length() * 4);
            try {
                Mouse.move(subLocation.x + nextInt2, location2.y, 2, 0);
                Task.sleep(Random.nextInt(125, 150));
                final boolean open2 = isOpen();
                if (a != 0) {
                    return open;
                }
                if (!open2) {
                    break Label_0226;
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
            final int n4 = 16 * n2 + Random.nextInt(3, 12) + 21;
            Label_0218: {
                boolean open3;
                try {
                    Mouse.move(subLocation.x + nextInt2, subLocation.y + n4, 0, 2);
                    Task.sleep(Random.nextInt(125, 150));
                    open3 = isOpen();
                    if (a != 0) {
                        return open;
                    }
                    if (open3) {
                        break Label_0218;
                    }
                    break Label_0226;
                }
                catch (NullPointerException ex3) {
                    throw ex3;
                }
                try {
                    if (open3) {
                        Mouse.click(true);
                        return true;
                    }
                }
                catch (NullPointerException ex4) {
                    throw ex4;
                }
            }
        }
        return open;
    }
    
    public static String[] getActions() {
        return getMenuItemPart(true);
    }
    
    public static String[] getOptions() {
        return getMenuItemPart(false);
    }
    
    public static int getIndex(String lowerCase) {
        final int a = Menu.a;
        lowerCase = lowerCase.toLowerCase();
        final String[] actions = getActions();
        int i = 0;
        while (i < actions.length) {
            Label_0052: {
                Label_0043: {
                    int n2;
                    int n;
                    try {
                        final int contains;
                        n = (n2 = (contains = (actions[i].toLowerCase().contains(lowerCase) ? 1 : 0)));
                        if (a != 0) {
                            return contains;
                        }
                        final int n3 = a;
                        if (n3 == 0) {
                            break Label_0043;
                        }
                        return n2;
                    }
                    catch (NullPointerException ex) {
                        throw ex;
                    }
                    try {
                        final int n3 = a;
                        if (n3 != 0) {
                            return n2;
                        }
                        if (n == 0) {
                            break Label_0052;
                        }
                    }
                    catch (NullPointerException ex2) {
                        throw ex2;
                    }
                }
                return i;
            }
            ++i;
            if (a != 0) {
                break;
            }
            continue;
            return i;
        }
        return -1;
    }
    
    public static int getIndex(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_1        
        //     6: iload           5
        //     8: ifne            33
        //    11: ifnonnull       24
        //    14: goto            18
        //    17: athrow         
        //    18: aload_0        
        //    19: invokestatic    org/powerbot/game/api/methods/node/Menu.getIndex:(Ljava/lang/String;)I
        //    22: ireturn        
        //    23: athrow         
        //    24: aload_0        
        //    25: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    28: astore_0       
        //    29: aload_1        
        //    30: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    33: astore_1       
        //    34: invokestatic    org/powerbot/game/api/methods/node/Menu.getActions:()[Ljava/lang/String;
        //    37: astore_2       
        //    38: invokestatic    org/powerbot/game/api/methods/node/Menu.getOptions:()[Ljava/lang/String;
        //    41: astore_3       
        //    42: iconst_0       
        //    43: istore          4
        //    45: iload           4
        //    47: aload_2        
        //    48: arraylength    
        //    49: aload_3        
        //    50: arraylength    
        //    51: invokestatic    java/lang/Math.min:(II)I
        //    54: if_icmpge       127
        //    57: aload_2        
        //    58: iload           4
        //    60: aaload         
        //    61: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    64: aload_0        
        //    65: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    68: iload           5
        //    70: ifne            128
        //    73: iload           5
        //    75: ifne            104
        //    78: goto            82
        //    81: athrow         
        //    82: ifeq            119
        //    85: goto            89
        //    88: athrow         
        //    89: aload_3        
        //    90: iload           4
        //    92: aaload         
        //    93: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //    96: aload_1        
        //    97: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   100: goto            104
        //   103: athrow         
        //   104: iload           5
        //   106: ifne            118
        //   109: ifeq            119
        //   112: goto            116
        //   115: athrow         
        //   116: iload           4
        //   118: ireturn        
        //   119: iinc            4, 1
        //   122: iload           5
        //   124: ifeq            45
        //   127: iconst_m1      
        //   128: ireturn        
        //    StackMapTable: 00 12 FF 00 11 00 06 07 00 33 07 00 33 00 00 00 01 00 01 07 00 45 00 44 07 00 45 00 48 07 00 33 FF 00 0B 00 06 07 00 33 07 00 33 07 00 35 07 00 35 01 01 00 00 63 07 00 45 40 01 45 07 00 45 00 4D 07 00 45 40 01 4A 07 00 45 00 41 01 00 07 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  104    112    115    116    Ljava/lang/NullPointerException;
        //  82     100    103    104    Ljava/lang/NullPointerException;
        //  73     85     88     89     Ljava/lang/NullPointerException;
        //  57     78     81     82     Ljava/lang/NullPointerException;
        //  11     23     23     24     Ljava/lang/NullPointerException;
        //  5      14     17     18     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0082:
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
    
    public static String[] getMenuItemPart(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: new             Ljava/util/LinkedList;
        //     8: dup            
        //     9: invokespecial   java/util/LinkedList.<init>:()V
        //    12: astore_1       
        //    13: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //    16: astore_2       
        //    17: aconst_null    
        //    18: astore_3       
        //    19: invokestatic    org/powerbot/game/api/methods/node/Menu.isCollapsed:()Z
        //    22: ifeq            200
        //    25: new             Lorg/powerbot/game/api/util/node/Queue;
        //    28: dup            
        //    29: aload_2        
        //    30: invokeinterface org/powerbot/game/client/Client.getCollapsedMenuItems:()Lorg/powerbot/game/client/NodeSubQueue;
        //    35: invokespecial   org/powerbot/game/api/util/node/Queue.<init>:(Lorg/powerbot/game/client/NodeSubQueue;)V
        //    38: astore          4
        //    40: aload           4
        //    42: invokevirtual   org/powerbot/game/api/util/node/Queue.getHead:()Lorg/powerbot/game/client/NodeSub;
        //    45: checkcast       Lorg/powerbot/game/client/MenuGroupNode;
        //    48: astore          5
        //    50: aload           5
        //    52: ifnull          192
        //    55: new             Lorg/powerbot/game/api/util/node/Queue;
        //    58: dup            
        //    59: aload           5
        //    61: invokeinterface org/powerbot/game/client/MenuGroupNode.getItems:()Lorg/powerbot/game/client/NodeSubQueue;
        //    66: invokespecial   org/powerbot/game/api/util/node/Queue.<init>:(Lorg/powerbot/game/client/NodeSubQueue;)V
        //    69: astore          6
        //    71: iload           10
        //    73: ifne            197
        //    76: aload           6
        //    78: invokevirtual   org/powerbot/game/api/util/node/Queue.getHead:()Lorg/powerbot/game/client/NodeSub;
        //    81: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //    84: astore          7
        //    86: aload           7
        //    88: ifnull          177
        //    91: aload_3        
        //    92: iload           10
        //    94: ifne            135
        //    97: ifnull          124
        //   100: goto            104
        //   103: athrow         
        //   104: aload_3        
        //   105: iload           10
        //   107: ifne            135
        //   110: goto            114
        //   113: athrow         
        //   114: invokevirtual   java/lang/String.isEmpty:()Z
        //   117: ifeq            136
        //   120: goto            124
        //   123: athrow         
        //   124: aload           7
        //   126: invokeinterface org/powerbot/game/client/MenuItemNode.getAction:()Ljava/lang/String;
        //   131: goto            135
        //   134: athrow         
        //   135: astore_3       
        //   136: aload_1        
        //   137: iload_0        
        //   138: ifeq            152
        //   141: aload           7
        //   143: invokeinterface org/powerbot/game/client/MenuItemNode.getAction:()Ljava/lang/String;
        //   148: goto            159
        //   151: athrow         
        //   152: aload           7
        //   154: invokeinterface org/powerbot/game/client/MenuItemNode.getOption:()Ljava/lang/String;
        //   159: invokevirtual   java/util/LinkedList.addLast:(Ljava/lang/Object;)V
        //   162: aload           6
        //   164: invokevirtual   org/powerbot/game/api/util/node/Queue.getNext:()Lorg/powerbot/game/client/NodeSub;
        //   167: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //   170: astore          7
        //   172: iload           10
        //   174: ifeq            86
        //   177: aload           4
        //   179: invokevirtual   org/powerbot/game/api/util/node/Queue.getNext:()Lorg/powerbot/game/client/NodeSub;
        //   182: checkcast       Lorg/powerbot/game/client/MenuGroupNode;
        //   185: astore          5
        //   187: iload           10
        //   189: ifeq            50
        //   192: goto            197
        //   195: astore          5
        //   197: goto            321
        //   200: new             Lorg/powerbot/game/api/util/node/Deque;
        //   203: dup            
        //   204: aload_2        
        //   205: invokeinterface org/powerbot/game/client/Client.getMenuItems:()Lorg/powerbot/game/client/NodeDeque;
        //   210: invokespecial   org/powerbot/game/api/util/node/Deque.<init>:(Lorg/powerbot/game/client/NodeDeque;)V
        //   213: astore          4
        //   215: aload           4
        //   217: invokevirtual   org/powerbot/game/api/util/node/Deque.getHead:()Ljava/lang/Object;
        //   220: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //   223: astore          5
        //   225: aload           5
        //   227: ifnull          316
        //   230: aload_3        
        //   231: iload           10
        //   233: ifne            274
        //   236: ifnull          263
        //   239: goto            243
        //   242: athrow         
        //   243: aload_3        
        //   244: iload           10
        //   246: ifne            274
        //   249: goto            253
        //   252: athrow         
        //   253: invokevirtual   java/lang/String.isEmpty:()Z
        //   256: ifeq            275
        //   259: goto            263
        //   262: athrow         
        //   263: aload           5
        //   265: invokeinterface org/powerbot/game/client/MenuItemNode.getAction:()Ljava/lang/String;
        //   270: goto            274
        //   273: athrow         
        //   274: astore_3       
        //   275: aload_1        
        //   276: iload_0        
        //   277: ifeq            291
        //   280: aload           5
        //   282: invokeinterface org/powerbot/game/client/MenuItemNode.getAction:()Ljava/lang/String;
        //   287: goto            298
        //   290: athrow         
        //   291: aload           5
        //   293: invokeinterface org/powerbot/game/client/MenuItemNode.getOption:()Ljava/lang/String;
        //   298: invokevirtual   java/util/LinkedList.addLast:(Ljava/lang/Object;)V
        //   301: aload           4
        //   303: invokevirtual   org/powerbot/game/api/util/node/Deque.getNext:()Ljava/lang/Object;
        //   306: checkcast       Lorg/powerbot/game/client/MenuItemNode;
        //   309: astore          5
        //   311: iload           10
        //   313: ifeq            225
        //   316: goto            321
        //   319: astore          4
        //   321: aload_1        
        //   322: aload_1        
        //   323: invokevirtual   java/util/LinkedList.size:()I
        //   326: anewarray       Ljava/lang/String;
        //   329: invokevirtual   java/util/LinkedList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   332: checkcast       [Ljava/lang/String;
        //   335: astore          4
        //   337: new             Ljava/util/LinkedList;
        //   340: dup            
        //   341: invokespecial   java/util/LinkedList.<init>:()V
        //   344: astore          5
        //   346: aload           4
        //   348: astore          6
        //   350: aload           6
        //   352: arraylength    
        //   353: istore          7
        //   355: iconst_0       
        //   356: istore          8
        //   358: iload           8
        //   360: iload           7
        //   362: if_icmpge       420
        //   365: aload           6
        //   367: iload           8
        //   369: aaload         
        //   370: astore          9
        //   372: aload           5
        //   374: iload           10
        //   376: ifne            422
        //   379: aload           9
        //   381: iload           10
        //   383: ifne            405
        //   386: goto            390
        //   389: athrow         
        //   390: ifnonnull       403
        //   393: goto            397
        //   396: athrow         
        //   397: ldc             ""
        //   399: goto            408
        //   402: athrow         
        //   403: aload           9
        //   405: invokestatic    org/powerbot/game/api/methods/node/Menu.stripFormatting:(Ljava/lang/String;)Ljava/lang/String;
        //   408: invokevirtual   java/util/LinkedList.add:(Ljava/lang/Object;)Z
        //   411: pop            
        //   412: iinc            8, 1
        //   415: iload           10
        //   417: ifeq            358
        //   420: aload           5
        //   422: iload           10
        //   424: ifne            499
        //   427: invokevirtual   java/util/LinkedList.size:()I
        //   430: iconst_1       
        //   431: if_icmple       497
        //   434: goto            438
        //   437: athrow         
        //   438: aload_3        
        //   439: iload           10
        //   441: ifne            456
        //   444: goto            448
        //   447: athrow         
        //   448: ifnull          497
        //   451: goto            455
        //   454: athrow         
        //   455: aload_3        
        //   456: invokestatic    org/powerbot/game/api/methods/node/Menu.isCollapsed:()Z
        //   459: ifeq            474
        //   462: getstatic       org/powerbot/game/api/methods/node/Menu.z:[Ljava/lang/String;
        //   465: iconst_0       
        //   466: aaload         
        //   467: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   470: goto            482
        //   473: athrow         
        //   474: getstatic       org/powerbot/game/api/methods/node/Menu.z:[Ljava/lang/String;
        //   477: iconst_1       
        //   478: aaload         
        //   479: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   482: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   485: ifeq            497
        //   488: aload           5
        //   490: invokestatic    java/util/Collections.reverse:(Ljava/util/List;)V
        //   493: goto            497
        //   496: athrow         
        //   497: aload           5
        //   499: aload           5
        //   501: invokevirtual   java/util/LinkedList.size:()I
        //   504: anewarray       Ljava/lang/String;
        //   507: invokevirtual   java/util/LinkedList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   510: checkcast       [Ljava/lang/String;
        //   513: areturn        
        //    StackMapTable: 00 3B FF 00 32 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 07 00 21 00 00 00 00 01 00 00 FF 00 23 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 07 00 21 07 00 1D 07 00 23 00 00 01 00 00 50 07 00 45 00 48 07 00 45 40 07 00 33 48 07 00 45 00 49 07 00 45 40 07 00 33 00 4E 07 00 45 40 07 00 29 FF 00 06 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 07 00 21 07 00 1D 07 00 23 00 00 01 00 02 07 00 29 07 00 33 11 FF 00 0E 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 07 00 21 00 00 00 00 01 00 00 FF 00 02 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 00 00 00 00 00 01 00 01 07 00 45 FF 00 01 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 1D 07 00 55 00 00 00 00 01 00 00 FF 00 02 00 0B 01 07 00 29 07 00 7F 05 00 00 00 00 00 00 01 00 00 FF 00 18 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 46 07 00 23 00 00 00 00 01 00 00 50 07 00 45 00 48 07 00 45 40 07 00 33 48 07 00 45 00 49 07 00 45 40 07 00 33 00 4E 07 00 45 40 07 00 29 FF 00 06 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 46 07 00 23 00 00 00 00 01 00 02 07 00 29 07 00 33 11 FF 00 02 00 0B 01 07 00 29 07 00 7F 07 00 33 00 00 00 00 00 00 01 00 01 07 00 4B FF 00 01 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 55 00 00 00 00 00 01 00 00 FF 00 24 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 00 01 00 00 FF 00 1E 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 07 00 33 01 00 01 07 00 45 FF 00 00 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 07 00 33 01 00 02 07 00 29 07 00 33 45 07 00 45 40 07 00 29 44 07 00 45 40 07 00 29 FF 00 01 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 07 00 33 01 00 02 07 00 29 07 00 33 FF 00 02 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 07 00 33 01 00 02 07 00 29 07 00 33 FF 00 0B 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 00 01 00 00 41 07 00 29 4E 07 00 45 00 48 07 00 45 40 07 00 33 45 07 00 45 00 40 07 00 33 50 07 00 45 40 07 00 33 FF 00 07 00 0B 01 07 00 29 07 00 7F 07 00 33 07 00 35 07 00 29 07 00 35 01 01 00 01 00 02 07 00 33 07 00 33 4D 07 00 45 00 41 07 00 29
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  136    151    151    152    Ljava/lang/NullPointerException;
        //  114    131    134    135    Ljava/lang/NullPointerException;
        //  104    120    123    124    Ljava/lang/NullPointerException;
        //  97     110    113    114    Ljava/lang/NullPointerException;
        //  91     100    103    104    Ljava/lang/NullPointerException;
        //  40     192    195    197    Ljava/lang/NullPointerException;
        //  275    290    290    291    Ljava/lang/NullPointerException;
        //  253    270    273    274    Ljava/lang/NullPointerException;
        //  243    259    262    263    Ljava/lang/NullPointerException;
        //  236    249    252    253    Ljava/lang/NullPointerException;
        //  230    239    242    243    Ljava/lang/NullPointerException;
        //  200    316    319    321    Ljava/lang/Throwable;
        //  482    493    496    497    Ljava/lang/NullPointerException;
        //  456    473    473    474    Ljava/lang/NullPointerException;
        //  438    451    454    455    Ljava/lang/NullPointerException;
        //  427    444    447    448    Ljava/lang/NullPointerException;
        //  422    434    437    438    Ljava/lang/NullPointerException;
        //  390    402    402    403    Ljava/lang/NullPointerException;
        //  379    393    396    397    Ljava/lang/NullPointerException;
        //  372    386    389    390    Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0104:
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
    
    private static String stripFormatting(final String input) {
        return Menu.HTML_TAG.matcher(input).replaceAll("");
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "#v\u0013\r`\u0010~\u0001\u000f";
        int n3 = -1;
        String intern = null;
    Label_0046_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0122: {
                    if (n4 > 1) {
                        break Label_0122;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = 'H';
                                break;
                            }
                            case 1: {
                                c2 = '\'';
                                break;
                            }
                            case 2: {
                                c2 = 'C';
                                break;
                            }
                            case 3: {
                                c2 = 'V';
                                break;
                            }
                            default: {
                                c2 = '|';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "\fj*\u0019\u001e\b";
                    n3 = 0;
                    continue Label_0046_Outer;
                }
                case 0: {
                    break Label_0046_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
        final char[] charArray2 = "\\I$8|%0M\u0016p/IA;kFgO1\u0012JJTBi".toCharArray();
        int length2;
        int n8;
        final int n7 = n8 = (length2 = charArray2.length);
        int n9 = 0;
        while (true) {
            Label_0254: {
                if (n7 > 1) {
                    break Label_0254;
                }
                length2 = (n8 = n9);
                do {
                    final char c3 = charArray2[n8];
                    char c4 = '\0';
                    switch (n9 % 5) {
                        case 0: {
                            c4 = 'H';
                            break;
                        }
                        case 1: {
                            c4 = '\'';
                            break;
                        }
                        case 2: {
                            c4 = 'C';
                            break;
                        }
                        case 3: {
                            c4 = 'V';
                            break;
                        }
                        default: {
                            c4 = '|';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n9;
                } while (n7 == 0);
            }
            if (n7 <= n9) {
                HTML_TAG = Pattern.compile(HashTable.e(new String(charArray2).intern()));
                return;
            }
            continue;
        }
    }
}
