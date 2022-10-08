
package org.powerbot.game.api.wrappers;

import java.util.ArrayList;
import org.powerbot.game.api.methods.interactive.Players;
import java.awt.Rectangle;
import org.powerbot.core.script.job.Task;
import java.awt.Polygon;

public class Area
{
    protected final Polygon polygon;
    protected int plane;
    private Tile[] tileArrayCache;
    private static final String z;
    
    public Area(final Tile tile, final Tile tile2) {
        final boolean a = Tile.a;
        this(new Tile[] { new Tile(Math.min(tile.getX(), tile2.getX()), Math.min(tile.getY(), tile2.getY()), tile.getPlane()), new Tile(Math.max(tile.getX(), tile2.getX()), Math.min(tile.getY(), tile2.getY()), tile.getPlane()), new Tile(Math.max(tile.getX(), tile2.getX()), Math.max(tile.getY(), tile2.getY()), tile2.getPlane()), new Tile(Math.min(tile.getX(), tile2.getX()), Math.max(tile.getY(), tile2.getY()), tile2.getPlane()) });
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    public Area(final Tile... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: iconst_m1      
        //    11: putfield        org/powerbot/game/api/wrappers/Area.plane:I
        //    14: aload_0        
        //    15: aconst_null    
        //    16: putfield        org/powerbot/game/api/wrappers/Area.tileArrayCache:[Lorg/powerbot/game/api/wrappers/Tile;
        //    19: aload_0        
        //    20: new             Ljava/awt/Polygon;
        //    23: dup            
        //    24: invokespecial   java/awt/Polygon.<init>:()V
        //    27: putfield        org/powerbot/game/api/wrappers/Area.polygon:Ljava/awt/Polygon;
        //    30: aload_1        
        //    31: astore_2       
        //    32: aload_2        
        //    33: arraylength    
        //    34: istore_3       
        //    35: iconst_0       
        //    36: istore          4
        //    38: iload           4
        //    40: iload_3        
        //    41: if_icmpge       121
        //    44: aload_2        
        //    45: iload           4
        //    47: aaload         
        //    48: astore          5
        //    50: aload_0        
        //    51: iload           6
        //    53: ifne            108
        //    56: getfield        org/powerbot/game/api/wrappers/Area.plane:I
        //    59: iconst_m1      
        //    60: if_icmpeq       98
        //    63: goto            67
        //    66: athrow         
        //    67: aload           5
        //    69: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //    72: aload_0        
        //    73: getfield        org/powerbot/game/api/wrappers/Area.plane:I
        //    76: if_icmpeq       98
        //    79: goto            83
        //    82: athrow         
        //    83: new             Ljava/lang/RuntimeException;
        //    86: dup            
        //    87: getstatic       org/powerbot/game/api/wrappers/Area.z:Ljava/lang/String;
        //    90: invokestatic    org/powerbot/game/client/RandomAccessFile.e:(Ljava/lang/String;)Ljava/lang/String;
        //    93: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    96: athrow         
        //    97: athrow         
        //    98: aload_0        
        //    99: aload           5
        //   101: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //   104: putfield        org/powerbot/game/api/wrappers/Area.plane:I
        //   107: aload_0        
        //   108: aload           5
        //   110: invokevirtual   org/powerbot/game/api/wrappers/Area.addTile:(Lorg/powerbot/game/api/wrappers/Tile;)V
        //   113: iinc            4, 1
        //   116: iload           6
        //   118: ifeq            38
        //   121: return         
        //    StackMapTable: 00 09 FF 00 26 00 07 07 00 31 07 00 30 07 00 30 01 01 00 01 00 00 FF 00 1B 00 07 07 00 31 07 00 30 07 00 30 01 01 07 00 01 01 00 01 07 00 0F 00 4E 07 00 0F 00 4D 07 00 0F 00 49 07 00 31 FF 00 0C 00 07 07 00 31 07 00 30 07 00 30 01 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  67     97     97     98     Ljava/lang/RuntimeException;
        //  56     79     82     83     Ljava/lang/RuntimeException;
        //  50     63     66     67     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    
    public void translate(final int deltaX, final int deltaY) {
        this.polygon.translate(deltaX, deltaY);
        this.tileArrayCache = null;
    }
    
    public Rectangle getBounds() {
        return this.polygon.getBounds();
    }
    
    public int getPlane() {
        return this.plane;
    }
    
    public void addTile(final Tile tile) {
        this.addTile(tile.getX(), tile.getY());
    }
    
    public void addTile(final int x, final int y) {
        this.polygon.addPoint(x, y);
        this.tileArrayCache = null;
    }
    
    public boolean contains(final int x, final int y) {
        return this.polygon.contains(x, y);
    }
    
    public boolean contains(final Locatable... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_1        
        //     6: astore_2       
        //     7: aload_2        
        //     8: arraylength    
        //     9: istore_3       
        //    10: iconst_0       
        //    11: istore          4
        //    13: iload           4
        //    15: iload_3        
        //    16: if_icmpge       130
        //    19: aload_2        
        //    20: iload           4
        //    22: aaload         
        //    23: astore          5
        //    25: aload           5
        //    27: iload           7
        //    29: ifne            44
        //    32: ifnonnull       42
        //    35: goto            39
        //    38: athrow         
        //    39: goto            122
        //    42: aload           5
        //    44: invokeinterface org/powerbot/game/api/wrappers/Locatable.getLocation:()Lorg/powerbot/game/api/wrappers/Tile;
        //    49: astore          6
        //    51: iload           7
        //    53: ifne            125
        //    56: aload           6
        //    58: ifnull          122
        //    61: goto            65
        //    64: athrow         
        //    65: aload_0        
        //    66: getfield        org/powerbot/game/api/wrappers/Area.plane:I
        //    69: iload           7
        //    71: ifne            108
        //    74: goto            78
        //    77: athrow         
        //    78: aload           6
        //    80: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPlane:()I
        //    83: if_icmpne       122
        //    86: goto            90
        //    89: athrow         
        //    90: aload_0        
        //    91: aload           6
        //    93: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    96: aload           6
        //    98: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //   101: invokevirtual   org/powerbot/game/api/wrappers/Area.contains:(II)Z
        //   104: goto            108
        //   107: athrow         
        //   108: iload           7
        //   110: ifne            121
        //   113: ifeq            122
        //   116: goto            120
        //   119: athrow         
        //   120: iconst_1       
        //   121: ireturn        
        //   122: iinc            4, 1
        //   125: iload           7
        //   127: ifeq            13
        //   130: iconst_0       
        //   131: ireturn        
        //    StackMapTable: 00 13 FF 00 0D 00 08 07 00 31 07 00 C8 07 00 C8 01 01 00 00 01 00 00 FF 00 18 00 08 07 00 31 07 00 C8 07 00 C8 01 01 07 00 19 00 01 00 01 07 00 0F 00 02 41 07 00 19 FF 00 13 00 08 07 00 31 07 00 C8 07 00 C8 01 01 07 00 19 07 00 01 01 00 01 07 00 0F 00 4B 07 00 0F 40 01 4A 07 00 0F 00 50 07 00 0F 40 01 4A 07 00 0F 00 40 01 FF 00 00 00 08 07 00 31 07 00 C8 07 00 C8 01 01 07 00 19 00 01 00 00 02 FF 00 04 00 08 07 00 31 07 00 C8 07 00 C8 01 01 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  108    116    119    120    Ljava/lang/RuntimeException;
        //  78     104    107    108    Ljava/lang/RuntimeException;
        //  65     86     89     90     Ljava/lang/RuntimeException;
        //  56     74     77     78     Ljava/lang/RuntimeException;
        //  51     61     64     65     Ljava/lang/RuntimeException;
        //  25     35     38     39     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public boolean containsAll(final Locatable... array) {
        final boolean a = Tile.a;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Locatable locatable = array[i];
            Label_0061: {
                Label_0052: {
                    try {
                        if (locatable == null) {
                            return false;
                        }
                        final Area area = this;
                        final int n = 1;
                        final Locatable[] array2 = new Locatable[n];
                        final int n2 = 0;
                        final Locatable locatable2 = locatable;
                        array2[n2] = locatable2;
                        final boolean b2;
                        final boolean b = b2 = area.contains(array2);
                        final boolean b3 = a;
                        if (!b3) {
                            break Label_0052;
                        }
                        return b;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Area area = this;
                        final int n = 1;
                        final Locatable[] array2 = new Locatable[n];
                        final int n2 = 0;
                        final Locatable locatable2 = locatable;
                        array2[n2] = locatable2;
                        final boolean b2;
                        final boolean b = b2 = area.contains(array2);
                        final boolean b3 = a;
                        if (b3) {
                            return b;
                        }
                        if (b2) {
                            break Label_0061;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return false;
            }
            ++i;
            if (a) {
                break;
            }
            continue;
            return false;
        }
        return true;
    }
    
    public Tile getCentralTile() {
        try {
            if (this.polygon.npoints > 0) {
                return new Tile((int)Math.round(this.avg(this.polygon.xpoints)), (int)Math.round(this.avg(this.polygon.ypoints)), this.plane);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return null;
    }
    
    public Tile getNearest() {
        return this.getNearest(Players.getLocal());
    }
    
    public Tile getNearest(final Locatable p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/game/api/wrappers/Area.getTileArray:()[Lorg/powerbot/game/api/wrappers/Tile;
        //     9: astore_2       
        //    10: aconst_null    
        //    11: astore_3       
        //    12: ldc2_w          1.7976931348623157E308
        //    15: dstore          4
        //    17: aload_2        
        //    18: astore          8
        //    20: aload           8
        //    22: arraylength    
        //    23: istore          9
        //    25: iconst_0       
        //    26: istore          10
        //    28: iload           10
        //    30: iload           9
        //    32: if_icmpge       112
        //    35: aload           8
        //    37: iload           10
        //    39: aaload         
        //    40: astore          11
        //    42: aload_1        
        //    43: aload           11
        //    45: invokestatic    org/powerbot/game/api/methods/Calculations.distance:(Lorg/powerbot/game/api/wrappers/Locatable;Lorg/powerbot/game/api/wrappers/Locatable;)D
        //    48: dstore          6
        //    50: aload_3        
        //    51: iload           12
        //    53: ifne            113
        //    56: iload           12
        //    58: ifne            103
        //    61: goto            65
        //    64: athrow         
        //    65: ifnull          93
        //    68: goto            72
        //    71: athrow         
        //    72: dload           6
        //    74: iload           12
        //    76: ifne            99
        //    79: goto            83
        //    82: athrow         
        //    83: dload           4
        //    85: dcmpg          
        //    86: ifge            104
        //    89: goto            93
        //    92: athrow         
        //    93: dload           6
        //    95: goto            99
        //    98: athrow         
        //    99: dstore          4
        //   101: aload           11
        //   103: astore_3       
        //   104: iinc            10, 1
        //   107: iload           12
        //   109: ifeq            28
        //   112: aload_3        
        //   113: areturn        
        //    StackMapTable: 00 0F FF 00 1C 00 0C 07 00 31 07 00 19 07 00 30 07 00 01 03 00 00 07 00 30 01 01 00 01 00 00 FF 00 23 00 0B 07 00 31 07 00 19 07 00 30 07 00 01 03 03 07 00 30 01 01 07 00 01 01 00 01 07 00 0F 40 07 00 01 45 07 00 0F 00 49 07 00 0F 40 03 48 07 00 0F 00 44 07 00 0F 40 03 43 07 00 01 00 FF 00 07 00 0C 07 00 31 07 00 19 07 00 30 07 00 01 03 00 00 07 00 30 01 01 00 01 00 00 40 07 00 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  83     95     98     99     Ljava/lang/RuntimeException;
        //  72     89     92     93     Ljava/lang/RuntimeException;
        //  65     79     82     83     Ljava/lang/RuntimeException;
        //  56     68     71     72     Ljava/lang/RuntimeException;
        //  50     61     64     65     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public Tile[] getBoundingTiles() {
        final boolean a = Tile.a;
        final Tile[] array = new Tile[this.polygon.npoints];
        int i = 0;
        Tile[] array2 = null;
        while (i < this.polygon.npoints) {
            try {
                array2 = array;
                if (a) {
                    return array2;
                }
                array2[i] = new Tile(this.polygon.xpoints[i], this.polygon.ypoints[i], this.plane);
                ++i;
                if (!a) {
                    continue;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            break;
        }
        return array2;
    }
    
    public Tile[] getTileArray() {
        final boolean a = Tile.a;
        Tile[] tileArrayCache = null;
        Label_0172: {
            try {
                tileArrayCache = this.tileArrayCache;
                if (a) {
                    return tileArrayCache;
                }
                if (tileArrayCache != null) {
                    break Label_0172;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Rectangle bounds = this.getBounds();
            final ArrayList list = new ArrayList<Tile>(bounds.width * bounds.height);
            final int n = bounds.x + bounds.width;
            final int n2 = bounds.y + bounds.height;
            int x = bounds.x;
            do {
                int i = 0;
                Label_0070: {
                    i = x;
                }
                Label_0072:
                while (i < n) {
                    int j = bounds.y;
                    while (j < n2) {
                        final int n3 = i = (this.contains(x, j) ? 1 : 0);
                        if (a) {
                            continue Label_0072;
                        }
                        Label_0137: {
                            Label_0114: {
                                try {
                                    if (a) {
                                        break Label_0137;
                                    }
                                    if (n3 != 0) {
                                        break Label_0114;
                                    }
                                    break Label_0137;
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                                try {
                                    if (n3 != 0) {
                                        list.add(new Tile(x, j, this.plane));
                                    }
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                            }
                        }
                        ++j;
                        if (a) {
                            break;
                        }
                    }
                    ++x;
                    continue Label_0070;
                }
                break;
            } while (!a);
            this.tileArrayCache = list.toArray(new Tile[list.size()]);
        }
        final Tile[] tileArrayCache2 = this.tileArrayCache;
        return tileArrayCache;
    }
    
    private double avg(final int... array) {
        final boolean a = Tile.a;
        long n = 0L;
        final int length = array.length;
        int i = 0;
        long n2 = 0L;
        while (i < length) {
            n2 = n + array[i];
            if (a) {
                return n2 / (double)array.length;
            }
            n = n2;
            ++i;
            if (a) {
                break;
            }
        }
        return n2 / (double)array.length;
    }
    
    static {
        final char[] charArray = "\u0018I\fU&2{#h\t\u0017T\u001d\u0014u#d6t[\r\u001bZP".toCharArray();
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
                            c2 = '\u000e';
                            break;
                        }
                        case 1: {
                            c2 = 'c';
                            break;
                        }
                        case 2: {
                            c2 = '\u001e';
                            break;
                        }
                        case 3: {
                            c2 = 'l';
                            break;
                        }
                        default: {
                            c2 = 'q';
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
