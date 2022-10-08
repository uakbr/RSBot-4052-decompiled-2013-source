
package org.powerbot.game.api.methods.widget;

import org.powerbot.game.api.wrappers.Tile;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.interactive.Players;
import org.powerbot.game.api.util.Random;
import org.powerbot.game.api.wrappers.Locatable;
import org.powerbot.game.bot.Context;

public class Camera
{
    public static int getX() {
        return Context.client().getCamPosX();
    }
    
    public static int getY() {
        return Context.client().getCamPosY();
    }
    
    public static int getZ() {
        return Context.client().getCamPosZ();
    }
    
    public static int getYaw() {
        return (int)(Context.client().getCameraYaw() / 45.51);
    }
    
    public static int getPitch() {
        return (int)((Context.client().getCameraPitch() - 1024) / 20.48);
    }
    
    public static synchronized boolean setPitch(final boolean b) {
        Label_0014: {
            try {
                final boolean setPitch = b;
                if (Bank.a != 0) {
                    return setPitch;
                }
                if (b) {
                    break Label_0014;
                }
                return setPitch(0);
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (b) {
                    return setPitch(100);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return setPitch(0);
    }
    
    public static synchronized boolean setPitch(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/widget/Camera.getPitch:()I
        //     8: istore_1       
        //     9: iconst_0       
        //    10: istore_2       
        //    11: iload_1        
        //    12: iload_0        
        //    13: iload           5
        //    15: ifne            39
        //    18: if_icmpne       28
        //    21: goto            25
        //    24: athrow         
        //    25: iconst_1       
        //    26: ireturn        
        //    27: athrow         
        //    28: iload_1        
        //    29: iload           5
        //    31: ifne            43
        //    34: iload_0        
        //    35: goto            39
        //    38: athrow         
        //    39: if_icmpge       46
        //    42: iconst_1       
        //    43: goto            47
        //    46: iconst_0       
        //    47: istore_3       
        //    48: iload_3        
        //    49: iload           5
        //    51: ifne            63
        //    54: ifeq            66
        //    57: goto            61
        //    60: athrow         
        //    61: bipush          38
        //    63: goto            68
        //    66: bipush          40
        //    68: iconst_0       
        //    69: iconst_0       
        //    70: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CII)V
        //    73: new             Lorg/powerbot/game/api/util/Timer;
        //    76: dup            
        //    77: ldc2_w          100
        //    80: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    83: astore          4
        //    85: aload           4
        //    87: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    90: ifeq            187
        //    93: iload_2        
        //    94: iload_1        
        //    95: iload           5
        //    97: ifne            121
        //   100: if_icmpeq       116
        //   103: goto            107
        //   106: athrow         
        //   107: aload           4
        //   109: invokevirtual   org/powerbot/game/api/util/Timer.reset:()V
        //   112: goto            116
        //   115: athrow         
        //   116: iload_1        
        //   117: istore_2       
        //   118: iconst_5       
        //   119: bipush          10
        //   121: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   124: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   127: invokestatic    org/powerbot/game/api/methods/widget/Camera.getPitch:()I
        //   130: istore_1       
        //   131: iload_3        
        //   132: iload           5
        //   134: ifne            167
        //   137: ifeq            166
        //   140: goto            144
        //   143: athrow         
        //   144: iload_1        
        //   145: iload           5
        //   147: ifne            167
        //   150: goto            154
        //   153: athrow         
        //   154: iload_0        
        //   155: if_icmplt       166
        //   158: goto            162
        //   161: athrow         
        //   162: goto            187
        //   165: athrow         
        //   166: iload_3        
        //   167: iload           5
        //   169: ifne            180
        //   172: ifne            85
        //   175: goto            179
        //   178: athrow         
        //   179: iload_1        
        //   180: iload_0        
        //   181: if_icmpgt       85
        //   184: goto            187
        //   187: iload_3        
        //   188: iload           5
        //   190: ifne            202
        //   193: ifeq            205
        //   196: goto            200
        //   199: athrow         
        //   200: bipush          38
        //   202: goto            207
        //   205: bipush          40
        //   207: iconst_0       
        //   208: iconst_0       
        //   209: invokestatic    org/powerbot/game/api/methods/input/Keyboard.releaseKey:(CII)V
        //   212: iload_1        
        //   213: iload           5
        //   215: ifne            231
        //   218: iload_0        
        //   219: if_icmpne       234
        //   222: goto            226
        //   225: athrow         
        //   226: iconst_1       
        //   227: goto            231
        //   230: athrow         
        //   231: goto            235
        //   234: iconst_0       
        //   235: ireturn        
        //    StackMapTable: 00 2C FF 00 18 00 06 01 01 01 00 00 01 00 01 07 00 A2 00 41 07 00 A2 00 49 07 00 A2 FF 00 00 00 06 01 01 01 00 00 01 00 02 01 01 43 01 02 40 01 FF 00 0C 00 06 01 01 01 01 00 01 00 01 07 00 A2 00 41 01 02 41 01 FF 00 10 00 06 01 01 01 01 07 00 0F 01 00 00 54 07 00 A2 00 47 07 00 A2 00 FF 00 04 00 06 01 01 01 01 07 00 0F 01 00 02 01 01 55 07 00 A2 00 48 07 00 A2 40 01 46 07 00 A2 00 42 07 00 A2 00 40 01 4A 07 00 A2 00 40 01 06 4B 07 00 A2 00 41 01 02 41 01 51 07 00 A2 00 43 07 00 A2 40 01 02 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  218    227    230    231    Ljava/lang/RuntimeException;
        //  207    222    225    226    Ljava/lang/RuntimeException;
        //  187    196    199    200    Ljava/lang/RuntimeException;
        //  167    175    178    179    Ljava/lang/RuntimeException;
        //  154    165    165    166    Ljava/lang/RuntimeException;
        //  144    158    161    162    Ljava/lang/RuntimeException;
        //  137    150    153    154    Ljava/lang/RuntimeException;
        //  131    140    143    144    Ljava/lang/RuntimeException;
        //  100    112    115    116    Ljava/lang/RuntimeException;
        //  93     103    106    107    Ljava/lang/RuntimeException;
        //  48     57     60     61     Ljava/lang/RuntimeException;
        //  28     35     38     39     Ljava/lang/RuntimeException;
        //  18     27     27     28     Ljava/lang/RuntimeException;
        //  11     21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0144:
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
    
    public static synchronized void setAngle(final char p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: iload_0        
        //     5: iload_1        
        //     6: ifne            111
        //     9: lookupswitch {
        //              101: 92
        //              110: 53
        //              115: 78
        //              119: 65
        //          default: 106
        //        }
        //    52: athrow         
        //    53: iconst_0       
        //    54: invokestatic    org/powerbot/game/api/methods/widget/Camera.setAngle:(I)V
        //    57: iload_1        
        //    58: ifeq            114
        //    61: goto            65
        //    64: athrow         
        //    65: bipush          90
        //    67: invokestatic    org/powerbot/game/api/methods/widget/Camera.setAngle:(I)V
        //    70: iload_1        
        //    71: ifeq            114
        //    74: goto            78
        //    77: athrow         
        //    78: sipush          180
        //    81: invokestatic    org/powerbot/game/api/methods/widget/Camera.setAngle:(I)V
        //    84: iload_1        
        //    85: ifeq            114
        //    88: goto            92
        //    91: athrow         
        //    92: sipush          270
        //    95: invokestatic    org/powerbot/game/api/methods/widget/Camera.setAngle:(I)V
        //    98: iload_1        
        //    99: ifeq            114
        //   102: goto            106
        //   105: athrow         
        //   106: iconst_0       
        //   107: goto            111
        //   110: athrow         
        //   111: invokestatic    org/powerbot/game/api/methods/widget/Camera.setAngle:(I)V
        //   114: return         
        //    StackMapTable: 00 0D FF 00 34 00 02 01 01 00 01 07 00 A2 00 4A 07 00 A2 00 4B 07 00 A2 00 4C 07 00 A2 00 4C 07 00 A2 00 43 07 00 A2 40 01 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  92     107    110    111    Ljava/lang/RuntimeException;
        //  78     102    105    106    Ljava/lang/RuntimeException;
        //  65     88     91     92     Ljava/lang/RuntimeException;
        //  53     74     77     78     Ljava/lang/RuntimeException;
        //  9      61     64     65     Ljava/lang/RuntimeException;
        //  4      52     52     53     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0053:
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
    
    public static synchronized boolean setNorth() {
        return WidgetCache.getCompass().click(true);
    }
    
    public static synchronized boolean setNorth(final int pitch) {
        final int a = Bank.a;
        Label_0030: {
            boolean click = false;
            boolean setPitch = false;
            Label_0022: {
                boolean b;
                try {
                    b = (setPitch = (click = WidgetCache.getCompass().click((boolean)(1 != 0))));
                    if (a != 0) {
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
                    click = (setPitch = setPitch(pitch));
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    return click;
                }
                if (!setPitch) {
                    return false;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return true;
        click = false;
        return click;
    }
    
    public static synchronized void setAngle(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: iload_0        
        //     6: sipush          360
        //     9: irem           
        //    10: istore_0       
        //    11: iload_0        
        //    12: invokestatic    org/powerbot/game/api/methods/widget/Camera.getAngleTo:(I)I
        //    15: iconst_5       
        //    16: iload           4
        //    18: ifne            164
        //    21: if_icmple       154
        //    24: goto            28
        //    27: athrow         
        //    28: bipush          37
        //    30: iconst_0       
        //    31: iconst_0       
        //    32: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CII)V
        //    35: new             Lorg/powerbot/game/api/util/Timer;
        //    38: dup            
        //    39: ldc2_w          500
        //    42: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //    45: astore_1       
        //    46: iconst_m1      
        //    47: istore_3       
        //    48: iload_0        
        //    49: invokestatic    org/powerbot/game/api/methods/widget/Camera.getAngleTo:(I)I
        //    52: dup            
        //    53: istore_2       
        //    54: iconst_5       
        //    55: if_icmple       142
        //    58: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //    61: bipush          11
        //    63: iload           4
        //    65: ifne            145
        //    68: iload           4
        //    70: ifne            145
        //    73: goto            77
        //    76: athrow         
        //    77: if_icmpne       142
        //    80: goto            84
        //    83: athrow         
        //    84: aload_1        
        //    85: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    88: iload           4
        //    90: ifne            144
        //    93: goto            97
        //    96: athrow         
        //    97: ifeq            142
        //   100: goto            104
        //   103: athrow         
        //   104: iload_2        
        //   105: iload           4
        //   107: ifne            134
        //   110: goto            114
        //   113: athrow         
        //   114: iload_3        
        //   115: if_icmpeq       130
        //   118: goto            122
        //   121: athrow         
        //   122: aload_1        
        //   123: invokevirtual   org/powerbot/game/api/util/Timer.reset:()V
        //   126: goto            130
        //   129: athrow         
        //   130: iload_2        
        //   131: istore_3       
        //   132: bipush          10
        //   134: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   137: iload           4
        //   139: ifeq            48
        //   142: bipush          37
        //   144: iconst_0       
        //   145: iconst_0       
        //   146: invokestatic    org/powerbot/game/api/methods/input/Keyboard.releaseKey:(CII)V
        //   149: iload           4
        //   151: ifeq            302
        //   154: iload_0        
        //   155: invokestatic    org/powerbot/game/api/methods/widget/Camera.getAngleTo:(I)I
        //   158: bipush          -5
        //   160: goto            164
        //   163: athrow         
        //   164: iload           4
        //   166: ifne            183
        //   169: if_icmpge       302
        //   172: goto            176
        //   175: athrow         
        //   176: bipush          39
        //   178: iconst_0       
        //   179: goto            183
        //   182: athrow         
        //   183: iconst_0       
        //   184: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CII)V
        //   187: new             Lorg/powerbot/game/api/util/Timer;
        //   190: dup            
        //   191: ldc2_w          500
        //   194: invokespecial   org/powerbot/game/api/util/Timer.<init>:(J)V
        //   197: astore_1       
        //   198: iconst_m1      
        //   199: istore_3       
        //   200: iload_0        
        //   201: invokestatic    org/powerbot/game/api/methods/widget/Camera.getAngleTo:(I)I
        //   204: dup            
        //   205: istore_2       
        //   206: bipush          -5
        //   208: if_icmpge       295
        //   211: invokestatic    org/powerbot/game/api/methods/Game.getClientState:()I
        //   214: bipush          11
        //   216: iload           4
        //   218: ifne            298
        //   221: iload           4
        //   223: ifne            298
        //   226: goto            230
        //   229: athrow         
        //   230: if_icmpne       295
        //   233: goto            237
        //   236: athrow         
        //   237: aload_1        
        //   238: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //   241: iload           4
        //   243: ifne            297
        //   246: goto            250
        //   249: athrow         
        //   250: ifeq            295
        //   253: goto            257
        //   256: athrow         
        //   257: iload_2        
        //   258: iload           4
        //   260: ifne            287
        //   263: goto            267
        //   266: athrow         
        //   267: iload_3        
        //   268: if_icmpeq       283
        //   271: goto            275
        //   274: athrow         
        //   275: aload_1        
        //   276: invokevirtual   org/powerbot/game/api/util/Timer.reset:()V
        //   279: goto            283
        //   282: athrow         
        //   283: iload_2        
        //   284: istore_3       
        //   285: bipush          10
        //   287: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //   290: iload           4
        //   292: ifeq            200
        //   295: bipush          39
        //   297: iconst_0       
        //   298: iconst_0       
        //   299: invokestatic    org/powerbot/game/api/methods/input/Keyboard.releaseKey:(CII)V
        //   302: return         
        //    StackMapTable: 00 30 FF 00 1B 00 05 01 00 00 00 01 00 01 07 00 A2 00 FF 00 13 00 05 01 07 00 0F 00 01 01 00 00 FF 00 1B 00 05 01 07 00 0F 01 01 01 00 01 07 00 A2 FF 00 00 00 05 01 07 00 0F 01 01 01 00 02 01 01 45 07 00 A2 00 4B 07 00 A2 40 01 45 07 00 A2 00 48 07 00 A2 40 01 46 07 00 A2 00 46 07 00 A2 00 43 01 07 41 01 FF 00 00 00 05 01 07 00 0F 01 01 01 00 02 01 01 FF 00 08 00 05 01 00 00 00 01 00 00 48 07 00 A2 FF 00 00 00 05 01 00 00 00 01 00 02 01 01 4A 07 00 A2 00 45 07 00 A2 FF 00 00 00 05 01 00 00 00 01 00 02 01 01 FF 00 10 00 05 01 07 00 0F 00 01 01 00 00 FF 00 1C 00 05 01 07 00 0F 01 01 01 00 01 07 00 A2 FF 00 00 00 05 01 07 00 0F 01 01 01 00 02 01 01 45 07 00 A2 00 4B 07 00 A2 40 01 45 07 00 A2 00 48 07 00 A2 40 01 46 07 00 A2 00 46 07 00 A2 00 43 01 07 41 01 FF 00 00 00 05 01 07 00 0F 01 01 01 00 02 01 01 FF 00 03 00 05 01 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  267    279    282    283    Ljava/lang/RuntimeException;
        //  257    271    274    275    Ljava/lang/RuntimeException;
        //  250    263    266    267    Ljava/lang/RuntimeException;
        //  237    253    256    257    Ljava/lang/RuntimeException;
        //  230    246    249    250    Ljava/lang/RuntimeException;
        //  221    233    236    237    Ljava/lang/RuntimeException;
        //  211    226    229    230    Ljava/lang/RuntimeException;
        //  169    179    182    183    Ljava/lang/RuntimeException;
        //  164    172    175    176    Ljava/lang/RuntimeException;
        //  145    160    163    164    Ljava/lang/RuntimeException;
        //  114    126    129    130    Ljava/lang/RuntimeException;
        //  104    118    121    122    Ljava/lang/RuntimeException;
        //  97     110    113    114    Ljava/lang/RuntimeException;
        //  84     100    103    104    Ljava/lang/RuntimeException;
        //  77     93     96     97     Ljava/lang/RuntimeException;
        //  68     80     83     84     Ljava/lang/RuntimeException;
        //  58     73     76     77     Ljava/lang/RuntimeException;
        //  11     24     27     28     Ljava/lang/RuntimeException;
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
    
    public static int getAngleTo(final int n) {
        final int a = Bank.a;
        int yaw = getYaw();
        int n2 = 0;
        int n3 = 0;
        Label_0029: {
            Label_0027: {
                try {
                    n2 = yaw;
                    n3 = n;
                    if (a != 0) {
                        break Label_0029;
                    }
                    if (n2 >= n) {
                        break Label_0027;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                yaw += 360;
            }
            n3 = n;
        }
        int n4 = n2 - n3;
        Label_0046: {
            int n5;
            try {
                final int n6;
                n5 = (n6 = n4);
                if (a != 0) {
                    return n6;
                }
                final int n7 = 180;
                if (n5 > n7) {
                    break Label_0046;
                }
                return n4;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            try {
                final int n7 = 180;
                if (n5 > n7) {
                    n4 -= 360;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        return n4;
    }
    
    public static synchronized void turnTo(final Locatable locatable) {
        turnTo(locatable, 0);
    }
    
    public static synchronized void turnTo(final Locatable locatable, final int n) {
        final int mobileAngle = getMobileAngle(locatable);
        setAngle(Random.nextInt(mobileAngle - n, mobileAngle + n + 1));
    }
    
    public static int getMobileAngle(final Locatable locatable) {
        final int a = Bank.a;
        final Tile location = locatable.getLocation();
        final Tile location2 = Players.getLocal().getLocation();
        final int n = (int)Math.toDegrees(Math.atan2(location.getY() - location2.getY(), location.getX() - location2.getX())) - 90;
        if (a != 0) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
        return n;
    }
}
