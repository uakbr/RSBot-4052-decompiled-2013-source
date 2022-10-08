
package org.powerbot.game.api.wrappers.node;

import org.powerbot.game.client.RSItemDef;
import org.powerbot.game.api.wrappers.Identifiable;

public class ItemDefinition implements Identifiable
{
    private final RSItemDef definition;
    
    public ItemDefinition(final RSItemDef definition) {
        this.definition = definition;
    }
    
    public String getName() {
        try {
            return this.definition.getName();
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
    
    @Override
    public int getId() {
        try {
            return this.definition.getID();
        }
        catch (ClassCastException ex) {
            return -1;
        }
    }
    
    public boolean isMembers() {
        try {
            return this.definition.isMembersObject();
        }
        catch (ClassCastException ex) {
            return false;
        }
    }
    
    public String[] getActions() {
        try {
            return this.definition.getActions();
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
    
    public String[] getGroundActions() {
        try {
            return this.definition.getGroundActions();
        }
        catch (ClassCastException ex) {
            return null;
        }
    }
}
