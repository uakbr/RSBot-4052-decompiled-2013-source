
package org.powerbot.core.bot.handlers;

import org.powerbot.hb;
import org.f;
import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.core.script.job.TaskContainer;
import java.util.EventListener;
import org.powerbot.core.script.job.Job;
import org.powerbot.core.script.job.JobListener;
import org.powerbot.core.script.job.Container;
import org.powerbot.w;
import org.powerbot.core.script.Script;
import org.powerbot.core.event.EventManager;
import java.util.logging.Logger;

public class ScriptHandler
{
    public final Logger log;
    final EventManager eventManager;
    private Script script;
    private w def;
    private Container scriptContainer;
    private Container randomContainer;
    private RandomHandler randomHandler;
    public static boolean a;
    private static final String[] z;
    
    public ScriptHandler(final EventManager eventManager) {
        this.log = Logger.getLogger(ScriptHandler.class.getName());
        this.eventManager = eventManager;
        this.script = null;
    }
    
    public boolean start(final Script script, final w def) {
        Label_0020: {
            boolean b;
            try {
                final boolean active;
                b = (active = this.isActive());
                if (ScriptHandler.a) {
                    return active;
                }
                if (b) {
                    return false;
                }
                break Label_0020;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (b) {
                    return false;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.def = def;
        this.script = script;
        (this.scriptContainer = script.getContainer()).addListener(new JobListener() {
            private boolean stopped = false;
            
            @Override
            public void jobStarted(final Job job) {
                ScriptHandler.this.eventManager.addListener(job);
            }
            
            @Override
            public void jobStopped(final Job p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: getfield        org/powerbot/core/bot/handlers/ScriptHandler$1.this$0:Lorg/powerbot/core/bot/handlers/ScriptHandler;
                //     4: getfield        org/powerbot/core/bot/handlers/ScriptHandler.eventManager:Lorg/powerbot/core/event/EventManager;
                //     7: aload_1        
                //     8: invokeinterface org/powerbot/core/event/EventManager.removeListener:(Ljava/util/EventListener;)V
                //    13: aload_0        
                //    14: getstatic       org/powerbot/core/bot/handlers/ScriptHandler.a:Z
                //    17: ifne            50
                //    20: getfield        org/powerbot/core/bot/handlers/ScriptHandler$1.stopped:Z
                //    23: ifne            45
                //    26: goto            30
                //    29: athrow         
                //    30: aload_1        
                //    31: aload_0        
                //    32: getfield        org/powerbot/core/bot/handlers/ScriptHandler$1.val$script:Lorg/powerbot/core/script/Script;
                //    35: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
                //    38: ifeq            54
                //    41: goto            45
                //    44: athrow         
                //    45: aload_0        
                //    46: goto            50
                //    49: athrow         
                //    50: iconst_1       
                //    51: putfield        org/powerbot/core/bot/handlers/ScriptHandler$1.stopped:Z
                //    54: return         
                //    StackMapTable: 00 07 5D 07 00 39 00 4D 07 00 39 00 43 07 00 39 40 07 00 09 03
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                        
                //  -----  -----  -----  -----  ----------------------------
                //  30     46     49     50     Ljava/lang/RuntimeException;
                //  20     41     44     45     Ljava/lang/RuntimeException;
                //  0      26     29     30     Ljava/lang/RuntimeException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0030:
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
        script.start();
        (this.randomContainer = new TaskContainer()).submit(this.randomHandler = new RandomHandler(this));
        this.track("");
        return true;
    }
    
    public void pause() {
        Script script2 = null;
        Label_0017: {
            Script script;
            try {
                script = (script2 = this.script);
                if (ScriptHandler.a) {
                    break Label_0017;
                }
                if (script != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (script == null) {
                    return;
                }
                script2 = this.script;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        script2.setPaused(true);
        this.track(Deque.e(ScriptHandler.z[2]));
    }
    
    public void resume() {
        Script script2 = null;
        Label_0017: {
            Script script;
            try {
                script = (script2 = this.script);
                if (ScriptHandler.a) {
                    break Label_0017;
                }
                if (script != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (script == null) {
                    return;
                }
                script2 = this.script;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        script2.setPaused(false);
        this.track(f.a(ScriptHandler.z[4]));
    }
    
    public void shutdown() {
        final boolean a = ScriptHandler.a;
        Script script2 = null;
        Label_0047: {
            Script script = null;
            Label_0033: {
                Label_0019: {
                    try {
                        final ScriptHandler scriptHandler = this;
                        if (a) {
                            break Label_0033;
                        }
                        final Container container = this.randomContainer;
                        if (container != null) {
                            break Label_0019;
                        }
                        break Label_0019;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Container container = this.randomContainer;
                        if (container != null) {
                            this.randomContainer.shutdown();
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final ScriptHandler scriptHandler = this;
                try {
                    script = (script2 = scriptHandler.script);
                    if (a) {
                        break Label_0047;
                    }
                    if (script != null) {
                        break Label_0047;
                    }
                    return;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (script == null) {
                    return;
                }
                script2 = this.script;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        script2.shutdown();
        this.track(Deque.e(ScriptHandler.z[0]));
    }
    
    public void stop() {
        final boolean a = ScriptHandler.a;
        Script script2 = null;
        Label_0047: {
            Script script = null;
            Label_0033: {
                Label_0019: {
                    try {
                        final ScriptHandler scriptHandler = this;
                        if (a) {
                            break Label_0033;
                        }
                        final Container container = this.randomContainer;
                        if (container != null) {
                            break Label_0019;
                        }
                        break Label_0019;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final Container container = this.randomContainer;
                        if (container != null) {
                            this.randomContainer.shutdown();
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                final ScriptHandler scriptHandler = this;
                try {
                    script = (script2 = scriptHandler.script);
                    if (a) {
                        break Label_0047;
                    }
                    if (script != null) {
                        break Label_0047;
                    }
                    return;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (script == null) {
                    return;
                }
                script2 = this.script;
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        script2.stop();
        this.track(f.a(ScriptHandler.z[3]));
    }
    
    public boolean isPaused() {
        final boolean a = ScriptHandler.a;
        boolean paused = false;
        Label_0047: {
            Label_0027: {
                Script script2 = null;
                Label_0019: {
                    Script script;
                    try {
                        script = (script2 = this.script);
                        if (a) {
                            break Label_0027;
                        }
                        if (script != null) {
                            break Label_0019;
                        }
                        break Label_0047;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (script == null) {
                            break Label_0047;
                        }
                        script2 = this.script;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    paused = script2.isPaused();
                    if (a) {
                        return paused;
                    }
                    if (!paused) {
                        break Label_0047;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return paused;
        }
        return paused;
    }
    
    public boolean isActive() {
        final boolean a = ScriptHandler.a;
        boolean active = false;
        Label_0047: {
            Label_0027: {
                Script script2 = null;
                Label_0019: {
                    Script script;
                    try {
                        script = (script2 = this.script);
                        if (a) {
                            break Label_0027;
                        }
                        if (script != null) {
                            break Label_0019;
                        }
                        break Label_0047;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (script == null) {
                            break Label_0047;
                        }
                        script2 = this.script;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    active = script2.isActive();
                    if (a) {
                        return active;
                    }
                    if (!active) {
                        break Label_0047;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return active;
        }
        return active;
    }
    
    public boolean isShutdown() {
        final boolean a = ScriptHandler.a;
        boolean shutdown = false;
        Label_0047: {
            Label_0027: {
                Script script2 = null;
                Label_0019: {
                    Script script;
                    try {
                        script = (script2 = this.script);
                        if (a) {
                            break Label_0027;
                        }
                        if (script != null) {
                            break Label_0019;
                        }
                        break Label_0047;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (script == null) {
                            break Label_0047;
                        }
                        script2 = this.script;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    shutdown = script2.isShutdown();
                    if (a) {
                        return shutdown;
                    }
                    if (!shutdown) {
                        break Label_0047;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            return shutdown;
        }
        return shutdown;
    }
    
    public w getDefinition() {
        return this.def;
    }
    
    public RandomHandler getRandomHandler() {
        return this.randomHandler;
    }
    
    public Container getScriptContainer() {
        return this.scriptContainer;
    }
    
    private void track(final String s) {
        final boolean a = ScriptHandler.a;
        String s4 = null;
        Label_0140: {
            Label_0111: {
                Label_0099: {
                    String a2 = null;
                    Label_0088: {
                        String s3 = null;
                        Label_0074: {
                            Label_0063: {
                                String s2 = null;
                                Label_0049: {
                                    w w2 = null;
                                    Label_0041: {
                                        w def = null;
                                        Label_0027: {
                                            Label_0019: {
                                                w w;
                                                try {
                                                    w = (def = (w2 = this.def));
                                                    if (a) {
                                                        break Label_0027;
                                                    }
                                                    if (w != null) {
                                                        break Label_0019;
                                                    }
                                                    return;
                                                }
                                                catch (RuntimeException ex) {
                                                    throw ex;
                                                }
                                                try {
                                                    if (w == null) {
                                                        return;
                                                    }
                                                    w2 = (def = this.def);
                                                }
                                                catch (RuntimeException ex2) {
                                                    throw ex2;
                                                }
                                            }
                                            try {
                                                if (a) {
                                                    break Label_0049;
                                                }
                                                final boolean b = def.j;
                                                if (!b) {
                                                    break Label_0041;
                                                }
                                                return;
                                            }
                                            catch (RuntimeException ex3) {
                                                throw ex3;
                                            }
                                        }
                                        try {
                                            final boolean b = def.j;
                                            if (b) {
                                                return;
                                            }
                                            w2 = this.def;
                                        }
                                        catch (RuntimeException ex4) {
                                            throw ex4;
                                        }
                                    }
                                    try {
                                        s2 = (s3 = (a2 = (s4 = w2.b())));
                                        if (a) {
                                            break Label_0074;
                                        }
                                        if (s2 != null) {
                                            break Label_0063;
                                        }
                                        return;
                                    }
                                    catch (RuntimeException ex5) {
                                        throw ex5;
                                    }
                                }
                                try {
                                    if (s2 == null) {
                                        return;
                                    }
                                    a2 = (s3 = (s4 = this.def.b()));
                                }
                                catch (RuntimeException ex6) {
                                    throw ex6;
                                }
                            }
                            try {
                                if (a) {
                                    break Label_0099;
                                }
                                final boolean b2 = s3.isEmpty();
                                if (!b2) {
                                    break Label_0088;
                                }
                                return;
                            }
                            catch (RuntimeException ex7) {
                                throw ex7;
                            }
                        }
                        try {
                            final boolean b2 = s3.isEmpty();
                            if (b2) {
                                return;
                            }
                            s4 = (a2 = this.def.a());
                        }
                        catch (RuntimeException ex8) {
                            throw ex8;
                        }
                    }
                    try {
                        if (a) {
                            break Label_0140;
                        }
                        if (a2 != null) {
                            break Label_0111;
                        }
                    }
                    catch (RuntimeException ex9) {
                        throw ex9;
                    }
                }
                return;
            }
            s4 = String.format(Deque.e(ScriptHandler.z[1]), this.def.b(), s);
        }
        hb.a().b(s4, this.def.a());
    }
    
    public static String e(final String s) {
        final int n = 5 << 4 ^ (0x2 ^ 0x5) << 1;
        final int n2 = 5 << 4 ^ (3 << 2 ^ 0x3);
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int i = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            i = n3;
        }
        return new String(value);
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "5,E\u001c";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0146: {
                    if (n7 > 1) {
                        break Label_0146;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'A';
                                break;
                            }
                            case 1: {
                                c2 = 't';
                                break;
                            }
                            case 2: {
                                c2 = '-';
                                break;
                            }
                            case 3: {
                                c2 = '@';
                                break;
                            }
                            default: {
                                c2 = 'u';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "\u001e\u0010s.)2+\u0005I\u0001BVr";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "\u001d\u0012t4<";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "\u0014W\u007ff";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\r[`\u007f&n";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
    }
}
