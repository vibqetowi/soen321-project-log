package com.ifriend.app.di.modules;

import com.ifriend.base.navigation.api.CiceroneHolder;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
/* loaded from: classes6.dex */
public final class NavigationModule_ProvideCiceroneHolderFactory implements Factory<CiceroneHolder> {
    private final NavigationModule module;

    public NavigationModule_ProvideCiceroneHolderFactory(NavigationModule navigationModule) {
        this.module = navigationModule;
    }

    @Override // javax.inject.Provider
    public CiceroneHolder get() {
        return provideCiceroneHolder(this.module);
    }

    public static NavigationModule_ProvideCiceroneHolderFactory create(NavigationModule navigationModule) {
        return new NavigationModule_ProvideCiceroneHolderFactory(navigationModule);
    }

    public static CiceroneHolder provideCiceroneHolder(NavigationModule navigationModule) {
        return (CiceroneHolder) Preconditions.checkNotNullFromProvides(navigationModule.provideCiceroneHolder());
    }
}
