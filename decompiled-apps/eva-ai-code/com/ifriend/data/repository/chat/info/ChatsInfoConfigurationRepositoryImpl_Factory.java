package com.ifriend.data.repository.chat.info;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsInfoConfigurationRepositoryImpl_Factory implements Factory<ChatsInfoConfigurationRepositoryImpl> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DataStore<Preferences>> dataStoreProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;

    public ChatsInfoConfigurationRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<DispatcherProvider> provider2, Provider<DataStore<Preferences>> provider3) {
        this.coreExecuteCatchingProvider = provider;
        this.dispatcherProvider = provider2;
        this.dataStoreProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatsInfoConfigurationRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.dispatcherProvider.get(), this.dataStoreProvider.get());
    }

    public static ChatsInfoConfigurationRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<DispatcherProvider> provider2, Provider<DataStore<Preferences>> provider3) {
        return new ChatsInfoConfigurationRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static ChatsInfoConfigurationRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, DispatcherProvider dispatcherProvider, DataStore<Preferences> dataStore) {
        return new ChatsInfoConfigurationRepositoryImpl(coreExecuteCatching, dispatcherProvider, dataStore);
    }
}
