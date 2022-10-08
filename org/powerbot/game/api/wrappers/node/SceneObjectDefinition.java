
package org.powerbot.game.api.wrappers.node;

import org.powerbot.game.client.RSObjectDef;
import org.powerbot.game.api.wrappers.Identifiable;

public class SceneObjectDefinition implements Identifiable
{
    private final RSObjectDef def;
    
    public SceneObjectDefinition(final RSObjectDef def) {
        this.def = def;
    }
    
    public String getName() {
        return this.def.getName();
    }
    
    public String[] getActions() {
        return this.def.getActions();
    }
    
    @Override
    public int getId() {
        return this.def.getID();
    }
}
