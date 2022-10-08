
package org.powerbot;

import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.Box;
import java.awt.Component;
import org.powerbot.game.bot.handler.input.a;
import org.powerbot.core.bot.ClientStub;
import java.awt.Color;
import javax.swing.JPanel;

public final class xb extends JPanel
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    
    public xb() {
        this.setBackground(Color.BLACK);
        this.add(new a_(ClientStub.e(xb.z[2]), a.a(xb.z[6]), ClientStub.e(xb.z[5])));
        this.add(Box.createHorizontalStrut(40));
        this.add(new a_(a.a(xb.z[4]), ClientStub.e(xb.z[1]), a.a(xb.z[8])));
        this.add(Box.createHorizontalStrut(40));
        this.add(new a_(ClientStub.e(xb.z[3]), a.a(xb.z[7]), ClientStub.e(xb.z[0])));
    }
    
    static {
        final String[] z2 = new String[9];
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 0)))))));
        String s = "^,t^8\u0007T\u0001\u0018Kf/`U4\u001a";
        int n10 = -1;
        String intern = null;
    Label_0113_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n12;
            final int n11 = n12 = (length = charArray.length);
            int n13 = 0;
            while (true) {
                Label_0190: {
                    if (n11 > 1) {
                        break Label_0190;
                    }
                    length = (n12 = n13);
                    do {
                        final char c = charArray[n12];
                        char c2 = '\0';
                        switch (n13 % 5) {
                            case 0: {
                                c2 = 'j';
                                break;
                            }
                            case 1: {
                                c2 = 'N';
                                break;
                            }
                            case 2: {
                                c2 = 'i';
                                break;
                            }
                            case 3: {
                                c2 = '3';
                                break;
                            }
                            default: {
                                c2 = ' ';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n13;
                    } while (n11 == 0);
                }
                if (n11 > n13) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n10) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 1))))))));
                    s = "w+qR9\u0001Z\u0006";
                    n10 = 0;
                    continue Label_0113_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 2))))))));
                    s = "c/aX.\u001cV\b;\u000bx'sP>\u001d\u001a\u0019?Me>wEu\u001e[\n";
                    n10 = 1;
                    continue Label_0113_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 3))))))));
                    s = "c/aX.\u001cV\b;\u000bx'sP>\u001d\u001a\u0014'Qe?pRu\u001e[\n";
                    n10 = 2;
                    continue Label_0113_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 4))))))));
                    s = "\u0002\u001f\u0000hO,78Z;\u0019\u0017\u0012`_-{;Hw\u0015\u0018\u001chQp$3N";
                    n10 = 3;
                    continue Label_0113_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 5))))))));
                    s = ".G\u001e*Ke%`P";
                    n10 = 4;
                    continue Label_0113_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 6))))))));
                    s = "\u0004\r\u001asN;&";
                    n10 = 5;
                    continue Label_0113_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 7))))))));
                    s = "\t\u0015\u0006sO<1";
                    n10 = 6;
                    continue Label_0113_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = 8))))))));
                    s = ".;*Lf\u0012\u0015\u0007";
                    n10 = 7;
                    continue Label_0113_Outer;
                }
                case 7: {
                    break Label_0113_Outer;
                }
            }
        }
        z2[n9] = intern;
        z = z2;
    }
    
    private class a_ extends JPanel
    {
        private static final long serialVersionUID = 1L;
        
        public a_(final String s, final String s2, final String toolTipText) {
            this.setBackground(Color.BLACK);
            final JLabel comp = new JLabel(new ImageIcon(db.b(s)));
            comp.setToolTipText(toolTipText);
            comp.setBackground(this.getBackground());
            comp.setCursor(Cursor.getPredefinedCursor(12));
            comp.addMouseListener(new MouseAdapter() {
                private static final String[] z;
                
                @Override
                public void mouseClicked(final MouseEvent p0) {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     3: istore          5
                    //     5: aconst_null    
                    //     6: astore_2       
                    //     7: aload_0        
                    //     8: getfield        org/powerbot/xb$a_$0.val$url:Ljava/lang/String;
                    //    11: astore_3       
                    //    12: iconst_m1      
                    //    13: istore          4
                    //    15: aload_3        
                    //    16: invokevirtual   java/lang/String.hashCode:()I
                    //    19: iload           5
                    //    21: ifne            166
                    //    24: lookupswitch {
                    //          -991745245: 133
                    //          -916346253: 61
                    //          497130182: 97
                    //          default: 164
                    //        }
                    //    60: athrow         
                    //    61: aload_3        
                    //    62: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //    65: iconst_5       
                    //    66: aaload         
                    //    67: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
                    //    70: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //    73: iload           5
                    //    75: ifne            166
                    //    78: goto            82
                    //    81: athrow         
                    //    82: ifeq            164
                    //    85: goto            89
                    //    88: athrow         
                    //    89: iconst_0       
                    //    90: istore          4
                    //    92: iload           5
                    //    94: ifeq            164
                    //    97: aload_3        
                    //    98: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //   101: iconst_0       
                    //   102: aaload         
                    //   103: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   106: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //   109: iload           5
                    //   111: ifne            166
                    //   114: goto            118
                    //   117: athrow         
                    //   118: ifeq            164
                    //   121: goto            125
                    //   124: athrow         
                    //   125: iconst_1       
                    //   126: istore          4
                    //   128: iload           5
                    //   130: ifeq            164
                    //   133: aload_3        
                    //   134: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //   137: iconst_1       
                    //   138: aaload         
                    //   139: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
                    //   142: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //   145: iload           5
                    //   147: ifne            166
                    //   150: goto            154
                    //   153: athrow         
                    //   154: ifeq            164
                    //   157: goto            161
                    //   160: athrow         
                    //   161: iconst_2       
                    //   162: istore          4
                    //   164: iload           4
                    //   166: tableswitch {
                    //                0: 192
                    //                1: 204
                    //                2: 216
                    //          default: 225
                    //        }
                    //   192: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //   195: iconst_3       
                    //   196: aaload         
                    //   197: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   200: astore_2       
                    //   201: goto            225
                    //   204: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //   207: iconst_4       
                    //   208: aaload         
                    //   209: invokestatic    org/powerbot/core/bot/ClientStub.e:(Ljava/lang/String;)Ljava/lang/String;
                    //   212: astore_2       
                    //   213: goto            225
                    //   216: getstatic       org/powerbot/xb$a_$0.z:[Ljava/lang/String;
                    //   219: iconst_2       
                    //   220: aaload         
                    //   221: invokestatic    org/p.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   224: astore_2       
                    //   225: aload_2        
                    //   226: iload           5
                    //   228: ifne            239
                    //   231: ifnull          242
                    //   234: goto            238
                    //   237: athrow         
                    //   238: aload_2        
                    //   239: invokestatic    org/powerbot/qb.a:(Ljava/lang/String;)V
                    //   242: return         
                    //    StackMapTable: 00 1A FF 00 3C 00 06 07 00 08 07 00 63 05 07 00 1E 01 01 00 01 07 00 50 00 53 07 00 50 40 01 45 07 00 50 00 07 53 07 00 50 40 01 45 07 00 50 00 07 53 07 00 50 40 01 45 07 00 50 00 02 41 01 19 0B 0B FF 00 08 00 06 07 00 08 07 00 63 07 00 1E 07 00 1E 01 01 00 00 4B 07 00 50 00 40 07 00 1E 02
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type                        
                    //  -----  -----  -----  -----  ----------------------------
                    //  225    234    237    238    Ljava/lang/RuntimeException;
                    //  133    157    160    161    Ljava/lang/RuntimeException;
                    //  128    150    153    154    Ljava/lang/RuntimeException;
                    //  97     121    124    125    Ljava/lang/RuntimeException;
                    //  92     114    117    118    Ljava/lang/RuntimeException;
                    //  61     85     88     89     Ljava/lang/RuntimeException;
                    //  24     78     81     82     Ljava/lang/RuntimeException;
                    //  15     60     60     61     Ljava/lang/RuntimeException;
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0061:
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
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
                    //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
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
                    final String[] z2 = new String[6];
                    int n6;
                    int n5;
                    int n4;
                    int n3;
                    int n2;
                    int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
                    String s = "\u0003qli v\u0003\u0018";
                    int n7 = -1;
                    String intern = null;
                Label_0081_Outer:
                    while (true) {
                        final char[] charArray = s.toCharArray();
                        int length;
                        int n9;
                        final int n8 = n9 = (length = charArray.length);
                        int n10 = 0;
                        while (true) {
                            Label_0158: {
                                if (n8 > 1) {
                                    break Label_0158;
                                }
                                length = (n9 = n10);
                                do {
                                    final char c = charArray[n9];
                                    char c2 = '\0';
                                    switch (n10 % 5) {
                                        case 0: {
                                            c2 = '\u0007';
                                            break;
                                        }
                                        case 1: {
                                            c2 = '\u000e';
                                            break;
                                        }
                                        case 2: {
                                            c2 = 'm';
                                            break;
                                        }
                                        case 3: {
                                            c2 = '\u0012';
                                            break;
                                        }
                                        default: {
                                            c2 = ' ';
                                            break;
                                        }
                                    }
                                    charArray[length] = (char)(c ^ c2);
                                    ++n10;
                                } while (n8 == 0);
                            }
                            if (n8 > n10) {
                                continue;
                            }
                            break;
                        }
                        intern = new String(charArray).intern();
                        switch (n7) {
                            default: {
                                z2[n2] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                                s = "z\u001a\u001c\u001dQ\u001eo";
                                n7 = 0;
                                continue Label_0081_Outer;
                            }
                            case 0: {
                                z2[n] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                                s = "q\u0018\u0007\u0000\u0004J?ce,r\u001f]\u0000Q\u0012u}n-mB\u001c\u0002YJi`y6l\u000e\u0016";
                                n7 = 1;
                                continue Label_0081_Outer;
                            }
                            case 1: {
                                z2[n3] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                                s = "q\u0018\u0007\u0000\u0004J?ce,r\u001f]\u0000Q\u0012u}n-mB\u001c\u0002YJdxe6m\t\u0001";
                                n7 = 2;
                                continue Label_0081_Outer;
                            }
                            case 2: {
                                z2[n4] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                                s = "\u0014~bfa,Z\u0005\u0000J\u0017y8f4t\u0010\u001b\u000bK\b$yd<,\u0013\b\nA\u001eey}";
                                n7 = 3;
                                continue Label_0081_Outer;
                            }
                            case 3: {
                                z2[n5] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                                s = "w\u0002\u0000\u001dP\u0019x";
                                n7 = 4;
                                continue Label_0081_Outer;
                            }
                            case 4: {
                                break Label_0081_Outer;
                            }
                        }
                    }
                    z2[n6] = intern;
                    z = z2;
                }
            });
            this.add(comp);
        }
    }
}
