package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.data.storages.token.KeychainUserTokenStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class TokenModule_Companion_ProvideKeychainUserTokenStorageFactory implements Factory<KeychainUserTokenStorage> {
    private final Provider<Context> contextProvider;

    public TokenModule_Companion_ProvideKeychainUserTokenStorageFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public KeychainUserTokenStorage get() {
        return provideKeychainUserTokenStorage(this.contextProvider.get());
    }

    public static TokenModule_Companion_ProvideKeychainUserTokenStorageFactory create(Provider<Context> provider) {
        return new TokenModule_Companion_ProvideKeychainUserTokenStorageFactory(provider);
    }

    public static KeychainUserTokenStorage provideKeychainUserTokenStorage(Context context) {
        return (KeychainUserTokenStorage) Preconditions.checkNotNullFromProvides(TokenModule.Companion.provideKeychainUserTokenStorage(context));
    }
}
