package com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel;

import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionViewModelFactory_Factory_Impl implements ChatBuySubscriptionViewModelFactory.Factory {
    private final C0215ChatBuySubscriptionViewModelFactory_Factory delegateFactory;

    ChatBuySubscriptionViewModelFactory_Factory_Impl(C0215ChatBuySubscriptionViewModelFactory_Factory c0215ChatBuySubscriptionViewModelFactory_Factory) {
        this.delegateFactory = c0215ChatBuySubscriptionViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory.Factory
    public ChatBuySubscriptionViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return this.delegateFactory.get(buyChatSubscriptionBillingUiParams);
    }

    public static Provider<ChatBuySubscriptionViewModelFactory.Factory> create(C0215ChatBuySubscriptionViewModelFactory_Factory c0215ChatBuySubscriptionViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatBuySubscriptionViewModelFactory_Factory_Impl(c0215ChatBuySubscriptionViewModelFactory_Factory));
    }
}
