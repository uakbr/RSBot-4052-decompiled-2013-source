
package org.powerbot;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.LayoutManager;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Component;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.io.IOException;
import org.powerbot.core.script.internal.wrappers.Deque;
import org.powerbot.game.api.util.SkillData;
import java.awt.Frame;
import javax.swing.JDialog;

public final class nb extends JDialog
{
    private static final long serialVersionUID = 1L;
    private static final String[] z;
    
    public nb(final Frame owner, final boolean visible) {
        super(owner, SkillData.e(nb.z[0]), true);
        String text = Deque.e(nb.z[1]);
        try {
            text = cb.b(db.a(SkillData.e(nb.z[4])));
            text = text.substring(text.indexOf(10)).trim();
        }
        catch (IOException ex3) {}
        final JTextArea view = new JTextArea(text);
        view.setEditable(false);
        view.setFont(this.getFont());
        final JScrollPane comp = new JScrollPane(view);
        comp.setPreferredSize(new Dimension(600, 250));
        this.add(comp);
        final JPanel comp2 = new JPanel(new FlowLayout(2));
        final JButton comp3 = new JButton(visible ? Deque.e(nb.z[6]) : SkillData.e(nb.z[2]));
        final JButton comp4 = new JButton(Deque.e(nb.z[3]));
        Label_0199: {
            try {
                if (qb.f) {
                    return;
                }
                final boolean b = visible;
                if (!b) {
                    break Label_0199;
                }
                break Label_0199;
            }
            catch (IOException ex) {
                throw ex;
            }
            try {
                final boolean b = visible;
                if (!b) {
                    comp3.setPreferredSize(new Dimension((int)(comp3.getPreferredSize().width * 1.75), comp3.getPreferredSize().height));
                }
            }
            catch (IOException ex2) {
                throw ex2;
            }
        }
        comp3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                nb.this.dispose();
            }
        });
        comp4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent actionEvent) {
                System.exit(1);
            }
        });
        comp4.setVisible(visible);
        comp2.add(comp3);
        comp2.add(comp4);
        this.add(comp2, SkillData.e(nb.z[7]));
        this.pack();
        this.setMinimumSize(this.getSize());
        this.setResizable(false);
        this.setLocationRelativeTo(this.getParent());
        this.setDefaultCloseOperation(0);
        this.setVisible(true);
        hb.a().b(Deque.e(nb.z[5]), this.getTitle());
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
        String s = "F3o K\u001eXKv'x7\u007feD\u0003YKa-d>e1L\u0002S\u0018";
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
                                c2 = 'P';
                                break;
                            }
                            case 1: {
                                c2 = 'g';
                                break;
                            }
                            case 2: {
                                c2 = 'V';
                                break;
                            }
                            case 3: {
                                c2 = 'x';
                                break;
                            }
                            default: {
                                c2 = '\u007f';
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
                    s = "\u0002%06\u0014\u0019@\u000e\u0010s;$25\f\u0019@\u0016\u001602%\"1X\u001a\t\u0016\u001a\u007fw;=1\u0019\u000f\u0005Z\t:$\"%t\b\u0013\u0017\u001f\r18?\u007f;\n\u001b@\u000e\u0010s!\"4#X\u0010\t\u0019\u001a=$.q=\u0016\u001a\u000f\b\u00122#\">:";
                    n9 = 0;
                    continue Label_0102_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 2)))))));
                    s = "E\u0011";
                    n9 = 1;
                    continue Label_0102_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 3)))))));
                    s = "8\u0005\u0019\u0013:9.";
                    n9 = 2;
                    continue Label_0102_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 4)))))));
                    s = "\u0001T\bG,y?\"1]\u0019";
                    n9 = 3;
                    continue Label_0102_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 5)))))));
                    s = ";\"21\u0016\u000f\u0005U";
                    n9 = 4;
                    continue Label_0102_Outer;
                }
                case 4: {
                    z2[n6] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 6)))))));
                    s = "\u0016(21\b\b";
                    n9 = 5;
                    continue Label_0102_Outer;
                }
                case 5: {
                    z2[n7] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = 7)))))));
                    s = ">R\u001eV*";
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
