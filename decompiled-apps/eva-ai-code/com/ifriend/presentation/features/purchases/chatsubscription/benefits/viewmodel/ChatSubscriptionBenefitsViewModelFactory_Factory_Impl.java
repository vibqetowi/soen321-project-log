package com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel;

import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitsViewModelFactory_Factory_Impl implements ChatSubscriptionBenefitsViewModelFactory.Factory {
    private final C0213ChatSubscriptionBenefitsViewModelFactory_Factory delegateFactory;

    ChatSubscriptionBenefitsViewModelFactory_Factory_Impl(C0213ChatSubscriptionBenefitsViewModelFactory_Factory c0213ChatSubscriptionBenefitsViewModelFactory_Factory) {
        this.delegateFactory = c0213ChatSubscriptionBenefitsViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory.Factory
    public ChatSubscriptionBenefitsViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return this.delegateFactory.get(buyChatSubscriptionBillingUiParams);
    }

    public static Provider<ChatSubscriptionBenefitsViewModelFactory.Factory> create(C0213ChatSubscriptionBenefitsViewModelFactory_Factory c0213ChatSubscriptionBenefitsViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatSubscriptionBenefitsViewModelFactory_Factory_Impl(c0213ChatSubscriptionBenefitsViewModelFactory_Factory));
    }
}
