
package org.powerbot.game.api.util;

import org.powerbot.game.api.methods.Environment;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import org.powerbot.game.bot.handler.input.a;

public class Random
{
    private static final java.util.Random random;
    public static boolean a;
    
    public static boolean nextBoolean() {
        return Random.random.nextBoolean();
    }
    
    public static int nextInt(final int n, final int n2) {
        try {
            if (n2 < n) {
                return n2 + Random.random.nextInt(n - n2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            if (n2 == n) {
                final int nextInt = 0;
                return n + nextInt;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        final int nextInt = Random.random.nextInt(n2 - n);
        return n + nextInt;
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
        final boolean a = Random.a;
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
                            s = "UO]hWzgu";
                            break Label_0003;
                            final String intern;
                            instance = SecureRandom.getInstance(org.powerbot.game.bot.handler.input.a.a(intern));
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
                                    c2 = '2';
                                    break;
                                }
                                case 1: {
                                    c2 = '\u001d';
                                    break;
                                }
                                case 2: {
                                    c2 = '(';
                                    break;
                                }
                                case 3: {
                                    c2 = 'C';
                                    break;
                                }
                                default: {
                                    c2 = '3';
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
