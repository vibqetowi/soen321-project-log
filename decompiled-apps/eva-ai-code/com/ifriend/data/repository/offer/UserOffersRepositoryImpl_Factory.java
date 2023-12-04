package com.ifriend.data.repository.offer;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.core.tools.api.DispatcherProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class UserOffersRepositoryImpl_Factory implements Factory<UserOffersRepositoryImpl> {
    private final Provider<DataStore<Preferences>> dataStoreProvider;
    private final Provider<DispatcherProvider> dispatchersProvider;

    public UserOffersRepositoryImpl_Factory(Provider<DispatcherProvider> provider, Provider<DataStore<Preferences>> provider2) {
        this.dispatchersProvider = provider;
        this.dataStoreProvider = provider2;
    }

    @Override // javax.inject.Provider
    public UserOffersRepositoryImpl get() {
        return newInstance(this.dispatchersProvider.get(), this.dataStoreProvider.get());
    }

    public static UserOffersRepositoryImpl_Factory create(Provider<DispatcherProvider> provider, Provider<DataStore<Preferences>> provider2) {
        return new UserOffersRepositoryImpl_Factory(provider, provider2);
    }

    public static UserOffersRepositoryImpl newInstance(DispatcherProvider dispatcherProvider, DataStore<Preferences> dataStore) {
        return new UserOffersRepositoryImpl(dispatcherProvider, dataStore);
    }
}
