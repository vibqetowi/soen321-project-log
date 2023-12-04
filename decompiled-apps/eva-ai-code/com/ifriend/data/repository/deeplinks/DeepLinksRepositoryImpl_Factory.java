package com.ifriend.data.repository.deeplinks;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DeepLinksRepositoryImpl_Factory implements Factory<DeepLinksRepositoryImpl> {
    private final Provider<DeepLinksParser> parserProvider;

    public DeepLinksRepositoryImpl_Factory(Provider<DeepLinksParser> provider) {
        this.parserProvider = provider;
    }

    @Override // javax.inject.Provider
    public DeepLinksRepositoryImpl get() {
        return newInstance(this.parserProvider.get());
    }

    public static DeepLinksRepositoryImpl_Factory create(Provider<DeepLinksParser> provider) {
        return new DeepLinksRepositoryImpl_Factory(provider);
    }

    public static DeepLinksRepositoryImpl newInstance(DeepLinksParser deepLinksParser) {
        return new DeepLinksRepositoryImpl(deepLinksParser);
    }
}
