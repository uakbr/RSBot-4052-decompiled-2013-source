
package org.powerbot.game.api.methods.interactive;

import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.wrappers.interactive.NPC;
import org.powerbot.game.api.util.Filter;

public class NPCs
{
    public static final Filter<NPC> ALL_FILTER;
    
    public static NPC[] getLoaded() {
        return getLoaded(NPCs.ALL_FILTER);
    }
    
    public static NPC[] getLoaded(final int... array) {
        return getLoaded(new Filter<NPC>() {
            @Override
            public boolean accept(final NPC p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/api/methods/interactive/NPCs$2.val$ids:[I
                //     9: astore_2       
                //    10: aload_2        
                //    11: arraylength    
                //    12: istore_3       
                //    13: iconst_0       
                //    14: istore          4
                //    16: iload           4
                //    18: iload_3        
                //    19: if_icmpge       66
                //    22: aload_2        
                //    23: iload           4
                //    25: iaload         
                //    26: istore          5
                //    28: iload           6
                //    30: ifne            61
                //    33: aload_1        
                //    34: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getId:()I
                //    37: iload           6
                //    39: ifne            67
                //    42: goto            46
                //    45: athrow         
                //    46: iload           5
                //    48: if_icmpne       58
                //    51: goto            55
                //    54: athrow         
                //    55: iconst_1       
                //    56: ireturn        
                //    57: athrow         
                //    58: iinc            4, 1
                //    61: iload           6
                //    63: ifeq            16
                //    66: iconst_0       
                //    67: ireturn        
                //    StackMapTable: 00 0A FF 00 10 00 07 07 00 06 07 00 04 07 00 30 01 01 00 01 00 00 FF 00 1C 00 07 07 00 06 07 00 04 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 47 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 07 07 00 06 07 00 04 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  46     57     57     58     Ljava/lang/RuntimeException;
                //  33     51     54     55     Ljava/lang/RuntimeException;
                //  28     42     45     46     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0046:
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
    
    public static NPC[] getLoaded(final Filter<NPC> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokeinterface org/powerbot/game/client/Client.getRSNPCIndexArray:()[I
        //    15: astore_2       
        //    16: new             Ljava/util/HashSet;
        //    19: dup            
        //    20: invokespecial   java/util/HashSet.<init>:()V
        //    23: astore_3       
        //    24: aload_2        
        //    25: astore          4
        //    27: aload           4
        //    29: arraylength    
        //    30: istore          5
        //    32: iconst_0       
        //    33: istore          6
        //    35: iload           6
        //    37: iload           5
        //    39: if_icmpge       191
        //    42: aload           4
        //    44: iload           6
        //    46: iaload         
        //    47: istore          7
        //    49: aload_1        
        //    50: invokeinterface org/powerbot/game/client/Client.getRSNPCNC:()Lorg/powerbot/game/client/HashTable;
        //    55: iload           7
        //    57: i2l            
        //    58: invokestatic    org/powerbot/game/api/util/node/Nodes.lookup:(Lorg/powerbot/game/client/HashTable;J)Ljava/lang/Object;
        //    61: astore          8
        //    63: iload           10
        //    65: ifne            186
        //    68: aload           8
        //    70: ifnull          183
        //    73: goto            77
        //    76: athrow         
        //    77: aconst_null    
        //    78: astore          9
        //    80: aload           8
        //    82: instanceof      Lorg/powerbot/game/client/RSNPCNode;
        //    85: iload           10
        //    87: ifne            124
        //    90: ifeq            119
        //    93: goto            97
        //    96: athrow         
        //    97: new             Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //   100: dup            
        //   101: aload           8
        //   103: checkcast       Lorg/powerbot/game/client/RSNPCNode;
        //   106: invokeinterface org/powerbot/game/client/RSNPCNode.getRSNPC:()Lorg/powerbot/game/client/RSNPC;
        //   111: invokespecial   org/powerbot/game/api/wrappers/interactive/NPC.<init>:(Lorg/powerbot/game/client/RSNPC;)V
        //   114: astore          9
        //   116: goto            141
        //   119: aload           8
        //   121: instanceof      Lorg/powerbot/game/client/RSNPC;
        //   124: ifeq            141
        //   127: new             Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //   130: dup            
        //   131: aload           8
        //   133: checkcast       Lorg/powerbot/game/client/RSNPC;
        //   136: invokespecial   org/powerbot/game/api/wrappers/interactive/NPC.<init>:(Lorg/powerbot/game/client/RSNPC;)V
        //   139: astore          9
        //   141: aload           9
        //   143: ifnull          183
        //   146: aload_0        
        //   147: aload           9
        //   149: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   154: iload           10
        //   156: ifne            182
        //   159: goto            163
        //   162: athrow         
        //   163: ifeq            183
        //   166: goto            170
        //   169: athrow         
        //   170: aload_3        
        //   171: aload           9
        //   173: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   178: goto            182
        //   181: athrow         
        //   182: pop            
        //   183: iinc            6, 1
        //   186: iload           10
        //   188: ifeq            35
        //   191: aload_3        
        //   192: aload_3        
        //   193: invokeinterface java/util/Set.size:()I
        //   198: anewarray       Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //   201: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   206: checkcast       [Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //   209: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/interactive/NPC;>;)[Lorg/powerbot/game/api/wrappers/interactive/NPC;
        //    StackMapTable: 00 11 FF 00 23 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 00 00 00 01 00 00 FF 00 28 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 01 07 00 25 00 01 00 01 07 00 88 00 FF 00 12 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 01 07 00 25 05 01 00 01 07 00 88 00 15 44 01 FF 00 10 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 01 07 00 25 07 00 0D 01 00 00 54 07 00 88 40 01 45 07 00 88 00 4A 07 00 88 40 01 FF 00 00 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 01 07 00 25 00 01 00 00 02 FF 00 04 00 0B 07 00 4C 07 00 41 07 00 8B 07 00 08 07 00 8B 01 01 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  163    178    181    182    Ljava/lang/RuntimeException;
        //  146    166    169    170    Ljava/lang/RuntimeException;
        //  141    159    162    163    Ljava/lang/RuntimeException;
        //  80     93     96     97     Ljava/lang/RuntimeException;
        //  63     73     76     77     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0163:
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
    
    public static NPC getNearest(final int... array) {
        return getNearest(new Filter<NPC>() {
            @Override
            public boolean accept(final NPC p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          6
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/api/methods/interactive/NPCs$3.val$ids:[I
                //     9: astore_2       
                //    10: aload_2        
                //    11: arraylength    
                //    12: istore_3       
                //    13: iconst_0       
                //    14: istore          4
                //    16: iload           4
                //    18: iload_3        
                //    19: if_icmpge       66
                //    22: aload_2        
                //    23: iload           4
                //    25: iaload         
                //    26: istore          5
                //    28: iload           6
                //    30: ifne            61
                //    33: iload           5
                //    35: iload           6
                //    37: ifne            67
                //    40: goto            44
                //    43: athrow         
                //    44: aload_1        
                //    45: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getId:()I
                //    48: if_icmpne       58
                //    51: goto            55
                //    54: athrow         
                //    55: iconst_1       
                //    56: ireturn        
                //    57: athrow         
                //    58: iinc            4, 1
                //    61: iload           6
                //    63: ifeq            16
                //    66: iconst_0       
                //    67: ireturn        
                //    StackMapTable: 00 0A FF 00 10 00 07 07 00 06 07 00 04 07 00 30 01 01 00 01 00 00 FF 00 1A 00 07 07 00 06 07 00 04 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 49 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 07 07 00 06 07 00 04 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  44     57     57     58     Ljava/lang/RuntimeException;
                //  33     51     54     55     Ljava/lang/RuntimeException;
                //  28     40     43     44     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public static NPC getNearest(final String... array) {
        return getNearest(new Filter<NPC>() {
            @Override
            public boolean accept(final NPC p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/interactive/NPC.getName:()Ljava/lang/String;
                //     9: astore_2       
                //    10: aload_2        
                //    11: ifnonnull       17
                //    14: iconst_0       
                //    15: ireturn        
                //    16: athrow         
                //    17: aload_0        
                //    18: getfield        org/powerbot/game/api/methods/interactive/NPCs$4.val$names:[Ljava/lang/String;
                //    21: astore_3       
                //    22: aload_3        
                //    23: arraylength    
                //    24: istore          4
                //    26: iconst_0       
                //    27: istore          5
                //    29: iload           5
                //    31: iload           4
                //    33: if_icmpge       86
                //    36: aload_3        
                //    37: iload           5
                //    39: aaload         
                //    40: astore          6
                //    42: iload           7
                //    44: ifne            81
                //    47: aload           6
                //    49: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
                //    52: aload_2        
                //    53: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
                //    56: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
                //    59: iload           7
                //    61: ifne            87
                //    64: goto            68
                //    67: athrow         
                //    68: ifeq            78
                //    71: goto            75
                //    74: athrow         
                //    75: iconst_1       
                //    76: ireturn        
                //    77: athrow         
                //    78: iinc            5, 1
                //    81: iload           7
                //    83: ifeq            29
                //    86: iconst_0       
                //    87: ireturn        
                //    StackMapTable: 00 0C FF 00 10 00 08 07 00 08 07 00 06 07 00 1B 00 00 00 00 01 00 01 07 00 36 00 FF 00 0B 00 08 07 00 08 07 00 06 07 00 1B 07 00 39 01 01 00 01 00 00 FF 00 25 00 08 07 00 08 07 00 06 07 00 1B 07 00 39 01 01 07 00 1B 01 00 01 07 00 36 40 01 45 07 00 36 00 41 07 00 36 00 02 FF 00 04 00 08 07 00 08 07 00 06 07 00 1B 07 00 39 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  68     77     77     78     Ljava/lang/RuntimeException;
                //  47     71     74     75     Ljava/lang/RuntimeException;
                //  42     64     67     68     Ljava/lang/RuntimeException;
                //  10     16     16     17     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0068:
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
    
    public static NPC getNearest(final Filter<NPC> filter) {
        final int a = Players.a;
        final Client client = Context.client();
        final int[] rsnpcIndexArray = client.getRSNPCIndexArray();
        NPC npc = null;
        double n = Double.MAX_VALUE;
        final RegionOffset regionOffset = Players.getLocal().getRegionOffset();
        final int[] array = rsnpcIndexArray;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Object lookup = Nodes.lookup(client.getRSNPCNC(), array[i]);
            NPC npc2 = null;
            Label_0148: {
                boolean b = false;
                Label_0131: {
                    Label_0126: {
                        Label_0089: {
                            Object o;
                            try {
                                o = lookup;
                                if (a != 0) {
                                    break Label_0089;
                                }
                                if (o == null) {
                                    break Label_0148;
                                }
                            }
                            catch (Exception ex) {
                                throw ex;
                            }
                            try {
                                b = (o instanceof RSNPCNode);
                                if (a != 0) {
                                    break Label_0131;
                                }
                                if (!b) {
                                    break Label_0126;
                                }
                            }
                            catch (Exception ex2) {
                                throw ex2;
                            }
                        }
                        npc2 = new NPC(((RSNPCNode)lookup).getRSNPC());
                        break Label_0148;
                    }
                    final boolean b2 = lookup instanceof RSNPC;
                }
                if (b) {
                    npc2 = new NPC((RSNPC)lookup);
                }
            }
            if (npc2 != null) {
                try {
                    Label_0204: {
                        if (filter.accept(npc2)) {
                            final double distance = Calculations.distance(regionOffset, npc2.getRegionOffset());
                            double n3 = 0.0;
                            Label_0193: {
                                double n2;
                                try {
                                    n2 = (n3 = distance);
                                    if (a != 0) {
                                        break Label_0193;
                                    }
                                    final double n4 = n;
                                    final double n5 = dcmpg(n2, n4);
                                    if (n5 < 0) {
                                        break Label_0193;
                                    }
                                    break Label_0204;
                                }
                                catch (Exception ex3) {
                                    throw ex3;
                                }
                                try {
                                    final double n4 = n;
                                    final double n5 = dcmpg(n2, n4);
                                    if (n5 >= 0) {
                                        break Label_0204;
                                    }
                                    n3 = distance;
                                }
                                catch (Exception ex4) {
                                    throw ex4;
                                }
                            }
                            n = n3;
                            npc = npc2;
                        }
                    }
                }
                catch (Exception ex5) {}
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return npc;
    }
    
    static {
        ALL_FILTER = new Filter<NPC>() {
            @Override
            public boolean accept(final NPC npc) {
                return true;
            }
        };
    }
}
