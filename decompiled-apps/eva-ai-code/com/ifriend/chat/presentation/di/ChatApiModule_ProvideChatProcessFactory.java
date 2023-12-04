package com.ifriend.chat.presentation.di;

import com.ifriend.chat.data.UserApi;
import com.ifriend.chat.domain.data.ChatProcess;
import com.ifriend.domain.storage.token.UserTokenProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatApiModule_ProvideChatProcessFactory implements Factory<ChatProcess> {
    private final ChatApiModule module;
    private final Provider<UserApi> userApiProvider;
    private final Provider<UserTokenProvider> userTokenProvider;

    public ChatApiModule_ProvideChatProcessFactory(ChatApiModule chatApiModule, Provider<UserApi> provider, Provider<UserTokenProvider> provider2) {
        this.module = chatApiModule;
        this.userApiProvider = provider;
        this.userTokenProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatProcess get() {
        return provideChatProcess(this.module, this.userApiProvider.get(), this.userTokenProvider.get());
    }

    public static ChatApiModule_ProvideChatProcessFactory create(ChatApiModule chatApiModule, Provider<UserApi> provider, Provider<UserTokenProvider> provider2) {
        return new ChatApiModule_ProvideChatProcessFactory(chatApiModule, provider, provider2);
    }

    public static ChatProcess provideChatProcess(ChatApiModule chatApiModule, UserApi userApi, UserTokenProvider userTokenProvider) {
        return (ChatProcess) Preconditions.checkNotNullFromProvides(chatApiModule.provideChatProcess(userApi, userTokenProvider));
    }
}
