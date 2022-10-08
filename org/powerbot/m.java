
package org.powerbot;

import java.io.Serializable;

public final class m implements Serializable
{
    private static final long serialVersionUID = 5767516607322553568L;
    private final boolean a;
    private int b;
    private Object[] c;
    
    public m(final int n) {
        this(false, n);
    }
    
    public m(final boolean b, final int n) {
        this(b, n, new Object[0]);
    }
    
    public m(final boolean a, final int b, final Object... c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public boolean a() {
        return this.a;
    }
    
    public int b() {
        return this.b;
    }
    
    public void a(final Object... c) {
        this.c = c;
    }
    
    public Object[] c() {
        return this.c;
    }
    
    public int d() {
        final int h = k.h;
        int n3 = 0;
        Label_0044: {
            int n2 = 0;
            Label_0033: {
                Label_0020: {
                    int n;
                    try {
                        n = (n2 = (n3 = this.c.length));
                        if (h != 0) {
                            break Label_0033;
                        }
                        if (n > 0) {
                            break Label_0020;
                        }
                        return -1;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (n <= 0) {
                            return -1;
                        }
                        n3 = (n2 = ((this.c[0] instanceof Integer) ? 1 : 0));
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (h != 0) {
                        return n3;
                    }
                    if (n2 != 0) {
                        break Label_0044;
                    }
                    return -1;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (n2 == 0) {
                    return -1;
                }
                n3 = (int)this.c[0];
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        return n3;
        n3 = -1;
        return n3;
    }
}
