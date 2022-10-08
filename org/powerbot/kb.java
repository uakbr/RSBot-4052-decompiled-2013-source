
package org.powerbot;

import java.util.logging.LogRecord;
import java.io.PrintStream;
import java.util.logging.Handler;

public class kb extends Handler
{
    private final PrintStream a;
    private final PrintStream b;
    public static boolean c;
    private static final String[] z;
    
    public kb() {
        this(System.out, System.err);
    }
    
    public kb(final PrintStream a, final PrintStream b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void close() {
        this.a.close();
        this.b.close();
    }
    
    @Override
    public void flush() {
        this.a.flush();
        this.b.flush();
    }
    
    @Override
    public synchronized void publish(final LogRecord p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_1        
        //     6: invokevirtual   java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
        //     9: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //    12: astore_2       
        //    13: aload_2        
        //    14: invokevirtual   java/lang/String.length:()I
        //    17: iload           6
        //    19: ifne            37
        //    22: ifne            30
        //    25: goto            29
        //    28: athrow         
        //    29: return         
        //    30: aload_1        
        //    31: invokevirtual   java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
        //    34: invokevirtual   java/util/logging/Level.intValue:()I
        //    37: istore_3       
        //    38: iload_3        
        //    39: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
        //    42: invokevirtual   java/util/logging/Level.intValue:()I
        //    45: if_icmplt       56
        //    48: aload_0        
        //    49: getfield        org/powerbot/kb.b:Ljava/io/PrintStream;
        //    52: goto            60
        //    55: athrow         
        //    56: aload_0        
        //    57: getfield        org/powerbot/kb.a:Ljava/io/PrintStream;
        //    60: astore          4
        //    62: aload           4
        //    64: bipush          91
        //    66: invokevirtual   java/io/PrintStream.print:(C)V
        //    69: aload           4
        //    71: aload_1        
        //    72: invokevirtual   java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
        //    75: invokevirtual   java/util/logging/Level.getName:()Ljava/lang/String;
        //    78: invokevirtual   java/io/PrintStream.print:(Ljava/lang/String;)V
        //    81: aload           4
        //    83: getstatic       org/powerbot/kb.z:[Ljava/lang/String;
        //    86: iconst_1       
        //    87: aaload         
        //    88: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
        //    91: invokevirtual   java/io/PrintStream.print:(Ljava/lang/String;)V
        //    94: iload           6
        //    96: ifne            135
        //    99: getstatic       org/powerbot/y.c:Z
        //   102: ifne            122
        //   105: goto            109
        //   108: athrow         
        //   109: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //   112: invokestatic    org/powerbot/ib.a:(Ljava/lang/Thread;)Z
        //   115: ifeq            148
        //   118: goto            122
        //   121: athrow         
        //   122: aload           4
        //   124: aload_1        
        //   125: invokevirtual   java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
        //   128: invokevirtual   java/io/PrintStream.print:(Ljava/lang/String;)V
        //   131: goto            135
        //   134: athrow         
        //   135: aload           4
        //   137: getstatic       org/powerbot/kb.z:[Ljava/lang/String;
        //   140: iconst_0       
        //   141: aaload         
        //   142: invokestatic    org/powerbot/game/api/util/Time.e:(Ljava/lang/String;)Ljava/lang/String;
        //   145: invokevirtual   java/io/PrintStream.print:(Ljava/lang/String;)V
        //   148: aload           4
        //   150: aload_2        
        //   151: invokevirtual   java/io/PrintStream.print:(Ljava/lang/String;)V
        //   154: aload_1        
        //   155: invokevirtual   java/util/logging/LogRecord.getThrown:()Ljava/lang/Throwable;
        //   158: astore          5
        //   160: aload           5
        //   162: iload           6
        //   164: ifne            176
        //   167: ifnull          186
        //   170: goto            174
        //   173: athrow         
        //   174: aload           5
        //   176: aload           4
        //   178: invokevirtual   java/lang/Throwable.printStackTrace:(Ljava/io/PrintStream;)V
        //   181: iload           6
        //   183: ifeq            195
        //   186: aload           4
        //   188: invokevirtual   java/io/PrintStream.println:()V
        //   191: goto            195
        //   194: athrow         
        //   195: return         
        //    StackMapTable: 00 14 FF 00 1C 00 07 07 00 1A 07 00 30 07 00 32 00 00 00 01 00 01 07 00 84 00 00 46 01 FF 00 11 00 07 07 00 1A 07 00 30 07 00 32 01 00 00 01 00 01 07 00 84 00 43 07 00 05 FF 00 2F 00 07 07 00 1A 07 00 30 07 00 32 01 07 00 05 00 01 00 01 07 00 84 00 4B 07 00 84 00 4B 07 00 84 00 0C FF 00 18 00 07 07 00 1A 07 00 30 07 00 32 01 07 00 05 07 00 44 01 00 01 07 00 84 00 41 07 00 44 09 47 07 00 84 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  176    191    194    195    Ljava/lang/RuntimeException;
        //  160    170    173    174    Ljava/lang/RuntimeException;
        //  109    131    134    135    Ljava/lang/RuntimeException;
        //  99     118    121    122    Ljava/lang/RuntimeException;
        //  62     105    108    109    Ljava/lang/RuntimeException;
        //  38     55     55     56     Ljava/lang/RuntimeException;
        //  13     25     28     29     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0109:
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
    
    public static String a(final String s) {
        final int n = 5 << 4 ^ 3 << 1;
        final int n2 = 2 << 3 ^ (0x2 ^ 0x5);
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
        String s = "$4";
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
                                c2 = '*';
                                break;
                            }
                            case 1: {
                                c2 = '\t';
                                break;
                            }
                            case 2: {
                                c2 = '.';
                                break;
                            }
                            case 3: {
                                c2 = '\u000f';
                                break;
                            }
                            default: {
                                c2 = '\u0017';
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
                    s = "\f-";
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
