
package org.powerbot.game.api.methods.input;

import org.powerbot.core.bot.RSLoader;
import java.awt.Component;
import java.awt.event.KeyListener;
import java.awt.Canvas;
import org.powerbot.game.client.Client;
import org.powerbot.game.api.util.SkillData;
import org.powerbot.game.api.util.node.HashTable;
import org.powerbot.game.bot.Context;
import java.awt.event.KeyEvent;

public class Keyboard
{
    private static final String[] z;
    
    public static void pressKey(final char c, final int n, final int n2) {
        pressKey(c, c, n, n2);
    }
    
    public static void pressKey(final char p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          4
        //     5: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getKeyboard:()Lorg/powerbot/game/client/input/Keyboard;
        //     8: new             Ljava/awt/event/KeyEvent;
        //    11: dup            
        //    12: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getTarget:()Ljava/awt/Component;
        //    15: sipush          401
        //    18: invokestatic    java/lang/System.currentTimeMillis:()J
        //    21: iload_2        
        //    22: i2l            
        //    23: ladd           
        //    24: iload_3        
        //    25: iload_1        
        //    26: iload_0        
        //    27: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getKeyChar:(C)C
        //    30: iload_0        
        //    31: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getLocation:(C)I
        //    34: invokespecial   java/awt/event/KeyEvent.<init>:(Ljava/awt/Component;IJIICI)V
        //    37: invokevirtual   org/powerbot/game/client/input/Keyboard.keyPressed:(Ljava/awt/event/KeyEvent;)V
        //    40: iload_0        
        //    41: bipush          37
        //    43: iload           4
        //    45: ifne            81
        //    48: if_icmplt       74
        //    51: goto            55
        //    54: athrow         
        //    55: iload_0        
        //    56: bipush          40
        //    58: iload           4
        //    60: ifne            81
        //    63: goto            67
        //    66: athrow         
        //    67: if_icmple       158
        //    70: goto            74
        //    73: athrow         
        //    74: iload_0        
        //    75: bipush          16
        //    77: goto            81
        //    80: athrow         
        //    81: iload           4
        //    83: ifne            119
        //    86: if_icmplt       112
        //    89: goto            93
        //    92: athrow         
        //    93: iload_0        
        //    94: bipush          20
        //    96: iload           4
        //    98: ifne            119
        //   101: goto            105
        //   104: athrow         
        //   105: if_icmple       158
        //   108: goto            112
        //   111: athrow         
        //   112: iload_0        
        //   113: ldc             65535
        //   115: goto            119
        //   118: athrow         
        //   119: if_icmpeq       158
        //   122: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getKeyboard:()Lorg/powerbot/game/client/input/Keyboard;
        //   125: new             Ljava/awt/event/KeyEvent;
        //   128: dup            
        //   129: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getTarget:()Ljava/awt/Component;
        //   132: sipush          400
        //   135: invokestatic    java/lang/System.currentTimeMillis:()J
        //   138: iload_2        
        //   139: i2l            
        //   140: ladd           
        //   141: iload_3        
        //   142: iconst_0       
        //   143: iload_0        
        //   144: invokestatic    org/powerbot/game/api/methods/input/Keyboard.getKeyChar:(C)C
        //   147: iconst_0       
        //   148: invokespecial   java/awt/event/KeyEvent.<init>:(Ljava/awt/Component;IJIICI)V
        //   151: invokevirtual   org/powerbot/game/client/input/Keyboard.keyTyped:(Ljava/awt/event/KeyEvent;)V
        //   154: goto            158
        //   157: athrow         
        //   158: return         
        //    StackMapTable: 00 12 FF 00 36 00 05 01 01 01 01 01 00 01 07 00 17 00 4A 07 00 17 FF 00 00 00 05 01 01 01 01 01 00 02 01 01 45 07 00 17 00 45 07 00 17 FF 00 00 00 05 01 01 01 01 01 00 02 01 01 4A 07 00 17 00 4A 07 00 17 FF 00 00 00 05 01 01 01 01 01 00 02 01 01 45 07 00 17 00 45 07 00 17 FF 00 00 00 05 01 01 01 01 01 00 02 01 01 65 07 00 17 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  119    154    157    158    Ljava/lang/RuntimeException;
        //  105    115    118    119    Ljava/lang/RuntimeException;
        //  93     108    111    112    Ljava/lang/RuntimeException;
        //  86     101    104    105    Ljava/lang/RuntimeException;
        //  81     89     92     93     Ljava/lang/RuntimeException;
        //  67     77     80     81     Ljava/lang/RuntimeException;
        //  55     70     73     74     Ljava/lang/RuntimeException;
        //  48     63     66     67     Ljava/lang/RuntimeException;
        //  5      51     54     55     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0055:
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
    
    public static void releaseKey(final char c, final int n, final int n2) {
        releaseKey(c, c, n, n2);
    }
    
    public static void releaseKey(final char c, final int keyCode, final int n, final int modifiers) {
        getKeyboard().keyReleased(new KeyEvent(getTarget(), 402, System.currentTimeMillis() + n, modifiers, keyCode, getKeyChar(c), getLocation(c)));
    }
    
    private static int getLocation(final char p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: iload_0        
        //     5: iload_1        
        //     6: ifne            44
        //     9: bipush          16
        //    11: if_icmplt       43
        //    14: goto            18
        //    17: athrow         
        //    18: iload_0        
        //    19: iload_1        
        //    20: ifne            44
        //    23: goto            27
        //    26: athrow         
        //    27: bipush          18
        //    29: if_icmpgt       43
        //    32: goto            36
        //    35: athrow         
        //    36: iconst_2       
        //    37: iconst_4       
        //    38: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //    41: ireturn        
        //    42: athrow         
        //    43: iconst_1       
        //    44: ireturn        
        //    StackMapTable: 00 09 FF 00 11 00 02 01 01 00 01 07 00 17 00 47 07 00 17 40 01 47 07 00 17 00 45 07 00 17 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  27     42     42     43     Ljava/lang/RuntimeException;
        //  18     32     35     36     Ljava/lang/RuntimeException;
        //  9      23     26     27     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    public static void sendKey(final char c) {
        sendKey(c, 0);
    }
    
    public static void sendKey(final char p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_3       
        //     4: iload_0        
        //     5: istore_2       
        //     6: iload_0        
        //     7: bipush          97
        //     9: iload_3        
        //    10: ifne            43
        //    13: if_icmplt       41
        //    16: goto            20
        //    19: athrow         
        //    20: iload_0        
        //    21: bipush          122
        //    23: iload_3        
        //    24: ifne            43
        //    27: goto            31
        //    30: athrow         
        //    31: if_icmpgt       41
        //    34: goto            38
        //    37: athrow         
        //    38: iinc            2, -32
        //    41: iload_0        
        //    42: iload_2        
        //    43: iload_1        
        //    44: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendKey:(CII)V
        //    47: return         
        //    StackMapTable: 00 08 FF 00 13 00 04 01 01 01 01 00 01 07 00 17 00 49 07 00 17 FF 00 00 00 04 01 01 01 01 00 02 01 01 45 07 00 17 00 02 FF 00 01 00 04 01 01 01 01 00 02 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  20     34     37     38     Ljava/lang/RuntimeException;
        //  13     27     30     31     Ljava/lang/RuntimeException;
        //  6      16     19     20     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0020:
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
    
    public static void sendKey(final char p0, final int p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: iconst_0       
        //     6: istore_3       
        //     7: iload_0        
        //     8: iload           7
        //    10: ifne            44
        //    13: bipush          65
        //    15: if_icmplt       43
        //    18: goto            22
        //    21: athrow         
        //    22: iload_0        
        //    23: iload           7
        //    25: ifne            44
        //    28: goto            32
        //    31: athrow         
        //    32: bipush          90
        //    34: if_icmpgt       43
        //    37: goto            41
        //    40: athrow         
        //    41: iconst_1       
        //    42: istore_3       
        //    43: iconst_0       
        //    44: istore          4
        //    46: iload_3        
        //    47: iload           7
        //    49: ifne            78
        //    52: ifeq            77
        //    55: goto            59
        //    58: athrow         
        //    59: bipush          16
        //    61: iconst_0       
        //    62: bipush          64
        //    64: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CII)V
        //    67: bipush          100
        //    69: sipush          200
        //    72: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //    75: istore          4
        //    77: iload_0        
        //    78: iload_1        
        //    79: iload           4
        //    81: iload_3        
        //    82: iload           7
        //    84: ifne            96
        //    87: ifeq            99
        //    90: goto            94
        //    93: athrow         
        //    94: bipush          64
        //    96: goto            100
        //    99: iconst_0       
        //   100: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CIII)V
        //   103: iload_2        
        //   104: sipush          500
        //   107: iload           7
        //   109: ifne            251
        //   112: if_icmple       243
        //   115: goto            119
        //   118: athrow         
        //   119: iload_0        
        //   120: iload_1        
        //   121: sipush          500
        //   124: iload           4
        //   126: iadd           
        //   127: iload_3        
        //   128: iload           7
        //   130: ifne            146
        //   133: goto            137
        //   136: athrow         
        //   137: ifeq            149
        //   140: goto            144
        //   143: athrow         
        //   144: bipush          64
        //   146: goto            150
        //   149: iconst_0       
        //   150: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CIII)V
        //   153: iload_2        
        //   154: sipush          500
        //   157: isub           
        //   158: istore          5
        //   160: bipush          37
        //   162: istore          6
        //   164: iload           6
        //   166: iload           5
        //   168: if_icmpge       243
        //   171: iload_0        
        //   172: iload_1        
        //   173: sipush          500
        //   176: iload           6
        //   178: iadd           
        //   179: iload           4
        //   181: iadd           
        //   182: iload_3        
        //   183: iload           7
        //   185: ifne            262
        //   188: iload           7
        //   190: ifne            206
        //   193: goto            197
        //   196: athrow         
        //   197: ifeq            209
        //   200: goto            204
        //   203: athrow         
        //   204: bipush          64
        //   206: goto            210
        //   209: iconst_0       
        //   210: invokestatic    org/powerbot/game/api/methods/input/Keyboard.pressKey:(CIII)V
        //   213: iload           6
        //   215: bipush          20
        //   217: bipush          40
        //   219: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   222: iadd           
        //   223: istore          6
        //   225: iload           7
        //   227: ifeq            164
        //   230: getstatic       org/powerbot/core/script/job/Task.a:I
        //   233: istore          8
        //   235: iinc            8, 1
        //   238: iload           8
        //   240: putstatic       org/powerbot/core/script/job/Task.a:I
        //   243: iload_2        
        //   244: bipush          -30
        //   246: bipush          30
        //   248: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   251: iadd           
        //   252: istore          5
        //   254: iload_0        
        //   255: iload_1        
        //   256: iload           5
        //   258: iload           4
        //   260: iadd           
        //   261: iload_3        
        //   262: iload           7
        //   264: ifne            276
        //   267: ifeq            279
        //   270: goto            274
        //   273: athrow         
        //   274: bipush          64
        //   276: goto            280
        //   279: iconst_0       
        //   280: invokestatic    org/powerbot/game/api/methods/input/Keyboard.releaseKey:(CIII)V
        //   283: iload_3        
        //   284: iload           7
        //   286: ifne            298
        //   289: ifeq            316
        //   292: goto            296
        //   295: athrow         
        //   296: bipush          16
        //   298: iload           5
        //   300: iload           4
        //   302: iadd           
        //   303: bipush          50
        //   305: bipush          120
        //   307: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   310: iadd           
        //   311: bipush          64
        //   313: invokestatic    org/powerbot/game/api/methods/input/Keyboard.releaseKey:(CII)V
        //   316: return         
        //    StackMapTable: 00 2E FF 00 15 00 08 01 01 01 01 00 00 00 01 00 01 07 00 17 00 48 07 00 17 40 01 47 07 00 17 00 01 40 01 FF 00 0D 00 08 01 01 01 01 01 00 00 01 00 01 07 00 17 00 11 40 01 4E 07 00 17 FF 00 00 00 08 01 01 01 01 01 00 00 01 00 03 01 01 01 FF 00 01 00 08 01 01 01 01 01 00 00 01 00 04 01 01 01 01 FF 00 02 00 08 01 01 01 01 01 00 00 01 00 03 01 01 01 FF 00 00 00 08 01 01 01 01 01 00 00 01 00 04 01 01 01 01 51 07 00 17 00 50 07 00 17 FF 00 00 00 08 01 01 01 01 01 00 00 01 00 04 01 01 01 01 45 07 00 17 FF 00 00 00 08 01 01 01 01 01 00 00 01 00 03 01 01 01 FF 00 01 00 08 01 01 01 01 01 00 00 01 00 04 01 01 01 01 FF 00 02 00 08 01 01 01 01 01 00 00 01 00 03 01 01 01 FF 00 00 00 08 01 01 01 01 01 00 00 01 00 04 01 01 01 01 FF 00 0D 00 08 01 01 01 01 01 01 01 01 00 00 5F 07 00 17 FF 00 00 00 08 01 01 01 01 01 01 01 01 00 04 01 01 01 01 45 07 00 17 FF 00 00 00 08 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 01 00 08 01 01 01 01 01 01 01 01 00 04 01 01 01 01 FF 00 02 00 08 01 01 01 01 01 01 01 01 00 03 01 01 01 FF 00 00 00 08 01 01 01 01 01 01 01 01 00 04 01 01 01 01 FF 00 20 00 08 01 01 01 01 01 00 00 01 00 00 FF 00 07 00 08 01 01 01 01 01 00 00 01 00 02 01 01 FF 00 0A 00 08 01 01 01 01 01 01 00 01 00 04 01 01 01 01 4A 07 00 17 FF 00 00 00 08 01 01 01 01 01 01 00 01 00 03 01 01 01 FF 00 01 00 08 01 01 01 01 01 01 00 01 00 04 01 01 01 01 FF 00 02 00 08 01 01 01 01 01 01 00 01 00 03 01 01 01 FF 00 00 00 08 01 01 01 01 01 01 00 01 00 04 01 01 01 01 4E 07 00 17 00 41 01 11
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  280    292    295    296    Ljava/lang/RuntimeException;
        //  262    270    273    274    Ljava/lang/RuntimeException;
        //  188    200    203    204    Ljava/lang/RuntimeException;
        //  171    193    196    197    Ljava/lang/RuntimeException;
        //  119    140    143    144    Ljava/lang/RuntimeException;
        //  112    133    136    137    Ljava/lang/RuntimeException;
        //  100    115    118    119    Ljava/lang/RuntimeException;
        //  78     90     93     94     Ljava/lang/RuntimeException;
        //  46     55     58     59     Ljava/lang/RuntimeException;
        //  22     37     40     41     Ljava/lang/RuntimeException;
        //  13     28     31     32     Ljava/lang/RuntimeException;
        //  7      18     21     22     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0022:
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
    
    public static void sendText(final String s, final boolean b) {
        sendText(s, b, 100, 200);
    }
    
    public static void sendText(final String p0, final boolean p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          10
        //     5: aload_0        
        //     6: invokevirtual   java/lang/String.toCharArray:()[C
        //     9: astore          4
        //    11: aload           4
        //    13: astore          5
        //    15: aload           5
        //    17: arraylength    
        //    18: istore          6
        //    20: iconst_0       
        //    21: istore          7
        //    23: iload           7
        //    25: iload           6
        //    27: if_icmpge       91
        //    30: aload           5
        //    32: iload           7
        //    34: caload         
        //    35: istore          8
        //    37: iload_2        
        //    38: iload_3        
        //    39: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //    42: istore          9
        //    44: iload           8
        //    46: iload           9
        //    48: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendKey:(CI)V
        //    51: iload           10
        //    53: ifne            86
        //    56: iload           9
        //    58: iload           10
        //    60: ifne            92
        //    63: goto            67
        //    66: athrow         
        //    67: ifle            83
        //    70: goto            74
        //    73: athrow         
        //    74: iload           9
        //    76: invokestatic    org/powerbot/core/script/job/Task.sleep:(I)V
        //    79: goto            83
        //    82: athrow         
        //    83: iinc            7, 1
        //    86: iload           10
        //    88: ifeq            23
        //    91: iload_1        
        //    92: iload           10
        //    94: ifne            106
        //    97: ifeq            114
        //   100: goto            104
        //   103: athrow         
        //   104: bipush          10
        //   106: iload_2        
        //   107: iload_3        
        //   108: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   111: invokestatic    org/powerbot/game/api/methods/input/Keyboard.sendKey:(CI)V
        //   114: return         
        //    StackMapTable: 00 0E FF 00 17 00 0B 07 00 4F 01 01 01 07 00 A9 07 00 A9 01 01 00 00 01 00 00 FF 00 2A 00 0B 07 00 4F 01 01 01 07 00 A9 07 00 A9 01 01 01 01 01 00 01 07 00 17 40 01 45 07 00 17 00 47 07 00 17 00 02 FF 00 04 00 0B 07 00 4F 01 01 01 07 00 A9 07 00 A9 01 01 00 00 01 00 00 40 01 4A 07 00 17 00 41 01 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  92     100    103    104    Ljava/lang/RuntimeException;
        //  67     79     82     83     Ljava/lang/RuntimeException;
        //  56     70     73     74     Ljava/lang/RuntimeException;
        //  44     63     66     67     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0067:
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
    
    public static boolean isReady() {
        try {
            try {
                if (getKeyboard() != null) {
                    return true;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            return false;
        }
        catch (RuntimeException ex2) {
            return false;
        }
    }
    
    private static org.powerbot.game.client.input.Keyboard getKeyboard() {
        final int a = Mouse.a;
        final Client client = Context.client();
        Canvas canvas2 = null;
        Label_0060: {
            Label_0037: {
                Canvas canvas = null;
                Label_0021: {
                    Client client2;
                    try {
                        client2 = client;
                        if (a != 0) {
                            break Label_0021;
                        }
                        if (client2 == null) {
                            break Label_0037;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        canvas = (canvas2 = client2.getCanvas());
                        if (a != 0) {
                            break Label_0060;
                        }
                        if (canvas == null) {
                            break Label_0037;
                        }
                        break Label_0037;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (canvas == null) {
                        throw new RuntimeException(HashTable.e(Keyboard.z[0]));
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            canvas2 = client.getCanvas();
        }
        final KeyListener[] keyListeners = canvas2.getKeyListeners();
        Label_0078: {
            KeyListener[] array;
            try {
                final KeyListener[] array2;
                array = (array2 = keyListeners);
                if (a != 0) {
                    return (org.powerbot.game.client.input.Keyboard)array2[0];
                }
                final int n = array.length;
                final int n2 = 1;
                if (n != n2) {
                    break Label_0078;
                }
                break Label_0078;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
            try {
                final int n = array.length;
                final int n2 = 1;
                if (n != n2) {
                    throw new RuntimeException(SkillData.e(Keyboard.z[1]));
                }
            }
            catch (RuntimeException ex5) {
                throw ex5;
            }
        }
        KeyListener[] array2 = keyListeners;
        return (org.powerbot.game.client.input.Keyboard)array2[0];
    }
    
    private static Component getTarget() {
        final int a = Mouse.a;
        final Context value = Context.get();
        Label_0045: {
            RSLoader loader = null;
            Label_0031: {
                Component component = null;
                Label_0023: {
                    RSLoader rsLoader;
                    try {
                        rsLoader = (loader = (RSLoader)(component = value.getLoader()));
                        if (a != 0) {
                            break Label_0031;
                        }
                        if (rsLoader != null) {
                            break Label_0023;
                        }
                        break Label_0045;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (rsLoader == null) {
                            break Label_0045;
                        }
                        component = (loader = value.getLoader());
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    if (a != 0) {
                        return component;
                    }
                    final int n = loader.getComponentCount();
                    if (n == 0) {
                        break Label_0045;
                    }
                    return value.getLoader().getComponent(0);
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                final int n = loader.getComponentCount();
                if (n == 0) {
                    throw new RuntimeException(HashTable.e(Keyboard.z[0]));
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        return value.getLoader().getComponent(0);
    }
    
    private static char getKeyChar(final char p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_1       
        //     4: iload_0        
        //     5: iload_1        
        //     6: ifne            40
        //     9: bipush          36
        //    11: if_icmplt       39
        //    14: goto            18
        //    17: athrow         
        //    18: iload_0        
        //    19: iload_1        
        //    20: ifne            40
        //    23: goto            27
        //    26: athrow         
        //    27: bipush          40
        //    29: if_icmpgt       39
        //    32: goto            36
        //    35: athrow         
        //    36: iconst_0       
        //    37: ireturn        
        //    38: athrow         
        //    39: iload_0        
        //    40: ireturn        
        //    StackMapTable: 00 09 FF 00 11 00 02 01 01 00 01 07 00 17 00 47 07 00 17 40 01 47 07 00 17 00 41 07 00 17 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  27     38     38     39     Ljava/lang/RuntimeException;
        //  18     32     35     36     Ljava/lang/RuntimeException;
        //  9      23     26     27     Ljava/lang/RuntimeException;
        //  4      14     17     18     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
        String s = "/\u0001Q$\u0017\u0001to\u00174l\u001f] \u001d\ftg\u00172l\bN$\u0017\u0001'";
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
                                c2 = '\f';
                                break;
                            }
                            case 1: {
                                c2 = '\u0014';
                                break;
                            }
                            case 2: {
                                c2 = 'x';
                                break;
                            }
                            case 3: {
                                c2 = '8';
                                break;
                            }
                            default: {
                                c2 = '9';
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
                    s = "]'6\u0016a8LP%\u000eX=(\u0003p5A";
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
}
