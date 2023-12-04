package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.onboarding.OnboardingApiDelegate;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory implements Factory<OnboardingAnswersRepository> {
    private final Provider<OnboardingApiDelegate> apiDelegateProvider;

    public DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory(Provider<OnboardingApiDelegate> provider) {
        this.apiDelegateProvider = provider;
    }

    @Override // javax.inject.Provider
    public OnboardingAnswersRepository get() {
        return provideOnboardingAnswersRepository(this.apiDelegateProvider.get());
    }

    public static DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory create(Provider<OnboardingApiDelegate> provider) {
        return new DataModule_Companion_ProvideOnboardingAnswersRepositoryFactory(provider);
    }

    public static OnboardingAnswersRepository provideOnboardingAnswersRepository(OnboardingApiDelegate onboardingApiDelegate) {
        return (OnboardingAnswersRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideOnboardingAnswersRepository(onboardingApiDelegate));
    }
}
