
package org.powerbot.game.api.wrappers.graphics.model;

import org.powerbot.game.client.Model;
import org.powerbot.game.client.RSInteractable;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;

public class RenderableModel extends CapturedModel
{
    private RSInteractable interactable;
    
    public RenderableModel(final Model model, final RSInteractable interactable) {
        super(model);
        this.interactable = interactable;
    }
    
    @Override
    protected int getLocalX() {
        return (int)this.interactable.getData().getLocation().getX();
    }
    
    @Override
    protected int getLocalY() {
        return (int)this.interactable.getData().getLocation().getY();
    }
    
    @Override
    protected void update() {
    }
}
