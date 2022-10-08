
package org.powerbot.game.api.wrappers.interactive;

import java.awt.Color;
import java.awt.Graphics;
import org.powerbot.game.api.methods.node.Menu;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.game.api.util.Filter;
import java.awt.Polygon;
import org.powerbot.game.api.methods.Calculations;
import java.awt.Point;
import org.powerbot.game.client.Model;
import org.powerbot.game.api.wrappers.graphics.model.CharacterModel;
import org.powerbot.game.api.wrappers.graphics.CapturedModel;
import org.powerbot.game.client.RSMessageData;
import org.powerbot.game.client.CombatStatusData;
import org.powerbot.game.client.LinkedList;
import org.powerbot.game.client.LinkedListNode;
import org.powerbot.game.client.Sequence;
import org.powerbot.game.client.RSAnimator;
import org.powerbot.game.client.RSPlayer;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.game.api.util.node.Nodes;
import org.powerbot.game.api.methods.Game;
import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.game.client.RSCharacter;
import org.powerbot.game.client.RSInteractableLocation;
import org.powerbot.game.client.RSInteractableData;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.wrappers.RegionOffset;
import org.powerbot.game.bot.Context;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.wrappers.Identifiable;
import org.powerbot.game.api.wrappers.Rotatable;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.api.wrappers.Entity;

public abstract class Character implements Entity, Locatable, Rotatable, Identifiable
{
    private final Client client;
    public static int a;
    
    public Character() {
        this.client = Context.client();
    }
    
    public abstract int getLevel();
    
    public abstract String getName();
    
    @Override
    public RegionOffset getRegionOffset() {
        final int a = Character.a;
        final RSInteractableData data = this.get().getData();
        final RegionOffset regionOffset = new RegionOffset((int)data.getLocation().getX() >> 9, (int)data.getLocation().getY() >> 9, this.getPlane());
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
        return regionOffset;
    }
    
    public RSInteractableLocation getRenderableLocation() {
        final RSCharacter value = this.get();
        RSCharacter value2;
        try {
            value2 = this.get();
            if (Character.a != 0) {
                return value2.getData().getLocation();
            }
            if (value2 == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return value2.getData().getLocation();
        location = null;
        return location;
    }
    
    @Override
    public Tile getLocation() {
        int a = Character.a;
        final RegionOffset regionOffset = this.getRegionOffset();
        final Tile tile = new Tile(Game.getBaseX() + regionOffset.getX(), Game.getBaseY() + regionOffset.getY(), regionOffset.getPlane());
        if (Task.a != 0) {
            Character.a = ++a;
        }
        return tile;
    }
    
    public int getPlane() {
        final RSCharacter value = this.get();
        RSCharacter rsCharacter;
        try {
            rsCharacter = value;
            if (Character.a != 0) {
                return rsCharacter.getPlane();
            }
            if (rsCharacter == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.getPlane();
        plane = -1;
        return plane;
    }
    
    public Character getInteracting() {
        final int a = Character.a;
        final RSCharacter value = this.get();
        int interacting = 0;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = value;
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
        int n4 = 0;
        int n7 = 0;
        Label_0156: {
            Label_0153: {
                Label_0054: {
                    Label_0048: {
                        int n2;
                        int n5;
                        try {
                            final int n3;
                            n2 = (n3 = (n4 = n));
                            final int n6;
                            n5 = (n6 = (n7 = -1));
                            if (a != 0) {
                                break Label_0054;
                            }
                            if (n2 == n5) {
                                break Label_0048;
                            }
                            break Label_0048;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                        try {
                            if (n2 == n5) {
                                return null;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    int n3;
                    n4 = (n3 = n);
                    int n6;
                    n7 = (n6 = 32768);
                    try {
                        if (a != 0) {
                            break Label_0156;
                        }
                        if (n3 >= n6) {
                            break Label_0153;
                        }
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                final Object lookup = Nodes.lookup(this.client.getRSNPCNC(), n);
                Label_0135: {
                    Label_0113: {
                        boolean b = false;
                        Label_0098: {
                            Label_0094: {
                                RSNPC rsnpc;
                                try {
                                    final Object o;
                                    rsnpc = (RSNPC)(o = lookup);
                                    if (a != 0) {
                                        break Label_0098;
                                    }
                                    if (rsnpc == null) {
                                        break Label_0094;
                                    }
                                    break Label_0094;
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
                                    break Label_0135;
                                }
                                if (b) {
                                    break Label_0113;
                                }
                                break Label_0113;
                            }
                            catch (RuntimeException ex7) {
                                throw ex7;
                            }
                        }
                        try {
                            if (b) {
                                return new NPC(((RSNPCNode)lookup).getRSNPC());
                            }
                        }
                        catch (RuntimeException ex8) {
                            throw ex8;
                        }
                    }
                    boolean b2 = lookup instanceof RSNPC;
                    try {
                        if (b2) {
                            return new NPC((RSNPC)lookup);
                        }
                    }
                    catch (RuntimeException ex9) {
                        throw ex9;
                    }
                }
                return null;
            }
            n4 = n;
            n7 = 32768;
        }
        final int n8 = n4 - n7;
        final RSPlayer[] rsPlayerArray = this.client.getRSPlayerArray();
        Label_0183: {
            int n9;
            try {
                n9 = n8;
                if (a != 0) {
                    break Label_0183;
                }
                if (n9 < 0) {
                    return null;
                }
            }
            catch (RuntimeException ex10) {
                throw ex10;
            }
            try {
                if (n9 < rsPlayerArray.length) {
                    return new Player(rsPlayerArray[n8]);
                }
            }
            catch (RuntimeException ex11) {
                throw ex11;
            }
        }
        return null;
    }
    
    public int getAnimation() {
        final int a = Character.a;
        final RSCharacter value = this.get();
        RSAnimator animation = null;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = value;
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
                animation = rsCharacter.getAnimation();
                break Label_0033;
            }
            animation = null;
        }
        final RSAnimator rsAnimator = animation;
        RSAnimator rsAnimator2 = null;
        Label_0048: {
            try {
                rsAnimator2 = rsAnimator;
                if (a != 0) {
                    break Label_0048;
                }
                if (rsAnimator2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Sequence sequence = rsAnimator2.getSequence();
        Sequence sequence2;
        try {
            sequence2 = sequence;
            if (a != 0) {
                return sequence2.getID();
            }
            if (sequence2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return sequence2.getID();
    }
    
    public int getPassiveAnimation() {
        final int a = Character.a;
        final RSCharacter value = this.get();
        RSAnimator passiveAnimation = null;
        Label_0033: {
            Label_0032: {
                RSCharacter rsCharacter = null;
                Label_0024: {
                    try {
                        rsCharacter = value;
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
                passiveAnimation = rsCharacter.getPassiveAnimation();
                break Label_0033;
            }
            passiveAnimation = null;
        }
        final RSAnimator rsAnimator = passiveAnimation;
        RSAnimator rsAnimator2 = null;
        Label_0048: {
            try {
                rsAnimator2 = rsAnimator;
                if (a != 0) {
                    break Label_0048;
                }
                if (rsAnimator2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final Sequence sequence = rsAnimator2.getSequence();
        Sequence sequence2;
        try {
            sequence2 = sequence;
            if (a != 0) {
                return sequence2.getID();
            }
            if (sequence2 == null) {
                return -1;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        return sequence2.getID();
    }
    
    public int getHeight() {
        final RSCharacter value = this.get();
        RSCharacter rsCharacter;
        try {
            rsCharacter = value;
            if (Character.a != 0) {
                return rsCharacter.getHeight();
            }
            if (rsCharacter == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.getHeight();
        height = -1;
        return height;
    }
    
    @Override
    public int getRotation() {
        final RSCharacter value = this.get();
        RSCharacter rsCharacter;
        try {
            rsCharacter = value;
            if (Character.a != 0) {
                return rsCharacter.getOrientation();
            }
            if (rsCharacter == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.getOrientation();
        orientation = -1;
        return orientation;
    }
    
    @Override
    public int getOrientation() {
        final int rotation = this.getRotation();
        int n2 = 0;
        int n4 = 0;
        Label_0020: {
            int n;
            int n3;
            try {
                n = (n2 = rotation);
                n3 = (n4 = -1);
                if (Character.a != 0) {
                    return n2 % n4;
                }
                if (n != n3) {
                    break Label_0020;
                }
                return -1;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (n == n3) {
                    return -1;
                }
                n2 = 630 - rotation * 45 / 2048;
                n4 = 360;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return n2 % n4;
        n5 = -1;
        return n5;
    }
    
    private LinkedListNode[] getBarNodes() {
        final int a = Character.a;
        final RSCharacter value = this.get();
        RSCharacter rsCharacter2 = null;
        Label_0027: {
            Label_0023: {
                RSCharacter rsCharacter;
                try {
                    rsCharacter = (rsCharacter2 = value);
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
            rsCharacter2 = value;
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
        //     6: invokespecial   org/powerbot/game/api/wrappers/interactive/Character.getBarNodes:()[Lorg/powerbot/game/client/LinkedListNode;
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
        //    StackMapTable: 00 18 FF 00 16 00 07 07 00 5F 07 01 74 00 00 00 00 01 00 01 07 01 6F 00 41 07 01 6F 00 40 07 01 74 FF 00 06 00 07 07 00 5F 07 01 74 07 01 76 01 00 00 01 00 00 53 07 01 6F 00 45 07 01 6F 40 07 00 2B 4D 07 01 6F 00 4B 07 01 6F 00 45 07 01 6F 40 07 00 2B FF 00 1A 00 07 07 00 5F 07 01 74 07 01 76 01 07 00 2E 07 00 DB 01 00 01 07 01 6F 00 46 07 01 6F 00 04 54 07 01 6F FF 00 00 00 07 07 00 5F 07 01 74 07 01 76 01 00 00 01 00 00 07
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
    
    public int getAdrenalineRatio() {
        final int a = Character.a;
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
        final int a = Character.a;
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
                if (Character.a != 0) {
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
                if (Character.a != 0) {
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
    
    @Deprecated
    public int getHpRatio() {
        return this.getHealthRatio();
    }
    
    @Deprecated
    public int getHpPercent() {
        return this.getHealthPercent();
    }
    
    public boolean isInCombat() {
        final int a = Character.a;
        final CombatStatusData[] barData = this.getBarData();
        int loopCycleStatus = 0;
        Label_0066: {
            int n = 0;
            Label_0042: {
                CombatStatusData combatStatusData2 = null;
                Label_0035: {
                    CombatStatusData combatStatusData = null;
                    Label_0022: {
                        CombatStatusData[] array;
                        try {
                            array = barData;
                            if (a != 0) {
                                break Label_0022;
                            }
                            if (array == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            combatStatusData = (combatStatusData2 = array[1]);
                            if (a != 0) {
                                break Label_0042;
                            }
                            if (combatStatusData != null) {
                                break Label_0035;
                            }
                            return false;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (combatStatusData == null) {
                            return false;
                        }
                        combatStatusData2 = barData[1];
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    n = (loopCycleStatus = combatStatusData2.getLoopCycleStatus());
                    if (a != 0) {
                        return loopCycleStatus != 0;
                    }
                    final Client client = Context.client();
                    final int n2 = client.getLoopCycle();
                    if (n < n2) {
                        break Label_0066;
                    }
                    return false;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            try {
                final Client client = Context.client();
                final int n2 = client.getLoopCycle();
                if (n >= n2) {
                    return false;
                }
                loopCycleStatus = (true ? 1 : 0);
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        return loopCycleStatus != 0;
        loopCycleStatus = (false ? 1 : 0);
        return loopCycleStatus != 0;
    }
    
    public boolean isIdle() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: aload_0        
        //     5: invokevirtual   org/powerbot/game/api/wrappers/interactive/Character.isMoving:()Z
        //     8: iload_1        
        //     9: ifne            27
        //    12: ifne            74
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: invokevirtual   org/powerbot/game/api/wrappers/interactive/Character.isInCombat:()Z
        //    23: goto            27
        //    26: athrow         
        //    27: iload_1        
        //    28: ifne            54
        //    31: ifne            74
        //    34: goto            38
        //    37: athrow         
        //    38: aload_0        
        //    39: iload_1        
        //    40: ifne            66
        //    43: goto            47
        //    46: athrow         
        //    47: invokevirtual   org/powerbot/game/api/wrappers/interactive/Character.getAnimation:()I
        //    50: goto            54
        //    53: athrow         
        //    54: iconst_m1      
        //    55: if_icmpne       74
        //    58: aload_0        
        //    59: invokevirtual   org/powerbot/game/api/wrappers/interactive/Character.getInteracting:()Lorg/powerbot/game/api/wrappers/interactive/Character;
        //    62: goto            66
        //    65: athrow         
        //    66: ifnonnull       74
        //    69: iconst_1       
        //    70: goto            75
        //    73: athrow         
        //    74: iconst_0       
        //    75: ireturn        
        //    StackMapTable: 00 0F FF 00 12 00 02 07 00 5F 01 00 01 07 01 6F 00 46 07 01 6F 40 01 49 07 01 6F 00 47 07 01 6F 40 07 00 5F 45 07 01 6F 40 01 4A 07 01 6F 40 07 00 5F 46 07 01 6F 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  66     73     73     74     Ljava/lang/RuntimeException;
        //  54     62     65     66     Ljava/lang/RuntimeException;
        //  38     50     53     54     Ljava/lang/RuntimeException;
        //  31     43     46     47     Ljava/lang/RuntimeException;
        //  27     34     37     38     Ljava/lang/RuntimeException;
        //  12     23     26     27     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public String getMessage() {
        final int a = Character.a;
        final RSCharacter value = this.get();
        RSMessageData messageData = null;
        Label_0031: {
            Label_0030: {
                RSCharacter rsCharacter = null;
                Label_0022: {
                    try {
                        rsCharacter = value;
                        if (a != 0) {
                            break Label_0022;
                        }
                        if (rsCharacter == null) {
                            break Label_0030;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                messageData = rsCharacter.getMessageData();
                break Label_0031;
            }
            messageData = null;
        }
        final RSMessageData rsMessageData = messageData;
        RSMessageData rsMessageData2;
        try {
            rsMessageData2 = rsMessageData;
            if (a != 0) {
                return rsMessageData2.getMessage();
            }
            if (rsMessageData2 == null) {
                return null;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return rsMessageData2.getMessage();
        message = null;
        return message;
    }
    
    public int getSpeed() {
        final RSCharacter value = this.get();
        RSCharacter rsCharacter;
        try {
            rsCharacter = value;
            if (Character.a != 0) {
                return rsCharacter.isMoving();
            }
            if (rsCharacter == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsCharacter.isMoving();
        moving = -1;
        return moving;
    }
    
    public boolean isMoving() {
        int speed = 0;
        Label_0021: {
            try {
                speed = this.getSpeed();
                if (Character.a != 0) {
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
    
    public CapturedModel getModel() {
        final RSCharacter value = this.get();
        RSCharacter rsCharacter = null;
        Label_0020: {
            try {
                rsCharacter = value;
                if (Character.a != 0) {
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
        final Model model = rsCharacter.getModel();
        try {
            if (model != null) {
                return new CharacterModel(model, this);
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return null;
    }
    
    protected abstract RSCharacter get();
    
    @Override
    public boolean validate() {
        try {
            if (this.get() != null) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public Point getCentralPoint() {
        final CapturedModel model = this.getModel();
        Label_0024: {
            CapturedModel capturedModel;
            try {
                capturedModel = model;
                if (Character.a != 0) {
                    return capturedModel.getCentralPoint();
                }
                if (capturedModel == null) {
                    break Label_0024;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return capturedModel.getCentralPoint();
        }
        final RSCharacter value = this.get();
        final RSInteractableData data = value.getData();
        return Calculations.groundToScreen((int)data.getLocation().getX(), (int)data.getLocation().getY(), value.getPlane(), -this.getHeight() / 2);
    }
    
    @Override
    public Point getNextViewportPoint() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Character.a != 0) {
                return capturedModel.getNextViewportPoint();
            }
            if (capturedModel == null) {
                return this.getCentralPoint();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.getNextViewportPoint();
    }
    
    @Override
    public boolean contains(final Point point) {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Character.a != 0) {
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
    }
    
    @Override
    public boolean isOnScreen() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Character.a != 0) {
                return capturedModel.isOnScreen();
            }
            if (capturedModel == null) {
                return Calculations.isOnScreen(this.getCentralPoint());
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return capturedModel.isOnScreen();
        b = Calculations.isOnScreen(this.getCentralPoint());
        return b;
    }
    
    @Override
    public Polygon[] getBounds() {
        final CapturedModel model = this.getModel();
        CapturedModel capturedModel;
        try {
            capturedModel = model;
            if (Character.a != 0) {
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
                Mouse.click(true);
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
        if (this.get() != null) {
            final RegionOffset regionOffset = this.getRegionOffset();
            final Point groundToScreen = Calculations.groundToScreen(regionOffset.getX(), regionOffset.getY(), regionOffset.getPlane(), this.getHeight() / 2);
            graphics.setColor(Color.red);
            graphics.fillRect(groundToScreen.x - 3, groundToScreen.y - 3, 6, 6);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = false;
        Label_0040: {
            try {
                b = (o instanceof Character);
                if (Character.a != 0) {
                    return b;
                }
                if (!b) {
                    break Label_0040;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            final Character character = (Character)o;
            try {
                if (character.get() == this.get()) {
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
    public int hashCode() {
        return System.identityHashCode(this.get());
    }
}
