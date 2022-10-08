
package org.powerbot.core.script.job.state;

import java.util.Iterator;
import org.powerbot.core.script.job.Task;
import java.util.Collection;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Queue;

public class Tree
{
    private final Queue<Node> nodes;
    private final AtomicReference<Node> current_node;
    
    public Tree(final Node[] a) {
        final boolean b = Node.b;
        this.current_node = new AtomicReference<Node>();
        (this.nodes = new ConcurrentLinkedQueue<Node>()).addAll((Collection<?>)Arrays.asList(a));
        if (b) {
            int a2 = Task.a;
            Task.a = ++a2;
        }
    }
    
    public final synchronized Node state() {
        final boolean b = Node.b;
        final Node node = this.current_node.get();
        Label_0030: {
            Node node2;
            try {
                node2 = node;
                if (b) {
                    break Label_0030;
                }
                if (node2 == null) {
                    break Label_0030;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                if (node2.isAlive()) {
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        for (final Node node3 : this.nodes) {
            Label_0103: {
                Node node6 = null;
                Label_0097: {
                    Node node5 = null;
                    Label_0082: {
                        try {
                            final Node node4 = node5 = (node6 = node3);
                            if (b) {
                                break Label_0082;
                            }
                            if (node4 == null) {
                                break Label_0103;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                        node6 = (node5 = node3);
                        try {
                            if (b) {
                                return node6;
                            }
                            final boolean b2 = node5.activate();
                            if (b2) {
                                break Label_0097;
                            }
                            break Label_0103;
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    try {
                        final boolean b2 = node5.activate();
                        if (!b2) {
                            break Label_0103;
                        }
                        node6 = node3;
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                return node6;
            }
            if (b) {
                break;
            }
        }
        return null;
    }
    
    public final void set(final Node newValue) {
        this.current_node.set(newValue);
    }
    
    public final Node get() {
        return this.current_node.get();
    }
}
