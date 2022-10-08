
package org.powerbot.core.script.wrappers;

import org.powerbot.game.bot.handler.input.a;
import org.powerbot.eb;
import java.util.Arrays;
import java.awt.Graphics;
import java.awt.Polygon;
import org.powerbot.core.script.methods.Calculations;
import java.awt.Point;
import org.powerbot.core.script.util.Random;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.ModelCapture;

public abstract class Model
{
    protected int[] xPoints;
    protected int[] yPoints;
    protected int[] zPoints;
    protected short[] faceA;
    protected short[] faceB;
    protected short[] faceC;
    protected int numFaces;
    protected int numVertices;
    private static final String[] z;
    
    public Model(final org.powerbot.game.client.Model model) {
        final int a = Component.a;
        this.xPoints = model.getXPoints();
        this.yPoints = model.getYPoints();
        this.zPoints = model.getZPoints();
        this.faceA = model.getIndices1();
        this.faceB = model.getIndices2();
        this.faceC = model.getIndices3();
        if (a == 0) {
            Label_0120: {
                try {
                    if (!(model instanceof ModelCapture)) {
                        break Label_0120;
                    }
                    this.numVertices = ((ModelCapture)model).getNumVertices();
                    this.numFaces = ((ModelCapture)model).getNumFaces();
                    if (a == 0) {
                        return;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                int a2 = Task.a;
                Task.a = ++a2;
            }
            this.numVertices = Math.min(this.xPoints.length, Math.min(this.yPoints.length, this.zPoints.length));
        }
        this.numFaces = Math.min(this.faceA.length, Math.min(this.faceB.length, this.faceC.length));
    }
    
    public abstract int getX();
    
    public abstract int getY();
    
    public abstract byte getPlane();
    
    public abstract void update();
    
    public int nextTriangle() {
        this.update();
        final int nextInt = Random.nextInt(0, this.numFaces);
        final int firstOnScreenIndex = this.firstOnScreenIndex(nextInt, this.numFaces);
        int firstOnScreenIndex2 = 0;
        Label_0038: {
            int n;
            try {
                n = (firstOnScreenIndex2 = firstOnScreenIndex);
                if (Component.a != 0) {
                    return firstOnScreenIndex2;
                }
                final int n2 = -1;
                if (n != n2) {
                    break Label_0038;
                }
                return this.firstOnScreenIndex(0, nextInt);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = -1;
                if (n == n2) {
                    return this.firstOnScreenIndex(0, nextInt);
                }
                firstOnScreenIndex2 = firstOnScreenIndex;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return firstOnScreenIndex2;
        firstOnScreenIndex2 = this.firstOnScreenIndex(0, nextInt);
        return firstOnScreenIndex2;
    }
    
    public Point getCentroid(final int n) {
        final int a = Component.a;
        int x = 0;
        Label_0046: {
            Label_0035: {
                int n2 = 0;
                Label_0019: {
                    try {
                        x = n;
                        n2 = n;
                        if (a != 0) {
                            break Label_0019;
                        }
                        if (n < 0) {
                            break Label_0035;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    x = n;
                    n2 = n;
                    try {
                        if (a != 0) {
                            break Label_0046;
                        }
                        final Model model = this;
                        final int n3 = model.numFaces;
                        if (n2 >= n3) {
                            break Label_0035;
                        }
                        break Label_0035;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    final Model model = this;
                    final int n3 = model.numFaces;
                    if (n2 >= n3) {
                        return null;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            this.update();
            x = this.getX();
        }
        final int n4 = x;
        final int y = this.getY();
        final Point worldToScreen = Calculations.worldToScreen(n4 + (this.xPoints[this.faceA[n]] + this.xPoints[this.faceB[n]] + this.xPoints[this.faceC[n]]) / 3, Calculations.tileHeight(n4, y, this.getPlane()) + (this.yPoints[this.faceA[n]] + this.yPoints[this.faceB[n]] + this.yPoints[this.faceC[n]]) / 3, y + (this.zPoints[this.faceA[n]] + this.zPoints[this.faceB[n]] + this.zPoints[this.faceC[n]]) / 3);
        Point point2 = null;
        Label_0207: {
            Point point;
            try {
                point = (point2 = worldToScreen);
                if (a != 0) {
                    return point2;
                }
                final boolean b = Calculations.isPointOnScreen(point);
                if (b) {
                    break Label_0207;
                }
                return null;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            try {
                final boolean b = Calculations.isPointOnScreen(point);
                if (!b) {
                    return null;
                }
                point2 = worldToScreen;
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        return point2;
        point2 = null;
        return point2;
    }
    
    public Point getCenterPoint() {
        final int a = Component.a;
        int numFaces = 0;
        Label_0038: {
            Label_0022: {
                int n;
                try {
                    n = (numFaces = this.numFaces);
                    if (a != 0) {
                        break Label_0038;
                    }
                    final int n2 = 1;
                    if (n < n2) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n2 = 1;
                    if (n < n2) {
                        return new Point(-1, -1);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            this.update();
            numFaces = 0;
        }
        int n3 = numFaces;
        int n4 = 0;
        int n5 = 0;
        int i = 0;
        final int x = this.getX();
        final int y = this.getY();
        final int tileHeight = Calculations.tileHeight(x, y, this.getPlane());
        while (true) {
            while (i < this.numFaces) {
                n3 += (this.xPoints[this.faceA[i]] + this.xPoints[this.faceB[i]] + this.xPoints[this.faceC[i]]) / 3;
                n4 += (this.zPoints[this.faceA[i]] + this.zPoints[this.faceB[i]] + this.zPoints[this.faceC[i]]) / 3;
                final int n6 = n5 + (this.yPoints[this.faceA[i]] + this.yPoints[this.faceB[i]] + this.yPoints[this.faceC[i]]) / 3;
                if (a != 0) {
                    final Point worldToScreen = Calculations.worldToScreen(n6, tileHeight + n5 / this.numFaces, y + n4 / this.numFaces);
                    Point point;
                    try {
                        final Point point2;
                        point = (point2 = worldToScreen);
                        if (a != 0) {
                            return point2;
                        }
                        final boolean b = Calculations.isPointOnScreen(point);
                        if (b) {
                            return worldToScreen;
                        }
                        return new Point(-1, -1);
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final boolean b = Calculations.isPointOnScreen(point);
                        if (b) {
                            return worldToScreen;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    return new Point(-1, -1);
                }
                n5 = n6;
                ++i;
                if (a != 0) {
                    break;
                }
            }
            final int n7 = x + n3 / this.numFaces;
            continue;
        }
    }
    
    public Point getNextPoint() {
        final int a = Component.a;
        this.update();
        final int nextInt = Random.nextInt(0, this.numFaces);
        Point firstOnScreenCentroid = this.firstOnScreenCentroid(nextInt, this.numFaces);
        Label_0052: {
            Label_0039: {
                Point point;
                try {
                    final Point firstOnScreenCentroid2;
                    final Point point2;
                    point = (point2 = (firstOnScreenCentroid2 = firstOnScreenCentroid));
                    if (a != 0) {
                        break Label_0052;
                    }
                    if (point != null) {
                        break Label_0039;
                    }
                    break Label_0039;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (point != null) {
                        return firstOnScreenCentroid;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            Point firstOnScreenCentroid2;
            Point point2 = firstOnScreenCentroid = (firstOnScreenCentroid2 = this.firstOnScreenCentroid(0, nextInt));
            try {
                if (a != 0) {
                    return firstOnScreenCentroid2;
                }
                if (point2 == null) {
                    return new Point(-1, -1);
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return firstOnScreenCentroid;
        firstOnScreenCentroid2 = new Point(-1, -1);
        return firstOnScreenCentroid2;
    }
    
    public Polygon[] getTriangles() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/core/script/wrappers/Model.projectVertices:()[[I
        //     9: astore_1       
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: aload_0        
        //    15: getfield        org/powerbot/core/script/wrappers/Model.numFaces:I
        //    18: invokespecial   java/util/ArrayList.<init>:(I)V
        //    21: astore_2       
        //    22: iconst_0       
        //    23: istore_3       
        //    24: iload_3        
        //    25: aload_0        
        //    26: getfield        org/powerbot/core/script/wrappers/Model.numFaces:I
        //    29: if_icmpge       197
        //    32: aload_0        
        //    33: getfield        org/powerbot/core/script/wrappers/Model.faceA:[S
        //    36: iload_3        
        //    37: saload         
        //    38: istore          4
        //    40: aload_0        
        //    41: getfield        org/powerbot/core/script/wrappers/Model.faceB:[S
        //    44: iload_3        
        //    45: saload         
        //    46: istore          5
        //    48: aload_0        
        //    49: getfield        org/powerbot/core/script/wrappers/Model.faceC:[S
        //    52: iload_3        
        //    53: saload         
        //    54: istore          6
        //    56: iconst_3       
        //    57: newarray        I
        //    59: astore          7
        //    61: iconst_3       
        //    62: newarray        I
        //    64: astore          8
        //    66: aload           7
        //    68: iconst_0       
        //    69: aload_1        
        //    70: iload           4
        //    72: aaload         
        //    73: iconst_0       
        //    74: iaload         
        //    75: iastore        
        //    76: aload           8
        //    78: iconst_0       
        //    79: aload_1        
        //    80: iload           4
        //    82: aaload         
        //    83: iconst_1       
        //    84: iaload         
        //    85: iastore        
        //    86: aload           7
        //    88: iconst_1       
        //    89: aload_1        
        //    90: iload           5
        //    92: aaload         
        //    93: iconst_0       
        //    94: iaload         
        //    95: iastore        
        //    96: aload           8
        //    98: iconst_1       
        //    99: aload_1        
        //   100: iload           5
        //   102: aaload         
        //   103: iconst_1       
        //   104: iaload         
        //   105: iastore        
        //   106: aload           7
        //   108: iconst_2       
        //   109: aload_1        
        //   110: iload           6
        //   112: aaload         
        //   113: iconst_0       
        //   114: iaload         
        //   115: iastore        
        //   116: aload           8
        //   118: iconst_2       
        //   119: aload_1        
        //   120: iload           6
        //   122: aaload         
        //   123: iconst_1       
        //   124: iaload         
        //   125: iastore        
        //   126: iload           9
        //   128: ifne            192
        //   131: aload_1        
        //   132: iload           9
        //   134: ifne            208
        //   137: goto            141
        //   140: athrow         
        //   141: iload           4
        //   143: aaload         
        //   144: iconst_2       
        //   145: iaload         
        //   146: aload_1        
        //   147: iload           5
        //   149: aaload         
        //   150: iconst_2       
        //   151: iaload         
        //   152: iadd           
        //   153: aload_1        
        //   154: iload           6
        //   156: aaload         
        //   157: iconst_2       
        //   158: iaload         
        //   159: iadd           
        //   160: iconst_3       
        //   161: if_icmpne       189
        //   164: goto            168
        //   167: athrow         
        //   168: aload_2        
        //   169: new             Ljava/awt/Polygon;
        //   172: dup            
        //   173: aload           7
        //   175: aload           8
        //   177: iconst_3       
        //   178: invokespecial   java/awt/Polygon.<init>:([I[II)V
        //   181: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   184: pop            
        //   185: goto            189
        //   188: athrow         
        //   189: iinc            3, 1
        //   192: iload           9
        //   194: ifeq            24
        //   197: aload_2        
        //   198: aload_2        
        //   199: invokevirtual   java/util/ArrayList.size:()I
        //   202: anewarray       Ljava/awt/Polygon;
        //   205: invokevirtual   java/util/ArrayList.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   208: checkcast       [Ljava/awt/Polygon;
        //   211: areturn        
        //    StackMapTable: 00 0A FF 00 18 00 0A 07 00 42 07 00 30 07 00 21 01 00 00 00 00 00 01 00 00 FF 00 73 00 0A 07 00 42 07 00 30 07 00 21 01 01 01 01 07 01 3A 07 01 3A 01 00 01 07 01 26 40 07 00 30 59 07 01 26 00 53 07 01 26 00 02 FF 00 04 00 0A 07 00 42 07 00 30 07 00 21 01 00 00 00 00 00 01 00 00 4A 07 01 3B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  141    185    188    189    Ljava/lang/RuntimeException;
        //  131    164    167    168    Ljava/lang/RuntimeException;
        //  66     137    140    141    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0141:
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
    
    public boolean contains(final Point p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_1        
        //     6: getfield        java/awt/Point.x:I
        //     9: istore_2       
        //    10: aload_1        
        //    11: getfield        java/awt/Point.y:I
        //    14: istore_3       
        //    15: aload_0        
        //    16: invokespecial   org/powerbot/core/script/wrappers/Model.projectVertices:()[[I
        //    19: astore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: aload_0        
        //    27: getfield        org/powerbot/core/script/wrappers/Model.numFaces:I
        //    30: if_icmpge       179
        //    33: aload_0        
        //    34: getfield        org/powerbot/core/script/wrappers/Model.faceA:[S
        //    37: iload           5
        //    39: saload         
        //    40: istore          6
        //    42: aload_0        
        //    43: getfield        org/powerbot/core/script/wrappers/Model.faceB:[S
        //    46: iload           5
        //    48: saload         
        //    49: istore          7
        //    51: aload_0        
        //    52: getfield        org/powerbot/core/script/wrappers/Model.faceC:[S
        //    55: iload           5
        //    57: saload         
        //    58: istore          8
        //    60: iload           9
        //    62: ifne            174
        //    65: aload           4
        //    67: iload           6
        //    69: aaload         
        //    70: iconst_2       
        //    71: iaload         
        //    72: aload           4
        //    74: iload           7
        //    76: aaload         
        //    77: iconst_2       
        //    78: iaload         
        //    79: iadd           
        //    80: aload           4
        //    82: iload           8
        //    84: aaload         
        //    85: iconst_2       
        //    86: iaload         
        //    87: iadd           
        //    88: iload           9
        //    90: ifne            180
        //    93: goto            97
        //    96: athrow         
        //    97: iconst_3       
        //    98: if_icmpne       171
        //   101: goto            105
        //   104: athrow         
        //   105: aload_0        
        //   106: iload_2        
        //   107: iload_3        
        //   108: aload           4
        //   110: iload           6
        //   112: aaload         
        //   113: iconst_0       
        //   114: iaload         
        //   115: aload           4
        //   117: iload           6
        //   119: aaload         
        //   120: iconst_1       
        //   121: iaload         
        //   122: aload           4
        //   124: iload           7
        //   126: aaload         
        //   127: iconst_0       
        //   128: iaload         
        //   129: aload           4
        //   131: iload           7
        //   133: aaload         
        //   134: iconst_1       
        //   135: iaload         
        //   136: aload           4
        //   138: iload           8
        //   140: aaload         
        //   141: iconst_0       
        //   142: iaload         
        //   143: aload           4
        //   145: iload           8
        //   147: aaload         
        //   148: iconst_1       
        //   149: iaload         
        //   150: invokespecial   org/powerbot/core/script/wrappers/Model.isPointInTriangle:(IIIIIIII)Z
        //   153: iload           9
        //   155: ifne            170
        //   158: goto            162
        //   161: athrow         
        //   162: ifeq            171
        //   165: goto            169
        //   168: athrow         
        //   169: iconst_1       
        //   170: ireturn        
        //   171: iinc            5, 1
        //   174: iload           9
        //   176: ifeq            24
        //   179: iconst_0       
        //   180: ireturn        
        //    StackMapTable: 00 0E FF 00 18 00 0A 07 00 42 07 00 1D 01 01 07 00 30 01 00 00 00 01 00 00 FF 00 47 00 0A 07 00 42 07 00 1D 01 01 07 00 30 01 01 01 01 01 00 01 07 01 26 40 01 46 07 01 26 00 77 07 01 26 40 01 45 07 01 26 00 40 01 00 02 FF 00 04 00 0A 07 00 42 07 00 1D 01 01 07 00 30 01 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  105    165    168    169    Ljava/lang/RuntimeException;
        //  97     158    161    162    Ljava/lang/RuntimeException;
        //  65     101    104    105    Ljava/lang/RuntimeException;
        //  60     93     96     97     Ljava/lang/RuntimeException;
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
    
    public void drawWireFrame(final Graphics graphics) {
        final int a = Component.a;
        final int[][] projectVertices = this.projectVertices();
        int i = 0;
        while (i < this.numFaces) {
            final short n = this.faceA[i];
            final short n2 = this.faceB[i];
            final short n3 = this.faceC[i];
            final int n4 = projectVertices[n][0];
            final int n5 = projectVertices[n][1];
            final int n6 = projectVertices[n2][0];
            final int n7 = projectVertices[n2][1];
            final int n8 = projectVertices[n3][0];
            final int n9 = projectVertices[n3][1];
            Label_0168: {
                Label_0125: {
                    try {
                        if (a != 0) {
                            break Label_0168;
                        }
                        final int[][] array = projectVertices;
                        final short n10 = n;
                        final int[] array2 = array[n10];
                        final int n11 = 2;
                        final int n12 = array2[n11];
                        final int[][] array3 = projectVertices;
                        final short n13 = n2;
                        final int[] array4 = array3[n13];
                        final int n14 = 2;
                        final int n15 = array4[n14];
                        final int n16 = n12 + n15;
                        final int[][] array5 = projectVertices;
                        final short n17 = n3;
                        final int[] array6 = array5[n17];
                        final int n18 = 2;
                        final int n19 = array6[n18];
                        final int n20 = n16 + n19;
                        final int n21 = 3;
                        if (n20 == n21) {
                            break Label_0125;
                        }
                        break Label_0125;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int[][] array = projectVertices;
                        final short n10 = n;
                        final int[] array2 = array[n10];
                        final int n11 = 2;
                        final int n12 = array2[n11];
                        final int[][] array3 = projectVertices;
                        final short n13 = n2;
                        final int[] array4 = array3[n13];
                        final int n14 = 2;
                        final int n15 = array4[n14];
                        final int n16 = n12 + n15;
                        final int[][] array5 = projectVertices;
                        final short n17 = n3;
                        final int[] array6 = array5[n17];
                        final int n18 = 2;
                        final int n19 = array6[n18];
                        final int n20 = n16 + n19;
                        final int n21 = 3;
                        if (n20 == n21) {
                            graphics.drawLine(n4, n5, n6, n7);
                            graphics.drawLine(n6, n7, n8, n9);
                            graphics.drawLine(n8, n9, n4, n5);
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
    }
    
    private int firstOnScreenIndex(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/core/script/wrappers/Model.getX:()I
        //     9: istore_3       
        //    10: aload_0        
        //    11: invokevirtual   org/powerbot/core/script/wrappers/Model.getY:()I
        //    14: istore          4
        //    16: aload_0        
        //    17: invokevirtual   org/powerbot/core/script/wrappers/Model.getPlane:()B
        //    20: istore          5
        //    22: iload_3        
        //    23: iload           4
        //    25: iload           5
        //    27: invokestatic    org/powerbot/core/script/methods/Calculations.tileHeight:(III)I
        //    30: istore          6
        //    32: iload_1        
        //    33: istore          7
        //    35: iload           7
        //    37: iload_2        
        //    38: if_icmpge       212
        //    41: iload_3        
        //    42: aload_0        
        //    43: getfield        org/powerbot/core/script/wrappers/Model.xPoints:[I
        //    46: aload_0        
        //    47: getfield        org/powerbot/core/script/wrappers/Model.faceA:[S
        //    50: iload           7
        //    52: saload         
        //    53: iaload         
        //    54: aload_0        
        //    55: getfield        org/powerbot/core/script/wrappers/Model.xPoints:[I
        //    58: aload_0        
        //    59: getfield        org/powerbot/core/script/wrappers/Model.faceB:[S
        //    62: iload           7
        //    64: saload         
        //    65: iaload         
        //    66: iadd           
        //    67: aload_0        
        //    68: getfield        org/powerbot/core/script/wrappers/Model.xPoints:[I
        //    71: aload_0        
        //    72: getfield        org/powerbot/core/script/wrappers/Model.faceC:[S
        //    75: iload           7
        //    77: saload         
        //    78: iaload         
        //    79: iadd           
        //    80: iconst_3       
        //    81: idiv           
        //    82: iadd           
        //    83: iload           6
        //    85: aload_0        
        //    86: getfield        org/powerbot/core/script/wrappers/Model.yPoints:[I
        //    89: aload_0        
        //    90: getfield        org/powerbot/core/script/wrappers/Model.faceA:[S
        //    93: iload           7
        //    95: saload         
        //    96: iaload         
        //    97: aload_0        
        //    98: getfield        org/powerbot/core/script/wrappers/Model.yPoints:[I
        //   101: aload_0        
        //   102: getfield        org/powerbot/core/script/wrappers/Model.faceB:[S
        //   105: iload           7
        //   107: saload         
        //   108: iaload         
        //   109: iadd           
        //   110: aload_0        
        //   111: getfield        org/powerbot/core/script/wrappers/Model.yPoints:[I
        //   114: aload_0        
        //   115: getfield        org/powerbot/core/script/wrappers/Model.faceC:[S
        //   118: iload           7
        //   120: saload         
        //   121: iaload         
        //   122: iadd           
        //   123: iconst_3       
        //   124: idiv           
        //   125: iadd           
        //   126: iload           4
        //   128: aload_0        
        //   129: getfield        org/powerbot/core/script/wrappers/Model.zPoints:[I
        //   132: aload_0        
        //   133: getfield        org/powerbot/core/script/wrappers/Model.faceA:[S
        //   136: iload           7
        //   138: saload         
        //   139: iaload         
        //   140: aload_0        
        //   141: getfield        org/powerbot/core/script/wrappers/Model.zPoints:[I
        //   144: aload_0        
        //   145: getfield        org/powerbot/core/script/wrappers/Model.faceB:[S
        //   148: iload           7
        //   150: saload         
        //   151: iaload         
        //   152: iadd           
        //   153: aload_0        
        //   154: getfield        org/powerbot/core/script/wrappers/Model.zPoints:[I
        //   157: aload_0        
        //   158: getfield        org/powerbot/core/script/wrappers/Model.faceC:[S
        //   161: iload           7
        //   163: saload         
        //   164: iaload         
        //   165: iadd           
        //   166: iconst_3       
        //   167: idiv           
        //   168: iadd           
        //   169: invokestatic    org/powerbot/core/script/methods/Calculations.worldToScreen:(III)Ljava/awt/Point;
        //   172: astore          8
        //   174: iload           9
        //   176: ifne            207
        //   179: aload           8
        //   181: invokestatic    org/powerbot/core/script/methods/Calculations.isPointOnScreen:(Ljava/awt/Point;)Z
        //   184: iload           9
        //   186: ifne            213
        //   189: goto            193
        //   192: athrow         
        //   193: ifeq            204
        //   196: goto            200
        //   199: athrow         
        //   200: iload           7
        //   202: ireturn        
        //   203: athrow         
        //   204: iinc            7, 1
        //   207: iload           9
        //   209: ifeq            35
        //   212: iconst_m1      
        //   213: ireturn        
        //    StackMapTable: 00 0A FF 00 23 00 0A 07 00 42 01 01 01 01 01 01 01 00 01 00 00 FF 00 9C 00 0A 07 00 42 01 01 01 01 01 01 01 07 00 1D 01 00 01 07 01 26 40 01 45 07 01 26 00 42 07 01 26 00 02 FF 00 04 00 0A 07 00 42 01 01 01 01 01 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  193    203    203    204    Ljava/lang/RuntimeException;
        //  179    196    199    200    Ljava/lang/RuntimeException;
        //  174    189    192    193    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0193:
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
    
    private Point firstOnScreenCentroid(final int n, final int n2) {
        final int firstOnScreenIndex = this.firstOnScreenIndex(n, n2);
        try {
            if (firstOnScreenIndex != -1) {
                return this.getCentroid(firstOnScreenIndex);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return null;
    }
    
    private boolean isPointInTriangle(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
        final int a = Component.a;
        final int n9 = (n2 - n4) * (n5 - n3) - (n - n3) * (n6 - n4);
        final int n10 = (n2 - n6) * (n7 - n5) - (n - n5) * (n8 - n6);
        final int n11 = (n2 - n8) * (n3 - n7) - (n - n7) * (n4 - n8);
        Label_0097: {
            int n14 = 0;
            int n13 = 0;
            Label_0088: {
                int n12;
                try {
                    n12 = (n13 = (n14 = n9 * n10));
                    if (a != 0) {
                        break Label_0097;
                    }
                    if (n12 > 0) {
                        break Label_0088;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n12 <= 0) {
                        return false;
                    }
                    n14 = (n13 = n10 * n11);
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return n14 != 0;
                }
                if (n13 <= 0) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        int n14 = true ? 1 : 0;
        return n14 != 0;
        n14 = (false ? 1 : 0);
        return n14 != 0;
    }
    
    private int[][] projectVertices() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          15
        //     5: getstatic       org/powerbot/core/script/methods/Calculations.toolkit:Lorg/powerbot/core/script/methods/Calculations$Toolkit;
        //     8: astore_1       
        //     9: getstatic       org/powerbot/core/script/methods/Calculations.viewport:Lorg/powerbot/core/script/methods/Calculations$Viewport;
        //    12: astore_2       
        //    13: aload_0        
        //    14: invokevirtual   org/powerbot/core/script/wrappers/Model.update:()V
        //    17: aload_0        
        //    18: invokevirtual   org/powerbot/core/script/wrappers/Model.getX:()I
        //    21: istore_3       
        //    22: aload_0        
        //    23: invokevirtual   org/powerbot/core/script/wrappers/Model.getY:()I
        //    26: istore          4
        //    28: aload_0        
        //    29: invokevirtual   org/powerbot/core/script/wrappers/Model.getPlane:()B
        //    32: istore          5
        //    34: iload_3        
        //    35: iload           4
        //    37: iload           5
        //    39: invokestatic    org/powerbot/core/script/methods/Calculations.tileHeight:(III)I
        //    42: istore          6
        //    44: aload_0        
        //    45: getfield        org/powerbot/core/script/wrappers/Model.numVertices:I
        //    48: iconst_3       
        //    49: multianewarray  [[I
        //    53: astore          7
        //    55: iconst_0       
        //    56: istore          8
        //    58: iload           8
        //    60: aload_0        
        //    61: getfield        org/powerbot/core/script/wrappers/Model.numVertices:I
        //    64: if_icmpge       377
        //    67: aload_0        
        //    68: getfield        org/powerbot/core/script/wrappers/Model.xPoints:[I
        //    71: iload           8
        //    73: iaload         
        //    74: iload_3        
        //    75: iadd           
        //    76: istore          9
        //    78: aload_0        
        //    79: getfield        org/powerbot/core/script/wrappers/Model.yPoints:[I
        //    82: iload           8
        //    84: iaload         
        //    85: iload           6
        //    87: iadd           
        //    88: istore          10
        //    90: aload_0        
        //    91: getfield        org/powerbot/core/script/wrappers/Model.zPoints:[I
        //    94: iload           8
        //    96: iaload         
        //    97: iload           4
        //    99: iadd           
        //   100: istore          11
        //   102: aload_2        
        //   103: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zOff:F
        //   106: aload_2        
        //   107: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zX:F
        //   110: iload           9
        //   112: i2f            
        //   113: fmul           
        //   114: aload_2        
        //   115: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zY:F
        //   118: iload           10
        //   120: i2f            
        //   121: fmul           
        //   122: fadd           
        //   123: aload_2        
        //   124: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zZ:F
        //   127: iload           11
        //   129: i2f            
        //   130: fmul           
        //   131: fadd           
        //   132: fadd           
        //   133: fstore          12
        //   135: aload_2        
        //   136: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xOff:F
        //   139: aload_2        
        //   140: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xX:F
        //   143: iload           9
        //   145: i2f            
        //   146: fmul           
        //   147: aload_2        
        //   148: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xY:F
        //   151: iload           10
        //   153: i2f            
        //   154: fmul           
        //   155: fadd           
        //   156: aload_2        
        //   157: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xZ:F
        //   160: iload           11
        //   162: i2f            
        //   163: fmul           
        //   164: fadd           
        //   165: fadd           
        //   166: fstore          13
        //   168: aload_2        
        //   169: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yOff:F
        //   172: aload_2        
        //   173: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yX:F
        //   176: iload           9
        //   178: i2f            
        //   179: fmul           
        //   180: aload_2        
        //   181: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yY:F
        //   184: iload           10
        //   186: i2f            
        //   187: fmul           
        //   188: fadd           
        //   189: aload_2        
        //   190: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yZ:F
        //   193: iload           11
        //   195: i2f            
        //   196: fmul           
        //   197: fadd           
        //   198: fadd           
        //   199: fstore          14
        //   201: iload           15
        //   203: ifne            361
        //   206: fload           13
        //   208: fload           12
        //   210: fneg           
        //   211: fcmpl          
        //   212: iflt            341
        //   215: goto            219
        //   218: athrow         
        //   219: fload           13
        //   221: fload           12
        //   223: fcmpg          
        //   224: iload           15
        //   226: ifne            250
        //   229: goto            233
        //   232: athrow         
        //   233: ifgt            341
        //   236: goto            240
        //   239: athrow         
        //   240: fload           14
        //   242: fload           12
        //   244: fneg           
        //   245: fcmpl          
        //   246: goto            250
        //   249: athrow         
        //   250: iload           15
        //   252: ifne            271
        //   255: iflt            341
        //   258: goto            262
        //   261: athrow         
        //   262: fload           14
        //   264: fload           12
        //   266: fcmpg          
        //   267: goto            271
        //   270: athrow         
        //   271: ifgt            341
        //   274: aload           7
        //   276: iload           8
        //   278: aaload         
        //   279: iconst_0       
        //   280: aload_1        
        //   281: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.absoluteX:F
        //   284: aload_1        
        //   285: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.xMultiplier:F
        //   288: fload           13
        //   290: fmul           
        //   291: fload           12
        //   293: fdiv           
        //   294: fadd           
        //   295: invokestatic    java/lang/Math.round:(F)I
        //   298: iastore        
        //   299: aload           7
        //   301: iload           8
        //   303: aaload         
        //   304: iconst_1       
        //   305: aload_1        
        //   306: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.absoluteY:F
        //   309: aload_1        
        //   310: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.yMultiplier:F
        //   313: fload           14
        //   315: fmul           
        //   316: fload           12
        //   318: fdiv           
        //   319: fadd           
        //   320: invokestatic    java/lang/Math.round:(F)I
        //   323: iastore        
        //   324: aload           7
        //   326: iload           8
        //   328: aaload         
        //   329: iconst_2       
        //   330: iconst_1       
        //   331: iastore        
        //   332: iload           15
        //   334: ifeq            369
        //   337: goto            341
        //   340: athrow         
        //   341: aload           7
        //   343: iload           8
        //   345: aaload         
        //   346: iconst_0       
        //   347: iconst_m1      
        //   348: iastore        
        //   349: aload           7
        //   351: iload           8
        //   353: aaload         
        //   354: iconst_1       
        //   355: iconst_m1      
        //   356: iastore        
        //   357: goto            361
        //   360: athrow         
        //   361: aload           7
        //   363: iload           8
        //   365: aaload         
        //   366: iconst_2       
        //   367: iconst_0       
        //   368: iastore        
        //   369: iinc            8, 1
        //   372: iload           15
        //   374: ifeq            58
        //   377: aload           7
        //   379: areturn        
        //    StackMapTable: 00 13 FF 00 3A 00 10 07 00 42 07 00 BB 07 00 AE 01 01 01 01 07 00 30 01 00 00 00 00 00 00 01 00 00 FF 00 9F 00 10 07 00 42 07 00 BB 07 00 AE 01 01 01 01 07 00 30 01 01 01 01 02 02 02 01 00 01 07 01 26 00 4C 07 01 26 40 01 45 07 01 26 00 48 07 01 26 40 01 4A 07 01 26 00 47 07 01 26 40 01 F7 00 44 07 01 26 00 52 07 01 26 00 07 FF 00 07 00 10 07 00 42 07 00 BB 07 00 AE 01 01 01 01 07 00 30 01 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  274    357    360    361    Ljava/lang/RuntimeException;
        //  271    337    340    341    Ljava/lang/RuntimeException;
        //  255    267    270    271    Ljava/lang/RuntimeException;
        //  250    258    261    262    Ljava/lang/RuntimeException;
        //  233    246    249    250    Ljava/lang/RuntimeException;
        //  219    236    239    240    Ljava/lang/RuntimeException;
        //  206    229    232    233    Ljava/lang/RuntimeException;
        //  201    215    218    219    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0219:
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
    public boolean equals(final Object o) {
        final int a = Component.a;
        boolean b = false;
        Label_0142: {
            Label_0017: {
                try {
                    final Object o2 = o;
                    if (a != 0) {
                        break Label_0017;
                    }
                    if (o == null) {
                        break Label_0142;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                final Object o2 = o;
                try {
                    b = (o2 instanceof Model);
                    if (a != 0) {
                        return b;
                    }
                    if (!b) {
                        break Label_0142;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            final Model model = (Model)o;
            Label_0125: {
                boolean b5 = false;
                boolean equals = false;
                Label_0110: {
                    boolean b4 = false;
                    Label_0099: {
                        Label_0084: {
                            boolean b3 = false;
                            Label_0073: {
                                Label_0058: {
                                    boolean b2;
                                    try {
                                        b2 = (b3 = (b4 = (equals = (b5 = Arrays.equals(this.faceA, model.faceA)))));
                                        if (a != 0) {
                                            break Label_0073;
                                        }
                                        if (b2) {
                                            break Label_0058;
                                        }
                                        return false;
                                    }
                                    catch (RuntimeException ex3) {
                                        throw ex3;
                                    }
                                    try {
                                        if (!b2) {
                                            return false;
                                        }
                                        b4 = (b3 = (equals = (b5 = Arrays.equals(this.xPoints, model.xPoints))));
                                    }
                                    catch (RuntimeException ex4) {
                                        throw ex4;
                                    }
                                }
                                try {
                                    if (a != 0) {
                                        break Label_0099;
                                    }
                                    if (b3) {
                                        break Label_0084;
                                    }
                                    return false;
                                }
                                catch (RuntimeException ex5) {
                                    throw ex5;
                                }
                            }
                            try {
                                if (!b3) {
                                    return false;
                                }
                                equals = (b4 = (b5 = Arrays.equals(this.yPoints, model.yPoints)));
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        try {
                            if (a != 0) {
                                break Label_0125;
                            }
                            if (b4) {
                                break Label_0110;
                            }
                            return false;
                        }
                        catch (RuntimeException ex7) {
                            throw ex7;
                        }
                    }
                    try {
                        if (!b4) {
                            return false;
                        }
                        b5 = (equals = Arrays.equals(this.zPoints, model.zPoints));
                    }
                    catch (RuntimeException ex8) {
                        throw ex8;
                    }
                }
                try {
                    if (a != 0) {
                        return b5;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                catch (RuntimeException ex9) {
                    throw ex9;
                }
            }
            return true;
            b5 = false;
            return b5;
        }
        return b;
    }
    
    @Override
    public String toString() {
        return eb.a(Model.z[0]) + this.numFaces + a.a(Model.z[2]) + this.numVertices + eb.a(Model.z[1]) + Arrays.toString(this.faceA);
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "S\f%|(\u00159";
        int n4 = -1;
        String intern = null;
    Label_0056_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0130: {
                    if (n5 > 1) {
                        break Label_0130;
                    }
                    length = (n6 = n7);
                    do {
                        final char c = charArray[n6];
                        char c2 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c2 = '\u0013';
                                break;
                            }
                            case 1: {
                                c2 = '\u001f';
                                break;
                            }
                            case 2: {
                                c2 = '_';
                                break;
                            }
                            case 3: {
                                c2 = 'j';
                                break;
                            }
                            default: {
                                c2 = 'V';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = ";$";
                    n4 = 0;
                    continue Label_0056_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "\u007fN7*%D`\u0018M";
                    n4 = 1;
                    continue Label_0056_Outer;
                }
                case 1: {
                    break Label_0056_Outer;
                }
            }
        }
        z2[n3] = intern;
        z = z2;
    }
}
