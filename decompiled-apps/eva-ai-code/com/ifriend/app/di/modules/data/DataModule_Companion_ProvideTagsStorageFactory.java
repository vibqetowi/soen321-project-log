package com.ifriend.app.di.modules.data;

import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.api.TagsApi;
import com.ifriend.data.storages.tags.TagsLocalDataSource;
import com.ifriend.domain.CoroutineDispatchers;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.TagsStorage;
import com.ifriend.internal_notifications.handler.InternalNotificationHandler;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DataModule_Companion_ProvideTagsStorageFactory implements Factory<TagsStorage> {
    private final Provider<TagsApi> apiProvider;
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<CoroutineDispatchers> coroutineDispatchersProvider;
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<InternalNotificationHandler> internalNotificationHandlerProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<TagsLocalDataSource> tagsLocalDataSourceProvider;

    public DataModule_Companion_ProvideTagsStorageFactory(Provider<TagsApi> provider, Provider<AuthDataProvider> provider2, Provider<InternalNotificationHandler> provider3, Provider<CoroutineDispatchers> provider4, Provider<CoroutineScope> provider5, Provider<Logger> provider6, Provider<TagsLocalDataSource> provider7) {
        this.apiProvider = provider;
        this.authDataProvider = provider2;
        this.internalNotificationHandlerProvider = provider3;
        this.coroutineDispatchersProvider = provider4;
        this.coroutineScopeProvider = provider5;
        this.loggerProvider = provider6;
        this.tagsLocalDataSourceProvider = provider7;
    }

    @Override // javax.inject.Provider
    public TagsStorage get() {
        return provideTagsStorage(this.apiProvider.get(), this.authDataProvider.get(), this.internalNotificationHandlerProvider.get(), this.coroutineDispatchersProvider.get(), this.coroutineScopeProvider.get(), this.loggerProvider.get(), this.tagsLocalDataSourceProvider.get());
    }

    public static DataModule_Companion_ProvideTagsStorageFactory create(Provider<TagsApi> provider, Provider<AuthDataProvider> provider2, Provider<InternalNotificationHandler> provider3, Provider<CoroutineDispatchers> provider4, Provider<CoroutineScope> provider5, Provider<Logger> provider6, Provider<TagsLocalDataSource> provider7) {
        return new DataModule_Companion_ProvideTagsStorageFactory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static TagsStorage provideTagsStorage(TagsApi tagsApi, AuthDataProvider authDataProvider, InternalNotificationHandler internalNotificationHandler, CoroutineDispatchers coroutineDispatchers, CoroutineScope coroutineScope, Logger logger, TagsLocalDataSource tagsLocalDataSource) {
        return (TagsStorage) Preconditions.checkNotNullFromProvides(DataModule.Companion.provideTagsStorage(tagsApi, authDataProvider, internalNotificationHandler, coroutineDispatchers, coroutineScope, logger, tagsLocalDataSource));
    }
}
