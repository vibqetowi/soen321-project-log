package com.ifriend.domain.logic.chat.gifts;

import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.chatgifts.ChatGiftsRepository;
import com.ifriend.domain.data.user.UserBalanceRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatGiftsUseCase_Factory implements Factory<ChatGiftsUseCase> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatGiftsRepository> chatGiftsRepositoryProvider;
    private final Provider<UserBalanceRepository> userBalanceRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatGiftsUseCase_Factory(Provider<UserRepository> provider, Provider<ChatGiftsRepository> provider2, Provider<UserBalanceRepository> provider3, Provider<ChatClientInteractor> provider4) {
        this.userRepositoryProvider = provider;
        this.chatGiftsRepositoryProvider = provider2;
        this.userBalanceRepositoryProvider = provider3;
        this.chatClientInteractorProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChatGiftsUseCase get() {
        return newInstance(this.userRepositoryProvider.get(), this.chatGiftsRepositoryProvider.get(), this.userBalanceRepositoryProvider.get(), this.chatClientInteractorProvider.get());
    }

    public static ChatGiftsUseCase_Factory create(Provider<UserRepository> provider, Provider<ChatGiftsRepository> provider2, Provider<UserBalanceRepository> provider3, Provider<ChatClientInteractor> provider4) {
        return new ChatGiftsUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatGiftsUseCase newInstance(UserRepository userRepository, ChatGiftsRepository chatGiftsRepository, UserBalanceRepository userBalanceRepository, ChatClientInteractor chatClientInteractor) {
        return new ChatGiftsUseCase(userRepository, chatGiftsRepository, userBalanceRepository, chatClientInteractor);
    }
}
