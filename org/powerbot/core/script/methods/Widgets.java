
package org.powerbot.core.script.methods;

import java.util.HashMap;
import org.powerbot.core.script.wrappers.Component;
import org.powerbot.game.client.RSInterfaceBase;
import java.util.Arrays;
import org.powerbot.core.Bot;
import org.powerbot.core.script.wrappers.Widget;
import org.powerbot.game.client.Client;
import java.util.Map;

public class Widgets
{
    private static final Map<Client, Widget[]> cache;
    
    public static Widget get(final int n) {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        Label_0021: {
            try {
                if (client == null) {
                    break Label_0021;
                }
                final int n2 = n;
                if (n2 < 0) {
                    break Label_0021;
                }
                break Label_0021;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int n2 = n;
                if (n2 < 0) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Widget[] original = Widgets.cache.get(client);
        try {
            if (n < original.length) {
                return original[n];
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final RSInterfaceBase[] rsInterfaceCache = client.getRSInterfaceCache();
        int length = 0;
        Label_0074: {
            Label_0073: {
                RSInterfaceBase[] array = null;
                Label_0069: {
                    try {
                        array = rsInterfaceCache;
                        if (a) {
                            break Label_0069;
                        }
                        if (array == null) {
                            break Label_0073;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                length = array.length;
                break Label_0074;
            }
            length = 0;
        }
        final int max = Math.max(length, n + 1);
        final int length2 = original.length;
        final Widget[] array2 = Arrays.copyOf(original, max);
        int i = length2;
        while (i < max) {
            try {
                array2[i] = new Widget(i);
                ++i;
                if (a) {
                    return array2[n];
                }
                if (!a) {
                    continue;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
            break;
        }
        Widgets.cache.put(client, array2);
        return array2[n];
    }
    
    public static Component get(final int n, final int n2) {
        final Widget value = get(n);
        Widget widget;
        try {
            widget = value;
            if (Calculations.a) {
                return widget.getComponent(n2);
            }
            if (widget == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return widget.getComponent(n2);
        component = null;
        return component;
    }
    
    static {
        cache = new HashMap<Client, Widget[]>();
    }
}
