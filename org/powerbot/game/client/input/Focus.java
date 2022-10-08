
package org.powerbot.game.client.input;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public abstract class Focus implements FocusListener
{
    public static boolean a;
    
    public abstract void _focusGained(final FocusEvent p0);
    
    public abstract void _focusLost(final FocusEvent p0);
    
    @Override
    public final void focusGained(final FocusEvent focusEvent) {
        this._focusGained(focusEvent);
    }
    
    @Override
    public final void focusLost(final FocusEvent focusEvent) {
        this._focusLost(focusEvent);
    }
}
