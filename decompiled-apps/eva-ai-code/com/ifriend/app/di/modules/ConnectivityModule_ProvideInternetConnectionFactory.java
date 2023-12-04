package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.infrastucture.InternetConnection;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ConnectivityModule_ProvideInternetConnectionFactory implements Factory<InternetConnection> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final ConnectivityModule module;

    public ConnectivityModule_ProvideInternetConnectionFactory(ConnectivityModule connectivityModule, Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3) {
        this.module = connectivityModule;
        this.contextProvider = provider;
        this.coroutineScopeProvider = provider2;
        this.dispatchersProvider = provider3;
    }

    @Override // javax.inject.Provider
    public InternetConnection get() {
        return provideInternetConnection(this.module, this.contextProvider.get(), this.coroutineScopeProvider.get(), this.dispatchersProvider.get());
    }

    public static ConnectivityModule_ProvideInternetConnectionFactory create(ConnectivityModule connectivityModule, Provider<Context> provider, Provider<CoroutineScope> provider2, Provider<CoroutineDispatchers> provider3) {
        return new ConnectivityModule_ProvideInternetConnectionFactory(connectivityModule, provider, provider2, provider3);
    }

    public static InternetConnection provideInternetConnection(ConnectivityModule connectivityModule, Context context, CoroutineScope coroutineScope, CoroutineDispatchers coroutineDispatchers) {
        return (InternetConnection) Preconditions.checkNotNullFromProvides(connectivityModule.provideInternetConnection(context, coroutineScope, coroutineDispatchers));
    }
}
