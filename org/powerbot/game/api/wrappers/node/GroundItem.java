
package org.powerbot.game.api.wrappers.node;

import java.awt.Color;
import java.awt.Graphics;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.Polygon;
import org.powerbot.game.api.methods.Calculations;
import java.awt.geom.Point2D;
import org.powerbot.game.api.util.Random;
import java.awt.Point;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.api.wrappers.Identifiable;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.wrappers.Entity;

public class GroundItem implements Entity, Locatable, Identifiable
{
    private final Tile tile;
    private final RegionOffset localTile;
    private final Item groundItem;
    
    public GroundItem(final Tile tile, final Item groundItem) {
        this.tile = tile;
        this.localTile = new RegionOffset(tile.getX() - Game.getBaseX(), tile.getY() - Game.getBaseY(), tile.getPlane());
        this.groundItem = groundItem;
    }
    
    public CapturedModel getModel() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          23
        //     5: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokeinterface org/powerbot/game/client/Client.getRSGroundInfo:()Lorg/powerbot/game/client/RSInfo;
        //    15: astore_2       
        //    16: aload_2        
        //    17: invokeinterface org/powerbot/game/client/RSInfo.getBaseInfo:()Lorg/powerbot/game/client/BaseInfo;
        //    22: astore_3       
        //    23: aload_0        
        //    24: getfield        org/powerbot/game/api/wrappers/node/GroundItem.tile:Lorg/powerbot/game/api/wrappers/Tile;
        //    27: invokevirtual   org/powerbot/game/api/wrappers/Tile.getX:()I
        //    30: aload_3        
        //    31: invokeinterface org/powerbot/game/client/BaseInfo.getX:()I
        //    36: isub           
        //    37: istore          4
        //    39: aload_0        
        //    40: getfield        org/powerbot/game/api/wrappers/node/GroundItem.tile:Lorg/powerbot/game/api/wrappers/Tile;
        //    43: invokevirtual   org/powerbot/game/api/wrappers/Tile.getY:()I
        //    46: aload_3        
        //    47: invokeinterface org/powerbot/game/client/BaseInfo.getY:()I
        //    52: isub           
        //    53: istore          5
        //    55: aload_2        
        //    56: invokeinterface org/powerbot/game/client/RSInfo.getRSGroundInfo:()Lorg/powerbot/game/client/RSGroundInfo;
        //    61: astore          6
        //    63: aload           6
        //    65: invokeinterface org/powerbot/game/client/RSGroundInfo.getRSGroundArray:()[[[Lorg/powerbot/game/client/RSGround;
        //    70: astore          7
        //    72: aload_1        
        //    73: invokeinterface org/powerbot/game/client/Client.getPlane:()I
        //    78: istore          8
        //    80: aload           7
        //    82: iload           8
        //    84: aaload         
        //    85: iload           4
        //    87: aaload         
        //    88: iload           5
        //    90: aaload         
        //    91: astore          9
        //    93: aload           9
        //    95: iload           23
        //    97: ifne            109
        //   100: ifnull          346
        //   103: goto            107
        //   106: athrow         
        //   107: aload           9
        //   109: invokeinterface org/powerbot/game/client/RSGround.getRSItemPile:()Lorg/powerbot/game/client/RSItemPile;
        //   114: astore          10
        //   116: aload           10
        //   118: ifnull          346
        //   121: getstatic       org/powerbot/core/script/methods/Calculations.toolkit:Lorg/powerbot/core/script/methods/Calculations$Toolkit;
        //   124: getfield        org/powerbot/core/script/methods/Calculations$Toolkit.graphicsIndex:I
        //   127: istore          11
        //   129: iconst_3       
        //   130: newarray        I
        //   132: dup            
        //   133: iconst_0       
        //   134: aload           10
        //   136: invokeinterface org/powerbot/game/client/RSItemPile.getID_1:()I
        //   141: iastore        
        //   142: dup            
        //   143: iconst_1       
        //   144: aload           10
        //   146: invokeinterface org/powerbot/game/client/RSItemPile.getID_2:()I
        //   151: iastore        
        //   152: dup            
        //   153: iconst_2       
        //   154: aload           10
        //   156: invokeinterface org/powerbot/game/client/RSItemPile.getID_3:()I
        //   161: iastore        
        //   162: astore          12
        //   164: aload           12
        //   166: arraylength    
        //   167: anewarray       Lorg/powerbot/game/client/Model;
        //   170: astore          13
        //   172: aload_1        
        //   173: invokeinterface org/powerbot/game/client/Client.getRSItemDefLoader:()Lorg/powerbot/game/client/RSItemDefLoader;
        //   178: astore          14
        //   180: aload           14
        //   182: invokeinterface org/powerbot/game/client/RSItemDefLoader.getModelCache:()Lorg/powerbot/game/client/Cache;
        //   187: astore          15
        //   189: aload           15
        //   191: invokeinterface org/powerbot/game/client/Cache.getTable:()Lorg/powerbot/game/client/HashTable;
        //   196: astore          16
        //   198: iconst_0       
        //   199: istore          17
        //   201: aload           12
        //   203: astore          18
        //   205: aload           18
        //   207: arraylength    
        //   208: istore          19
        //   210: iconst_0       
        //   211: istore          20
        //   213: iload           20
        //   215: iload           19
        //   217: if_icmpge       317
        //   220: aload           18
        //   222: iload           20
        //   224: iaload         
        //   225: istore          21
        //   227: aload           16
        //   229: iload           21
        //   231: i2l            
        //   232: iload           11
        //   234: i2l            
        //   235: bipush          29
        //   237: lshl           
        //   238: lor            
        //   239: invokestatic    org/powerbot/game/api/util/node/Nodes.lookup:(Lorg/powerbot/game/client/HashTable;J)Ljava/lang/Object;
        //   242: astore          22
        //   244: iload           23
        //   246: ifne            344
        //   249: iload           23
        //   251: ifne            299
        //   254: goto            258
        //   257: athrow         
        //   258: aload           22
        //   260: ifnull          296
        //   263: goto            267
        //   266: athrow         
        //   267: aload           22
        //   269: instanceof      Lorg/powerbot/game/client/Model;
        //   272: ifeq            296
        //   275: goto            279
        //   278: athrow         
        //   279: aload           13
        //   281: iload           17
        //   283: iinc            17, 1
        //   286: aload           22
        //   288: checkcast       Lorg/powerbot/game/client/Model;
        //   291: aastore        
        //   292: goto            296
        //   295: athrow         
        //   296: iinc            20, 1
        //   299: iload           23
        //   301: ifeq            213
        //   304: getstatic       org/powerbot/core/script/job/Task.a:I
        //   307: istore          24
        //   309: iinc            24, 1
        //   312: iload           24
        //   314: putstatic       org/powerbot/core/script/job/Task.a:I
        //   317: iload           17
        //   319: ifle            344
        //   322: new             Lorg/powerbot/game/api/wrappers/graphics/model/RenderableModel;
        //   325: dup            
        //   326: aload           13
        //   328: iconst_0       
        //   329: iload           17
        //   331: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   334: aaload         
        //   335: aload           10
        //   337: invokespecial   org/powerbot/game/api/wrappers/graphics/model/RenderableModel.<init>:(Lorg/powerbot/game/client/Model;Lorg/powerbot/game/client/RSInteractable;)V
        //   340: goto            345
        //   343: athrow         
        //   344: aconst_null    
        //   345: areturn        
        //   346: aconst_null    
        //   347: areturn        
        //    StackMapTable: 00 12 FF 00 6A 00 18 07 00 45 07 00 80 07 00 82 07 00 84 01 01 07 00 86 07 01 21 01 07 00 88 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 01 1E 00 41 07 00 88 FF 00 67 00 18 07 00 45 07 00 80 07 00 82 07 00 84 01 01 07 00 86 07 01 21 01 07 00 88 07 00 8E 01 07 01 23 07 01 25 07 00 94 07 00 96 07 01 27 01 07 01 23 01 01 00 00 01 00 00 FF 00 2B 00 18 07 00 45 07 00 80 07 00 82 07 00 84 01 01 07 00 86 07 01 21 01 07 00 88 07 00 8E 01 07 01 23 07 01 25 07 00 94 07 00 96 07 01 27 01 07 01 23 01 01 01 07 00 46 01 00 01 07 01 1E 00 47 07 01 1E 00 4A 07 01 1E 00 4F 07 01 1E 00 02 FF 00 11 00 18 07 00 45 07 00 80 07 00 82 07 00 84 01 01 07 00 86 07 01 21 01 07 00 88 07 00 8E 01 07 01 23 07 01 25 07 00 94 07 00 96 07 01 27 01 07 01 23 01 01 00 00 01 00 00 59 07 01 1E 00 40 07 00 1F FF 00 00 00 18 07 00 45 07 00 80 07 00 82 07 00 84 01 01 07 00 86 07 01 21 01 07 00 88 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  317    343    343    344    Ljava/lang/RuntimeException;
        //  267    292    295    296    Ljava/lang/RuntimeException;
        //  258    275    278    279    Ljava/lang/RuntimeException;
        //  249    263    266    267    Ljava/lang/RuntimeException;
        //  244    254    257    258    Ljava/lang/RuntimeException;
        //  93     103    106    107    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0258:
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
    
    @Override
    public RegionOffset getRegionOffset() {
        return this.localTile;
    }
    
    @Override
    public Tile getLocation() {
        return this.tile;
    }
    
    public Item getGroundItem() {
        return this.groundItem;
    }
    
    @Override
    public int getId() {
        return this.groundItem.getId();
    }
    
    @Override
    public boolean validate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: getfield        org/powerbot/game/api/wrappers/node/GroundItem.tile:Lorg/powerbot/game/api/wrappers/Tile;
        //     8: invokevirtual   org/powerbot/game/api/wrappers/Tile.validate:()Z
        //    11: iload_1        
        //    12: ifne            38
        //    15: ifeq            65
        //    18: goto            22
        //    21: athrow         
        //    22: aload_0        
        //    23: iload_1        
        //    24: ifne            57
        //    27: goto            31
        //    30: athrow         
        //    31: invokevirtual   org/powerbot/game/api/wrappers/node/GroundItem.getId:()I
        //    34: goto            38
        //    37: athrow         
        //    38: iconst_m1      
        //    39: if_icmpeq       65
        //    42: new             Lorg/powerbot/game/api/wrappers/node/GroundItem$1;
        //    45: dup            
        //    46: aload_0        
        //    47: invokespecial   org/powerbot/game/api/wrappers/node/GroundItem$1.<init>:(Lorg/powerbot/game/api/wrappers/node/GroundItem;)V
        //    50: invokestatic    org/powerbot/game/api/methods/node/GroundItems.getNearest:(Lorg/powerbot/game/api/util/Filter;)Lorg/powerbot/game/api/wrappers/node/GroundItem;
        //    53: goto            57
        //    56: athrow         
        //    57: ifnull          65
        //    60: iconst_1       
        //    61: goto            66
        //    64: athrow         
        //    65: iconst_0       
        //    66: ireturn        
        //    StackMapTable: 00 0B FF 00 15 00 02 07 00 45 01 00 01 07 01 1E 00 47 07 01 1E 40 07 00 45 45 07 01 1E 40 01 51 07 01 1E 40 07 00 45 46 07 01 1E 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  57     64     64     65     Ljava/lang/RuntimeException;
        //  38     53     56     57     Ljava/lang/RuntimeException;
        //  22     34     37     38     Ljava/lang/RuntimeException;
        //  15     27     30     31     Ljava/lang/RuntimeException;
        //  4      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    @Override
    public Point getCentralPoint() {
        return this.tile.getPoint(0.5, 0.5, 0);
    }
    
    @Override
    public Point getNextViewportPoint() {
        return this.tile.getPoint(Random.nextDouble(), Random.nextDouble(), 0);
    }
    
    @Override
    public boolean contains(final Point pt) {
        double n = 0.0;
        Label_0029: {
            try {
                n = dcmpg(this.getCentralPoint().distance(pt), 3.0);
                if (Item.a != 0) {
                    return n != 0.0;
                }
                if (n >= 0) {
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
    public boolean isOnScreen() {
        return Calculations.isOnScreen(this.getCentralPoint());
    }
    
    @Override
    public Polygon[] getBounds() {
        return this.tile.getBounds();
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
        final RegionOffset regionOffset = this.getRegionOffset();
        final Point groundToScreen = Calculations.groundToScreen(regionOffset.getX(), regionOffset.getY(), regionOffset.getPlane(), 0);
        graphics.setColor(Color.magenta);
        graphics.fillRect(groundToScreen.x - 3, groundToScreen.y - 3, 6, 6);
    }
}
