package com.ifriend.presentation.features.home.delegates;

import com.ifriend.core.tools.api.DispatcherProvider;
import com.ifriend.domain.logic.chat.ChatClientInteractor;
import com.ifriend.domain.logic.chat.avatart.GeneratedChatAvatarInteractor;
import com.ifriend.domain.logic.chat.chats.GetUnavailableChatsUseCase;
import com.ifriend.domain.logic.chat.info.ChatsInfoInteractor;
import com.ifriend.presentation.features.home.mappers.ChatUnlockLabelMapperUi;
import com.ifriend.presentation.features.home.mappers.HomeActiveChatMapper;
import com.ifriend.presentation.features.home.mappers.HomeUnavailableChatMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class HomeChatsDelegateImpl_Factory implements Factory<HomeChatsDelegateImpl> {
    private final Provider<HomeActiveChatMapper> activeChatMapperProvider;
    private final Provider<ChatClientInteractor> chatClientInteractorProvider;
    private final Provider<ChatUnlockLabelMapperUi> chatUnlockLabelMapperProvider;
    private final Provider<ChatsInfoInteractor> chatsInfoInteractorProvider;
    private final Provider<DispatcherProvider> dispatcherProvider;
    private final Provider<GeneratedChatAvatarInteractor> generatedChatAvatarInteractorProvider;
    private final Provider<GetUnavailableChatsUseCase> getUnavailableChatsUseCaseProvider;
    private final Provider<HomeUnavailableChatMapper> unavailableChatMapperProvider;

    public HomeChatsDelegateImpl_Factory(Provider<HomeActiveChatMapper> provider, Provider<HomeUnavailableChatMapper> provider2, Provider<ChatsInfoInteractor> provider3, Provider<ChatClientInteractor> provider4, Provider<DispatcherProvider> provider5, Provider<GetUnavailableChatsUseCase> provider6, Provider<ChatUnlockLabelMapperUi> provider7, Provider<GeneratedChatAvatarInteractor> provider8) {
        this.activeChatMapperProvider = provider;
        this.unavailableChatMapperProvider = provider2;
        this.chatsInfoInteractorProvider = provider3;
        this.chatClientInteractorProvider = provider4;
        this.dispatcherProvider = provider5;
        this.getUnavailableChatsUseCaseProvider = provider6;
        this.chatUnlockLabelMapperProvider = provider7;
        this.generatedChatAvatarInteractorProvider = provider8;
    }

    @Override // javax.inject.Provider
    public HomeChatsDelegateImpl get() {
        return newInstance(this.activeChatMapperProvider.get(), this.unavailableChatMapperProvider.get(), this.chatsInfoInteractorProvider.get(), this.chatClientInteractorProvider.get(), this.dispatcherProvider.get(), this.getUnavailableChatsUseCaseProvider.get(), this.chatUnlockLabelMapperProvider.get(), this.generatedChatAvatarInteractorProvider.get());
    }

    public static HomeChatsDelegateImpl_Factory create(Provider<HomeActiveChatMapper> provider, Provider<HomeUnavailableChatMapper> provider2, Provider<ChatsInfoInteractor> provider3, Provider<ChatClientInteractor> provider4, Provider<DispatcherProvider> provider5, Provider<GetUnavailableChatsUseCase> provider6, Provider<ChatUnlockLabelMapperUi> provider7, Provider<GeneratedChatAvatarInteractor> provider8) {
        return new HomeChatsDelegateImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static HomeChatsDelegateImpl newInstance(HomeActiveChatMapper homeActiveChatMapper, HomeUnavailableChatMapper homeUnavailableChatMapper, ChatsInfoInteractor chatsInfoInteractor, ChatClientInteractor chatClientInteractor, DispatcherProvider dispatcherProvider, GetUnavailableChatsUseCase getUnavailableChatsUseCase, ChatUnlockLabelMapperUi chatUnlockLabelMapperUi, GeneratedChatAvatarInteractor generatedChatAvatarInteractor) {
        return new HomeChatsDelegateImpl(homeActiveChatMapper, homeUnavailableChatMapper, chatsInfoInteractor, chatClientInteractor, dispatcherProvider, getUnavailableChatsUseCase, chatUnlockLabelMapperUi, generatedChatAvatarInteractor);
    }
}
