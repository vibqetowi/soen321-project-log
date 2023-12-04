package com.ifriend.chat.presentation.di;

import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.chat.domain.profile.user.DeleteUserUseCase;
import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatModule_ProvideDeleteUserUseCaseFactory implements Factory<DeleteUserUseCase> {
    private final Provider<ChatProcess> chatProcessProvider;
    private final ChatModule module;
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatModule_ProvideDeleteUserUseCaseFactory(ChatModule chatModule, Provider<UserRepository> provider, Provider<ChatProcess> provider2) {
        this.module = chatModule;
        this.userRepositoryProvider = provider;
        this.chatProcessProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DeleteUserUseCase get() {
        return provideDeleteUserUseCase(this.module, this.userRepositoryProvider.get(), this.chatProcessProvider.get());
    }

    public static ChatModule_ProvideDeleteUserUseCaseFactory create(ChatModule chatModule, Provider<UserRepository> provider, Provider<ChatProcess> provider2) {
        return new ChatModule_ProvideDeleteUserUseCaseFactory(chatModule, provider, provider2);
    }

    public static DeleteUserUseCase provideDeleteUserUseCase(ChatModule chatModule, UserRepository userRepository, ChatProcess chatProcess) {
        return (DeleteUserUseCase) Preconditions.checkNotNullFromProvides(chatModule.provideDeleteUserUseCase(userRepository, chatProcess));
    }
}
