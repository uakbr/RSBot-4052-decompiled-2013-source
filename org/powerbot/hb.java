
package org.powerbot;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.powerbot.core.script.job.Task;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import org.powerbot.core.script.internal.wrappers.Deque;
import java.awt.Toolkit;
import org.s;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.Random;
import java.util.concurrent.Executor;

public final class hb
{
    private static hb a;
    private final Executor b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Random i;
    private final int j;
    private final int k;
    private static final String[] z;
    
    private hb() {
        this.b = Executors.newSingleThreadExecutor();
        final Locale default1 = Locale.getDefault();
        StringBuilder append = null;
        String str = null;
        Label_0085: {
            Label_0083: {
                Label_0050: {
                    String s;
                    try {
                        append = new StringBuilder().append(default1.getLanguage());
                        s = (str = default1.getCountry());
                        if (gb.a != 0) {
                            break Label_0050;
                        }
                        final int n = s.length();
                        if (n != 0) {
                            break Label_0050;
                        }
                        break Label_0083;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int n = s.length();
                        if (n == 0) {
                            break Label_0083;
                        }
                        str = org.s.a("\"") + default1.getCountry();
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                break Label_0085;
            }
            str = "";
        }
        this.f = append.append(str).toString().toLowerCase();
        final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.g = (int)screenSize.getWidth() + Deque.e("T") + (int)screenSize.getHeight();
        this.h = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration().getColorModel().getPixelSize() + s.a(hb.z[13]);
        this.i = new Random();
        this.k = (int)(y.b() & 0x7FFFFFFFL);
        this.j = this.k;
    }
    
    public static synchronized hb a() {
        Label_0016: {
            hb hb;
            try {
                final hb hb2;
                hb = (hb2 = org.powerbot.hb.a);
                if (gb.a != 0) {
                    return hb2;
                }
                if (hb == null) {
                    break Label_0016;
                }
                return org.powerbot.hb.a;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (hb == null) {
                    org.powerbot.hb.a = new hb();
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return hb.a;
    }
    
    public void a(final String s, final String s2) {
        this.a(s, s2, null);
    }
    
    public void a(final String s, final String s2, final String s3) {
        final int a = gb.a;
        final StringBuilder b = this.b();
        StringBuilder append = null;
        String string = null;
        Label_0114: {
            Label_0112: {
                Label_0078: {
                    try {
                        b.append(Deque.e(hb.z[10]));
                        append = b.append(s.a(hb.z[12])).append(this.b(s)).append(Deque.e("\u0006")).append(this.b(s2));
                        string = s3;
                        if (a != 0) {
                            break Label_0078;
                        }
                        if (s3 != null) {
                            break Label_0078;
                        }
                        break Label_0112;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (s3 == null) {
                            break Label_0112;
                        }
                        string = s.a("%") + this.b(s3);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                break Label_0114;
            }
            string = "";
        }
        append.append(string).append(Deque.e(hb.z[11]));
        this.a(b.toString());
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    public void b(final String s, final String s2) {
        int a = gb.a;
        final StringBuilder b = this.b();
        try {
            b.append(s.a(hb.z[7])).append(this.b(s2));
            b.append(Deque.e(hb.z[5])).append(this.b(s.a(hb.z[4]))).append(this.b(s));
            b.append(Deque.e(hb.z[6]));
            this.a(b.toString());
            if (Task.a != 0) {
                gb.a = ++a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    private void a(final String s) {
        this.b.execute(new Runnable() {
            @Override
            public void run() {
                c(s);
            }
        });
    }
    
    private StringBuilder b() {
        final StringBuilder sb = new StringBuilder();
        final StringBuilder sb2 = new StringBuilder();
        final long currentTimeMillis = System.currentTimeMillis();
        sb2.append(s.a(hb.z[16])).append(this.j).append(Deque.e("\u0002")).append(this.k).append(s.a("!")).append(currentTimeMillis).append(Deque.e("\u0002")).append(currentTimeMillis).append(s.a("!")).append(currentTimeMillis).append(Deque.e(hb.z[27]));
        sb2.append(s.a(hb.z[25])).append(this.j).append(Deque.e("\u0002")).append(currentTimeMillis).append(s.a(hb.z[18]));
        sb.append(Deque.e(hb.z[28]));
        sb.append(s.a(hb.z[33]));
        sb.append(Deque.e(hb.z[20])).append(this.i.nextInt());
        sb.append(s.a(hb.z[21])).append(Deque.e(hb.z[19]));
        sb.append(s.a(hb.z[17]));
        sb.append(Deque.e(hb.z[24])).append(this.g);
        sb.append(s.a(hb.z[22])).append(this.h);
        sb.append(Deque.e(hb.z[23])).append(this.f);
        sb.append(s.a(hb.z[32]));
        sb.append(Deque.e(hb.z[29]));
        sb.append(s.a(hb.z[15])).append(this.i.nextInt() & Integer.MAX_VALUE);
        sb.append(Deque.e(hb.z[26]));
        sb.append(s.a(hb.z[14])).append(Deque.e(hb.z[31]));
        sb.append(s.a(hb.z[30])).append(this.b(sb2.toString()));
        return sb;
    }
    
    private String b(final String s) {
        try {
            return URLEncoder.encode(s, Deque.e(hb.z[9])).replace(s.a("$"), Deque.e(hb.z[8]));
        }
        catch (UnsupportedEncodingException ex) {
            return "";
        }
    }
    
    private static void c(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: new             Lorg/powerbot/z;
        //     8: dup            
        //     9: getstatic       org/powerbot/hb.z:[Ljava/lang/String;
        //    12: iconst_2       
        //    13: aaload         
        //    14: invokestatic    org/s.a:(Ljava/lang/String;)Ljava/lang/String;
        //    17: iconst_1       
        //    18: anewarray       Ljava/lang/Class;
        //    21: dup            
        //    22: iconst_0       
        //    23: ldc             Lorg/powerbot/hb;.class
        //    25: aastore        
        //    26: invokespecial   org/powerbot/z.<init>:(Ljava/lang/String;[Ljava/lang/Class;)V
        //    29: astore_1       
        //    30: aconst_null    
        //    31: astore_2       
        //    32: new             Ljava/lang/StringBuilder;
        //    35: dup            
        //    36: invokespecial   java/lang/StringBuilder.<init>:()V
        //    39: astore_3       
        //    40: aload_1        
        //    41: invokevirtual   org/powerbot/z.c:()Ljava/io/InputStream;
        //    44: invokestatic    org/powerbot/cb.b:(Ljava/io/InputStream;)Ljava/lang/String;
        //    47: astore_2       
        //    48: goto            53
        //    51: astore          4
        //    53: new             Ljava/net/URL;
        //    56: dup            
        //    57: aload_0        
        //    58: invokespecial   java/net/URL.<init>:(Ljava/lang/String;)V
        //    61: invokestatic    org/powerbot/ab.c:(Ljava/net/URL;)Ljava/net/HttpURLConnection;
        //    64: astore          4
        //    66: iload           7
        //    68: ifne            131
        //    71: aload_2        
        //    72: ifnull          120
        //    75: goto            79
        //    78: athrow         
        //    79: aload_2        
        //    80: invokevirtual   java/lang/String.isEmpty:()Z
        //    83: iload           7
        //    85: ifne            130
        //    88: goto            92
        //    91: athrow         
        //    92: ifne            120
        //    95: goto            99
        //    98: athrow         
        //    99: aload           4
        //   101: getstatic       org/powerbot/hb.z:[Ljava/lang/String;
        //   104: iconst_1       
        //   105: aaload         
        //   106: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   109: aload_2        
        //   110: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   113: invokevirtual   java/net/HttpURLConnection.setRequestProperty:(Ljava/lang/String;Ljava/lang/String;)V
        //   116: goto            120
        //   119: athrow         
        //   120: aload           4
        //   122: invokevirtual   java/net/HttpURLConnection.connect:()V
        //   125: aload           4
        //   127: invokevirtual   java/net/HttpURLConnection.getResponseCode:()I
        //   130: pop            
        //   131: aload           4
        //   133: invokevirtual   java/net/HttpURLConnection.getHeaderFields:()Ljava/util/Map;
        //   136: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   141: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   146: astore          5
        //   148: aload           5
        //   150: invokeinterface java/util/Iterator.hasNext:()Z
        //   155: ifeq            266
        //   158: aload           5
        //   160: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   165: checkcast       Ljava/util/Map$Entry;
        //   168: astore          6
        //   170: aload           6
        //   172: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   177: checkcast       Ljava/lang/String;
        //   180: getstatic       org/powerbot/hb.z:[Ljava/lang/String;
        //   183: iconst_0       
        //   184: aaload         
        //   185: invokestatic    org/s.a:(Ljava/lang/String;)Ljava/lang/String;
        //   188: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   191: iload           7
        //   193: ifne            280
        //   196: iload           7
        //   198: ifne            229
        //   201: goto            205
        //   204: athrow         
        //   205: ifeq            261
        //   208: goto            212
        //   211: athrow         
        //   212: aload_3        
        //   213: iload           7
        //   215: ifne            260
        //   218: goto            222
        //   221: athrow         
        //   222: invokevirtual   java/lang/StringBuilder.length:()I
        //   225: goto            229
        //   228: athrow         
        //   229: ifeq            249
        //   232: aload_3        
        //   233: getstatic       org/powerbot/hb.z:[Ljava/lang/String;
        //   236: iconst_3       
        //   237: aaload         
        //   238: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   241: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   244: pop            
        //   245: goto            249
        //   248: athrow         
        //   249: aload_3        
        //   250: aload           6
        //   252: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   257: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   260: pop            
        //   261: iload           7
        //   263: ifeq            148
        //   266: aload           4
        //   268: invokevirtual   java/net/HttpURLConnection.disconnect:()V
        //   271: goto            276
        //   274: astore          4
        //   276: aload_3        
        //   277: invokevirtual   java/lang/StringBuilder.length:()I
        //   280: ifne            296
        //   283: aload_1        
        //   284: invokevirtual   org/powerbot/z.b:()V
        //   287: iload           7
        //   289: ifeq            329
        //   292: goto            296
        //   295: athrow         
        //   296: new             Ljava/io/ByteArrayInputStream;
        //   299: dup            
        //   300: aload_3        
        //   301: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   304: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   307: invokestatic    org/powerbot/gb.d:(Ljava/lang/String;)[B
        //   310: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   313: astore          4
        //   315: aload           4
        //   317: aload_1        
        //   318: invokevirtual   org/powerbot/z.d:()Ljava/io/OutputStream;
        //   321: invokestatic    org/powerbot/cb.a:(Ljava/io/InputStream;Ljava/io/OutputStream;)V
        //   324: goto            329
        //   327: astore          5
        //   329: return         
        //    StackMapTable: 00 21 FF 00 33 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 00 00 00 01 00 01 07 00 3A 01 FF 00 18 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 BA 00 00 01 00 01 07 00 3A 00 4B 07 00 3A 40 01 45 07 00 3A 00 53 07 00 3A 00 49 01 00 FF 00 10 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 BA 07 00 C3 00 01 00 00 FF 00 37 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 BA 07 00 C3 07 00 48 01 00 01 07 00 3A 40 01 45 07 00 3A 00 48 07 00 3A 40 07 00 06 45 07 00 3A 40 01 52 07 00 3A 00 4A 07 00 06 00 FF 00 04 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 BA 07 00 C3 00 01 00 00 FF 00 07 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 00 00 00 01 00 01 07 00 3A FF 00 01 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 56 00 00 01 00 00 43 01 4E 07 00 3A 00 FF 00 1E 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 51 00 00 01 00 01 07 00 3A FF 00 01 00 08 07 00 4A 07 00 35 07 00 4A 07 00 06 07 00 56 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  40     48     51     53     Ljava/io/IOException;
        //  229    245    248    249    Ljava/io/IOException;
        //  212    225    228    229    Ljava/io/IOException;
        //  205    218    221    222    Ljava/io/IOException;
        //  196    208    211    212    Ljava/io/IOException;
        //  170    201    204    205    Ljava/io/IOException;
        //  92     116    119    120    Ljava/io/IOException;
        //  79     95     98     99     Ljava/io/IOException;
        //  71     88     91     92     Ljava/io/IOException;
        //  66     75     78     79     Ljava/io/IOException;
        //  53     271    274    276    Ljava/io/IOException;
        //  280    292    295    296    Ljava/io/IOException;
        //  315    324    327    329    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
        final String[] z2 = new String[34];
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 0))))))))))))))))))))))))))))))));
        String s = "\b>6\u007f]YYDV\u0016";
        int n35 = -1;
        String intern = null;
    Label_0422_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n37;
            final int n36 = n37 = (length = charArray.length);
            int n38 = 0;
            while (true) {
                Label_0498: {
                    if (n36 > 1) {
                        break Label_0498;
                    }
                    length = (n37 = n38);
                    do {
                        final char c2 = charArray[n37];
                        char c3 = '\0';
                        switch (n38 % 5) {
                            case 0: {
                                c3 = '9';
                                break;
                            }
                            case 1: {
                                c3 = 'T';
                                break;
                            }
                            case 2: {
                                c3 = ' ';
                                break;
                            }
                            case 3: {
                                c3 = ']';
                                break;
                            }
                            default: {
                                c3 = '|';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n38;
                    } while (n36 == 0);
                }
                if (n36 > n38) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n35) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 1)))))))))))))))))))))))))))))))));
                    s = "}\u0017H\u001a\u0012p";
                    n35 = 0;
                    continue Label_0422_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 2)))))))))))))))))))))))))))))))));
                    s = "BDN\\\u0018>)o1qY]FZ\u0000u/:&";
                    n35 = 1;
                    continue Label_0422_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 3)))))))))))))))))))))))))))))))));
                    s = "\u0005X";
                    n35 = 2;
                    continue Label_0422_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 4)))))))))))))))))))))))))))))))));
                    s = "\u0019D\\]\u001c/t";
                    n35 = 3;
                    continue Label_0422_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 5)))))))))))))))))))))))))))))))));
                    s = "\u0018\rS\u001c\u000b(";
                    n35 = 4;
                    continue Label_0422_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 6)))))))))))))))))))))))))))))))));
                    s = "\u0018\rS\u001c\u000e(\"r";
                    n35 = 5;
                    continue Label_0422_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 7)))))))))))))))))))))))))))))))));
                    s = "\u0010C[R\u0017/f";
                    n35 = 6;
                    continue Label_0422_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 8)))))))))))))))))))))))))))))))));
                    s = "0a<";
                    n35 = 7;
                    continue Label_0422_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 9)))))))))))))))))))))))))))))))));
                    s = "@\u0007Jwh";
                    n35 = 8;
                    continue Label_0422_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 10)))))))))))))))))))))))))))))))));
                    s = "3&x7$\u0003\u001dQ\u0014\u0015a";
                    n35 = 9;
                    continue Label_0422_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 11)))))))))))))))))))))))))))))))));
                    s = "<uy.=KE\u00110:T\u0012M\u001b\u0011w\u0006";
                    n35 = 10;
                    continue Label_0422_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 12)))))))))))))))))))))))))))))))));
                    s = "}.6?{\u000b\u0003\u0007";
                    n35 = 11;
                    continue Label_0422_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 13)))))))))))))))))))))))))))))))));
                    s = "v9+&";
                    n35 = 12;
                    continue Label_0422_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 14)))))))))))))))))))))))))))))))));
                    s = "\u0010C[R\u00128f";
                    n35 = 13;
                    continue Label_0422_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 15)))))))))))))))))))))))))))))))));
                    s = "}.6?v_R\u0012";
                    n35 = 14;
                    continue Label_0422_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 16)))))))))))))))))))))))))))))))));
                    s = "iiZK\u001e:f";
                    n35 = 15;
                    continue Label_0422_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 17)))))))))))))))))))))))))))))))));
                    s = "}.6?}E\u000bzk5vc";
                    n35 = 16;
                    continue Label_0422_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 18)))))))))))))))))))))))))))))))));
                    s = "\u0018\u0007\u0001\u000e].//1mD\u000b\u0007[\u001a)>!&7JC[R\u001085\u007fzz_DJ\\\u0007r'7&sU[K\u0002[54,77\r";
                    n35 = 17;
                    continue Label_0422_Outer;
                }
                case 17: {
                    z2[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 19)))))))))))))))))))))))))))))))));
                    s = "f6~,9]\u001dT_\u000bz$i(2Q\f\t\u001e\tr";
                    n35 = 18;
                    continue Label_0422_Outer;
                }
                case 18: {
                    z2[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 20)))))))))))))))))))))))))))))))));
                    s = "\u0018\rS\u001c\u0015(";
                    n35 = 19;
                    continue Label_0422_Outer;
                }
                case 19: {
                    z2[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 21)))))))))))))))))))))))))))))))));
                    s = "\u0010C[R\u001b5f";
                    n35 = 20;
                    continue Label_0422_Outer;
                }
                case 20: {
                    z2[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 22)))))))))))))))))))))))))))))))));
                    s = "\u0010C[R\u00008f";
                    n35 = 21;
                    continue Label_0422_Outer;
                }
                case 21: {
                    z2[n23] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 23)))))))))))))))))))))))))))))))));
                    s = "3&x7%RE";
                    n35 = 22;
                    continue Label_0422_Outer;
                }
                case 22: {
                    z2[n24] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 24)))))))))))))))))))))))))))))))));
                    s = "3&x7#LE";
                    n35 = 23;
                    continue Label_0422_Outer;
                }
                case 23: {
                    z2[n25] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 25)))))))))))))))))))))))))))))))));
                    s = "iiZK\u001e!f";
                    n35 = 24;
                    continue Label_0422_Outer;
                }
                case 24: {
                    z2[n26] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 26)))))))))))))))))))))))))))))))));
                    s = "3&x7\"\u0003U";
                    n35 = 25;
                    continue Label_0422_Outer;
                }
                case 25: {
                    z2[n27] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 27)))))))))))))))))))))))))))))))));
                    s = "\u0010I\u001cQ";
                    n35 = 26;
                    continue Label_0422_Outer;
                }
                case 26: {
                    z2[n28] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 28)))))))))))))))))))))))))))))))));
                    s = "}'x*j\u0011WP\u0006\f;4c57R\u001d\n\u0010\u0015t?u.9]\u000b\t\u0012\u0014x|S\u0005%J\u0015\t\u0016\u0012s";
                    n35 = 27;
                    continue Label_0422_Outer;
                }
                case 27: {
                    z2[n29] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 29)))))))))))))))))))))))))))))))));
                    s = "\u0018\rS\u001c\u001dyn=j~\r]\u0015A\t$k=";
                    n35 = 28;
                    continue Label_0422_Outer;
                }
                case 28: {
                    z2[n30] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 30)))))))))))))))))))))))))))))))));
                    s = "\u0010C[R\u00108f";
                    n35 = 29;
                    continue Label_0422_Outer;
                }
                case 29: {
                    z2[n31] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 31)))))))))))))))))))))))))))))))));
                    s = "@\u0012!oa\tH\u0014FN8b4";
                    n35 = 30;
                    continue Label_0422_Outer;
                }
                case 30: {
                    z2[n32] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 32)))))))))))))))))))))))))))))))));
                    s = "}.6?tS\u000b\u001e";
                    n35 = 31;
                    continue Label_0422_Outer;
                }
                case 31: {
                    z2[n33] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = 33)))))))))))))))))))))))))))))))));
                    s = "d.6?i@\u000b\u001b\u0011Juo";
                    n35 = 32;
                    continue Label_0422_Outer;
                }
                case 32: {
                    break Label_0422_Outer;
                }
            }
        }
        z2[n34] = intern;
        z = z2;
        String s2 = "cw\u0002\nBlkqe+\u001b\u0007\u0017";
        int n39 = -1;
        String intern2 = null;
    Label_0682_Outer:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            int length2;
            int n41;
            final int n40 = n41 = (length2 = charArray2.length);
            int n42 = 0;
            while (true) {
                Label_0758: {
                    if (n40 > 1) {
                        break Label_0758;
                    }
                    length2 = (n41 = n42);
                    do {
                        final char c4 = charArray2[n41];
                        char c5 = '\0';
                        switch (n42 % 5) {
                            case 0: {
                                c5 = '9';
                                break;
                            }
                            case 1: {
                                c5 = 'T';
                                break;
                            }
                            case 2: {
                                c5 = ' ';
                                break;
                            }
                            case 3: {
                                c5 = ']';
                                break;
                            }
                            default: {
                                c5 = '|';
                                break;
                            }
                        }
                        charArray2[length2] = (char)(c4 ^ c5);
                        ++n42;
                    } while (n40 == 0);
                }
                if (n40 > n42) {
                    continue;
                }
                break;
            }
            intern2 = new String(charArray2).intern();
            switch (n39) {
                default: {
                    c = org.s.a(intern2);
                    s2 = ":!\u007f8?JW";
                    n39 = 0;
                    continue Label_0682_Outer;
                }
                case 0: {
                    d = Deque.e(intern2);
                    s2 = "ES]I\u001a8>1|nYAJM\u00114/l=lQ";
                    n39 = 1;
                    continue Label_0682_Outer;
                }
                case 1: {
                    break Label_0682_Outer;
                }
            }
        }
        e = org.s.a(intern2);
    }
}
