package com.google.crypto.tink.subtle.prf;

import com.google.crypto.tink.subtle.EngineFactory;
import com.google.crypto.tink.subtle.Enums;
import com.google.errorprone.annotations.Immutable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
@Immutable
/* loaded from: classes7.dex */
public class HkdfStreamingPrf implements StreamingPrf {
    private final Enums.HashType hashType;
    private final byte[] ikm;
    private final byte[] salt;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.crypto.tink.subtle.prf.HkdfStreamingPrf$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[Enums.HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA384.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[Enums.HashType.SHA512.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String getJavaxHmacName(Enums.HashType hashType) throws GeneralSecurityException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "HmacSha512";
                    }
                    throw new GeneralSecurityException("No getJavaxHmacName for given hash " + hashType + " known");
                }
                return "HmacSha384";
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }

    public HkdfStreamingPrf(final Enums.HashType hashType, final byte[] ikm, final byte[] salt) {
        this.hashType = hashType;
        this.ikm = Arrays.copyOf(ikm, ikm.length);
        this.salt = Arrays.copyOf(salt, salt.length);
    }

    /* loaded from: classes7.dex */
    private class HkdfInputStream extends InputStream {
        private ByteBuffer buffer;
        private int ctr = -1;
        private final byte[] input;
        private Mac mac;
        private byte[] prk;

        public HkdfInputStream(final byte[] input) {
            this.input = Arrays.copyOf(input, input.length);
        }

        private void initialize() throws GeneralSecurityException, IOException {
            try {
                this.mac = EngineFactory.MAC.getInstance(HkdfStreamingPrf.getJavaxHmacName(HkdfStreamingPrf.this.hashType));
                if (HkdfStreamingPrf.this.salt == null || HkdfStreamingPrf.this.salt.length == 0) {
                    this.mac.init(new SecretKeySpec(new byte[this.mac.getMacLength()], HkdfStreamingPrf.getJavaxHmacName(HkdfStreamingPrf.this.hashType)));
                } else {
                    this.mac.init(new SecretKeySpec(HkdfStreamingPrf.this.salt, HkdfStreamingPrf.getJavaxHmacName(HkdfStreamingPrf.this.hashType)));
                }
                this.mac.update(HkdfStreamingPrf.this.ikm);
                this.prk = this.mac.doFinal();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(0);
                this.buffer = allocateDirect;
                allocateDirect.mark();
                this.ctr = 0;
            } catch (GeneralSecurityException e) {
                throw new IOException("Creating HMac failed", e);
            }
        }

        private void updateBuffer() throws GeneralSecurityException, IOException {
            this.mac.init(new SecretKeySpec(this.prk, HkdfStreamingPrf.getJavaxHmacName(HkdfStreamingPrf.this.hashType)));
            this.buffer.reset();
            this.mac.update(this.buffer);
            this.mac.update(this.input);
            int i = this.ctr + 1;
            this.ctr = i;
            this.mac.update((byte) i);
            ByteBuffer wrap = ByteBuffer.wrap(this.mac.doFinal());
            this.buffer = wrap;
            wrap.mark();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            byte[] bArr = new byte[1];
            int read = read(bArr, 0, 1);
            if (read == 1) {
                return bArr[0] & 255;
            }
            if (read == -1) {
                return read;
            }
            throw new IOException("Reading failed");
        }

        @Override // java.io.InputStream
        public int read(byte[] dst) throws IOException {
            return read(dst, 0, dst.length);
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int off, int len) throws IOException {
            try {
                if (this.ctr == -1) {
                    initialize();
                }
                int i = 0;
                while (i < len) {
                    if (!this.buffer.hasRemaining()) {
                        if (this.ctr == 255) {
                            return i;
                        }
                        updateBuffer();
                    }
                    int min = Math.min(len - i, this.buffer.remaining());
                    this.buffer.get(b, off, min);
                    off += min;
                    i += min;
                }
                return i;
            } catch (GeneralSecurityException e) {
                this.mac = null;
                throw new IOException("HkdfInputStream failed", e);
            }
        }
    }

    @Override // com.google.crypto.tink.subtle.prf.StreamingPrf
    public InputStream computePrf(final byte[] input) {
        return new HkdfInputStream(input);
    }
}
