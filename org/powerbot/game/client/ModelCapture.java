
package org.powerbot.game.client;

public class ModelCapture implements Model
{
    private int[] vertex_x;
    private int[] vertex_y;
    private int[] vertex_z;
    private short[] face_a;
    private short[] face_b;
    private short[] face_c;
    private int numVertices;
    private int numFaces;
    
    private ModelCapture(final Model model) {
        if (!RandomAccessFile.a) {
            try {
                if (model == null) {
                    return;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            this.vertex_x = model.getXPoints().clone();
            this.vertex_y = model.getYPoints().clone();
            this.vertex_z = model.getZPoints().clone();
            this.numVertices = Math.min(this.vertex_x.length, Math.min(this.vertex_y.length, this.vertex_z.length));
            this.face_a = model.getIndices1().clone();
            this.face_b = model.getIndices2().clone();
            this.face_c = model.getIndices3().clone();
            this.numFaces = Math.min(this.face_a.length, Math.min(this.face_b.length, this.face_c.length));
        }
    }
    
    public static Model updateModel(final Model model, final Model model2) {
        final boolean a = RandomAccessFile.a;
        Model model3 = null;
        Label_0043: {
            Label_0042: {
                Label_0017: {
                    try {
                        model3 = model2;
                        final Model model4 = model2;
                        if (a) {
                            break Label_0017;
                        }
                        if (model2 == null) {
                            return new ModelCapture(model);
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    model3 = model2;
                    final Model model4 = model2;
                    try {
                        if (a) {
                            break Label_0043;
                        }
                        if (model4 instanceof ModelCapture) {
                            break Label_0042;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return new ModelCapture(model);
            }
            model3 = model2;
        }
        final ModelCapture modelCapture = (ModelCapture)model3;
        modelCapture.update(model);
        return modelCapture;
    }
    
    private void update(final Model p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_1        
        //     6: iload           10
        //     8: ifne            20
        //    11: ifnonnull       19
        //    14: goto            18
        //    17: athrow         
        //    18: return         
        //    19: aload_1        
        //    20: invokeinterface org/powerbot/game/client/Model.getXPoints:()[I
        //    25: astore_2       
        //    26: aload_1        
        //    27: invokeinterface org/powerbot/game/client/Model.getYPoints:()[I
        //    32: astore_3       
        //    33: aload_1        
        //    34: invokeinterface org/powerbot/game/client/Model.getZPoints:()[I
        //    39: astore          4
        //    41: aload_1        
        //    42: invokeinterface org/powerbot/game/client/Model.getIndices1:()[S
        //    47: astore          5
        //    49: aload_1        
        //    50: invokeinterface org/powerbot/game/client/Model.getIndices2:()[S
        //    55: astore          6
        //    57: aload_1        
        //    58: invokeinterface org/powerbot/game/client/Model.getIndices3:()[S
        //    63: astore          7
        //    65: aload_2        
        //    66: arraylength    
        //    67: aload_3        
        //    68: arraylength    
        //    69: aload           4
        //    71: arraylength    
        //    72: invokestatic    java/lang/Math.min:(II)I
        //    75: invokestatic    java/lang/Math.min:(II)I
        //    78: istore          8
        //    80: aload           5
        //    82: arraylength    
        //    83: aload           6
        //    85: arraylength    
        //    86: aload           7
        //    88: arraylength    
        //    89: invokestatic    java/lang/Math.min:(II)I
        //    92: invokestatic    java/lang/Math.min:(II)I
        //    95: istore          9
        //    97: iload           10
        //    99: ifne            198
        //   102: iload           8
        //   104: aload_0        
        //   105: getfield        org/powerbot/game/client/ModelCapture.numVertices:I
        //   108: if_icmple       164
        //   111: goto            115
        //   114: athrow         
        //   115: aload_0        
        //   116: iload           8
        //   118: putfield        org/powerbot/game/client/ModelCapture.numVertices:I
        //   121: aload_0        
        //   122: aload_2        
        //   123: invokevirtual   [I.clone:()Ljava/lang/Object;
        //   126: checkcast       [I
        //   129: putfield        org/powerbot/game/client/ModelCapture.vertex_x:[I
        //   132: aload_0        
        //   133: aload_3        
        //   134: invokevirtual   [I.clone:()Ljava/lang/Object;
        //   137: checkcast       [I
        //   140: putfield        org/powerbot/game/client/ModelCapture.vertex_y:[I
        //   143: aload_0        
        //   144: aload           4
        //   146: invokevirtual   [I.clone:()Ljava/lang/Object;
        //   149: checkcast       [I
        //   152: putfield        org/powerbot/game/client/ModelCapture.vertex_z:[I
        //   155: iload           10
        //   157: ifeq            211
        //   160: goto            164
        //   163: athrow         
        //   164: aload_0        
        //   165: iload           8
        //   167: putfield        org/powerbot/game/client/ModelCapture.numVertices:I
        //   170: aload_2        
        //   171: iconst_0       
        //   172: aload_0        
        //   173: getfield        org/powerbot/game/client/ModelCapture.vertex_x:[I
        //   176: iconst_0       
        //   177: iload           8
        //   179: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   182: aload_3        
        //   183: iconst_0       
        //   184: aload_0        
        //   185: getfield        org/powerbot/game/client/ModelCapture.vertex_y:[I
        //   188: iconst_0       
        //   189: iload           8
        //   191: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   194: goto            198
        //   197: athrow         
        //   198: aload           4
        //   200: iconst_0       
        //   201: aload_0        
        //   202: getfield        org/powerbot/game/client/ModelCapture.vertex_z:[I
        //   205: iconst_0       
        //   206: iload           8
        //   208: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   211: iload           9
        //   213: aload_0        
        //   214: getfield        org/powerbot/game/client/ModelCapture.numFaces:I
        //   217: if_icmple       271
        //   220: aload_0        
        //   221: iload           9
        //   223: putfield        org/powerbot/game/client/ModelCapture.numFaces:I
        //   226: aload_0        
        //   227: aload           5
        //   229: invokevirtual   [S.clone:()Ljava/lang/Object;
        //   232: checkcast       [S
        //   235: putfield        org/powerbot/game/client/ModelCapture.face_a:[S
        //   238: aload_0        
        //   239: aload           6
        //   241: invokevirtual   [S.clone:()Ljava/lang/Object;
        //   244: checkcast       [S
        //   247: putfield        org/powerbot/game/client/ModelCapture.face_b:[S
        //   250: aload_0        
        //   251: aload           7
        //   253: invokevirtual   [S.clone:()Ljava/lang/Object;
        //   256: checkcast       [S
        //   259: putfield        org/powerbot/game/client/ModelCapture.face_c:[S
        //   262: iload           10
        //   264: ifeq            320
        //   267: goto            271
        //   270: athrow         
        //   271: aload_0        
        //   272: iload           9
        //   274: putfield        org/powerbot/game/client/ModelCapture.numFaces:I
        //   277: aload           5
        //   279: iconst_0       
        //   280: aload_0        
        //   281: getfield        org/powerbot/game/client/ModelCapture.face_a:[S
        //   284: iconst_0       
        //   285: iload           9
        //   287: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   290: aload           6
        //   292: iconst_0       
        //   293: aload_0        
        //   294: getfield        org/powerbot/game/client/ModelCapture.face_b:[S
        //   297: iconst_0       
        //   298: iload           9
        //   300: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   303: aload           7
        //   305: iconst_0       
        //   306: aload_0        
        //   307: getfield        org/powerbot/game/client/ModelCapture.face_c:[S
        //   310: iconst_0       
        //   311: iload           9
        //   313: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   316: goto            320
        //   319: athrow         
        //   320: return         
        //    StackMapTable: 00 0F FF 00 11 00 0B 07 00 19 07 00 24 00 00 00 00 00 00 00 00 01 00 01 07 00 76 00 00 40 07 00 24 FF 00 5D 00 0B 07 00 19 07 00 24 07 00 5E 07 00 5E 07 00 5E 07 00 63 07 00 63 07 00 63 01 01 01 00 01 07 00 76 00 6F 07 00 76 00 60 07 00 76 00 0C 7A 07 00 76 00 6F 07 00 76 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  220    316    319    320    Ljava/lang/RuntimeException;
        //  211    267    270    271    Ljava/lang/RuntimeException;
        //  115    194    197    198    Ljava/lang/RuntimeException;
        //  102    160    163    164    Ljava/lang/RuntimeException;
        //  97     111    114    115    Ljava/lang/RuntimeException;
        //  5      14     17     18     Ljava/lang/RuntimeException;
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
    
    @Override
    public int[] getXPoints() {
        return this.vertex_x;
    }
    
    @Override
    public int[] getYPoints() {
        return this.vertex_y;
    }
    
    @Override
    public int[] getZPoints() {
        return this.vertex_z;
    }
    
    @Override
    public short[] getIndices1() {
        return this.face_a;
    }
    
    @Override
    public short[] getIndices2() {
        return this.face_b;
    }
    
    @Override
    public short[] getIndices3() {
        return this.face_c;
    }
    
    public int getNumVertices() {
        return this.numVertices;
    }
    
    public int getNumFaces() {
        return this.numFaces;
    }
}
