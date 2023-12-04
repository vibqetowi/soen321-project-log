package com.ifriend.domain.logic.chat.chats;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import com.ifriend.domain.logic.chat.info.IsMultiChatEnabledUseCase;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetUnavailableChatsUseCase_Factory implements Factory<GetUnavailableChatsUseCase> {
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;
    private final Provider<IsMultiChatEnabledUseCase> isMultiChatEnabledUseCaseProvider;

    public GetUnavailableChatsUseCase_Factory(Provider<ChatsInfoRepository> provider, Provider<IsMultiChatEnabledUseCase> provider2) {
        this.chatsInfoRepositoryProvider = provider;
        this.isMultiChatEnabledUseCaseProvider = provider2;
    }

    @Override // javax.inject.Provider
    public GetUnavailableChatsUseCase get() {
        return newInstance(this.chatsInfoRepositoryProvider.get(), this.isMultiChatEnabledUseCaseProvider.get());
    }

    public static GetUnavailableChatsUseCase_Factory create(Provider<ChatsInfoRepository> provider, Provider<IsMultiChatEnabledUseCase> provider2) {
        return new GetUnavailableChatsUseCase_Factory(provider, provider2);
    }

    public static GetUnavailableChatsUseCase newInstance(ChatsInfoRepository chatsInfoRepository, IsMultiChatEnabledUseCase isMultiChatEnabledUseCase) {
        return new GetUnavailableChatsUseCase(chatsInfoRepository, isMultiChatEnabledUseCase);
    }
}
