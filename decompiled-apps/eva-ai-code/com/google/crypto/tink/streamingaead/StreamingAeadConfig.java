package com.google.crypto.tink.streamingaead;

import com.google.crypto.tink.proto.RegistryConfig;
import java.security.GeneralSecurityException;
/* loaded from: classes7.dex */
public final class StreamingAeadConfig {
    public static final String AES_CTR_HMAC_STREAMINGAEAD_TYPE_URL = new AesCtrHmacStreamingKeyManager().getKeyType();
    public static final String AES_GCM_HKDF_STREAMINGAEAD_TYPE_URL = new AesGcmHkdfStreamingKeyManager().getKeyType();
    @Deprecated
    public static final RegistryConfig TINK_1_1_0 = RegistryConfig.getDefaultInstance();
    public static final RegistryConfig LATEST = RegistryConfig.getDefaultInstance();

    static {
        try {
            init();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    @Deprecated
    public static void init() throws GeneralSecurityException {
        register();
    }

    public static void register() throws GeneralSecurityException {
        AesCtrHmacStreamingKeyManager.register(true);
        AesGcmHkdfStreamingKeyManager.register(true);
        StreamingAeadWrapper.register();
    }
}
