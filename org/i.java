
package org;

public abstract class i
{
    protected final int a;
    protected i b;
    
    public i(final int n) {
        this(n, null);
    }
    
    public i(final int a, final i b) {
        this.a = a;
        this.b = b;
    }
    
    public a a(final String s, final boolean b) {
        i j = null;
        Label_0017: {
            i i;
            try {
                i = (j = this.b);
                if (f.c) {
                    return j.a(s, b);
                }
                if (i != null) {
                    break Label_0017;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (i == null) {
                    return null;
                }
                j = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return j.a(s, b);
    }
    
    public void a(final c c) {
        i j = null;
        Label_0017: {
            i i;
            try {
                i = (j = this.b);
                if (f.c) {
                    break Label_0017;
                }
                if (i != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (i == null) {
                    return;
                }
                j = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        j.a(c);
    }
    
    public void a() {
        i j = null;
        Label_0017: {
            i i;
            try {
                i = (j = this.b);
                if (f.c) {
                    break Label_0017;
                }
                if (i != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (i == null) {
                    return;
                }
                j = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        j.a();
    }
}
