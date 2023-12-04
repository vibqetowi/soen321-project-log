package org.conscrypt;

import com.facebook.internal.security.CertificateUtil;
import com.ifriend.keychain.cipherStorage.CipherStorageKeystoreRsaEcb;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes5.dex */
final class CryptoUpcalls {
    private static final Logger logger = Logger.getLogger(CryptoUpcalls.class.getName());

    private CryptoUpcalls() {
    }

    private static ArrayList<Provider> getExternalProviders(String str) {
        Provider[] providers;
        ArrayList<Provider> arrayList = new ArrayList<>(1);
        for (Provider provider : Security.getProviders(str)) {
            if (!Conscrypt.isConscrypt(provider)) {
                arrayList.add(provider);
            }
        }
        if (arrayList.isEmpty()) {
            logger.warning("Could not find external provider for algorithm: " + str);
        }
        return arrayList;
    }

    static byte[] ecSignDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr) {
        if (!"EC".equals(privateKey.getAlgorithm())) {
            throw new RuntimeException("Unexpected key type: " + privateKey.toString());
        }
        return signDigestWithPrivateKey(privateKey, bArr, "NONEwithECDSA");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] signDigestWithPrivateKey(PrivateKey privateKey, byte[] bArr, String str) {
        Signature signature;
        Iterator<Provider> it;
        RuntimeException runtimeException;
        try {
            signature = Signature.getInstance(str);
            signature.initSign(privateKey);
        } catch (InvalidKeyException e) {
            logger.warning("Preferred provider doesn't support key:");
            e.printStackTrace();
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported signature algorithm: " + str);
            return null;
        }
        while (it.hasNext()) {
            try {
                signature = Signature.getInstance(str, it.next());
                signature.initSign(privateKey);
                break;
            } catch (RuntimeException e2) {
                if (runtimeException == null) {
                    runtimeException = e2;
                }
                signature = null;
            } catch (InvalidKeyException | NoSuchAlgorithmException unused2) {
                signature = null;
            }
        }
        if (signature == null) {
            if (runtimeException != null) {
                throw runtimeException;
            }
            logger.warning("Could not find provider for algorithm: " + str);
            return null;
        }
        try {
            signature.update(bArr);
            return signature.sign();
        } catch (Exception e3) {
            logger.log(Level.WARNING, "Exception while signing message with " + privateKey.getAlgorithm() + " private key:", (Throwable) e3);
            return null;
        }
        signature = null;
        if (signature == null) {
            it = getExternalProviders("Signature." + str).iterator();
            runtimeException = null;
            while (it.hasNext()) {
            }
            if (signature == null) {
            }
        }
        signature.update(bArr);
        return signature.sign();
    }

    static byte[] rsaSignDigestWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 1, bArr);
    }

    static byte[] rsaDecryptWithPrivateKey(PrivateKey privateKey, int i, byte[] bArr) {
        return rsaOpWithPrivateKey(privateKey, i, 2, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
        if (org.conscrypt.Conscrypt.isConscrypt(r1.getProvider()) != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static byte[] rsaOpWithPrivateKey(PrivateKey privateKey, int i, int i2, byte[] bArr) {
        String str;
        String concat;
        Cipher cipher;
        Iterator<Provider> it;
        String algorithm = privateKey.getAlgorithm();
        if (!CipherStorageKeystoreRsaEcb.ALGORITHM_RSA.equals(algorithm)) {
            logger.warning("Unexpected key type: " + algorithm);
            return null;
        }
        if (i == 1) {
            str = CipherStorageKeystoreRsaEcb.PADDING_PKCS1;
        } else if (i == 3) {
            str = "NoPadding";
        } else if (i != 4) {
            logger.warning("Unsupported OpenSSL/BoringSSL padding: " + i);
            return null;
        } else {
            str = "OAEPPadding";
        }
        concat = "RSA/ECB/".concat(str);
        try {
            cipher = Cipher.getInstance(concat);
            cipher.init(i2, privateKey);
        } catch (InvalidKeyException e) {
            logger.log(Level.WARNING, "Preferred provider doesn't support key:", (Throwable) e);
        } catch (NoSuchAlgorithmException unused) {
            logger.warning("Unsupported cipher algorithm: " + concat);
            return null;
        } catch (NoSuchPaddingException unused2) {
            logger.warning("Unsupported cipher algorithm: " + concat);
            return null;
        }
        while (it.hasNext()) {
            try {
                cipher = Cipher.getInstance(concat, it.next());
                cipher.init(i2, privateKey);
                break;
            } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException unused3) {
                cipher = null;
            }
        }
        if (cipher == null) {
            logger.warning("Could not find provider for algorithm: " + concat);
            return null;
        }
        try {
            return cipher.doFinal(bArr);
        } catch (Exception e2) {
            logger.log(Level.WARNING, "Exception while decrypting message with " + privateKey.getAlgorithm() + " private key using " + concat + CertificateUtil.DELIMITER, (Throwable) e2);
            return null;
        }
        cipher = null;
        if (cipher == null) {
            it = getExternalProviders("Cipher." + concat).iterator();
            while (it.hasNext()) {
            }
            if (cipher == null) {
            }
        }
        return cipher.doFinal(bArr);
    }
}
