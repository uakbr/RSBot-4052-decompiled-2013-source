
package org.powerbot.core.script.methods;

import org.powerbot.core.script.wrappers.Tile;
import org.powerbot.core.script.wrappers.Player;
import org.powerbot.core.script.wrappers.Locatable;
import java.util.Iterator;
import org.powerbot.core.script.util.Filter;
import org.powerbot.game.client.HashTable;
import org.powerbot.game.client.Client;
import org.powerbot.game.client.RSNPC;
import org.powerbot.game.client.RSNPCNode;
import org.powerbot.core.script.internal.Nodes;
import java.util.HashSet;
import org.powerbot.core.Bot;
import org.powerbot.core.script.wrappers.Npc;
import java.util.Set;

public class Npcs
{
    public static Set<Npc> getLoaded() {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        Client client3 = null;
        Label_0033: {
            Label_0022: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (a) {
                        break Label_0033;
                    }
                    if (client2 == null) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return new HashSet<Npc>(0);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            client3 = client;
        }
        final int[] rsnpcIndexArray = client3.getRSNPCIndexArray();
        final HashTable rsnpcnc = client.getRSNPCNC();
        Label_0058: {
            try {
                if (rsnpcIndexArray == null) {
                    break Label_0058;
                }
                final HashTable hashTable = rsnpcnc;
                if (hashTable == null) {
                    break Label_0058;
                }
                break Label_0058;
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            try {
                final HashTable hashTable = rsnpcnc;
                if (hashTable == null) {
                    return new HashSet<Npc>(0);
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        final HashSet set = new HashSet<Npc>(rsnpcIndexArray.length);
        final int[] array = rsnpcIndexArray;
        final int length = array.length;
        int i = 0;
        while (i < length) {
            Object o = Nodes.lookup(rsnpcnc, rsnpcIndexArray[array[i]]);
            Label_0177: {
                boolean b2 = false;
                Label_0165: {
                    Label_0160: {
                        Label_0133: {
                            Object o2 = null;
                            Label_0131: {
                                try {
                                    o2 = o;
                                    if (a) {
                                        break Label_0133;
                                    }
                                    if (o2 != null) {
                                        break Label_0131;
                                    }
                                }
                                catch (RuntimeException ex5) {
                                    throw ex5;
                                }
                                break Label_0177;
                            }
                            try {
                                final boolean b = b2 = (o2 instanceof RSNPCNode);
                                if (a) {
                                    break Label_0165;
                                }
                                if (!b) {
                                    break Label_0160;
                                }
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        o = ((RSNPCNode)o).getRSNPC();
                    }
                    b2 = (o instanceof RSNPC);
                    try {
                        if (a) {
                            break Label_0177;
                        }
                        if (b2) {
                            break Label_0177;
                        }
                        break Label_0177;
                    }
                    catch (RuntimeException ex7) {
                        throw ex7;
                    }
                }
                try {
                    if (b2) {
                        set.add(new Npc((RSNPC)o));
                    }
                }
                catch (RuntimeException ex8) {
                    throw ex8;
                }
            }
            ++i;
            if (a) {
                break;
            }
        }
        return (Set<Npc>)set;
    }
    
    public static Set<Npc> getLoaded(final Filter<Npc> filter) {
        final boolean a = Calculations.a;
        final Set<Npc> loaded = getLoaded();
        final HashSet set = new HashSet<Npc>(loaded.size());
        for (final Npc npc : loaded) {
            Label_0070: {
                boolean accept;
                try {
                    accept = filter.accept(npc);
                    if (a) {
                        break Label_0070;
                    }
                    if (accept) {
                        break Label_0070;
                    }
                    break Label_0070;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (accept) {
                        set.add(npc);
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            if (a) {
                break;
            }
        }
        return (Set<Npc>)set;
    }
    
    public static Set<Npc> getLoaded(final int... array) {
        return getLoaded(new Filter<Npc>() {
            @Override
            public boolean accept(final Npc p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/core/script/wrappers/Npc.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/core/script/methods/Npcs$1.val$ids:[I
                //    14: astore_3       
                //    15: aload_3        
                //    16: arraylength    
                //    17: istore          4
                //    19: iconst_0       
                //    20: istore          5
                //    22: iload           5
                //    24: iload           4
                //    26: if_icmpge       70
                //    29: aload_3        
                //    30: iload           5
                //    32: iaload         
                //    33: istore          6
                //    35: iload           7
                //    37: ifne            65
                //    40: iload_2        
                //    41: iload           7
                //    43: ifne            71
                //    46: goto            50
                //    49: athrow         
                //    50: iload           6
                //    52: if_icmpne       62
                //    55: goto            59
                //    58: athrow         
                //    59: iconst_1       
                //    60: ireturn        
                //    61: athrow         
                //    62: iinc            5, 1
                //    65: iload           7
                //    67: ifeq            22
                //    70: iconst_0       
                //    71: ireturn        
                //    StackMapTable: 00 0A FF 00 16 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 FF 00 1A 00 08 07 00 06 07 00 04 01 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 47 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  50     61     61     62     Ljava/lang/RuntimeException;
                //  40     55     58     59     Ljava/lang/RuntimeException;
                //  35     46     49     50     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
    
    public static Npc getNearest(final Filter<Npc> filter) {
        final boolean a = Calculations.a;
        double n = 104.0;
        final Player local = Players.getLocal();
        Player player2 = null;
        Label_0035: {
            Label_0030: {
                Player player;
                try {
                    player = (player2 = local);
                    if (a) {
                        break Label_0035;
                    }
                    if (player == null) {
                        break Label_0030;
                    }
                    break Label_0030;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (player == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            player2 = local;
        }
        final Tile location = player2.getLocation();
        try {
            if (location == null) {
                return null;
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
        final Iterator<Npc> iterator = getLoaded().iterator();
        Npc npc = null;
        while (iterator.hasNext()) {
            npc = iterator.next();
            if (a) {
                return npc;
            }
            final Npc npc2 = npc;
            Label_0130: {
                if (filter.accept(npc2)) {
                    double distance;
                    final double n2 = distance = Calculations.distance(location, npc2);
                    Label_0129: {
                        try {
                            if (a) {
                                break Label_0129;
                            }
                            if (n2 >= n) {
                                break Label_0130;
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                        distance = n2;
                    }
                    n = distance;
                }
            }
            if (a) {
                break;
            }
        }
        return npc;
    }
    
    public static Npc getNearest(final int... array) {
        return getNearest(new Filter<Npc>() {
            @Override
            public boolean accept(final Npc p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore          7
                //     5: aload_1        
                //     6: invokevirtual   org/powerbot/core/script/wrappers/Npc.getId:()I
                //     9: istore_2       
                //    10: aload_0        
                //    11: getfield        org/powerbot/core/script/methods/Npcs$2.val$ids:[I
                //    14: astore_3       
                //    15: aload_3        
                //    16: arraylength    
                //    17: istore          4
                //    19: iconst_0       
                //    20: istore          5
                //    22: iload           5
                //    24: iload           4
                //    26: if_icmpge       70
                //    29: aload_3        
                //    30: iload           5
                //    32: iaload         
                //    33: istore          6
                //    35: iload           7
                //    37: ifne            65
                //    40: iload_2        
                //    41: iload           7
                //    43: ifne            71
                //    46: goto            50
                //    49: athrow         
                //    50: iload           6
                //    52: if_icmpne       62
                //    55: goto            59
                //    58: athrow         
                //    59: iconst_1       
                //    60: ireturn        
                //    61: athrow         
                //    62: iinc            5, 1
                //    65: iload           7
                //    67: ifeq            22
                //    70: iconst_0       
                //    71: ireturn        
                //    StackMapTable: 00 0A FF 00 16 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 FF 00 1A 00 08 07 00 06 07 00 04 01 07 00 30 01 01 01 01 00 01 07 00 2D 40 01 47 07 00 2D 00 41 07 00 2D 00 02 FF 00 04 00 08 07 00 06 07 00 04 01 07 00 30 01 01 00 01 00 00 40 01
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  50     61     61     62     Ljava/lang/RuntimeException;
                //  40     55     58     59     Ljava/lang/RuntimeException;
                //  35     46     49     50     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0050:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1164)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:1009)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:554)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:540)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:392)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:333)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:294)
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
        });
    }
}
