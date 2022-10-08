
package org.powerbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.event.MouseListener;
import org.powerbot.core.script.wrappers.Item;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.BorderFactory;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.GridLayout;
import org.t;
import java.awt.Frame;
import javax.swing.JDialog;

public final class lb extends JDialog
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    
    public lb(final Frame owner) {
        final boolean f = qb.f;
        super(owner, t.a(lb.z[11]), true);
        final JPanel comp = new JPanel(new GridLayout(0, 1));
        comp.setBorder(BorderFactory.createEmptyBorder(10, 15, 5, 5));
        comp.setBackground(Color.WHITE);
        final JPanel comp2 = new JPanel(new GridLayout(0, 2));
        comp2.setBackground(comp.getBackground());
        final JLabel comp3 = new JLabel(kb.a(lb.z[0]) + Integer.toString(4052));
        comp3.setFont(comp3.getFont().deriveFont(1));
        comp3.setForeground(Color.DARK_GRAY);
        comp2.add(comp3);
        final JLabel comp4 = new JLabel("", 4);
        final long[] array = { Runtime.getRuntime().maxMemory() / 1024L / 1024L, Runtime.getRuntime().totalMemory() / 1024L / 1024L, Runtime.getRuntime().availableProcessors() };
        comp4.setText(String.format(t.a(lb.z[13]), array[0], Math.round(array[1] / (double)array[0] * 100.0), array[2]));
        comp4.setForeground(Color.GRAY);
        comp2.add(comp4);
        comp.add(comp2);
        comp.add(Box.createVerticalStrut(1));
        comp.add(new JLabel(kb.a(lb.z[4])));
        comp.add(new JLabel(t.a(lb.z[8])));
        comp.add(new JLabel(kb.a(lb.z[10])));
        comp.add(Box.createVerticalStrut(1));
        final String[] array2 = { t.a(lb.z[2]), kb.a(lb.z[1]), t.a(lb.z[7]) };
        final int length = array2.length;
        int i = 0;
        while (i < length) {
            final JLabel comp5 = new JLabel(array2[i]);
            comp5.setFont(comp5.getFont().deriveFont(comp5.getFont().getSize() - 2.0f));
            comp5.setForeground(Color.GRAY);
            comp.add(comp5);
            ++i;
            if (f) {
                break;
            }
        }
        final GridLayout layout = new GridLayout(1, 2);
        layout.setHgap(5);
        final JPanel comp6 = new JPanel(layout);
        final int hgap = layout.getHgap();
        comp6.setBorder(BorderFactory.createEmptyBorder(hgap, hgap, hgap, hgap));
        final JLabel comp7 = new JLabel(kb.a(lb.z[3]));
        comp7.setPreferredSize(new Dimension((int)(comp7.getPreferredSize().width * 1.2), (int)(comp7.getPreferredSize().height * 1.2)));
        comp7.setCursor(Cursor.getPredefinedCursor(12));
        comp7.addMouseListener(new MouseAdapter() {
            private static final String z;
            
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                qb.a(Item.e(lb$2.z));
            }
            
            static {
                final char[] charArray = "9^v:e\u0010k\u001bSF\u007fZm=:M&\u0003P\u001f>Xee".toCharArray();
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
                                    c2 = 'f';
                                    break;
                                }
                                case 1: {
                                    c2 = 's';
                                    break;
                                }
                                case 2: {
                                    c2 = '5';
                                    break;
                                }
                                case 3: {
                                    c2 = '\u0013';
                                    break;
                                }
                                default: {
                                    c2 = 'h';
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
        final JLabel comp8 = new JLabel(t.a(lb.z[5]));
        comp8.setCursor(Cursor.getPredefinedCursor(12));
        comp8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(final MouseEvent mouseEvent) {
                lb.this.dispose();
                new nb(owner, false);
            }
        });
        final JButton button = new JButton(kb.a(lb.z[6]));
        button.setPreferredSize(new Dimension((int)(button.getPreferredSize().width * 1.2), (int)(button.getPreferredSize().height * 1.2)));
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                lb.this.dispose();
            }
        });
        comp6.add(comp7);
        comp6.add(comp8);
        int j = 0;
    Label_0827:
        while (true) {
            while (j < 3) {
                try {
                    comp6.add(Box.createHorizontalGlue());
                    ++j;
                    if (f) {
                        break Label_0827;
                    }
                    if (!f) {
                        continue;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                break;
                final JPanel comp9 = new JPanel(new GridLayout(0, 1));
                comp9.add(comp);
                this.add(comp9);
                this.add(comp6, t.a(lb.z[12]));
                this.getRootPane().setDefaultButton(button);
                button.requestFocusInWindow();
                this.pack();
                this.setMinimumSize(this.getSize());
                this.setResizable(false);
                this.setLocationRelativeTo(this.getParent());
                this.setVisible(true);
                hb.a().b(kb.a(lb.z[9]), this.getTitle());
                return;
            }
            comp6.add(button);
            continue Label_0827;
        }
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
        String s = "\u0007\"\u0015i[4";
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
                                c2 = 'B';
                                break;
                            }
                            case 1: {
                                c2 = '\'';
                                break;
                            }
                            case 2: {
                                c2 = '@';
                                break;
                            }
                            case 3: {
                                c2 = 'P';
                                break;
                            }
                            default: {
                                c2 = '8';
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
                    s = "\u0007\u00049c|wQf\"N6\u001e9rJzD6&\u00001Q:g[qB\u007f&\u0002&Q6tJ4Dd&\n0\u001c6tDg\u0010w)\nu\u00128vVfYq/\u001a&Q8`\u000f^Qq\"\u0016u\u001e%&F`C6+\u00076\u00149uJqC8";
                    n15 = 0;
                    continue Label_0182_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 2)))))))))))));
                    s = "plN\u000b\u000b\u001f&\u000eU¨\u0002pSN9\\3\fQbGtA\u001c3\\(\u0018\u0010LC~E\u0016x\u00d5gO\t?\u001b9\rNjLvL\u0010LC~E\u0016x03\u001a\u001e";
                    n15 = 1;
                    continue Label_0182_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 3)))))))))))));
                    s = "(Xb*\u0002kM6&GfUpzIvViv@cUd%\u0001!_8tH(\u001fwyRz\u0019#kC*";
                    n15 = 2;
                    continue Label_0182_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 4)))))))))))));
                    s = "\u0016\u001e'\u007f]}W~3N\u00fcQe6\u001e%\u0010;g\\e@d&e:`8g&:\u001d3oAsC6\u000e\u0000!V;&c`T6&\u00001Q>r\\4\\\u007f$\u000b;\u00028t\\:";
                    n15 = 3;
                    continue Label_0182_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 5)))))))))))));
                    s = "@/\n]j\u001c%AN0\u000e\"\u0018\r!\u0001>\u001e\"1\u001f\"\u0010Cc\u001e6APdS/\n]j\u001c";
                    n15 = 4;
                    continue Label_0182_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 6)))))))))))));
                    s = "\u001a:";
                    n15 = 5;
                    continue Label_0182_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 7)))))))))))));
                    s = "vqI\u001dx\f5\u0011WtCt\u0000\u0007+\\.\rCsG}\u0000\u00191\b/^^i\u0002nA\u001c*\u001d)\nI&CwDN1\u000fg\u0010_r\u0002xF\b1\u0010.\u001fDcF9W\u0007,\u0014g4QaGa\u0000\",\u0018iR\u0010hMk\u0000\n7\\3\u0016U\u007f\u0002|N\n7\u000e4\u001b\u0010sQxG\u000bx\u0013!^_sP9S\u0001>\b0\u001fBc\f";
                    n15 = 6;
                    continue Label_0182_Outer;
                }
                case 6: {
                    z2[n8] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 8)))))))))))));
                    s = "``\u0000\u001b+\u0015)\u0019\u0010rJpSN+\u0013!\nGgP|\u0000\u00177\tg\u001fWtG|\u0000\u001a7\\%\u001b\u0010dMlN\nx\u001e>^DnG9T\u000b*\u00114^_`\u0002mH\u000bx\u0010.\u001dUhQ|\u0000\u000f?\u000e\"\u001b]cLm\u000e";
                    n15 = 7;
                    continue Label_0182_Outer;
                }
                case 7: {
                    z2[n9] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 9)))))))))))));
                    s = "4\u00138s[;";
                    n15 = 8;
                    continue Label_0182_Outer;
                }
                case 8: {
                    z2[n10] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 10)))))))))))));
                    s = "A^w2\u001a=\u001e%o\\qT62\u001d0Q8`\u000f`X\u007f4N4\u0001'jFwQb.\u0001;Q>u\u000fdBy/\u00077\u0018#cK:";
                    n15 = 9;
                    continue Label_0182_Outer;
                }
                case 9: {
                    z2[n11] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 11)))))))))))));
                    s = "c{O\u001b,";
                    n15 = 10;
                    continue Label_0182_Outer;
                }
                case 10: {
                    z2[n12] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 12)))))))))))));
                    s = "qvU\u001a0";
                    n15 = 11;
                    continue Label_0182_Outer;
                }
                case 11: {
                    z2[n13] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = 13)))))))))))));
                    s = "Y4\u0013\u0010.\u0007j\u0005Kq\\b\rH";
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
