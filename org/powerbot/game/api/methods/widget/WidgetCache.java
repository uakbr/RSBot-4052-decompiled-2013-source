
package org.powerbot.game.api.methods.widget;

import org.powerbot.game.bot.Context;
import org.powerbot.game.client.Client;
import java.util.Collections;
import java.util.HashMap;
import org.powerbot.game.api.methods.Tabs;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import java.util.Map;

public class WidgetCache
{
    private static final Map<ThreadGroup, Record> cache;
    private static final String z;
    
    public static void purge() {
        WidgetCache.cache.clear();
    }
    
    public static WidgetChild getCompass() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.get:()Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;
        //     8: astore_0       
        //     9: aload_0        
        //    10: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.update:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)V
        //    13: aload_0        
        //    14: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    17: iload           7
        //    19: ifne            37
        //    22: iconst_m1      
        //    23: if_icmpne       33
        //    26: goto            30
        //    29: athrow         
        //    30: aconst_null    
        //    31: areturn        
        //    32: athrow         
        //    33: aload_0        
        //    34: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    37: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    40: astore_1       
        //    41: aload_1        
        //    42: ifnull          232
        //    45: aload_0        
        //    46: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$100:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    49: iconst_m1      
        //    50: iload           7
        //    52: ifne            204
        //    55: goto            59
        //    58: athrow         
        //    59: if_icmpne       199
        //    62: goto            66
        //    65: athrow         
        //    66: aload_1        
        //    67: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    70: astore_2       
        //    71: aload_2        
        //    72: arraylength    
        //    73: istore_3       
        //    74: iconst_0       
        //    75: istore          4
        //    77: iload           4
        //    79: iload_3        
        //    80: if_icmpge       199
        //    83: aload_2        
        //    84: iload           4
        //    86: aaload         
        //    87: astore          5
        //    89: aload           5
        //    91: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getActions:()[Ljava/lang/String;
        //    94: astore          6
        //    96: iload           7
        //    98: ifne            232
        //   101: iload           7
        //   103: ifne            194
        //   106: goto            110
        //   109: athrow         
        //   110: aload           6
        //   112: ifnull          187
        //   115: goto            119
        //   118: athrow         
        //   119: aload           6
        //   121: arraylength    
        //   122: iload           7
        //   124: ifne            156
        //   127: goto            131
        //   130: athrow         
        //   131: iconst_1       
        //   132: if_icmpne       187
        //   135: goto            139
        //   138: athrow         
        //   139: aload           6
        //   141: iconst_0       
        //   142: aaload         
        //   143: getstatic       org/powerbot/game/api/methods/widget/WidgetCache.z:Ljava/lang/String;
        //   146: invokestatic    org/powerbot/core/script/internal/Constants.e:(Ljava/lang/String;)Ljava/lang/String;
        //   149: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   152: goto            156
        //   155: athrow         
        //   156: iload           7
        //   158: ifne            181
        //   161: ifeq            187
        //   164: goto            168
        //   167: athrow         
        //   168: aload_0        
        //   169: aload           5
        //   171: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //   174: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$102:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;I)I
        //   177: goto            181
        //   180: athrow         
        //   181: pop            
        //   182: iload           7
        //   184: ifeq            199
        //   187: iinc            4, 1
        //   190: goto            194
        //   193: athrow         
        //   194: iload           7
        //   196: ifeq            77
        //   199: aload_0        
        //   200: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$100:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   203: iconst_m1      
        //   204: iload           7
        //   206: ifne            228
        //   209: if_icmpeq       232
        //   212: goto            216
        //   215: athrow         
        //   216: aload_0        
        //   217: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   220: aload_0        
        //   221: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$100:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   224: goto            228
        //   227: athrow         
        //   228: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   231: areturn        
        //   232: aconst_null    
        //   233: areturn        
        //    StackMapTable: 00 22 FF 00 1D 00 08 07 00 1B 00 00 00 00 00 00 01 00 01 07 00 A0 00 41 07 00 A0 00 43 01 FF 00 14 00 08 07 00 1B 07 00 43 00 00 00 00 00 01 00 01 07 00 A0 FF 00 00 00 08 07 00 1B 07 00 43 00 00 00 00 00 01 00 02 01 01 45 07 00 A0 00 FF 00 0A 00 08 07 00 1B 07 00 43 07 00 B1 01 01 00 00 01 00 00 FF 00 1F 00 08 07 00 1B 07 00 43 07 00 B1 01 01 07 00 45 07 00 B3 01 00 01 07 00 A0 00 47 07 00 A0 00 4A 07 00 A0 40 01 46 07 00 A0 00 4F 07 00 A0 40 01 4A 07 00 A0 00 4B 07 00 A0 40 01 05 45 07 00 A0 00 FF 00 04 00 08 07 00 1B 07 00 43 00 00 00 00 00 01 00 00 FF 00 04 00 08 07 00 1B 07 00 43 00 00 00 00 00 01 00 02 01 01 4A 07 00 A0 00 4A 07 00 A0 FF 00 00 00 08 07 00 1B 07 00 43 00 00 00 00 00 01 00 02 01 01 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  209    224    227    228    Ljava/lang/RuntimeException;
        //  204    212    215    216    Ljava/lang/RuntimeException;
        //  181    190    193    194    Ljava/lang/RuntimeException;
        //  161    177    180    181    Ljava/lang/RuntimeException;
        //  156    164    167    168    Ljava/lang/RuntimeException;
        //  131    152    155    156    Ljava/lang/RuntimeException;
        //  119    135    138    139    Ljava/lang/RuntimeException;
        //  110    127    130    131    Ljava/lang/RuntimeException;
        //  101    115    118    119    Ljava/lang/RuntimeException;
        //  96     106    109    110    Ljava/lang/RuntimeException;
        //  45     62     65     66     Ljava/lang/RuntimeException;
        //  41     55     58     59     Ljava/lang/RuntimeException;
        //  22     32     32     33     Ljava/lang/RuntimeException;
        //  9      26     29     30     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
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
    
    public static WidgetChild getMap() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.get:()Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;
        //     8: astore_0       
        //     9: aload_0        
        //    10: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.update:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)V
        //    13: aload_0        
        //    14: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    17: iload           6
        //    19: ifne            37
        //    22: iconst_m1      
        //    23: if_icmpne       33
        //    26: goto            30
        //    29: athrow         
        //    30: aconst_null    
        //    31: areturn        
        //    32: athrow         
        //    33: aload_0        
        //    34: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    37: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    40: astore_1       
        //    41: aload_1        
        //    42: ifnull          182
        //    45: aload_0        
        //    46: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$200:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    49: iconst_m1      
        //    50: iload           6
        //    52: ifne            154
        //    55: goto            59
        //    58: athrow         
        //    59: if_icmpne       149
        //    62: goto            66
        //    65: athrow         
        //    66: aload_1        
        //    67: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //    70: astore_2       
        //    71: aload_2        
        //    72: arraylength    
        //    73: istore_3       
        //    74: iconst_0       
        //    75: istore          4
        //    77: iload           4
        //    79: iload_3        
        //    80: if_icmpge       149
        //    83: aload_2        
        //    84: iload           4
        //    86: aaload         
        //    87: astore          5
        //    89: iload           6
        //    91: ifne            144
        //    94: aload           5
        //    96: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getSpecialType:()I
        //    99: sipush          1338
        //   102: iload           6
        //   104: ifne            154
        //   107: goto            111
        //   110: athrow         
        //   111: if_icmpne       137
        //   114: goto            118
        //   117: athrow         
        //   118: aload_0        
        //   119: aload           5
        //   121: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //   124: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$202:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;I)I
        //   127: pop            
        //   128: iload           6
        //   130: ifeq            149
        //   133: goto            137
        //   136: athrow         
        //   137: iinc            4, 1
        //   140: goto            144
        //   143: athrow         
        //   144: iload           6
        //   146: ifeq            77
        //   149: aload_0        
        //   150: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$200:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   153: iconst_m1      
        //   154: iload           6
        //   156: ifne            178
        //   159: if_icmpeq       182
        //   162: goto            166
        //   165: athrow         
        //   166: aload_0        
        //   167: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   170: aload_0        
        //   171: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$200:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   174: goto            178
        //   177: athrow         
        //   178: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   181: areturn        
        //   182: aconst_null    
        //   183: areturn        
        //    StackMapTable: 00 19 FF 00 1D 00 07 07 00 1B 00 00 00 00 00 01 00 01 07 00 A0 00 41 07 00 A0 00 43 01 FF 00 14 00 07 07 00 1B 07 00 43 00 00 00 00 01 00 01 07 00 A0 FF 00 00 00 07 07 00 1B 07 00 43 00 00 00 00 01 00 02 01 01 45 07 00 A0 00 FF 00 0A 00 07 07 00 1B 07 00 43 07 00 B1 01 01 00 01 00 00 FF 00 20 00 07 07 00 1B 07 00 43 07 00 B1 01 01 07 00 45 01 00 01 07 00 A0 FF 00 00 00 07 07 00 1B 07 00 43 07 00 B1 01 01 07 00 45 01 00 02 01 01 45 07 00 A0 00 51 07 00 A0 00 45 07 00 A0 00 FF 00 04 00 07 07 00 1B 07 00 43 00 00 00 00 01 00 00 FF 00 04 00 07 07 00 1B 07 00 43 00 00 00 00 01 00 02 01 01 4A 07 00 A0 00 4A 07 00 A0 FF 00 00 00 07 07 00 1B 07 00 43 00 00 00 00 01 00 02 01 01 03
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  159    174    177    178    Ljava/lang/RuntimeException;
        //  154    162    165    166    Ljava/lang/RuntimeException;
        //  118    140    143    144    Ljava/lang/RuntimeException;
        //  111    133    136    137    Ljava/lang/RuntimeException;
        //  94     114    117    118    Ljava/lang/RuntimeException;
        //  89     107    110    111    Ljava/lang/RuntimeException;
        //  45     62     65     66     Ljava/lang/RuntimeException;
        //  41     55     58     59     Ljava/lang/RuntimeException;
        //  22     32     32     33     Ljava/lang/RuntimeException;
        //  9      26     29     30     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0111:
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
    
    public static WidgetChild getTab(final Tabs p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          9
        //     5: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.get:()Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;
        //     8: astore_1       
        //     9: aload_1        
        //    10: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache.update:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)V
        //    13: aload_1        
        //    14: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    17: iload           9
        //    19: ifne            37
        //    22: iconst_m1      
        //    23: if_icmpne       33
        //    26: goto            30
        //    29: athrow         
        //    30: aconst_null    
        //    31: areturn        
        //    32: athrow         
        //    33: aload_1        
        //    34: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //    37: invokestatic    org/powerbot/game/api/methods/Widgets.get:(I)Lorg/powerbot/game/api/wrappers/widget/Widget;
        //    40: astore_2       
        //    41: aload_2        
        //    42: ifnull          264
        //    45: aload_0        
        //    46: invokevirtual   org/powerbot/game/api/methods/Tabs.getIndex:()I
        //    49: istore_3       
        //    50: iload_3        
        //    51: iload           9
        //    53: ifne            64
        //    56: iflt            78
        //    59: goto            63
        //    62: athrow         
        //    63: iload_3        
        //    64: bipush          16
        //    66: iload           9
        //    68: ifne            88
        //    71: if_icmple       81
        //    74: goto            78
        //    77: athrow         
        //    78: aconst_null    
        //    79: areturn        
        //    80: athrow         
        //    81: aload_1        
        //    82: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$300:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)[I
        //    85: iload_3        
        //    86: iaload         
        //    87: iconst_m1      
        //    88: iload           9
        //    90: ifne            234
        //    93: if_icmpne       227
        //    96: goto            100
        //    99: athrow         
        //   100: aload_2        
        //   101: invokevirtual   org/powerbot/game/api/wrappers/widget/Widget.getChildren:()[Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   104: astore          4
        //   106: aload           4
        //   108: arraylength    
        //   109: istore          5
        //   111: iconst_0       
        //   112: istore          6
        //   114: iload           6
        //   116: iload           5
        //   118: if_icmpge       227
        //   121: aload           4
        //   123: iload           6
        //   125: aaload         
        //   126: astore          7
        //   128: aload           7
        //   130: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getActions:()[Ljava/lang/String;
        //   133: astore          8
        //   135: iload           9
        //   137: ifne            264
        //   140: iload           9
        //   142: ifne            222
        //   145: goto            149
        //   148: athrow         
        //   149: aload           8
        //   151: ifnull          215
        //   154: goto            158
        //   157: athrow         
        //   158: aload           8
        //   160: arraylength    
        //   161: iload           9
        //   163: ifne            192
        //   166: goto            170
        //   169: athrow         
        //   170: ifle            215
        //   173: goto            177
        //   176: athrow         
        //   177: aload           8
        //   179: iconst_0       
        //   180: aaload         
        //   181: aload_0        
        //   182: invokevirtual   org/powerbot/game/api/methods/Tabs.getDescription:()Ljava/lang/String;
        //   185: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   188: goto            192
        //   191: athrow         
        //   192: ifeq            215
        //   195: aload_1        
        //   196: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$300:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)[I
        //   199: iload_3        
        //   200: aload           7
        //   202: invokevirtual   org/powerbot/game/api/wrappers/widget/WidgetChild.getIndex:()I
        //   205: iastore        
        //   206: iload           9
        //   208: ifeq            227
        //   211: goto            215
        //   214: athrow         
        //   215: iinc            6, 1
        //   218: goto            222
        //   221: athrow         
        //   222: iload           9
        //   224: ifeq            114
        //   227: aload_1        
        //   228: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$300:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)[I
        //   231: iload_3        
        //   232: iaload         
        //   233: iconst_m1      
        //   234: iload           9
        //   236: ifne            260
        //   239: if_icmpeq       264
        //   242: goto            246
        //   245: athrow         
        //   246: aload_1        
        //   247: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$000:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)I
        //   250: aload_1        
        //   251: invokestatic    org/powerbot/game/api/methods/widget/WidgetCache$Record.access$300:(Lorg/powerbot/game/api/methods/widget/WidgetCache$Record;)[I
        //   254: iload_3        
        //   255: iaload         
        //   256: goto            260
        //   259: athrow         
        //   260: invokestatic    org/powerbot/game/api/methods/Widgets.get:(II)Lorg/powerbot/game/api/wrappers/widget/WidgetChild;
        //   263: areturn        
        //   264: aconst_null    
        //   265: areturn        
        //    StackMapTable: 00 25 FF 00 1D 00 0A 07 00 4F 07 00 1B 00 00 00 00 00 00 00 01 00 01 07 00 A0 00 41 07 00 A0 00 43 01 FF 00 18 00 0A 07 00 4F 07 00 1B 07 00 43 01 00 00 00 00 00 01 00 01 07 00 A0 00 40 01 4C 07 00 A0 00 41 07 00 A0 00 FF 00 06 00 0A 07 00 4F 07 00 1B 07 00 43 01 00 00 00 00 00 01 00 02 01 01 4A 07 00 A0 00 FF 00 0D 00 0A 07 00 4F 07 00 1B 07 00 43 01 07 00 B1 01 01 00 00 01 00 00 FF 00 21 00 0A 07 00 4F 07 00 1B 07 00 43 01 07 00 B1 01 01 07 00 45 07 00 B3 01 00 01 07 00 A0 00 47 07 00 A0 00 4A 07 00 A0 40 01 45 07 00 A0 00 4D 07 00 A0 40 01 55 07 00 A0 00 45 07 00 A0 00 FF 00 04 00 0A 07 00 4F 07 00 1B 07 00 43 01 00 00 00 00 00 01 00 00 FF 00 06 00 0A 07 00 4F 07 00 1B 07 00 43 01 00 00 00 00 00 01 00 02 01 01 4A 07 00 A0 00 4C 07 00 A0 FF 00 00 00 0A 07 00 4F 07 00 1B 07 00 43 01 00 00 00 00 00 01 00 02 01 01 FF 00 03 00 0A 07 00 4F 07 00 1B 07 00 43 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  239    256    259    260    Ljava/lang/RuntimeException;
        //  234    242    245    246    Ljava/lang/RuntimeException;
        //  195    218    221    222    Ljava/lang/RuntimeException;
        //  192    211    214    215    Ljava/lang/RuntimeException;
        //  170    188    191    192    Ljava/lang/RuntimeException;
        //  158    173    176    177    Ljava/lang/RuntimeException;
        //  149    166    169    170    Ljava/lang/RuntimeException;
        //  140    154    157    158    Ljava/lang/RuntimeException;
        //  135    145    148    149    Ljava/lang/RuntimeException;
        //  88     96     99     100    Ljava/lang/RuntimeException;
        //  71     80     80     81     Ljava/lang/RuntimeException;
        //  64     74     77     78     Ljava/lang/RuntimeException;
        //  50     59     62     63     Ljava/lang/RuntimeException;
        //  22     32     32     33     Ljava/lang/RuntimeException;
        //  9      26     29     30     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0149:
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
    
    private static synchronized void update(final Record record) {
        final int a = Bank.a;
        final int guirsInterfaceIndex = record.client.getGUIRSInterfaceIndex();
        int n2 = 0;
        Label_0030: {
            int n;
            try {
                n = (n2 = guirsInterfaceIndex);
                if (a != 0) {
                    break Label_0030;
                }
                final Record record2 = record;
                final int n3 = record2.index_widget;
                if (n != n3) {
                    break Label_0030;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Record record2 = record;
                final int n3 = record2.index_widget;
                if (n == n3) {
                    return;
                }
                record.index_map = -1;
                record.index_compass = -1;
                n2 = 0;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        int i = n2;
        while (i < 17) {
            try {
                record.indices_tabs[i] = -1;
                ++i;
                if (a != 0) {
                    return;
                }
                if (a == 0) {
                    continue;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            break;
        }
        record.index_widget = guirsInterfaceIndex;
    }
    
    private static synchronized Record get() {
        final ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
        Record record = WidgetCache.cache.get(threadGroup);
        Record record2 = null;
        Label_0054: {
            try {
                record2 = record;
                if (Bank.a != 0) {
                    return record2;
                }
                if (record2 != null) {
                    break Label_0054;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            record = new Record();
            WidgetCache.cache.put(threadGroup, record);
        }
        return record2;
    }
    
    static {
        final char[] charArray = "PZi\u0002!\n\u0006*A;".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0101: {
                if (n > 1) {
                    break Label_0101;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u0013';
                            break;
                        }
                        case 1: {
                            c2 = 'l';
                            break;
                        }
                        case 2: {
                            c2 = '\u000f';
                            break;
                        }
                        case 3: {
                            c2 = '0';
                            break;
                        }
                        default: {
                            c2 = '\u0004';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                cache = Collections.synchronizedMap(new HashMap<ThreadGroup, Record>());
                return;
            }
            continue;
        }
    }
    
    private static final class Record
    {
        private int index_widget;
        private int index_map;
        private int index_compass;
        private final int[] indices_tabs;
        private final Client client;
        
        private Record() {
            final int a = Bank.a;
            this.indices_tabs = new int[17];
            this.client = Context.client();
            this.index_widget = -1;
            this.index_map = -1;
            this.index_compass = -1;
            int i = 0;
            while (i < 17) {
                this.indices_tabs[i] = -1;
                ++i;
                if (a != 0) {
                    break;
                }
            }
        }
    }
}
