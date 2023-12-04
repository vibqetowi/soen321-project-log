package com.ifriend.analytics.impl.di;

import android.content.Context;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory implements Factory<AnalyticsRepository> {
    private final Provider<Context> contextProvider;

    public CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnalyticsRepository get() {
        return provideAppsFlyerAnalyticsRepository(this.contextProvider.get());
    }

    public static CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory create(Provider<Context> provider) {
        return new CoreAnalyticsModule_Companion_ProvideAppsFlyerAnalyticsRepositoryFactory(provider);
    }

    public static AnalyticsRepository provideAppsFlyerAnalyticsRepository(Context context) {
        return (AnalyticsRepository) Preconditions.checkNotNullFromProvides(CoreAnalyticsModule.Companion.provideAppsFlyerAnalyticsRepository(context));
    }
}
