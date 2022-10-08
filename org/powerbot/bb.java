
package org.powerbot;

import java.util.TreeMap;
import java.util.HashMap;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;
import org.powerbot.game.api.util.node.Queue;
import java.util.Iterator;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.Map;

public class bb
{
    private static final String a;
    public static final String b;
    private static final String[] z;
    
    public static void a(final Map<String, Map<String, String>> map, final OutputStream out) {
        final BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(out));
        a(map, bufferedWriter);
        bufferedWriter.close();
    }
    
    public static void a(final Map<String, Map<String, String>> map, final Writer writer) {
        int n = 0;
        try {
            if (map.containsKey("")) {
                a("", map.get(""), writer);
                ++n;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        for (final Map.Entry<String, Map<String, String>> entry : map.entrySet()) {
            try {
                if (n != 0) {
                    writer.write(bb.a);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            final String s = entry.getKey();
            try {
                if (s.equals("")) {
                    continue;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            a(s, entry.getValue(), writer);
            ++n;
        }
    }
    
    private static void a(final String str, final Map<String, String> map, final Writer writer) {
        Label_0015: {
            try {
                if (str == null) {
                    break Label_0015;
                }
                final String s = str;
                final boolean b = s.isEmpty();
                if (!b) {
                    break Label_0015;
                }
                break Label_0015;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final String s = str;
                final boolean b = s.isEmpty();
                if (!b) {
                    writer.write(91);
                    writer.write(str);
                    writer.write(93);
                    writer.write(bb.a);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        for (final Map.Entry<String, String> entry : map.entrySet()) {
            writer.write(entry.getKey());
            writer.write(61);
            final String replaceAll = entry.getValue().replace(new String(new char[] { '\\' }), new String(new char[] { '\\', '\\' })).replaceAll(Queue.e(bb.z[2]), s.a(bb.z[1]));
            try {
                if (replaceAll != null) {
                    writer.write(replaceAll);
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            writer.write(bb.a);
        }
    }
    
    public static Map<String, Map<String, String>> a(final InputStream in) {
        return a(new BufferedReader(new InputStreamReader(in)));
    }
    
    public static Map<String, Map<String, String>> a(final BufferedReader bufferedReader) {
        final HashMap<String, Map<String, String>> hashMap = new HashMap<String, Map<String, String>>();
        a(bufferedReader, hashMap, new TreeMap<String, String>());
        return hashMap;
    }
    
    public static void a(final BufferedReader p0, final Map<String, Map<String, String>> p1, final Map<String, String> p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: astore          4
        //     4: ldc             ""
        //     6: astore          5
        //     8: iconst_0       
        //     9: istore          6
        //    11: aload_0        
        //    12: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //    15: dup            
        //    16: astore_3       
        //    17: ifnull          517
        //    20: aload_3        
        //    21: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    24: astore_3       
        //    25: aload_3        
        //    26: invokevirtual   java/lang/String.length:()I
        //    29: ifle            50
        //    32: aload_3        
        //    33: iconst_0       
        //    34: invokevirtual   java/lang/String.charAt:(I)C
        //    37: bipush          59
        //    39: if_icmpne       50
        //    42: goto            46
        //    45: athrow         
        //    46: goto            11
        //    49: athrow         
        //    50: iload           6
        //    52: ifeq            190
        //    55: aload_1        
        //    56: aload           4
        //    58: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    63: checkcast       Ljava/util/Map;
        //    66: aload           5
        //    68: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    73: checkcast       Ljava/lang/String;
        //    76: astore          7
        //    78: aload_1        
        //    79: aload           4
        //    81: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    86: checkcast       Ljava/util/Map;
        //    89: aload           5
        //    91: new             Ljava/lang/StringBuilder;
        //    94: dup            
        //    95: invokespecial   java/lang/StringBuilder.<init>:()V
        //    98: aload           7
        //   100: iconst_0       
        //   101: aload           7
        //   103: invokevirtual   java/lang/String.length:()I
        //   106: iconst_2       
        //   107: isub           
        //   108: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   111: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   114: getstatic       org/powerbot/bb.a:Ljava/lang/String;
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: aload_3        
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   127: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   132: pop            
        //   133: aload_3        
        //   134: bipush          92
        //   136: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   139: aload_3        
        //   140: invokevirtual   java/lang/String.length:()I
        //   143: iconst_1       
        //   144: isub           
        //   145: if_icmpne       184
        //   148: aload_3        
        //   149: invokevirtual   java/lang/String.length:()I
        //   152: iconst_2       
        //   153: if_icmple       179
        //   156: goto            160
        //   159: athrow         
        //   160: aload_3        
        //   161: aload_3        
        //   162: invokevirtual   java/lang/String.length:()I
        //   165: iconst_2       
        //   166: isub           
        //   167: invokevirtual   java/lang/String.charAt:(I)C
        //   170: bipush          92
        //   172: if_icmpeq       184
        //   175: goto            179
        //   178: athrow         
        //   179: iconst_1       
        //   180: goto            185
        //   183: athrow         
        //   184: iconst_0       
        //   185: istore          6
        //   187: goto            11
        //   190: aload_3        
        //   191: invokevirtual   java/lang/String.isEmpty:()Z
        //   194: ifeq            201
        //   197: goto            11
        //   200: athrow         
        //   201: aload_3        
        //   202: invokevirtual   java/lang/String.length:()I
        //   205: istore          8
        //   207: aload_3        
        //   208: iconst_0       
        //   209: invokevirtual   java/lang/String.charAt:(I)C
        //   212: bipush          91
        //   214: if_icmpne       269
        //   217: aload_3        
        //   218: bipush          93
        //   220: iconst_1       
        //   221: invokevirtual   java/lang/String.indexOf:(II)I
        //   224: istore          7
        //   226: iload           7
        //   228: iconst_m1      
        //   229: if_icmpne       238
        //   232: iload           8
        //   234: goto            240
        //   237: athrow         
        //   238: iload           7
        //   240: istore          7
        //   242: iload           7
        //   244: iconst_1       
        //   245: if_icmpne       254
        //   248: ldc             ""
        //   250: goto            264
        //   253: athrow         
        //   254: aload_3        
        //   255: iconst_1       
        //   256: iload           7
        //   258: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   261: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   264: astore          4
        //   266: goto            514
        //   269: aload_3        
        //   270: bipush          61
        //   272: invokevirtual   java/lang/String.indexOf:(I)I
        //   275: istore          7
        //   277: iload           7
        //   279: iconst_m1      
        //   280: if_icmpne       289
        //   283: iload           8
        //   285: goto            291
        //   288: athrow         
        //   289: iload           7
        //   291: istore          7
        //   293: ldc             ""
        //   295: astore          9
        //   297: aload_3        
        //   298: iconst_0       
        //   299: iload           7
        //   301: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   304: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   307: astore          5
        //   309: iinc            7, 1
        //   312: iload           7
        //   314: iload           8
        //   316: if_icmpge       330
        //   319: aload_3        
        //   320: iload           7
        //   322: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   325: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   328: astore          9
        //   330: aload           9
        //   332: invokevirtual   java/lang/String.length:()I
        //   335: ifle            398
        //   338: aload           9
        //   340: bipush          92
        //   342: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   345: aload           9
        //   347: invokevirtual   java/lang/String.length:()I
        //   350: iconst_1       
        //   351: isub           
        //   352: if_icmpne       398
        //   355: goto            359
        //   358: athrow         
        //   359: aload           9
        //   361: invokevirtual   java/lang/String.length:()I
        //   364: iconst_2       
        //   365: if_icmple       393
        //   368: goto            372
        //   371: athrow         
        //   372: aload           9
        //   374: aload           9
        //   376: invokevirtual   java/lang/String.length:()I
        //   379: iconst_2       
        //   380: isub           
        //   381: invokevirtual   java/lang/String.charAt:(I)C
        //   384: bipush          92
        //   386: if_icmpeq       398
        //   389: goto            393
        //   392: athrow         
        //   393: iconst_1       
        //   394: goto            399
        //   397: athrow         
        //   398: iconst_0       
        //   399: istore          6
        //   401: aload_1        
        //   402: aload           4
        //   404: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   409: ifne            493
        //   412: aconst_null    
        //   413: astore          10
        //   415: aload_2        
        //   416: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   419: getstatic       org/powerbot/bb.z:[Ljava/lang/String;
        //   422: iconst_0       
        //   423: aaload         
        //   424: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //   427: iconst_0       
        //   428: anewarray       Ljava/lang/Class;
        //   431: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
        //   434: astore          11
        //   436: aload           11
        //   438: ifnull          463
        //   441: aload           11
        //   443: aload_1        
        //   444: iconst_0       
        //   445: anewarray       Ljava/lang/Object;
        //   448: invokevirtual   java/lang/reflect/Method.invoke:(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
        //   451: checkcast       Ljava/util/Map;
        //   454: astore          10
        //   456: aload           10
        //   458: invokeinterface java/util/Map.clear:()V
        //   463: goto            468
        //   466: astore          11
        //   468: aload           10
        //   470: ifnonnull       482
        //   473: new             Ljava/util/HashMap;
        //   476: dup            
        //   477: invokespecial   java/util/HashMap.<init>:()V
        //   480: astore          10
        //   482: aload_1        
        //   483: aload           4
        //   485: aload           10
        //   487: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   492: pop            
        //   493: aload_1        
        //   494: aload           4
        //   496: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   501: checkcast       Ljava/util/Map;
        //   504: aload           5
        //   506: aload           9
        //   508: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   513: pop            
        //   514: goto            11
        //   517: aload_0        
        //   518: invokevirtual   java/io/BufferedReader.close:()V
        //   521: return         
        //    Signature:
        //  (Ljava/io/BufferedReader;Ljava/util/Map<Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V
        //    StackMapTable: 00 2A FF 00 0B 00 07 07 00 1C 07 00 0A 07 00 0A 00 07 00 14 07 00 14 01 00 00 FF 00 21 00 07 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 00 01 07 00 3A 00 42 07 00 3A 00 FF 00 6C 00 08 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 07 00 14 00 01 07 00 3A 00 51 07 00 3A 00 43 07 00 3A 00 40 01 FA 00 04 49 07 00 3A 00 FF 00 23 00 09 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 01 01 00 01 07 00 3A 00 41 01 4C 07 00 3A 00 49 07 00 14 FF 00 04 00 09 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 00 01 00 00 FF 00 12 00 09 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 01 01 00 01 07 00 3A 00 41 01 FC 00 26 07 00 14 5B 07 00 3A 00 4B 07 00 3A 00 53 07 00 3A 00 43 07 00 3A 00 40 01 FD 00 3F 07 00 0A 07 00 8B FF 00 02 00 0B 07 00 1C 07 00 0A 07 00 0A 07 00 14 07 00 14 07 00 14 01 01 01 07 00 14 07 00 0A 00 01 07 00 3A FC 00 01 07 00 37 0D F9 00 0A FA 00 14 F9 00 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  372    397    397    398    Ljava/lang/Exception;
        //  359    389    392    393    Ljava/lang/Exception;
        //  338    368    371    372    Ljava/lang/Exception;
        //  330    355    358    359    Ljava/lang/Exception;
        //  277    288    288    289    Ljava/lang/Exception;
        //  242    253    253    254    Ljava/lang/Exception;
        //  226    237    237    238    Ljava/lang/Exception;
        //  190    200    200    201    Ljava/lang/Exception;
        //  160    183    183    184    Ljava/lang/Exception;
        //  148    175    178    179    Ljava/lang/Exception;
        //  78     156    159    160    Ljava/lang/Exception;
        //  32     49     49     50     Ljava/lang/Exception;
        //  25     42     45     46     Ljava/lang/Exception;
        //  415    463    466    468    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0160:
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
    
    public static boolean a(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: ldc             "_"
        //     7: invokestatic    org/powerbot/s.a:(Ljava/lang/String;)Ljava/lang/String;
        //    10: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    13: iload_1        
        //    14: ifne            79
        //    17: ifne            78
        //    20: goto            24
        //    23: athrow         
        //    24: aload_0        
        //    25: getstatic       org/powerbot/bb.z:[Ljava/lang/String;
        //    28: iconst_4       
        //    29: aaload         
        //    30: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //    33: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    36: iload_1        
        //    37: ifne            79
        //    40: goto            44
        //    43: athrow         
        //    44: ifne            78
        //    47: goto            51
        //    50: athrow         
        //    51: aload_0        
        //    52: getstatic       org/powerbot/bb.z:[Ljava/lang/String;
        //    55: iconst_3       
        //    56: aaload         
        //    57: invokestatic    org/powerbot/s.a:(Ljava/lang/String;)Ljava/lang/String;
        //    60: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //    63: iload_1        
        //    64: ifne            79
        //    67: goto            71
        //    70: athrow         
        //    71: ifeq            82
        //    74: goto            78
        //    77: athrow         
        //    78: iconst_1       
        //    79: goto            83
        //    82: iconst_0       
        //    83: ireturn        
        //    StackMapTable: 00 0D FF 00 17 00 02 07 00 14 01 00 01 07 00 F5 00 52 07 00 F5 40 01 45 07 00 F5 00 52 07 00 F5 40 01 45 07 00 F5 00 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  51     74     77     78     Ljava/lang/RuntimeException;
        //  44     67     70     71     Ljava/lang/RuntimeException;
        //  24     47     50     51     Ljava/lang/RuntimeException;
        //  17     40     43     44     Ljava/lang/RuntimeException;
        //  4      20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0024:
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
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u001be(4;";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0145: {
                    if (n7 > 1) {
                        break Label_0145;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'I';
                                break;
                            }
                            case 1: {
                                c2 = 'R';
                                break;
                            }
                            case 2: {
                                c2 = 'v';
                                break;
                            }
                            case 3: {
                                c2 = '\u0001';
                                break;
                            }
                            default: {
                                c2 = 'o';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "{y)";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "P\u0004xPw";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "^8k";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "f\u0011XU";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
        b = "";
        final char[] charArray2 = "~\nCU\u001a\u000bl7;,s\u0017BB".toCharArray();
        int length2;
        int n11;
        final int n10 = n11 = (length2 = charArray2.length);
        int n12 = 0;
        while (true) {
            Label_0289: {
                if (n10 > 1) {
                    break Label_0289;
                }
                length2 = (n11 = n12);
                do {
                    final char c3 = charArray2[n11];
                    char c4 = '\0';
                    switch (n12 % 5) {
                        case 0: {
                            c4 = 'I';
                            break;
                        }
                        case 1: {
                            c4 = 'R';
                            break;
                        }
                        case 2: {
                            c4 = 'v';
                            break;
                        }
                        case 3: {
                            c4 = '\u0001';
                            break;
                        }
                        default: {
                            c4 = 'o';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n12;
                } while (n10 == 0);
            }
            if (n10 <= n12) {
                a = System.getProperty(Queue.e(new String(charArray2).intern()));
                return;
            }
            continue;
        }
    }
}
