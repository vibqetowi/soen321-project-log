package com.ifriend.data.repository.config;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.config.FirebaseConfig;
import com.ifriend.data.config.LocalDefaultsConfig;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AppConfigRepositoryImpl_Factory implements Factory<AppConfigRepositoryImpl> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<FirebaseConfig> firebaseConfigProvider;
    private final Provider<LocalDefaultsConfig> localDefaultsConfigProvider;
    private final Provider<TagsLocalDataSource> tagsLocalDataSourceProvider;

    public AppConfigRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<LocalDefaultsConfig> provider2, Provider<FirebaseConfig> provider3, Provider<AppConfigLocalDataSource> provider4, Provider<TagsLocalDataSource> provider5, Provider<CoroutineScope> provider6) {
        this.coreExecuteCatchingProvider = provider;
        this.localDefaultsConfigProvider = provider2;
        this.firebaseConfigProvider = provider3;
        this.appConfigLocalDataSourceProvider = provider4;
        this.tagsLocalDataSourceProvider = provider5;
        this.coroutineScopeProvider = provider6;
    }

    @Override // javax.inject.Provider
    public AppConfigRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.localDefaultsConfigProvider.get(), this.firebaseConfigProvider.get(), this.appConfigLocalDataSourceProvider.get(), this.tagsLocalDataSourceProvider.get(), this.coroutineScopeProvider.get());
    }

    public static AppConfigRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<LocalDefaultsConfig> provider2, Provider<FirebaseConfig> provider3, Provider<AppConfigLocalDataSource> provider4, Provider<TagsLocalDataSource> provider5, Provider<CoroutineScope> provider6) {
        return new AppConfigRepositoryImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static AppConfigRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, LocalDefaultsConfig localDefaultsConfig, FirebaseConfig firebaseConfig, AppConfigLocalDataSource appConfigLocalDataSource, TagsLocalDataSource tagsLocalDataSource, CoroutineScope coroutineScope) {
        return new AppConfigRepositoryImpl(coreExecuteCatching, localDefaultsConfig, firebaseConfig, appConfigLocalDataSource, tagsLocalDataSource, coroutineScope);
    }
}
