
package org;

final class n
{
    int a;
    int b;
    int c;
    long d;
    String e;
    String f;
    String g;
    int h;
    n i;
    
    n() {
    }
    
    n(final int a) {
        this.a = a;
    }
    
    n(final int a, final n n) {
        this.a = a;
        this.b = n.b;
        this.c = n.c;
        this.d = n.d;
        this.e = n.e;
        this.f = n.f;
        this.g = n.g;
        this.h = n.h;
    }
    
    void a(final int c) {
        this.b = 3;
        this.c = c;
        this.h = (Integer.MAX_VALUE & this.b + c);
    }
    
    void a(final long d) {
        this.b = 5;
        this.d = d;
        this.h = (Integer.MAX_VALUE & this.b + (int)d);
    }
    
    void a(final float n) {
        this.b = 4;
        this.c = Float.floatToRawIntBits(n);
        this.h = (Integer.MAX_VALUE & this.b + (int)n);
    }
    
    void a(final double n) {
        this.b = 6;
        this.d = Double.doubleToRawLongBits(n);
        this.h = (Integer.MAX_VALUE & this.b + (int)n);
    }
    
    void a(final int b, final String e, final String f, final String g) {
        Label_0123: {
            Label_0089: {
                try {
                    this.b = b;
                    this.e = e;
                    this.f = f;
                    this.g = g;
                    if (f.c) {
                        return;
                    }
                    final int n = b;
                    switch (n) {
                        case 1:
                        case 7:
                        case 8:
                        case 16:
                        case 30: {
                            break Label_0089;
                            break Label_0089;
                        }
                        case 12: {
                            break Label_0089;
                        }
                        default: {
                            break Label_0123;
                        }
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n = b;
                    switch (n) {
                        case 1:
                        case 7:
                        case 8:
                        case 16:
                        case 30: {
                            this.h = (Integer.MAX_VALUE & b + e.hashCode());
                            return;
                        }
                        case 12: {
                            break;
                        }
                        default: {
                            break Label_0123;
                        }
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            this.h = (Integer.MAX_VALUE & b + e.hashCode() * f.hashCode());
            return;
        }
        this.h = (Integer.MAX_VALUE & b + e.hashCode() * f.hashCode() * g.hashCode());
    }
    
    void a(final String e, final String f, final int n) {
        this.b = 18;
        this.d = n;
        this.e = e;
        this.f = f;
        this.h = (Integer.MAX_VALUE & 18 + n * this.e.hashCode() * this.f.hashCode());
    }
    
    void a(final int c, final int h) {
        this.b = 33;
        this.c = c;
        this.h = h;
    }
    
    boolean a(final n n) {
        final boolean c = org.f.c;
        Label_0471: {
            int n5 = 0;
            boolean equals = false;
            Label_0456: {
                int n4 = 0;
                Label_0445: {
                    Label_0430: {
                        int n3 = 0;
                        Label_0419: {
                            Label_0408: {
                                Label_0391: {
                                    int equals6 = 0;
                                    boolean equals5 = false;
                                    Label_0376: {
                                        boolean b3 = false;
                                        Label_0365: {
                                            Label_0350: {
                                                boolean b2 = false;
                                                Label_0330: {
                                                    Label_0313: {
                                                        boolean equals4 = false;
                                                        boolean equals3 = false;
                                                        Label_0298: {
                                                            boolean b = false;
                                                            Label_0276: {
                                                                Label_0259: {
                                                                    int c3 = 0;
                                                                    int equals2 = 0;
                                                                    Label_0244: {
                                                                        int n10 = 0;
                                                                        Label_0225: {
                                                                            boolean c2 = false;
                                                                            Label_0215: {
                                                                                int n7 = 0;
                                                                                Label_0196: {
                                                                                    long n6 = 0L;
                                                                                    Label_0194: {
                                                                                        Label_0170: {
                                                                                            Label_0157: {
                                                                                                int n2;
                                                                                                try {
                                                                                                    n2 = (n3 = (n4 = ((equals = ((n5 = this.b) != 0)) ? 1 : 0)));
                                                                                                    if (c) {
                                                                                                        break Label_0419;
                                                                                                    }
                                                                                                    switch (n2) {
                                                                                                        case 1:
                                                                                                        case 7:
                                                                                                        case 8:
                                                                                                        case 16:
                                                                                                        case 30: {
                                                                                                            break Label_0157;
                                                                                                            break Label_0157;
                                                                                                        }
                                                                                                        case 5:
                                                                                                        case 6:
                                                                                                        case 32: {
                                                                                                            break Label_0170;
                                                                                                        }
                                                                                                        case 3:
                                                                                                        case 4: {
                                                                                                            break Label_0196;
                                                                                                        }
                                                                                                        case 31: {
                                                                                                            break Label_0225;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            break Label_0276;
                                                                                                        }
                                                                                                        case 18: {
                                                                                                            break Label_0330;
                                                                                                        }
                                                                                                        default: {
                                                                                                            break Label_0408;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                catch (RuntimeException ex) {
                                                                                                    throw ex;
                                                                                                }
                                                                                                try {
                                                                                                    switch (n2) {
                                                                                                        case 1:
                                                                                                        case 7:
                                                                                                        case 8:
                                                                                                        case 16:
                                                                                                        case 30: {
                                                                                                            return n.e.equals(this.e);
                                                                                                        }
                                                                                                        case 5:
                                                                                                        case 6:
                                                                                                        case 32: {
                                                                                                            break;
                                                                                                        }
                                                                                                        case 3:
                                                                                                        case 4: {
                                                                                                            break Label_0196;
                                                                                                        }
                                                                                                        case 31: {
                                                                                                            break Label_0225;
                                                                                                        }
                                                                                                        case 12: {
                                                                                                            break Label_0276;
                                                                                                        }
                                                                                                        case 18: {
                                                                                                            break Label_0330;
                                                                                                        }
                                                                                                        default: {
                                                                                                            break Label_0408;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                catch (RuntimeException ex2) {
                                                                                                    throw ex2;
                                                                                                }
                                                                                            }
                                                                                            try {
                                                                                                n6 = lcmp(n.d, this.d);
                                                                                                if (c) {
                                                                                                    return n6 != 0L;
                                                                                                }
                                                                                                if (n6 != 0) {
                                                                                                    break Label_0194;
                                                                                                }
                                                                                            }
                                                                                            catch (RuntimeException ex3) {
                                                                                                throw ex3;
                                                                                            }
                                                                                        }
                                                                                        return n6 != 0L;
                                                                                    }
                                                                                    return n6 != 0L;
                                                                                    try {
                                                                                        n7 = ((c2 = (n.c != 0)) ? 1 : 0);
                                                                                        if (c) {
                                                                                            return c2;
                                                                                        }
                                                                                        final n n8 = this;
                                                                                        final int n9 = n8.c;
                                                                                        if (n7 == n9) {
                                                                                            break Label_0215;
                                                                                        }
                                                                                        return false;
                                                                                    }
                                                                                    catch (RuntimeException ex4) {
                                                                                        throw ex4;
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    final n n8 = this;
                                                                                    final int n9 = n8.c;
                                                                                    if (n7 != n9) {
                                                                                        return false;
                                                                                    }
                                                                                    c2 = true;
                                                                                }
                                                                                catch (RuntimeException ex5) {
                                                                                    throw ex5;
                                                                                }
                                                                            }
                                                                            return c2;
                                                                            c2 = false;
                                                                            return c2;
                                                                            try {
                                                                                n10 = (equals2 = (c3 = n.c));
                                                                                if (c) {
                                                                                    break Label_0259;
                                                                                }
                                                                                final n n11 = this;
                                                                                final int n12 = n11.c;
                                                                                if (n10 == n12) {
                                                                                    break Label_0244;
                                                                                }
                                                                                return false;
                                                                            }
                                                                            catch (RuntimeException ex6) {
                                                                                throw ex6;
                                                                            }
                                                                        }
                                                                        try {
                                                                            final n n11 = this;
                                                                            final int n12 = n11.c;
                                                                            if (n10 != n12) {
                                                                                return false;
                                                                            }
                                                                            c3 = (equals2 = (n.e.equals(this.e) ? 1 : 0));
                                                                        }
                                                                        catch (RuntimeException ex7) {
                                                                            throw ex7;
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (c) {
                                                                            return c3 != 0;
                                                                        }
                                                                        if (equals2 == 0) {
                                                                            return false;
                                                                        }
                                                                    }
                                                                    catch (RuntimeException ex8) {
                                                                        throw ex8;
                                                                    }
                                                                }
                                                                int c3 = true ? 1 : 0;
                                                                return c3 != 0;
                                                                c3 = (false ? 1 : 0);
                                                                return c3 != 0;
                                                                try {
                                                                    b = (equals3 = (equals4 = n.e.equals(this.e)));
                                                                    if (c) {
                                                                        break Label_0313;
                                                                    }
                                                                    if (b) {
                                                                        break Label_0298;
                                                                    }
                                                                    return false;
                                                                }
                                                                catch (RuntimeException ex9) {
                                                                    throw ex9;
                                                                }
                                                            }
                                                            try {
                                                                if (!b) {
                                                                    return false;
                                                                }
                                                                equals4 = (equals3 = n.f.equals(this.f));
                                                            }
                                                            catch (RuntimeException ex10) {
                                                                throw ex10;
                                                            }
                                                        }
                                                        try {
                                                            if (c) {
                                                                return equals4;
                                                            }
                                                            if (!equals3) {
                                                                return false;
                                                            }
                                                        }
                                                        catch (RuntimeException ex11) {
                                                            throw ex11;
                                                        }
                                                    }
                                                    return true;
                                                    equals4 = false;
                                                    return equals4;
                                                    try {
                                                        b2 = (b3 = (equals5 = ((equals6 = lcmp(n.d, this.d)) != 0)));
                                                        if (c) {
                                                            break Label_0365;
                                                        }
                                                        if (!b2) {
                                                            break Label_0350;
                                                        }
                                                        return false;
                                                    }
                                                    catch (RuntimeException ex12) {
                                                        throw ex12;
                                                    }
                                                }
                                                try {
                                                    if (b2) {
                                                        return false;
                                                    }
                                                    equals5 = (b3 = ((equals6 = (n.e.equals(this.e) ? 1 : 0)) != 0));
                                                }
                                                catch (RuntimeException ex13) {
                                                    throw ex13;
                                                }
                                            }
                                            try {
                                                if (c) {
                                                    break Label_0391;
                                                }
                                                if (b3) {
                                                    break Label_0376;
                                                }
                                                return false;
                                            }
                                            catch (RuntimeException ex14) {
                                                throw ex14;
                                            }
                                        }
                                        try {
                                            if (!b3) {
                                                return false;
                                            }
                                            equals6 = ((equals5 = n.f.equals(this.f)) ? 1 : 0);
                                        }
                                        catch (RuntimeException ex15) {
                                            throw ex15;
                                        }
                                    }
                                    try {
                                        if (c) {
                                            return equals6 != 0;
                                        }
                                        if (!equals5) {
                                            return false;
                                        }
                                    }
                                    catch (RuntimeException ex16) {
                                        throw ex16;
                                    }
                                }
                                int equals6 = true ? 1 : 0;
                                return equals6 != 0;
                                equals6 = (false ? 1 : 0);
                                return equals6 != 0;
                            }
                            n4 = (n3 = ((equals = ((n5 = (n.e.equals(this.e) ? 1 : 0)) != 0)) ? 1 : 0));
                            try {
                                if (c) {
                                    break Label_0445;
                                }
                                if (n3 != 0) {
                                    break Label_0430;
                                }
                                return false;
                            }
                            catch (RuntimeException ex17) {
                                throw ex17;
                            }
                        }
                        try {
                            if (n3 == 0) {
                                return false;
                            }
                            equals = ((n4 = (n5 = (n.f.equals(this.f) ? 1 : 0))) != 0);
                        }
                        catch (RuntimeException ex18) {
                            throw ex18;
                        }
                    }
                    try {
                        if (c) {
                            break Label_0471;
                        }
                        if (n4 != 0) {
                            break Label_0456;
                        }
                        return false;
                    }
                    catch (RuntimeException ex19) {
                        throw ex19;
                    }
                }
                try {
                    if (n4 == 0) {
                        return false;
                    }
                    n5 = ((equals = n.g.equals(this.g)) ? 1 : 0);
                }
                catch (RuntimeException ex20) {
                    throw ex20;
                }
            }
            try {
                if (c) {
                    return n5 != 0;
                }
                if (!equals) {
                    return false;
                }
            }
            catch (RuntimeException ex21) {
                throw ex21;
            }
        }
        int n5 = true ? 1 : 0;
        return n5 != 0;
        n5 = (false ? 1 : 0);
        return n5 != 0;
    }
}
