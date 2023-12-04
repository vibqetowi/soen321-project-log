package com.ifriend.data.repository.purchases;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BillingPurchasesHistoryImpl_Factory implements Factory<BillingPurchasesHistoryImpl> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<Preferences> preferencesProvider;

    public BillingPurchasesHistoryImpl_Factory(Provider<Preferences> provider, Provider<CoreExecuteCatching> provider2) {
        this.preferencesProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
    }

    @Override // javax.inject.Provider
    public BillingPurchasesHistoryImpl get() {
        return newInstance(this.preferencesProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static BillingPurchasesHistoryImpl_Factory create(Provider<Preferences> provider, Provider<CoreExecuteCatching> provider2) {
        return new BillingPurchasesHistoryImpl_Factory(provider, provider2);
    }

    public static BillingPurchasesHistoryImpl newInstance(Preferences preferences, CoreExecuteCatching coreExecuteCatching) {
        return new BillingPurchasesHistoryImpl(preferences, coreExecuteCatching);
    }
}
