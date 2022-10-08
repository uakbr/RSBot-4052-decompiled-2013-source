
package org.powerbot.core.script.internal.wrappers;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.Node;
import org.powerbot.game.client.NodeDeque;

public class Deque<N>
{
    private final NodeDeque nl;
    private Node current;
    public static boolean a;
    
    public Deque(final NodeDeque nl) {
        this.nl = nl;
    }
    
    public int size() {
        final boolean a = Deque.a;
        int n = 0;
        Node node = this.nl.getTail().getNext();
        while (node != this.nl.getTail()) {
            node = node.getNext();
            ++n;
            if (a) {
                int a2 = Task.a;
                Task.a = ++a2;
                break;
            }
        }
        return n;
    }
    
    public N getHead() {
        final boolean a = Deque.a;
        final Node next = this.nl.getTail().getNext();
        Node node2 = null;
        boolean a2 = false;
        Label_0079: {
            Label_0073: {
                Label_0059: {
                    Label_0040: {
                        Node node;
                        try {
                            node = (node2 = next);
                            if (a) {
                                break Label_0059;
                            }
                            final Deque deque = this;
                            final NodeDeque nodeDeque = deque.nl;
                            final Node node3 = nodeDeque.getTail();
                            if (node == node3) {
                                break Label_0040;
                            }
                            break Label_0040;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        try {
                            final Deque deque = this;
                            final NodeDeque nodeDeque = deque.nl;
                            final Node node3 = nodeDeque.getTail();
                            if (node == node3) {
                                this.current = null;
                                return null;
                            }
                        }
                        catch (RuntimeException ex2) {
                            throw ex2;
                        }
                    }
                    this.current = next.getNext();
                    node2 = next;
                    try {
                        if (Task.a == 0) {
                            return (N)node2;
                        }
                        final boolean b = a;
                        if (b) {
                            break Label_0073;
                        }
                        break Label_0073;
                    }
                    catch (RuntimeException ex3) {
                        throw ex3;
                    }
                }
                try {
                    final boolean b = a;
                    if (b) {
                        a2 = false;
                        break Label_0079;
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            a2 = true;
        }
        Deque.a = a2;
        return (N)node2;
    }
    
    public N getNext() {
        final Node current = this.current;
        Label_0028: {
            Node node;
            try {
                final Node node2;
                node = (node2 = current);
                if (Deque.a) {
                    return (N)node2;
                }
                final Deque deque = this;
                final NodeDeque nodeDeque = deque.nl;
                final Node node3 = nodeDeque.getTail();
                if (node == node3) {
                    break Label_0028;
                }
                break Label_0028;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final Deque deque = this;
                final NodeDeque nodeDeque = deque.nl;
                final Node node3 = nodeDeque.getTail();
                if (node == node3) {
                    this.current = null;
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.current = current.getNext();
        Node node2 = current;
        return (N)node2;
    }
    
    public static String e(final String s) {
        final int n = 5 << 3 ^ 0x4;
        final int n2 = 0x2 ^ 0x5;
        final int length = s.length();
        final char[] array = new char[length];
        int n3;
        int i = n3 = length - 1;
        final char[] value = array;
        final char c = (char)n2;
        final int n4 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n3;
            final char char1 = s.charAt(index);
            --n3;
            array2[index] = (char)(char1 ^ n4);
            if (n3 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n3;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n3;
            array3[index2] = c2;
            i = n3;
        }
        return new String(value);
    }
}
