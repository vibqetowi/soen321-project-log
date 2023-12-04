package com.ifriend.app.di.modules;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class NavigationModule_ProvideAppCiceroneFactory implements Factory<Cicerone<AppRouter>> {
    private final NavigationModule module;

    public NavigationModule_ProvideAppCiceroneFactory(NavigationModule navigationModule) {
        this.module = navigationModule;
    }

    @Override // javax.inject.Provider
    public Cicerone<AppRouter> get() {
        return provideAppCicerone(this.module);
    }

    public static NavigationModule_ProvideAppCiceroneFactory create(NavigationModule navigationModule) {
        return new NavigationModule_ProvideAppCiceroneFactory(navigationModule);
    }

    public static Cicerone<AppRouter> provideAppCicerone(NavigationModule navigationModule) {
        return (Cicerone) Preconditions.checkNotNullFromProvides(navigationModule.provideAppCicerone());
    }
}
