package com.ifriend.app.di.modules.data;

import android.content.Context;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.generateAvatar.AvatarsStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideAvatarsStorageFactory implements Factory<AvatarsStorage> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;

    public DataModule_Companion_ProvideAvatarsStorageFactory(Provider<AuthDataProvider> provider, Provider<Context> provider2, Provider<CoroutineDispatchers> provider3) {
        this.authDataProvider = provider;
        this.contextProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AvatarsStorage get() {
        return provideAvatarsStorage(this.authDataProvider.get(), this.contextProvider.get(), this.dispatchersProvider.get());
    }

    public static DataModule_Companion_ProvideAvatarsStorageFactory create(Provider<AuthDataProvider> provider, Provider<Context> provider2, Provider<CoroutineDispatchers> provider3) {
        return new DataModule_Companion_ProvideAvatarsStorageFactory(provider, provider2, provider3);
    }

    public static AvatarsStorage provideAvatarsStorage(AuthDataProvider authDataProvider, Context context, CoroutineDispatchers coroutineDispatchers) {
        return (AvatarsStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideAvatarsStorage(authDataProvider, context, coroutineDispatchers));
    }
}
