
package org.powerbot.game.api.methods.interactive;

import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.api.methods.Calculations;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.client.Client;
import org.powerbot.core.script.job.Task;
import java.util.HashSet;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.api.util.Filter;

public class Players
{
    public static final Filter<Player> ALL_FILTER;
    public static int a;
    
    public static Player[] getLoaded() {
        return getLoaded(Players.ALL_FILTER);
    }
    
    public static Player[] getLoaded(final Filter<Player> filter) {
        final int a = Players.a;
        final Client client = Context.client();
        final int[] rsPlayerIndexArray = client.getRSPlayerIndexArray();
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        final HashSet<Player> set = new HashSet<Player>();
        final int[] array = rsPlayerIndexArray;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final int n = array[i];
            Label_0132: {
                Label_0129: {
                    Label_0071: {
                        try {
                            if (a != 0) {
                                break Label_0132;
                            }
                            final int n2 = n;
                            if (n2 != 0) {
                                break Label_0071;
                            }
                            break Label_0129;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final int n2 = n;
                            if (n2 == 0) {
                                break Label_0129;
                            }
                            if (rsPlayerArray[n] == null) {
                                break Label_0129;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    final Player player = new Player(rsPlayerArray[n]);
                    Label_0115: {
                        try {
                            if (a != 0) {
                                break Label_0132;
                            }
                            final Filter<Player> filter2 = filter;
                            final Player player2 = player;
                            final boolean b = filter2.accept(player2);
                            if (b) {
                                break Label_0115;
                            }
                            break Label_0129;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            final Filter<Player> filter2 = filter;
                            final Player player2 = player;
                            final boolean b = filter2.accept(player2);
                            if (b) {
                                set.add(player);
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                }
                ++i;
            }
            if (a != 0) {
                int a2 = Task.a;
                Task.a = ++a2;
                break;
            }
        }
        return set.toArray(new Player[set.size()]);
    }
    
    public static Player getNearest(final Filter<Player> filter) {
        int a = Players.a;
        final Client client = Context.client();
        final int[] rsPlayerIndexArray = client.getRSPlayerIndexArray();
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        Player player = null;
        double n = Double.MAX_VALUE;
        final RegionOffset regionOffset = getLocal().getRegionOffset();
        final int[] array = rsPlayerIndexArray;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final int n2 = array[i];
            Label_0162: {
                Label_0159: {
                    Label_0078: {
                        try {
                            if (a != 0) {
                                break Label_0162;
                            }
                            final int n3 = n2;
                            if (n3 != 0) {
                                break Label_0078;
                            }
                            break Label_0159;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final int n3 = n2;
                            if (n3 == 0) {
                                break Label_0159;
                            }
                            if (rsPlayerArray[n2] == null) {
                                break Label_0159;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    final Player player2 = new Player(rsPlayerArray[n2]);
                    try {
                        if (a != 0) {
                            break Label_0162;
                        }
                        if (!filter.accept(player2)) {
                            break Label_0159;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    final double distance = Calculations.distance(regionOffset, player2.getRegionOffset());
                    try {
                        if (a != 0) {
                            break Label_0162;
                        }
                        if (distance >= n) {
                            break Label_0159;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    n = distance;
                    player = player2;
                }
                ++i;
            }
            if (a != 0) {
                break;
            }
        }
        Player player3;
        try {
            player3 = player;
            if (Task.a != 0) {
                Players.a = ++a;
            }
        }
        catch (RuntimeException ex5) {
            throw ex5;
        }
        return player3;
    }
    
    public static Player getLocal() {
        return new Player(Context.client().getMyRSPlayer());
    }
    
    static {
        ALL_FILTER = new Filter<Player>() {
            @Override
            public boolean accept(final Player player) {
                return true;
            }
        };
    }
}
