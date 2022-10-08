
package org.powerbot;

import java.io.ByteArrayInputStream;
import java.util.zip.Checksum;
import java.util.zip.CheckedInputStream;
import java.util.zip.CRC32;
import java.io.OutputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.net.URL;
import java.io.IOException;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public class cb
{
    public static byte[] a(final InputStream inputStream) {
        final boolean c = kb.c;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            final byte[] array = new byte[4096];
            while (true) {
                Label_0051: {
                    final int read;
                    if ((read = inputStream.read(array)) == -1) {
                        break Label_0051;
                    }
                    Label_0068: {
                        try {
                            byteArrayOutputStream.write(array, 0, read);
                            if (c) {
                                break Label_0068;
                            }
                            if (!c) {
                                continue;
                            }
                        }
                        catch (IOException ex) {
                            throw ex;
                        }
                        try {
                            try {}
                            catch (IOException ex5) {}
                        }
                        catch (IOException ex6) {}
                    }
                }
            }
        }
        catch (IOException ex7) {
            try {
                byteArrayOutputStream.close();
            }
            catch (IOException ex8) {}
            byteArrayOutputStream = null;
        }
        finally {
            try {
                Label_0129: {
                    InputStream inputStream2 = null;
                    Label_0126: {
                        try {
                            inputStream2 = inputStream;
                            if (c) {
                                break Label_0126;
                            }
                            if (inputStream == null) {
                                break Label_0129;
                            }
                        }
                        catch (IOException ex2) {
                            throw ex2;
                        }
                        inputStream2 = inputStream;
                    }
                    inputStream2.close();
                }
            }
            catch (IOException ex9) {}
        }
        Label_0150: {
            ByteArrayOutputStream byteArrayOutputStream2;
            try {
                final ByteArrayOutputStream byteArrayOutputStream3;
                byteArrayOutputStream2 = (byteArrayOutputStream3 = byteArrayOutputStream);
                if (c) {
                    return byteArrayOutputStream3.toByteArray();
                }
                if (byteArrayOutputStream2 == null) {
                    break Label_0150;
                }
                break Label_0150;
            }
            catch (IOException ex3) {
                throw ex3;
            }
            try {
                if (byteArrayOutputStream2 == null) {
                    return null;
                }
            }
            catch (IOException ex4) {
                throw ex4;
            }
        }
        ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
        return byteArrayOutputStream3.toByteArray();
    }
    
    public static byte[] a(final URL url) {
        try {
            return a(url.openStream());
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    public static byte[] a(final File file) {
        try {
            return a(new FileInputStream(file));
        }
        catch (FileNotFoundException ex) {
            return null;
        }
    }
    
    public static String b(final InputStream inputStream) {
        return gb.a(a(inputStream));
    }
    
    public static String b(final URL url) {
        return gb.a(a(url));
    }
    
    public static String b(final File file) {
        return gb.a(a(file));
    }
    
    public static void a(final InputStream inputStream, final OutputStream outputStream) {
        final boolean c = kb.c;
        try {
            final byte[] array = new byte[4096];
            while (true) {
                Label_0043: {
                    final int read;
                    if ((read = inputStream.read(array)) == -1) {
                        break Label_0043;
                    }
                    Label_0060: {
                        try {
                            outputStream.write(array, 0, read);
                            if (c) {
                                break Label_0060;
                            }
                            if (!c) {
                                continue;
                            }
                        }
                        catch (IOException ex) {
                            throw ex;
                        }
                        try {
                            try {}
                            catch (IOException ex4) {}
                            try {}
                            catch (IOException ex5) {}
                        }
                        catch (IOException ex6) {}
                    }
                }
            }
        }
        catch (IOException ex7) {}
        finally {
            try {
                Label_0162: {
                    InputStream inputStream2 = null;
                    Label_0159: {
                        Label_0145: {
                            OutputStream outputStream2 = null;
                            Label_0142: {
                                try {
                                    outputStream2 = outputStream;
                                    if (c) {
                                        break Label_0142;
                                    }
                                    if (outputStream == null) {
                                        break Label_0145;
                                    }
                                }
                                catch (IOException ex2) {
                                    throw ex2;
                                }
                                outputStream2 = outputStream;
                            }
                            outputStream2.close();
                            try {
                                inputStream2 = inputStream;
                                if (c) {
                                    break Label_0159;
                                }
                                if (inputStream == null) {
                                    break Label_0162;
                                }
                            }
                            catch (IOException ex3) {
                                throw ex3;
                            }
                        }
                        inputStream2 = inputStream;
                    }
                    inputStream2.close();
                }
            }
            catch (IOException ex8) {}
        }
    }
    
    public static long c(final InputStream in) {
        final CheckedInputStream checkedInputStream = new CheckedInputStream(in, new CRC32());
        final byte[] b = new byte[4096];
        try {
            while (checkedInputStream.read(b) != -1) {}
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        return checkedInputStream.getChecksum().getValue();
    }
    
    public static long a(final byte[] buf) {
        return c(new ByteArrayInputStream(buf));
    }
    
    public static long c(final File file) {
        return c(new FileInputStream(file));
    }
}
