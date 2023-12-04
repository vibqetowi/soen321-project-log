package com.ifriend.data.mappers.subscription;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class ChatSubscriptionBenefitsMapper_Factory implements Factory<ChatSubscriptionBenefitsMapper> {
    @Override // javax.inject.Provider
    public ChatSubscriptionBenefitsMapper get() {
        return newInstance();
    }

    public static ChatSubscriptionBenefitsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ChatSubscriptionBenefitsMapper newInstance() {
        return new ChatSubscriptionBenefitsMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final ChatSubscriptionBenefitsMapper_Factory INSTANCE = new ChatSubscriptionBenefitsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
