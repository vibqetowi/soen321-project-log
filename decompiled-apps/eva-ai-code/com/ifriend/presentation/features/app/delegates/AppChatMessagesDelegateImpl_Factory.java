package com.ifriend.presentation.features.app.delegates;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.user.UserProfileRepository;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppChatMessagesDelegateImpl_Factory implements Factory<AppChatMessagesDelegateImpl> {
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<UserProfileRepository> userProfileRepositoryProvider;
    private final Provider<UserRepository> userRepositoryProvider;

    public AppChatMessagesDelegateImpl_Factory(Provider<UserRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<ChatClientInteractor> provider3, Provider<DispatcherProvider> provider4, Provider<UserProfileRepository> provider5) {
        this.userRepositoryProvider = provider;
        this.chatsInfoInteractorProvider = provider2;
        this.chatClientInteractorProvider = provider3;
        this.dispatcherProvider = provider4;
        this.userProfileRepositoryProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AppChatMessagesDelegateImpl get() {
        return newInstance(this.userRepositoryProvider.get(), this.chatsInfoInteractorProvider.get(), this.chatClientInteractorProvider.get(), this.dispatcherProvider.get(), this.userProfileRepositoryProvider.get());
    }

    public static AppChatMessagesDelegateImpl_Factory create(Provider<UserRepository> provider, Provider<ChatsInfoInteractor> provider2, Provider<ChatClientInteractor> provider3, Provider<DispatcherProvider> provider4, Provider<UserProfileRepository> provider5) {
        return new AppChatMessagesDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static AppChatMessagesDelegateImpl newInstance(UserRepository userRepository, ChatsInfoInteractor chatsInfoInteractor, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatcherProvider, UserProfileRepository userProfileRepository) {
        return new AppChatMessagesDelegateImpl(userRepository, chatsInfoInteractor, chatClientInteractor, dispatcherProvider, userProfileRepository);
    }
}
