
package org.powerbot.core.script.job;

import org.powerbot.game.api.util.Random;
import org.powerbot.s;
import java.util.concurrent.Future;

public abstract class Task implements Job
{
    private Thread thread;
    Future<?> future;
    private Container container;
    private volatile boolean alive;
    private volatile boolean interrupted;
    private final Object init_lock;
    public static int a;
    private static final String z;
    
    public Task() {
        this.container = null;
        this.alive = false;
        this.interrupted = false;
        this.init_lock = new Object();
    }
    
    @Override
    public final void work() {
        synchronized (this.init_lock) {
            if (LoopTask.b == 0) {
                try {
                    if (this.alive) {
                        throw new RuntimeException(s.a(Task.z));
                    }
                }
                catch (ThreadDeath threadDeath) {
                    throw threadDeath;
                }
                this.alive = true;
            }
        }
        this.interrupted = false;
        this.thread = Thread.currentThread();
        try {
            this.execute();
        }
        catch (ThreadDeath threadDeath2) {}
        catch (Throwable t) {
            t.printStackTrace();
        }
        this.alive = false;
    }
    
    public abstract void execute();
    
    @Override
    public final boolean join() {
        final int b = LoopTask.b;
        Label_0046: {
            Future<?> future2 = null;
            Label_0027: {
                Label_0019: {
                    Future<?> future;
                    try {
                        future = (future2 = this.future);
                        if (b != 0) {
                            break Label_0027;
                        }
                        if (future != null) {
                            break Label_0019;
                        }
                        return true;
                    }
                    catch (Throwable t) {
                        throw t;
                    }
                    try {
                        if (future == null) {
                            return true;
                        }
                        future2 = this.future;
                    }
                    catch (Throwable t2) {
                        throw t2;
                    }
                }
                try {
                    if (b != 0) {
                        break Label_0046;
                    }
                    final boolean b2 = future2.isDone();
                    if (b2) {
                        return true;
                    }
                    break Label_0046;
                }
                catch (Throwable t3) {
                    throw t3;
                }
            }
            try {
                final boolean b2 = future2.isDone();
                if (b2) {
                    return true;
                }
            }
            catch (Throwable t4) {
                throw t4;
            }
            try {
                this.future.get();
            }
            catch (Throwable t5) {}
        }
        return this.future.isDone();
    }
    
    @Override
    public final boolean isAlive() {
        return this.alive;
    }
    
    @Override
    public final void interrupt() {
        final int b = LoopTask.b;
        Label_0028: {
            try {
                this.interrupted = true;
                final Thread thread3;
                final Thread thread2;
                final Thread thread = thread2 = (thread3 = this.thread);
                if (b != 0) {
                    break Label_0028;
                }
                if (thread == null) {
                    return;
                }
            }
            catch (Throwable t) {
                throw t;
            }
            try {
                final Thread thread2;
                Thread thread3 = thread2 = this.thread;
                Label_0042: {
                    try {
                        if (b != 0) {
                            break Label_0042;
                        }
                        final boolean b2 = thread2.isInterrupted();
                        if (!b2) {
                            break Label_0042;
                        }
                        return;
                    }
                    catch (Throwable t2) {
                        throw t2;
                    }
                    try {
                        final boolean b2 = thread2.isInterrupted();
                        if (b2) {
                            return;
                        }
                        thread3 = this.thread;
                    }
                    catch (Throwable t3) {
                        throw t3;
                    }
                }
                thread3.interrupt();
            }
            catch (Throwable t4) {}
        }
    }
    
    @Override
    public final boolean isInterrupted() {
        return this.interrupted;
    }
    
    @Override
    public void setContainer(final Container container) {
        this.container = container;
    }
    
    @Override
    public Container getContainer() {
        return this.container;
    }
    
    public static void sleep(final int n) {
        final int b = LoopTask.b;
        Label_0043: {
            Label_0031: {
                Label_0021: {
                    int n2;
                    try {
                        final int interrupted;
                        final int n3;
                        n2 = (n3 = (interrupted = (Thread.currentThread().isInterrupted() ? 1 : 0)));
                        if (b != 0) {
                            break Label_0031;
                        }
                        if (n2 != 0) {
                            break Label_0021;
                        }
                        break Label_0021;
                    }
                    catch (InterruptedException ex) {
                        throw ex;
                    }
                    try {
                        if (n2 != 0) {
                            throw new ThreadDeath();
                        }
                    }
                    catch (InterruptedException ex2) {
                        throw ex2;
                    }
                }
                int interrupted = n;
                int n3 = n;
                try {
                    if (b != 0) {
                        break Label_0043;
                    }
                    if (n3 <= 0) {
                        return;
                    }
                }
                catch (InterruptedException ex3) {
                    throw ex3;
                }
            }
            try {
                final int interrupted = n;
                Thread.sleep(interrupted);
            }
            catch (InterruptedException ex4) {
                throw new ThreadDeath();
            }
        }
    }
    
    public static void sleep(final int n, final int n2) {
        sleep(Random.nextInt(n, n2));
    }
    
    static {
        final char[] charArray = "H7\n$\u0001<[jK!X/Y=T3Yq@'".toCharArray();
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
                            c2 = '3';
                            break;
                        }
                        case 1: {
                            c2 = '8';
                            break;
                        }
                        case 2: {
                            c2 = 'v';
                            break;
                        }
                        case 3: {
                            c2 = '!';
                            break;
                        }
                        default: {
                            c2 = '.';
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
