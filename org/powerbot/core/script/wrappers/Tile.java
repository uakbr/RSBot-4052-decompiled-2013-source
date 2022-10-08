
package org.powerbot.core.script.wrappers;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.powerbot.core.script.methods.Calculations;
import org.powerbot.core.script.methods.Game;
import java.awt.Point;
import org.powerbot.core.script.util.Random;

public class Tile implements Locatable, Targetable
{
    public int x;
    public int y;
    public int plane;
    private static final String[] z;
    
    public Tile(final int n, final int n2) {
        this(n, n2, 0);
    }
    
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
    
    public Tile derive(final int n, final int n2) {
        return this.derive(n, n2, this.plane);
    }
    
    public Tile derive(final int n, final int n2, final int n3) {
        return new Tile(this.x + n, this.y + n2, n3);
    }
    
    public Tile randomize(final int n, final int n2, final int n3, final int n4) {
        return this.derive(Random.nextInt(n, n2 + 1), Random.nextInt(n3, n4 + 1));
    }
    
    public Tile randomize(final int n, final int n2) {
        return this.randomize(-n, n, -n2, n2);
    }
    
    public Point getPoint(final int n) {
        return this.getPoint(0.5, 0.5, n);
    }
    
    public Point getPoint(final double n, final double n2, final int n3) {
        final Tile mapBase = Game.getMapBase();
        Tile tile;
        try {
            tile = mapBase;
            if (Component.a != 0) {
                return Calculations.groundToScreen((int)((tile.x - mapBase.x + n) * 512.0), (int)((this.y - mapBase.y + n2) * 512.0), this.plane, n3);
            }
            if (tile == null) {
                return new Point(-1, -1);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return Calculations.groundToScreen((int)((tile.x - mapBase.x + n) * 512.0), (int)((this.y - mapBase.y + n2) * 512.0), this.plane, n3);
        groundToScreen = new Point(-1, -1);
        return groundToScreen;
    }
    
    @Override
    public Tile getLocation() {
        return this;
    }
    
    @Override
    public Point getInteractPoint() {
        return this.getPoint(Random.nextGaussian(0, 100, 5) / 100.0, Random.nextGaussian(0, 100, 5) / 100.0, 0);
    }
    
    @Override
    public Point getNextPoint() {
        return this.getPoint(Random.nextDouble(0.0, 1.0), Random.nextDouble(0.0, 1.0), 0);
    }
    
    @Override
    public Point getCenterPoint() {
        return this.getPoint(0);
    }
    
    @Override
    public boolean contains(final Point p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: dconst_0       
        //     7: dconst_0       
        //     8: iconst_0       
        //     9: invokevirtual   org/powerbot/core/script/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    12: astore_2       
        //    13: aload_0        
        //    14: dconst_1       
        //    15: dconst_0       
        //    16: iconst_0       
        //    17: invokevirtual   org/powerbot/core/script/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    20: astore_3       
        //    21: aload_0        
        //    22: dconst_1       
        //    23: dconst_1       
        //    24: iconst_0       
        //    25: invokevirtual   org/powerbot/core/script/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    28: astore          4
        //    30: aload_0        
        //    31: dconst_0       
        //    32: dconst_1       
        //    33: iconst_0       
        //    34: invokevirtual   org/powerbot/core/script/wrappers/Tile.getPoint:(DDI)Ljava/awt/Point;
        //    37: astore          5
        //    39: aload_2        
        //    40: invokestatic    org/powerbot/core/script/methods/Calculations.isPointOnScreen:(Ljava/awt/Point;)Z
        //    43: iload           7
        //    45: ifne            190
        //    48: ifeq            189
        //    51: goto            55
        //    54: athrow         
        //    55: aload_3        
        //    56: invokestatic    org/powerbot/core/script/methods/Calculations.isPointOnScreen:(Ljava/awt/Point;)Z
        //    59: iload           7
        //    61: ifne            190
        //    64: goto            68
        //    67: athrow         
        //    68: ifeq            189
        //    71: goto            75
        //    74: athrow         
        //    75: aload           4
        //    77: invokestatic    org/powerbot/core/script/methods/Calculations.isPointOnScreen:(Ljava/awt/Point;)Z
        //    80: iload           7
        //    82: ifne            190
        //    85: goto            89
        //    88: athrow         
        //    89: ifeq            189
        //    92: goto            96
        //    95: athrow         
        //    96: aload           5
        //    98: invokestatic    org/powerbot/core/script/methods/Calculations.isPointOnScreen:(Ljava/awt/Point;)Z
        //   101: iload           7
        //   103: ifne            190
        //   106: goto            110
        //   109: athrow         
        //   110: ifeq            189
        //   113: goto            117
        //   116: athrow         
        //   117: new             Ljava/awt/Polygon;
        //   120: dup            
        //   121: invokespecial   java/awt/Polygon.<init>:()V
        //   124: astore          6
        //   126: aload           6
        //   128: aload_2        
        //   129: getfield        java/awt/Point.x:I
        //   132: aload_2        
        //   133: getfield        java/awt/Point.y:I
        //   136: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   139: aload           6
        //   141: aload_3        
        //   142: getfield        java/awt/Point.x:I
        //   145: aload_3        
        //   146: getfield        java/awt/Point.y:I
        //   149: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   152: aload           6
        //   154: aload           4
        //   156: getfield        java/awt/Point.x:I
        //   159: aload           4
        //   161: getfield        java/awt/Point.y:I
        //   164: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   167: aload           6
        //   169: aload           5
        //   171: getfield        java/awt/Point.x:I
        //   174: aload           5
        //   176: getfield        java/awt/Point.y:I
        //   179: invokevirtual   java/awt/Polygon.addPoint:(II)V
        //   182: aload           6
        //   184: aload_1        
        //   185: invokevirtual   java/awt/Polygon.contains:(Ljava/awt/Point;)Z
        //   188: ireturn        
        //   189: iconst_0       
        //   190: getstatic       org/powerbot/core/script/job/Task.a:I
        //   193: ifeq            208
        //   196: iinc            7, 1
        //   199: iload           7
        //   201: putstatic       org/powerbot/core/script/wrappers/Component.a:I
        //   204: goto            208
        //   207: athrow         
        //   208: ireturn        
        //    StackMapTable: 00 12 FF 00 36 00 08 07 00 07 07 00 12 07 00 12 07 00 12 07 00 12 07 00 12 00 01 00 01 07 00 96 00 4B 07 00 96 40 01 45 07 00 96 00 4C 07 00 96 40 01 45 07 00 96 00 4C 07 00 96 40 01 45 07 00 96 00 FB 00 47 40 01 50 07 00 96 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  190    204    207    208    Ljava/lang/RuntimeException;
        //  96     113    116    117    Ljava/lang/RuntimeException;
        //  89     106    109    110    Ljava/lang/RuntimeException;
        //  75     92     95     96     Ljava/lang/RuntimeException;
        //  68     85     88     89     Ljava/lang/RuntimeException;
        //  55     71     74     75     Ljava/lang/RuntimeException;
        //  48     64     67     68     Ljava/lang/RuntimeException;
        //  39     51     54     55     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    public int hashCode() {
        return this.x * 31 + this.y;
    }
    
    @Override
    public String toString() {
        return HashTable.e("\u0014") + this.x + Item.e(Tile.z[1]) + this.y + HashTable.e(Tile.z[0]) + this.plane + ')';
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
        //    17: instanceof      Lorg/powerbot/core/script/wrappers/Tile;
        //    20: iload_3        
        //    21: ifne            108
        //    24: ifeq            107
        //    27: goto            31
        //    30: athrow         
        //    31: aload_1        
        //    32: checkcast       Lorg/powerbot/core/script/wrappers/Tile;
        //    35: astore_2       
        //    36: aload_0        
        //    37: getfield        org/powerbot/core/script/wrappers/Tile.x:I
        //    40: aload_2        
        //    41: getfield        org/powerbot/core/script/wrappers/Tile.x:I
        //    44: iload_3        
        //    45: ifne            67
        //    48: if_icmpne       105
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0        
        //    56: getfield        org/powerbot/core/script/wrappers/Tile.y:I
        //    59: aload_2        
        //    60: getfield        org/powerbot/core/script/wrappers/Tile.y:I
        //    63: goto            67
        //    66: athrow         
        //    67: iload_3        
        //    68: ifne            98
        //    71: if_icmpne       105
        //    74: goto            78
        //    77: athrow         
        //    78: aload_0        
        //    79: getfield        org/powerbot/core/script/wrappers/Tile.plane:I
        //    82: iload_3        
        //    83: ifne            102
        //    86: goto            90
        //    89: athrow         
        //    90: aload_2        
        //    91: getfield        org/powerbot/core/script/wrappers/Tile.plane:I
        //    94: goto            98
        //    97: athrow         
        //    98: if_icmpne       105
        //   101: iconst_1       
        //   102: goto            106
        //   105: iconst_0       
        //   106: ireturn        
        //   107: iconst_0       
        //   108: ireturn        
        //    StackMapTable: 00 14 FF 00 0F 00 04 07 00 07 07 00 26 00 01 00 01 07 00 96 00 40 07 00 26 4C 07 00 96 00 FF 00 16 00 04 07 00 07 07 00 26 07 00 07 01 00 01 07 00 96 00 4A 07 00 96 FF 00 00 00 04 07 00 07 07 00 26 07 00 07 01 00 02 01 01 49 07 00 96 00 4A 07 00 96 40 01 46 07 00 96 FF 00 00 00 04 07 00 07 07 00 26 07 00 07 01 00 02 01 01 43 01 02 40 01 FF 00 00 00 04 07 00 07 07 00 26 00 01 00 00 40 01
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
        String s = "1Q";
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
                                c2 = '-';
                                break;
                            }
                            case 1: {
                                c2 = 'M';
                                break;
                            }
                            case 2: {
                                c2 = '\u001b';
                                break;
                            }
                            case 3: {
                                c2 = 'p';
                                break;
                            }
                            default: {
                                c2 = '\u0006';
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
                    s = "64";
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
}
