
package org.powerbot;

import java.util.zip.ZipInputStream;
import java.net.URLClassLoader;
import java.net.URL;

public final class x
{
    private static final String z;
    
    public static Object a(final URL... array) {
        return URLClassLoader.class.getDeclaredConstructor(URL[].class).newInstance(array);
    }
    
    public static Object a(final ZipInputStream p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: ldc             Lorg/powerbot/a;.class
        //     7: astore_1       
        //     8: aload_1        
        //     9: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
        //    12: astore_2       
        //    13: ldc             Ljava/lang/ClassLoader;.class
        //    15: getstatic       org/powerbot/x.z:Ljava/lang/String;
        //    18: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //    21: iconst_4       
        //    22: anewarray       Ljava/lang/Class;
        //    25: dup            
        //    26: iconst_0       
        //    27: ldc             Ljava/lang/String;.class
        //    29: aastore        
        //    30: dup            
        //    31: iconst_1       
        //    32: ldc             [B.class
        //    34: aastore        
        //    35: dup            
        //    36: iconst_2       
        //    37: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    40: aastore        
        //    41: dup            
        //    42: iconst_3       
        //    43: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //    46: aastore        
        //    47: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //    50: astore_3       
        //    51: aload_3        
        //    52: iconst_1       
        //    53: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
        //    56: new             Ljava/util/HashMap;
        //    59: dup            
        //    60: invokespecial   java/util/HashMap.<init>:()V
        //    63: astore          4
        //    65: aload_0        
        //    66: invokevirtual   java/util/zip/ZipInputStream.getNextEntry:()Ljava/util/zip/ZipEntry;
        //    69: dup            
        //    70: astore          5
        //    72: ifnull          178
        //    75: new             Ljava/io/ByteArrayOutputStream;
        //    78: dup            
        //    79: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //    82: astore          6
        //    84: iload           12
        //    86: ifne            182
        //    89: sipush          4096
        //    92: newarray        B
        //    94: astore          7
        //    96: aload_0        
        //    97: aload           7
        //    99: invokevirtual   java/util/zip/ZipInputStream.read:([B)I
        //   102: dup            
        //   103: istore          8
        //   105: iconst_m1      
        //   106: if_icmpeq       129
        //   109: aload           6
        //   111: aload           7
        //   113: iconst_0       
        //   114: iload           8
        //   116: invokevirtual   java/io/ByteArrayOutputStream.write:([BII)V
        //   119: iload           12
        //   121: ifne            65
        //   124: iload           12
        //   126: ifeq            96
        //   129: aload           5
        //   131: invokevirtual   java/util/zip/ZipEntry.getName:()Ljava/lang/String;
        //   134: astore          9
        //   136: aload           4
        //   138: aload           9
        //   140: iconst_0       
        //   141: aload           9
        //   143: bipush          46
        //   145: invokevirtual   java/lang/String.indexOf:(I)I
        //   148: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   151: bipush          47
        //   153: bipush          46
        //   155: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   158: aload           6
        //   160: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   163: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   168: pop            
        //   169: aload_0        
        //   170: invokevirtual   java/util/zip/ZipInputStream.closeEntry:()V
        //   173: iload           12
        //   175: ifeq            65
        //   178: aload_0        
        //   179: invokevirtual   java/util/zip/ZipInputStream.close:()V
        //   182: new             Ljava/util/Stack;
        //   185: dup            
        //   186: invokespecial   java/util/Stack.<init>:()V
        //   189: astore          6
        //   191: new             Ljava/util/ArrayList;
        //   194: dup            
        //   195: aload           4
        //   197: invokeinterface java/util/Map.size:()I
        //   202: invokespecial   java/util/ArrayList.<init>:(I)V
        //   205: astore          7
        //   207: aload           6
        //   209: aload           4
        //   211: invokeinterface java/util/Map.keySet:()Ljava/util/Set;
        //   216: invokevirtual   java/util/Stack.addAll:(Ljava/util/Collection;)Z
        //   219: pop            
        //   220: aload           6
        //   222: invokevirtual   java/util/Stack.isEmpty:()Z
        //   225: ifne            417
        //   228: aload           6
        //   230: invokevirtual   java/util/Stack.pop:()Ljava/lang/Object;
        //   233: checkcast       Ljava/lang/String;
        //   236: astore          8
        //   238: aload           7
        //   240: iload           12
        //   242: ifne            425
        //   245: iload           12
        //   247: ifne            281
        //   250: goto            254
        //   253: athrow         
        //   254: aload           8
        //   256: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   261: ifeq            272
        //   264: goto            268
        //   267: athrow         
        //   268: goto            220
        //   271: athrow         
        //   272: aload           4
        //   274: aload           8
        //   276: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   281: checkcast       [B
        //   284: astore          9
        //   286: aload_3        
        //   287: aload_2        
        //   288: iconst_4       
        //   289: anewarray       Ljava/lang/Object;
        //   292: dup            
        //   293: iconst_0       
        //   294: aload           8
        //   296: aastore        
        //   297: dup            
        //   298: iconst_1       
        //   299: aload           9
        //   301: aastore        
        //   302: dup            
        //   303: iconst_2       
        //   304: iconst_0       
        //   305: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   308: aastore        
        //   309: dup            
        //   310: iconst_3       
        //   311: aload           9
        //   313: arraylength    
        //   314: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   317: aastore        
        //   318: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   321: pop            
        //   322: aload           7
        //   324: aload           8
        //   326: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   331: pop            
        //   332: goto            412
        //   335: astore          10
        //   337: aload           10
        //   339: iload           12
        //   341: ifne            411
        //   344: instanceof      Ljava/lang/reflect/InvocationTargetException;
        //   347: ifeq            409
        //   350: goto            354
        //   353: athrow         
        //   354: aload           10
        //   356: checkcast       Ljava/lang/reflect/InvocationTargetException;
        //   359: iload           12
        //   361: ifne            411
        //   364: goto            368
        //   367: athrow         
        //   368: invokevirtual   java/lang/reflect/InvocationTargetException.getCause:()Ljava/lang/Throwable;
        //   371: astore          11
        //   373: aload           11
        //   375: instanceof      Ljava/lang/NoClassDefFoundError;
        //   378: ifeq            409
        //   381: aload           6
        //   383: aload           8
        //   385: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
        //   388: pop            
        //   389: aload           6
        //   391: aload           11
        //   393: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //   396: invokevirtual   java/util/Stack.push:(Ljava/lang/Object;)Ljava/lang/Object;
        //   399: pop            
        //   400: iload           12
        //   402: ifeq            220
        //   405: goto            409
        //   408: athrow         
        //   409: aload           10
        //   411: athrow         
        //   412: iload           12
        //   414: ifeq            220
        //   417: aload           4
        //   419: invokeinterface java/util/Map.clear:()V
        //   424: aload_2        
        //   425: getstatic       org/powerbot/core/script/job/Task.a:I
        //   428: ifeq            449
        //   431: iload           12
        //   433: ifeq            445
        //   436: goto            440
        //   439: athrow         
        //   440: iconst_0       
        //   441: goto            446
        //   444: athrow         
        //   445: iconst_1       
        //   446: putstatic       org/powerbot/a.a:Z
        //   449: areturn        
        //    StackMapTable: 00 1E FF 00 41 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 00 00 00 00 00 00 00 01 00 00 FF 00 1E 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 12 07 00 0B 00 00 00 00 01 00 00 FF 00 20 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 12 07 00 0B 01 00 00 00 01 00 00 FF 00 30 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 00 00 00 00 00 00 01 00 00 03 FF 00 25 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 00 00 00 00 01 00 00 FF 00 20 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 00 00 00 01 00 01 07 00 2C 40 07 00 20 4C 07 00 2C 00 42 07 00 2C 00 48 07 00 05 FF 00 35 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 07 00 0B 00 00 01 00 01 07 00 2C FF 00 11 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 07 00 0B 07 00 2C 00 01 00 01 07 00 2C 00 4C 07 00 2C 40 07 00 2D FF 00 27 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 07 00 0B 07 00 2C 07 00 6C 01 00 01 07 00 2C FF 00 00 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 07 00 0B 07 00 2C 00 01 00 00 41 07 00 2C FF 00 00 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 07 00 0A 07 00 0B 00 00 01 00 00 FF 00 04 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 00 00 00 00 01 00 00 47 07 00 05 4D 07 00 2C 40 07 00 05 43 07 00 2C 40 07 00 05 FF 00 00 00 0D 07 00 4A 07 00 02 07 00 05 07 00 47 07 00 0F 07 00 4F 07 00 1E 07 00 20 00 00 00 00 01 00 02 07 00 05 01 42 07 00 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  254    271    271    272    Ljava/lang/Exception;
        //  245    264    267    268    Ljava/lang/Exception;
        //  238    250    253    254    Ljava/lang/Exception;
        //  286    332    335    412    Ljava/lang/Exception;
        //  431    444    444    445    Ljava/lang/Exception;
        //  425    436    439    440    Ljava/lang/Exception;
        //  373    405    408    409    Ljava/lang/Exception;
        //  344    364    367    368    Ljava/lang/Exception;
        //  337    350    353    354    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0254:
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
        final char[] charArray = "\u001f r\u000257/Q#\u0001\b".toCharArray();
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
                            c2 = 'X';
                            break;
                        }
                        case 1: {
                            c2 = 'O';
                            break;
                        }
                        case 2: {
                            c2 = '7';
                            break;
                        }
                        case 3: {
                            c2 = 'a';
                            break;
                        }
                        default: {
                            c2 = 'x';
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
