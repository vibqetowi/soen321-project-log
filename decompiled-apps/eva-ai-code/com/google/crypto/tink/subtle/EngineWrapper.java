package com.google.crypto.tink.subtle;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* loaded from: classes7.dex */
public interface EngineWrapper<T> {
    T getInstance(String algorithm, Provider provider) throws GeneralSecurityException;

    /* loaded from: classes7.dex */
    public static class TCipher implements EngineWrapper<Cipher> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Cipher getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Cipher.getInstance(algorithm);
            }
            return Cipher.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TMac implements EngineWrapper<Mac> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Mac getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Mac.getInstance(algorithm);
            }
            return Mac.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TKeyPairGenerator implements EngineWrapper<KeyPairGenerator> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyPairGenerator getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyPairGenerator.getInstance(algorithm);
            }
            return KeyPairGenerator.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TMessageDigest implements EngineWrapper<MessageDigest> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public MessageDigest getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return MessageDigest.getInstance(algorithm);
            }
            return MessageDigest.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TSignature implements EngineWrapper<Signature> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public Signature getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return Signature.getInstance(algorithm);
            }
            return Signature.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TKeyFactory implements EngineWrapper<KeyFactory> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyFactory getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyFactory.getInstance(algorithm);
            }
            return KeyFactory.getInstance(algorithm, provider);
        }
    }

    /* loaded from: classes7.dex */
    public static class TKeyAgreement implements EngineWrapper<KeyAgreement> {
        @Override // com.google.crypto.tink.subtle.EngineWrapper
        public KeyAgreement getInstance(String algorithm, Provider provider) throws GeneralSecurityException {
            if (provider == null) {
                return KeyAgreement.getInstance(algorithm);
            }
            return KeyAgreement.getInstance(algorithm, provider);
        }
    }
}
