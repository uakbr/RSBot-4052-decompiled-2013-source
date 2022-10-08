
package org;

public class s
{
    public static String a(final String s) {
        final int n = 1 << 3 ^ (0x2 ^ 0x5);
        final int n2 = (0x3 ^ 0x5) << 4;
        final int n3 = 1;
        final int n4 = n2 ^ n3 << n3;
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
