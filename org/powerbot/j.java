
package org.powerbot;

import org.powerbot.core.script.wrappers.Item;
import org.f;
import java.util.HashMap;
import java.awt.event.KeyEvent;
import java.lang.constant.Constable;
import java.util.Iterator;
import javax.swing.KeyStroke;
import javax.swing.JMenuItem;
import java.util.Map;
import java.awt.KeyEventDispatcher;

public final class j implements KeyEventDispatcher
{
    private static final Map<Long, b_> a;
    
    public static void a(final JMenuItem menuItem, final b_ b_) {
        final boolean f = wb.f;
        for (final Map.Entry<Long, b_> entry : j.a.entrySet()) {
            Constable key = null;
            Label_0073: {
                Label_0099: {
                    Label_0063: {
                        b_ b_2;
                        try {
                            b_2 = (b_)(key = entry.getValue());
                            if (f) {
                                break Label_0073;
                            }
                            final b_ b_3 = b_;
                            final boolean b = b_2.equals(b_3);
                            if (b) {
                                break Label_0063;
                            }
                            break Label_0099;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final b_ b_3 = b_;
                            final boolean b = b_2.equals(b_3);
                            if (!b) {
                                break Label_0099;
                            }
                            key = entry.getKey();
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    break Label_0073;
                }
                if (f) {
                    break;
                }
                continue;
            }
            final long longValue = (long)key;
            menuItem.setAccelerator(KeyStroke.getKeyStroke((int)longValue, (int)(longValue >> 32), true));
        }
    }
    
    @Override
    public boolean dispatchKeyEvent(final KeyEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_1        
        //     6: invokevirtual   java/awt/event/KeyEvent.getID:()I
        //     9: iload           8
        //    11: ifne            29
        //    14: sipush          402
        //    17: if_icmpeq       30
        //    20: goto            24
        //    23: athrow         
        //    24: iconst_0       
        //    25: goto            29
        //    28: athrow         
        //    29: ireturn        
        //    30: invokestatic    org/powerbot/qb.a:()Lorg/powerbot/qb;
        //    33: astore_2       
        //    34: aload_2        
        //    35: getfield        org/powerbot/qb.c:Lorg/powerbot/wb;
        //    38: astore_3       
        //    39: invokestatic    java/awt/MouseInfo.getPointerInfo:()Ljava/awt/PointerInfo;
        //    42: invokevirtual   java/awt/PointerInfo.getLocation:()Ljava/awt/Point;
        //    45: astore          4
        //    47: aload           4
        //    49: aload_3        
        //    50: invokestatic    javax/swing/SwingUtilities.convertPointFromScreen:(Ljava/awt/Point;Ljava/awt/Component;)V
        //    53: aload           4
        //    55: iload           8
        //    57: ifne            164
        //    60: invokevirtual   java/awt/Point.getX:()D
        //    63: dconst_0       
        //    64: dcmpg          
        //    65: iflt            149
        //    68: goto            72
        //    71: athrow         
        //    72: aload           4
        //    74: iload           8
        //    76: ifne            164
        //    79: goto            83
        //    82: athrow         
        //    83: invokevirtual   java/awt/Point.getY:()D
        //    86: dconst_0       
        //    87: dcmpg          
        //    88: iflt            149
        //    91: goto            95
        //    94: athrow         
        //    95: aload           4
        //    97: iload           8
        //    99: ifne            164
        //   102: goto            106
        //   105: athrow         
        //   106: invokevirtual   java/awt/Point.getX:()D
        //   109: aload_3        
        //   110: invokevirtual   java/awt/Component.getWidth:()I
        //   113: i2d            
        //   114: dcmpl          
        //   115: ifgt            149
        //   118: goto            122
        //   121: athrow         
        //   122: aload           4
        //   124: invokevirtual   java/awt/Point.getY:()D
        //   127: aload_3        
        //   128: invokevirtual   java/awt/Component.getHeight:()I
        //   131: i2d            
        //   132: dcmpl          
        //   133: iload           8
        //   135: ifne            178
        //   138: goto            142
        //   141: athrow         
        //   142: ifle            166
        //   145: goto            149
        //   148: athrow         
        //   149: new             Ljava/awt/Point;
        //   152: dup            
        //   153: bipush          8
        //   155: bipush          8
        //   157: invokespecial   java/awt/Point.<init>:(II)V
        //   160: goto            164
        //   163: athrow         
        //   164: astore          4
        //   166: aload_1        
        //   167: invokevirtual   java/awt/event/KeyEvent.getModifiersEx:()I
        //   170: bipush          32
        //   172: ishl           
        //   173: aload_1        
        //   174: invokevirtual   java/awt/event/KeyEvent.getKeyCode:()I
        //   177: ior            
        //   178: i2l            
        //   179: lstore          5
        //   181: getstatic       org/powerbot/j.a:Ljava/util/Map;
        //   184: lload           5
        //   186: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   189: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   194: iload           8
        //   196: ifne            378
        //   199: ifeq            377
        //   202: goto            206
        //   205: athrow         
        //   206: getstatic       org/powerbot/j.a:Ljava/util/Map;
        //   209: lload           5
        //   211: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   214: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   219: checkcast       Lorg/powerbot/j$b_;
        //   222: astore          7
        //   224: getstatic       org/powerbot/j$0.a:[I
        //   227: aload           7
        //   229: invokevirtual   org/powerbot/j$b_.ordinal:()I
        //   232: iaload         
        //   233: iload           8
        //   235: ifne            376
        //   238: tableswitch {
        //                2: 285
        //                3: 317
        //                4: 329
        //                5: 342
        //                6: 342
        //                7: 342
        //                8: 356
        //                9: 368
        //          default: 375
        //        }
        //   284: athrow         
        //   285: new             Lorg/powerbot/yb;
        //   288: dup            
        //   289: invokespecial   org/powerbot/yb.<init>:()V
        //   292: aload_3        
        //   293: aload           4
        //   295: invokevirtual   java/awt/Point.getX:()D
        //   298: d2i            
        //   299: aload           4
        //   301: invokevirtual   java/awt/Point.getY:()D
        //   304: d2i            
        //   305: invokevirtual   org/powerbot/yb.show:(Ljava/awt/Component;II)V
        //   308: iload           8
        //   310: ifeq            375
        //   313: goto            317
        //   316: athrow         
        //   317: invokestatic    org/powerbot/yb.a:()V
        //   320: iload           8
        //   322: ifeq            375
        //   325: goto            329
        //   328: athrow         
        //   329: iconst_0       
        //   330: invokestatic    org/powerbot/yb.a:(Z)V
        //   333: iload           8
        //   335: ifeq            375
        //   338: goto            342
        //   341: athrow         
        //   342: aload           7
        //   344: invokestatic    org/powerbot/yb.a:(Lorg/powerbot/j$b_;)V
        //   347: iload           8
        //   349: ifeq            375
        //   352: goto            356
        //   355: athrow         
        //   356: invokestatic    org/powerbot/yb.b:()V
        //   359: iload           8
        //   361: ifeq            375
        //   364: goto            368
        //   367: athrow         
        //   368: invokestatic    org/powerbot/yb.c:()V
        //   371: goto            375
        //   374: athrow         
        //   375: iconst_1       
        //   376: ireturn        
        //   377: iconst_0       
        //   378: ireturn        
        //    StackMapTable: 00 2A FF 00 17 00 09 07 00 52 07 00 7A 00 00 00 00 00 00 01 00 01 07 00 F5 00 43 07 00 F5 40 01 00 FF 00 28 00 09 07 00 52 07 00 7A 07 00 7C 07 00 EF 07 00 1A 00 00 00 01 00 01 07 00 F5 00 49 07 00 F5 40 07 00 1A 4A 07 00 F5 00 49 07 00 F5 40 07 00 1A 4E 07 00 F5 00 52 07 00 F5 40 01 45 07 00 F5 00 4D 07 00 F5 40 07 00 1A 01 4B 01 FF 00 1A 00 08 07 00 52 07 00 7A 07 00 7C 07 00 EF 07 00 1A 04 00 01 00 01 07 00 F5 00 FF 00 4D 00 08 07 00 52 07 00 7A 07 00 7C 07 00 EF 07 00 1A 04 07 00 09 01 00 01 07 00 F5 00 5E 07 00 F5 00 4A 07 00 F5 00 4B 07 00 F5 00 4C 07 00 F5 00 4A 07 00 F5 00 45 07 00 F5 00 40 01 FF 00 00 00 08 07 00 52 07 00 7A 07 00 7C 07 00 EF 07 00 1A 04 00 01 00 00 40 01
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  356    374    374    375    Ljava/lang/RuntimeException;
        //  342    364    367    368    Ljava/lang/RuntimeException;
        //  329    352    355    356    Ljava/lang/RuntimeException;
        //  317    338    341    342    Ljava/lang/RuntimeException;
        //  285    325    328    329    Ljava/lang/RuntimeException;
        //  238    313    316    317    Ljava/lang/RuntimeException;
        //  224    284    284    285    Ljava/lang/RuntimeException;
        //  181    202    205    206    Ljava/lang/RuntimeException;
        //  142    160    163    164    Ljava/lang/RuntimeException;
        //  122    145    148    149    Ljava/lang/RuntimeException;
        //  106    138    141    142    Ljava/lang/RuntimeException;
        //  95     118    121    122    Ljava/lang/RuntimeException;
        //  83     102    105    106    Ljava/lang/RuntimeException;
        //  72     91     94     95     Ljava/lang/RuntimeException;
        //  60     79     82     83     Ljava/lang/RuntimeException;
        //  47     68     71     72     Ljava/lang/RuntimeException;
        //  14     25     28     29     Ljava/lang/RuntimeException;
        //  5      20     23     24     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0072:
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
        (a = new HashMap<Long, b_>()).put(112L, b_.MENU);
        j.a.put(525L, b_.MENU);
        j.a.put(549755813966L, b_.TAB_ADD);
        j.a.put(549755813972L, b_.TAB_ADD);
        j.a.put(824633720910L, b_.TAB_ADD);
        j.a.put(2199023255667L, b_.TAB_CLOSE);
        j.a.put(2473901162583L, b_.TAB_CLOSE);
        j.a.put(549755813975L, b_.TAB_CLOSE);
        j.a.put(549755814003L, b_.TAB_CLOSE);
        j.a.put(118L, b_.ACCOUNTS);
        j.a.put(117L, b_.SIGNIN);
        j.a.put(123L, b_.ABOUT);
        j.a.put(120L, b_.SCRIPT_PLAYPAUSE);
        j.a.put(121L, b_.SCRIPT_STOP);
    }
    
    public enum b_
    {
        MENU, 
        TAB_ADD, 
        TAB_CLOSE, 
        ACCOUNTS, 
        SIGNIN, 
        ABOUT, 
        SCRIPT_PLAYPAUSE, 
        SCRIPT_STOP;
        
        private static final String[] z;
        
        static {
            final String[] z2 = new String[8];
            int n8;
            int n7;
            int n6;
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 0))))));
            String s = "$\u0017\u0000r=";
            int n9 = -1;
            String intern = null;
        Label_0102_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n11;
                final int n10 = n11 = (length = charArray.length);
                int n12 = 0;
                while (true) {
                    Label_0178: {
                        if (n10 > 1) {
                            break Label_0178;
                        }
                        length = (n11 = n12);
                        do {
                            final char c = charArray[n11];
                            char c2 = '\0';
                            switch (n12 % 5) {
                                case 0: {
                                    c2 = '<';
                                    break;
                                }
                                case 1: {
                                    c2 = 'b';
                                    break;
                                }
                                case 2: {
                                    c2 = '\u0016';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0010';
                                    break;
                                }
                                default: {
                                    c2 = '0';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n12;
                        } while (n10 == 0);
                    }
                    if (n10 > n12) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n9) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 1)))))));
                        s = "Jxb\u0006R+\u0001\u001c";
                        n9 = 0;
                        continue Label_0102_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                        s = "Omf\u000f";
                        n9 = 1;
                        continue Label_0102_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                        s = "Qao\u0014G8";
                        n9 = 2;
                        continue Label_0102_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                        s = "1\u0014\rx(O\u007f";
                        n9 = 3;
                        continue Label_0102_Outer;
                    }
                    case 3: {
                        z2[n5] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                        s = "6\u0016\u001dn9_dr\u001dH5";
                        n9 = 4;
                        continue Label_0102_Outer;
                    }
                    case 4: {
                        z2[n6] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                        s = "Qkz\u0013^\"\u0003\fb;[xi\u000f]3";
                        n9 = 5;
                        continue Label_0102_Outer;
                    }
                    case 5: {
                        z2[n7] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                        s = "\"\u001d\u001eq9Ng{\u001f";
                        n9 = 6;
                        continue Label_0102_Outer;
                    }
                    case 6: {
                        break Label_0102_Outer;
                    }
                }
            }
            z2[n8] = intern;
            z = z2;
        }
    }
}
