package com.ifriend.domain.logic.onboarding;

import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UpdateOnboardingUseCase_Factory implements Factory<UpdateOnboardingUseCase> {
    private final Provider<OnboardingInteractor> onboardingInteractorProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;

    public UpdateOnboardingUseCase_Factory(Provider<UserProfileRepository> provider, Provider<OnboardingInteractor> provider2) {
        this.userProfileRepositoryProvider = provider;
        this.onboardingInteractorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public UpdateOnboardingUseCase get() {
        return newInstance(this.userProfileRepositoryProvider.get(), this.onboardingInteractorProvider.get());
    }

    public static UpdateOnboardingUseCase_Factory create(Provider<UserProfileRepository> provider, Provider<OnboardingInteractor> provider2) {
        return new UpdateOnboardingUseCase_Factory(provider, provider2);
    }

    public static UpdateOnboardingUseCase newInstance(UserProfileRepository userProfileRepository, OnboardingInteractor onboardingInteractor) {
        return new UpdateOnboardingUseCase(userProfileRepository, onboardingInteractor);
    }
}
