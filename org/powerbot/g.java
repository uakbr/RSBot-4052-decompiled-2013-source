
package org.powerbot;

import org.o;
import org.powerbot.core.script.internal.wrappers.Deque;
import org.i;
import org.powerbot.core.script.job.Task;
import org.p;
import org.f;

public class g extends f
{
    private final String d;
    private final String e;
    
    public g(final f f, final String d, final String e) {
        super(262144, f);
        this.d = d;
        this.e = e;
    }
    
    @Override
    public p a(final int n, final String s, String replace, final String s2, final String[] array) {
        final int i = org.powerbot.f.i;
        Label_0129: {
            String s4 = null;
            String target = null;
            Label_0054: {
                String s3;
                String s5;
                try {
                    s3 = (s4 = replace);
                    s5 = (target = eb.a("W") + this.d + t.b(","));
                    if (i != 0) {
                        break Label_0054;
                    }
                    final boolean b = s3.contains(s5);
                    if (b) {
                        break Label_0054;
                    }
                    break Label_0129;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = s3.contains(s5);
                    if (!b) {
                        break Label_0129;
                    }
                    s4 = replace;
                    target = eb.a("W") + this.d + t.b(",");
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            replace = s4.replace(target, eb.a("W") + this.e + t.b(","));
        }
        final a_ a_ = new a_(super.a(n, s, replace, s2, array), this.d, this.e);
        if (i != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
        return a_;
    }
    
    @Override
    public i a(final int n, final String s, String s2, final String s3, final Object o) {
        String s4 = null;
        Label_0083: {
            try {
                s4 = s2;
                if (org.powerbot.f.i != 0) {
                    break Label_0083;
                }
                if (!s4.equals(eb.a("W") + this.d + t.b(","))) {
                    return super.a(n, s, s2, s3, o);
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            new StringBuilder().append(eb.a("W")).append(this.e).append(t.b(",")).toString();
        }
        s2 = s4;
        return super.a(n, s, s2, s3, o);
    }
    
    static class a_ extends p
    {
        private final String c;
        private final String d;
        
        a_(final p p3, final String c, final String d) {
            super(262144, p3);
            this.c = c;
            this.d = d;
        }
        
        @Override
        public void a(final int n, final int n2, final Object[] array, final int n3, final Object[] array2) {
        }
        
        @Override
        public void a(final int n, String d) {
            Label_0026: {
                try {
                    if (org.powerbot.f.i != 0) {
                        return;
                    }
                    if (!d.equals(this.c)) {
                        break Label_0026;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                d = this.d;
            }
            super.a(n, d);
        }
        
        @Override
        public void a(final int n, final String s, final String s2, String replace) {
            Label_0124: {
                try {
                    if (org.powerbot.f.i != 0) {
                        return;
                    }
                    if (!replace.contains(Deque.e("`") + this.c + eb.a(" "))) {
                        break Label_0124;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                replace = replace.replace(Deque.e("`") + this.c + eb.a(" "), Deque.e("`") + this.d + eb.a(" "));
            }
            super.a(n, s, s2, replace);
        }
        
        @Override
        public void b(final int n, String d, final String s, String replace) {
            int i = org.powerbot.f.i;
            Label_0157: {
                String s2 = null;
                String string = null;
                Label_0077: {
                    boolean equals = false;
                    Label_0030: {
                        try {
                            equals = d.equals(this.c);
                            if (i != 0) {
                                break Label_0077;
                            }
                            if (!equals) {
                                break Label_0030;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        d = this.d;
                        try {
                            s2 = replace;
                            string = Deque.e("`") + this.c + eb.a(" ");
                            if (i != 0) {
                                break Label_0077;
                            }
                            s2.contains(string);
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (!equals) {
                            break Label_0157;
                        }
                        new StringBuilder().append(Deque.e("`")).append(this.c).append(eb.a(" ")).toString();
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                replace = s2.replace(string, Deque.e("`") + this.d + eb.a(" "));
                try {
                    super.b(n, d, s, replace);
                    if (Task.a != 0) {
                        org.powerbot.f.i = ++i;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
        }
        
        @Override
        public void b(final int n, final o o) {
        }
    }
}
