
package org.powerbot.core.script.wrappers;

import org.powerbot.core.script.methods.Widgets;
import java.awt.Rectangle;
import java.awt.Point;
import org.powerbot.game.client.RSInterface;

public class Component
{
    private final Widget widget;
    private final Component parent;
    private final int index;
    public static int a;
    
    public Component(final Widget widget, final int n) {
        this(widget, null, n);
    }
    
    public Component(final Widget widget, final Component parent, final int index) {
        this.widget = widget;
        this.parent = parent;
        this.index = index;
    }
    
    public Widget getWidget() {
        return this.widget;
    }
    
    public Component getParent() {
        return this.parent;
    }
    
    public int getIndex() {
        return this.index;
    }
    
    public String[] getActions() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getTextureId() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getBorderThickness() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getId() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getChildIndex() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public String getItemName() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getItemId() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getItemStackSize() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getModelId() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getParentId() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_0        
        //    10: invokespecial   org/powerbot/core/script/wrappers/Component.getInternalComponent:()Lorg/powerbot/game/client/RSInterface;
        //    13: astore_2       
        //    14: aload_1        
        //    15: ifnull          35
        //    18: aload_2        
        //    19: iload           7
        //    21: ifne            39
        //    24: goto            28
        //    27: athrow         
        //    28: ifnonnull       38
        //    31: goto            35
        //    34: athrow         
        //    35: iconst_m1      
        //    36: ireturn        
        //    37: athrow         
        //    38: aload_2        
        //    39: invokeinterface org/powerbot/game/client/RSInterface.getParentID:()I
        //    44: istore_3       
        //    45: iload_3        
        //    46: iconst_m1      
        //    47: iload           7
        //    49: ifne            68
        //    52: if_icmpeq       62
        //    55: goto            59
        //    58: athrow         
        //    59: iload_3        
        //    60: ireturn        
        //    61: athrow         
        //    62: aload_0        
        //    63: invokevirtual   org/powerbot/core/script/wrappers/Component.getId:()I
        //    66: bipush          16
        //    68: iushr          
        //    69: istore          4
        //    71: new             Lorg/powerbot/core/script/internal/wrappers/HashTable;
        //    74: dup            
        //    75: aload_1        
        //    76: invokeinterface org/powerbot/game/client/Client.getRSInterfaceNC:()Lorg/powerbot/game/client/HashTable;
        //    81: invokespecial   org/powerbot/core/script/internal/wrappers/HashTable.<init>:(Lorg/powerbot/game/client/HashTable;)V
        //    84: astore          5
        //    86: aload           5
        //    88: invokevirtual   org/powerbot/core/script/internal/wrappers/HashTable.getFirst:()Lorg/powerbot/game/client/Node;
        //    91: checkcast       Lorg/powerbot/game/client/RSInterfaceNode;
        //    94: astore          6
        //    96: aload           6
        //    98: ifnull          159
        //   101: iload           4
        //   103: iload           7
        //   105: ifne            160
        //   108: iload           7
        //   110: ifne            143
        //   113: goto            117
        //   116: athrow         
        //   117: aload           6
        //   119: invokeinterface org/powerbot/game/client/RSInterfaceNode.getMainID:()I
        //   124: if_icmpne       144
        //   127: goto            131
        //   130: athrow         
        //   131: aload           6
        //   133: invokeinterface org/powerbot/game/client/RSInterfaceNode.getId:()J
        //   138: l2i            
        //   139: goto            143
        //   142: athrow         
        //   143: ireturn        
        //   144: aload           5
        //   146: invokevirtual   org/powerbot/core/script/internal/wrappers/HashTable.getNext:()Lorg/powerbot/game/client/Node;
        //   149: checkcast       Lorg/powerbot/game/client/RSInterfaceNode;
        //   152: astore          6
        //   154: iload           7
        //   156: ifeq            96
        //   159: iconst_m1      
        //   160: ireturn        
        //    StackMapTable: 00 16 FF 00 1B 00 08 07 00 4D 07 00 A3 07 00 92 00 00 00 00 01 00 01 07 01 1B 40 07 00 92 45 07 01 1B 00 41 07 01 1B 00 40 07 00 92 FF 00 12 00 08 07 00 4D 07 00 A3 07 00 92 01 00 00 00 01 00 01 07 01 1B 00 41 07 01 1B 00 FF 00 05 00 08 07 00 4D 07 00 A3 07 00 92 01 00 00 00 01 00 02 01 01 FF 00 1B 00 08 07 00 4D 07 00 A3 07 00 92 01 01 07 00 15 07 00 19 01 00 00 53 07 01 1B 40 01 4C 07 01 1B 00 4A 07 01 1B 40 01 00 0E 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  117    139    142    143    Ljava/lang/RuntimeException;
        //  108    127    130    131    Ljava/lang/RuntimeException;
        //  101    113    116    117    Ljava/lang/RuntimeException;
        //  52     61     61     62     Ljava/lang/RuntimeException;
        //  45     55     58     59     Ljava/lang/RuntimeException;
        //  28     37     37     38     Ljava/lang/RuntimeException;
        //  18     31     34     35     Ljava/lang/RuntimeException;
        //  14     24     27     28     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0028:
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
    
    public Point getAbsoluteLocation() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/core/Bot.client:()Lorg/powerbot/game/client/Client;
        //     8: astore_1       
        //     9: aload_0        
        //    10: invokespecial   org/powerbot/core/script/wrappers/Component.getInternalComponent:()Lorg/powerbot/game/client/RSInterface;
        //    13: astore_2       
        //    14: aload_1        
        //    15: ifnull          26
        //    18: aload_2        
        //    19: ifnonnull       37
        //    22: goto            26
        //    25: athrow         
        //    26: new             Ljava/awt/Point;
        //    29: dup            
        //    30: iconst_m1      
        //    31: iconst_m1      
        //    32: invokespecial   java/awt/Point.<init>:(II)V
        //    35: areturn        
        //    36: athrow         
        //    37: aload_0        
        //    38: invokevirtual   org/powerbot/core/script/wrappers/Component.getParentId:()I
        //    41: istore_3       
        //    42: iconst_0       
        //    43: istore          4
        //    45: iconst_0       
        //    46: istore          5
        //    48: iload_3        
        //    49: iconst_m1      
        //    50: iload           9
        //    52: ifne            74
        //    55: if_icmpeq       101
        //    58: goto            62
        //    61: athrow         
        //    62: iload_3        
        //    63: bipush          16
        //    65: ishr           
        //    66: iload_3        
        //    67: ldc             65535
        //    69: iand           
        //    70: goto            74
        //    73: athrow         
        //    74: invokestatic    org/powerbot/core/script/methods/Widgets.get:(II)Lorg/powerbot/core/script/wrappers/Component;
        //    77: invokevirtual   org/powerbot/core/script/wrappers/Component.getAbsoluteLocation:()Ljava/awt/Point;
        //    80: astore          6
        //    82: aload           6
        //    84: getfield        java/awt/Point.x:I
        //    87: istore          4
        //    89: aload           6
        //    91: getfield        java/awt/Point.y:I
        //    94: istore          5
        //    96: iload           9
        //    98: ifeq            203
        //   101: aload_1        
        //   102: invokeinterface org/powerbot/game/client/Client.getRSInterfaceBoundsArray:()[Ljava/awt/Rectangle;
        //   107: astore          6
        //   109: aload_2        
        //   110: invokeinterface org/powerbot/game/client/RSInterface.getBoundsArrayIndex:()I
        //   115: iload           9
        //   117: ifne            204
        //   120: istore          7
        //   122: aload           6
        //   124: ifnull          203
        //   127: iload           7
        //   129: iload           9
        //   131: ifne            204
        //   134: goto            138
        //   137: athrow         
        //   138: ifle            203
        //   141: goto            145
        //   144: athrow         
        //   145: iload           7
        //   147: aload           6
        //   149: arraylength    
        //   150: iload           9
        //   152: ifne            205
        //   155: goto            159
        //   158: athrow         
        //   159: if_icmpge       203
        //   162: goto            166
        //   165: athrow         
        //   166: aload           6
        //   168: iload           7
        //   170: aaload         
        //   171: ifnull          203
        //   174: goto            178
        //   177: athrow         
        //   178: new             Ljava/awt/Point;
        //   181: dup            
        //   182: aload           6
        //   184: iload           7
        //   186: aaload         
        //   187: getfield        java/awt/Rectangle.x:I
        //   190: aload           6
        //   192: iload           7
        //   194: aaload         
        //   195: getfield        java/awt/Rectangle.y:I
        //   198: invokespecial   java/awt/Point.<init>:(II)V
        //   201: areturn        
        //   202: athrow         
        //   203: iload_3        
        //   204: iconst_m1      
        //   205: iload           9
        //   207: ifne            315
        //   210: if_icmpeq       296
        //   213: goto            217
        //   216: athrow         
        //   217: iload_3        
        //   218: bipush          16
        //   220: ishr           
        //   221: iload_3        
        //   222: ldc             65535
        //   224: iand           
        //   225: invokestatic    org/powerbot/core/script/methods/Widgets.get:(II)Lorg/powerbot/core/script/wrappers/Component;
        //   228: astore          6
        //   230: aload           6
        //   232: invokevirtual   org/powerbot/core/script/wrappers/Component.getMaxHorizontalScroll:()I
        //   235: istore          7
        //   237: aload           6
        //   239: invokevirtual   org/powerbot/core/script/wrappers/Component.getMaxVerticalScroll:()I
        //   242: istore          8
        //   244: iload           7
        //   246: iload           9
        //   248: ifne            294
        //   251: ifgt            276
        //   254: goto            258
        //   257: athrow         
        //   258: iload           8
        //   260: iload           9
        //   262: ifne            316
        //   265: goto            269
        //   268: athrow         
        //   269: ifle            296
        //   272: goto            276
        //   275: athrow         
        //   276: iload           4
        //   278: aload           6
        //   280: invokevirtual   org/powerbot/core/script/wrappers/Component.getScrollX:()I
        //   283: isub           
        //   284: istore          4
        //   286: iload           5
        //   288: aload           6
        //   290: invokevirtual   org/powerbot/core/script/wrappers/Component.getScrollY:()I
        //   293: isub           
        //   294: istore          5
        //   296: iload           4
        //   298: aload_2        
        //   299: invokeinterface org/powerbot/game/client/RSInterface.getX:()I
        //   304: iadd           
        //   305: istore          4
        //   307: iload           5
        //   309: aload_2        
        //   310: invokeinterface org/powerbot/game/client/RSInterface.getY:()I
        //   315: iadd           
        //   316: istore          5
        //   318: new             Ljava/awt/Point;
        //   321: dup            
        //   322: iload           4
        //   324: iload           5
        //   326: invokespecial   java/awt/Point.<init>:(II)V
        //   329: areturn        
        //    StackMapTable: 00 23 FF 00 19 00 0A 07 00 4D 07 00 A3 07 00 92 00 00 00 00 00 00 01 00 01 07 01 1B 00 49 07 01 1B 00 FF 00 17 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 00 00 00 01 00 01 07 01 1B 00 4A 07 01 1B FF 00 00 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 00 00 00 01 00 02 01 01 1A FF 00 23 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 01 20 01 00 01 00 01 07 01 1B 40 01 45 07 01 1B 00 4C 07 01 1B FF 00 00 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 01 20 01 00 01 00 02 01 01 45 07 01 1B 00 4A 07 01 1B 00 57 07 01 1B FF 00 00 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 00 4E 00 00 01 00 00 40 01 FF 00 00 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 00 4E 00 00 01 00 02 01 01 4A 07 01 1B 00 FF 00 27 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 00 4D 01 01 01 00 01 07 01 1B 00 49 07 01 1B 40 01 45 07 01 1B 00 51 01 FF 00 01 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 00 4E 00 00 01 00 00 FF 00 12 00 0A 07 00 4D 07 00 A3 07 00 92 01 01 01 07 00 4E 00 00 01 00 02 01 01 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  258    272    275    276    Ljava/lang/RuntimeException;
        //  251    265    268    269    Ljava/lang/RuntimeException;
        //  244    254    257    258    Ljava/lang/RuntimeException;
        //  205    213    216    217    Ljava/lang/RuntimeException;
        //  166    202    202    203    Ljava/lang/RuntimeException;
        //  159    174    177    178    Ljava/lang/RuntimeException;
        //  145    162    165    166    Ljava/lang/RuntimeException;
        //  138    155    158    159    Ljava/lang/RuntimeException;
        //  127    141    144    145    Ljava/lang/RuntimeException;
        //  122    134    137    138    Ljava/lang/RuntimeException;
        //  55     70     73     74     Ljava/lang/RuntimeException;
        //  48     58     61     62     Ljava/lang/RuntimeException;
        //  18     36     36     37     Ljava/lang/RuntimeException;
        //  14     22     25     26     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0138:
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
    
    public Point getRelativeLocation() {
        final RSInterface internalComponent = this.getInternalComponent();
        try {
            if (internalComponent != null) {
                return new Point(internalComponent.getX(), internalComponent.getY());
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return new Point(-1, -1);
    }
    
    public String getSelectedAction() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getShadowColor() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getContentType() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public String getText() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public String getTooltip() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getType() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getWidth() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
                return rsInterface.getWidth();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getWidth();
        width = -1;
        return width;
    }
    
    public int getHeight() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
                return rsInterface.getHeight();
            }
            if (rsInterface == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsInterface.getHeight();
        height = -1;
        return height;
    }
    
    public int getXRotation() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public boolean isVerticallyFlipped() {
        final int a = Component.a;
        final RSInterface internalComponent = this.getInternalComponent();
        boolean verticallyFlipped = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internalComponent;
                    if (a != 0) {
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
                    if (a != 0) {
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
    
    public boolean isHorizontallyFlipped() {
        final int a = Component.a;
        final RSInterface internalComponent = this.getInternalComponent();
        boolean horizontallyFlipped = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internalComponent;
                    if (a != 0) {
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
                    if (a != 0) {
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
    
    public int getScrollX() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getMaxHorizontalScroll() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getScrollWidth() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getScrollY() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getMaxVerticalScroll() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public int getScrollHeight() {
        final RSInterface internalComponent = this.getInternalComponent();
        RSInterface rsInterface;
        try {
            rsInterface = internalComponent;
            if (Component.a != 0) {
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
    
    public boolean isInventory() {
        final int a = Component.a;
        final RSInterface internalComponent = this.getInternalComponent();
        boolean inventoryInterface = false;
        Label_0042: {
            Label_0022: {
                RSInterface rsInterface;
                try {
                    rsInterface = internalComponent;
                    if (a != 0) {
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
                    if (a != 0) {
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
    
    private Rectangle getInteractRectangle() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_0        
        //     5: invokevirtual   org/powerbot/core/script/wrappers/Component.getAbsoluteLocation:()Ljava/awt/Point;
        //     8: astore_1       
        //     9: aload_1        
        //    10: getfield        java/awt/Point.x:I
        //    13: iload_3        
        //    14: ifne            62
        //    17: iconst_m1      
        //    18: if_icmpne       58
        //    21: goto            25
        //    24: athrow         
        //    25: aload_1        
        //    26: getfield        java/awt/Point.y:I
        //    29: iload_3        
        //    30: ifne            62
        //    33: goto            37
        //    36: athrow         
        //    37: iconst_m1      
        //    38: if_icmpne       58
        //    41: goto            45
        //    44: athrow         
        //    45: new             Ljava/awt/Rectangle;
        //    48: dup            
        //    49: iconst_m1      
        //    50: iconst_m1      
        //    51: iconst_0       
        //    52: iconst_0       
        //    53: invokespecial   java/awt/Rectangle.<init>:(IIII)V
        //    56: areturn        
        //    57: athrow         
        //    58: aload_0        
        //    59: invokespecial   org/powerbot/core/script/wrappers/Component.isInScrollableArea:()Z
        //    62: istore_2       
        //    63: new             Ljava/awt/Rectangle;
        //    66: dup            
        //    67: aload_1        
        //    68: getfield        java/awt/Point.x:I
        //    71: aload_1        
        //    72: getfield        java/awt/Point.y:I
        //    75: iload_2        
        //    76: ifeq            86
        //    79: aload_0        
        //    80: invokevirtual   org/powerbot/core/script/wrappers/Component.getWidth:()I
        //    83: goto            90
        //    86: aload_0        
        //    87: invokevirtual   org/powerbot/core/script/wrappers/Component.getScrollWidth:()I
        //    90: iload_2        
        //    91: ifeq            101
        //    94: aload_0        
        //    95: invokevirtual   org/powerbot/core/script/wrappers/Component.getHeight:()I
        //    98: goto            105
        //   101: aload_0        
        //   102: invokevirtual   org/powerbot/core/script/wrappers/Component.getScrollHeight:()I
        //   105: invokespecial   java/awt/Rectangle.<init>:(IIII)V
        //   108: areturn        
        //    StackMapTable: 00 0D FF 00 18 00 04 07 00 4D 07 00 1D 00 01 00 01 07 01 1B 00 4A 07 01 1B 40 01 46 07 01 1B 00 4B 07 01 1B 00 43 01 FF 00 17 00 04 07 00 4D 07 00 1D 01 01 00 04 08 00 3F 08 00 3F 01 01 FF 00 03 00 04 07 00 4D 07 00 1D 01 01 00 05 08 00 3F 08 00 3F 01 01 01 FF 00 0A 00 04 07 00 4D 07 00 1D 01 01 00 05 08 00 3F 08 00 3F 01 01 01 FF 00 03 00 04 07 00 4D 07 00 1D 01 01 00 06 08 00 3F 08 00 3F 01 01 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  37     57     57     58     Ljava/lang/RuntimeException;
        //  25     41     44     45     Ljava/lang/RuntimeException;
        //  17     33     36     37     Ljava/lang/RuntimeException;
        //  9      21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private boolean isInScrollableArea() {
        final int a = Component.a;
        final int parentId = this.getParentId();
        int n2 = 0;
        int n4 = 0;
        Label_0033: {
            Label_0025: {
                int n;
                int n3;
                try {
                    n = (n2 = parentId);
                    n3 = (n4 = -1);
                    if (a != 0) {
                        break Label_0033;
                    }
                    if (n == n3) {
                        return false;
                    }
                    break Label_0025;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == n3) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            n2 = parentId >> 16;
            n4 = (parentId & 0xFFFF);
        }
        Component component = Widgets.get(n2, n4);
        while (true) {
            while (component.getMaxVerticalScroll() == 0) {
                int parentId2;
                final int maxVerticalScroll;
                final int n6;
                final int n5 = n6 = (maxVerticalScroll = (parentId2 = component.getParentId()));
                Label_0090: {
                    Label_0062: {
                        try {
                            if (a != 0) {
                                break Label_0090;
                            }
                            final int n7 = a;
                            if (n7 == 0) {
                                break Label_0062;
                            }
                            break Label_0090;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            final int n7 = a;
                            if (n7 != 0) {
                                break Label_0090;
                            }
                            if (n5 == -1) {
                                break;
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    component = Widgets.get(n6 >> 16, n6 & 0xFFFF);
                    if (a != 0) {
                        break;
                    }
                    continue;
                    try {
                        if (a != 0) {
                            return parentId2 != 0;
                        }
                        if (maxVerticalScroll == 0) {
                            return false;
                        }
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                parentId2 = 1;
                return parentId2 != 0;
                parentId2 = 0;
                return parentId2 != 0;
            }
            int maxVerticalScroll;
            int parentId2 = maxVerticalScroll = component.getMaxVerticalScroll();
            continue;
        }
    }
    
    private RSInterface getInternalComponent() {
        final int a = Component.a;
        Label_0083: {
            RSInterface[] internalComponents = null;
            Label_0066: {
                Component parent = null;
                Label_0054: {
                    try {
                        parent = this.parent;
                        if (a != 0) {
                            break Label_0054;
                        }
                        if (parent == null) {
                            break Label_0054;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    final RSInterface internalComponent = this.parent.getInternalComponent();
                    RSInterface[] components = null;
                    Label_0049: {
                        Label_0048: {
                            RSInterface rsInterface = null;
                            Label_0040: {
                                try {
                                    rsInterface = internalComponent;
                                    if (a != 0) {
                                        break Label_0040;
                                    }
                                    if (rsInterface == null) {
                                        break Label_0048;
                                    }
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                            }
                            components = rsInterface.getComponents();
                            break Label_0049;
                        }
                        components = null;
                    }
                    internalComponents = components;
                    try {
                        if (a == 0) {
                            break Label_0066;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                internalComponents = parent.widget.getInternalComponents();
                try {
                    if (internalComponents == null) {
                        return null;
                    }
                    final Component component = this;
                    final int n = component.index;
                    final RSInterface[] array = internalComponents;
                    final int n2 = array.length;
                    if (n < n2) {
                        break Label_0083;
                    }
                    return null;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            try {
                final Component component = this;
                final int n = component.index;
                final RSInterface[] array = internalComponents;
                final int n2 = array.length;
                if (n < n2) {
                    return internalComponents[this.index];
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        return null;
    }
    
    public static String e(final String s) {
        final int n = (0x2 ^ 0x5) << 4;
        final int n2 = 2;
        final int n3 = n ^ (n2 << n2 ^ 0x1);
        final int n4 = (0x3 ^ 0x5) << 3;
        final int length = s.length();
        final char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        final char[] value = array;
        final char c = (char)n4;
        final int n6 = n3;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n5;
            final char char1 = s.charAt(index);
            --n5;
            array2[index] = (char)(char1 ^ n6);
            if (n5 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n5;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n5;
            array3[index2] = c2;
            i = n5;
        }
        return new String(value);
    }
}
