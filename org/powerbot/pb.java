
package org.powerbot;

import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import org.powerbot.core.script.internal.wrappers.Deque;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import java.awt.Color;
import javax.swing.LayoutStyle;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.GroupLayout;
import org.powerbot.core.script.job.Task;
import java.awt.Component;
import java.awt.Frame;
import org.f;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public final class pb extends JDialog implements ActionListener
{
    private static final long serialVersionUID = 1L;
    private final qb a;
    private final JButton b;
    private final JLabel c;
    private final JLabel d;
    private final JLabel e;
    private final JLabel f;
    private final JLabel g;
    private final JPanel h;
    private final JTextField i;
    private final JPasswordField j;
    private static final String[] z;
    
    public pb(final qb qb) {
        final boolean f = qb.f;
        super(qb, org.f.a(pb.z[13]), true);
        this.a = qb;
        this.setFont(this.getFont().deriveFont(this.getFont().getSize2D() * 1.5f));
        this.c = new JLabel();
        this.i = new JTextField();
        this.d = new JLabel();
        this.j = new JPasswordField();
        this.b = new JButton();
        this.e = new JLabel();
        this.f = new JLabel();
        this.h = new JPanel();
        this.g = new JLabel();
        final Component[] array = { this.c, this.i, this.d, this.j, this.b, this.e, this.f, this.h, this.g };
        final int length = array.length;
        int i = 0;
    Label_0649:
        while (true) {
            while (i < length) {
                final Component component = array[i];
                try {
                    component.setFont(this.getFont());
                    ++i;
                    if (f) {
                        break Label_0649;
                    }
                    if (!f) {
                        continue;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                int a = Task.a;
                Task.a = ++a;
                break;
                final GroupLayout layout = new GroupLayout(this.h);
                this.h.setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.g, -1, 173, 32767).addContainerGap()));
                layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addComponent(this.g).addContainerGap()));
                final GroupLayout layout2 = new GroupLayout(this.getContentPane());
                this.getContentPane().setLayout(layout2);
                layout2.setHorizontalGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout2.createSequentialGroup().addContainerGap(-1, 32767).addGroup(layout2.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(layout2.createSequentialGroup().addComponent(this.f).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, -1, 32767).addComponent(this.b)).addComponent(this.e).addGroup(layout2.createSequentialGroup().addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.c, -1, -1, 32767).addComponent(this.d, -1, -1, 32767)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(this.i).addComponent(this.j, -1, 200, 32767)))).addGap(18, 18, 18).addComponent(this.h, -2, -1, -2).addContainerGap()));
                layout2.setVerticalGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout2.createSequentialGroup().addContainerGap().addGroup(layout2.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(this.h, -1, -1, 32767).addGroup(layout2.createSequentialGroup().addGroup(layout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.c).addComponent(this.i, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(layout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.d).addComponent(this.j, -2, -1, -2)).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(this.e).addGap(18, 18, 18).addGroup(layout2.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(this.b).addComponent(this.f)).addGap(0, 0, 32767))).addContainerGap()));
                this.a(v.a().b());
                this.getRootPane().setDefaultButton(this.b);
                this.pack();
                this.setMinimumSize(this.getSize());
                this.setResizable(false);
                this.setLocationRelativeTo(this.getParent());
                this.setVisible(true);
                hb.a().b(org.f.a(pb.z[12]), this.getTitle());
                return;
            }
            this.setDefaultCloseOperation(2);
            this.c.setHorizontalAlignment(4);
            this.c.setText(org.f.a(pb.z[8]));
            this.d.setHorizontalAlignment(4);
            this.d.setText(org.f.a(pb.z[9]));
            this.b.setText(org.f.a(pb.z[0]));
            this.b.addActionListener(this);
            this.b.setFocusable(false);
            this.e.setFont(this.e.getFont().deriveFont(this.e.getFont().getSize2D() - 3.0f));
            this.e.setText(org.f.a(pb.z[11]));
            this.e.setForeground(new Color(0, 0, 204));
            this.e.setCursor(Cursor.getPredefinedCursor(12));
            this.e.addMouseListener(new MouseAdapter() {
                private static final String z;
                
                @Override
                public void mouseClicked(final MouseEvent mouseEvent) {
                    qb.a(kb.a(pb$1.z));
                }
                
                static {
                    final char[] charArray = "gi\n\u001elasSFydnP\u001e999MMx{3\u0011\u001c1a0P\\c\u007f|\r\u001d".toCharArray();
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
                                        c2 = '\u0018';
                                        break;
                                    }
                                    case 1: {
                                        c2 = 'K';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'i';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '8';
                                        break;
                                    }
                                    default: {
                                        c2 = 'A';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n3;
                            } while (n == 0);
                        }
                        if (n <= n3) {
                            z = new String(charArray).intern();
                            return;
                        }
                        continue;
                    }
                }
            });
            this.e.setVisible(false);
            this.f.setFont(this.f.getFont().deriveFont(this.f.getFont().getSize2D() - 2.0f));
            this.f.setText(org.f.a(pb.z[10]));
            this.f.setCursor(Cursor.getPredefinedCursor(12));
            this.f.addMouseListener(new MouseAdapter() {
                private static final String z;
                
                @Override
                public void mouseClicked(final MouseEvent mouseEvent) {
                    qb.a(Deque.e(pb$0.z));
                }
                
                static {
                    final char[] charArray = "WMbH\u0003;=Qz|TJ8HVcwOq}K\u0017yJ^;`Xt{LMsJ".toCharArray();
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
                                        c2 = '8';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0015';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\u0011';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0014';
                                        break;
                                    }
                                    default: {
                                        c2 = '>';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n3;
                            } while (n == 0);
                        }
                        if (n <= n3) {
                            z = new String(charArray).intern();
                            return;
                        }
                        continue;
                    }
                }
            });
            this.g.setHorizontalAlignment(0);
            this.g.setText(org.f.a(pb.z[7]));
            this.g.setFont(this.g.getFont().deriveFont(this.g.getFont().getSize2D() * 0.7f));
            this.g.setHorizontalAlignment(0);
            this.g.setOpaque(true);
            this.g.setBackground(null);
            this.h.setBackground(new Color(221, 221, 221));
            this.h.setBorder(BorderFactory.createEtchedBorder());
            this.h.setVisible(false);
            continue Label_0649;
        }
    }
    
    @Override
    public void actionPerformed(final ActionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: aload_1        
        //     6: invokevirtual   java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
        //     9: astore_2       
        //    10: iload           5
        //    12: ifne            39
        //    15: aload_2        
        //    16: aload_0        
        //    17: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //    20: if_acmpne       346
        //    23: goto            27
        //    26: athrow         
        //    27: aload_0        
        //    28: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //    31: iconst_0       
        //    32: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //    35: goto            39
        //    38: athrow         
        //    39: aload_0        
        //    40: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //    43: invokevirtual   javax/swing/JButton.getText:()Ljava/lang/String;
        //    46: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //    49: iconst_0       
        //    50: aaload         
        //    51: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //    54: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    57: iload           5
        //    59: ifne            280
        //    62: ifeq            249
        //    65: goto            69
        //    68: athrow         
        //    69: aload_0        
        //    70: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //    73: invokevirtual   javax/swing/JTextField.getText:()Ljava/lang/String;
        //    76: invokevirtual   java/lang/String.length:()I
        //    79: iload           5
        //    81: ifne            116
        //    84: goto            88
        //    87: athrow         
        //    88: ifeq            226
        //    91: goto            95
        //    94: athrow         
        //    95: new             Ljava/lang/String;
        //    98: dup            
        //    99: aload_0        
        //   100: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //   103: invokevirtual   javax/swing/JPasswordField.getPassword:()[C
        //   106: invokespecial   java/lang/String.<init>:([C)V
        //   109: invokevirtual   java/lang/String.length:()I
        //   112: goto            116
        //   115: athrow         
        //   116: iload           5
        //   118: ifne            129
        //   121: ifeq            226
        //   124: goto            128
        //   127: athrow         
        //   128: iconst_0       
        //   129: istore_3       
        //   130: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //   133: aload_0        
        //   134: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //   137: invokevirtual   javax/swing/JTextField.getText:()Ljava/lang/String;
        //   140: new             Ljava/lang/String;
        //   143: dup            
        //   144: aload_0        
        //   145: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //   148: invokevirtual   javax/swing/JPasswordField.getPassword:()[C
        //   151: invokespecial   java/lang/String.<init>:([C)V
        //   154: ldc             ""
        //   156: invokevirtual   org/powerbot/v.a:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z
        //   159: istore_3       
        //   160: goto            165
        //   163: astore          4
        //   165: aload_0        
        //   166: iload           5
        //   168: ifne            206
        //   171: iload_3        
        //   172: invokespecial   org/powerbot/pb.a:(Z)V
        //   175: iload_3        
        //   176: ifeq            201
        //   179: goto            183
        //   182: athrow         
        //   183: aload_0        
        //   184: iconst_0       
        //   185: invokevirtual   org/powerbot/pb.setVisible:(Z)V
        //   188: aload_0        
        //   189: invokevirtual   org/powerbot/pb.dispose:()V
        //   192: iload           5
        //   194: ifeq            226
        //   197: goto            201
        //   200: athrow         
        //   201: aload_0        
        //   202: goto            206
        //   205: athrow         
        //   206: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   209: iconst_3       
        //   210: aaload         
        //   211: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   214: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   217: iconst_2       
        //   218: aaload         
        //   219: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   222: iconst_0       
        //   223: invokestatic    javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
        //   226: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //   229: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   232: iconst_5       
        //   233: aaload         
        //   234: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   237: aload_0        
        //   238: invokevirtual   org/powerbot/pb.getTitle:()Ljava/lang/String;
        //   241: invokevirtual   org/powerbot/hb.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   244: iload           5
        //   246: ifeq            320
        //   249: aload_0        
        //   250: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //   253: iload           5
        //   255: ifne            324
        //   258: goto            262
        //   261: athrow         
        //   262: invokevirtual   javax/swing/JButton.getText:()Ljava/lang/String;
        //   265: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   268: iconst_4       
        //   269: aaload         
        //   270: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   273: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   276: goto            280
        //   279: athrow         
        //   280: ifeq            320
        //   283: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //   286: invokevirtual   org/powerbot/v.e:()V
        //   289: iconst_1       
        //   290: invokestatic    org/powerbot/yb.a:(Z)V
        //   293: aload_0        
        //   294: iconst_0       
        //   295: invokespecial   org/powerbot/pb.a:(Z)V
        //   298: invokestatic    org/powerbot/hb.a:()Lorg/powerbot/hb;
        //   301: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   304: iconst_1       
        //   305: aaload         
        //   306: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   309: aload_0        
        //   310: invokevirtual   org/powerbot/pb.getTitle:()Ljava/lang/String;
        //   313: invokevirtual   org/powerbot/hb.b:(Ljava/lang/String;Ljava/lang/String;)V
        //   316: goto            320
        //   319: athrow         
        //   320: aload_0        
        //   321: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //   324: iconst_1       
        //   325: invokevirtual   javax/swing/JButton.setEnabled:(Z)V
        //   328: new             Ljava/lang/Thread;
        //   331: dup            
        //   332: new             Lorg/powerbot/pb$2;
        //   335: dup            
        //   336: aload_0        
        //   337: invokespecial   org/powerbot/pb$2.<init>:(Lorg/powerbot/pb;)V
        //   340: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
        //   343: invokevirtual   java/lang/Thread.start:()V
        //   346: return         
        //    StackMapTable: 00 21 FF 00 1A 00 06 07 00 7C 07 00 FA 07 01 D3 00 00 01 00 01 07 00 6C 00 4A 07 00 6C 00 5C 07 00 6C 00 51 07 00 6C 40 01 45 07 00 6C 00 53 07 00 6C 40 01 4A 07 00 6C 00 40 01 FF 00 21 00 06 07 00 7C 07 00 FA 07 01 D3 01 00 01 00 01 07 00 6C 01 50 07 00 6C 00 50 07 00 6C 00 43 07 00 6C 40 07 00 7C FF 00 13 00 06 07 00 7C 07 00 FA 07 01 D3 00 00 01 00 00 16 4B 07 00 6C 40 07 00 12 50 07 00 6C 40 01 66 07 00 6C 00 43 07 00 12 15
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  116    124    127    128    Ljava/io/IOException;
        //  88     112    115    116    Ljava/io/IOException;
        //  69     91     94     95     Ljava/io/IOException;
        //  62     84     87     88     Ljava/io/IOException;
        //  39     65     68     69     Ljava/io/IOException;
        //  15     35     38     39     Ljava/io/IOException;
        //  10     23     26     27     Ljava/io/IOException;
        //  130    160    163    165    Ljava/io/IOException;
        //  280    316    319    320    Ljava/io/IOException;
        //  249    276    279    280    Ljava/io/IOException;
        //  226    258    261    262    Ljava/io/IOException;
        //  183    202    205    206    Ljava/io/IOException;
        //  171    197    200    201    Ljava/io/IOException;
        //  165    179    182    183    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0069:
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
    
    private void a(final boolean p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore_2       
        //     4: iload_2        
        //     5: ifne            146
        //     8: iload_1        
        //     9: ifeq            95
        //    12: goto            16
        //    15: athrow         
        //    16: aload_0        
        //    17: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //    20: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //    23: invokevirtual   org/powerbot/v.c:()Lorg/powerbot/v$a_;
        //    26: invokevirtual   org/powerbot/v$a_.e:()Ljava/lang/String;
        //    29: invokevirtual   javax/swing/JTextField.setText:(Ljava/lang/String;)V
        //    32: aload_0        
        //    33: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //    36: iconst_0       
        //    37: invokevirtual   javax/swing/JTextField.setEnabled:(Z)V
        //    40: aload_0        
        //    41: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //    44: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //    47: bipush          6
        //    49: aaload         
        //    50: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //    53: invokevirtual   javax/swing/JPasswordField.setText:(Ljava/lang/String;)V
        //    56: aload_0        
        //    57: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //    60: iconst_0       
        //    61: invokevirtual   javax/swing/JPasswordField.setEnabled:(Z)V
        //    64: aload_0        
        //    65: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //    68: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //    71: iconst_4       
        //    72: aaload         
        //    73: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //    76: invokevirtual   javax/swing/JButton.setText:(Ljava/lang/String;)V
        //    79: aload_0        
        //    80: getfield        org/powerbot/pb.f:Ljavax/swing/JLabel;
        //    83: iconst_0       
        //    84: invokevirtual   javax/swing/JLabel.setVisible:(Z)V
        //    87: iload_2        
        //    88: ifeq            154
        //    91: goto            95
        //    94: athrow         
        //    95: aload_0        
        //    96: getfield        org/powerbot/pb.b:Ljavax/swing/JButton;
        //    99: getstatic       org/powerbot/pb.z:[Ljava/lang/String;
        //   102: iconst_0       
        //   103: aaload         
        //   104: invokestatic    org/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   107: invokevirtual   javax/swing/JButton.setText:(Ljava/lang/String;)V
        //   110: aload_0        
        //   111: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //   114: aconst_null    
        //   115: invokevirtual   javax/swing/JTextField.setText:(Ljava/lang/String;)V
        //   118: aload_0        
        //   119: getfield        org/powerbot/pb.i:Ljavax/swing/JTextField;
        //   122: iconst_1       
        //   123: invokevirtual   javax/swing/JTextField.setEnabled:(Z)V
        //   126: aload_0        
        //   127: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //   130: aconst_null    
        //   131: invokevirtual   javax/swing/JPasswordField.setText:(Ljava/lang/String;)V
        //   134: aload_0        
        //   135: getfield        org/powerbot/pb.j:Ljavax/swing/JPasswordField;
        //   138: iconst_1       
        //   139: invokevirtual   javax/swing/JPasswordField.setEnabled:(Z)V
        //   142: goto            146
        //   145: athrow         
        //   146: aload_0        
        //   147: getfield        org/powerbot/pb.f:Ljavax/swing/JLabel;
        //   150: iconst_1       
        //   151: invokevirtual   javax/swing/JLabel.setVisible:(Z)V
        //   154: return         
        //    StackMapTable: 00 07 FF 00 0F 00 03 07 00 7C 01 01 00 01 07 01 C3 00 F7 00 4D 07 01 C3 00 71 07 01 C3 00 07
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  16     142    145    146    Ljava/lang/RuntimeException;
        //  8      91     94     95     Ljava/lang/RuntimeException;
        //  4      12     15     16     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
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
        final String[] z2 = new String[14];
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 0))))))))))));
        String s = "PNq\\*\u001e=";
        int n15 = -1;
        String intern = null;
    Label_0182_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n17;
            final int n16 = n17 = (length = charArray.length);
            int n18 = 0;
            while (true) {
                Label_0258: {
                    if (n16 > 1) {
                        break Label_0258;
                    }
                    length = (n17 = n18);
                    do {
                        final char c = charArray[n17];
                        char c2 = '\0';
                        switch (n18 % 5) {
                            case 0: {
                                c2 = 'I';
                                break;
                            }
                            case 1: {
                                c2 = '\u0019';
                                break;
                            }
                            case 2: {
                                c2 = '\\';
                                break;
                            }
                            case 3: {
                                c2 = '\f';
                                break;
                            }
                            default: {
                                c2 = '@';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n18;
                    } while (n16 == 0);
                }
                if (n16 > n18) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n15) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 1)))))))))))));
                    s = "pNq\\c\u0019|\u000e)\u0019lRb";
                    n15 = 0;
                    continue Label_0182_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 2)))))))))))));
                    s = "FUd]x";
                    n15 = 1;
                    continue Label_0182_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 3)))))))))))));
                    s = "JI`Sf\u001e7B3\rfUxSg\u0012s\r4^sFeA}\u0018!\u0006h";
                    n15 = 2;
                    continue Label_0182_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 4)))))))))))));
                    s = "$:\u0005(^lRb";
                    n15 = 3;
                    continue Label_0182_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 5)))))))))))));
                    s = "\u0004:\u0005(\u0017m\bz]m\u001e=";
                    n15 = 4;
                    continue Label_0182_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 6)))))))))))));
                    s = "]yHlT)\r<";
                    n15 = 5;
                    continue Label_0182_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 7)))))))))))));
                    s = "?Ob_fIo\u0001#\u0010wBd\fY\u001e4\ff\u0017m\u0007b]*\u000e<\u00174^sHaWx\u0015<\u0016h\u0011q@6Si\u0014<\u0017(\n#Sy\u0012k\u00140\u00075\r#^yGxW \u00014\u0017sS6Qe\u001b?\u0007%\njHx\u000e%\u00146\f2\u001bq\u0019*\u001db\u0003>\u000ex";
                    n15 = 6;
                    continue Label_0182_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 8)))))))))))));
                    s = "VTs@d\u0016>\u0007f\u0011q\u0007s_k\u001e?";
                    n15 = 7;
                    continue Label_0182_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 9)))))))))))));
                    s = "'2\u00115\tlUr";
                    n15 = 8;
                    continue Label_0182_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 10)))))))))))));
                    s = "?Ob_fIo\u0003f\u0016qBp\u000f-Tt\\\u0014\u001bdNeFo\u0005oM'@?\b~Fg\u001bm";
                    n15 = 9;
                    continue Label_0182_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 11)))))))))))));
                    s = ">t\u0014#^eHdUe\u0003'\u0007(^n^6Bk\u0004 \u0015)\fg";
                    n15 = 10;
                    continue Label_0182_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 12)))))))))))));
                    s = "pNq\\c\u0019|";
                    n15 = 11;
                    continue Label_0182_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 13)))))))))))));
                    s = "PNq\\*\u001e=B2\u0011#WyEo\u00051\r2PlUq";
                    n15 = 12;
                    continue Label_0182_Outer;
                }
                case 12: {
                    break Label_0182_Outer;
                }
            }
        }
        z2[n14] = intern;
        z = z2;
    }
}
