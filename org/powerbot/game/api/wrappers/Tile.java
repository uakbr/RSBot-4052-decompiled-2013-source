
package org.powerbot.game.api.wrappers;

import org.powerbot.core.bot.handlers.ScriptHandler;
import org.o;
import java.awt.Graphics;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.methods.Walking;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.Polygon;
import org.powerbot.game.api.methods.Calculations;
import java.awt.Point;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.util.Random;

public class Tile implements Entity, Locatable, Identifiable
{
    protected final int x;
    protected final int y;
    protected final int plane;
    public static boolean a;
    private static final String[] z;
    
    public Tile(final int x, final int y, final int plane) {
        this.x = x;
        this.y = y;
        this.plane = plane;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public int getPlane() {
        return this.plane;
    }
    
    public Tile randomize(final int n, final int n2, final int n3, final int n4) {
        return this.derive(Random.nextInt(n, n2 + 1), Random.nextInt(n3, n4 + 1));
    }
    
    public Tile randomize(final int n, final int n2) {
        return this.randomize(-n, n, -n2, n2);
    }
    
    public Tile derive(final int n, final int n2) {
        return new Tile(this.x + n, this.y + n2, this.plane);
    }
    
    @Override
    public boolean validate() {
        final boolean a = Tile.a;
        final int n = this.x - Game.getBaseX();
        final int n2 = this.y - Game.getBaseY();
        int n7 = 0;
        Label_0078: {
            int n6 = 0;
            Label_0065: {
                Label_0053: {
                    int n5 = 0;
                    Label_0048: {
                        int n4 = 0;
                        Label_0035: {
                            try {
                                final int n3 = n4 = (n5 = (n6 = (n7 = n)));
                                if (a) {
                                    break Label_0035;
                                }
                                if (n3 < 0) {
                                    return false;
                                }
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            n5 = (n4 = (n6 = (n7 = n)));
                            try {
                                if (a) {
                                    break Label_0053;
                                }
                                final int n8 = 104;
                                if (n4 < n8) {
                                    break Label_0048;
                                }
                                return false;
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            final int n8 = 104;
                            if (n4 >= n8) {
                                return false;
                            }
                            n6 = (n5 = (n7 = n2));
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (a) {
                            break Label_0065;
                        }
                        if (n5 < 0) {
                            return false;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                n7 = (n6 = n2);
                try {
                    if (a) {
                        return n7 != 0;
                    }
                    final int n9 = 104;
                    if (n6 < n9) {
                        break Label_0078;
                    }
                    return false;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            try {
                final int n9 = 104;
                if (n6 >= n9) {
                    return false;
                }
                n7 = (true ? 1 : 0);
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
        }
        return n7 != 0;
        n7 = (false ? 1 : 0);
        return n7 != 0;
    }
    
    public Point getMapPoint() {
        return Calculations.worldToMap(this.x, this.y);
    }
    
    public boolean isOnMap() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokevirtual   org/powerbot/game/api/wrappers/Tile.getMapPoint:()Ljava/awt/Point;
        //     8: astore_1       
        //     9: aload_1        
        //    10: getfield        java/awt/Point.x:I
        //    13: iconst_m1      
        //    14: iload_2        
        //    15: ifne            42
        //    18: if_icmpeq       49
        //    21: goto            25
        //    24: athrow         
        //    25: aload_1        
        //    26: getfield        java/awt/Point.y:I
        //    29: iload_2        
        //    30: ifne            46
        //    33: goto            37
        //    36: athrow         
        //    37: iconst_m1      
        //    38: goto            42
        //    41: athrow         
        //    42: if_icmpeq       49
        //    45: iconst_1       
        //    46: goto            50
        //    49: iconst_0       
        //    50: ireturn        
        //    StackMapTable: 00 09 FF 00 18 00 03 07 00 08 07 00 82 01 00 01 07 00 E5 00 4A 07 00 E5 40 01 43 07 00 E5 FF 00 00 00 03 07 00 08 07 00 82 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  25     38     41     42     Ljava/lang/RuntimeException;
        //  18     33     36     37     Ljava/lang/RuntimeException;
        //  9      21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    public Point getCentralPoint() {
        return this.getPoint(0.5, 0.5, 0);
    }
    
    @Override
    public Point getNextViewportPoint() {
        return this.getPoint(Random.nextDouble(), Random.nextDouble(), 0);
    }
    
    @Override
    public boolean contains(final Point p) {
        final boolean a = Tile.a;
        final Polygon[] bounds = this.getBounds();
        Label_0034: {
            int length = 0;
            int contains = 0;
            Label_0023: {
                int n;
                try {
                    n = (contains = (length = bounds.length));
                    if (a) {
                        break Label_0034;
                    }
                    final int n2 = 1;
                    if (n == n2) {
                        break Label_0023;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n2 = 1;
                    if (n != n2) {
                        return false;
                    }
                    length = (contains = (bounds[0].contains(p) ? 1 : 0));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a) {
                    return length != 0;
                }
                if (contains == 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int length = 1;
        return length != 0;
        length = 0;
        return length != 0;
    }
    
    @Override
    public boolean isOnScreen() {
        int length = 0;
        Label_0019: {
            int n;
            try {
                n = (length = this.getBounds().length);
                if (Tile.a) {
                    return length != 0;
                }
                final int n2 = 1;
                if (n == n2) {
                    break Label_0019;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = 1;
                if (n != n2) {
                    return false;
                }
                length = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return length != 0;
        length = 0;
        return length != 0;
    }
    
    @Override
    public Polygon[] getBounds() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: dconst_0       
        //     7: dconst_0       
        //     8: iconst_0       
        //     9: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    12: astore_1       
        //    13: aload_0        
        //    14: dconst_1       
        //    15: dconst_0       
        //    16: iconst_0       
        //    17: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    20: astore_2       
        //    21: aload_0        
        //    22: dconst_0       
        //    23: dconst_1       
        //    24: iconst_0       
        //    25: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    28: astore_3       
        //    29: aload_0        
        //    30: dconst_1       
        //    31: dconst_1       
        //    32: iconst_0       
        //    33: invokevirtual   org/powerbot/game/api/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    36: astore          4
        //    38: aload_1        
        //    39: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(Ljava/awt/Point;)Z
        //    42: iload           6
        //    44: ifne            189
        //    47: ifeq            188
        //    50: goto            54
        //    53: athrow         
        //    54: aload_2        
        //    55: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(Ljava/awt/Point;)Z
        //    58: iload           6
        //    60: ifne            189
        //    63: goto            67
        //    66: athrow         
        //    67: ifeq            188
        //    70: goto            74
        //    73: athrow         
        //    74: aload_3        
        //    75: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(Ljava/awt/Point;)Z
        //    78: iload           6
        //    80: ifne            189
        //    83: goto            87
        //    86: athrow         
        //    87: ifeq            188
        //    90: goto            94
        //    93: athrow         
        //    94: aload           4
        //    96: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(Ljava/awt/Point;)Z
        //    99: iload           6
        //   101: ifne            189
        //   104: goto            108
        //   107: athrow         
        //   108: ifeq            188
        //   111: goto            115
        //   114: athrow         
        //   115: new             Ljava/awt/Polygon;
        //   118: dup            
        //   119: invokespecial   java/awt/Polygon.<init>:()V
        //   122: astore          5
        //   124: aload           5
        //   126: aload_1        
        //   127: getfield        java/awt/Point.x:I
        //   130: aload_1        
        //   131: getfield        java/awt/Point.y:I
        //   134: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   137: aload           5
        //   139: aload_2        
        //   140: getfield        java/awt/Point.x:I
        //   143: aload_2        
        //   144: getfield        java/awt/Point.y:I
        //   147: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   150: aload           5
        //   152: aload           4
        //   154: getfield        java/awt/Point.x:I
        //   157: aload           4
        //   159: getfield        java/awt/Point.y:I
        //   162: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   165: aload           5
        //   167: aload_3        
        //   168: getfield        java/awt/Point.x:I
        //   171: aload_3        
        //   172: getfield        java/awt/Point.y:I
        //   175: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   178: iconst_1       
        //   179: anewarray       Ljava/awt/Polygon;
        //   182: dup            
        //   183: iconst_0       
        //   184: aload           5
        //   186: aastore        
        //   187: areturn        
        //   188: iconst_0       
        //   189: anewarray       Ljava/awt/Polygon;
        //   192: areturn        
        //    StackMapTable: 00 10 FF 00 35 00 07 07 00 08 07 00 82 07 00 82 07 00 82 07 00 82 00 01 00 01 07 00 E5 00 4B 07 00 E5 40 01 45 07 00 E5 00 4B 07 00 E5 40 01 45 07 00 E5 00 4C 07 00 E5 40 01 45 07 00 E5 00 FB 00 48 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  94     111    114    115    Ljava/lang/RuntimeException;
        //  87     104    107    108    Ljava/lang/RuntimeException;
        //  74     90     93     94     Ljava/lang/RuntimeException;
        //  67     83     86     87     Ljava/lang/RuntimeException;
        //  54     70     73     74     Ljava/lang/RuntimeException;
        //  47     63     66     67     Ljava/lang/RuntimeException;
        //  38     50     53     54     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    public boolean hover() {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return true;
            }
        });
    }
    
    @Override
    public boolean click(final boolean b) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                Mouse.click(b);
                return true;
            }
        });
    }
    
    public boolean clickOnMap() {
        return Walking.walk(this);
    }
    
    @Override
    public boolean interact(final String s) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return Menu.select(s);
            }
        });
    }
    
    @Override
    public boolean interact(final String s, final String s2) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return Menu.select(s, s2);
            }
        });
    }
    
    public boolean canReach() {
        return Walking.findPath(this).init();
    }
    
    public double distanceTo() {
        return Calculations.distanceTo(this);
    }
    
    public double distance(final Locatable locatable) {
        return Calculations.distance(this, locatable);
    }
    
    public Point getPoint(final double n, final double n2, final int n3) {
        return Calculations.groundToScreen((int)((this.x - Game.getBaseX() + n) * 512.0), (int)((this.y - Game.getBaseY() + n2) * 512.0), this.plane, -n3);
    }
    
    @Override
    public void draw(final Graphics graphics) {
        final Polygon[] bounds = this.getBounds();
        try {
            if (bounds.length == 1) {
                graphics.drawPolygon(bounds[0]);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    @Override
    public Tile getLocation() {
        return this;
    }
    
    @Override
    public RegionOffset getRegionOffset() {
        return new RegionOffset(this.x - Game.getBaseX(), this.y - Game.getBaseY(), this.plane);
    }
    
    @Override
    public int getId() {
        return this.x * 31 + this.y;
    }
    
    @Override
    public int hashCode() {
        return this.getId();
    }
    
    @Override
    public String toString() {
        return o.a("{") + this.x + ScriptHandler.e(Tile.z[0]) + this.y + o.a(Tile.z[1]) + this.plane + ')';
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: iload_3        
        //     6: ifne            17
        //     9: ifnull          107
        //    12: goto            16
        //    15: athrow         
        //    16: aload_1        
        //    17: instanceof      Lorg/powerbot/game/api/wrappers/Tile;
        //    20: iload_3        
        //    21: ifne            108
        //    24: ifeq            107
        //    27: goto            31
        //    30: athrow         
        //    31: aload_1        
        //    32: checkcast       Lorg/powerbot/game/api/wrappers/Tile;
        //    35: astore_2       
        //    36: aload_0        
        //    37: getfield        org/powerbot/game/api/wrappers/Tile.x:I
        //    40: aload_2        
        //    41: getfield        org/powerbot/game/api/wrappers/Tile.x:I
        //    44: iload_3        
        //    45: ifne            67
        //    48: if_icmpne       105
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0        
        //    56: getfield        org/powerbot/game/api/wrappers/Tile.y:I
        //    59: aload_2        
        //    60: getfield        org/powerbot/game/api/wrappers/Tile.y:I
        //    63: goto            67
        //    66: athrow         
        //    67: iload_3        
        //    68: ifne            98
        //    71: if_icmpne       105
        //    74: goto            78
        //    77: athrow         
        //    78: aload_0        
        //    79: getfield        org/powerbot/game/api/wrappers/Tile.plane:I
        //    82: iload_3        
        //    83: ifne            102
        //    86: goto            90
        //    89: athrow         
        //    90: aload_2        
        //    91: getfield        org/powerbot/game/api/wrappers/Tile.plane:I
        //    94: goto            98
        //    97: athrow         
        //    98: if_icmpne       105
        //   101: iconst_1       
        //   102: goto            106
        //   105: iconst_0       
        //   106: ireturn        
        //   107: iconst_0       
        //   108: ireturn        
        //    StackMapTable: 00 14 FF 00 0F 00 04 07 00 08 07 00 35 00 01 00 01 07 00 E5 00 40 07 00 35 4C 07 00 E5 00 FF 00 16 00 04 07 00 08 07 00 35 07 00 08 01 00 01 07 00 E5 00 4A 07 00 E5 FF 00 00 00 04 07 00 08 07 00 35 07 00 08 01 00 02 01 01 49 07 00 E5 00 4A 07 00 E5 40 01 46 07 00 E5 FF 00 00 00 04 07 00 08 07 00 35 07 00 08 01 00 02 01 01 43 01 02 40 01 FF 00 00 00 04 07 00 08 07 00 35 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  78     94     97     98     Ljava/lang/RuntimeException;
        //  71     86     89     90     Ljava/lang/RuntimeException;
        //  67     74     77     78     Ljava/lang/RuntimeException;
        //  48     63     66     67     Ljava/lang/RuntimeException;
        //  36     51     54     55     Ljava/lang/RuntimeException;
        //  17     27     30     31     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0078:
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
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "\\\b";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0118: {
                    if (n4 > 1) {
                        break Label_0118;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '/';
                                break;
                            }
                            case 1: {
                                c2 = 'v';
                                break;
                            }
                            case 2: {
                                c2 = '|';
                                break;
                            }
                            case 3: {
                                c2 = '2';
                                break;
                            }
                            default: {
                                c2 = '\u0016';
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
                    s = "C\u0005";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
    
    public interface Flag
    {
        public static final int WALL_NORTHWEST = 1;
        public static final int WALL_NORTH = 2;
        public static final int WALL_NORTHEAST = 4;
        public static final int WALL_EAST = 8;
        public static final int WALL_SOUTHEAST = 16;
        public static final int WALL_SOUTH = 32;
        public static final int WALL_SOUTHWEST = 64;
        public static final int WALL_WEST = 128;
        public static final int OBJECT_TILE = 256;
        public static final int WALL_BLOCK_NORTHWEST = 512;
        public static final int WALL_BLOCK_NORTH = 1024;
        public static final int WALL_BLOCK_NORTHEAST = 2048;
        public static final int WALL_BLOCK_EAST = 4096;
        public static final int WALL_BLOCK_SOUTHEAST = 8192;
        public static final int WALL_BLOCK_SOUTH = 16384;
        public static final int WALL_BLOCK_SOUTHWEST = 32768;
        public static final int WALL_BLOCK_WEST = 65536;
        public static final int OBJECT_BLOCK = 131072;
        public static final int DECORATION_BLOCK = 262144;
        public static final int WALL_ALLOW_RANGE_NORTHWEST = 4194304;
        public static final int WALL_ALLOW_RANGE_NORTH = 8388608;
        public static final int WALL_ALLOW_RANGE_NORTHEAST = 16777216;
        public static final int WALL_ALLOW_RANGE_EAST = 33554432;
        public static final int WALL_ALLOW_RANGE_SOUTHEAST = 67108864;
        public static final int WALL_ALLOW_RANGE_SOUTH = 134217728;
        public static final int WALL_ALLOW_RANGE_SOUTHWEST = 268435456;
        public static final int WALL_ALLOW_RANGE_WEST = 536870912;
        public static final int OBJECT_ALLOW_RANGE = 1073741824;
        public static final int BLOCKED = 19398912;
    }
}
