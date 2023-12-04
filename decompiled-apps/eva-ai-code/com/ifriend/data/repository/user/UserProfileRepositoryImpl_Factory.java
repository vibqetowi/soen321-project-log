package com.ifriend.data.repository.user;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserProfileRepositoryImpl_Factory implements Factory<UserProfileRepositoryImpl> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DataStore<Preferences>> dataStoreProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<com.ifriend.domain.data.Preferences> preferencesProvider;

    public UserProfileRepositoryImpl_Factory(Provider<DispatcherProvider> provider, Provider<com.ifriend.domain.data.Preferences> provider2, Provider<DataStore<Preferences>> provider3, Provider<CoreExecuteCatching> provider4) {
        this.dispatcherProvider = provider;
        this.preferencesProvider = provider2;
        this.dataStoreProvider = provider3;
        this.coreExecuteCatchingProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserProfileRepositoryImpl get() {
        return newInstance(this.dispatcherProvider.get(), this.preferencesProvider.get(), this.dataStoreProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static UserProfileRepositoryImpl_Factory create(Provider<DispatcherProvider> provider, Provider<com.ifriend.domain.data.Preferences> provider2, Provider<DataStore<Preferences>> provider3, Provider<CoreExecuteCatching> provider4) {
        return new UserProfileRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static UserProfileRepositoryImpl newInstance(DispatcherProvider dispatcherProvider, com.ifriend.domain.data.Preferences preferences, DataStore<Preferences> dataStore, CoreExecuteCatching coreExecuteCatching) {
        return new UserProfileRepositoryImpl(dispatcherProvider, preferences, dataStore, coreExecuteCatching);
    }
}
