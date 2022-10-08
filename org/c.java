
package org;

public class c
{
    public final String a;
    byte[] b;
    c c;
    
    protected c(final String a) {
        this.a = a;
    }
    
    public boolean a() {
        return false;
    }
    
    protected o[] b() {
        return null;
    }
    
    protected c a(final e e, final int n, final int n2, final char[] array, final int n3, final o[] array2) {
        final c c = new c(this.a);
        c.b = new byte[n2];
        System.arraycopy(e.a, n, c.b, 0, n2);
        return c;
    }
    
    protected d a(final g g, final byte[] array, final int n, final int n2, final int n3) {
        final d d = new d();
        d.a = this.b;
        d.b = this.b.length;
        return d;
    }
    
    final int c() {
        final boolean c = f.c;
        int n = 0;
        c c2 = this;
        while (c2 != null) {
            ++n;
            c2 = c2.c;
            if (c) {
                break;
            }
        }
        return n;
    }
    
    final int b(final g g, final byte[] array, final int n, final int n2, final int n3) {
        final boolean c = f.c;
        c c2 = this;
        int n4 = 0;
        int n5 = 0;
        while (c2 != null) {
            g.a(c2.a);
            n5 = n4 + (c2.a(g, array, n, n2, n3).b + 6);
            if (c) {
                return n5;
            }
            n4 = n5;
            c2 = c2.c;
            if (c) {
                break;
            }
        }
        return n5;
    }
    
    final void a(final g g, final byte[] array, final int n, final int n2, final int n3, final d d) {
        final boolean c = f.c;
        c c2 = this;
        while (c2 != null) {
            final d a = c2.a(g, array, n, n2, n3);
            d.b(g.a(c2.a)).c(a.b);
            d.a(a.a, 0, a.b);
            c2 = c2.c;
            if (c) {
                break;
            }
        }
    }
}
