package com.ifriend.data.initialLoaders;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.config.AppConfigRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppConfigLoader_Factory implements Factory<AppConfigLoader> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<AppConfigRepository> appConfigRepositoryProvider;
    private final Provider<TagsProvider> tagsProvider;

    public AppConfigLoader_Factory(Provider<AppConfigRepository> provider, Provider<TagsProvider> provider2, Provider<AnalyticsInteractor> provider3) {
        this.appConfigRepositoryProvider = provider;
        this.tagsProvider = provider2;
        this.analyticsInteractorProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AppConfigLoader get() {
        return newInstance(this.appConfigRepositoryProvider.get(), this.tagsProvider.get(), this.analyticsInteractorProvider.get());
    }

    public static AppConfigLoader_Factory create(Provider<AppConfigRepository> provider, Provider<TagsProvider> provider2, Provider<AnalyticsInteractor> provider3) {
        return new AppConfigLoader_Factory(provider, provider2, provider3);
    }

    public static AppConfigLoader newInstance(AppConfigRepository appConfigRepository, TagsProvider tagsProvider, AnalyticsInteractor analyticsInteractor) {
        return new AppConfigLoader(appConfigRepository, tagsProvider, analyticsInteractor);
    }
}
