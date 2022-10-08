
package org.powerbot.game.api.util.node;

import org.powerbot.game.client.LinkedListNode;

public class LinkedList<N>
{
    private final org.powerbot.game.client.LinkedList nl;
    private LinkedListNode current;
    
    public LinkedList(final org.powerbot.game.client.LinkedList nl) {
        this.nl = nl;
    }
    
    public N getHead() {
        final LinkedListNode next = this.nl.getTail().getNext();
        Label_0038: {
            LinkedListNode linkedListNode;
            try {
                final LinkedListNode linkedListNode2;
                linkedListNode = (linkedListNode2 = next);
                if (Queue.a) {
                    return (N)linkedListNode2;
                }
                final LinkedList list = this;
                final org.powerbot.game.client.LinkedList list2 = list.nl;
                final LinkedListNode linkedListNode3 = list2.getTail();
                if (linkedListNode == linkedListNode3) {
                    break Label_0038;
                }
                break Label_0038;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final LinkedList list = this;
                final org.powerbot.game.client.LinkedList list2 = list.nl;
                final LinkedListNode linkedListNode3 = list2.getTail();
                if (linkedListNode == linkedListNode3) {
                    this.current = null;
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.current = next.getNext();
        LinkedListNode linkedListNode2 = next;
        return (N)linkedListNode2;
    }
    
    public N getNext() {
        final LinkedListNode current = this.current;
        Label_0028: {
            LinkedListNode linkedListNode;
            try {
                final LinkedListNode linkedListNode2;
                linkedListNode = (linkedListNode2 = current);
                if (Queue.a) {
                    return (N)linkedListNode2;
                }
                final LinkedList list = this;
                final org.powerbot.game.client.LinkedList list2 = list.nl;
                final LinkedListNode linkedListNode3 = list2.getTail();
                if (linkedListNode == linkedListNode3) {
                    break Label_0028;
                }
                break Label_0028;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final LinkedList list = this;
                final org.powerbot.game.client.LinkedList list2 = list.nl;
                final LinkedListNode linkedListNode3 = list2.getTail();
                if (linkedListNode == linkedListNode3) {
                    this.current = null;
                    return null;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        this.current = current.getNext();
        LinkedListNode linkedListNode2 = current;
        return (N)linkedListNode2;
    }
}
