package com.ifriend.app.di.modules;

import com.ifriend.base.navigation.api.AppRouter;
import com.ifriend.base.navigation.api.CiceroneHolder;
import com.ifriend.base.navigation.api.RouterProvider;
import com.ifriend.base.navigation.api.cicerone.Cicerone;
import com.ifriend.base.navigation.impl.RouterProviderImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
/* compiled from: NavigationModule.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\fH\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/app/di/modules/NavigationModule;", "", "()V", "cicerone", "Lcom/ifriend/base/navigation/api/cicerone/Cicerone;", "Lcom/ifriend/base/navigation/api/AppRouter;", "routerProvider", "Lcom/ifriend/base/navigation/impl/RouterProviderImpl;", "provideAppCicerone", "provideCiceroneHolder", "Lcom/ifriend/base/navigation/api/CiceroneHolder;", "provideRouterProvider", "Lcom/ifriend/base/navigation/api/RouterProvider;", "app_ifriendGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Module
/* loaded from: classes6.dex */
public final class NavigationModule {
    private final Cicerone<AppRouter> cicerone;
    private final RouterProviderImpl routerProvider;

    public NavigationModule() {
        Cicerone<AppRouter> create = Cicerone.Companion.create(new AppRouter());
        this.cicerone = create;
        this.routerProvider = new RouterProviderImpl(create);
    }

    @Provides
    @Singleton
    public final RouterProvider provideRouterProvider() {
        return this.routerProvider;
    }

    @Provides
    @Singleton
    public final CiceroneHolder provideCiceroneHolder() {
        return this.routerProvider;
    }

    @Provides
    @Singleton
    public final Cicerone<AppRouter> provideAppCicerone() {
        return this.cicerone;
    }
}
