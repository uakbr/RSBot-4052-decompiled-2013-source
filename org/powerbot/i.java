
package org.powerbot;

import org.powerbot.core.script.internal.wrappers.HashTable;
import org.p;
import org.f;

public class i extends f
{
    private String d;
    private final String e;
    private static final String z;
    
    public i(final f f, final String e) {
        super(262144, f);
        this.e = e;
    }
    
    @Override
    public void a(final int n, final int n2, final String s, final String s2, final String d, final String[] array) {
        this.d = d;
        super.a(n, n2, s, s2, this.e, array);
    }
    
    @Override
    public p a(final int n, final String s, final String s2, final String s3, final String[] array) {
        try {
            if (s.equals(HashTable.e(i.z))) {
                return new p(262144, super.a(n, s, s2, s3, array)) {
                    @Override
                    public void b(final int p0, final String p1, final String p2, final String p3) {
                        // 
                        // This method could not be decompiled.
                        // 
                        // Original Bytecode:
                        // 
                        //     3: istore          5
                        //     5: iload           5
                        //     7: ifne            69
                        //    10: iload_1        
                        //    11: sipush          183
                        //    14: if_icmpne       60
                        //    17: goto            21
                        //    20: athrow         
                        //    21: aload_2        
                        //    22: iload           5
                        //    24: ifne            59
                        //    27: goto            31
                        //    30: athrow         
                        //    31: aload_0        
                        //    32: getfield        org/powerbot/i$0.this$0:Lorg/powerbot/i;
                        //    35: invokestatic    org/powerbot/i.access$000:(Lorg/powerbot/i;)Ljava/lang/String;
                        //    38: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                        //    41: ifeq            60
                        //    44: goto            48
                        //    47: athrow         
                        //    48: aload_0        
                        //    49: getfield        org/powerbot/i$0.this$0:Lorg/powerbot/i;
                        //    52: invokestatic    org/powerbot/i.access$100:(Lorg/powerbot/i;)Ljava/lang/String;
                        //    55: goto            59
                        //    58: athrow         
                        //    59: astore_2       
                        //    60: aload_0        
                        //    61: iload_1        
                        //    62: aload_2        
                        //    63: aload_3        
                        //    64: aload           4
                        //    66: invokespecial   org/p.b:(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
                        //    69: return         
                        //    StackMapTable: 00 0A FF 00 14 00 06 07 00 07 01 07 00 16 07 00 16 07 00 16 01 00 01 07 00 2F 00 48 07 00 2F 40 07 00 16 4F 07 00 2F 00 49 07 00 2F 40 07 00 16 00 08
                        //    Exceptions:
                        //  Try           Handler
                        //  Start  End    Start  End    Type                        
                        //  -----  -----  -----  -----  ----------------------------
                        //  31     55     58     59     Ljava/lang/RuntimeException;
                        //  21     44     47     48     Ljava/lang/RuntimeException;
                        //  10     27     30     31     Ljava/lang/RuntimeException;
                        //  5      17     20     21     Ljava/lang/RuntimeException;
                        // 
                        // The error that occurred was:
                        // 
                        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0021:
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
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:440)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:494)
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
                };
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return super.a(n, s, s2, s3, array);
    }
    
    static {
        final char[] charArray = "\u0011\u001677I\u001f".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0102: {
                if (n > 1) {
                    break Label_0102;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u001d';
                            break;
                        }
                        case 1: {
                            c2 = 'C';
                            break;
                        }
                        case 2: {
                            c2 = 'i';
                            break;
                        }
                        case 3: {
                            c2 = 'b';
                            break;
                        }
                        default: {
                            c2 = '\r';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
