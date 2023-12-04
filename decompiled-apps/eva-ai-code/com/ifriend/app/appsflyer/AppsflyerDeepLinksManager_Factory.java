package com.ifriend.app.appsflyer;

import com.ifriend.domain.data.deeplinks.DeepLinksRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppsflyerDeepLinksManager_Factory implements Factory<AppsflyerDeepLinksManager> {
    private final Provider<DeepLinksRepository> deepLinksRepositoryProvider;

    public AppsflyerDeepLinksManager_Factory(Provider<DeepLinksRepository> provider) {
        this.deepLinksRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public AppsflyerDeepLinksManager get() {
        return newInstance(this.deepLinksRepositoryProvider.get());
    }

    public static AppsflyerDeepLinksManager_Factory create(Provider<DeepLinksRepository> provider) {
        return new AppsflyerDeepLinksManager_Factory(provider);
    }

    public static AppsflyerDeepLinksManager newInstance(DeepLinksRepository deepLinksRepository) {
        return new AppsflyerDeepLinksManager(deepLinksRepository);
    }
}
