
package org.powerbot.game.bot.handler.input;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.Random;
import java.util.ArrayList;
import org.powerbot.core.Bot;
import java.awt.Point;
import org.powerbot.game.bot.handler.input.util.MouseNode;
import java.util.List;
import org.powerbot.game.client.Client;

public class a
{
    private final Client a;
    private final List<f_> b;
    private final g_ c;
    private volatile MouseNode d;
    private final Point e;
    public static int f;
    
    public a() {
        this.a = Bot.client();
        this.b = new ArrayList<f_>(5);
        this.c = new g_();
        this.e = new Point(-1, -1);
        this.a();
    }
    
    public void a(final MouseNode p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          13
        //     5: aload_0        
        //     6: getfield        org/powerbot/game/bot/handler/input/a.d:Lorg/powerbot/game/bot/handler/input/util/MouseNode;
        //     9: iload           13
        //    11: ifne            41
        //    14: aload_1        
        //    15: if_acmpeq       40
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //    26: iconst_m1      
        //    27: iconst_m1      
        //    28: invokevirtual   java/awt/Point.setLocation:(II)V
        //    31: aload_0        
        //    32: aload_1        
        //    33: putfield        org/powerbot/game/bot/handler/input/a.d:Lorg/powerbot/game/bot/handler/input/util/MouseNode;
        //    36: goto            40
        //    39: athrow         
        //    40: aload_1        
        //    41: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.l:()D
        //    44: dstore_2       
        //    45: aload_0        
        //    46: getfield        org/powerbot/game/bot/handler/input/a.a:Lorg/powerbot/game/client/Client;
        //    49: invokeinterface org/powerbot/game/client/Client.getMouse:()Lorg/powerbot/game/client/input/Mouse;
        //    54: astore          4
        //    56: aload_1        
        //    57: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.b:()Lorg/powerbot/game/api/wrappers/ViewportEntity;
        //    60: astore          5
        //    62: aload           5
        //    64: invokeinterface org/powerbot/game/api/wrappers/ViewportEntity.validate:()Z
        //    69: iload           13
        //    71: ifne            101
        //    74: ifeq            657
        //    77: goto            81
        //    80: athrow         
        //    81: aload_0        
        //    82: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //    85: iload           13
        //    87: ifne            167
        //    90: goto            94
        //    93: athrow         
        //    94: getfield        java/awt/Point.x:I
        //    97: goto            101
        //   100: athrow         
        //   101: iconst_m1      
        //   102: if_icmpeq       156
        //   105: aload_0        
        //   106: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   109: iload           13
        //   111: ifne            167
        //   114: goto            118
        //   117: athrow         
        //   118: getfield        java/awt/Point.y:I
        //   121: iconst_m1      
        //   122: if_icmpeq       156
        //   125: goto            129
        //   128: athrow         
        //   129: aload           5
        //   131: aload_0        
        //   132: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   135: invokeinterface org/powerbot/game/api/wrappers/ViewportEntity.contains:(Ljava/awt/Point;)Z
        //   140: iload           13
        //   142: ifne            250
        //   145: goto            149
        //   148: athrow         
        //   149: ifne            220
        //   152: goto            156
        //   155: athrow         
        //   156: aload           5
        //   158: invokeinterface org/powerbot/game/api/wrappers/ViewportEntity.getNextViewportPoint:()Ljava/awt/Point;
        //   163: goto            167
        //   166: athrow         
        //   167: astore          6
        //   169: aload           6
        //   171: iload           13
        //   173: ifne            210
        //   176: getfield        java/awt/Point.x:I
        //   179: aload           6
        //   181: getfield        java/awt/Point.y:I
        //   184: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(II)Z
        //   187: ifne            206
        //   190: goto            194
        //   193: athrow         
        //   194: bipush          25
        //   196: bipush          51
        //   198: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   201: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   204: return         
        //   205: athrow         
        //   206: aload_0        
        //   207: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   210: aload           6
        //   212: invokevirtual   java/awt/Point.setLocation:(Ljava/awt/Point;)V
        //   215: iload           13
        //   217: ifeq            275
        //   220: aload_0        
        //   221: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   224: iload           13
        //   226: ifne            280
        //   229: goto            233
        //   232: athrow         
        //   233: getfield        java/awt/Point.x:I
        //   236: aload_0        
        //   237: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   240: getfield        java/awt/Point.y:I
        //   243: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(II)Z
        //   246: goto            250
        //   249: athrow         
        //   250: ifne            275
        //   253: aload_0        
        //   254: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   257: iconst_m1      
        //   258: iconst_m1      
        //   259: invokevirtual   java/awt/Point.setLocation:(II)V
        //   262: bipush          100
        //   264: sipush          200
        //   267: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   270: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   273: return         
        //   274: athrow         
        //   275: aload           4
        //   277: invokevirtual   org/powerbot/game/client/input/Mouse.getLocation:()Ljava/awt/Point;
        //   280: astore          6
        //   282: iload           13
        //   284: ifne            311
        //   287: aload_0        
        //   288: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   291: aload           6
        //   293: invokevirtual   java/awt/Point.equals:(Ljava/lang/Object;)Z
        //   296: ifeq            369
        //   299: goto            303
        //   302: athrow         
        //   303: aload_1        
        //   304: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.i:()V
        //   307: goto            311
        //   310: athrow         
        //   311: aload_1        
        //   312: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.c:()Lorg/powerbot/game/api/util/Filter;
        //   315: astore          7
        //   317: iload           13
        //   319: ifne            364
        //   322: aload           7
        //   324: aload           6
        //   326: invokeinterface org/powerbot/game/api/util/Filter.accept:(Ljava/lang/Object;)Z
        //   331: ifeq            351
        //   334: goto            338
        //   337: athrow         
        //   338: aload_1        
        //   339: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.f:()V
        //   342: iload           13
        //   344: ifeq            368
        //   347: goto            351
        //   350: athrow         
        //   351: aload_0        
        //   352: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   355: iconst_m1      
        //   356: iconst_m1      
        //   357: invokevirtual   java/awt/Point.setLocation:(II)V
        //   360: goto            364
        //   363: athrow         
        //   364: aload_1        
        //   365: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.j:()V
        //   368: return         
        //   369: ldc2_w          7.0
        //   372: ldc2_w          10.0
        //   375: invokestatic    org/powerbot/game/api/util/Random.nextDouble:(DD)D
        //   378: ldc2_w          1000.0
        //   381: ddiv           
        //   382: dstore          7
        //   384: new             Lorg/powerbot/game/bot/handler/input/a$g_;
        //   387: dup            
        //   388: aload_0        
        //   389: aconst_null    
        //   390: invokespecial   org/powerbot/game/bot/handler/input/a$g_.<init>:(Lorg/powerbot/game/bot/handler/input/a;Lorg/powerbot/game/bot/handler/input/a$0;)V
        //   393: astore          9
        //   395: aload_0        
        //   396: getfield        org/powerbot/game/bot/handler/input/a.b:Ljava/util/List;
        //   399: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   404: astore          10
        //   406: aload           10
        //   408: invokeinterface java/util/Iterator.hasNext:()Z
        //   413: ifeq            481
        //   416: aload           10
        //   418: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   423: checkcast       Lorg/powerbot/game/bot/handler/input/a$f_;
        //   426: astore          11
        //   428: aload           11
        //   430: dload           7
        //   432: aload_0        
        //   433: getfield        org/powerbot/game/bot/handler/input/a.e:Ljava/awt/Point;
        //   436: invokeinterface org/powerbot/game/bot/handler/input/a$f_.a:(DLjava/awt/Point;)Lorg/powerbot/game/bot/handler/input/a$g_;
        //   441: astore          12
        //   443: aload           12
        //   445: iload           13
        //   447: ifne            483
        //   450: iload           13
        //   452: ifne            471
        //   455: goto            459
        //   458: athrow         
        //   459: ifnonnull       469
        //   462: goto            466
        //   465: athrow         
        //   466: goto            406
        //   469: aload           9
        //   471: aload           12
        //   473: invokevirtual   org/powerbot/game/bot/handler/input/a$g_.a:(Lorg/powerbot/game/bot/handler/input/a$g_;)V
        //   476: iload           13
        //   478: ifeq            406
        //   481: aload           9
        //   483: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
        //   486: invokestatic    java/lang/Double.isNaN:(D)Z
        //   489: iload           13
        //   491: ifne            522
        //   494: ifne            525
        //   497: goto            501
        //   500: athrow         
        //   501: aload           9
        //   503: iload           13
        //   505: ifne            554
        //   508: goto            512
        //   511: athrow         
        //   512: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
        //   515: invokestatic    java/lang/Double.isNaN:(D)Z
        //   518: goto            522
        //   521: athrow         
        //   522: ifeq            531
        //   525: aload_1        
        //   526: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.h:()V
        //   529: return         
        //   530: athrow         
        //   531: aload_0        
        //   532: getfield        org/powerbot/game/bot/handler/input/a.c:Lorg/powerbot/game/bot/handler/input/a$g_;
        //   535: aload           9
        //   537: dload           7
        //   539: invokevirtual   org/powerbot/game/bot/handler/input/a$g_.a:(D)Lorg/powerbot/game/bot/handler/input/a$g_;
        //   542: invokevirtual   org/powerbot/game/bot/handler/input/a$g_.a:(Lorg/powerbot/game/bot/handler/input/a$g_;)V
        //   545: aload_0        
        //   546: getfield        org/powerbot/game/bot/handler/input/a.c:Lorg/powerbot/game/bot/handler/input/a$g_;
        //   549: dload           7
        //   551: invokevirtual   org/powerbot/game/bot/handler/input/a$g_.a:(D)Lorg/powerbot/game/bot/handler/input/a$g_;
        //   554: astore          10
        //   556: aload           10
        //   558: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
        //   561: dconst_0       
        //   562: iload           13
        //   564: ifne            642
        //   567: dcmpl          
        //   568: ifeq            635
        //   571: goto            575
        //   574: athrow         
        //   575: aload           10
        //   577: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
        //   580: dconst_0       
        //   581: iload           13
        //   583: ifne            642
        //   586: goto            590
        //   589: athrow         
        //   590: dcmpl          
        //   591: ifeq            635
        //   594: goto            598
        //   597: athrow         
        //   598: aload           6
        //   600: invokevirtual   java/awt/Point.getX:()D
        //   603: d2i            
        //   604: aload           10
        //   606: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
        //   609: d2i            
        //   610: iadd           
        //   611: istore          11
        //   613: aload           6
        //   615: invokevirtual   java/awt/Point.getY:()D
        //   618: d2i            
        //   619: aload           10
        //   621: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
        //   624: d2i            
        //   625: iadd           
        //   626: istore          12
        //   628: iload           11
        //   630: iload           12
        //   632: invokestatic    org/powerbot/game/api/methods/input/Mouse.hop:(II)V
        //   635: dload           7
        //   637: ldc2_w          1000.0
        //   640: dmul           
        //   641: dload_2        
        //   642: ddiv           
        //   643: d2l            
        //   644: invokestatic    java/lang/Thread.sleep:(J)V
        //   647: goto            652
        //   650: astore          11
        //   652: iload           13
        //   654: ifeq            665
        //   657: aload_1        
        //   658: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.h:()V
        //   661: goto            665
        //   664: athrow         
        //   665: return         
        //    StackMapTable: 00 4E FF 00 15 00 0E 07 00 45 07 00 71 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 39 00 50 07 00 39 00 40 07 00 71 FF 00 26 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 00 00 00 00 00 00 00 01 00 01 07 00 39 00 4B 07 00 39 40 07 00 0A 45 07 00 39 40 01 4F 07 00 39 40 07 00 0A 49 07 00 39 00 52 07 00 39 40 01 45 07 00 39 00 49 07 00 39 40 07 00 0A FF 00 19 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 00 00 00 00 00 00 01 00 01 07 00 39 00 4A 07 00 39 00 43 07 00 0A FF 00 09 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 00 00 00 00 00 00 00 01 00 00 4B 07 00 39 40 07 00 0A 4F 07 00 39 40 01 57 07 00 39 00 44 07 00 0A FF 00 15 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 00 00 00 00 00 00 01 00 01 07 00 39 00 46 07 00 39 00 FF 00 19 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 07 00 88 00 00 00 00 00 01 00 01 07 00 39 00 4B 07 00 39 00 4B 07 00 39 00 03 FF 00 00 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 00 00 00 00 00 00 01 00 00 FF 00 24 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 8F 00 00 01 00 00 FF 00 33 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 8F 07 00 2D 07 00 08 01 00 01 07 00 39 40 07 00 08 45 07 00 39 00 02 41 07 00 08 FF 00 09 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 8F 00 00 01 00 00 41 07 00 08 50 07 00 39 00 49 07 00 39 40 07 00 08 48 07 00 39 40 01 02 44 07 00 39 00 56 07 00 08 FF 00 13 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 08 00 00 01 00 01 07 00 39 00 4D 07 00 39 FF 00 00 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 08 00 00 01 00 02 03 03 46 07 00 39 00 24 FF 00 06 00 0C 07 00 45 07 00 71 03 07 00 83 07 00 76 07 00 0A 03 07 00 08 07 00 08 00 00 01 00 02 03 03 47 07 00 39 01 FF 00 04 00 0D 07 00 45 07 00 71 03 07 00 83 07 00 76 00 00 00 00 00 00 00 01 00 00 46 07 00 39 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  575    594    597    598    Ljava/lang/InterruptedException;
        //  567    586    589    590    Ljava/lang/InterruptedException;
        //  556    571    574    575    Ljava/lang/InterruptedException;
        //  522    530    530    531    Ljava/lang/InterruptedException;
        //  501    518    521    522    Ljava/lang/InterruptedException;
        //  494    508    511    512    Ljava/lang/InterruptedException;
        //  483    497    500    501    Ljava/lang/InterruptedException;
        //  450    462    465    466    Ljava/lang/InterruptedException;
        //  443    455    458    459    Ljava/lang/InterruptedException;
        //  338    360    363    364    Ljava/lang/InterruptedException;
        //  322    347    350    351    Ljava/lang/InterruptedException;
        //  317    334    337    338    Ljava/lang/InterruptedException;
        //  287    307    310    311    Ljava/lang/InterruptedException;
        //  282    299    302    303    Ljava/lang/InterruptedException;
        //  250    274    274    275    Ljava/lang/InterruptedException;
        //  220    246    249    250    Ljava/lang/InterruptedException;
        //  210    229    232    233    Ljava/lang/InterruptedException;
        //  176    205    205    206    Ljava/lang/InterruptedException;
        //  169    190    193    194    Ljava/lang/InterruptedException;
        //  149    163    166    167    Ljava/lang/InterruptedException;
        //  129    152    155    156    Ljava/lang/InterruptedException;
        //  118    145    148    149    Ljava/lang/InterruptedException;
        //  105    125    128    129    Ljava/lang/InterruptedException;
        //  101    114    117    118    Ljava/lang/InterruptedException;
        //  81     97     100    101    Ljava/lang/InterruptedException;
        //  74     90     93     94     Ljava/lang/InterruptedException;
        //  62     77     80     81     Ljava/lang/InterruptedException;
        //  14     36     39     40     Ljava/lang/InterruptedException;
        //  5      18     21     22     Ljava/lang/InterruptedException;
        //  635    647    650    652    Ljava/lang/InterruptedException;
        //  652    661    664    665    Ljava/lang/InterruptedException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0081:
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
    
    private void a() {
        this.b.add(new f_() {
            @Override
            public g_ a(final double p0, final Point p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          12
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/bot/handler/input/a$0.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //     9: invokestatic    org/powerbot/game/bot/handler/input/a.access$100:(Lorg/powerbot/game/bot/handler/input/a;)Lorg/powerbot/game/client/Client;
                //    12: invokeinterface org/powerbot/game/client/Client.getMouse:()Lorg/powerbot/game/client/input/Mouse;
                //    17: astore          4
                //    19: aload           4
                //    21: invokevirtual   org/powerbot/game/client/input/Mouse.getLocation:()Ljava/awt/Point;
                //    24: astore          5
                //    26: new             Lorg/powerbot/game/bot/handler/input/a$g_;
                //    29: dup            
                //    30: aload_0        
                //    31: getfield        org/powerbot/game/bot/handler/input/a$0.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //    34: aconst_null    
                //    35: invokespecial   org/powerbot/game/bot/handler/input/a$g_.<init>:(Lorg/powerbot/game/bot/handler/input/a;Lorg/powerbot/game/bot/handler/input/a$0;)V
                //    38: astore          6
                //    40: aload           6
                //    42: aload_3        
                //    43: getfield        java/awt/Point.x:I
                //    46: i2d            
                //    47: aload           5
                //    49: invokevirtual   java/awt/Point.getX:()D
                //    52: dsub           
                //    53: putfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //    56: aload           6
                //    58: aload_3        
                //    59: getfield        java/awt/Point.y:I
                //    62: i2d            
                //    63: aload           5
                //    65: invokevirtual   java/awt/Point.getY:()D
                //    68: dsub           
                //    69: putfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //    72: aload           6
                //    74: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //    77: iload           12
                //    79: ifne            122
                //    82: dconst_0       
                //    83: dcmpl          
                //    84: ifne            117
                //    87: goto            91
                //    90: athrow         
                //    91: aload           6
                //    93: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //    96: iload           12
                //    98: ifne            122
                //   101: goto            105
                //   104: athrow         
                //   105: dconst_0       
                //   106: dcmpl          
                //   107: ifne            117
                //   110: goto            114
                //   113: athrow         
                //   114: aconst_null    
                //   115: areturn        
                //   116: athrow         
                //   117: aload           6
                //   119: invokevirtual   org/powerbot/game/bot/handler/input/a$g_.b:()D
                //   122: dstore          7
                //   124: sipush          2500
                //   127: sipush          3000
                //   130: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
                //   133: i2d            
                //   134: dstore          9
                //   136: new             Lorg/powerbot/game/bot/handler/input/a$g_;
                //   139: dup            
                //   140: aload_0        
                //   141: getfield        org/powerbot/game/bot/handler/input/a$0.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //   144: aconst_null    
                //   145: invokespecial   org/powerbot/game/bot/handler/input/a$g_.<init>:(Lorg/powerbot/game/bot/handler/input/a;Lorg/powerbot/game/bot/handler/input/a$0;)V
                //   148: astore          11
                //   150: aload           11
                //   152: dload           7
                //   154: invokestatic    java/lang/Math.cos:(D)D
                //   157: dload           9
                //   159: dmul           
                //   160: putfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //   163: aload           11
                //   165: dload           7
                //   167: invokestatic    java/lang/Math.sin:(D)D
                //   170: dload           9
                //   172: dmul           
                //   173: putfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //   176: aload           11
                //   178: areturn        
                //    StackMapTable: 00 09 FF 00 5A 00 0C 07 00 12 03 07 00 2A 07 00 26 07 00 2A 07 00 06 00 00 00 00 00 01 00 01 07 00 5C 00 4C 07 00 5C 40 03 47 07 00 5C 00 41 07 00 5C 00 44 03
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  105    116    116    117    Ljava/lang/RuntimeException;
                //  91     110    113    114    Ljava/lang/RuntimeException;
                //  82     101    104    105    Ljava/lang/RuntimeException;
                //  40     87     90     91     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
        this.b.add(new f_() {
            @Override
            public g_ a(final double n, final Point point) {
                return org.powerbot.game.bot.handler.input.a.this.c.a(-1.0);
            }
        });
        this.b.add(new f_() {
            @Override
            public g_ a(final double p0, final Point p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_0        
                //     6: getfield        org/powerbot/game/bot/handler/input/a$2.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //     9: invokestatic    org/powerbot/game/bot/handler/input/a.access$100:(Lorg/powerbot/game/bot/handler/input/a;)Lorg/powerbot/game/client/Client;
                //    12: invokeinterface org/powerbot/game/client/Client.getMouse:()Lorg/powerbot/game/client/input/Mouse;
                //    17: astore          4
                //    19: aload           4
                //    21: invokevirtual   org/powerbot/game/client/input/Mouse.getLocation:()Ljava/awt/Point;
                //    24: astore          5
                //    26: new             Lorg/powerbot/game/bot/handler/input/a$g_;
                //    29: dup            
                //    30: aload_0        
                //    31: getfield        org/powerbot/game/bot/handler/input/a$2.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //    34: aconst_null    
                //    35: invokespecial   org/powerbot/game/bot/handler/input/a$g_.<init>:(Lorg/powerbot/game/bot/handler/input/a;Lorg/powerbot/game/bot/handler/input/a$0;)V
                //    38: astore          6
                //    40: aload           6
                //    42: aload_3        
                //    43: getfield        java/awt/Point.x:I
                //    46: i2d            
                //    47: aload           5
                //    49: invokevirtual   java/awt/Point.getX:()D
                //    52: dsub           
                //    53: putfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //    56: aload           6
                //    58: aload_3        
                //    59: getfield        java/awt/Point.y:I
                //    62: i2d            
                //    63: aload           5
                //    65: invokevirtual   java/awt/Point.getY:()D
                //    68: dsub           
                //    69: putfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //    72: aload           6
                //    74: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //    77: ldc2_w          -3.0
                //    80: dcmpl          
                //    81: iload           7
                //    83: ifne            106
                //    86: ifle            194
                //    89: goto            93
                //    92: athrow         
                //    93: aload           6
                //    95: getfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //    98: ldc2_w          3.0
                //   101: dcmpg          
                //   102: goto            106
                //   105: athrow         
                //   106: iload           7
                //   108: ifne            131
                //   111: ifge            194
                //   114: goto            118
                //   117: athrow         
                //   118: aload           6
                //   120: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //   123: ldc2_w          -3.0
                //   126: dcmpl          
                //   127: goto            131
                //   130: athrow         
                //   131: iload           7
                //   133: ifne            165
                //   136: ifle            194
                //   139: goto            143
                //   142: athrow         
                //   143: aload           6
                //   145: iload           7
                //   147: ifne            190
                //   150: goto            154
                //   153: athrow         
                //   154: getfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //   157: ldc2_w          -3.0
                //   160: dcmpg          
                //   161: goto            165
                //   164: athrow         
                //   165: ifge            194
                //   168: aload_0        
                //   169: getfield        org/powerbot/game/bot/handler/input/a$2.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //   172: invokestatic    org/powerbot/game/bot/handler/input/a.access$200:(Lorg/powerbot/game/bot/handler/input/a;)Lorg/powerbot/game/bot/handler/input/a$g_;
                //   175: dconst_0       
                //   176: putfield        org/powerbot/game/bot/handler/input/a$g_.a:D
                //   179: aload_0        
                //   180: getfield        org/powerbot/game/bot/handler/input/a$2.this$0:Lorg/powerbot/game/bot/handler/input/a;
                //   183: invokestatic    org/powerbot/game/bot/handler/input/a.access$200:(Lorg/powerbot/game/bot/handler/input/a;)Lorg/powerbot/game/bot/handler/input/a$g_;
                //   186: goto            190
                //   189: athrow         
                //   190: dconst_0       
                //   191: putfield        org/powerbot/game/bot/handler/input/a$g_.b:D
                //   194: aconst_null    
                //   195: areturn        
                //    StackMapTable: 00 11 FF 00 5C 00 07 07 00 13 03 07 00 2B 07 00 27 07 00 2B 07 00 06 01 00 01 07 00 55 00 4B 07 00 55 40 01 4A 07 00 55 00 4B 07 00 55 40 01 4A 07 00 55 00 49 07 00 55 40 07 00 06 49 07 00 55 40 01 57 07 00 55 40 07 00 06 03
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  165    186    189    190    Ljava/lang/RuntimeException;
                //  143    161    164    165    Ljava/lang/RuntimeException;
                //  136    150    153    154    Ljava/lang/RuntimeException;
                //  131    139    142    143    Ljava/lang/RuntimeException;
                //  111    127    130    131    Ljava/lang/RuntimeException;
                //  106    114    117    118    Ljava/lang/RuntimeException;
                //  86     102    105    106    Ljava/lang/RuntimeException;
                //  40     89     92     93     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0143:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
        this.b.add(new f_() {
            @Override
            public g_ a(final double n, final Point point) {
                int f = org.powerbot.game.bot.handler.input.a.f;
                final Point location = org.powerbot.game.bot.handler.input.a.this.a.getMouse().getLocation();
                final g_ g_ = new g_();
                g_.a = point.x - location.getX();
                g_.b = point.y - location.getY();
                final double a = g_.a();
                g_ g_3 = null;
                Label_0209: {
                    double n3 = 0.0;
                    double n5 = 0.0;
                    Label_0102: {
                        double n2;
                        double n4;
                        try {
                            n2 = (n3 = a);
                            n4 = (n5 = Random.nextInt(10, 20));
                            if (f != 0) {
                                break Label_0102;
                            }
                            final double n6 = dcmpl(n2, n4);
                            if (n6 > 0) {
                                break Label_0102;
                            }
                            break Label_0209;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final double n6 = dcmpl(n2, n4);
                            if (n6 <= 0) {
                                break Label_0209;
                            }
                            n3 = -3.141592653589793;
                            n5 = 3.141592653589793;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    final double nextDouble = Random.nextDouble(n3, n5);
                    final g_ g_2 = new g_();
                    int n9 = 0;
                    Label_0176: {
                        double n8 = 0.0;
                        Label_0170: {
                            Label_0155: {
                                double n7;
                                try {
                                    n7 = (n8 = dcmpl(a, (double)Random.nextInt(120, 200)));
                                    if (f != 0) {
                                        break Label_0170;
                                    }
                                    if (n7 > 0) {
                                        break Label_0155;
                                    }
                                    break Label_0155;
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                                try {
                                    if (n7 > 0) {
                                        n9 = Random.nextInt(3000, 4000);
                                        break Label_0176;
                                    }
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            n8 = 100;
                        }
                        n9 = Random.nextInt((int)n8, 300);
                    }
                    final int n10 = n9;
                    g_2.a = Math.cos(nextDouble) * n10;
                    g_2.b = Math.sin(nextDouble) * n10;
                    return g_2;
                    try {
                        g_3 = null;
                        if (Task.a != 0) {
                            org.powerbot.game.bot.handler.input.a.f = ++f;
                        }
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                return g_3;
            }
        });
        this.b.add(new f_() {
            @Override
            public g_ a(final double n, final Point point) {
                final int f = org.powerbot.game.bot.handler.input.a.f;
                final Point location = org.powerbot.game.bot.handler.input.a.this.a.getMouse().getLocation();
                final g_ g_ = new g_();
                g_.a = point.x - location.getX();
                g_.b = point.y - location.getY();
                final double a = g_.a();
                Label_0292: {
                    double a2 = 0.0;
                    Label_0103: {
                        double n2;
                        try {
                            n2 = (a2 = a);
                            if (f != 0) {
                                break Label_0103;
                            }
                            final int n3 = 120;
                            final int n4 = 200;
                            final int n5 = Random.nextInt(n3, n4);
                            final double n6 = n5;
                            final double n7 = dcmpg(n2, n6);
                            if (n7 < 0) {
                                break Label_0103;
                            }
                            break Label_0292;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final int n3 = 120;
                            final int n4 = 200;
                            final int n5 = Random.nextInt(n3, n4);
                            final double n6 = n5;
                            final double n7 = dcmpg(n2, n6);
                            if (n7 >= 0) {
                                break Label_0292;
                            }
                            a2 = org.powerbot.game.bot.handler.input.a.this.c.a();
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    final double pow = Math.pow(a2, 2.0);
                    final double pow2 = Math.pow(a, 2.0);
                    double n9 = 0.0;
                    double n11 = 0.0;
                    Label_0162: {
                        Label_0155: {
                            double n8;
                            double n10;
                            try {
                                n8 = (n9 = pow2);
                                n10 = (n11 = 0.0);
                                if (f != 0) {
                                    break Label_0162;
                                }
                                final double n12 = dcmpl(n8, n10);
                                if (n12 == 0) {
                                    break Label_0155;
                                }
                                break Label_0155;
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                            try {
                                final double n12 = dcmpl(n8, n10);
                                if (n12 == 0) {
                                    return null;
                                }
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                        }
                        n9 = pow;
                        n11 = pow2;
                    }
                    final g_ a3 = g_.a(Math.sqrt(n9 / n11));
                    g_ g_2 = new g_();
                    g_2.a = (a3.a - org.powerbot.game.bot.handler.input.a.this.c.a) / n;
                    g_2.b = (a3.b - org.powerbot.game.bot.handler.input.a.this.c.b) / n;
                    final double n13 = 8.0 / a;
                    double n14 = 0.0;
                    Label_0276: {
                        Label_0270: {
                            try {
                                n14 = dcmpg(n13, 1.0);
                                if (f != 0) {
                                    break Label_0276;
                                }
                                if (n14 >= 0) {
                                    break Label_0270;
                                }
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                            g_2 = g_2.a(n13);
                        }
                        final double n15 = dcmpg(a, 10.0);
                    }
                    if (n14 < 0) {
                        g_2 = g_2.a(0.5);
                    }
                    return g_2;
                }
                final g_ g_3 = null;
                if (f != 0) {
                    int a4 = Task.a;
                    Task.a = ++a4;
                }
                return g_3;
            }
        });
    }
    
    public void b() {
        MouseNode mouseNode2 = null;
        Label_0017: {
            MouseNode mouseNode;
            try {
                mouseNode = (mouseNode2 = this.d);
                if (org.powerbot.game.bot.handler.input.a.f != 0) {
                    break Label_0017;
                }
                if (mouseNode != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouseNode == null) {
                    return;
                }
                mouseNode2 = this.d;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        mouseNode2.h();
    }
    
    public static String a(final String s) {
        final int n = 3;
        final int n2 = n << n ^ 0x2;
        final int n3 = (0x3 ^ 0x5) << 3 ^ 0x4;
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
    
    private final class g_
    {
        public double a;
        public double b;
        
        public void a(final g_ g_) {
            this.a += g_.a;
            this.b += g_.b;
        }
        
        public g_ a(final double n) {
            final g_ g_ = new g_();
            g_.a = this.a * n;
            g_.b = this.b * n;
            return g_;
        }
        
        public double a() {
            return Math.sqrt(this.a * this.a + this.b * this.b);
        }
        
        public double b() {
            return Math.atan2(this.b, this.a);
        }
    }
    
    private interface f_
    {
        g_ a(final double p0, final Point p1);
    }
}
