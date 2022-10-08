
package org.powerbot.core.script.wrappers;

import java.util.Arrays;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.client.Client;
import org.powerbot.core.script.methods.Game;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.core.script.internal.Nodes;
import org.powerbot.core.Bot;
import org.powerbot.game.client.RSHintArrow;
import java.lang.ref.WeakReference;

public class HintArrow implements Locatable, Validatable
{
    private final WeakReference<RSHintArrow> arrow;
    
    public HintArrow(final RSHintArrow referent) {
        this.arrow = new WeakReference<RSHintArrow>(referent);
    }
    
    public int getType() {
        final RSHintArrow rsHintArrow = this.arrow.get();
        RSHintArrow rsHintArrow2;
        try {
            rsHintArrow2 = rsHintArrow;
            if (Component.a != 0) {
                return rsHintArrow2.getType();
            }
            if (rsHintArrow2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsHintArrow2.getType();
        type = -1;
        return type;
    }
    
    public int getTargetId() {
        final RSHintArrow rsHintArrow = this.arrow.get();
        RSHintArrow rsHintArrow2;
        try {
            rsHintArrow2 = rsHintArrow;
            if (Component.a != 0) {
                return rsHintArrow2.getTargetID();
            }
            if (rsHintArrow2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsHintArrow2.getTargetID();
        targetID = -1;
        return targetID;
    }
    
    public int getPlane() {
        final RSHintArrow rsHintArrow = this.arrow.get();
        RSHintArrow rsHintArrow2;
        try {
            rsHintArrow2 = rsHintArrow;
            if (Component.a != 0) {
                return rsHintArrow2.getPlane();
            }
            if (rsHintArrow2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsHintArrow2.getPlane();
        plane = -1;
        return plane;
    }
    
    @Override
    public Tile getLocation() {
        final int a = Component.a;
        final Client client = Bot.client();
        final RSHintArrow rsHintArrow = this.arrow.get();
        Label_0032: {
            try {
                if (client == null) {
                    break Label_0032;
                }
                final RSHintArrow rsHintArrow2 = rsHintArrow;
                if (rsHintArrow2 == null) {
                    break Label_0032;
                }
                break Label_0032;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final RSHintArrow rsHintArrow2 = rsHintArrow;
                if (rsHintArrow2 == null) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final int type = this.getType();
        final int targetId = this.getTargetId();
        int n3 = 0;
        boolean b2 = false;
        Label_0212: {
            Label_0210: {
                Label_0081: {
                    Label_0077: {
                        boolean b = false;
                        Label_0065: {
                            Label_0060: {
                                int n;
                                try {
                                    final int n2;
                                    n = ((b = ((n2 = (n3 = type)) != 0)) ? 1 : 0);
                                    if (a != 0) {
                                        break Label_0065;
                                    }
                                    final int n4 = -1;
                                    if (n != n4) {
                                        break Label_0060;
                                    }
                                    break Label_0077;
                                }
                                catch (RuntimeException ex3) {
                                    throw ex3;
                                }
                                try {
                                    final int n4 = -1;
                                    if (n == n4) {
                                        break Label_0077;
                                    }
                                    final int n2 = (b = ((n3 = type) != 0)) ? 1 : 0;
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            try {
                                if (a != 0) {
                                    break Label_0081;
                                }
                                if (!b) {
                                    break Label_0077;
                                }
                                break Label_0077;
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            if (!b) {
                                return null;
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    int n2;
                    n3 = (n2 = type);
                    try {
                        b2 = true;
                        if (a != 0) {
                            break Label_0212;
                        }
                        if (n2 != (b2 ? 1 : 0)) {
                            break Label_0210;
                        }
                    }
                    catch (RuntimeException ex7) {
                        throw ex7;
                    }
                }
                Character character = null;
                final Object lookup = Nodes.lookup(client.getRSNPCNC(), targetId);
                Character character2 = null;
                Label_0186: {
                    boolean b3 = false;
                    Label_0169: {
                        Label_0164: {
                            Label_0127: {
                                Object o;
                                try {
                                    o = lookup;
                                    if (a != 0) {
                                        break Label_0127;
                                    }
                                    if (o == null) {
                                        break Label_0186;
                                    }
                                }
                                catch (RuntimeException ex8) {
                                    throw ex8;
                                }
                                try {
                                    b3 = (o instanceof RSNPCNode);
                                    if (a != 0) {
                                        break Label_0169;
                                    }
                                    if (!b3) {
                                        break Label_0164;
                                    }
                                }
                                catch (RuntimeException ex9) {
                                    throw ex9;
                                }
                            }
                            character = new Npc(((RSNPCNode)lookup).getRSNPC());
                            break Label_0186;
                        }
                        final boolean b4 = lookup instanceof RSNPC;
                    }
                    if (b3) {
                        character = new Npc((RSNPC)lookup);
                    }
                    try {
                        character2 = character;
                        if (a != 0) {
                            return character2.getLocation();
                        }
                        if (character2 == null) {
                            return null;
                        }
                    }
                    catch (RuntimeException ex10) {
                        throw ex10;
                    }
                }
                return character2.getLocation();
                location = null;
                return location;
            }
            n3 = type;
        }
        if (n3 == (b2 ? 1 : 0)) {
            final Tile mapBase = Game.getMapBase();
            Tile derive = null;
            Label_0234: {
                Tile tile;
                try {
                    tile = (derive = mapBase);
                    if (a != 0) {
                        return derive;
                    }
                    if (tile != null) {
                        break Label_0234;
                    }
                    return null;
                }
                catch (RuntimeException ex11) {
                    throw ex11;
                }
                try {
                    if (tile == null) {
                        return null;
                    }
                    derive = mapBase.derive(rsHintArrow.getX() >> 9, rsHintArrow.getY() >> 9, this.getPlane());
                }
                catch (RuntimeException ex12) {
                    throw ex12;
                }
            }
            return derive;
            derive = null;
            return derive;
        }
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        Label_0313: {
            Label_0299: {
                int n6 = 0;
                Label_0293: {
                    int n5;
                    try {
                        final int n7;
                        n5 = (n6 = (n7 = type));
                        if (a != 0) {
                            break Label_0299;
                        }
                        final int n8 = 10;
                        if (n5 == n8) {
                            break Label_0293;
                        }
                        break Label_0313;
                    }
                    catch (RuntimeException ex13) {
                        throw ex13;
                    }
                    try {
                        final int n8 = 10;
                        if (n5 != n8) {
                            break Label_0313;
                        }
                        final int n7 = n6 = targetId;
                    }
                    catch (RuntimeException ex14) {
                        throw ex14;
                    }
                }
                try {
                    if (a != 0) {
                        break Label_0313;
                    }
                    if (n6 < 0) {
                        break Label_0313;
                    }
                }
                catch (RuntimeException ex15) {
                    throw ex15;
                }
            }
            int n7 = targetId;
            try {
                if (n7 >= rsPlayerArray.length) {
                    return null;
                }
            }
            catch (RuntimeException ex16) {
                throw ex16;
            }
        }
        final RSPlayer rsPlayer = rsPlayerArray[targetId];
        try {
            if (rsPlayer != null) {
                return new Player(rsPlayer).getLocation();
            }
        }
        catch (RuntimeException ex17) {
            throw ex17;
        }
        return null;
    }
    
    @Override
    public boolean isValid() {
        final int a = Component.a;
        final Client client = Bot.client();
        Object value = null;
        Label_0032: {
            Label_0025: {
                Client client2;
                try {
                    client2 = (Client)(value = client);
                    if (a != 0) {
                        break Label_0032;
                    }
                    if (client2 == null) {
                        return false;
                    }
                    break Label_0025;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            value = this.arrow.get();
        }
        final RSHintArrow rsHintArrow = (RSHintArrow)value;
        final RSHintArrow[] rsHintArrows = client.getRSHintArrows();
        boolean contains = false;
        Label_0090: {
            Label_0065: {
                Label_0057: {
                    try {
                        if (rsHintArrow == null) {
                            break Label_0090;
                        }
                        final RSHintArrow[] array;
                        final RSHintArrow[] a2 = array = rsHintArrows;
                        final int n = a;
                        if (n == 0) {
                            break Label_0057;
                        }
                        break Label_0065;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final RSHintArrow[] array;
                        final RSHintArrow[] a2 = array = rsHintArrows;
                        final int n = a;
                        if (n != 0) {
                            break Label_0065;
                        }
                        if (array == null) {
                            break Label_0090;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                final RSHintArrow[] a2 = rsHintArrows;
                try {
                    contains = Arrays.asList(a2).contains(rsHintArrow);
                    if (a != 0) {
                        return contains;
                    }
                    if (!contains) {
                        break Label_0090;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            return contains;
        }
        return contains;
    }
}
