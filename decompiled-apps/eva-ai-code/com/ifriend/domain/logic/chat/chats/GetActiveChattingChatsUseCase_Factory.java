package com.ifriend.domain.logic.chat.chats;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class GetActiveChattingChatsUseCase_Factory implements Factory<GetActiveChattingChatsUseCase> {
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;

    public GetActiveChattingChatsUseCase_Factory(Provider<ChatsInfoRepository> provider) {
        this.chatsInfoRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public GetActiveChattingChatsUseCase get() {
        return newInstance(this.chatsInfoRepositoryProvider.get());
    }

    public static GetActiveChattingChatsUseCase_Factory create(Provider<ChatsInfoRepository> provider) {
        return new GetActiveChattingChatsUseCase_Factory(provider);
    }

    public static GetActiveChattingChatsUseCase newInstance(ChatsInfoRepository chatsInfoRepository) {
        return new GetActiveChattingChatsUseCase(chatsInfoRepository);
    }
}
