package com.ifriend.app.di.modules;

import com.ifriend.base.navigation.api.RouterProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class NavigationModule_ProvideRouterProviderFactory implements Factory<RouterProvider> {
    private final NavigationModule module;

    public NavigationModule_ProvideRouterProviderFactory(NavigationModule navigationModule) {
        this.module = navigationModule;
    }

    @Override // javax.inject.Provider
    public RouterProvider get() {
        return provideRouterProvider(this.module);
    }

    public static NavigationModule_ProvideRouterProviderFactory create(NavigationModule navigationModule) {
        return new NavigationModule_ProvideRouterProviderFactory(navigationModule);
    }

    public static RouterProvider provideRouterProvider(NavigationModule navigationModule) {
        return (RouterProvider) Preconditions.checkNotNullFromProvides(navigationModule.provideRouterProvider());
    }
}
