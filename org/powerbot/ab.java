
package org.powerbot;

import java.util.zip.InflaterInputStream;
import java.util.zip.Inflater;
import java.util.zip.GZIPInputStream;
import java.io.OutputStreamWriter;
import java.net.URLConnection;
import java.io.InputStream;
import java.net.HttpURLConnection;
import org.t;
import org.powerbot.game.client.RandomAccessFile;
import java.net.URL;

public class ab
{
    public static final String a;
    public static final String b;
    private static final String[] z;
    
    public static boolean a(final URL url) {
        Label_0043: {
            try {
                if (url.getHost().equalsIgnoreCase(RandomAccessFile.e(ab.z[3]))) {
                    break Label_0043;
                }
                final URL url2 = url;
                final String s = url2.getHost();
                final String s2 = s.toLowerCase();
                final String[] array = ab.z;
                final int n = 2;
                final String s3 = array[n];
                final String s4 = t.a(s3);
                final boolean b = s2.endsWith(s4);
                if (b) {
                    break Label_0043;
                }
                return false;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final URL url2 = url;
                final String s = url2.getHost();
                final String s2 = s.toLowerCase();
                final String[] array = ab.z;
                final int n = 2;
                final String s3 = array[n];
                final String s4 = t.a(s3);
                final boolean b = s2.endsWith(s4);
                if (b) {
                    return true;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return false;
    }
    
    public static String b(final URL url) {
        try {
            if (a(url)) {
                return ab.a;
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return ab.b;
    }
    
    public static HttpURLConnection c(final URL url) {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
        try {
            httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[9]), url.getHost());
            httpURLConnection.addRequestProperty(t.a(ab.z[8]), b(url));
            httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[12]), t.a(ab.z[11]));
            httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[18]), t.a(ab.z[16]));
            httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[7]), t.a(ab.z[6]));
            httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[15]), t.a(ab.z[13]));
            if (!a(url)) {
                httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[10]), t.a(ab.z[17]));
                httpURLConnection.addRequestProperty(RandomAccessFile.e(ab.z[14]), url.toString());
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        httpURLConnection.setConnectTimeout(10000);
        return httpURLConnection;
    }
    
    public static InputStream d(final URL url) {
        return a(c(url));
    }
    
    public static InputStream a(final String format, final Object... args) {
        final URL url = new URL(String.format(format, args));
        final String file = url.getFile();
        final int index = file.indexOf(t.a(ab.z[4]));
        try {
            if (index == -1) {
                return d(url);
            }
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        String substring = null;
        Label_0062: {
            try {
                if (index == 0) {
                    substring = "";
                    break Label_0062;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            substring = file.substring(0, index);
        }
        String substring2 = substring;
        String substring3 = null;
        Label_0108: {
            try {
                if (index + RandomAccessFile.e(ab.z[5]).length() >= file.length()) {
                    substring3 = null;
                    break Label_0108;
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
            substring3 = file.substring(index + t.a(ab.z[4]).length());
        }
        final String str = substring3;
        Label_0177: {
            Label_0133: {
                Label_0127: {
                    try {
                        if (str == null) {
                            break Label_0127;
                        }
                        final String s = str;
                        final boolean b = s.isEmpty();
                        if (b) {
                            break Label_0127;
                        }
                        break Label_0133;
                    }
                    catch (RuntimeException ex4) {
                        throw ex4;
                    }
                    try {
                        final String s = str;
                        final boolean b = s.isEmpty();
                        if (b) {
                            return d(url);
                        }
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    if (substring2.length() <= 0 || substring2.charAt(substring2.length() - 1) != '?') {
                        break Label_0177;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            substring2 = substring2.substring(0, substring2.length() - 1);
        }
        final HttpURLConnection c = c(new URL(url.getProtocol(), url.getHost(), url.getPort(), substring2));
        c.setDoOutput(true);
        final OutputStreamWriter outputStreamWriter = new OutputStreamWriter(c.getOutputStream());
        outputStreamWriter.write(str);
        outputStreamWriter.flush();
        return a(c);
    }
    
    public static InputStream a(final URLConnection urlConnection) {
        return a(urlConnection.getInputStream(), urlConnection.getHeaderField(RandomAccessFile.e(ab.z[19])));
    }
    
    public static InputStream a(final InputStream inputStream, final String s) {
        Label_0018: {
            try {
                if (s == null) {
                    return inputStream;
                }
                final String s2 = s;
                final boolean b = s2.isEmpty();
                if (b) {
                    return inputStream;
                }
                break Label_0018;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final String s2 = s;
                final boolean b = s2.isEmpty();
                if (b) {
                    return inputStream;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
            try {
                if (s.equalsIgnoreCase(t.a(ab.z[0]))) {
                    return new GZIPInputStream(inputStream);
                }
            }
            catch (RuntimeException ex3) {
                throw ex3;
            }
        }
        try {
            if (s.equalsIgnoreCase(RandomAccessFile.e(ab.z[1]))) {
                return new InflaterInputStream(inputStream, new Inflater(true));
            }
        }
        catch (RuntimeException ex4) {
            throw ex4;
        }
        return inputStream;
    }
    
    static {
        final String[] z2 = new String[20];
        int n20;
        int n19;
        int n18;
        int n17;
        int n16;
        int n15;
        int n14;
        int n13;
        int n12;
        int n11;
        int n10;
        int n9;
        int n8;
        int n7;
        int n6;
        int n5;
        int n4;
        int n3;
        int n2;
        int n = n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 0))))))))))))))))));
        String s = "\u001d}`_";
        int n21 = -1;
        String z3 = null;
    Label_0212:
        while (true) {
            z3 = z(z(s));
            switch (n21) {
                default: {
                    z2[n2] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 1)))))))))))))))))));
                    s = "xu\tT\u0006GZ";
                    n21 = 0;
                    continue;
                }
                case 0: {
                    z2[n] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 2)))))))))))))))))));
                    s = "V,9\u0014,\u0019fyJ/G6:";
                    n21 = 1;
                    continue;
                }
                case 1: {
                    z2[n3] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 3)))))))))))))))))));
                    s = "ne\u0001]\u0014P^0rf\u007f\u007f\u0002";
                    n21 = 2;
                    continue;
                }
                case 2: {
                    z2[n4] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 4)))))))))))))))))));
                    s = "\u0001WF|UY";
                    n21 = 3;
                    continue;
                }
                case 3: {
                    z2[n5] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 5)))))))))))))))))));
                    s = "Ho\u000fD\u001ca";
                    n21 = 4;
                    continue;
                }
                case 4: {
                    z2[n6] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 6)))))))))))))))))));
                    s = "\u001fi$Zr\b<9J.G7'\u001a";
                    n21 = 5;
                    continue;
                }
                case 5: {
                    z2[n7] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 7)))))))))))))))))));
                    s = "]s\f]\u0017G\u0012\fv&{e\u000e_\u0002";
                    n21 = 6;
                    continue;
                }
                case 6: {
                    z2[n8] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 8)))))))))))))))))));
                    s = "/tl],e>2\u001f+";
                    n21 = 7;
                    continue;
                }
                case 7: {
                    z2[n9] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 9)))))))))))))))))));
                    s = "{P3c";
                    n21 = 8;
                    continue;
                }
                case 8: {
                    z2[n10] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 10)))))))))))))))))));
                    s = "pP.y-\u007fd\u0006W\t";
                    n21 = 9;
                    continue;
                }
                case 9: {
                    z2[n11] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 11)))))))))))))))))));
                    s = "C#>\u0001sZclImE-2";
                    n21 = 10;
                    continue;
                }
                case 10: {
                    z2[n12] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 12)))))))))))))))))));
                    s = "]s\f]\u0017G\u0012\u0005y+st\u0006V\u0000";
                    n21 = 11;
                    continue;
                }
                case 11: {
                    z2[n13] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 13)))))))))))))))))));
                    s = "P</\u0005p\u0012sdC-E)'\u001d6\u0019f}FnJv/\u0019+\u0017k\"WlHu6\u0001/\u0016njNuM69^'\u0017k2^<\u0014wn]uU-2^<\u0014wo";
                    n21 = 12;
                    continue;
                }
                case 12: {
                    z2[n14] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 14)))))))))))))))))));
                    s = "Nu\t]\u0015VM";
                    n21 = 13;
                    continue;
                }
                case 13: {
                    z2[n15] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 15)))))))))))))))))));
                    s = "r\\#r8h";
                    n21 = 14;
                    continue;
                }
                case 14: {
                    z2[n16] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 16)))))))))))))))))));
                    s = "3TF\u00029\u001cln\\nVR]i,\u001cb&LoT0%\u0005:Udg_h";
                    n21 = 15;
                    continue;
                }
                case 15: {
                    z2[n17] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 17)))))))))))))))))));
                    s = "G58\u0002:";
                    n21 = 16;
                    continue;
                }
                case 16: {
                    z2[n18] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 18)))))))))))))))))));
                    s = "r\\#r8h=,P\u0006AL%c";
                    n21 = 17;
                    continue;
                }
                case 17: {
                    z2[n19] = z3;
                    n = (n2 = (n3 = (n4 = (n5 = (n6 = (n7 = (n8 = (n9 = (n10 = (n11 = (n12 = (n13 = (n14 = (n15 = (n16 = (n17 = (n18 = (n19 = (n20 = 19)))))))))))))))))));
                    s = "pP.c-rdB}\tPP$~&{";
                    n21 = 18;
                    continue;
                }
                case 18: {
                    break Label_0212;
                }
            }
        }
        StringBuilder sb = null;
        StringBuilder sb9 = null;
        String z4 = null;
    Label_0319_Outer:
        while (true) {
            z2[n20] = z3;
            z = z2;
            final boolean equals = System.getProperty(t.a(z(z("W,9_>\bda\u0001eE-6_2\u0015clC")))).equals(RandomAccessFile.e(z(z("\u0005\u000b"))));
            sb = new StringBuilder(70);
        Label_0461_Outer:
            while (true) {
            Label_0461:
                while (true) {
                Label_0443:
                    while (true) {
                        try {
                            StringBuilder sb8;
                            StringBuilder sb7;
                            StringBuilder sb6;
                            StringBuilder sb5;
                            StringBuilder sb4;
                            StringBuilder sb3;
                            StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                            String s2 = "i6-\u00183\u0016f&\u001a/\u0014y\u007f\u00120\u0017wh[hF52J\u007f7T@j!\u001dwgJ\u007f-ngKnS*w?\u000bZ1'\u001e:\u0004";
                            int n22 = -1;
                            break Label_0319;
                            sb2.append(RandomAccessFile.e(z4));
                            break Label_0461;
                            sb3.append(t.a(z4));
                            // iftrue(Label_0472:, !equals)
                            sb2 = (sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb)))))));
                            s2 = "K_8\u000eS\b\u001f";
                            n22 = 0;
                            break Label_0319;
                        }
                        catch (RuntimeException ex) {
                            throw ex;
                        }
                        break Label_0461;
                        while (true) {
                            String s2 = null;
                            z4 = z(z(s2));
                            int n22 = 0;
                            switch (n22) {
                                default: {
                                    continue Label_0443;
                                }
                                case 0: {
                                    continue Label_0461;
                                    continue Label_0461;
                                }
                                case 1: {
                                    final StringBuilder sb4;
                                    sb4.append(t.a(z4));
                                    a = sb.toString();
                                    sb.setLength(0);
                                    final StringBuilder sb8;
                                    final StringBuilder sb7;
                                    final StringBuilder sb6;
                                    final StringBuilder sb5;
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                                    s2 = "NC-W\u0013";
                                    n22 = 2;
                                    continue Label_0319_Outer;
                                }
                                case 2: {
                                    final StringBuilder sb5;
                                    sb5.append(RandomAccessFile.e(z4));
                                    sb.append('/');
                                    sb.append(4052);
                                    final StringBuilder sb8;
                                    final StringBuilder sb7;
                                    final StringBuilder sb6;
                                    final StringBuilder sb4;
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                                    s2 = "Z/";
                                    n22 = 3;
                                    continue Label_0319_Outer;
                                }
                                case 3: {
                                    final StringBuilder sb6;
                                    sb6.append(t.a(z4));
                                    final StringBuilder sb8;
                                    final StringBuilder sb7;
                                    final StringBuilder sb5;
                                    final StringBuilder sb4;
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                                    s2 = "scAV\u0006^Z";
                                    n22 = 4;
                                    continue Label_0319_Outer;
                                }
                                case 4: {
                                    final StringBuilder sb7;
                                    sb7.append(System.getProperty(RandomAccessFile.e(z4)));
                                    final StringBuilder sb8;
                                    final StringBuilder sb6;
                                    final StringBuilder sb5;
                                    final StringBuilder sb4;
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                                    s2 = "\u001fy\u001d\u0010)\u001b(";
                                    n22 = 5;
                                    continue Label_0319_Outer;
                                }
                                case 5: {
                                    final StringBuilder sb8;
                                    sb8.append(t.a(z4));
                                    final StringBuilder sb7;
                                    final StringBuilder sb6;
                                    final StringBuilder sb5;
                                    final StringBuilder sb4;
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                                    s2 = "Y^6vfju\u001dK\u000e\\Q";
                                    n22 = 6;
                                    continue Label_0319_Outer;
                                }
                                case 6: {
                                    break Label_0319_Outer;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
                StringBuilder sb8;
                StringBuilder sb7;
                StringBuilder sb6;
                StringBuilder sb5;
                StringBuilder sb4;
                StringBuilder sb3;
                StringBuilder sb2 = sb3 = (sb4 = (sb5 = (sb6 = (sb7 = (sb8 = (sb9 = sb))))));
                String s2 = ".u`KdJ-xDqJ.";
                int n22 = 1;
                continue Label_0461_Outer;
            }
        }
        sb9.append(System.getProperty(RandomAccessFile.e(z4)));
        sb.append(')');
        b = sb.toString();
    }
    
    private static char[] z(final String s) {
        final char[] charArray = s.toCharArray();
        int i;
        do {
            i = charArray.length;
            if (i < 2) {
                continue;
            }
            return charArray;
        } while (i == 0);
        final int n = 0;
        charArray[n] ^= '?';
        return charArray;
    }
    
    private static String z(final char[] value) {
        int length;
        int n2;
        final int n = n2 = (length = value.length);
        int n3 = 0;
        while (true) {
            Label_0086: {
                if (n > 1) {
                    break Label_0086;
                }
                length = (n2 = n3);
                do {
                    final char c = value[n2];
                    char c2 = '\0';
                    switch (n3 % 5) {
                        case 0: {
                            c2 = 'D';
                            break;
                        }
                        case 1: {
                            c2 = 'g';
                            break;
                        }
                        case 2: {
                            c2 = '7';
                            break;
                        }
                        case 3: {
                            c2 = 'O';
                            break;
                        }
                        default: {
                            c2 = '?';
                            break;
                        }
                    }
                    value[length] = (char)(c ^ c2);
                    ++n3;
                } while (n == 0);
            }
            if (n <= n3) {
                return new String(value).intern();
            }
            continue;
        }
    }
}
