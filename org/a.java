
package org;

public abstract class a
{
    protected final int a;
    protected a b;
    
    public a(final int n) {
        this(n, null);
    }
    
    public a(final int a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public void a(final String s, final Object o) {
        a a2 = null;
        Label_0017: {
            a a;
            try {
                a = (a2 = this.b);
                if (f.c) {
                    break Label_0017;
                }
                if (a != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (a == null) {
                    return;
                }
                a2 = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        a2.a(s, o);
    }
    
    public void a(final String s, final String s2, final String s3) {
        a a2 = null;
        Label_0017: {
            a a;
            try {
                a = (a2 = this.b);
                if (f.c) {
                    break Label_0017;
                }
                if (a != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (a == null) {
                    return;
                }
                a2 = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        a2.a(s, s2, s3);
    }
    
    public a a(final String s, final String s2) {
        a a2 = null;
        Label_0017: {
            a a;
            try {
                a = (a2 = this.b);
                if (f.c) {
                    return a2;
                }
                if (a != null) {
                    break Label_0017;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (a == null) {
                    return null;
                }
                a2 = this.b.a(s, s2);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return a2;
    }
    
    public a a(final String s) {
        a a2 = null;
        Label_0017: {
            a a;
            try {
                a = (a2 = this.b);
                if (f.c) {
                    return a2;
                }
                if (a != null) {
                    break Label_0017;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (a == null) {
                    return null;
                }
                a2 = this.b.a(s);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return a2;
    }
    
    public void a() {
        a a2 = null;
        Label_0017: {
            a a;
            try {
                a = (a2 = this.b);
                if (f.c) {
                    break Label_0017;
                }
                if (a != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (a == null) {
                    return;
                }
                a2 = this.b;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        a2.a();
    }
}
