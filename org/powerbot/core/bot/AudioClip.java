
package org.powerbot.core.bot;

import java.net.URL;

public class AudioClip implements java.applet.AudioClip
{
    public static final short STATE_STOPPED = 0;
    public static final short STATE_PLAYING = 1;
    public static final short STATE_LOOPING = 2;
    private final URL sourceURL;
    private short audioClipState;
    
    public AudioClip(final URL sourceURL) {
        this.sourceURL = sourceURL;
        this.audioClipState = 0;
    }
    
    public short getAudioClipState() {
        return this.audioClipState;
    }
    
    public URL getURL() {
        return this.sourceURL;
    }
    
    @Override
    public boolean equals(final Object o) {
        final int a = ClientStub.a;
        Object o2 = null;
        Label_0054: {
            Label_0053: {
                Object o3 = null;
                Label_0036: {
                    Label_0035: {
                        Object o4 = null;
                        Label_0020: {
                            Label_0019: {
                                try {
                                    o2 = o;
                                    o3 = o;
                                    o4 = o;
                                    if (a != 0) {
                                        break Label_0020;
                                    }
                                    if (o == null) {
                                        return false;
                                    }
                                    break Label_0019;
                                }
                                catch (RuntimeException ex) {
                                    throw ex;
                                }
                                try {
                                    if (o == null) {
                                        return false;
                                    }
                                }
                                catch (RuntimeException ex2) {
                                    throw ex2;
                                }
                            }
                            o2 = o;
                            o3 = o;
                            o4 = o;
                            try {
                                if (a != 0) {
                                    break Label_0036;
                                }
                                final AudioClip audioClip = this;
                                if (o4 == audioClip) {
                                    return true;
                                }
                                break Label_0035;
                            }
                            catch (RuntimeException ex3) {
                                throw ex3;
                            }
                        }
                        try {
                            final AudioClip audioClip = this;
                            if (o4 == audioClip) {
                                return true;
                            }
                        }
                        catch (RuntimeException ex4) {
                            throw ex4;
                        }
                    }
                    o2 = o;
                    o3 = o;
                    try {
                        if (a != 0) {
                            break Label_0054;
                        }
                        final boolean b = o3 instanceof AudioClip;
                        if (!b) {
                            return false;
                        }
                        break Label_0053;
                    }
                    catch (RuntimeException ex5) {
                        throw ex5;
                    }
                }
                try {
                    final boolean b = o3 instanceof AudioClip;
                    if (!b) {
                        return false;
                    }
                }
                catch (RuntimeException ex6) {
                    throw ex6;
                }
            }
            o2 = o;
        }
        final AudioClip audioClip2 = (AudioClip)o2;
        Label_0092: {
            short audioClipState = 0;
            short equals = 0;
            Label_0077: {
                short n;
                try {
                    n = (equals = (audioClipState = audioClip2.getAudioClipState()));
                    if (a != 0) {
                        break Label_0092;
                    }
                    final AudioClip audioClip3 = this;
                    final short n2 = audioClip3.audioClipState;
                    if (n == n2) {
                        break Label_0077;
                    }
                    return false;
                }
                catch (RuntimeException ex7) {
                    throw ex7;
                }
                try {
                    final AudioClip audioClip3 = this;
                    final short n2 = audioClip3.audioClipState;
                    if (n != n2) {
                        return false;
                    }
                    audioClipState = (equals = (short)(audioClip2.getURL().equals(this.sourceURL) ? 1 : 0));
                }
                catch (RuntimeException ex8) {
                    throw ex8;
                }
            }
            try {
                if (a != 0) {
                    return audioClipState != 0;
                }
                if (equals == 0) {
                    return false;
                }
            }
            catch (RuntimeException ex9) {
                throw ex9;
            }
        }
        short audioClipState = 1;
        return audioClipState != 0;
        audioClipState = 0;
        return audioClipState != 0;
    }
    
    @Override
    public void play() {
        this.audioClipState = 1;
    }
    
    @Override
    public void loop() {
        this.audioClipState = 2;
    }
    
    @Override
    public void stop() {
        this.audioClipState = 0;
    }
}
