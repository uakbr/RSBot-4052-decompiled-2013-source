
package org.powerbot.core.script.methods;

import org.powerbot.core.script.wrappers.Locatable;
import java.util.Iterator;
import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.util.Filter;
import org.powerbot.game.client.NodeDeque;
import org.powerbot.core.script.wrappers.Player;
import org.powerbot.game.client.HashTable;
import org.powerbot.game.client.Client;
import org.powerbot.core.script.wrappers.Item;
import org.powerbot.core.script.wrappers.Tile;
import org.powerbot.game.client.RSItem;
import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.client.NodeListCache;
import org.powerbot.core.Bot;
import java.util.HashSet;
import org.powerbot.core.script.wrappers.GroundItem;
import java.util.Set;

public class GroundItems
{
    private static final int LOADED_DIST = 104;
    
    public static Set<GroundItem> getLoaded() {
        return getLoaded(104);
    }
    
    public static Set<GroundItem> getLoaded(final int n) {
        final boolean a = Calculations.a;
        final HashSet<GroundItem> set = new HashSet<GroundItem>();
        final Client client = Bot.client();
        Client client3 = null;
        Label_0034: {
            Label_0033: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (a) {
                        break Label_0034;
                    }
                    if (client2 == null) {
                        return set;
                    }
                    break Label_0033;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return set;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            client3 = client;
        }
        final HashTable rsItemHashTable = client3.getRSItemHashTable();
        try {
            if (rsItemHashTable == null) {
                return set;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final Player local = Players.getLocal();
        Player player = null;
        Label_0068: {
            try {
                player = local;
                if (a) {
                    break Label_0068;
                }
                if (player == null) {
                    return set;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        Tile tile5;
        Tile tile4;
        Tile tile3;
        final Tile tile2;
        final Tile tile = tile2 = (tile3 = (tile4 = (tile5 = player.getLocation())));
        Label_0089: {
            try {
                if (a) {
                    break Label_0089;
                }
                if (tile == null) {
                    return set;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
            tile4 = (tile3 = (tile5 = Game.getMapBase()));
        }
        final Tile tile6 = tile3;
        Label_0109: {
            Label_0107: {
                try {
                    if (a) {
                        break Label_0109;
                    }
                    if (tile4 == null) {
                        return set;
                    }
                    break Label_0107;
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
                try {
                    if (tile4 == null) {
                        return set;
                    }
                }
                catch (RuntimeException ex7) {
                    throw ex7;
                }
            }
            tile5 = tile2;
        }
        final int n2 = tile5.getX() - tile6.getX();
        final int n3 = tile2.getY() - tile6.getY();
        final int plane = client.getPlane();
        int i = Math.max(0, n2 - n);
    Label_0353_Outer:
        while (i < Math.min(104, n2 + n)) {
            int j = Math.max(0, n3 - n);
        Label_0353:
            while (true) {
                while (j < Math.min(104, n3 + n)) {
                    final NodeListCache nodeListCache = (NodeListCache)Nodes.lookup(rsItemHashTable, i | j << 14 | plane << 28);
                    Label_0345: {
                        Label_0342: {
                            Label_0231: {
                                try {
                                    if (a) {
                                        break Label_0353;
                                    }
                                    final boolean b = a;
                                    if (!b) {
                                        break Label_0231;
                                    }
                                    break Label_0345;
                                }
                                catch (RuntimeException ex8) {
                                    throw ex8;
                                }
                                try {
                                    final boolean b = a;
                                    if (b) {
                                        break Label_0345;
                                    }
                                    if (nodeListCache == null) {
                                        break Label_0342;
                                    }
                                }
                                catch (RuntimeException ex9) {
                                    throw ex9;
                                }
                            }
                            final NodeDeque nodeList;
                            if ((nodeList = nodeListCache.getNodeList()) != null) {
                                final Deque deque = new Deque<RSItem>(nodeList);
                                RSItem rsItem = deque.getHead();
                                while (rsItem != null) {
                                    set.add(new GroundItem(new Tile(i, j, plane), new Item(rsItem)));
                                    rsItem = deque.getNext();
                                    try {
                                        if (a) {
                                            break Label_0345;
                                        }
                                        if (!a) {
                                            continue Label_0353_Outer;
                                        }
                                    }
                                    catch (RuntimeException ex10) {
                                        throw ex10;
                                    }
                                    break;
                                }
                            }
                        }
                        ++j;
                    }
                    if (a) {
                        break;
                    }
                    continue Label_0353_Outer;
                    if (a) {
                        break Label_0353_Outer;
                    }
                    continue Label_0353_Outer;
                }
                ++i;
                continue Label_0353;
            }
        }
        return set;
    }
    
    public static Set<GroundItem> getLoaded(final Filter<GroundItem> filter) {
        return getLoaded(104, filter);
    }
    
    public static Set<GroundItem> getLoaded(final int n, final Filter<GroundItem> filter) {
        final boolean a = Calculations.a;
        final Set<GroundItem> loaded = getLoaded(n);
        final HashSet set = new HashSet<GroundItem>(loaded.size());
        for (final GroundItem groundItem : loaded) {
            Label_0074: {
                boolean accept;
                try {
                    accept = filter.accept(groundItem);
                    if (a) {
                        break Label_0074;
                    }
                    if (accept) {
                        break Label_0074;
                    }
                    break Label_0074;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (accept) {
                        set.add(groundItem);
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
        HashSet<GroundItem> set2 = null;
        boolean a2 = false;
        Label_0114: {
            Label_0108: {
                try {
                    set2 = (HashSet<GroundItem>)set;
                    if (Task.a == 0) {
                        return set2;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0108;
                    }
                    break Label_0108;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0114;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            a2 = true;
        }
        Calculations.a = a2;
        return set2;
    }
    
    public static GroundItem getNearest(final Filter<GroundItem> filter) {
        return getNearest(104, filter);
    }
    
    public static GroundItem getNearest(final int n, final Filter<GroundItem> filter) {
        final boolean a = Calculations.a;
        double n2 = 104.0;
        final Player local = Players.getLocal();
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
        final Iterator<GroundItem> iterator = getLoaded(n).iterator();
        GroundItem groundItem = null;
        while (iterator.hasNext()) {
            groundItem = iterator.next();
            if (a) {
                return groundItem;
            }
            final GroundItem groundItem2 = groundItem;
            Label_0131: {
                if (filter.accept(groundItem2)) {
                    double distance;
                    final double n3 = distance = Calculations.distance(location, groundItem2);
                    Label_0130: {
                        try {
                            if (a) {
                                break Label_0130;
                            }
                            if (n3 >= n2) {
                                break Label_0131;
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                        distance = n3;
                    }
                    n2 = distance;
                }
            }
            if (a) {
                break;
            }
        }
        return groundItem;
    }
    
    public static String e(final String s) {
        final int n = 5 << 4 ^ (3 << 2 ^ 0x3);
        final int n2 = 4 << 3 ^ 0x2;
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
}
