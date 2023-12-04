package com.ifriend.app.di.modules;

import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.domain.rateUs.RateAppShowingPlanner;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class RateUsModule_ProvideRateAppShowingPlannerFactory implements Factory<RateAppShowingPlanner> {
    private final Provider<InternalNotificationHandler> handlerProvider;
    private final RateUsModule module;
    private final Provider<RouterProvider> routerProvider;

    public RateUsModule_ProvideRateAppShowingPlannerFactory(RateUsModule rateUsModule, Provider<InternalNotificationHandler> provider, Provider<RouterProvider> provider2) {
        this.module = rateUsModule;
        this.handlerProvider = provider;
        this.routerProvider = provider2;
    }

    @Override // javax.inject.Provider
    public RateAppShowingPlanner get() {
        return provideRateAppShowingPlanner(this.module, this.handlerProvider.get(), this.routerProvider.get());
    }

    public static RateUsModule_ProvideRateAppShowingPlannerFactory create(RateUsModule rateUsModule, Provider<InternalNotificationHandler> provider, Provider<RouterProvider> provider2) {
        return new RateUsModule_ProvideRateAppShowingPlannerFactory(rateUsModule, provider, provider2);
    }

    public static RateAppShowingPlanner provideRateAppShowingPlanner(RateUsModule rateUsModule, InternalNotificationHandler internalNotificationHandler, RouterProvider routerProvider) {
        return (RateAppShowingPlanner) Preconditions.checkNotNullFromProvides(rateUsModule.provideRateAppShowingPlanner(internalNotificationHandler, routerProvider));
    }
}
