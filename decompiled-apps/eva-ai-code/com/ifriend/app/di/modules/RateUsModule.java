package com.ifriend.app.di.modules;

import com.ifriend.base.di.UserSessionSharedPreferences;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.rateUs.OnUserRatedAppUseCase;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.domain.rateUs.RateUsStateStorage;
import com.ifriend.domain.rateUs.RateUsStateStorageImpl;
import com.ifriend.domain.rateUs.ShowRateUsUseCase;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: RateUsModule.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0012\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bH\u0007¨\u0006\u0013"}, d2 = {"Lcom/ifriend/app/di/modules/RateUsModule;", "", "()V", "provideOnUserRateUsUseCase", "Lcom/ifriend/domain/rateUs/OnUserRatedAppUseCase;", "preferences", "Lcom/ifriend/domain/data/Preferences;", "provideRateAppShowingPlanner", "Lcom/ifriend/domain/rateUs/RateAppShowingPlanner;", "handler", "Lcom/ifriend/internal_notifications/handler/InternalNotificationHandler;", "router", "Lcom/ifriend/base/navigation/api/RouterProvider;", "provideRateUsStateStorage", "Lcom/ifriend/domain/rateUs/RateUsStateStorage;", "provideShowRateUsUseCase", "Lcom/ifriend/domain/rateUs/ShowRateUsUseCase;", "rateUsStateStorage", "rateAppShowingPlanner", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class RateUsModule {
    @Provides
    @Singleton
    public final RateUsStateStorage provideRateUsStateStorage(@UserSessionSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new RateUsStateStorageImpl(preferences);
    }

    @Provides
    @Singleton
    public final ShowRateUsUseCase provideShowRateUsUseCase(RateUsStateStorage rateUsStateStorage, RateAppShowingPlanner rateAppShowingPlanner) {
        Intrinsics.checkNotNullParameter(rateUsStateStorage, "rateUsStateStorage");
        Intrinsics.checkNotNullParameter(rateAppShowingPlanner, "rateAppShowingPlanner");
        return new ShowRateUsUseCase(rateUsStateStorage, rateAppShowingPlanner);
    }

    @Provides
    @Singleton
    public final RateAppShowingPlanner provideRateAppShowingPlanner(InternalNotificationHandler handler, RouterProvider router) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(router, "router");
        return new RateAppShowingPlanner(handler, router);
    }

    @Provides
    @Singleton
    public final OnUserRatedAppUseCase provideOnUserRateUsUseCase(@UserSessionSharedPreferences Preferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        return new OnUserRatedAppUseCase(preferences);
    }
}
