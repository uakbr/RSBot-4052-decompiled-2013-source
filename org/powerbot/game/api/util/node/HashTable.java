
package org.powerbot.game.api.util.node;

import org.powerbot.game.client.Node;

public class HashTable
{
    private org.powerbot.game.client.HashTable nc;
    private Node current;
    private int c_index;
    
    public HashTable(final org.powerbot.game.client.HashTable nc) {
        this.c_index = 0;
        this.nc = nc;
    }
    
    public Node getFirst() {
        this.c_index = 0;
        return this.getNext();
    }
    
    public Node getNext() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: aload_0        
        //     5: getfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //     8: iload_2        
        //     9: ifne            75
        //    12: ifle            71
        //    15: goto            19
        //    18: athrow         
        //    19: aload_0        
        //    20: iload_2        
        //    21: ifne            72
        //    24: goto            28
        //    27: athrow         
        //    28: getfield        org/powerbot/game/api/util/node/HashTable.nc:Lorg/powerbot/game/client/HashTable;
        //    31: invokeinterface org/powerbot/game/client/HashTable.getBuckets:()[Lorg/powerbot/game/client/Node;
        //    36: aload_0        
        //    37: getfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //    40: iconst_1       
        //    41: isub           
        //    42: aaload         
        //    43: aload_0        
        //    44: getfield        org/powerbot/game/api/util/node/HashTable.current:Lorg/powerbot/game/client/Node;
        //    47: if_acmpeq       71
        //    50: goto            54
        //    53: athrow         
        //    54: aload_0        
        //    55: getfield        org/powerbot/game/api/util/node/HashTable.current:Lorg/powerbot/game/client/Node;
        //    58: astore_1       
        //    59: aload_0        
        //    60: aload_1        
        //    61: invokeinterface org/powerbot/game/client/Node.getNext:()Lorg/powerbot/game/client/Node;
        //    66: putfield        org/powerbot/game/api/util/node/HashTable.current:Lorg/powerbot/game/client/Node;
        //    69: aload_1        
        //    70: areturn        
        //    71: aload_0        
        //    72: getfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //    75: aload_0        
        //    76: getfield        org/powerbot/game/api/util/node/HashTable.nc:Lorg/powerbot/game/client/HashTable;
        //    79: invokeinterface org/powerbot/game/client/HashTable.getBuckets:()[Lorg/powerbot/game/client/Node;
        //    84: arraylength    
        //    85: if_icmpge       163
        //    88: aload_0        
        //    89: getfield        org/powerbot/game/api/util/node/HashTable.nc:Lorg/powerbot/game/client/HashTable;
        //    92: invokeinterface org/powerbot/game/client/HashTable.getBuckets:()[Lorg/powerbot/game/client/Node;
        //    97: aload_0        
        //    98: dup            
        //    99: getfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //   102: dup_x1         
        //   103: iconst_1       
        //   104: iadd           
        //   105: putfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //   108: aaload         
        //   109: invokeinterface org/powerbot/game/client/Node.getNext:()Lorg/powerbot/game/client/Node;
        //   114: astore_1       
        //   115: aload_0        
        //   116: getfield        org/powerbot/game/api/util/node/HashTable.nc:Lorg/powerbot/game/client/HashTable;
        //   119: invokeinterface org/powerbot/game/client/HashTable.getBuckets:()[Lorg/powerbot/game/client/Node;
        //   124: aload_0        
        //   125: getfield        org/powerbot/game/api/util/node/HashTable.c_index:I
        //   128: iconst_1       
        //   129: isub           
        //   130: aaload         
        //   131: iload_2        
        //   132: ifne            158
        //   135: aload_1        
        //   136: if_acmpeq       159
        //   139: goto            143
        //   142: athrow         
        //   143: aload_0        
        //   144: aload_1        
        //   145: invokeinterface org/powerbot/game/client/Node.getNext:()Lorg/powerbot/game/client/Node;
        //   150: putfield        org/powerbot/game/api/util/node/HashTable.current:Lorg/powerbot/game/client/Node;
        //   153: aload_1        
        //   154: goto            158
        //   157: athrow         
        //   158: areturn        
        //   159: iload_2        
        //   160: ifeq            71
        //   163: aconst_null    
        //   164: areturn        
        //    StackMapTable: 00 0F FF 00 12 00 03 07 00 08 00 01 00 01 07 00 3B 00 47 07 00 3B 40 07 00 08 58 07 00 3B 00 10 40 07 00 08 42 01 FF 00 42 00 03 07 00 08 07 00 1D 01 00 01 07 00 3B 00 4D 07 00 3B 40 07 00 1D 00 FF 00 03 00 03 07 00 08 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  135    154    157    158    Ljava/lang/RuntimeException;
        //  115    139    142    143    Ljava/lang/RuntimeException;
        //  19     50     53     54     Ljava/lang/RuntimeException;
        //  12     24     27     28     Ljava/lang/RuntimeException;
        //  4      15     18     19     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0019:
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
    
    public static String e(final String s) {
        final int n = 4;
        final int n2 = n << n;
        final int n3 = (0x2 ^ 0x5) << 4;
        final int n4 = 2;
        final int n5 = n3 ^ (n4 << n4 ^ 0x1);
        final int length = s.length();
        final char[] array = new char[length];
        int n6;
        int i = n6 = length - 1;
        final char[] value = array;
        final char c = (char)n5;
        final int n7 = n2;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n6;
            final char char1 = s.charAt(index);
            --n6;
            array2[index] = (char)(char1 ^ n7);
            if (n6 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n6;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n6;
            array3[index2] = c2;
            i = n6;
        }
        return new String(value);
    }
}
