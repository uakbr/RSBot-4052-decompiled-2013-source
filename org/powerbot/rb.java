
package org.powerbot;

import java.util.Arrays;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.FocusListener;
import org.powerbot.game.bot.handler.input.a;
import java.awt.event.FocusEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import java.awt.Color;
import org.powerbot.core.script.internal.wrappers.HashTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Dimension;
import org.powerbot.core.script.util.Timer;
import org.powerbot.core.script.job.Task;
import org.powerbot.game.api.methods.Settings;
import org.powerbot.game.bot.Context;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.HashMap;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;

public class rb extends JFrame
{
    private static final long serialVersionUID = 1L;
    private static rb a;
    private final SimpleDateFormat b;
    private int c;
    private int[] d;
    private boolean e;
    private final HashMap<Integer, String> f;
    private String[] g;
    private JTextArea h;
    private JTextArea i;
    private JScrollPane j;
    private JList<String> k;
    private static final String[] z;
    
    private rb() {
        this.b = new SimpleDateFormat(t.b(rb.z[19]));
        this.c = -1;
        this.d = null;
        this.e = false;
        this.f = new HashMap<Integer, String>();
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.e();
    }
    
    private static rb a() {
        Label_0016: {
            rb rb;
            try {
                final rb rb2;
                rb = (rb2 = org.powerbot.rb.a);
                if (qb.f) {
                    return rb2;
                }
                if (rb == null) {
                    break Label_0016;
                }
                return org.powerbot.rb.a;
            }
            catch (NullPointerException ex) {
                throw ex;
            }
            try {
                if (rb == null) {
                    org.powerbot.rb.a = new rb();
                }
            }
            catch (NullPointerException ex2) {
                throw ex2;
            }
        }
        return rb.a;
    }
    
    public static void a(final Context context) {
        final rb a = a();
        Label_0045: {
            Label_0021: {
                rb rb;
                try {
                    final rb rb2;
                    rb = (rb2 = a);
                    if (qb.f) {
                        break Label_0045;
                    }
                    final boolean b = rb.isVisible();
                    if (b) {
                        break Label_0021;
                    }
                    break Label_0021;
                }
                catch (NullPointerException ex) {
                    throw ex;
                }
                try {
                    final boolean b = rb.isVisible();
                    if (b) {
                        a.b();
                    }
                }
                catch (NullPointerException ex2) {
                    throw ex2;
                }
            }
            a.setVisible(true);
            try {
                context.associate(Thread.currentThread().getThreadGroup());
                final rb rb2 = a;
                rb2.d = Settings.get();
                context.disregard(Thread.currentThread().getThreadGroup());
            }
            catch (NullPointerException ex3) {}
        }
        new Thread(context.getThreadGroup(), new Runnable() {
            @Override
            public void run() {
                final boolean f = qb.f;
                while (a.isVisible()) {
                    rb.this.c();
                    Task.sleep(100);
                    if (f) {
                        break;
                    }
                }
            }
        }).start();
    }
    
    private void b() {
        this.i.setText("");
    }
    
    private void c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          5
        //     5: invokestatic    org/powerbot/game/api/methods/Settings.get:()[I
        //     8: astore_1       
        //     9: aload_0        
        //    10: iload           5
        //    12: ifne            33
        //    15: getfield        org/powerbot/rb.d:[I
        //    18: ifnonnull       32
        //    21: goto            25
        //    24: athrow         
        //    25: aload_0        
        //    26: aload_1        
        //    27: putfield        org/powerbot/rb.d:[I
        //    30: return         
        //    31: athrow         
        //    32: aload_0        
        //    33: getfield        org/powerbot/rb.b:Ljava/text/SimpleDateFormat;
        //    36: new             Ljava/util/Date;
        //    39: dup            
        //    40: invokespecial   java/util/Date.<init>:()V
        //    43: invokevirtual   java/text/SimpleDateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //    46: astore_2       
        //    47: iconst_0       
        //    48: istore_3       
        //    49: iload_3        
        //    50: aload_1        
        //    51: arraylength    
        //    52: if_icmpge       248
        //    55: aload_0        
        //    56: getfield        org/powerbot/rb.d:[I
        //    59: iload_3        
        //    60: iaload         
        //    61: istore          4
        //    63: iload           5
        //    65: ifne            243
        //    68: iload           4
        //    70: iload           5
        //    72: ifne            250
        //    75: goto            79
        //    78: athrow         
        //    79: aload_1        
        //    80: iload_3        
        //    81: iaload         
        //    82: if_icmpeq       240
        //    85: goto            89
        //    88: athrow         
        //    89: aload_0        
        //    90: iload           5
        //    92: ifne            239
        //    95: goto            99
        //    98: athrow         
        //    99: invokespecial   org/powerbot/rb.d:()Z
        //   102: ifne            227
        //   105: goto            109
        //   108: athrow         
        //   109: aload_0        
        //   110: getfield        org/powerbot/rb.i:Ljavax/swing/JTextArea;
        //   113: new             Ljava/lang/StringBuilder;
        //   116: dup            
        //   117: invokespecial   java/lang/StringBuilder.<init>:()V
        //   120: ldc_w           "x"
        //   123: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: aload_2        
        //   130: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   133: getstatic       org/powerbot/rb.z:[Ljava/lang/String;
        //   136: iconst_0       
        //   137: aaload         
        //   138: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: iload_3        
        //   145: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   148: getstatic       org/powerbot/rb.z:[Ljava/lang/String;
        //   151: iconst_4       
        //   152: aaload         
        //   153: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: aload_0        
        //   160: iload           4
        //   162: invokespecial   org/powerbot/rb.a:(I)Ljava/lang/String;
        //   165: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   168: getstatic       org/powerbot/rb.z:[Ljava/lang/String;
        //   171: iconst_3       
        //   172: aaload         
        //   173: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   176: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   179: aload_0        
        //   180: aload_1        
        //   181: iload_3        
        //   182: iaload         
        //   183: invokespecial   org/powerbot/rb.a:(I)Ljava/lang/String;
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: ldc             ")"
        //   191: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   194: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   197: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   200: invokevirtual   javax/swing/JTextArea.append:(Ljava/lang/String;)V
        //   203: aload_0        
        //   204: getfield        org/powerbot/rb.j:Ljavax/swing/JScrollPane;
        //   207: invokevirtual   javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
        //   210: aload_0        
        //   211: getfield        org/powerbot/rb.j:Ljavax/swing/JScrollPane;
        //   214: invokevirtual   javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
        //   217: invokevirtual   javax/swing/JScrollBar.getMaximum:()I
        //   220: invokevirtual   javax/swing/JScrollBar.setValue:(I)V
        //   223: goto            227
        //   226: athrow         
        //   227: aload_0        
        //   228: getfield        org/powerbot/rb.f:Ljava/util/HashMap;
        //   231: iload_3        
        //   232: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   235: aload_2        
        //   236: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   239: pop            
        //   240: iinc            3, 1
        //   243: iload           5
        //   245: ifeq            49
        //   248: aload_1        
        //   249: arraylength    
        //   250: anewarray       Ljava/lang/String;
        //   253: astore_3       
        //   254: iconst_0       
        //   255: istore          4
        //   257: iload           4
        //   259: aload_3        
        //   260: arraylength    
        //   261: if_icmpge       362
        //   264: aload_3        
        //   265: iload           4
        //   267: new             Ljava/lang/StringBuilder;
        //   270: dup            
        //   271: invokespecial   java/lang/StringBuilder.<init>:()V
        //   274: iload           4
        //   276: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   279: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   282: getstatic       org/powerbot/rb.z:[Ljava/lang/String;
        //   285: iconst_2       
        //   286: aaload         
        //   287: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   290: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   293: aload_1        
        //   294: iload           4
        //   296: iaload         
        //   297: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   300: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   303: getstatic       org/powerbot/rb.z:[Ljava/lang/String;
        //   306: iconst_1       
        //   307: aaload         
        //   308: invokestatic    org/powerbot/core/script/util/Timer.e:(Ljava/lang/String;)Ljava/lang/String;
        //   311: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   314: aload_0        
        //   315: getfield        org/powerbot/rb.f:Ljava/util/HashMap;
        //   318: iload           4
        //   320: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   323: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   326: checkcast       Ljava/lang/String;
        //   329: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   332: ldc_w           "J"
        //   335: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
        //   338: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   341: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   344: aastore        
        //   345: iinc            4, 1
        //   348: iload           5
        //   350: ifne            447
        //   353: iload           5
        //   355: ifeq            257
        //   358: goto            362
        //   361: athrow         
        //   362: aload_0        
        //   363: iload           5
        //   365: ifne            441
        //   368: invokespecial   org/powerbot/rb.d:()Z
        //   371: ifne            416
        //   374: goto            378
        //   377: athrow         
        //   378: aload_3        
        //   379: aload_0        
        //   380: getfield        org/powerbot/rb.g:[Ljava/lang/String;
        //   383: invokestatic    java/util/Arrays.equals:([Ljava/lang/Object;[Ljava/lang/Object;)Z
        //   386: ifne            416
        //   389: goto            393
        //   392: athrow         
        //   393: aload_0        
        //   394: getfield        org/powerbot/rb.k:Ljavax/swing/JList;
        //   397: aload_3        
        //   398: invokevirtual   javax/swing/JList.setListData:([Ljava/lang/Object;)V
        //   401: aload_0        
        //   402: getfield        org/powerbot/rb.k:Ljavax/swing/JList;
        //   405: aload_0        
        //   406: getfield        org/powerbot/rb.c:I
        //   409: invokevirtual   javax/swing/JList.setSelectedIndex:(I)V
        //   412: goto            416
        //   415: athrow         
        //   416: aload_0        
        //   417: aload_3        
        //   418: putfield        org/powerbot/rb.g:[Ljava/lang/String;
        //   421: aload_0        
        //   422: aload_1        
        //   423: putfield        org/powerbot/rb.d:[I
        //   426: aload_0        
        //   427: getfield        org/powerbot/rb.k:Ljavax/swing/JList;
        //   430: invokevirtual   javax/swing/JList.repaint:()V
        //   433: aload_0        
        //   434: getfield        org/powerbot/rb.i:Ljavax/swing/JTextArea;
        //   437: invokevirtual   javax/swing/JTextArea.repaint:()V
        //   440: aload_0        
        //   441: getfield        org/powerbot/rb.h:Ljavax/swing/JTextArea;
        //   444: invokevirtual   javax/swing/JTextArea.repaint:()V
        //   447: return         
        //    StackMapTable: 00 20 FF 00 18 00 06 07 00 14 07 01 F1 00 00 00 01 00 01 07 00 1E 00 45 07 00 1E 00 40 07 00 14 FF 00 0F 00 06 07 00 14 07 01 F1 07 00 37 01 00 01 00 00 FF 00 1C 00 06 07 00 14 07 01 F1 07 00 37 01 01 01 00 01 07 00 1E 40 01 48 07 00 1E 00 48 07 00 1E 40 07 00 14 48 07 00 1E 00 F7 00 74 07 00 1E 00 4B 07 01 F2 00 02 FF 00 04 00 06 07 00 14 07 01 F1 07 00 37 01 00 01 00 00 41 01 FF 00 06 00 06 07 00 14 07 01 F1 07 00 37 07 01 F4 01 01 00 00 F7 00 67 07 00 1E 00 4E 07 00 1E 00 4D 07 00 1E 00 55 07 00 1E 00 58 07 00 14 05
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  378    412    415    416    Ljava/lang/NullPointerException;
        //  368    389    392    393    Ljava/lang/NullPointerException;
        //  362    374    377    378    Ljava/lang/NullPointerException;
        //  264    358    361    362    Ljava/lang/NullPointerException;
        //  99     223    226    227    Ljava/lang/NullPointerException;
        //  89     105    108    109    Ljava/lang/NullPointerException;
        //  79     95     98     99     Ljava/lang/NullPointerException;
        //  68     85     88     89     Ljava/lang/NullPointerException;
        //  63     75     78     79     Ljava/lang/NullPointerException;
        //  15     31     31     32     Ljava/lang/NullPointerException;
        //  9      21     24     25     Ljava/lang/NullPointerException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0079:
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
    
    private boolean d() {
        return this.e;
    }
    
    private String a(final int n) {
        return n + Timer.e(rb.z[18]) + Integer.toHexString(n) + t.b(">");
    }
    
    private void e() {
        this.setTitle(Timer.e(rb.z[6]));
        this.setIconImage(db.b(t.b(rb.z[10])));
        this.setResizable(false);
        this.setPreferredSize(new Dimension(595, 335));
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent windowEvent) {
                try {
                    rb.this.b();
                    rb.this.setVisible(false);
                }
                catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        final Font font = new Font(Timer.e(rb.z[14]), 0, 12);
        final JPanel contentPane = new JPanel();
        this.setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        final JPanel comp = new JPanel();
        comp.setLayout(new BorderLayout());
        contentPane.add(comp, t.b(rb.z[12]));
        (this.k = new JList<String>()).setFont(font);
        this.k.setSelectionMode(0);
        this.k.addListSelectionListener(new ListSelectionListener() {
            private static final String[] z;
            
            @Override
            public void valueChanged(final ListSelectionEvent listSelectionEvent) {
                final boolean f = qb.f;
                int valueIsAdjusting = 0;
                Label_0059: {
                    int access$200 = 0;
                    Label_0048: {
                        Label_0019: {
                            int n;
                            try {
                                n = (access$200 = (valueIsAdjusting = (listSelectionEvent.getValueIsAdjusting() ? 1 : 0)));
                                if (f) {
                                    break Label_0048;
                                }
                                if (n == 0) {
                                    break Label_0019;
                                }
                                return;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                if (n != 0) {
                                    return;
                                }
                                rb.this.c = ((JList)listSelectionEvent.getSource()).getSelectedIndex();
                                valueIsAdjusting = (access$200 = rb.this.c);
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        try {
                            if (f) {
                                break Label_0059;
                            }
                            if (access$200 >= 0) {
                                break Label_0059;
                            }
                            return;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    try {
                        if (access$200 < 0) {
                            return;
                        }
                        valueIsAdjusting = rb.this.d[rb.this.c];
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                final int i = valueIsAdjusting;
                rb.this.h.setText("");
                rb.this.h.append(kb.a(rb$4.z[0]) + rb.this.c + HashTable.e("6"));
                rb.this.h.append(kb.a(rb$4.z[3]) + i + HashTable.e("6"));
                rb.this.h.append(kb.a(rb$4.z[1]) + Integer.toHexString(i) + HashTable.e("6"));
                rb.this.h.append(kb.a(rb$4.z[2]) + Integer.toBinaryString(i) + HashTable.e("6"));
                rb.this.h.append(kb.a(rb$4.z[4]) + rb.this.f.get(rb.this.c) + HashTable.e("6"));
                rb.this.h.repaint();
            }
            
            static {
                final String[] z2 = new String[5];
                int n5;
                int n4;
                int n3;
                int n2;
                int n = n2 = (n3 = (n4 = (n5 = 0)));
                String s = "MYDk01\u001aK~";
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
                                        c2 = 'H';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '+';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'f';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\b';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u000f';
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
                            s = "VYH%yo\u0005";
                            n6 = 0;
                            continue Label_0071_Outer;
                        }
                        case 0: {
                            z2[n] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = 2))));
                            s = "\u001d\u0014\u001f?jg\u0006\u0010";
                            n6 = 1;
                            continue Label_0071_Outer;
                        }
                        case 1: {
                            z2[n3] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = 3))));
                            s = "H]\\j<e]";
                            n6 = 2;
                            continue Label_0071_Outer;
                        }
                        case 2: {
                            z2[n4] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = 4))));
                            s = "\u0013\u001c\u0002*8}TQq>:\u0019K~";
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
        });
        final JScrollPane comp2 = new JScrollPane(this.k, 20, 31);
        final Dimension dimension = new Dimension(160, 258);
        comp2.setPreferredSize(dimension);
        comp2.setMaximumSize(dimension);
        comp2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        comp.add(comp2, Timer.e(rb.z[8]));
        final JPanel comp3 = new JPanel();
        comp3.setLayout(new BorderLayout());
        comp.add(comp3, t.b(rb.z[7]));
        final a_ comp4 = new a_(Timer.e(rb.z[16]));
        comp4.setToolTipText(t.b(rb.z[9]));
        comp4.setBackground(new Color(230, 230, 230));
        comp4.setForeground(Color.DARK_GRAY);
        comp4.setPreferredSize(new Dimension(160, 25));
        comp4.addKeyListener(new KeyAdapter() {
            private boolean a = false;
            private static final String[] z;
            
            @Override
            public void keyPressed(final KeyEvent p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     3: istore_3       
                //     4: aload_0        
                //     5: getfield        org/powerbot/rb$3.val$gotoField:Lorg/powerbot/rb$a_;
                //     8: getstatic       java/awt/Color.BLACK:Ljava/awt/Color;
                //    11: invokevirtual   org/powerbot/rb$a_.setForeground:(Ljava/awt/Color;)V
                //    14: aload_0        
                //    15: getfield        org/powerbot/rb$3.a:Z
                //    18: iload_3        
                //    19: ifne            51
                //    22: ifeq            47
                //    25: goto            29
                //    28: athrow         
                //    29: aload_0        
                //    30: getfield        org/powerbot/rb$3.val$gotoField:Lorg/powerbot/rb$a_;
                //    33: ldc             ""
                //    35: invokevirtual   org/powerbot/rb$a_.setText:(Ljava/lang/String;)V
                //    38: aload_0        
                //    39: iconst_0       
                //    40: putfield        org/powerbot/rb$3.a:Z
                //    43: goto            47
                //    46: athrow         
                //    47: aload_1        
                //    48: invokevirtual   java/awt/event/KeyEvent.getKeyCode:()I
                //    51: iload_3        
                //    52: ifne            89
                //    55: bipush          10
                //    57: if_icmpne       222
                //    60: goto            64
                //    63: athrow         
                //    64: aload_0        
                //    65: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //    68: aload_0        
                //    69: getfield        org/powerbot/rb$3.val$gotoField:Lorg/powerbot/rb$a_;
                //    72: invokevirtual   org/powerbot/rb$a_.getText:()Ljava/lang/String;
                //    75: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
                //    78: invokestatic    org/powerbot/rb.access$202:(Lorg/powerbot/rb;I)I
                //    81: pop            
                //    82: aload_0        
                //    83: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //    86: invokestatic    org/powerbot/rb.access$200:(Lorg/powerbot/rb;)I
                //    89: iload_3        
                //    90: ifne            119
                //    93: iflt            137
                //    96: goto            100
                //    99: athrow         
                //   100: aload_0        
                //   101: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   104: iload_3        
                //   105: ifne            175
                //   108: goto            112
                //   111: athrow         
                //   112: invokestatic    org/powerbot/rb.access$200:(Lorg/powerbot/rb;)I
                //   115: goto            119
                //   118: athrow         
                //   119: aload_0        
                //   120: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   123: invokestatic    org/powerbot/rb.access$700:(Lorg/powerbot/rb;)Ljavax/swing/JList;
                //   126: invokevirtual   javax/swing/JList.getModel:()Ljavax/swing/ListModel;
                //   129: invokeinterface javax/swing/ListModel.getSize:()I
                //   134: if_icmple       154
                //   137: new             Ljava/lang/Exception;
                //   140: dup            
                //   141: getstatic       org/powerbot/rb$3.z:[Ljava/lang/String;
                //   144: iconst_1       
                //   145: aaload         
                //   146: invokestatic    org/powerbot/game/api/util/Time.e:(Ljava/lang/String;)Ljava/lang/String;
                //   149: invokespecial   java/lang/Exception.<init>:(Ljava/lang/String;)V
                //   152: athrow         
                //   153: athrow         
                //   154: aload_0        
                //   155: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   158: invokestatic    org/powerbot/rb.access$700:(Lorg/powerbot/rb;)Ljavax/swing/JList;
                //   161: aload_0        
                //   162: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   165: invokestatic    org/powerbot/rb.access$200:(Lorg/powerbot/rb;)I
                //   168: invokevirtual   javax/swing/JList.ensureIndexIsVisible:(I)V
                //   171: aload_0        
                //   172: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   175: invokestatic    org/powerbot/rb.access$700:(Lorg/powerbot/rb;)Ljavax/swing/JList;
                //   178: aload_0        
                //   179: getfield        org/powerbot/rb$3.this$0:Lorg/powerbot/rb;
                //   182: invokestatic    org/powerbot/rb.access$200:(Lorg/powerbot/rb;)I
                //   185: invokevirtual   javax/swing/JList.setSelectedIndex:(I)V
                //   188: goto            222
                //   191: astore_2       
                //   192: aload_0        
                //   193: iconst_1       
                //   194: putfield        org/powerbot/rb$3.a:Z
                //   197: aload_0        
                //   198: getfield        org/powerbot/rb$3.val$gotoField:Lorg/powerbot/rb$a_;
                //   201: getstatic       org/powerbot/rb$3.z:[Ljava/lang/String;
                //   204: iconst_0       
                //   205: aaload         
                //   206: invokestatic    org/powerbot/core/bot/handlers/ScriptHandler.e:(Ljava/lang/String;)Ljava/lang/String;
                //   209: invokevirtual   org/powerbot/rb$a_.setText:(Ljava/lang/String;)V
                //   212: aload_0        
                //   213: getfield        org/powerbot/rb$3.val$gotoField:Lorg/powerbot/rb$a_;
                //   216: getstatic       java/awt/Color.RED:Ljava/awt/Color;
                //   219: invokevirtual   org/powerbot/rb$a_.setForeground:(Ljava/awt/Color;)V
                //   222: return         
                //    StackMapTable: 00 14 FF 00 1C 00 04 07 00 16 07 00 32 00 01 00 01 07 00 11 00 50 07 00 11 00 43 01 4B 07 00 11 00 58 01 49 07 00 11 00 4A 07 00 11 40 07 00 27 45 07 00 11 40 01 11 4F 07 00 11 00 54 07 00 27 4F 07 00 11 1E
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  119    153    153    154    Ljava/lang/Exception;
                //  100    115    118    119    Ljava/lang/Exception;
                //  93     108    111    112    Ljava/lang/Exception;
                //  89     96     99     100    Ljava/lang/Exception;
                //  51     60     63     64     Ljava/lang/Exception;
                //  22     43     46     47     Ljava/lang/Exception;
                //  4      25     28     29     Ljava/lang/Exception;
                //  64     188    191    222    Ljava/lang/Exception;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0100:
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
            
            static {
                final String[] z2 = new String[2];
                int n2;
                int n = n2 = 0;
                String s = "=)!N5\u001c\"";
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
                                        c2 = '*';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0018';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '\t';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'p';
                                        break;
                                    }
                                    default: {
                                        c2 = '\u0007';
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
                            s = "wkK\f_^H4#ujj";
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
        });
        comp4.addFocusListener(new FocusAdapter() {
            private static final String[] z;
            
            @Override
            public void focusGained(final FocusEvent focusEvent) {
                final String text = comp4.getText();
                Label_0052: {
                    boolean b2 = false;
                    Label_0033: {
                        boolean b;
                        try {
                            b = (b2 = text.equals(org.powerbot.game.bot.handler.input.a.a(rb$2.z[0])));
                            if (qb.f) {
                                break Label_0052;
                            }
                            if (!b) {
                                break Label_0033;
                            }
                            break Label_0052;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            if (b) {
                                break Label_0052;
                            }
                            b2 = text.equals(t.b(rb$2.z[1]));
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (b2) {
                            comp4.setText("");
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
            }
            
            @Override
            public void focusLost(final FocusEvent focusEvent) {
                a_ a_2 = null;
                Label_0023: {
                    a_ a_;
                    try {
                        a_ = (a_2 = comp4);
                        if (qb.f) {
                            break Label_0023;
                        }
                        final String s = a_.getText();
                        final boolean b = s.isEmpty();
                        if (b) {
                            break Label_0023;
                        }
                        return;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final String s = a_.getText();
                        final boolean b = s.isEmpty();
                        if (!b) {
                            return;
                        }
                        comp4.setForeground(Color.DARK_GRAY);
                        a_2 = comp4;
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                a_2.setText(org.powerbot.game.bot.handler.input.a.a(rb$2.z[0]));
            }
            
            static {
                final String[] z2 = new String[2];
                int n2;
                int n = n2 = 0;
                String s = "\u0007k_Ji@\u0004";
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
                                        c2 = 'Z';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '0';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '1';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u0011';
                                        break;
                                    }
                                    default: {
                                        c2 = ']';
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
                            s = "\u00046P\u0018&[C";
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
        });
        comp3.add(comp4, Timer.e(rb.z[8]));
        final JButton comp5 = new JButton(t.b(rb.z[15]));
        comp5.setPreferredSize(new Dimension(160, 25));
        comp5.addActionListener(new ActionListener() {
            private static final String[] z;
            
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                JButton val$pauseButton = null;
                String text = null;
                Label_0067: {
                    Label_0029: {
                        rb this$0 = null;
                        boolean access$800 = false;
                        Label_0028: {
                            Label_0025: {
                                try {
                                    this$0 = rb.this;
                                    access$800 = rb.this.e;
                                    if (qb.f) {
                                        break Label_0025;
                                    }
                                    if (access$800) {
                                        break Label_0028;
                                    }
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                            }
                            break Label_0029;
                        }
                        try {
                            this$0.e = access$800;
                            val$pauseButton = comp5;
                            if (rb.this.e) {
                                text = eb.a(rb$6.z[0]);
                                break Label_0067;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    text = org.powerbot.game.bot.handler.input.a.a(rb$6.z[1]);
                }
                val$pauseButton.setText(text);
            }
            
            static {
                final String[] z2 = new String[2];
                int n2;
                int n = n2 = 0;
                String s = "\u0000_BeeY";
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
                                        c2 = '\'';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '!';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'D';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '\u000b';
                                        break;
                                    }
                                    default: {
                                        c2 = '}';
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
                            s = "mt+L\u0002";
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
        });
        comp3.add(comp5, Timer.e(rb.z[17]));
        final JPanel comp6 = new JPanel();
        comp6.setLayout(new BorderLayout());
        contentPane.add(comp6, t.b(rb.z[5]));
        (this.i = new JTextArea()).setFont(font);
        this.i.setLineWrap(true);
        this.i.setWrapStyleWord(true);
        this.i.setEditable(false);
        final Dimension dimension2 = new Dimension(429, 225);
        (this.j = new JScrollPane(this.i, 20, 31)).setPreferredSize(dimension2);
        this.j.setMaximumSize(dimension2);
        this.j.setBorder(BorderFactory.createMatteBorder(2, 1, 1, 1, Color.lightGray));
        comp6.add(this.j, Timer.e(rb.z[17]));
        (this.h = new JTextArea()).setFont(font);
        this.h.setEditable(false);
        this.h.setPreferredSize(new Dimension(429, 83));
        this.h.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.LIGHT_GRAY));
        comp6.add(this.h, t.b(rb.z[11]));
        this.pack();
        this.setLocationRelativeTo(this.getOwner());
        this.setVisible(false);
        hb.a().b(Timer.e(rb.z[13]), this.getTitle());
    }
    
    static {
        final String[] z2 = new String[20];
        int n20;
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 0))))))))))))))))));
        String s = "[5";
        int n21 = -1;
        String intern = null;
    Label_0254_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n23;
            final int n22 = n23 = (length = charArray.length);
            int n24 = 0;
            while (true) {
                Label_0329: {
                    if (n22 > 1) {
                        break Label_0329;
                    }
                    length = (n23 = n24);
                    do {
                        final char c = charArray[n23];
                        char c2 = '\0';
                        switch (n24 % 5) {
                            case 0: {
                                c2 = 'n';
                                break;
                            }
                            case 1: {
                                c2 = '\u0002';
                                break;
                            }
                            case 2: {
                                c2 = '+';
                                break;
                            }
                            case 3: {
                                c2 = 'd';
                                break;
                            }
                            default: {
                                c2 = 'k';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n24;
                    } while (n22 == 0);
                }
                if (n22 > n24) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n21) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 1)))))))))))))))))));
                    s = "Dz";
                    n21 = 0;
                    continue Label_0254_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 2)))))))))))))))))));
                    s = "<5";
                    n21 = 1;
                    continue Label_0254_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 3)))))))))))))))))));
                    s = "&8}S";
                    n21 = 2;
                    continue Label_0254_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 4)))))))))))))))))));
                    s = "m%(";
                    n21 = 3;
                    continue Label_0254_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 5)))))))))))))))))));
                    s = "Ct0\u0007";
                    n21 = 4;
                    continue Label_0254_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 6)))))))))))))))))));
                    s = "7DU3\b#o(+0\u0014MN5\u0004?";
                    n21 = 5;
                    continue Label_0254_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 7)))))))))))))))))));
                    s = "*\u0005Ix\u0014";
                    n21 = 6;
                    continue Label_0254_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 8)))))))))))))))))));
                    s = "\u0003gz\u001a ";
                    n21 = 7;
                    continue Label_0254_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 9)))))))))))))))))));
                    s = "Az7\u001c#*\u000fHx\u0015hr";
                    n21 = 8;
                    continue Label_0254_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 10)))))))))))))))))));
                    s = "tp0\u001cv\u000b\tY\u007fSox\"\u0014f\nE[`\u0005v}*\u0010l\u0017\u0019c=O0J \u001cd\u000e\u0002Yi\u0010(e-\u0014";
                    n21 = 9;
                    continue Label_0254_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 11)))))))))))))))))));
                    s = "7\u0005Nx\u0014";
                    n21 = 10;
                    continue Label_0254_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 12)))))))))))))))))));
                    s = "Qp0\u0007";
                    n21 = 11;
                    continue Label_0254_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 13)))))))))))))))))));
                    s = ">m|\u001a!\nFR\"\u0019=dg\u001c-\u0016\u000e";
                    n21 = 12;
                    continue Label_0254_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 14)))))))))))))))))));
                    s = " H@+\u000e*";
                    n21 = 13;
                    continue Label_0254_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 15)))))))))))))))))));
                    s = ")\u000bI\u007f\u0019";
                    n21 = 14;
                    continue Label_0254_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 16)))))))))))))))))));
                    s = "\ng|\u0001fJ\u000f";
                    n21 = 15;
                    continue Label_0254_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 17)))))))))))))))))));
                    s = "\u001eg}\u001a ";
                    n21 = 16;
                    continue Label_0254_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 18)))))))))))))))))));
                    s = "D\t\u0011?";
                    n21 = 17;
                    continue Label_0254_Outer;
                }
                case 17: {
                    z2[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 19)))))))))))))))))));
                    s = "N]y\u001enC\u0019O";
                    n21 = 18;
                    continue Label_0254_Outer;
                }
                case 18: {
                    break Label_0254_Outer;
                }
            }
        }
        z2[n20] = intern;
        z = z2;
    }
    
    private static class a_ extends JTextField
    {
        private static final long serialVersionUID = 1L;
        private static final int[] a;
        
        private a_(final String text) {
            super(text);
            Arrays.sort(a_.a);
        }
        
        public void processKeyEvent(final KeyEvent p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: ifne            47
            //     6: aload_1        
            //     7: invokevirtual   java/awt/event/KeyEvent.getKeyChar:()C
            //    10: invokestatic    java/lang/Character.isDigit:(C)Z
            //    13: ifne            38
            //    16: goto            20
            //    19: athrow         
            //    20: getstatic       org/powerbot/rb$a_.a:[I
            //    23: aload_1        
            //    24: invokevirtual   java/awt/event/KeyEvent.getKeyCode:()I
            //    27: invokestatic    java/util/Arrays.binarySearch:([II)I
            //    30: iconst_m1      
            //    31: if_icmpeq       48
            //    34: goto            38
            //    37: athrow         
            //    38: aload_0        
            //    39: aload_1        
            //    40: invokespecial   javax/swing/JTextField.processKeyEvent:(Ljava/awt/event/KeyEvent;)V
            //    43: goto            47
            //    46: athrow         
            //    47: return         
            //    48: aload_1        
            //    49: invokevirtual   java/awt/event/KeyEvent.consume:()V
            //    52: return         
            //    StackMapTable: 00 07 53 07 00 46 00 50 07 00 46 00 47 07 00 46 00 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  20     43     46     47     Ljava/lang/RuntimeException;
            //  6      34     37     38     Ljava/lang/RuntimeException;
            //  0      16     19     20     Ljava/lang/RuntimeException;
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
            a = new int[] { 10, 8, 127 };
        }
    }
}
