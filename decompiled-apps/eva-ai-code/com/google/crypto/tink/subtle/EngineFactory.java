package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.subtle.EngineWrapper;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
/* loaded from: classes7.dex */
public final class EngineFactory<T_WRAPPER extends EngineWrapper<T_ENGINE>, T_ENGINE> {
    public static final EngineFactory<EngineWrapper.TCipher, Cipher> CIPHER;
    private static final boolean DEFAULT_LET_FALLBACK = true;
    public static final EngineFactory<EngineWrapper.TKeyAgreement, KeyAgreement> KEY_AGREEMENT;
    public static final EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> KEY_FACTORY;
    public static final EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> KEY_PAIR_GENERATOR;
    public static final EngineFactory<EngineWrapper.TMac, Mac> MAC;
    public static final EngineFactory<EngineWrapper.TMessageDigest, MessageDigest> MESSAGE_DIGEST;
    public static final EngineFactory<EngineWrapper.TSignature, Signature> SIGNATURE;
    private static final List<Provider> defaultPolicy;
    private static final Logger logger = Logger.getLogger(EngineFactory.class.getName());
    private T_WRAPPER instanceBuilder;
    private boolean letFallback;
    private List<Provider> policy;

    static {
        if (SubtleUtil.isAndroid()) {
            defaultPolicy = toProviderList(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL");
        } else {
            defaultPolicy = new ArrayList();
        }
        CIPHER = new EngineFactory<>(new EngineWrapper.TCipher());
        MAC = new EngineFactory<>(new EngineWrapper.TMac());
        SIGNATURE = new EngineFactory<>(new EngineWrapper.TSignature());
        MESSAGE_DIGEST = new EngineFactory<>(new EngineWrapper.TMessageDigest());
        KEY_AGREEMENT = new EngineFactory<>(new EngineWrapper.TKeyAgreement());
        KEY_PAIR_GENERATOR = new EngineFactory<>(new EngineWrapper.TKeyPairGenerator());
        KEY_FACTORY = new EngineFactory<>(new EngineWrapper.TKeyFactory());
    }

    public static final EngineFactory<EngineWrapper.TCipher, Cipher> getCustomCipherProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TCipher(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TMac, Mac> getCustomMacProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TMac(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TSignature, Signature> getCustomSignatureProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TSignature(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TMessageDigest, MessageDigest> getCustomMessageDigestProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TMessageDigest(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TKeyAgreement, KeyAgreement> getCustomKeyAgreementProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TKeyAgreement(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> getCustomKeyPairGeneratorProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TKeyPairGenerator(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static final EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> getCustomKeyFactoryProvider(boolean letFallbackToDefault, String... providerNames) {
        return new EngineFactory<>(new EngineWrapper.TKeyFactory(), toProviderList(providerNames), letFallbackToDefault);
    }

    public static List<Provider> toProviderList(String... providerNames) {
        ArrayList arrayList = new ArrayList();
        for (String str : providerNames) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                logger.info(String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public EngineFactory(T_WRAPPER instanceBuilder) {
        this.instanceBuilder = instanceBuilder;
        this.policy = defaultPolicy;
        this.letFallback = true;
    }

    public EngineFactory(T_WRAPPER instanceBuilder, List<Provider> policy) {
        this.instanceBuilder = instanceBuilder;
        this.policy = policy;
        this.letFallback = true;
    }

    public EngineFactory(T_WRAPPER instanceBuilder, List<Provider> policy, boolean letFallback) {
        this.instanceBuilder = instanceBuilder;
        this.policy = policy;
        this.letFallback = letFallback;
    }

    public T_ENGINE getInstance(String algorithm) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : this.policy) {
            try {
                return (T_ENGINE) this.instanceBuilder.getInstance(algorithm, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.letFallback) {
            return (T_ENGINE) this.instanceBuilder.getInstance(algorithm, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
