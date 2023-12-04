package com.google.crypto.tink.subtle;

import com.facebook.internal.security.CertificateUtil;
import com.google.crypto.tink.subtle.Enums;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.io.BufferedReader;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
/* loaded from: classes7.dex */
public enum PemKeyType {
    RSA_PSS_2048_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PSS", 2048, Enums.HashType.SHA256),
    RSA_PSS_3072_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PSS", CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Enums.HashType.SHA256),
    RSA_PSS_4096_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PSS", 4096, Enums.HashType.SHA256),
    RSA_PSS_4096_SHA512(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PSS", 4096, Enums.HashType.SHA512),
    RSA_SIGN_PKCS1_2048_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PKCS1-v1_5", 2048, Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_3072_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PKCS1-v1_5", CipherStorageKeystoreRsaEcb.ENCRYPTION_KEY_SIZE, Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_4096_SHA256(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PKCS1-v1_5", 4096, Enums.HashType.SHA256),
    RSA_SIGN_PKCS1_4096_SHA512(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA, "RSASSA-PKCS1-v1_5", 4096, Enums.HashType.SHA512),
    ECDSA_P256_SHA256("EC", "ECDSA", 256, Enums.HashType.SHA256),
    ECDSA_P384_SHA384("EC", "ECDSA", 384, Enums.HashType.SHA384),
    ECDSA_P521_SHA512("EC", "ECDSA", 521, Enums.HashType.SHA512);
    
    private static final String BEGIN = "-----BEGIN ";
    private static final String END = "-----END ";
    private static final String MARKER = "-----";
    private static final String PRIVATE_KEY = "PRIVATE KEY";
    private static final String PUBLIC_KEY = "PUBLIC KEY";
    public final String algorithm;
    public final Enums.HashType hash;
    public final int keySizeInBits;
    public final String keyType;

    PemKeyType(String keyType, String algorithm, int keySizeInBits, Enums.HashType hash) {
        this.keyType = keyType;
        this.algorithm = algorithm;
        this.keySizeInBits = keySizeInBits;
        this.hash = hash;
    }

    public Key readKey(BufferedReader reader) throws IOException {
        String substring;
        int indexOf;
        byte[] decode;
        String readLine = reader.readLine();
        while (readLine != null && !readLine.startsWith(BEGIN)) {
            readLine = reader.readLine();
        }
        if (readLine != null && (indexOf = (substring = readLine.trim().substring(11)).indexOf(MARKER)) >= 0) {
            String substring2 = substring.substring(0, indexOf);
            String str = END + substring2 + MARKER;
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine2 = reader.readLine();
                if (readLine2 != null) {
                    if (readLine2.indexOf(CertificateUtil.DELIMITER) <= 0) {
                        if (!readLine2.contains(str)) {
                            sb.append(readLine2);
                        }
                    }
                }
                try {
                    decode = Base64.decode(sb.toString(), 0);
                } catch (IllegalArgumentException | GeneralSecurityException unused) {
                }
                if (substring2.contains(PUBLIC_KEY)) {
                    return getPublicKey(decode);
                }
                if (substring2.contains(PRIVATE_KEY)) {
                    return getPrivateKey(decode);
                }
                return null;
            }
        }
        return null;
    }

    private Key getPublicKey(final byte[] key) throws GeneralSecurityException {
        return validate(EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePublic(new X509EncodedKeySpec(key)));
    }

    private Key getPrivateKey(final byte[] key) throws GeneralSecurityException {
        return validate(EngineFactory.KEY_FACTORY.getInstance(this.keyType).generatePrivate(new PKCS8EncodedKeySpec(key)));
    }

    private Key validate(Key key) throws GeneralSecurityException {
        if (this.keyType.equals(CipherStorageKeystoreRsaEcb.ALGORITHM_RSA)) {
            int bitLength = ((RSAKey) key).getModulus().bitLength();
            if (bitLength != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid RSA key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(bitLength)));
            }
        } else {
            ECParameterSpec params = ((ECKey) key).getParams();
            if (!EllipticCurves.isNistEcParameterSpec(params)) {
                throw new GeneralSecurityException("unsupport EC spec: " + params.toString());
            }
            int fieldSizeInBits = EllipticCurves.fieldSizeInBits(params.getCurve());
            if (fieldSizeInBits != this.keySizeInBits) {
                throw new GeneralSecurityException(String.format("invalid EC key size, want %d got %d", Integer.valueOf(this.keySizeInBits), Integer.valueOf(fieldSizeInBits)));
            }
        }
        return key;
    }
}
