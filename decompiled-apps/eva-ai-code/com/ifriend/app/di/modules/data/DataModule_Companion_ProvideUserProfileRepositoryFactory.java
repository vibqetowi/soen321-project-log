package com.ifriend.app.di.modules.data;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.domain.data.user.UserProfileRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideUserProfileRepositoryFactory implements Factory<UserProfileRepository> {
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<DataStore<Preferences>> dataStoreProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<com.ifriend.domain.data.Preferences> preferencesProvider;

    public DataModule_Companion_ProvideUserProfileRepositoryFactory(Provider<DispatcherProvider> provider, Provider<com.ifriend.domain.data.Preferences> provider2, Provider<DataStore<Preferences>> provider3, Provider<CoreExecuteCatching> provider4) {
        this.dispatcherProvider = provider;
        this.preferencesProvider = provider2;
        this.dataStoreProvider = provider3;
        this.coreExecuteCatchingProvider = provider4;
    }

    @Override // javax.inject.Provider
    public UserProfileRepository get() {
        return provideUserProfileRepository(this.dispatcherProvider.get(), this.preferencesProvider.get(), this.dataStoreProvider.get(), this.coreExecuteCatchingProvider.get());
    }

    public static DataModule_Companion_ProvideUserProfileRepositoryFactory create(Provider<DispatcherProvider> provider, Provider<com.ifriend.domain.data.Preferences> provider2, Provider<DataStore<Preferences>> provider3, Provider<CoreExecuteCatching> provider4) {
        return new DataModule_Companion_ProvideUserProfileRepositoryFactory(provider, provider2, provider3, provider4);
    }

    public static UserProfileRepository provideUserProfileRepository(DispatcherProvider dispatcherProvider, com.ifriend.domain.data.Preferences preferences, DataStore<Preferences> dataStore, CoreExecuteCatching coreExecuteCatching) {
        return (UserProfileRepository) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideUserProfileRepository(dispatcherProvider, preferences, dataStore, coreExecuteCatching));
    }
}
