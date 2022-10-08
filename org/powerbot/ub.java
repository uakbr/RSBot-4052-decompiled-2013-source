
package org.powerbot;

import java.awt.event.ActionEvent;
import java.io.Serializable;
import java.util.Iterator;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenuItem;
import java.util.ArrayList;
import org.powerbot.core.event.impl.MessageLogger;
import org.powerbot.core.event.impl.DrawInventory;
import org.powerbot.core.event.impl.DrawMouse;
import org.powerbot.core.event.impl.TDestination;
import org.powerbot.core.event.impl.TLocation;
import org.powerbot.core.event.impl.TMapBase;
import org.powerbot.core.event.impl.TCamera;
import org.powerbot.core.event.impl.TPlane;
import org.powerbot.core.event.impl.TMenu;
import org.powerbot.core.event.impl.TMousePosition;
import org.powerbot.core.event.impl.TClientState;
import org.powerbot.core.event.impl.DrawGroundItems;
import org.powerbot.core.event.impl.DrawNPCs;
import org.powerbot.core.event.impl.DrawPlayers;
import org.powerbot.core.event.impl.DrawScene;
import org.powerbot.core.event.impl.DrawModels;
import org.powerbot.core.event.impl.DrawBoundaries;
import java.util.LinkedHashMap;
import java.util.HashMap;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.o;
import org.powerbot.game.api.util.node.Queue;
import org.powerbot.core.Bot;
import java.util.EventListener;
import java.util.Map;
import java.awt.event.ActionListener;
import javax.swing.JMenu;

public final class ub extends JMenu implements ActionListener
{
    private static final long serialVersionUID = 1L;
    private final Map<String, Class<? extends EventListener>> a;
    private static Map<Bot, Map<String, EventListener>> b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;
    private static final String g;
    private static final String h;
    private static final String i;
    private static final String j;
    private static final String k;
    private static final String l;
    private static final String m;
    private static final String n;
    private static final String o;
    private static final String p;
    private static final String q;
    private static final String r;
    private static final String s;
    private static final String t;
    private static final String u;
    private static final String[] z;
    
    public ub() {
        final boolean f = wb.f;
        super(Queue.e(ub.z[4]));
        this.setIcon(new ImageIcon(org.o.a(ub.z[7])));
        if (!f) {
            Label_0458: {
                Label_0078: {
                    Map<Bot, Map<String, EventListener>> b = null;
                    Label_0063: {
                        try {
                            if (Bot.instantiated()) {
                                break Label_0063;
                            }
                            this.setEnabled(false);
                            this.a = null;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        return;
                        try {
                            b = ub.b;
                            if (f) {
                                break Label_0458;
                            }
                            if (b == null) {
                                break Label_0078;
                            }
                            break Label_0078;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (b == null) {
                            ub.b = new HashMap<Bot, Map<String, EventListener>>();
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                (this.a = new LinkedHashMap<String, Class<? extends EventListener>>()).put(Queue.e(ub.z[13]), DrawBoundaries.class);
                this.a.put(org.o.a(ub.z[29]), DrawModels.class);
                this.a.put(Queue.e(ub.z[20]), DrawScene.class);
                this.a.put(org.o.a(ub.z[26]), DrawPlayers.class);
                this.a.put(Queue.e(ub.z[10]), DrawNPCs.class);
                this.a.put(org.o.a(ub.z[23]), DrawGroundItems.class);
                this.a.put(Queue.e(ub.z[11]), TClientState.class);
                this.a.put(org.o.a(ub.z[6]), TMousePosition.class);
                this.a.put(Queue.e(ub.z[9]), TMenu.class);
                this.a.put(org.o.a(ub.z[15]), TPlane.class);
                this.a.put(Queue.e(ub.z[28]), TCamera.class);
                this.a.put(org.o.a(ub.z[14]), TMapBase.class);
                this.a.put(Queue.e(ub.z[21]), TLocation.class);
                this.a.put(org.o.a(ub.z[3]), TDestination.class);
                this.a.put(Queue.e(ub.z[24]), DrawMouse.class);
                this.a.put(org.o.a(ub.z[27]), DrawInventory.class);
                this.a.put(Queue.e(ub.z[12]), MessageLogger.class);
            }
            final ArrayList<String> list = new ArrayList<String>(this.a.size());
            list.add(org.o.a(ub.z[19]));
            list.add(Queue.e(ub.z[5]));
            list.add(org.o.a(ub.z[22]));
            list.add(Queue.e(ub.z[17]));
            list.add(org.o.a(ub.z[18]));
            list.add(Queue.e(ub.z[33]));
            list.add(org.o.a(ub.z[32]));
            list.add(Queue.e(ub.z[30]));
            list.add(org.o.a("~"));
            list.add(Queue.e(ub.z[11]));
            list.add(org.o.a(ub.z[6]));
            list.add(Queue.e(ub.z[9]));
            list.add(org.o.a(ub.z[15]));
            list.add(Queue.e(ub.z[28]));
            list.add(org.o.a(ub.z[14]));
            list.add(Queue.e(ub.z[21]));
            list.add(org.o.a(ub.z[3]));
            list.add(Queue.e("\u001c"));
            list.add(org.o.a(ub.z[25]));
            final Bot instance = Bot.instance();
            Map<String, EventListener> map = ub.b.get(instance);
            if (map == null) {
                map = new HashMap<String, EventListener>();
                ub.b.put(instance, map);
            }
            boolean b2 = true;
            for (final String s : list) {
                Label_0914: {
                    boolean equals = false;
                    Label_0907: {
                        Label_0894: {
                            boolean b3 = false;
                            Label_0871: {
                                try {
                                    b3 = (equals = s.equals(Queue.e("\u001c")));
                                    if (f) {
                                        break Label_0894;
                                    }
                                    if (b3) {
                                        continue;
                                    }
                                    break Label_0871;
                                }
                                catch (RuntimeException ex4) {
                                    throw ex4;
                                }
                                continue;
                            }
                            final boolean containsKey;
                            equals = (containsKey = map.containsKey(this.a.get(s).getName()));
                            try {
                                if (f) {
                                    break Label_0907;
                                }
                                if (b3) {
                                    break Label_0914;
                                }
                            }
                            catch (RuntimeException ex5) {
                                throw ex5;
                            }
                        }
                        equals = false;
                    }
                    b2 = equals;
                    try {
                        if (f) {
                            if (!f) {
                                continue;
                            }
                        }
                    }
                    catch (RuntimeException ex6) {
                        throw ex6;
                    }
                }
                break;
            }
            final JMenuItem menuItem = new JMenuItem(org.o.a(ub.z[1]));
            menuItem.addActionListener(this);
            menuItem.setIcon(new ImageIcon(Queue.e(ub.z[16])));
            this.add(menuItem);
            final JMenuItem menuItem2 = new JMenuItem(org.o.a(ub.z[8]));
            menuItem2.addActionListener(this);
            menuItem2.setIcon(new ImageIcon(Queue.e(ub.z[31])));
            this.add(menuItem2);
            this.addSeparator();
            final JCheckBoxMenuItem menuItem3 = new JCheckBoxMenuItem(org.o.a(ub.z[2]), b2);
            menuItem3.addActionListener(this);
            this.add(menuItem3);
            this.addSeparator();
            for (final String text : list) {
                Serializable value = null;
                Label_1143: {
                    Label_1119: {
                        String s2;
                        try {
                            s2 = (String)(value = text);
                            if (f) {
                                break Label_1143;
                            }
                            final String s3 = "\u001c";
                            final String s4 = Queue.e(s3);
                            final boolean b4 = s2.equals(s4);
                            if (b4) {
                                break Label_1119;
                            }
                            break Label_1119;
                        }
                        catch (RuntimeException ex7) {
                            throw ex7;
                        }
                        try {
                            final String s3 = "\u001c";
                            final String s4 = Queue.e(s3);
                            final boolean b4 = s2.equals(s4);
                            if (b4) {
                                this.addSeparator();
                                if (!f) {
                                    continue;
                                }
                            }
                        }
                        catch (RuntimeException ex8) {
                            throw ex8;
                        }
                    }
                    value = this.a.get(text);
                }
                final JCheckBoxMenuItem menuItem4 = new JCheckBoxMenuItem(text, map.containsKey(((Class<? extends EventListener>)value).getName()));
                menuItem4.addActionListener(this);
                this.add(menuItem4);
                if (f) {
                    break;
                }
            }
        }
    }
    
    @Override
    public void actionPerformed(final ActionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: aload_1        
        //     6: invokevirtual   java/awt/event/ActionEvent.getActionCommand:()Ljava/lang/String;
        //     9: astore_2       
        //    10: aload_2        
        //    11: getstatic       org/powerbot/ub.z:[Ljava/lang/String;
        //    14: iconst_1       
        //    15: aaload         
        //    16: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //    19: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    22: iload           6
        //    24: ifne            74
        //    27: ifeq            49
        //    30: goto            34
        //    33: athrow         
        //    34: invokestatic    org/powerbot/core/Bot.context:()Lorg/powerbot/game/bot/Context;
        //    37: invokestatic    org/powerbot/sb.b:(Lorg/powerbot/game/bot/Context;)V
        //    40: iload           6
        //    42: ifeq            250
        //    45: goto            49
        //    48: athrow         
        //    49: aload_2        
        //    50: iload           6
        //    52: ifne            100
        //    55: goto            59
        //    58: athrow         
        //    59: getstatic       org/powerbot/ub.z:[Ljava/lang/String;
        //    62: iconst_0       
        //    63: aaload         
        //    64: invokestatic    org/powerbot/game/api/util/node/Queue.e:(Ljava/lang/String;)Ljava/lang/String;
        //    67: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    70: goto            74
        //    73: athrow         
        //    74: ifeq            92
        //    77: invokestatic    org/powerbot/core/Bot.context:()Lorg/powerbot/game/bot/Context;
        //    80: invokestatic    org/powerbot/rb.a:(Lorg/powerbot/game/bot/Context;)V
        //    83: iload           6
        //    85: ifeq            250
        //    88: goto            92
        //    91: athrow         
        //    92: aload_1        
        //    93: invokevirtual   java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
        //    96: goto            100
        //    99: athrow         
        //   100: checkcast       Ljavax/swing/JCheckBoxMenuItem;
        //   103: astore_3       
        //   104: aload_3        
        //   105: aload_3        
        //   106: invokevirtual   javax/swing/JCheckBoxMenuItem.isSelected:()Z
        //   109: iload           6
        //   111: ifne            122
        //   114: ifne            125
        //   117: goto            121
        //   120: athrow         
        //   121: iconst_1       
        //   122: goto            126
        //   125: iconst_0       
        //   126: invokevirtual   javax/swing/JCheckBoxMenuItem.setSelected:(Z)V
        //   129: aload_3        
        //   130: invokevirtual   javax/swing/JCheckBoxMenuItem.getText:()Ljava/lang/String;
        //   133: getstatic       org/powerbot/ub.z:[Ljava/lang/String;
        //   136: iconst_2       
        //   137: aaload         
        //   138: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //   141: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   144: ifeq            222
        //   147: aload_0        
        //   148: getfield        org/powerbot/ub.a:Ljava/util/Map;
        //   151: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   156: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   161: astore          4
        //   163: aload           4
        //   165: invokeinterface java/util/Iterator.hasNext:()Z
        //   170: ifeq            217
        //   173: aload           4
        //   175: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   180: checkcast       Ljava/util/Map$Entry;
        //   183: astore          5
        //   185: aload_0        
        //   186: aload           5
        //   188: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   193: checkcast       Ljava/lang/Class;
        //   196: aload_3        
        //   197: invokevirtual   javax/swing/JCheckBoxMenuItem.isSelected:()Z
        //   200: invokespecial   org/powerbot/ub.a:(Ljava/lang/Class;Z)V
        //   203: iload           6
        //   205: ifne            250
        //   208: iload           6
        //   210: ifeq            163
        //   213: goto            217
        //   216: athrow         
        //   217: iload           6
        //   219: ifeq            250
        //   222: aload_0        
        //   223: aload_0        
        //   224: getfield        org/powerbot/ub.a:Ljava/util/Map;
        //   227: aload_3        
        //   228: invokevirtual   javax/swing/JCheckBoxMenuItem.getText:()Ljava/lang/String;
        //   231: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   236: checkcast       Ljava/lang/Class;
        //   239: aload_3        
        //   240: invokevirtual   javax/swing/JCheckBoxMenuItem.isSelected:()Z
        //   243: invokespecial   org/powerbot/ub.a:(Ljava/lang/Class;Z)V
        //   246: goto            250
        //   249: athrow         
        //   250: return         
        //    StackMapTable: 00 17 FF 00 21 00 07 07 00 50 07 00 AD 07 00 29 00 00 00 01 00 01 07 01 9E 00 4D 07 01 9E 00 48 07 01 9E 40 07 00 29 4D 07 01 9E 40 01 50 07 01 9E 00 46 07 01 9E 40 07 00 46 FF 00 13 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 00 00 01 00 01 07 01 9E 40 07 00 34 FF 00 00 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 00 00 01 00 02 07 00 34 01 42 07 00 34 FF 00 00 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 00 00 01 00 02 07 00 34 01 FF 00 24 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 07 00 9F 00 01 00 00 FF 00 34 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 07 00 9F 07 00 41 01 00 01 07 01 9E FF 00 00 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 07 00 9F 00 01 00 00 FF 00 04 00 07 07 00 50 07 00 AD 07 00 29 07 00 34 00 00 01 00 00 5A 07 01 9E FF 00 00 00 07 07 00 50 07 00 AD 07 00 29 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  217    246    249    250    Ljava/lang/RuntimeException;
        //  185    213    216    217    Ljava/lang/RuntimeException;
        //  104    117    120    121    Ljava/lang/RuntimeException;
        //  77     96     99     100    Ljava/lang/RuntimeException;
        //  74     88     91     92     Ljava/lang/RuntimeException;
        //  49     70     73     74     Ljava/lang/RuntimeException;
        //  34     55     58     59     Ljava/lang/RuntimeException;
        //  27     45     48     49     Ljava/lang/RuntimeException;
        //  10     30     33     34     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
    
    private void a(final Class<? extends EventListener> clazz, final boolean b) {
        final boolean f = wb.f;
        final Bot instance = Bot.instance();
        final String name = clazz.getName();
        Map<String, EventListener> map = ub.b.get(instance);
        if (map == null) {
            map = new HashMap<String, EventListener>();
            ub.b.put(instance, map);
        }
        Label_0170: {
            boolean containsKey = false;
            Label_0068: {
                try {
                    containsKey = b;
                    if (f) {
                        break Label_0068;
                    }
                    if (!b) {
                        break Label_0068;
                    }
                    break Label_0170;
                }
                catch (Exception ex) {
                    throw ex;
                }
                try {
                    if (b) {
                        break Label_0170;
                    }
                    containsKey = map.containsKey(name);
                }
                catch (Exception ex2) {
                    throw ex2;
                }
            }
            if (containsKey) {
                return;
            }
            try {
                EventListener eventListener;
                try {
                    eventListener = (EventListener)clazz.getConstructor(Bot.class).newInstance(instance);
                }
                catch (Exception ex5) {
                    eventListener = (EventListener)clazz.asSubclass(EventListener.class).newInstance();
                }
                map.put(name, eventListener);
                instance.getEventManager().addListener(eventListener);
                return;
            }
            catch (Exception ex6) {
                if (!f) {
                    return;
                }
            }
        }
        final EventListener eventListener2 = map.get(name);
        Label_0198: {
            EventListener eventListener3;
            try {
                eventListener3 = eventListener2;
                if (f) {
                    break Label_0198;
                }
                if (eventListener3 != null) {
                    break Label_0198;
                }
                return;
            }
            catch (Exception ex3) {
                throw ex3;
            }
            try {
                if (eventListener3 == null) {
                    return;
                }
                map.remove(name);
            }
            catch (Exception ex4) {
                throw ex4;
            }
        }
        instance.getEventManager().removeListener(eventListener2);
    }
    
    static {
        final String[] z2 = new String[34];
        int n35;
        int n34;
        int n33;
        int n32;
        int n31;
        int n30;
        int n29;
        int n28;
        int n27;
        int n26;
        int n25;
        int n24;
        int n23;
        int n22;
        int n21;
        int n20;
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2 = n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 0))))))))))))))))))))))))))))))));
        String s2 = "y\u0001*Rc.iG";
        int n36 = -1;
        String intern = null;
    Label_0422_Outer:
        while (true) {
            final char[] charArray = s2.toCharArray();
            int length;
            int n38;
            final int n37 = n38 = (length = charArray.length);
            int n39 = 0;
            while (true) {
                Label_0497: {
                    if (n37 > 1) {
                        break Label_0497;
                    }
                    length = (n38 = n39);
                    do {
                        final char c2 = charArray[n38];
                        char c3 = '\0';
                        switch (n39 % 5) {
                            case 0: {
                                c3 = 'q';
                                break;
                            }
                            case 1: {
                                c3 = 'U';
                                break;
                            }
                            case 2: {
                                c3 = '\u0005';
                                break;
                            }
                            case 3: {
                                c3 = '\u0017';
                                break;
                            }
                            default: {
                                c3 = 'Q';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n39;
                    } while (n37 == 0);
                }
                if (n37 > n39) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n36) {
                default: {
                    z2[n3] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 1)))))))))))))))))))))))))))))))));
                    s2 = "u|20gEu";
                    n36 = 0;
                    continue Label_0422_Outer;
                }
                case 0: {
                    z2[n2] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 2)))))))))))))))))))))))))))))))));
                    s2 = "cy:";
                    n36 = 1;
                    continue Label_0422_Outer;
                }
                case 1: {
                    z2[n4] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 3)))))))))))))))))))))))))))))))));
                    s2 = "fp%#k_g1-~L";
                    n36 = 2;
                    continue Label_0422_Outer;
                }
                case 2: {
                    z2[n5] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 4)))))))))))))))))))))))))))))))));
                    s2 = "|\r;Q";
                    n36 = 3;
                    continue Label_0422_Outer;
                }
                case 3: {
                    z2[n6] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 5)))))))))))))))))))))))))))))))));
                    s2 = "\u0010bU5\u0005X\u0017";
                    n36 = 4;
                    continue Label_0422_Outer;
                }
                case 4: {
                    z2[n7] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 6)))))))))))))))))))))))))))))))));
                    s2 = "|i07t\u0002E9$kEo**";
                    n36 = 5;
                    continue Label_0422_Outer;
                }
                case 5: {
                    z2[n8] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 7)))))))))))))))))))))))))))))))));
                    s2 = "Pp%8wCe 7>Kx70gB)\"(hR}?4m_u\u001aw\"\u0013J26qYd*%cF;&9e";
                    n36 = 6;
                    continue Label_0422_Outer;
                }
                case 6: {
                    z2[n9] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 8)))))))))))))))))))))))))))))))));
                    s2 = "bc10xLr%";
                    n36 = 7;
                    continue Label_0422_Outer;
                }
                case 7: {
                    z2[n10] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 9)))))))))))))))))))))))))))))))));
                    s2 = "g\u00010S";
                    n36 = 8;
                    continue Label_0422_Outer;
                }
                case 8: {
                    z2[n11] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 10)))))))))))))))))))))))))))))))));
                    s2 = "d4\u001dU";
                    n36 = 9;
                    continue Label_0422_Outer;
                }
                case 9: {
                    z2[n12] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 11)))))))))))))))))))))))))))))))));
                    s2 = "i\b7Cd4.g8\u0001^\u0001";
                    n36 = 10;
                    continue Label_0422_Outer;
                }
                case 10: {
                    z2[n13] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 12)))))))))))))))))))))))))))))))));
                    s2 = "g\u0001-Uk'kG";
                    n36 = 11;
                    continue Label_0422_Outer;
                }
                case 11: {
                    z2[n14] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 13)))))))))))))))))))))))))))))))));
                    s2 = "h\u000b+Hn!|])\u0013";
                    n36 = 12;
                    continue Label_0422_Outer;
                }
                case 12: {
                    z2[n15] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 14)))))))))))))))))))))))))))))))));
                    s2 = "|g5dSCf3";
                    n36 = 13;
                    continue Label_0422_Outer;
                }
                case 13: {
                    z2[n16] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 15)))))))))))))))))))))))))))))))));
                    s2 = "ry79g";
                    n36 = 14;
                    continue Label_0422_Outer;
                }
                case 14: {
                    z2[n17] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 16)))))))))))))))))))))))))))))))));
                    s2 = "X\u0001-I\u007f2mQ?OC\t?Ao3!S \u0019Z\f7Ee.}k}U\u001a;;Bc4 D\"\u0007";
                    n36 = 15;
                    continue Label_0422_Outer;
                }
                case 15: {
                    z2[n18] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 17)))))))))))))))))))))))))))))))));
                    s2 = "m\u00161Sd$.}8\u0005G\u0017";
                    n36 = 16;
                    continue Label_0422_Outer;
                }
                case 16: {
                    z2[n19] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 18)))))))))))))))))))))))))))))))));
                    s2 = "be *t\u0002P8#kEo 7";
                    n36 = 17;
                    continue Label_0422_Outer;
                }
                case 17: {
                    z2[n20] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 19)))))))))))))))))))))))))))))))));
                    s2 = "oz#$g";
                    n36 = 18;
                    continue Label_0422_Outer;
                }
                case 18: {
                    z2[n21] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 20)))))))))))))))))))))))))))))))));
                    s2 = "y\u0007;Ho`KZ8\t^\r;U";
                    n36 = 19;
                    continue Label_0422_Outer;
                }
                case 19: {
                    z2[n22] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 21)))))))))))))))))))))))))))))))));
                    s2 = "f\u000b=G~)aZ";
                    n36 = 20;
                    continue Label_0422_Outer;
                }
                case 20: {
                    z2[n23] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 22)))))))))))))))))))))))))))))))));
                    s2 = "\u007fV\u00067";
                    n36 = 21;
                    continue Label_0422_Outer;
                }
                case 21: {
                    z2[n24] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 23)))))))))))))))))))))))))))))))));
                    s2 = "vt*1\u007fF5\u001f#g\\u";
                    n36 = 22;
                    continue Label_0422_Outer;
                }
                case 22: {
                    z2[n25] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 24)))))))))))))))))))))))))))))))));
                    s2 = "\raA?\u0005";
                    n36 = 23;
                    continue Label_0422_Outer;
                }
                case 23: {
                    z2[n26] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 25)))))))))))))))))))))))))))))))));
                    s2 = "|c67pEp%";
                    n36 = 24;
                    continue Label_0422_Outer;
                }
                case 24: {
                    z2[n27] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 26)))))))))))))))))))))))))))))))));
                    s2 = "ry7.gCu";
                    n36 = 25;
                    continue Label_0422_Outer;
                }
                case 25: {
                    z2[n28] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 27)))))))))))))))))))))))))))))))));
                    s2 = "k{ 2lEi7=";
                    n36 = 26;
                    continue Label_0422_Outer;
                }
                case 26: {
                    z2[n29] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 28)))))))))))))))))))))))))))))))));
                    s2 = "i\u00053Cx!";
                    n36 = 27;
                    continue Label_0422_Outer;
                }
                case 27: {
                    z2[n30] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 29)))))))))))))))))))))))))))))))));
                    s2 = "|i!!}Q";
                    n36 = 28;
                    continue Label_0422_Outer;
                }
                case 28: {
                    z2[n31] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 30)))))))))))))))))))))))))))))))));
                    s2 = "\t`B)\u000e^\u000b,_";
                    n36 = 29;
                    continue Label_0422_Outer;
                }
                case 29: {
                    z2[n32] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 31)))))))))))))))))))))))))))))))));
                    s2 = "X\u0001-I\u007f2mQ?OC\t?Ao3!S \u0019Z\f7Ee.}k}S\u001c;=Im7fQ)\f\u0004\u00140A";
                    n36 = 30;
                    continue Label_0422_Outer;
                }
                case 30: {
                    z2[n33] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 32)))))))))))))))))))))))))))))))));
                    s2 = "si0*uCg?2q";
                    n36 = 31;
                    continue Label_0422_Outer;
                }
                case 31: {
                    z2[n34] = intern;
                    n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = (n34 = (n35 = 33)))))))))))))))))))))))))))))))));
                    s2 = "g\u000b:Cf3";
                    n36 = 32;
                    continue Label_0422_Outer;
                }
                case 32: {
                    break Label_0422_Outer;
                }
            }
        }
        z2[n35] = intern;
        z = z2;
        String s3 = "\u0001bX";
        int n40 = -1;
        String intern2 = null;
    Label_0682_Outer:
        while (true) {
            final char[] charArray2 = s3.toCharArray();
            int length2;
            int n42;
            final int n41 = n42 = (length2 = charArray2.length);
            int n43 = 0;
            while (true) {
                Label_0757: {
                    if (n41 > 1) {
                        break Label_0757;
                    }
                    length2 = (n42 = n43);
                    do {
                        final char c4 = charArray2[n42];
                        char c5 = '\0';
                        switch (n43 % 5) {
                            case 0: {
                                c5 = 'q';
                                break;
                            }
                            case 1: {
                                c5 = 'U';
                                break;
                            }
                            case 2: {
                                c5 = '\u0005';
                                break;
                            }
                            case 3: {
                                c5 = '\u0017';
                                break;
                            }
                            default: {
                                c5 = 'Q';
                                break;
                            }
                        }
                        charArray2[length2] = (char)(c4 ^ c5);
                        ++n43;
                    } while (n41 == 0);
                }
                if (n41 > n43) {
                    continue;
                }
                break;
            }
            intern2 = new String(charArray2).intern();
            switch (n40) {
                default: {
                    c = Queue.e(intern2);
                    d = org.o.a(ub.z[19]);
                    e = Queue.e(ub.z[5]);
                    f = org.o.a(ub.z[22]);
                    g = Queue.e(ub.z[17]);
                    h = org.o.a(ub.z[18]);
                    i = Queue.e(ub.z[33]);
                    j = org.o.a(ub.z[32]);
                    k = Queue.e(ub.z[30]);
                    s3 = "rj,!\u007fV5\u0005#cEc";
                    n40 = 0;
                    continue Label_0682_Outer;
                }
                case 0: {
                    l = org.o.a(intern2);
                    s3 = "g\u000b+Uo`^[?\t^\r1H";
                    n40 = 1;
                    continue Label_0682_Outer;
                }
                case 1: {
                    m = Queue.e(intern2);
                    s3 = "|c+1";
                    n40 = 2;
                    continue Label_0682_Outer;
                }
                case 2: {
                    n = org.o.a(intern2);
                    s3 = "\u0010bU\"\u0005";
                    n40 = 3;
                    continue Label_0682_Outer;
                }
                case 3: {
                    o = Queue.e(intern2);
                    s3 = "rg(!cC";
                    n40 = 4;
                    continue Label_0682_Outer;
                }
                case 4: {
                    p = org.o.a(intern2);
                    s3 = "g\u0005.\u0006H!}Q";
                    n40 = 5;
                    continue Label_0682_Outer;
                }
                case 5: {
                    q = Queue.e(intern2);
                    s3 = "}i&%eKz8";
                    n40 = 6;
                    continue Label_0682_Outer;
                }
                case 6: {
                    r = org.o.a(intern2);
                    s3 = "\u0004kG8\tD\u0005*Oe.";
                    n40 = 7;
                    continue Label_0682_Outer;
                }
                case 7: {
                    break Label_0682_Outer;
                }
            }
        }
        s = Queue.e(intern2);
        t = org.o.a(ub.z[25]);
        u = Queue.e("\u001c");
    }
}
