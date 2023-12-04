package com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel;

import com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory;
import dagger.internal.InstanceFactory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatFlowSubscriptionViewModelFactory_Factory_Impl implements ChatFlowSubscriptionViewModelFactory.Factory {
    private final C0214ChatFlowSubscriptionViewModelFactory_Factory delegateFactory;

    ChatFlowSubscriptionViewModelFactory_Factory_Impl(C0214ChatFlowSubscriptionViewModelFactory_Factory c0214ChatFlowSubscriptionViewModelFactory_Factory) {
        this.delegateFactory = c0214ChatFlowSubscriptionViewModelFactory_Factory;
    }

    @Override // com.ifriend.presentation.features.purchases.chatsubscription.flow.viewmodel.ChatFlowSubscriptionViewModelFactory.Factory
    public ChatFlowSubscriptionViewModelFactory create(String str) {
        return this.delegateFactory.get(str);
    }

    public static Provider<ChatFlowSubscriptionViewModelFactory.Factory> create(C0214ChatFlowSubscriptionViewModelFactory_Factory c0214ChatFlowSubscriptionViewModelFactory_Factory) {
        return InstanceFactory.create(new ChatFlowSubscriptionViewModelFactory_Factory_Impl(c0214ChatFlowSubscriptionViewModelFactory_Factory));
    }
}
