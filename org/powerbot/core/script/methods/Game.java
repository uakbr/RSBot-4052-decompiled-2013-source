
package org.powerbot.core.script.methods;

import org.powerbot.game.client.BaseInfo;
import org.powerbot.game.client.RSInfo;
import org.powerbot.core.script.wrappers.Tile;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.client.Client;
import org.powerbot.core.Bot;

public class Game
{
    public static final int INDEX_LOGIN_SCREEN = 3;
    public static final int INDEX_LOBBY_SCREEN = 7;
    public static final int INDEX_LOGGING_IN = 9;
    public static final int INDEX_MAP_LOADED = 11;
    public static final int INDEX_MAP_LOADING = 12;
    public static final int[] INDEX_LOGGED_IN;
    
    public static int getClientState() {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        try {
            if (client == null) {
                return -1;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        final Constants constants = Bot.constants();
        final int loginIndex = client.getLoginIndex();
        Label_0118: {
            int n5 = 0;
            int n9 = 0;
            Label_0105: {
                int n4 = 0;
                int clientstate_11 = 0;
                Label_0090: {
                    Label_0085: {
                        int n3 = 0;
                        int n8 = 0;
                        Label_0070: {
                            Label_0065: {
                                int n2 = 0;
                                int n7 = 0;
                                Label_0050: {
                                    Label_0045: {
                                        int n;
                                        int n6;
                                        try {
                                            n = (n2 = (n3 = (n4 = (n5 = loginIndex))));
                                            n6 = (n7 = (n8 = (clientstate_11 = (n9 = constants.CLIENTSTATE_3))));
                                            if (a) {
                                                break Label_0050;
                                            }
                                            if (n == n6) {
                                                return 3;
                                            }
                                            break Label_0045;
                                        }
                                        catch (RuntimeException ex2) {
                                            throw ex2;
                                        }
                                        try {
                                            if (n == n6) {
                                                return 3;
                                            }
                                        }
                                        catch (RuntimeException ex3) {
                                            throw ex3;
                                        }
                                    }
                                    n3 = (n2 = (n4 = (n5 = loginIndex)));
                                    n8 = (n7 = (clientstate_11 = (n9 = constants.CLIENTSTATE_7)));
                                    try {
                                        if (a) {
                                            break Label_0070;
                                        }
                                        if (n2 == n7) {
                                            return 7;
                                        }
                                        break Label_0065;
                                    }
                                    catch (RuntimeException ex4) {
                                        throw ex4;
                                    }
                                }
                                try {
                                    if (n2 == n7) {
                                        return 7;
                                    }
                                }
                                catch (RuntimeException ex5) {
                                    throw ex5;
                                }
                            }
                            n4 = (n3 = (n5 = loginIndex));
                            clientstate_11 = (n8 = (n9 = constants.CLIENTSTATE_9));
                            try {
                                if (a) {
                                    break Label_0090;
                                }
                                if (n3 == n8) {
                                    return 9;
                                }
                                break Label_0085;
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                        }
                        try {
                            if (n3 == n8) {
                                return 9;
                            }
                        }
                        catch (RuntimeException ex7) {
                            throw ex7;
                        }
                    }
                    n5 = (n4 = loginIndex);
                    n9 = (clientstate_11 = constants.CLIENTSTATE_11);
                    try {
                        if (a) {
                            break Label_0118;
                        }
                        if (n4 == clientstate_11) {
                            return 11;
                        }
                        break Label_0105;
                    }
                    catch (RuntimeException ex8) {
                        throw ex8;
                    }
                }
                try {
                    if (n4 == clientstate_11) {
                        return 11;
                    }
                }
                catch (RuntimeException ex9) {
                    throw ex9;
                }
                try {
                    final int n10 = n5 = loginIndex;
                    if (a) {
                        return n10;
                    }
                    n9 = constants.CLIENTSTATE_12;
                }
                catch (RuntimeException ex10) {
                    throw ex10;
                }
            }
            try {
                if (n5 == n9) {
                    return 12;
                }
            }
            catch (RuntimeException ex11) {
                throw ex11;
            }
        }
        return -1;
    }
    
    public static boolean isLoggedIn() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/core/script/methods/Game.getClientState:()I
        //     8: istore_0       
        //     9: getstatic       org/powerbot/core/script/methods/Game.INDEX_LOGGED_IN:[I
        //    12: astore_1       
        //    13: aload_1        
        //    14: arraylength    
        //    15: istore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_2        
        //    20: if_icmpge       63
        //    23: aload_1        
        //    24: iload_3        
        //    25: iaload         
        //    26: istore          4
        //    28: iload           5
        //    30: ifne            58
        //    33: iload           4
        //    35: iload           5
        //    37: ifne            64
        //    40: goto            44
        //    43: athrow         
        //    44: iload_0        
        //    45: if_icmpne       55
        //    48: goto            52
        //    51: athrow         
        //    52: iconst_1       
        //    53: ireturn        
        //    54: athrow         
        //    55: iinc            3, 1
        //    58: iload           5
        //    60: ifeq            18
        //    63: iconst_0       
        //    64: ireturn        
        //    StackMapTable: 00 0A FF 00 12 00 06 01 07 00 67 01 01 00 01 00 00 FF 00 18 00 06 01 07 00 67 01 01 01 01 00 01 07 00 64 40 01 46 07 00 64 00 41 07 00 64 00 02 FF 00 04 00 06 01 07 00 67 01 01 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  44     54     54     55     Ljava/lang/RuntimeException;
        //  33     48     51     52     Ljava/lang/RuntimeException;
        //  28     40     43     44     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0044:
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
    
    public static Tile getMapBase() {
        final boolean a = Calculations.a;
        final Client client = Bot.client();
        Client client3 = null;
        Label_0024: {
            Label_0020: {
                Client client2;
                try {
                    client2 = (client3 = client);
                    if (a) {
                        break Label_0024;
                    }
                    if (client2 == null) {
                        break Label_0020;
                    }
                    break Label_0020;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (client2 == null) {
                        return null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            client3 = client;
        }
        final RSInfo rsGroundInfo = client3.getRSGroundInfo();
        BaseInfo baseInfo = null;
        Label_0052: {
            Label_0051: {
                RSInfo rsInfo = null;
                Label_0043: {
                    try {
                        rsInfo = rsGroundInfo;
                        if (a) {
                            break Label_0043;
                        }
                        if (rsInfo == null) {
                            break Label_0051;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                baseInfo = rsInfo.getBaseInfo();
                break Label_0052;
            }
            baseInfo = null;
        }
        final BaseInfo baseInfo2 = baseInfo;
        try {
            if (baseInfo2 != null) {
                return new Tile(baseInfo2.getX(), baseInfo2.getY(), client.getPlane());
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
        return null;
    }
    
    public static int getPlane() {
        final Client client = Bot.client();
        Label_0021: {
            Client client2;
            try {
                final Client client3;
                client2 = (client3 = client);
                if (Calculations.a) {
                    return client3.getPlane();
                }
                if (client2 == null) {
                    return -1;
                }
                break Label_0021;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (client2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        Client client3 = client;
        return client3.getPlane();
    }
    
    static {
        INDEX_LOGGED_IN = new int[] { 11, 12 };
    }
}
