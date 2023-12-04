package com.ifriend.data.storages.avatar;

import android.content.Context;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AvatarsStorageImpl_Factory implements Factory<AvatarsStorageImpl> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;

    public AvatarsStorageImpl_Factory(Provider<AuthDataProvider> provider, Provider<Context> provider2, Provider<CoroutineDispatchers> provider3) {
        this.authDataProvider = provider;
        this.contextProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AvatarsStorageImpl get() {
        return newInstance(this.authDataProvider.get(), this.contextProvider.get(), this.dispatchersProvider.get());
    }

    public static AvatarsStorageImpl_Factory create(Provider<AuthDataProvider> provider, Provider<Context> provider2, Provider<CoroutineDispatchers> provider3) {
        return new AvatarsStorageImpl_Factory(provider, provider2, provider3);
    }

    public static AvatarsStorageImpl newInstance(AuthDataProvider authDataProvider, Context context, CoroutineDispatchers coroutineDispatchers) {
        return new AvatarsStorageImpl(authDataProvider, context, coroutineDispatchers);
    }
}
