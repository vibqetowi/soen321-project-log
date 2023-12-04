package com.ifriend.data.repository.experiments;

import com.ifriend.data.common.CoreExecuteCatching;
import com.ifriend.data.mappers.featuretoggles.FeatureToggleBotIdsMapper;
import com.ifriend.data.storages.config.AppConfigLocalDataSource;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.serialization.json.Json;
/* loaded from: classes6.dex */
public final class FeatureTogglePayloadsRepositoryImpl_Factory implements Factory<FeatureTogglePayloadsRepositoryImpl> {
    private final Provider<AppConfigLocalDataSource> appConfigLocalDataSourceProvider;
    private final Provider<CoreExecuteCatching> coreExecuteCatchingProvider;
    private final Provider<FeatureToggleBotIdsMapper> featureToggleBotIdsMapperProvider;
    private final Provider<Json> jsonProvider;

    public FeatureTogglePayloadsRepositoryImpl_Factory(Provider<CoreExecuteCatching> provider, Provider<Json> provider2, Provider<AppConfigLocalDataSource> provider3, Provider<FeatureToggleBotIdsMapper> provider4) {
        this.coreExecuteCatchingProvider = provider;
        this.jsonProvider = provider2;
        this.appConfigLocalDataSourceProvider = provider3;
        this.featureToggleBotIdsMapperProvider = provider4;
    }

    @Override // javax.inject.Provider
    public FeatureTogglePayloadsRepositoryImpl get() {
        return newInstance(this.coreExecuteCatchingProvider.get(), this.jsonProvider.get(), this.appConfigLocalDataSourceProvider.get(), this.featureToggleBotIdsMapperProvider.get());
    }

    public static FeatureTogglePayloadsRepositoryImpl_Factory create(Provider<CoreExecuteCatching> provider, Provider<Json> provider2, Provider<AppConfigLocalDataSource> provider3, Provider<FeatureToggleBotIdsMapper> provider4) {
        return new FeatureTogglePayloadsRepositoryImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static FeatureTogglePayloadsRepositoryImpl newInstance(CoreExecuteCatching coreExecuteCatching, Json json, AppConfigLocalDataSource appConfigLocalDataSource, FeatureToggleBotIdsMapper featureToggleBotIdsMapper) {
        return new FeatureTogglePayloadsRepositoryImpl(coreExecuteCatching, json, appConfigLocalDataSource, featureToggleBotIdsMapper);
    }
}
