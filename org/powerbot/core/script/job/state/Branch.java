
package org.powerbot.core.script.job.state;

import org.powerbot.core.script.job.Job;
import java.util.Iterator;
import org.powerbot.core.script.job.Task;
import java.util.Collection;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Queue;

public abstract class Branch extends Node
{
    private final Queue<Node> nodes;
    private final AtomicReference<Node> current_node;
    
    public Branch(final Node[] a) {
        final boolean b = Node.b;
        this.current_node = new AtomicReference<Node>();
        (this.nodes = new ConcurrentLinkedQueue<Node>()).addAll((Collection<?>)Arrays.asList(a));
        if (Task.a != 0) {
            boolean b2 = false;
            Label_0060: {
                try {
                    if (b) {
                        b2 = false;
                        break Label_0060;
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                b2 = true;
            }
            Node.b = b2;
        }
    }
    
    public abstract boolean branch();
    
    @Override
    public final boolean activate() {
        final boolean b = Node.b;
        boolean branch = false;
        Label_0081: {
            try {
                branch = this.branch();
                if (b) {
                    return branch;
                }
                if (!branch) {
                    break Label_0081;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            for (final Node node : this.nodes) {
                Label_0077: {
                    boolean activate = false;
                    Label_0061: {
                        Node node2;
                        try {
                            node2 = node;
                            if (b) {
                                break Label_0061;
                            }
                            if (node2 == null) {
                                break Label_0077;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                        try {
                            activate = node2.activate();
                            if (b) {
                                return activate;
                            }
                            if (!activate) {
                                break Label_0077;
                            }
                        }
                        catch (RuntimeException ex3) {
                            throw ex3;
                        }
                    }
                    return activate;
                }
                if (b) {
                    break;
                }
            }
        }
        return branch;
    }
    
    @Override
    public final void execute() {
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
                    return;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        for (final Node newValue : this.nodes) {
            Label_0096: {
                boolean activate = false;
                Label_0081: {
                    Node node3;
                    try {
                        node3 = newValue;
                        if (b) {
                            break Label_0081;
                        }
                        if (node3 == null) {
                            break Label_0096;
                        }
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                    try {
                        activate = node3.activate();
                        if (b) {
                            break Label_0096;
                        }
                        if (activate) {
                            break Label_0096;
                        }
                        break Label_0096;
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                }
                try {
                    if (activate) {
                        this.current_node.set(newValue);
                        this.getContainer().submit(newValue);
                        newValue.join();
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
            }
            if (b) {
                break;
            }
        }
    }
}
