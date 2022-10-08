
package org.powerbot.game.api.wrappers;

import org.powerbot.core.script.job.Task;
import org.powerbot.core.script.wrappers.Item;
import org.powerbot.kb;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.api.wrappers.interactive.Character;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.wrappers.interactive.Player;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.api.wrappers.interactive.NPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.bot.Context;
import org.powerbot.game.client.RSHintArrow;

public class HintArrow implements Verifiable, Locatable
{
    private final RSHintArrow arrow;
    private static final String[] z;
    
    public HintArrow(final RSHintArrow arrow) {
        this.arrow = arrow;
    }
    
    public int getPlane() {
        return this.arrow.getPlane();
    }
    
    public int getType() {
        return this.arrow.getType();
    }
    
    public int getTargetId() {
        return this.arrow.getTargetID();
    }
    
    @Override
    public RegionOffset getRegionOffset() {
        return null;
    }
    
    @Override
    public Tile getLocation() {
        final boolean a = Tile.a;
        final Client client = Context.client();
        final int type = this.getType();
        final int targetId = this.getTargetId();
        Label_0166: {
            boolean b = false;
            Label_0164: {
                Label_0036: {
                    Label_0032: {
                        int n;
                        try {
                            final int n3;
                            final int n2;
                            n = (n2 = (n3 = type));
                            if (a) {
                                break Label_0036;
                            }
                            if (n == 0) {
                                break Label_0032;
                            }
                            break Label_0032;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (n == 0) {
                                return null;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    int n2;
                    int n3 = n2 = type;
                    try {
                        b = true;
                        if (a) {
                            break Label_0166;
                        }
                        if (n2 != (b ? 1 : 0)) {
                            break Label_0164;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                Character character = null;
                final Object lookup = Nodes.lookup(client.getRSNPCNC(), targetId);
                Character character2 = null;
                Label_0140: {
                    boolean b2 = false;
                    Label_0123: {
                        Label_0118: {
                            Label_0081: {
                                Object o;
                                try {
                                    o = lookup;
                                    if (a) {
                                        break Label_0081;
                                    }
                                    if (o == null) {
                                        break Label_0140;
                                    }
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                                try {
                                    b2 = (o instanceof RSNPCNode);
                                    if (a) {
                                        break Label_0123;
                                    }
                                    if (!b2) {
                                        break Label_0118;
                                    }
                                }
                                catch (RuntimeException ex5) {
                                    throw ex5;
                                }
                            }
                            character = new NPC(((RSNPCNode)lookup).getRSNPC());
                            break Label_0140;
                        }
                        final boolean b3 = lookup instanceof RSNPC;
                    }
                    if (b2) {
                        character = new NPC((RSNPC)lookup);
                    }
                    try {
                        character2 = character;
                        if (a) {
                            return character2.getLocation();
                        }
                        if (character2 == null) {
                            return null;
                        }
                    }
                    catch (RuntimeException ex6) {
                        throw ex6;
                    }
                }
                return character2.getLocation();
                location = null;
                return location;
            }
            int n3 = type;
            try {
                if (n3 == (b ? 1 : 0)) {
                    return new Tile(Game.getBaseX() + (this.arrow.getX() >> 9), Game.getBaseY() + (this.arrow.getY() >> 9), this.getPlane());
                }
            }
            catch (RuntimeException ex7) {
                throw ex7;
            }
        }
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        Label_0255: {
            Label_0242: {
                int n5 = 0;
                Label_0237: {
                    int n4;
                    try {
                        final int n6;
                        n4 = (n5 = (n6 = type));
                        if (a) {
                            break Label_0242;
                        }
                        final int n7 = 10;
                        if (n4 == n7) {
                            break Label_0237;
                        }
                        break Label_0255;
                    }
                    catch (RuntimeException ex8) {
                        throw ex8;
                    }
                    try {
                        final int n7 = 10;
                        if (n4 != n7) {
                            break Label_0255;
                        }
                        final int n6 = n5 = targetId;
                    }
                    catch (RuntimeException ex9) {
                        throw ex9;
                    }
                }
                try {
                    if (a) {
                        break Label_0255;
                    }
                    if (n5 < 0) {
                        break Label_0255;
                    }
                }
                catch (RuntimeException ex10) {
                    throw ex10;
                }
            }
            int n6 = targetId;
            try {
                if (n6 >= rsPlayerArray.length) {
                    return null;
                }
            }
            catch (RuntimeException ex11) {
                throw ex11;
            }
        }
        final RSPlayer rsPlayer = rsPlayerArray[targetId];
        try {
            if (rsPlayer != null) {
                return new Player(rsPlayer).getLocation();
            }
        }
        catch (RuntimeException ex12) {
            throw ex12;
        }
        return null;
    }
    
    @Override
    public boolean validate() {
        final boolean a = Tile.a;
        final RSHintArrow[] rsHintArrows = Context.client().getRSHintArrows();
        RSHintArrow[] array = null;
        Label_0035: {
            Label_0031: {
                Label_0028: {
                    try {
                        array = rsHintArrows;
                        if (a) {
                            break Label_0028;
                        }
                        if (array == null) {
                            break Label_0031;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                break Label_0035;
            }
            final RSHintArrow[] array2 = new RSHintArrow[0];
        }
        final RSHintArrow[] array3 = array;
        final int length = array3.length;
        int i = 0;
        while (i < length) {
            final RSHintArrow rsHintArrow = array3[i];
            Label_0078: {
                Label_0075: {
                    try {
                        if (a) {
                            break Label_0078;
                        }
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        final HintArrow hintArrow = this;
                        final RSHintArrow rsHintArrow3 = hintArrow.arrow;
                        if (rsHintArrow2 == rsHintArrow3) {
                            return true;
                        }
                        break Label_0075;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        final RSHintArrow rsHintArrow2 = rsHintArrow;
                        final HintArrow hintArrow = this;
                        final RSHintArrow rsHintArrow3 = hintArrow.arrow;
                        if (rsHintArrow2 == rsHintArrow3) {
                            return true;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                ++i;
            }
            if (a) {
                break;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        final boolean a = Tile.a;
        String string = null;
        boolean a2 = false;
        Label_0150: {
            Label_0144: {
                try {
                    string = HintArrow.class.getName() + kb.a(HintArrow.z[3]) + (this.arrow.getX() >> 9) + Item.e(HintArrow.z[4]) + (this.arrow.getY() >> 9) + kb.a(HintArrow.z[0]) + this.getType() + Item.e(HintArrow.z[2]) + this.getTargetId() + kb.a(HintArrow.z[1]) + this.getLocation() + ']';
                    if (Task.a == 0) {
                        return string;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0144;
                    }
                    break Label_0144;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0150;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        Tile.a = a2;
        return string;
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "a?<\u001aM1";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0146: {
                    if (n7 > 1) {
                        break Label_0146;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'Z';
                                break;
                            }
                            case 1: {
                                c2 = '\u001d';
                                break;
                            }
                            case 2: {
                                c2 = 'R';
                                break;
                            }
                            case 3: {
                                c2 = '<';
                                break;
                            }
                            default: {
                                c2 = '?';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "a'*\tIxckET";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "A0\u0004\u0017of^6";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "Wr9";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "/S6";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
    }
}
