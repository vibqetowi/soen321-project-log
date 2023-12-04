package com.ifriend.data.repository.update;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.platform.tools.api.AppInfoProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InAppUpdateRepositoryImpl_Factory implements Factory<InAppUpdateRepositoryImpl> {
    private final Provider<AppInfoProvider> appInfoProvider;
    private final Provider<DataStore<Preferences>> dataStoreProvider;

    public InAppUpdateRepositoryImpl_Factory(Provider<DataStore<Preferences>> provider, Provider<AppInfoProvider> provider2) {
        this.dataStoreProvider = provider;
        this.appInfoProvider = provider2;
    }

    @Override // javax.inject.Provider
    public InAppUpdateRepositoryImpl get() {
        return newInstance(this.dataStoreProvider.get(), this.appInfoProvider.get());
    }

    public static InAppUpdateRepositoryImpl_Factory create(Provider<DataStore<Preferences>> provider, Provider<AppInfoProvider> provider2) {
        return new InAppUpdateRepositoryImpl_Factory(provider, provider2);
    }

    public static InAppUpdateRepositoryImpl newInstance(DataStore<Preferences> dataStore, AppInfoProvider appInfoProvider) {
        return new InAppUpdateRepositoryImpl(dataStore, appInfoProvider);
    }
}
