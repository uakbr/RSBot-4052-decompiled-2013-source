
package org.powerbot;

import java.util.Iterator;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBoxMenuItem;
import java.util.Map;
import java.util.LinkedHashMap;
import org.powerbot.core.Bot;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import org.t;
import org.powerbot.core.script.wrappers.Component;
import javax.swing.JMenu;

public final class tb extends JMenu
{
    private static final long serialVersionUID = 9119892162553131816L;
    private static final String[] z;
    
    public tb() {
        final boolean f = wb.f;
        super(org.powerbot.core.script.wrappers.Component.e(tb.z[0]));
        this.setIcon(new ImageIcon(t.a(tb.z[1])));
        this.setEnabled(Bot.instantiated());
        final wb c = qb.a().c;
        final int a = c.a();
        final LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
        linkedHashMap.put(org.powerbot.core.script.wrappers.Component.e(tb.z[3]), 3);
        linkedHashMap.put(t.a(tb.z[2]), 2);
        linkedHashMap.put(org.powerbot.core.script.wrappers.Component.e(tb.z[4]), 0);
        for (final Map.Entry<Object, Object> entry : linkedHashMap.entrySet()) {
            final int intValue = entry.getValue();
            final JCheckBoxMenuItem menuItem = new JCheckBoxMenuItem(entry.getKey(), a == intValue);
            menuItem.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(final ActionEvent actionEvent) {
                    c.a(intValue);
                }
            });
            this.add(menuItem);
            if (f) {
                break;
            }
        }
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u0003\u0002\\bR";
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
                                c2 = '3';
                                break;
                            }
                            case 1: {
                                c2 = '\\';
                                break;
                            }
                            case 2: {
                                c2 = 'U';
                                break;
                            }
                            case 3: {
                                c2 = '\'';
                                break;
                            }
                            default: {
                                c2 = '_';
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
                    s = "!\u0007FvJ\u007f_\u000e4N:\u000fT~Z~\u0013\f+\u0018#\n\\zPcO4uWk=^|FoS\n5\u0005\f\u0015\\kZaY\u00184O#\fR";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "FY\u0012%\u000e2\u0010Q";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "\u000b\u0000@xQ";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "\b\u0000CtM";
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
