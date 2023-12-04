package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.HashType;
import java.security.NoSuchAlgorithmException;
/* loaded from: classes7.dex */
class StreamingAeadUtil {
    StreamingAeadUtil() {
    }

    /* renamed from: com.google.crypto.tink.streamingaead.StreamingAeadUtil$1  reason: invalid class name */
    /* loaded from: classes7.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$HashType;

        static {
            int[] iArr = new int[HashType.values().length];
            $SwitchMap$com$google$crypto$tink$proto$HashType = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$HashType[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static String toHmacAlgo(HashType hash) throws NoSuchAlgorithmException {
        int i = AnonymousClass1.$SwitchMap$com$google$crypto$tink$proto$HashType[hash.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HmacSha512";
                }
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: " + hash);
            }
            return "HmacSha256";
        }
        return "HmacSha1";
    }
}
