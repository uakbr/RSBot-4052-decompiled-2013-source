
package org.powerbot.game.api.methods.input;

import org.o;
import java.util.HashMap;
import org.powerbot.game.api.methods.Calculations;
import java.awt.Rectangle;
import org.powerbot.core.bot.RSLoader;
import org.powerbot.game.client.Client;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.game.bot.handler.input.util.MouseNode;
import org.powerbot.game.bot.Context;
import org.powerbot.game.api.util.Filter;
import org.powerbot.game.api.wrappers.ViewportEntity;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.util.Random;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.Point;
import org.powerbot.core.Bot;
import java.util.Map;

public class Mouse
{
    private static final Map<ThreadGroup, Integer> dragLengths;
    private static final Map<ThreadGroup, Integer> sides;
    public static int a;
    
    public static void setSpeed(final Speed speed) {
        Bot.setSpeed(speed);
    }
    
    public static int getX() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        Label_0018: {
            org.powerbot.game.client.input.Mouse mouse2;
            try {
                final org.powerbot.game.client.input.Mouse mouse3;
                mouse2 = (mouse3 = mouse);
                if (Mouse.a != 0) {
                    return mouse3.getX();
                }
                if (mouse2 == null) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouse2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        org.powerbot.game.client.input.Mouse mouse3 = mouse;
        return mouse3.getX();
    }
    
    public static int getY() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        Label_0018: {
            org.powerbot.game.client.input.Mouse mouse2;
            try {
                final org.powerbot.game.client.input.Mouse mouse3;
                mouse2 = (mouse3 = mouse);
                if (Mouse.a != 0) {
                    return mouse3.getY();
                }
                if (mouse2 == null) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouse2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        org.powerbot.game.client.input.Mouse mouse3 = mouse;
        return mouse3.getY();
    }
    
    public static Point getLocation() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        try {
            if (mouse == null) {
                return new Point(-1, -1);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return new Point(mouse.getX(), mouse.getY());
    }
    
    public static int getPressX() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        Label_0018: {
            org.powerbot.game.client.input.Mouse mouse2;
            try {
                final org.powerbot.game.client.input.Mouse mouse3;
                mouse2 = (mouse3 = mouse);
                if (Mouse.a != 0) {
                    return mouse3.getPressX();
                }
                if (mouse2 == null) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouse2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        org.powerbot.game.client.input.Mouse mouse3 = mouse;
        return mouse3.getPressX();
    }
    
    public static int getPressY() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        Label_0018: {
            org.powerbot.game.client.input.Mouse mouse2;
            try {
                final org.powerbot.game.client.input.Mouse mouse3;
                mouse2 = (mouse3 = mouse);
                if (Mouse.a != 0) {
                    return mouse3.getPressY();
                }
                if (mouse2 == null) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouse2 == null) {
                    return -1;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        org.powerbot.game.client.input.Mouse mouse3 = mouse;
        return mouse3.getPressY();
    }
    
    public static long getPressTime() {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        Label_0018: {
            org.powerbot.game.client.input.Mouse mouse2;
            try {
                final org.powerbot.game.client.input.Mouse mouse3;
                mouse2 = (mouse3 = mouse);
                if (Mouse.a != 0) {
                    return mouse3.getPressTime();
                }
                if (mouse2 == null) {
                    break Label_0018;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (mouse2 == null) {
                    return -1L;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        org.powerbot.game.client.input.Mouse mouse3 = mouse;
        return mouse3.getPressTime();
    }
    
    public static boolean isPresent() {
        final int a = Mouse.a;
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        boolean present = false;
        Label_0039: {
            Label_0021: {
                org.powerbot.game.client.input.Mouse mouse2;
                try {
                    mouse2 = mouse;
                    if (a != 0) {
                        break Label_0021;
                    }
                    if (mouse2 == null) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    present = mouse2.isPresent();
                    if (a != 0) {
                        return present;
                    }
                    if (!present) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return present;
        }
        return present;
    }
    
    public static boolean isPressed() {
        final int a = Mouse.a;
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        boolean pressed = false;
        Label_0039: {
            Label_0021: {
                org.powerbot.game.client.input.Mouse mouse2;
                try {
                    mouse2 = mouse;
                    if (a != 0) {
                        break Label_0021;
                    }
                    if (mouse2 == null) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    pressed = mouse2.isPressed();
                    if (a != 0) {
                        return pressed;
                    }
                    if (!pressed) {
                        break Label_0039;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            return pressed;
        }
        return pressed;
    }
    
    public static void scroll(final boolean b) {
        scroll(b, 0);
    }
    
    public static void scroll(final boolean b, final int n) {
        final org.powerbot.game.client.input.Mouse mouse = getMouse();
        final Component target = getTarget();
        org.powerbot.game.client.input.Mouse mouse2 = null;
        Component source = null;
        int id = 0;
        long when = 0L;
        int modifiers = 0;
        int x = 0;
        int y = 0;
        int clickCount = 0;
        boolean popupTrigger = false;
        int scrollType = 0;
        int scrollAmount = 0;
        int wheelRotation = 0;
        Label_0059: {
            Label_0022: {
                try {
                    if (mouse == null) {
                        return;
                    }
                    final Component component = target;
                    if (component == null) {
                        return;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final Component component = target;
                    if (component == null) {
                        return;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                try {
                    mouse2 = mouse;
                    source = target;
                    id = 507;
                    when = System.currentTimeMillis() + n;
                    modifiers = 0;
                    x = getX();
                    y = getY();
                    clickCount = 0;
                    popupTrigger = false;
                    scrollType = 0;
                    scrollAmount = 3;
                    if (b) {
                        wheelRotation = 3;
                        break Label_0059;
                    }
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            wheelRotation = -3;
        }
        mouse2.sendEvent(new MouseWheelEvent(source, id, when, modifiers, x, y, clickCount, popupTrigger, scrollType, scrollAmount, wheelRotation));
    }
    
    public static boolean click(final boolean b) {
        int n2 = 0;
        Label_0022: {
            Label_0019: {
                int n;
                try {
                    n = (n2 = (isPresent() ? 1 : 0));
                    if (Mouse.a != 0) {
                        break Label_0022;
                    }
                    if (n == 0) {
                        return false;
                    }
                    break Label_0019;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n == 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            n2 = getX();
        }
        final int n3 = n2;
        final int y = getY();
        pressMouse(n3, y, b);
        Task.sleep(Random.nextInt(50, 150));
        releaseMouse(n3, y, b);
        Task.sleep(Random.nextInt(50, 80));
        return true;
    }
    
    public static boolean click(final Point point, final boolean b) {
        return click(point.x, point.y, b);
    }
    
    public static boolean click(final int n, final int n2, final boolean b) {
        Label_0018: {
            boolean b2;
            try {
                final boolean move;
                b2 = (move = move(n, n2));
                if (Mouse.a != 0) {
                    return move;
                }
                if (b2) {
                    break Label_0018;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (b2) {
                    click(b);
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public static void hold(final int n, final boolean b) {
        int n3 = 0;
        Label_0020: {
            Label_0017: {
                try {
                    final int n2 = n3 = (isPresent() ? 1 : 0);
                    if (Mouse.a != 0) {
                        break Label_0020;
                    }
                    if (n2 != 0) {
                        break Label_0017;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return;
            }
            n3 = getX();
        }
        final int n4 = n3;
        final int y = getY();
        pressMouse(n4, y, b);
        Task.sleep(n);
        releaseMouse(n4, y, b);
        Task.sleep(Random.nextInt(50, 80));
    }
    
    public static void hop(final int n, final int n2) {
        hop(n, n2, 0, 0);
    }
    
    public static void hop(final int n, final int n2, final int n3, final int n4) {
        moveMouse(n + Random.nextGaussian(-n3, n3, n3), n2 + Random.nextGaussian(-n4, n4, n4));
    }
    
    public static boolean move(final int n, final int n2) {
        return move(n, n2, 1, 1);
    }
    
    public static boolean move(final Point point) {
        return move(point.x, point.y, 1, 1);
    }
    
    public static void drag(final Point point) {
        drag(point.x, point.y);
    }
    
    public static void drag(final int n, final int n2) {
        drag(n, n2, 1, 1);
    }
    
    public static void drag(final Point point, final int n, final int n2) {
        drag(point.x, point.y, n, n2);
    }
    
    public static void drag(final int n, final int n2, final int n3, final int n4) {
        int present = 0;
        Label_0060: {
            Label_0017: {
                try {
                    present = (isPresent() ? 1 : 0);
                    if (Mouse.a != 0) {
                        break Label_0060;
                    }
                    if (present != 0) {
                        break Label_0017;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                return;
            }
            pressMouse(getX(), getY(), true);
            Task.sleep(Random.nextInt(10, 400));
            move(n, n2, n3, n4);
            Task.sleep(Random.nextInt(10, 400));
            getX();
        }
        releaseMouse(present, getY(), true);
    }
    
    public static boolean move(final int p0, final int p1, final int p2, final int p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          6
        //     5: invokestatic    org/powerbot/game/bot/Context.get:()Lorg/powerbot/game/bot/Context;
        //     8: invokevirtual   org/powerbot/game/bot/Context.getExecutor:()Lorg/powerbot/game/bot/handler/input/a;
        //    11: astore          4
        //    13: iload_0        
        //    14: iload_1        
        //    15: iload_2        
        //    16: iload_3        
        //    17: iconst_0       
        //    18: iconst_0       
        //    19: invokestatic    org/powerbot/game/api/methods/input/Mouse.create:(IIIIZZ)Lorg/powerbot/game/bot/handler/input/util/MouseNode;
        //    22: astore          5
        //    24: aload           5
        //    26: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.a:()Lorg/powerbot/game/api/util/Timer;
        //    29: invokevirtual   org/powerbot/game/api/util/Timer.isRunning:()Z
        //    32: ifeq            77
        //    35: aload           5
        //    37: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.k:()Z
        //    40: iload           6
        //    42: ifne            82
        //    45: iload           6
        //    47: ifne            82
        //    50: goto            54
        //    53: athrow         
        //    54: ifeq            77
        //    57: goto            61
        //    60: athrow         
        //    61: aload           4
        //    63: aload           5
        //    65: invokevirtual   org/powerbot/game/bot/handler/input/a.a:(Lorg/powerbot/game/bot/handler/input/util/MouseNode;)V
        //    68: iload           6
        //    70: ifeq            24
        //    73: goto            77
        //    76: athrow         
        //    77: aload           5
        //    79: invokevirtual   org/powerbot/game/bot/handler/input/util/MouseNode.e:()Z
        //    82: ireturn        
        //    StackMapTable: 00 08 FE 00 18 07 00 C4 07 00 2F 01 5C 07 01 34 40 01 45 07 01 34 00 4E 07 01 34 00 44 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  54     73     76     77     Ljava/lang/RuntimeException;
        //  45     57     60     61     Ljava/lang/RuntimeException;
        //  35     50     53     54     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0054:
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
    
    public static boolean move(final Point point, final int n, final int n2) {
        return move(point.x, point.y, n, n2);
    }
    
    public static boolean apply(final ViewportEntity viewportEntity, final Filter<Point> filter) {
        final int a = Mouse.a;
        final a executor = Context.get().getExecutor();
        final MouseNode mouseNode = new MouseNode(viewportEntity, filter);
        try {
            while (mouseNode.a().isRunning()) {
                Label_0048: {
                    boolean b;
                    try {
                        final boolean b2;
                        b = (b2 = mouseNode.k());
                        if (a != 0) {
                            return b2;
                        }
                        if (b) {
                            break Label_0048;
                        }
                        break;
                    }
                    catch (Exception ex) {
                        throw ex;
                    }
                    try {
                        if (b) {
                            executor.a(mouseNode);
                            if (a == 0) {
                                continue;
                            }
                        }
                    }
                    catch (Exception ex2) {
                        throw ex2;
                    }
                }
                break;
            }
        }
        catch (Exception ex3) {
            ex3.printStackTrace();
        }
        return mouseNode.e();
    }
    
    private static void pressMouse(final int p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/input/Mouse.getMouse:()Lorg/powerbot/game/client/input/Mouse;
        //     8: astore_3       
        //     9: invokestatic    org/powerbot/game/api/methods/input/Mouse.getTarget:()Ljava/awt/Component;
        //    12: astore          4
        //    14: aload_3        
        //    15: ifnull          67
        //    18: aload           4
        //    20: ifnull          67
        //    23: goto            27
        //    26: athrow         
        //    27: aload_3        
        //    28: invokevirtual   org/powerbot/game/client/input/Mouse.isPressed:()Z
        //    31: iload           5
        //    33: ifne            64
        //    36: goto            40
        //    39: athrow         
        //    40: ifne            67
        //    43: goto            47
        //    46: athrow         
        //    47: aload_3        
        //    48: iload           5
        //    50: ifne            69
        //    53: goto            57
        //    56: athrow         
        //    57: invokevirtual   org/powerbot/game/client/input/Mouse.isPresent:()Z
        //    60: goto            64
        //    63: athrow         
        //    64: ifne            68
        //    67: return         
        //    68: aload_3        
        //    69: new             Ljava/awt/event/MouseEvent;
        //    72: dup            
        //    73: aload           4
        //    75: sipush          501
        //    78: invokestatic    java/lang/System.currentTimeMillis:()J
        //    81: iconst_0       
        //    82: iload_0        
        //    83: iload_1        
        //    84: iconst_1       
        //    85: iconst_0       
        //    86: iload_2        
        //    87: ifeq            95
        //    90: iconst_1       
        //    91: goto            96
        //    94: athrow         
        //    95: iconst_3       
        //    96: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZI)V
        //    99: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //   102: return         
        //    StackMapTable: 00 10 FF 00 1A 00 06 01 01 01 07 00 9A 07 01 37 01 00 01 07 01 34 00 4B 07 01 34 40 01 45 07 01 34 00 48 07 01 34 40 07 00 9A 45 07 01 34 40 01 02 00 40 07 00 9A 58 07 01 34 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0B 07 00 9A 08 00 45 08 00 45 07 01 37 01 04 01 01 01 01 01 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0C 07 00 9A 08 00 45 08 00 45 07 01 37 01 04 01 01 01 01 01 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  69     94     94     95     Ljava/lang/RuntimeException;
        //  47     60     63     64     Ljava/lang/RuntimeException;
        //  40     53     56     57     Ljava/lang/RuntimeException;
        //  27     43     46     47     Ljava/lang/RuntimeException;
        //  18     36     39     40     Ljava/lang/RuntimeException;
        //  14     23     26     27     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    private static void moveMouse(final int p0, final int p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: invokestatic    org/powerbot/game/api/methods/input/Mouse.getMouse:()Lorg/powerbot/game/client/input/Mouse;
        //     8: astore_2       
        //     9: invokestatic    org/powerbot/game/api/methods/input/Mouse.getTarget:()Ljava/awt/Component;
        //    12: astore_3       
        //    13: aload_2        
        //    14: ifnull          25
        //    17: aload_3        
        //    18: ifnonnull       27
        //    21: goto            25
        //    24: athrow         
        //    25: return         
        //    26: athrow         
        //    27: aload_2        
        //    28: invokevirtual   org/powerbot/game/client/input/Mouse.isPressed:()Z
        //    31: iload           8
        //    33: ifne            108
        //    36: ifeq            104
        //    39: goto            43
        //    42: athrow         
        //    43: aload_2        
        //    44: new             Ljava/awt/event/MouseEvent;
        //    47: dup            
        //    48: aload_3        
        //    49: sipush          506
        //    52: invokestatic    java/lang/System.currentTimeMillis:()J
        //    55: iconst_0       
        //    56: iload_0        
        //    57: iload_1        
        //    58: iconst_0       
        //    59: iconst_0       
        //    60: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //    63: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //    66: invokestatic    org/powerbot/game/api/methods/input/Mouse.getDragLength:()I
        //    69: sipush          255
        //    72: iand           
        //    73: iload           8
        //    75: ifne            108
        //    78: goto            82
        //    81: athrow         
        //    82: sipush          255
        //    85: if_icmpeq       104
        //    88: goto            92
        //    91: athrow         
        //    92: invokestatic    org/powerbot/game/api/methods/input/Mouse.getDragLength:()I
        //    95: iconst_1       
        //    96: iadd           
        //    97: invokestatic    org/powerbot/game/api/methods/input/Mouse.putDragLength:(I)V
        //   100: goto            104
        //   103: athrow         
        //   104: aload_2        
        //   105: invokevirtual   org/powerbot/game/client/input/Mouse.isPresent:()Z
        //   108: iload           8
        //   110: ifne            188
        //   113: ifne            179
        //   116: goto            120
        //   119: athrow         
        //   120: iload_0        
        //   121: iload_1        
        //   122: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(II)Z
        //   125: ifeq            164
        //   128: goto            132
        //   131: athrow         
        //   132: aload_2        
        //   133: new             Ljava/awt/event/MouseEvent;
        //   136: dup            
        //   137: aload_3        
        //   138: sipush          504
        //   141: invokestatic    java/lang/System.currentTimeMillis:()J
        //   144: iconst_0       
        //   145: iload_0        
        //   146: iload_1        
        //   147: iconst_0       
        //   148: iconst_0       
        //   149: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //   152: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //   155: iload           8
        //   157: ifeq            458
        //   160: goto            164
        //   163: athrow         
        //   164: aload_2        
        //   165: iload_0        
        //   166: iload_1        
        //   167: invokevirtual   org/powerbot/game/client/input/Mouse.update:(II)V
        //   170: iload           8
        //   172: ifeq            458
        //   175: goto            179
        //   178: athrow         
        //   179: iload_0        
        //   180: iload_1        
        //   181: invokestatic    org/powerbot/game/api/methods/Calculations.isOnScreen:(II)Z
        //   184: goto            188
        //   187: athrow         
        //   188: iload           8
        //   190: ifne            432
        //   193: ifne            415
        //   196: goto            200
        //   199: athrow         
        //   200: aload_2        
        //   201: new             Ljava/awt/event/MouseEvent;
        //   204: dup            
        //   205: aload_3        
        //   206: sipush          505
        //   209: invokestatic    java/lang/System.currentTimeMillis:()J
        //   212: iconst_0       
        //   213: iload_0        
        //   214: iload_1        
        //   215: iconst_0       
        //   216: iconst_0       
        //   217: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //   220: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //   223: invokestatic    org/powerbot/game/bot/Context.client:()Lorg/powerbot/game/client/Client;
        //   226: astore          4
        //   228: aload           4
        //   230: iload           8
        //   232: ifne            244
        //   235: ifnull          410
        //   238: goto            242
        //   241: athrow         
        //   242: aload           4
        //   244: invokeinterface org/powerbot/game/client/Client.getCanvas:()Ljava/awt/Canvas;
        //   249: dup            
        //   250: astore          5
        //   252: iload           8
        //   254: ifne            266
        //   257: ifnull          410
        //   260: goto            264
        //   263: athrow         
        //   264: aload           5
        //   266: invokevirtual   java/awt/Canvas.getWidth:()I
        //   269: istore          6
        //   271: aload           5
        //   273: invokevirtual   java/awt/Canvas.getHeight:()I
        //   276: istore          7
        //   278: iload_0        
        //   279: iload           8
        //   281: ifne            309
        //   284: ifgt            304
        //   287: goto            291
        //   290: athrow         
        //   291: iconst_1       
        //   292: invokestatic    org/powerbot/game/api/methods/input/Mouse.putSide:(I)V
        //   295: iload           8
        //   297: ifeq            410
        //   300: goto            304
        //   303: athrow         
        //   304: iload_0        
        //   305: goto            309
        //   308: athrow         
        //   309: iload           8
        //   311: ifne            341
        //   314: iload           6
        //   316: if_icmplt       336
        //   319: goto            323
        //   322: athrow         
        //   323: iconst_3       
        //   324: invokestatic    org/powerbot/game/api/methods/input/Mouse.putSide:(I)V
        //   327: iload           8
        //   329: ifeq            410
        //   332: goto            336
        //   335: athrow         
        //   336: iload_1        
        //   337: goto            341
        //   340: athrow         
        //   341: iload           8
        //   343: ifne            371
        //   346: ifgt            366
        //   349: goto            353
        //   352: athrow         
        //   353: iconst_4       
        //   354: invokestatic    org/powerbot/game/api/methods/input/Mouse.putSide:(I)V
        //   357: iload           8
        //   359: ifeq            410
        //   362: goto            366
        //   365: athrow         
        //   366: iload_1        
        //   367: goto            371
        //   370: athrow         
        //   371: iload           7
        //   373: iload           8
        //   375: ifne            404
        //   378: if_icmplt       398
        //   381: goto            385
        //   384: athrow         
        //   385: iconst_2       
        //   386: invokestatic    org/powerbot/game/api/methods/input/Mouse.putSide:(I)V
        //   389: iload           8
        //   391: ifeq            410
        //   394: goto            398
        //   397: athrow         
        //   398: iconst_0       
        //   399: iconst_5       
        //   400: goto            404
        //   403: athrow         
        //   404: invokestatic    org/powerbot/game/api/util/Random.nextInt:(II)I
        //   407: invokestatic    org/powerbot/game/api/methods/input/Mouse.putSide:(I)V
        //   410: iload           8
        //   412: ifeq            458
        //   415: aload_2        
        //   416: iload           8
        //   418: ifne            436
        //   421: goto            425
        //   424: athrow         
        //   425: invokevirtual   org/powerbot/game/client/input/Mouse.isPressed:()Z
        //   428: goto            432
        //   431: athrow         
        //   432: ifne            458
        //   435: aload_2        
        //   436: new             Ljava/awt/event/MouseEvent;
        //   439: dup            
        //   440: aload_3        
        //   441: sipush          503
        //   444: invokestatic    java/lang/System.currentTimeMillis:()J
        //   447: iconst_0       
        //   448: iload_0        
        //   449: iload_1        
        //   450: iconst_0       
        //   451: iconst_0       
        //   452: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZ)V
        //   455: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //   458: return         
        //    StackMapTable: 00 3F FF 00 18 00 09 01 01 07 00 9A 07 01 37 00 00 00 00 01 00 01 07 01 34 00 40 07 01 34 00 4E 07 01 34 00 65 07 01 34 40 01 48 07 01 34 00 4A 07 01 34 00 43 01 4A 07 01 34 00 4A 07 01 34 00 5E 07 01 34 00 4D 07 01 34 00 47 07 01 34 40 01 4A 07 01 34 00 FF 00 28 00 09 01 01 07 00 9A 07 01 37 07 00 D4 00 00 00 01 00 01 07 01 34 00 41 07 00 D4 FF 00 12 00 09 01 01 07 00 9A 07 01 37 07 00 D4 07 00 D6 00 00 01 00 01 07 01 34 00 41 07 00 D6 FF 00 17 00 09 01 01 07 00 9A 07 01 37 07 00 D4 07 00 D6 01 01 01 00 01 07 01 34 00 4B 07 01 34 00 43 07 01 34 40 01 4C 07 01 34 00 4B 07 01 34 00 43 07 01 34 40 01 4A 07 01 34 00 4B 07 01 34 00 43 07 01 34 40 01 4C 07 01 34 00 4B 07 01 34 00 44 07 01 34 FF 00 00 00 09 01 01 07 00 9A 07 01 37 07 00 D4 07 00 D6 01 01 01 00 02 01 01 FF 00 05 00 09 01 01 07 00 9A 07 01 37 07 00 D4 00 00 00 01 00 00 FF 00 04 00 09 01 01 07 00 9A 07 01 37 00 00 00 00 01 00 00 48 07 01 34 40 07 00 9A 45 07 01 34 40 01 43 07 00 9A 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  415    428    431    432    Ljava/lang/RuntimeException;
        //  410    421    424    425    Ljava/lang/RuntimeException;
        //  385    400    403    404    Ljava/lang/RuntimeException;
        //  378    394    397    398    Ljava/lang/RuntimeException;
        //  371    381    384    385    Ljava/lang/RuntimeException;
        //  353    367    370    371    Ljava/lang/RuntimeException;
        //  346    362    365    366    Ljava/lang/RuntimeException;
        //  341    349    352    353    Ljava/lang/RuntimeException;
        //  323    337    340    341    Ljava/lang/RuntimeException;
        //  314    332    335    336    Ljava/lang/RuntimeException;
        //  309    319    322    323    Ljava/lang/RuntimeException;
        //  291    305    308    309    Ljava/lang/RuntimeException;
        //  284    300    303    304    Ljava/lang/RuntimeException;
        //  278    287    290    291    Ljava/lang/RuntimeException;
        //  252    260    263    264    Ljava/lang/RuntimeException;
        //  228    238    241    242    Ljava/lang/RuntimeException;
        //  188    196    199    200    Ljava/lang/RuntimeException;
        //  164    184    187    188    Ljava/lang/RuntimeException;
        //  132    175    178    179    Ljava/lang/RuntimeException;
        //  120    160    163    164    Ljava/lang/RuntimeException;
        //  113    128    131    132    Ljava/lang/RuntimeException;
        //  108    116    119    120    Ljava/lang/RuntimeException;
        //  82     100    103    104    Ljava/lang/RuntimeException;
        //  43     88     91     92     Ljava/lang/RuntimeException;
        //  36     78     81     82     Ljava/lang/RuntimeException;
        //  27     39     42     43     Ljava/lang/RuntimeException;
        //  17     26     26     27     Ljava/lang/RuntimeException;
        //  13     21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0043:
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
    
    private static void releaseMouse(final int p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/input/Mouse.getMouse:()Lorg/powerbot/game/client/input/Mouse;
        //     8: astore_3       
        //     9: invokestatic    org/powerbot/game/api/methods/input/Mouse.getTarget:()Ljava/awt/Component;
        //    12: astore          4
        //    14: aload_3        
        //    15: ifnull          47
        //    18: aload           4
        //    20: ifnull          47
        //    23: goto            27
        //    26: athrow         
        //    27: aload_3        
        //    28: iload           5
        //    30: ifne            50
        //    33: goto            37
        //    36: athrow         
        //    37: invokevirtual   org/powerbot/game/client/input/Mouse.isPressed:()Z
        //    40: ifne            49
        //    43: goto            47
        //    46: athrow         
        //    47: return         
        //    48: athrow         
        //    49: aload_3        
        //    50: new             Ljava/awt/event/MouseEvent;
        //    53: dup            
        //    54: aload           4
        //    56: sipush          502
        //    59: invokestatic    java/lang/System.currentTimeMillis:()J
        //    62: iconst_0       
        //    63: iload_0        
        //    64: iload_1        
        //    65: iconst_1       
        //    66: iconst_0       
        //    67: iload_2        
        //    68: ifeq            76
        //    71: iconst_1       
        //    72: goto            77
        //    75: athrow         
        //    76: iconst_3       
        //    77: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZI)V
        //    80: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //    83: invokestatic    org/powerbot/game/api/methods/input/Mouse.getDragLength:()I
        //    86: sipush          255
        //    89: iand           
        //    90: iload           5
        //    92: ifne            138
        //    95: iconst_3       
        //    96: if_icmpgt       137
        //    99: aload_3        
        //   100: new             Ljava/awt/event/MouseEvent;
        //   103: dup            
        //   104: aload           4
        //   106: sipush          500
        //   109: invokestatic    java/lang/System.currentTimeMillis:()J
        //   112: iconst_0       
        //   113: iload_0        
        //   114: iload_1        
        //   115: iconst_1       
        //   116: iconst_0       
        //   117: iload_2        
        //   118: ifeq            130
        //   121: goto            125
        //   124: athrow         
        //   125: iconst_1       
        //   126: goto            131
        //   129: athrow         
        //   130: iconst_3       
        //   131: invokespecial   java/awt/event/MouseEvent.<init>:(Ljava/awt/Component;IJIIIIZI)V
        //   134: invokevirtual   org/powerbot/game/client/input/Mouse.sendEvent:(Ljava/awt/event/MouseEvent;)V
        //   137: iconst_0       
        //   138: invokestatic    org/powerbot/game/api/methods/input/Mouse.putDragLength:(I)V
        //   141: return         
        //    StackMapTable: 00 13 FF 00 1A 00 06 01 01 01 07 00 9A 07 01 37 01 00 01 07 01 34 00 48 07 01 34 40 07 00 9A 48 07 01 34 00 40 07 01 34 00 40 07 00 9A 58 07 01 34 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0B 07 00 9A 08 00 32 08 00 32 07 01 37 01 04 01 01 01 01 01 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0C 07 00 9A 08 00 32 08 00 32 07 01 37 01 04 01 01 01 01 01 01 6E 07 01 34 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0B 07 00 9A 08 00 64 08 00 64 07 01 37 01 04 01 01 01 01 01 43 07 01 34 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0B 07 00 9A 08 00 64 08 00 64 07 01 37 01 04 01 01 01 01 01 FF 00 00 00 06 01 01 01 07 00 9A 07 01 37 01 00 0C 07 00 9A 08 00 64 08 00 64 07 01 37 01 04 01 01 01 01 01 01 05 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  99     129    129    130    Ljava/lang/RuntimeException;
        //  95     121    124    125    Ljava/lang/RuntimeException;
        //  50     75     75     76     Ljava/lang/RuntimeException;
        //  37     48     48     49     Ljava/lang/RuntimeException;
        //  27     43     46     47     Ljava/lang/RuntimeException;
        //  18     33     36     37     Ljava/lang/RuntimeException;
        //  14     23     26     27     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    private static org.powerbot.game.client.input.Mouse getMouse() {
        final Client client = Context.client();
        Label_0018: {
            Client client2;
            try {
                final Client client3;
                client2 = (client3 = client);
                if (Mouse.a != 0) {
                    return client3.getMouse();
                }
                if (client2 == null) {
                    break Label_0018;
                }
                break Label_0018;
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
        Client client3 = client;
        return client3.getMouse();
    }
    
    public static boolean isReady() {
        try {
            if (getMouse() != null) {
                return true;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return false;
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
                    return null;
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        return value.getLoader().getComponent(0);
    }
    
    private static int getDragLength() {
        Integer value = Mouse.dragLengths.get(Thread.currentThread().getThreadGroup());
        Integer n = null;
        Label_0053: {
            try {
                n = value;
                if (Mouse.a != 0) {
                    return n;
                }
                if (n != null) {
                    break Label_0053;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            value = 0;
            Mouse.dragLengths.put(Thread.currentThread().getThreadGroup(), value);
        }
        return n;
    }
    
    private static void putDragLength(final int i) {
        Mouse.dragLengths.put(Thread.currentThread().getThreadGroup(), i);
    }
    
    public static int getSide() {
        Integer value = Mouse.sides.get(Thread.currentThread().getThreadGroup());
        Integer n = null;
        Label_0053: {
            try {
                n = value;
                if (Mouse.a != 0) {
                    return n;
                }
                if (n != null) {
                    break Label_0053;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            value = 0;
            Mouse.sides.put(Thread.currentThread().getThreadGroup(), value);
        }
        return n;
    }
    
    public static void putSide(final int i) {
        Mouse.sides.put(Thread.currentThread().getThreadGroup(), i);
    }
    
    private static MouseNode create(final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
        return new MouseNode(new ViewportEntity() {
            private final Rectangle area = new Rectangle(n - n3, n2 - n4, n3 * 2, n4 * 2);
            
            {
                if (Task.a != 0) {
                    Mouse.a = ++a;
                }
            }
            
            @Override
            public Point getCentralPoint() {
                return new Point(n, n2);
            }
            
            @Override
            public Point getNextViewportPoint() {
                return new Point(n + Random.nextGaussian(-n3, n3, n3), n2 + Random.nextGaussian(-n4, n4, n4));
            }
            
            @Override
            public boolean contains(final Point p) {
                return this.area.contains(p);
            }
            
            @Override
            public boolean validate() {
                return Calculations.isOnScreen(n, n2);
            }
        }, new Filter<Point>() {
            @Override
            public boolean accept(final Point point) {
                Label_0017: {
                    boolean b;
                    try {
                        final boolean val$click;
                        b = (val$click = b);
                        if (Mouse.a != 0) {
                            return val$click;
                        }
                        if (b) {
                            break Label_0017;
                        }
                        return true;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (b) {
                            Mouse.click(b2);
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return true;
            }
        });
    }
    
    static {
        dragLengths = new HashMap<ThreadGroup, Integer>();
        sides = new HashMap<ThreadGroup, Integer>();
    }
    
    public enum Speed
    {
        VERY_SLOW, 
        SLOW, 
        NORMAL, 
        FAST, 
        VERY_FAST;
        
        private static final String[] z;
        
        static {
            final String[] z2 = new String[5];
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = 0)));
            String s = "bl_A";
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
                                    c2 = 'd';
                                    break;
                                }
                                case 1: {
                                    c2 = '~';
                                    break;
                                }
                                case 2: {
                                    c2 = 'L';
                                    break;
                                }
                                case 3: {
                                    c2 = 'F';
                                    break;
                                }
                                default: {
                                    c2 = '\n';
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
                        s = "g\u0012S(\u0006\u000b";
                        n6 = 0;
                        continue Label_0071_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 2))));
                        s = "waCB";
                        n6 = 1;
                        continue Label_0071_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 3))));
                        s = "\u0011v=Rvz\u0011N2";
                        n6 = 2;
                        continue Label_0071_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 4))));
                        s = "\u0011v=Rvo\u001cR1";
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
}
