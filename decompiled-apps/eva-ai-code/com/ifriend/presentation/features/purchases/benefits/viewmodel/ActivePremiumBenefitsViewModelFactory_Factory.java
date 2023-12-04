package com.ifriend.presentation.features.purchases.benefits.viewmodel;

import com.ifriend.chat.domain.profile.user.benefits.GetAllPremiumBenefitsUseCase;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.presentation.features.purchases.common.mapper.SubscriptionBenefitsUiMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ActivePremiumBenefitsViewModelFactory_Factory implements Factory<ActivePremiumBenefitsViewModelFactory> {
    private final Provider<DispatcherProvider> dispatchersProvider;
    private final Provider<GetAllPremiumBenefitsUseCase> getBenefitsUseCaseProvider;
    private final Provider<SubscriptionBenefitsUiMapper> mapperProvider;

    public ActivePremiumBenefitsViewModelFactory_Factory(Provider<GetAllPremiumBenefitsUseCase> provider, Provider<SubscriptionBenefitsUiMapper> provider2, Provider<DispatcherProvider> provider3) {
        this.getBenefitsUseCaseProvider = provider;
        this.mapperProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ActivePremiumBenefitsViewModelFactory get() {
        return newInstance(this.getBenefitsUseCaseProvider.get(), this.mapperProvider.get(), this.dispatchersProvider.get());
    }

    public static ActivePremiumBenefitsViewModelFactory_Factory create(Provider<GetAllPremiumBenefitsUseCase> provider, Provider<SubscriptionBenefitsUiMapper> provider2, Provider<DispatcherProvider> provider3) {
        return new ActivePremiumBenefitsViewModelFactory_Factory(provider, provider2, provider3);
    }

    public static ActivePremiumBenefitsViewModelFactory newInstance(GetAllPremiumBenefitsUseCase getAllPremiumBenefitsUseCase, SubscriptionBenefitsUiMapper subscriptionBenefitsUiMapper, DispatcherProvider dispatcherProvider) {
        return new ActivePremiumBenefitsViewModelFactory(getAllPremiumBenefitsUseCase, subscriptionBenefitsUiMapper, dispatcherProvider);
    }
}
