
package org.powerbot;

import java.util.concurrent.Callable;

public final class eb implements Callable<Boolean>
{
    private static final String[] z;
    
    public Boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: new             Ljava/net/URL;
        //     8: dup            
        //     9: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //    12: iconst_2       
        //    13: aaload         
        //    14: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    17: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    20: invokestatic    org/powerbot/ab.d:(Ljava/net/URL;)Ljava/io/InputStream;
        //    23: invokestatic    org/powerbot/bb.a:(Ljava/io/InputStream;)Ljava/util/Map;
        //    26: ldc             ""
        //    28: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       Ljava/util/Map;
        //    36: astore_1       
        //    37: aload_1        
        //    38: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //    41: iconst_4       
        //    42: aaload         
        //    43: invokestatic    org/t.a:(Ljava/lang/String;)Ljava/lang/String;
        //    46: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    51: iload           9
        //    53: ifne            344
        //    56: ifeq            343
        //    59: goto            63
        //    62: athrow         
        //    63: aload_1        
        //    64: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //    67: iconst_0       
        //    68: aaload         
        //    69: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    72: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    77: iload           9
        //    79: ifne            344
        //    82: goto            86
        //    85: athrow         
        //    86: ifeq            343
        //    89: goto            93
        //    92: athrow         
        //    93: new             Lorg/powerbot/z;
        //    96: dup            
        //    97: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //   100: iconst_3       
        //   101: aaload         
        //   102: invokestatic    org/t.a:(Ljava/lang/String;)Ljava/lang/String;
        //   105: iconst_1       
        //   106: anewarray       Ljava/lang/Class;
        //   109: dup            
        //   110: iconst_0       
        //   111: aload_0        
        //   112: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   115: aastore        
        //   116: invokespecial   org/powerbot/z.<init>:(Ljava/lang/String;[Ljava/lang/Class;)V
        //   119: astore_2       
        //   120: aload_1        
        //   121: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //   124: iconst_5       
        //   125: aaload         
        //   126: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   129: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   134: checkcast       Ljava/lang/String;
        //   137: astore_3       
        //   138: aload_1        
        //   139: getstatic       org/powerbot/eb.z:[Ljava/lang/String;
        //   142: iconst_1       
        //   143: aaload         
        //   144: invokestatic    org/t.a:(Ljava/lang/String;)Ljava/lang/String;
        //   147: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   152: checkcast       Ljava/lang/String;
        //   155: astore          4
        //   157: aload_2        
        //   158: new             Ljava/net/URL;
        //   161: dup            
        //   162: aload_3        
        //   163: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   166: invokevirtual   org/powerbot/z.a:(Ljava/net/URL;)Ljava/io/InputStream;
        //   169: invokestatic    javax/imageio/ImageIO.read:(Ljava/io/InputStream;)Ljava/awt/image/BufferedImage;
        //   172: astore          5
        //   174: aload           5
        //   176: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   179: sipush          728
        //   182: iload           9
        //   184: ifne            214
        //   187: if_icmpgt       217
        //   190: goto            194
        //   193: athrow         
        //   194: aload           5
        //   196: iload           9
        //   198: ifne            312
        //   201: goto            205
        //   204: athrow         
        //   205: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   208: bipush          120
        //   210: goto            214
        //   213: athrow         
        //   214: if_icmple       310
        //   217: ldc2_w          728.0
        //   220: aload           5
        //   222: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   225: i2d            
        //   226: ddiv           
        //   227: ldc2_w          120.0
        //   230: aload           5
        //   232: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   235: i2d            
        //   236: ddiv           
        //   237: invokestatic    java/lang/Math.min:(DD)D
        //   240: d2f            
        //   241: fstore          6
        //   243: new             Ljava/awt/image/BufferedImage;
        //   246: dup            
        //   247: aload           5
        //   249: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   252: i2f            
        //   253: fload           6
        //   255: fmul           
        //   256: f2i            
        //   257: aload           5
        //   259: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   262: i2f            
        //   263: fload           6
        //   265: fmul           
        //   266: f2i            
        //   267: iconst_2       
        //   268: invokespecial   java/awt/image/BufferedImage.<init>:(III)V
        //   271: astore          7
        //   273: aload           7
        //   275: invokevirtual   java/awt/image/BufferedImage.createGraphics:()Ljava/awt/Graphics2D;
        //   278: astore          8
        //   280: aload           8
        //   282: aload           5
        //   284: iconst_0       
        //   285: iconst_0       
        //   286: aload           7
        //   288: invokevirtual   java/awt/image/BufferedImage.getWidth:()I
        //   291: aload           7
        //   293: invokevirtual   java/awt/image/BufferedImage.getHeight:()I
        //   296: aconst_null    
        //   297: invokevirtual   java/awt/Graphics2D.drawImage:(Ljava/awt/Image;IIIILjava/awt/image/ImageObserver;)Z
        //   300: pop            
        //   301: aload           8
        //   303: invokevirtual   java/awt/Graphics2D.dispose:()V
        //   306: aload           7
        //   308: astore          5
        //   310: aload           5
        //   312: iload           9
        //   314: ifne            326
        //   317: ifnull          343
        //   320: goto            324
        //   323: athrow         
        //   324: aload           5
        //   326: astore          6
        //   328: new             Lorg/powerbot/eb$0;
        //   331: dup            
        //   332: aload_0        
        //   333: aload           6
        //   335: aload           4
        //   337: invokespecial   org/powerbot/eb$0.<init>:(Lorg/powerbot/eb;Ljava/awt/image/BufferedImage;Ljava/lang/String;)V
        //   340: invokestatic    javax/swing/SwingUtilities.invokeAndWait:(Ljava/lang/Runnable;)V
        //   343: iconst_1       
        //   344: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   347: areturn        
        //    StackMapTable: 00 14 FF 00 3E 00 0A 07 00 22 07 00 08 00 00 00 00 00 00 00 01 00 01 07 00 A0 00 55 07 00 A0 40 01 45 07 00 A0 00 FF 00 63 00 0A 07 00 22 07 00 08 07 00 0A 07 00 0E 07 00 0E 07 00 18 00 00 00 01 00 01 07 00 A0 00 49 07 00 A0 40 07 00 18 47 07 00 A0 FF 00 00 00 0A 07 00 22 07 00 08 07 00 0A 07 00 0E 07 00 0E 07 00 18 00 00 00 01 00 02 01 01 02 FB 00 5C 41 07 00 18 4A 07 00 A0 00 41 07 00 18 FF 00 10 00 0A 07 00 22 07 00 08 00 00 00 00 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  312    320    323    324    Ljava/lang/RuntimeException;
        //  194    210    213    214    Ljava/lang/RuntimeException;
        //  187    201    204    205    Ljava/lang/RuntimeException;
        //  174    190    193    194    Ljava/lang/RuntimeException;
        //  63     89     92     93     Ljava/lang/RuntimeException;
        //  56     82     85     86     Ljava/lang/RuntimeException;
        //  37     59     62     63     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0063:
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
    
    public static String a(final String s) {
        final int n = 3;
        final int n2 = n << n ^ 0x3;
        final int n3 = (0x2 ^ 0x5) << 4 ^ 0x5;
        final int length = s.length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] value = array;
        final char c = (char)n3;
        final int n5 = n2;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n4;
            final char char1 = s.charAt(index);
            --n4;
            array2[index] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n4;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n4;
            array3[index2] = c2;
            i = n4;
        }
        return new String(value);
    }
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "{r~\b";
        int n7 = -1;
        String intern = null;
    Label_0081_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0158: {
                    if (n8 > 1) {
                        break Label_0158;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = '\u0010';
                                break;
                            }
                            case 1: {
                                c2 = '7';
                                break;
                            }
                            case 2: {
                                c2 = '\u0017';
                                break;
                            }
                            case 3: {
                                c2 = 'O';
                                break;
                            }
                            default: {
                                c2 = 'v';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "B>GD";
                    n7 = 0;
                    continue Label_0081_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "TDO8`84|\n\u001fWC\u001585`~b\u0001\u001eH\u001eT:=8zt\u0010";
                    n7 = 1;
                    continue Label_0081_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "\u0011m\u0004^\u007fC6NJf\u0000g\u0010";
                    n7 = 2;
                    continue Label_0081_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "\u0019d\u0016\u0016s";
                    n7 = 3;
                    continue Label_0081_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "U]Z/?";
                    n7 = 4;
                    continue Label_0081_Outer;
                }
                case 4: {
                    break Label_0081_Outer;
                }
            }
        }
        z2[n6] = intern;
        z = z2;
    }
}
