package com.ifriend.chat.new_chat.list.presentationSystems.sexting.showPaywall;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.toggle.FeatureToggle;
import com.ifriend.presentation.common.observers.appevents.AppEventsEmitter;
import com.ifriend.presentation.common.observers.purchases.PaymentResultFlow;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class SextingMessagePaywall_Factory implements Factory<SextingMessagePaywall> {
    private final Provider<AppEventsEmitter> appEventsEmitterProvider;
    private final Provider<FeatureToggle> neuronsToggleProvider;
    private final Provider<PaymentResultFlow> paymentResultFlowProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public SextingMessagePaywall_Factory(Provider<FeatureToggle> provider, Provider<UserRepository> provider2, Provider<AppEventsEmitter> provider3, Provider<PaymentResultFlow> provider4) {
        this.neuronsToggleProvider = provider;
        this.userRepositoryProvider = provider2;
        this.appEventsEmitterProvider = provider3;
        this.paymentResultFlowProvider = provider4;
    }

    @Override // javax.inject.Provider
    public SextingMessagePaywall get() {
        return newInstance(this.neuronsToggleProvider.get(), this.userRepositoryProvider.get(), this.appEventsEmitterProvider.get(), this.paymentResultFlowProvider.get());
    }

    public static SextingMessagePaywall_Factory create(Provider<FeatureToggle> provider, Provider<UserRepository> provider2, Provider<AppEventsEmitter> provider3, Provider<PaymentResultFlow> provider4) {
        return new SextingMessagePaywall_Factory(provider, provider2, provider3, provider4);
    }

    public static SextingMessagePaywall newInstance(FeatureToggle featureToggle, UserRepository userRepository, AppEventsEmitter appEventsEmitter, PaymentResultFlow paymentResultFlow) {
        return new SextingMessagePaywall(featureToggle, userRepository, appEventsEmitter, paymentResultFlow);
    }
}
