package com.ifriend.presentation.features.chat.intro.analytics;

import com.ifriend.core.tools.api.AppIdentityConverter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatIntroAnalyticsInteractor_Factory implements Factory<ChatIntroAnalyticsInteractor> {
    private final Provider<AppIdentityConverter> appIdentityConverterProvider;

    public ChatIntroAnalyticsInteractor_Factory(Provider<AppIdentityConverter> provider) {
        this.appIdentityConverterProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatIntroAnalyticsInteractor get() {
        return newInstance(this.appIdentityConverterProvider.get());
    }

    public static ChatIntroAnalyticsInteractor_Factory create(Provider<AppIdentityConverter> provider) {
        return new ChatIntroAnalyticsInteractor_Factory(provider);
    }

    public static ChatIntroAnalyticsInteractor newInstance(AppIdentityConverter appIdentityConverter) {
        return new ChatIntroAnalyticsInteractor(appIdentityConverter);
    }
}
