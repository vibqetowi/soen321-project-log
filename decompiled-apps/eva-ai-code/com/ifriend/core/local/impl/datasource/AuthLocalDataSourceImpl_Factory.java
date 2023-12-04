package com.ifriend.core.local.impl.datasource;

import android.content.SharedPreferences;
import com.ifriend.keychain.KeychainAdapter;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AuthLocalDataSourceImpl_Factory implements Factory<AuthLocalDataSourceImpl> {
    private final Provider<KeychainAdapter> keychainAdapterProvider;
    private final Provider<SharedPreferences> preferencesProvider;

    public AuthLocalDataSourceImpl_Factory(Provider<KeychainAdapter> provider, Provider<SharedPreferences> provider2) {
        this.keychainAdapterProvider = provider;
        this.preferencesProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AuthLocalDataSourceImpl get() {
        return newInstance(this.keychainAdapterProvider.get(), this.preferencesProvider.get());
    }

    public static AuthLocalDataSourceImpl_Factory create(Provider<KeychainAdapter> provider, Provider<SharedPreferences> provider2) {
        return new AuthLocalDataSourceImpl_Factory(provider, provider2);
    }

    public static AuthLocalDataSourceImpl newInstance(KeychainAdapter keychainAdapter, SharedPreferences sharedPreferences) {
        return new AuthLocalDataSourceImpl(keychainAdapter, sharedPreferences);
    }
}
