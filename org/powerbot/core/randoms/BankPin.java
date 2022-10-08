
package org.powerbot.core.randoms;

import org.powerbot.game.bot.Context;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.game.api.methods.Settings;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.Manifest;

@Manifest(name = "Bank Pin", authors = { "Timer" }, version = 1.0, description = "Enters the bank pin.")
public class BankPin extends AntiRandom
{
    private static final String z;
    
    @Override
    public boolean activate() {
        final int c = AntiRandom.c;
        final WidgetChild value = Widgets.get(13, 0);
        boolean visible = false;
        Label_0042: {
            Label_0024: {
                WidgetChild widgetChild;
                try {
                    widgetChild = value;
                    if (c != 0) {
                        break Label_0024;
                    }
                    if (widgetChild == null) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    visible = widgetChild.visible();
                    if (c != 0) {
                        return visible;
                    }
                    if (!visible) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return visible;
        }
        return visible;
    }
    
    @Override
    public void execute() {
        int c = AntiRandom.c;
        final int intValue = Integer.valueOf(String.valueOf(String.format(this.getPin(), new Object[0]).charAt(Settings.get(163))));
        Label_0091: {
            int interact = 0;
            Label_0059: {
                int n2 = 0;
                int n4 = 0;
                Label_0049: {
                    int n;
                    int n3;
                    try {
                        n = (n2 = intValue);
                        n3 = (n4 = 4);
                        if (c != 0) {
                            break Label_0059;
                        }
                        if (n != n3) {
                            break Label_0049;
                        }
                        break Label_0091;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (n == n3) {
                            break Label_0091;
                        }
                        n2 = 13;
                        n4 = intValue + 6;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    interact = (Widgets.get(n2, n4).interact(org.powerbot.game.bot.handler.input.a.a(BankPin.z)) ? 1 : 0);
                    if (c != 0) {
                        break Label_0059;
                    }
                    if (interact == 0) {
                        break Label_0091;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            Task.sleep(interact, 1000);
            try {
                if (Task.a != 0) {
                    AntiRandom.c = ++c;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
    }
    
    private String getPin() {
        try {
            return Context.resolve().getAccount().b();
        }
        catch (Exception ex) {
            return null;
        }
    }
    
    static {
        final char[] charArray = "I~UM%@".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0101: {
                if (n > 1) {
                    break Label_0101;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '.';
                            break;
                        }
                        case 1: {
                            c2 = '\u0001';
                            break;
                        }
                        case 2: {
                            c2 = '\r';
                            break;
                        }
                        case 3: {
                            c2 = '2';
                            break;
                        }
                        default: {
                            c2 = 'r';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                return;
            }
            continue;
        }
    }
}
