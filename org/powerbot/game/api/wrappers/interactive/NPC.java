
package org.powerbot.game.api.wrappers.interactive;

import org.powerbot.game.client.RSCharacter;
import org.powerbot.game.client.RSNPCDef;
import org.powerbot.game.client.RSNPC;
import java.lang.ref.WeakReference;

public class NPC extends Character
{
    private final WeakReference<RSNPC> n;
    
    public NPC(final RSNPC referent) {
        this.n = new WeakReference<RSNPC>(referent);
    }
    
    @Override
    public int getLevel() {
        final int a = Character.a;
        final RSNPC value = this.get();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = value;
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
    
    @Override
    public String getName() {
        final int a = Character.a;
        final RSNPC value = this.get();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = value;
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
    public int getId() {
        final int a = Character.a;
        final RSNPC value = this.get();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = value;
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
        final int a = Character.a;
        final RSNPC value = this.get();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = value;
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
        final int a = Character.a;
        final RSNPC value = this.get();
        RSNPC rsnpc = null;
        Label_0022: {
            try {
                rsnpc = value;
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
    
    public RSNPC get() {
        return this.n.get();
    }
}
