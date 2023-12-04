package com.ifriend.domain.logic.infoonboarding;

import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideUseCase_Factory implements Factory<InfoOnboardingSlideUseCase> {
    private final Provider<InfoOnboardingRepository> infoOnboardingRepositoryProvider;

    public InfoOnboardingSlideUseCase_Factory(Provider<InfoOnboardingRepository> provider) {
        this.infoOnboardingRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public InfoOnboardingSlideUseCase get() {
        return newInstance(this.infoOnboardingRepositoryProvider.get());
    }

    public static InfoOnboardingSlideUseCase_Factory create(Provider<InfoOnboardingRepository> provider) {
        return new InfoOnboardingSlideUseCase_Factory(provider);
    }

    public static InfoOnboardingSlideUseCase newInstance(InfoOnboardingRepository infoOnboardingRepository) {
        return new InfoOnboardingSlideUseCase(infoOnboardingRepository);
    }
}
