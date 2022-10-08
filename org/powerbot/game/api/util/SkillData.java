
package org.powerbot.game.api.util;

import org.powerbot.game.api.util.node.HashTable;
import org.powerbot.core.bot.handlers.ScriptHandler;
import org.p;
import org.o;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.tab.Skills;

public final class SkillData
{
    public static final int NUM_SKILL = 25;
    public final int[] initialExp;
    public final int[] initialLevels;
    private Timer timer;
    private static final String[] z;
    
    public SkillData() {
        this(new Timer(0L));
    }
    
    public SkillData(final Timer timer) {
        final boolean a = Random.a;
        this.initialExp = new int[25];
        this.initialLevels = new int[25];
        int i = 0;
        while (true) {
            while (i < 25) {
                boolean a2 = false;
                Label_0119: {
                    Label_0113: {
                        Label_0099: {
                            try {
                                this.initialExp[i] = Skills.getExperience(i);
                                this.initialLevels[i] = Skills.getRealLevel(i);
                                ++i;
                                if (a) {
                                    break Label_0099;
                                }
                                if (!a) {
                                    continue;
                                }
                            }
                            catch (IllegalArgumentException ex) {
                                throw ex;
                            }
                            break;
                            try {
                                if (Task.a == 0) {
                                    return;
                                }
                                final boolean b = a;
                                if (b) {
                                    break Label_0113;
                                }
                                break Label_0113;
                            }
                            catch (IllegalArgumentException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            final boolean b = a;
                            if (b) {
                                a2 = false;
                                break Label_0119;
                            }
                        }
                        catch (IllegalArgumentException ex3) {
                            throw ex3;
                        }
                    }
                    a2 = true;
                }
                Random.a = a2;
                return;
            }
            Timer timer2 = null;
            Label_0096: {
                Label_0095: {
                    Label_0080: {
                        try {
                            timer2 = timer;
                            if (a) {
                                break Label_0080;
                            }
                            if (timer == null) {
                                break Label_0080;
                            }
                            break Label_0095;
                        }
                        catch (IllegalArgumentException ex4) {
                            throw ex4;
                        }
                        try {
                            if (timer != null) {
                                break Label_0095;
                            }
                            timer2 = new Timer(0L);
                        }
                        catch (IllegalArgumentException ex5) {
                            throw ex5;
                        }
                    }
                    break Label_0096;
                }
                timer2 = timer;
            }
            this.timer = timer2;
            continue;
        }
    }
    
    public int experience(final int n) {
        final boolean a = Random.a;
        Label_0030: {
            int n2 = 0;
            int n3 = 0;
            Label_0017: {
                try {
                    final int experience = n;
                    n2 = n;
                    if (a) {
                        break Label_0017;
                    }
                    if (n < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int experience = n;
                n2 = n;
                try {
                    final int n4;
                    n3 = (n4 = 25);
                    if (a) {
                        return experience - n4;
                    }
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    break Label_0030;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                if (n2 > n3) {
                    throw new IllegalArgumentException(o.a(SkillData.z[1]));
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        final int experience = Skills.getExperience(n);
        int n4 = this.initialExp[n];
        return experience - n4;
    }
    
    public int experience(final Rate rate, final int n) {
        return (int)(this.experience(n) * rate.time / this.timer.getElapsed());
    }
    
    public int level(final int n) {
        final boolean a = Random.a;
        Label_0030: {
            int n2 = 0;
            int n3 = 0;
            Label_0017: {
                try {
                    final int realLevel = n;
                    n2 = n;
                    if (a) {
                        break Label_0017;
                    }
                    if (n < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int realLevel = n;
                n2 = n;
                try {
                    final int n4;
                    n3 = (n4 = 25);
                    if (a) {
                        return realLevel - n4;
                    }
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    break Label_0030;
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                if (n2 > n3) {
                    throw new IllegalArgumentException(p.a(SkillData.z[0]));
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        final int realLevel = Skills.getRealLevel(n);
        int n4 = this.initialLevels[n];
        return realLevel - n4;
    }
    
    public int level(final Rate rate, final int n) {
        return (int)(this.level(n) * rate.time / this.timer.getElapsed());
    }
    
    public long timeToLevel(final Rate rate, final int n) {
        final double n2 = this.experience(rate, n);
        Label_0027: {
            double n3;
            try {
                final double experienceToLevel;
                n3 = (experienceToLevel = dcmpl(n2, 0.0));
                if (Random.a) {
                    return (long)(experienceToLevel / n2 * rate.time);
                }
                if (n3 == 0) {
                    return 0L;
                }
                break Label_0027;
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
            try {
                if (n3 == 0) {
                    return 0L;
                }
            }
            catch (IllegalArgumentException ex2) {
                throw ex2;
            }
        }
        double experienceToLevel = Skills.getExperienceToLevel(n, Skills.getRealLevel(n) + 1);
        return (long)(experienceToLevel / n2 * rate.time);
    }
    
    public static String e(final String s) {
        final int n = (0x2 ^ 0x5) << 3 ^ 0x5;
        final int n2 = 5 << 4 ^ 5 << 1;
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int i = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            i = n3;
        }
        return new String(value);
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "jP$\f6Hh\u0003(\u0003fP(\u0019";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0118: {
                    if (n4 > 1) {
                        break Label_0118;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '8';
                                break;
                            }
                            case 1: {
                                c2 = 'n';
                                break;
                            }
                            case 2: {
                                c2 = 'x';
                                break;
                            }
                            case 3: {
                                c2 = '2';
                                break;
                            }
                            default: {
                                c2 = '=';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "H\u001d\u0006A\u0014\u0005JN\nND\u001d\nT";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
    
    public enum Rate
    {
        MINUTE(60000.0), 
        HOUR(3600000.0), 
        DAY(8.64E7), 
        WEEK(6.048E8);
        
        public final double time;
        private static final String[] z;
        
        private Rate(final double time) {
            this.time = time;
        }
        
        public double getTime() {
            return this.time;
        }
        
        static {
            final String[] z2 = new String[4];
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = 0));
            String s = "F>c";
            int n5 = -1;
            String intern = null;
        Label_0062_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n7;
                final int n6 = n7 = (length = charArray.length);
                int n8 = 0;
                while (true) {
                    Label_0138: {
                        if (n6 > 1) {
                            break Label_0138;
                        }
                        length = (n7 = n8);
                        do {
                            final char c = charArray[n7];
                            char c2 = '\0';
                            switch (n8 % 5) {
                                case 0: {
                                    c2 = '\\';
                                    break;
                                }
                                case 1: {
                                    c2 = ' ';
                                    break;
                                }
                                case 2: {
                                    c2 = 'd';
                                    break;
                                }
                                case 3: {
                                    c2 = 'C';
                                    break;
                                }
                                default: {
                                    c2 = 'b';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n8;
                        } while (n6 == 0);
                    }
                    if (n6 > n8) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n5) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = 1)));
                        s = "r%XH";
                        n5 = 0;
                        continue Label_0062_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = 2)));
                        s = "m/HQ";
                        n5 = 1;
                        continue Label_0062_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = 3)));
                        s = "N7uHiG";
                        n5 = 2;
                        continue Label_0062_Outer;
                    }
                    case 2: {
                        break Label_0062_Outer;
                    }
                }
            }
            z2[n4] = intern;
            z = z2;
        }
    }
}
