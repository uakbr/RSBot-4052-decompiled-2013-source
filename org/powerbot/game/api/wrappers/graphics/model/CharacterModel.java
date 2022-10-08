
package org.powerbot.game.api.wrappers.graphics.model;

import org.powerbot.game.api.methods.Calculations;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.Model;
import org.powerbot.game.api.wrappers.interactive.Character;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;

public class CharacterModel extends CapturedModel
{
    private final Character character;
    private final int[] x_base;
    private final int[] z_base;
    
    public CharacterModel(final Model model, final Character character) {
        final boolean b = SceneObjectModel.b;
        super(model);
        this.character = character;
        this.x_base = this.xPoints;
        this.z_base = this.zPoints;
        this.xPoints = new int[this.numVertices];
        this.zPoints = new int[this.numVertices];
        if (b) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
    
    @Override
    protected int getLocalX() {
        return (int)this.character.getRenderableLocation().getX();
    }
    
    @Override
    protected int getLocalY() {
        return (int)this.character.getRenderableLocation().getY();
    }
    
    @Override
    protected void update() {
        final boolean b = SceneObjectModel.b;
        final int n = this.character.getRotation() & 0x3FFF;
        final int n2 = Calculations.SIN_TABLE[n];
        final int n3 = Calculations.COS_TABLE[n];
        int i = 0;
        while (i < this.numVertices) {
            this.xPoints[i] = this.x_base[i] * n3 + this.z_base[i] * n2 >> 15;
            this.zPoints[i] = this.z_base[i] * n3 - this.x_base[i] * n2 >> 15;
            ++i;
            if (b) {
                break;
            }
        }
        boolean b3 = false;
        Label_0128: {
            Label_0122: {
                try {
                    if (Task.a == 0) {
                        return;
                    }
                    final boolean b2 = b;
                    if (b2) {
                        break Label_0122;
                    }
                    break Label_0122;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b2 = b;
                    if (b2) {
                        b3 = false;
                        break Label_0128;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            b3 = true;
        }
        SceneObjectModel.b = b3;
    }
}
