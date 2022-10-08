
package org.powerbot.game.api.methods.tab;

import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.powerbot.game.api.methods.Widgets;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.game.client.Skill;
import org.powerbot.game.bot.Context;

public class Skills
{
    public static final int[] XP_TABLE;
    public static final int ATTACK = 0;
    public static final int DEFENSE = 1;
    public static final int STRENGTH = 2;
    public static final int CONSTITUTION = 3;
    public static final int RANGE = 4;
    public static final int PRAYER = 5;
    public static final int MAGIC = 6;
    public static final int COOKING = 7;
    public static final int WOODCUTTING = 8;
    public static final int FLETCHING = 9;
    public static final int FISHING = 10;
    public static final int FIREMAKING = 11;
    public static final int CRAFTING = 12;
    public static final int SMITHING = 13;
    public static final int MINING = 14;
    public static final int HERBLORE = 15;
    public static final int AGILITY = 16;
    public static final int THIEVING = 17;
    public static final int SLAYER = 18;
    public static final int FARMING = 19;
    public static final int RUNECRAFTING = 20;
    public static final int HUNTER = 21;
    public static final int CONSTRUCTION = 22;
    public static final int SUMMONING = 23;
    public static final int DUNGEONEERING = 24;
    public static final int WIDGET = 320;
    public static final int WIDGET_ATTACK = 1;
    public static final int WIDGET_DEFENSE = 18;
    public static final int WIDGET_STRENGTH = 4;
    public static final int WIDGET_CONSTITUTION = 2;
    public static final int WIDGET_RANGE = 35;
    public static final int WIDGET_PRAYER = 53;
    public static final int WIDGET_MAGIC = 66;
    public static final int WIDGET_COOKING = 47;
    public static final int WIDGET_WOODCUTTING = 78;
    public static final int WIDGET_FLETCHING = 72;
    public static final int WIDGET_FISHING = 29;
    public static final int WIDGET_FIREMAKING = 65;
    public static final int WIDGET_CRAFTING = 59;
    public static final int WIDGET_SMITHING = 16;
    public static final int WIDGET_MINING = 3;
    public static final int WIDGET_HERBLORE = 23;
    public static final int WIDGET_AGILITY = 10;
    public static final int WIDGET_THIEVING = 41;
    public static final int WIDGET_SLAYER = 85;
    public static final int WIDGET_FARMING = 91;
    public static final int WIDGET_RUNECRAFTING = 79;
    public static final int WIDGET_HUNTER = 103;
    public static final int WIDGET_CONSTRUCTION = 97;
    public static final int WIDGET_SUMMONING = 109;
    public static final int WIDGET_DUNGEONEERING = 115;
    
    @Deprecated
    public static int[] getLevels() {
        return getTopLevels();
    }
    
    public static int[] getTopLevels() {
        final int a = Inventory.a;
        final Skill[] skills = Context.client().getPlayerMetaInfo().getSkills();
        final int[] array = new int[skills.length];
        int i = 0;
        while (i < skills.length) {
            Label_0060: {
                try {
                    if (skills[i] == null) {
                        break Label_0060;
                    }
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getLevel();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        break Label_0060;
                    }
                    break Label_0060;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getLevel();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        array[i] = -1;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array;
    }
    
    public static int[] getBottomLevels() {
        final int a = Inventory.a;
        final Skill[] skills = Context.client().getPlayerMetaInfo().getSkills();
        final int[] array = new int[skills.length];
        int i = 0;
        while (i < skills.length) {
            Label_0060: {
                try {
                    if (skills[i] == null) {
                        break Label_0060;
                    }
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getRealLevel();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        break Label_0060;
                    }
                    break Label_0060;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getRealLevel();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        array[i] = -1;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array;
    }
    
    public static int[] getExperiences() {
        final int a = Inventory.a;
        final Skill[] skills = Context.client().getPlayerMetaInfo().getSkills();
        final int[] array = new int[skills.length];
        int i = 0;
        while (i < skills.length) {
            Label_0060: {
                try {
                    if (skills[i] == null) {
                        break Label_0060;
                    }
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getExperience();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        break Label_0060;
                    }
                    break Label_0060;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final int[] array2 = array;
                    final int n = i;
                    final Skill[] array3 = skills;
                    final int n2 = i;
                    final Skill skill = array3[n2];
                    final int n3 = skill.getExperience();
                    array2[n] = n3;
                    final int n4 = a;
                    if (n4 != 0) {
                        array[i] = -1;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            ++i;
            if (a != 0) {
                break;
            }
        }
        return array;
    }
    
    public static int getLevelAt(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: getstatic       org/powerbot/game/api/methods/tab/Skills.XP_TABLE:[I
        //     7: arraylength    
        //     8: iconst_1       
        //     9: isub           
        //    10: istore_1       
        //    11: iload_1        
        //    12: ifle            53
        //    15: iload_0        
        //    16: iload_2        
        //    17: ifne            54
        //    20: iload_2        
        //    21: ifne            45
        //    24: goto            28
        //    27: athrow         
        //    28: getstatic       org/powerbot/game/api/methods/tab/Skills.XP_TABLE:[I
        //    31: iload_1        
        //    32: iaload         
        //    33: if_icmple       46
        //    36: goto            40
        //    39: athrow         
        //    40: iload_1        
        //    41: goto            45
        //    44: athrow         
        //    45: ireturn        
        //    46: iinc            1, -1
        //    49: iload_2        
        //    50: ifeq            11
        //    53: iconst_1       
        //    54: ireturn        
        //    StackMapTable: 00 0A FD 00 0B 01 01 4F 07 01 09 40 01 4A 07 01 09 00 43 07 01 09 40 01 00 06 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  28     41     44     45     Ljava/lang/RuntimeException;
        //  20     36     39     40     Ljava/lang/RuntimeException;
        //  15     24     27     28     Ljava/lang/RuntimeException;
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
    
    public static int getLevel(final int n) {
        return getTopLevels()[n];
    }
    
    public static int getRealLevel(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_0        
        //     5: invokestatic    org/powerbot/game/api/methods/tab/Skills.getExperience:(I)I
        //     8: invokestatic    org/powerbot/game/api/methods/tab/Skills.getLevelAt:(I)I
        //    11: istore_1       
        //    12: iload_0        
        //    13: iload_2        
        //    14: ifne            49
        //    17: bipush          24
        //    19: if_icmpeq       48
        //    22: goto            26
        //    25: athrow         
        //    26: iload_1        
        //    27: iload_2        
        //    28: ifne            49
        //    31: goto            35
        //    34: athrow         
        //    35: bipush          99
        //    37: if_icmple       48
        //    40: goto            44
        //    43: athrow         
        //    44: bipush          99
        //    46: ireturn        
        //    47: athrow         
        //    48: iload_1        
        //    49: ireturn        
        //    StackMapTable: 00 09 FF 00 19 00 03 01 01 01 00 01 07 01 09 00 47 07 01 09 40 01 47 07 01 09 00 42 07 01 09 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  35     47     47     48     Ljava/lang/RuntimeException;
        //  26     40     43     44     Ljava/lang/RuntimeException;
        //  17     31     34     35     Ljava/lang/RuntimeException;
        //  12     22     25     26     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0026:
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
    
    public static int getExperience(final int n) {
        return getExperiences()[n];
    }
    
    public static int getExperienceRequired(final int n) {
        try {
            final int n2 = n;
            if (Inventory.a != 0) {
                return n2;
            }
            final int n3 = 120;
            if (n > n3) {
                return -1;
            }
            return Skills.XP_TABLE[n];
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        try {
            final int n3 = 120;
            if (n > n3) {
                return -1;
            }
        }
        catch (RuntimeException ex2) {
            throw ex2;
        }
        return Skills.XP_TABLE[n];
    }
    
    public static int getExperienceToLevel(final int n, final int n2) {
        Label_0021: {
            int n3;
            try {
                final int experienceRequired = n2;
                final int n4;
                n3 = (n4 = Skills.XP_TABLE.length);
                if (Inventory.a != 0) {
                    return experienceRequired - n4;
                }
                if (n2 >= n3) {
                    return -1;
                }
                break Label_0021;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (n2 >= n3) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final int experienceRequired = getExperienceRequired(n2);
        int n4 = getExperience(n);
        return experienceRequired - n4;
    }
    
    public static Widget getWidget() {
        return Widgets.get(320);
    }
    
    public static WidgetChild getWidgetChild(final int n) {
        return Widgets.get(320, n);
    }
    
    static {
        XP_TABLE = new int[] { 0, 0, 83, 174, 276, 388, 512, 650, 801, 969, 1154, 1358, 1584, 1833, 2107, 2411, 2746, 3115, 3523, 3973, 4470, 5018, 5624, 6291, 7028, 7842, 8740, 9730, 10824, 12031, 13363, 14833, 16456, 18247, 20224, 22406, 24815, 27473, 30408, 33648, 37224, 41171, 45529, 50339, 55649, 61512, 67983, 75127, 83014, 91721, 101333, 111945, 123660, 136594, 150872, 166636, 184040, 203254, 224466, 247886, 273742, 302288, 333804, 368599, 407015, 449428, 496254, 547953, 605032, 668051, 737627, 814445, 899257, 992895, 1096278, 1210421, 1336443, 1475581, 1629200, 1798808, 1986068, 2192818, 2421087, 2673114, 2951373, 3258594, 3597792, 3972294, 4385776, 4842295, 5346332, 5902831, 6517253, 7195629, 7944614, 8771558, 9684577, 10692629, 11805606, 13034431, 14391160, 15889109, 17542976, 19368992, 21385073, 23611006, 26068632, 28782069, 31777943, 35085654, 38737661, 42769801, 47221641, 52136869, 57563718, 63555443, 70170840, 77474828, 85539082, 94442737, 104273167 };
    }
}
