package com.ifriend.presentation.features.app.delegates;

import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.onboarding.OnboardingAnswersRepository;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlideUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class StartChatFlowDelegateImpl_Factory implements Factory<StartChatFlowDelegateImpl> {
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<InfoOnboardingSlideUseCase> infoOnboardingSlideUseCaseProvider;
    private final Provider<OnboardingAnswersRepository> onboardingAnswersRepositoryProvider;

    public StartChatFlowDelegateImpl_Factory(Provider<ChatsInfoInteractor> provider, Provider<InfoOnboardingSlideUseCase> provider2, Provider<ChatsInfoConfigurationRepository> provider3, Provider<OnboardingAnswersRepository> provider4, Provider<ChatsConfigurationInteractor> provider5) {
        this.chatsInfoInteractorProvider = provider;
        this.infoOnboardingSlideUseCaseProvider = provider2;
        this.chatsInfoConfigurationRepositoryProvider = provider3;
        this.onboardingAnswersRepositoryProvider = provider4;
        this.chatsConfigurationInteractorProvider = provider5;
    }

    @Override // javax.inject.Provider
    public StartChatFlowDelegateImpl get() {
        return newInstance(this.chatsInfoInteractorProvider.get(), this.infoOnboardingSlideUseCaseProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.onboardingAnswersRepositoryProvider.get(), this.chatsConfigurationInteractorProvider.get());
    }

    public static StartChatFlowDelegateImpl_Factory create(Provider<ChatsInfoInteractor> provider, Provider<InfoOnboardingSlideUseCase> provider2, Provider<ChatsInfoConfigurationRepository> provider3, Provider<OnboardingAnswersRepository> provider4, Provider<ChatsConfigurationInteractor> provider5) {
        return new StartChatFlowDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static StartChatFlowDelegateImpl newInstance(ChatsInfoInteractor chatsInfoInteractor, InfoOnboardingSlideUseCase infoOnboardingSlideUseCase, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, OnboardingAnswersRepository onboardingAnswersRepository, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        return new StartChatFlowDelegateImpl(chatsInfoInteractor, infoOnboardingSlideUseCase, chatsInfoConfigurationRepository, onboardingAnswersRepository, chatsConfigurationInteractor);
    }
}
