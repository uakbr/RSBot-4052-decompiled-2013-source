
package org.powerbot;

import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.URLConnection;
import java.net.URL;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.node.Queue;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class p
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final Pattern d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public final Map<String, String> j;
    private static final String[] z;
    
    public p() {
        int d = o.d;
        this.j = new HashMap<String, String>();
        this.e = Queue.e(p.z[0]);
        this.f = this.e + org.p.a(p.z[1]);
        this.g = null;
        this.h = null;
        this.i = null;
        if (Task.a != 0) {
            o.d = ++d;
        }
    }
    
    public boolean a() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: aload_0        
        //     7: getfield        org/powerbot/p.f:Ljava/lang/String;
        //    10: aload_0        
        //    11: getfield        org/powerbot/p.e:Ljava/lang/String;
        //    14: invokespecial   org/powerbot/p.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ifnull          55
        //    22: getstatic       org/powerbot/p.a:Ljava/util/regex/Pattern;
        //    25: aload_1        
        //    26: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //    29: astore_2       
        //    30: aload_2        
        //    31: invokevirtual   java/util/regex/Matcher.find:()Z
        //    34: ifeq            50
        //    37: aload_0        
        //    38: aload_2        
        //    39: iconst_1       
        //    40: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //    43: putfield        org/powerbot/p.g:Ljava/lang/String;
        //    46: goto            50
        //    49: athrow         
        //    50: iload           7
        //    52: ifeq            58
        //    55: iconst_0       
        //    56: ireturn        
        //    57: athrow         
        //    58: aload_0        
        //    59: getfield        org/powerbot/p.g:Ljava/lang/String;
        //    62: iload           7
        //    64: ifne            90
        //    67: ifnull          437
        //    70: goto            74
        //    73: athrow         
        //    74: aload_0        
        //    75: aload_0        
        //    76: getfield        org/powerbot/p.g:Ljava/lang/String;
        //    79: aload_0        
        //    80: getfield        org/powerbot/p.f:Ljava/lang/String;
        //    83: invokespecial   org/powerbot/p.a:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    86: goto            90
        //    89: athrow         
        //    90: astore_2       
        //    91: aload_2        
        //    92: ifnull          437
        //    95: getstatic       org/powerbot/p.b:Ljava/util/regex/Pattern;
        //    98: aload_2        
        //    99: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   102: astore_3       
        //   103: aload_3        
        //   104: iload           7
        //   106: ifne            212
        //   109: invokevirtual   java/util/regex/Matcher.find:()Z
        //   112: ifeq            205
        //   115: goto            119
        //   118: athrow         
        //   119: aload_3        
        //   120: iconst_1       
        //   121: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   124: astore          4
        //   126: new             Ljava/net/URL;
        //   129: dup            
        //   130: aload_0        
        //   131: getfield        org/powerbot/p.g:Ljava/lang/String;
        //   134: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //   137: astore          5
        //   139: goto            151
        //   142: astore          6
        //   144: aload           6
        //   146: invokevirtual   java/net/MalformedURLException.printStackTrace:()V
        //   149: iconst_0       
        //   150: ireturn        
        //   151: aload_0        
        //   152: new             Ljava/lang/StringBuilder;
        //   155: dup            
        //   156: invokespecial   java/lang/StringBuilder.<init>:()V
        //   159: aload           5
        //   161: invokevirtual   java/net/URL.getProtocol:()Ljava/lang/String;
        //   164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   167: getstatic       org/powerbot/p.z:[Ljava/lang/String;
        //   170: iconst_4       
        //   171: aaload         
        //   172: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //   175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   178: aload           5
        //   180: invokevirtual   java/net/URL.getHost:()Ljava/lang/String;
        //   183: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   186: ldc             "1"
        //   188: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   191: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   194: aload           4
        //   196: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   199: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   202: putfield        org/powerbot/p.h:Ljava/lang/String;
        //   205: getstatic       org/powerbot/p.c:Ljava/util/regex/Pattern;
        //   208: aload_2        
        //   209: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   212: astore          4
        //   214: aload           4
        //   216: iload           7
        //   218: ifne            276
        //   221: invokevirtual   java/util/regex/Matcher.find:()Z
        //   224: ifeq            269
        //   227: goto            231
        //   230: athrow         
        //   231: aload_0        
        //   232: aload           4
        //   234: iconst_1       
        //   235: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   238: putfield        org/powerbot/p.i:Ljava/lang/String;
        //   241: aload_0        
        //   242: aload_0        
        //   243: getfield        org/powerbot/p.i:Ljava/lang/String;
        //   246: iconst_0       
        //   247: aload_0        
        //   248: getfield        org/powerbot/p.i:Ljava/lang/String;
        //   251: ldc             "\u001f"
        //   253: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //   256: invokevirtual   java/lang/String.indexOf:(Ljava/lang/String;)I
        //   259: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   262: putfield        org/powerbot/p.i:Ljava/lang/String;
        //   265: goto            269
        //   268: athrow         
        //   269: getstatic       org/powerbot/p.d:Ljava/util/regex/Pattern;
        //   272: aload_2        
        //   273: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   276: astore          5
        //   278: aload           5
        //   280: invokevirtual   java/util/regex/Matcher.find:()Z
        //   283: ifeq            322
        //   286: aload_0        
        //   287: getfield        org/powerbot/p.j:Ljava/util/Map;
        //   290: aload           5
        //   292: iconst_1       
        //   293: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   296: aload           5
        //   298: iconst_2       
        //   299: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   302: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   307: pop            
        //   308: iload           7
        //   310: ifne            382
        //   313: iload           7
        //   315: ifeq            278
        //   318: goto            322
        //   321: athrow         
        //   322: aload_0        
        //   323: getfield        org/powerbot/p.j:Ljava/util/Map;
        //   326: getstatic       org/powerbot/p.z:[Ljava/lang/String;
        //   329: bipush          6
        //   331: aaload         
        //   332: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   335: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   340: iload           7
        //   342: ifne            391
        //   345: ifeq            382
        //   348: goto            352
        //   351: athrow         
        //   352: aload_0        
        //   353: getfield        org/powerbot/p.j:Ljava/util/Map;
        //   356: getstatic       org/powerbot/p.z:[Ljava/lang/String;
        //   359: iconst_5       
        //   360: aaload         
        //   361: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //   364: getstatic       org/powerbot/p.z:[Ljava/lang/String;
        //   367: iconst_3       
        //   368: aaload         
        //   369: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
        //   372: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   377: pop            
        //   378: goto            382
        //   381: athrow         
        //   382: aload_0        
        //   383: getfield        org/powerbot/p.j:Ljava/util/Map;
        //   386: invokeinterface java/util/Map.size:()I
        //   391: iload           7
        //   393: ifne            438
        //   396: ifle            437
        //   399: goto            403
        //   402: athrow         
        //   403: aload_0        
        //   404: getfield        org/powerbot/p.i:Ljava/lang/String;
        //   407: iload           7
        //   409: ifne            431
        //   412: goto            416
        //   415: athrow         
        //   416: ifnull          437
        //   419: goto            423
        //   422: athrow         
        //   423: aload_0        
        //   424: getfield        org/powerbot/p.h:Ljava/lang/String;
        //   427: goto            431
        //   430: athrow         
        //   431: ifnull          437
        //   434: iconst_1       
        //   435: ireturn        
        //   436: athrow         
        //   437: iconst_0       
        //   438: ireturn        
        //    StackMapTable: 00 27 FF 00 31 00 08 07 00 27 07 00 59 07 00 4E 00 00 00 00 01 00 01 07 00 16 00 FF 00 04 00 08 07 00 27 07 00 59 00 00 00 00 00 01 00 00 41 07 00 16 FF 00 00 00 08 07 00 27 07 00 59 07 00 4E 00 00 00 00 01 00 00 4E 07 00 16 00 4E 07 00 16 40 07 00 59 FF 00 1B 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 00 00 00 01 00 01 07 00 16 00 FF 00 16 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 07 00 59 00 00 01 00 01 07 00 16 FF 00 08 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 07 00 59 07 00 14 00 01 00 00 FF 00 35 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 00 00 00 01 00 00 46 07 00 4E FF 00 11 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 07 00 4E 00 00 01 00 01 07 00 16 00 64 07 00 16 00 46 07 00 4E FF 00 01 00 08 07 00 27 07 00 59 07 00 59 07 00 4E 07 00 4E 07 00 4E 00 01 00 00 6A 07 00 16 00 5C 07 00 16 00 5C 07 00 16 00 48 01 4A 07 00 16 00 4B 07 00 16 40 07 00 59 45 07 00 16 00 46 07 00 16 40 07 00 59 44 07 00 16 FF 00 00 00 08 07 00 27 07 00 59 07 00 28 00 00 00 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  103    115    118    119    Ljava/net/MalformedURLException;
        //  67     86     89     90     Ljava/net/MalformedURLException;
        //  58     70     73     74     Ljava/net/MalformedURLException;
        //  50     57     57     58     Ljava/net/MalformedURLException;
        //  30     46     49     50     Ljava/net/MalformedURLException;
        //  126    139    142    151    Ljava/net/MalformedURLException;
        //  431    436    436    437    Ljava/net/MalformedURLException;
        //  416    427    430    431    Ljava/net/MalformedURLException;
        //  403    419    422    423    Ljava/net/MalformedURLException;
        //  396    412    415    416    Ljava/net/MalformedURLException;
        //  391    399    402    403    Ljava/net/MalformedURLException;
        //  345    378    381    382    Ljava/net/MalformedURLException;
        //  322    348    351    352    Ljava/net/MalformedURLException;
        //  286    318    321    322    Ljava/net/MalformedURLException;
        //  221    265    268    269    Ljava/net/MalformedURLException;
        //  214    227    230    231    Ljava/net/MalformedURLException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0403:
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
    
    private String a(final String spec, final String value) {
        try {
            final HttpURLConnection c = ab.c(new URL(spec));
            c.addRequestProperty(Queue.e(p.z[2]), value);
            return cb.b(ab.a(c));
        }
        catch (IOException ex) {
            return null;
        }
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
        String s = "wx~OdZI\u0012 Zz\u007fi^.\u0010H\u0003:Y0k7M+\u001b\u0003\u00136Uoi%";
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
                                c3 = '.';
                                break;
                            }
                            case 1: {
                                c3 = 'W';
                                break;
                            }
                            case 2: {
                                c3 = ';';
                                break;
                            }
                            case 3: {
                                c3 = 'd';
                                break;
                            }
                            default: {
                                c3 = 'o';
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
                    s = "WTHc_;:f\u00100\u0001";
                    n8 = 0;
                    continue Label_0091_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 2))))));
                    s = "MilZ,\u0010\u0014";
                    n8 = 1;
                    continue Label_0091_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 3))))));
                    s = "VTIu\u0014";
                    n8 = 2;
                    continue Label_0091_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 4))))));
                    s = "%#%";
                    n8 = 3;
                    continue Label_0091_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 5))))));
                    s = "wm|Z7\u0010P";
                    n8 = 4;
                    continue Label_0091_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = 6))))));
                    s = "XTSc\u0018)\u007f";
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
        String s2 = "?;:G/\u0018\u001b\u000f/Sl/+\u001b`UWJt\u0015);";
        int n12 = -1;
        String intern2 = null;
    Label_0242_Outer:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            int length2;
            int n14;
            final int n13 = n14 = (length2 = charArray2.length);
            int n15 = 0;
            while (true) {
                Label_0318: {
                    if (n13 > 1) {
                        break Label_0318;
                    }
                    length2 = (n14 = n15);
                    do {
                        final char c4 = charArray2[n14];
                        char c5 = '\0';
                        switch (n15 % 5) {
                            case 0: {
                                c5 = '.';
                                break;
                            }
                            case 1: {
                                c5 = 'W';
                                break;
                            }
                            case 2: {
                                c5 = ';';
                                break;
                            }
                            case 3: {
                                c5 = 'd';
                                break;
                            }
                            default: {
                                c5 = 'o';
                                break;
                            }
                        }
                        charArray2[length2] = (char)(c4 ^ c5);
                        ++n15;
                    } while (n13 == 0);
                }
                if (n13 > n15) {
                    continue;
                }
                break;
            }
            intern2 = new String(charArray2).intern();
            switch (n12) {
                default: {
                    a = Pattern.compile(org.p.a(intern2));
                    s2 = "~~iW7\u0003\u0003]}\u001a5%*";
                    n12 = 0;
                    continue Label_0242_Outer;
                }
                case 0: {
                    b = Pattern.compile(Queue.e(intern2));
                    s2 = "/&=\u001f0\u0018\u001b\u000f/Q";
                    n12 = 1;
                    continue Label_0242_Outer;
                }
                case 1: {
                    c = Pattern.compile(org.p.a(intern2));
                    s2 = "#|kM?\u0018F\u000e4Yz1(\u0017\u0005+:\u0013\b\u001f6.VLu\u0003\u0007\f Q\".\"d\u0000K;J|\u0016!";
                    n12 = 2;
                    continue Label_0242_Outer;
                }
                case 2: {
                    break Label_0242_Outer;
                }
            }
        }
        d = Pattern.compile(Queue.e(intern2));
    }
}
