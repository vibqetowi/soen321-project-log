package com.ifriend.presentation.features.app.delegates;

import com.ifriend.analytics.api.logic.AnalyticsInteractor;
import com.ifriend.domain.logic.chat.refresh.ChatsRefreshConfigurationUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppChatEventsDelegateImpl_Factory implements Factory<AppChatEventsDelegateImpl> {
    private final Provider<AnalyticsInteractor> analyticsInteractorProvider;
    private final Provider<ChatsRefreshConfigurationUseCase> refreshConfigurationUseCaseProvider;

    public AppChatEventsDelegateImpl_Factory(Provider<ChatsRefreshConfigurationUseCase> provider, Provider<AnalyticsInteractor> provider2) {
        this.refreshConfigurationUseCaseProvider = provider;
        this.analyticsInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AppChatEventsDelegateImpl get() {
        return newInstance(this.refreshConfigurationUseCaseProvider.get(), this.analyticsInteractorProvider.get());
    }

    public static AppChatEventsDelegateImpl_Factory create(Provider<ChatsRefreshConfigurationUseCase> provider, Provider<AnalyticsInteractor> provider2) {
        return new AppChatEventsDelegateImpl_Factory(provider, provider2);
    }

    public static AppChatEventsDelegateImpl newInstance(ChatsRefreshConfigurationUseCase chatsRefreshConfigurationUseCase, AnalyticsInteractor analyticsInteractor) {
        return new AppChatEventsDelegateImpl(chatsRefreshConfigurationUseCase, analyticsInteractor);
    }
}
