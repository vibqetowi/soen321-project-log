package com.ifriend.presentation.features.chat.background.delegate;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.logic.chat.ChatBackgroundUseCase;
import com.ifriend.domain.logic.chat.configuration.ChatsConfigurationInteractor;
import com.ifriend.domain.logic.chat.permissions.CheckChatPermissionsUseCase;
import com.ifriend.domain.newChat.chat.systems.messages.live.LiveChatMessagesFlow;
import com.ifriend.domain.useCases.diary.DiaryNoteReplier;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatBackgroundDelegateImpl_Factory implements Factory<ChatBackgroundDelegateImpl> {
    private final Provider<ChatBackgroundUseCase> chatBackgroundUseCaseProvider;
    private final Provider<ChatsConfigurationInteractor> chatsConfigurationInteractorProvider;
    private final Provider<CheckChatPermissionsUseCase> checkChatPermissionsUseCaseProvider;
    private final Provider<DiaryNoteReplier> diaryReplierProvider;
    private final Provider<LiveChatMessagesFlow> liveChatMessagesFlowProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatBackgroundDelegateImpl_Factory(Provider<ChatBackgroundUseCase> provider, Provider<LiveChatMessagesFlow> provider2, Provider<DiaryNoteReplier> provider3, Provider<UserRepository> provider4, Provider<CheckChatPermissionsUseCase> provider5, Provider<ChatsConfigurationInteractor> provider6) {
        this.chatBackgroundUseCaseProvider = provider;
        this.liveChatMessagesFlowProvider = provider2;
        this.diaryReplierProvider = provider3;
        this.userRepositoryProvider = provider4;
        this.checkChatPermissionsUseCaseProvider = provider5;
        this.chatsConfigurationInteractorProvider = provider6;
    }

    @Override // javax.inject.Provider
    public ChatBackgroundDelegateImpl get() {
        return newInstance(this.chatBackgroundUseCaseProvider.get(), this.liveChatMessagesFlowProvider.get(), this.diaryReplierProvider.get(), this.userRepositoryProvider.get(), this.checkChatPermissionsUseCaseProvider.get(), this.chatsConfigurationInteractorProvider.get());
    }

    public static ChatBackgroundDelegateImpl_Factory create(Provider<ChatBackgroundUseCase> provider, Provider<LiveChatMessagesFlow> provider2, Provider<DiaryNoteReplier> provider3, Provider<UserRepository> provider4, Provider<CheckChatPermissionsUseCase> provider5, Provider<ChatsConfigurationInteractor> provider6) {
        return new ChatBackgroundDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static ChatBackgroundDelegateImpl newInstance(ChatBackgroundUseCase chatBackgroundUseCase, LiveChatMessagesFlow liveChatMessagesFlow, DiaryNoteReplier diaryNoteReplier, UserRepository userRepository, CheckChatPermissionsUseCase checkChatPermissionsUseCase, ChatsConfigurationInteractor chatsConfigurationInteractor) {
        return new ChatBackgroundDelegateImpl(chatBackgroundUseCase, liveChatMessagesFlow, diaryNoteReplier, userRepository, checkChatPermissionsUseCase, chatsConfigurationInteractor);
    }
}
