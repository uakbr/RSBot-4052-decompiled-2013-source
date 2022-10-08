
package org.powerbot.game.api.wrappers.widget;

import org.powerbot.game.api.util.Random;
import java.awt.Graphics;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.Rectangle;
import java.awt.Polygon;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.client.RSInterface;
import java.awt.Point;
import org.powerbot.game.api.wrappers.Identifiable;
import org.powerbot.game.api.wrappers.Entity;

public class WidgetChild implements Entity, Identifiable
{
    private final int index;
    private final Widget parentWidget;
    private final WidgetChild parent;
    public static boolean a;
    
    public WidgetChild(final Widget parentWidget, final int index) {
        this.parentWidget = parentWidget;
        this.index = index;
        this.parent = null;
    }
    
    public WidgetChild(final Widget parentWidget, final WidgetChild parent, final int index) {
        this.parentWidget = parentWidget;
        this.parent = parent;
        this.index = index;
    }
    
    public Widget getWidget() {
        return this.parentWidget;
    }
    
    public WidgetChild getParent() {
        return this.parent;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public int getAbsoluteX() {
        return this.getAbsoluteLocation().x;
    }
    
    public int getAbsoluteY() {
        return this.getAbsoluteLocation().y;
    }
    
    public Point getAbsoluteLocation() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/game/api/wrappers/widget/WidgetChild.getInternal:()Lorg/powerbot/game/client/RSInterface;
        //     9: ifnonnull       23
        //    12: new             Ljava/awt/Point;
        //    15: dup            
        //    16: iconst_m1      
        //    17: iconst_m1      
        //    18: invokespecial   java/awt/Point.<init>:(II)V
        //    21: areturn        
        //    22: athrow         
        //    23: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //    26: astore_1       
        //    27: aload_0        
        //    28: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getParentId:()I
        //    31: istore_2       
        //    32: iconst_0       
        //    33: istore_3       
        //    34: iconst_0       
        //    35: istore          4
        //    37: iload_2        
        //    38: iconst_m1      
        //    39: iload           8
        //    41: ifne            63
        //    44: if_icmpeq       89
        //    47: goto            51
        //    50: athrow         
        //    51: iload_2        
        //    52: bipush          16
        //    54: ishr           
        //    55: iload_2        
        //    56: ldc             65535
        //    58: iand           
        //    59: goto            63
        //    62: athrow         
        //    63: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    66: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getAbsoluteLocation:()Ljava/awt/Point;
        //    69: astore          5
        //    71: aload           5
        //    73: getfield        java/awt/Point.x:I
        //    76: istore_3       
        //    77: aload           5
        //    79: getfield        java/awt/Point.y:I
        //    82: istore          4
        //    84: iload           8
        //    86: ifeq            189
        //    89: aload_1        
        //    90: invokeinterface org/powerbot/game/client/Client.getRSInterfaceBoundsArray:()[Ljava/awt/Rectangle;
        //    95: astore          5
        //    97: aload_0        
        //    98: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundsArrayIndex:()I
        //   101: iload           8
        //   103: ifne            190
        //   106: istore          6
        //   108: aload           5
        //   110: ifnull          189
        //   113: iload           6
        //   115: iload           8
        //   117: ifne            190
        //   120: goto            124
        //   123: athrow         
        //   124: ifle            189
        //   127: goto            131
        //   130: athrow         
        //   131: iload           6
        //   133: aload           5
        //   135: arraylength    
        //   136: iload           8
        //   138: ifne            191
        //   141: goto            145
        //   144: athrow         
        //   145: if_icmpge       189
        //   148: goto            152
        //   151: athrow         
        //   152: aload           5
        //   154: iload           6
        //   156: aaload         
        //   157: ifnull          189
        //   160: goto            164
        //   163: athrow         
        //   164: new             Ljava/awt/Point;
        //   167: dup            
        //   168: aload           5
        //   170: iload           6
        //   172: aaload         
        //   173: getfield        java/awt/Rectangle.x:I
        //   176: aload           5
        //   178: iload           6
        //   180: aaload         
        //   181: getfield        java/awt/Rectangle.y:I
        //   184: invokespecial   java/awt/Point.<init>:(II)V
        //   187: areturn        
        //   188: athrow         
        //   189: iload_2        
        //   190: iconst_m1      
        //   191: iload           8
        //   193: ifne            286
        //   196: if_icmpeq       273
        //   199: goto            203
        //   202: athrow         
        //   203: iload_2        
        //   204: invokestatic    org/powerbot/game/api/methods/Widgets.getChild:(I)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   207: astore          5
        //   209: aload           5
        //   211: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getScrollableContentWidth:()I
        //   214: istore          6
        //   216: aload           5
        //   218: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getScrollableContentHeight:()I
        //   221: istore          7
        //   223: iload           6
        //   225: iload           8
        //   227: ifne            271
        //   230: ifgt            255
        //   233: goto            237
        //   236: athrow         
        //   237: iload           7
        //   239: iload           8
        //   241: ifne            287
        //   244: goto            248
        //   247: athrow         
        //   248: ifle            273
        //   251: goto            255
        //   254: athrow         
        //   255: iload_3        
        //   256: aload           5
        //   258: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getHorizontalScrollPosition:()I
        //   261: isub           
        //   262: istore_3       
        //   263: iload           4
        //   265: aload           5
        //   267: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getVerticalScrollPosition:()I
        //   270: isub           
        //   271: istore          4
        //   273: iload_3        
        //   274: aload_0        
        //   275: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeX:()I
        //   278: iadd           
        //   279: istore_3       
        //   280: iload           4
        //   282: aload_0        
        //   283: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getRelativeY:()I
        //   286: iadd           
        //   287: istore          4
        //   289: new             Ljava/awt/Point;
        //   292: dup            
        //   293: iload_3        
        //   294: iload           4
        //   296: invokespecial   java/awt/Point.<init>:(II)V
        //   299: areturn        
        //    StackMapTable: 00 21 FF 00 16 00 09 07 00 41 00 00 00 00 00 00 00 01 00 01 07 01 7E 00 FF 00 1A 00 09 07 00 41 07 00 DA 01 01 01 00 00 00 01 00 01 07 01 7E 00 4A 07 01 7E FF 00 00 00 09 07 00 41 07 00 DA 01 01 01 00 00 00 01 00 02 01 01 19 FF 00 21 00 09 07 00 41 07 00 DA 01 01 01 07 01 81 01 00 01 00 01 07 01 7E 40 01 45 07 01 7E 00 4C 07 01 7E FF 00 00 00 09 07 00 41 07 00 DA 01 01 01 07 01 81 01 00 01 00 02 01 01 45 07 01 7E 00 4A 07 01 7E 00 57 07 01 7E FF 00 00 00 09 07 00 41 07 00 DA 01 01 01 07 00 6D 00 00 01 00 00 40 01 FF 00 00 00 09 07 00 41 07 00 DA 01 01 01 07 00 6D 00 00 01 00 02 01 01 4A 07 01 7E 00 FF 00 20 00 09 07 00 41 07 00 DA 01 01 01 07 00 41 01 01 01 00 01 07 01 7E 00 49 07 01 7E 40 01 45 07 01 7E 00 4F 01 FF 00 01 00 09 07 00 41 07 00 DA 01 01 01 07 00 6D 00 00 01 00 00 FF 00 0C 00 09 07 00 41 07 00 DA 01 01 01 07 00 6D 00 00 01 00 02 01 01 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  237    251    254    255    Ljava/lang/RuntimeException;
        //  230    244    247    248    Ljava/lang/RuntimeException;
        //  223    233    236    237    Ljava/lang/RuntimeException;
        //  191    199    202    203    Ljava/lang/RuntimeException;
        //  152    188    188    189    Ljava/lang/RuntimeException;
        //  145    160    163    164    Ljava/lang/RuntimeException;
        //  131    148    151    152    Ljava/lang/RuntimeException;
        //  124    141    144    145    Ljava/lang/RuntimeException;
        //  113    127    130    131    Ljava/lang/RuntimeException;
        //  108    120    123    124    Ljava/lang/RuntimeException;
        //  44     59     62     63     Ljava/lang/RuntimeException;
        //  37     47     50     51     Ljava/lang/RuntimeException;
        //  5      22     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0124:
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
    
    public int getRelativeX() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getX();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getX();
        x = -1;
        return x;
    }
    
    public int getRelativeY() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getY();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getY();
        y = -1;
        return y;
    }
    
    public Point getRelativeLocation() {
        final RSInterface internal = this.getInternal();
        try {
            if (internal == null) {
                return new Point(-1, -1);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return new Point(internal.getX(), internal.getY());
    }
    
    public int getWidth() {
        final boolean a = WidgetChild.a;
        WidgetChild widgetChild = null;
        Label_0026: {
            Label_0019: {
                try {
                    widgetChild = this;
                    if (a) {
                        break Label_0026;
                    }
                    final boolean b = this.isInScrollableArea();
                    if (!b) {
                        break Label_0019;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.isInScrollableArea();
                    if (!b) {
                        return this.getHorizontalScrollThumbSize();
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            widgetChild = this;
        }
        final RSInterface internal = widgetChild.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (a) {
                return rsInterface.getWidth();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return rsInterface.getWidth();
        width = -1;
        return width;
    }
    
    public int getHeight() {
        final boolean a = WidgetChild.a;
        WidgetChild widgetChild = null;
        Label_0026: {
            Label_0019: {
                try {
                    widgetChild = this;
                    if (a) {
                        break Label_0026;
                    }
                    final boolean b = this.isInScrollableArea();
                    if (!b) {
                        break Label_0019;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = this.isInScrollableArea();
                    if (!b) {
                        return this.getVerticalScrollThumbSize();
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            widgetChild = this;
        }
        final RSInterface internal = widgetChild.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (a) {
                return rsInterface.getHeight();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return rsInterface.getHeight();
        height = -1;
        return height;
    }
    
    @Override
    public int getId() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getID();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getID();
        id = -1;
        return id;
    }
    
    public int getType() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getType();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getType();
        type = -1;
        return type;
    }
    
    public int getSpecialType() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getSpecialType();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getSpecialType();
        specialType = -1;
        return specialType;
    }
    
    public int getChildId() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getComponentID();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getComponentID();
        componentID = -1;
        return componentID;
    }
    
    public int getChildIndex() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getComponentIndex();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getComponentIndex();
        componentIndex = -1;
        return componentIndex;
    }
    
    public String getChildName() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getComponentName();
            }
            if (rsInterface == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getComponentName();
        componentName = null;
        return componentName;
    }
    
    public int getTextureId() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getTextureID();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getTextureID();
        textureID = -1;
        return textureID;
    }
    
    public String getText() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getText();
            }
            if (rsInterface == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getText();
        text = null;
        return text;
    }
    
    public int getTextColor() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getTextColor();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getTextColor();
        textColor = -1;
        return textColor;
    }
    
    public int getShadowColor() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getShadowColor();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getShadowColor();
        shadowColor = -1;
        return shadowColor;
    }
    
    public String getTooltip() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getTooltip();
            }
            if (rsInterface == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getTooltip();
        tooltip = null;
        return tooltip;
    }
    
    public int getBorderThickness() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getBorderThinkness();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getBorderThinkness();
        borderThinkness = -1;
        return borderThinkness;
    }
    
    public String getSelectedAction() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getSelectedActionName();
            }
            if (rsInterface == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getSelectedActionName();
        selectedActionName = null;
        return selectedActionName;
    }
    
    public int getModelId() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getModelID();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getModelID();
        modelID = -1;
        return modelID;
    }
    
    public int getModelType() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getModelType();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getModelType();
        modelType = -1;
        return modelType;
    }
    
    public int getModelZoom() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getModelZoom();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getModelZoom();
        modelZoom = -1;
        return modelZoom;
    }
    
    public boolean isInventory() {
        final boolean a = WidgetChild.a;
        final RSInterface internal = this.getInternal();
        boolean inventoryInterface = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internal;
                    if (a) {
                        break Label_0022;
                    }
                    if (rsInterface == null) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    inventoryInterface = rsInterface.isInventoryInterface();
                    if (a) {
                        return inventoryInterface;
                    }
                    if (!inventoryInterface) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return inventoryInterface;
        }
        return inventoryInterface;
    }
    
    public int getChildStackSize() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getComponentStackSize();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getComponentStackSize();
        componentStackSize = -1;
        return componentStackSize;
    }
    
    public int getXRotation() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getXRotation();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getXRotation();
        xRotation = -1;
        return xRotation;
    }
    
    public int getYRotation() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getYRotation();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getYRotation();
        yRotation = -1;
        return yRotation;
    }
    
    public int getZRotation() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getZRotation();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getZRotation();
        zRotation = -1;
        return zRotation;
    }
    
    public String[] getActions() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getActions();
            }
            if (rsInterface == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getActions();
        actions = null;
        return actions;
    }
    
    public boolean isHorizontallyFlipped() {
        final boolean a = WidgetChild.a;
        final RSInterface internal = this.getInternal();
        boolean horizontallyFlipped = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internal;
                    if (a) {
                        break Label_0022;
                    }
                    if (rsInterface == null) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    horizontallyFlipped = rsInterface.isHorizontallyFlipped();
                    if (a) {
                        return horizontallyFlipped;
                    }
                    if (!horizontallyFlipped) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return horizontallyFlipped;
        }
        return horizontallyFlipped;
    }
    
    public boolean isVerticallyFlipped() {
        final boolean a = WidgetChild.a;
        final RSInterface internal = this.getInternal();
        boolean verticallyFlipped = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internal;
                    if (a) {
                        break Label_0022;
                    }
                    if (rsInterface == null) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    verticallyFlipped = rsInterface.isVerticallyFlipped();
                    if (a) {
                        return verticallyFlipped;
                    }
                    if (!verticallyFlipped) {
                        break Label_0042;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return verticallyFlipped;
        }
        return verticallyFlipped;
    }
    
    public int getHorizontalScrollPosition() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getHorizontalScrollbarPosition();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getHorizontalScrollbarPosition();
        horizontalScrollbarPosition = -1;
        return horizontalScrollbarPosition;
    }
    
    public int getScrollableContentWidth() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getHorizontalScrollbarSize();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getHorizontalScrollbarSize();
        horizontalScrollbarSize = -1;
        return horizontalScrollbarSize;
    }
    
    public int getHorizontalScrollThumbSize() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getHorizontalScrollbarThumbSize();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getHorizontalScrollbarThumbSize();
        horizontalScrollbarThumbSize = -1;
        return horizontalScrollbarThumbSize;
    }
    
    public int getVerticalScrollPosition() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getVerticalScrollbarPosition();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getVerticalScrollbarPosition();
        verticalScrollbarPosition = -1;
        return verticalScrollbarPosition;
    }
    
    public int getScrollableContentHeight() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getVerticalScrollbarSize();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getVerticalScrollbarSize();
        verticalScrollbarSize = -1;
        return verticalScrollbarSize;
    }
    
    public int getVerticalScrollThumbSize() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getVerticalScrollbarThumbSize();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getVerticalScrollbarThumbSize();
        verticalScrollbarThumbSize = -1;
        return verticalScrollbarThumbSize;
    }
    
    public int getBoundsArrayIndex() {
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface;
        try {
            rsInterface = internal;
            if (WidgetChild.a) {
                return rsInterface.getBoundsArrayIndex();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getBoundsArrayIndex();
        boundsArrayIndex = -1;
        return boundsArrayIndex;
    }
    
    public WidgetChild[] getChildren() {
        final boolean a = WidgetChild.a;
        final RSInterface internal = this.getInternal();
        RSInterface rsInterface = null;
        Label_0024: {
            try {
                rsInterface = internal;
                if (a) {
                    break Label_0024;
                }
                if (rsInterface == null) {
                    return new WidgetChild[0];
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        final RSInterface[] components = rsInterface.getComponents();
        RSInterface[] array = null;
        Label_0044: {
            try {
                array = components;
                if (a) {
                    break Label_0044;
                }
                if (array == null) {
                    return new WidgetChild[0];
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final WidgetChild[] array2 = new WidgetChild[array.length];
        int i = 0;
        WidgetChild[] array3 = null;
        while (i < array2.length) {
            try {
                array3 = array2;
                if (a) {
                    return array3;
                }
                array3[i] = new WidgetChild(this.parentWidget, this, i);
                ++i;
                if (!a) {
                    continue;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            break;
        }
        return array3;
    }
    
    public WidgetChild getChild(final int n) {
        final WidgetChild[] children = this.getChildren();
        Label_0020: {
            try {
                final int n2 = n;
                if (WidgetChild.a) {
                    break Label_0020;
                }
                if (n < 0) {
                    return null;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final int n2 = n;
            try {
                if (n2 < children.length) {
                    return children[n];
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return null;
    }
    
    public boolean visible() {
        final boolean a = WidgetChild.a;
        final RSInterface internal = this.getInternal();
        Label_0077: {
            int parentId = 0;
            Label_0065: {
                Label_0061: {
                    int n2 = 0;
                    Label_0047: {
                        Label_0041: {
                            int n = 0;
                            Label_0022: {
                                RSInterface rsInterface;
                                try {
                                    rsInterface = internal;
                                    if (a) {
                                        break Label_0022;
                                    }
                                    if (rsInterface == null) {
                                        return false;
                                    }
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                                try {
                                    final int n3;
                                    n = (n2 = (parentId = (n3 = (rsInterface.isHidden() ? 1 : 0))));
                                    if (a) {
                                        break Label_0047;
                                    }
                                    if (n != 0) {
                                        return false;
                                    }
                                    break Label_0041;
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                            }
                            try {
                                if (n != 0) {
                                    return false;
                                }
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                        }
                        int n3;
                        parentId = (n2 = (n3 = (internal.isVisible() ? 1 : 0)));
                        try {
                            if (a) {
                                break Label_0065;
                            }
                            if (n2 != 0) {
                                return true;
                            }
                            break Label_0061;
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        if (n2 != 0) {
                            return true;
                        }
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                int n3 = parentId = this.getParentId();
                try {
                    if (a) {
                        return n3 != 0;
                    }
                    final int n4 = -1;
                    if (parentId != n4) {
                        break Label_0077;
                    }
                    return this.validate();
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            try {
                final int n4 = -1;
                if (parentId != n4) {
                    return Widgets.getChild(this.getParentId()).visible();
                }
            }
            catch (RuntimeException ex7) {
                throw ex7;
            }
        }
        int n3 = this.validate() ? 1 : 0;
        return n3 != 0;
    }
    
    @Override
    public int hashCode() {
        return this.parentWidget.getIndex() * 31 + this.index;
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean a = WidgetChild.a;
        boolean b = false;
        Label_0091: {
            Label_0021: {
                Label_0020: {
                    try {
                        final Object o2 = o;
                        if (a) {
                            break Label_0021;
                        }
                        final WidgetChild widgetChild = this;
                        if (o == widgetChild) {
                            return true;
                        }
                        break Label_0020;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final WidgetChild widgetChild = this;
                        if (o == widgetChild) {
                            return true;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final Object o2 = o;
                try {
                    b = (o2 instanceof WidgetChild);
                    if (a) {
                        return b;
                    }
                    if (!b) {
                        break Label_0091;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            final WidgetChild widgetChild2 = (WidgetChild)o;
            Label_0074: {
                int index = 0;
                int equals = 0;
                Label_0059: {
                    int n;
                    try {
                        n = (equals = (index = this.index));
                        if (a) {
                            break Label_0074;
                        }
                        final WidgetChild widgetChild3 = widgetChild2;
                        final int n2 = widgetChild3.index;
                        if (n == n2) {
                            break Label_0059;
                        }
                        return false;
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    try {
                        final WidgetChild widgetChild3 = widgetChild2;
                        final int n2 = widgetChild3.index;
                        if (n != n2) {
                            return false;
                        }
                        index = (equals = (widgetChild2.parentWidget.equals(this.parentWidget) ? 1 : 0));
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (a) {
                        return index != 0;
                    }
                    if (equals == 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            int index = 1;
            return index != 0;
            index = 0;
            return index != 0;
        }
        return b;
    }
    
    public int getParentId() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: invokespecial   org/powerbot/game/api/wrappers/widget/WidgetChild.getInternal:()Lorg/powerbot/game/client/RSInterface;
        //     9: astore_1       
        //    10: aload_1        
        //    11: ifnonnull       17
        //    14: iconst_m1      
        //    15: ireturn        
        //    16: athrow         
        //    17: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //    20: astore_2       
        //    21: aload_1        
        //    22: invokeinterface org/powerbot/game/client/RSInterface.getParentID:()I
        //    27: istore_3       
        //    28: iload_3        
        //    29: iconst_m1      
        //    30: iload           7
        //    32: ifne            51
        //    35: if_icmpeq       45
        //    38: goto            42
        //    41: athrow         
        //    42: iload_3        
        //    43: ireturn        
        //    44: athrow         
        //    45: aload_0        
        //    46: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getId:()I
        //    49: bipush          16
        //    51: iushr          
        //    52: istore          4
        //    54: new             Lorg/powerbot/game/api/util/node/HashTable;
        //    57: dup            
        //    58: aload_2        
        //    59: invokeinterface org/powerbot/game/client/Client.getRSInterfaceNC:()Lorg/powerbot/game/client/HashTable;
        //    64: invokespecial   org/powerbot/game/api/util/node/HashTable.<init>:(Lorg/powerbot/game/client/HashTable;)V
        //    67: astore          5
        //    69: aload           5
        //    71: invokevirtual   org/powerbot/game/api/util/node/HashTable.getFirst:()Lorg/powerbot/game/client/Node;
        //    74: checkcast       Lorg/powerbot/game/client/RSInterfaceNode;
        //    77: astore          6
        //    79: aload           6
        //    81: ifnull          142
        //    84: iload           4
        //    86: iload           7
        //    88: ifne            143
        //    91: iload           7
        //    93: ifne            126
        //    96: goto            100
        //    99: athrow         
        //   100: aload           6
        //   102: invokeinterface org/powerbot/game/client/RSInterfaceNode.getMainID:()I
        //   107: if_icmpne       127
        //   110: goto            114
        //   113: athrow         
        //   114: aload           6
        //   116: invokeinterface org/powerbot/game/client/RSInterfaceNode.getId:()J
        //   121: l2i            
        //   122: goto            126
        //   125: athrow         
        //   126: ireturn        
        //   127: aload           5
        //   129: invokevirtual   org/powerbot/game/api/util/node/HashTable.getNext:()Lorg/powerbot/game/client/Node;
        //   132: checkcast       Lorg/powerbot/game/client/RSInterfaceNode;
        //   135: astore          6
        //   137: iload           7
        //   139: ifeq            79
        //   142: iconst_m1      
        //   143: ireturn        
        //    StackMapTable: 00 11 FF 00 10 00 08 07 00 41 07 00 E4 00 00 00 00 00 01 00 01 07 01 7E 00 FF 00 17 00 08 07 00 41 07 00 E4 07 00 DA 01 00 00 00 01 00 01 07 01 7E 00 41 07 01 7E 00 FF 00 05 00 08 07 00 41 07 00 E4 07 00 DA 01 00 00 00 01 00 02 01 01 FF 00 1B 00 08 07 00 41 07 00 E4 07 00 DA 01 01 07 00 4C 07 00 50 01 00 00 53 07 01 7E 40 01 4C 07 01 7E 00 4A 07 01 7E 40 01 00 0E 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  100    122    125    126    Ljava/lang/RuntimeException;
        //  91     110    113    114    Ljava/lang/RuntimeException;
        //  84     96     99     100    Ljava/lang/RuntimeException;
        //  35     44     44     45     Ljava/lang/RuntimeException;
        //  28     38     41     42     Ljava/lang/RuntimeException;
        //  10     16     16     17     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
    
    public boolean isInScrollableArea() {
        final boolean a = WidgetChild.a;
        int n2 = 0;
        Label_0027: {
            Label_0023: {
                int n;
                try {
                    n = (n2 = this.getParentId());
                    if (a) {
                        break Label_0027;
                    }
                    final int n3 = -1;
                    if (n == n3) {
                        return false;
                    }
                    break Label_0023;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int n3 = -1;
                    if (n == n3) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            n2 = this.getParentId();
        }
        WidgetChild widgetChild = Widgets.getChild(n2);
    Label_0078:
        while (true) {
            while (widgetChild.getScrollableContentHeight() == 0) {
                Label_0054: {
                    int parentId;
                    try {
                        parentId = widgetChild.getParentId();
                        if (a) {
                            break Label_0078;
                        }
                        final boolean b = a;
                        if (!b) {
                            break Label_0054;
                        }
                        break Label_0078;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        final boolean b = a;
                        if (b) {
                            break Label_0078;
                        }
                        if (parentId == -1) {
                            break;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                widgetChild = Widgets.getChild(widgetChild.getParentId());
                if (a) {
                    break;
                }
                continue;
                int parentId = 0;
                final int n4 = parentId;
                int n5 = 0;
                Label_0095: {
                    try {
                        n5 = n4;
                        if (a) {
                            return n5 != 0;
                        }
                        if (n5 == 0) {
                            break Label_0095;
                        }
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                    return n5 != 0;
                }
                return n5 != 0;
            }
            widgetChild.getScrollableContentHeight();
            continue Label_0078;
        }
    }
    
    private RSInterface getInternal() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.parent:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //     8: iload_3        
        //     9: ifne            99
        //    12: ifnull          94
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.parent:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    23: invokespecial   org/powerbot/game/api/wrappers/widget/WidgetChild.getInternal:()Lorg/powerbot/game/client/RSInterface;
        //    26: astore_1       
        //    27: aload_1        
        //    28: iload_3        
        //    29: ifne            40
        //    32: ifnull          90
        //    35: goto            39
        //    38: athrow         
        //    39: aload_1        
        //    40: invokeinterface org/powerbot/game/client/RSInterface.getComponents:()[Lorg/powerbot/game/client/RSInterface;
        //    45: astore_2       
        //    46: aload_2        
        //    47: ifnull          90
        //    50: aload_0        
        //    51: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.index:I
        //    54: iload_3        
        //    55: ifne            77
        //    58: goto            62
        //    61: athrow         
        //    62: iflt            90
        //    65: goto            69
        //    68: athrow         
        //    69: aload_0        
        //    70: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.index:I
        //    73: goto            77
        //    76: athrow         
        //    77: aload_2        
        //    78: arraylength    
        //    79: if_icmpge       90
        //    82: aload_2        
        //    83: aload_0        
        //    84: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.index:I
        //    87: aaload         
        //    88: areturn        
        //    89: athrow         
        //    90: iload_3        
        //    91: ifeq            131
        //    94: aload_0        
        //    95: goto            99
        //    98: athrow         
        //    99: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.parentWidget:Lorg/powerbot/game/api/wrappers/widget/Widget;
        //   102: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildrenInternal:()[Lorg/powerbot/game/client/RSInterface;
        //   105: astore_1       
        //   106: aload_1        
        //   107: ifnull          131
        //   110: aload_0        
        //   111: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.index:I
        //   114: aload_1        
        //   115: arraylength    
        //   116: if_icmpge       131
        //   119: goto            123
        //   122: athrow         
        //   123: aload_1        
        //   124: aload_0        
        //   125: getfield        org/powerbot/game/api/wrappers/widget/WidgetChild.index:I
        //   128: aaload         
        //   129: areturn        
        //   130: athrow         
        //   131: aconst_null    
        //   132: areturn        
        //    StackMapTable: 00 14 FF 00 12 00 04 07 00 41 00 00 01 00 01 07 01 7E 00 FF 00 12 00 04 07 00 41 07 00 E4 00 01 00 01 07 01 7E 00 40 07 00 E4 FF 00 14 00 04 07 00 41 07 00 E4 07 01 87 01 00 01 07 01 7E 40 01 45 07 01 7E 00 46 07 01 7E 40 01 4B 07 01 7E FF 00 00 00 04 07 00 41 07 00 E4 00 01 00 00 FF 00 03 00 04 07 00 41 00 00 01 00 00 43 07 01 7E 40 07 00 41 FF 00 16 00 04 07 00 41 07 01 87 00 01 00 01 07 01 7E 00 46 07 01 7E FF 00 00 00 04 07 00 41 07 00 6D 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  110    130    130    131    Ljava/lang/RuntimeException;
        //  106    119    122    123    Ljava/lang/RuntimeException;
        //  90     95     98     99     Ljava/lang/RuntimeException;
        //  77     89     89     90     Ljava/lang/RuntimeException;
        //  62     73     76     77     Ljava/lang/RuntimeException;
        //  50     65     68     69     Ljava/lang/RuntimeException;
        //  46     58     61     62     Ljava/lang/RuntimeException;
        //  27     35     38     39     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0062:
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
    public boolean isOnScreen() {
        final boolean a = WidgetChild.a;
        Label_0027: {
            boolean validate = false;
            boolean visible = false;
            Label_0019: {
                boolean b;
                try {
                    b = (visible = (validate = this.validate()));
                    if (a) {
                        break Label_0027;
                    }
                    if (b) {
                        break Label_0019;
                    }
                    return false;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (!b) {
                        return false;
                    }
                    validate = (visible = this.visible());
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a) {
                    return validate;
                }
                if (!visible) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return true;
        validate = false;
        return validate;
    }
    
    @Override
    public Polygon[] getBounds() {
        int validate = 0;
        Label_0111: {
            try {
                validate = (this.validate() ? 1 : 0);
                if (WidgetChild.a) {
                    return new Polygon[validate];
                }
                if (validate == 0) {
                    break Label_0111;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Point absoluteLocation = this.getAbsoluteLocation();
            final int width = this.getWidth();
            final int height = this.getHeight();
            final Polygon polygon = new Polygon();
            polygon.addPoint(absoluteLocation.x, absoluteLocation.y);
            polygon.addPoint(absoluteLocation.x + width, absoluteLocation.y);
            polygon.addPoint(absoluteLocation.x + width, absoluteLocation.y + height);
            polygon.addPoint(absoluteLocation.x, absoluteLocation.y + height);
            return new Polygon[] { polygon };
        }
        return new Polygon[validate];
    }
    
    public Rectangle getBoundingRectangle() {
        WidgetChild widgetChild = null;
        Label_0017: {
            try {
                widgetChild = this;
                if (WidgetChild.a) {
                    break Label_0017;
                }
                final boolean b = this.validate();
                if (b) {
                    break Label_0017;
                }
                return new Rectangle(-1, -1);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = this.validate();
                if (!b) {
                    return new Rectangle(-1, -1);
                }
                widgetChild = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Point absoluteLocation = widgetChild.getAbsoluteLocation();
        return new Rectangle(absoluteLocation.x, absoluteLocation.y, this.getWidth(), this.getHeight());
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
        final Polygon[] bounds = this.getBounds();
        try {
            if (bounds.length == 1) {
                graphics.drawPolygon(bounds[0]);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
    }
    
    @Override
    public Point getCentralPoint() {
        final Point absoluteLocation = this.getAbsoluteLocation();
        final int width = this.getWidth();
        final int height = this.getHeight();
        try {
            if (this.validate()) {
                return new Point((absoluteLocation.x * 2 + width) / 2, (absoluteLocation.y * 2 + height) / 2);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return new Point(-1, -1);
    }
    
    @Override
    public Point getNextViewportPoint() {
        final boolean a = WidgetChild.a;
        final Rectangle boundingRectangle = this.getBoundingRectangle();
        int n4 = 0;
        int n9 = 0;
        Label_0106: {
            Label_0090: {
                int height = 0;
                int n8 = 0;
                Label_0078: {
                    Label_0069: {
                        int n3 = 0;
                        int n7 = 0;
                        Label_0057: {
                            Label_0048: {
                                int n2 = 0;
                                int n6 = 0;
                                Label_0036: {
                                    Label_0027: {
                                        int n;
                                        int n5;
                                        try {
                                            n = (n2 = (n3 = (height = (n4 = boundingRectangle.x))));
                                            n5 = (n6 = (n7 = (n8 = (n9 = -1))));
                                            if (a) {
                                                break Label_0036;
                                            }
                                            if (n != n5) {
                                                break Label_0027;
                                            }
                                            break Label_0090;
                                        }
                                        catch (RuntimeException ex) {
                                            throw ex;
                                        }
                                        try {
                                            if (n == n5) {
                                                break Label_0090;
                                            }
                                            n3 = (n2 = (height = (n4 = boundingRectangle.y)));
                                            n7 = (n6 = (n8 = (n9 = -1)));
                                        }
                                        catch (RuntimeException ex2) {
                                            throw ex2;
                                        }
                                    }
                                    try {
                                        if (a) {
                                            break Label_0057;
                                        }
                                        if (n2 != n6) {
                                            break Label_0048;
                                        }
                                        break Label_0090;
                                    }
                                    catch (RuntimeException ex3) {
                                        throw ex3;
                                    }
                                }
                                try {
                                    if (n2 == n6) {
                                        break Label_0090;
                                    }
                                    height = (n3 = (n4 = boundingRectangle.width));
                                    n8 = (n7 = (n9 = -1));
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                            }
                            try {
                                if (a) {
                                    break Label_0078;
                                }
                                if (n3 != n7) {
                                    break Label_0069;
                                }
                                break Label_0090;
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        try {
                            if (n3 == n7) {
                                break Label_0090;
                            }
                            n4 = (height = boundingRectangle.height);
                            n9 = (n8 = -1);
                        }
                        catch (RuntimeException ex6) {
                            throw ex6;
                        }
                    }
                    try {
                        if (a) {
                            break Label_0106;
                        }
                        if (height == n8) {
                            break Label_0090;
                        }
                        break Label_0090;
                    }
                    catch (RuntimeException ex7) {
                        throw ex7;
                    }
                }
                try {
                    if (height == n8) {
                        return new Point(-1, -1);
                    }
                }
                catch (RuntimeException ex8) {
                    throw ex8;
                }
            }
            n4 = boundingRectangle.x;
            n9 = 1;
        }
        final int n10 = n4 + n9;
        final int n11 = boundingRectangle.y + 1;
        return new Point(Random.nextGaussian(n10, n10 + boundingRectangle.width - 2, boundingRectangle.width / 3), Random.nextGaussian(n11, n11 + boundingRectangle.height - 2, boundingRectangle.height / 3));
    }
    
    @Override
    public boolean contains(final Point p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getBoundingRectangle:()Ljava/awt/Rectangle;
        //     9: astore_2       
        //    10: aload_2        
        //    11: getfield        java/awt/Rectangle.x:I
        //    14: iload           7
        //    16: ifne            91
        //    19: iconst_m1      
        //    20: if_icmpeq       90
        //    23: goto            27
        //    26: athrow         
        //    27: aload_2        
        //    28: getfield        java/awt/Rectangle.y:I
        //    31: iload           7
        //    33: ifne            91
        //    36: goto            40
        //    39: athrow         
        //    40: iconst_m1      
        //    41: if_icmpeq       90
        //    44: goto            48
        //    47: athrow         
        //    48: aload_2        
        //    49: getfield        java/awt/Rectangle.width:I
        //    52: iload           7
        //    54: ifne            91
        //    57: goto            61
        //    60: athrow         
        //    61: iconst_m1      
        //    62: if_icmpeq       90
        //    65: goto            69
        //    68: athrow         
        //    69: aload_2        
        //    70: getfield        java/awt/Rectangle.height:I
        //    73: iconst_m1      
        //    74: iload           7
        //    76: ifne            97
        //    79: goto            83
        //    82: athrow         
        //    83: if_icmpne       92
        //    86: goto            90
        //    89: athrow         
        //    90: iconst_0       
        //    91: ireturn        
        //    92: aload_2        
        //    93: getfield        java/awt/Rectangle.x:I
        //    96: iconst_1       
        //    97: iadd           
        //    98: istore_3       
        //    99: aload_2        
        //   100: getfield        java/awt/Rectangle.y:I
        //   103: iconst_1       
        //   104: iadd           
        //   105: istore          4
        //   107: iload_3        
        //   108: aload_2        
        //   109: getfield        java/awt/Rectangle.width:I
        //   112: iadd           
        //   113: iconst_2       
        //   114: isub           
        //   115: istore          5
        //   117: iload           4
        //   119: aload_2        
        //   120: getfield        java/awt/Rectangle.height:I
        //   123: iadd           
        //   124: iconst_2       
        //   125: isub           
        //   126: istore          6
        //   128: aload_1        
        //   129: getfield        java/awt/Point.x:I
        //   132: iload_3        
        //   133: iload           7
        //   135: ifne            155
        //   138: if_icmplt       215
        //   141: goto            145
        //   144: athrow         
        //   145: aload_1        
        //   146: getfield        java/awt/Point.x:I
        //   149: iload           5
        //   151: goto            155
        //   154: athrow         
        //   155: iload           7
        //   157: ifne            177
        //   160: if_icmpgt       215
        //   163: goto            167
        //   166: athrow         
        //   167: aload_1        
        //   168: getfield        java/awt/Point.y:I
        //   171: iload           4
        //   173: goto            177
        //   176: athrow         
        //   177: iload           7
        //   179: ifne            208
        //   182: if_icmplt       215
        //   185: goto            189
        //   188: athrow         
        //   189: aload_1        
        //   190: getfield        java/awt/Point.y:I
        //   193: iload           7
        //   195: ifne            212
        //   198: goto            202
        //   201: athrow         
        //   202: iload           6
        //   204: goto            208
        //   207: athrow         
        //   208: if_icmpgt       215
        //   211: iconst_1       
        //   212: goto            216
        //   215: iconst_0       
        //   216: ireturn        
        //    StackMapTable: 00 22 FF 00 1A 00 08 07 00 41 07 00 09 07 00 5A 00 00 00 00 01 00 01 07 01 7E 00 4B 07 01 7E 40 01 46 07 01 7E 00 4B 07 01 7E 40 01 46 07 01 7E 00 4C 07 01 7E FF 00 00 00 08 07 00 41 07 00 09 07 00 5A 00 00 00 00 01 00 02 01 01 45 07 01 7E 00 40 01 00 FF 00 04 00 08 07 00 41 07 00 09 07 00 5A 00 00 00 00 01 00 02 01 01 FF 00 2E 00 08 07 00 41 07 00 09 07 00 5A 01 01 01 01 01 00 01 07 01 7E 00 48 07 01 7E FF 00 00 00 08 07 00 41 07 00 09 07 00 5A 01 01 01 01 01 00 02 01 01 4A 07 01 7E 00 48 07 01 7E FF 00 00 00 08 07 00 41 07 00 09 07 00 5A 01 01 01 01 01 00 02 01 01 4A 07 01 7E 00 4B 07 01 7E 40 01 44 07 01 7E FF 00 00 00 08 07 00 41 07 00 09 07 00 5A 01 01 01 01 01 00 02 01 01 43 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  189    204    207    208    Ljava/lang/RuntimeException;
        //  182    198    201    202    Ljava/lang/RuntimeException;
        //  177    185    188    189    Ljava/lang/RuntimeException;
        //  160    173    176    177    Ljava/lang/RuntimeException;
        //  155    163    166    167    Ljava/lang/RuntimeException;
        //  138    151    154    155    Ljava/lang/RuntimeException;
        //  128    141    144    145    Ljava/lang/RuntimeException;
        //  69     86     89     90     Ljava/lang/RuntimeException;
        //  61     79     82     83     Ljava/lang/RuntimeException;
        //  48     65     68     69     Ljava/lang/RuntimeException;
        //  40     57     60     61     Ljava/lang/RuntimeException;
        //  27     44     47     48     Ljava/lang/RuntimeException;
        //  19     36     39     40     Ljava/lang/RuntimeException;
        //  10     23     26     27     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    public boolean validate() {
        final boolean a = WidgetChild.a;
        int validate = 0;
        Label_0042: {
            boolean boundsArrayIndex = false;
            Label_0030: {
                Label_0022: {
                    boolean b;
                    try {
                        b = (boundsArrayIndex = ((validate = (this.parentWidget.validate() ? 1 : 0)) != 0));
                        if (a) {
                            break Label_0030;
                        }
                        if (b) {
                            break Label_0022;
                        }
                        return false;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (!b) {
                            return false;
                        }
                        validate = ((boundsArrayIndex = (this.getBoundsArrayIndex() != 0)) ? 1 : 0);
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (a) {
                        return validate != 0;
                    }
                    final int n = -1;
                    if ((boundsArrayIndex ? 1 : 0) != n) {
                        break Label_0042;
                    }
                    return false;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                final int n = -1;
                if ((boundsArrayIndex ? 1 : 0) == n) {
                    return false;
                }
                validate = 1;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        return validate != 0;
        validate = 0;
        return validate != 0;
    }
}
