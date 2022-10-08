
package org.powerbot.core.script.wrappers;

import org.powerbot.game.client.RSCharacter;
import org.powerbot.game.client.Client;
import java.util.Arrays;
import org.powerbot.core.Bot;
import org.powerbot.game.client.RSPlayerComposite;
import org.powerbot.game.client.RSPlayer;
import java.lang.ref.WeakReference;

public class Player extends Character
{
    private final WeakReference<RSPlayer> player;
    
    public Player(final RSPlayer referent) {
        this.player = new WeakReference<RSPlayer>(referent);
    }
    
    @Override
    protected RSPlayer getAccessor() {
        return this.player.get();
    }
    
    @Override
    public String getName() {
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer;
        try {
            rsPlayer = accessor;
            if (Component.a != 0) {
                return rsPlayer.getName();
            }
            if (rsPlayer == null) {
                return null;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsPlayer.getName();
        name = null;
        return name;
    }
    
    @Override
    public int getLevel() {
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer;
        try {
            rsPlayer = accessor;
            if (Component.a != 0) {
                return rsPlayer.getLevel();
            }
            if (rsPlayer == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsPlayer.getLevel();
        level = -1;
        return level;
    }
    
    public int getTeam() {
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer;
        try {
            rsPlayer = accessor;
            if (Component.a != 0) {
                return rsPlayer.getTeam();
            }
            if (rsPlayer == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsPlayer.getTeam();
        team = -1;
        return team;
    }
    
    public int getPrayerIcon() {
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer;
        try {
            rsPlayer = accessor;
            if (Component.a != 0) {
                return rsPlayer.getPrayerIcon();
            }
            if (rsPlayer == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsPlayer.getPrayerIcon();
        prayerIcon = -1;
        return prayerIcon;
    }
    
    public int getSkullIcon() {
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer;
        try {
            rsPlayer = accessor;
            if (Component.a != 0) {
                return rsPlayer.getSkullIcon();
            }
            if (rsPlayer == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return rsPlayer.getSkullIcon();
        skullIcon = -1;
        return skullIcon;
    }
    
    public int getNpcId() {
        final int a = Component.a;
        final RSPlayer accessor = this.getAccessor();
        RSPlayer rsPlayer = null;
        Label_0022: {
            try {
                rsPlayer = accessor;
                if (a != 0) {
                    break Label_0022;
                }
                if (rsPlayer == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
        }
        RSPlayerComposite composite;
        final RSPlayerComposite rsPlayerComposite = composite = rsPlayer.getComposite();
        try {
            if (a != 0) {
                return composite.getNPCID();
            }
            if (rsPlayerComposite == null) {
                return -1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        composite = rsPlayerComposite;
        return composite.getNPCID();
        npcid = -1;
        return npcid;
    }
    
    public int[] getAppearance() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_0        
        //     6: invokevirtual   org/powerbot/core/script/wrappers/Player.getAccessor:()Lorg/powerbot/game/client/RSPlayer;
        //     9: astore_1       
        //    10: aload_1        
        //    11: iload           5
        //    13: ifne            24
        //    16: ifnull          32
        //    19: goto            23
        //    22: athrow         
        //    23: aload_1        
        //    24: invokeinterface org/powerbot/game/client/RSPlayer.getComposite:()Lorg/powerbot/game/client/RSPlayerComposite;
        //    29: goto            33
        //    32: aconst_null    
        //    33: astore_2       
        //    34: aload_2        
        //    35: iload           5
        //    37: ifne            60
        //    40: ifnull          139
        //    43: goto            47
        //    46: athrow         
        //    47: aload_2        
        //    48: invokeinterface org/powerbot/game/client/RSPlayerComposite.getEquipment:()[I
        //    53: invokevirtual   [I.clone:()Ljava/lang/Object;
        //    56: goto            60
        //    59: athrow         
        //    60: checkcast       [I
        //    63: astore_3       
        //    64: iconst_0       
        //    65: istore          4
        //    67: iload           4
        //    69: aload_3        
        //    70: arraylength    
        //    71: if_icmpge       137
        //    74: aload_3        
        //    75: iload           5
        //    77: ifne            138
        //    80: iload           4
        //    82: iload           5
        //    84: ifne            127
        //    87: goto            91
        //    90: athrow         
        //    91: iaload         
        //    92: ldc             1073741824
        //    94: iand           
        //    95: ifle            120
        //    98: goto            102
        //   101: athrow         
        //   102: aload_3        
        //   103: iload           4
        //   105: dup2           
        //   106: iaload         
        //   107: ldc             1073741823
        //   109: iand           
        //   110: iastore        
        //   111: iload           5
        //   113: ifeq            129
        //   116: goto            120
        //   119: athrow         
        //   120: aload_3        
        //   121: iload           4
        //   123: goto            127
        //   126: athrow         
        //   127: iconst_m1      
        //   128: iastore        
        //   129: iinc            4, 1
        //   132: iload           5
        //   134: ifeq            67
        //   137: aload_3        
        //   138: areturn        
        //   139: aconst_null    
        //   140: areturn        
        //    StackMapTable: 00 16 FF 00 16 00 06 07 00 18 07 00 06 00 00 00 01 00 01 07 00 6A 00 40 07 00 06 07 40 07 00 3D FF 00 0C 00 06 07 00 18 07 00 06 07 00 3D 00 00 01 00 01 07 00 6A 00 4B 07 00 6A 40 07 00 6F FF 00 06 00 06 07 00 18 07 00 06 07 00 3D 07 00 40 01 01 00 00 56 07 00 6A FF 00 00 00 06 07 00 18 07 00 06 07 00 3D 07 00 40 01 01 00 02 07 00 40 01 49 07 00 6A 00 50 07 00 6A 00 45 07 00 6A FF 00 00 00 06 07 00 18 07 00 06 07 00 3D 07 00 40 01 01 00 02 07 00 40 01 01 07 40 07 00 40 FF 00 00 00 06 07 00 18 07 00 06 07 00 3D 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  102    123    126    127    Ljava/lang/RuntimeException;
        //  91     116    119    120    Ljava/lang/RuntimeException;
        //  80     98     101    102    Ljava/lang/RuntimeException;
        //  74     87     90     91     Ljava/lang/RuntimeException;
        //  40     56     59     60     Ljava/lang/RuntimeException;
        //  34     43     46     47     Ljava/lang/RuntimeException;
        //  10     19     22     23     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0091:
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
    public boolean isValid() {
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
        final RSPlayer accessor = this.getAccessor();
        final RSPlayer[] rsPlayerArray = client.getRSPlayerArray();
        boolean contains = false;
        Label_0075: {
            Label_0050: {
                Label_0042: {
                    try {
                        if (accessor == null) {
                            break Label_0075;
                        }
                        final RSPlayer[] array;
                        final RSPlayer[] a2 = array = rsPlayerArray;
                        final int n = a;
                        if (n == 0) {
                            break Label_0042;
                        }
                        break Label_0050;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                    try {
                        final RSPlayer[] array;
                        final RSPlayer[] a2 = array = rsPlayerArray;
                        final int n = a;
                        if (n != 0) {
                            break Label_0050;
                        }
                        if (array == null) {
                            break Label_0075;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                final RSPlayer[] a2 = rsPlayerArray;
                try {
                    contains = Arrays.asList(a2).contains(accessor);
                    if (a != 0) {
                        return contains;
                    }
                    if (!contains) {
                        break Label_0075;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return contains;
        }
        return contains;
    }
}
