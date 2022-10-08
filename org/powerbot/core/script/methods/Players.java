
package org.powerbot.core.script.methods;

import org.powerbot.core.script.wrappers.Tile;
import org.powerbot.core.script.wrappers.Locatable;
import java.util.Iterator;
import org.powerbot.core.script.util.Filter;
import java.util.HashSet;
import java.util.Set;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.client.Client;
import org.powerbot.core.Bot;
import org.powerbot.core.script.wrappers.Player;

public class Players
{
    public static Player getLocal() {
        final Client client = Bot.client();
        Client client3 = null;
        Label_0022: {
            Label_0018: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (Calculations.a) {
                        break Label_0022;
                    }
                    if (client2 == null) {
                        break Label_0018;
                    }
                    break Label_0018;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            client3 = client;
        }
        final RSPlayer myRSPlayer = client3.getMyRSPlayer();
        try {
            if (myRSPlayer != null) {
                return new Player(myRSPlayer);
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return null;
    }
    
    public static Set<Player> getLoaded() {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        Client client3 = null;
        Label_0033: {
            Label_0022: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (a) {
                        break Label_0033;
                    }
                    if (client2 == null) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return new HashSet<Player>(0);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            client3 = client;
        }
        final int[] rsPlayerIndexArray = client3.getRSPlayerIndexArray();
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        Label_0058: {
            try {
                if (rsPlayerIndexArray == null) {
                    break Label_0058;
                }
                final RSPlayer[] array = rsPlayerArray;
                if (array == null) {
                    break Label_0058;
                }
                break Label_0058;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            try {
                final RSPlayer[] array = rsPlayerArray;
                if (array == null) {
                    return new HashSet<Player>(0);
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        final HashSet set = new HashSet<Player>(rsPlayerIndexArray.length);
        final int[] array2 = rsPlayerIndexArray;
        final int length = array2.length;
        int i = 0;
        while (i < length) {
            final RSPlayer rsPlayer = rsPlayerArray[array2[i]];
            Label_0146: {
                Label_0123: {
                    try {
                        if (a) {
                            break Label_0146;
                        }
                        final RSPlayer rsPlayer2 = rsPlayer;
                        if (rsPlayer2 != null) {
                            break Label_0123;
                        }
                        break Label_0123;
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                    try {
                        final RSPlayer rsPlayer2 = rsPlayer;
                        if (rsPlayer2 != null) {
                            set.add(new Player(rsPlayer));
                        }
                    }
                    catch (RuntimeException ex6) {
                        throw ex6;
                    }
                }
                ++i;
            }
            if (a) {
                break;
            }
        }
        return (Set<Player>)set;
    }
    
    public static Set<Player> getLoaded(final Filter<Player> filter) {
        final boolean a = Calculations.a;
        final Set<Player> loaded = getLoaded();
        final HashSet set = new HashSet<Player>(loaded.size());
        for (final Player player : loaded) {
            Label_0070: {
                boolean accept;
                try {
                    accept = filter.accept(player);
                    if (a) {
                        break Label_0070;
                    }
                    if (accept) {
                        break Label_0070;
                    }
                    break Label_0070;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (accept) {
                        set.add(player);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (a) {
                break;
            }
        }
        return (Set<Player>)set;
    }
    
    public static Player getNearest(final Filter<Player> filter) {
        final boolean a = Calculations.a;
        double n = 104.0;
        final Player local = getLocal();
        Player player2 = null;
        Label_0035: {
            Label_0030: {
                Player player;
                try {
                    player = (player2 = local);
                    if (a) {
                        break Label_0035;
                    }
                    if (player == null) {
                        break Label_0030;
                    }
                    break Label_0030;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (player == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            player2 = local;
        }
        final Tile location = player2.getLocation();
        try {
            if (location == null) {
                return null;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final Iterator<Player> iterator = getLoaded().iterator();
        Player player3 = null;
        while (iterator.hasNext()) {
            player3 = iterator.next();
            if (a) {
                return player3;
            }
            final Player player4 = player3;
            Label_0130: {
                if (filter.accept(player4)) {
                    double distance;
                    final double n2 = distance = Calculations.distance(location, player4);
                    Label_0129: {
                        try {
                            if (a) {
                                break Label_0129;
                            }
                            if (n2 >= n) {
                                break Label_0130;
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                        distance = n2;
                    }
                    n = distance;
                }
            }
            if (a) {
                break;
            }
        }
        return player3;
    }
}
