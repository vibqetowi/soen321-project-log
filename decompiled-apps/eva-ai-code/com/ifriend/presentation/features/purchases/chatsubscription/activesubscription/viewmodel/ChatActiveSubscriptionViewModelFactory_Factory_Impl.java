package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel;

import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatActiveSubscriptionViewModelFactory_Factory_Impl implements ChatActiveSubscriptionViewModelFactory.Factory {
    private final C0212ChatActiveSubscriptionViewModelFactory_Factory delegateFactory;

    ChatActiveSubscriptionViewModelFactory_Factory_Impl(C0212ChatActiveSubscriptionViewModelFactory_Factory c0212ChatActiveSubscriptionViewModelFactory_Factory) {
        this.delegateFactory = c0212ChatActiveSubscriptionViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory.Factory
    public ChatActiveSubscriptionViewModelFactory create(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        return this.delegateFactory.get(buyChatSubscriptionBillingUiParams);
    }

    public static Provider<ChatActiveSubscriptionViewModelFactory.Factory> create(C0212ChatActiveSubscriptionViewModelFactory_Factory c0212ChatActiveSubscriptionViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatActiveSubscriptionViewModelFactory_Factory_Impl(c0212ChatActiveSubscriptionViewModelFactory_Factory));
    }
}
