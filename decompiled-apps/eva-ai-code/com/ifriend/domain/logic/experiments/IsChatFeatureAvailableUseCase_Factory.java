package com.ifriend.domain.logic.experiments;

import com.ifriend.domain.data.experiments.FeatureToggleRepository;
import com.ifriend.domain.logic.experiments.checker.ChatIdConditionsCheckerUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class IsChatFeatureAvailableUseCase_Factory implements Factory<IsChatFeatureAvailableUseCase> {
    private final Provider<ChatIdConditionsCheckerUseCase> chatIdConditionsCheckerUseCaseProvider;
    private final Provider<FeatureToggleRepository> featureToggleRepositoryProvider;

    public IsChatFeatureAvailableUseCase_Factory(Provider<FeatureToggleRepository> provider, Provider<ChatIdConditionsCheckerUseCase> provider2) {
        this.featureToggleRepositoryProvider = provider;
        this.chatIdConditionsCheckerUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider
    public IsChatFeatureAvailableUseCase get() {
        return newInstance(this.featureToggleRepositoryProvider.get(), this.chatIdConditionsCheckerUseCaseProvider.get());
    }

    public static IsChatFeatureAvailableUseCase_Factory create(Provider<FeatureToggleRepository> provider, Provider<ChatIdConditionsCheckerUseCase> provider2) {
        return new IsChatFeatureAvailableUseCase_Factory(provider, provider2);
    }

    public static IsChatFeatureAvailableUseCase newInstance(FeatureToggleRepository featureToggleRepository, ChatIdConditionsCheckerUseCase chatIdConditionsCheckerUseCase) {
        return new IsChatFeatureAvailableUseCase(featureToggleRepository, chatIdConditionsCheckerUseCase);
    }
}
