
package org.powerbot;

import java.awt.Image;
import java.util.HashMap;
import javax.swing.SwingUtilities;
import org.powerbot.core.script.job.Task;
import java.util.logging.Handler;
import java.util.logging.Logger;
import org.o;
import java.awt.event.MouseListener;
import org.t;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.logging.LogRecord;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class vb extends JPanel
{
    private static final long serialVersionUID = 1L;
    public final JLabel a;
    public final JLabel b;
    private static final Map<ThreadGroup, LogRecord> c;
    private ThreadGroup d;
    public final a_ e;
    private final d_ f;
    private static final String[] z;
    
    public vb(final Component component) {
        final boolean f = wb.f;
        this.d = null;
        this.setBackground(Color.BLACK);
        this.setLayout(new GridLayout(0, 1));
        final JPanel comp = new JPanel(new BorderLayout());
        final JPanel comp2 = new JPanel(new GridLayout(0, 1));
        final JPanel comp3 = new JPanel(new GridLayout(1, 0));
        comp.setBackground(this.getBackground());
        comp2.setBackground(this.getBackground());
        comp3.setBackground(this.getBackground());
        comp2.setBorder(BorderFactory.createEmptyBorder(25, 0, 25, 0));
        final JPanel comp4 = new JPanel();
        comp4.setPreferredSize(new Dimension(728, 120));
        comp4.setBackground(comp.getBackground());
        final xb comp5 = new xb();
        comp5.setBorder(new EmptyBorder(120 - comp5.getPreferredSize().height, 0, 0, 0));
        comp5.setPreferredSize(comp4.getPreferredSize());
        comp5.setBackground(comp.getBackground());
        final JLabel comp6 = new JLabel(new ImageIcon(db.b(eb.a(vb.z[2]))));
        boolean f2 = false;
        Label_0504: {
            Label_0498: {
                try {
                    comp6.setCursor(Cursor.getPredefinedCursor(12));
                    comp6.addMouseListener(new MouseAdapter() {
                        private static final String z;
                        
                        @Override
                        public void mouseClicked(final MouseEvent mouseEvent) {
                            qb.a(t.a(vb$2.z));
                        }
                        
                        static {
                            final char[] charArray = "lig4@ul:mS*m|3\u001f(!\"n\nkotk".toCharArray();
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
                                                c2 = ':';
                                                break;
                                            }
                                            case 1: {
                                                c2 = '}';
                                                break;
                                            }
                                            case 2: {
                                                c2 = '-';
                                                break;
                                            }
                                            case 3: {
                                                c2 = '$';
                                                break;
                                            }
                                            default: {
                                                c2 = 'D';
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
                    comp6.setHorizontalAlignment(4);
                    comp3.add(comp6);
                    (this.a = new JLabel()).setHorizontalAlignment(2);
                    this.a.setFont(this.a.getFont().deriveFont(1, 24.0f));
                    this.a.setForeground(Color.WHITE);
                    this.a.setBorder(BorderFactory.createEmptyBorder(0, 15, 0, 0));
                    comp3.add(this.a);
                    comp2.add(comp3);
                    (this.b = new JLabel()).setHorizontalAlignment(0);
                    this.b.setFont(this.b.getFont().deriveFont(0, 14.0f));
                    comp2.add(this.b);
                    comp.add(comp4, o.a(vb.z[1]));
                    comp.add(comp2);
                    comp.add(comp5, eb.a(vb.z[0]));
                    this.add(comp);
                    this.e = new a_(comp4);
                    this.f = new d_(this);
                    Logger.getLogger("").addHandler(this.f);
                    if (Task.a == 0) {
                        return;
                    }
                    final boolean b = f;
                    if (b) {
                        break Label_0498;
                    }
                    break Label_0498;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = f;
                    if (b) {
                        f2 = false;
                        break Label_0504;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            f2 = true;
        }
        wb.f = f2;
    }
    
    public synchronized void a(final boolean b) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                vb.this.e.setVisible(b);
            }
        });
    }
    
    public void a(final ThreadGroup d) {
        Object value = null;
        Label_0019: {
            try {
                this.d = d;
                value = d;
                if (wb.f) {
                    break Label_0019;
                }
                if (d != null) {
                    break Label_0019;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (d == null) {
                    return;
                }
                value = vb.c.get(d);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        final LogRecord logRecord = (LogRecord)value;
        try {
            if (logRecord != null) {
                this.f.publish(logRecord);
            }
        }
        catch (RuntimeException ex3) {
            throw ex3;
        }
    }
    
    static {
        final String[] z2 = new String[3];
        int n3;
        int n2;
        int n = n2 = (n3 = 0);
        String s = "Mxep\u0004";
        int n4 = -1;
        String intern = null;
    Label_0053_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n6;
            final int n5 = n6 = (length = charArray.length);
            int n7 = 0;
            while (true) {
                Label_0129: {
                    if (n5 > 1) {
                        break Label_0129;
                    }
                    length = (n6 = n7);
                    do {
                        final char c2 = charArray[n6];
                        char c3 = '\0';
                        switch (n7 % 5) {
                            case 0: {
                                c3 = '\u0005';
                                break;
                            }
                            case 1: {
                                c3 = 'b';
                                break;
                            }
                            case 2: {
                                c3 = '\u000b';
                                break;
                            }
                            case 3: {
                                c3 = 'q';
                                break;
                            }
                            default: {
                                c3 = 'w';
                                break;
                            }
                        }
                        charArray[length] = (char)(c2 ^ c3);
                        ++n7;
                    } while (n5 == 0);
                }
                if (n5 > n7) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n4) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = 1));
                    s = "\u0018M*EL";
                    n4 = 0;
                    continue Label_0053_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = 2));
                    s = "lrck\u0019\u0002\u001a\u001b\u0019-wzqc\t\u0003V\u001f\u0018pq`c*\u001c\u001e\u001e";
                    n4 = 1;
                    continue Label_0053_Outer;
                }
                case 1: {
                    break Label_0053_Outer;
                }
            }
        }
        z2[n3] = intern;
        z = z2;
        c = new HashMap<ThreadGroup, LogRecord>();
    }
    
    private final class d_ extends Handler
    {
        private final vb a;
        private static final String[] z;
        
        public d_(final vb a) {
            this.a = a;
        }
        
        @Override
        public void close() {
        }
        
        @Override
        public void flush() {
        }
        
        @Override
        public void publish(final LogRecord p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore          8
            //     5: aload_1        
            //     6: invokevirtual   java/util/logging/LogRecord.getLoggerName:()Ljava/lang/String;
            //     9: astore_2       
            //    10: aload_2        
            //    11: iload           8
            //    13: ifne            24
            //    16: ifnull          39
            //    19: goto            23
            //    22: athrow         
            //    23: aload_2        
            //    24: invokevirtual   java/lang/String.isEmpty:()Z
            //    27: iload           8
            //    29: ifne            46
            //    32: ifeq            40
            //    35: goto            39
            //    38: athrow         
            //    39: return         
            //    40: aload_2        
            //    41: bipush          36
            //    43: invokevirtual   java/lang/String.indexOf:(I)I
            //    46: istore_3       
            //    47: iload_3        
            //    48: iload           8
            //    50: ifne            76
            //    53: ifle            67
            //    56: goto            60
            //    59: athrow         
            //    60: aload_2        
            //    61: iconst_0       
            //    62: iload_3        
            //    63: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
            //    66: astore_2       
            //    67: aload_2        
            //    68: ldc             Lorg/powerbot/qb;.class
            //    70: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //    73: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //    76: iload           8
            //    78: ifne            101
            //    81: ifne            180
            //    84: goto            88
            //    87: athrow         
            //    88: aload_2        
            //    89: ldc             Lorg/powerbot/fb;.class
            //    91: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //    94: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //    97: goto            101
            //   100: athrow         
            //   101: iload           8
            //   103: ifne            126
            //   106: ifne            180
            //   109: goto            113
            //   112: athrow         
            //   113: aload_2        
            //   114: ldc             Lorg/powerbot/core/Bot;.class
            //   116: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   119: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   122: goto            126
            //   125: athrow         
            //   126: iload           8
            //   128: ifne            151
            //   131: ifne            180
            //   134: goto            138
            //   137: athrow         
            //   138: aload_2        
            //   139: ldc             Lorg/powerbot/core/BotComposite;.class
            //   141: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   144: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   147: goto            151
            //   150: athrow         
            //   151: iload           8
            //   153: ifne            176
            //   156: ifne            180
            //   159: goto            163
            //   162: athrow         
            //   163: aload_2        
            //   164: ldc             Lorg/powerbot/o;.class
            //   166: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   169: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   172: goto            176
            //   175: athrow         
            //   176: ifne            180
            //   179: return         
            //   180: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
            //   183: invokevirtual   java/lang/Thread.getThreadGroup:()Ljava/lang/ThreadGroup;
            //   186: astore          4
            //   188: aload_0        
            //   189: getfield        org/powerbot/vb$d_.this$0:Lorg/powerbot/vb;
            //   192: invokestatic    org/powerbot/vb.access$000:(Lorg/powerbot/vb;)Ljava/lang/ThreadGroup;
            //   195: iload           8
            //   197: ifne            314
            //   200: ifnonnull       295
            //   203: goto            207
            //   206: athrow         
            //   207: aload           4
            //   209: invokevirtual   java/lang/ThreadGroup.getName:()Ljava/lang/String;
            //   212: ldc             Lorg/powerbot/core/Bot;.class
            //   214: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   217: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
            //   220: iload           8
            //   222: ifne            253
            //   225: goto            229
            //   228: athrow         
            //   229: ifne            294
            //   232: goto            236
            //   235: athrow         
            //   236: aload           4
            //   238: invokevirtual   java/lang/ThreadGroup.getName:()Ljava/lang/String;
            //   241: ldc             Lorg/powerbot/core/BotComposite;.class
            //   243: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   246: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
            //   249: goto            253
            //   252: athrow         
            //   253: iload           8
            //   255: ifne            291
            //   258: ifne            294
            //   261: goto            265
            //   264: athrow         
            //   265: aload           4
            //   267: invokevirtual   java/lang/ThreadGroup.getName:()Ljava/lang/String;
            //   270: iload           8
            //   272: ifne            306
            //   275: goto            279
            //   278: athrow         
            //   279: ldc             Lorg/powerbot/o;.class
            //   281: invokevirtual   java/lang/Class.getName:()Ljava/lang/String;
            //   284: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
            //   287: goto            291
            //   290: athrow         
            //   291: ifeq            295
            //   294: return         
            //   295: invokestatic    org/powerbot/vb.access$100:()Ljava/util/Map;
            //   298: aload           4
            //   300: aload_1        
            //   301: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //   306: pop            
            //   307: aload_0        
            //   308: getfield        org/powerbot/vb$d_.this$0:Lorg/powerbot/vb;
            //   311: invokestatic    org/powerbot/vb.access$000:(Lorg/powerbot/vb;)Ljava/lang/ThreadGroup;
            //   314: iload           8
            //   316: ifne            328
            //   319: ifnull          340
            //   322: goto            326
            //   325: athrow         
            //   326: aload           4
            //   328: aload_0        
            //   329: getfield        org/powerbot/vb$d_.this$0:Lorg/powerbot/vb;
            //   332: invokestatic    org/powerbot/vb.access$000:(Lorg/powerbot/vb;)Ljava/lang/ThreadGroup;
            //   335: if_acmpeq       340
            //   338: return         
            //   339: athrow         
            //   340: new             Ljava/awt/Color;
            //   343: dup            
            //   344: sipush          200
            //   347: sipush          200
            //   350: sipush          200
            //   353: invokespecial   java/awt/Color.<init>:(III)V
            //   356: astore          5
            //   358: aload_1        
            //   359: invokevirtual   java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
            //   362: iload           8
            //   364: ifne            382
            //   367: ifnull          412
            //   370: goto            374
            //   373: athrow         
            //   374: aload_1        
            //   375: invokevirtual   java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
            //   378: goto            382
            //   381: athrow         
            //   382: iload           8
            //   384: ifne            406
            //   387: arraylength    
            //   388: iconst_1       
            //   389: if_icmpne       412
            //   392: goto            396
            //   395: athrow         
            //   396: aload_1        
            //   397: invokevirtual   java/util/logging/LogRecord.getParameters:()[Ljava/lang/Object;
            //   400: iconst_0       
            //   401: aaload         
            //   402: goto            406
            //   405: athrow         
            //   406: checkcast       Ljava/lang/String;
            //   409: goto            413
            //   412: aconst_null    
            //   413: astore          6
            //   415: aload_1        
            //   416: invokevirtual   java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
            //   419: getstatic       java/util/logging/Level.SEVERE:Ljava/util/logging/Level;
            //   422: iload           8
            //   424: ifne            445
            //   427: if_acmpeq       457
            //   430: goto            434
            //   433: athrow         
            //   434: aload_1        
            //   435: invokevirtual   java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
            //   438: getstatic       java/util/logging/Level.WARNING:Ljava/util/logging/Level;
            //   441: goto            445
            //   444: athrow         
            //   445: iload           8
            //   447: ifne            520
            //   450: if_acmpne       509
            //   453: goto            457
            //   456: athrow         
            //   457: aload           6
            //   459: ifnonnull       488
            //   462: goto            466
            //   465: athrow         
            //   466: aload_0        
            //   467: getfield        org/powerbot/vb$d_.a:Lorg/powerbot/vb;
            //   470: getfield        org/powerbot/vb.a:Ljavax/swing/JLabel;
            //   473: getstatic       org/powerbot/vb$d_.z:[Ljava/lang/String;
            //   476: iconst_1       
            //   477: aaload         
            //   478: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
            //   481: invokevirtual   javax/swing/JLabel.setText:(Ljava/lang/String;)V
            //   484: goto            488
            //   487: athrow         
            //   488: new             Ljava/awt/Color;
            //   491: dup            
            //   492: sipush          255
            //   495: bipush          87
            //   497: bipush          71
            //   499: invokespecial   java/awt/Color.<init>:(III)V
            //   502: astore          5
            //   504: iload           8
            //   506: ifeq            563
            //   509: aload_1        
            //   510: invokevirtual   java/util/logging/LogRecord.getLevel:()Ljava/util/logging/Level;
            //   513: getstatic       java/util/logging/Level.INFO:Ljava/util/logging/Level;
            //   516: goto            520
            //   519: athrow         
            //   520: if_acmpne       563
            //   523: aload           6
            //   525: iload           8
            //   527: ifne            565
            //   530: goto            534
            //   533: athrow         
            //   534: ifnonnull       563
            //   537: goto            541
            //   540: athrow         
            //   541: aload_0        
            //   542: getfield        org/powerbot/vb$d_.a:Lorg/powerbot/vb;
            //   545: getfield        org/powerbot/vb.a:Ljavax/swing/JLabel;
            //   548: getstatic       org/powerbot/vb$d_.z:[Ljava/lang/String;
            //   551: iconst_0       
            //   552: aaload         
            //   553: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
            //   556: invokevirtual   javax/swing/JLabel.setText:(Ljava/lang/String;)V
            //   559: goto            563
            //   562: athrow         
            //   563: aload           6
            //   565: iload           8
            //   567: ifne            621
            //   570: ifnull          593
            //   573: goto            577
            //   576: athrow         
            //   577: aload_0        
            //   578: getfield        org/powerbot/vb$d_.a:Lorg/powerbot/vb;
            //   581: getfield        org/powerbot/vb.a:Ljavax/swing/JLabel;
            //   584: aload           6
            //   586: invokevirtual   javax/swing/JLabel.setText:(Ljava/lang/String;)V
            //   589: goto            593
            //   592: athrow         
            //   593: aload_0        
            //   594: getfield        org/powerbot/vb$d_.a:Lorg/powerbot/vb;
            //   597: getfield        org/powerbot/vb.b:Ljavax/swing/JLabel;
            //   600: aload           5
            //   602: invokevirtual   javax/swing/JLabel.setForeground:(Ljava/awt/Color;)V
            //   605: aload_0        
            //   606: getfield        org/powerbot/vb$d_.a:Lorg/powerbot/vb;
            //   609: getfield        org/powerbot/vb.b:Ljavax/swing/JLabel;
            //   612: aload_1        
            //   613: invokevirtual   java/util/logging/LogRecord.getMessage:()Ljava/lang/String;
            //   616: invokevirtual   javax/swing/JLabel.setText:(Ljava/lang/String;)V
            //   619: aload           6
            //   621: iload           8
            //   623: ifne            635
            //   626: ifnull          670
            //   629: goto            633
            //   632: athrow         
            //   633: aload           6
            //   635: getstatic       org/powerbot/vb$d_.z:[Ljava/lang/String;
            //   638: iconst_3       
            //   639: aaload         
            //   640: invokestatic    org/powerbot/core/script/wrappers/Component.e:(Ljava/lang/String;)Ljava/lang/String;
            //   643: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
            //   646: ifeq            670
            //   649: invokestatic    org/powerbot/qb.a:()Lorg/powerbot/qb;
            //   652: getstatic       org/powerbot/vb$d_.z:[Ljava/lang/String;
            //   655: iconst_2       
            //   656: aaload         
            //   657: invokestatic    org/powerbot/t.b:(Ljava/lang/String;)Ljava/lang/String;
            //   660: aload           6
            //   662: iconst_1       
            //   663: invokestatic    javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;Ljava/lang/String;I)V
            //   666: goto            670
            //   669: athrow         
            //   670: return         
            //    StackMapTable: 00 5B FF 00 16 00 09 07 00 25 07 00 35 07 00 19 00 00 00 00 00 01 00 01 07 00 AE 00 40 07 00 19 4D 07 00 AE 00 00 45 01 FF 00 0C 00 09 07 00 25 07 00 35 07 00 19 01 00 00 00 00 01 00 01 07 00 AE 00 06 48 01 4A 07 00 AE 00 4B 07 00 AE 40 01 4A 07 00 AE 00 4B 07 00 AE 40 01 4A 07 00 AE 00 4B 07 00 AE 40 01 4A 07 00 AE 00 4B 07 00 AE 40 01 03 FF 00 19 00 09 07 00 25 07 00 35 07 00 19 01 07 00 47 00 00 00 01 00 01 07 00 AE 00 54 07 00 AE 40 01 45 07 00 AE 00 4F 07 00 AE 40 01 4A 07 00 AE 00 4C 07 00 AE 40 07 00 19 4A 07 00 AE 40 01 02 00 4A 07 00 C0 47 07 00 47 4A 07 00 AE 00 41 07 00 47 4A 07 00 AE 00 FF 00 20 00 09 07 00 25 07 00 35 07 00 19 01 07 00 47 07 00 16 00 00 01 00 01 07 00 AE 00 46 07 00 AE 40 07 00 C2 4C 07 00 AE 00 48 07 00 AE 40 07 00 C0 05 40 07 00 19 FF 00 13 00 09 07 00 25 07 00 35 07 00 19 01 07 00 47 07 00 16 07 00 19 00 01 00 01 07 00 AE 00 49 07 00 AE FF 00 00 00 09 07 00 25 07 00 35 07 00 19 01 07 00 47 07 00 16 07 00 19 00 01 00 02 07 00 51 07 00 51 4A 07 00 AE 00 47 07 00 AE 00 54 07 00 AE 00 14 49 07 00 AE FF 00 00 00 09 07 00 25 07 00 35 07 00 19 01 07 00 47 07 00 16 07 00 19 00 01 00 02 07 00 51 07 00 51 4C 07 00 AE 40 07 00 19 45 07 00 AE 00 54 07 00 AE 00 41 07 00 19 4A 07 00 AE 00 4E 07 00 AE 00 5B 07 00 19 4A 07 00 AE 00 41 07 00 19 61 07 00 AE 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  635    666    669    670    Ljava/lang/RuntimeException;
            //  621    629    632    633    Ljava/lang/RuntimeException;
            //  570    589    592    593    Ljava/lang/RuntimeException;
            //  565    573    576    577    Ljava/lang/RuntimeException;
            //  534    559    562    563    Ljava/lang/RuntimeException;
            //  523    537    540    541    Ljava/lang/RuntimeException;
            //  520    530    533    534    Ljava/lang/RuntimeException;
            //  504    516    519    520    Ljava/lang/RuntimeException;
            //  457    484    487    488    Ljava/lang/RuntimeException;
            //  450    462    465    466    Ljava/lang/RuntimeException;
            //  445    453    456    457    Ljava/lang/RuntimeException;
            //  427    441    444    445    Ljava/lang/RuntimeException;
            //  415    430    433    434    Ljava/lang/RuntimeException;
            //  387    402    405    406    Ljava/lang/RuntimeException;
            //  382    392    395    396    Ljava/lang/RuntimeException;
            //  367    378    381    382    Ljava/lang/RuntimeException;
            //  358    370    373    374    Ljava/lang/RuntimeException;
            //  328    339    339    340    Ljava/lang/RuntimeException;
            //  314    322    325    326    Ljava/lang/RuntimeException;
            //  265    287    290    291    Ljava/lang/RuntimeException;
            //  258    275    278    279    Ljava/lang/RuntimeException;
            //  253    261    264    265    Ljava/lang/RuntimeException;
            //  229    249    252    253    Ljava/lang/RuntimeException;
            //  207    232    235    236    Ljava/lang/RuntimeException;
            //  200    225    228    229    Ljava/lang/RuntimeException;
            //  188    203    206    207    Ljava/lang/RuntimeException;
            //  156    172    175    176    Ljava/lang/RuntimeException;
            //  151    159    162    163    Ljava/lang/RuntimeException;
            //  131    147    150    151    Ljava/lang/RuntimeException;
            //  126    134    137    138    Ljava/lang/RuntimeException;
            //  106    122    125    126    Ljava/lang/RuntimeException;
            //  101    109    112    113    Ljava/lang/RuntimeException;
            //  81     97     100    101    Ljava/lang/RuntimeException;
            //  76     84     87     88     Ljava/lang/RuntimeException;
            //  47     56     59     60     Ljava/lang/RuntimeException;
            //  24     35     38     39     Ljava/lang/RuntimeException;
            //  10     19     22     23     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0207:
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
            final String[] z2 = new String[4];
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = 0));
            String s = "EWr\u001dA\u0018 B(y";
            int n5 = -1;
            String intern = null;
        Label_0062_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n7;
                final int n6 = n7 = (length = charArray.length);
                int n8 = 0;
                while (true) {
                    Label_0138: {
                        if (n6 > 1) {
                            break Label_0138;
                        }
                        length = (n7 = n8);
                        do {
                            final char c = charArray[n7];
                            char c2 = '\0';
                            switch (n8 % 5) {
                                case 0: {
                                    c2 = 'a';
                                    break;
                                }
                                case 1: {
                                    c2 = '/';
                                    break;
                                }
                                case 2: {
                                    c2 = '{';
                                    break;
                                }
                                case 3: {
                                    c2 = 'n';
                                    break;
                                }
                                default: {
                                    c2 = '@';
                                    break;
                                }
                            }
                            charArray[length] = (char)(c ^ c2);
                            ++n8;
                        } while (n6 == 0);
                    }
                    if (n6 > n8) {
                        continue;
                    }
                    break;
                }
                intern = new String(charArray).intern();
                switch (n5) {
                    default: {
                        z2[n2] = intern;
                        n = (n2 = (n3 = (n4 = 1)));
                        s = "Mqc(X8:*u\u001c}";
                        n5 = 0;
                        continue Label_0062_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = 2)));
                        s = "$\u0014.i#)Vv\u001cL\u0005g\u0018iwk]3\u000bM\u0006&\u0005t2m\u0018r\u001f\\\u00135Lgw{]p\u001cF\u0002g\u000bg:l\u0018f\tL\u00173\t(]]Pz\n\b\u00034\u0019g;eA3\rI\u001d\"\u001f&f$\r3\u001dI\u000f4Lu8)H\u007f\u001cI\u0005\"Lq6`L3\tI\u0002.\th#eA=s\"/(\u0019&3f\u0018}\u0016\\V)\tc3)L|YL\u0019g\rh.}Pz\u0017OZg\rhw|Hw\u0018\\\u0013g\u001bo;e\u0018q\u001c\b\u00172\u0018i:hLz\u001aI\u001a+\u0015&3fO}\u0015G\u0017#\tbwoWaYQ\u00192B\f\u0016eT3\u0000G\u00035Lu4{Qc\r[V0\u0005j;)O|\u000bCV)\u0003t:hT\u007f\u0000\b\u0017!\u0018c%~Ya\u001d[XMfV;lY`\u001c\b\u0012(Lh8}\u0018c\u0016[\u0002g\u0003twz]}\u001d\b\u001f)Lu\"yH|\u000b\\V*\tu$h_v\n\b\u0017%\u0003s#)L{\u0010[V&\u001f& l\u0018r\u000bMV&\u0000t2h\\jYI\u0001&\u001ecy\u0003{{\u001cK\u001dg\u0003s%)Ov\u001b[\u001f3\t&1fJf\u0014[V&\u0002bw}Oz\r\\\u00135L`8{\u0018g\u0011MV+\rr2zL3\u0010F\u0010(B";
                        n5 = 1;
                        continue Label_0062_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = 3)));
                        s = "\u001e#?s\u0011lzf";
                        n5 = 2;
                        continue Label_0062_Outer;
                    }
                    case 2: {
                        break Label_0062_Outer;
                    }
                }
            }
            z2[n4] = intern;
            z = z2;
        }
    }
    
    public final class a_ extends JLabel
    {
        private static final long serialVersionUID = -4699438171304667794L;
        private final JPanel a;
        
        public a_(final JPanel a) {
            this.a = a;
        }
        
        public void a(final Image p0, final String p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: new             Ljavax/swing/ImageIcon;
            //     4: dup            
            //     5: aload_1        
            //     6: invokespecial   javax/swing/ImageIcon.<init>:(Ljava/awt/Image;)V
            //     9: invokevirtual   org/powerbot/vb$a_.setIcon:(Ljavax/swing/Icon;)V
            //    12: aload_0        
            //    13: aconst_null    
            //    14: invokevirtual   org/powerbot/vb$a_.setBorder:(Ljavax/swing/border/Border;)V
            //    17: aload_0        
            //    18: getstatic       org/powerbot/wb.f:Z
            //    21: ifne            69
            //    24: bipush          12
            //    26: invokestatic    java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
            //    29: invokevirtual   org/powerbot/vb$a_.setCursor:(Ljava/awt/Cursor;)V
            //    32: aload_2        
            //    33: ifnull          68
            //    36: goto            40
            //    39: athrow         
            //    40: aload_2        
            //    41: invokevirtual   java/lang/String.isEmpty:()Z
            //    44: ifne            68
            //    47: goto            51
            //    50: athrow         
            //    51: aload_0        
            //    52: new             Lorg/powerbot/vb$a_$0;
            //    55: dup            
            //    56: aload_0        
            //    57: aload_2        
            //    58: invokespecial   org/powerbot/vb$a_$0.<init>:(Lorg/powerbot/vb$a_;Ljava/lang/String;)V
            //    61: invokevirtual   org/powerbot/vb$a_.addMouseListener:(Ljava/awt/event/MouseListener;)V
            //    64: goto            68
            //    67: athrow         
            //    68: aload_0        
            //    69: getfield        org/powerbot/vb$a_.a:Ljavax/swing/JPanel;
            //    72: invokevirtual   javax/swing/JPanel.getPreferredSize:()Ljava/awt/Dimension;
            //    75: astore_3       
            //    76: aload_0        
            //    77: invokevirtual   org/powerbot/vb$a_.getPreferredSize:()Ljava/awt/Dimension;
            //    80: astore          4
            //    82: aload_3        
            //    83: getfield        java/awt/Dimension.width:I
            //    86: aload           4
            //    88: getfield        java/awt/Dimension.width:I
            //    91: isub           
            //    92: iconst_2       
            //    93: idiv           
            //    94: istore          5
            //    96: aload_3        
            //    97: getfield        java/awt/Dimension.height:I
            //   100: aload           4
            //   102: getfield        java/awt/Dimension.height:I
            //   105: isub           
            //   106: istore          6
            //   108: aload_0        
            //   109: getfield        org/powerbot/vb$a_.a:Ljavax/swing/JPanel;
            //   112: iconst_0       
            //   113: iload           5
            //   115: iload           6
            //   117: iload           5
            //   119: invokestatic    javax/swing/BorderFactory.createEmptyBorder:(IIII)Ljavax/swing/border/Border;
            //   122: invokevirtual   javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
            //   125: aload_0        
            //   126: getfield        org/powerbot/vb$a_.a:Ljavax/swing/JPanel;
            //   129: aload_0        
            //   130: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
            //   133: pop            
            //   134: return         
            //    StackMapTable: 00 07 67 07 00 66 00 49 07 00 66 00 4F 07 00 66 00 40 07 00 15
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  40     64     67     68     Ljava/lang/RuntimeException;
            //  24     47     50     51     Ljava/lang/RuntimeException;
            //  0      36     39     40     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0040:
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
    }
}
