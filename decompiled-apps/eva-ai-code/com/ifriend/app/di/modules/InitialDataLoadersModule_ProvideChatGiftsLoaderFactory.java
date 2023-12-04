package com.ifriend.app.di.modules;

import com.ifriend.data.initialLoaders.ChatGiftsLoader;
import com.ifriend.data.toggle.ChatGiftsStoreToggle;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class InitialDataLoadersModule_ProvideChatGiftsLoaderFactory implements Factory<ChatGiftsLoader> {
    private final Provider<ChatGiftsRepository> chatGiftsRepositoryProvider;
    private final Provider<ChatGiftsStoreToggle> chatGiftsStoreToggleProvider;
    private final InitialDataLoadersModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public InitialDataLoadersModule_ProvideChatGiftsLoaderFactory(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatGiftsRepository> provider, Provider<UserRepository> provider2, Provider<ChatGiftsStoreToggle> provider3) {
        this.module = initialDataLoadersModule;
        this.chatGiftsRepositoryProvider = provider;
        this.userRepositoryProvider = provider2;
        this.chatGiftsStoreToggleProvider = provider3;
    }

    @Override // javax.inject.Provider
    public ChatGiftsLoader get() {
        return provideChatGiftsLoader(this.module, this.chatGiftsRepositoryProvider.get(), this.userRepositoryProvider.get(), this.chatGiftsStoreToggleProvider.get());
    }

    public static InitialDataLoadersModule_ProvideChatGiftsLoaderFactory create(InitialDataLoadersModule initialDataLoadersModule, Provider<ChatGiftsRepository> provider, Provider<UserRepository> provider2, Provider<ChatGiftsStoreToggle> provider3) {
        return new InitialDataLoadersModule_ProvideChatGiftsLoaderFactory(initialDataLoadersModule, provider, provider2, provider3);
    }

    public static ChatGiftsLoader provideChatGiftsLoader(InitialDataLoadersModule initialDataLoadersModule, ChatGiftsRepository chatGiftsRepository, UserRepository userRepository, ChatGiftsStoreToggle chatGiftsStoreToggle) {
        return (ChatGiftsLoader) Preconditions.checkNotNullFromProvides(initialDataLoadersModule.provideChatGiftsLoader(chatGiftsRepository, userRepository, chatGiftsStoreToggle));
    }
}
