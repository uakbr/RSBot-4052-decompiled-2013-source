
package org.powerbot.game.api.methods.node;

import org.powerbot.game.client.RSGroundInfo;
import org.powerbot.game.client.RSInfo;
import org.powerbot.game.client.RSGround;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.methods.interactive.Players;
import java.util.Set;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.game.api.util.Filter;

public class SceneEntities
{
    public static final int TYPE_INTERACTIVE = 1;
    public static final int TYPE_FLOOR_DECORATION = 2;
    public static final int TYPE_BOUNDARY = 4;
    public static final int TYPE_WALL_DECORATION = 8;
    public static final int TYPE_UNKNOWN = 16;
    public static final Filter<SceneObject> ALL_FILTER;
    
    public static SceneObject[] getLoaded() {
        return getLoaded(SceneEntities.ALL_FILTER);
    }
    
    public static SceneObject[] getLoaded(final Tile tile) {
        int validate = 0;
        Label_0057: {
            try {
                validate = (tile.validate() ? 1 : 0);
                if (Menu.a != 0) {
                    return new SceneObject[validate];
                }
                if (validate == 0) {
                    break Label_0057;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Set<SceneObject> local = getLocalAt(tile.getX() - Game.getBaseX(), tile.getY() - Game.getBaseY(), -1);
            return local.toArray(new SceneObject[local.size()]);
        }
        return new SceneObject[validate];
    }
    
    public static SceneObject[] getLoaded(final int... array) {
        return getLoaded(new Filter<SceneObject>() {
            @Override
            public boolean accept(final SceneObject p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/game/api/methods/node/SceneEntities$2.val$ids:[I
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
    
    public static SceneObject[] getLoaded(final Filter<SceneObject> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: new             Ljava/util/LinkedHashSet;
        //     8: dup            
        //     9: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    12: astore_1       
        //    13: iconst_0       
        //    14: istore_2       
        //    15: iload_2        
        //    16: bipush          104
        //    18: if_icmpge       141
        //    21: iconst_0       
        //    22: istore_3       
        //    23: iload_3        
        //    24: bipush          104
        //    26: if_icmpge       133
        //    29: iload_2        
        //    30: iload_3        
        //    31: iload           6
        //    33: ifne            18
        //    36: iconst_m1      
        //    37: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getLocalAt:(III)Ljava/util/Set;
        //    40: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    45: astore          4
        //    47: aload           4
        //    49: invokeinterface java/util/Iterator.hasNext:()Z
        //    54: ifeq            125
        //    57: aload           4
        //    59: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    64: checkcast       Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //    67: astore          5
        //    69: iload           6
        //    71: ifne            128
        //    74: aload           5
        //    76: ifnull          120
        //    79: goto            83
        //    82: athrow         
        //    83: aload_0        
        //    84: aload           5
        //    86: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //    91: iload           6
        //    93: ifne            119
        //    96: goto            100
        //    99: athrow         
        //   100: ifeq            120
        //   103: goto            107
        //   106: athrow         
        //   107: aload_1        
        //   108: aload           5
        //   110: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   115: goto            119
        //   118: athrow         
        //   119: pop            
        //   120: iload           6
        //   122: ifeq            47
        //   125: iinc            3, 1
        //   128: iload           6
        //   130: ifeq            23
        //   133: iinc            2, 1
        //   136: iload           6
        //   138: ifeq            15
        //   141: aload_1        
        //   142: aload_1        
        //   143: invokeinterface java/util/Set.size:()I
        //   148: anewarray       Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   151: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   156: checkcast       [Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   159: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/SceneObject;>;)[Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //    StackMapTable: 00 11 FF 00 0F 00 07 07 00 80 07 00 10 01 00 00 00 01 00 00 FF 00 02 00 07 07 00 80 07 00 10 01 00 00 00 01 00 02 01 01 FF 00 04 00 07 07 00 80 07 00 10 01 01 00 00 01 00 00 FF 00 17 00 07 07 00 80 07 00 10 01 01 07 00 7D 00 01 00 00 FF 00 22 00 07 07 00 80 07 00 10 01 01 07 00 7D 07 00 0B 01 00 01 07 00 EA 00 4F 07 00 EA 40 01 45 07 00 EA 00 4A 07 00 EA 40 01 00 FF 00 04 00 07 07 00 80 07 00 10 01 01 07 00 7D 00 01 00 00 02 FF 00 04 00 07 07 00 80 07 00 10 01 01 00 00 01 00 00 FF 00 07 00 07 07 00 80 07 00 10 01 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  100    115    118    119    Ljava/lang/RuntimeException;
        //  83     103    106    107    Ljava/lang/RuntimeException;
        //  74     96     99     100    Ljava/lang/RuntimeException;
        //  69     79     82     83     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
    
    public static SceneObject getNearest(final int... array) {
        return getNearest(new Filter<SceneObject>() {
            @Override
            public boolean accept(final SceneObject p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/game/api/wrappers/node/SceneObject.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/game/api/methods/node/SceneEntities$3.val$ids:[I
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
    
    public static SceneObject getNearest(final Filter<SceneObject> filter) {
        return getNearestTo(Players.getLocal(), filter);
    }
    
    public static SceneObject getNearestTo(final Locatable p0, final Filter<SceneObject> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: aconst_null    
        //     6: astore_2       
        //     7: ldc2_w          1.7976931348623157E308
        //    10: dstore_3       
        //    11: aload_0        
        //    12: invokeinterface org/powerbot/game/api/wrappers/Locatable.getRegionOffset:()Lorg/powerbot/game/api/wrappers/RegionOffset;
        //    17: astore          5
        //    19: iconst_0       
        //    20: istore          6
        //    22: iload           6
        //    24: bipush          104
        //    26: if_icmpge       189
        //    29: iconst_0       
        //    30: istore          7
        //    32: iload           7
        //    34: bipush          104
        //    36: if_icmpge       181
        //    39: iload           6
        //    41: iload           7
        //    43: iload           12
        //    45: ifne            26
        //    48: iconst_m1      
        //    49: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getLocalAt:(III)Ljava/util/Set;
        //    52: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    57: astore          8
        //    59: aload           8
        //    61: invokeinterface java/util/Iterator.hasNext:()Z
        //    66: ifeq            173
        //    69: aload           8
        //    71: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    76: checkcast       Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //    79: astore          9
        //    81: aload           9
        //    83: iload           12
        //    85: ifne            190
        //    88: ifnull          168
        //    91: goto            95
        //    94: athrow         
        //    95: aload_1        
        //    96: aload           9
        //    98: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   103: iload           12
        //   105: ifne            128
        //   108: goto            112
        //   111: athrow         
        //   112: ifeq            168
        //   115: goto            119
        //   118: athrow         
        //   119: aload           5
        //   121: invokevirtual   org/powerbot/game/api/wrappers/RegionOffset.getX:()I
        //   124: goto            128
        //   127: athrow         
        //   128: aload           5
        //   130: invokevirtual   org/powerbot/game/api/wrappers/RegionOffset.getY:()I
        //   133: iload           6
        //   135: iload           7
        //   137: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(IIII)D
        //   140: dstore          10
        //   142: dload           10
        //   144: iload           12
        //   146: ifne            164
        //   149: dload_3        
        //   150: dcmpg          
        //   151: ifge            168
        //   154: goto            158
        //   157: athrow         
        //   158: dload           10
        //   160: goto            164
        //   163: athrow         
        //   164: dstore_3       
        //   165: aload           9
        //   167: astore_2       
        //   168: iload           12
        //   170: ifeq            59
        //   173: iinc            7, 1
        //   176: iload           12
        //   178: ifeq            32
        //   181: iinc            6, 1
        //   184: iload           12
        //   186: ifeq            22
        //   189: aload_2        
        //   190: areturn        
        //    Signature:
        //  (Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/util/Filter<Lorg/powerbot/game/api/wrappers/node/SceneObject;>;)Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //    StackMapTable: 00 15 FF 00 16 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 00 00 00 00 00 01 00 00 FF 00 03 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 00 00 00 00 00 01 00 02 01 01 FF 00 05 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 00 00 00 00 01 00 00 FF 00 1A 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 07 00 7D 00 00 00 01 00 00 FF 00 22 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 07 00 7D 07 00 0B 00 00 01 00 01 07 00 EA 00 4F 07 00 EA 40 01 45 07 00 EA 00 47 07 00 EA 40 01 FF 00 1C 00 0B 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 07 00 7D 07 00 0B 03 01 00 01 07 00 EA 00 44 07 00 EA 40 03 FF 00 03 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 07 00 7D 07 00 0B 00 00 01 00 00 FF 00 04 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 07 00 7D 00 00 00 01 00 00 FF 00 07 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 01 00 00 00 00 01 00 00 FF 00 07 00 0C 07 00 88 07 00 80 07 00 0B 03 07 00 8A 01 00 00 00 00 00 01 00 00 40 07 00 0B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  149    160    163    164    Ljava/lang/RuntimeException;
        //  142    154    157    158    Ljava/lang/RuntimeException;
        //  112    124    127    128    Ljava/lang/RuntimeException;
        //  95     115    118    119    Ljava/lang/RuntimeException;
        //  88     108    111    112    Ljava/lang/RuntimeException;
        //  81     91     94     95     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0095:
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
    
    private static RSGround[][][] getRSGroundArray(final Client client) {
        final int a = Menu.a;
        RSInfo rsGroundInfo;
        final RSInfo rsInfo2;
        final RSInfo rsInfo = rsInfo2 = (rsGroundInfo = client.getRSGroundInfo());
        Label_0033: {
            Label_0023: {
                try {
                    if (a != 0) {
                        break Label_0033;
                    }
                    if (rsInfo == null) {
                        break Label_0023;
                    }
                    break Label_0023;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsInfo == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsGroundInfo = rsInfo2;
        }
        RSGroundInfo rsGroundInfo4;
        final RSGroundInfo rsGroundInfo3;
        final RSGroundInfo rsGroundInfo2 = rsGroundInfo3 = (rsGroundInfo4 = rsGroundInfo.getRSGroundInfo());
        Label_0061: {
            Label_0051: {
                try {
                    if (a != 0) {
                        break Label_0061;
                    }
                    if (rsGroundInfo2 == null) {
                        break Label_0051;
                    }
                    break Label_0051;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    if (rsGroundInfo2 == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            rsGroundInfo4 = rsGroundInfo3;
        }
        RSGround[][][] rsGroundArray;
        final RSGround[][][] array2;
        final RSGround[][][] array = array2 = (rsGroundArray = rsGroundInfo4.getRSGroundArray());
        Label_0079: {
            try {
                if (a != 0) {
                    return rsGroundArray;
                }
                if (array == null) {
                    break Label_0079;
                }
                return array2;
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
            try {
                if (array == null) {
                    return null;
                }
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
        }
        rsGroundArray = array2;
        return rsGroundArray;
    }
    
    public static SceneObject getAt(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iload_0        
        //     6: bipush          103
        //     8: iload           4
        //    10: ifne            49
        //    13: if_icmpgt       39
        //    16: goto            20
        //    19: athrow         
        //    20: iload_1        
        //    21: iload           4
        //    23: ifne            52
        //    26: goto            30
        //    29: athrow         
        //    30: bipush          103
        //    32: if_icmple       51
        //    35: goto            39
        //    38: athrow         
        //    39: iload_0        
        //    40: invokestatic    org/powerbot/game/api/methods/Game.getBaseX:()I
        //    43: isub           
        //    44: istore_0       
        //    45: iload_1        
        //    46: invokestatic    org/powerbot/game/api/methods/Game.getBaseY:()I
        //    49: isub           
        //    50: istore_1       
        //    51: iload_0        
        //    52: iload           4
        //    54: ifne            65
        //    57: iflt            165
        //    60: goto            64
        //    63: athrow         
        //    64: iload_1        
        //    65: iload           4
        //    67: ifne            78
        //    70: iflt            165
        //    73: goto            77
        //    76: athrow         
        //    77: iload_0        
        //    78: bipush          104
        //    80: iload           4
        //    82: ifne            99
        //    85: if_icmpge       165
        //    88: goto            92
        //    91: athrow         
        //    92: iload_1        
        //    93: bipush          104
        //    95: goto            99
        //    98: athrow         
        //    99: iload           4
        //   101: ifne            117
        //   104: if_icmpge       165
        //   107: goto            111
        //   110: athrow         
        //   111: iload_0        
        //   112: iload_1        
        //   113: goto            117
        //   116: athrow         
        //   117: iload_2        
        //   118: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getLocalAt:(III)Ljava/util/Set;
        //   121: astore_3       
        //   122: aload_3        
        //   123: iload           4
        //   125: ifne            145
        //   128: invokeinterface java/util/Set.size:()I
        //   133: ifle            165
        //   136: goto            140
        //   139: athrow         
        //   140: aload_3        
        //   141: goto            145
        //   144: athrow         
        //   145: aload_3        
        //   146: invokeinterface java/util/Set.size:()I
        //   151: anewarray       Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   154: invokeinterface java/util/Set.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   159: checkcast       [Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   162: iconst_0       
        //   163: aaload         
        //   164: areturn        
        //   165: aconst_null    
        //   166: areturn        
        //    StackMapTable: 00 1C FF 00 13 00 05 01 01 01 00 01 00 01 07 00 EA 00 48 07 00 EA 40 01 47 07 00 EA 00 FF 00 09 00 05 01 01 01 00 01 00 02 01 01 01 40 01 4A 07 00 EA 00 40 01 4A 07 00 EA 00 40 01 4C 07 00 EA 00 45 07 00 EA FF 00 00 00 05 01 01 01 00 01 00 02 01 01 4A 07 00 EA 00 44 07 00 EA FF 00 00 00 05 01 01 01 00 01 00 02 01 01 FF 00 15 00 05 01 01 01 07 00 74 01 00 01 07 00 EA 00 43 07 00 EA 40 07 00 74 FF 00 13 00 05 01 01 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  128    141    144    145    Ljava/lang/RuntimeException;
        //  122    136    139    140    Ljava/lang/RuntimeException;
        //  104    113    116    117    Ljava/lang/RuntimeException;
        //  99     107    110    111    Ljava/lang/RuntimeException;
        //  85     95     98     99     Ljava/lang/RuntimeException;
        //  78     88     91     92     Ljava/lang/RuntimeException;
        //  65     73     76     77     Ljava/lang/RuntimeException;
        //  52     60     63     64     Ljava/lang/RuntimeException;
        //  20     35     38     39     Ljava/lang/RuntimeException;
        //  13     26     29     30     Ljava/lang/RuntimeException;
        //  5      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    
    public static SceneObject getAt(final int n, final int n2) {
        return getAt(n, n2, -1);
    }
    
    public static SceneObject getAt(final Locatable locatable, final int n) {
        final Tile location = locatable.getLocation();
        return getAt(location.getX(), location.getY(), n);
    }
    
    public static SceneObject getAt(final Locatable locatable) {
        return getAt(locatable, -1);
    }
    
    public static Set<SceneObject> getLocalAt(final int p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_3       
        //     9: new             Ljava/util/LinkedHashSet;
        //    12: dup            
        //    13: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    16: astore          4
        //    18: aload_3        
        //    19: invokestatic    org/powerbot/game/api/methods/node/SceneEntities.getRSGroundArray:(Lorg/powerbot/game/client/Client;)[[[Lorg/powerbot/game/client/RSGround;
        //    22: astore          5
        //    24: aload           5
        //    26: ifnonnull       33
        //    29: aload           4
        //    31: areturn        
        //    32: athrow         
        //    33: aload_3        
        //    34: invokeinterface org/powerbot/game/client/Client.getPlane:()I
        //    39: istore          6
        //    41: aload           5
        //    43: iload           6
        //    45: aaload         
        //    46: iload_0        
        //    47: aaload         
        //    48: iload_1        
        //    49: aaload         
        //    50: astore          7
        //    52: aload           7
        //    54: ifnull          566
        //    57: iload_2        
        //    58: iconst_1       
        //    59: iand           
        //    60: iload           10
        //    62: ifne            187
        //    65: goto            69
        //    68: athrow         
        //    69: ifeq            184
        //    72: goto            76
        //    75: athrow         
        //    76: aload           7
        //    78: invokeinterface org/powerbot/game/client/RSGround.getRSAnimableList:()Lorg/powerbot/game/client/RSAnimableNode;
        //    83: astore          9
        //    85: aload           9
        //    87: ifnull          184
        //    90: aload           9
        //    92: invokeinterface org/powerbot/game/client/RSAnimableNode.getRSAnimable:()Lorg/powerbot/game/client/RSObject;
        //    97: astore          8
        //    99: iload           10
        //   101: ifne            179
        //   104: aload           8
        //   106: iload           10
        //   108: ifne            437
        //   111: goto            115
        //   114: athrow         
        //   115: ifnull          170
        //   118: goto            122
        //   121: athrow         
        //   122: aload           8
        //   124: instanceof      Lorg/powerbot/game/client/RSObject;
        //   127: iload           10
        //   129: ifne            169
        //   132: goto            136
        //   135: athrow         
        //   136: ifeq            170
        //   139: goto            143
        //   142: athrow         
        //   143: aload           4
        //   145: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   148: dup            
        //   149: aload           8
        //   151: checkcast       Lorg/powerbot/game/client/RSObject;
        //   154: iconst_1       
        //   155: iload           6
        //   157: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   160: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   165: goto            169
        //   168: athrow         
        //   169: pop            
        //   170: aload           9
        //   172: invokeinterface org/powerbot/game/client/RSAnimableNode.getNext:()Lorg/powerbot/game/client/RSAnimableNode;
        //   177: astore          9
        //   179: iload           10
        //   181: ifeq            85
        //   184: iload_2        
        //   185: iconst_2       
        //   186: iand           
        //   187: iload           10
        //   189: ifne            269
        //   192: ifeq            266
        //   195: goto            199
        //   198: athrow         
        //   199: aload           7
        //   201: invokeinterface org/powerbot/game/client/RSGround.getFloorDecoration:()Lorg/powerbot/game/client/RSObject;
        //   206: astore          8
        //   208: aload           8
        //   210: iload           10
        //   212: ifne            224
        //   215: ifnull          266
        //   218: goto            222
        //   221: athrow         
        //   222: aload           8
        //   224: instanceof      Lorg/powerbot/game/client/RSObject;
        //   227: iload           10
        //   229: ifne            269
        //   232: ifeq            266
        //   235: goto            239
        //   238: athrow         
        //   239: aload           4
        //   241: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   244: dup            
        //   245: aload           8
        //   247: checkcast       Lorg/powerbot/game/client/RSObject;
        //   250: iconst_2       
        //   251: iload           6
        //   253: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   256: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   261: pop            
        //   262: goto            266
        //   265: athrow         
        //   266: iload_2        
        //   267: iconst_4       
        //   268: iand           
        //   269: iload           10
        //   271: ifne            423
        //   274: ifeq            419
        //   277: goto            281
        //   280: athrow         
        //   281: aload           7
        //   283: invokeinterface org/powerbot/game/client/RSGround.getBoundary1:()Lorg/powerbot/game/client/RSObject;
        //   288: astore          8
        //   290: aload           8
        //   292: iload           10
        //   294: ifne            363
        //   297: ifnull          352
        //   300: goto            304
        //   303: athrow         
        //   304: aload           8
        //   306: iload           10
        //   308: ifne            363
        //   311: goto            315
        //   314: athrow         
        //   315: instanceof      Lorg/powerbot/game/client/RSObject;
        //   318: ifeq            352
        //   321: goto            325
        //   324: athrow         
        //   325: aload           4
        //   327: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   330: dup            
        //   331: aload           8
        //   333: checkcast       Lorg/powerbot/game/client/RSObject;
        //   336: iconst_4       
        //   337: iload           6
        //   339: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   342: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   347: pop            
        //   348: goto            352
        //   351: athrow         
        //   352: aload           7
        //   354: invokeinterface org/powerbot/game/client/RSGround.getBoundary2:()Lorg/powerbot/game/client/RSObject;
        //   359: astore          8
        //   361: aload           8
        //   363: iload           10
        //   365: ifne            377
        //   368: ifnull          419
        //   371: goto            375
        //   374: athrow         
        //   375: aload           8
        //   377: instanceof      Lorg/powerbot/game/client/RSObject;
        //   380: iload           10
        //   382: ifne            423
        //   385: ifeq            419
        //   388: goto            392
        //   391: athrow         
        //   392: aload           4
        //   394: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   397: dup            
        //   398: aload           8
        //   400: checkcast       Lorg/powerbot/game/client/RSObject;
        //   403: iconst_4       
        //   404: iload           6
        //   406: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   409: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   414: pop            
        //   415: goto            419
        //   418: athrow         
        //   419: iload_2        
        //   420: bipush          8
        //   422: iand           
        //   423: ifeq            566
        //   426: aload           7
        //   428: invokeinterface org/powerbot/game/client/RSGround.getWallDecoration1:()Lorg/powerbot/game/client/RSObject;
        //   433: astore          8
        //   435: aload           8
        //   437: iload           10
        //   439: ifne            509
        //   442: ifnull          498
        //   445: goto            449
        //   448: athrow         
        //   449: aload           8
        //   451: iload           10
        //   453: ifne            509
        //   456: goto            460
        //   459: athrow         
        //   460: instanceof      Lorg/powerbot/game/client/RSObject;
        //   463: ifeq            498
        //   466: goto            470
        //   469: athrow         
        //   470: aload           4
        //   472: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   475: dup            
        //   476: aload           8
        //   478: checkcast       Lorg/powerbot/game/client/RSObject;
        //   481: bipush          8
        //   483: iload           6
        //   485: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   488: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   493: pop            
        //   494: goto            498
        //   497: athrow         
        //   498: aload           7
        //   500: invokeinterface org/powerbot/game/client/RSGround.getWallDecoration2:()Lorg/powerbot/game/client/RSObject;
        //   505: astore          8
        //   507: aload           8
        //   509: iload           10
        //   511: ifne            523
        //   514: ifnull          566
        //   517: goto            521
        //   520: athrow         
        //   521: aload           8
        //   523: instanceof      Lorg/powerbot/game/client/RSObject;
        //   526: iload           10
        //   528: ifne            565
        //   531: ifeq            566
        //   534: goto            538
        //   537: athrow         
        //   538: aload           4
        //   540: new             Lorg/powerbot/game/api/wrappers/node/SceneObject;
        //   543: dup            
        //   544: aload           8
        //   546: checkcast       Lorg/powerbot/game/client/RSObject;
        //   549: bipush          8
        //   551: iload           6
        //   553: invokespecial   org/powerbot/game/api/wrappers/node/SceneObject.<init>:(Lorg/powerbot/game/client/RSObject;II)V
        //   556: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   561: goto            565
        //   564: athrow         
        //   565: pop            
        //   566: aload           4
        //   568: areturn        
        //    Signature:
        //  (III)Ljava/util/Set<Lorg/powerbot/game/api/wrappers/node/SceneObject;>;
        //    StackMapTable: 00 44 FF 00 20 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 00 00 00 00 01 00 01 07 00 EA 00 FF 00 22 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 00 01 00 01 07 00 EA 40 01 45 07 00 EA 00 FF 00 08 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 07 00 9D 01 00 00 FF 00 1C 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 07 00 30 07 00 9D 01 00 01 07 00 EA 40 07 00 30 45 07 00 EA 00 4C 07 00 EA 40 01 45 07 00 EA 00 58 07 00 EA 40 01 00 08 FF 00 04 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 00 01 00 00 42 01 4A 07 00 EA 00 FF 00 15 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 07 00 30 00 01 00 01 07 00 EA 00 41 07 00 30 4D 07 00 EA 00 59 07 00 EA FF 00 00 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 00 01 00 00 42 01 4A 07 00 EA 00 FF 00 15 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 07 00 30 00 01 00 01 07 00 EA 00 49 07 00 EA 40 07 00 30 48 07 00 EA 00 59 07 00 EA 00 4A 07 00 30 4A 07 00 EA 00 41 07 00 30 4D 07 00 EA 00 59 07 00 EA FF 00 00 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 00 01 00 00 43 01 FF 00 0D 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 07 00 30 00 01 00 01 07 00 30 4A 07 00 EA 00 49 07 00 EA 40 07 00 30 48 07 00 EA 00 5A 07 00 EA 00 4A 07 00 30 4A 07 00 EA 00 41 07 00 30 4D 07 00 EA 00 59 07 00 EA 40 01 FF 00 00 00 0B 01 01 01 07 00 8D 07 00 10 07 00 23 01 07 00 9B 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  531    561    564    565    Ljava/lang/RuntimeException;
        //  523    534    537    538    Ljava/lang/RuntimeException;
        //  509    517    520    521    Ljava/lang/RuntimeException;
        //  460    494    497    498    Ljava/lang/RuntimeException;
        //  449    466    469    470    Ljava/lang/RuntimeException;
        //  442    456    459    460    Ljava/lang/RuntimeException;
        //  437    445    448    449    Ljava/lang/RuntimeException;
        //  385    415    418    419    Ljava/lang/RuntimeException;
        //  377    388    391    392    Ljava/lang/RuntimeException;
        //  363    371    374    375    Ljava/lang/RuntimeException;
        //  315    348    351    352    Ljava/lang/RuntimeException;
        //  304    321    324    325    Ljava/lang/RuntimeException;
        //  297    311    314    315    Ljava/lang/RuntimeException;
        //  290    300    303    304    Ljava/lang/RuntimeException;
        //  269    277    280    281    Ljava/lang/RuntimeException;
        //  232    262    265    266    Ljava/lang/RuntimeException;
        //  224    235    238    239    Ljava/lang/RuntimeException;
        //  208    218    221    222    Ljava/lang/RuntimeException;
        //  187    195    198    199    Ljava/lang/RuntimeException;
        //  136    165    168    169    Ljava/lang/RuntimeException;
        //  122    139    142    143    Ljava/lang/RuntimeException;
        //  115    132    135    136    Ljava/lang/RuntimeException;
        //  104    118    121    122    Ljava/lang/RuntimeException;
        //  99     111    114    115    Ljava/lang/RuntimeException;
        //  57     72     75     76     Ljava/lang/RuntimeException;
        //  52     65     68     69     Ljava/lang/RuntimeException;
        //  24     32     32     33     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0115:
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
    
    static {
        ALL_FILTER = new Filter<SceneObject>() {
            @Override
            public boolean accept(final SceneObject sceneObject) {
                return true;
            }
        };
    }
}
