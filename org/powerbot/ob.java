
package org.powerbot;

import javax.swing.border.AbstractBorder;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.ImageObserver;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import java.awt.Cursor;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import org.powerbot.core.script.util.Timer;
import java.awt.GridLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.Iterator;
import javax.swing.SwingUtilities;
import org.powerbot.game.bot.handler.input.a;
import java.io.IOException;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JLabel;
import org.powerbot.core.script.wrappers.Item;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToggleButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.util.logging.Logger;
import java.awt.event.ActionListener;
import javax.swing.JDialog;

public final class ob extends JDialog implements ActionListener
{
    private static final long serialVersionUID = 5608832535551325651L;
    private static final Logger a;
    private final JScrollPane b;
    private final JPanel c;
    private final JToggleButton d;
    private final JButton e;
    private final JButton f;
    private final JTextField g;
    private volatile boolean h;
    private static final String[] z;
    
    public ob(final qb p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          11
        //     5: aload_0        
        //     6: aload_1        
        //     7: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //    10: bipush          20
        //    12: aaload         
        //    13: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //    16: iconst_1       
        //    17: invokespecial   javax/swing/JDialog.<init>:(Ljava/awt/Frame;Ljava/lang/String;Z)V
        //    20: iload           11
        //    22: ifne            73
        //    25: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //    28: invokevirtual   org/powerbot/v.b:()Z
        //    31: ifne            57
        //    34: getstatic       org/powerbot/y.c:Z
        //    37: ifne            57
        //    40: goto            44
        //    43: athrow         
        //    44: new             Lorg/powerbot/pb;
        //    47: dup            
        //    48: aload_1        
        //    49: invokespecial   org/powerbot/pb.<init>:(Lorg/powerbot/qb;)V
        //    52: pop            
        //    53: goto            57
        //    56: athrow         
        //    57: aload_0        
        //    58: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //    61: bipush          21
        //    63: aaload         
        //    64: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //    67: invokestatic    org/powerbot/db.b:(Ljava/lang/String;)Ljava/awt/Image;
        //    70: invokevirtual   org/powerbot/ob.setIconImage:(Ljava/awt/Image;)V
        //    73: new             Ljavax/swing/JToolBar;
        //    76: dup            
        //    77: invokespecial   javax/swing/JToolBar.<init>:()V
        //    80: astore_2       
        //    81: aload_2        
        //    82: new             Ljavax/swing/border/EmptyBorder;
        //    85: dup            
        //    86: iconst_2       
        //    87: iconst_2       
        //    88: iconst_2       
        //    89: iconst_2       
        //    90: invokespecial   javax/swing/border/EmptyBorder.<init>:(IIII)V
        //    93: invokevirtual   javax/swing/JToolBar.setBorder:(Ljavax/swing/border/Border;)V
        //    96: aload_2        
        //    97: iconst_0       
        //    98: invokevirtual   javax/swing/JToolBar.setFloatable:(Z)V
        //   101: new             Ljava/awt/FlowLayout;
        //   104: dup            
        //   105: iconst_2       
        //   106: invokespecial   java/awt/FlowLayout.<init>:(I)V
        //   109: astore          4
        //   111: aload           4
        //   113: iconst_0       
        //   114: invokevirtual   java/awt/FlowLayout.setHgap:(I)V
        //   117: aload           4
        //   119: iconst_0       
        //   120: invokevirtual   java/awt/FlowLayout.setVgap:(I)V
        //   123: new             Ljavax/swing/JPanel;
        //   126: dup            
        //   127: aload           4
        //   129: invokespecial   javax/swing/JPanel.<init>:(Ljava/awt/LayoutManager;)V
        //   132: astore          5
        //   134: aload_0        
        //   135: aload_2        
        //   136: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   139: bipush          18
        //   141: aaload         
        //   142: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   145: invokevirtual   org/powerbot/ob.add:(Ljava/awt/Component;Ljava/lang/Object;)V
        //   148: aload_0        
        //   149: new             Ljavax/swing/JButton;
        //   152: dup            
        //   153: new             Ljavax/swing/ImageIcon;
        //   156: dup            
        //   157: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   160: bipush          16
        //   162: aaload         
        //   163: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   166: invokestatic    org/powerbot/db.b:(Ljava/lang/String;)Ljava/awt/Image;
        //   169: invokespecial   javax/swing/ImageIcon.<init>:(Ljava/awt/Image;)V
        //   172: invokespecial   javax/swing/JButton.<init>:(Ljavax/swing/Icon;)V
        //   175: putfield        org/powerbot/ob.f:Ljavax/swing/JButton;
        //   178: aload_0        
        //   179: getfield        org/powerbot/ob.f:Ljavax/swing/JButton;
        //   182: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   185: bipush          11
        //   187: aaload         
        //   188: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   191: invokevirtual   javax/swing/JButton.setToolTipText:(Ljava/lang/String;)V
        //   194: aload_0        
        //   195: getfield        org/powerbot/ob.f:Ljavax/swing/JButton;
        //   198: new             Lorg/powerbot/ob$10;
        //   201: dup            
        //   202: aload_0        
        //   203: invokespecial   org/powerbot/ob$10.<init>:(Lorg/powerbot/ob;)V
        //   206: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   209: aload_0        
        //   210: getfield        org/powerbot/ob.f:Ljavax/swing/JButton;
        //   213: iconst_0       
        //   214: invokevirtual   javax/swing/JButton.setFocusable:(Z)V
        //   217: aload_2        
        //   218: aload_0        
        //   219: getfield        org/powerbot/ob.f:Ljavax/swing/JButton;
        //   222: invokevirtual   javax/swing/JToolBar.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   225: pop            
        //   226: aload_0        
        //   227: new             Ljavax/swing/JToggleButton;
        //   230: dup            
        //   231: new             Ljavax/swing/ImageIcon;
        //   234: dup            
        //   235: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   238: bipush          17
        //   240: aaload         
        //   241: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   244: invokestatic    org/powerbot/db.b:(Ljava/lang/String;)Ljava/awt/Image;
        //   247: invokespecial   javax/swing/ImageIcon.<init>:(Ljava/awt/Image;)V
        //   250: invokespecial   javax/swing/JToggleButton.<init>:(Ljavax/swing/Icon;)V
        //   253: putfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   256: aload_0        
        //   257: getfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   260: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   263: bipush          22
        //   265: aaload         
        //   266: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   269: invokevirtual   javax/swing/JToggleButton.setToolTipText:(Ljava/lang/String;)V
        //   272: aload_0        
        //   273: getfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   276: aload_0        
        //   277: invokevirtual   javax/swing/JToggleButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   280: aload_0        
        //   281: getfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   284: iconst_0       
        //   285: invokevirtual   javax/swing/JToggleButton.setFocusable:(Z)V
        //   288: aload_2        
        //   289: aload_0        
        //   290: getfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   293: invokevirtual   javax/swing/JToolBar.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   296: pop            
        //   297: aload_2        
        //   298: iconst_2       
        //   299: invokestatic    javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
        //   302: invokevirtual   javax/swing/JToolBar.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   305: pop            
        //   306: aload_0        
        //   307: new             Ljavax/swing/JButton;
        //   310: dup            
        //   311: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   314: bipush          12
        //   316: aaload         
        //   317: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   320: invokespecial   javax/swing/JButton.<init>:(Ljava/lang/String;)V
        //   323: putfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   326: aload_0        
        //   327: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   330: aload_0        
        //   331: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   334: invokevirtual   javax/swing/JButton.getFont:()Ljava/awt/Font;
        //   337: aload_0        
        //   338: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   341: invokevirtual   javax/swing/JButton.getFont:()Ljava/awt/Font;
        //   344: invokevirtual   java/awt/Font.getSize2D:()F
        //   347: fconst_1       
        //   348: fsub           
        //   349: invokevirtual   java/awt/Font.deriveFont:(F)Ljava/awt/Font;
        //   352: invokevirtual   javax/swing/JButton.setFont:(Ljava/awt/Font;)V
        //   355: aload_0        
        //   356: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   359: aload_0        
        //   360: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   363: aload_0        
        //   364: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   367: iconst_0       
        //   368: invokevirtual   javax/swing/JButton.setFocusable:(Z)V
        //   371: aload_0        
        //   372: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   375: new             Ljavax/swing/ImageIcon;
        //   378: dup            
        //   379: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   382: bipush          13
        //   384: aaload         
        //   385: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   388: invokestatic    org/powerbot/db.b:(Ljava/lang/String;)Ljava/awt/Image;
        //   391: invokespecial   javax/swing/ImageIcon.<init>:(Ljava/awt/Image;)V
        //   394: invokevirtual   javax/swing/JButton.setIcon:(Ljavax/swing/Icon;)V
        //   397: aload_2        
        //   398: aload_0        
        //   399: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   402: invokevirtual   javax/swing/JToolBar.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   405: pop            
        //   406: aload_0        
        //   407: new             Ljavax/swing/JTextField;
        //   410: dup            
        //   411: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   414: bipush          9
        //   416: aaload         
        //   417: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   420: invokespecial   javax/swing/JTextField.<init>:(Ljava/lang/String;)V
        //   423: putfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   426: iconst_2       
        //   427: anewarray       Ljava/awt/Color;
        //   430: dup            
        //   431: iconst_0       
        //   432: aload_0        
        //   433: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   436: invokevirtual   javax/swing/JTextField.getForeground:()Ljava/awt/Color;
        //   439: aastore        
        //   440: dup            
        //   441: iconst_1       
        //   442: getstatic       java/awt/Color.GRAY:Ljava/awt/Color;
        //   445: aastore        
        //   446: astore          6
        //   448: aload_0        
        //   449: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   452: aload           6
        //   454: iconst_1       
        //   455: aaload         
        //   456: invokevirtual   javax/swing/JTextField.setForeground:(Ljava/awt/Color;)V
        //   459: aload_0        
        //   460: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   463: new             Lorg/powerbot/ob$9;
        //   466: dup            
        //   467: aload_0        
        //   468: invokespecial   org/powerbot/ob$9.<init>:(Lorg/powerbot/ob;)V
        //   471: invokevirtual   javax/swing/JTextField.addKeyListener:(Ljava/awt/event/KeyListener;)V
        //   474: aload_0        
        //   475: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   478: new             Lorg/powerbot/ob$8;
        //   481: dup            
        //   482: aload_0        
        //   483: aload           6
        //   485: invokespecial   org/powerbot/ob$8.<init>:(Lorg/powerbot/ob;[Ljava/awt/Color;)V
        //   488: invokevirtual   javax/swing/JTextField.addFocusListener:(Ljava/awt/event/FocusListener;)V
        //   491: aload_0        
        //   492: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   495: new             Ljava/awt/Dimension;
        //   498: dup            
        //   499: sipush          150
        //   502: aload_0        
        //   503: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   506: invokevirtual   javax/swing/JTextField.getPreferredSize:()Ljava/awt/Dimension;
        //   509: getfield        java/awt/Dimension.height:I
        //   512: invokespecial   java/awt/Dimension.<init>:(II)V
        //   515: invokevirtual   javax/swing/JTextField.setPreferredSize:(Ljava/awt/Dimension;)V
        //   518: aload           5
        //   520: aload_0        
        //   521: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   524: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   527: pop            
        //   528: aload           5
        //   530: iconst_2       
        //   531: invokestatic    javax/swing/Box.createHorizontalStrut:(I)Ljava/awt/Component;
        //   534: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   537: pop            
        //   538: new             Ljavax/swing/JButton;
        //   541: dup            
        //   542: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   545: bipush          15
        //   547: aaload         
        //   548: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   551: new             Ljavax/swing/ImageIcon;
        //   554: dup            
        //   555: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   558: bipush          19
        //   560: aaload         
        //   561: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   564: invokestatic    org/powerbot/db.b:(Ljava/lang/String;)Ljava/awt/Image;
        //   567: invokespecial   javax/swing/ImageIcon.<init>:(Ljava/awt/Image;)V
        //   570: invokespecial   javax/swing/JButton.<init>:(Ljava/lang/String;Ljavax/swing/Icon;)V
        //   573: astore          7
        //   575: aload           7
        //   577: bipush          12
        //   579: invokestatic    java/awt/Cursor.getPredefinedCursor:(I)Ljava/awt/Cursor;
        //   582: invokevirtual   javax/swing/JButton.setCursor:(Ljava/awt/Cursor;)V
        //   585: aload           7
        //   587: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   590: bipush          14
        //   592: aaload         
        //   593: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   596: invokevirtual   javax/swing/JButton.setToolTipText:(Ljava/lang/String;)V
        //   599: aload           7
        //   601: aload_0        
        //   602: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   605: invokevirtual   javax/swing/JButton.getFont:()Ljava/awt/Font;
        //   608: invokevirtual   javax/swing/JButton.setFont:(Ljava/awt/Font;)V
        //   611: aload           7
        //   613: iconst_0       
        //   614: invokevirtual   javax/swing/JButton.setFocusable:(Z)V
        //   617: aload           7
        //   619: new             Lorg/powerbot/ob$7;
        //   622: dup            
        //   623: aload_0        
        //   624: invokespecial   org/powerbot/ob$7.<init>:(Lorg/powerbot/ob;)V
        //   627: invokevirtual   javax/swing/JButton.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   630: aload           5
        //   632: aload           7
        //   634: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   637: pop            
        //   638: aload_2        
        //   639: aload           5
        //   641: invokevirtual   javax/swing/JToolBar.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   644: pop            
        //   645: new             Ljava/awt/FlowLayout;
        //   648: dup            
        //   649: iconst_0       
        //   650: invokespecial   java/awt/FlowLayout.<init>:(I)V
        //   653: astore          8
        //   655: aload           8
        //   657: iconst_0       
        //   658: invokevirtual   java/awt/FlowLayout.setHgap:(I)V
        //   661: aload           8
        //   663: iconst_0       
        //   664: invokevirtual   java/awt/FlowLayout.setVgap:(I)V
        //   667: aload_0        
        //   668: new             Ljavax/swing/JPanel;
        //   671: dup            
        //   672: aload           8
        //   674: invokespecial   javax/swing/JPanel.<init>:(Ljava/awt/LayoutManager;)V
        //   677: putfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   680: aload_0        
        //   681: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   684: new             Ljavax/swing/border/EmptyBorder;
        //   687: dup            
        //   688: iconst_0       
        //   689: iconst_0       
        //   690: iconst_0       
        //   691: iconst_0       
        //   692: invokespecial   javax/swing/border/EmptyBorder.<init>:(IIII)V
        //   695: invokevirtual   javax/swing/JPanel.setBorder:(Ljavax/swing/border/Border;)V
        //   698: aload_0        
        //   699: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   702: new             Ljava/awt/Dimension;
        //   705: dup            
        //   706: aload_0        
        //   707: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
        //   710: getfield        java/awt/Dimension.width:I
        //   713: aload_0        
        //   714: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
        //   717: getfield        java/awt/Dimension.height:I
        //   720: invokespecial   java/awt/Dimension.<init>:(II)V
        //   723: invokevirtual   javax/swing/JPanel.setPreferredSize:(Ljava/awt/Dimension;)V
        //   726: aload_0        
        //   727: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   730: new             Ljava/awt/Dimension;
        //   733: dup            
        //   734: aload_0        
        //   735: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
        //   738: getfield        java/awt/Dimension.width:I
        //   741: iconst_2       
        //   742: imul           
        //   743: aload_0        
        //   744: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
        //   747: getfield        java/awt/Dimension.height:I
        //   750: aload_0        
        //   751: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   754: invokevirtual   javax/swing/JPanel.getComponentCount:()I
        //   757: imul           
        //   758: iconst_2       
        //   759: idiv           
        //   760: invokespecial   java/awt/Dimension.<init>:(II)V
        //   763: invokevirtual   javax/swing/JPanel.setPreferredSize:(Ljava/awt/Dimension;)V
        //   766: aload_0        
        //   767: new             Ljavax/swing/JScrollPane;
        //   770: dup            
        //   771: aload_0        
        //   772: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //   775: bipush          22
        //   777: bipush          31
        //   779: invokespecial   javax/swing/JScrollPane.<init>:(Ljava/awt/Component;II)V
        //   782: putfield        org/powerbot/ob.b:Ljavax/swing/JScrollPane;
        //   785: aload_0        
        //   786: getfield        org/powerbot/ob.b:Ljavax/swing/JScrollPane;
        //   789: new             Ljava/awt/Dimension;
        //   792: dup            
        //   793: aload_0        
        //   794: getfield        org/powerbot/ob.b:Ljavax/swing/JScrollPane;
        //   797: invokevirtual   javax/swing/JScrollPane.getPreferredSize:()Ljava/awt/Dimension;
        //   800: getfield        java/awt/Dimension.width:I
        //   803: aload_0        
        //   804: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
        //   807: getfield        java/awt/Dimension.height:I
        //   810: iconst_3       
        //   811: imul           
        //   812: invokespecial   java/awt/Dimension.<init>:(II)V
        //   815: invokevirtual   javax/swing/JScrollPane.setPreferredSize:(Ljava/awt/Dimension;)V
        //   818: new             Lorg/powerbot/ob$0;
        //   821: dup            
        //   822: aload_0        
        //   823: invokespecial   org/powerbot/ob$0.<init>:(Lorg/powerbot/ob;)V
        //   826: astore          9
        //   828: aload           9
        //   830: new             Ljavax/swing/BoxLayout;
        //   833: dup            
        //   834: aload           9
        //   836: iconst_3       
        //   837: invokespecial   javax/swing/BoxLayout.<init>:(Ljava/awt/Container;I)V
        //   840: invokevirtual   javax/swing/JPanel.setLayout:(Ljava/awt/LayoutManager;)V
        //   843: aload           9
        //   845: aload_0        
        //   846: getfield        org/powerbot/ob.b:Ljavax/swing/JScrollPane;
        //   849: invokevirtual   javax/swing/JPanel.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   852: pop            
        //   853: aload_0        
        //   854: aload           9
        //   856: invokevirtual   org/powerbot/ob.add:(Ljava/awt/Component;)Ljava/awt/Component;
        //   859: pop            
        //   860: aload_0        
        //   861: new             Lorg/powerbot/ob$6;
        //   864: dup            
        //   865: aload_0        
        //   866: invokespecial   org/powerbot/ob$6.<init>:(Lorg/powerbot/ob;)V
        //   869: invokevirtual   org/powerbot/ob.addComponentListener:(Ljava/awt/event/ComponentListener;)V
        //   872: aload_0        
        //   873: invokevirtual   org/powerbot/ob.pack:()V
        //   876: aload_0        
        //   877: aload_0        
        //   878: invokevirtual   org/powerbot/ob.getSize:()Ljava/awt/Dimension;
        //   881: invokevirtual   org/powerbot/ob.setMinimumSize:(Ljava/awt/Dimension;)V
        //   884: aload_0        
        //   885: aload_0        
        //   886: invokevirtual   org/powerbot/ob.getParent:()Ljava/awt/Container;
        //   889: invokevirtual   org/powerbot/ob.setLocationRelativeTo:(Ljava/awt/Component;)V
        //   892: new             Ljavax/swing/Timer;
        //   895: dup            
        //   896: ldc             120000
        //   898: new             Lorg/powerbot/ob$5;
        //   901: dup            
        //   902: aload_0        
        //   903: invokespecial   org/powerbot/ob$5.<init>:(Lorg/powerbot/ob;)V
        //   906: invokespecial   javax/swing/Timer.<init>:(ILjava/awt/event/ActionListener;)V
        //   909: astore          10
        //   911: aload           10
        //   913: iconst_0       
        //   914: invokevirtual   javax/swing/Timer.setCoalesce:(Z)V
        //   917: aload           10
        //   919: invokevirtual   javax/swing/Timer.start:()V
        //   922: new             Lorg/powerbot/ob$4;
        //   925: dup            
        //   926: aload_0        
        //   927: invokespecial   org/powerbot/ob$4.<init>:(Lorg/powerbot/ob;)V
        //   930: invokestatic    javax/swing/SwingUtilities.invokeLater:(Ljava/lang/Runnable;)V
        //   933: iload           11
        //   935: ifne            970
        //   938: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //   941: invokevirtual   org/powerbot/v.b:()Z
        //   944: ifne            961
        //   947: goto            951
        //   950: athrow         
        //   951: getstatic       org/powerbot/y.c:Z
        //   954: ifeq            975
        //   957: goto            961
        //   960: athrow         
        //   961: aload_0        
        //   962: iconst_1       
        //   963: invokevirtual   org/powerbot/ob.setVisible:(Z)V
        //   966: goto            970
        //   969: athrow         
        //   970: iload           11
        //   972: ifeq            983
        //   975: aload_0        
        //   976: invokevirtual   org/powerbot/ob.dispose:()V
        //   979: goto            983
        //   982: athrow         
        //   983: getstatic       org/powerbot/core/script/job/Task.a:I
        //   986: ifeq            1007
        //   989: iload           11
        //   991: ifeq            1003
        //   994: goto            998
        //   997: athrow         
        //   998: iconst_0       
        //   999: goto            1004
        //  1002: athrow         
        //  1003: iconst_1       
        //  1004: putstatic       org/powerbot/qb.f:Z
        //  1007: return         
        //    StackMapTable: 00 14 FF 00 2B 00 0C 07 00 F7 07 03 16 00 00 00 00 00 00 00 00 00 01 00 01 07 03 1E 00 4B 07 03 1E 00 0F FF 03 6C 00 0C 07 00 F7 07 03 16 07 00 11 00 07 00 17 07 00 1B 07 03 2F 07 00 1E 07 00 17 07 00 55 07 00 63 01 00 01 07 03 1E 00 48 07 03 1E 00 47 07 03 1E 00 04 46 07 03 1E 00 4D 07 03 1E 00 43 07 03 1E 00 40 01 02
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  989    1002   1002   1003   Ljava/lang/RuntimeException;
        //  983    994    997    998    Ljava/lang/RuntimeException;
        //  970    979    982    983    Ljava/lang/RuntimeException;
        //  951    966    969    970    Ljava/lang/RuntimeException;
        //  938    957    960    961    Ljava/lang/RuntimeException;
        //  911    947    950    951    Ljava/lang/RuntimeException;
        //  34     53     56     57     Ljava/lang/RuntimeException;
        //  25     40     43     44     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0951:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
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
    
    public void a() {
        final boolean f = qb.f;
        int n = 0;
        final Component[] components = this.c.getComponents();
        final int length = components.length;
        int i = 0;
    Label_0085:
        while (true) {
            while (i < length) {
                final Component component = components[i];
                Label_0065: {
                    Label_0062: {
                        Label_0052: {
                            try {
                                if (f) {
                                    break Label_0065;
                                }
                                final Component component2 = component;
                                final boolean b;
                                final int n2 = (b = component2.isVisible()) ? 1 : 0;
                                final boolean b2 = f;
                                if (!b2) {
                                    break Label_0052;
                                }
                                break Label_0085;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                final Component component2 = component;
                                final boolean b;
                                final int n2 = (b = component2.isVisible()) ? 1 : 0;
                                final boolean b2 = f;
                                if (b2) {
                                    break Label_0085;
                                }
                                if (!b) {
                                    break Label_0062;
                                }
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        ++n;
                    }
                    ++i;
                }
                if (f) {
                    break;
                }
                continue;
                int n2 = 0;
                final int value = (int)Math.ceil(n / Math.ceil(n2)) * this.e().height;
                JScrollPane scrollPane2 = null;
                Label_0211: {
                    Label_0184: {
                        JScrollPane scrollPane;
                        try {
                            this.b.setPreferredSize(new Dimension(this.b.getPreferredSize().width, value));
                            this.c.setPreferredSize(new Dimension(this.c.getPreferredSize().width, value));
                            scrollPane = (scrollPane2 = this.b);
                            if (f) {
                                break Label_0211;
                            }
                            final JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
                            final int n3 = scrollBar.getValue();
                            final int n4 = value;
                            if (n3 > n4) {
                                break Label_0184;
                            }
                            break Label_0184;
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        try {
                            final JScrollBar scrollBar = scrollPane.getVerticalScrollBar();
                            final int n3 = scrollBar.getValue();
                            final int n4 = value;
                            if (n3 > n4) {
                                this.b.getVerticalScrollBar().setValue(value);
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    this.b.validate();
                    scrollPane2 = this.b;
                }
                scrollPane2.repaint();
                return;
            }
            final int n2 = this.c.getWidth() / this.e().width;
            continue Label_0085;
        }
    }
    
    public void b() {
        this.f.setEnabled(false);
        this.c.removeAll();
        final JPanel comp = new JPanel();
        comp.setBorder(new EmptyBorder(15, 15, 15, 15));
        final JLabel comp2 = new JLabel(Item.e(ob.z[1]));
        comp2.setFont(comp2.getFont().deriveFont(comp2.getFont().getSize2D() * 1.75f));
        comp2.setForeground(Color.GRAY);
        comp2.setBorder(new EmptyBorder(0, 0, 0, 10));
        comp.add(comp2);
        final JProgressBar comp3 = new JProgressBar();
        comp3.setIndeterminate(true);
        comp3.setPreferredSize(new Dimension(comp3.getPreferredSize().width * 3 / 2, comp2.getPreferredSize().height / 2));
        comp.add(comp3);
        this.c.add(comp);
        this.c.validate();
        this.c.repaint();
        new Thread(new Runnable() {
            private static final String[] z;
            
            @Override
            public void run() {
                List<w> c;
                try {
                    c = ob.this.c();
                    Label_0078: {
                        Label_0039: {
                            try {
                                Collections.sort((List<Object>)c, (Comparator<? super Object>)new Comparator<w>() {
                                    public int a(final w w, final w w2) {
                                        return w.a().compareToIgnoreCase(w2.a());
                                    }
                                });
                                if (qb.f) {
                                    return;
                                }
                                final List<w> list = c;
                                final int n = list.size();
                                if (n == 0) {
                                    break Label_0039;
                                }
                                break Label_0078;
                            }
                            catch (IOException ex) {
                                throw ex;
                            }
                            try {
                                final List<w> list = c;
                                final int n = list.size();
                                if (n != 0) {
                                    break Label_0078;
                                }
                                comp2.setText(org.powerbot.game.bot.handler.input.a.a(ob$3.z[0]));
                                comp3.setVisible(false);
                                SwingUtilities.invokeLater(new Runnable() {
                                    @Override
                                    public void run() {
                                        ob.this.c.validate();
                                        ob.this.c.repaint();
                                        ob.this.f.setEnabled(true);
                                    }
                                });
                            }
                            catch (IOException ex2) {
                                throw ex2;
                            }
                        }
                        return;
                    }
                }
                catch (IOException ex3) {
                    comp2.setText(t.b(ob$3.z[1]));
                    comp3.setVisible(false);
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            ob.this.c.validate();
                            ob.this.c.repaint();
                        }
                    });
                    ex3.printStackTrace();
                    return;
                }
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                        final boolean f = qb.f;
                        ob.this.c.removeAll();
                        for (final w w : c) {
                            try {
                                ob.this.c.add(new b_(ob.this.c, w));
                                if (f) {
                                    return;
                                }
                                if (!f) {
                                    continue;
                                }
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            break;
                        }
                        ob.this.c.validate();
                        ob.this.c.repaint();
                        ob.this.d();
                        ob.this.f.setEnabled(true);
                        ob.this.h = true;
                    }
                });
            }
            
            static {
                final String[] z2 = new String[2];
                int n2;
                int n = n2 = 0;
                String s = "\u0004\u0004-rBI$\u0018Pp4\rdeFI'\u000e['4\u0007)t\t\u001a%\u0018Vw3\u001bdeFI?\u0005Jug\u000b+}E\f%\u001eVh)";
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
                                        c2 = ']';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\\';
                                        break;
                                    }
                                    case 2: {
                                        c2 = '^';
                                        break;
                                    }
                                    case 3: {
                                        c2 = '%';
                                        break;
                                    }
                                    default: {
                                        c2 = '3';
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
                            s = "v$C^?jZ&9\u0004Y$WV{9W;$TA8\u001a\u0012+&Q(>A\u0015?DK{+S($J\u0015'WF>8";
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
        }).start();
    }
    
    public List<w> c() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          12
        //     5: new             Ljava/util/ArrayList;
        //     8: dup            
        //     9: invokespecial   java/util/ArrayList.<init>:()V
        //    12: astore_1       
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: iconst_2       
        //    18: invokespecial   java/util/ArrayList.<init>:(I)V
        //    21: astore_2       
        //    22: aload_2        
        //    23: new             Ljava/io/File;
        //    26: dup            
        //    27: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //    30: iconst_5       
        //    31: aaload         
        //    32: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //    35: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    38: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    43: pop            
        //    44: aload_2        
        //    45: new             Ljava/io/File;
        //    48: dup            
        //    49: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //    52: iconst_4       
        //    53: aaload         
        //    54: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //    57: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    60: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    65: pop            
        //    66: aload_2        
        //    67: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    72: astore_3       
        //    73: aload_3        
        //    74: invokeinterface java/util/Iterator.hasNext:()Z
        //    79: ifeq            118
        //    82: aload_3        
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: checkcast       Ljava/io/File;
        //    91: astore          4
        //    93: aload           4
        //    95: invokevirtual   java/io/File.isDirectory:()Z
        //    98: ifeq            113
        //   101: aload_0        
        //   102: aload_1        
        //   103: aload           4
        //   105: aconst_null    
        //   106: invokevirtual   org/powerbot/ob.a:(Ljava/util/List;Ljava/io/File;Ljava/io/File;)V
        //   109: goto            113
        //   112: athrow         
        //   113: iload           12
        //   115: ifeq            73
        //   118: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   121: bipush          7
        //   123: aaload         
        //   124: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   127: iconst_1       
        //   128: anewarray       Ljava/lang/Object;
        //   131: dup            
        //   132: iconst_0       
        //   133: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //   136: invokevirtual   org/powerbot/v.c:()Lorg/powerbot/v$a_;
        //   139: invokevirtual   org/powerbot/v$a_.c:()Ljava/lang/String;
        //   142: aastore        
        //   143: invokestatic    org/powerbot/ab.a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/InputStream;
        //   146: invokestatic    org/powerbot/bb.a:(Ljava/io/InputStream;)Ljava/util/Map;
        //   149: astore_3       
        //   150: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //   153: iconst_1       
        //   154: invokevirtual   org/powerbot/v.a:(I)Z
        //   157: istore          4
        //   159: aload_3        
        //   160: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   165: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   170: astore          5
        //   172: aload           5
        //   174: invokeinterface java/util/Iterator.hasNext:()Z
        //   179: ifeq            548
        //   182: aload           5
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: checkcast       Ljava/util/Map$Entry;
        //   192: astore          6
        //   194: aload           6
        //   196: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   201: checkcast       Ljava/util/Map;
        //   204: astore          7
        //   206: aload           7
        //   208: iload           12
        //   210: ifne            286
        //   213: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   216: iconst_2       
        //   217: aaload         
        //   218: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   221: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   226: ifeq            284
        //   229: goto            233
        //   232: athrow         
        //   233: aload           7
        //   235: iload           12
        //   237: ifne            286
        //   240: goto            244
        //   243: athrow         
        //   244: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   247: bipush          8
        //   249: aaload         
        //   250: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   253: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   258: checkcast       Ljava/lang/String;
        //   261: invokestatic    org/powerbot/bb.a:(Ljava/lang/String;)Z
        //   264: ifeq            284
        //   267: goto            271
        //   270: athrow         
        //   271: iload           4
        //   273: ifne            284
        //   276: goto            280
        //   279: athrow         
        //   280: goto            172
        //   283: athrow         
        //   284: aload           7
        //   286: invokestatic    org/powerbot/w.a:(Ljava/util/Map;)Lorg/powerbot/w;
        //   289: astore          8
        //   291: aload           8
        //   293: iload           12
        //   295: ifne            331
        //   298: ifnull          543
        //   301: goto            305
        //   304: athrow         
        //   305: aload           8
        //   307: aload           6
        //   309: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   314: checkcast       Ljava/lang/String;
        //   317: putfield        org/powerbot/w.i:Ljava/lang/String;
        //   320: aload           6
        //   322: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   327: goto            331
        //   330: athrow         
        //   331: checkcast       Ljava/util/Map;
        //   334: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   337: iconst_3       
        //   338: aaload         
        //   339: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   342: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   347: iload           12
        //   349: ifne            396
        //   352: ifeq            543
        //   355: goto            359
        //   358: athrow         
        //   359: aload           6
        //   361: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   366: checkcast       Ljava/util/Map;
        //   369: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   372: bipush          6
        //   374: aaload         
        //   375: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   378: iload           12
        //   380: ifne            453
        //   383: goto            387
        //   386: athrow         
        //   387: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //   392: goto            396
        //   395: athrow         
        //   396: ifeq            543
        //   399: aload           8
        //   401: aload           6
        //   403: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   408: checkcast       Ljava/util/Map;
        //   411: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   414: iconst_3       
        //   415: aaload         
        //   416: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   419: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   424: checkcast       Ljava/lang/String;
        //   427: putfield        org/powerbot/w.g:Ljava/lang/String;
        //   430: aload           6
        //   432: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   437: checkcast       Ljava/util/Map;
        //   440: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   443: bipush          6
        //   445: aaload         
        //   446: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   449: goto            453
        //   452: athrow         
        //   453: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   458: checkcast       Ljava/lang/String;
        //   461: invokestatic    org/powerbot/gb.e:(Ljava/lang/String;)[B
        //   464: astore          9
        //   466: aload           9
        //   468: arraylength    
        //   469: iconst_2       
        //   470: imul           
        //   471: newarray        B
        //   473: astore          10
        //   475: new             Ljava/util/Random;
        //   478: dup            
        //   479: invokespecial   java/util/Random.<init>:()V
        //   482: aload           10
        //   484: invokevirtual   java/util/Random.nextBytes:([B)V
        //   487: iconst_0       
        //   488: istore          11
        //   490: iload           11
        //   492: aload           9
        //   494: arraylength    
        //   495: if_icmpge       527
        //   498: aload           10
        //   500: iload           11
        //   502: iconst_2       
        //   503: imul           
        //   504: aload           9
        //   506: iload           11
        //   508: baload         
        //   509: bastore        
        //   510: iinc            11, 1
        //   513: iload           12
        //   515: ifne            534
        //   518: iload           12
        //   520: ifeq            490
        //   523: goto            527
        //   526: athrow         
        //   527: aload           8
        //   529: aload           10
        //   531: putfield        org/powerbot/w.h:[B
        //   534: aload_1        
        //   535: aload           8
        //   537: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   542: pop            
        //   543: iload           12
        //   545: ifeq            172
        //   548: aload_1        
        //   549: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lorg/powerbot/w;>;
        //    StackMapTable: 00 22 FF 00 49 00 0D 07 00 F7 07 00 90 07 00 90 07 01 AF 00 00 00 00 00 00 00 00 01 00 00 FF 00 26 00 0D 07 00 F7 07 00 90 07 00 90 07 01 AF 07 00 93 00 00 00 00 00 00 00 01 00 01 07 03 1E 00 FF 00 04 00 0D 07 00 F7 07 00 90 07 00 90 07 01 AF 00 00 00 00 00 00 00 00 01 00 00 FF 00 35 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 00 00 00 00 00 00 01 00 00 FF 00 3B 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 00 00 00 00 01 00 01 07 03 1E 00 49 07 03 1E 40 07 00 A5 59 07 03 1E 00 47 07 03 1E 00 42 07 03 1E 00 41 07 00 A5 FF 00 11 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 07 00 D4 00 00 00 01 00 01 07 03 1E 00 58 07 03 1E 40 07 00 9B 5A 07 03 1E 00 5A 07 03 1E FF 00 00 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 07 00 D4 00 00 00 01 00 02 07 00 A5 07 00 A8 47 07 03 1E 40 01 77 07 03 1E FF 00 00 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 07 00 D4 00 00 00 01 00 02 07 00 A5 07 00 A8 FF 00 24 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 07 00 D4 07 03 33 07 03 33 01 01 00 00 63 07 03 1E 00 06 FF 00 08 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 07 00 A3 07 00 A5 07 00 D4 00 00 00 01 00 00 FF 00 04 00 0D 07 00 F7 07 00 90 07 00 90 07 00 A5 01 07 01 AF 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  498    523    526    527    Ljava/lang/RuntimeException;
        //  396    449    452    453    Ljava/lang/RuntimeException;
        //  359    392    395    396    Ljava/lang/RuntimeException;
        //  352    383    386    387    Ljava/lang/RuntimeException;
        //  331    355    358    359    Ljava/lang/RuntimeException;
        //  298    327    330    331    Ljava/lang/RuntimeException;
        //  291    301    304    305    Ljava/lang/RuntimeException;
        //  271    283    283    284    Ljava/lang/RuntimeException;
        //  244    276    279    280    Ljava/lang/RuntimeException;
        //  233    267    270    271    Ljava/lang/RuntimeException;
        //  213    240    243    244    Ljava/lang/RuntimeException;
        //  206    229    232    233    Ljava/lang/RuntimeException;
        //  93     109    112    113    Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0233:
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
    
    public void a(final List<w> p0, final File p1, final File p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          19
        //     5: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //     8: invokevirtual   org/powerbot/v.b:()Z
        //    11: iload           19
        //    13: ifne            44
        //    16: ifeq            47
        //    19: goto            23
        //    22: athrow         
        //    23: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
        //    26: invokevirtual   org/powerbot/v.c:()Lorg/powerbot/v$a_;
        //    29: invokevirtual   org/powerbot/v$a_.g:()J
        //    32: ldc2_w          8
        //    35: land           
        //    36: ldc2_w          8
        //    39: lcmp           
        //    40: goto            44
        //    43: athrow         
        //    44: ifeq            48
        //    47: return         
        //    48: aload_3        
        //    49: iload           19
        //    51: ifne            62
        //    54: ifnonnull       65
        //    57: goto            61
        //    60: athrow         
        //    61: aload_2        
        //    62: goto            66
        //    65: aload_3        
        //    66: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //    69: astore          4
        //    71: aload           4
        //    73: arraylength    
        //    74: istore          5
        //    76: iconst_0       
        //    77: istore          6
        //    79: iload           6
        //    81: iload           5
        //    83: if_icmpge       628
        //    86: aload           4
        //    88: iload           6
        //    90: aaload         
        //    91: astore          7
        //    93: aload           7
        //    95: invokevirtual   java/io/File.isDirectory:()Z
        //    98: iload           19
        //   100: ifne            145
        //   103: ifeq            127
        //   106: goto            110
        //   109: athrow         
        //   110: aload_0        
        //   111: aload_1        
        //   112: aload_2        
        //   113: aload           7
        //   115: invokevirtual   org/powerbot/ob.a:(Ljava/util/List;Ljava/io/File;Ljava/io/File;)V
        //   118: iload           19
        //   120: ifeq            620
        //   123: goto            127
        //   126: athrow         
        //   127: aload           7
        //   129: iload           19
        //   131: ifne            150
        //   134: goto            138
        //   137: athrow         
        //   138: invokevirtual   java/io/File.isFile:()Z
        //   141: goto            145
        //   144: athrow         
        //   145: ifeq            620
        //   148: aload           7
        //   150: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //   153: astore          8
        //   155: aload           8
        //   157: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   160: bipush          10
        //   162: aaload         
        //   163: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //   166: invokevirtual   java/lang/String.endsWith:(Ljava/lang/String;)Z
        //   169: iload           19
        //   171: ifne            192
        //   174: ifeq            615
        //   177: goto            181
        //   180: athrow         
        //   181: aload           8
        //   183: bipush          36
        //   185: invokevirtual   java/lang/String.indexOf:(I)I
        //   188: goto            192
        //   191: athrow         
        //   192: iconst_m1      
        //   193: iload           19
        //   195: ifne            216
        //   198: if_icmpne       615
        //   201: goto            205
        //   204: athrow         
        //   205: aload           8
        //   207: invokevirtual   java/lang/String.length:()I
        //   210: bipush          9
        //   212: goto            216
        //   215: athrow         
        //   216: if_icmpge       224
        //   219: iload           19
        //   221: ifeq            620
        //   224: new             Ljava/io/FileInputStream;
        //   227: dup            
        //   228: aload           7
        //   230: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   233: astore          9
        //   235: sipush          512
        //   238: newarray        B
        //   240: astore          10
        //   242: aload           9
        //   244: aload           10
        //   246: invokevirtual   java/io/FileInputStream.read:([B)I
        //   249: pop            
        //   250: aload           9
        //   252: invokevirtual   java/io/FileInputStream.close:()V
        //   255: aload           10
        //   257: iload           19
        //   259: ifne            271
        //   262: ifnull          286
        //   265: goto            269
        //   268: athrow         
        //   269: aload           10
        //   271: arraylength    
        //   272: bipush          12
        //   274: iload           19
        //   276: ifne            307
        //   279: if_icmpge       291
        //   282: goto            286
        //   285: athrow         
        //   286: iload           19
        //   288: ifeq            620
        //   291: aload           10
        //   293: bipush          7
        //   295: baload         
        //   296: iload           19
        //   298: ifne            316
        //   301: bipush          51
        //   303: goto            307
        //   306: athrow         
        //   307: if_icmpeq       315
        //   310: iload           19
        //   312: ifeq            620
        //   315: iconst_0       
        //   316: istore          11
        //   318: bipush          11
        //   320: istore          12
        //   322: iload           12
        //   324: aload           10
        //   326: arraylength    
        //   327: iconst_2       
        //   328: isub           
        //   329: if_icmpge       400
        //   332: aload           10
        //   334: iload           12
        //   336: iinc            12, 1
        //   339: baload         
        //   340: bipush          90
        //   342: iload           19
        //   344: ifne            364
        //   347: if_icmpne       322
        //   350: goto            354
        //   353: athrow         
        //   354: aload           10
        //   356: iload           12
        //   358: iinc            12, 1
        //   361: baload         
        //   362: bipush          75
        //   364: iload           19
        //   366: ifne            386
        //   369: if_icmpne       322
        //   372: goto            376
        //   375: athrow         
        //   376: aload           10
        //   378: iload           12
        //   380: iinc            12, 1
        //   383: baload         
        //   384: bipush          77
        //   386: if_icmpne       322
        //   389: iconst_1       
        //   390: istore          11
        //   392: iload           19
        //   394: ifne            322
        //   397: goto            400
        //   400: iload           11
        //   402: ifeq            410
        //   405: iload           19
        //   407: ifeq            620
        //   410: aload_2        
        //   411: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //   414: invokevirtual   java/io/File.toURI:()Ljava/net/URI;
        //   417: invokevirtual   java/net/URI.toURL:()Ljava/net/URL;
        //   420: astore          12
        //   422: new             Ljava/net/URLClassLoader;
        //   425: dup            
        //   426: iconst_1       
        //   427: anewarray       Ljava/net/URL;
        //   430: dup            
        //   431: iconst_0       
        //   432: aload           12
        //   434: aastore        
        //   435: invokespecial   java/net/URLClassLoader.<init>:([Ljava/net/URL;)V
        //   438: astore          13
        //   440: aload           7
        //   442: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   445: aload_2        
        //   446: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   449: invokevirtual   java/lang/String.length:()I
        //   452: iconst_1       
        //   453: iadd           
        //   454: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   457: astore          14
        //   459: aload           14
        //   461: iconst_0       
        //   462: aload           14
        //   464: bipush          46
        //   466: invokevirtual   java/lang/String.lastIndexOf:(I)I
        //   469: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   472: astore          14
        //   474: aload           14
        //   476: getstatic       java/io/File.separatorChar:C
        //   479: bipush          46
        //   481: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //   484: astore          14
        //   486: aload           13
        //   488: aload           14
        //   490: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
        //   493: astore          15
        //   495: goto            503
        //   498: astore          16
        //   500: goto            620
        //   503: ldc             Lorg/powerbot/core/script/Script;.class
        //   505: aload           15
        //   507: iload           19
        //   509: ifne            530
        //   512: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //   515: ifeq            615
        //   518: goto            522
        //   521: athrow         
        //   522: aload           15
        //   524: ldc             Lorg/powerbot/core/script/Script;.class
        //   526: goto            530
        //   529: athrow         
        //   530: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //   533: astore          16
        //   535: aload           16
        //   537: ldc             Lorg/powerbot/game/api/Manifest;.class
        //   539: iload           19
        //   541: ifne            562
        //   544: invokevirtual   java/lang/Class.isAnnotationPresent:(Ljava/lang/Class;)Z
        //   547: ifeq            615
        //   550: goto            554
        //   553: athrow         
        //   554: aload           16
        //   556: ldc             Lorg/powerbot/game/api/Manifest;.class
        //   558: goto            562
        //   561: athrow         
        //   562: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
        //   565: checkcast       Lorg/powerbot/game/api/Manifest;
        //   568: astore          17
        //   570: new             Lorg/powerbot/w;
        //   573: dup            
        //   574: aload           17
        //   576: invokespecial   org/powerbot/w.<init>:(Lorg/powerbot/game/api/Manifest;)V
        //   579: astore          18
        //   581: aload           18
        //   583: aload_2        
        //   584: invokevirtual   java/io/File.getCanonicalFile:()Ljava/io/File;
        //   587: invokevirtual   java/io/File.toString:()Ljava/lang/String;
        //   590: putfield        org/powerbot/w.i:Ljava/lang/String;
        //   593: aload           18
        //   595: aload           14
        //   597: putfield        org/powerbot/w.g:Ljava/lang/String;
        //   600: aload           18
        //   602: iconst_1       
        //   603: putfield        org/powerbot/w.j:Z
        //   606: aload_1        
        //   607: aload           18
        //   609: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   614: pop            
        //   615: goto            620
        //   618: astore          9
        //   620: iinc            6, 1
        //   623: iload           19
        //   625: ifeq            79
        //   628: return         
        //    Signature:
        //  (Ljava/util/List<Lorg/powerbot/w;>;Ljava/io/File;Ljava/io/File;)V
        //    StackMapTable: 00 3F FF 00 16 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 CD 00 53 07 00 CD 40 01 02 00 4B 07 00 CD 00 40 07 00 93 02 40 07 00 93 FF 00 0C 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 1D 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 00 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 CD 00 4F 07 00 CD 00 49 07 00 CD 40 07 00 93 45 07 00 CD 40 01 44 07 00 93 FF 00 1D 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 00 00 00 00 00 00 00 00 00 00 01 00 01 07 00 CD 00 49 07 00 CD 40 01 4B 07 00 CD 00 49 07 00 CD FF 00 00 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 00 00 00 00 00 00 00 00 00 00 01 00 02 01 01 07 FF 00 2B 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 00 00 00 00 00 00 00 00 01 00 01 07 00 CD 00 41 07 03 33 4D 07 00 CD 00 04 4E 07 00 CD FF 00 00 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 00 00 00 00 00 00 00 00 01 00 02 01 01 07 40 01 FF 00 05 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 01 00 00 00 00 00 00 01 00 00 5E 07 00 CD 00 FF 00 09 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 01 00 00 00 00 00 00 01 00 02 01 01 4A 07 00 CD 00 FF 00 09 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 01 00 00 00 00 00 00 01 00 02 01 01 0D 09 FF 00 57 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 07 00 C4 07 00 C3 07 00 A8 00 00 00 00 01 00 01 07 00 CD FF 00 04 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 07 00 C4 07 00 C3 07 00 A8 07 01 EC 00 00 00 01 00 00 51 07 00 CD 00 46 07 00 CD FF 00 00 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 07 00 C4 07 00 C3 07 00 A8 07 01 EC 00 00 00 01 00 02 07 01 EC 07 01 EC FF 00 16 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 07 00 C4 07 00 C3 07 00 A8 07 01 EC 07 01 EC 00 00 01 00 01 07 00 CD 00 46 07 00 CD FF 00 00 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 07 00 BC 07 03 33 01 07 00 C4 07 00 C3 07 00 A8 07 01 EC 07 01 EC 00 00 01 00 02 07 01 EC 07 01 EC FF 00 34 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 07 00 A8 00 00 00 00 00 00 00 00 00 00 01 00 00 42 07 00 D8 FF 00 01 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 07 00 93 00 00 00 00 00 00 00 00 00 00 00 01 00 00 FF 00 07 00 14 07 00 F7 07 01 AC 07 00 93 07 00 93 07 03 34 01 01 00 00 00 00 00 00 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  198    212    215    216    Ljava/lang/NoClassDefFoundError;
        //  192    201    204    205    Ljava/lang/NoClassDefFoundError;
        //  174    188    191    192    Ljava/lang/NoClassDefFoundError;
        //  127    141    144    145    Ljava/lang/NoClassDefFoundError;
        //  110    134    137    138    Ljava/lang/NoClassDefFoundError;
        //  103    123    126    127    Ljava/lang/NoClassDefFoundError;
        //  93     106    109    110    Ljava/lang/NoClassDefFoundError;
        //  48     57     60     61     Ljava/lang/NoClassDefFoundError;
        //  16     40     43     44     Ljava/lang/NoClassDefFoundError;
        //  5      19     22     23     Ljava/lang/NoClassDefFoundError;
        //  486    495    498    503    Ljava/lang/NoClassDefFoundError;
        //  155    219    618    620    Ljava/lang/Exception;
        //  271    282    285    286    Ljava/lang/NoClassDefFoundError;
        //  242    265    268    269    Ljava/lang/NoClassDefFoundError;
        //  155    177    180    181    Ljava/lang/NoClassDefFoundError;
        //  224    286    618    620    Ljava/lang/Exception;
        //  291    310    618    620    Ljava/lang/Exception;
        //  364    372    375    376    Ljava/lang/NoClassDefFoundError;
        //  332    350    353    354    Ljava/lang/NoClassDefFoundError;
        //  291    303    306    307    Ljava/lang/NoClassDefFoundError;
        //  315    405    618    620    Ljava/lang/Exception;
        //  410    500    618    620    Ljava/lang/Exception;
        //  544    558    561    562    Ljava/lang/NoClassDefFoundError;
        //  535    550    553    554    Ljava/lang/NoClassDefFoundError;
        //  512    526    529    530    Ljava/lang/NoClassDefFoundError;
        //  503    615    618    620    Ljava/lang/Exception;
        //  503    518    521    522    Ljava/lang/NoClassDefFoundError;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0110:
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
    
    @Override
    public void actionPerformed(final ActionEvent p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          8
        //     5: aload_1        
        //     6: ifnull          59
        //     9: aload_0        
        //    10: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //    13: invokevirtual   javax/swing/JPanel.getComponentCount:()I
        //    16: iload           8
        //    18: ifne            47
        //    21: goto            25
        //    24: athrow         
        //    25: ifeq            59
        //    28: goto            32
        //    31: athrow         
        //    32: aload_0        
        //    33: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //    36: iconst_0       
        //    37: invokevirtual   javax/swing/JPanel.getComponent:(I)Ljava/awt/Component;
        //    40: instanceof      Lorg/powerbot/ob$b_;
        //    43: goto            47
        //    46: athrow         
        //    47: iload           8
        //    49: ifne            71
        //    52: ifne            60
        //    55: goto            59
        //    58: athrow         
        //    59: return         
        //    60: aload_1        
        //    61: invokevirtual   java/awt/event/ActionEvent.getSource:()Ljava/lang/Object;
        //    64: aload_0        
        //    65: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //    68: invokevirtual   java/lang/Object.equals:(Ljava/lang/Object;)Z
        //    71: ifeq            266
        //    74: new             Ljavax/swing/JPopupMenu;
        //    77: dup            
        //    78: invokespecial   javax/swing/JPopupMenu.<init>:()V
        //    81: astore_2       
        //    82: new             Lorg/powerbot/ob$2;
        //    85: dup            
        //    86: aload_0        
        //    87: invokespecial   org/powerbot/ob$2.<init>:(Lorg/powerbot/ob;)V
        //    90: astore_3       
        //    91: iconst_0       
        //    92: istore          4
        //    94: invokestatic    org/powerbot/jb.a:()Lorg/powerbot/jb;
        //    97: iload           8
        //    99: ifne            117
        //   102: invokevirtual   org/powerbot/jb.size:()I
        //   105: ifne            114
        //   108: goto            112
        //   111: athrow         
        //   112: return         
        //   113: athrow         
        //   114: invokestatic    org/powerbot/jb.a:()Lorg/powerbot/jb;
        //   117: invokevirtual   org/powerbot/jb.iterator:()Ljava/util/Iterator;
        //   120: astore          5
        //   122: aload           5
        //   124: invokeinterface java/util/Iterator.hasNext:()Z
        //   129: ifeq            204
        //   132: aload           5
        //   134: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   139: checkcast       Lorg/powerbot/jb$a_;
        //   142: astore          6
        //   144: aload_0        
        //   145: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   148: invokevirtual   javax/swing/JButton.getText:()Ljava/lang/String;
        //   151: aload           6
        //   153: invokevirtual   org/powerbot/jb$a_.toString:()Ljava/lang/String;
        //   156: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
        //   159: istore          4
        //   161: new             Ljavax/swing/JCheckBoxMenuItem;
        //   164: dup            
        //   165: aload           6
        //   167: invokevirtual   org/powerbot/jb$a_.toString:()Ljava/lang/String;
        //   170: iload           4
        //   172: invokespecial   javax/swing/JCheckBoxMenuItem.<init>:(Ljava/lang/String;Z)V
        //   175: astore          7
        //   177: aload           7
        //   179: aload_3        
        //   180: invokevirtual   javax/swing/JCheckBoxMenuItem.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   183: aload_2        
        //   184: aload           7
        //   186: invokevirtual   javax/swing/JPopupMenu.add:(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
        //   189: pop            
        //   190: iload           8
        //   192: ifne            208
        //   195: iload           8
        //   197: ifeq            122
        //   200: goto            204
        //   203: athrow         
        //   204: aload_2        
        //   205: invokevirtual   javax/swing/JPopupMenu.addSeparator:()V
        //   208: new             Ljavax/swing/JCheckBoxMenuItem;
        //   211: dup            
        //   212: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //   215: iconst_0       
        //   216: aaload         
        //   217: invokestatic    org/powerbot/game/bot/handler/input/a.a:(Ljava/lang/String;)Ljava/lang/String;
        //   220: iload           4
        //   222: ifne            230
        //   225: iconst_1       
        //   226: goto            231
        //   229: athrow         
        //   230: iconst_0       
        //   231: invokespecial   javax/swing/JCheckBoxMenuItem.<init>:(Ljava/lang/String;Z)V
        //   234: astore          5
        //   236: aload           5
        //   238: aload_3        
        //   239: invokevirtual   javax/swing/JCheckBoxMenuItem.addActionListener:(Ljava/awt/event/ActionListener;)V
        //   242: aload_2        
        //   243: aload           5
        //   245: invokevirtual   javax/swing/JPopupMenu.add:(Ljavax/swing/JMenuItem;)Ljavax/swing/JMenuItem;
        //   248: pop            
        //   249: aload_2        
        //   250: aload_0        
        //   251: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   254: iconst_0       
        //   255: aload_0        
        //   256: getfield        org/powerbot/ob.e:Ljavax/swing/JButton;
        //   259: invokevirtual   javax/swing/JButton.getHeight:()I
        //   262: invokevirtual   javax/swing/JPopupMenu.show:(Ljava/awt/Component;II)V
        //   265: return         
        //   266: aload_0        
        //   267: invokespecial   org/powerbot/ob.d:()V
        //   270: return         
        //    StackMapTable: 00 17 FF 00 18 00 09 07 00 F7 07 01 F9 00 00 00 00 00 00 01 00 01 07 03 1E 40 01 45 07 03 1E 00 4D 07 03 1E 40 01 4A 07 03 1E 00 00 4A 01 FF 00 27 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 00 00 00 01 00 01 07 03 1E 00 40 07 03 1E 00 42 07 01 FE FF 00 04 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 07 01 AF 00 00 01 00 00 FF 00 50 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 07 01 AF 07 00 E4 07 00 E8 01 00 01 07 03 1E FF 00 00 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 07 01 AF 00 00 01 00 00 03 54 07 03 1E FF 00 00 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 07 01 AF 00 00 01 00 03 08 00 D0 08 00 D0 07 00 A8 FF 00 00 00 09 07 00 F7 07 01 F9 07 00 DD 07 00 DF 01 07 01 AF 00 00 01 00 04 08 00 D0 08 00 D0 07 00 A8 01 FF 00 22 00 09 07 00 F7 07 01 F9 00 00 00 00 00 00 01 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  208    229    229    230    Ljava/lang/RuntimeException;
        //  177    200    203    204    Ljava/lang/RuntimeException;
        //  102    113    113    114    Ljava/lang/RuntimeException;
        //  94     108    111    112    Ljava/lang/RuntimeException;
        //  47     55     58     59     Ljava/lang/RuntimeException;
        //  25     43     46     47     Ljava/lang/RuntimeException;
        //  9      28     31     32     Ljava/lang/RuntimeException;
        //  5      21     24     25     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0025:
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
    
    private void d() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: istore          7
        //     5: aload_0        
        //     6: getfield        org/powerbot/ob.c:Ljavax/swing/JPanel;
        //     9: invokevirtual   javax/swing/JPanel.getComponents:()[Ljava/awt/Component;
        //    12: astore_1       
        //    13: aload_1        
        //    14: arraylength    
        //    15: istore_2       
        //    16: iconst_0       
        //    17: istore_3       
        //    18: iload_3        
        //    19: iload_2        
        //    20: if_icmpge       196
        //    23: aload_1        
        //    24: iload_3        
        //    25: aaload         
        //    26: astore          4
        //    28: aload           4
        //    30: checkcast       Lorg/powerbot/ob$b_;
        //    33: invokevirtual   org/powerbot/ob$b_.b:()Lorg/powerbot/w;
        //    36: astore          5
        //    38: iconst_1       
        //    39: istore          6
        //    41: aload_0        
        //    42: iload           7
        //    44: ifne            201
        //    47: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //    50: invokevirtual   javax/swing/JTextField.getText:()Ljava/lang/String;
        //    53: invokevirtual   java/lang/String.isEmpty:()Z
        //    56: iload           7
        //    58: ifne            154
        //    61: goto            65
        //    64: athrow         
        //    65: ifne            138
        //    68: goto            72
        //    71: athrow         
        //    72: aload_0        
        //    73: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //    76: invokevirtual   javax/swing/JTextField.getText:()Ljava/lang/String;
        //    79: getstatic       org/powerbot/ob.z:[Ljava/lang/String;
        //    82: bipush          9
        //    84: aaload         
        //    85: invokestatic    org/powerbot/core/script/wrappers/Item.e:(Ljava/lang/String;)Ljava/lang/String;
        //    88: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    91: iload           7
        //    93: ifne            154
        //    96: goto            100
        //    99: athrow         
        //   100: ifne            138
        //   103: goto            107
        //   106: athrow         
        //   107: aload           5
        //   109: aload_0        
        //   110: getfield        org/powerbot/ob.g:Ljavax/swing/JTextField;
        //   113: invokevirtual   javax/swing/JTextField.getText:()Ljava/lang/String;
        //   116: invokevirtual   org/powerbot/w.b:(Ljava/lang/String;)Z
        //   119: iload           7
        //   121: ifne            154
        //   124: goto            128
        //   127: athrow         
        //   128: ifne            138
        //   131: goto            135
        //   134: athrow         
        //   135: iconst_0       
        //   136: istore          6
        //   138: aload_0        
        //   139: getfield        org/powerbot/ob.d:Ljavax/swing/JToggleButton;
        //   142: iload           7
        //   144: ifne            183
        //   147: invokevirtual   javax/swing/JToggleButton.isSelected:()Z
        //   150: goto            154
        //   153: athrow         
        //   154: ifeq            181
        //   157: aload           5
        //   159: getfield        org/powerbot/w.j:Z
        //   162: iload           7
        //   164: ifne            179
        //   167: goto            171
        //   170: athrow         
        //   171: ifne            181
        //   174: goto            178
        //   177: athrow         
        //   178: iconst_0       
        //   179: istore          6
        //   181: aload           4
        //   183: iload           6
        //   185: invokevirtual   java/awt/Component.setVisible:(Z)V
        //   188: iinc            3, 1
        //   191: iload           7
        //   193: ifeq            18
        //   196: aload_0        
        //   197: invokevirtual   org/powerbot/ob.a:()V
        //   200: aload_0        
        //   201: getfield        org/powerbot/ob.b:Ljavax/swing/JScrollPane;
        //   204: invokevirtual   javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
        //   207: iconst_0       
        //   208: invokevirtual   javax/swing/JScrollBar.setValue:(I)V
        //   211: return         
        //    StackMapTable: 00 19 FF 00 12 00 08 07 00 F7 07 03 31 01 01 00 00 00 01 00 00 FF 00 2D 00 08 07 00 F7 07 03 31 01 01 07 01 96 07 00 D4 01 01 00 01 07 03 1E 40 01 45 07 03 1E 00 5A 07 03 1E 40 01 45 07 03 1E 00 53 07 03 1E 40 01 45 07 03 1E 00 02 4E 07 03 1E 40 01 4F 07 03 1E 40 01 45 07 03 1E 00 40 01 01 41 07 01 96 FF 00 0C 00 08 07 00 F7 07 03 31 01 01 00 00 00 01 00 00 44 07 00 F7
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  157    174    177    178    Ljava/lang/RuntimeException;
        //  154    167    170    171    Ljava/lang/RuntimeException;
        //  138    150    153    154    Ljava/lang/RuntimeException;
        //  107    131    134    135    Ljava/lang/RuntimeException;
        //  100    124    127    128    Ljava/lang/RuntimeException;
        //  72     103    106    107    Ljava/lang/RuntimeException;
        //  65     96     99     100    Ljava/lang/RuntimeException;
        //  47     68     71     72     Ljava/lang/RuntimeException;
        //  41     61     64     65     Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0065:
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
    
    public Dimension e() {
        return new Dimension(340, 90);
    }
    
    static {
        final String[] z2 = new String[23];
        int n23;
        int n22;
        int n21;
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
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 0)))))))))))))))))))));
        String s = "d'xa!g\t\u0003@\u0018";
        int n24 = -1;
        String intern = null;
    Label_0290_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n26;
            final int n25 = n26 = (length = charArray.length);
            int n27 = 0;
            while (true) {
                Label_0366: {
                    if (n25 > 1) {
                        break Label_0366;
                    }
                    length = (n26 = n27);
                    do {
                        final char c = charArray[n26];
                        char c2 = '\0';
                        switch (n27 % 5) {
                            case 0: {
                                c2 = '\u001e';
                                break;
                            }
                            case 1: {
                                c2 = 'R';
                                break;
                            }
                            case 2: {
                                c2 = 'l';
                                break;
                            }
                            case 3: {
                                c2 = '\u001a';
                                break;
                            }
                            default: {
                                c2 = 'v';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n27;
                    } while (n25 == 0);
                }
                if (n25 > n27) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n24) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 1))))))))))))))))))))));
                    s = "ed:'()\u0002\u001b\u0003\u0001";
                    n24 = 0;
                    continue Label_0290_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 2))))))))))))))))))))));
                    s = "1\fE";
                    n24 = 1;
                    continue Label_0290_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 3))))))))))))))))))))));
                    s = "$\tT^\\gj6&";
                    n24 = 2;
                    continue Label_0290_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 4))))))))))))))))))))));
                    s = "(\u0010A";
                    n24 = 3;
                    continue Label_0290_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 5))))))))))))))))))))));
                    s = "f\u000f\u0018";
                    n24 = 4;
                    continue Label_0290_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 6))))))))))))))))))))));
                    s = "o\u0003\u000f";
                    n24 = 5;
                    continue Label_0290_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 7))))))))))))))))))))));
                    s = "l\u0012\u0002^\u001f\u0010gww5sH\u0006A\u001bO::o6*\t\u0004ICY+*i2p\u0015YO\u001cCg;o.h\u0003\u0015Z\u0005E&w?9T)%z\u0011Ku}s";
                    n24 = 6;
                    continue Label_0290_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 8))))))))))))))))))))));
                    s = "r\u000f\u0006";
                    n24 = 7;
                    continue Label_0290_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 9))))))))))))))))))))));
                    s = "zn:1\"/";
                    n24 = 8;
                    continue Label_0290_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 10))))))))))))))))))))));
                    s = "\u0007h7\"24";
                    n24 = 9;
                    continue Label_0290_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 11))))))))))))))))))))));
                    s = "V\u0003\u0010\\\tY ";
                    n24 = 10;
                    continue Label_0290_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 12))))))))))))))))))))));
                    s = "gd{\"\"$\n@C[";
                    n24 = 11;
                    continue Label_0290_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 13))))))))))))))))))))));
                    s = "X-+o7v\u0005\u0013]CC%9g'wI\u0011B\u0015Z 1c-j\u0015)\u001eX\u001e\u00173e;wH\u0006@\u000b";
                    n24 = 12;
                    continue Label_0290_Outer;
                }
                case 12: {
                    z2[n14] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 14))))))))))))))))))))));
                    s = "F\u0014\u0019Y\u001fOh,h'$\u0000\u0003B\u0000\n$1s6$\t\u0010\u000e\u001fI:1p6w";
                    n24 = 13;
                    continue Label_0290_Outer;
                }
                case 13: {
                    z2[n15] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 15))))))))))))))))))))));
                    s = "h:7w1a";
                    n24 = 14;
                    continue Label_0290_Outer;
                }
                case 14: {
                    z2[n16] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 16))))))))))))))))))))));
                    s = "5\u0000FBZ[h>0n.\bTJJZ$</87\r\\N@Gx\u0004syv:GHI[n(+o7\u000bR";
                    n24 = 15;
                    continue Label_0290_Outer;
                }
                case 15: {
                    z2[n17] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 17))))))))))))))))))))));
                    s = "[n(,45\u0006P^\u0000@f:$$4JRAVYc2 .)\u0016j\u001d\u001c\u0019T+&/$\fY\u0003_Gl";
                    n24 = 16;
                    continue Label_0290_Outer;
                }
                case 16: {
                    z2[n18] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 18))))))))))))))))))))));
                    s = "J\t\u0004Z\u0004";
                    n24 = 17;
                    continue Label_0290_Outer;
                }
                case 17: {
                    z2[n19] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 19))))))))))))))))))))));
                    s = "[n(,45\u0006P^\u0000@f:$$4JRAVYc2 .)\u0016j\u001d\u001d\u001eT(& 5\u0006]\u0003_Gl";
                    n24 = 18;
                    continue Label_0290_Outer;
                }
                case 18: {
                    z2[n20] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 20))))))))))))))))))))));
                    s = "W\u0005\u0004G\u001c^;";
                    n24 = 19;
                    continue Label_0290_Outer;
                }
                case 19: {
                    z2[n21] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 21))))))))))))))))))))));
                    s = "[n(,45\u0006P^\u0000@f:$$4JRAVYc2 .)\u0016j\u001d\u001c\u001fT=*-\"KECH";
                    n24 = 20;
                    continue Label_0290_Outer;
                }
                case 20: {
                    z2[n22] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = 22))))))))))))))))))))));
                    s = "W\u000e\u0019YLE&4ybh\t\u0015O\u0000\n;;r+t\u0012\u0005";
                    n24 = 21;
                    continue Label_0290_Outer;
                }
                case 21: {
                    break Label_0290_Outer;
                }
            }
        }
        z2[n23] = intern;
        z = z2;
        a = Logger.getLogger(ob.class.getName());
    }
    
    private final class b_ extends JPanel
    {
        private static final long serialVersionUID = 1L;
        private final Component a;
        private final w b;
        private final Color[] d;
        private static final String[] z;
        
        public b_(final Component a, final w b) {
            final boolean f = qb.f;
            this.d = new Color[] { null, null };
            this.a = a;
            this.b = b;
            final int n = this.a() / (a.getPreferredSize().width / ob.this.e().width);
            int n2 = 0;
            Label_0112: {
                Label_0109: {
                    try {
                        this.setLayout(null);
                        this.setBorder(new a_());
                        this.setPreferredSize(ob.this.e());
                        n2 = n % 2;
                        if (f) {
                            break Label_0109;
                        }
                        if (n2 != 0) {
                            break Label_0112;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                break Label_0112;
            }
            final int n3 = n2;
            Color background = null;
            Label_0196: {
                try {
                    this.d[0] = this.getBackground();
                    this.d[1] = new Color(this.d[0].getRed() - 24, this.d[0].getGreen() - 24, this.d[0].getBlue() - 24);
                    if (n3 != 0) {
                        background = this.d[1];
                        break Label_0196;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                background = this.d[0];
            }
            this.setBackground(background);
            final JLabel comp = new JLabel(new ImageIcon(this.a(b.h().index)));
            comp.setBounds(4, (ob.this.e().height - comp.getPreferredSize().height) / 2, comp.getPreferredSize().width, comp.getPreferredSize().height);
            this.add(comp);
            final JPanel comp2 = new JPanel(new GridLayout(0, 1));
            comp2.setBackground(null);
            final int x = comp.getLocation().x + comp.getPreferredSize().width + 8;
            comp2.setBounds(x, 4, ob.this.e().width - x - 1, ob.this.e().height - 8);
            this.add(comp2);
            final JLabel comp3 = new JLabel(b.a());
            Label_0459: {
                String s2 = null;
                Label_0451: {
                    String s;
                    try {
                        comp3.setToolTipText(String.format(Timer.e(b_.z[2]), b.d(), b.f()));
                        comp3.setFont(comp3.getFont().deriveFont(1));
                        comp2.add(comp3, org.t.a(b_.z[1]));
                        s = (s2 = b.g());
                        if (f) {
                            break Label_0459;
                        }
                        if (s != null) {
                            break Label_0451;
                        }
                        break Label_0459;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        if (s == null) {
                            break Label_0459;
                        }
                        s2 = b.g();
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                try {
                    if (!s2.isEmpty()) {
                        comp3.setForeground(new Color(35, 35, 142));
                        comp3.addMouseListener(new MouseAdapter() {
                            private static final String[] z;
                            
                            @Override
                            public void mouseClicked(final MouseEvent mouseEvent) {
                                qb.a(String.format(s.a(ob$b_$2.z[1]), b.g().replace(Item.e("\u007f"), s.a(ob$b_$2.z[0]))));
                            }
                            
                            static {
                                final String[] z2 = new String[2];
                                int n2;
                                int n = n2 = 0;
                                String s = "$bj";
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
                                                        c2 = 'o';
                                                        break;
                                                    }
                                                    case 1: {
                                                        c2 = '_';
                                                        break;
                                                    }
                                                    case 2: {
                                                        c2 = '2';
                                                        break;
                                                    }
                                                    case 3: {
                                                        c2 = '\\';
                                                        break;
                                                    }
                                                    default: {
                                                        c2 = 'L';
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
                                            s = "\bEIBy.\u007f+$UNARE&s23'\f\u000fCZ\u001d\"q9s C\u0006TQ[-j\u007fc&\u001fEB";
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
                        comp3.setCursor(Cursor.getPredefinedCursor(12));
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            final JTextArea comp4 = new JTextArea(b.c());
            comp4.setBackground(null);
            comp4.setEditable(false);
            comp4.setBorder(null);
            comp4.setLineWrap(true);
            comp4.setWrapStyleWord(true);
            comp4.setFocusable(false);
            comp4.setFont(comp3.getFont().deriveFont(0, comp3.getFont().getSize2D() - 2.0f));
            comp2.add(comp4);
            final JPanel comp5 = new JPanel(new GridLayout(0, 2));
            comp2.add(comp5, Timer.e(b_.z[4]));
            comp5.setBackground(null);
            final JPanel comp6 = new JPanel(new FlowLayout(0));
            comp6.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            comp6.setBackground(null);
            comp5.add(comp6);
            final JPanel comp7 = new JPanel(new FlowLayout(2));
            comp7.setBackground(null);
            comp5.add(comp7);
            final JButton comp8 = new JButton(org.t.a(b_.z[3]));
            comp8.addActionListener(new ActionListener() {
                private static final String[] z;
                
                @Override
                public void actionPerformed(final ActionEvent p0) {
                    // 
                    // This method could not be decompiled.
                    // 
                    // Original Bytecode:
                    // 
                    //     3: istore          10
                    //     5: aload_0        
                    //     6: getfield        org/powerbot/ob$b_$1.this$1:Lorg/powerbot/ob$b_;
                    //     9: iconst_0       
                    //    10: invokevirtual   org/powerbot/ob$b_.setVisible:(Z)V
                    //    13: aload_0        
                    //    14: getfield        org/powerbot/ob$b_$1.this$1:Lorg/powerbot/ob$b_;
                    //    17: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
                    //    20: invokevirtual   org/powerbot/ob.dispose:()V
                    //    23: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
                    //    26: invokevirtual   org/powerbot/v.b:()Z
                    //    29: ifne            34
                    //    32: return         
                    //    33: athrow         
                    //    34: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
                    //    37: invokevirtual   org/powerbot/k.e:()Ljava/util/Collection;
                    //    40: astore_2       
                    //    41: iconst_0       
                    //    42: istore_3       
                    //    43: aload_2        
                    //    44: invokeinterface java/util/Collection.iterator:()Ljava/util/Iterator;
                    //    49: astore          4
                    //    51: aload           4
                    //    53: invokeinterface java/util/Iterator.hasNext:()Z
                    //    58: ifeq            105
                    //    61: aload           4
                    //    63: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //    68: checkcast       Ljava/lang/String;
                    //    71: astore          5
                    //    73: aload_0        
                    //    74: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //    77: invokevirtual   org/powerbot/w.b:()Ljava/lang/String;
                    //    80: aload           5
                    //    82: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
                    //    85: iload           10
                    //    87: ifne            112
                    //    90: ifeq            100
                    //    93: goto            97
                    //    96: athrow         
                    //    97: iinc            3, 1
                    //   100: iload           10
                    //   102: ifeq            51
                    //   105: aload_0        
                    //   106: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   109: getfield        org/powerbot/w.j:Z
                    //   112: iload           10
                    //   114: ifne            175
                    //   117: ifeq            165
                    //   120: goto            124
                    //   123: athrow         
                    //   124: iconst_1       
                    //   125: anewarray       Ljava/net/URL;
                    //   128: dup            
                    //   129: iconst_0       
                    //   130: new             Ljava/io/File;
                    //   133: dup            
                    //   134: aload_0        
                    //   135: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   138: getfield        org/powerbot/w.i:Ljava/lang/String;
                    //   141: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
                    //   144: invokevirtual   java/io/File.toURI:()Ljava/net/URI;
                    //   147: invokevirtual   java/net/URI.toURL:()Ljava/net/URL;
                    //   150: aastore        
                    //   151: invokestatic    org/powerbot/x.a:([Ljava/net/URL;)Ljava/lang/Object;
                    //   154: checkcast       Ljava/lang/ClassLoader;
                    //   157: astore          4
                    //   159: goto            731
                    //   162: astore          5
                    //   164: return         
                    //   165: aload_0        
                    //   166: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   169: getfield        org/powerbot/w.h:[B
                    //   172: arraylength    
                    //   173: iconst_2       
                    //   174: idiv           
                    //   175: newarray        B
                    //   177: astore          5
                    //   179: bipush          16
                    //   181: newarray        B
                    //   183: astore          6
                    //   185: iconst_0       
                    //   186: istore          7
                    //   188: iload           7
                    //   190: aload           5
                    //   192: arraylength    
                    //   193: if_icmpge       221
                    //   196: aload           5
                    //   198: iload           7
                    //   200: aload_0        
                    //   201: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   204: getfield        org/powerbot/w.h:[B
                    //   207: iload           7
                    //   209: iconst_2       
                    //   210: imul           
                    //   211: baload         
                    //   212: bastore        
                    //   213: iinc            7, 1
                    //   216: iload           10
                    //   218: ifeq            188
                    //   221: new             Ljava/util/zip/Inflater;
                    //   224: dup            
                    //   225: invokespecial   java/util/zip/Inflater.<init>:()V
                    //   228: astore          7
                    //   230: aload           7
                    //   232: aload           5
                    //   234: invokevirtual   java/util/zip/Inflater.setInput:([B)V
                    //   237: aload           7
                    //   239: aload           6
                    //   241: iconst_0       
                    //   242: aload           6
                    //   244: arraylength    
                    //   245: invokevirtual   java/util/zip/Inflater.inflate:([BII)I
                    //   248: pop            
                    //   249: aload           7
                    //   251: invokevirtual   java/util/zip/Inflater.end:()V
                    //   254: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   257: iconst_4       
                    //   258: aaload         
                    //   259: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   262: invokestatic    javax/crypto/Cipher.getInstance:(Ljava/lang/String;)Ljavax/crypto/Cipher;
                    //   265: astore          8
                    //   267: aload           8
                    //   269: iconst_2       
                    //   270: new             Ljavax/crypto/spec/SecretKeySpec;
                    //   273: dup            
                    //   274: aload           6
                    //   276: iconst_0       
                    //   277: aload           6
                    //   279: arraylength    
                    //   280: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   283: bipush          14
                    //   285: aaload         
                    //   286: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   289: invokespecial   javax/crypto/spec/SecretKeySpec.<init>:([BIILjava/lang/String;)V
                    //   292: invokevirtual   javax/crypto/Cipher.init:(ILjava/security/Key;)V
                    //   295: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   298: bipush          13
                    //   300: aaload         
                    //   301: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   304: iconst_2       
                    //   305: anewarray       Ljava/lang/Object;
                    //   308: dup            
                    //   309: iconst_0       
                    //   310: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
                    //   313: invokevirtual   org/powerbot/v.c:()Lorg/powerbot/v$a_;
                    //   316: invokevirtual   org/powerbot/v$a_.c:()Ljava/lang/String;
                    //   319: aastore        
                    //   320: dup            
                    //   321: iconst_1       
                    //   322: aload_0        
                    //   323: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   326: getfield        org/powerbot/w.i:Ljava/lang/String;
                    //   329: invokevirtual   java/lang/String.toString:()Ljava/lang/String;
                    //   332: aastore        
                    //   333: invokestatic    org/powerbot/ab.a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/InputStream;
                    //   336: astore          9
                    //   338: new             Ljava/util/zip/ZipInputStream;
                    //   341: dup            
                    //   342: new             Ljavax/crypto/CipherInputStream;
                    //   345: dup            
                    //   346: aload           9
                    //   348: aload           8
                    //   350: invokespecial   javax/crypto/CipherInputStream.<init>:(Ljava/io/InputStream;Ljavax/crypto/Cipher;)V
                    //   353: invokespecial   java/util/zip/ZipInputStream.<init>:(Ljava/io/InputStream;)V
                    //   356: invokestatic    org/powerbot/x.a:(Ljava/util/zip/ZipInputStream;)Ljava/lang/Object;
                    //   359: checkcast       Ljava/lang/ClassLoader;
                    //   362: astore          4
                    //   364: goto            390
                    //   367: astore          5
                    //   369: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   372: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   375: bipush          8
                    //   377: aaload         
                    //   378: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   381: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   384: aload           5
                    //   386: invokevirtual   java/lang/Exception.printStackTrace:()V
                    //   389: return         
                    //   390: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   393: bipush          10
                    //   395: aaload         
                    //   396: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   399: iconst_3       
                    //   400: anewarray       Ljava/lang/Object;
                    //   403: dup            
                    //   404: iconst_0       
                    //   405: invokestatic    org/powerbot/v.a:()Lorg/powerbot/v;
                    //   408: invokevirtual   org/powerbot/v.c:()Lorg/powerbot/v$a_;
                    //   411: invokevirtual   org/powerbot/v$a_.c:()Ljava/lang/String;
                    //   414: aastore        
                    //   415: dup            
                    //   416: iconst_1       
                    //   417: aload_0        
                    //   418: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   421: invokevirtual   org/powerbot/w.b:()Ljava/lang/String;
                    //   424: aastore        
                    //   425: dup            
                    //   426: iconst_2       
                    //   427: iload_3        
                    //   428: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
                    //   431: aastore        
                    //   432: invokestatic    org/powerbot/ab.a:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/InputStream;
                    //   435: invokestatic    org/powerbot/bb.a:(Ljava/io/InputStream;)Ljava/util/Map;
                    //   438: astore          5
                    //   440: goto            478
                    //   443: astore          6
                    //   445: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   448: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   451: iconst_3       
                    //   452: aaload         
                    //   453: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   456: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   459: return         
                    //   460: astore          6
                    //   462: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   465: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   468: bipush          11
                    //   470: aaload         
                    //   471: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   474: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   477: return         
                    //   478: aload           5
                    //   480: iload           10
                    //   482: ifne            494
                    //   485: ifnull          519
                    //   488: goto            492
                    //   491: athrow         
                    //   492: aload           5
                    //   494: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   497: iconst_5       
                    //   498: aaload         
                    //   499: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   502: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
                    //   507: iload           10
                    //   509: ifne            567
                    //   512: ifne            535
                    //   515: goto            519
                    //   518: athrow         
                    //   519: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   522: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   525: iconst_1       
                    //   526: aaload         
                    //   527: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   530: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   533: return         
                    //   534: athrow         
                    //   535: aload           5
                    //   537: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   540: iconst_5       
                    //   541: aaload         
                    //   542: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   545: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   550: checkcast       Ljava/util/Map;
                    //   553: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   556: bipush          12
                    //   558: aaload         
                    //   559: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   562: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
                    //   567: iload           10
                    //   569: ifne            668
                    //   572: ifeq            633
                    //   575: goto            579
                    //   578: athrow         
                    //   579: aload           5
                    //   581: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   584: iconst_5       
                    //   585: aaload         
                    //   586: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   589: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   594: checkcast       Ljava/util/Map;
                    //   597: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   600: bipush          12
                    //   602: aaload         
                    //   603: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   606: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   611: checkcast       Ljava/lang/String;
                    //   614: iload           10
                    //   616: ifne            751
                    //   619: goto            623
                    //   622: athrow         
                    //   623: invokestatic    org/powerbot/bb.a:(Ljava/lang/String;)Z
                    //   626: ifne            731
                    //   629: goto            633
                    //   632: athrow         
                    //   633: aload           5
                    //   635: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   638: iconst_5       
                    //   639: aaload         
                    //   640: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   643: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   648: checkcast       Ljava/util/Map;
                    //   651: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   654: iconst_2       
                    //   655: aaload         
                    //   656: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   659: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
                    //   664: goto            668
                    //   667: athrow         
                    //   668: ifeq            716
                    //   671: aload_0        
                    //   672: getfield        org/powerbot/ob$b_$1.this$1:Lorg/powerbot/ob$b_;
                    //   675: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
                    //   678: aload           5
                    //   680: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   683: iconst_5       
                    //   684: aaload         
                    //   685: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   688: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   693: checkcast       Ljava/util/Map;
                    //   696: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   699: iconst_2       
                    //   700: aaload         
                    //   701: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   704: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
                    //   709: invokestatic    javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
                    //   712: goto            716
                    //   715: athrow         
                    //   716: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   719: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   722: iconst_0       
                    //   723: aaload         
                    //   724: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   727: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   730: return         
                    //   731: aload           4
                    //   733: aload_0        
                    //   734: getfield        org/powerbot/ob$b_$1.val$def:Lorg/powerbot/w;
                    //   737: getfield        org/powerbot/w.g:Ljava/lang/String;
                    //   740: invokevirtual   java/lang/ClassLoader.loadClass:(Ljava/lang/String;)Ljava/lang/Class;
                    //   743: ldc             Lorg/powerbot/core/script/Script;.class
                    //   745: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
                    //   748: invokevirtual   java/lang/Class.newInstance:()Ljava/lang/Object;
                    //   751: checkcast       Lorg/powerbot/core/script/Script;
                    //   754: astore          5
                    //   756: goto            792
                    //   759: astore          6
                    //   761: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //   764: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   767: bipush          6
                    //   769: aaload         
                    //   770: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   773: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //   776: getstatic       org/powerbot/y.c:Z
                    //   779: ifeq            791
                    //   782: aload           6
                    //   784: invokevirtual   java/lang/Exception.printStackTrace:()V
                    //   787: goto            791
                    //   790: athrow         
                    //   791: return         
                    //   792: aload           5
                    //   794: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
                    //   797: ldc             Lorg/powerbot/game/api/Manifest;.class
                    //   799: invokevirtual   java/lang/Class.getAnnotation:(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;
                    //   802: checkcast       Lorg/powerbot/game/api/Manifest;
                    //   805: astore          6
                    //   807: aload           6
                    //   809: iload           10
                    //   811: ifne            823
                    //   814: ifnull          865
                    //   817: goto            821
                    //   820: athrow         
                    //   821: aload           6
                    //   823: invokeinterface org/powerbot/game/api/Manifest.singleinstance:()Z
                    //   828: iload           10
                    //   830: ifne            841
                    //   833: ifeq            865
                    //   836: goto            840
                    //   839: athrow         
                    //   840: iload_3        
                    //   841: ifle            865
                    //   844: aload_0        
                    //   845: getfield        org/powerbot/ob$b_$1.this$1:Lorg/powerbot/ob$b_;
                    //   848: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
                    //   851: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //   854: bipush          7
                    //   856: aaload         
                    //   857: invokestatic    org/powerbot/eb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //   860: invokestatic    javax/swing/JOptionPane.showMessageDialog:(Ljava/awt/Component;Ljava/lang/Object;)V
                    //   863: return         
                    //   864: athrow         
                    //   865: invokestatic    org/powerbot/core/Bot.instance:()Lorg/powerbot/core/Bot;
                    //   868: astore          7
                    //   870: aload           7
                    //   872: aconst_null    
                    //   873: invokevirtual   org/powerbot/core/Bot.setAccount:(Lorg/powerbot/jb$a_;)V
                    //   876: invokestatic    org/powerbot/jb.a:()Lorg/powerbot/jb;
                    //   879: invokevirtual   org/powerbot/jb.iterator:()Ljava/util/Iterator;
                    //   882: astore          8
                    //   884: aload           8
                    //   886: invokeinterface java/util/Iterator.hasNext:()Z
                    //   891: ifeq            973
                    //   894: aload           8
                    //   896: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                    //   901: checkcast       Lorg/powerbot/jb$a_;
                    //   904: astore          9
                    //   906: iload           10
                    //   908: ifne            959
                    //   911: aload_0        
                    //   912: getfield        org/powerbot/ob$b_$1.this$1:Lorg/powerbot/ob$b_;
                    //   915: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
                    //   918: invokestatic    org/powerbot/ob.access$500:(Lorg/powerbot/ob;)Ljavax/swing/JButton;
                    //   921: invokevirtual   javax/swing/JButton.getText:()Ljava/lang/String;
                    //   924: aload           9
                    //   926: invokevirtual   org/powerbot/jb$a_.toString:()Ljava/lang/String;
                    //   929: invokevirtual   java/lang/String.equalsIgnoreCase:(Ljava/lang/String;)Z
                    //   932: iload           10
                    //   934: ifne            1001
                    //   937: goto            941
                    //   940: athrow         
                    //   941: ifeq            964
                    //   944: goto            948
                    //   947: athrow         
                    //   948: aload           7
                    //   950: aload           9
                    //   952: invokevirtual   org/powerbot/core/Bot.setAccount:(Lorg/powerbot/jb$a_;)V
                    //   955: goto            959
                    //   958: athrow         
                    //   959: iload           10
                    //   961: ifeq            973
                    //   964: iload           10
                    //   966: ifeq            884
                    //   969: goto            973
                    //   972: athrow         
                    //   973: aload_2        
                    //   974: invokestatic    org/powerbot/k.a:()Lorg/powerbot/k;
                    //   977: invokevirtual   org/powerbot/k.e:()Ljava/util/Collection;
                    //   980: invokeinterface java/util/Collection.removeAll:(Ljava/util/Collection;)Z
                    //   985: pop            
                    //   986: iload           10
                    //   988: ifne            1023
                    //   991: aload_2        
                    //   992: invokeinterface java/util/Collection.isEmpty:()Z
                    //   997: goto            1001
                    //  1000: athrow         
                    //  1001: ifne            1028
                    //  1004: invokestatic    org/powerbot/ob.access$700:()Ljava/util/logging/Logger;
                    //  1007: getstatic       org/powerbot/ob$b_$1.z:[Ljava/lang/String;
                    //  1010: bipush          9
                    //  1012: aaload         
                    //  1013: invokestatic    org/powerbot/kb.a:(Ljava/lang/String;)Ljava/lang/String;
                    //  1016: invokevirtual   java/util/logging/Logger.severe:(Ljava/lang/String;)V
                    //  1019: goto            1023
                    //  1022: athrow         
                    //  1023: iload           10
                    //  1025: ifeq            1054
                    //  1028: new             Ljava/lang/Thread;
                    //  1031: dup            
                    //  1032: new             Lorg/powerbot/ob$b_$1$0;
                    //  1035: dup            
                    //  1036: aload_0        
                    //  1037: aload           7
                    //  1039: aload           5
                    //  1041: invokespecial   org/powerbot/ob$b_$1$0.<init>:(Lorg/powerbot/ob$b_$1;Lorg/powerbot/core/Bot;Lorg/powerbot/core/script/Script;)V
                    //  1044: invokespecial   java/lang/Thread.<init>:(Ljava/lang/Runnable;)V
                    //  1047: invokevirtual   java/lang/Thread.start:()V
                    //  1050: goto            1054
                    //  1053: athrow         
                    //  1054: return         
                    //    StackMapTable: 00 45 FF 00 21 00 0B 07 00 56 07 01 7B 00 00 00 00 00 00 00 00 01 00 01 07 00 1B 00 FF 00 10 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 79 00 00 00 00 00 01 00 00 FF 00 2C 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 79 07 00 0F 00 00 00 00 01 00 01 07 00 1B 00 02 FF 00 04 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 79 00 00 00 00 00 01 00 00 46 01 4A 07 00 1B 00 FF 00 25 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 26 00 00 00 00 00 01 00 01 07 00 1B FF 00 02 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 79 00 00 00 00 00 01 00 00 49 01 FF 00 0C 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 79 07 01 7D 07 01 7D 01 00 00 01 00 00 20 FF 00 91 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 26 00 00 00 00 00 01 00 01 07 00 1B FF 00 16 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 01 7D 07 01 7D 07 00 1D 07 00 91 07 01 7E 01 00 00 FF 00 34 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 26 07 01 7D 07 00 1D 07 00 91 07 01 7E 01 00 01 07 00 35 50 07 00 36 FF 00 11 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 39 07 01 7D 07 00 1D 07 00 91 07 01 7E 01 00 00 4C 07 00 1B 00 41 07 00 39 57 07 00 1B 00 4E 07 00 1B 00 5F 01 4A 07 00 1B 00 6A 07 00 1B 40 07 00 0F 48 07 00 1B 00 61 07 00 1B 40 01 6E 07 00 1B 00 FF 00 0E 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 00 00 00 00 00 01 00 00 53 07 00 26 47 07 00 1B FF 00 1E 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 00 07 00 1B 00 00 00 01 00 01 07 00 1B 00 FF 00 00 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 3E 00 00 00 00 01 00 00 FF 00 1B 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 3E 07 00 43 00 00 00 01 00 01 07 00 1B 00 41 07 00 43 4F 07 00 1B 00 40 01 56 07 00 1B 00 FF 00 12 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 3E 07 00 43 07 00 BE 07 00 79 00 01 00 00 FF 00 37 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 3E 07 00 43 07 00 BE 07 00 79 07 00 4A 01 00 01 07 00 1B 40 01 45 07 00 1B 00 49 07 00 1B 00 04 47 07 00 1B FF 00 00 00 0B 07 00 56 07 01 7B 07 00 77 01 07 00 1A 07 00 3E 07 00 43 07 00 BE 07 00 79 00 01 00 00 5A 07 00 1B 40 01 54 07 00 1B 00 04 58 07 00 1B 00
                    //    Exceptions:
                    //  Try           Handler
                    //  Start  End    Start  End    Type                            
                    //  -----  -----  -----  -----  --------------------------------
                    //  112    120    123    124    Ljava/lang/Exception;
                    //  73     93     96     97     Ljava/lang/Exception;
                    //  5      33     33     34     Ljava/lang/Exception;
                    //  124    159    162    165    Ljava/lang/Exception;
                    //  165    364    367    390    Ljava/lang/Exception;
                    //  390    440    443    460    Ljava/io/IOException;
                    //  390    440    460    478    Ljava/lang/NullPointerException;
                    //  668    712    715    716    Ljava/lang/Exception;
                    //  623    664    667    668    Ljava/lang/Exception;
                    //  579    629    632    633    Ljava/lang/Exception;
                    //  572    619    622    623    Ljava/lang/Exception;
                    //  567    575    578    579    Ljava/lang/Exception;
                    //  512    534    534    535    Ljava/lang/Exception;
                    //  494    515    518    519    Ljava/lang/Exception;
                    //  478    488    491    492    Ljava/lang/Exception;
                    //  731    756    759    792    Ljava/lang/Exception;
                    //  1023   1050   1053   1054   Ljava/lang/Exception;
                    //  1001   1019   1022   1023   Ljava/lang/Exception;
                    //  973    997    1000   1001   Ljava/lang/Exception;
                    //  959    969    972    973    Ljava/lang/Exception;
                    //  941    955    958    959    Ljava/lang/Exception;
                    //  911    944    947    948    Ljava/lang/Exception;
                    //  906    937    940    941    Ljava/lang/Exception;
                    //  841    864    864    865    Ljava/lang/Exception;
                    //  823    836    839    840    Ljava/lang/Exception;
                    //  807    817    820    821    Ljava/lang/Exception;
                    //  761    787    790    791    Ljava/lang/Exception;
                    // 
                    // The error that occurred was:
                    // 
                    // java.lang.IllegalStateException: Expression is linked from several locations: Label_0579:
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
                    final String[] z2 = new String[15];
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
                    int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 0)))))))))))));
                    String s = "\u000e\u0013P;GKwk\u001b'#\\DnRQ}9\u001c;2\u0018\u0005oI\u0019`>\u001bh#\u0014Lh\u0006Jq9\u001c8#";
                    int n16 = -1;
                    String intern = null;
                Label_0194_Outer:
                    while (true) {
                        final char[] charArray = s.toCharArray();
                        int length;
                        int n18;
                        final int n17 = n18 = (length = charArray.length);
                        int n19 = 0;
                        while (true) {
                            Label_0270: {
                                if (n17 > 1) {
                                    break Label_0270;
                                }
                                length = (n18 = n19);
                                do {
                                    final char c = charArray[n18];
                                    char c2 = '\0';
                                    switch (n19 % 5) {
                                        case 0: {
                                            c2 = 'L';
                                            break;
                                        }
                                        case 1: {
                                            c2 = '\t';
                                            break;
                                        }
                                        case 2: {
                                            c2 = '>';
                                            break;
                                        }
                                        case 3: {
                                            c2 = 'n';
                                            break;
                                        }
                                        default: {
                                            c2 = '=';
                                            break;
                                        }
                                    }
                                    charArray[length] = (char)(c ^ c2);
                                    ++n19;
                                } while (n17 == 0);
                            }
                            if (n17 > n19) {
                                continue;
                            }
                            break;
                        }
                        intern = new String(charArray).intern();
                        switch (n16) {
                            default: {
                                z2[n2] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 1))))))))))))));
                                s = "_l\u001a\u0016\u0019{-LYNsp\u000fY\n.+A\u0018X\u007fm\u0018\u0016\u0005(:";
                                n16 = 0;
                                continue Label_0194_Outer;
                            }
                            case 0: {
                                z2[n] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 2))))))))))))));
                                s = "w{\u001b\n\n<:";
                                n16 = 1;
                                continue Label_0194_Outer;
                            }
                            case 1: {
                                z2[n3] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 3))))))))))))));
                                s = "l|*\u0017$2\\Qt\u0006Vp?\u0014!9\\DnRQ29\u0010;'\u0013KhC";
                                n16 = 2;
                                continue Label_0194_Outer;
                            }
                            case 2: {
                                z2[n4] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 4))))))))))))));
                                s = "H]\\";
                                n16 = 3;
                                continue Label_0194_Outer;
                            }
                            case 3: {
                                z2[n5] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 5))))))))))))));
                                s = "Xg?\u001d";
                                n16 = 4;
                                continue Label_0194_Outer;
                            }
                            case 4: {
                                z2[n6] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 6))))))))))))));
                                s = "\u001e-[WX:r\u0007\u0018\u000f21N\u0018Yyl\u0001\t\u001f";
                                n16 = 5;
                                continue Label_0194_Outer;
                            }
                            case 5: {
                                z2[n7] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 7))))))))))))));
                                s = "mz\"\u0006h$\u001fWrVM2(\u0014&w\u0013Kw_\u0019p.U=$\u0019A;IW2$\u001b-w\u001dFxIL|?U)#\\D;RP\u007f.[";
                                n16 = 6;
                                continue Label_0194_Outer;
                            }
                            case 6: {
                                z2[n8] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 8))))))))))))));
                                s = "\u0014\u0013PwB\u0019|$\u0001h3\u0013RuJVs/U;4\u000eLkR";
                                n16 = 7;
                                continue Label_0194_Outer;
                            }
                            case 7: {
                                z2[n9] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 9))))))))))))));
                                s = "Cq\u001dY\b3>G_O~>\tY\u00188-@H^:q\u0006Y\n50]POh>\n\u0016\u001fw\u007fYTO{m\rY\u001f)&\tYM{w\u0006";
                                n16 = 8;
                                continue Label_0194_Outer;
                            }
                            case 8: {
                                z2[n10] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 10))))))))))))));
                                s = "3+]HY 1G\u000e\u001c,qYW]\u007fl\n\u0016\u001fu0[_\u0005i}\u001a\u0010\u001b/,\u0006YZs1\t\f\u001f3p\u0016CzUM<\u0004\nfzZ\u001eC~#M\nM5b\fK";
                                n16 = 9;
                                continue Label_0194_Outer;
                            }
                            case 9: {
                                z2[n11] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 11))))))))))))));
                                s = "\u00180\\TN:p\u0007\rK2;LV^sx\u0011Y\n.+A\u0018Y\u007fl\u001e\u001c\u0019";
                                n16 = 10;
                                continue Label_0194_Outer;
                            }
                            case 10: {
                                z2[n12] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 12))))))))))))));
                                s = ":<J]Yi";
                                n16 = 11;
                                continue Label_0194_Outer;
                            }
                            case 11: {
                                z2[n13] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 13))))))))))))));
                                s = "rj\u001c\t\u0018ap\u0006O]m0\u0018\u0016\u001c>-KW^4q\u001a\u001eD(<[QZnmG\u0018\u001b2pJWFv{\u000b\r\u000241\u0006\\Emp\u0004\u0016\n?p\u0016CzUM<\u0004\nfzZ\u001eY';\u001b";
                                n16 = 12;
                                continue Label_0194_Outer;
                            }
                            case 12: {
                                z2[n14] = intern;
                                n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = 14))))))))))))));
                                s = "\u0016.f]il@";
                                n16 = 13;
                                continue Label_0194_Outer;
                            }
                            case 13: {
                                break Label_0194_Outer;
                            }
                        }
                    }
                    z2[n15] = intern;
                    z = z2;
                }
            });
            comp8.setFont(comp8.getFont().deriveFont(1, comp8.getFont().getSize2D() - 1.0f));
            comp8.setBackground(null);
            comp8.setFocusable(false);
            comp7.add(comp8);
        }
        
        private Image a(final int n) {
            BufferedImage read;
            try {
                read = ImageIO.read(db.a(Timer.e(b_.z[0])));
            }
            catch (IOException ex) {
                return null;
            }
            final BufferedImage bufferedImage = new BufferedImage(32, 32, 2);
            final Graphics2D graphics = bufferedImage.createGraphics();
            final int n2 = bufferedImage.getHeight() * n;
            graphics.drawImage(read, 0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), 0, n2, bufferedImage.getWidth(), n2 + bufferedImage.getHeight(), null);
            graphics.dispose();
            return bufferedImage.getScaledInstance((int)(bufferedImage.getWidth() / (double)bufferedImage.getHeight() * 32.0), 32, 4);
        }
        
        public void paintComponent(final Graphics p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     3: istore          5
            //     5: aload_0        
            //     6: iload           5
            //     8: ifne            131
            //    11: getfield        org/powerbot/ob$b_.d:[Ljava/awt/Color;
            //    14: iconst_0       
            //    15: aaload         
            //    16: ifnull          118
            //    19: goto            23
            //    22: athrow         
            //    23: aload_0        
            //    24: iload           5
            //    26: ifne            131
            //    29: goto            33
            //    32: athrow         
            //    33: getfield        org/powerbot/ob$b_.d:[Ljava/awt/Color;
            //    36: iconst_1       
            //    37: aaload         
            //    38: ifnull          118
            //    41: goto            45
            //    44: athrow         
            //    45: aload_0        
            //    46: getfield        org/powerbot/ob$b_.a:Ljava/awt/Component;
            //    49: invokevirtual   java/awt/Component.getWidth:()I
            //    52: aload_0        
            //    53: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
            //    56: invokevirtual   org/powerbot/ob.e:()Ljava/awt/Dimension;
            //    59: getfield        java/awt/Dimension.width:I
            //    62: idiv           
            //    63: istore_2       
            //    64: aload_0        
            //    65: invokespecial   org/powerbot/ob$b_.a:()I
            //    68: iload_2        
            //    69: idiv           
            //    70: istore_3       
            //    71: iload_3        
            //    72: iconst_2       
            //    73: irem           
            //    74: iload           5
            //    76: ifne            87
            //    79: ifne            90
            //    82: goto            86
            //    85: athrow         
            //    86: iconst_1       
            //    87: goto            91
            //    90: iconst_0       
            //    91: istore          4
            //    93: aload_0        
            //    94: iload           4
            //    96: ifeq            109
            //    99: aload_0        
            //   100: getfield        org/powerbot/ob$b_.d:[Ljava/awt/Color;
            //   103: iconst_1       
            //   104: aaload         
            //   105: goto            115
            //   108: athrow         
            //   109: aload_0        
            //   110: getfield        org/powerbot/ob$b_.d:[Ljava/awt/Color;
            //   113: iconst_0       
            //   114: aaload         
            //   115: invokevirtual   org/powerbot/ob$b_.setBackground:(Ljava/awt/Color;)V
            //   118: aload_0        
            //   119: aload_1        
            //   120: invokespecial   javax/swing/JPanel.paintComponent:(Ljava/awt/Graphics;)V
            //   123: aload_0        
            //   124: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
            //   127: invokevirtual   org/powerbot/ob.a:()V
            //   130: aload_0        
            //   131: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
            //   134: invokestatic    org/powerbot/ob.access$400:(Lorg/powerbot/ob;)Z
            //   137: iload           5
            //   139: ifne            175
            //   142: ifeq            176
            //   145: goto            149
            //   148: athrow         
            //   149: aload_0        
            //   150: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
            //   153: invokestatic    org/powerbot/ob.access$800:(Lorg/powerbot/ob;)Ljavax/swing/JScrollPane;
            //   156: invokevirtual   javax/swing/JScrollPane.getVerticalScrollBar:()Ljavax/swing/JScrollBar;
            //   159: iconst_0       
            //   160: invokevirtual   javax/swing/JScrollBar.setValue:(I)V
            //   163: aload_0        
            //   164: getfield        org/powerbot/ob$b_.this$0:Lorg/powerbot/ob;
            //   167: iconst_0       
            //   168: invokestatic    org/powerbot/ob.access$402:(Lorg/powerbot/ob;Z)Z
            //   171: goto            175
            //   174: athrow         
            //   175: pop            
            //   176: return         
            //    StackMapTable: 00 15 FF 00 16 00 06 07 00 6E 07 01 97 00 00 00 01 00 01 07 01 85 00 48 07 01 85 40 07 00 6E 4A 07 01 85 00 FF 00 27 00 06 07 00 6E 07 01 97 01 01 00 01 00 01 07 01 85 00 40 01 02 40 01 FF 00 10 00 06 07 00 6E 07 01 97 01 01 01 01 00 01 07 01 85 40 07 00 6E FF 00 05 00 06 07 00 6E 07 01 97 01 01 01 01 00 02 07 00 6E 07 00 03 FF 00 02 00 06 07 00 6E 07 01 97 00 00 00 01 00 00 4C 07 00 6E 50 07 01 85 00 58 07 01 85 40 01 00
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  142    171    174    175    Ljava/lang/RuntimeException;
            //  131    145    148    149    Ljava/lang/RuntimeException;
            //  93     108    108    109    Ljava/lang/RuntimeException;
            //  71     82     85     86     Ljava/lang/RuntimeException;
            //  23     41     44     45     Ljava/lang/RuntimeException;
            //  11     29     32     33     Ljava/lang/RuntimeException;
            //  5      19     22     23     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0023:
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
        
        private int a() {
            final boolean f = qb.f;
            int n = 0;
            final Component[] components = ((JPanel)this.a).getComponents();
            final int length = components.length;
            int i = 0;
            while (i < length) {
                final Component component = components[i];
                Label_0057: {
                    Label_0051: {
                        Component component2;
                        try {
                            final Component component3;
                            component2 = (component3 = component);
                            if (f) {
                                break Label_0057;
                            }
                            final b_ b_ = this;
                            if (component2 == b_) {
                                break Label_0051;
                            }
                            break Label_0051;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final b_ b_ = this;
                            if (component2 == b_) {
                                break;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    Component component3 = component;
                    try {
                        if (component3.isVisible()) {
                            ++n;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                ++i;
                if (f) {
                    break;
                }
            }
            return n;
        }
        
        public w b() {
            return this.b;
        }
        
        static {
            final String[] z2 = new String[5];
            int n5;
            int n4;
            int n3;
            int n2;
            int n = n2 = (n3 = (n4 = (n5 = 0)));
            String s = " 6]\u001b1\t\u0019b.B;>O\u0013!\bUt6\u0004>?]Z4\u0015\u001d";
            int n6 = -1;
            String intern = null;
        Label_0076_Outer:
            while (true) {
                final char[] charArray = s.toCharArray();
                int length;
                int n8;
                final int n7 = n8 = (length = charArray.length);
                int n9 = 0;
                while (true) {
                    Label_0150: {
                        if (n7 > 1) {
                            break Label_0150;
                        }
                        length = (n8 = n9);
                        do {
                            final char c = charArray[n8];
                            char c2 = '\0';
                            switch (n9 % 5) {
                                case 0: {
                                    c2 = 'q';
                                    break;
                                }
                                case 1: {
                                    c2 = 'Y';
                                    break;
                                }
                                case 2: {
                                    c2 = '\r';
                                    break;
                                }
                                case 3: {
                                    c2 = '~';
                                    break;
                                }
                                default: {
                                    c2 = 'g';
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
                        s = "_\b\u001f4o";
                        n6 = 0;
                        continue Label_0076_Outer;
                    }
                    case 0: {
                        z2[n] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 2))));
                        s = "$v]T&\u0002Z\".";
                        n6 = 1;
                        continue Label_0076_Outer;
                    }
                    case 1: {
                        z2[n3] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 3))));
                        s = "\u001fURg";
                        n6 = 2;
                        continue Label_0076_Outer;
                    }
                    case 2: {
                        z2[n4] = intern;
                        n = (n2 = (n3 = (n4 = (n5 = 4))));
                        s = "\u0001<[\u0000,";
                        n6 = 3;
                        continue Label_0076_Outer;
                    }
                    case 3: {
                        break Label_0076_Outer;
                    }
                }
            }
            z2[n5] = intern;
            z = z2;
        }
        
        private final class a_ extends AbstractBorder
        {
            private static final long serialVersionUID = 1L;
            
            @Override
            public void paintBorder(final Component component, final Graphics graphics, final int n, final int n2, final int n3, final int n4) {
                graphics.setColor(Color.WHITE);
                graphics.drawLine(n, n2, n, n4);
                graphics.drawLine(n, n2, n3, n2);
                graphics.setColor(Color.LIGHT_GRAY);
                graphics.drawLine(n + n3 - 1, n2, n + n3 - 1, n2 + n4);
                graphics.drawLine(n, n2 + n4 - 1, n + n3, n2 + n4 - 1);
            }
        }
    }
}
