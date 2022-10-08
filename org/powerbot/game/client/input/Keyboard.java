
package org.powerbot.game.client.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public abstract class Keyboard extends Focus implements KeyListener
{
    public abstract void _keyPressed(final KeyEvent p0);
    
    public abstract void _keyReleased(final KeyEvent p0);
    
    public abstract void _keyTyped(final KeyEvent p0);
    
    @Override
    public void keyPressed(final KeyEvent keyEvent) {
        this._keyPressed(keyEvent);
    }
    
    @Override
    public void keyReleased(final KeyEvent keyEvent) {
        this._keyReleased(keyEvent);
    }
    
    @Override
    public void keyTyped(final KeyEvent keyEvent) {
        this._keyTyped(keyEvent);
    }
}
