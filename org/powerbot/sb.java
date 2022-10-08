
package org.powerbot;

import org.powerbot.game.api.methods.Widgets;
import java.util.Iterator;
import javax.swing.event.TreeModelEvent;
import java.util.Arrays;
import javax.swing.tree.TreePath;
import java.util.ArrayList;
import javax.swing.event.TreeModelListener;
import java.util.List;
import org.powerbot.game.api.wrappers.widget.Widget;
import org.powerbot.core.script.util.Timer;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.LayoutManager;
import java.awt.Container;
import javax.swing.BoxLayout;
import org.powerbot.game.api.wrappers.widget.WidgetChild;
import org.s;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreeModel;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import org.powerbot.core.script.methods.GroundItems;
import java.util.EventListener;
import org.powerbot.game.bot.Context;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JTree;
import org.powerbot.core.event.listeners.PaintListener;
import javax.swing.JFrame;

public class sb extends JFrame implements PaintListener
{
    private static final long serialVersionUID = 1L;
    private JTree a;
    private f_ b;
    private JPanel c;
    private JTextField d;
    private Rectangle e;
    private Context f;
    private static sb g;
    private static final String[] z;
    
    private static sb a(final Context context) {
        Label_0016: {
            sb sb;
            try {
                final sb sb2;
                sb = (sb2 = org.powerbot.sb.g);
                if (qb.f) {
                    return sb2;
                }
                if (sb == null) {
                    break Label_0016;
                }
                return org.powerbot.sb.g;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (sb == null) {
                    org.powerbot.sb.g = new sb(context);
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return sb.g;
    }
    
    public static void b(final Context f) {
        final sb a = a(f);
        sb sb2 = null;
        Label_0078: {
            Label_0022: {
                sb sb;
                try {
                    sb = (sb2 = a);
                    if (qb.f) {
                        break Label_0078;
                    }
                    final boolean b = sb.isVisible();
                    if (b) {
                        break Label_0022;
                    }
                    break Label_0022;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = sb.isVisible();
                    if (b) {
                        a.f.getBot().getEventManager().removeListener(a);
                        a.e = null;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a.f = f;
            a.b.a("");
            a.f.getBot().getEventManager().addListener(a);
            sb2 = a;
        }
        sb2.setVisible(true);
    }
    
    public sb(final Context f) {
        super(GroundItems.e(sb.z[2]));
        this.e = null;
        this.setIconImage(db.b(org.powerbot.a.a(sb.z[1])));
        this.setDefaultCloseOperation(0);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent windowEvent) {
                sb.this.setVisible(false);
                f.getBot().getEventManager().removeListener(this);
                sb.this.e = null;
            }
        });
        this.f = f;
        (this.b = new f_()).a("");
        (this.a = new JTree(this.b)).setRootVisible(false);
        this.a.setEditable(false);
        this.a.getSelectionModel().setSelectionMode(1);
        this.a.addTreeSelectionListener(new TreeSelectionListener() {
            private static final String[] z;
            
            @Override
            public void valueChanged(final TreeSelectionEvent treeSelectionEvent) {
                final boolean f = qb.f;
                f.associate(Thread.currentThread().getThreadGroup());
                try {
                    final Object lastSelectedPathComponent = sb.this.a.getLastSelectedPathComponent();
                    Label_0067: {
                        Label_0042: {
                            try {
                                if (f) {
                                    return;
                                }
                                final Object o = lastSelectedPathComponent;
                                if (o != null) {
                                    break Label_0042;
                                }
                                return;
                            }
                            catch (RuntimeException ex) {
                                throw ex;
                            }
                            try {
                                final Object o = lastSelectedPathComponent;
                                if (o != null) {
                                    if (!(lastSelectedPathComponent instanceof d_)) {
                                        break Label_0067;
                                    }
                                }
                            }
                            catch (RuntimeException ex2) {
                                throw ex2;
                            }
                        }
                        return;
                    }
                    sb.this.c.removeAll();
                    WidgetChild a = null;
                    Label_0125: {
                        Object o2 = null;
                        Label_0095: {
                            e_ e_;
                            try {
                                e_ = (e_)(o2 = lastSelectedPathComponent);
                                if (f) {
                                    break Label_0095;
                                }
                                final boolean b = e_ instanceof e_;
                                if (b) {
                                    break Label_0095;
                                }
                                break Label_0125;
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                            try {
                                final boolean b = e_ instanceof e_;
                                if (!b) {
                                    break Label_0125;
                                }
                                sb.this.e = ((e_)lastSelectedPathComponent).a().getBoundingRectangle();
                                o2 = lastSelectedPathComponent;
                            }
                            catch (RuntimeException ex4) {
                                throw ex4;
                            }
                        }
                        a = ((e_)o2).a();
                    }
                    if (a == null) {
                        return;
                    }
                    this.a(s.a(sb$1.z[22]), Integer.toString(a.getIndex()));
                    this.a(t.b(sb$1.z[19]), Boolean.toString(a.validate()));
                    this.a(s.a(sb$1.z[24]), Boolean.toString(a.visible()));
                    this.a(t.b(sb$1.z[32]), a.getAbsoluteLocation().toString());
                    this.a(s.a(sb$1.z[21]), a.getRelativeLocation().toString());
                    this.a(t.b(sb$1.z[30]), Integer.toString(a.getWidth()));
                    this.a(s.a(sb$1.z[3]), Integer.toString(a.getHeight()));
                    this.a(t.b(sb$1.z[15]), Integer.toString(a.getId()));
                    this.a(s.a(sb$1.z[7]), Integer.toString(a.getType()));
                    this.a(t.b(sb$1.z[29]), Integer.toString(a.getSpecialType()));
                    this.a(s.a(sb$1.z[10]), Integer.toString(a.getChildId()));
                    this.a(t.b(sb$1.z[17]), Integer.toString(a.getChildIndex()));
                    this.a(s.a(sb$1.z[2]), Integer.toString(a.getTextureId()));
                    this.a(t.b(sb$1.z[16]), a.getText());
                    this.a(s.a(sb$1.z[31]), Integer.toString(a.getTextColor()));
                    this.a(t.b(sb$1.z[20]), Integer.toString(a.getShadowColor()));
                    this.a(s.a(sb$1.z[11]), a.getTooltip());
                    this.a(t.b(sb$1.z[18]), Integer.toString(a.getBorderThickness()));
                    this.a(s.a(sb$1.z[5]), a.getSelectedAction());
                    this.a(t.b(sb$1.z[1]), Integer.toString(a.getModelId()));
                    this.a(s.a(sb$1.z[6]), Integer.toString(a.getModelType()));
                    this.a(t.b(sb$1.z[0]), Integer.toString(a.getModelZoom()));
                    this.a(s.a(sb$1.z[13]), Boolean.toString(a.isInventory()));
                    this.a(t.b(sb$1.z[23]), Integer.toString(a.getChildStackSize()));
                    this.a(s.a(sb$1.z[9]), Integer.toString(a.getBoundsArrayIndex()));
                    this.a(t.b(sb$1.z[25]), Boolean.toString(a.isInScrollableArea()));
                    this.a(s.a(sb$1.z[27]), Integer.toString(a.getParentId()));
                    this.a(t.b(sb$1.z[4]), Integer.toString(a.getHorizontalScrollPosition()));
                    this.a(s.a(sb$1.z[26]), Integer.toString(a.getVerticalScrollPosition()));
                    this.a(t.b(sb$1.z[28]), Integer.toString(a.getScrollableContentWidth()));
                    this.a(s.a(sb$1.z[12]), Integer.toString(a.getScrollableContentHeight()));
                    this.a(t.b(sb$1.z[14]), Integer.toString(a.getHorizontalScrollThumbSize()));
                    this.a(s.a(sb$1.z[8]), Integer.toString(a.getVerticalScrollThumbSize()));
                    sb.this.c.validate();
                    sb.this.c.repaint();
                }
                finally {
                    f.disregard(Thread.currentThread().getThreadGroup());
                }
            }
            
            private void a(final String s, final String s2) {
                final boolean f = qb.f;
                final JPanel panel = new JPanel();
                panel.setAlignmentX(0.0f);
                panel.setLayout(new BoxLayout(panel, 0));
                final String[] array = { s, s2 };
                final int length = array.length;
                int i = 0;
                while (i < length) {
                    final JLabel comp = new JLabel(array[i]);
                    try {
                        comp.setAlignmentY(0.0f);
                        panel.add(comp);
                        ++i;
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
                sb.this.c.add(panel);
            }
            
            static {
                final String[] z2 = new String[33];
                int n33;
                int n32;
                int n31;
                int n30;
                int n29;
                int n28;
                int n27;
                int n26;
                int n25;
                int n24;
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
                int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 0)))))))))))))))))))))))))))))));
                String s = "\u001daY>k\u000f\u000b-K\u0015j.";
                int n34 = -1;
                String intern = null;
            Label_0407_Outer:
                while (true) {
                    final char[] charArray = s.toCharArray();
                    int length;
                    int n36;
                    final int n35 = n36 = (length = charArray.length);
                    int n37 = 0;
                    while (true) {
                        Label_0482: {
                            if (n35 > 1) {
                                break Label_0482;
                            }
                            length = (n36 = n37);
                            do {
                                final char c = charArray[n36];
                                char c2 = '\0';
                                switch (n37 % 5) {
                                    case 0: {
                                        c2 = '8';
                                        break;
                                    }
                                    case 1: {
                                        c2 = '\u0019';
                                        break;
                                    }
                                    case 2: {
                                        c2 = 'U';
                                        break;
                                    }
                                    case 3: {
                                        c2 = 'L';
                                        break;
                                    }
                                    default: {
                                        c2 = 'o';
                                        break;
                                    }
                                }
                                charArray[length] = (char)(c ^ c2);
                                ++n37;
                            } while (n35 == 0);
                        }
                        if (n35 > n37) {
                            continue;
                        }
                        break;
                    }
                    intern = new String(charArray).intern();
                    switch (n34) {
                        default: {
                            z2[n2] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 1))))))))))))))))))))))))))))))));
                            s = "\u001daY>k\u000f\u0018&\u001eX";
                            n34 = 0;
                            continue Label_0407_Outer;
                        }
                        case 0: {
                            z2[n] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 2))))))))))))))))))))))))))))))));
                            s = "\u000esO7xE\u001ezG\u0004`6";
                            n34 = 1;
                            continue Label_0407_Outer;
                        }
                        case 1: {
                            z2[n3] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 3))))))))))))))))))))))))))))))));
                            s = "\u0012s^$eCAz";
                            n34 = 2;
                            continue Label_0407_Outer;
                        }
                        case 2: {
                            z2[n4] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 4))))))))))))))))))))))))))))))));
                            s = "H\u00146l\u0017\"gG4i[\u0010.w\u001b\"aQ7W@\u0002+P\u0011?`\u0007{";
                            n34 = 3;
                            continue Label_0407_Outer;
                        }
                        case 3: {
                            z2[n5] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 5))))))))))))))))))))))))))))))));
                            s = "d\u001e6K\u0003.sSclT\u000f3A\u000e`6";
                            n34 = 4;
                            continue Label_0407_Outer;
                        }
                        case 4: {
                            z2[n6] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 6))))))))))))))))))))))))))))))));
                            s = "\u0017yS&a\u0017\u000f#^\u0005`6";
                            n34 = 5;
                            continue Label_0407_Outer;
                        }
                        case 5: {
                            z2[n7] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 7))))))))))))))))))))))))))))))));
                            s = "\u000eoG&7\u0017";
                            n34 = 6;
                            continue Label_0407_Outer;
                        }
                        case 6: {
                            z2[n8] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 8))))))))))))))))))))))))))))))));
                            s = "=sC\u0015hE\u000f3M\u00016ET1b[\u0017\u000eF\u00157td*wRAz";
                            n34 = 7;
                            continue Label_0407_Outer;
                        }
                        case 7: {
                            z2[n9] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 9))))))))))))))))))))))))))))))));
                            s = "u\u0014/@\u0004zwE1lN[3@\u0004?n\rc";
                            n34 = 8;
                            continue Label_0407_Outer;
                        }
                        case 8: {
                            z2[n10] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 10))))))))))))))))))))))))))))))));
                            s = "\u0019~^/i\u0017\u0012>\u0014@";
                            n34 = 9;
                            continue Label_0407_Outer;
                        }
                        case 9: {
                            z2[n11] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 11))))))))))))))))))))))))))))))));
                            s = "c\u00145B\u00143f\rc";
                            n34 = 10;
                            continue Label_0407_Outer;
                        }
                        case 10: {
                            z2[n12] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 12))))))))))))))))))))))))))))))));
                            s = "=sC\u0010nE\u00146B\u00018zR\u0000bY\u000f?@\u0014\u0012s^$eCAz";
                            n34 = 11;
                            continue Label_0407_Outer;
                        }
                        case 11: {
                            z2[n13] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 13))))))))))))))))))))))))))))))));
                            s = "~\u0015,K\u000e.yE:7\u0017";
                            n34 = 12;
                            continue Label_0407_Outer;
                        }
                        case 12: {
                            z2[n14] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 14))))))))))))))))))))))))))))))));
                            s = "7kI\u0013h]\u00188K\u0016$oQ\bd]\u001e.H,8{P9TF\u000b'\u001eX";
                            n34 = 13;
                            continue Label_0407_Outer;
                        }
                        case 13: {
                            z2[n15] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 15))))))))))))))))))))))))))))))));
                            s = "\u0019j\u0007{";
                            n34 = 14;
                            continue Label_0407_Outer;
                        }
                        case 14: {
                            z2[n16] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 16))))))))))))))))))))))))))))))));
                            s = "\u0004kE/=\u000f";
                            n34 = 15;
                            continue Label_0407_Outer;
                        }
                        case 15: {
                            z2[n17] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 17))))))))))))))))))))))))))))))));
                            s = "l\u0019+H\u001cpgS?bWKb";
                            n34 = 16;
                            continue Label_0407_Outer;
                        }
                        case 16: {
                            z2[n18] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 18))))))))))))))))))))))))))))))));
                            s = "\u0012aO?b]Q6L\u00113eS>t\\Kb";
                            n34 = 17;
                            continue Label_0407_Outer;
                        }
                        case 17: {
                            z2[n19] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 19))))))))))))))))))))))))))))))));
                            s = "y\u0010.M\u001c1zX?=\u000f";
                            n34 = 18;
                            continue Label_0407_Outer;
                        }
                        case 18: {
                            z2[n20] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 20))))))))))))))))))))))))))))))));
                            s = "\u0003f\\?hXQ!K\u0014?|\u0007{";
                            n34 = 19;
                            continue Label_0407_Outer;
                        }
                        case 19: {
                            z2[n21] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 21))))))))))))))))))))))))))))))));
                            s = "e\u001e6O\u00143`RcaX\u0018;Z\t5x\rc";
                            n34 = 20;
                            continue Label_0407_Outer;
                        }
                        case 20: {
                            z2[n22] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 22))))))))))))))))))))))))))))))));
                            s = "~\u0015>K\u0018`6";
                            n34 = 21;
                            continue Label_0407_Outer;
                        }
                        case 21: {
                            z2[n23] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 23))))))))))))))))))))))))))))))));
                            s = "\u0013fT7c\u000f\u00026E\u001b;.N2}JKb";
                            n34 = 22;
                            continue Label_0407_Outer;
                        }
                        case 22: {
                            z2[n24] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 24))))))))))))))))))))))))))))))));
                            s = "a\u0012)G\u00026s\rc";
                            n34 = 23;
                            continue Label_0407_Outer;
                        }
                        case 23: {
                            z2[n25] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 25))))))))))))))))))))))))))))))));
                            s = "|\u00120K\u0014<o_7b\u000f\u00100A\u0019j.";
                            n34 = 24;
                            continue Label_0407_Outer;
                        }
                        case 24: {
                            z2[n26] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 26))))))))))))))))))))))))))))))));
                            s = "P\u001e.x\u0005(b^ l[(9\\\u000f6zg,~^\u000f3A\u000e`6";
                            n34 = 25;
                            continue Label_0407_Outer;
                        }
                        case 25: {
                            z2[n27] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 27))))))))))))))))))))))))))))))));
                            s = "g\u001a(K\u000e.6^'7\u0017";
                            n34 = 26;
                            continue Label_0407_Outer;
                        }
                        case 26: {
                            z2[n28] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 28))))))))))))))))))))))))))))))));
                            s = "H\u00146w\u001b\"aQ7fM\u001d'g\u0017>zX5sx\u0018&P\u0010j.";
                            n34 = 27;
                            continue Label_0407_Outer;
                        }
                        case 27: {
                            z2[n29] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 29))))))))))))))))))))))))))))))));
                            s = "\u0003~X8nN\u001dbP\u0001 k\u0007{";
                            n34 = 28;
                            continue Label_0407_Outer;
                        }
                        case 28: {
                            z2[n30] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 30))))))))))))))))))))))))))))))));
                            s = "x\u0018&P\u0010j.";
                            n34 = 29;
                            continue Label_0407_Outer;
                        }
                        case 29: {
                            z2[n31] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 31))))))))))))))))))))))))))))))));
                            s = "\u000esO7-T\u00146A\u0012`6";
                            n34 = 30;
                            continue Label_0407_Outer;
                        }
                        case 30: {
                            z2[n32] = intern;
                            n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = (n21 = (n22 = (n23 = (n24 = (n25 = (n26 = (n27 = (n28 = (n29 = (n30 = (n31 = (n32 = (n33 = 32))))))))))))))))))))))))))))))));
                            s = "n\u00131K\u0014%zX{k@\u0012#P\u0011?`\u0007{";
                            n34 = 31;
                            continue Label_0407_Outer;
                        }
                        case 31: {
                            break Label_0407_Outer;
                        }
                    }
                }
                z2[n33] = intern;
                z = z2;
            }
        });
        final JScrollPane comp = new JScrollPane(this.a);
        comp.setPreferredSize(new Dimension(250, 500));
        this.add(comp, GroundItems.e(sb.z[7]));
        (this.c = new JPanel()).setLayout(new BoxLayout(this.c, 1));
        final JScrollPane comp2 = new JScrollPane(this.c);
        comp2.setPreferredSize(new Dimension(250, 500));
        this.add(comp2, org.powerbot.a.a(sb.z[3]));
        final ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                sb.this.b.a(sb.this.d.getText());
                sb.this.c.removeAll();
                sb.this.c.validate();
                sb.this.c.repaint();
            }
        };
        final JPanel comp3 = new JPanel();
        comp3.setLayout(new FlowLayout(0));
        comp3.add(new JLabel(GroundItems.e(sb.z[6])));
        (this.d = new JTextField(20)).addActionListener(actionListener);
        comp3.add(this.d);
        final JButton comp4 = new JButton(org.powerbot.a.a(sb.z[5]));
        comp4.addActionListener(actionListener);
        comp3.add(comp4);
        this.add(comp3, GroundItems.e(sb.z[4]));
        this.pack();
        this.setLocationRelativeTo(this.getOwner());
        this.setVisible(false);
        hb.a().b(org.powerbot.a.a(sb.z[0]), this.getTitle());
    }
    
    @Override
    public void onRepaint(final Graphics graphics) {
        Label_0017: {
            try {
                if (qb.f) {
                    break Label_0017;
                }
                final sb sb = this;
                final Rectangle rectangle = sb.e;
                if (rectangle != null) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final sb sb = this;
                final Rectangle rectangle = sb.e;
                if (rectangle == null) {
                    return;
                }
                graphics.setColor(Color.orange);
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        graphics.drawRect(this.e.x, this.e.y, this.e.width, this.e.height);
    }
    
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
        String s = "]Lr(K0.\u0000Q,EWs=\u0001";
        int n9 = -1;
        String intern = null;
    Label_0110_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n11;
            final int n10 = n11 = (length = charArray.length);
            int n12 = 0;
            while (true) {
                Label_0185: {
                    if (n10 > 1) {
                        break Label_0185;
                    }
                    length = (n11 = n12);
                    do {
                        final char c = charArray[n11];
                        char c2 = '\0';
                        switch (n12 % 5) {
                            case 0: {
                                c2 = '\t';
                                break;
                            }
                            case 1: {
                                c2 = 'h';
                                break;
                            }
                            case 2: {
                                c2 = '5';
                                break;
                            }
                            case 3: {
                                c2 = '\u0002';
                                break;
                            }
                            default: {
                                c2 = '\r';
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
                    s = "6.\u000bN5XFs<\u0001-&\u0019F%Y\nq#W4#\u0011B/DVI~\u001bt\u0014\u001dE)^\u000bf!I";
                    n9 = 0;
                    continue Label_0110_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "\u0001#\u000eG7_\u0017R%_:%\u0018E ";
                    n9 = 1;
                    continue Label_0110_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "\u0007.\u0016U%X";
                    n9 = 2;
                    continue Label_0110_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "\u0018%\u0018T:";
                    n9 = 3;
                    continue Label_0110_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = "\u0011;\u001c@4O";
                    n9 = 4;
                    continue Label_0110_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "\u0010#\u0006T7Y\r";
                    n9 = 5;
                    continue Label_0110_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = "|Rd)";
                    n9 = 6;
                    continue Label_0110_Outer;
                }
                case 6: {
                    break Label_0110_Outer;
                }
            }
        }
        z2[n8] = intern;
        z = z2;
    }
    
    private final class e_
    {
        private WidgetChild a;
        private static final String z;
        
        public e_(final WidgetChild a) {
            this.a = a;
        }
        
        public WidgetChild a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean f = qb.f;
            Label_0049: {
                boolean b2 = false;
                boolean equals = false;
                Label_0031: {
                    boolean b = false;
                    Label_0017: {
                        try {
                            final Object o2 = o;
                            if (f) {
                                break Label_0017;
                            }
                            if (o == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        final Object o2 = o;
                        try {
                            b = (equals = (b2 = (o2 instanceof e_)));
                            if (f) {
                                break Label_0049;
                            }
                            if (b) {
                                break Label_0031;
                            }
                            return false;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (!b) {
                            return false;
                        }
                        b2 = (equals = this.a.equals(((e_)o).a()));
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (f) {
                        return b2;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return true;
            b2 = false;
            return b2;
        }
        
        @Override
        public String toString() {
            return Timer.e(e_.z) + this.a.getIndex();
        }
        
        static {
            final char[] charArray = "}l \u000e\"wo\u0005)\u0002N(".toCharArray();
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
                                c2 = ' ';
                                break;
                            }
                            case 1: {
                                c2 = '&';
                                break;
                            }
                            case 2: {
                                c2 = 'N';
                                break;
                            }
                            case 3: {
                                c2 = 'J';
                                break;
                            }
                            default: {
                                c2 = 'M';
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
    }
    
    private final class d_
    {
        private Widget a;
        private static final String z;
        
        public d_(final Widget a) {
            this.a = a;
        }
        
        public Widget a() {
            return this.a;
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean f = qb.f;
            Label_0049: {
                boolean b2 = false;
                boolean equals = false;
                Label_0031: {
                    boolean b = false;
                    Label_0017: {
                        try {
                            final Object o2 = o;
                            if (f) {
                                break Label_0017;
                            }
                            if (o == null) {
                                return false;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        final Object o2 = o;
                        try {
                            b = (equals = (b2 = (o2 instanceof d_)));
                            if (f) {
                                break Label_0049;
                            }
                            if (b) {
                                break Label_0031;
                            }
                            return false;
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    try {
                        if (!b) {
                            return false;
                        }
                        b2 = (equals = this.a.equals(((d_)o).a()));
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    if (f) {
                        return b2;
                    }
                    if (!equals) {
                        return false;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            return true;
            b2 = false;
            return b2;
        }
        
        @Override
        public String toString() {
            return t.b(d_.z) + this.a.getIndex();
        }
        
        static {
            final char[] charArray = "\u0012o7\u001bnNT".toCharArray();
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
                                c2 = 'R';
                                break;
                            }
                            case 1: {
                                c2 = 'n';
                                break;
                            }
                            case 2: {
                                c2 = 'D';
                                break;
                            }
                            case 3: {
                                c2 = '\u0014';
                                break;
                            }
                            default: {
                                c2 = '\u001c';
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
    }
    
    private final class f_ implements TreeModel
    {
        private final Object a;
        private final List<TreeModelListener> b;
        private final List<d_> c;
        final /* synthetic */ sb this$0;
        
        private f_() {
            this.a = new Object();
            this.b = new ArrayList<TreeModelListener>();
            this.c = new ArrayList<d_>();
        }
        
        @Override
        public Object getRoot() {
            return this.a;
        }
        
        @Override
        public Object getChild(final Object o, final int n) {
            final boolean f = qb.f;
            sb.this.f.associate(Thread.currentThread().getThreadGroup());
            try {
                Object o2 = o;
                if (!f) {
                    if (o == this.a) {
                        return this.c.get(n);
                    }
                    o2 = o;
                }
                boolean b = false;
                Label_0125: {
                    Label_0121: {
                        try {
                            b = (o2 instanceof d_);
                            if (f) {
                                break Label_0125;
                            }
                            if (!b) {
                                break Label_0121;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        return new e_(((d_)o).a().getChildren()[n]);
                    }
                    final boolean b2 = o instanceof e_;
                }
                if (b) {
                    return new e_(((e_)o).a().getChildren()[n]);
                }
                return null;
            }
            finally {
                sb.this.f.disregard(Thread.currentThread().getThreadGroup());
            }
        }
        
        @Override
        public int getChildCount(final Object o) {
            final boolean f = qb.f;
            sb.this.f.associate(Thread.currentThread().getThreadGroup());
            try {
                Object o2 = o;
                if (!f) {
                    if (o == this.a) {
                        return this.c.size();
                    }
                    o2 = o;
                }
                Label_0112: {
                    boolean b = false;
                    Label_0108: {
                        try {
                            final int n;
                            b = ((n = ((o2 instanceof d_) ? 1 : 0)) != 0);
                            if (f) {
                                break Label_0112;
                            }
                            if (!b) {
                                break Label_0108;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        return ((d_)o).a().getChildren().length;
                    }
                    final boolean b2;
                    int n = (b2 = (o instanceof e_)) ? 1 : 0;
                    try {
                        if (f) {
                            return n;
                        }
                        if (!b) {
                            return 0;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return ((e_)o).a().getChildren().length;
                return 0;
            }
            finally {
                sb.this.f.disregard(Thread.currentThread().getThreadGroup());
            }
        }
        
        @Override
        public boolean isLeaf(final Object o) {
            final boolean f = qb.f;
            sb.this.f.associate(Thread.currentThread().getThreadGroup());
            try {
                int n2;
                int length;
                final int n = length = (n2 = ((o instanceof e_) ? 1 : 0));
                if (!f) {
                    try {
                        if (n == 0) {
                            return false;
                        }
                        n2 = (length = ((e_)o).a().getChildren().length);
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                try {
                    if (f) {
                        return n2 != 0;
                    }
                    if (length != 0) {
                        return false;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
                n2 = 1;
                return n2 != 0;
                n2 = 0;
                return n2 != 0;
            }
            finally {
                sb.this.f.disregard(Thread.currentThread().getThreadGroup());
            }
        }
        
        @Override
        public void valueForPathChanged(final TreePath treePath, final Object o) {
        }
        
        @Override
        public int getIndexOfChild(final Object o, final Object o2) {
            final boolean f = qb.f;
            sb.this.f.associate(Thread.currentThread().getThreadGroup());
            try {
                Object o3 = o;
                if (!f) {
                    if (o == this.a) {
                        return this.c.indexOf(o2);
                    }
                    o3 = o;
                }
                Label_0127: {
                    Label_0123: {
                        try {
                            final int n;
                            final boolean b2;
                            final boolean b = b2 = ((n = ((o3 instanceof d_) ? 1 : 0)) != 0);
                            if (f) {
                                break Label_0127;
                            }
                            if (!b) {
                                break Label_0123;
                            }
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        return Arrays.asList(((d_)o).a().getChildren()).indexOf(((e_)o2).a());
                    }
                    boolean b2;
                    int n = (b2 = (o instanceof e_)) ? 1 : 0;
                    try {
                        if (f) {
                            return n;
                        }
                        if (!b2) {
                            return -1;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                return Arrays.asList(((e_)o).a().getChildren()).indexOf(((e_)o2).a());
                return -1;
            }
            finally {
                sb.this.f.disregard(Thread.currentThread().getThreadGroup());
            }
        }
        
        @Override
        public void addTreeModelListener(final TreeModelListener treeModelListener) {
            this.b.add(treeModelListener);
        }
        
        @Override
        public void removeTreeModelListener(final TreeModelListener treeModelListener) {
            this.b.remove(treeModelListener);
        }
        
        private void a(final Object o) {
            final boolean f = qb.f;
            final TreeModelEvent treeModelEvent = new TreeModelEvent(this, new Object[] { o });
            final Iterator<TreeModelListener> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                iterator.next().treeStructureChanged(treeModelEvent);
                if (f) {
                    break;
                }
            }
        }
        
        public void a(final String s) {
            final boolean f = qb.f;
            this.c.clear();
            sb.this.f.associate(Thread.currentThread().getThreadGroup());
            final Widget[] loaded = Widgets.getLoaded();
            final int length = loaded.length;
            int n = 0;
            do {
                int i = 0;
                Label_0040: {
                    i = n;
                }
                Label_0042:
                while (i < length) {
                    final Widget widget = loaded[n];
                    final WidgetChild[] children = widget.getChildren();
                    final int length2 = children.length;
                    if (!f) {
                        int n2 = 0;
                    Label_0247:
                        do {
                            int j = 0;
                            Label_0072:
                            Label_0074:
                            while (j < length2) {
                                final WidgetChild widgetChild = children[n2];
                                final int n3 = i = (this.a(widgetChild, s) ? 1 : 0);
                                if (!f) {
                                    Label_0142: {
                                        Label_0136: {
                                            Label_0110: {
                                                try {
                                                    if (f) {
                                                        break Label_0136;
                                                    }
                                                    if (n3 != 0) {
                                                        break Label_0110;
                                                    }
                                                    break Label_0142;
                                                }
                                                catch (RuntimeException ex) {
                                                    throw ex;
                                                }
                                                try {
                                                    if (n3 == 0) {
                                                        break Label_0142;
                                                    }
                                                    this.c.add(new d_(widget));
                                                }
                                                catch (RuntimeException ex2) {
                                                    throw ex2;
                                                }
                                            }
                                        }
                                        if (!f) {
                                            break;
                                        }
                                    }
                                    final WidgetChild[] children2 = widgetChild.getChildren();
                                    final int length3 = children2.length;
                                    int k = 0;
                                    while (k < length3) {
                                        final WidgetChild widgetChild2 = children2[k];
                                        Label_0234: {
                                            try {
                                                if (f) {
                                                    break Label_0234;
                                                }
                                                j = (this.a(widgetChild2, s) ? 1 : 0);
                                                if (f) {
                                                    continue Label_0074;
                                                }
                                            }
                                            catch (RuntimeException ex3) {
                                                throw ex3;
                                            }
                                            Label_0227: {
                                                try {
                                                    if (j == 0) {
                                                        break Label_0227;
                                                    }
                                                    final f_ f_ = this;
                                                    final List<d_> list = f_.c;
                                                    final f_ f_2 = this;
                                                    final sb sb = f_2.this$0;
                                                    final Widget widget2 = widget;
                                                    final d_ d_ = sb.new d_(widget2);
                                                    list.add(d_);
                                                    final boolean b = f;
                                                    if (b) {
                                                        break Label_0227;
                                                    }
                                                    break Label_0247;
                                                }
                                                catch (RuntimeException ex4) {
                                                    throw ex4;
                                                }
                                                try {
                                                    final f_ f_ = this;
                                                    final List<d_> list = f_.c;
                                                    final f_ f_2 = this;
                                                    final sb sb = f_2.this$0;
                                                    final Widget widget2 = widget;
                                                    final d_ d_ = sb.new d_(widget2);
                                                    list.add(d_);
                                                    final boolean b = f;
                                                    if (!b) {
                                                        break Label_0247;
                                                    }
                                                    ++k;
                                                }
                                                catch (RuntimeException ex5) {
                                                    throw ex5;
                                                }
                                            }
                                        }
                                        if (f) {
                                            break;
                                        }
                                    }
                                    ++n2;
                                    continue Label_0072;
                                }
                                continue Label_0042;
                            }
                            break;
                        } while (!f);
                        ++n;
                        continue Label_0040;
                    }
                    return;
                }
                break;
            } while (!f);
            this.a(this.a);
            sb.this.f.disregard(Thread.currentThread().getThreadGroup());
        }
        
        private boolean a(final WidgetChild widgetChild, final String s) {
            return widgetChild.getText().toLowerCase().contains(s.toLowerCase());
        }
    }
}
