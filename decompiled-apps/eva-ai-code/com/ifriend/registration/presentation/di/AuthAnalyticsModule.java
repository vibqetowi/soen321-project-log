package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.AnalyticsSender;
import com.ifriend.analytics.di.AnnalsTrackerAnalytics;
import com.ifriend.analytics.usecase.auth.AuthScreenOpenedAnalytics;
import com.ifriend.base.di.DeviceSharedPreferences;
import com.ifriend.base.di.Feature;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.install.AppInstallStorage;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: AuthAnalyticsModule.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lcom/ifriend/registration/presentation/di/AuthAnalyticsModule;", "", "()V", "provideAuthScreenOpenedAnalytics", "Lcom/ifriend/analytics/usecase/auth/AuthScreenOpenedAnalytics;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "dispatchers", "Lcom/ifriend/domain/CoroutineDispatchers;", "appInstallStorage", "Lcom/ifriend/domain/data/install/AppInstallStorage;", "annalsTrackerAnalyticsSender", "Lcom/ifriend/analytics/AnalyticsSender;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AuthAnalyticsModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final AuthScreenOpenedAnalytics provideAuthScreenOpenedAnalytics(@DeviceSharedPreferences Preferences preferences, CoroutineScope coroutineScope, CoroutineDispatchers dispatchers, AppInstallStorage appInstallStorage, @AnnalsTrackerAnalytics AnalyticsSender annalsTrackerAnalyticsSender) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(appInstallStorage, "appInstallStorage");
        Intrinsics.checkNotNullParameter(annalsTrackerAnalyticsSender, "annalsTrackerAnalyticsSender");
        return new AuthScreenOpenedAnalytics(preferences, coroutineScope, dispatchers, appInstallStorage, annalsTrackerAnalyticsSender);
    }
}
