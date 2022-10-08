
package org.powerbot.game.api.util.node;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.NodeSubQueue;
import org.powerbot.game.client.NodeSub;

public class Queue<N extends NodeSub>
{
    private final NodeSubQueue nl;
    private NodeSub current;
    public static boolean a;
    
    public Queue(final NodeSubQueue nl) {
        this.nl = nl;
    }
    
    public int size() {
        final boolean a = Queue.a;
        int n = 0;
        NodeSub nodeSub = this.nl.getTail().getNextSub();
        while (nodeSub != this.nl.getTail()) {
            nodeSub = nodeSub.getNextSub();
            ++n;
            if (a) {
                break;
            }
        }
        int n2 = 0;
        boolean a2 = false;
        Label_0069: {
            Label_0063: {
                try {
                    n2 = n;
                    if (Task.a == 0) {
                        return n2;
                    }
                    final boolean b = a;
                    if (b) {
                        break Label_0063;
                    }
                    break Label_0063;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0069;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            a2 = true;
        }
        Queue.a = a2;
        return n2;
    }
    
    public N getHead() {
        final NodeSub nextSub = this.nl.getTail().getNextSub();
        Label_0038: {
            NodeSub nodeSub;
            try {
                final NodeSub nodeSub2;
                nodeSub = (nodeSub2 = nextSub);
                if (Queue.a) {
                    return (N)nodeSub2;
                }
                final Queue queue = this;
                final NodeSubQueue nodeSubQueue = queue.nl;
                final NodeSub nodeSub3 = nodeSubQueue.getTail();
                if (nodeSub == nodeSub3) {
                    break Label_0038;
                }
                break Label_0038;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Queue queue = this;
                final NodeSubQueue nodeSubQueue = queue.nl;
                final NodeSub nodeSub3 = nodeSubQueue.getTail();
                if (nodeSub == nodeSub3) {
                    this.current = null;
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.current = nextSub.getNextSub();
        NodeSub nodeSub2 = nextSub;
        return (N)nodeSub2;
    }
    
    public N getNext() {
        final NodeSub current = this.current;
        Label_0028: {
            NodeSub nodeSub;
            try {
                final NodeSub nodeSub2;
                nodeSub = (nodeSub2 = current);
                if (Queue.a) {
                    return (N)nodeSub2;
                }
                final Queue queue = this;
                final NodeSubQueue nodeSubQueue = queue.nl;
                final NodeSub nodeSub3 = nodeSubQueue.getTail();
                if (nodeSub == nodeSub3) {
                    break Label_0028;
                }
                break Label_0028;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Queue queue = this;
                final NodeSubQueue nodeSubQueue = queue.nl;
                final NodeSub nodeSub3 = nodeSubQueue.getTail();
                if (nodeSub == nodeSub3) {
                    this.current = null;
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.current = current.getNextSub();
        NodeSub nodeSub2 = current;
        return (N)nodeSub2;
    }
    
    public static String e(final String s) {
        final int n = (0x3 ^ 0x5) << 3 ^ 0x1;
        final int n2 = 5 << 4;
        final int n3 = 2;
        final int n4 = n2 ^ (n3 << n3 ^ 0x3);
        final int length = s.length();
        final char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        final char[] value = array;
        final char c = (char)n4;
        final int n6 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n5;
            final char char1 = s.charAt(index);
            --n5;
            array2[index] = (char)(char1 ^ n6);
            if (n5 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n5;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n5;
            array3[index2] = c2;
            i = n5;
        }
        return new String(value);
    }
}
