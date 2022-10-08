
package org.powerbot;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class u
{
    private final InputStream a;
    
    public u(final byte[] buf) {
        this(new ByteArrayInputStream(buf));
    }
    
    public u(final InputStream a) {
        this.a = a;
    }
    
    public int a() {
        try {
            return this.a.read();
        }
        catch (IOException ex) {
            return -1;
        }
    }
    
    public int b() {
        return this.a() << 8 | this.a();
    }
    
    public int c() {
        return this.b() << 16 | this.b();
    }
    
    public long d() {
        return (long)this.c() << 32 | ((long)this.c() & 0xFFFFFFFFL);
    }
    
    public String e() {
        return new String(this.f());
    }
    
    public byte[] f() {
        final int i = t.i;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int a;
        while ((a = this.a()) != 10) {
            try {
                if (a != -1) {
                    byteArrayOutputStream.write(a);
                    if (i == 0) {
                        continue;
                    }
                }
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            break;
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public void a(final byte[] array, final int n, final int n2) {
        final int i = t.i;
        int j = n2;
        while (j < n2 + n) {
            array[j] = (byte)this.a();
            ++j;
            if (i != 0) {
                break;
            }
        }
    }
}
