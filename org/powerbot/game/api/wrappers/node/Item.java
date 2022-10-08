
package org.powerbot.game.api.wrappers.node;

import org.powerbot.game.client.RSItemDef;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.bot.Context;
import org.powerbot.core.script.methods.GroundItems;
import org.o;
import org.powerbot.game.client.RSItem;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.wrappers.Identifiable;

public class Item implements Identifiable
{
    private final int id;
    private final int stack;
    private WidgetChild widgetChild;
    public static int a;
    private static final String[] z;
    
    public Item(final int id, final int stack) {
        this.id = id;
        this.stack = stack;
    }
    
    public Item(final RSItem rsItem) {
        this.id = rsItem.getId();
        this.stack = rsItem.getStackSize();
    }
    
    public Item(final WidgetChild widgetChild) {
        this.id = widgetChild.getChildId();
        this.stack = widgetChild.getChildStackSize();
        this.widgetChild = new WidgetChild_Item(widgetChild);
    }
    
    @Override
    public int getId() {
        return this.id;
    }
    
    public int getStackSize() {
        return this.stack;
    }
    
    public String getName() {
        final int a = Item.a;
        Item item = null;
        Label_0042: {
            Label_0019: {
                try {
                    item = this;
                    if (a != 0) {
                        break Label_0042;
                    }
                    final WidgetChild widgetChild = this.widgetChild;
                    if (widgetChild != null) {
                        break Label_0019;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final WidgetChild widgetChild = this.widgetChild;
                    if (widgetChild != null) {
                        return this.widgetChild.getChildName().replaceAll(o.a(Item.z[1]), "");
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            item = this;
        }
        final ItemDefinition definition = item.getDefinition();
        ItemDefinition itemDefinition;
        try {
            itemDefinition = definition;
            if (a != 0) {
                return itemDefinition.getName().replaceAll(GroundItems.e(Item.z[0]), "");
            }
            if (itemDefinition == null) {
                return null;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return itemDefinition.getName().replaceAll(GroundItems.e(Item.z[0]), "");
    }
    
    public ItemDefinition getDefinition() {
        try {
            final Object lookup = Nodes.lookup(Context.client().getRSItemDefLoader().getCache().getTable(), this.id);
            try {
                if (lookup != null) {
                    return new ItemDefinition((RSItemDef)lookup);
                }
            }
            catch (Exception ex) {
                throw ex;
            }
            return null;
        }
        catch (Exception ex2) {
            return null;
        }
    }
    
    public WidgetChild getWidgetChild() {
        return this.widgetChild;
    }
    
    @Override
    public boolean equals(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: aload_1        
        //     5: instanceof      Lorg/powerbot/game/api/wrappers/node/Item;
        //     8: iload_3        
        //     9: ifne            137
        //    12: ifeq            136
        //    15: goto            19
        //    18: athrow         
        //    19: aload_1        
        //    20: checkcast       Lorg/powerbot/game/api/wrappers/node/Item;
        //    23: astore_2       
        //    24: aload_2        
        //    25: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getId:()I
        //    28: iload_3        
        //    29: ifne            137
        //    32: aload_0        
        //    33: getfield        org/powerbot/game/api/wrappers/node/Item.id:I
        //    36: if_icmpne       136
        //    39: goto            43
        //    42: athrow         
        //    43: aload_2        
        //    44: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getStackSize:()I
        //    47: iload_3        
        //    48: ifne            137
        //    51: goto            55
        //    54: athrow         
        //    55: aload_0        
        //    56: getfield        org/powerbot/game/api/wrappers/node/Item.stack:I
        //    59: if_icmpne       136
        //    62: goto            66
        //    65: athrow         
        //    66: aload_0        
        //    67: getfield        org/powerbot/game/api/wrappers/node/Item.widgetChild:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    70: iload_3        
        //    71: ifne            93
        //    74: goto            78
        //    77: athrow         
        //    78: ifnull          130
        //    81: goto            85
        //    84: athrow         
        //    85: aload_2        
        //    86: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    89: goto            93
        //    92: athrow         
        //    93: iload_3        
        //    94: ifne            112
        //    97: ifnull          130
        //   100: goto            104
        //   103: athrow         
        //   104: aload_0        
        //   105: getfield        org/powerbot/game/api/wrappers/node/Item.widgetChild:Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   108: goto            112
        //   111: athrow         
        //   112: aload_2        
        //   113: invokevirtual   org/powerbot/game/api/wrappers/node/Item.getWidgetChild:()Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   116: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.equals:(Ljava/lang/Object;)Z
        //   119: iload_3        
        //   120: ifne            131
        //   123: ifeq            134
        //   126: goto            130
        //   129: athrow         
        //   130: iconst_1       
        //   131: goto            135
        //   134: iconst_0       
        //   135: ireturn        
        //   136: iconst_0       
        //   137: ireturn        
        //    StackMapTable: 00 19 FF 00 12 00 04 07 00 19 07 00 1E 00 01 00 01 07 00 8A 00 FF 00 16 00 04 07 00 19 07 00 1E 07 00 19 01 00 01 07 00 8A 00 4A 07 00 8A 40 01 49 07 00 8A 00 4A 07 00 8A 40 07 00 40 45 07 00 8A 00 46 07 00 8A 40 07 00 40 49 07 00 8A 00 46 07 00 8A 40 07 00 40 50 07 00 8A 00 40 01 02 40 01 FF 00 00 00 04 07 00 19 07 00 1E 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  112    126    129    130    Ljava/lang/RuntimeException;
        //  97     108    111    112    Ljava/lang/RuntimeException;
        //  93     100    103    104    Ljava/lang/RuntimeException;
        //  78     89     92     93     Ljava/lang/RuntimeException;
        //  66     81     84     85     Ljava/lang/RuntimeException;
        //  55     74     77     78     Ljava/lang/RuntimeException;
        //  43     62     65     66     Ljava/lang/RuntimeException;
        //  32     51     54     55     Ljava/lang/RuntimeException;
        //  24     39     42     43     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "Gqr\u000fEX";
        int n3 = -1;
        String intern = null;
    Label_0044_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n5;
            final int n4 = n5 = (length = charArray.length);
            int n6 = 0;
            while (true) {
                Label_0118: {
                    if (n4 > 1) {
                        break Label_0118;
                    }
                    length = (n5 = n6);
                    do {
                        final char c = charArray[n5];
                        char c2 = '\0';
                        switch (n6 % 5) {
                            case 0: {
                                c2 = '9';
                                break;
                            }
                            case 1: {
                                c2 = '\u0012';
                                break;
                            }
                            case 2: {
                                c2 = '~';
                                break;
                            }
                            case 3: {
                                c2 = 'z';
                                break;
                            }
                            default: {
                                c2 = 'X';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n6;
                    } while (n4 == 0);
                }
                if (n4 > n6) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n3) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = 1);
                    s = "%}\u0010\u0003'T";
                    n3 = 0;
                    continue Label_0044_Outer;
                }
                case 0: {
                    break Label_0044_Outer;
                }
            }
        }
        z2[n] = intern;
        z = z2;
    }
    
    private final class WidgetChild_Item extends WidgetChild
    {
        public WidgetChild_Item(final WidgetChild widgetChild) {
            super(widgetChild.getWidget(), widgetChild.getParent(), widgetChild.getIndex());
        }
        
        @Override
        public boolean validate() {
            final int a = Item.a;
            int validate = 0;
            Label_0045: {
                boolean childId = false;
                Label_0033: {
                    Label_0019: {
                        boolean b;
                        try {
                            b = (childId = ((validate = (super.validate() ? 1 : 0)) != 0));
                            if (a != 0) {
                                break Label_0033;
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
                            validate = ((childId = (Item.this.widgetChild.getChildId() != 0)) ? 1 : 0);
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (a != 0) {
                            return validate != 0;
                        }
                        final int n = -1;
                        if ((childId ? 1 : 0) != n) {
                            break Label_0045;
                        }
                        return false;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final int n = -1;
                    if ((childId ? 1 : 0) == n) {
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
}
