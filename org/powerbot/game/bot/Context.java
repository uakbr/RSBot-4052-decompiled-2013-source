
package org.powerbot.game.bot;

import java.util.HashMap;
import org.powerbot.v;
import org.powerbot.core.bot.RSLoader;
import org.powerbot.core.event.EventManager;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.core.bot.handlers.ScriptHandler;
import java.awt.image.BufferedImage;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.client.Client;
import org.powerbot.core.Bot;
import java.util.Map;

public class Context
{
    public static final Map<ThreadGroup, Context> context;
    private final Bot bot;
    public int world;
    public static int a;
    private static final String z;
    
    public Context(final Bot bot) {
        this.world = -1;
        this.bot = bot;
    }
    
    @Deprecated
    public static Context get() {
        return Bot.context();
    }
    
    public static Bot resolve() {
        return get().bot;
    }
    
    @Deprecated
    public static Client client() {
        return Bot.client();
    }
    
    @Deprecated
    public static Constants constants() {
        return Bot.constants();
    }
    
    public static BufferedImage captureScreen() {
        return b.b(get());
    }
    
    public static BufferedImage getScreenBuffer() {
        return b.c(get());
    }
    
    public static void saveScreenCapture() {
        b.a(get());
    }
    
    public static void setLoginWorld(final int world) {
        get().world = world;
    }
    
    public static void cancelMouse() {
        get().bot.getMouseExecutor().b();
    }
    
    public static void saveScreenCapture(final String s) {
        b.a(get(), s);
    }
    
    public Bot getBot() {
        return this.bot;
    }
    
    public ScriptHandler getScriptHandler() {
        return this.bot.getScriptHandler();
    }
    
    @Deprecated
    public Client getClient() {
        return Bot.client();
    }
    
    public a getExecutor() {
        return this.bot.getMouseExecutor();
    }
    
    public BufferedImage getImage() {
        return this.bot.getImage();
    }
    
    public BufferedImage getBuffer() {
        return this.bot.getBuffer();
    }
    
    public EventManager getEventManager() {
        return this.bot.getEventManager();
    }
    
    public ThreadGroup getThreadGroup() {
        return this.bot.threadGroup;
    }
    
    public RSLoader getLoader() {
        return this.bot.appletContainer;
    }
    
    public String getDisplayName() {
        v v2 = null;
        Label_0019: {
            v v;
            try {
                v = (v2 = org.powerbot.v.a());
                if (Context.a != 0) {
                    return v2.c().e();
                }
                final boolean b = v.b();
                if (b) {
                    break Label_0019;
                }
                return null;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = v.b();
                if (!b) {
                    return null;
                }
                v2 = org.powerbot.v.a();
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return v2.c().e();
    }
    
    public int getUserId() {
        try {
            if (v.a().b()) {
                return v.a().c().b();
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return -1;
    }
    
    public void associate(final ThreadGroup p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_2        
        //     5: ifne            68
        //     8: invokestatic    java/awt/EventQueue.isDispatchThread:()Z
        //    11: ifne            57
        //    14: goto            18
        //    17: athrow         
        //    18: getstatic       org/powerbot/game/bot/Context.context:Ljava/util/Map;
        //    21: aload_1        
        //    22: iload_2        
        //    23: ifne            61
        //    26: goto            30
        //    29: athrow         
        //    30: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //    35: ifeq            57
        //    38: goto            42
        //    41: athrow         
        //    42: new             Ljava/lang/RuntimeException;
        //    45: dup            
        //    46: getstatic       org/powerbot/game/bot/Context.z:Ljava/lang/String;
        //    49: invokestatic    org/o.a:(Ljava/lang/String;)Ljava/lang/String;
        //    52: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;)V
        //    55: athrow         
        //    56: athrow         
        //    57: getstatic       org/powerbot/game/bot/Context.context:Ljava/util/Map;
        //    60: aload_1        
        //    61: aload_0        
        //    62: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    67: pop            
        //    68: getstatic       org/powerbot/core/script/job/Task.a:I
        //    71: ifeq            85
        //    74: iinc            2, 1
        //    77: iload_2        
        //    78: putstatic       org/powerbot/game/bot/Context.a:I
        //    81: goto            85
        //    84: athrow         
        //    85: return         
        //    StackMapTable: 00 0C FF 00 11 00 03 07 00 22 07 00 BF 01 00 01 07 00 1C 00 4A 07 00 1C FF 00 00 00 03 07 00 22 07 00 BF 01 00 02 07 00 79 07 00 BF 4A 07 00 1C 00 4D 07 00 1C 00 FF 00 03 00 03 07 00 22 07 00 BF 01 00 02 07 00 79 07 00 BF 06 4F 07 00 1C 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  68     81     84     85     Ljava/lang/RuntimeException;
        //  30     56     56     57     Ljava/lang/RuntimeException;
        //  18     38     41     42     Ljava/lang/RuntimeException;
        //  8      26     29     30     Ljava/lang/RuntimeException;
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
    
    public void disregard(final ThreadGroup threadGroup) {
        Context.context.remove(threadGroup);
    }
    
    static {
        final char[] charArray = "$EV\u0004\u00139PP\f\u0002,\u0013G\u001e\r=ADE\u000b9\\F\u0006\fy".toCharArray();
        int length;
        int n2;
        final int n = n2 = (length = charArray.length);
        int n3 = 0;
        while (true) {
            Label_0102: {
                if (n > 1) {
                    break Label_0102;
                }
                length = (n2 = n3);
                do {
                    final char c = charArray[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = '\u000b';
                            break;
                        }
                        case 1: {
                            c2 = '`';
                            break;
                        }
                        case 2: {
                            c2 = 's';
                            break;
                        }
                        case 3: {
                            c2 = '%';
                            break;
                        }
                        default: {
                            c2 = '?';
                            break;
                        }
                    }
                    charArray[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                z = new String(charArray).intern();
                context = new HashMap<ThreadGroup, Context>();
                return;
            }
            continue;
        }
    }
}
