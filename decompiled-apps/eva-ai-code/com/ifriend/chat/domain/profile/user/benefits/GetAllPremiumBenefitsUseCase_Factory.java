package com.ifriend.chat.domain.profile.user.benefits;

import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.benefits.PremiumBenefitsRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetAllPremiumBenefitsUseCase_Factory implements Factory<GetAllPremiumBenefitsUseCase> {
    private final Provider<BotRepository> botRepositoryProvider;
    private final Provider<PremiumBenefitsRepository> repositoryProvider;

    public GetAllPremiumBenefitsUseCase_Factory(Provider<PremiumBenefitsRepository> provider, Provider<BotRepository> provider2) {
        this.repositoryProvider = provider;
        this.botRepositoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public GetAllPremiumBenefitsUseCase get() {
        return newInstance(this.repositoryProvider.get(), this.botRepositoryProvider.get());
    }

    public static GetAllPremiumBenefitsUseCase_Factory create(Provider<PremiumBenefitsRepository> provider, Provider<BotRepository> provider2) {
        return new GetAllPremiumBenefitsUseCase_Factory(provider, provider2);
    }

    public static GetAllPremiumBenefitsUseCase newInstance(PremiumBenefitsRepository premiumBenefitsRepository, BotRepository botRepository) {
        return new GetAllPremiumBenefitsUseCase(premiumBenefitsRepository, botRepository);
    }
}
