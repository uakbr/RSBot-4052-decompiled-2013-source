
package org.powerbot;

import java.util.HashMap;
import java.util.zip.Adler32;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import javax.crypto.KeyGenerator;
import java.security.SecureRandom;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Deflater;
import javax.crypto.spec.SecretKeySpec;
import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;
import org.powerbot.game.api.util.node.Queue;
import java.security.Key;
import javax.crypto.CipherOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ByteArrayInputStream;
import java.security.GeneralSecurityException;
import java.io.FileNotFoundException;
import java.net.HttpURLConnection;
import org.powerbot.core.script.job.Task;
import java.net.URLConnection;
import java.io.InputStream;
import java.net.URL;
import javax.crypto.SecretKey;
import java.io.File;
import java.util.Map;

public final class z
{
    public static final Map<File, Class<?>[]> a;
    private static volatile SecretKey b;
    private final File c;
    private static final String[] z;
    
    public z(final String s, final Class<?>... array) {
        this.c = a(s);
        org.powerbot.z.a.put(this.c, array);
    }
    
    public boolean a() {
        Label_0026: {
            try {
                if (!this.c.isFile()) {
                    return false;
                }
                final z z = this;
                final File file = z.c;
                final long n = file.length();
                final long n2 = 0L;
                final long n3 = lcmp(n, n2);
                if (n3 != 0) {
                    break Label_0026;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final z z = this;
                final File file = z.c;
                final long n = file.length();
                final long n2 = 0L;
                final long n3 = lcmp(n, n2);
                if (n3 != 0) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public void b() {
        this.c.delete();
    }
    
    public InputStream a(final URL url) {
        final boolean c = kb.c;
        final HttpURLConnection c2 = ab.c(url);
        HttpURLConnection httpURLConnection = null;
        Label_0051: {
            int n = 0;
            Label_0039: {
                Label_0024: {
                    boolean b;
                    try {
                        b = ((n = (this.a() ? 1 : 0)) != 0);
                        if (c) {
                            break Label_0051;
                        }
                        if (b) {
                            break Label_0024;
                        }
                        break Label_0039;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        if (b) {
                            c2.setIfModifiedSince(this.c.lastModified());
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                try {
                    httpURLConnection = c2;
                    if (c) {
                        break Label_0051;
                    }
                    n = httpURLConnection.getResponseCode();
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
            }
            try {
                if (n != 304) {
                    cb.a(ab.a(c2), this.d());
                }
            }
            catch (RuntimeException ex4) {
                throw ex4;
            }
        }
        httpURLConnection.disconnect();
        final InputStream c3 = this.c();
        if (c) {
            int a = Task.a;
            Task.a = ++a;
        }
        return c3;
    }
    
    public InputStream c() {
        try {
            if (!this.c.isFile()) {
                throw new FileNotFoundException(this.c.toString());
            }
        }
        catch (GeneralSecurityException ex) {
            throw ex;
        }
        try {
            if (this.c.length() == 0L) {
                return new ByteArrayInputStream(new byte[0]);
            }
        }
        catch (GeneralSecurityException ex2) {
            throw ex2;
        }
        Cipher a;
        try {
            a = a(2);
        }
        catch (GeneralSecurityException ex3) {
            ex3.printStackTrace();
            throw new IOException();
        }
        return new CipherInputStream(new FileInputStream(this.c), a);
    }
    
    public OutputStream d() {
        Cipher a;
        try {
            a = a(1);
        }
        catch (GeneralSecurityException ex) {
            throw new IOException();
        }
        return new CipherOutputStream(new FileOutputStream(this.c), a);
    }
    
    private static synchronized Cipher a(final int opmode) {
        final Cipher instance = Cipher.getInstance(kb.a(org.powerbot.z.z[2]));
        try {
            if (org.powerbot.z.b != null) {
                instance.init(opmode, org.powerbot.z.b);
                return instance;
            }
        }
        catch (IOException ex) {
            throw ex;
        }
        final File a = a(Queue.e(org.powerbot.z.z[4]));
        Label_0259: {
            try {
                if (!a.isFile() || a.length() == 0L) {
                    break Label_0259;
                }
            }
            catch (IOException ex2) {
                throw ex2;
            }
            InputStream inputStream = null;
            try {
                inputStream = new InflaterInputStream(new FileInputStream(a), new Inflater(true));
                inputStream.skip(4096L);
                final byte[] b = new byte[4];
                inputStream.read(b, 0, b.length);
                final int len = b[0] | b[1] << 8 | b[2] << 16 | b[3] << 24;
                final byte[] array = new byte[len];
                inputStream.read(array, 0, len);
                instance.init(opmode, org.powerbot.z.b = new SecretKeySpec(array, 0, array.length, kb.a(org.powerbot.z.z[5])));
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (IOException ex8) {}
                }
            }
            catch (IOException ex9) {
                try {
                    if (inputStream != null) {
                        final InputStream inputStream2 = inputStream;
                        inputStream2.close();
                        return instance;
                    }
                    return instance;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    final InputStream inputStream2 = inputStream;
                    inputStream2.close();
                }
                catch (IOException ex10) {}
            }
            finally {
                try {
                    if (inputStream != null) {
                        final InputStream inputStream3 = inputStream;
                        inputStream3.close();
                    }
                    return instance;
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
                try {
                    final InputStream inputStream3 = inputStream;
                    inputStream3.close();
                }
                catch (IOException ex11) {}
            }
            return instance;
        }
        DeflaterOutputStream deflaterOutputStream = null;
        try {
            deflaterOutputStream = new DeflaterOutputStream(new FileOutputStream(a), new Deflater(1, true));
            final SecureRandom secureRandom = new SecureRandom();
            final byte[] array2 = new byte[4096];
            secureRandom.nextBytes(array2);
            deflaterOutputStream.write(array2);
            final SecretKey generateKey = KeyGenerator.getInstance(Queue.e(org.powerbot.z.z[3])).generateKey();
            instance.init(opmode, org.powerbot.z.b = generateKey);
            final byte[] encoded = generateKey.getEncoded();
            int i = 0;
            try {
                while (i < 4) {
                    deflaterOutputStream.write(encoded.length >> (i << 3) & 0xFF);
                    ++i;
                }
            }
            catch (IOException ex5) {
                throw ex5;
            }
            deflaterOutputStream.write(encoded);
            final byte[] array3 = new byte[128 + secureRandom.nextInt(8096)];
            secureRandom.nextBytes(array3);
            deflaterOutputStream.write(array3);
            if (deflaterOutputStream != null) {
                try {
                    deflaterOutputStream.finish();
                    deflaterOutputStream.close();
                }
                catch (IOException ex12) {}
            }
        }
        catch (IOException ex13) {
            try {
                if (deflaterOutputStream != null) {
                    final DeflaterOutputStream deflaterOutputStream2 = deflaterOutputStream;
                    deflaterOutputStream2.finish();
                    final DeflaterOutputStream deflaterOutputStream3 = deflaterOutputStream;
                    deflaterOutputStream3.close();
                    return instance;
                }
                return instance;
            }
            catch (RuntimeException ex6) {
                throw ex6;
            }
            try {
                final DeflaterOutputStream deflaterOutputStream2 = deflaterOutputStream;
                deflaterOutputStream2.finish();
                final DeflaterOutputStream deflaterOutputStream3 = deflaterOutputStream;
                deflaterOutputStream3.close();
            }
            catch (IOException ex14) {}
        }
        finally {
            try {
                if (deflaterOutputStream != null) {
                    final DeflaterOutputStream deflaterOutputStream4 = deflaterOutputStream;
                    deflaterOutputStream4.finish();
                    final DeflaterOutputStream deflaterOutputStream5 = deflaterOutputStream;
                    deflaterOutputStream5.close();
                }
                return instance;
            }
            catch (RuntimeException ex7) {
                throw ex7;
            }
            try {
                final DeflaterOutputStream deflaterOutputStream4 = deflaterOutputStream;
                deflaterOutputStream4.finish();
                final DeflaterOutputStream deflaterOutputStream5 = deflaterOutputStream;
                deflaterOutputStream5.close();
            }
            catch (IOException ex15) {}
        }
        return instance;
    }
    
    private static File a(final String s) {
        final long b = y.b();
        String child;
        try {
            final MessageDigest instance = MessageDigest.getInstance(kb.a(org.powerbot.z.z[0]));
            instance.update(gb.d(s));
            int i = 0;
            try {
                while (i < 8) {
                    instance.update((byte)(b >> (i << 3) & 0xFFL));
                    ++i;
                }
            }
            catch (NoSuchAlgorithmException ex) {
                throw ex;
            }
            child = gb.b(instance.digest()).substring(0, 12);
        }
        catch (NoSuchAlgorithmException ex4) {
            final Adler32 adler32 = new Adler32();
            adler32.update(gb.d(s));
            adler32.update((int)(b & -1L));
            adler32.update((int)(b >> 32));
            child = Long.toHexString(adler32.getValue());
        }
        if (child == null) {
            child = Integer.toHexString(s.hashCode());
        }
        final File file = new File(System.getProperty(Queue.e(org.powerbot.z.z[1])), child);
        Label_0191: {
            try {
                if (!file.isFile()) {
                    return file;
                }
                final File file2 = file;
                final long n = file2.lastModified();
                final long n2 = 1346067355497L;
                final long n3 = lcmp(n, n2);
                if (n3 < 0) {
                    break Label_0191;
                }
                return file;
            }
            catch (NoSuchAlgorithmException ex2) {
                throw ex2;
            }
            try {
                final File file2 = file;
                final long n = file2.lastModified();
                final long n2 = 1346067355497L;
                final long n3 = lcmp(n, n2);
                if (n3 < 0) {
                    file.delete();
                }
            }
            catch (NoSuchAlgorithmException ex3) {
                throw ex3;
            }
        }
        return file;
    }
    
    static {
        final String[] z2 = new String[6];
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = 0))));
        String s = "6\u001eQSs";
        int n7 = -1;
        String intern = null;
    Label_0087_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n9;
            final int n8 = n9 = (length = charArray.length);
            int n10 = 0;
            while (true) {
                Label_0162: {
                    if (n8 > 1) {
                        break Label_0162;
                    }
                    length = (n9 = n10);
                    do {
                        final char c = charArray[n9];
                        char c2 = '\0';
                        switch (n10 % 5) {
                            case 0: {
                                c2 = '3';
                                break;
                            }
                            case 1: {
                                c2 = 'A';
                                break;
                            }
                            case 2: {
                                c2 = 'F';
                                break;
                            }
                            case 3: {
                                c2 = 'i';
                                break;
                            }
                            default: {
                                c2 = '\u0014';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n10;
                    } while (n8 == 0);
                }
                if (n8 > n10) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n7) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 1)))));
                    s = "\u0002\u0011k9akuYFH\u0018\u0014t*";
                    n7 = 0;
                    continue Label_0087_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 2)))));
                    s = "7\u0015$";
                    n7 = 1;
                    continue Label_0087_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 3)))));
                    s = "CH4tj=\"";
                    n7 = 2;
                    continue Label_0087_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 4)))));
                    s = "\u001b\u0015~**v4\u001cW\\";
                    n7 = 3;
                    continue Label_0087_Outer;
                }
                case 3: {
                    z2[n5] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = 5)))));
                    s = "$\u0004S8\rqE";
                    n7 = 4;
                    continue Label_0087_Outer;
                }
                case 4: {
                    break Label_0087_Outer;
                }
            }
        }
        z2[n6] = intern;
        z = z2;
        a = new HashMap<File, Class<?>[]>();
    }
}
