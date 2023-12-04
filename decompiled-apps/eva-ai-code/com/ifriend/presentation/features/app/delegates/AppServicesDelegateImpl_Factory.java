package com.ifriend.presentation.features.app.delegates;

import com.ifriend.presentation.services.ChatMessagesService;
import com.ifriend.presentation.services.ChatService;
import com.ifriend.presentation.services.UserBalanceService;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class AppServicesDelegateImpl_Factory implements Factory<AppServicesDelegateImpl> {
    private final Provider<ChatMessagesService> chatMessagesServiceProvider;
    private final Provider<ChatService> chatServiceProvider;
    private final Provider<UserBalanceService> userBalanceServiceProvider;

    public AppServicesDelegateImpl_Factory(Provider<UserBalanceService> provider, Provider<ChatMessagesService> provider2, Provider<ChatService> provider3) {
        this.userBalanceServiceProvider = provider;
        this.chatMessagesServiceProvider = provider2;
        this.chatServiceProvider = provider3;
    }

    @Override // javax.inject.Provider
    public AppServicesDelegateImpl get() {
        return newInstance(this.userBalanceServiceProvider.get(), this.chatMessagesServiceProvider.get(), this.chatServiceProvider.get());
    }

    public static AppServicesDelegateImpl_Factory create(Provider<UserBalanceService> provider, Provider<ChatMessagesService> provider2, Provider<ChatService> provider3) {
        return new AppServicesDelegateImpl_Factory(provider, provider2, provider3);
    }

    public static AppServicesDelegateImpl newInstance(UserBalanceService userBalanceService, ChatMessagesService chatMessagesService, ChatService chatService) {
        return new AppServicesDelegateImpl(userBalanceService, chatMessagesService, chatService);
    }
}
