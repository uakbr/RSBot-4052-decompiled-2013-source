
package org.powerbot;

import java.util.jar.JarEntry;
import java.io.OutputStream;
import java.util.jar.JarOutputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayOutputStream;
import java.util.jar.Pack200;
import java.security.spec.AlgorithmParameterSpec;
import java.security.Key;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.powerbot.game.api.util.node.HashTable;
import java.util.HashMap;
import org.powerbot.core.script.wrappers.Item;
import java.io.InputStream;
import java.util.jar.JarInputStream;
import java.io.ByteArrayInputStream;
import java.util.Map;

public class r
{
    public static byte[] a;
    private static final String[] z;
    
    public static Map<String, byte[]> a(final byte[] key, final byte[] iv, final byte[] buf) {
        final int d = o.d;
        try {
            byte[] a = null;
            final JarInputStream jarInputStream = new JarInputStream(new ByteArrayInputStream(buf));
            JarEntry nextJarEntry;
            while ((nextJarEntry = jarInputStream.getNextJarEntry()) != null) {
                if (nextJarEntry.getName().equals(Item.e(r.z[1]))) {
                    a = a(jarInputStream);
                    break;
                }
            }
            if (a == null) {
                return new HashMap<String, byte[]>();
            }
            r.a = MessageDigest.getInstance(HashTable.e(r.z[3])).digest(a);
            final HashMap<String, byte[]> hashMap = new HashMap<String, byte[]>();
            final SecretKeySpec key2 = new SecretKeySpec(key, Item.e(r.z[2]));
            final Cipher instance = Cipher.getInstance(HashTable.e(r.z[4]));
            instance.init(2, key2, new IvParameterSpec(iv));
            final byte[] doFinal = instance.doFinal(a);
            final Pack200.Unpacker unpacker = Pack200.newUnpacker();
            final ByteArrayOutputStream out = new ByteArrayOutputStream(5242880);
            unpacker.unpack(new GZIPInputStream(new ByteArrayInputStream(doFinal)), new JarOutputStream(out));
            final JarInputStream jarInputStream2 = new JarInputStream(new ByteArrayInputStream(out.toByteArray()));
            JarEntry nextJarEntry2;
            while ((nextJarEntry2 = jarInputStream2.getNextJarEntry()) != null) {
                final String name = nextJarEntry2.getName();
                if (name.endsWith(Item.e(r.z[0]))) {
                    final byte[] a2 = a(jarInputStream2);
                    final String replace = name.replace('/', '.');
                    hashMap.put(replace.substring(0, replace.length() - 6), a2);
                }
                if (d != 0) {
                    break;
                }
            }
            return hashMap;
        }
        catch (Exception ex) {
            return new HashMap<String, byte[]>();
        }
    }
    
    private static byte[] a(final JarInputStream jarInputStream) {
        final int d = o.d;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[2048];
        while (jarInputStream.available() > 0) {
            final int read = jarInputStream.read(array, 0, array.length);
            Label_0059: {
                Label_0048: {
                    try {
                        if (d != 0) {
                            break Label_0059;
                        }
                        final int n = read;
                        if (n < 0) {
                            break Label_0048;
                        }
                        break Label_0048;
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                    try {
                        final int n = read;
                        if (n < 0) {
                            break;
                        }
                    }
                    catch (RuntimeException ex2) {
                        throw ex2;
                    }
                }
                byteArrayOutputStream.write(array, 0, read);
            }
            if (d != 0) {
                break;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    static {
        final String[] z2 = new String[5];
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = 0)));
        String s = "r\u000byllA";
        int n6 = -1;
        String intern = null;
    Label_0071_Outer:
        while (true) {
            final char[] charArray = s.toCharArray();
            int length;
            int n8;
            final int n7 = n8 = (length = charArray.length);
            int n9 = 0;
            while (true) {
                Label_0146: {
                    if (n7 > 1) {
                        break Label_0146;
                    }
                    length = (n8 = n9);
                    do {
                        final char c = charArray[n8];
                        char c2 = '\0';
                        switch (n9 % 5) {
                            case 0: {
                                c2 = 'k';
                                break;
                            }
                            case 1: {
                                c2 = '1';
                                break;
                            }
                            case 2: {
                                c2 = '\"';
                                break;
                            }
                            case 3: {
                                c2 = 'T';
                                break;
                            }
                            default: {
                                c2 = '(';
                                break;
                            }
                        }
                        charArray[length] = (char)(c ^ c2);
                        ++n9;
                    } while (n7 == 0);
                }
                if (n7 > n9) {
                    continue;
                }
                break;
            }
            intern = new String(charArray).intern();
            switch (n6) {
                default: {
                    z2[n2] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 1))));
                    s = "[h\u0015\u0006\u0003r\u0018tnt\u001ca\u0001";
                    n6 = 0;
                    continue Label_0071_Outer;
                }
                case 0: {
                    z2[n] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 2))));
                    s = "sC(";
                    n6 = 1;
                    continue Label_0071_Outer;
                }
                case 1: {
                    z2[n3] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 3))));
                    s = "x\u0000#\u0000Y";
                    n6 = 2;
                    continue Label_0071_Outer;
                }
                case 2: {
                    z2[n4] = intern;
                    n = (n2 = (n3 = (n4 = (n5 = 4))));
                    s = "S4\b;\u0012i\u000bM}#Q\"nD0O,\u000bC\u000f";
                    n6 = 3;
                    continue Label_0071_Outer;
                }
                case 3: {
                    break Label_0071_Outer;
                }
            }
        }
        z2[n5] = intern;
        z = z2;
    }
}
