package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialTagsLoader;
import com.ifriend.domain.data.TagsProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialTagsLoaderFactory implements Factory<InitialTagsLoader> {
    private final InitialDataLoadersModule module;
    private final Provider<TagsProvider> tagsProvider;

    public InitialDataLoadersModule_ProvideInitialTagsLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<TagsProvider> provider) {
        this.module = initialDataLoadersModule;
        this.tagsProvider = provider;
    }

    @Override // javax.inject.Provider
    public InitialTagsLoader get() {
        return provideInitialTagsLoader(this.module, this.tagsProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialTagsLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<TagsProvider> provider) {
        return new InitialDataLoadersModule_ProvideInitialTagsLoaderFactory(initialDataLoadersModule, provider);
    }

    public static InitialTagsLoader provideInitialTagsLoader(InitialDataLoadersModule initialDataLoadersModule, TagsProvider tagsProvider) {
        return (InitialTagsLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialTagsLoader(tagsProvider));
    }
}
