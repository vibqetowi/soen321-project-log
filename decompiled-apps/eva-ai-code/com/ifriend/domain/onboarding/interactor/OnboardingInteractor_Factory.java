package com.ifriend.domain.onboarding.interactor;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingInteractor_Factory implements Factory<OnboardingInteractor> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<OnboardingAnswersRepository> onboardingAnswersRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public OnboardingInteractor_Factory(Provider<UserRepository> provider, Provider<BotRepository> provider2, Provider<OnboardingAnswersRepository> provider3) {
        this.userRepositoryProvider = provider;
        this.botRepositoryProvider = provider2;
        this.onboardingAnswersRepositoryProvider = provider3;
    }

    @Override // javax.inject.Provider
    public OnboardingInteractor get() {
        return newInstance(this.userRepositoryProvider.get(), this.botRepositoryProvider.get(), this.onboardingAnswersRepositoryProvider.get());
    }

    public static OnboardingInteractor_Factory create(Provider<UserRepository> provider, Provider<BotRepository> provider2, Provider<OnboardingAnswersRepository> provider3) {
        return new OnboardingInteractor_Factory(provider, provider2, provider3);
    }

    public static OnboardingInteractor newInstance(UserRepository userRepository, BotRepository botRepository, OnboardingAnswersRepository onboardingAnswersRepository) {
        return new OnboardingInteractor(userRepository, botRepository, onboardingAnswersRepository);
    }
}
