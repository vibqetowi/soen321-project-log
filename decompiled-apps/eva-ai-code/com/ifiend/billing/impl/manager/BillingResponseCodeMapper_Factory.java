package com.ifiend.billing.impl.manager;

import dagger.internal.Factory;
/* loaded from: classes6.dex */
public final class BillingResponseCodeMapper_Factory implements Factory<BillingResponseCodeMapper> {
    @Override // javax.inject.Provider
    public BillingResponseCodeMapper get() {
        return newInstance();
    }

    public static BillingResponseCodeMapper_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static BillingResponseCodeMapper newInstance() {
        return new BillingResponseCodeMapper();
    }

    /* loaded from: classes6.dex */
    private static final class InstanceHolder {
        private static final BillingResponseCodeMapper_Factory INSTANCE = new BillingResponseCodeMapper_Factory();

        private InstanceHolder() {
        }
    }
}
