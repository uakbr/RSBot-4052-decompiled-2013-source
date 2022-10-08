
package org.powerbot.core.script.wrappers;

import org.powerbot.game.client.RSItem;

public class Item
{
    private final int id;
    private final int stackSize;
    
    public Item(final int id, final int stackSize) {
        this.id = id;
        this.stackSize = stackSize;
    }
    
    public Item(final RSItem rsItem) {
        this.id = rsItem.getId();
        this.stackSize = rsItem.getStackSize();
    }
    
    public Item(final Component component) {
        this.id = component.getItemId();
        this.stackSize = component.getItemStackSize();
    }
    
    public static String e(final String s) {
        final int n = 5 << 4;
        final int n2 = 2;
        final int n3 = n ^ (n2 << n2 ^ 0x1);
        final int n4 = (0x3 ^ 0x5) << 3 ^ (0x2 ^ 0x5);
        final int length = s.length();
        final char[] array = new char[length];
        int n5;
        int i = n5 = length - 1;
        final char[] value = array;
        final char c = (char)n4;
        final int n6 = n3;
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
