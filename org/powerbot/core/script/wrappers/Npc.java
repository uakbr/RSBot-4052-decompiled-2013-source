
package org.powerbot.core.script.wrappers;

import org.powerbot.game.client.RSCharacter;
import org.powerbot.game.client.HashTable;
import org.powerbot.game.client.Client;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.core.script.internal.Nodes;
import org.powerbot.core.Bot;
import org.powerbot.game.client.RSNPCDef;
import org.powerbot.game.client.RSNPC;
import java.lang.ref.WeakReference;

public class Npc extends Character
{
    private final WeakReference<RSNPC> npc;
    
    public Npc(final RSNPC referent) {
        this.npc = new WeakReference<RSNPC>(referent);
    }
    
    @Override
    protected RSNPC getAccessor() {
        return this.npc.get();
    }
    
    @Override
    public String getName() {
        final int a = Component.a;
        final RSNPC accessor = this.getAccessor();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsnpc == null) {
                    return null;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSNPCDef rsnpcDef2;
        final RSNPCDef rsnpcDef = rsnpcDef2 = rsnpc.getRSNPCDef();
        try {
            if (a != 0) {
                return rsnpcDef2.getName();
            }
            if (rsnpcDef == null) {
                return null;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        rsnpcDef2 = rsnpcDef;
        return rsnpcDef2.getName();
        name = null;
        return name;
    }
    
    @Override
    public int getLevel() {
        final int a = Component.a;
        final RSNPC accessor = this.getAccessor();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsnpc == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSNPCDef rsnpcDef2;
        final RSNPCDef rsnpcDef = rsnpcDef2 = rsnpc.getRSNPCDef();
        try {
            if (a != 0) {
                return rsnpcDef2.getLevel();
            }
            if (rsnpcDef == null) {
                return -1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        rsnpcDef2 = rsnpcDef;
        return rsnpcDef2.getLevel();
        level = -1;
        return level;
    }
    
    public int getId() {
        final int a = Component.a;
        final RSNPC accessor = this.getAccessor();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsnpc == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSNPCDef rsnpcDef2;
        final RSNPCDef rsnpcDef = rsnpcDef2 = rsnpc.getRSNPCDef();
        try {
            if (a != 0) {
                return rsnpcDef2.getID();
            }
            if (rsnpcDef == null) {
                return -1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        rsnpcDef2 = rsnpcDef;
        return rsnpcDef2.getID();
        id = -1;
        return id;
    }
    
    public String[] getActions() {
        final int a = Component.a;
        final RSNPC accessor = this.getAccessor();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsnpc == null) {
                    return null;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSNPCDef rsnpcDef2;
        final RSNPCDef rsnpcDef = rsnpcDef2 = rsnpc.getRSNPCDef();
        try {
            if (a != 0) {
                return rsnpcDef2.getActions();
            }
            if (rsnpcDef == null) {
                return null;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        rsnpcDef2 = rsnpcDef;
        return rsnpcDef2.getActions();
        actions = null;
        return actions;
    }
    
    public int getPrayerIcon() {
        final int a = Component.a;
        final RSNPC accessor = this.getAccessor();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsnpc == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSNPCDef rsnpcDef2;
        final RSNPCDef rsnpcDef = rsnpcDef2 = rsnpc.getRSNPCDef();
        try {
            if (a != 0) {
                return rsnpcDef2.getPrayerIcon();
            }
            if (rsnpcDef == null) {
                return -1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        rsnpcDef2 = rsnpcDef;
        return rsnpcDef2.getPrayerIcon();
        prayerIcon = -1;
        return prayerIcon;
    }
    
    @Override
    public boolean isValid() {
        final int a = Component.a;
        final Client client = Bot.client();
        try {
            if (client == null) {
                return false;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final RSNPC accessor = this.getAccessor();
        if (accessor != null) {
            final int[] rsnpcIndexArray = client.getRSNPCIndexArray();
            final HashTable rsnpcnc = client.getRSNPCNC();
            final int[] array = rsnpcIndexArray;
            final int length = array.length;
            int i = 0;
            while (i < length) {
                final int n2;
                final int n = n2 = array[i];
                if (a != 0) {
                    return n2 != 0;
                }
                Object o = Nodes.lookup(rsnpcnc, rsnpcIndexArray[n]);
                Label_0169: {
                    Label_0155: {
                        boolean b3 = false;
                        boolean equals = false;
                        Label_0145: {
                            boolean b2 = false;
                            Label_0133: {
                                Label_0128: {
                                    Label_0101: {
                                        Object o2 = null;
                                        Label_0099: {
                                            try {
                                                o2 = o;
                                                if (a != 0) {
                                                    break Label_0101;
                                                }
                                                if (o2 != null) {
                                                    break Label_0099;
                                                }
                                            }
                                            catch (RuntimeException ex2) {
                                                throw ex2;
                                            }
                                            break Label_0169;
                                        }
                                        try {
                                            final boolean b = b2 = (equals = (b3 = (o2 instanceof RSNPCNode)));
                                            if (a != 0) {
                                                break Label_0133;
                                            }
                                            if (!b) {
                                                break Label_0128;
                                            }
                                        }
                                        catch (RuntimeException ex3) {
                                            throw ex3;
                                        }
                                    }
                                    o = ((RSNPCNode)o).getRSNPC();
                                }
                                equals = (b2 = (b3 = (o instanceof RSNPC)));
                                try {
                                    if (a != 0) {
                                        break Label_0155;
                                    }
                                    if (b2) {
                                        break Label_0145;
                                    }
                                    break Label_0169;
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            try {
                                if (!b2) {
                                    break Label_0169;
                                }
                                b3 = (equals = o.equals(accessor));
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            if (a != 0) {
                                return b3;
                            }
                            if (!equals) {
                                break Label_0169;
                            }
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    return true;
                }
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
        int n2 = 0;
        return n2 != 0;
    }
}
