
package org.powerbot;

import org.f;

public class d extends f
{
    private final String d;
    
    public d(final f f, final String d) {
        super(262144, f);
        this.d = d;
    }
    
    @Override
    public void a(final int n, final int n2, final String s, final String s2, final String s3, final String[] array) {
        final String[] array2 = new String[array.length + 1];
        System.arraycopy(array, 0, array2, 0, array.length);
        array2[array.length] = this.d;
        super.a(n, n2, s, s2, s3, array2);
    }
}
