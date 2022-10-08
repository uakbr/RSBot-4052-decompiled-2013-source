
package org.powerbot.game.api.methods;

import org.powerbot.game.bot.Context;

public class Settings
{
    public static final int SETTING_COMBAT_STYLE = 43;
    public static final int SETTING_AUTO_RETALIATE = 172;
    public static final int SETTING_RUN_ENABLED = 463;
    public static final int SETTING_SPECIAL_ENERGY = 300;
    public static final int SETTING_SPECIAL_ATTACK = 301;
    public static final int SETTING_RANDOMEVENT_DRILLDEMON_MAT = 531;
    
    public static int[] get() {
        return Context.client().getPlayerMetaInfo().getSettings().getData().clone();
    }
    
    public static int get(final int n) {
        final int[] value = get();
        Label_0020: {
            try {
                final int n2 = n;
                if (Widgets.a != 0) {
                    return n2;
                }
                final int[] array = value;
                final int n3 = array.length;
                if (n < n3) {
                    break Label_0020;
                }
                return -1;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final int[] array = value;
                final int n3 = array.length;
                if (n < n3) {
                    return value[n];
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return -1;
    }
    
    public static int get(final int n, final int n2) {
        return get(n, 0, n2);
    }
    
    public static int get(final int n, final int n2, final int n3) {
        return get(n) >>> n2 & n3;
    }
}
