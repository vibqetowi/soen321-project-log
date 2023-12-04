package com.ifriend.data.networking.api.onboarding;

import com.ifriend.core.local.api.AuthLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingApiDelegate_Factory implements Factory<OnboardingApiDelegate> {
    private final Provider<OnboardingApi> apiProvider;
    private final Provider<AuthLocalDataSource> authLocalDataSourceProvider;

    public OnboardingApiDelegate_Factory(Provider<OnboardingApi> provider, Provider<AuthLocalDataSource> provider2) {
        this.apiProvider = provider;
        this.authLocalDataSourceProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OnboardingApiDelegate get() {
        return newInstance(this.apiProvider.get(), this.authLocalDataSourceProvider.get());
    }

    public static OnboardingApiDelegate_Factory create(Provider<OnboardingApi> provider, Provider<AuthLocalDataSource> provider2) {
        return new OnboardingApiDelegate_Factory(provider, provider2);
    }

    public static OnboardingApiDelegate newInstance(OnboardingApi onboardingApi, AuthLocalDataSource authLocalDataSource) {
        return new OnboardingApiDelegate(onboardingApi, authLocalDataSource);
    }
}
