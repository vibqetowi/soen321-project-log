package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.offers.UserOffersRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingSubmittedDelegateImpl_Factory implements Factory<OnboardingSubmittedDelegateImpl> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<UserOffersRepository> userOffersRepositoryProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;

    public OnboardingSubmittedDelegateImpl_Factory(Provider<AppEventsEmitter> provider, Provider<UserProfileRepository> provider2, Provider<UserOffersRepository> provider3) {
        this.appEventsEmitterProvider = provider;
        this.userProfileRepositoryProvider = provider2;
        this.userOffersRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public OnboardingSubmittedDelegateImpl get() {
        return newInstance(this.appEventsEmitterProvider.get(), this.userProfileRepositoryProvider.get(), this.userOffersRepositoryProvider.get());
    }

    public static OnboardingSubmittedDelegateImpl_Factory create(Provider<AppEventsEmitter> provider, Provider<UserProfileRepository> provider2, Provider<UserOffersRepository> provider3) {
        return new OnboardingSubmittedDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static OnboardingSubmittedDelegateImpl newInstance(AppEventsEmitter appEventsEmitter, UserProfileRepository userProfileRepository, UserOffersRepository userOffersRepository) {
        return new OnboardingSubmittedDelegateImpl(appEventsEmitter, userProfileRepository, userOffersRepository);
    }
}
