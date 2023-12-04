package com.ifriend.analytics.di;

import android.content.Context;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ifriend.analytics.AnalyticsEngine;
import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.AppsFlyerAnalyticsSender;
import com.ifriend.analytics.FirebaseAnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerAnalyticsSender;
import com.ifriend.analytics.annalsTracker.AnnalsTrackerApi;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedAnalyticsSender;
import com.ifriend.analytics.pushNotificationOpenedTraker.PushNotificationOpenedTrackerApi;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import retrofit2.Retrofit;
/* compiled from: AnalyticsModule.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H\u0007J0\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001aH\u0007J\b\u0010\u001b\u001a\u00020\u0006H\u0007J0\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0017H\u0007¨\u0006 "}, d2 = {"Lcom/ifriend/analytics/di/AnalyticsModule;", "", "()V", "analyticsEngine", "Lcom/ifriend/analytics/AnalyticsEngine;", RemoteConfigComponent.DEFAULT_NAMESPACE, "Lcom/ifriend/analytics/AnalyticsSender;", "appsFlyer", "annalsTracker", "pushNotificationOpenedAnalyticsSender", "provideAnnalsTrackerAnalyticsSender", "annalsTrackerApi", "Lcom/ifriend/analytics/annalsTracker/AnnalsTrackerApi;", "authDataProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "coroutineDispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "logger", "Lcom/ifriend/common_utils/Logger;", "provideAnnalsTrackerApi", "retrofit", "Lretrofit2/Retrofit;", "provideAppsFlyerAnalyticsSender", "context", "Landroid/content/Context;", "provideFirebaseAnalyticsSender", "providePushNotificationOpenedAnalyticsSender", "pushNotificationOpenedTrackerApi", "Lcom/ifriend/analytics/pushNotificationOpenedTraker/PushNotificationOpenedTrackerApi;", "providePushNotificationOpenedTrackerApi", "analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AnalyticsModule {
    @Provides
    @Singleton
    public final AnalyticsEngine analyticsEngine(@FirebaseAnalytics AnalyticsSender firebase, @AppsFlyerAnalytics AnalyticsSender appsFlyer, @AnnalsTrackerAnalytics AnalyticsSender annalsTracker, @PushNotificationOpenedAnalytics AnalyticsSender pushNotificationOpenedAnalyticsSender) {
        Intrinsics.checkNotNullParameter(firebase, "firebase");
        Intrinsics.checkNotNullParameter(appsFlyer, "appsFlyer");
        Intrinsics.checkNotNullParameter(annalsTracker, "annalsTracker");
        Intrinsics.checkNotNullParameter(pushNotificationOpenedAnalyticsSender, "pushNotificationOpenedAnalyticsSender");
        return new AnalyticsEngine(annalsTracker, appsFlyer, firebase, pushNotificationOpenedAnalyticsSender);
    }

    @FirebaseAnalytics
    @Provides
    @Singleton
    public final AnalyticsSender provideFirebaseAnalyticsSender() {
        return new FirebaseAnalyticsSender();
    }

    @Provides
    @Singleton
    @AppsFlyerAnalytics
    public final AnalyticsSender provideAppsFlyerAnalyticsSender(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AppsFlyerAnalyticsSender(context);
    }

    @Provides
    @Singleton
    public final PushNotificationOpenedTrackerApi providePushNotificationOpenedTrackerApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(PushNotificationOpenedTrackerApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (PushNotificationOpenedTrackerApi) create;
    }

    @Provides
    @Singleton
    @PushNotificationOpenedAnalytics
    public final AnalyticsSender providePushNotificationOpenedAnalyticsSender(PushNotificationOpenedTrackerApi pushNotificationOpenedTrackerApi, AuthDataProvider authDataProvider, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(pushNotificationOpenedTrackerApi, "pushNotificationOpenedTrackerApi");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new PushNotificationOpenedAnalyticsSender(authDataProvider, pushNotificationOpenedTrackerApi, coroutineScope, coroutineDispatchers, logger);
    }

    @Provides
    @Singleton
    public final AnnalsTrackerApi provideAnnalsTrackerApi(Retrofit retrofit) {
        Intrinsics.checkNotNullParameter(retrofit, "retrofit");
        Object create = retrofit.create(AnnalsTrackerApi.class);
        Intrinsics.checkNotNullExpressionValue(create, "create(...)");
        return (AnnalsTrackerApi) create;
    }

    @AnnalsTrackerAnalytics
    @Provides
    @Singleton
    public final AnalyticsSender provideAnnalsTrackerAnalyticsSender(AnnalsTrackerApi annalsTrackerApi, AuthDataProvider authDataProvider, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        Intrinsics.checkNotNullParameter(annalsTrackerApi, "annalsTrackerApi");
        Intrinsics.checkNotNullParameter(authDataProvider, "authDataProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        Intrinsics.checkNotNullParameter(logger, "logger");
        return new AnnalsTrackerAnalyticsSender(authDataProvider, annalsTrackerApi, coroutineScope, coroutineDispatchers, logger);
    }
}
