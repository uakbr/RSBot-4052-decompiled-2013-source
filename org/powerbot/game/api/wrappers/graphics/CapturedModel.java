
package org.powerbot.game.api.wrappers.graphics;

import org.powerbot.game.api.util.node.Queue;
import org.powerbot.core.script.internal.Constants;
import java.awt.Graphics;
import java.awt.Polygon;
import org.powerbot.core.script.methods.Calculations;
import java.awt.Point;
import org.powerbot.game.api.util.Random;
import java.util.Arrays;
import org.powerbot.game.api.util.Filter;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.ModelCapture;
import org.powerbot.game.client.Model;

public abstract class CapturedModel
{
    protected int[] xPoints;
    protected int[] yPoints;
    protected int[] zPoints;
    protected short[] faceA;
    protected short[] faceB;
    protected short[] faceC;
    protected int numVertices;
    protected int numFaces;
    public static boolean a;
    private static final String[] z;
    
    public CapturedModel(final Model model) {
        final boolean a = CapturedModel.a;
        this.xPoints = model.getXPoints();
        this.yPoints = model.getYPoints();
        this.zPoints = model.getZPoints();
        this.faceA = model.getIndices1();
        this.faceB = model.getIndices2();
        this.faceC = model.getIndices3();
        if (!a) {
            Label_0120: {
                try {
                    if (!(model instanceof ModelCapture)) {
                        break Label_0120;
                    }
                    this.numVertices = ((ModelCapture)model).getNumVertices();
                    this.numFaces = ((ModelCapture)model).getNumFaces();
                    if (!a) {
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
    
    public static Filter<CapturedModel> newVertexFilter(final short[] array) {
        return new Filter<CapturedModel>() {
            @Override
            public boolean accept(final CapturedModel capturedModel) {
                return Arrays.equals(capturedModel.faceA, array);
            }
        };
    }
    
    protected abstract int getLocalX();
    
    protected abstract int getLocalY();
    
    protected abstract void update();
    
    @Deprecated
    public boolean isOnScreen() {
        int nextTriangle = 0;
        Label_0018: {
            int n;
            try {
                n = (nextTriangle = this.nextTriangle());
                if (CapturedModel.a) {
                    return nextTriangle != 0;
                }
                final int n2 = -1;
                if (n != n2) {
                    break Label_0018;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = -1;
                if (n == n2) {
                    return false;
                }
                nextTriangle = 1;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return nextTriangle != 0;
        nextTriangle = 0;
        return nextTriangle != 0;
    }
    
    public int nextTriangle() {
        this.update();
        final int nextInt = Random.nextInt(0, this.numFaces);
        final int firstOnScreenIndex = this.firstOnScreenIndex(nextInt, this.numFaces);
        int firstOnScreenIndex2 = 0;
        Label_0038: {
            int n;
            try {
                n = (firstOnScreenIndex2 = firstOnScreenIndex);
                if (CapturedModel.a) {
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
        final boolean a = CapturedModel.a;
        int localX = 0;
        Label_0046: {
            Label_0035: {
                int n2 = 0;
                Label_0019: {
                    try {
                        localX = n;
                        n2 = n;
                        if (a) {
                            break Label_0019;
                        }
                        if (n < 0) {
                            break Label_0035;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    localX = n;
                    n2 = n;
                    try {
                        if (a) {
                            break Label_0046;
                        }
                        final CapturedModel capturedModel = this;
                        final int n3 = capturedModel.numFaces;
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
                    final CapturedModel capturedModel = this;
                    final int n3 = capturedModel.numFaces;
                    if (n2 >= n3) {
                        return null;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            this.update();
            localX = this.getLocalX();
        }
        final int n4 = localX;
        final int localY = this.getLocalY();
        final Point worldToScreen = Calculations.worldToScreen(n4 + (this.xPoints[this.faceA[n]] + this.xPoints[this.faceB[n]] + this.xPoints[this.faceC[n]]) / 3, Calculations.tileHeight(n4, localY) + (this.yPoints[this.faceA[n]] + this.yPoints[this.faceB[n]] + this.yPoints[this.faceC[n]]) / 3, localY + (this.zPoints[this.faceA[n]] + this.zPoints[this.faceB[n]] + this.zPoints[this.faceC[n]]) / 3);
        Point point2 = null;
        Label_0199: {
            Point point;
            try {
                point = (point2 = worldToScreen);
                if (a) {
                    return point2;
                }
                final boolean b = org.powerbot.game.api.methods.Calculations.isOnScreen(point);
                if (b) {
                    break Label_0199;
                }
                return null;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            try {
                final boolean b = org.powerbot.game.api.methods.Calculations.isOnScreen(point);
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
    
    @Deprecated
    public Point getNextViewportPoint() {
        return this.getNextPoint();
    }
    
    public Point getNextPoint() {
        final boolean a = CapturedModel.a;
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
                    if (a) {
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
                if (a) {
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
    
    @Deprecated
    public Point getCentralPoint() {
        return this.getCenterPoint();
    }
    
    public Point getCenterPoint() {
        final boolean a = CapturedModel.a;
        int numFaces = 0;
        Label_0038: {
            Label_0022: {
                int n;
                try {
                    n = (numFaces = this.numFaces);
                    if (a) {
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
        final int localX = this.getLocalX();
        final int localY = this.getLocalY();
        final int tileHeight = Calculations.tileHeight(localX, localY);
        while (true) {
            while (i < this.numFaces) {
                n3 += (this.xPoints[this.faceA[i]] + this.xPoints[this.faceB[i]] + this.xPoints[this.faceC[i]]) / 3;
                n4 += (this.zPoints[this.faceA[i]] + this.zPoints[this.faceB[i]] + this.zPoints[this.faceC[i]]) / 3;
                final int n6 = n5 + (this.yPoints[this.faceA[i]] + this.yPoints[this.faceB[i]] + this.yPoints[this.faceC[i]]) / 3;
                if (a) {
                    final Point worldToScreen = Calculations.worldToScreen(n6, tileHeight + n5 / this.numFaces, localY + n4 / this.numFaces);
                    Point point;
                    try {
                        final Point point2;
                        point = (point2 = worldToScreen);
                        if (a) {
                            return point2;
                        }
                        final boolean b = org.powerbot.game.api.methods.Calculations.isOnScreen(point);
                        if (b) {
                            return worldToScreen;
                        }
                        return new Point(-1, -1);
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final boolean b = org.powerbot.game.api.methods.Calculations.isOnScreen(point);
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
                if (a) {
                    break;
                }
            }
            final int n7 = localX + n3 / this.numFaces;
            continue;
        }
    }
    
    @Deprecated
    public Polygon[] getBounds() {
        return this.getTriangles();
    }
    
    public Polygon[] getTriangles() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/game/api/wrappers/graphics/CapturedModel.projectVertices:()[[I
        //     9: astore_1       
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: aload_0        
        //    15: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.numFaces:I
        //    18: invokespecial   java/util/ArrayList.<init>:(I)V
        //    21: astore_2       
        //    22: iconst_0       
        //    23: istore_3       
        //    24: iload_3        
        //    25: aload_0        
        //    26: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.numFaces:I
        //    29: if_icmpge       197
        //    32: aload_0        
        //    33: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceA:[S
        //    36: iload_3        
        //    37: saload         
        //    38: istore          4
        //    40: aload_0        
        //    41: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceB:[S
        //    44: iload_3        
        //    45: saload         
        //    46: istore          5
        //    48: aload_0        
        //    49: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceC:[S
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
        //    StackMapTable: 00 0A FF 00 18 00 0A 07 00 48 07 00 36 07 00 26 01 00 00 00 00 00 01 00 00 FF 00 73 00 0A 07 00 48 07 00 36 07 00 26 01 01 01 01 07 01 55 07 01 55 01 00 01 07 01 40 40 07 00 36 59 07 01 40 00 53 07 01 40 00 02 FF 00 04 00 0A 07 00 48 07 00 36 07 00 26 01 00 00 00 00 00 01 00 00 4A 07 01 56
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
        //    16: invokespecial   org/powerbot/game/api/wrappers/graphics/CapturedModel.projectVertices:()[[I
        //    19: astore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: aload_0        
        //    27: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.numFaces:I
        //    30: if_icmpge       179
        //    33: aload_0        
        //    34: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceA:[S
        //    37: iload           5
        //    39: saload         
        //    40: istore          6
        //    42: aload_0        
        //    43: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceB:[S
        //    46: iload           5
        //    48: saload         
        //    49: istore          7
        //    51: aload_0        
        //    52: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceC:[S
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
        //   150: invokespecial   org/powerbot/game/api/wrappers/graphics/CapturedModel.isPointInTriangle:(IIIIIIII)Z
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
        //    StackMapTable: 00 0E FF 00 18 00 0A 07 00 48 07 00 21 01 01 07 00 36 01 00 00 00 01 00 00 FF 00 47 00 0A 07 00 48 07 00 21 01 01 07 00 36 01 01 01 01 01 00 01 07 01 40 40 01 46 07 01 40 00 77 07 01 40 40 01 45 07 01 40 00 40 01 00 02 FF 00 04 00 0A 07 00 48 07 00 21 01 01 07 00 36 01 00 00 00 01 00 00 40 01
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
    
    @Deprecated
    public void draw(final Graphics graphics) {
        this.drawWireFrame(graphics);
    }
    
    public void drawWireFrame(final Graphics graphics) {
        final boolean a = CapturedModel.a;
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
                        if (a) {
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
            if (a) {
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
        //     3: istore          10
        //     5: getstatic       org/powerbot/core/script/methods/Calculations.toolkit:Lorg/powerbot/core/script/methods/Calculations$Toolkit;
        //     8: astore_3       
        //     9: getstatic       org/powerbot/core/script/methods/Calculations.viewport:Lorg/powerbot/core/script/methods/Calculations$Viewport;
        //    12: astore          4
        //    14: aload_0        
        //    15: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.getLocalX:()I
        //    18: istore          5
        //    20: aload_0        
        //    21: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.getLocalY:()I
        //    24: istore          6
        //    26: iload           5
        //    28: iload           6
        //    30: invokestatic    org/powerbot/core/script/methods/Calculations.tileHeight:(II)I
        //    33: istore          7
        //    35: iload_1        
        //    36: istore          8
        //    38: iload           8
        //    40: iload_2        
        //    41: if_icmpge       216
        //    44: iload           5
        //    46: aload_0        
        //    47: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.xPoints:[I
        //    50: aload_0        
        //    51: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceA:[S
        //    54: iload           8
        //    56: saload         
        //    57: iaload         
        //    58: aload_0        
        //    59: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.xPoints:[I
        //    62: aload_0        
        //    63: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceB:[S
        //    66: iload           8
        //    68: saload         
        //    69: iaload         
        //    70: iadd           
        //    71: aload_0        
        //    72: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.xPoints:[I
        //    75: aload_0        
        //    76: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceC:[S
        //    79: iload           8
        //    81: saload         
        //    82: iaload         
        //    83: iadd           
        //    84: iconst_3       
        //    85: idiv           
        //    86: iadd           
        //    87: iload           7
        //    89: aload_0        
        //    90: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.yPoints:[I
        //    93: aload_0        
        //    94: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceA:[S
        //    97: iload           8
        //    99: saload         
        //   100: iaload         
        //   101: aload_0        
        //   102: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.yPoints:[I
        //   105: aload_0        
        //   106: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceB:[S
        //   109: iload           8
        //   111: saload         
        //   112: iaload         
        //   113: iadd           
        //   114: aload_0        
        //   115: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.yPoints:[I
        //   118: aload_0        
        //   119: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceC:[S
        //   122: iload           8
        //   124: saload         
        //   125: iaload         
        //   126: iadd           
        //   127: iconst_3       
        //   128: idiv           
        //   129: iadd           
        //   130: iload           6
        //   132: aload_0        
        //   133: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.zPoints:[I
        //   136: aload_0        
        //   137: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceA:[S
        //   140: iload           8
        //   142: saload         
        //   143: iaload         
        //   144: aload_0        
        //   145: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.zPoints:[I
        //   148: aload_0        
        //   149: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceB:[S
        //   152: iload           8
        //   154: saload         
        //   155: iaload         
        //   156: iadd           
        //   157: aload_0        
        //   158: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.zPoints:[I
        //   161: aload_0        
        //   162: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.faceC:[S
        //   165: iload           8
        //   167: saload         
        //   168: iaload         
        //   169: iadd           
        //   170: iconst_3       
        //   171: idiv           
        //   172: iadd           
        //   173: invokestatic    org/powerbot/core/script/methods/Calculations.worldToScreen:(III)Ljava/awt/Point;
        //   176: astore          9
        //   178: iload           10
        //   180: ifne            211
        //   183: aload           9
        //   185: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(Ljava/awt/Point;)Z
        //   188: iload           10
        //   190: ifne            217
        //   193: goto            197
        //   196: athrow         
        //   197: ifeq            208
        //   200: goto            204
        //   203: athrow         
        //   204: iload           8
        //   206: ireturn        
        //   207: athrow         
        //   208: iinc            8, 1
        //   211: iload           10
        //   213: ifeq            38
        //   216: iconst_m1      
        //   217: ireturn        
        //    StackMapTable: 00 0A FF 00 26 00 0B 07 00 48 01 01 07 00 D5 07 00 C8 01 01 01 01 00 01 00 00 FF 00 9D 00 0B 07 00 48 01 01 07 00 D5 07 00 C8 01 01 01 01 07 00 21 01 00 01 07 01 40 40 01 45 07 01 40 00 42 07 01 40 00 02 FF 00 04 00 0B 07 00 48 01 01 07 00 D5 07 00 C8 01 01 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  197    207    207    208    Ljava/lang/RuntimeException;
        //  183    200    203    204    Ljava/lang/RuntimeException;
        //  178    193    196    197    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0197:
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
        final boolean a = CapturedModel.a;
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
                    if (a) {
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
                if (a) {
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
        //     3: istore          14
        //     5: getstatic       org/powerbot/core/script/methods/Calculations.toolkit:Lorg/powerbot/core/script/methods/Calculations$Toolkit;
        //     8: astore_1       
        //     9: getstatic       org/powerbot/core/script/methods/Calculations.viewport:Lorg/powerbot/core/script/methods/Calculations$Viewport;
        //    12: astore_2       
        //    13: aload_0        
        //    14: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.update:()V
        //    17: aload_0        
        //    18: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.getLocalX:()I
        //    21: istore_3       
        //    22: aload_0        
        //    23: invokevirtual   org/powerbot/game/api/wrappers/graphics/CapturedModel.getLocalY:()I
        //    26: istore          4
        //    28: iload_3        
        //    29: iload           4
        //    31: invokestatic    org/powerbot/core/script/methods/Calculations.tileHeight:(II)I
        //    34: istore          5
        //    36: aload_0        
        //    37: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.numVertices:I
        //    40: iconst_3       
        //    41: multianewarray  [[I
        //    45: astore          6
        //    47: iconst_0       
        //    48: istore          7
        //    50: iload           7
        //    52: aload_0        
        //    53: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.numVertices:I
        //    56: if_icmpge       369
        //    59: aload_0        
        //    60: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.xPoints:[I
        //    63: iload           7
        //    65: iaload         
        //    66: iload_3        
        //    67: iadd           
        //    68: istore          8
        //    70: aload_0        
        //    71: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.yPoints:[I
        //    74: iload           7
        //    76: iaload         
        //    77: iload           5
        //    79: iadd           
        //    80: istore          9
        //    82: aload_0        
        //    83: getfield        org/powerbot/game/api/wrappers/graphics/CapturedModel.zPoints:[I
        //    86: iload           7
        //    88: iaload         
        //    89: iload           4
        //    91: iadd           
        //    92: istore          10
        //    94: aload_2        
        //    95: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zOff:F
        //    98: aload_2        
        //    99: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zX:F
        //   102: iload           8
        //   104: i2f            
        //   105: fmul           
        //   106: aload_2        
        //   107: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zY:F
        //   110: iload           9
        //   112: i2f            
        //   113: fmul           
        //   114: fadd           
        //   115: aload_2        
        //   116: getfield        org/powerbot/core/script/methods/Calculations$Viewport.zZ:F
        //   119: iload           10
        //   121: i2f            
        //   122: fmul           
        //   123: fadd           
        //   124: fadd           
        //   125: fstore          11
        //   127: aload_2        
        //   128: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xOff:F
        //   131: aload_2        
        //   132: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xX:F
        //   135: iload           8
        //   137: i2f            
        //   138: fmul           
        //   139: aload_2        
        //   140: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xY:F
        //   143: iload           9
        //   145: i2f            
        //   146: fmul           
        //   147: fadd           
        //   148: aload_2        
        //   149: getfield        org/powerbot/core/script/methods/Calculations$Viewport.xZ:F
        //   152: iload           10
        //   154: i2f            
        //   155: fmul           
        //   156: fadd           
        //   157: fadd           
        //   158: fstore          12
        //   160: aload_2        
        //   161: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yOff:F
        //   164: aload_2        
        //   165: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yX:F
        //   168: iload           8
        //   170: i2f            
        //   171: fmul           
        //   172: aload_2        
        //   173: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yY:F
        //   176: iload           9
        //   178: i2f            
        //   179: fmul           
        //   180: fadd           
        //   181: aload_2        
        //   182: getfield        org/powerbot/core/script/methods/Calculations$Viewport.yZ:F
        //   185: iload           10
        //   187: i2f            
        //   188: fmul           
        //   189: fadd           
        //   190: fadd           
        //   191: fstore          13
        //   193: iload           14
        //   195: ifne            353
        //   198: fload           12
        //   200: fload           11
        //   202: fneg           
        //   203: fcmpl          
        //   204: iflt            333
        //   207: goto            211
        //   210: athrow         
        //   211: fload           12
        //   213: fload           11
        //   215: fcmpg          
        //   216: iload           14
        //   218: ifne            242
        //   221: goto            225
        //   224: athrow         
        //   225: ifgt            333
        //   228: goto            232
        //   231: athrow         
        //   232: fload           13
        //   234: fload           11
        //   236: fneg           
        //   237: fcmpl          
        //   238: goto            242
        //   241: athrow         
        //   242: iload           14
        //   244: ifne            263
        //   247: iflt            333
        //   250: goto            254
        //   253: athrow         
        //   254: fload           13
        //   256: fload           11
        //   258: fcmpg          
        //   259: goto            263
        //   262: athrow         
        //   263: ifgt            333
        //   266: aload           6
        //   268: iload           7
        //   270: aaload         
        //   271: iconst_0       
        //   272: aload_1        
        //   273: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.absoluteX:F
        //   276: aload_1        
        //   277: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.xMultiplier:F
        //   280: fload           12
        //   282: fmul           
        //   283: fload           11
        //   285: fdiv           
        //   286: fadd           
        //   287: invokestatic    java/lang/Math.round:(F)I
        //   290: iastore        
        //   291: aload           6
        //   293: iload           7
        //   295: aaload         
        //   296: iconst_1       
        //   297: aload_1        
        //   298: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.absoluteY:F
        //   301: aload_1        
        //   302: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.yMultiplier:F
        //   305: fload           13
        //   307: fmul           
        //   308: fload           11
        //   310: fdiv           
        //   311: fadd           
        //   312: invokestatic    java/lang/Math.round:(F)I
        //   315: iastore        
        //   316: aload           6
        //   318: iload           7
        //   320: aaload         
        //   321: iconst_2       
        //   322: iconst_1       
        //   323: iastore        
        //   324: iload           14
        //   326: ifeq            361
        //   329: goto            333
        //   332: athrow         
        //   333: aload           6
        //   335: iload           7
        //   337: aaload         
        //   338: iconst_0       
        //   339: iconst_m1      
        //   340: iastore        
        //   341: aload           6
        //   343: iload           7
        //   345: aaload         
        //   346: iconst_1       
        //   347: iconst_m1      
        //   348: iastore        
        //   349: goto            353
        //   352: athrow         
        //   353: aload           6
        //   355: iload           7
        //   357: aaload         
        //   358: iconst_2       
        //   359: iconst_0       
        //   360: iastore        
        //   361: iinc            7, 1
        //   364: iload           14
        //   366: ifeq            50
        //   369: aload           6
        //   371: areturn        
        //    StackMapTable: 00 13 FF 00 32 00 0F 07 00 48 07 00 D5 07 00 C8 01 01 01 07 00 36 01 00 00 00 00 00 00 01 00 00 FF 00 9F 00 0F 07 00 48 07 00 D5 07 00 C8 01 01 01 07 00 36 01 01 01 01 02 02 02 01 00 01 07 01 40 00 4C 07 01 40 40 01 45 07 01 40 00 48 07 01 40 40 01 4A 07 01 40 00 47 07 01 40 40 01 F7 00 44 07 01 40 00 52 07 01 40 00 07 FF 00 07 00 0F 07 00 48 07 00 D5 07 00 C8 01 01 01 07 00 36 01 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  266    349    352    353    Ljava/lang/RuntimeException;
        //  263    329    332    333    Ljava/lang/RuntimeException;
        //  247    259    262    263    Ljava/lang/RuntimeException;
        //  242    250    253    254    Ljava/lang/RuntimeException;
        //  225    238    241    242    Ljava/lang/RuntimeException;
        //  211    228    231    232    Ljava/lang/RuntimeException;
        //  198    221    224    225    Ljava/lang/RuntimeException;
        //  193    207    210    211    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0211:
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
        final boolean a = CapturedModel.a;
        boolean b = false;
        Label_0142: {
            Label_0017: {
                try {
                    final Object o2 = o;
                    if (a) {
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
                    b = (o2 instanceof CapturedModel);
                    if (a) {
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
            final CapturedModel capturedModel = (CapturedModel)o;
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
                                        b2 = (b3 = (b4 = (equals = (b5 = Arrays.equals(this.faceA, capturedModel.faceA)))));
                                        if (a) {
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
                                        b4 = (b3 = (equals = (b5 = Arrays.equals(this.xPoints, capturedModel.xPoints))));
                                    }
                                    catch (RuntimeException ex4) {
                                        throw ex4;
                                    }
                                }
                                try {
                                    if (a) {
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
                                equals = (b4 = (b5 = Arrays.equals(this.yPoints, capturedModel.yPoints)));
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        try {
                            if (a) {
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
                        b5 = (equals = Arrays.equals(this.zPoints, capturedModel.zPoints));
                    }
                    catch (RuntimeException ex8) {
                        throw ex8;
                    }
                }
                try {
                    if (a) {
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
        final boolean a = CapturedModel.a;
        String string = null;
        boolean a2 = false;
        Label_0091: {
            Label_0085: {
                try {
                    string = Constants.e(CapturedModel.z[1]) + this.numFaces + Queue.e(CapturedModel.z[0]) + this.numVertices + Constants.e(CapturedModel.z[2]) + Arrays.toString(this.faceA);
                    if (Task.a == 0) {
                        return string;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0085;
                    }
                    break Label_0085;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0091;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        CapturedModel.a = a2;
        return string;
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "7\u0006Z\n1Hl1)";
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
                                c2 = 'p';
                                break;
                            }
                            case 1: {
                                c2 = '8';
                                break;
                            }
                            case 2: {
                                c2 = '\u0019';
                                break;
                            }
                            case 3: {
                                c2 = '%';
                                break;
                            }
                            default: {
                                c2 = 'i';
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
                    s = "|[/C[\u0006R";
                    n4 = 0;
                    continue Label_0056_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "(O";
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
