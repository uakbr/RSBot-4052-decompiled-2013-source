
package org.powerbot.core.script.wrappers;

import org.powerbot.core.script.methods.Calculations;
import org.powerbot.game.client.RSInteractableLocation;
import org.powerbot.game.client.RSInteractableData;
import java.lang.ref.WeakReference;
import org.powerbot.game.client.RSCharacter;
import java.lang.ref.Reference;

public class CharacterModel extends Model
{
    private final Reference<RSCharacter> character;
    private final int[] x_base;
    private final int[] z_base;
    
    public CharacterModel(final org.powerbot.game.client.Model model, final RSCharacter referent) {
        super(model);
        this.character = new WeakReference<RSCharacter>(referent);
        this.x_base = this.xPoints;
        this.z_base = this.zPoints;
        this.xPoints = new int[this.numVertices];
        this.zPoints = new int[this.numVertices];
    }
    
    @Override
    public int getX() {
        final int a = Component.a;
        final RSCharacter rsCharacter = this.character.get();
        RSInteractableData data = null;
        Label_0039: {
            Label_0038: {
                RSCharacter rsCharacter2 = null;
                Label_0030: {
                    try {
                        rsCharacter2 = rsCharacter;
                        if (a != 0) {
                            break Label_0030;
                        }
                        if (rsCharacter2 == null) {
                            break Label_0038;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                data = rsCharacter2.getData();
                break Label_0039;
            }
            data = null;
        }
        final RSInteractableData rsInteractableData = data;
        RSInteractableLocation location = null;
        Label_0063: {
            Label_0062: {
                RSInteractableData rsInteractableData2 = null;
                Label_0054: {
                    try {
                        rsInteractableData2 = rsInteractableData;
                        if (a != 0) {
                            break Label_0054;
                        }
                        if (rsInteractableData2 == null) {
                            break Label_0062;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                location = rsInteractableData2.getLocation();
                break Label_0063;
            }
            location = null;
        }
        final RSInteractableLocation rsInteractableLocation = location;
        RSInteractableLocation rsInteractableLocation2;
        try {
            rsInteractableLocation2 = rsInteractableLocation;
            if (a != 0) {
                return (int)rsInteractableLocation2.getX();
            }
            if (rsInteractableLocation2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return (int)rsInteractableLocation2.getX();
    }
    
    @Override
    public int getY() {
        final int a = Component.a;
        final RSCharacter rsCharacter = this.character.get();
        RSInteractableData data = null;
        Label_0039: {
            Label_0038: {
                RSCharacter rsCharacter2 = null;
                Label_0030: {
                    try {
                        rsCharacter2 = rsCharacter;
                        if (a != 0) {
                            break Label_0030;
                        }
                        if (rsCharacter2 == null) {
                            break Label_0038;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                data = rsCharacter2.getData();
                break Label_0039;
            }
            data = null;
        }
        final RSInteractableData rsInteractableData = data;
        RSInteractableLocation location = null;
        Label_0063: {
            Label_0062: {
                RSInteractableData rsInteractableData2 = null;
                Label_0054: {
                    try {
                        rsInteractableData2 = rsInteractableData;
                        if (a != 0) {
                            break Label_0054;
                        }
                        if (rsInteractableData2 == null) {
                            break Label_0062;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                location = rsInteractableData2.getLocation();
                break Label_0063;
            }
            location = null;
        }
        final RSInteractableLocation rsInteractableLocation = location;
        RSInteractableLocation rsInteractableLocation2;
        try {
            rsInteractableLocation2 = rsInteractableLocation;
            if (a != 0) {
                return (int)rsInteractableLocation2.getY();
            }
            if (rsInteractableLocation2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return (int)rsInteractableLocation2.getY();
    }
    
    @Override
    public byte getPlane() {
        final RSCharacter rsCharacter = this.character.get();
        RSCharacter rsCharacter2;
        try {
            rsCharacter2 = rsCharacter;
            if (Component.a != 0) {
                return rsCharacter2.getPlane();
            }
            if (rsCharacter2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        int plane = rsCharacter2.getPlane();
        return (byte)plane;
        plane = -1;
        return (byte)plane;
    }
    
    @Override
    public void update() {
        final int a = Component.a;
        final RSCharacter rsCharacter = this.character.get();
        RSCharacter rsCharacter2 = null;
        Label_0030: {
            try {
                rsCharacter2 = rsCharacter;
                if (a != 0) {
                    break Label_0030;
                }
                if (rsCharacter2 != null) {
                    break Label_0030;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return;
        }
        final int n = rsCharacter2.getOrientation() & 0x3FFF;
        final int n2 = Calculations.SIN_TABLE[n];
        final int n3 = Calculations.COS_TABLE[n];
        int i = 0;
        while (i < this.numVertices) {
            this.xPoints[i] = this.x_base[i] * n3 + this.z_base[i] * n2 >> 15;
            this.zPoints[i] = this.z_base[i] * n3 - this.x_base[i] * n2 >> 15;
            ++i;
            if (a != 0) {
                break;
            }
        }
    }
}
