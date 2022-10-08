
package org.powerbot.game.api.methods.tab;

import org.powerbot.game.bot.Context;

public class Magic
{
    public static boolean isSpellSelected() {
        return Context.client().isSpellSelected();
    }
}
