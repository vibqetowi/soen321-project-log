package com.ifriend.domain.logic.chat.permissions;

import com.ifriend.domain.data.chat.ChatsInfoRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class CheckChatPermissionsUseCase_Factory implements Factory<CheckChatPermissionsUseCase> {
    private final Provider<ChatsInfoRepository> chatsInfoRepositoryProvider;

    public CheckChatPermissionsUseCase_Factory(Provider<ChatsInfoRepository> provider) {
        this.chatsInfoRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public CheckChatPermissionsUseCase get() {
        return newInstance(this.chatsInfoRepositoryProvider.get());
    }

    public static CheckChatPermissionsUseCase_Factory create(Provider<ChatsInfoRepository> provider) {
        return new CheckChatPermissionsUseCase_Factory(provider);
    }

    public static CheckChatPermissionsUseCase newInstance(ChatsInfoRepository chatsInfoRepository) {
        return new CheckChatPermissionsUseCase(chatsInfoRepository);
    }
}
