
package org.powerbot.game.api.util.node;

import org.powerbot.core.script.job.Task;
import org.powerbot.game.client.Node;
import org.powerbot.game.client.NodeDeque;

public class Deque<N>
{
    private final NodeDeque nl;
    private Node current;
    
    public Deque(final NodeDeque nl) {
        this.nl = nl;
    }
    
    public int size() {
        final boolean a = Queue.a;
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
        final Node next = this.nl.getTail().getNext();
        Label_0038: {
            Node node;
            try {
                final Node node2;
                node = (node2 = next);
                if (Queue.a) {
                    return (N)node2;
                }
                final Deque deque = this;
                final NodeDeque nodeDeque = deque.nl;
                final Node node3 = nodeDeque.getTail();
                if (node == node3) {
                    break Label_0038;
                }
                break Label_0038;
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
        Node node2 = next;
        return (N)node2;
    }
    
    public N getNext() {
        final Node current = this.current;
        Label_0028: {
            Node node;
            try {
                final Node node2;
                node = (node2 = current);
                if (Queue.a) {
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
        final int n = (0x3 ^ 0x5) << 4 ^ 5 << 1;
        final int n2 = 4;
        final int n3 = n2 << n2 ^ 0x1;
        final int length = s.length();
        final char[] array = new char[length];
        int n4;
        int i = n4 = length - 1;
        final char[] value = array;
        final char c = (char)n3;
        final int n5 = n;
        while (i >= 0) {
            final char[] array2 = value;
            final int index = n4;
            final char char1 = s.charAt(index);
            --n4;
            array2[index] = (char)(char1 ^ n5);
            if (n4 < 0) {
                break;
            }
            final char[] array3 = value;
            final int index2 = n4;
            final char c2 = (char)(s.charAt(index2) ^ c);
            --n4;
            array3[index2] = c2;
            i = n4;
        }
        return new String(value);
    }
}
