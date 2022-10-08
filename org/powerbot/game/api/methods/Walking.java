
package org.powerbot.game.api.methods;

import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.geom.Point2D;
import java.awt.Point;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.game.api.wrappers.map.LocalPath;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.wrappers.map.TilePath;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.Timer;
import org.powerbot.game.client.RSGroundData;
import org.powerbot.game.client.Client;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.wrappers.Tile;

public class Walking
{
    private static final int WIDGET = 750;
    private static final int WIDGET_RUN = 2;
    private static final int WIDGET_RUN_ENERGY = 6;
    
    public static Tile getDestination() {
        final Client client = Context.client();
        final int destX = client.getDestX();
        final int destY = client.getDestY();
        Label_0042: {
            int n2 = 0;
            int n4 = 0;
            Label_0033: {
                int n;
                int n3;
                try {
                    n = (n2 = destX);
                    n3 = (n4 = -1);
                    if (Widgets.a != 0) {
                        break Label_0042;
                    }
                    if (n != n3) {
                        break Label_0033;
                    }
                    break Label_0042;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    if (n == n3) {
                        break Label_0042;
                    }
                    n2 = destY;
                    n4 = -1;
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            try {
                if (n2 == n4) {
                    return new Tile(-1, -1, -1);
                }
            }
            catch (NumberFormatException ex3) {
                throw ex3;
            }
        }
        return new Tile(Game.getBaseX() + destX, Game.getBaseY() + destY, Game.getPlane());
    }
    
    public static Tile getCollisionOffset(final int n) {
        final RSGroundData rsGroundData = Context.client().getRSGroundInfo().getGroundData()[n];
        return new Tile(rsGroundData.getX(), rsGroundData.getY(), n);
    }
    
    public static int[][] getCollisionFlags(final int n) {
        return Context.client().getRSGroundInfo().getGroundData()[n].getBlocks();
    }
    
    public static void setRun(final boolean b) {
        final int a = Widgets.a;
        int runEnabled = 0;
        int n2 = 0;
        Label_0019: {
            int n;
            try {
                n = (runEnabled = (isRunEnabled() ? 1 : 0));
                n2 = (b ? 1 : 0);
                if (a != 0) {
                    break Label_0019;
                }
                if (n != (b ? 1 : 0)) {
                    break Label_0019;
                }
                return;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                if (n == (b ? 1 : 0)) {
                    return;
                }
                runEnabled = 750;
                n2 = 2;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        if (Widgets.get(runEnabled, n2).click(true)) {
            while (new Timer(1800L).isRunning()) {
                int runEnabled2 = 0;
                Label_0070: {
                    int n3;
                    try {
                        n3 = (runEnabled2 = (isRunEnabled() ? 1 : 0));
                        if (a != 0) {
                            break Label_0070;
                        }
                        final int n4 = b ? 1 : 0;
                        if (n3 != n4) {
                            break Label_0070;
                        }
                        break;
                    }
                    catch (NumberFormatException ex3) {
                        throw ex3;
                    }
                    try {
                        final int n4 = b ? 1 : 0;
                        if (n3 == n4) {
                            break;
                        }
                        runEnabled2 = 5;
                    }
                    catch (NumberFormatException ex4) {
                        throw ex4;
                    }
                }
                Task.sleep(runEnabled2);
                if (a != 0) {
                    break;
                }
            }
        }
    }
    
    public static boolean isRunEnabled() {
        int value = 0;
        Label_0020: {
            int n;
            try {
                n = (value = Settings.get(463));
                if (Widgets.a != 0) {
                    return value != 0;
                }
                final int n2 = 1;
                if (n == n2) {
                    break Label_0020;
                }
                return false;
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            try {
                final int n2 = 1;
                if (n != n2) {
                    return false;
                }
                value = 1;
            }
            catch (NumberFormatException ex2) {
                throw ex2;
            }
        }
        return value != 0;
        value = 0;
        return value != 0;
    }
    
    public static int getEnergy() {
        try {
            return Integer.parseInt(Widgets.get(750, 6).getText());
        }
        catch (NumberFormatException ex) {
            return -1;
        }
    }
    
    public static TilePath newTilePath(final Tile[] array) {
        return new TilePath(array);
    }
    
    public static LocalPath findPath(final Locatable locatable) {
        return new LocalPath(locatable.getLocation());
    }
    
    public static boolean walk(final Locatable locatable) {
        Tile tile = locatable.getLocation();
        Tile tile2 = null;
        Label_0029: {
            try {
                tile2 = tile;
                if (Widgets.a != 0) {
                    return Mouse.apply(new ViewportEntity() {
                        final /* synthetic */ Tile val$tile;
                        
                        @Override
                        public Point getCentralPoint() {
                            return Calculations.worldToMap(this.val$tile.getX(), this.val$tile.getY());
                        }
                        
                        @Override
                        public Point getNextViewportPoint() {
                            return this.getCentralPoint();
                        }
                        
                        @Override
                        public boolean contains(final Point pt) {
                            double n = 0.0;
                            Label_0029: {
                                try {
                                    n = dcmpg(this.getCentralPoint().distance(pt), 2.0);
                                    if (Widgets.a != 0) {
                                        return n != 0.0;
                                    }
                                    if (n > 0) {
                                        break Label_0029;
                                    }
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                                return n != 0.0;
                            }
                            return n != 0.0;
                        }
                        
                        @Override
                        public boolean validate() {
                            return this.val$tile.isOnMap();
                        }
                    }, new Filter<Point>() {
                        @Override
                        public boolean accept(final Point point) {
                            Mouse.click(true);
                            return true;
                        }
                    });
                }
                if (tile2.isOnMap()) {
                    break Label_0029;
                }
            }
            catch (NumberFormatException ex) {
                throw ex;
            }
            tile = getClosestOnMap(tile);
        }
        return Mouse.apply(new ViewportEntity() {
            final /* synthetic */ Tile val$tile;
            
            @Override
            public Point getCentralPoint() {
                return Calculations.worldToMap(tile2.getX(), tile2.getY());
            }
            
            @Override
            public Point getNextViewportPoint() {
                return this.getCentralPoint();
            }
            
            @Override
            public boolean contains(final Point pt) {
                double n = 0.0;
                Label_0029: {
                    try {
                        n = dcmpg(this.getCentralPoint().distance(pt), 2.0);
                        if (Widgets.a != 0) {
                            return n != 0.0;
                        }
                        if (n > 0) {
                            break Label_0029;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    return n != 0.0;
                }
                return n != 0.0;
            }
            
            @Override
            public boolean validate() {
                return tile2.isOnMap();
            }
        }, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                Mouse.click(true);
                return true;
            }
        });
    }
    
    public static Tile getClosestOnMap(Tile derive) {
        Tile location = null;
        Label_0026: {
            Label_0020: {
                Tile tile;
                try {
                    tile = (location = derive);
                    if (Widgets.a != 0) {
                        break Label_0026;
                    }
                    final boolean b = tile.isOnMap();
                    if (b) {
                        return derive;
                    }
                    break Label_0020;
                }
                catch (NumberFormatException ex) {
                    throw ex;
                }
                try {
                    final boolean b = tile.isOnMap();
                    if (b) {
                        return derive;
                    }
                }
                catch (NumberFormatException ex2) {
                    throw ex2;
                }
            }
            location = Players.getLocal().getLocation();
        }
        final Tile tile2 = location;
        derive = derive.derive(-tile2.getX(), -tile2.getY());
        final double atan2 = Math.atan2(derive.getY(), derive.getX());
        return new Tile(tile2.getX() + (int)(16.0 * Math.cos(atan2)), tile2.getY() + (int)(16.0 * Math.sin(atan2)), derive.getPlane());
    }
}
