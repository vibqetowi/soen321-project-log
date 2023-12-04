package com.ifriend.presentation.features.purchases.chatsubscription.subscription.mappers;

import com.ifriend.platform.tools.api.ResourceProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionOfferUiMapper_Factory implements Factory<ChatBuySubscriptionOfferUiMapper> {
    private final Provider<ResourceProvider> resourceProvider;

    public ChatBuySubscriptionOfferUiMapper_Factory(Provider<ResourceProvider> provider) {
        this.resourceProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatBuySubscriptionOfferUiMapper get() {
        return newInstance(this.resourceProvider.get());
    }

    public static ChatBuySubscriptionOfferUiMapper_Factory create(Provider<ResourceProvider> provider) {
        return new ChatBuySubscriptionOfferUiMapper_Factory(provider);
    }

    public static ChatBuySubscriptionOfferUiMapper newInstance(ResourceProvider resourceProvider) {
        return new ChatBuySubscriptionOfferUiMapper(resourceProvider);
    }
}
