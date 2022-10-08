
package org;

import org.powerbot.game.api.util.node.Queue;

public final class l
{
    final int a;
    final String b;
    final String c;
    final String d;
    private static final String z;
    
    public l(final int a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean c = f.c;
        Object o2 = null;
        Label_0039: {
            Label_0038: {
                Object o3 = null;
                Label_0021: {
                    Label_0020: {
                        try {
                            o2 = o;
                            o3 = o;
                            if (c) {
                                break Label_0021;
                            }
                            final l l = this;
                            if (o == l) {
                                return true;
                            }
                            break Label_0020;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final l l = this;
                            if (o == l) {
                                return true;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    o2 = o;
                    o3 = o;
                    try {
                        if (c) {
                            break Label_0039;
                        }
                        final boolean b = o3 instanceof l;
                        if (!b) {
                            return false;
                        }
                        break Label_0038;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final boolean b = o3 instanceof l;
                    if (!b) {
                        return false;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            o2 = o;
        }
        final l i = (l)o2;
        Label_0129: {
            int n4 = 0;
            int equals = 0;
            Label_0114: {
                int n3 = 0;
                Label_0103: {
                    Label_0088: {
                        int n2 = 0;
                        Label_0077: {
                            Label_0062: {
                                int n;
                                try {
                                    n = (n2 = (n3 = (equals = (n4 = this.a))));
                                    if (c) {
                                        break Label_0077;
                                    }
                                    final l j = i;
                                    final int n5 = j.a;
                                    if (n == n5) {
                                        break Label_0062;
                                    }
                                    return false;
                                }
                                catch (RuntimeException ex5) {
                                    throw ex5;
                                }
                                try {
                                    final l j = i;
                                    final int n5 = j.a;
                                    if (n != n5) {
                                        return false;
                                    }
                                    n3 = (n2 = (equals = (n4 = (this.b.equals(i.b) ? 1 : 0))));
                                }
                                catch (RuntimeException ex6) {
                                    throw ex6;
                                }
                            }
                            try {
                                if (c) {
                                    break Label_0103;
                                }
                                if (n2 != 0) {
                                    break Label_0088;
                                }
                                return false;
                            }
                            catch (RuntimeException ex7) {
                                throw ex7;
                            }
                        }
                        try {
                            if (n2 == 0) {
                                return false;
                            }
                            equals = (n3 = (n4 = (this.c.equals(i.c) ? 1 : 0)));
                        }
                        catch (RuntimeException ex8) {
                            throw ex8;
                        }
                    }
                    try {
                        if (c) {
                            break Label_0129;
                        }
                        if (n3 != 0) {
                            break Label_0114;
                        }
                        return false;
                    }
                    catch (RuntimeException ex9) {
                        throw ex9;
                    }
                }
                try {
                    if (n3 == 0) {
                        return false;
                    }
                    n4 = (equals = (this.d.equals(i.d) ? 1 : 0));
                }
                catch (RuntimeException ex10) {
                    throw ex10;
                }
            }
            try {
                if (c) {
                    return n4 != 0;
                }
                if (equals == 0) {
                    return false;
                }
            }
            catch (RuntimeException ex11) {
                throw ex11;
            }
        }
        int n4 = 1;
        return n4 != 0;
        n4 = 0;
        return n4 != 0;
    }
    
    @Override
    public int hashCode() {
        return this.a + this.b.hashCode() * this.c.hashCode() * this.d.hashCode();
    }
    
    @Override
    public String toString() {
        return this.b + '.' + this.c + this.d + Queue.e(l.z) + this.a + ')';
    }
    
    static {
        final char[] charArray = "a9".toCharArray();
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
                            c2 = '\u001a';
                            break;
                        }
                        case 1: {
                            c2 = ' ';
                            break;
                        }
                        case 2: {
                            c2 = '\n';
                            break;
                        }
                        case 3: {
                            c2 = '\\';
                            break;
                        }
                        default: {
                            c2 = '\b';
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
