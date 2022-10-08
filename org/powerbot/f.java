
package org.powerbot;

import org.o;
import org.p;
import java.util.Map;

public class f extends org.f
{
    private final String d;
    private final String e;
    private final Map<Integer, byte[]> f;
    private final int g;
    private final int h;
    public static int i;
    
    public f(final org.f f, final String d, final String e, final Map<Integer, byte[]> f2, final int g, final int h) {
        super(262144, f);
        this.d = d;
        this.e = e;
        this.f = f2;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public p a(final int n, final String s, final String s2, final String s3, final String[] array) {
        final p a = super.a(n, s, s2, s3, array);
        Label_0046: {
            boolean b2 = false;
            Label_0034: {
                boolean b;
                try {
                    b = (b2 = s.equals(this.d));
                    if (org.powerbot.f.i != 0) {
                        break Label_0046;
                    }
                    if (b) {
                        break Label_0034;
                    }
                    return a;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (!b) {
                        return a;
                    }
                    b2 = s2.equals(this.e);
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (b2) {
                    return new a_(a, (Map)this.f, this.g, this.h);
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return a;
    }
    
    private static class a_ extends p
    {
        private final Map<Integer, byte[]> c;
        private final int d;
        private final int e;
        private int f;
        
        private a_(final p p4, final Map<Integer, byte[]> c, final int d, final int e) {
            super(262144, p4);
            this.f = 0;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        public void a(final int n, final int n2, final Object[] array, final int n3, final Object[] array2) {
        }
        
        @Override
        public void a(final int n) {
            this.a();
            super.a(n);
        }
        
        @Override
        public void a(final int n, final int n2) {
            this.a();
            super.a(n, n2);
        }
        
        @Override
        public void b(final int n, final int n2) {
            this.a();
            super.b(n, n2);
        }
        
        @Override
        public void a(final int n, final String s) {
            this.a();
            super.a(n, s);
        }
        
        @Override
        public void a(final int n, final String s, final String s2, final String s3) {
            this.a();
            super.a(n, s, s2, s3);
        }
        
        @Override
        public void b(final int n, final String s, final String s2, final String s3) {
            this.a();
            super.b(n, s, s2, s3);
        }
        
        @Override
        public void a(final int n, final o o) {
            this.a();
            super.a(n, o);
        }
        
        @Override
        public void a(final o o) {
            this.a();
            super.a(o);
        }
        
        @Override
        public void a(final Object o) {
            this.a();
            super.a(o);
        }
        
        @Override
        public void c(final int n, final int n2) {
            this.a();
            super.c(n, n2);
        }
        
        @Override
        public void a(final int n, final int n2, final o o, final o... array) {
            this.a();
            super.a(n, n2, o, array);
        }
        
        @Override
        public void a(final o o, final int[] array, final o[] array2) {
            this.a();
            super.a(o, array, array2);
        }
        
        @Override
        public void a(final String s, final int n) {
            this.a();
            super.a(s, n);
        }
        
        @Override
        public void b(final int n, final o o) {
        }
        
        @Override
        public void d(final int p0, final int p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore_3       
            //     4: aload_0        
            //     5: iload_3        
            //     6: ifne            39
            //     9: getfield        org/powerbot/f$a_.e:I
            //    12: iconst_m1      
            //    13: if_icmpne       34
            //    16: goto            20
            //    19: athrow         
            //    20: aload_0        
            //    21: iload_1        
            //    22: iload_2        
            //    23: invokespecial   org/p.d:(II)V
            //    26: iload_3        
            //    27: ifeq            50
            //    30: goto            34
            //    33: athrow         
            //    34: aload_0        
            //    35: goto            39
            //    38: athrow         
            //    39: aload_0        
            //    40: getfield        org/powerbot/f$a_.e:I
            //    43: aload_0        
            //    44: getfield        org/powerbot/f$a_.d:I
            //    47: invokespecial   org/p.d:(II)V
            //    50: return         
            //    StackMapTable: 00 07 FF 00 13 00 04 07 00 1F 01 01 01 00 01 07 00 74 00 4C 07 00 74 00 43 07 00 74 40 07 00 1F 0A
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  20     35     38     39     Ljava/lang/RuntimeException;
            //  9      30     33     34     Ljava/lang/RuntimeException;
            //  4      16     19     20     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
            try {
                if (this.c.containsKey(++this.f)) {
                    new s(this.c.get(this.f)).a(this.b);
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
    }
}
