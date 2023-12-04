package com.ifriend.app.di.modules.data;

import com.ifriend.data.storages.auth.AuthDataStorageImpl;
import com.ifriend.domain.data.Preferences;
import com.ifriend.domain.storage.token.UserTokenStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAuthDataStorageFactory implements Factory<AuthDataStorageImpl> {
    private final Provider<Preferences> preferencesProvider;
    private final Provider<UserTokenStorage> tokenStorageProvider;

    public DataModule_Companion_ProvideAuthDataStorageFactory(Provider<UserTokenStorage> provider, Provider<Preferences> provider2) {
        this.tokenStorageProvider = provider;
        this.preferencesProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AuthDataStorageImpl get() {
        return provideAuthDataStorage(this.tokenStorageProvider.get(), this.preferencesProvider.get());
    }

    public static DataModule_Companion_ProvideAuthDataStorageFactory create(Provider<UserTokenStorage> provider, Provider<Preferences> provider2) {
        return new DataModule_Companion_ProvideAuthDataStorageFactory(provider, provider2);
    }

    public static AuthDataStorageImpl provideAuthDataStorage(UserTokenStorage userTokenStorage, Preferences preferences) {
        return (AuthDataStorageImpl) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAuthDataStorage(userTokenStorage, preferences));
    }
}
