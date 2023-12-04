package com.ifriend.presentation.features.home.analytics;

import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeAnalyticsInteractor_Factory implements Factory<HomeAnalyticsInteractor> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;

    public HomeAnalyticsInteractor_Factory(Provider<AppIdentityConverter> provider) {
        this.appIdentityConverterProvider = provider;
    }

    @Override // javax.inject.Provider
    public HomeAnalyticsInteractor get() {
        return newInstance(this.appIdentityConverterProvider.get());
    }

    public static HomeAnalyticsInteractor_Factory create(Provider<AppIdentityConverter> provider) {
        return new HomeAnalyticsInteractor_Factory(provider);
    }

    public static HomeAnalyticsInteractor newInstance(AppIdentityConverter appIdentityConverter) {
        return new HomeAnalyticsInteractor(appIdentityConverter);
    }
}
