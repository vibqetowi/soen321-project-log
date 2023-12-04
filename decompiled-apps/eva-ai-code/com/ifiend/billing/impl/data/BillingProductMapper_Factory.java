package com.ifiend.billing.impl.data;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class BillingProductMapper_Factory implements Factory<BillingProductMapper> {
    @Override // javax.inject.Provider
    public BillingProductMapper get() {
        return newInstance();
    }

    public static BillingProductMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BillingProductMapper newInstance() {
        return new BillingProductMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final BillingProductMapper_Factory INSTANCE = new BillingProductMapper_Factory();

        private InstanceHolder() {
        }
    }
}
