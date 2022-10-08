
package org.powerbot.game.api.util.net;

import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.io.IOException;
import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.wrappers.Item;
import org.powerbot.core.bot.handlers.ScriptHandler;

public final class Highscores
{
    public static final String HOST;
    public static final String QUERY;
    private static final int ACTIVITY_INDICES = 15;
    private static final int SKILL_INDICES = 26;
    public final String playerName;
    public final int[][][] skillStats;
    public final int[][][] activityStats;
    public static int a;
    private static final String[] z;
    
    private Highscores(final String playerName, final int[][][] skillStats, final int[][][] activityStats) {
        this.playerName = playerName;
        this.skillStats = skillStats;
        this.activityStats = activityStats;
    }
    
    public int getActivityRank(final int i) {
        final int a = Highscores.a;
        Label_0030: {
            int n2 = 0;
            Label_0017: {
                try {
                    final int n = i;
                    n2 = i;
                    if (a != 0) {
                        break Label_0017;
                    }
                    if (i < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n = i;
                n2 = i;
                try {
                    if (a != 0) {
                        return n;
                    }
                    final int n3 = 15;
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    return this.activityStats[0][0][i];
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final int n3 = 15;
                if (n2 > n3) {
                    throw new IllegalArgumentException(ScriptHandler.e(Highscores.z[2]) + i);
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return this.activityStats[0][0][i];
    }
    
    public int getActivityScore(final int i) {
        final int a = Highscores.a;
        Label_0030: {
            int n2 = 0;
            Label_0017: {
                try {
                    final int n = i;
                    n2 = i;
                    if (a != 0) {
                        break Label_0017;
                    }
                    if (i < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n = i;
                n2 = i;
                try {
                    if (a != 0) {
                        return n;
                    }
                    final int n3 = 15;
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    return this.activityStats[1][0][i];
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final int n3 = 15;
                if (n2 > n3) {
                    throw new IllegalArgumentException(Item.e(Highscores.z[3]) + i);
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return this.activityStats[1][0][i];
    }
    
    public int getExperience(final int i) {
        final int a = Highscores.a;
        Label_0030: {
            int n2 = 0;
            Label_0017: {
                try {
                    final int n = i;
                    n2 = i;
                    if (a != 0) {
                        break Label_0017;
                    }
                    if (i < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n = i;
                n2 = i;
                try {
                    if (a != 0) {
                        return n;
                    }
                    final int n3 = 26;
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    return this.skillStats[2][0][i - 1];
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final int n3 = 26;
                if (n2 > n3) {
                    throw new IllegalArgumentException(ScriptHandler.e(Highscores.z[1]) + i);
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return this.skillStats[2][0][i - 1];
    }
    
    public int getLevel(final int i) {
        final int a = Highscores.a;
        Label_0030: {
            int n2 = 0;
            Label_0017: {
                try {
                    final int n = i;
                    n2 = i;
                    if (a != 0) {
                        break Label_0017;
                    }
                    if (i < 0) {
                        break Label_0030;
                    }
                }
                catch (IllegalArgumentException ex) {
                    throw ex;
                }
                final int n = i;
                n2 = i;
                try {
                    if (a != 0) {
                        return n;
                    }
                    final int n3 = 26;
                    if (n2 > n3) {
                        break Label_0030;
                    }
                    return this.skillStats[1][0][i - 1];
                }
                catch (IllegalArgumentException ex2) {
                    throw ex2;
                }
            }
            try {
                final int n3 = 26;
                if (n2 > n3) {
                    throw new IllegalArgumentException(Item.e(Highscores.z[4]) + i);
                }
            }
            catch (IllegalArgumentException ex3) {
                throw ex3;
            }
        }
        return this.skillStats[1][0][i - 1];
    }
    
    public int getRank(final int i) {
        int a = Highscores.a;
        int n = 0;
        Label_0076: {
            Label_0030: {
                int n2 = 0;
                Label_0017: {
                    try {
                        n = i;
                        n2 = i;
                        if (a != 0) {
                            break Label_0017;
                        }
                        if (i < 0) {
                            break Label_0030;
                        }
                    }
                    catch (IllegalArgumentException ex) {
                        throw ex;
                    }
                    n = i;
                    n2 = i;
                    try {
                        if (a != 0) {
                            break Label_0076;
                        }
                        final int n3 = 26;
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
                    final int n3 = 26;
                    if (n2 > n3) {
                        throw new IllegalArgumentException(ScriptHandler.e(Highscores.z[1]) + i);
                    }
                }
                catch (IllegalArgumentException ex3) {
                    throw ex3;
                }
            }
            n = this.skillStats[0][0][i - 1];
            try {
                if (Task.a != 0) {
                    Highscores.a = ++a;
                }
            }
            catch (IllegalArgumentException ex4) {
                throw ex4;
            }
        }
        return n;
    }
    
    public int getOverallExperience() {
        return this.skillStats[2][0][0];
    }
    
    public int getOverallLevel() {
        return this.skillStats[1][0][0];
    }
    
    public int getOverallRank() {
        return this.skillStats[0][0][0];
    }
    
    public String getPlayerName() {
        return this.playerName;
    }
    
    public static Highscores lookup(final String str) {
        final int i = Highscores.a;
        String s = null;
        Label_0019: {
            try {
                s = str;
                if (i != 0) {
                    break Label_0019;
                }
                if (str == null) {
                    return null;
                }
            }
            catch (IOException ex) {
                throw ex;
            }
            s = str;
        }
        if (!s.isEmpty()) {
            try {
                final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL(Item.e(Highscores.z[0]) + str).openStream()));
                final int[][][] array = new int[3][1][26];
                final int[][][] array2 = new int[2][1][15];
                int n = 0;
                do {
                    int j = 0;
                    int n2 = 0;
                Label_0103:
                    while (j < n2) {
                        final String[] split = bufferedReader.readLine().split(ScriptHandler.e("r"));
                        if (i == 0) {
                            int k = 0;
                            while (k < split.length) {
                                final int int1 = Integer.parseInt(split[k]);
                                Label_0182: {
                                    try {
                                        if (i != 0) {
                                            break Label_0182;
                                        }
                                        j = n;
                                        n2 = 26;
                                        if (i != 0) {
                                            continue Label_0103;
                                        }
                                    }
                                    catch (IOException ex2) {
                                        throw ex2;
                                    }
                                    Label_0187: {
                                        try {
                                            if (j >= n2) {
                                                break Label_0187;
                                            }
                                            array[k][0][n] = int1;
                                        }
                                        catch (IOException ex3) {
                                            throw ex3;
                                        }
                                        try {
                                            if (i != 0) {
                                                array2[k][0][n - 26] = int1;
                                            }
                                        }
                                        catch (IOException ex4) {
                                            throw ex4;
                                        }
                                    }
                                }
                                ++k;
                                if (i != 0) {
                                    break;
                                }
                            }
                            ++n;
                            continue Label_0103;
                        }
                        return new Highscores(str, array, array2);
                    }
                    break;
                } while (i == 0);
                bufferedReader.close();
                return new Highscores(str, array, array2);
            }
            catch (IOException ex5) {}
        }
        return null;
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "J,\u0003&4c\u0019qQ\u0013A7\u00053 >Cw]\u0013A9\u00073 /Yt\u0017\tL<\u0012.Q _m]NU+H&b-O|J]";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0145: {
                    if (n7 > 1) {
                        break Label_0145;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\u0015';
                                break;
                            }
                            case 1: {
                                c2 = '\u0001';
                                break;
                            }
                            case 2: {
                                c2 = '@';
                                break;
                            }
                            case 3: {
                                c2 = '\u000f';
                                break;
                            }
                            default: {
                                c2 = '9';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "\"0h1\u000b#;?\"\r\"2rp\u000e$;z)\\k";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "#1i0\n\":>1\u0004>6i8\u00122~w>\u0003/'%q";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "K6\u00017b%R9Y\u0003V1\u0001?z5\u0016pV\u0004G Mv";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "%XoY\fK<W%e%Zu\u0018\tL<\u0012.4l";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
        String s2 = "J,\u0003&4c\u0019qQ\u0013A7\u00053 >Cw]\u0013A9\u00073 /Yt";
        int n10 = -1;
        String intern2 = null;
    Label_0214_Outer:
        while (true) {
            final char[] charArray2 = s2.toCharArray();
            int length2;
            int n12;
            final int n11 = n12 = (length2 = charArray2.length);
            int n13 = 0;
            while (true) {
                Label_0289: {
                    if (n11 > 1) {
                        break Label_0289;
                    }
                    length2 = (n12 = n13);
                    do {
                        final char c3 = charArray2[n12];
                        char c4 = '\0';
                        switch (n13 % 5) {
                            case 0: {
                                c4 = '\u0015';
                                break;
                            }
                            case 1: {
                                c4 = '\u0001';
                                break;
                            }
                            case 2: {
                                c4 = '@';
                                break;
                            }
                            case 3: {
                                c4 = '\u000f';
                                break;
                            }
                            default: {
                                c4 = '9';
                                break;
                            }
                        }
                        charArray2[length2] = (char)(c3 ^ c4);
                        ++n13;
                    } while (n11 == 0);
                }
                if (n11 > n13) {
                    continue;
                }
                break;
            }
            intern2 = new String(charArray2).intern();
            switch (n10) {
                default: {
                    HOST = Item.e(intern2);
                    s2 = "e6q5\u00033\u0001r9\u0013/qh\"Y;2\u007f)\u00028b";
                    n10 = 0;
                    continue Label_0214_Outer;
                }
                case 0: {
                    break Label_0214_Outer;
                }
            }
        }
        QUERY = ScriptHandler.e(intern2);
    }
    
    public interface Activity
    {
        public static final int DUEL_TOURNAMENT = 0;
        public static final int BOUNTY_HUNTERS = 1;
        public static final int BOUNTY_HUNTER_ROGUES = 2;
        public static final int FIST_OF_GUTHIX = 3;
        public static final int MOBILISING_ARMIES = 4;
        public static final int BA_ATTACKERS = 5;
        public static final int BA_DEFENDERS = 6;
        public static final int BA_COLLECTORS = 7;
        public static final int BA_HEALERS = 8;
        public static final int CASTLE_WARS_GAMES = 9;
        public static final int CONQUEST = 10;
        public static final int DOMINION_TOWER = 11;
        public static final int THE_CRUCIBLE = 12;
        public static final int GG_ATHLETICS = 13;
        public static final int GG_RESOURCE_RACE = 14;
    }
}
