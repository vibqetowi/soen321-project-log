package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppDeepLinksDelegateImpl_Factory implements Factory<AppDeepLinksDelegateImpl> {
    private final Provider<DeepLinksRepository> deepLinksRepositoryProvider;

    public AppDeepLinksDelegateImpl_Factory(Provider<DeepLinksRepository> provider) {
        this.deepLinksRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppDeepLinksDelegateImpl get() {
        return newInstance(this.deepLinksRepositoryProvider.get());
    }

    public static AppDeepLinksDelegateImpl_Factory create(Provider<DeepLinksRepository> provider) {
        return new AppDeepLinksDelegateImpl_Factory(provider);
    }

    public static AppDeepLinksDelegateImpl newInstance(DeepLinksRepository deepLinksRepository) {
        return new AppDeepLinksDelegateImpl(deepLinksRepository);
    }
}
