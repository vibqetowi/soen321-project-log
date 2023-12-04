package com.ifriend.presentation.features.purchases.common.mapper;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class SubscriptionBenefitsUiMapper_Factory implements Factory<SubscriptionBenefitsUiMapper> {
    @Override // javax.inject.Provider
    public SubscriptionBenefitsUiMapper get() {
        return newInstance();
    }

    public static SubscriptionBenefitsUiMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static SubscriptionBenefitsUiMapper newInstance() {
        return new SubscriptionBenefitsUiMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final SubscriptionBenefitsUiMapper_Factory INSTANCE = new SubscriptionBenefitsUiMapper_Factory();

        private InstanceHolder() {
        }
    }
}
