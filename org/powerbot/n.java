
package org.powerbot;

import java.awt.event.ActionEvent;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
import java.awt.event.ActionListener;

public final class n implements ActionListener
{
    private static final Logger a;
    public static volatile long b;
    public static final AtomicLong c;
    private static final long d;
    private static final String[] z;
    
    @Override
    public void actionPerformed(final ActionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
        //     8: invokevirtual   org/powerbot/k.b:()Z
        //    11: iload           6
        //    13: ifne            74
        //    16: ifeq            46
        //    19: goto            23
        //    22: athrow         
        //    23: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
        //    26: invokevirtual   org/powerbot/k.c:()I
        //    29: iload           6
        //    31: ifne            74
        //    34: goto            38
        //    37: athrow         
        //    38: iconst_1       
        //    39: if_icmpge       77
        //    42: goto            46
        //    45: athrow         
        //    46: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //    49: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //    52: iconst_3       
        //    53: aaload         
        //    54: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //    57: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //    60: bipush          6
        //    62: aaload         
        //    63: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //    66: invokevirtual   org/powerbot/hb.a:(Ljava/lang/String;Ljava/lang/String;)V
        //    69: iconst_1       
        //    70: goto            74
        //    73: athrow         
        //    74: invokestatic    java/lang/System.exit:(I)V
        //    77: getstatic       java/util/concurrent/TimeUnit.NANOSECONDS:Ljava/util/concurrent/TimeUnit;
        //    80: invokestatic    java/lang/System.nanoTime:()J
        //    83: getstatic       org/powerbot/n.d:J
        //    86: lsub           
        //    87: invokevirtual   java/util/concurrent/TimeUnit.toMinutes:(J)J
        //    90: lstore_2       
        //    91: lload_2        
        //    92: ldc2_w          10
        //    95: lrem           
        //    96: lconst_0       
        //    97: lcmp           
        //    98: iload           6
        //   100: ifne            135
        //   103: ifne            132
        //   106: goto            110
        //   109: athrow         
        //   110: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //   113: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   116: iconst_4       
        //   117: aaload         
        //   118: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   121: lload_2        
        //   122: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   125: invokevirtual   org/powerbot/hb.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   128: goto            132
        //   131: athrow         
        //   132: invokestatic    org/powerbot/core/Bot.instantiated:()Z
        //   135: iload           6
        //   137: ifne            297
        //   140: ifeq            294
        //   143: goto            147
        //   146: athrow         
        //   147: invokestatic    org/powerbot/core/Bot.instance:()Lorg/powerbot/core/Bot;
        //   150: invokevirtual   org/powerbot/core/Bot.getScriptHandler:()Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   153: iload           6
        //   155: ifne            179
        //   158: goto            162
        //   161: athrow         
        //   162: ifnull          294
        //   165: goto            169
        //   168: athrow         
        //   169: invokestatic    org/powerbot/core/Bot.instance:()Lorg/powerbot/core/Bot;
        //   172: invokevirtual   org/powerbot/core/Bot.getScriptHandler:()Lorg/powerbot/core/bot/handlers/ScriptHandler;
        //   175: goto            179
        //   178: athrow         
        //   179: astore          4
        //   181: aload           4
        //   183: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.getDefinition:()Lorg/powerbot/w;
        //   186: dup            
        //   187: astore          5
        //   189: iload           6
        //   191: ifne            203
        //   194: ifnull          294
        //   197: goto            201
        //   200: athrow         
        //   201: aload           5
        //   203: getfield        org/powerbot/w.j:Z
        //   206: iload           6
        //   208: ifne            297
        //   211: ifeq            294
        //   214: goto            218
        //   217: athrow         
        //   218: invokestatic    java/lang/System.nanoTime:()J
        //   221: getstatic       org/powerbot/n.c:Ljava/util/concurrent/atomic/AtomicLong;
        //   224: invokevirtual   java/util/concurrent/atomic/AtomicLong.get:()J
        //   227: lcmp           
        //   228: iload           6
        //   230: ifne            297
        //   233: goto            237
        //   236: athrow         
        //   237: ifle            294
        //   240: goto            244
        //   243: athrow         
        //   244: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //   247: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   250: iconst_2       
        //   251: aaload         
        //   252: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   255: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   258: iconst_1       
        //   259: aaload         
        //   260: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   263: aload           5
        //   265: invokevirtual   org/powerbot/w.a:()Ljava/lang/String;
        //   268: invokevirtual   org/powerbot/hb.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
        //   271: getstatic       org/powerbot/n.a:Ljava/util/logging/Logger;
        //   274: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   277: iconst_0       
        //   278: aaload         
        //   279: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   282: invokevirtual   java/util/logging/Logger.info:(Ljava/lang/String;)V
        //   285: aload           4
        //   287: invokevirtual   org/powerbot/core/bot/handlers/ScriptHandler.stop:()V
        //   290: goto            294
        //   293: athrow         
        //   294: sipush          4052
        //   297: iload           6
        //   299: ifne            359
        //   302: getstatic       org/powerbot/y.d:I
        //   305: if_icmplt       332
        //   308: goto            312
        //   311: athrow         
        //   312: getstatic       org/powerbot/y.d:I
        //   315: iload           6
        //   317: ifne            359
        //   320: goto            324
        //   323: athrow         
        //   324: iconst_m1      
        //   325: if_icmpne       362
        //   328: goto            332
        //   331: athrow         
        //   332: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //   335: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   338: iconst_3       
        //   339: aaload         
        //   340: invokestatic    org/powerbot/core/script/internal/wrappers/HashTable.e:(Ljava/lang/String;)Ljava/lang/String;
        //   343: getstatic       org/powerbot/n.z:[Ljava/lang/String;
        //   346: iconst_5       
        //   347: aaload         
        //   348: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   351: invokevirtual   org/powerbot/hb.a:(Ljava/lang/String;Ljava/lang/String;)V
        //   354: iconst_1       
        //   355: goto            359
        //   358: athrow         
        //   359: invokestatic    java/lang/System.exit:(I)V
        //   362: iload           6
        //   364: ifeq            380
        //   367: getstatic       org/powerbot/core/script/job/Task.a:I
        //   370: istore          7
        //   372: iinc            7, 1
        //   375: iload           7
        //   377: putstatic       org/powerbot/core/script/job/Task.a:I
        //   380: return         
        //    StackMapTable: 00 2C FF 00 16 00 07 07 00 1C 07 00 BE 00 00 00 00 01 00 01 07 00 AB 00 4D 07 00 AB 40 01 46 07 00 AB 00 5A 07 00 AB 40 01 02 FF 00 1F 00 06 07 00 1C 07 00 BE 04 00 00 01 00 01 07 00 AB 00 54 07 00 AB 00 42 01 4A 07 00 AB 00 4D 07 00 AB 40 07 00 47 45 07 00 AB 00 48 07 00 AB 40 07 00 47 FF 00 14 00 06 07 00 1C 07 00 BE 04 07 00 47 07 00 49 01 00 01 07 00 AB 00 41 07 00 49 4D 07 00 AB 00 51 07 00 AB 40 01 45 07 00 AB 00 70 07 00 AB FF 00 00 00 06 07 00 1C 07 00 BE 04 00 00 01 00 00 42 01 4D 07 00 AB 00 4A 07 00 AB 40 01 46 07 00 AB 00 59 07 00 AB 40 01 02 11
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  324    355    358    359    Ljava/lang/RuntimeException;
        //  312    328    331    332    Ljava/lang/RuntimeException;
        //  302    320    323    324    Ljava/lang/RuntimeException;
        //  297    308    311    312    Ljava/lang/RuntimeException;
        //  237    290    293    294    Ljava/lang/RuntimeException;
        //  218    240    243    244    Ljava/lang/RuntimeException;
        //  211    233    236    237    Ljava/lang/RuntimeException;
        //  203    214    217    218    Ljava/lang/RuntimeException;
        //  189    197    200    201    Ljava/lang/RuntimeException;
        //  162    175    178    179    Ljava/lang/RuntimeException;
        //  147    165    168    169    Ljava/lang/RuntimeException;
        //  140    158    161    162    Ljava/lang/RuntimeException;
        //  135    143    146    147    Ljava/lang/RuntimeException;
        //  103    128    131    132    Ljava/lang/RuntimeException;
        //  91     106    109    110    Ljava/lang/RuntimeException;
        //  38     70     73     74     Ljava/lang/RuntimeException;
        //  23     42     45     46     Ljava/lang/RuntimeException;
        //  16     34     37     38     Ljava/lang/RuntimeException;
        //  5      19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
        final String[] z2 = new String[7];
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 0)))));
        String s = "SB~5R@!\u0001Y(oY=&[\u0013&\u0010B\"kDr:\u001eMr\u0011H3v]itM\u0014=\u0012[${";
        int n8 = -1;
        String intern = null;
    Label_0091_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n10;
            final int n9 = n10 = (length = charArray.length);
            int n11 = 0;
            while (true) {
                Label_0166: {
                    if (n9 > 1) {
                        break Label_0166;
                    }
                    length = (n10 = n11);
                    do {
                        final char c2 = charArray[n10];
                        char c3 = '\0';
                        switch (n11 % 5) {
                            case 0: {
                                c3 = '\b';
                                break;
                            }
                            case 1: {
                                c3 = 'E';
                                break;
                            }
                            case 2: {
                                c3 = '\n';
                                break;
                            }
                            case 3: {
                                c3 = '<';
                                break;
                            }
                            default: {
                                c3 = ')';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n11;
                    } while (n9 == 0);
                }
                if (n9 > n11) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n8) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 1))))));
                    s = "@\u001c[izM\r";
                    n8 = 0;
                    continue Label_0091_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 2))))));
                    s = "\u00131\u0010B1k";
                    n8 = 1;
                    continue Label_0091_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 3))))));
                    s = "]\u0001St";
                    n8 = 2;
                    continue Label_0091_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 4))))));
                    s = "M\tNitQ";
                    n8 = 3;
                    continue Label_0091_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 5))))));
                    s = "iHo'W\u000f<";
                    n8 = 4;
                    continue Label_0091_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 6))))));
                    s = "vCn _\u000e1\u0007\u0006.iHo8Q\u00016";
                    n8 = 5;
                    continue Label_0091_Outer;
                }
                case 5: {
                    break Label_0091_Outer;
                }
            }
        }
        z2[n7] = intern;
        z = z2;
        a = Logger.getLogger(n.class.getName());
        org.powerbot.n.b = 0L;
        c = new AtomicLong(0L);
        d = System.nanoTime();
    }
}
