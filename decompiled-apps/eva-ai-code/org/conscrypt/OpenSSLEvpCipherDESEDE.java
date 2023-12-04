package org.conscrypt;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import javax.crypto.NoSuchPaddingException;
import org.conscrypt.OpenSSLCipher;
/* loaded from: classes5.dex */
public abstract class OpenSSLEvpCipherDESEDE extends OpenSSLEvpCipher {
    private static final int DES_BLOCK_SIZE = 8;

    @Override // org.conscrypt.OpenSSLCipher
    String getBaseCipherName() {
        return "DESede";
    }

    @Override // org.conscrypt.OpenSSLCipher
    int getCipherBlockSize() {
        return 8;
    }

    OpenSSLEvpCipherDESEDE(OpenSSLCipher.Mode mode, OpenSSLCipher.Padding padding) {
        super(mode, padding);
    }

    /* loaded from: classes5.dex */
    public static class CBC extends OpenSSLEvpCipherDESEDE {
        CBC(OpenSSLCipher.Padding padding) {
            super(OpenSSLCipher.Mode.CBC, padding);
        }

        /* loaded from: classes5.dex */
        public static class NoPadding extends CBC {
            public NoPadding() {
                super(OpenSSLCipher.Padding.NOPADDING);
            }
        }

        /* loaded from: classes5.dex */
        public static class PKCS5Padding extends CBC {
            public PKCS5Padding() {
                super(OpenSSLCipher.Padding.PKCS5PADDING);
            }
        }
    }

    @Override // org.conscrypt.OpenSSLEvpCipher
    String getCipherName(int i, OpenSSLCipher.Mode mode) {
        String str = i == 16 ? "des-ede" : "des-ede3";
        return str + "-" + mode.toString().toLowerCase(Locale.US);
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedKeySize(int i) throws InvalidKeyException {
        if (i != 16 && i != 24) {
            throw new InvalidKeyException("key size must be 128 or 192 bits");
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedMode(OpenSSLCipher.Mode mode) throws NoSuchAlgorithmException {
        if (mode == OpenSSLCipher.Mode.CBC) {
            return;
        }
        throw new NoSuchAlgorithmException("Unsupported mode " + mode.toString());
    }

    /* renamed from: org.conscrypt.OpenSSLEvpCipherDESEDE$1  reason: invalid class name */
    /* loaded from: classes5.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$conscrypt$OpenSSLCipher$Padding;

        static {
            int[] iArr = new int[OpenSSLCipher.Padding.values().length];
            $SwitchMap$org$conscrypt$OpenSSLCipher$Padding = iArr;
            try {
                iArr[OpenSSLCipher.Padding.NOPADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$conscrypt$OpenSSLCipher$Padding[OpenSSLCipher.Padding.PKCS5PADDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // org.conscrypt.OpenSSLCipher
    void checkSupportedPadding(OpenSSLCipher.Padding padding) throws NoSuchPaddingException {
        int i = AnonymousClass1.$SwitchMap$org$conscrypt$OpenSSLCipher$Padding[padding.ordinal()];
        if (i == 1 || i == 2) {
            return;
        }
        throw new NoSuchPaddingException("Unsupported padding " + padding.toString());
    }
}
