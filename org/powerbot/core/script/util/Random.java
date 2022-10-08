
package org.powerbot.core.script.util;

import org.powerbot.game.api.methods.Environment;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.o;

public class Random
{
    private static final java.util.Random random;
    
    public static boolean nextBoolean() {
        return Random.random.nextBoolean();
    }
    
    public static int nextInt(final int n, final int n2) {
        final boolean a = Timer.a;
        int n3 = 0;
        Label_0052: {
            int nextInt = 0;
            Label_0044: {
                int n4 = 0;
                Label_0032: {
                    Label_0017: {
                        try {
                            n3 = n2;
                            nextInt = n;
                            n4 = n;
                            if (a) {
                                break Label_0032;
                            }
                            if (n2 < n) {
                                break Label_0017;
                            }
                            break Label_0017;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (n2 < n) {
                                return n2 + Random.random.nextInt(n - n2);
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    n3 = n;
                    nextInt = n2;
                    n4 = n2;
                    try {
                        if (a) {
                            return n3 + nextInt;
                        }
                        final int n5 = n;
                        if (n4 == n5) {
                            break Label_0044;
                        }
                        break Label_0052;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final int n5 = n;
                    if (n4 != n5) {
                        break Label_0052;
                    }
                    nextInt = 0;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return n3 + nextInt;
        }
        int nextInt = Random.random.nextInt(n2 - n);
        return n3 + nextInt;
    }
    
    public static double nextDouble(final double n, final double n2) {
        return n + Random.random.nextDouble() * (n2 - n);
    }
    
    public static double nextDouble() {
        return Random.random.nextDouble();
    }
    
    public static int nextGaussian(final int n, final int n2, final int n3) {
        return nextGaussian(n, n2, n + (n2 - n) / 2, n3);
    }
    
    public static int nextGaussian(final int n, final int n2, final int n3, final int n4) {
        final boolean a = Timer.a;
        while (true) {
            int n5 = 0;
            Label_0035: {
                try {
                    n5 = n;
                    if (a) {
                        break Label_0035;
                    }
                    final int n6 = n2;
                    if (n == n6) {
                        return n;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n6 = n2;
                    if (n == n6) {
                        return n;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                n5 = (int)(Random.random.nextGaussian() * n4 + n3);
            }
            final int n7 = n5;
            if (n7 >= n) {
                int i = 0;
                while (i < n2) {
                    i = n7;
                    if (!a) {
                        return i;
                    }
                }
            }
            continue;
        }
    }
    
    static {
        java.util.Random instance = null;
    Label_0018_Outer:
        while (true) {
            while (true) {
                while (true) {
                    String s = null;
                    Label_0003: {
                        try {
                            s = "%v\"\u0019g7c7";
                            break Label_0003;
                            final String intern;
                            instance = SecureRandom.getInstance(o.a(intern));
                        }
                        catch (NoSuchAlgorithmException ex) {
                            instance = new java.util.Random();
                        }
                        break;
                    }
                    final char[] charArray = s.toCharArray();
                    int length;
                    int n2;
                    final int n = n2 = (length = charArray.length);
                    int n3 = 0;
                    Label_0094: {
                        if (n > 1) {
                            break Label_0094;
                        }
                        length = (n2 = n3);
                        do {
                            final char c = charArray[n2];
                            char c2 = '\0';
                            switch (n3 % 5) {
                                case 0: {
                                    c2 = '6';
                                    break;
                                }
                                case 1: {
                                    c2 = 'm';
                                    break;
                                }
                                case 2: {
                                    c2 = '#';
                                    break;
                                }
                                case 3: {
                                    c2 = '{';
                                    break;
                                }
                                default: {
                                    c2 = 'w';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n3;
                        } while (n == 0);
                    }
                    if (n <= n3) {
                        final String intern = new String(charArray).intern();
                        continue Label_0018_Outer;
                    }
                    break;
                }
                continue;
            }
        }
        instance.setSeed((long)Environment.getUserId() << 32 ^ System.currentTimeMillis() + instance.nextInt(65535));
        random = instance;
    }
}
