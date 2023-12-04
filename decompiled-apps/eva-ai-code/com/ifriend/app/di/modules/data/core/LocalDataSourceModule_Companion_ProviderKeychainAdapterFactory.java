package com.ifriend.app.di.modules.data.core;

import android.content.Context;
import com.ifriend.keychain.KeychainAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory implements Factory<KeychainAdapter> {
    private final Provider<Context> contextProvider;

    public LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public KeychainAdapter get() {
        return providerKeychainAdapter(this.contextProvider.get());
    }

    public static LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory create(Provider<Context> provider) {
        return new LocalDataSourceModule_Companion_ProviderKeychainAdapterFactory(provider);
    }

    public static KeychainAdapter providerKeychainAdapter(Context context) {
        return (KeychainAdapter) Preconditions.checkNotNullFromProvides(LocalDataSourceModule.Companion.providerKeychainAdapter(context));
    }
}
