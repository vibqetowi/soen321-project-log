package com.ifriend.app.di.modules;

import com.ifriend.domain.infrastucture.InternetConnection;
import com.ifriend.domain.infrastucture.InternetConnectionDialogsManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory implements Factory<InternetConnectionDialogsManager> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<InternetConnection> internetConnectionProvider;
    private final ConnectivityModule module;

    public ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory(ConnectivityModule connectivityModule, Provider<CoroutineScope> provider, Provider<InternetConnection> provider2) {
        this.module = connectivityModule;
        this.coroutineScopeProvider = provider;
        this.internetConnectionProvider = provider2;
    }

    @Override // javax.inject.Provider
    public InternetConnectionDialogsManager get() {
        return provideShowInternetConnectionDialogsUseCase(this.module, this.coroutineScopeProvider.get(), this.internetConnectionProvider.get());
    }

    public static ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory create(ConnectivityModule connectivityModule, Provider<CoroutineScope> provider, Provider<InternetConnection> provider2) {
        return new ConnectivityModule_ProvideShowInternetConnectionDialogsUseCaseFactory(connectivityModule, provider, provider2);
    }

    public static InternetConnectionDialogsManager provideShowInternetConnectionDialogsUseCase(ConnectivityModule connectivityModule, CoroutineScope coroutineScope, InternetConnection internetConnection) {
        return (InternetConnectionDialogsManager) Preconditions.checkNotNullFromProvides(connectivityModule.provideShowInternetConnectionDialogsUseCase(coroutineScope, internetConnection));
    }
}
