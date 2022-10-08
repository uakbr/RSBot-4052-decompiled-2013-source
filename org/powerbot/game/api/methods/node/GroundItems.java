
package org.powerbot.game.api.methods.node;

import org.powerbot.game.client.HashTable;
import org.powerbot.game.api.wrappers.node.Item;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.client.RSItem;
import org.powerbot.game.api.util.node.Deque;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.client.NodeListCache;
import org.powerbot.game.bot.Context;
import java.util.ArrayList;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.wrappers.node.GroundItem;
import org.powerbot.game.api.util.Filter;

public class GroundItems
{
    public static final Filter<GroundItem> ALL_FILTER;
    
    public static GroundItem[] getLoaded() {
        return getLoaded(104, GroundItems.ALL_FILTER);
    }
    
    public static GroundItem[] getLoaded(final int n) {
        return getLoaded(new Filter<GroundItem>() {
            @Override
            public boolean accept(final GroundItem groundItem) {
                int id = 0;
                Label_0024: {
                    int n;
                    try {
                        n = (id = groundItem.getGroundItem().getId());
                        if (Menu.a != 0) {
                            return id != 0;
                        }
                        final Filter<GroundItem> filter = this;
                        final int n2 = n;
                        if (n == n2) {
                            break Label_0024;
                        }
                        return false;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Filter<GroundItem> filter = this;
                        final int n2 = n;
                        if (n != n2) {
                            return false;
                        }
                        id = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return id != 0;
                id = (false ? 1 : 0);
                return id != 0;
            }
        });
    }
    
    public static GroundItem[] getLoaded(final Filter<GroundItem> filter) {
        return getLoaded(104, filter);
    }
    
    public static GroundItem[] getLoaded(final int n, final int n2) {
        return getLoaded(n, new Filter<GroundItem>() {
            @Override
            public boolean accept(final GroundItem groundItem) {
                int id = 0;
                Label_0024: {
                    int n;
                    try {
                        n = (id = groundItem.getGroundItem().getId());
                        if (Menu.a != 0) {
                            return id != 0;
                        }
                        final Filter<GroundItem> filter = this;
                        final int n2 = n2;
                        if (n == n2) {
                            break Label_0024;
                        }
                        return false;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Filter<GroundItem> filter = this;
                        final int n2 = n2;
                        if (n != n2) {
                            return false;
                        }
                        id = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return id != 0;
                id = (false ? 1 : 0);
                return id != 0;
            }
        });
    }
    
    public static GroundItem[] getLoaded(final int p0, final Filter<GroundItem> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          19
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: astore_2       
        //    13: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    16: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //    19: astore_3       
        //    20: aload_3        
        //    21: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    24: istore          4
        //    26: aload_3        
        //    27: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    30: istore          5
        //    32: invokestatic    org/powerbot/game/api/methods/Game.getBaseX:()I
        //    35: istore          6
        //    37: invokestatic    org/powerbot/game/api/methods/Game.getBaseY:()I
        //    40: istore          7
        //    42: iload           6
        //    44: iload           4
        //    46: iload_0        
        //    47: isub           
        //    48: invokestatic    java/lang/Math.max:(II)I
        //    51: istore          8
        //    53: iload           7
        //    55: iload           5
        //    57: iload_0        
        //    58: isub           
        //    59: invokestatic    java/lang/Math.max:(II)I
        //    62: istore          9
        //    64: iload           6
        //    66: bipush          104
        //    68: iadd           
        //    69: iload           4
        //    71: iload_0        
        //    72: iadd           
        //    73: invokestatic    java/lang/Math.min:(II)I
        //    76: istore          10
        //    78: iload           7
        //    80: bipush          104
        //    82: iadd           
        //    83: iload           5
        //    85: iload_0        
        //    86: iadd           
        //    87: invokestatic    java/lang/Math.min:(II)I
        //    90: istore          11
        //    92: iload           8
        //    94: istore          12
        //    96: iload           12
        //    98: iload           10
        //   100: if_icmpge       249
        //   103: iload           9
        //   105: istore          13
        //   107: iload           13
        //   109: iload           11
        //   111: if_icmpge       241
        //   114: iload           12
        //   116: iload           13
        //   118: invokestatic    org/powerbot/game/api/methods/node/GroundItems.getLoadedAt:(II)[Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //   121: astore          14
        //   123: aload           14
        //   125: astore          15
        //   127: aload           15
        //   129: arraylength    
        //   130: istore          16
        //   132: iconst_0       
        //   133: iload           19
        //   135: ifne            98
        //   138: istore          17
        //   140: iload           17
        //   142: iload           16
        //   144: if_icmpge       233
        //   147: aload           15
        //   149: iload           17
        //   151: aaload         
        //   152: astore          18
        //   154: iload           19
        //   156: ifne            236
        //   159: iload           19
        //   161: ifne            215
        //   164: goto            168
        //   167: athrow         
        //   168: aload           18
        //   170: ifnull          212
        //   173: goto            177
        //   176: athrow         
        //   177: aload_1        
        //   178: aload           18
        //   180: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   185: iload           19
        //   187: ifne            211
        //   190: goto            194
        //   193: athrow         
        //   194: ifeq            212
        //   197: goto            201
        //   200: athrow         
        //   201: aload_2        
        //   202: aload           18
        //   204: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   207: goto            211
        //   210: athrow         
        //   211: pop            
        //   212: iinc            17, 1
        //   215: iload           19
        //   217: ifeq            140
        //   220: getstatic       org/powerbot/core/script/job/Task.a:I
        //   223: istore          20
        //   225: iinc            20, 1
        //   228: iload           20
        //   230: putstatic       org/powerbot/core/script/job/Task.a:I
        //   233: iinc            13, 1
        //   236: iload           19
        //   238: ifeq            107
        //   241: iinc            12, 1
        //   244: iload           19
        //   246: ifeq            96
        //   249: aload_2        
        //   250: aload_2        
        //   251: invokevirtual   java/util/ArrayList.size:()I
        //   254: anewarray       Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //   257: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   260: checkcast       [Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //   263: areturn        
        //    Signature:
        //  (ILorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/GroundItem;>;)[Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //    StackMapTable: 00 14 FF 00 60 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 01 00 00 41 01 FF 00 08 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 01 00 00 00 00 00 01 00 00 FF 00 20 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 00 01 00 00 FF 00 1A 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 07 00 17 01 00 01 07 00 D1 00 47 07 00 D1 00 4F 07 00 D1 40 01 45 07 00 D1 00 48 07 00 D1 40 01 00 02 FF 00 11 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 00 01 00 00 02 FF 00 04 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 01 00 00 00 00 00 01 00 00 FF 00 07 00 14 01 07 00 6C 07 00 09 07 00 30 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  194    207    210    211    Ljava/lang/RuntimeException;
        //  177    197    200    201    Ljava/lang/RuntimeException;
        //  168    190    193    194    Ljava/lang/RuntimeException;
        //  159    173    176    177    Ljava/lang/RuntimeException;
        //  154    164    167    168    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0168:
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
    
    public static GroundItem getNearest(final int... array) {
        return getNearest(new Filter<GroundItem>() {
            @Override
            public boolean accept(final GroundItem p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/node/GroundItem.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/game/api/methods/node/GroundItems$4.val$ids:[I
                //    14: astore_3       
                //    15: aload_3        
                //    16: arraylength    
                //    17: istore          4
                //    19: iconst_0       
                //    20: istore          5
                //    22: iload           5
                //    24: iload           4
                //    26: if_icmpge       70
                //    29: aload_3        
                //    30: iload           5
                //    32: iaload         
                //    33: istore          6
                //    35: iload           7
                //    37: ifne            65
                //    40: iload_2        
                //    41: iload           7
                //    43: ifne            71
                //    46: goto            50
                //    49: athrow         
                //    50: iload           6
                //    52: if_icmpne       62
                //    55: goto            59
                //    58: athrow         
                //    59: iconst_1       
                //    60: ireturn        
                //    61: athrow         
                //    62: iinc            5, 1
                //    65: iload           7
                //    67: ifeq            22
                //    70: iconst_0       
                //    71: ireturn        
                //    StackMapTable: 00 0A FF 00 16 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 FF 00 1A 00 08 07 00 06 07 00 04 01 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 47 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  50     61     61     62     Ljava/lang/RuntimeException;
                //  40     55     58     59     Ljava/lang/RuntimeException;
                //  35     46     49     50     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static GroundItem getNearest(final Filter<GroundItem> filter) {
        return getNearest(104, filter);
    }
    
    public static GroundItem getNearest(final int n, final int n2) {
        return getNearest(n, new Filter<GroundItem>() {
            @Override
            public boolean accept(final GroundItem groundItem) {
                int id = 0;
                Label_0024: {
                    int n;
                    try {
                        n = (id = groundItem.getGroundItem().getId());
                        if (Menu.a != 0) {
                            return id != 0;
                        }
                        final Filter<GroundItem> filter = this;
                        final int n2 = n2;
                        if (n == n2) {
                            break Label_0024;
                        }
                        return false;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Filter<GroundItem> filter = this;
                        final int n2 = n2;
                        if (n != n2) {
                            return false;
                        }
                        id = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return id != 0;
                id = (false ? 1 : 0);
                return id != 0;
            }
        });
    }
    
    public static GroundItem getNearest(final int p0, final Filter<GroundItem> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          24
        //     5: aconst_null    
        //     6: astore_2       
        //     7: ldc2_w          1.7976931348623157E308
        //    10: dstore_3       
        //    11: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    14: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getRegionOffset:()Lorg/powerbot/game/api/wrappers/RegionOffset;
        //    17: astore          5
        //    19: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    22: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //    25: astore          6
        //    27: aload           6
        //    29: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    32: istore          7
        //    34: aload           6
        //    36: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    39: istore          8
        //    41: invokestatic    org/powerbot/game/api/methods/Game.getBaseX:()I
        //    44: istore          9
        //    46: invokestatic    org/powerbot/game/api/methods/Game.getBaseY:()I
        //    49: istore          10
        //    51: iload           9
        //    53: iload           7
        //    55: iload_0        
        //    56: isub           
        //    57: invokestatic    java/lang/Math.max:(II)I
        //    60: istore          11
        //    62: iload           10
        //    64: iload           8
        //    66: iload_0        
        //    67: isub           
        //    68: invokestatic    java/lang/Math.max:(II)I
        //    71: istore          12
        //    73: iload           9
        //    75: bipush          104
        //    77: iadd           
        //    78: iload           7
        //    80: iload_0        
        //    81: iadd           
        //    82: invokestatic    java/lang/Math.min:(II)I
        //    85: istore          13
        //    87: iload           10
        //    89: bipush          104
        //    91: iadd           
        //    92: iload           8
        //    94: iload_0        
        //    95: iadd           
        //    96: invokestatic    java/lang/Math.min:(II)I
        //    99: istore          14
        //   101: iload           11
        //   103: istore          15
        //   105: iload           15
        //   107: iload           13
        //   109: if_icmpge       259
        //   112: iload           12
        //   114: istore          16
        //   116: iload           16
        //   118: iload           14
        //   120: if_icmpge       251
        //   123: iload           15
        //   125: iload           16
        //   127: invokestatic    org/powerbot/game/api/methods/node/GroundItems.getLoadedAt:(II)[Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //   130: astore          17
        //   132: aload           17
        //   134: astore          18
        //   136: aload           18
        //   138: arraylength    
        //   139: istore          19
        //   141: iconst_0       
        //   142: iload           24
        //   144: ifne            107
        //   147: istore          20
        //   149: iload           20
        //   151: iload           19
        //   153: if_icmpge       243
        //   156: aload           18
        //   158: iload           20
        //   160: aaload         
        //   161: astore          21
        //   163: iload           24
        //   165: ifne            238
        //   168: aload           21
        //   170: iload           24
        //   172: ifne            260
        //   175: goto            179
        //   178: athrow         
        //   179: ifnull          235
        //   182: goto            186
        //   185: athrow         
        //   186: aload_1        
        //   187: aload           21
        //   189: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   194: ifeq            235
        //   197: goto            201
        //   200: athrow         
        //   201: aload           5
        //   203: aload           21
        //   205: invokevirtual   org/powerbot/game/api/wrappers/node/GroundItem.getRegionOffset:()Lorg/powerbot/game/api/wrappers/RegionOffset;
        //   208: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/RegionOffset;Lorg/powerbot/game/api/wrappers/RegionOffset;)D
        //   211: dstore          22
        //   213: iload           24
        //   215: ifne            238
        //   218: dload           22
        //   220: dload_3        
        //   221: dcmpg          
        //   222: ifge            235
        //   225: goto            229
        //   228: athrow         
        //   229: dload           22
        //   231: dstore_3       
        //   232: aload           21
        //   234: astore_2       
        //   235: iinc            20, 1
        //   238: iload           24
        //   240: ifeq            149
        //   243: iinc            16, 1
        //   246: iload           24
        //   248: ifeq            116
        //   251: iinc            15, 1
        //   254: iload           24
        //   256: ifeq            105
        //   259: aload_2        
        //   260: getstatic       org/powerbot/core/script/job/Task.a:I
        //   263: ifeq            278
        //   266: iinc            24, 1
        //   269: iload           24
        //   271: putstatic       org/powerbot/game/api/methods/node/Menu.a:I
        //   274: goto            278
        //   277: athrow         
        //   278: areturn        
        //    Signature:
        //  (ILorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/GroundItem;>;)Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //    StackMapTable: 00 14 FF 00 69 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 00 00 01 00 00 41 01 FF 00 08 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 00 01 00 00 FF 00 20 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 00 00 00 01 00 00 FF 00 1C 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 07 00 17 00 00 01 00 01 07 00 D1 40 07 00 17 45 07 00 D1 00 4D 07 00 D1 00 FF 00 1A 00 17 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 07 00 17 03 01 00 01 07 00 D1 00 FF 00 05 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 07 00 17 00 00 01 00 00 02 FF 00 04 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 07 00 19 07 00 19 01 01 00 00 00 01 00 00 FF 00 07 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 18 01 07 00 6C 07 00 17 03 07 00 D6 07 00 30 01 01 01 01 01 01 01 01 01 00 00 00 00 00 00 00 00 01 00 00 40 07 00 17 50 07 00 D1 40 07 00 17
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  260    274    277    278    Ljava/lang/RuntimeException;
        //  213    225    228    229    Ljava/lang/RuntimeException;
        //  179    197    200    201    Ljava/lang/RuntimeException;
        //  168    182    185    186    Ljava/lang/RuntimeException;
        //  163    175    178    179    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0179:
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
    
    public static GroundItem[] getLoadedAt(final int n, final int n2) {
        final int a = Menu.a;
        Label_0025: {
            int loggedIn;
            try {
                loggedIn = (Game.isLoggedIn() ? 1 : 0);
                if (a != 0) {
                    return new GroundItem[loggedIn];
                }
                if (loggedIn != 0) {
                    break Label_0025;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return new GroundItem[loggedIn];
        }
        final ArrayList<GroundItem> list = new ArrayList<GroundItem>();
        final HashTable rsItemHashTable = Context.client().getRSItemHashTable();
        final int plane = Game.getPlane();
        final NodeListCache nodeListCache = (NodeListCache)Nodes.lookup(rsItemHashTable, n | n2 << 14 | plane << 28);
        Label_0101: {
            NodeListCache nodeListCache2;
            try {
                nodeListCache2 = nodeListCache;
                if (a != 0) {
                    break Label_0101;
                }
                if (nodeListCache2 == null) {
                    break Label_0101;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            try {
                if (nodeListCache2.getNodeList() == null) {
                    return new GroundItem[0];
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        final Deque deque = new Deque<RSItem>(nodeListCache.getNodeList());
        RSItem rsItem = deque.getHead();
        ArrayList<GroundItem> list2 = null;
        while (rsItem != null) {
            list2 = list;
            if (a != 0) {
                return list2.toArray(new GroundItem[list.size()]);
            }
            list2.add(new GroundItem(new Tile(n, n2, plane), new Item(rsItem)));
            rsItem = deque.getNext();
            if (a != 0) {
                break;
            }
        }
        return list2.toArray(new GroundItem[list.size()]);
    }
    
    static {
        ALL_FILTER = new Filter<GroundItem>() {
            @Override
            public boolean accept(final GroundItem groundItem) {
                return true;
            }
        };
    }
}
