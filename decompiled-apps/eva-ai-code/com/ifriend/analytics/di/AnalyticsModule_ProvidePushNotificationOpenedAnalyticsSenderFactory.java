package com.ifriend.analytics.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedTrackerApi;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory implements Factory<AnalyticsSender> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<Logger> loggerProvider;
    private final AnalyticsModule module;
    private final Provider<PushNotificationOpenedTrackerApi> pushNotificationOpenedTrackerApiProvider;

    public AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory(AnalyticsModule analyticsModule, Provider<PushNotificationOpenedTrackerApi> provider, Provider<AuthDataProvider> provider2, Provider<CoroutineScope> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        this.module = analyticsModule;
        this.pushNotificationOpenedTrackerApiProvider = provider;
        this.authDataProvider = provider2;
        this.coroutineScopeProvider = provider3;
        this.coroutineDispatchersProvider = provider4;
        this.loggerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AnalyticsSender get() {
        return providePushNotificationOpenedAnalyticsSender(this.module, this.pushNotificationOpenedTrackerApiProvider.get(), this.authDataProvider.get(), this.coroutineScopeProvider.get(), this.coroutineDispatchersProvider.get(), this.loggerProvider.get());
    }

    public static AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory create(AnalyticsModule analyticsModule, Provider<PushNotificationOpenedTrackerApi> provider, Provider<AuthDataProvider> provider2, Provider<CoroutineScope> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        return new AnalyticsModule_ProvidePushNotificationOpenedAnalyticsSenderFactory(analyticsModule, provider, provider2, provider3, provider4, provider5);
    }

    public static AnalyticsSender providePushNotificationOpenedAnalyticsSender(AnalyticsModule analyticsModule, PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi, AuthDataProvider authDataProvider, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        return (AnalyticsSender) Preconditions.checkNotNullFromProvides(analyticsModule.providePushNotificationOpenedAnalyticsSender(pushNotificationOpenedTrackerApi, authDataProvider, coroutineScope, coroutineDispatchers, logger));
    }
}
