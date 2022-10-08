
package org.powerbot.game.api.wrappers.graphics.model;

import org.powerbot.game.client.RSInteractable;
import org.powerbot.game.api.wrappers.node.SceneObject;
import org.powerbot.game.client.Model;
import org.powerbot.game.client.RSObject;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;

public class SceneObjectModel extends CapturedModel
{
    private final RSObject instance;
    public static boolean b;
    
    public SceneObjectModel(final Model model, final SceneObject sceneObject) {
        super(model);
        this.instance = sceneObject.getInstance();
    }
    
    @Override
    protected int getLocalX() {
        return (int)((RSInteractable)this.instance).getData().getLocation().getX();
    }
    
    @Override
    protected int getLocalY() {
        return (int)((RSInteractable)this.instance).getData().getLocation().getY();
    }
    
    @Override
    protected void update() {
    }
}
