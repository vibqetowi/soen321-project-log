package com.ifriend.presentation.analytics;

import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatAnalyticsInteractor_Factory implements Factory<ChatAnalyticsInteractor> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;

    public ChatAnalyticsInteractor_Factory(Provider<AppIdentityConverter> provider) {
        this.appIdentityConverterProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatAnalyticsInteractor get() {
        return newInstance(this.appIdentityConverterProvider.get());
    }

    public static ChatAnalyticsInteractor_Factory create(Provider<AppIdentityConverter> provider) {
        return new ChatAnalyticsInteractor_Factory(provider);
    }

    public static ChatAnalyticsInteractor newInstance(AppIdentityConverter appIdentityConverter) {
        return new ChatAnalyticsInteractor(appIdentityConverter);
    }
}
