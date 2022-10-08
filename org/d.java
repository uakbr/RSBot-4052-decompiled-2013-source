
package org;

public class d
{
    byte[] a;
    int b;
    
    public d() {
        this.a = new byte[64];
    }
    
    public d(final int n) {
        this.a = new byte[n];
    }
    
    public d a(final int n) {
        int b = this.b;
        Label_0026: {
            try {
                if (f.c) {
                    return this;
                }
                final int n2 = b;
                final int n3 = 1;
                final int n4 = n2 + n3;
                final d d = this;
                final byte[] array = d.a;
                final int n5 = array.length;
                if (n4 > n5) {
                    break Label_0026;
                }
                break Label_0026;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = b;
                final int n3 = 1;
                final int n4 = n2 + n3;
                final d d = this;
                final byte[] array = d.a;
                final int n5 = array.length;
                if (n4 > n5) {
                    this.d(1);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.a[b++] = (byte)n;
        this.b = b;
        return this;
    }
    
    d a(final int n, final int n2) {
        int b = this.b;
        try {
            if (b + 2 > this.a.length) {
                this.d(2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final byte[] a = this.a;
        a[b++] = (byte)n;
        a[b++] = (byte)n2;
        this.b = b;
        return this;
    }
    
    public d b(final int n) {
        int b = this.b;
        try {
            if (b + 2 > this.a.length) {
                this.d(2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final byte[] a = this.a;
        a[b++] = (byte)(n >>> 8);
        a[b++] = (byte)n;
        this.b = b;
        return this;
    }
    
    d b(final int n, final int n2) {
        int b = this.b;
        try {
            if (b + 3 > this.a.length) {
                this.d(3);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final byte[] a = this.a;
        a[b++] = (byte)n;
        a[b++] = (byte)(n2 >>> 8);
        a[b++] = (byte)n2;
        this.b = b;
        return this;
    }
    
    public d c(final int n) {
        int b = this.b;
        try {
            if (b + 4 > this.a.length) {
                this.d(4);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final byte[] a = this.a;
        a[b++] = (byte)(n >>> 24);
        a[b++] = (byte)(n >>> 16);
        a[b++] = (byte)(n >>> 8);
        a[b++] = (byte)n;
        this.b = b;
        return this;
    }
    
    public d a(final long n) {
        int b = this.b;
        try {
            if (b + 8 > this.a.length) {
                this.d(8);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final byte[] a = this.a;
        final int n2 = (int)(n >>> 32);
        a[b++] = (byte)(n2 >>> 24);
        a[b++] = (byte)(n2 >>> 16);
        a[b++] = (byte)(n2 >>> 8);
        a[b++] = (byte)n2;
        final int n3 = (int)n;
        a[b++] = (byte)(n3 >>> 24);
        a[b++] = (byte)(n3 >>> 16);
        a[b++] = (byte)(n3 >>> 8);
        a[b++] = (byte)n3;
        this.b = b;
        return this;
    }
    
    public d a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: aload_1        
        //     6: invokevirtual   java/lang/String.length:()I
        //     9: istore_2       
        //    10: aload_0        
        //    11: getfield        org/d.b:I
        //    14: istore_3       
        //    15: iload_3        
        //    16: iconst_2       
        //    17: iadd           
        //    18: iload_2        
        //    19: iadd           
        //    20: aload_0        
        //    21: getfield        org/d.a:[B
        //    24: arraylength    
        //    25: if_icmple       39
        //    28: aload_0        
        //    29: iconst_2       
        //    30: iload_2        
        //    31: iadd           
        //    32: invokespecial   org/d.d:(I)V
        //    35: goto            39
        //    38: athrow         
        //    39: aload_0        
        //    40: getfield        org/d.a:[B
        //    43: astore          4
        //    45: aload           4
        //    47: iload_3        
        //    48: iinc            3, 1
        //    51: iload_2        
        //    52: bipush          8
        //    54: iushr          
        //    55: i2b            
        //    56: bastore        
        //    57: aload           4
        //    59: iload_3        
        //    60: iinc            3, 1
        //    63: iload_2        
        //    64: i2b            
        //    65: bastore        
        //    66: iconst_0       
        //    67: istore          5
        //    69: iload           5
        //    71: iload_2        
        //    72: if_icmpge       560
        //    75: aload_1        
        //    76: iload           5
        //    78: invokevirtual   java/lang/String.charAt:(I)C
        //    81: istore          6
        //    83: iload           9
        //    85: ifne            565
        //    88: iload           6
        //    90: iload           9
        //    92: ifne            152
        //    95: goto            99
        //    98: athrow         
        //    99: iconst_1       
        //   100: if_icmplt       146
        //   103: goto            107
        //   106: athrow         
        //   107: iload           6
        //   109: iload           9
        //   111: ifne            152
        //   114: goto            118
        //   117: athrow         
        //   118: bipush          127
        //   120: if_icmpgt       146
        //   123: goto            127
        //   126: athrow         
        //   127: aload           4
        //   129: iload_3        
        //   130: iinc            3, 1
        //   133: iload           6
        //   135: i2b            
        //   136: bastore        
        //   137: iload           9
        //   139: ifeq            548
        //   142: goto            146
        //   145: athrow         
        //   146: iload           5
        //   148: goto            152
        //   151: athrow         
        //   152: istore          7
        //   154: iload           5
        //   156: istore          8
        //   158: iload           8
        //   160: iload_2        
        //   161: if_icmpge       267
        //   164: aload_1        
        //   165: iload           8
        //   167: invokevirtual   java/lang/String.charAt:(I)C
        //   170: istore          6
        //   172: iload           6
        //   174: iconst_1       
        //   175: iload           9
        //   177: ifne            313
        //   180: iload           9
        //   182: ifne            237
        //   185: goto            189
        //   188: athrow         
        //   189: if_icmplt       228
        //   192: goto            196
        //   195: athrow         
        //   196: iload           6
        //   198: bipush          127
        //   200: iload           9
        //   202: ifne            237
        //   205: goto            209
        //   208: athrow         
        //   209: if_icmpgt       228
        //   212: goto            216
        //   215: athrow         
        //   216: iinc            7, 1
        //   219: iload           9
        //   221: ifeq            259
        //   224: goto            228
        //   227: athrow         
        //   228: iload           6
        //   230: sipush          2047
        //   233: goto            237
        //   236: athrow         
        //   237: if_icmple       252
        //   240: iinc            7, 3
        //   243: iload           9
        //   245: ifeq            259
        //   248: goto            252
        //   251: athrow         
        //   252: iinc            7, 2
        //   255: goto            259
        //   258: athrow         
        //   259: iinc            8, 1
        //   262: iload           9
        //   264: ifeq            158
        //   267: aload           4
        //   269: aload_0        
        //   270: getfield        org/d.b:I
        //   273: iload           7
        //   275: bipush          8
        //   277: iushr          
        //   278: i2b            
        //   279: bastore        
        //   280: aload           4
        //   282: aload_0        
        //   283: getfield        org/d.b:I
        //   286: iconst_1       
        //   287: iadd           
        //   288: iload           7
        //   290: i2b            
        //   291: bastore        
        //   292: aload_0        
        //   293: getfield        org/d.b:I
        //   296: iconst_2       
        //   297: iadd           
        //   298: iload           7
        //   300: iadd           
        //   301: iload           9
        //   303: ifne            337
        //   306: aload           4
        //   308: arraylength    
        //   309: goto            313
        //   312: athrow         
        //   313: if_icmple       335
        //   316: aload_0        
        //   317: iload_3        
        //   318: putfield        org/d.b:I
        //   321: aload_0        
        //   322: iconst_2       
        //   323: iload           7
        //   325: iadd           
        //   326: invokespecial   org/d.d:(I)V
        //   329: aload_0        
        //   330: getfield        org/d.a:[B
        //   333: astore          4
        //   335: iload           5
        //   337: istore          8
        //   339: iload           8
        //   341: iload_2        
        //   342: if_icmpge       543
        //   345: aload_1        
        //   346: iload           8
        //   348: invokevirtual   java/lang/String.charAt:(I)C
        //   351: istore          6
        //   353: iload           9
        //   355: ifne            565
        //   358: iload           6
        //   360: iconst_1       
        //   361: iload           9
        //   363: ifne            425
        //   366: goto            370
        //   369: athrow         
        //   370: if_icmplt       416
        //   373: goto            377
        //   376: athrow         
        //   377: iload           6
        //   379: bipush          127
        //   381: iload           9
        //   383: ifne            425
        //   386: goto            390
        //   389: athrow         
        //   390: if_icmpgt       416
        //   393: goto            397
        //   396: athrow         
        //   397: aload           4
        //   399: iload_3        
        //   400: iinc            3, 1
        //   403: iload           6
        //   405: i2b            
        //   406: bastore        
        //   407: iload           9
        //   409: ifeq            535
        //   412: goto            416
        //   415: athrow         
        //   416: iload           6
        //   418: sipush          2047
        //   421: goto            425
        //   424: athrow         
        //   425: if_icmple       494
        //   428: aload           4
        //   430: iload_3        
        //   431: iinc            3, 1
        //   434: sipush          224
        //   437: iload           6
        //   439: bipush          12
        //   441: ishr           
        //   442: bipush          15
        //   444: iand           
        //   445: ior            
        //   446: i2b            
        //   447: bastore        
        //   448: aload           4
        //   450: iload_3        
        //   451: iinc            3, 1
        //   454: sipush          128
        //   457: iload           6
        //   459: bipush          6
        //   461: ishr           
        //   462: bipush          63
        //   464: iand           
        //   465: ior            
        //   466: i2b            
        //   467: bastore        
        //   468: aload           4
        //   470: iload_3        
        //   471: iinc            3, 1
        //   474: sipush          128
        //   477: iload           6
        //   479: bipush          63
        //   481: iand           
        //   482: ior            
        //   483: i2b            
        //   484: bastore        
        //   485: iload           9
        //   487: ifeq            535
        //   490: goto            494
        //   493: athrow         
        //   494: aload           4
        //   496: iload_3        
        //   497: iinc            3, 1
        //   500: sipush          192
        //   503: iload           6
        //   505: bipush          6
        //   507: ishr           
        //   508: bipush          31
        //   510: iand           
        //   511: ior            
        //   512: i2b            
        //   513: bastore        
        //   514: aload           4
        //   516: iload_3        
        //   517: iinc            3, 1
        //   520: sipush          128
        //   523: iload           6
        //   525: bipush          63
        //   527: iand           
        //   528: ior            
        //   529: i2b            
        //   530: bastore        
        //   531: goto            535
        //   534: athrow         
        //   535: iinc            8, 1
        //   538: iload           9
        //   540: ifeq            339
        //   543: iload           9
        //   545: ifeq            560
        //   548: iinc            5, 1
        //   551: iload           9
        //   553: ifeq            69
        //   556: goto            560
        //   559: athrow         
        //   560: aload_0        
        //   561: iload_3        
        //   562: putfield        org/d.b:I
        //   565: aload_0        
        //   566: areturn        
        //    StackMapTable: 00 3B FF 00 26 00 0A 07 00 08 07 00 1E 01 01 00 00 00 00 00 01 00 01 07 00 32 00 FF 00 1D 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 00 00 00 01 00 00 FF 00 1C 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 00 00 01 00 01 07 00 32 40 01 46 07 00 32 00 49 07 00 32 40 01 47 07 00 32 00 51 07 00 32 00 44 07 00 32 40 01 FF 00 05 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 00 5D 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 45 07 00 32 00 4B 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 45 07 00 32 00 4A 07 00 32 00 47 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 4D 07 00 32 00 45 07 00 32 00 07 6C 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 15 41 01 01 5D 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 45 07 00 32 00 4B 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 45 07 00 32 00 51 07 00 32 00 47 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 01 01 01 00 02 01 01 F7 00 43 07 00 32 00 67 07 00 32 00 07 FF 00 04 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 01 00 00 01 00 00 4A 07 00 32 FF 00 00 00 0A 07 00 08 07 00 1E 01 01 07 00 35 01 00 00 00 01 00 00 04
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  543    556    559    560    Ljava/lang/RuntimeException;
        //  428    531    534    535    Ljava/lang/RuntimeException;
        //  425    490    493    494    Ljava/lang/RuntimeException;
        //  397    421    424    425    Ljava/lang/RuntimeException;
        //  390    412    415    416    Ljava/lang/RuntimeException;
        //  377    393    396    397    Ljava/lang/RuntimeException;
        //  370    386    389    390    Ljava/lang/RuntimeException;
        //  358    373    376    377    Ljava/lang/RuntimeException;
        //  353    366    369    370    Ljava/lang/RuntimeException;
        //  267    309    312    313    Ljava/lang/RuntimeException;
        //  240    255    258    259    Ljava/lang/RuntimeException;
        //  237    248    251    252    Ljava/lang/RuntimeException;
        //  216    233    236    237    Ljava/lang/RuntimeException;
        //  209    224    227    228    Ljava/lang/RuntimeException;
        //  196    212    215    216    Ljava/lang/RuntimeException;
        //  189    205    208    209    Ljava/lang/RuntimeException;
        //  180    192    195    196    Ljava/lang/RuntimeException;
        //  172    185    188    189    Ljava/lang/RuntimeException;
        //  127    148    151    152    Ljava/lang/RuntimeException;
        //  118    142    145    146    Ljava/lang/RuntimeException;
        //  107    123    126    127    Ljava/lang/RuntimeException;
        //  99     114    117    118    Ljava/lang/RuntimeException;
        //  88     103    106    107    Ljava/lang/RuntimeException;
        //  83     95     98     99     Ljava/lang/RuntimeException;
        //  15     35     38     39     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0099:
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
    
    public d a(final byte[] array, final int n, final int n2) {
        final boolean c = f.c;
        Label_0064: {
            byte[] array3 = null;
            Label_0051: {
                Label_0037: {
                    d d = null;
                    Label_0028: {
                        try {
                            d = this;
                            if (c) {
                                break Label_0028;
                            }
                            final int n3 = this.b;
                            final int n4 = n2;
                            final int n5 = n3 + n4;
                            final d d2 = this;
                            final byte[] array2 = d2.a;
                            final int n6 = array2.length;
                            if (n5 > n6) {
                                break Label_0028;
                            }
                            break Label_0037;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final int n3 = this.b;
                            final int n4 = n2;
                            final int n5 = n3 + n4;
                            final d d2 = this;
                            final byte[] array2 = d2.a;
                            final int n6 = array2.length;
                            if (n5 <= n6) {
                                break Label_0037;
                            }
                            d = this;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    d.d(n2);
                    try {
                        array3 = array;
                        if (c) {
                            break Label_0051;
                        }
                        if (array == null) {
                            break Label_0064;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                array3 = array;
            }
            System.arraycopy(array3, n, this.a, this.b, n2);
        }
        this.b += n2;
        return this;
    }
    
    private void d(final int n) {
        final int n2 = 2 * this.a.length;
        final int n3 = this.b + n;
        int n5 = 0;
        Label_0039: {
            Label_0038: {
                Label_0030: {
                    int n4;
                    try {
                        n4 = (n5 = n2);
                        if (f.c) {
                            break Label_0030;
                        }
                        final int n6 = n3;
                        if (n4 > n6) {
                            break Label_0030;
                        }
                        break Label_0038;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int n6 = n3;
                        if (n4 <= n6) {
                            break Label_0038;
                        }
                        n5 = n2;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                break Label_0039;
            }
            n5 = n3;
        }
        final byte[] a = new byte[n5];
        System.arraycopy(this.a, 0, a, 0, this.b);
        this.a = a;
    }
}
