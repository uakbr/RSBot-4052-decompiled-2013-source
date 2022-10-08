
package org.powerbot.game.api.wrappers.map;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.methods.Calculations;
import java.util.EnumSet;
import java.util.Arrays;
import org.powerbot.game.api.wrappers.Tile;

public class TilePath extends Path
{
    protected Tile[] tiles;
    protected Tile[] orig;
    private boolean end;
    
    public TilePath(final Tile[] array) {
        this.orig = array;
        this.tiles = Arrays.copyOf(array, array.length);
    }
    
    @Override
    public boolean traverse(final EnumSet<TraversalOption> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/game/api/wrappers/map/TilePath.getNext:()Lorg/powerbot/game/api/wrappers/Tile;
        //     9: astore_2       
        //    10: aload_2        
        //    11: iload           4
        //    13: ifne            27
        //    16: ifnonnull       26
        //    19: goto            23
        //    22: athrow         
        //    23: iconst_0       
        //    24: ireturn        
        //    25: athrow         
        //    26: aload_2        
        //    27: aload_0        
        //    28: invokevirtual   org/powerbot/game/api/wrappers/map/TilePath.getEnd:()Lorg/powerbot/game/api/wrappers/Tile;
        //    31: invokevirtual   org/powerbot/game/api/wrappers/Tile.equals:(Ljava/lang/Object;)Z
        //    34: iload           4
        //    36: ifne            56
        //    39: ifeq            146
        //    42: goto            46
        //    45: athrow         
        //    46: aload_2        
        //    47: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //    50: dconst_1       
        //    51: dcmpg          
        //    52: goto            56
        //    55: athrow         
        //    56: iload           4
        //    58: ifne            135
        //    61: ifle            134
        //    64: goto            68
        //    67: athrow         
        //    68: aload_0        
        //    69: iload           4
        //    71: ifne            137
        //    74: goto            78
        //    77: athrow         
        //    78: getfield        org/powerbot/game/api/wrappers/map/TilePath.end:Z
        //    81: ifeq            136
        //    84: goto            88
        //    87: athrow         
        //    88: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //    91: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isMoving:()Z
        //    94: iload           4
        //    96: ifne            135
        //    99: goto            103
        //   102: athrow         
        //   103: ifeq            134
        //   106: goto            110
        //   109: athrow         
        //   110: aload_2        
        //   111: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   114: ldc2_w          3.0
        //   117: dcmpg          
        //   118: iload           4
        //   120: ifne            135
        //   123: goto            127
        //   126: athrow         
        //   127: ifge            136
        //   130: goto            134
        //   133: athrow         
        //   134: iconst_0       
        //   135: ireturn        
        //   136: aload_0        
        //   137: iconst_1       
        //   138: putfield        org/powerbot/game/api/wrappers/map/TilePath.end:Z
        //   141: iload           4
        //   143: ifeq            155
        //   146: aload_0        
        //   147: iconst_0       
        //   148: putfield        org/powerbot/game/api/wrappers/map/TilePath.end:Z
        //   151: goto            155
        //   154: athrow         
        //   155: aload_1        
        //   156: iload           4
        //   158: ifne            242
        //   161: ifnull          241
        //   164: goto            168
        //   167: athrow         
        //   168: aload_1        
        //   169: iload           4
        //   171: ifne            242
        //   174: goto            178
        //   177: athrow         
        //   178: getstatic       org/powerbot/game/api/wrappers/map/Path$TraversalOption.HANDLE_RUN:Lorg/powerbot/game/api/wrappers/map/Path$TraversalOption;
        //   181: invokevirtual   java/util/EnumSet.contains:(Ljava/lang/Object;)Z
        //   184: ifeq            241
        //   187: goto            191
        //   190: athrow         
        //   191: invokestatic    org/powerbot/game/api/methods/Walking.isRunEnabled:()Z
        //   194: iload           4
        //   196: ifne            213
        //   199: goto            203
        //   202: athrow         
        //   203: ifne            241
        //   206: goto            210
        //   209: athrow         
        //   210: invokestatic    org/powerbot/game/api/methods/Walking.getEnergy:()I
        //   213: iload           4
        //   215: ifne            238
        //   218: bipush          50
        //   220: if_icmple       241
        //   223: goto            227
        //   226: athrow         
        //   227: iconst_1       
        //   228: invokestatic    org/powerbot/game/api/methods/Walking.setRun:(Z)V
        //   231: sipush          300
        //   234: goto            238
        //   237: athrow         
        //   238: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   241: aload_1        
        //   242: iload           4
        //   244: ifne            255
        //   247: ifnull          368
        //   250: goto            254
        //   253: athrow         
        //   254: aload_1        
        //   255: getstatic       org/powerbot/game/api/wrappers/map/Path$TraversalOption.SPACE_ACTIONS:Lorg/powerbot/game/api/wrappers/map/Path$TraversalOption;
        //   258: invokevirtual   java/util/EnumSet.contains:(Ljava/lang/Object;)Z
        //   261: iload           4
        //   263: ifne            372
        //   266: ifeq            368
        //   269: goto            273
        //   272: athrow         
        //   273: invokestatic    org/powerbot/game/api/methods/Walking.getDestination:()Lorg/powerbot/game/api/wrappers/Tile;
        //   276: astore_3       
        //   277: aload_3        
        //   278: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //   281: iload           4
        //   283: ifne            372
        //   286: iconst_m1      
        //   287: if_icmpeq       368
        //   290: goto            294
        //   293: athrow         
        //   294: invokestatic    org/powerbot/game/api/methods/interactive/Players.getLocal:()Lorg/powerbot/game/api/wrappers/interactive/Player;
        //   297: invokevirtual   org/powerbot/game/api/wrappers/interactive/Player.isMoving:()Z
        //   300: iload           4
        //   302: ifne            372
        //   305: goto            309
        //   308: athrow         
        //   309: ifeq            368
        //   312: goto            316
        //   315: athrow         
        //   316: aload_3        
        //   317: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   320: ldc2_w          5.0
        //   323: dcmpl          
        //   324: iload           4
        //   326: ifne            372
        //   329: goto            333
        //   332: athrow         
        //   333: ifle            368
        //   336: goto            340
        //   339: athrow         
        //   340: aload_2        
        //   341: aload_3        
        //   342: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   345: ldc2_w          7.0
        //   348: dcmpg          
        //   349: iload           4
        //   351: ifne            372
        //   354: goto            358
        //   357: athrow         
        //   358: ifge            368
        //   361: goto            365
        //   364: athrow         
        //   365: iconst_1       
        //   366: ireturn        
        //   367: athrow         
        //   368: aload_2        
        //   369: invokestatic    org/powerbot/game/api/methods/Walking.walk:(Lorg/powerbot/game/api/wrappers/Locatable;)Z
        //   372: ireturn        
        //    Signature:
        //  (Ljava/util/EnumSet<Lorg/powerbot/game/api/wrappers/map/Path$TraversalOption;>;)Z
        //    StackMapTable: 00 44 FF 00 16 00 05 07 00 27 07 00 54 07 00 25 00 01 00 01 07 00 A3 00 41 07 00 A3 00 40 07 00 25 51 07 00 A3 00 48 07 00 A3 40 01 4A 07 00 A3 00 48 07 00 A3 40 07 00 27 48 07 00 A3 00 4D 07 00 A3 40 01 45 07 00 A3 00 4F 07 00 A3 40 01 45 07 00 A3 00 40 01 00 40 07 00 27 08 47 07 00 A3 00 4B 07 00 A3 00 48 07 00 A3 40 07 00 54 4B 07 00 A3 00 4A 07 00 A3 40 01 45 07 00 A3 00 42 01 4C 07 00 A3 00 49 07 00 A3 40 01 02 40 07 00 54 4A 07 00 A3 00 40 07 00 54 50 07 00 A3 00 FF 00 13 00 05 07 00 27 07 00 54 07 00 25 07 00 25 01 00 01 07 00 A3 00 4D 07 00 A3 40 01 45 07 00 A3 00 4F 07 00 A3 40 01 45 07 00 A3 00 50 07 00 A3 40 01 45 07 00 A3 00 41 07 00 A3 FF 00 00 00 05 07 00 27 07 00 54 07 00 25 00 01 00 00 43 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  358    367    367    368    Ljava/lang/RuntimeException;
        //  340    361    364    365    Ljava/lang/RuntimeException;
        //  333    354    357    358    Ljava/lang/RuntimeException;
        //  316    336    339    340    Ljava/lang/RuntimeException;
        //  309    329    332    333    Ljava/lang/RuntimeException;
        //  294    312    315    316    Ljava/lang/RuntimeException;
        //  286    305    308    309    Ljava/lang/RuntimeException;
        //  277    290    293    294    Ljava/lang/RuntimeException;
        //  255    269    272    273    Ljava/lang/RuntimeException;
        //  242    250    253    254    Ljava/lang/RuntimeException;
        //  218    234    237    238    Ljava/lang/RuntimeException;
        //  213    223    226    227    Ljava/lang/RuntimeException;
        //  191    206    209    210    Ljava/lang/RuntimeException;
        //  178    199    202    203    Ljava/lang/RuntimeException;
        //  168    187    190    191    Ljava/lang/RuntimeException;
        //  161    174    177    178    Ljava/lang/RuntimeException;
        //  155    164    167    168    Ljava/lang/RuntimeException;
        //  137    151    154    155    Ljava/lang/RuntimeException;
        //  110    130    133    134    Ljava/lang/RuntimeException;
        //  103    123    126    127    Ljava/lang/RuntimeException;
        //  88     106    109    110    Ljava/lang/RuntimeException;
        //  78     99     102    103    Ljava/lang/RuntimeException;
        //  68     84     87     88     Ljava/lang/RuntimeException;
        //  61     74     77     78     Ljava/lang/RuntimeException;
        //  56     64     67     68     Ljava/lang/RuntimeException;
        //  39     52     55     56     Ljava/lang/RuntimeException;
        //  27     42     45     46     Ljava/lang/RuntimeException;
        //  16     25     25     26     Ljava/lang/RuntimeException;
        //  10     19     22     23     Ljava/lang/RuntimeException;
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
    public boolean validate() {
        final int a = Path.a;
        double n2 = 0.0;
        Label_0072: {
            Label_0047: {
                Tile tile2 = null;
                Label_0039: {
                    Tile tile = null;
                    Label_0025: {
                        TilePath tilePath = null;
                        Label_0020: {
                            try {
                                tilePath = this;
                                if (a != 0) {
                                    break Label_0025;
                                }
                                final Tile[] array = this.tiles;
                                final int n = array.length;
                                if (n > 0) {
                                    break Label_0020;
                                }
                                break Label_0072;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                final Tile[] array = this.tiles;
                                final int n = array.length;
                                if (n <= 0) {
                                    break Label_0072;
                                }
                                tilePath = this;
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            tile = (tile2 = tilePath.getNext());
                            if (a != 0) {
                                break Label_0047;
                            }
                            if (tile != null) {
                                break Label_0039;
                            }
                            break Label_0072;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (tile == null) {
                            break Label_0072;
                        }
                        tile2 = this.getEnd();
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                try {
                    n2 = dcmpl(Calculations.distanceTo(tile2), Math.sqrt(2.0));
                    if (a != 0) {
                        return n2 != 0.0;
                    }
                    if (n2 <= 0) {
                        break Label_0072;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            return n2 != 0.0;
        }
        return n2 != 0.0;
    }
    
    @Override
    public Tile getNext() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: invokestatic    org/powerbot/game/api/methods/Walking.getDestination:()Lorg/powerbot/game/api/wrappers/Tile;
        //     7: astore_1       
        //     8: aload_0        
        //     9: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //    12: arraylength    
        //    13: iconst_1       
        //    14: isub           
        //    15: istore_2       
        //    16: iload_2        
        //    17: iflt            171
        //    20: aload_0        
        //    21: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //    24: iload_2        
        //    25: aaload         
        //    26: invokevirtual   org/powerbot/game/api/wrappers/Tile.isOnMap:()Z
        //    29: iload_3        
        //    30: ifne            61
        //    33: ifeq            164
        //    36: goto            40
        //    39: athrow         
        //    40: aload_0        
        //    41: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //    44: iload_2        
        //    45: aaload         
        //    46: iload_3        
        //    47: ifne            163
        //    50: goto            54
        //    53: athrow         
        //    54: invokevirtual   org/powerbot/game/api/wrappers/Tile.canReach:()Z
        //    57: goto            61
        //    60: athrow         
        //    61: ifne            153
        //    64: iload_2        
        //    65: iload_3        
        //    66: ifne            88
        //    69: goto            73
        //    72: athrow         
        //    73: ifeq            164
        //    76: goto            80
        //    79: athrow         
        //    80: aload_1        
        //    81: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    84: goto            88
        //    87: athrow         
        //    88: iload_3        
        //    89: ifne            150
        //    92: iconst_m1      
        //    93: if_icmpeq       127
        //    96: goto            100
        //    99: athrow         
        //   100: aload_1        
        //   101: aload_0        
        //   102: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //   105: iload_2        
        //   106: iconst_1       
        //   107: isub           
        //   108: aaload         
        //   109: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   112: ldc2_w          3.0
        //   115: dcmpg          
        //   116: ifge            164
        //   119: goto            123
        //   122: athrow         
        //   123: goto            153
        //   126: athrow         
        //   127: aload_0        
        //   128: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //   131: iload_2        
        //   132: iconst_1       
        //   133: isub           
        //   134: aaload         
        //   135: iload_3        
        //   136: ifne            163
        //   139: invokestatic    org/powerbot/game/api/methods/Calculations.distanceTo:(Lorg/powerbot/game/api/wrappers/Locatable;)D
        //   142: ldc2_w          7.0
        //   145: dcmpg          
        //   146: goto            150
        //   149: athrow         
        //   150: ifge            164
        //   153: aload_0        
        //   154: getfield        org/powerbot/game/api/wrappers/map/TilePath.tiles:[Lorg/powerbot/game/api/wrappers/Tile;
        //   157: iload_2        
        //   158: aaload         
        //   159: goto            163
        //   162: athrow         
        //   163: areturn        
        //   164: iinc            2, -1
        //   167: iload_3        
        //   168: ifeq            16
        //   171: aconst_null    
        //   172: areturn        
        //    StackMapTable: 00 1A FE 00 10 07 00 25 01 01 56 07 00 A3 00 4C 07 00 A3 40 07 00 25 45 07 00 A3 40 01 4A 07 00 A3 40 01 45 07 00 A3 00 46 07 00 A3 40 01 4A 07 00 A3 00 55 07 00 A3 00 42 07 00 A3 00 55 07 00 A3 40 01 02 48 07 00 A3 40 07 00 25 00 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  150    159    162    163    Ljava/lang/RuntimeException;
        //  127    146    149    150    Ljava/lang/RuntimeException;
        //  100    126    126    127    Ljava/lang/RuntimeException;
        //  92     119    122    123    Ljava/lang/RuntimeException;
        //  88     96     99     100    Ljava/lang/RuntimeException;
        //  73     84     87     88     Ljava/lang/RuntimeException;
        //  64     76     79     80     Ljava/lang/RuntimeException;
        //  61     69     72     73     Ljava/lang/RuntimeException;
        //  40     57     60     61     Ljava/lang/RuntimeException;
        //  33     50     53     54     Ljava/lang/RuntimeException;
        //  20     36     39     40     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    public Tile getStart() {
        return this.tiles[0];
    }
    
    @Override
    public Tile getEnd() {
        return this.tiles[this.tiles.length - 1];
    }
    
    public TilePath randomize(final int n, final int n2) {
        final int a = Path.a;
        int i = 0;
        while (i < this.tiles.length) {
            try {
                final TilePath tilePath = this;
                if (a != 0) {
                    return tilePath;
                }
                this.tiles[i] = this.orig[i].derive(Random.nextInt(-n, n + 1), Random.nextInt(-n2, n2 + 1));
                ++i;
                if (a == 0) {
                    continue;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            break;
        }
        return this;
    }
    
    public TilePath reverse() {
        final int a = Path.a;
        Tile[] array = new Tile[this.tiles.length];
        int i = 0;
    Label_0083:
        while (true) {
            while (i < this.orig.length) {
                try {
                    array[i] = this.orig[this.tiles.length - 1 - i];
                    ++i;
                    if (a != 0) {
                        break Label_0083;
                    }
                    if (a == 0) {
                        continue;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                int a2 = Task.a;
                Task.a = ++a2;
                break;
                int j = 0;
                while (j < this.tiles.length) {
                    try {
                        array[j] = this.tiles[this.tiles.length - 1 - j];
                        ++j;
                        if (a != 0) {
                            return this;
                        }
                        if (a == 0) {
                            continue;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    break;
                }
                this.tiles = array;
                return this;
            }
            this.orig = array;
            array = new Tile[this.tiles.length];
            continue Label_0083;
        }
    }
    
    public Tile[] toArray() {
        final Tile[] array = new Tile[this.tiles.length];
        System.arraycopy(this.tiles, 0, array, 0, this.tiles.length);
        return array;
    }
}
