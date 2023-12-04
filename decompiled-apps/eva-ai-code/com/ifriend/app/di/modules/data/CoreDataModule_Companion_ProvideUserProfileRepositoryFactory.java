package com.ifriend.app.di.modules.data;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.data.purchases.BillingPurchasesHistory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CoreDataModule_Companion_ProvideUserProfileRepositoryFactory implements Factory<BillingPurchasesHistory> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<Preferences> preferencesProvider;

    public CoreDataModule_Companion_ProvideUserProfileRepositoryFactory(Provider<Preferences> provider, Provider<CoreExecuteCatching> provider2) {
        this.preferencesProvider = provider;
        this.coreExecuteCatchingProvider = provider2;
    }

    @Override // javax.inject.Provider
    public BillingPurchasesHistory get() {
        return provideUserProfileRepository(this.preferencesProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static CoreDataModule_Companion_ProvideUserProfileRepositoryFactory create(Provider<Preferences> provider, Provider<CoreExecuteCatching> provider2) {
        return new CoreDataModule_Companion_ProvideUserProfileRepositoryFactory(provider, provider2);
    }

    public static BillingPurchasesHistory provideUserProfileRepository(Preferences preferences, CoreExecuteCatching coreExecuteCatching) {
        return (BillingPurchasesHistory) Preconditions.checkNotNullFromProvides(CoreDataModule.Companion.provideUserProfileRepository(preferences, coreExecuteCatching));
    }
}
