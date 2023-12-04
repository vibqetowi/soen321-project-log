package com.ifriend.registration.presentation.di;

import com.ifriend.analytics.usecase.appOpen.AnalyticsAppOpenUseCase;
import com.ifriend.analytics.usecase.appOpen.AnalyticsFirstAppOpenUseCase;
import com.ifriend.base.di.Feature;
import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.domain.data.Preferences;
import com.ifriend.registration.domain.applicationState.ApplicationState;
import dagger.Module;
import dagger.Provides;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppStateModule.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ifriend/registration/presentation/di/AppStateModule;", "", "()V", "provideApplicationState", "Lcom/ifriend/registration/domain/applicationState/ApplicationState;", "analyticsAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsAppOpenUseCase;", "analyticsFirstAppOpenUseCase", "Lcom/ifriend/analytics/usecase/appOpen/AnalyticsFirstAppOpenUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class AppStateModule {
    public static final int $stable = 0;

    @Provides
    @Feature
    public final ApplicationState provideApplicationState(AnalyticsAppOpenUseCase analyticsAppOpenUseCase, AnalyticsFirstAppOpenUseCase analyticsFirstAppOpenUseCase, @UserSessionSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(analyticsAppOpenUseCase, "analyticsAppOpenUseCase");
        Intrinsics.checkNotNullParameter(analyticsFirstAppOpenUseCase, "analyticsFirstAppOpenUseCase");
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new ApplicationState(analyticsAppOpenUseCase, analyticsFirstAppOpenUseCase, preferences);
    }
}
