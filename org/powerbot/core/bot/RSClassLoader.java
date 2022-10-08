
package org.powerbot.core.bot;

import java.security.Permissions;
import java.io.IOException;
import java.io.InputStream;
import org.powerbot.cb;
import java.io.BufferedInputStream;
import org.powerbot.game.api.util.node.Deque;
import java.security.PermissionCollection;
import java.security.CodeSource;
import java.security.CodeSigner;
import java.util.HashMap;
import java.net.URL;
import java.security.ProtectionDomain;
import java.util.Map;

public class RSClassLoader extends ClassLoader
{
    private final Map<String, byte[]> classes;
    private final ProtectionDomain domain;
    private static final String[] z;
    
    public RSClassLoader(final Map<String, byte[]> map, final URL url) {
        this.classes = new HashMap<String, byte[]>();
        this.domain = new ProtectionDomain(new CodeSource(url, (CodeSigner[])null), this.createPermissions());
        this.classes.putAll(map);
        try {
            this.classes.put(RSClassLoader.z[20], cb.a(new BufferedInputStream(new URL(this.getClass().getResource(Deque.e(RSClassLoader.z[23])).toString().replace(org.powerbot.core.script.internal.wrappers.Deque.e(RSClassLoader.z[21]), Deque.e(RSClassLoader.z[22]))).openStream())));
        }
        catch (IOException ex) {}
    }
    
    private Permissions createPermissions() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          14
        //     5: new             Ljava/security/Permissions;
        //     8: dup            
        //     9: invokespecial   java/security/Permissions.<init>:()V
        //    12: astore_1       
        //    13: aload_1        
        //    14: new             Ljava/awt/AWTPermission;
        //    17: dup            
        //    18: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    21: bipush          16
        //    23: aaload         
        //    24: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    27: invokespecial   java/awt/AWTPermission.<init>:(Ljava/lang/String;)V
        //    30: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //    33: aload_1        
        //    34: new             Ljava/util/PropertyPermission;
        //    37: dup            
        //    38: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    41: iconst_1       
        //    42: aaload         
        //    43: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    46: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    49: iconst_3       
        //    50: aaload         
        //    51: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    54: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    57: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //    60: aload_1        
        //    61: new             Ljava/util/PropertyPermission;
        //    64: dup            
        //    65: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    68: iconst_5       
        //    69: aaload         
        //    70: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    73: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    76: iconst_3       
        //    77: aaload         
        //    78: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //    81: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    84: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //    87: aload_1        
        //    88: new             Ljava/util/PropertyPermission;
        //    91: dup            
        //    92: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //    95: bipush          17
        //    97: aaload         
        //    98: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   101: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   104: iconst_3       
        //   105: aaload         
        //   106: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   109: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   112: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   115: aload_1        
        //   116: new             Ljava/util/PropertyPermission;
        //   119: dup            
        //   120: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   123: bipush          18
        //   125: aaload         
        //   126: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   129: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   132: iconst_3       
        //   133: aaload         
        //   134: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   137: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   140: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   143: aload_1        
        //   144: new             Ljava/util/PropertyPermission;
        //   147: dup            
        //   148: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   151: iconst_2       
        //   152: aaload         
        //   153: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   156: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   159: iconst_3       
        //   160: aaload         
        //   161: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   164: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   167: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   170: aload_1        
        //   171: new             Ljava/util/PropertyPermission;
        //   174: dup            
        //   175: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   178: bipush          6
        //   180: aaload         
        //   181: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   184: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   187: iconst_3       
        //   188: aaload         
        //   189: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   192: invokespecial   java/util/PropertyPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   195: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   198: aload_1        
        //   199: new             Ljava/net/SocketPermission;
        //   202: dup            
        //   203: ldc             "@"
        //   205: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   208: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   211: bipush          7
        //   213: aaload         
        //   214: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   217: invokespecial   java/net/SocketPermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   220: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   223: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   226: iconst_1       
        //   227: aaload         
        //   228: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   231: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   234: astore_2       
        //   235: aload_2        
        //   236: iload           14
        //   238: ifne            289
        //   241: ifnull          276
        //   244: goto            248
        //   247: athrow         
        //   248: new             Ljava/lang/StringBuilder;
        //   251: dup            
        //   252: invokespecial   java/lang/StringBuilder.<init>:()V
        //   255: aload_2        
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: ldc             "\u0003"
        //   261: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   264: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   267: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   270: astore_2       
        //   271: iload           14
        //   273: ifeq            290
        //   276: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   279: bipush          12
        //   281: aaload         
        //   282: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   285: goto            289
        //   288: athrow         
        //   289: astore_2       
        //   290: bipush          8
        //   292: anewarray       Ljava/lang/String;
        //   295: dup            
        //   296: iconst_0       
        //   297: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   300: bipush          9
        //   302: aaload         
        //   303: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   306: aastore        
        //   307: dup            
        //   308: iconst_1       
        //   309: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   312: bipush          8
        //   314: aaload         
        //   315: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   318: aastore        
        //   319: dup            
        //   320: iconst_2       
        //   321: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   324: bipush          14
        //   326: aaload         
        //   327: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   330: aastore        
        //   331: dup            
        //   332: iconst_3       
        //   333: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   336: bipush          15
        //   338: aaload         
        //   339: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   342: aastore        
        //   343: dup            
        //   344: iconst_4       
        //   345: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   348: iconst_4       
        //   349: aaload         
        //   350: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   353: aastore        
        //   354: dup            
        //   355: iconst_5       
        //   356: aload_2        
        //   357: aastore        
        //   358: dup            
        //   359: bipush          6
        //   361: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   364: bipush          11
        //   366: aaload         
        //   367: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   370: aastore        
        //   371: dup            
        //   372: bipush          7
        //   374: ldc             "\u0002"
        //   376: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   379: aastore        
        //   380: astore_3       
        //   381: iconst_2       
        //   382: anewarray       Ljava/lang/String;
        //   385: dup            
        //   386: iconst_0       
        //   387: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   390: iconst_0       
        //   391: aaload         
        //   392: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   395: aastore        
        //   396: dup            
        //   397: iconst_1       
        //   398: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   401: bipush          13
        //   403: aaload         
        //   404: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   407: aastore        
        //   408: astore          4
        //   410: aload_3        
        //   411: astore          5
        //   413: aload           5
        //   415: arraylength    
        //   416: istore          6
        //   418: iconst_0       
        //   419: istore          7
        //   421: iload           7
        //   423: iload           6
        //   425: if_icmpge       676
        //   428: aload           5
        //   430: iload           7
        //   432: aaload         
        //   433: astore          8
        //   435: new             Ljava/io/File;
        //   438: dup            
        //   439: aload           8
        //   441: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   444: astore          9
        //   446: aload_1        
        //   447: new             Ljava/io/FilePermission;
        //   450: dup            
        //   451: aload           8
        //   453: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   456: bipush          19
        //   458: aaload         
        //   459: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   462: invokespecial   java/io/FilePermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   465: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   468: iload           14
        //   470: ifne            684
        //   473: aload           9
        //   475: iload           14
        //   477: ifne            500
        //   480: goto            484
        //   483: athrow         
        //   484: invokevirtual   java/io/File.exists:()Z
        //   487: ifne            498
        //   490: goto            494
        //   493: athrow         
        //   494: goto            668
        //   497: athrow         
        //   498: aload           9
        //   500: invokevirtual   java/io/File.getPath:()Ljava/lang/String;
        //   503: astore          8
        //   505: aload           4
        //   507: astore          10
        //   509: aload           10
        //   511: arraylength    
        //   512: istore          11
        //   514: iconst_0       
        //   515: istore          12
        //   517: iload           12
        //   519: iload           11
        //   521: if_icmpge       668
        //   524: aload           10
        //   526: iload           12
        //   528: aaload         
        //   529: astore          13
        //   531: aload_1        
        //   532: new             Ljava/io/FilePermission;
        //   535: dup            
        //   536: new             Ljava/lang/StringBuilder;
        //   539: dup            
        //   540: invokespecial   java/lang/StringBuilder.<init>:()V
        //   543: aload           8
        //   545: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   548: getstatic       java/io/File.separator:Ljava/lang/String;
        //   551: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   554: aload           13
        //   556: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   559: getstatic       java/io/File.separator:Ljava/lang/String;
        //   562: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   565: ldc             "\u0001"
        //   567: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   570: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   573: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   576: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   579: bipush          19
        //   581: aaload         
        //   582: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   585: invokespecial   java/io/FilePermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   588: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   591: aload_1        
        //   592: new             Ljava/io/FilePermission;
        //   595: dup            
        //   596: new             Ljava/lang/StringBuilder;
        //   599: dup            
        //   600: invokespecial   java/lang/StringBuilder.<init>:()V
        //   603: aload           8
        //   605: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   608: getstatic       java/io/File.separator:Ljava/lang/String;
        //   611: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   614: aload           13
        //   616: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   619: getstatic       java/io/File.separator:Ljava/lang/String;
        //   622: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   625: ldc             "\u0001"
        //   627: invokestatic    org/powerbot/core/script/internal/wrappers/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   630: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   633: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   636: getstatic       org/powerbot/core/bot/RSClassLoader.z:[Ljava/lang/String;
        //   639: bipush          10
        //   641: aaload         
        //   642: invokestatic    org/powerbot/game/api/util/node/Deque.e:(Ljava/lang/String;)Ljava/lang/String;
        //   645: invokespecial   java/io/FilePermission.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   648: invokevirtual   java/security/Permissions.add:(Ljava/security/Permission;)V
        //   651: iinc            12, 1
        //   654: iload           14
        //   656: ifne            671
        //   659: iload           14
        //   661: ifeq            517
        //   664: goto            668
        //   667: athrow         
        //   668: iinc            7, 1
        //   671: iload           14
        //   673: ifeq            421
        //   676: invokestatic    java/util/Calendar.getInstance:()Ljava/util/Calendar;
        //   679: pop            
        //   680: aload_1        
        //   681: invokevirtual   java/security/Permissions.setReadOnly:()V
        //   684: aload_1        
        //   685: areturn        
        //    StackMapTable: 00 14 FF 00 F7 00 0F 07 00 39 07 00 1A 07 00 28 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 F7 00 1B 4B 07 00 F7 40 07 00 28 00 FF 00 82 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 00 00 00 00 00 00 01 00 00 FF 00 3D 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 07 00 28 07 00 29 00 00 00 00 01 00 01 07 00 F7 40 07 00 29 48 07 00 F7 00 42 07 00 F7 00 41 07 00 29 FF 00 10 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 07 00 28 07 00 29 07 01 0B 01 01 00 01 00 00 FF 00 95 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 07 00 28 07 00 29 07 01 0B 01 01 07 00 28 01 00 01 07 00 F7 FF 00 00 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 07 00 28 07 00 29 00 00 00 00 01 00 00 02 FF 00 04 00 0F 07 00 39 07 00 1A 07 00 28 07 01 0B 07 01 0B 07 01 0B 01 01 00 00 00 00 00 00 01 00 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  531    664    667    668    Ljava/lang/RuntimeException;
        //  484    497    497    498    Ljava/lang/RuntimeException;
        //  473    490    493    494    Ljava/lang/RuntimeException;
        //  446    480    483    484    Ljava/lang/RuntimeException;
        //  271    285    288    289    Ljava/lang/RuntimeException;
        //  235    244    247    248    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0484:
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
    public final Class<?> loadClass(final String name) {
        Label_0056: {
            try {
                final RSClassLoader rsClassLoader = this;
                if (ClientStub.a != 0) {
                    return rsClassLoader.loadClass(name);
                }
                if (!this.classes.containsKey(name)) {
                    break Label_0056;
                }
            }
            catch (Throwable t) {
                throw t;
            }
            final byte[] b = this.classes.remove(name);
            try {
                return this.defineClass(name, b, 0, b.length, this.domain);
            }
            catch (Throwable t2) {
                t2.printStackTrace();
            }
        }
        final RSClassLoader rsClassLoader = this;
        return rsClassLoader.loadClass(name);
    }
    
    static {
        final String[] z2 = new String[24];
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 0))))))))))))))))))))));
        String s = "l;1$`\u0011%\u0018\tM*4\u000fp7";
        int n25 = -1;
        String intern = null;
    Label_0278_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n27;
            final int n26 = n27 = (length = charArray.length);
            int n28 = 0;
            while (true) {
                Label_0353: {
                    if (n26 > 1) {
                        break Label_0353;
                    }
                    length = (n27 = n28);
                    do {
                        final char c = charArray[n27];
                        char c2 = '\0';
                        switch (n28 % 5) {
                            case 0: {
                                c2 = '(';
                                break;
                            }
                            case 1: {
                                c2 = '\u0010';
                                break;
                            }
                            case 2: {
                                c2 = ':';
                                break;
                            }
                            case 3: {
                                c2 = '\u0002';
                                break;
                            }
                            default: {
                                c2 = 'o';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n28;
                    } while (n26 == 0);
                }
                if (n26 > n28) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n25) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 1)))))))))))))))))))))));
                    s = "7\"51+\u0001\u0015\u0016\r";
                    n25 = 0;
                    continue Label_0278_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 2)))))))))))))))))))))));
                    s = "-\"~\"w\n\u0012";
                    n25 = 1;
                    continue Label_0278_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 3)))))))))))))))))))))));
                    s = "]Y\\J";
                    n25 = 2;
                    continue Label_0278_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 4)))))))))))))))))))))));
                    s = "g-9";
                    n25 = 3;
                    continue Label_0278_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 5)))))))))))))))))))))));
                    s = "(0&\"+\u001f\u001f\u0015\fA0";
                    n25 = 4;
                    continue Label_0278_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 6)))))))))))))))))))))));
                    s = "\u0006\tU\u001eK0\"9,k";
                    n25 = 5;
                    continue Label_0278_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 7)))))))))))))))))))))));
                    s = "gxxk&LH\u0011\\\rwxzs&";
                    n25 = 6;
                    continue Label_0278_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 8)))))))))))))))))))))));
                    s = "m## d\n\u0012\u001eG";
                    n25 = 7;
                    continue Label_0278_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 9)))))))))))))))))))))));
                    s = "g-9w0L]^F\r+";
                    n25 = 8;
                    continue Label_0278_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 10)))))))))))))))))))))));
                    s = "5#97`";
                    n25 = 9;
                    continue Label_0278_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 11)))))))))))))))))))))));
                    s = "m%=3*";
                    n25 = 10;
                    continue Label_0278_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 12)))))))))))))))))))))));
                    s = "\u0017U";
                    n25 = 11;
                    continue Label_0278_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 13)))))))))))))))))))))));
                    s = "\u0001ZTB\r[dbj1Jc\u000e\u001c";
                    n25 = 12;
                    continue Label_0278_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 14)))))))))))))))))))))));
                    s = "g-9r*AXRY\u001b+";
                    n25 = 13;
                    continue Label_0278_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 15)))))))))))))))))))))));
                    s = "!k\u007f4l\u0007\u0014\u000fG";
                    n25 = 14;
                    continue Label_0278_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 16)))))))))))))))))))))));
                    s = "N_^K\u001bwR``-[mHK\u001da";
                    n25 = 15;
                    continue Label_0278_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 17)))))))))))))))))))))));
                    s = "\u0003\u001b\r\t\u000044\"0l\u0006\u0014";
                    n25 = 16;
                    continue Label_0278_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 18)))))))))))))))))))))));
                    s = "-\"~-d\u0004\u001f";
                    n25 = 17;
                    continue Label_0278_Outer;
                }
                case 17: {
                    z2[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 19)))))))))))))))))))))));
                    s = "\u001b\u001f\u001a\f";
                    n25 = 18;
                    continue Label_0278_Outer;
                }
                case 18: {
                    z2[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 20)))))))))))))))))))))));
                    s = "Gb],\u001fGg_p\rGd\u0014e\u000eEu\u0014a\u0003AuTvAzqTf\u0000EQYa\n[c|k\u0003M";
                    n25 = 19;
                    continue Label_0278_Outer;
                }
                case 19: {
                    z2[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 21)))))))))))))))))))))));
                    s = "CS\\J\rv8DV\u0000C]N]$kvr`1\u0001_QO\u001bw";
                    n25 = 20;
                    continue Label_0278_Outer;
                }
                case 20: {
                    z2[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 22)))))))))))))))))))))));
                    s = "!=9&k\u001dU)\t@&>=\u0002f\n\u001f\b\u001bh+=5mf\u0005\u001b\b\u001b";
                    n25 = 21;
                    continue Label_0278_Outer;
                }
                case 21: {
                    z2[n23] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = 23)))))))))))))))))))))));
                    s = "\u0010\u0002\u0013/d\u001a\t7\u0007O&4\"mf\u0005\u001b\b\u001b";
                    n25 = 22;
                    continue Label_0278_Outer;
                }
                case 22: {
                    break Label_0278_Outer;
                }
            }
        }
        z2[n24] = intern;
        z = z2;
    }
}
