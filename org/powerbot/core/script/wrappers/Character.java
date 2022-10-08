
package org.powerbot.core.script.wrappers;

import org.powerbot.game.client.LinkedList;
import org.powerbot.game.client.LinkedListNode;
import org.powerbot.core.script.methods.Calculations;
import java.awt.geom.Point2D;
import java.awt.Point;
import org.powerbot.game.client.RSInteractableLocation;
import org.powerbot.game.client.RSInteractableData;
import org.powerbot.core.script.methods.Game;
import org.powerbot.game.client.CombatStatusData;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.client.Client;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.core.script.internal.Nodes;
import org.powerbot.core.Bot;
import org.powerbot.game.client.RSMessageData;
import org.powerbot.game.client.Sequence;
import org.powerbot.game.client.RSAnimator;
import org.powerbot.game.client.RSCharacter;

public abstract class Character implements Locatable, Targetable, Validatable
{
    private int faceIndex;
    
    public Character() {
        this.faceIndex = -1;
    }
    
    protected abstract RSCharacter getAccessor();
    
    public Model getModel() {
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter = null;
        Label_0020: {
            try {
                rsCharacter = accessor;
                if (Component.a != 0) {
                    break Label_0020;
                }
                if (rsCharacter == null) {
                    return null;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        final org.powerbot.game.client.Model model = rsCharacter.getModel();
        try {
            if (model != null) {
                return new CharacterModel(model, accessor);
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return null;
    }
    
    public abstract String getName();
    
    public abstract int getLevel();
    
    public int getOrientation() {
        final RSCharacter accessor = this.getAccessor();
        try {
            if (accessor != null) {
                return (630 - accessor.getOrientation() * 45 / 2048) % 360;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return 0;
    }
    
    public int getHeight() {
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter;
        try {
            rsCharacter = accessor;
            if (Component.a != 0) {
                return rsCharacter.getHeight();
            }
            if (rsCharacter == null) {
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.getHeight();
        height = 0;
        return height;
    }
    
    public int getAnimation() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter2 = null;
        Label_0027: {
            Label_0026: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = accessor);
                    if (a != 0) {
                        break Label_0027;
                    }
                    if (rsCharacter == null) {
                        return -1;
                    }
                    break Label_0026;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsCharacter == null) {
                        return -1;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsCharacter2 = accessor;
        }
        final RSAnimator animation = rsCharacter2.getAnimation();
        RSAnimator rsAnimator = null;
        Label_0047: {
            try {
                rsAnimator = animation;
                if (a != 0) {
                    break Label_0047;
                }
                if (rsAnimator == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        Sequence sequence3;
        final Sequence sequence2;
        final Sequence sequence = sequence2 = (sequence3 = rsAnimator.getSequence());
        Label_0069: {
            try {
                if (a != 0) {
                    return sequence3.getID();
                }
                if (sequence == null) {
                    return -1;
                }
                break Label_0069;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            try {
                if (sequence == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        sequence3 = sequence2;
        return sequence3.getID();
    }
    
    public int getStance() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter2 = null;
        Label_0027: {
            Label_0026: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = accessor);
                    if (a != 0) {
                        break Label_0027;
                    }
                    if (rsCharacter == null) {
                        return -1;
                    }
                    break Label_0026;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsCharacter == null) {
                        return -1;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsCharacter2 = accessor;
        }
        final RSAnimator passiveAnimation = rsCharacter2.getPassiveAnimation();
        RSAnimator rsAnimator = null;
        Label_0047: {
            try {
                rsAnimator = passiveAnimation;
                if (a != 0) {
                    break Label_0047;
                }
                if (rsAnimator == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        Sequence sequence3;
        final Sequence sequence2;
        final Sequence sequence = sequence2 = (sequence3 = rsAnimator.getSequence());
        Label_0069: {
            try {
                if (a != 0) {
                    return sequence3.getID();
                }
                if (sequence == null) {
                    return -1;
                }
                break Label_0069;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            try {
                if (sequence == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        sequence3 = sequence2;
        return sequence3.getID();
    }
    
    public int[] getAnimationQueue() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter2 = null;
        Label_0027: {
            Label_0021: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = accessor);
                    if (a != 0) {
                        break Label_0027;
                    }
                    if (rsCharacter == null) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsCharacter == null) {
                        return new int[0];
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsCharacter2 = accessor;
        }
        final int[] animationQueue = rsCharacter2.getAnimationQueue();
        int[] array = null;
        Label_0049: {
            try {
                array = animationQueue;
                if (a != 0) {
                    return array;
                }
                if (array == null) {
                    break Label_0049;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            return array;
        }
        final int[] array2 = new int[0];
        return array;
    }
    
    public int getSpeed() {
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter;
        try {
            rsCharacter = accessor;
            if (Component.a != 0) {
                return rsCharacter.isMoving();
            }
            if (rsCharacter == null) {
                return 0;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.isMoving();
        moving = 0;
        return moving;
    }
    
    public boolean isMoving() {
        int speed = 0;
        Label_0021: {
            try {
                speed = this.getSpeed();
                if (Component.a != 0) {
                    return speed != 0;
                }
                if (speed == 0) {
                    break Label_0021;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return speed != 0;
        }
        return speed != 0;
    }
    
    public String getMessage() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter2 = null;
        Label_0025: {
            Label_0021: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = accessor);
                    if (a != 0) {
                        break Label_0025;
                    }
                    if (rsCharacter == null) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsCharacter == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsCharacter2 = accessor;
        }
        final RSMessageData messageData = rsCharacter2.getMessageData();
        RSMessageData rsMessageData;
        try {
            rsMessageData = messageData;
            if (a != 0) {
                return rsMessageData.getMessage();
            }
            if (rsMessageData == null) {
                return null;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return rsMessageData.getMessage();
        message = null;
        return message;
    }
    
    public Character getInteracting() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        int interacting = 0;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = accessor;
                        if (a != 0) {
                            break Label_0024;
                        }
                        if (rsCharacter == null) {
                            break Label_0032;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                interacting = rsCharacter.getInteracting();
                break Label_0033;
            }
            interacting = -1;
        }
        final int n = interacting;
        try {
            if (n == -1) {
                return null;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        final Client client = Bot.client();
        try {
            if (client == null) {
                return null;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        int n2 = 0;
        int n3 = 0;
        Label_0158: {
            try {
                n2 = n;
                n3 = 32768;
                if (a != 0) {
                    break Label_0158;
                }
                if (n2 >= n3) {
                    break Label_0158;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            final Object lookup = Nodes.lookup(client.getRSNPCNC(), n);
            Label_0139: {
                Label_0115: {
                    boolean b = false;
                    Label_0100: {
                        Label_0095: {
                            RSNPC rsnpc;
                            try {
                                final Object o;
                                rsnpc = (RSNPC)(o = lookup);
                                if (a != 0) {
                                    break Label_0100;
                                }
                                if (rsnpc == null) {
                                    break Label_0095;
                                }
                                break Label_0095;
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                            try {
                                if (rsnpc == null) {
                                    return null;
                                }
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        Object o = lookup;
                        try {
                            final boolean b2;
                            b = (b2 = (o instanceof RSNPCNode));
                            if (a != 0) {
                                break Label_0139;
                            }
                            if (b) {
                                break Label_0115;
                            }
                            break Label_0115;
                        }
                        catch (RuntimeException ex7) {
                            throw ex7;
                        }
                    }
                    try {
                        if (b) {
                            return new Npc(((RSNPCNode)lookup).getRSNPC());
                        }
                    }
                    catch (RuntimeException ex8) {
                        throw ex8;
                    }
                }
                boolean b2 = lookup instanceof RSNPC;
                try {
                    if (b2) {
                        return new Npc((RSNPC)lookup);
                    }
                }
                catch (RuntimeException ex9) {
                    throw ex9;
                }
            }
            return null;
        }
        final int n4 = n2 - n3;
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        Label_0188: {
            int n5;
            try {
                n5 = n4;
                if (a != 0) {
                    break Label_0188;
                }
                if (n5 < 0) {
                    return null;
                }
            }
            catch (RuntimeException ex10) {
                throw ex10;
            }
            try {
                if (n5 < rsPlayerArray.length) {
                    return new Player(rsPlayerArray[n4]);
                }
            }
            catch (RuntimeException ex11) {
                throw ex11;
            }
        }
        return null;
    }
    
    public int getAdrenalineRatio() {
        final int a = Component.a;
        final CombatStatusData[] barData = this.getBarData();
        Label_0038: {
            CombatStatusData combatStatusData = null;
            Label_0022: {
                CombatStatusData[] array;
                try {
                    array = barData;
                    if (a != 0) {
                        break Label_0022;
                    }
                    if (array == null) {
                        return 0;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final CombatStatusData combatStatusData2;
                    combatStatusData = (combatStatusData2 = array[0]);
                    if (a != 0) {
                        return combatStatusData2.getHPRatio();
                    }
                    if (combatStatusData == null) {
                        return 0;
                    }
                    break Label_0038;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (combatStatusData == null) {
                    return 0;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        CombatStatusData combatStatusData2 = barData[0];
        return combatStatusData2.getHPRatio();
    }
    
    public int getHealthRatio() {
        final int a = Component.a;
        final CombatStatusData[] barData = this.getBarData();
        Label_0039: {
            CombatStatusData combatStatusData = null;
            Label_0022: {
                CombatStatusData[] array;
                try {
                    array = barData;
                    if (a != 0) {
                        break Label_0022;
                    }
                    if (array == null) {
                        return 100;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final CombatStatusData combatStatusData2;
                    combatStatusData = (combatStatusData2 = array[1]);
                    if (a != 0) {
                        return combatStatusData2.getHPRatio();
                    }
                    if (combatStatusData == null) {
                        return 100;
                    }
                    break Label_0039;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (combatStatusData == null) {
                    return 100;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        CombatStatusData combatStatusData2 = barData[1];
        return combatStatusData2.getHPRatio();
    }
    
    public int getAdrenalinePercent() {
        final CombatStatusData[] barData = this.getBarData();
        Label_0020: {
            CombatStatusData[] array;
            try {
                array = barData;
                if (Component.a != 0) {
                    break Label_0020;
                }
                if (array == null) {
                    return 0;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (array[0] == null) {
                    return 0;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return this.toPercent(barData[0].getHPRatio());
    }
    
    public int getHealthPercent() {
        final CombatStatusData[] barData = this.getBarData();
        Label_0020: {
            CombatStatusData[] array;
            try {
                array = barData;
                if (Component.a != 0) {
                    break Label_0020;
                }
                if (array == null) {
                    return 100;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (array[1] == null) {
                    return 100;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return this.toPercent(barData[1].getHPRatio());
    }
    
    public boolean isInCombat() {
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
        final CombatStatusData[] barData = this.getBarData();
        int loopCycleStatus = 0;
        Label_0075: {
            int n = 0;
            Label_0053: {
                CombatStatusData combatStatusData2 = null;
                Label_0046: {
                    CombatStatusData combatStatusData = null;
                    Label_0033: {
                        CombatStatusData[] array;
                        try {
                            array = barData;
                            if (a != 0) {
                                break Label_0033;
                            }
                            if (array == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                        try {
                            combatStatusData = (combatStatusData2 = array[1]);
                            if (a != 0) {
                                break Label_0053;
                            }
                            if (combatStatusData != null) {
                                break Label_0046;
                            }
                            return false;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (combatStatusData == null) {
                            return false;
                        }
                        combatStatusData2 = barData[1];
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                try {
                    n = (loopCycleStatus = combatStatusData2.getLoopCycleStatus());
                    if (a != 0) {
                        return loopCycleStatus != 0;
                    }
                    final Client client2 = client;
                    final int n2 = client2.getLoopCycle();
                    if (n < n2) {
                        break Label_0075;
                    }
                    return false;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            try {
                final Client client2 = client;
                final int n2 = client2.getLoopCycle();
                if (n >= n2) {
                    return false;
                }
                loopCycleStatus = (true ? 1 : 0);
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
        }
        return loopCycleStatus != 0;
        loopCycleStatus = (false ? 1 : 0);
        return loopCycleStatus != 0;
    }
    
    @Override
    public Tile getLocation() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSInteractableData data = null;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = accessor;
                        if (a != 0) {
                            break Label_0024;
                        }
                        if (rsCharacter == null) {
                            break Label_0032;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                data = rsCharacter.getData();
                break Label_0033;
            }
            data = null;
        }
        final RSInteractableData rsInteractableData = data;
        RSInteractableLocation location = null;
        Label_0057: {
            Label_0056: {
                RSInteractableData rsInteractableData2 = null;
                Label_0048: {
                    try {
                        rsInteractableData2 = rsInteractableData;
                        if (a != 0) {
                            break Label_0048;
                        }
                        if (rsInteractableData2 == null) {
                            break Label_0056;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                location = rsInteractableData2.getLocation();
                break Label_0057;
            }
            location = null;
        }
        final RSInteractableLocation rsInteractableLocation = location;
        if (rsInteractableLocation != null) {
            final Tile mapBase = Game.getMapBase();
            Tile derive = null;
            Label_0081: {
                Tile tile;
                try {
                    tile = (derive = mapBase);
                    if (a != 0) {
                        return derive;
                    }
                    if (tile != null) {
                        break Label_0081;
                    }
                    return null;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    if (tile == null) {
                        return null;
                    }
                    derive = mapBase.derive((int)rsInteractableLocation.getX() >> 9, (int)rsInteractableLocation.getY() >> 9, accessor.getPlane());
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return derive;
            derive = null;
            return derive;
        }
        return null;
    }
    
    @Override
    public Point getInteractPoint() {
        final int a = Component.a;
        final Model model = this.getModel();
        Model model2 = null;
        Label_0022: {
            try {
                model2 = model;
                if (a != 0) {
                    break Label_0022;
                }
                if (model2 == null) {
                    return this.getScreenPoint();
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        Point point = model2.getCentroid(this.faceIndex);
        Point point3 = null;
        Label_0060: {
            Label_0045: {
                Point point2;
                try {
                    final Point screenPoint;
                    point2 = (point3 = (screenPoint = point));
                    if (a != 0) {
                        break Label_0060;
                    }
                    if (point2 != null) {
                        return point;
                    }
                    break Label_0045;
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    if (point2 != null) {
                        return point;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            final Model model3 = model;
            final int nextTriangle = model.nextTriangle();
            this.faceIndex = nextTriangle;
            point = model3.getCentroid(nextTriangle);
            Point screenPoint = point3 = point;
            try {
                if (a != 0) {
                    return screenPoint;
                }
                if (point3 != null) {
                    return point;
                }
                return this.getScreenPoint();
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        try {
            if (point3 != null) {
                return point;
            }
        }
        catch (RuntimeException ex5) {
            throw ex5;
        }
        return this.getScreenPoint();
    }
    
    @Override
    public Point getNextPoint() {
        final Model model = this.getModel();
        Model model2;
        try {
            model2 = model;
            if (Component.a != 0) {
                return model2.getNextPoint();
            }
            if (model2 == null) {
                return this.getScreenPoint();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return model2.getNextPoint();
    }
    
    @Override
    public Point getCenterPoint() {
        final Model model = this.getModel();
        Model model2;
        try {
            model2 = model;
            if (Component.a != 0) {
                return model2.getCenterPoint();
            }
            if (model2 == null) {
                return this.getScreenPoint();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return model2.getCenterPoint();
    }
    
    @Override
    public boolean contains(final Point point) {
        final int a = Component.a;
        final Model model = this.getModel();
        double n = 0.0;
        Label_0054: {
            Label_0027: {
                Model model2;
                try {
                    model2 = model;
                    if (a != 0) {
                        return model2.contains(point);
                    }
                    if (model2 == null) {
                        break Label_0027;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return model2.contains(point);
                try {
                    n = dcmpg(point.distance(this.getScreenPoint()), 15.0);
                    if (a != 0) {
                        return n != 0.0;
                    }
                    if (n >= 0) {
                        break Label_0054;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return n != 0.0;
        }
        return n != 0.0;
    }
    
    private Point getScreenPoint() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSInteractableData data = null;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = accessor;
                        if (a != 0) {
                            break Label_0024;
                        }
                        if (rsCharacter == null) {
                            break Label_0032;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                data = rsCharacter.getData();
                break Label_0033;
            }
            data = null;
        }
        final RSInteractableData rsInteractableData = data;
        RSInteractableLocation location = null;
        Label_0057: {
            Label_0056: {
                RSInteractableData rsInteractableData2 = null;
                Label_0048: {
                    try {
                        rsInteractableData2 = rsInteractableData;
                        if (a != 0) {
                            break Label_0048;
                        }
                        if (rsInteractableData2 == null) {
                            break Label_0056;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                location = rsInteractableData2.getLocation();
                break Label_0057;
            }
            location = null;
        }
        final RSInteractableLocation rsInteractableLocation = location;
        RSInteractableLocation rsInteractableLocation2;
        try {
            rsInteractableLocation2 = rsInteractableLocation;
            if (a != 0) {
                return Calculations.groundToScreen((int)rsInteractableLocation2.getX(), (int)rsInteractableLocation.getY(), accessor.getPlane(), accessor.getHeight() / 2);
            }
            if (rsInteractableLocation2 == null) {
                return new Point(-1, -1);
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return Calculations.groundToScreen((int)rsInteractableLocation2.getX(), (int)rsInteractableLocation.getY(), accessor.getPlane(), accessor.getHeight() / 2);
    }
    
    private LinkedListNode[] getBarNodes() {
        final int a = Component.a;
        final RSCharacter accessor = this.getAccessor();
        RSCharacter rsCharacter2 = null;
        Label_0027: {
            Label_0023: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = accessor);
                    if (a != 0) {
                        break Label_0027;
                    }
                    if (rsCharacter == null) {
                        break Label_0023;
                    }
                    break Label_0023;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (rsCharacter == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            rsCharacter2 = accessor;
        }
        final LinkedList combatStatusList = rsCharacter2.getCombatStatusList();
        LinkedList list2 = null;
        Label_0050: {
            Label_0046: {
                LinkedList list;
                try {
                    list = (list2 = combatStatusList);
                    if (a != 0) {
                        break Label_0050;
                    }
                    if (list == null) {
                        break Label_0046;
                    }
                    break Label_0046;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    if (list == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            list2 = combatStatusList;
        }
        final LinkedListNode tail = list2.getTail();
        final LinkedListNode next = tail.getNext();
        Label_0106: {
            LinkedListNode next2 = null;
            Label_0084: {
                LinkedListNode linkedListNode;
                try {
                    linkedListNode = (next2 = next.getNext());
                    if (a != 0) {
                        break Label_0084;
                    }
                    final LinkedListNode linkedListNode2 = tail;
                    if (linkedListNode != linkedListNode2) {
                        break Label_0084;
                    }
                    break Label_0106;
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
                try {
                    final LinkedListNode linkedListNode2 = tail;
                    if (linkedListNode == linkedListNode2) {
                        break Label_0106;
                    }
                    next2 = next;
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            final LinkedListNode linkedListNode3 = next2;
            final LinkedListNode next3 = next.getNext();
            if (a == 0) {
                return new LinkedListNode[] { linkedListNode3, next3 };
            }
        }
        final LinkedListNode linkedListNode3 = null;
        final LinkedListNode next3 = next;
        return new LinkedListNode[] { linkedListNode3, next3 };
    }
    
    private CombatStatusData[] getBarData() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/core/script/wrappers/Character.getBarNodes:()[Lorg/powerbot/game/client/LinkedListNode;
        //     9: astore_1       
        //    10: aload_1        
        //    11: iload           6
        //    13: ifne            27
        //    16: ifnonnull       26
        //    19: goto            23
        //    22: athrow         
        //    23: aconst_null    
        //    24: areturn        
        //    25: athrow         
        //    26: aload_1        
        //    27: arraylength    
        //    28: anewarray       Lorg/powerbot/game/client/CombatStatusData;
        //    31: astore_2       
        //    32: iconst_0       
        //    33: istore_3       
        //    34: iload_3        
        //    35: aload_1        
        //    36: arraylength    
        //    37: if_icmpge       168
        //    40: aload_1        
        //    41: iload_3        
        //    42: aaload         
        //    43: iload           6
        //    45: ifne            62
        //    48: ifnull          77
        //    51: goto            55
        //    54: athrow         
        //    55: aload_1        
        //    56: iload_3        
        //    57: aaload         
        //    58: goto            62
        //    61: athrow         
        //    62: iload           6
        //    64: ifne            97
        //    67: instanceof      Lorg/powerbot/game/client/CombatStatus;
        //    70: ifne            90
        //    73: goto            77
        //    76: athrow         
        //    77: aload_2        
        //    78: iload_3        
        //    79: aconst_null    
        //    80: aastore        
        //    81: iload           6
        //    83: ifeq            160
        //    86: goto            90
        //    89: athrow         
        //    90: aload_1        
        //    91: iload_3        
        //    92: aaload         
        //    93: goto            97
        //    96: athrow         
        //    97: checkcast       Lorg/powerbot/game/client/CombatStatus;
        //   100: astore          4
        //   102: aload           4
        //   104: invokeinterface org/powerbot/game/client/CombatStatus.getData:()Lorg/powerbot/game/client/LinkedList;
        //   109: astore          5
        //   111: iload           6
        //   113: ifne            133
        //   116: aload           5
        //   118: ifnonnull       138
        //   121: goto            125
        //   124: athrow         
        //   125: aload_2        
        //   126: iload_3        
        //   127: aconst_null    
        //   128: aastore        
        //   129: goto            133
        //   132: athrow         
        //   133: iload           6
        //   135: ifeq            160
        //   138: aload_2        
        //   139: iload_3        
        //   140: aload           5
        //   142: invokeinterface org/powerbot/game/client/LinkedList.getTail:()Lorg/powerbot/game/client/LinkedListNode;
        //   147: invokeinterface org/powerbot/game/client/LinkedListNode.getNext:()Lorg/powerbot/game/client/LinkedListNode;
        //   152: checkcast       Lorg/powerbot/game/client/CombatStatusData;
        //   155: aastore        
        //   156: goto            160
        //   159: athrow         
        //   160: iinc            3, 1
        //   163: iload           6
        //   165: ifeq            34
        //   168: aload_2        
        //   169: areturn        
        //    StackMapTable: 00 18 FF 00 16 00 07 07 00 41 07 01 18 00 00 00 00 01 00 01 07 01 0B 00 41 07 01 0B 00 40 07 01 18 FF 00 06 00 07 07 00 41 07 01 18 07 01 16 01 00 00 01 00 00 53 07 01 0B 00 45 07 01 0B 40 07 00 3B 4D 07 01 0B 00 4B 07 01 0B 00 45 07 01 0B 40 07 00 3B FF 00 1A 00 07 07 00 41 07 01 18 07 01 16 01 07 00 3E 07 00 B5 01 00 01 07 01 0B 00 46 07 01 0B 00 04 54 07 01 0B FF 00 00 00 07 07 00 41 07 01 18 07 01 16 01 00 00 01 00 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  133    156    159    160    Ljava/lang/RuntimeException;
        //  116    129    132    133    Ljava/lang/RuntimeException;
        //  111    121    124    125    Ljava/lang/RuntimeException;
        //  77     93     96     97     Ljava/lang/RuntimeException;
        //  67     86     89     90     Ljava/lang/RuntimeException;
        //  62     73     76     77     Ljava/lang/RuntimeException;
        //  48     58     61     62     Ljava/lang/RuntimeException;
        //  40     51     54     55     Ljava/lang/RuntimeException;
        //  16     25     25     26     Ljava/lang/RuntimeException;
        //  10     19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0077:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private int toPercent(final int n) {
        return (int)Math.ceil(n * 100 / 255);
    }
}
