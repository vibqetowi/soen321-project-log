package com.ifriend.analytics.di;

import com.ifriend.analytics.annalsTracker.AnnalsTrackerApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class AnalyticsModule_ProvideAnnalsTrackerApiFactory implements Factory<AnnalsTrackerApi> {
    private final AnalyticsModule module;
    private final Provider<Retrofit> retrofitProvider;

    public AnalyticsModule_ProvideAnnalsTrackerApiFactory(AnalyticsModule analyticsModule, Provider<Retrofit> provider) {
        this.module = analyticsModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public AnnalsTrackerApi get() {
        return provideAnnalsTrackerApi(this.module, this.retrofitProvider.get());
    }

    public static AnalyticsModule_ProvideAnnalsTrackerApiFactory create(AnalyticsModule analyticsModule, Provider<Retrofit> provider) {
        return new AnalyticsModule_ProvideAnnalsTrackerApiFactory(analyticsModule, provider);
    }

    public static AnnalsTrackerApi provideAnnalsTrackerApi(AnalyticsModule analyticsModule, Retrofit retrofit) {
        return (AnnalsTrackerApi) Preconditions.checkNotNullFromProvides(analyticsModule.provideAnnalsTrackerApi(retrofit));
    }
}
