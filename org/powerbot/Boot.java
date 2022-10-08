
package org.powerbot;

import org.powerbot.core.bot.ClientStub;
import java.awt.Component;
import javax.swing.JOptionPane;
import org.p;
import java.util.logging.Logger;

public class Boot implements Runnable
{
    private static final Logger a;
    private static final String b;
    private static final String c;
    public static int d;
    private static final String[] z;
    
    public static void main(final String[] p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: ldc             ""
        //     7: invokestatic    java/util/logging/Logger.getLogger:(Ljava/lang/String;)Ljava/util/logging/Logger;
        //    10: astore_1       
        //    11: aload_1        
        //    12: invokevirtual   java/util/logging/Logger.getHandlers:()[Ljava/util/logging/Handler;
        //    15: astore_2       
        //    16: aload_2        
        //    17: arraylength    
        //    18: istore_3       
        //    19: iconst_0       
        //    20: istore          4
        //    22: iload           4
        //    24: iload_3        
        //    25: if_icmpge       48
        //    28: aload_2        
        //    29: iload           4
        //    31: aaload         
        //    32: astore          5
        //    34: aload_1        
        //    35: aload           5
        //    37: invokevirtual   java/util/logging/Logger.removeHandler:(Ljava/util/logging/Handler;)V
        //    40: iinc            4, 1
        //    43: iload           10
        //    45: ifeq            22
        //    48: iconst_0       
        //    49: istore_2       
        //    50: aload_0        
        //    51: astore_3       
        //    52: aload_3        
        //    53: arraylength    
        //    54: istore          4
        //    56: iconst_0       
        //    57: istore          5
        //    59: iload           5
        //    61: iload           4
        //    63: if_icmpge       255
        //    66: aload_3        
        //    67: iload           5
        //    69: aaload         
        //    70: astore          6
        //    72: aload           6
        //    74: astore          7
        //    76: iconst_m1      
        //    77: istore          8
        //    79: iload           10
        //    81: ifne            276
        //    84: aload           7
        //    86: invokevirtual   java/lang/String.hashCode:()I
        //    89: iload           10
        //    91: ifne            197
        //    94: goto            98
        //    97: athrow         
        //    98: lookupswitch {
        //          -2111552159: 125
        //             1513: 162
        //          default: 195
        //        }
        //   124: athrow         
        //   125: aload           7
        //   127: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   130: iconst_5       
        //   131: aaload         
        //   132: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   135: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   138: iload           10
        //   140: ifne            197
        //   143: goto            147
        //   146: athrow         
        //   147: ifeq            195
        //   150: goto            154
        //   153: athrow         
        //   154: iconst_0       
        //   155: istore          8
        //   157: iload           10
        //   159: ifeq            195
        //   162: aload           7
        //   164: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   167: bipush          12
        //   169: aaload         
        //   170: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   173: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   176: iload           10
        //   178: ifne            197
        //   181: goto            185
        //   184: athrow         
        //   185: ifeq            195
        //   188: goto            192
        //   191: athrow         
        //   192: iconst_1       
        //   193: istore          8
        //   195: iload           8
        //   197: iload           10
        //   199: ifne            230
        //   202: lookupswitch {
        //                0: 229
        //                1: 236
        //          default: 247
        //        }
        //   228: athrow         
        //   229: iconst_1       
        //   230: istore_2       
        //   231: iload           10
        //   233: ifeq            247
        //   236: getstatic       java/lang/System.out:Ljava/io/PrintStream;
        //   239: sipush          4052
        //   242: invokevirtual   java/io/PrintStream.println:(I)V
        //   245: return         
        //   246: athrow         
        //   247: iinc            5, 1
        //   250: iload           10
        //   252: ifeq            59
        //   255: aload_1        
        //   256: new             Lorg/powerbot/kb;
        //   259: dup            
        //   260: invokespecial   org/powerbot/kb.<init>:()V
        //   263: invokevirtual   java/util/logging/Logger.addHandler:(Ljava/util/logging/Handler;)V
        //   266: new             Lorg/powerbot/Boot$0;
        //   269: dup            
        //   270: invokespecial   org/powerbot/Boot$0.<init>:()V
        //   273: invokestatic    java/lang/Thread.setDefaultUncaughtExceptionHandler:(Ljava/lang/Thread$UncaughtExceptionHandler;)V
        //   276: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   279: invokevirtual   java/lang/Runtime.maxMemory:()J
        //   282: ldc2_w          1024
        //   285: ldiv           
        //   286: ldc2_w          1024
        //   289: ldiv           
        //   290: lstore          4
        //   292: iload           10
        //   294: ifne            384
        //   297: lload           4
        //   299: ldc2_w          768
        //   302: lcmp           
        //   303: ifge            378
        //   306: goto            310
        //   309: athrow         
        //   310: iload_2        
        //   311: ifne            378
        //   314: goto            318
        //   317: athrow         
        //   318: getstatic       org/powerbot/Boot.a:Ljava/util/logging/Logger;
        //   321: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   324: bipush          10
        //   326: aaload         
        //   327: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   330: iconst_2       
        //   331: anewarray       Ljava/lang/Object;
        //   334: dup            
        //   335: iconst_0       
        //   336: lload           4
        //   338: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   341: aastore        
        //   342: dup            
        //   343: iconst_1       
        //   344: sipush          768
        //   347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   350: aastore        
        //   351: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   354: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   357: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   360: iconst_2       
        //   361: aaload         
        //   362: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   365: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   368: iconst_5       
        //   369: aaload         
        //   370: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   373: invokestatic    org/powerbot/Boot.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   376: return         
        //   377: athrow         
        //   378: invokestatic    javax/swing/UIManager.getSystemLookAndFeelClassName:()Ljava/lang/String;
        //   381: invokestatic    javax/swing/UIManager.setLookAndFeel:(Ljava/lang/String;)V
        //   384: goto            389
        //   387: astore          6
        //   389: new             Lorg/powerbot/Boot$1;
        //   392: dup            
        //   393: invokespecial   org/powerbot/Boot$1.<init>:()V
        //   396: invokestatic    java/net/URL.setURLStreamHandlerFactory:(Ljava/net/URLStreamHandlerFactory;)V
        //   399: goto            424
        //   402: astore          6
        //   404: getstatic       org/powerbot/Boot.a:Ljava/util/logging/Logger;
        //   407: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   410: bipush          16
        //   412: aaload         
        //   413: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   416: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   419: iconst_1       
        //   420: invokestatic    java/lang/System.exit:(I)V
        //   423: return         
        //   424: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   427: iconst_0       
        //   428: aaload         
        //   429: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   432: invokestatic    java/lang/System.getenv:(Ljava/lang/String;)Ljava/lang/String;
        //   435: astore          6
        //   437: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   440: iconst_4       
        //   441: aaload         
        //   442: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   445: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   448: astore          7
        //   450: aload           6
        //   452: iload           10
        //   454: ifne            490
        //   457: ifnull          488
        //   460: goto            464
        //   463: athrow         
        //   464: new             Ljava/io/File;
        //   467: dup            
        //   468: aload           6
        //   470: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   473: invokevirtual   java/io/File.isDirectory:()Z
        //   476: ifeq            488
        //   479: goto            483
        //   482: athrow         
        //   483: aload           6
        //   485: goto            517
        //   488: aload           7
        //   490: iload           10
        //   492: ifne            512
        //   495: ifnonnull       515
        //   498: goto            502
        //   501: athrow         
        //   502: ldc_w           "`"
        //   505: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   508: goto            512
        //   511: athrow         
        //   512: goto            517
        //   515: aload           7
        //   517: astore          8
        //   519: new             Ljava/io/File;
        //   522: dup            
        //   523: new             Ljava/lang/StringBuilder;
        //   526: dup            
        //   527: invokespecial   java/lang/StringBuilder.<init>:()V
        //   530: aload           8
        //   532: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   535: getstatic       java/io/File.separator:Ljava/lang/String;
        //   538: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   541: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   544: bipush          14
        //   546: aaload         
        //   547: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   550: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   553: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   556: iconst_1       
        //   557: aaload         
        //   558: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   561: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   564: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   567: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   570: astore          9
        //   572: aload           9
        //   574: invokevirtual   java/io/File.isFile:()Z
        //   577: iload           10
        //   579: ifne            605
        //   582: ifeq            599
        //   585: goto            589
        //   588: athrow         
        //   589: aload           9
        //   591: invokevirtual   java/io/File.delete:()Z
        //   594: pop            
        //   595: goto            599
        //   598: athrow         
        //   599: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
        //   602: invokevirtual   org/powerbot/k.b:()Z
        //   605: iload           10
        //   607: ifne            644
        //   610: ifne            638
        //   613: goto            617
        //   616: athrow         
        //   617: getstatic       org/powerbot/Boot.a:Ljava/util/logging/Logger;
        //   620: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   623: bipush          17
        //   625: aaload         
        //   626: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   629: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
        //   632: iconst_1       
        //   633: invokestatic    java/lang/System.exit:(I)V
        //   636: return         
        //   637: athrow         
        //   638: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
        //   641: invokevirtual   org/powerbot/k.d:()Z
        //   644: iload           10
        //   646: ifne            699
        //   649: ifeq            693
        //   652: goto            656
        //   655: athrow         
        //   656: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   659: bipush          6
        //   661: aaload         
        //   662: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   665: iconst_1       
        //   666: anewarray       Ljava/lang/Object;
        //   669: dup            
        //   670: iconst_0       
        //   671: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   674: bipush          14
        //   676: aaload         
        //   677: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   680: aastore        
        //   681: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   684: invokestatic    org/powerbot/Boot.a:(Ljava/lang/String;)V
        //   687: iconst_1       
        //   688: invokestatic    java/lang/System.exit:(I)V
        //   691: return         
        //   692: athrow         
        //   693: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
        //   696: invokevirtual   org/powerbot/k.c:()I
        //   699: iload           10
        //   701: ifne            730
        //   704: bipush          24
        //   706: if_icmplt       734
        //   709: goto            713
        //   712: athrow         
        //   713: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   716: bipush          11
        //   718: aaload         
        //   719: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   722: invokestatic    org/powerbot/Boot.a:(Ljava/lang/String;)V
        //   725: iconst_1       
        //   726: goto            730
        //   729: athrow         
        //   730: invokestatic    java/lang/System.exit:(I)V
        //   733: return         
        //   734: aconst_null    
        //   735: invokestatic    org/powerbot/gb.a:([B)Ljava/lang/String;
        //   738: pop            
        //   739: getstatic       org/powerbot/z.a:Ljava/util/Map;
        //   742: invokeinterface java/util/Map.clear:()V
        //   747: new             Lorg/powerbot/ib;
        //   750: dup            
        //   751: iconst_1       
        //   752: anewarray       Ljava/lang/Class;
        //   755: dup            
        //   756: iconst_0       
        //   757: ldc             Lorg/powerbot/core/bot/RSLoader;.class
        //   759: aastore        
        //   760: invokespecial   org/powerbot/ib.<init>:([Ljava/lang/Class;)V
        //   763: invokestatic    java/lang/System.setSecurityManager:(Ljava/lang/SecurityManager;)V
        //   766: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   769: bipush          7
        //   771: aaload         
        //   772: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   775: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   778: bipush          9
        //   780: aaload         
        //   781: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   784: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   787: pop            
        //   788: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   791: bipush          13
        //   793: aaload         
        //   794: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   797: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   800: bipush          8
        //   802: aaload         
        //   803: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   806: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   809: pop            
        //   810: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   813: iconst_3       
        //   814: aaload         
        //   815: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   818: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   821: bipush          15
        //   823: aaload         
        //   824: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   827: invokestatic    java/lang/System.setProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   830: pop            
        //   831: invokestatic    org/powerbot/qb.a:()Lorg/powerbot/qb;
        //   834: pop            
        //   835: return         
        //    StackMapTable: 00 45 FF 00 16 00 0B 07 01 CB 07 00 78 07 01 CC 01 01 00 00 00 00 00 01 00 00 19 FF 00 0A 00 0B 07 01 CB 07 00 78 01 07 01 CB 01 01 00 00 00 00 01 00 00 FF 00 25 00 0B 07 01 CB 07 00 78 01 07 01 CB 01 01 07 00 40 07 00 40 01 00 01 00 01 07 00 1F 40 01 59 07 00 1F 00 54 07 00 1F 40 01 45 07 00 1F 00 07 55 07 00 1F 40 01 45 07 00 1F 00 02 41 01 5E 07 00 1F 00 40 01 05 49 07 00 1F 00 FF 00 07 00 0B 07 01 CB 07 00 78 01 07 01 CB 01 01 00 00 00 00 01 00 00 14 FF 00 20 00 0A 07 01 CB 07 00 78 01 07 01 CB 04 00 00 00 00 01 00 01 07 00 1F 00 46 07 00 1F 00 7A 07 00 1F 00 05 42 07 00 1F 01 4C 07 00 23 15 FF 00 26 00 0A 07 01 CB 07 00 78 01 07 01 CB 04 07 00 40 07 00 40 00 00 01 00 01 07 00 1F 00 51 07 00 1F 00 04 41 07 00 40 4A 07 00 1F 00 48 07 00 1F 40 07 00 40 02 41 07 00 40 FF 00 46 00 0A 07 01 CB 07 00 78 01 07 01 CB 04 07 00 40 07 00 40 07 00 40 07 00 27 01 00 01 07 00 1F 00 48 07 00 1F 00 45 01 4A 07 00 1F 00 53 07 00 1F 00 45 01 4A 07 00 1F 00 63 07 00 1F 00 45 01 4C 07 00 1F 00 4F 07 00 1F 40 01 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  310    377    377    378    Ljava/lang/Exception;
        //  297    314    317    318    Ljava/lang/Exception;
        //  292    306    309    310    Ljava/lang/Exception;
        //  231    246    246    247    Ljava/lang/Exception;
        //  197    228    228    229    Ljava/lang/Exception;
        //  162    188    191    192    Ljava/lang/Exception;
        //  157    181    184    185    Ljava/lang/Exception;
        //  125    150    153    154    Ljava/lang/Exception;
        //  98     143    146    147    Ljava/lang/Exception;
        //  84     124    124    125    Ljava/lang/Exception;
        //  79     94     97     98     Ljava/lang/Exception;
        //  378    384    387    389    Ljava/lang/Exception;
        //  389    399    402    424    Ljava/lang/Throwable;
        //  704    726    729    730    Ljava/lang/Exception;
        //  699    709    712    713    Ljava/lang/Exception;
        //  649    692    692    693    Ljava/lang/Exception;
        //  644    652    655    656    Ljava/lang/Exception;
        //  610    637    637    638    Ljava/lang/Exception;
        //  605    613    616    617    Ljava/lang/Exception;
        //  582    595    598    599    Ljava/lang/Exception;
        //  572    585    588    589    Ljava/lang/Exception;
        //  495    508    511    512    Ljava/lang/Exception;
        //  490    498    501    502    Ljava/lang/Exception;
        //  457    479    482    483    Ljava/lang/Exception;
        //  450    460    463    464    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0098:
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
    public void run() {
        main(new String[0]);
    }
    
    public static void a() {
        a("", "");
    }
    
    private static void a(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //     9: bipush          30
        //    11: aaload         
        //    12: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //    15: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    18: iload           7
        //    20: ifne            70
        //    23: ifne            57
        //    26: goto            30
        //    29: athrow         
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: aload_0        
        //    38: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    41: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //    44: bipush          24
        //    46: aaload         
        //    47: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //    50: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    53: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    56: astore_0       
        //    57: aload_0        
        //    58: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //    61: bipush          25
        //    63: aaload         
        //    64: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //    67: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //    70: iload           7
        //    72: ifne            157
        //    75: ifne            135
        //    78: goto            82
        //    81: athrow         
        //    82: new             Ljava/lang/StringBuilder;
        //    85: dup            
        //    86: invokespecial   java/lang/StringBuilder.<init>:()V
        //    89: aload_0        
        //    90: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    93: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //    96: bipush          34
        //    98: aaload         
        //    99: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   102: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   105: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   108: invokevirtual   java/lang/Runtime.maxMemory:()J
        //   111: ldc2_w          1024
        //   114: ldiv           
        //   115: ldc2_w          1024
        //   118: ldiv           
        //   119: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   122: ldc_w           "i"
        //   125: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   134: astore_0       
        //   135: aload_0        
        //   136: iload           7
        //   138: ifne            226
        //   141: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   144: bipush          23
        //   146: aaload         
        //   147: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   150: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   153: goto            157
        //   156: athrow         
        //   157: ifne            227
        //   160: new             Ljava/lang/StringBuilder;
        //   163: dup            
        //   164: invokespecial   java/lang/StringBuilder.<init>:()V
        //   167: aload_0        
        //   168: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   171: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   174: bipush          31
        //   176: aaload         
        //   177: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   183: ldc2_w          256
        //   186: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   189: invokevirtual   java/lang/Runtime.maxMemory:()J
        //   192: ldc2_w          1024
        //   195: ldiv           
        //   196: ldc2_w          1024
        //   199: ldiv           
        //   200: ldc2_w          4
        //   203: ldiv           
        //   204: invokestatic    java/lang/Math.max:(JJ)J
        //   207: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   210: ldc_w           "s"
        //   213: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   216: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   219: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   222: goto            226
        //   225: athrow         
        //   226: astore_0       
        //   227: new             Ljava/util/ArrayList;
        //   230: dup            
        //   231: iconst_4       
        //   232: invokespecial   java/util/ArrayList.<init>:(I)V
        //   235: astore_2       
        //   236: aload_2        
        //   237: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   240: bipush          22
        //   242: aaload         
        //   243: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   246: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   251: pop            
        //   252: aload_2        
        //   253: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   256: bipush          33
        //   258: aaload         
        //   259: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   262: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   267: pop            
        //   268: aload_2        
        //   269: iload           7
        //   271: ifne            324
        //   274: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   277: bipush          19
        //   279: aaload         
        //   280: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   283: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   288: pop            
        //   289: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   292: invokevirtual   java/lang/Runtime.availableProcessors:()I
        //   295: iconst_1       
        //   296: if_icmple       323
        //   299: goto            303
        //   302: athrow         
        //   303: aload_2        
        //   304: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   307: bipush          29
        //   309: aaload         
        //   310: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   313: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: goto            323
        //   322: athrow         
        //   323: aload_2        
        //   324: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   329: astore_3       
        //   330: aload_3        
        //   331: invokeinterface java/util/Iterator.hasNext:()Z
        //   336: ifeq            415
        //   339: aload_3        
        //   340: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   345: checkcast       Ljava/lang/String;
        //   348: astore          4
        //   350: aload_0        
        //   351: iload           7
        //   353: ifne            409
        //   356: aload           4
        //   358: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   361: iload           7
        //   363: ifne            436
        //   366: goto            370
        //   369: athrow         
        //   370: ifne            410
        //   373: goto            377
        //   376: athrow         
        //   377: new             Ljava/lang/StringBuilder;
        //   380: dup            
        //   381: invokespecial   java/lang/StringBuilder.<init>:()V
        //   384: aload_0        
        //   385: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   388: ldc_w           "$"
        //   391: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   394: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   397: aload           4
        //   399: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   402: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   405: goto            409
        //   408: athrow         
        //   409: astore_0       
        //   410: iload           7
        //   412: ifeq            330
        //   415: aload_1        
        //   416: iload           7
        //   418: ifne            480
        //   421: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   424: iconst_5       
        //   425: aaload         
        //   426: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   429: invokevirtual   java/lang/String.contains:(Ljava/lang/CharSequence;)Z
        //   432: goto            436
        //   435: athrow         
        //   436: ifne            466
        //   439: new             Ljava/lang/StringBuilder;
        //   442: dup            
        //   443: invokespecial   java/lang/StringBuilder.<init>:()V
        //   446: aload_1        
        //   447: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   450: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   453: bipush          35
        //   455: aaload         
        //   456: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   459: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   462: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   465: astore_1       
        //   466: ldc             Lorg/powerbot/Boot;.class
        //   468: invokevirtual   java/lang/Class.getProtectionDomain:()Ljava/security/ProtectionDomain;
        //   471: invokevirtual   java/security/ProtectionDomain.getCodeSource:()Ljava/security/CodeSource;
        //   474: invokevirtual   java/security/CodeSource.getLocation:()Ljava/net/URL;
        //   477: invokevirtual   java/net/URL.getPath:()Ljava/lang/String;
        //   480: astore_3       
        //   481: aload_3        
        //   482: invokestatic    org/powerbot/gb.c:(Ljava/lang/String;)Ljava/lang/String;
        //   485: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   488: bipush          20
        //   490: aaload         
        //   491: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   494: ldc_w           "+"
        //   497: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   500: invokevirtual   java/lang/String.replaceAll:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   503: astore_3       
        //   504: new             Ljava/lang/StringBuilder;
        //   507: dup            
        //   508: invokespecial   java/lang/StringBuilder.<init>:()V
        //   511: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   514: bipush          28
        //   516: aaload         
        //   517: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   520: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   523: aload_0        
        //   524: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   527: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   530: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   533: bipush          32
        //   535: aaload         
        //   536: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   539: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   542: aload_3        
        //   543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   546: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   549: bipush          21
        //   551: aaload         
        //   552: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   555: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   558: ldc             Lorg/powerbot/Boot;.class
        //   560: invokevirtual   java/lang/Class.getCanonicalName:()Ljava/lang/String;
        //   563: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   566: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   569: bipush          26
        //   571: aaload         
        //   572: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: aload_1        
        //   579: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   585: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   588: astore          4
        //   590: invokestatic    java/lang/Runtime.getRuntime:()Ljava/lang/Runtime;
        //   593: astore          5
        //   595: iload           7
        //   597: ifne            669
        //   600: getstatic       org/powerbot/y.e:Lorg/powerbot/y$a_;
        //   603: getstatic       org/powerbot/y$a_.MAC:Lorg/powerbot/y$a_;
        //   606: if_acmpeq       626
        //   609: goto            613
        //   612: athrow         
        //   613: getstatic       org/powerbot/y.e:Lorg/powerbot/y$a_;
        //   616: getstatic       org/powerbot/y$a_.LINUX:Lorg/powerbot/y$a_;
        //   619: if_acmpne       674
        //   622: goto            626
        //   625: athrow         
        //   626: aload           5
        //   628: iconst_3       
        //   629: anewarray       Ljava/lang/String;
        //   632: dup            
        //   633: iconst_0       
        //   634: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   637: bipush          18
        //   639: aaload         
        //   640: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   643: aastore        
        //   644: dup            
        //   645: iconst_1       
        //   646: getstatic       org/powerbot/Boot.z:[Ljava/lang/String;
        //   649: bipush          27
        //   651: aaload         
        //   652: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //   655: aastore        
        //   656: dup            
        //   657: iconst_2       
        //   658: aload           4
        //   660: aastore        
        //   661: invokevirtual   java/lang/Runtime.exec:([Ljava/lang/String;)Ljava/lang/Process;
        //   664: pop            
        //   665: goto            669
        //   668: athrow         
        //   669: iload           7
        //   671: ifeq            686
        //   674: aload           5
        //   676: aload           4
        //   678: invokevirtual   java/lang/Runtime.exec:(Ljava/lang/String;)Ljava/lang/Process;
        //   681: pop            
        //   682: goto            686
        //   685: athrow         
        //   686: return         
        //   687: astore          6
        //   689: return         
        //    StackMapTable: 00 28 FF 00 1D 00 08 07 00 40 07 00 40 00 00 00 00 00 01 00 01 07 00 5E 00 1A 4C 01 4A 07 00 5E 00 34 54 07 00 5E 40 01 F7 00 43 07 00 5E 40 07 00 40 00 FF 00 4A 00 08 07 00 40 07 00 40 07 00 49 00 00 00 00 01 00 01 07 00 5E 00 52 07 00 5E 00 40 07 00 49 FF 00 05 00 08 07 00 40 07 00 40 07 00 49 07 00 C6 00 00 00 01 00 00 FF 00 26 00 08 07 00 40 07 00 40 07 00 49 07 00 C6 07 00 40 00 00 01 00 01 07 00 5E 40 01 45 07 00 5E 00 5E 07 00 5E 40 07 00 40 00 FF 00 04 00 08 07 00 40 07 00 40 07 00 49 07 00 C6 00 00 00 01 00 00 53 07 00 5E 40 01 1D 4D 07 00 40 FF 00 83 00 08 07 00 40 07 00 40 07 00 49 07 00 40 07 00 40 07 00 87 00 01 00 01 07 00 5E 00 4B 07 00 5E 00 69 07 00 5E 00 04 4A 07 00 5E 00 40 07 00 5E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  669    682    685    686    Ljava/io/IOException;
        //  613    665    668    669    Ljava/io/IOException;
        //  600    622    625    626    Ljava/io/IOException;
        //  415    432    435    436    Ljava/io/IOException;
        //  370    405    408    409    Ljava/io/IOException;
        //  356    373    376    377    Ljava/io/IOException;
        //  350    366    369    370    Ljava/io/IOException;
        //  274    319    322    323    Ljava/io/IOException;
        //  236    299    302    303    Ljava/io/IOException;
        //  157    222    225    226    Ljava/io/IOException;
        //  135    153    156    157    Ljava/io/IOException;
        //  70     78     81     82     Ljava/io/IOException;
        //  5      26     29     30     Ljava/io/IOException;
        //  595    686    687    690    Ljava/io/IOException;
        //  595    609    612    613    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0370:
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
    
    public static void a(final String s) {
        try {
            Boot.a.severe(s);
            if (y.e == y.a_.WINDOWS) {
                JOptionPane.showMessageDialog(null, s, p.a(Boot.z[36]), 0);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    static {
        final String[] z2 = new String[37];
        int n37;
        int n36;
        int n35;
        int n34;
        int n33;
        int n32;
        int n31;
        int n30;
        int n29;
        int n28;
        int n27;
        int n26;
        int n25;
        int n24;
        int n23;
        int n22;
        int n21;
        int n20;
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 0)))))))))))))))))))))))))))))))))));
        String s = "#'\u0013A'JJ";
        int n38 = -1;
        String intern = null;
    Label_0458_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n40;
            final int n39 = n40 = (length = charArray.length);
            int n41 = 0;
            while (true) {
                Label_0534: {
                    if (n39 > 1) {
                        break Label_0534;
                    }
                    length = (n40 = n41);
                    do {
                        final char c2 = charArray[n40];
                        char c3 = '\0';
                        switch (n41 % 5) {
                            case 0: {
                                c3 = '|';
                                break;
                            }
                            case 1: {
                                c3 = '\u0015';
                                break;
                            }
                            case 2: {
                                c3 = ']';
                                break;
                            }
                            case 3: {
                                c3 = 'g';
                                break;
                            }
                            default: {
                                c3 = 'x';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n41;
                    } while (n39 == 0);
                }
                if (n39 > n41) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n38) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 1))))))))))))))))))))))))))))))))))));
                    s = "L\u0013!";
                    n38 = 0;
                    continue Label_0458_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 2))))))))))))))))))))))))))))))))))));
                    s = "U64dK1)KC";
                    n38 = 1;
                    continue Label_0458_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 3))))))))))))))))))))))))))))))))))));
                    s = "tdHMm\u001d\u001awo\fn?H\u0002n\u001d\u001d<n\nnrCMs\n\u0001/u\u0018bc\bR";
                    n38 = 2;
                    continue Label_0458_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 4))))))))))))))))))))))))))))))))))));
                    s = "\r\u001d<nRo~K\u0006";
                    n38 = 3;
                    continue Label_0458_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 5))))))))))))))))))))))))))))))))))));
                    s = "3yZ\nn\u0003\u00057`\u0002";
                    n38 = 4;
                    continue Label_0458_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 6))))))))))))))))))))))))))))))))))));
                    s = "#\u0019,q\u000e{y\u001f\u0010t\u0011\u0003\"k\u0005{+P\u001f:G\u0004cl\u0015>gP\u0018~\u000b\u0019$";
                    n38 = 5;
                    continue Label_0458_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 7))))))))))))))))))))))))))))))))))));
                    s = "mpP\u0002-\u0016\u000b-2\fut@\u0006q1>/(/spE\b";
                    n38 = 6;
                    continue Label_0458_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 8))))))))))))))))))))))))))))))))))));
                    s = "ZY{+^03\u0013A4ZYw+R";
                    n38 = 7;
                    continue Label_0458_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 9))))))))))))))))))))))))))))))))))));
                    s = "jyJ\u001c";
                    n38 = 8;
                    continue Label_0458_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 10))))))))))))))))))))))))))))))))))));
                    s = "&\u0012%d\u0013r\u007f\u001f\u0011\u007f\u0003\u0007cv\u000fdn\u001f\u0016|BR0hFjdPYi\u000f\u0016/iJ>yZ\nn\u0003\u00057l\by+H\u0010n\nWfv\u000b";
                    n38 = 9;
                    continue Label_0458_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 11))))))))))))))))))))))))))))))))))));
                    s = "SjG\u0010w\u0017\u001ack\u0013siZ\u000b:\r\u0011cg\tjx\u001f\u0018h\u0007W1p\bpbQ\u001e";
                    n38 = 10;
                    continue Label_0458_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 12))))))))))))))))))))))))))))))))))));
                    s = "*g";
                    n38 = 11;
                    continue Label_0458_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 13))))))))))))))))))))))))))))))))))));
                    s = "\u000b\u001b72\u0012be\b\u0010s\u0011@7}\u0011bbC\u0011u\u0011\r<2\u0012f|C\u0010f\n\u0018<n\u000f";
                    n38 = 12;
                    continue Label_0458_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 14))))))))))))))))))))))))))))))))))));
                    s = "*=\u001bs\b";
                    n38 = 13;
                    continue Label_0458_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 15))))))))))))))))))))))))))))))))))));
                    s = "\u0006\u00190)\u0015ke";
                    n38 = 14;
                    continue Label_0458_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 16))))))))))))))))))))))))))))))))))));
                    s = "D~S\u000fgX\u00006h\\ttRCV*\"yo\butG\u000e#\u0010\u000f7x\u0010bc\u0006\u0005b\u001b\u001a6n\u0005";
                    n38 = 15;
                    continue Label_0458_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 17))))))))))))))))))))))))))))))))))));
                    s = "D~S\u000fgX\u00006h\\exH\u0007#\f\u0001yp\u0013dpJCs\u0017\u001c-";
                    n38 = 16;
                    continue Label_0458_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 18))))))))))))))))))))))))))))))))))));
                    s = "M\u0015*kImc";
                    n38 = 17;
                    continue Label_0458_Outer;
                }
                case 17: {
                    z2[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 19))))))))))))))))))))))))))))))))))));
                    s = "U6\u0001&QRbC0s\u0014\u0007-J\u0019ux@\nf\n";
                    n38 = 18;
                    continue Label_0458_Outer;
                }
                case 18: {
                    z2[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 20))))))))))))))))))))))))))))))))))));
                    s = "BW";
                    n38 = 19;
                    continue Label_0458_Outer;
                }
                case 19: {
                    z2[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 21))))))))))))))))))))))))))))))))))));
                    s = "@Wa";
                    n38 = 20;
                    continue Label_0458_Outer;
                }
                case 20: {
                    z2[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 22))))))))))))))))))))))))))))))))))));
                    s = "U6\u0001&WD\\u o\u0019\u001d*I\u0012k~G\u0007j\u0016\t\u001cr\u001de}C\u0007";
                    n38 = 21;
                    continue Label_0458_Outer;
                }
                case 21: {
                    z2[n23] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 23))))))))))))))))))))))))))))))))))));
                    s = "3SgCW\u0003\u000f\u0013`\u0014sXV\u0003\u007f_";
                    n38 = 22;
                    continue Label_0458_Outer;
                }
                case 22: {
                    z2[n24] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 24))))))))))))))))))))))))))))))))))));
                    s = "BZ\u001bv\u0015(f";
                    n38 = 23;
                    continue Label_0458_Outer;
                }
                case 23: {
                    z2[n25] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 25))))))))))))))))))))))))))))))))))));
                    s = "*IK\u001b";
                    n38 = 24;
                    continue Label_0458_Outer;
                }
                case 24: {
                    z2[n26] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 26))))))))))))))))))))))))))))))))))));
                    s = "%1";
                    n38 = 25;
                    continue Label_0458_Outer;
                }
                case 25: {
                    z2[n27] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 27))))))))))))))))))))))))))))))))))));
                    s = "*r";
                    n38 = 26;
                    continue Label_0458_Outer;
                }
                case 26: {
                    z2[n28] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 28))))))))))))))))))))))))))))))))))));
                    s = "\b\u00165dF";
                    n38 = 27;
                    continue Label_0458_Outer;
                }
                case 27: {
                    z2[n29] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 29))))))))))))))))))))))))))))))))))));
                    s = "O/\u001b?MKxZ:u\f\u0014\u000ed\u0014uXH\u001c\u007f\u00120\u0000";
                    n38 = 28;
                    continue Label_0458_Outer;
                }
                case 28: {
                    z2[n30] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 30))))))))))))))))))))))))))))))))))));
                    s = "*IU\u0010";
                    n38 = 29;
                    continue Label_0458_Outer;
                }
                case 29: {
                    z2[n31] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 31))))))))))))))))))))))))))))))))))));
                    s = "XC\u0001DFJp^3f\n\u0003\nu\u0006b,";
                    n38 = 30;
                    continue Label_0458_Outer;
                }
                case 30: {
                    z2[n32] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 32))))))))))))))))))))))))))))))))))));
                    s = "XC:p\u001dtbV\u0002w\u0010N{";
                    n38 = 31;
                    continue Label_0458_Outer;
                }
                case 31: {
                    z2[n33] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 33))))))))))))))))))))))))))))))))))));
                    s = "O/\u001b?MKxZ:u\u0006\u0012\u0000d\u0005vny\u0015o\u0011\u001f*k\u0001";
                    n38 = 32;
                    continue Label_0458_Outer;
                }
                case 32: {
                    z2[n34] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 34))))))))))))))))))))))))))))))))))));
                    s = "BZ\u001bh\u001e";
                    n38 = 33;
                    continue Label_0458_Outer;
                }
                case 33: {
                    z2[n35] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 35))))))))))))))))))))))))))))))))))));
                    s = "XC+y\u000fspT\u0017f\u001c";
                    n38 = 34;
                    continue Label_0458_Outer;
                }
                case 34: {
                    z2[n36] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = (n36 = (n37 = 36))))))))))))))))))))))))))))))))))));
                    s = "'\u00051j\u0014";
                    n38 = 35;
                    continue Label_0458_Outer;
                }
                case 35: {
                    break Label_0458_Outer;
                }
            }
        }
        z2[n37] = intern;
        z = z2;
        String s2 = "*cC\u0010w\u0019\u001c-y\u0018";
        int n42 = -1;
        String intern2 = null;
    Label_0730_Outer:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            int length2;
            int n44;
            final int n43 = n44 = (length2 = charArray2.length);
            int n45 = 0;
            while (true) {
                Label_0806: {
                    if (n43 > 1) {
                        break Label_0806;
                    }
                    length2 = (n44 = n45);
                    do {
                        final char c4 = charArray2[n44];
                        char c5 = '\0';
                        switch (n45 % 5) {
                            case 0: {
                                c5 = '|';
                                break;
                            }
                            case 1: {
                                c5 = '\u0015';
                                break;
                            }
                            case 2: {
                                c5 = ']';
                                break;
                            }
                            case 3: {
                                c5 = 'g';
                                break;
                            }
                            default: {
                                c5 = 'x';
                                break;
                            }
                        }
                        charArray2[length2] = (char)(c4 ^ c5);
                        ++n45;
                    } while (n43 == 0);
                }
                if (n43 > n45) {
                    continue;
                }
                break;
            }
            intern2 = new String(charArray2).intern();
            switch (n42) {
                default: {
                    b = ClientStub.e(intern2);
                    s2 = "3}";
                    n42 = 0;
                    continue Label_0730_Outer;
                }
                case 0: {
                    break Label_0730_Outer;
                }
            }
        }
        c = p.a(intern2);
        a = Logger.getLogger(Boot.class.getName());
    }
}
