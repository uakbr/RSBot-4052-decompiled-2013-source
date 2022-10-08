
package org.powerbot.game.api.util;

public class Timer
{
    private long end;
    private final long start;
    private final long period;
    
    public Timer(final long n) {
        this.period = n * 1000000L;
        this.start = System.nanoTime();
        this.end = this.start + this.period;
    }
    
    public long getElapsed() {
        return (System.nanoTime() - this.start) / 1000000L;
    }
    
    public long getRemaining() {
        Timer timer = null;
        Label_0017: {
            try {
                timer = this;
                if (Random.a) {
                    return (timer.end - System.nanoTime()) / 1000000L;
                }
                final boolean b = this.isRunning();
                if (b) {
                    break Label_0017;
                }
                return 0L;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = this.isRunning();
                if (!b) {
                    return 0L;
                }
                timer = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return (timer.end - System.nanoTime()) / 1000000L;
    }
    
    public boolean isRunning() {
        long n = 0L;
        Label_0025: {
            try {
                n = lcmp(System.nanoTime(), this.end);
                if (Random.a) {
                    return n != 0L;
                }
                if (n >= 0) {
                    break Label_0025;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return n != 0L;
        }
        return n != 0L;
    }
    
    public void reset() {
        this.end = System.nanoTime() + this.period;
    }
    
    public long setEndIn(final long n) {
        return this.end = System.nanoTime() + n * 1000000L;
    }
    
    public String toElapsedString() {
        return Time.format(this.getElapsed());
    }
    
    public String toRemainingString() {
        return Time.format(this.getRemaining());
    }
}
