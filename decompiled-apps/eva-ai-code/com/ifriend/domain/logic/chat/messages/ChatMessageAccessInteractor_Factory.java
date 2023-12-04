package com.ifriend.domain.logic.chat.messages;

import com.ifriend.domain.data.AppImageLoaderRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.buy.BuyChatMessagesInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageAccessInteractor_Factory implements Factory<ChatMessageAccessInteractor> {
    private final Provider<AppImageLoaderRepository> appImageLoaderRepositoryProvider;
    private final Provider<BuyChatMessagesInteractor> buyChatMessagesInteractorProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatMessageAccessInteractor_Factory(Provider<UserRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<UserBalanceRepository> provider3, Provider<AppImageLoaderRepository> provider4, Provider<ChatClientInteractor> provider5, Provider<BuyChatMessagesInteractor> provider6) {
        this.userRepositoryProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
        this.userBalanceRepositoryProvider = provider3;
        this.appImageLoaderRepositoryProvider = provider4;
        this.chatClientInteractorProvider = provider5;
        this.buyChatMessagesInteractorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public ChatMessageAccessInteractor get() {
        return newInstance(this.userRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.userBalanceRepositoryProvider.get(), this.appImageLoaderRepositoryProvider.get(), this.chatClientInteractorProvider.get(), this.buyChatMessagesInteractorProvider.get());
    }

    public static ChatMessageAccessInteractor_Factory create(Provider<UserRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<UserBalanceRepository> provider3, Provider<AppImageLoaderRepository> provider4, Provider<ChatClientInteractor> provider5, Provider<BuyChatMessagesInteractor> provider6) {
        return new ChatMessageAccessInteractor_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChatMessageAccessInteractor newInstance(UserRepository userRepository, ChatsInfoInteractor chatsInfoInteractor, UserBalanceRepository userBalanceRepository, AppImageLoaderRepository appImageLoaderRepository, ChatClientInteractor chatClientInteractor, BuyChatMessagesInteractor buyChatMessagesInteractor) {
        return new ChatMessageAccessInteractor(userRepository, chatsInfoInteractor, userBalanceRepository, appImageLoaderRepository, chatClientInteractor, buyChatMessagesInteractor);
    }
}
