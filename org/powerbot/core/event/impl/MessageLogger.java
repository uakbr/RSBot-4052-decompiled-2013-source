
package org.powerbot.core.event.impl;

import org.powerbot.game.bot.handler.input.a;
import org.s;
import org.powerbot.core.event.events.MessageEvent;
import java.util.logging.Logger;
import org.powerbot.core.event.listeners.MessageListener;

public class MessageLogger implements MessageListener
{
    private static final Logger log;
    private static final String[] z;
    
    @Override
    public void messageReceived(final MessageEvent messageEvent) {
        final int a = TPlane.a;
        Label_0081: {
            Label_0024: {
                try {
                    if (a != 0) {
                        break Label_0081;
                    }
                    final MessageEvent messageEvent2 = messageEvent;
                    final String s = messageEvent2.getSender();
                    final String s2 = "";
                    final boolean b = s.equals(s2);
                    if (b) {
                        break Label_0024;
                    }
                    break Label_0081;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final MessageEvent messageEvent2 = messageEvent;
                    final String s = messageEvent2.getSender();
                    final String s2 = "";
                    final boolean b = s.equals(s2);
                    if (!b) {
                        break Label_0081;
                    }
                    MessageLogger.log.info(org.s.a("T") + messageEvent.getId() + org.powerbot.game.bot.handler.input.a.a(MessageLogger.z[1]) + messageEvent.getMessage());
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            try {
                if (a != 0) {
                    MessageLogger.log.info(s.a("T") + messageEvent.getId() + org.powerbot.game.bot.handler.input.a.a(MessageLogger.z[1]) + messageEvent.getSender() + s.a(MessageLogger.z[0]) + messageEvent.getMessage());
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
    }
    
    static {
        final String[] z2 = new String[2];
        int n2;
        int n = n2 = 0;
        String s = "EE";
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
                                c2 = '\u001d';
                                break;
                            }
                            case 1: {
                                c2 = 'j';
                                break;
                            }
                            case 2: {
                                c2 = 'S';
                                break;
                            }
                            case 3: {
                                c2 = '0';
                                break;
                            }
                            default: {
                                c2 = '*';
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
                    s = "tP";
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
        final char[] charArray2 = "d\u0015\u0014Y\u007f`;:".toCharArray();
        int length2;
        int n8;
        final int n7 = n8 = (length2 = charArray2.length);
        int n9 = 0;
        while (true) {
            Label_0250: {
                if (n7 > 1) {
                    break Label_0250;
                }
                length2 = (n8 = n9);
                do {
                    final char c3 = charArray2[n8];
                    char c4 = '\0';
                    switch (n9 % 5) {
                        case 0: {
                            c4 = '\u001d';
                            break;
                        }
                        case 1: {
                            c4 = 'j';
                            break;
                        }
                        case 2: {
                            c4 = 'S';
                            break;
                        }
                        case 3: {
                            c4 = '0';
                            break;
                        }
                        default: {
                            c4 = '*';
                            break;
                        }
                    }
                    charArray2[length2] = (char)(c3 ^ c4);
                    ++n9;
                } while (n7 == 0);
            }
            if (n7 <= n9) {
                log = Logger.getLogger(a.a(new String(charArray2).intern()));
                return;
            }
            continue;
        }
    }
}
