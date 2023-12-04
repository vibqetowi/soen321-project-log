package com.ifriend.chat.presentation.di.onboarding;

import android.content.Context;
import com.ifriend.common_utils.Logger;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.infoonboarding.InfoOnboardingRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory implements Factory<InfoOnboardingRepository> {
    private final Provider<Context> contextProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<Preferences> preferencesProvider;

    public OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory(Provider<Preferences> provider, Provider<Context> provider2, Provider<Logger> provider3, Provider<DispatcherProvider> provider4) {
        this.preferencesProvider = provider;
        this.contextProvider = provider2;
        this.loggerProvider = provider3;
        this.dispatcherProvider = provider4;
    }

    @Override // javax.inject.Provider
    public InfoOnboardingRepository get() {
        return provideInfoOnboardingRepository(this.preferencesProvider.get(), this.contextProvider.get(), this.loggerProvider.get(), this.dispatcherProvider.get());
    }

    public static OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory create(Provider<Preferences> provider, Provider<Context> provider2, Provider<Logger> provider3, Provider<DispatcherProvider> provider4) {
        return new OnboardingModule_Companion_ProvideInfoOnboardingRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static InfoOnboardingRepository provideInfoOnboardingRepository(Preferences preferences, Context context, Logger logger, DispatcherProvider dispatcherProvider) {
        return (InfoOnboardingRepository) Preconditions.checkNotNullFromProvides(OnboardingModule.Companion.provideInfoOnboardingRepository(preferences, context, logger, dispatcherProvider));
    }
}
