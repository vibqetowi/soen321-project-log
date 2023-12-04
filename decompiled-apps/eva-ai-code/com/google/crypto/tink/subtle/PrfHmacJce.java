package com.google.crypto.tink.subtle;

import com.google.crypto.tink.prf.Prf;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
@Immutable
/* loaded from: classes7.dex */
public final class PrfHmacJce implements Prf {
    static final int MIN_KEY_SIZE_IN_BYTES = 16;
    private final String algorithm;
    private final Key key;
    private final ThreadLocal<Mac> localMac;
    private final int maxOutputLength;

    public PrfHmacJce(String algorithm, Key key) throws GeneralSecurityException {
        ThreadLocal<Mac> threadLocal = new ThreadLocal<Mac>() { // from class: com.google.crypto.tink.subtle.PrfHmacJce.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // java.lang.ThreadLocal
            public Mac initialValue() {
                try {
                    Mac engineFactory = EngineFactory.MAC.getInstance(PrfHmacJce.this.algorithm);
                    engineFactory.init(PrfHmacJce.this.key);
                    return engineFactory;
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
        this.localMac = threadLocal;
        this.algorithm = algorithm;
        this.key = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        algorithm.hashCode();
        char c = 65535;
        switch (algorithm.hashCode()) {
            case -1823053428:
                if (algorithm.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (algorithm.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (algorithm.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (algorithm.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.maxOutputLength = 20;
                break;
            case 1:
                this.maxOutputLength = 32;
                break;
            case 2:
                this.maxOutputLength = 48;
                break;
            case 3:
                this.maxOutputLength = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + algorithm);
        }
        threadLocal.get();
    }

    @Override // com.google.crypto.tink.prf.Prf
    public byte[] compute(byte[] data, int outputLength) throws GeneralSecurityException {
        if (outputLength > this.maxOutputLength) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        this.localMac.get().update(data);
        return Arrays.copyOf(this.localMac.get().doFinal(), outputLength);
    }

    public int getMaxOutputLength() {
        return this.maxOutputLength;
    }
}
