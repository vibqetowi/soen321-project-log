package com.ifriend.analytics.impl.di;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.analytics.impl.data.repository.AnnalsAnalyticsRepository;
import com.ifriend.analytics.impl.data.repository.AppsFlyerRepository;
import com.ifriend.analytics.impl.data.repository.FirebaseAnalyticsRepository;
import com.ifriend.analytics.impl.domain.logic.AnalyticsInteractorImpl;
import com.ifriend.analytics.impl.domain.repository.AnalyticsRepository;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.services.AnnalsApiService;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.Reusable;
import dagger.multibindings.IntoSet;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CoreAnalyticsModule.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0007"}, d2 = {"Lcom/ifriend/analytics/impl/di/CoreAnalyticsModule;", "", "provideAnalyticsInteractor", "Lcom/ifriend/analytics/api/logic/AnalyticsInteractor;", "repo", "Lcom/ifriend/analytics/impl/domain/logic/AnalyticsInteractorImpl;", "Companion", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public interface CoreAnalyticsModule {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Reusable
    @Binds
    AnalyticsInteractor provideAnalyticsInteractor(AnalyticsInteractorImpl analyticsInteractorImpl);

    /* compiled from: CoreAnalyticsModule.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0011"}, d2 = {"Lcom/ifriend/analytics/impl/di/CoreAnalyticsModule$Companion;", "", "()V", "provideAnnalsAnalyticsRepository", "Lcom/ifriend/analytics/impl/domain/repository/AnalyticsRepository;", "dispatcherProvider", "Lcom/ifriend/core/tools/api/DispatcherProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "annalsApi", "Lcom/ifriend/core/remote/services/AnnalsApiService;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "provideAppsFlyerAnalyticsRepository", "context", "Landroid/content/Context;", "provideFirebaseAnalyticsRepository", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Provides
        @Singleton
        @IntoSet
        public final AnalyticsRepository provideFirebaseAnalyticsRepository(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
            Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
            FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseCrashlytics, "getInstance(...)");
            return new FirebaseAnalyticsRepository(firebaseAnalytics, firebaseCrashlytics, false);
        }

        @Provides
        @Singleton
        @IntoSet
        public final AnalyticsRepository provideAnnalsAnalyticsRepository(DispatcherProvider dispatcherProvider, CoroutineScope coroutineScope, AnnalsApiService annalsApi, AuthLocalDataSource authLocalDataSource) {
            Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
            Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
            Intrinsics.checkNotNullParameter(annalsApi, "annalsApi");
            Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
            return new AnnalsAnalyticsRepository(dispatcherProvider, coroutineScope, annalsApi, authLocalDataSource, false);
        }

        @Provides
        @Singleton
        @IntoSet
        public final AnalyticsRepository provideAppsFlyerAnalyticsRepository(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
            Intrinsics.checkNotNullExpressionValue(appsFlyerLib, "getInstance(...)");
            return new AppsFlyerRepository(context, appsFlyerLib, false);
        }
    }
}
