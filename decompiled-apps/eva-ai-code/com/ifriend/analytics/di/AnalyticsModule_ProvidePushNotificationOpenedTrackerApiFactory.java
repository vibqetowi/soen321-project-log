package com.ifriend.analytics.di;

import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedTrackerApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;
/* loaded from: classes6.dex */
public final class AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory implements Factory<PushNotificationOpenedTrackerApi> {
    private final AnalyticsModule module;
    private final Provider<Retrofit> retrofitProvider;

    public AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory(AnalyticsModule analyticsModule, Provider<Retrofit> provider) {
        this.module = analyticsModule;
        this.retrofitProvider = provider;
    }

    @Override // javax.inject.Provider
    public PushNotificationOpenedTrackerApi get() {
        return providePushNotificationOpenedTrackerApi(this.module, this.retrofitProvider.get());
    }

    public static AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory create(AnalyticsModule analyticsModule, Provider<Retrofit> provider) {
        return new AnalyticsModule_ProvidePushNotificationOpenedTrackerApiFactory(analyticsModule, provider);
    }

    public static PushNotificationOpenedTrackerApi providePushNotificationOpenedTrackerApi(AnalyticsModule analyticsModule, Retrofit retrofit) {
        return (PushNotificationOpenedTrackerApi) Preconditions.checkNotNullFromProvides(analyticsModule.providePushNotificationOpenedTrackerApi(retrofit));
    }
}
