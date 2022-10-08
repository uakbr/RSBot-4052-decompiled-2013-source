
package org.powerbot.core.event;

import java.util.EventListener;
import java.util.EventObject;

public abstract class GameEvent extends EventObject
{
    private static final long serialVersionUID = 1L;
    private static final Object SOURCE;
    public int type;
    public static int a;
    
    public GameEvent() {
        super(GameEvent.SOURCE);
        this.type = -1;
    }
    
    public abstract void dispatch(final EventListener p0);
    
    protected void setType(final int type) {
        this.type = type;
    }
    
    static {
        SOURCE = new Object();
    }
}
