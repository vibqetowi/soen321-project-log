package com.ifriend.app.di.modules.data;

import com.ifriend.data.networking.api.NeuronsApi;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.toggle.AvatarGenerationFreeToggle;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.storage.NeuronsCostsStorage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideNeuronsCostsStorageFactory implements Factory<NeuronsCostsStorage> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<AvatarGenerationFreeToggle> avatarGenerationFreeToggleProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<NeuronsApi> neuronsApiProvider;

    public DataModule_Companion_ProvideNeuronsCostsStorageFactory(Provider<CoroutineScope> provider, Provider<AppConfigLocalDataSource> provider2, Provider<AvatarGenerationFreeToggle> provider3, Provider<NeuronsApi> provider4, Provider<AuthDataProvider> provider5) {
        this.coroutineScopeProvider = provider;
        this.appConfigLocalDataSourceProvider = provider2;
        this.avatarGenerationFreeToggleProvider = provider3;
        this.neuronsApiProvider = provider4;
        this.authDataProvider = provider5;
    }

    @Override // javax.inject.Provider
    public NeuronsCostsStorage get() {
        return provideNeuronsCostsStorage(this.coroutineScopeProvider.get(), this.appConfigLocalDataSourceProvider.get(), this.avatarGenerationFreeToggleProvider.get(), this.neuronsApiProvider.get(), this.authDataProvider.get());
    }

    public static DataModule_Companion_ProvideNeuronsCostsStorageFactory create(Provider<CoroutineScope> provider, Provider<AppConfigLocalDataSource> provider2, Provider<AvatarGenerationFreeToggle> provider3, Provider<NeuronsApi> provider4, Provider<AuthDataProvider> provider5) {
        return new DataModule_Companion_ProvideNeuronsCostsStorageFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static NeuronsCostsStorage provideNeuronsCostsStorage(CoroutineScope coroutineScope, AppConfigLocalDataSource appConfigLocalDataSource, AvatarGenerationFreeToggle avatarGenerationFreeToggle, NeuronsApi neuronsApi, AuthDataProvider authDataProvider) {
        return (NeuronsCostsStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideNeuronsCostsStorage(coroutineScope, appConfigLocalDataSource, avatarGenerationFreeToggle, neuronsApi, authDataProvider));
    }
}
