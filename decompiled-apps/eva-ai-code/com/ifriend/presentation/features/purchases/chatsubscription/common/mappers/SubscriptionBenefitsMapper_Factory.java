package com.ifriend.presentation.features.purchases.chatsubscription.common.mappers;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsMapper_Factory implements Factory<SubscriptionBenefitsMapper> {
    @Override // javax.inject.Provider
    public SubscriptionBenefitsMapper get() {
        return newInstance();
    }

    public static SubscriptionBenefitsMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SubscriptionBenefitsMapper newInstance() {
        return new SubscriptionBenefitsMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final SubscriptionBenefitsMapper_Factory INSTANCE = new SubscriptionBenefitsMapper_Factory();

        private InstanceHolder() {
        }
    }
}
