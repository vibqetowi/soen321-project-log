package org.conscrypt;

import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.RSAPrivateKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.conscrypt.NativeRef;
import org.conscrypt.OpenSSLX509CertificateFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class OpenSSLKey {
    private final NativeRef.EVP_PKEY ctx;
    private final boolean hardwareBacked;
    private final boolean wrapped;

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSSLKey(long j) {
        this(j, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public OpenSSLKey(long j, boolean z) {
        this(j, z, false);
    }

    OpenSSLKey(long j, boolean z, boolean z2) {
        this.ctx = new NativeRef.EVP_PKEY(j);
        this.wrapped = z;
        this.hardwareBacked = z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NativeRef.EVP_PKEY getNativeRef() {
        return this.ctx;
    }

    boolean isWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isHardwareBacked() {
        return this.hardwareBacked;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSSLKey fromPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) privateKey).getOpenSSLKey();
        }
        String format = privateKey.getFormat();
        if (format == null) {
            return wrapPrivateKey(privateKey);
        }
        if (!"PKCS#8".equals(privateKey.getFormat())) {
            throw new InvalidKeyException("Unknown key format " + format);
        } else if (privateKey.getEncoded() == null) {
            throw new InvalidKeyException("Key encoding is null");
        } else {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_parse_private_key(privateKey.getEncoded()));
            } catch (OpenSSLX509CertificateFactory.ParsingException e) {
                throw new InvalidKeyException(e);
            }
        }
    }

    static OpenSSLKey fromPrivateKeyPemInputStream(InputStream inputStream) throws InvalidKeyException {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long PEM_read_bio_PrivateKey = NativeCrypto.PEM_read_bio_PrivateKey(openSSLBIOInputStream.getBioContext());
                if (PEM_read_bio_PrivateKey != 0) {
                    return new OpenSSLKey(PEM_read_bio_PrivateKey);
                }
                openSSLBIOInputStream.release();
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSSLKey fromPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
        OpenSSLKey openSSLKey = getOpenSSLKey(privateKey);
        if (openSSLKey != null) {
            return openSSLKey;
        }
        OpenSSLKey fromKeyMaterial = fromKeyMaterial(privateKey);
        return fromKeyMaterial != null ? fromKeyMaterial : wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSSLKey fromECPrivateKeyForTLSStackOnly(PrivateKey privateKey, ECParameterSpec eCParameterSpec) throws InvalidKeyException {
        OpenSSLKey openSSLKey = getOpenSSLKey(privateKey);
        if (openSSLKey != null) {
            return openSSLKey;
        }
        OpenSSLKey fromKeyMaterial = fromKeyMaterial(privateKey);
        return fromKeyMaterial != null ? fromKeyMaterial : OpenSSLECPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, eCParameterSpec);
    }

    private static OpenSSLKey getOpenSSLKey(PrivateKey privateKey) {
        if (privateKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) privateKey).getOpenSSLKey();
        }
        if (CipherStorageKeystoreRsaEcb.ALGORITHM_RSA.equals(privateKey.getAlgorithm())) {
            return Platform.wrapRsaKey(privateKey);
        }
        return null;
    }

    private static OpenSSLKey fromKeyMaterial(PrivateKey privateKey) throws InvalidKeyException {
        byte[] encoded;
        if ("PKCS#8".equals(privateKey.getFormat()) && (encoded = privateKey.getEncoded()) != null) {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_parse_private_key(encoded));
            } catch (OpenSSLX509CertificateFactory.ParsingException e) {
                throw new InvalidKeyException(e);
            }
        }
        return null;
    }

    private static OpenSSLKey wrapJCAPrivateKeyForTLSStackOnly(PrivateKey privateKey, PublicKey publicKey) throws InvalidKeyException {
        String algorithm = privateKey.getAlgorithm();
        if (CipherStorageKeystoreRsaEcb.ALGORITHM_RSA.equals(algorithm)) {
            return OpenSSLRSAPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey);
        }
        if ("EC".equals(algorithm)) {
            return OpenSSLECPrivateKey.wrapJCAPrivateKeyForTLSStackOnly(privateKey, publicKey);
        }
        throw new InvalidKeyException("Unsupported key algorithm: " + algorithm);
    }

    private static OpenSSLKey wrapPrivateKey(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof RSAPrivateKey) {
            return OpenSSLRSAPrivateKey.wrapPlatformKey((RSAPrivateKey) privateKey);
        }
        if (privateKey instanceof ECPrivateKey) {
            return OpenSSLECPrivateKey.wrapPlatformKey((ECPrivateKey) privateKey);
        }
        throw new InvalidKeyException("Unknown key type: " + privateKey.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static OpenSSLKey fromPublicKey(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof OpenSSLKeyHolder) {
            return ((OpenSSLKeyHolder) publicKey).getOpenSSLKey();
        }
        if (!"X.509".equals(publicKey.getFormat())) {
            throw new InvalidKeyException("Unknown key format " + publicKey.getFormat());
        } else if (publicKey.getEncoded() == null) {
            throw new InvalidKeyException("Key encoding is null");
        } else {
            try {
                return new OpenSSLKey(NativeCrypto.EVP_parse_public_key(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        }
    }

    static OpenSSLKey fromPublicKeyPemInputStream(InputStream inputStream) throws InvalidKeyException {
        OpenSSLBIOInputStream openSSLBIOInputStream = new OpenSSLBIOInputStream(inputStream, true);
        try {
            try {
                long PEM_read_bio_PUBKEY = NativeCrypto.PEM_read_bio_PUBKEY(openSSLBIOInputStream.getBioContext());
                if (PEM_read_bio_PUBKEY != 0) {
                    return new OpenSSLKey(PEM_read_bio_PUBKEY);
                }
                openSSLBIOInputStream.release();
                return null;
            } catch (Exception e) {
                throw new InvalidKeyException(e);
            }
        } finally {
            openSSLBIOInputStream.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublicKey getPublicKey() throws NoSuchAlgorithmException {
        int EVP_PKEY_type = NativeCrypto.EVP_PKEY_type(this.ctx);
        if (EVP_PKEY_type != 6) {
            if (EVP_PKEY_type == 408) {
                return new OpenSSLECPublicKey(this);
            }
            throw new NoSuchAlgorithmException("unknown PKEY type");
        }
        return new OpenSSLRSAPublicKey(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PublicKey getPublicKey(X509EncodedKeySpec x509EncodedKeySpec, int i) throws InvalidKeySpecException {
        try {
            OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EVP_parse_public_key(x509EncodedKeySpec.getEncoded()));
            if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) != i) {
                throw new InvalidKeySpecException("Unexpected key type");
            }
            try {
                return openSSLKey.getPublicKey();
            } catch (NoSuchAlgorithmException e) {
                throw new InvalidKeySpecException(e);
            }
        } catch (Exception e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    PrivateKey getPrivateKey() throws NoSuchAlgorithmException {
        int EVP_PKEY_type = NativeCrypto.EVP_PKEY_type(this.ctx);
        if (EVP_PKEY_type != 6) {
            if (EVP_PKEY_type == 408) {
                return new OpenSSLECPrivateKey(this);
            }
            throw new NoSuchAlgorithmException("unknown PKEY type");
        }
        return new OpenSSLRSAPrivateKey(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static PrivateKey getPrivateKey(PKCS8EncodedKeySpec pKCS8EncodedKeySpec, int i) throws InvalidKeySpecException {
        try {
            OpenSSLKey openSSLKey = new OpenSSLKey(NativeCrypto.EVP_parse_private_key(pKCS8EncodedKeySpec.getEncoded()));
            if (NativeCrypto.EVP_PKEY_type(openSSLKey.getNativeRef()) != i) {
                throw new InvalidKeySpecException("Unexpected key type");
            }
            try {
                return openSSLKey.getPrivateKey();
            } catch (NoSuchAlgorithmException e) {
                throw new InvalidKeySpecException(e);
            }
        } catch (Exception e2) {
            throw new InvalidKeySpecException(e2);
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OpenSSLKey) {
            OpenSSLKey openSSLKey = (OpenSSLKey) obj;
            return this.ctx.equals(openSSLKey.getNativeRef()) || NativeCrypto.EVP_PKEY_cmp(this.ctx, openSSLKey.getNativeRef()) == 1;
        }
        return false;
    }

    public int hashCode() {
        return this.ctx.hashCode();
    }
}
