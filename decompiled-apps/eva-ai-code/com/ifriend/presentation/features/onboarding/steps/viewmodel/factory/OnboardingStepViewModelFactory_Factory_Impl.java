package com.ifriend.presentation.features.onboarding.steps.viewmodel.factory;

import com.ifriend.presentation.features.onboarding.steps.events.OnboardingStepEvent;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* loaded from: classes6.dex */
public final class OnboardingStepViewModelFactory_Factory_Impl implements OnboardingStepViewModelFactory.Factory {
    private final C0211OnboardingStepViewModelFactory_Factory delegateFactory;

    OnboardingStepViewModelFactory_Factory_Impl(C0211OnboardingStepViewModelFactory_Factory c0211OnboardingStepViewModelFactory_Factory) {
        this.delegateFactory = c0211OnboardingStepViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory.Factory
    public OnboardingStepViewModelFactory create(CoroutineScope coroutineScope, MutableSharedFlow<OnboardingStepEvent> mutableSharedFlow) {
        return this.delegateFactory.get(coroutineScope, mutableSharedFlow);
    }

    public static Provider<OnboardingStepViewModelFactory.Factory> create(C0211OnboardingStepViewModelFactory_Factory c0211OnboardingStepViewModelFactory_Factory) {
        return InstanceFactory.create(new OnboardingStepViewModelFactory_Factory_Impl(c0211OnboardingStepViewModelFactory_Factory));
    }
}
