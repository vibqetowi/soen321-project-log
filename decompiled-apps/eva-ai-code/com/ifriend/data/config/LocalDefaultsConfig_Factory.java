package com.ifriend.data.config;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LocalDefaultsConfig_Factory implements Factory<LocalDefaultsConfig> {
    private final Provider<LocalConfigExtractor> localConfigExtractorProvider;

    public LocalDefaultsConfig_Factory(Provider<LocalConfigExtractor> provider) {
        this.localConfigExtractorProvider = provider;
    }

    @Override // javax.inject.Provider
    public LocalDefaultsConfig get() {
        return newInstance(this.localConfigExtractorProvider.get());
    }

    public static LocalDefaultsConfig_Factory create(Provider<LocalConfigExtractor> provider) {
        return new LocalDefaultsConfig_Factory(provider);
    }

    public static LocalDefaultsConfig newInstance(LocalConfigExtractor localConfigExtractor) {
        return new LocalDefaultsConfig(localConfigExtractor);
    }
}
