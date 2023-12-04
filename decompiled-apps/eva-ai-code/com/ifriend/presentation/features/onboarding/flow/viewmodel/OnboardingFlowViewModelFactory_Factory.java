package com.ifriend.presentation.features.onboarding.flow.viewmodel;

import com.ifriend.domain.onboarding.interactor.OnboardingInteractor;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class OnboardingFlowViewModelFactory_Factory implements Factory<OnboardingFlowViewModelFactory> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<OnboardingInteractor> interactorProvider;

    public OnboardingFlowViewModelFactory_Factory(Provider<OnboardingInteractor> provider, Provider<AppEventsEmitter> provider2) {
        this.interactorProvider = provider;
        this.appEventsEmitterProvider = provider2;
    }

    @Override // javax.inject.Provider
    public OnboardingFlowViewModelFactory get() {
        return newInstance(this.interactorProvider.get(), this.appEventsEmitterProvider.get());
    }

    public static OnboardingFlowViewModelFactory_Factory create(Provider<OnboardingInteractor> provider, Provider<AppEventsEmitter> provider2) {
        return new OnboardingFlowViewModelFactory_Factory(provider, provider2);
    }

    public static OnboardingFlowViewModelFactory newInstance(OnboardingInteractor onboardingInteractor, AppEventsEmitter appEventsEmitter) {
        return new OnboardingFlowViewModelFactory(onboardingInteractor, appEventsEmitter);
    }
}
