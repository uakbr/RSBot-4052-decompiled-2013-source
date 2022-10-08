
package org.powerbot.core.script.methods;

import org.powerbot.game.client.Client;
import org.powerbot.game.client.RSHintArrow;
import java.util.HashSet;
import org.powerbot.core.Bot;
import org.powerbot.core.script.wrappers.HintArrow;
import java.util.Set;

public class HintArrows
{
    public static Set<HintArrow> getLoaded() {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        try {
            if (client == null) {
                return new HashSet<HintArrow>(0);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final HashSet<HintArrow> set = new HashSet<HintArrow>();
        final RSHintArrow[] rsHintArrows = client.getRSHintArrows();
        RSHintArrow[] array = null;
        Label_0059: {
            Label_0055: {
                Label_0052: {
                    try {
                        array = rsHintArrows;
                        if (a) {
                            break Label_0052;
                        }
                        if (array == null) {
                            break Label_0055;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                break Label_0059;
            }
            final RSHintArrow[] array2 = new RSHintArrow[0];
        }
        final RSHintArrow[] array3 = array;
        final int length = array3.length;
        int i = 0;
        while (i < length) {
            final RSHintArrow rsHintArrow = array3[i];
            Label_0117: {
                Label_0094: {
                    try {
                        if (a) {
                            break Label_0117;
                        }
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        if (rsHintArrow2 != null) {
                            break Label_0094;
                        }
                        break Label_0094;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        if (rsHintArrow2 != null) {
                            set.add(new HintArrow(rsHintArrow));
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                ++i;
            }
            if (a) {
                break;
            }
        }
        return set;
    }
}
