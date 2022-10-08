
package org.powerbot;

import java.awt.event.InputEvent;
import java.security.Permission;
import java.net.InetAddress;
import org.powerbot.game.api.util.node.HashTable;
import java.util.logging.Logger;

public class ib extends SecurityManager
{
    private static final Logger a;
    public static final String b;
    public static final String c;
    private final Class<?>[] d;
    private static final String[] z;
    
    public ib(final Class<?>... d) {
        this.d = d;
    }
    
    @Override
    public void checkAccept(final String host, final int port) {
        final int a = gb.a;
        Label_0124: {
            boolean equals = false;
            Label_0104: {
                int equals2 = 0;
                Label_0093: {
                    Label_0073: {
                        int a2 = 0;
                        int n6 = 0;
                        Label_0062: {
                            Label_0050: {
                                int n3 = 0;
                                int n5 = 0;
                                Label_0043: {
                                    int n2 = 0;
                                    int n4 = 0;
                                    Label_0030: {
                                        Label_0029: {
                                            try {
                                                final int n = n2 = (n3 = (a2 = (this.a(k.class) ? 1 : 0)));
                                                if (a != 0) {
                                                    break Label_0030;
                                                }
                                                if (n == 0) {
                                                    break Label_0029;
                                                }
                                            }
                                            catch (SecurityException ex) {
                                                throw ex;
                                            }
                                            return;
                                        }
                                        a2 = port;
                                        n3 = port;
                                        n2 = port;
                                        try {
                                            n4 = (n5 = (n6 = 54700));
                                            if (a != 0) {
                                                break Label_0050;
                                            }
                                            if (n2 < n4) {
                                                break Label_0043;
                                            }
                                            return;
                                        }
                                        catch (SecurityException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    try {
                                        if (n2 >= n4) {
                                            return;
                                        }
                                        a2 = port;
                                        n3 = port;
                                        n6 = (n5 = 54800);
                                    }
                                    catch (SecurityException ex3) {
                                        throw ex3;
                                    }
                                }
                                try {
                                    if (a != 0) {
                                        break Label_0073;
                                    }
                                    if (n3 > n5) {
                                        break Label_0062;
                                    }
                                }
                                catch (SecurityException ex4) {
                                    throw ex4;
                                }
                            }
                            return;
                            try {
                                equals = (port != 0);
                                equals2 = port;
                                a2 = port;
                                if (a != 0) {
                                    break Label_0093;
                                }
                                n6 = 53;
                            }
                            catch (SecurityException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            if (a2 != n6) {
                                throw new SecurityException();
                            }
                            equals = ((equals2 = (host.equals(HashTable.e(ib.z[17])) ? 1 : 0)) != 0);
                        }
                        catch (SecurityException ex6) {
                            throw ex6;
                        }
                    }
                    try {
                        if (a != 0) {
                            break Label_0124;
                        }
                        if (equals2 == 0) {
                            break Label_0104;
                        }
                        break Label_0124;
                    }
                    catch (SecurityException ex7) {
                        throw ex7;
                    }
                }
                try {
                    if (equals2 != 0) {
                        break Label_0124;
                    }
                    equals = host.equals(HashTable.e(ib.z[18]));
                }
                catch (SecurityException ex8) {
                    throw ex8;
                }
            }
            try {
                if (equals) {
                    super.checkAccept(host, port);
                    return;
                }
            }
            catch (SecurityException ex9) {
                throw ex9;
            }
        }
        throw new SecurityException();
    }
    
    @Override
    public void checkAccess(final Thread t) {
        super.checkAccess(t);
    }
    
    @Override
    public void checkAccess(final ThreadGroup g) {
        super.checkAccess(g);
    }
    
    @Override
    public void checkConnect(final String s, final int n) {
        this.checkConnect(s, n, null);
    }
    
    @Override
    public void checkConnect(final String p0, final int p1, final Object p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iload_2        
        //     6: iload           4
        //     8: ifne            179
        //    11: bipush          80
        //    13: if_icmpeq       166
        //    16: goto            20
        //    19: athrow         
        //    20: iload_2        
        //    21: iload           4
        //    23: ifne            179
        //    26: goto            30
        //    29: athrow         
        //    30: sipush          443
        //    33: if_icmpeq       166
        //    36: goto            40
        //    39: athrow         
        //    40: iload_2        
        //    41: iload           4
        //    43: ifne            179
        //    46: goto            50
        //    49: athrow         
        //    50: bipush          53
        //    52: if_icmpeq       166
        //    55: goto            59
        //    58: athrow         
        //    59: iload_2        
        //    60: iload           4
        //    62: ifne            179
        //    65: goto            69
        //    68: athrow         
        //    69: ldc             43594
        //    71: if_icmpeq       166
        //    74: goto            78
        //    77: athrow         
        //    78: iload_2        
        //    79: iload           4
        //    81: ifne            179
        //    84: goto            88
        //    87: athrow         
        //    88: iconst_m1      
        //    89: if_icmpeq       166
        //    92: goto            96
        //    95: athrow         
        //    96: aload_0        
        //    97: iconst_1       
        //    98: anewarray       Ljava/lang/Class;
        //   101: dup            
        //   102: iconst_0       
        //   103: ldc             Lorg/powerbot/k;.class
        //   105: aastore        
        //   106: invokespecial   org/powerbot/ib.a:([Ljava/lang/Class;)Z
        //   109: iload           4
        //   111: ifne            179
        //   114: goto            118
        //   117: athrow         
        //   118: ifne            166
        //   121: goto            125
        //   124: athrow         
        //   125: getstatic       org/powerbot/ib.a:Ljava/util/logging/Logger;
        //   128: new             Ljava/lang/StringBuilder;
        //   131: dup            
        //   132: invokespecial   java/lang/StringBuilder.<init>:()V
        //   135: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   138: bipush          9
        //   140: aaload         
        //   141: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   144: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   147: iload_2        
        //   148: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   151: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   154: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   157: new             Ljava/lang/SecurityException;
        //   160: dup            
        //   161: invokespecial   java/lang/SecurityException.<init>:()V
        //   164: athrow         
        //   165: athrow         
        //   166: aload_1        
        //   167: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   170: bipush          8
        //   172: aaload         
        //   173: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   176: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   179: iload           4
        //   181: ifne            367
        //   184: ifne            336
        //   187: goto            191
        //   190: athrow         
        //   191: aload_1        
        //   192: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   195: bipush          12
        //   197: aaload         
        //   198: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   201: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   204: iload           4
        //   206: ifne            367
        //   209: goto            213
        //   212: athrow         
        //   213: ifne            336
        //   216: goto            220
        //   219: athrow         
        //   220: aload_1        
        //   221: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   224: bipush          13
        //   226: aaload         
        //   227: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   230: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   233: iload           4
        //   235: ifne            367
        //   238: goto            242
        //   241: athrow         
        //   242: ifne            336
        //   245: goto            249
        //   248: athrow         
        //   249: aload_1        
        //   250: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   253: bipush          11
        //   255: aaload         
        //   256: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   259: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   262: iload           4
        //   264: ifne            367
        //   267: goto            271
        //   270: athrow         
        //   271: ifne            336
        //   274: goto            278
        //   277: athrow         
        //   278: aload_1        
        //   279: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   282: bipush          10
        //   284: aaload         
        //   285: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   288: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   291: iload           4
        //   293: ifne            367
        //   296: goto            300
        //   299: athrow         
        //   300: ifne            336
        //   303: goto            307
        //   306: athrow         
        //   307: aload_1        
        //   308: iload           4
        //   310: ifne            439
        //   313: goto            317
        //   316: athrow         
        //   317: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   320: bipush          7
        //   322: aaload         
        //   323: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   326: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   329: ifeq            438
        //   332: goto            336
        //   335: athrow         
        //   336: aload_0        
        //   337: iload           4
        //   339: ifne            439
        //   342: goto            346
        //   345: athrow         
        //   346: iconst_2       
        //   347: anewarray       Ljava/lang/Class;
        //   350: dup            
        //   351: iconst_0       
        //   352: ldc             Lorg/powerbot/y;.class
        //   354: aastore        
        //   355: dup            
        //   356: iconst_1       
        //   357: ldc             Lorg/powerbot/k;.class
        //   359: aastore        
        //   360: invokespecial   org/powerbot/ib.a:([Ljava/lang/Class;)Z
        //   363: goto            367
        //   366: athrow         
        //   367: ifne            438
        //   370: getstatic       org/powerbot/y.c:Z
        //   373: iload           4
        //   375: ifne            390
        //   378: goto            382
        //   381: athrow         
        //   382: ifne            438
        //   385: goto            389
        //   388: athrow         
        //   389: iload_2        
        //   390: ldc             54700
        //   392: iload           4
        //   394: ifne            411
        //   397: if_icmplt       414
        //   400: goto            404
        //   403: athrow         
        //   404: iload_2        
        //   405: ldc             54800
        //   407: goto            411
        //   410: athrow         
        //   411: if_icmple       438
        //   414: getstatic       org/powerbot/ib.a:Ljava/util/logging/Logger;
        //   417: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   420: bipush          14
        //   422: aaload         
        //   423: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   426: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   429: new             Ljava/lang/SecurityException;
        //   432: dup            
        //   433: invokespecial   java/lang/SecurityException.<init>:()V
        //   436: athrow         
        //   437: athrow         
        //   438: aload_3        
        //   439: ifnonnull       457
        //   442: aload_0        
        //   443: aload_1        
        //   444: iload_2        
        //   445: invokespecial   java/lang/SecurityManager.checkConnect:(Ljava/lang/String;I)V
        //   448: iload           4
        //   450: ifeq            468
        //   453: goto            457
        //   456: athrow         
        //   457: aload_0        
        //   458: aload_1        
        //   459: iload_2        
        //   460: aload_3        
        //   461: invokespecial   java/lang/SecurityManager.checkConnect:(Ljava/lang/String;ILjava/lang/Object;)V
        //   464: goto            468
        //   467: athrow         
        //   468: return         
        //    StackMapTable: 00 44 FF 00 13 00 05 07 00 4E 07 00 87 01 07 00 D0 01 00 01 07 00 0A 00 48 07 00 0A 40 01 48 07 00 0A 00 48 07 00 0A 40 01 47 07 00 0A 00 48 07 00 0A 40 01 47 07 00 0A 00 48 07 00 0A 40 01 46 07 00 0A 00 54 07 00 0A 40 01 45 07 00 0A 00 67 07 00 0A 00 4C 01 4A 07 00 0A 00 54 07 00 0A 40 01 45 07 00 0A 00 54 07 00 0A 40 01 45 07 00 0A 00 54 07 00 0A 40 01 45 07 00 0A 00 54 07 00 0A 40 01 45 07 00 0A 00 48 07 00 0A 40 07 00 87 51 07 00 0A 00 48 07 00 0A 40 07 00 4E 53 07 00 0A 40 01 4D 07 00 0A 40 01 45 07 00 0A 00 40 01 4C 07 00 0A 00 45 07 00 0A FF 00 00 00 05 07 00 4E 07 00 87 01 07 00 D0 01 00 02 01 01 02 56 07 00 0A 00 40 07 00 D0 50 07 00 0A 00 49 07 00 0A 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  442    464    467    468    Ljava/lang/SecurityException;
        //  439    453    456    457    Ljava/lang/SecurityException;
        //  411    437    437    438    Ljava/lang/SecurityException;
        //  397    407    410    411    Ljava/lang/SecurityException;
        //  390    400    403    404    Ljava/lang/SecurityException;
        //  370    385    388    389    Ljava/lang/SecurityException;
        //  367    378    381    382    Ljava/lang/SecurityException;
        //  336    363    366    367    Ljava/lang/SecurityException;
        //  317    342    345    346    Ljava/lang/SecurityException;
        //  307    332    335    336    Ljava/lang/SecurityException;
        //  300    313    316    317    Ljava/lang/SecurityException;
        //  278    303    306    307    Ljava/lang/SecurityException;
        //  271    296    299    300    Ljava/lang/SecurityException;
        //  249    274    277    278    Ljava/lang/SecurityException;
        //  242    267    270    271    Ljava/lang/SecurityException;
        //  220    245    248    249    Ljava/lang/SecurityException;
        //  213    238    241    242    Ljava/lang/SecurityException;
        //  191    216    219    220    Ljava/lang/SecurityException;
        //  184    209    212    213    Ljava/lang/SecurityException;
        //  179    187    190    191    Ljava/lang/SecurityException;
        //  118    165    165    166    Ljava/lang/SecurityException;
        //  96     121    124    125    Ljava/lang/SecurityException;
        //  88     114    117    118    Ljava/lang/SecurityException;
        //  78     92     95     96     Ljava/lang/SecurityException;
        //  69     84     87     88     Ljava/lang/SecurityException;
        //  59     74     77     78     Ljava/lang/SecurityException;
        //  50     65     68     69     Ljava/lang/SecurityException;
        //  40     55     58     59     Ljava/lang/SecurityException;
        //  30     46     49     50     Ljava/lang/SecurityException;
        //  20     36     39     40     Ljava/lang/SecurityException;
        //  11     26     29     30     Ljava/lang/SecurityException;
        //  5      16     19     20     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    public void checkCreateClassLoader() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: iload_1        
        //     6: ifne            87
        //     9: invokespecial   org/powerbot/ib.a:()Z
        //    12: ifeq            86
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: iload_1        
        //    21: ifne            87
        //    24: goto            28
        //    27: athrow         
        //    28: iconst_4       
        //    29: anewarray       Ljava/lang/Class;
        //    32: dup            
        //    33: iconst_0       
        //    34: ldc             Ljavax/swing/UIDefaults;.class
        //    36: aastore        
        //    37: dup            
        //    38: iconst_1       
        //    39: ldc             Ljava/io/ObjectOutputStream;.class
        //    41: aastore        
        //    42: dup            
        //    43: iconst_2       
        //    44: ldc             Ljava/io/ObjectInputStream;.class
        //    46: aastore        
        //    47: dup            
        //    48: iconst_3       
        //    49: ldc             Ljava/lang/reflect/Proxy;.class
        //    51: aastore        
        //    52: invokespecial   org/powerbot/ib.a:([Ljava/lang/Class;)Z
        //    55: ifne            86
        //    58: goto            62
        //    61: athrow         
        //    62: getstatic       org/powerbot/ib.a:Ljava/util/logging/Logger;
        //    65: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //    68: bipush          15
        //    70: aaload         
        //    71: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    74: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //    77: new             Ljava/lang/SecurityException;
        //    80: dup            
        //    81: invokespecial   java/lang/SecurityException.<init>:()V
        //    84: athrow         
        //    85: athrow         
        //    86: aload_0        
        //    87: invokespecial   java/lang/SecurityManager.checkCreateClassLoader:()V
        //    90: return         
        //    StackMapTable: 00 09 FF 00 12 00 02 07 00 4E 01 00 01 07 00 0A 00 47 07 00 0A 40 07 00 4E 60 07 00 0A 00 56 07 00 0A 00 40 07 00 4E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  28     85     85     86     Ljava/lang/SecurityException;
        //  19     58     61     62     Ljava/lang/SecurityException;
        //  9      24     27     28     Ljava/lang/SecurityException;
        //  4      15     18     19     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    public void checkDelete(final String file) {
        this.a(file, false);
        super.checkDelete(file);
    }
    
    @Override
    public void checkExec(final String cmd) {
        ib ib = null;
        Label_0027: {
            Label_0017: {
                try {
                    ib = this;
                    if (gb.a != 0) {
                        break Label_0027;
                    }
                    final boolean b = this.a();
                    if (b) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.a();
                    if (b) {
                        throw new SecurityException();
                    }
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
            ib = this;
        }
        ib.checkExec(cmd);
    }
    
    @Override
    public void checkExit(final int status) {
        ib ib = null;
        Label_0027: {
            Label_0017: {
                try {
                    ib = this;
                    if (gb.a != 0) {
                        break Label_0027;
                    }
                    final boolean b = this.a();
                    if (b) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.a();
                    if (b) {
                        throw new SecurityException();
                    }
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
            ib = this;
        }
        ib.checkExit(status);
    }
    
    @Override
    public void checkListen(final int port) {
        super.checkListen(port);
    }
    
    @Override
    public void checkMulticast(final InetAddress inetAddress) {
        throw new SecurityException();
    }
    
    @Override
    public void checkMulticast(final InetAddress inetAddress, final byte b) {
        throw new SecurityException();
    }
    
    @Override
    public void checkPermission(final Permission permission) {
        Label_0037: {
            boolean equals = false;
            Label_0017: {
                boolean b;
                try {
                    b = (equals = (permission instanceof RuntimePermission));
                    if (gb.a != 0) {
                        break Label_0037;
                    }
                    if (b) {
                        break Label_0017;
                    }
                    return;
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                try {
                    if (!b) {
                        return;
                    }
                    equals = permission.getName().equals(HashTable.e(ib.z[16]));
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
            try {
                if (equals) {
                    throw new SecurityException();
                }
            }
            catch (SecurityException ex3) {
                throw ex3;
            }
        }
    }
    
    @Override
    public void checkPermission(final Permission permission, final Object o) {
        this.checkPermission(permission);
    }
    
    @Override
    public void checkPrintJobAccess() {
        throw new SecurityException();
    }
    
    @Override
    public void checkRead(final String file) {
        this.a(file, true);
        super.checkRead(file);
    }
    
    @Override
    public void checkRead(final String file, final Object context) {
        this.checkRead(file);
        super.checkRead(file, context);
    }
    
    @Override
    public void checkSetFactory() {
        ib ib = null;
        Label_0027: {
            Label_0017: {
                try {
                    ib = this;
                    if (gb.a != 0) {
                        break Label_0027;
                    }
                    final boolean b = this.a();
                    if (b) {
                        break Label_0017;
                    }
                    break Label_0017;
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.a();
                    if (b) {
                        throw new SecurityException();
                    }
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
            ib = this;
        }
        ib.checkSetFactory();
    }
    
    public void checkSystemClipboardAccess() {
        try {
            if (this.a(InputEvent.class)) {
                return;
            }
        }
        catch (SecurityException ex) {
            throw ex;
        }
        throw new SecurityException();
    }
    
    @Override
    public void checkWrite(final String file) {
        this.a(file, false);
        super.checkWrite(file);
    }
    
    private void a(final String p0, final boolean p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: new             Ljava/io/File;
        //     8: dup            
        //     9: aload_1        
        //    10: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    13: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //    16: invokestatic    org/powerbot/gb.c:(Ljava/lang/String;)Ljava/lang/String;
        //    19: astore_3       
        //    20: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //    23: iconst_3       
        //    24: aaload         
        //    25: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    28: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //    31: astore          4
        //    33: getstatic       org/powerbot/z.a:Ljava/util/Map;
        //    36: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    41: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //    46: astore          5
        //    48: aload           5
        //    50: invokeinterface java/util/Iterator.hasNext:()Z
        //    55: ifeq            185
        //    58: aload           5
        //    60: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    65: checkcast       Ljava/util/Map$Entry;
        //    68: astore          6
        //    70: aload           6
        //    72: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    77: checkcast       [Ljava/lang/Class;
        //    80: arraylength    
        //    81: iconst_1       
        //    82: iadd           
        //    83: anewarray       Ljava/lang/Class;
        //    86: astore          7
        //    88: aload           7
        //    90: iconst_0       
        //    91: ldc             Lorg/powerbot/z;.class
        //    93: aastore        
        //    94: aload           6
        //    96: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   101: iconst_0       
        //   102: aload           7
        //   104: iconst_1       
        //   105: aload           7
        //   107: arraylength    
        //   108: iconst_1       
        //   109: isub           
        //   110: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   113: aload           6
        //   115: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   120: checkcast       Ljava/io/File;
        //   123: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   126: invokestatic    org/powerbot/gb.c:(Ljava/lang/String;)Ljava/lang/String;
        //   129: astore          8
        //   131: aload           8
        //   133: aload_1        
        //   134: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   137: iload           9
        //   139: ifne            193
        //   142: iload           9
        //   144: ifne            168
        //   147: goto            151
        //   150: athrow         
        //   151: ifeq            180
        //   154: goto            158
        //   157: athrow         
        //   158: aload_0        
        //   159: aload           7
        //   161: invokespecial   org/powerbot/ib.a:([Ljava/lang/Class;)Z
        //   164: goto            168
        //   167: athrow         
        //   168: ifne            180
        //   171: new             Ljava/lang/SecurityException;
        //   174: dup            
        //   175: invokespecial   java/lang/SecurityException.<init>:()V
        //   178: athrow         
        //   179: athrow         
        //   180: iload           9
        //   182: ifeq            48
        //   185: aload_0        
        //   186: aload_0        
        //   187: getfield        org/powerbot/ib.d:[Ljava/lang/Class;
        //   190: invokespecial   org/powerbot/ib.a:([Ljava/lang/Class;)Z
        //   193: iload           9
        //   195: ifne            210
        //   198: ifeq            206
        //   201: goto            205
        //   204: athrow         
        //   205: return         
        //   206: aload_0        
        //   207: invokespecial   org/powerbot/ib.b:()Z
        //   210: iload           9
        //   212: ifne            224
        //   215: ifeq            223
        //   218: goto            222
        //   221: athrow         
        //   222: return         
        //   223: iload_2        
        //   224: ifeq            228
        //   227: return         
        //   228: getstatic       org/powerbot/y.e:Lorg/powerbot/y$a_;
        //   231: getstatic       org/powerbot/y$a_.MAC:Lorg/powerbot/y$a_;
        //   234: if_acmpne       300
        //   237: aload_3        
        //   238: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   241: bipush          6
        //   243: aaload         
        //   244: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   247: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   250: iload           9
        //   252: ifne            325
        //   255: goto            259
        //   258: athrow         
        //   259: ifeq            300
        //   262: goto            266
        //   265: athrow         
        //   266: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   269: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //   272: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   275: iconst_5       
        //   276: aaload         
        //   277: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   280: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   283: iload           9
        //   285: ifne            325
        //   288: goto            292
        //   291: athrow         
        //   292: ifeq            300
        //   295: goto            299
        //   298: athrow         
        //   299: return         
        //   300: new             Ljava/lang/StringBuilder;
        //   303: dup            
        //   304: invokespecial   java/lang/StringBuilder.<init>:()V
        //   307: aload_3        
        //   308: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   311: getstatic       java/io/File.separator:Ljava/lang/String;
        //   314: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   317: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   320: aload           4
        //   322: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   325: ifeq            329
        //   328: return         
        //   329: getstatic       org/powerbot/ib.a:Ljava/util/logging/Logger;
        //   332: new             Ljava/lang/StringBuilder;
        //   335: dup            
        //   336: invokespecial   java/lang/StringBuilder.<init>:()V
        //   339: iload_2        
        //   340: ifeq            355
        //   343: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   346: iconst_2       
        //   347: aaload         
        //   348: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   351: goto            363
        //   354: athrow         
        //   355: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   358: iconst_0       
        //   359: aaload         
        //   360: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   363: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   366: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   369: iconst_1       
        //   370: aaload         
        //   371: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   374: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   377: aload_3        
        //   378: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   381: getstatic       org/powerbot/ib.z:[Ljava/lang/String;
        //   384: iconst_4       
        //   385: aaload         
        //   386: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   389: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   392: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   395: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //   398: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   401: ldc_w           "o"
        //   404: invokestatic    org/powerbot/game/api/util/node/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   410: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   413: invokevirtual   java/lang/Thread.getThreadGroup:()Ljava/lang/ThreadGroup;
        //   416: invokevirtual   java/lang/ThreadGroup.getName:()Ljava/lang/String;
        //   419: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   422: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   425: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   428: new             Ljava/lang/SecurityException;
        //   431: dup            
        //   432: invokespecial   java/lang/SecurityException.<init>:()V
        //   435: athrow         
        //    StackMapTable: 00 22 FF 00 30 00 0A 07 00 4E 07 00 87 01 07 00 87 07 00 87 07 00 BA 00 00 00 01 00 00 FF 00 65 00 0A 07 00 4E 07 00 87 01 07 00 87 07 00 87 07 00 BA 07 00 3B 07 00 3D 07 00 87 01 00 01 07 00 0A 40 01 45 07 00 0A 00 48 07 00 0A 40 01 4A 07 00 0A 00 FF 00 04 00 0A 07 00 4E 07 00 87 01 07 00 87 07 00 87 07 00 BA 00 00 00 01 00 00 47 01 4A 07 00 0A 00 00 43 01 4A 07 00 0A 00 00 40 01 03 5D 07 00 0A 40 01 45 07 00 0A 00 58 07 00 0A 40 01 45 07 00 0A 00 00 58 01 03 58 07 00 0A FF 00 00 00 0A 07 00 4E 07 00 87 01 07 00 87 07 00 87 07 00 BA 00 00 00 01 00 02 07 00 93 07 00 11 FF 00 07 00 0A 07 00 4E 07 00 87 01 07 00 87 07 00 87 07 00 BA 00 00 00 01 00 03 07 00 93 07 00 11 07 00 87
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  329    354    354    355    Ljava/lang/SecurityException;
        //  266    295    298    299    Ljava/lang/SecurityException;
        //  259    288    291    292    Ljava/lang/SecurityException;
        //  237    262    265    266    Ljava/lang/SecurityException;
        //  228    255    258    259    Ljava/lang/SecurityException;
        //  210    218    221    222    Ljava/lang/SecurityException;
        //  193    201    204    205    Ljava/lang/SecurityException;
        //  168    179    179    180    Ljava/lang/SecurityException;
        //  151    164    167    168    Ljava/lang/SecurityException;
        //  142    154    157    158    Ljava/lang/SecurityException;
        //  131    147    150    151    Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0151:
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
    
    private boolean a(final Class<?>... array) {
        final int i = gb.a;
        final Class<?>[] classContext = this.getClassContext();
        final int length = classContext.length;
        int n = 0;
        int n2 = 0;
        do {
            int j = 0;
        Label_0018:
            while (j < length) {
                final Class<?> clazz = classContext[n];
                final int length2 = array.length;
                n2 = 0;
                if (i == 0) {
                    int k = n2;
                    while (k < length2) {
                        final Class<?> clazz2 = array[k];
                        Label_0088: {
                            try {
                                if (i != 0) {
                                    break Label_0088;
                                }
                                j = (clazz2.isAssignableFrom(clazz) ? 1 : 0);
                                if (i != 0) {
                                    continue Label_0018;
                                }
                            }
                            catch (SecurityException ex) {
                                throw ex;
                            }
                            try {
                                if (j != 0) {
                                    return true;
                                }
                            }
                            catch (SecurityException ex2) {
                                throw ex2;
                            }
                            ++k;
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                    ++n;
                    continue Label_0018;
                }
                return n2 != 0;
            }
            break;
        } while (i == 0);
        return n2 != 0;
    }
    
    private boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/ib.getClassContext:()[Ljava/lang/Class;
        //     9: astore_1       
        //    10: iconst_1       
        //    11: istore_2       
        //    12: iload_2        
        //    13: aload_1        
        //    14: arraylength    
        //    15: if_icmpge       73
        //    18: aload_1        
        //    19: iload_2        
        //    20: aaload         
        //    21: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    24: astore_3       
        //    25: iload           4
        //    27: ifne            68
        //    30: aload_3        
        //    31: ifnull          65
        //    34: goto            38
        //    37: athrow         
        //    38: aload_3        
        //    39: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    42: ldc             Lorg/powerbot/a;.class
        //    44: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    47: iload           4
        //    49: ifne            64
        //    52: goto            56
        //    55: athrow         
        //    56: ifeq            65
        //    59: goto            63
        //    62: athrow         
        //    63: iconst_1       
        //    64: ireturn        
        //    65: iinc            2, 1
        //    68: iload           4
        //    70: ifeq            12
        //    73: iconst_0       
        //    74: ireturn        
        //    StackMapTable: 00 0B FF 00 0C 00 05 07 00 4E 07 00 3D 01 00 01 00 00 FF 00 18 00 05 07 00 4E 07 00 3D 01 07 01 5A 01 00 01 07 00 0A 00 50 07 00 0A 40 01 45 07 00 0A 00 40 01 00 02 FF 00 04 00 05 07 00 4E 07 00 3D 01 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  38     59     62     63     Ljava/lang/SecurityException;
        //  30     52     55     56     Ljava/lang/SecurityException;
        //  25     34     37     38     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    private boolean b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/ib.getClassContext:()[Ljava/lang/Class;
        //     9: astore_1       
        //    10: iconst_1       
        //    11: istore_2       
        //    12: iload_2        
        //    13: iconst_5       
        //    14: if_icmpge       104
        //    17: aload_1        
        //    18: iload_2        
        //    19: aaload         
        //    20: iload           4
        //    22: ifne            52
        //    25: ldc             Lorg/powerbot/ib;.class
        //    27: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    30: iload           4
        //    32: ifne            105
        //    35: goto            39
        //    38: athrow         
        //    39: ifeq            49
        //    42: goto            46
        //    45: athrow         
        //    46: goto            96
        //    49: aload_1        
        //    50: iload_2        
        //    51: aaload         
        //    52: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    55: astore_3       
        //    56: iload           4
        //    58: ifne            99
        //    61: aload_3        
        //    62: ifnull          96
        //    65: goto            69
        //    68: athrow         
        //    69: aload_3        
        //    70: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    73: ldc             Lorg/powerbot/core/bot/RSClassLoader;.class
        //    75: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    78: iload           4
        //    80: ifne            95
        //    83: goto            87
        //    86: athrow         
        //    87: ifeq            96
        //    90: goto            94
        //    93: athrow         
        //    94: iconst_1       
        //    95: ireturn        
        //    96: iinc            2, 1
        //    99: iload           4
        //   101: ifeq            12
        //   104: iconst_0       
        //   105: ireturn        
        //    StackMapTable: 00 12 FF 00 0C 00 05 07 00 4E 07 00 3D 01 00 01 00 00 59 07 00 0A 40 01 45 07 00 0A 00 02 42 07 00 03 FF 00 0F 00 05 07 00 4E 07 00 3D 01 07 01 5A 01 00 01 07 00 0A 00 50 07 00 0A 40 01 45 07 00 0A 00 40 01 FF 00 00 00 05 07 00 4E 07 00 3D 01 00 01 00 00 02 04 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  69     90     93     94     Ljava/lang/SecurityException;
        //  61     83     86     87     Ljava/lang/SecurityException;
        //  56     65     68     69     Ljava/lang/SecurityException;
        //  25     42     45     46     Ljava/lang/SecurityException;
        //  17     35     38     39     Ljava/lang/SecurityException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    public static boolean a(final Thread thread) {
        final int a = gb.a;
        final ClassLoader contextClassLoader = thread.getContextClassLoader();
        boolean assignable = false;
        Label_0045: {
            Label_0022: {
                ClassLoader classLoader;
                try {
                    classLoader = contextClassLoader;
                    if (a != 0) {
                        break Label_0022;
                    }
                    if (classLoader == null) {
                        break Label_0045;
                    }
                }
                catch (SecurityException ex) {
                    throw ex;
                }
                try {
                    assignable = classLoader.getClass().isAssignableFrom(a.class);
                    if (a != 0) {
                        return assignable;
                    }
                    if (!assignable) {
                        break Label_0045;
                    }
                }
                catch (SecurityException ex2) {
                    throw ex2;
                }
            }
            return assignable;
        }
        return assignable;
    }
    
    static {
        final String[] z2 = new String[19];
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 0)))))))))))))))));
        String s = "IN\bjw";
        int n20 = -1;
        String intern = null;
    Label_0242_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n22;
            final int n21 = n22 = (length = charArray.length);
            int n23 = 0;
            while (true) {
                Label_0318: {
                    if (n21 > 1) {
                        break Label_0318;
                    }
                    length = (n22 = n23);
                    do {
                        final char c2 = charArray[n22];
                        char c3 = '\0';
                        switch (n23 % 5) {
                            case 0: {
                                c3 = '^';
                                break;
                            }
                            case 1: {
                                c3 = 'E';
                                break;
                            }
                            case 2: {
                                c3 = '!';
                                break;
                            }
                            case 3: {
                                c3 = 'g';
                                break;
                            }
                            default: {
                                c3 = 'R';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n23;
                    } while (n21 == 0);
                }
                if (n21 > n23) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n20) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 1))))))))))))))))));
                    s = ">X\u0004p{Bab\u0007";
                    n20 = 0;
                    continue Label_0242_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 2))))))))))))))))));
                    s = "u`9C";
                    n20 = 1;
                    continue Label_0242_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 3))))))))))))))))));
                    s = "Md.F\u0005wSOj\u007fWa1U";
                    n20 = 2;
                    continue Label_0242_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 4))))))))))))))))));
                    s = "\u0007j6\u0007";
                    n20 = 3;
                    continue Label_0242_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 5))))))))))))))))));
                    s = "Jd1I";
                    n20 = 4;
                    continue Label_0242_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 6))))))))))))))))));
                    s = "1J\u0000l=Aj4CNlON";
                    n20 = 5;
                    continue Label_0242_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 7))))))))))))))))));
                    s = "$\u0006P";
                    n20 = 6;
                    continue Label_0242_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 8))))))))))))))))));
                    s = "rS\u0002\u007f~Oj+S";
                    n20 = 7;
                    continue Label_0242_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 9))))))))))))))))));
                    s = "dj6IN}H\bq|\u0007a=IB{XAj}\u0007u7U_>";
                    n20 = 8;
                    continue Label_0242_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 10))))))))))))))))));
                    s = "/\fO";
                    n20 = 9;
                    continue Label_0242_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 11))))))))))))))))));
                    s = "\u0016<j\t\u001a(\u0004O";
                    n20 = 10;
                    continue Label_0242_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 12))))))))))))))))));
                    s = "\ti7DJrX\u000essNk";
                    n20 = 11;
                    continue Label_0242_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 13))))))))))))))))));
                    s = "\u00167o\t";
                    n20 = 12;
                    continue Label_0242_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 14))))))))))))))))));
                    s = "dj6IN}H\bq|\u0007a=IB{XAj}\u0007i7DJrT\u000emf";
                    n20 = 13;
                    continue Label_0242_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 15))))))))))))))))));
                    s = "dw=F_wR\u0006>qKd+T\u000brS\u0000zwU%<BEwY\u0005";
                    n20 = 14;
                    continue Label_0242_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 16))))))))))))))))));
                    s = "T`,tN}I\u0013wf^H9IJyY\u0013";
                    n20 = 15;
                    continue Label_0242_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 17))))))))))))))))));
                    s = "&\u0012Y0*\t=";
                    n20 = 16;
                    continue Label_0242_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = 18))))))))))))))))));
                    s = "&\u0012Y0&\t1";
                    n20 = 17;
                    continue Label_0242_Outer;
                }
                case 17: {
                    break Label_0242_Outer;
                }
            }
        }
        z2[n19] = intern;
        z = z2;
        b = HashTable.e(ib.z[17]);
        c = HashTable.e(ib.z[18]);
        final char[] charArray2 = "t`;RYwH\u0018".toCharArray();
        int length2;
        int n25;
        final int n24 = n25 = (length2 = charArray2.length);
        int n26 = 0;
        while (true) {
            Label_0518: {
                if (n24 > 1) {
                    break Label_0518;
                }
                length2 = (n25 = n26);
                do {
                    final char c4 = charArray2[n25];
                    char c5 = '\0';
                    switch (n26 % 5) {
                        case 0: {
                            c5 = '^';
                            break;
                        }
                        case 1: {
                            c5 = 'E';
                            break;
                        }
                        case 2: {
                            c5 = '!';
                            break;
                        }
                        case 3: {
                            c5 = 'g';
                            break;
                        }
                        default: {
                            c5 = 'R';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c4 ^ c5);
                    ++n26;
                } while (n24 == 0);
            }
            if (n24 <= n26) {
                a = Logger.getLogger(HashTable.e(new String(charArray2).intern()));
                return;
            }
            continue;
        }
    }
}
