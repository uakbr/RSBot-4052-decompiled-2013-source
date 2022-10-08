
package org.powerbot.game.client;

import java.io.File;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.bot.handler.a;

public class RandomAccessFile
{
    private a uidData;
    private java.io.RandomAccessFile raf;
    private Client client;
    private byte[] data;
    private int offset;
    public static boolean a;
    private static final String[] z;
    
    public RandomAccessFile(final String name, final String mode) {
        final boolean a = RandomAccessFile.a;
        this.uidData = null;
        this.raf = null;
        this.client = null;
        this.data = null;
        this.offset = 0;
        RandomAccessFile randomAccessFile = this;
        boolean a2 = false;
        Label_0082: {
            Label_0076: {
                Label_0062: {
                    if (!a) {
                        try {
                            if (this.shouldOverride(name)) {
                                break Label_0062;
                            }
                            randomAccessFile = this;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                    }
                    randomAccessFile.raf = new java.io.RandomAccessFile(name, mode);
                    try {
                        if (Task.a == 0) {
                            return;
                        }
                        final boolean b = a;
                        if (b) {
                            break Label_0076;
                        }
                        break Label_0076;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0082;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            a2 = true;
        }
        RandomAccessFile.a = a2;
    }
    
    public RandomAccessFile(final File file, final String mode) {
        final boolean a = RandomAccessFile.a;
        this.uidData = null;
        this.raf = null;
        this.client = null;
        this.data = null;
        this.offset = 0;
        RandomAccessFile randomAccessFile = this;
        Label_0065: {
            if (!a) {
                try {
                    if (this.shouldOverride(file.getName())) {
                        break Label_0065;
                    }
                    randomAccessFile = this;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
            randomAccessFile.raf = new java.io.RandomAccessFile(file, mode);
        }
        if (a) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    private boolean shouldOverride(final String s) {
        Label_0025: {
            boolean b;
            try {
                final boolean equals;
                b = (equals = s.equals(org.powerbot.game.bot.handler.input.a.a(RandomAccessFile.z[0])));
                if (RandomAccessFile.a) {
                    return equals;
                }
                if (b) {
                    break Label_0025;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (b) {
                    this.uidData = new a();
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    private void checkData() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: iload_2        
        //     6: ifne            24
        //     9: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //    12: ifnull          217
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: goto            24
        //    23: athrow         
        //    24: getfield        org/powerbot/game/client/RandomAccessFile.client:Lorg/powerbot/game/client/Client;
        //    27: iload_2        
        //    28: ifne            63
        //    31: ifnonnull       59
        //    34: goto            38
        //    37: athrow         
        //    38: invokestatic    org/powerbot/core/Bot.instantiated:()Z
        //    41: ifeq            59
        //    44: goto            48
        //    47: athrow         
        //    48: aload_0        
        //    49: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //    52: putfield        org/powerbot/game/client/RandomAccessFile.client:Lorg/powerbot/game/client/Client;
        //    55: goto            59
        //    58: athrow         
        //    59: aload_0        
        //    60: getfield        org/powerbot/game/client/RandomAccessFile.client:Lorg/powerbot/game/client/Client;
        //    63: iload_2        
        //    64: ifne            82
        //    67: ifnull          90
        //    70: goto            74
        //    73: athrow         
        //    74: aload_0        
        //    75: getfield        org/powerbot/game/client/RandomAccessFile.client:Lorg/powerbot/game/client/Client;
        //    78: goto            82
        //    81: athrow         
        //    82: invokeinterface org/powerbot/game/client/Client.getCurrentUsername:()Ljava/lang/String;
        //    87: goto            92
        //    90: ldc             ""
        //    92: astore_1       
        //    93: aload_0        
        //    94: iload_2        
        //    95: ifne            182
        //    98: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //   101: invokevirtual   org/powerbot/game/bot/handler/a.a:()Ljava/lang/String;
        //   104: aload_1        
        //   105: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   108: ifne            177
        //   111: goto            115
        //   114: athrow         
        //   115: aload_0        
        //   116: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   119: iload_2        
        //   120: ifne            193
        //   123: goto            127
        //   126: athrow         
        //   127: ifnull          177
        //   130: goto            134
        //   133: athrow         
        //   134: aload_0        
        //   135: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //   138: aload_0        
        //   139: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //   142: invokevirtual   org/powerbot/game/bot/handler/a.a:()Ljava/lang/String;
        //   145: aload_0        
        //   146: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   149: invokevirtual   org/powerbot/game/bot/handler/a.a:(Ljava/lang/String;[B)V
        //   152: aload_0        
        //   153: aload_0        
        //   154: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //   157: aload_1        
        //   158: invokevirtual   org/powerbot/game/bot/handler/a.a:(Ljava/lang/String;)[B
        //   161: putfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   164: aload_0        
        //   165: iconst_0       
        //   166: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   169: iload_2        
        //   170: ifeq            217
        //   173: goto            177
        //   176: athrow         
        //   177: aload_0        
        //   178: goto            182
        //   181: athrow         
        //   182: iload_2        
        //   183: ifne            213
        //   186: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   189: goto            193
        //   192: athrow         
        //   193: ifnonnull       217
        //   196: aload_0        
        //   197: aload_0        
        //   198: getfield        org/powerbot/game/client/RandomAccessFile.uidData:Lorg/powerbot/game/bot/handler/a;
        //   201: aload_1        
        //   202: invokevirtual   org/powerbot/game/bot/handler/a.a:(Ljava/lang/String;)[B
        //   205: putfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   208: aload_0        
        //   209: goto            213
        //   212: athrow         
        //   213: iconst_0       
        //   214: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   217: return         
        //    StackMapTable: 00 20 FF 00 12 00 03 07 00 25 00 01 00 01 07 00 A4 00 43 07 00 A4 40 07 00 25 4C 07 00 A4 00 48 07 00 A4 00 49 07 00 A4 00 43 07 00 58 49 07 00 A4 00 46 07 00 A4 40 07 00 58 07 41 07 00 52 FF 00 15 00 03 07 00 25 07 00 52 01 00 01 07 00 A4 00 4A 07 00 A4 40 07 00 B3 45 07 00 A4 00 69 07 00 A4 00 43 07 00 A4 40 07 00 25 49 07 00 A4 40 07 00 B3 52 07 00 A4 40 07 00 25 FF 00 03 00 03 07 00 25 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  193    209    212    213    Ljava/lang/RuntimeException;
        //  182    189    192    193    Ljava/lang/RuntimeException;
        //  134    178    181    182    Ljava/lang/RuntimeException;
        //  127    173    176    177    Ljava/lang/RuntimeException;
        //  115    130    133    134    Ljava/lang/RuntimeException;
        //  98     123    126    127    Ljava/lang/RuntimeException;
        //  93     111    114    115    Ljava/lang/RuntimeException;
        //  67     78     81     82     Ljava/lang/RuntimeException;
        //  63     70     73     74     Ljava/lang/RuntimeException;
        //  38     55     58     59     Ljava/lang/RuntimeException;
        //  31     44     47     48     Ljava/lang/RuntimeException;
        //  24     34     37     38     Ljava/lang/RuntimeException;
        //  9      20     23     24     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
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
    
    private void saveData() {
        final boolean a = RandomAccessFile.a;
        a uidData = null;
        String currentUsername = null;
        Label_0079: {
            Label_0077: {
                Client client2 = null;
                Label_0061: {
                    Client client = null;
                    Label_0043: {
                        RandomAccessFile randomAccessFile = null;
                        Label_0038: {
                            RandomAccessFile randomAccessFile2 = null;
                            Label_0024: {
                                Label_0019: {
                                    try {
                                        randomAccessFile = this;
                                        randomAccessFile2 = this;
                                        if (a) {
                                            break Label_0024;
                                        }
                                        final a a2 = this.uidData;
                                        if (a2 != null) {
                                            break Label_0019;
                                        }
                                        return;
                                    }
                                    catch (RuntimeException ex) {
                                        throw ex;
                                    }
                                    try {
                                        final a a2 = this.uidData;
                                        if (a2 == null) {
                                            return;
                                        }
                                        randomAccessFile = this;
                                        randomAccessFile2 = this;
                                    }
                                    catch (RuntimeException ex2) {
                                        throw ex2;
                                    }
                                }
                                try {
                                    if (a) {
                                        break Label_0043;
                                    }
                                    final byte[] array = randomAccessFile2.data;
                                    if (array != null) {
                                        break Label_0038;
                                    }
                                    return;
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                            }
                            try {
                                final byte[] array = randomAccessFile2.data;
                                if (array == null) {
                                    return;
                                }
                                randomAccessFile = this;
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                        }
                        try {
                            uidData = randomAccessFile.uidData;
                            client = (client2 = this.client);
                            if (a) {
                                break Label_0061;
                            }
                            if (client != null) {
                                break Label_0061;
                            }
                            break Label_0077;
                        }
                        catch (RuntimeException ex5) {
                            throw ex5;
                        }
                    }
                    try {
                        if (client == null) {
                            break Label_0077;
                        }
                        client2 = this.client;
                    }
                    catch (RuntimeException ex6) {
                        throw ex6;
                    }
                }
                currentUsername = client2.getCurrentUsername();
                break Label_0079;
            }
            currentUsername = "";
        }
        uidData.a(currentUsername, this.data);
        this.uidData.b();
    }
    
    public void close() {
        java.io.RandomAccessFile randomAccessFile2 = null;
        Label_0017: {
            java.io.RandomAccessFile randomAccessFile;
            try {
                randomAccessFile = (randomAccessFile2 = this.raf);
                if (RandomAccessFile.a) {
                    break Label_0017;
                }
                if (randomAccessFile != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (randomAccessFile == null) {
                    return;
                }
                randomAccessFile2 = this.raf;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        randomAccessFile2.close();
    }
    
    public long length() {
        Label_0021: {
            try {
                this.checkData();
                final RandomAccessFile randomAccessFile = this;
                if (RandomAccessFile.a) {
                    return randomAccessFile.raf.length();
                }
                final byte[] array = this.data;
                if (array != null) {
                    break Label_0021;
                }
                break Label_0021;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final byte[] array = this.data;
                if (array != null) {
                    return this.data.length;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final RandomAccessFile randomAccessFile = this;
        return randomAccessFile.raf.length();
    }
    
    public int read() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: invokespecial   org/powerbot/game/client/RandomAccessFile.checkData:()V
        //     8: aload_0        
        //     9: iload_2        
        //    10: ifne            71
        //    13: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    16: ifnull          70
        //    19: goto            23
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    27: arraylength    
        //    28: aload_0        
        //    29: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    32: iload_2        
        //    33: ifne            68
        //    36: goto            40
        //    39: athrow         
        //    40: if_icmpgt       49
        //    43: goto            47
        //    46: athrow         
        //    47: iconst_m1      
        //    48: ireturn        
        //    49: sipush          255
        //    52: aload_0        
        //    53: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    56: aload_0        
        //    57: dup            
        //    58: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    61: dup_x1         
        //    62: iconst_1       
        //    63: iadd           
        //    64: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    67: baload         
        //    68: iand           
        //    69: ireturn        
        //    70: aload_0        
        //    71: getfield        org/powerbot/game/client/RandomAccessFile.raf:Ljava/io/RandomAccessFile;
        //    74: invokevirtual   java/io/RandomAccessFile.read:()I
        //    77: ireturn        
        //    78: astore_1       
        //    79: aload_1        
        //    80: invokevirtual   java/lang/Exception.printStackTrace:()V
        //    83: iconst_m1      
        //    84: ireturn        
        //    StackMapTable: 00 0B FF 00 16 00 03 07 00 25 00 01 00 01 07 00 1B 00 4F 07 00 1B FF 00 00 00 03 07 00 25 00 01 00 02 01 01 45 07 00 1B 00 01 FF 00 12 00 03 07 00 25 00 01 00 02 01 01 01 40 07 00 25 46 07 00 1B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  23     43     46     47     Ljava/lang/Exception;
        //  13     36     39     40     Ljava/lang/Exception;
        //  4      48     78     85     Ljava/lang/Exception;
        //  4      19     22     23     Ljava/lang/Exception;
        //  49     69     78     85     Ljava/lang/Exception;
        //  70     77     78     85     Ljava/lang/Exception;
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
    
    public int read(final byte[] array, final int n, int n2) {
        final boolean a = RandomAccessFile.a;
        Label_0144: {
            try {
                this.checkData();
                final RandomAccessFile randomAccessFile = this;
                if (a) {
                    return randomAccessFile.raf.read(array, n, n2);
                }
                if (this.data == null) {
                    break Label_0144;
                }
            }
            catch (Exception ex) {
                throw ex;
            }
            try {
                int n4 = 0;
                Label_0097: {
                    Label_0096: {
                        Label_0082: {
                            int length = 0;
                            int n3 = 0;
                            Label_0047: {
                                try {
                                    length = array.length;
                                    n3 = n + n2;
                                    if (a) {
                                        break Label_0047;
                                    }
                                    if (length >= n3) {
                                        break Label_0047;
                                    }
                                }
                                catch (Exception ex2) {
                                    throw ex2;
                                }
                                n2 = array.length - n;
                                try {
                                    final int length2;
                                    n4 = (length2 = this.data.length);
                                    if (a) {
                                        break Label_0082;
                                    }
                                    final int n5 = this.offset + n2;
                                }
                                catch (Exception ex3) {
                                    throw ex3;
                                }
                            }
                            if (length < n3) {
                                n2 = this.data.length - this.offset;
                            }
                            int length2;
                            n4 = (length2 = n2);
                            try {
                                if (a) {
                                    break Label_0097;
                                }
                                if (length2 > 0) {
                                    break Label_0096;
                                }
                            }
                            catch (Exception ex4) {
                                throw ex4;
                            }
                        }
                        return -1;
                    }
                    n4 = 0;
                }
                int i = n4;
                while (i < n2) {
                    array[n + i] = this.data[this.offset++];
                    ++i;
                    if (a) {
                        break;
                    }
                }
                return n2;
            }
            catch (Exception ex5) {
                ex5.printStackTrace();
            }
        }
        final RandomAccessFile randomAccessFile = this;
        return randomAccessFile.raf.read(array, n, n2);
    }
    
    public void seek(final long p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: iload_3        
        //     6: ifne            40
        //     9: invokespecial   org/powerbot/game/client/RandomAccessFile.checkData:()V
        //    12: lload_1        
        //    13: lconst_0       
        //    14: lcmp           
        //    15: ifge            39
        //    18: goto            22
        //    21: athrow         
        //    22: new             Ljava/io/IOException;
        //    25: dup            
        //    26: getstatic       org/powerbot/game/client/RandomAccessFile.z:[Ljava/lang/String;
        //    29: iconst_1       
        //    30: aaload         
        //    31: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //    34: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //    37: athrow         
        //    38: athrow         
        //    39: aload_0        
        //    40: iload_3        
        //    41: ifne            73
        //    44: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    47: ifnull          68
        //    50: goto            54
        //    53: athrow         
        //    54: aload_0        
        //    55: lload_1        
        //    56: l2i            
        //    57: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    60: iload_3        
        //    61: ifeq            80
        //    64: goto            68
        //    67: athrow         
        //    68: aload_0        
        //    69: goto            73
        //    72: athrow         
        //    73: getfield        org/powerbot/game/client/RandomAccessFile.raf:Ljava/io/RandomAccessFile;
        //    76: lload_1        
        //    77: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    80: return         
        //    StackMapTable: 00 0C FF 00 15 00 03 07 00 25 04 01 00 01 07 00 A4 00 4F 07 00 A4 00 40 07 00 25 4C 07 00 A4 00 4C 07 00 A4 00 43 07 00 A4 40 07 00 25 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  54     69     72     73     Ljava/lang/RuntimeException;
        //  44     64     67     68     Ljava/lang/RuntimeException;
        //  40     50     53     54     Ljava/lang/RuntimeException;
        //  9      38     38     39     Ljava/lang/RuntimeException;
        //  4      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    public void write(final byte[] p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/game/client/RandomAccessFile.checkData:()V
        //     9: aload_0        
        //    10: iload           5
        //    12: ifne            212
        //    15: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    18: ifnull          207
        //    21: goto            25
        //    24: athrow         
        //    25: aload_1        
        //    26: arraylength    
        //    27: iload           5
        //    29: ifne            52
        //    32: goto            36
        //    35: athrow         
        //    36: iload_2        
        //    37: iload_3        
        //    38: iadd           
        //    39: if_icmpge       51
        //    42: goto            46
        //    45: athrow         
        //    46: aload_1        
        //    47: arraylength    
        //    48: iload_2        
        //    49: isub           
        //    50: istore_3       
        //    51: iload_3        
        //    52: iload           5
        //    54: ifne            70
        //    57: ifgt            65
        //    60: goto            64
        //    63: athrow         
        //    64: return         
        //    65: aload_0        
        //    66: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    69: arraylength    
        //    70: iload           5
        //    72: ifne            151
        //    75: aload_0        
        //    76: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    79: iload_3        
        //    80: iadd           
        //    81: if_icmpge       150
        //    84: goto            88
        //    87: athrow         
        //    88: aload_0        
        //    89: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    92: astore          4
        //    94: aload_0        
        //    95: aload_0        
        //    96: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    99: iload_3        
        //   100: iadd           
        //   101: newarray        B
        //   103: putfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   106: aload           4
        //   108: iconst_0       
        //   109: aload_0        
        //   110: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   113: iconst_0       
        //   114: aload_0        
        //   115: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   118: iload           5
        //   120: ifne            141
        //   123: aload           4
        //   125: arraylength    
        //   126: if_icmpgt       144
        //   129: goto            133
        //   132: athrow         
        //   133: aload_0        
        //   134: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   137: goto            141
        //   140: athrow         
        //   141: goto            147
        //   144: aload           4
        //   146: arraylength    
        //   147: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   150: iconst_0       
        //   151: istore          4
        //   153: iload           4
        //   155: iload_3        
        //   156: if_icmpge       198
        //   159: aload_0        
        //   160: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   163: aload_0        
        //   164: dup            
        //   165: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   168: dup_x1         
        //   169: iconst_1       
        //   170: iadd           
        //   171: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   174: aload_1        
        //   175: iload_2        
        //   176: iload           4
        //   178: iadd           
        //   179: baload         
        //   180: bastore        
        //   181: iinc            4, 1
        //   184: iload           5
        //   186: ifne            202
        //   189: iload           5
        //   191: ifeq            153
        //   194: goto            198
        //   197: athrow         
        //   198: aload_0        
        //   199: invokespecial   org/powerbot/game/client/RandomAccessFile.saveData:()V
        //   202: iload           5
        //   204: ifeq            221
        //   207: aload_0        
        //   208: goto            212
        //   211: athrow         
        //   212: getfield        org/powerbot/game/client/RandomAccessFile.raf:Ljava/io/RandomAccessFile;
        //   215: aload_1        
        //   216: iload_2        
        //   217: iload_3        
        //   218: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   221: return         
        //    StackMapTable: 00 1E FF 00 18 00 06 07 00 25 07 00 B3 01 01 00 01 00 01 07 00 A4 00 49 07 00 A4 40 01 48 07 00 A4 00 04 40 01 4A 07 00 A4 00 00 44 01 50 07 00 A4 00 FF 00 2B 00 06 07 00 25 07 00 B3 01 01 07 00 B3 01 00 01 07 00 A4 FF 00 00 00 06 07 00 25 07 00 B3 01 01 07 00 B3 01 00 04 07 00 B3 01 07 00 B3 01 46 07 00 A4 FF 00 00 00 06 07 00 25 07 00 B3 01 01 07 00 B3 01 00 05 07 00 B3 01 07 00 B3 01 01 FF 00 02 00 06 07 00 25 07 00 B3 01 01 07 00 B3 01 00 04 07 00 B3 01 07 00 B3 01 FF 00 02 00 06 07 00 25 07 00 B3 01 01 07 00 B3 01 00 05 07 00 B3 01 07 00 B3 01 01 FF 00 02 00 06 07 00 25 07 00 B3 01 01 00 01 00 00 40 01 FF 00 01 00 06 07 00 25 07 00 B3 01 01 01 01 00 00 6B 07 00 A4 00 03 FF 00 04 00 06 07 00 25 07 00 B3 01 01 00 01 00 00 43 07 00 A4 40 07 00 25 08
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  202    208    211    212    Ljava/lang/RuntimeException;
        //  159    194    197    198    Ljava/lang/RuntimeException;
        //  123    137    140    141    Ljava/lang/RuntimeException;
        //  94     129    132    133    Ljava/lang/RuntimeException;
        //  70     84     87     88     Ljava/lang/RuntimeException;
        //  52     60     63     64     Ljava/lang/RuntimeException;
        //  25     42     45     46     Ljava/lang/RuntimeException;
        //  15     32     35     36     Ljava/lang/RuntimeException;
        //  5      21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    public void write(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokespecial   org/powerbot/game/client/RandomAccessFile.checkData:()V
        //     8: aload_0        
        //     9: iload_3        
        //    10: ifne            137
        //    13: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    16: ifnull          132
        //    19: goto            23
        //    22: athrow         
        //    23: aload_0        
        //    24: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    27: iload_3        
        //    28: ifne            110
        //    31: goto            35
        //    34: athrow         
        //    35: arraylength    
        //    36: aload_0        
        //    37: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    40: iconst_1       
        //    41: iadd           
        //    42: if_icmpge       106
        //    45: goto            49
        //    48: athrow         
        //    49: aload_0        
        //    50: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    53: astore_2       
        //    54: aload_0        
        //    55: aload_0        
        //    56: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    59: iconst_1       
        //    60: iadd           
        //    61: newarray        B
        //    63: putfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    66: aload_2        
        //    67: iconst_0       
        //    68: aload_0        
        //    69: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //    72: iconst_0       
        //    73: aload_0        
        //    74: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    77: iload_3        
        //    78: ifne            98
        //    81: aload_2        
        //    82: arraylength    
        //    83: if_icmpgt       101
        //    86: goto            90
        //    89: athrow         
        //    90: aload_0        
        //    91: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //    94: goto            98
        //    97: athrow         
        //    98: goto            103
        //   101: aload_2        
        //   102: arraylength    
        //   103: invokestatic    java/lang/System.arraycopy:(Ljava/lang/Object;ILjava/lang/Object;II)V
        //   106: aload_0        
        //   107: getfield        org/powerbot/game/client/RandomAccessFile.data:[B
        //   110: aload_0        
        //   111: dup            
        //   112: getfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   115: dup_x1         
        //   116: iconst_1       
        //   117: iadd           
        //   118: putfield        org/powerbot/game/client/RandomAccessFile.offset:I
        //   121: iload_1        
        //   122: i2b            
        //   123: bastore        
        //   124: aload_0        
        //   125: invokespecial   org/powerbot/game/client/RandomAccessFile.saveData:()V
        //   128: iload_3        
        //   129: ifeq            144
        //   132: aload_0        
        //   133: goto            137
        //   136: athrow         
        //   137: getfield        org/powerbot/game/client/RandomAccessFile.raf:Ljava/io/RandomAccessFile;
        //   140: iload_1        
        //   141: invokevirtual   java/io/RandomAccessFile.write:(I)V
        //   144: return         
        //    StackMapTable: 00 12 FF 00 16 00 04 07 00 25 01 00 01 00 01 07 00 A4 00 4A 07 00 A4 40 07 00 B3 4C 07 00 A4 00 FF 00 27 00 04 07 00 25 01 07 00 B3 01 00 01 07 00 A4 FF 00 00 00 04 07 00 25 01 07 00 B3 01 00 04 07 00 B3 01 07 00 B3 01 46 07 00 A4 FF 00 00 00 04 07 00 25 01 07 00 B3 01 00 05 07 00 B3 01 07 00 B3 01 01 FF 00 02 00 04 07 00 25 01 07 00 B3 01 00 04 07 00 B3 01 07 00 B3 01 FF 00 01 00 04 07 00 25 01 07 00 B3 01 00 05 07 00 B3 01 07 00 B3 01 01 FF 00 02 00 04 07 00 25 01 00 01 00 00 43 07 00 B3 15 43 07 00 A4 40 07 00 25 06
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  110    133    136    137    Ljava/lang/RuntimeException;
        //  81     94     97     98     Ljava/lang/RuntimeException;
        //  54     86     89     90     Ljava/lang/RuntimeException;
        //  23     45     48     49     Ljava/lang/RuntimeException;
        //  13     31     34     35     Ljava/lang/RuntimeException;
        //  4      19     22     23     Ljava/lang/RuntimeException;
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
    
    public static String e(final String s) {
        final int n = 5 << 4 ^ 4 << 1;
        final int n2 = (0x2 ^ 0x5) << 4 ^ (0x2 ^ 0x5);
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int i = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            i = n3;
        }
        return new String(value);
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "IV!L\u0010x7\u0005g%";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0118: {
                    if (n4 > 1) {
                        break Label_0118;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '\u000f';
                                break;
                            }
                            case 1: {
                                c2 = '-';
                                break;
                            }
                            case 2: {
                                c2 = '{';
                                break;
                            }
                            case 3: {
                                c2 = '2';
                                break;
                            }
                            default: {
                                c2 = 'K';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "N\u00199IFt,";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
}
