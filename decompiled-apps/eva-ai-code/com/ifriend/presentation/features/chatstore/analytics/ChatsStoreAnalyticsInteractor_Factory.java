package com.ifriend.presentation.features.chatstore.analytics;

import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsStoreAnalyticsInteractor_Factory implements Factory<ChatsStoreAnalyticsInteractor> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;

    public ChatsStoreAnalyticsInteractor_Factory(Provider<AppIdentityConverter> provider) {
        this.appIdentityConverterProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatsStoreAnalyticsInteractor get() {
        return newInstance(this.appIdentityConverterProvider.get());
    }

    public static ChatsStoreAnalyticsInteractor_Factory create(Provider<AppIdentityConverter> provider) {
        return new ChatsStoreAnalyticsInteractor_Factory(provider);
    }

    public static ChatsStoreAnalyticsInteractor newInstance(AppIdentityConverter appIdentityConverter) {
        return new ChatsStoreAnalyticsInteractor(appIdentityConverter);
    }
}
