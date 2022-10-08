
package org.powerbot;

import java.util.Iterator;
import javax.swing.SwingUtilities;
import org.o;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.util.concurrent.ExecutionException;
import org.powerbot.core.Bot;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.Desktop;
import java.util.concurrent.ExecutorService;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.awt.Component;
import org.powerbot.core.script.internal.Constants;
import org.powerbot.game.client.RandomAccessFile;
import java.util.logging.Logger;
import java.awt.event.WindowListener;
import javax.swing.JFrame;

public class qb extends JFrame implements WindowListener
{
    private static final long serialVersionUID = 1L;
    private static qb a;
    private static Logger b;
    public wb c;
    public static volatile boolean d;
    public static volatile boolean e;
    public static boolean f;
    private static final String[] z;
    
    private qb() {
        this.setTitle(RandomAccessFile.e(qb.z[3]));
        this.setIconImage(db.b(Constants.e(qb.z[4])));
        this.addWindowListener(this);
        this.setDefaultCloseOperation(0);
        this.add(this.c = new wb(this));
        qb.b.log(Level.INFO, RandomAccessFile.e(qb.z[2]), Constants.e(qb.z[1]));
        this.pack();
        this.setMinimumSize(this.getSize());
        this.setLocationRelativeTo(this.getParent());
        this.setVisible(true);
        hb.a().b("", this.getTitle());
        final ExecutorService fixedThreadPool = Executors.newFixedThreadPool(1);
        final ArrayList<Future<Object>> list = new ArrayList<Future<Object>>();
        list.add(fixedThreadPool.submit((Callable<Object>)new fb()));
        list.add((Future<Object>)fixedThreadPool.submit((Callable<Boolean>)new c_()));
        list.add((Future<Object>)fixedThreadPool.submit((Callable<Boolean>)new eb()));
        fixedThreadPool.execute(new a_(this, (List<Future<Boolean>>)list));
        fixedThreadPool.shutdown();
    }
    
    public static qb a() {
        Label_0016: {
            qb qb;
            try {
                final qb qb2;
                qb = (qb2 = org.powerbot.qb.a);
                if (org.powerbot.qb.f) {
                    return qb2;
                }
                if (qb == null) {
                    break Label_0016;
                }
                return org.powerbot.qb.a;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (qb == null) {
                    org.powerbot.qb.a = new qb();
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return qb.a;
    }
    
    public static void a(final String str) {
        boolean b2 = false;
        Label_0016: {
            boolean b;
            try {
                b = (b2 = Desktop.isDesktopSupported());
                if (qb.f) {
                    break Label_0016;
                }
                if (b) {
                    break Label_0016;
                }
                return;
            }
            catch (URISyntaxException ex) {
                throw ex;
            }
            try {
                if (!b) {
                    return;
                }
                b2 = Desktop.getDesktop().isSupported(Desktop.Action.BROWSE);
            }
            catch (URISyntaxException ex2) {
                throw ex2;
            }
        }
        if (b2) {
            URI uri;
            try {
                uri = new URI(str);
            }
            catch (URISyntaxException ex3) {
                return;
            }
            try {
                Desktop.getDesktop().browse(uri);
            }
            catch (IOException ex4) {}
        }
    }
    
    @Override
    public void windowActivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public void windowClosed(final WindowEvent windowEvent) {
    }
    
    @Override
    public void windowClosing(final WindowEvent windowEvent) {
        int instantiated = 0;
        Label_0050: {
            Label_0035: {
                int n;
                try {
                    qb.b.info(RandomAccessFile.e(qb.z[0]));
                    this.setVisible(false);
                    n = (instantiated = (Bot.instantiated() ? 1 : 0));
                    if (qb.f) {
                        break Label_0050;
                    }
                    if (n != 0) {
                        break Label_0035;
                    }
                    break Label_0035;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    if (n != 0) {
                        Bot.instance().stop();
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            this.dispose();
            instantiated = 0;
        }
        System.exit(instantiated);
    }
    
    @Override
    public void windowDeactivated(final WindowEvent windowEvent) {
    }
    
    @Override
    public void windowDeiconified(final WindowEvent windowEvent) {
        qb.e = false;
    }
    
    @Override
    public void windowIconified(final WindowEvent windowEvent) {
        qb.e = true;
    }
    
    @Override
    public void windowOpened(final WindowEvent windowEvent) {
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "\u0018g.w\u0010\rN\u0013\f/$x5";
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
                Label_0145: {
                    if (n7 > 1) {
                        break Label_0145;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = '\u0013';
                                break;
                            }
                            case 1: {
                                c2 = 'x';
                                break;
                            }
                            case 2: {
                                c2 = '\u0003';
                                break;
                            }
                            case 3: {
                                c2 = 't';
                                break;
                            }
                            default: {
                                c2 = '<';
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
                    s = "\u0017\t5\u0003\u001f\u007fAa\r\u0017j";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "+P\u0000E&\"|2m\u0003DY\u001bY9kj#s\u0001\u0016I\u0011B(.";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "\u0019\\\u0019l\u0010";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "6\u0018'\u001e\u001edLcP\u0016-\u00105\u0016\u000ee\u0000o@V*S$\u001f\f";
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
        qb.b = Logger.getLogger(qb.class.getName());
        qb.d = false;
        qb.e = false;
    }
    
    private final class a_ implements Runnable
    {
        private final qb a;
        private final List<Future<Boolean>> b;
        
        public a_(final qb a, final List<Future<Boolean>> b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void run() {
            final boolean f = qb.f;
            boolean b = true;
            while (true) {
                for (final Future<Boolean> future : this.b) {
                    boolean booleanValue = false;
                    Label_0113: {
                        Label_0094: {
                            boolean b3 = false;
                            Label_0082: {
                                try {
                                    Label_0071: {
                                        boolean b2 = false;
                                        Label_0062: {
                                            try {
                                                b2 = (b3 = (booleanValue = future.get()));
                                                if (f) {
                                                    break Label_0082;
                                                }
                                                final boolean b4 = f;
                                                if (!b4) {
                                                    break Label_0062;
                                                }
                                                break Label_0062;
                                            }
                                            catch (InterruptedException ex) {
                                                throw ex;
                                            }
                                            try {
                                                final boolean b4 = f;
                                                if (b4) {
                                                    break Label_0062;
                                                }
                                                if (b2) {
                                                    break Label_0071;
                                                }
                                            }
                                            catch (InterruptedException ex2) {
                                                throw ex2;
                                            }
                                        }
                                        b = b2;
                                    }
                                }
                                catch (InterruptedException ex5) {}
                                catch (ExecutionException ex6) {}
                                if (f) {
                                    break;
                                }
                                continue;
                                try {
                                    if (f) {
                                        break Label_0113;
                                    }
                                    if (b3) {
                                        break Label_0094;
                                    }
                                    break Label_0094;
                                }
                                catch (InterruptedException ex3) {
                                    throw ex3;
                                }
                            }
                            try {
                                if (b3) {
                                    SwingUtilities.invokeLater(new Runnable() {
                                        private static final String[] z;
                                        
                                        @Override
                                        public void run() {
                                            final Timer timer = new Timer(60000, new n());
                                            try {
                                                timer.setCoalesce(false);
                                                timer.start();
                                                KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new j());
                                                a_.this.a.validate();
                                                a_.this.a.repaint();
                                                Logger.getLogger(qb.class.getName()).log(Level.INFO, o.a(qb$a_$0.z[0]), t.b(qb$a_$0.z[1]));
                                                if (v.a().b()) {
                                                    yb.a();
                                                }
                                            }
                                            catch (RuntimeException ex) {
                                                throw ex;
                                            }
                                        }
                                        
                                        static {
                                            final String[] z2 = new String[2];
                                            int n2;
                                            int n = n2 = 0;
                                            String s = " \u001cyT%C;>\u00141\u001fNsW3\r]{\\ P\u0003yI#C\u001caPe\u0003\u001a}U\"C\u001c/Z \u0007N~H\"";
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
                                                    Label_0117: {
                                                        if (n4 > 1) {
                                                            break Label_0117;
                                                        }
                                                        length = (n5 = n6);
                                                        do {
                                                            final char c = charArray[n5];
                                                            char c2 = '\0';
                                                            switch (n6 % 5) {
                                                                case 0: {
                                                                    c2 = '#';
                                                                    break;
                                                                }
                                                                case 1: {
                                                                    c2 = '.';
                                                                    break;
                                                                }
                                                                case 2: {
                                                                    c2 = 'O';
                                                                    break;
                                                                }
                                                                case 3: {
                                                                    c2 = 'g';
                                                                    break;
                                                                }
                                                                default: {
                                                                    c2 = '\u0005';
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
                                                        s = "c#4l}&\\";
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
                                }
                            }
                            catch (InterruptedException ex4) {
                                throw ex4;
                            }
                        }
                        System.gc();
                        booleanValue = true;
                    }
                    qb.d = booleanValue;
                    return;
                }
                boolean b3;
                boolean booleanValue = b3 = b;
                continue;
            }
        }
    }
    
    private final class c_ implements Callable<Boolean>
    {
        public Boolean a() {
            v.a();
            return true;
        }
    }
}
