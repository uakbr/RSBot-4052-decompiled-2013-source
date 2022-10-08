
package org.powerbot.game.bot.handler.input.util;

import java.util.HashMap;
import org.powerbot.game.api.util.node.HashTable;
import org.powerbot.game.api.util.Random;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.Timer;
import java.awt.Point;
import org.powerbot.game.api.util.Filter;
import org.powerbot.game.api.wrappers.ViewportEntity;
import java.util.Map;

public class MouseNode
{
    public static final Map<ThreadGroup, Double> a;
    private final ViewportEntity b;
    private final Filter<Point> c;
    private final Object d;
    private final double e;
    private Timer f;
    private boolean g;
    private boolean h;
    private boolean i;
    public static int j;
    private static final String z;
    
    public MouseNode(final ViewportEntity b, final Filter<Point> c) {
        final int j = MouseNode.j;
        this.b = b;
        this.c = c;
        this.d = new Object();
        this.f = null;
        this.g = false;
        this.h = false;
        this.i = false;
        final Double n = MouseNode.a.get(Thread.currentThread().getThreadGroup());
        double doubleValue = 0.0;
        Label_0091: {
            Double n3 = null;
            Label_0088: {
                Label_0082: {
                    Double n2;
                    try {
                        n2 = (n3 = n);
                        if (j != 0) {
                            break Label_0088;
                        }
                        if (n2 == null) {
                            break Label_0082;
                        }
                        break Label_0082;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (n2 == null) {
                            doubleValue = 1.0;
                            break Label_0091;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                n3 = n;
            }
            doubleValue = n3;
        }
        this.e = doubleValue;
        if (j != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
    
    public Timer a() {
        Label_0017: {
            Timer timer;
            try {
                final Timer timer2;
                timer = (timer2 = this.f);
                if (MouseNode.j != 0) {
                    return timer2;
                }
                if (timer == null) {
                    break Label_0017;
                }
                return this.f;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (timer == null) {
                    this.f = new Timer(Random.nextInt(6000, 8000));
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return this.f;
    }
    
    public ViewportEntity b() {
        return this.b;
    }
    
    public Filter<Point> c() {
        return this.c;
    }
    
    public Object d() {
        return this.d;
    }
    
    public boolean e() {
        return this.g;
    }
    
    public void f() {
        this.g = true;
    }
    
    public boolean g() {
        return this.h;
    }
    
    public void h() {
        this.h = true;
    }
    
    public void i() {
        int j = MouseNode.j;
        Label_0035: {
            Label_0019: {
                try {
                    final MouseNode mouseNode = this;
                    if (j != 0) {
                        break Label_0035;
                    }
                    final boolean b = this.i;
                    if (b) {
                        break Label_0019;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.i;
                    if (b) {
                        throw new RuntimeException(HashTable.e(MouseNode.z));
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            final MouseNode mouseNode = this;
            try {
                mouseNode.i = true;
                if (Task.a != 0) {
                    MouseNode.j = ++j;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
    }
    
    public void j() {
        this.i = false;
    }
    
    public boolean k() {
        final int j = MouseNode.j;
        Label_0046: {
            boolean b3 = false;
            boolean i = false;
            Label_0038: {
                boolean b2 = false;
                Label_0027: {
                    Label_0019: {
                        boolean b;
                        try {
                            b = (b2 = (i = (b3 = this.h)));
                            if (j != 0) {
                                break Label_0027;
                            }
                            if (!b) {
                                break Label_0019;
                            }
                            return false;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (b) {
                                return false;
                            }
                            i = (b2 = (b3 = this.g));
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (j != 0) {
                            break Label_0046;
                        }
                        if (!b2) {
                            break Label_0038;
                        }
                        return false;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (b2) {
                        return false;
                    }
                    b3 = (i = this.i);
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            try {
                if (j != 0) {
                    return b3;
                }
                if (i) {
                    return false;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        return true;
        b3 = false;
        return b3;
    }
    
    public double l() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        Label_0034: {
            try {
                b = (o instanceof MouseNode);
                if (MouseNode.j != 0) {
                    return b;
                }
                if (!b) {
                    break Label_0034;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return this.b.equals(((MouseNode)o).b);
        }
        return b;
    }
    
    static {
        final char[] charArray = "j\u001ax~|T9NX\u0010c\n".toCharArray();
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
                            c2 = 'w';
                            break;
                        }
                        case 1: {
                            c2 = '/';
                            break;
                        }
                        case 2: {
                            c2 = '`';
                            break;
                        }
                        case 3: {
                            c2 = 'R';
                            break;
                        }
                        default: {
                            c2 = '%';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                a = new HashMap<ThreadGroup, Double>();
                return;
            }
            continue;
        }
    }
}
