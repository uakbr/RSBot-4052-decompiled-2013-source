
package org.powerbot.game.api.wrappers.node;

import org.powerbot.core.script.job.Task;
import org.powerbot.a;
import org.p;
import java.awt.Graphics;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.Polygon;
import java.awt.Point;
import java.util.Iterator;
import java.util.Set;
import org.powerbot.game.api.methods.node.SceneEntities;
import org.powerbot.game.client.Model;
import org.powerbot.game.api.wrappers.graphics.model.SceneObjectModel;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;
import org.powerbot.game.client.RSObjectDef;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.bot.Context;
import org.powerbot.game.client.RSInteractableData;
import org.powerbot.game.client.RSInteractable;
import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.client.RSAnimable;
import org.powerbot.game.api.wrappers.Area;
import org.powerbot.game.client.RSObject;
import org.powerbot.game.api.wrappers.Identifiable;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.wrappers.Entity;

public class SceneObject implements Entity, Locatable, Identifiable
{
    private final RSObject object;
    private final int type;
    private final int plane;
    private static final String[] z;
    
    public SceneObject(final RSObject object, final int type, final int plane) {
        this.object = object;
        this.type = type;
        this.plane = plane;
    }
    
    public Area getArea() {
        RSObject rsObject2 = null;
        Label_0020: {
            RSObject rsObject;
            try {
                rsObject = (rsObject2 = this.object);
                if (Item.a != 0) {
                    break Label_0020;
                }
                final boolean b = rsObject instanceof RSAnimable;
                if (b) {
                    break Label_0020;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = rsObject instanceof RSAnimable;
                if (!b) {
                    return null;
                }
                rsObject2 = this.object;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final RSAnimable rsAnimable = (RSAnimable)rsObject2;
        final int baseX = Game.getBaseX();
        final int baseY = Game.getBaseY();
        return new Area(new Tile(baseX + rsAnimable.getX1(), baseY + rsAnimable.getY1(), this.plane), new Tile(baseX + rsAnimable.getX2(), baseY + rsAnimable.getY2(), this.plane));
    }
    
    @Override
    public int getId() {
        return this.object.getId();
    }
    
    public int getType() {
        return this.type;
    }
    
    public int getPlane() {
        return this.plane;
    }
    
    public RSObject getInstance() {
        return this.object;
    }
    
    @Override
    public RegionOffset getRegionOffset() {
        final RSInteractableData data = ((RSInteractable)this.object).getData();
        return new RegionOffset((int)data.getLocation().getX() / 512, (int)data.getLocation().getY() / 512, this.plane);
    }
    
    @Override
    public Tile getLocation() {
        final RegionOffset regionOffset = this.getRegionOffset();
        return new Tile(Game.getBaseX() + regionOffset.getX(), Game.getBaseY() + regionOffset.getY(), regionOffset.getPlane());
    }
    
    public SceneObjectDefinition getDefinition() {
        final Object lookup = Nodes.lookup(Context.client().getRSGroundInfo().getRSObjectDefLoaders().getCache().getTable(), this.getId());
        try {
            if (lookup != null) {
                return new SceneObjectDefinition((RSObjectDef)lookup);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return null;
    }
    
    public CapturedModel getModel() {
        RSObject rsObject2 = null;
        Label_0017: {
            RSObject rsObject;
            try {
                rsObject = (rsObject2 = this.object);
                if (Item.a != 0) {
                    break Label_0017;
                }
                if (rsObject != null) {
                    break Label_0017;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (rsObject == null) {
                    return null;
                }
                rsObject2 = this.object;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Model model = rsObject2.getModel();
        try {
            if (model != null) {
                return new SceneObjectModel(model, this);
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return null;
    }
    
    @Override
    public boolean validate() {
        final int a = Item.a;
        final RegionOffset regionOffset = this.getRegionOffset();
        final Set<SceneObject> local = SceneEntities.getLocalAt(regionOffset.getX(), regionOffset.getY(), -1);
        final int id = this.getId();
        for (final SceneObject sceneObject : local) {
            Label_0107: {
                int id2 = 0;
                Label_0101: {
                    int n = 0;
                    Label_0085: {
                        SceneObject sceneObject3 = null;
                        Label_0079: {
                            SceneObject sceneObject2;
                            try {
                                sceneObject2 = (sceneObject3 = sceneObject);
                                if (a != 0) {
                                    break Label_0085;
                                }
                                final RSObject rsObject = sceneObject2.object;
                                final SceneObject sceneObject4 = this;
                                final RSObject rsObject2 = sceneObject4.object;
                                if (rsObject == rsObject2) {
                                    break Label_0079;
                                }
                                break Label_0107;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                final RSObject rsObject = sceneObject2.object;
                                final SceneObject sceneObject4 = this;
                                final RSObject rsObject2 = sceneObject4.object;
                                if (rsObject != rsObject2) {
                                    break Label_0107;
                                }
                                sceneObject3 = sceneObject;
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            n = (id2 = sceneObject3.getId());
                            if (a != 0) {
                                return id2 != 0;
                            }
                            final int n2 = id;
                            if (n == n2) {
                                break Label_0101;
                            }
                            break Label_0107;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        final int n2 = id;
                        if (n != n2) {
                            break Label_0107;
                        }
                        id2 = (true ? 1 : 0);
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                return id2 != 0;
            }
            if (a != 0) {
                break;
            }
        }
        return false;
    }
    
    @Override
    public Point getCentralPoint() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Item.a != 0) {
                return capturedModel.getCentralPoint();
            }
            if (capturedModel == null) {
                return this.getLocation().getCentralPoint();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.getCentralPoint();
        point = this.getLocation().getCentralPoint();
        return point;
    }
    
    @Override
    public Point getNextViewportPoint() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Item.a != 0) {
                return capturedModel.getNextViewportPoint();
            }
            if (capturedModel == null) {
                return this.getLocation().getNextViewportPoint();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.getNextViewportPoint();
        point = this.getLocation().getNextViewportPoint();
        return point;
    }
    
    @Override
    public boolean contains(final Point point) {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Item.a != 0) {
                return capturedModel.contains(point);
            }
            if (capturedModel == null) {
                return this.getLocation().contains(point);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.contains(point);
        b = this.getLocation().contains(point);
        return b;
    }
    
    @Override
    public boolean isOnScreen() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Item.a != 0) {
                return capturedModel.isOnScreen();
            }
            if (capturedModel == null) {
                return this.getLocation().isOnScreen();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.isOnScreen();
        b = this.getLocation().isOnScreen();
        return b;
    }
    
    @Override
    public Polygon[] getBounds() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Item.a != 0) {
                return capturedModel.getBounds();
            }
            if (capturedModel == null) {
                return this.getLocation().getBounds();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.getBounds();
        array = this.getLocation().getBounds();
        return array;
    }
    
    @Override
    public boolean hover() {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return true;
            }
        });
    }
    
    @Override
    public boolean click(final boolean b) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                Mouse.click(b);
                return true;
            }
        });
    }
    
    @Override
    public boolean interact(final String s) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return Menu.select(s);
            }
        });
    }
    
    @Override
    public boolean interact(final String s, final String s2) {
        return Mouse.apply(this, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                return Menu.select(s, s2);
            }
        });
    }
    
    @Override
    public void draw(final Graphics graphics) {
        final int a = Item.a;
        final CapturedModel model = this.getModel();
        Label_0030: {
            CapturedModel capturedModel;
            try {
                capturedModel = model;
                if (a != 0) {
                    break Label_0030;
                }
                if (capturedModel == null) {
                    break Label_0030;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                capturedModel.draw(graphics);
                if (a != 0) {
                    this.getLocation().draw(graphics);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        Label_0040: {
            try {
                b = (o instanceof SceneObject);
                if (Item.a != 0) {
                    return b;
                }
                if (!b) {
                    break Label_0040;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final SceneObject sceneObject = (SceneObject)o;
            try {
                if (sceneObject.object == this.object) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            return false;
        }
        return b;
    }
    
    @Override
    public String toString() {
        int a = Item.a;
        String string;
        try {
            string = p.a(SceneObject.z[1]) + System.identityHashCode(this.object) + org.powerbot.a.a(SceneObject.z[0]) + this.getId() + p.a(SceneObject.z[2]) + this.plane + org.powerbot.a.a(SceneObject.z[3]) + Integer.toString(this.type) + p.a("C");
            if (Task.a != 0) {
                Item.a = ++a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return string;
    }
    
    static {
        final String[] z2 = new String[4];
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = 0));
        String s = "[g4a";
        int n5 = -1;
        String intern = null;
    Label_0066_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n7;
            final int n6 = n7 = (length = charArray.length);
            int n8 = 0;
            while (true) {
                Label_0142: {
                    if (n6 > 1) {
                        break Label_0142;
                    }
                    length = (n7 = n8);
                    do {
                        final char c = charArray[n7];
                        char c2 = '\0';
                        switch (n8 % 5) {
                            case 0: {
                                c2 = ':';
                                break;
                            }
                            case 1: {
                                c2 = '-';
                                break;
                            }
                            case 2: {
                                c2 = '\u001d';
                                break;
                            }
                            case 3: {
                                c2 = '\u007f';
                                break;
                            }
                            default: {
                                c2 = 'S';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n8;
                    } while (n6 == 0);
                }
                if (n6 > n8) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n5) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = 1)));
                    s = "H `|91\\\u0011:CA)>";
                    n5 = 0;
                    continue Label_0066_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = 2)));
                    s = "\b?o|#=\u000e";
                    n5 = 1;
                    continue Label_0066_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = 3)));
                    s = "[z),{$";
                    n5 = 2;
                    continue Label_0066_Outer;
                }
                case 2: {
                    break Label_0066_Outer;
                }
            }
        }
        z2[n4] = intern;
        z = z2;
    }
}
