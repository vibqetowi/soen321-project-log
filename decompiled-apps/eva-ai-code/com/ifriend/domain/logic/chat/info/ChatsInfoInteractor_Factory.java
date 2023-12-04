package com.ifriend.domain.logic.chat.info;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chat.ChatClientsRepository;
import com.ifriend.domain.data.chat.ChatsInfoConfigurationRepository;
import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.chats.GetActiveChattingChatsUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatsInfoInteractor_Factory implements Factory<ChatsInfoInteractor> {
    private final Provider<ActivateNewChatUseCase> activateNewChatUseCaseProvider;
    private final Provider<ChatsInfoConfigurationRepository> chatsInfoConfigurationRepositoryProvider;
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<ChatClientsRepository> chatsRepositoryProvider;
    private final Provider<GetActiveChattingChatsUseCase> getActiveChattingChatsUseCaseProvider;
    private final Provider<IsMultiChatEnabledUseCase> isMultiChatEnabledUseCaseProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatsInfoInteractor_Factory(Provider<ChatsInfoRepository> provider, Provider<ChatClientsRepository> provider2, Provider<UserRepository> provider3, Provider<ChatsInfoConfigurationRepository> provider4, Provider<IsMultiChatEnabledUseCase> provider5, Provider<GetActiveChattingChatsUseCase> provider6, Provider<ActivateNewChatUseCase> provider7) {
        this.chatsInfoRepositoryProvider = provider;
        this.chatsRepositoryProvider = provider2;
        this.userRepositoryProvider = provider3;
        this.chatsInfoConfigurationRepositoryProvider = provider4;
        this.isMultiChatEnabledUseCaseProvider = provider5;
        this.getActiveChattingChatsUseCaseProvider = provider6;
        this.activateNewChatUseCaseProvider = provider7;
    }

    @Override // javax.inject.Provider
    public ChatsInfoInteractor get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.chatsRepositoryProvider.get(), this.userRepositoryProvider.get(), this.chatsInfoConfigurationRepositoryProvider.get(), this.isMultiChatEnabledUseCaseProvider.get(), this.getActiveChattingChatsUseCaseProvider.get(), this.activateNewChatUseCaseProvider.get());
    }

    public static ChatsInfoInteractor_Factory create(Provider<ChatsInfoRepository> provider, Provider<ChatClientsRepository> provider2, Provider<UserRepository> provider3, Provider<ChatsInfoConfigurationRepository> provider4, Provider<IsMultiChatEnabledUseCase> provider5, Provider<GetActiveChattingChatsUseCase> provider6, Provider<ActivateNewChatUseCase> provider7) {
        return new ChatsInfoInteractor_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7);
    }

    public static ChatsInfoInteractor newInstance(ChatsInfoRepository chatsInfoRepository, ChatClientsRepository chatClientsRepository, UserRepository userRepository, ChatsInfoConfigurationRepository chatsInfoConfigurationRepository, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase, GetActiveChattingChatsUseCase getActiveChattingChatsUseCase, ActivateNewChatUseCase activateNewChatUseCase) {
        return new ChatsInfoInteractor(chatsInfoRepository, chatClientsRepository, userRepository, chatsInfoConfigurationRepository, isMultiChatEnabledUseCase, getActiveChattingChatsUseCase, activateNewChatUseCase);
    }
}
