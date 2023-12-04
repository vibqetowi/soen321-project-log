package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.InitialUserConfigLoader;
import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.data.chat.ChatsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory implements Factory<InitialUserConfigLoader> {
    private final Provider<ChatsRepository> chatsRepositoryProvider;
    private final InitialDataLoadersModule module;
    private final Provider<TagsProvider> tagsProvider;

    public InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatsRepository> provider, Provider<TagsProvider> provider2) {
        this.module = initialDataLoadersModule;
        this.chatsRepositoryProvider = provider;
        this.tagsProvider = provider2;
    }

    @Override // javax.inject.Provider
    public InitialUserConfigLoader get() {
        return provideInitialUserConfigLoader(this.module, this.chatsRepositoryProvider.get(), this.tagsProvider.get());
    }

    public static InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatsRepository> provider, Provider<TagsProvider> provider2) {
        return new InitialDataLoadersModule_ProvideInitialUserConfigLoaderFactory(initialDataLoadersModule, provider, provider2);
    }

    public static InitialUserConfigLoader provideInitialUserConfigLoader(InitialDataLoadersModule initialDataLoadersModule, ChatsRepository chatsRepository, TagsProvider tagsProvider) {
        return (InitialUserConfigLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideInitialUserConfigLoader(chatsRepository, tagsProvider));
    }
}
