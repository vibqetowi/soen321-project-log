package com.ifriend.analytics.impl.data.repository;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppsFlyerRepository_Factory implements Factory<AppsFlyerRepository> {
    private final Provider<AppsFlyerLib> appsFlyerProvider;
    private final Provider<Context> contextProvider;
    private final Provider<Boolean> isDebuggableProvider;

    public AppsFlyerRepository_Factory(Provider<Context> provider, Provider<AppsFlyerLib> provider2, Provider<Boolean> provider3) {
        this.contextProvider = provider;
        this.appsFlyerProvider = provider2;
        this.isDebuggableProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AppsFlyerRepository get() {
        return newInstance(this.contextProvider.get(), this.appsFlyerProvider.get(), this.isDebuggableProvider.get().booleanValue());
    }

    public static AppsFlyerRepository_Factory create(Provider<Context> provider, Provider<AppsFlyerLib> provider2, Provider<Boolean> provider3) {
        return new AppsFlyerRepository_Factory(provider, provider2, provider3);
    }

    public static AppsFlyerRepository newInstance(Context context, AppsFlyerLib appsFlyerLib, boolean z) {
        return new AppsFlyerRepository(context, appsFlyerLib, z);
    }
}
