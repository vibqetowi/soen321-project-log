package com.ifriend.data.memorycached.onboarding;

import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.networking.api.onboarding.OnboardingApi;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingChatConfigsMemoryCachedSourceImpl_Factory implements Factory<OnboardingChatConfigsMemoryCachedSourceImpl> {
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<OnboardingApi> onboardingApiProvider;

    public OnboardingChatConfigsMemoryCachedSourceImpl_Factory(Provider<DispatcherProvider> provider, Provider<CoreExecuteCatching> provider2, Provider<OnboardingApi> provider3, Provider<AuthLocalDataSource> provider4) {
        this.dispatcherProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
        this.onboardingApiProvider = provider3;
        this.authLocalDataSourceProvider = provider4;
    }

    @Override // javax.inject.Provider
    public OnboardingChatConfigsMemoryCachedSourceImpl get() {
        return newInstance(this.dispatcherProvider.get(), this.coreExecuteCatchingProvider.get(), this.onboardingApiProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static OnboardingChatConfigsMemoryCachedSourceImpl_Factory create(Provider<DispatcherProvider> provider, Provider<CoreExecuteCatching> provider2, Provider<OnboardingApi> provider3, Provider<AuthLocalDataSource> provider4) {
        return new OnboardingChatConfigsMemoryCachedSourceImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static OnboardingChatConfigsMemoryCachedSourceImpl newInstance(DispatcherProvider dispatcherProvider, CoreExecuteCatching coreExecuteCatching, OnboardingApi onboardingApi, AuthLocalDataSource authLocalDataSource) {
        return new OnboardingChatConfigsMemoryCachedSourceImpl(dispatcherProvider, coreExecuteCatching, onboardingApi, authLocalDataSource);
    }
}
