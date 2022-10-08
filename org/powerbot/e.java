
package org.powerbot;

import org.p;
import org.f;

public class e extends f
{
    private final a_[] d;
    
    public e(final f f, final a_[] d) {
        super(262144, f);
        this.d = d;
    }
    
    @Override
    public void a() {
        final int i = org.powerbot.f.i;
        final a_[] d = this.d;
        final int length = d.length;
        int j = 0;
        while (j < length) {
            final a_ a_ = d[j];
            final p a = super.a(a_.a, a_.b, a_.c, null, null);
            try {
                a.b();
                new s(a_.d).a(a);
                a.d(a_.e, a_.f);
                a.c();
                ++j;
                if (i != 0) {
                    return;
                }
                if (i == 0) {
                    continue;
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            break;
        }
        super.a();
    }
    
    public static class a_
    {
        public int a;
        public String b;
        public String c;
        public byte[] d;
        public int e;
        public int f;
    }
}
