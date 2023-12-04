package com.ifriend.chat.presentation.di;

import com.ifriend.chat.data.UserApi;
import com.ifriend.chat.domain.data.ResetAiApiDelegate;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatApiModule_ProvideResetAiApiDelegateFactory implements Factory<ResetAiApiDelegate> {
    private final ChatApiModule module;
    private final Provider<UserApi> userApiProvider;

    public ChatApiModule_ProvideResetAiApiDelegateFactory(ChatApiModule chatApiModule, Provider<UserApi> provider) {
        this.module = chatApiModule;
        this.userApiProvider = provider;
    }

    @Override // javax.inject.Provider
    public ResetAiApiDelegate get() {
        return provideResetAiApiDelegate(this.module, this.userApiProvider.get());
    }

    public static ChatApiModule_ProvideResetAiApiDelegateFactory create(ChatApiModule chatApiModule, Provider<UserApi> provider) {
        return new ChatApiModule_ProvideResetAiApiDelegateFactory(chatApiModule, provider);
    }

    public static ResetAiApiDelegate provideResetAiApiDelegate(ChatApiModule chatApiModule, UserApi userApi) {
        return (ResetAiApiDelegate) Preconditions.checkNotNullFromProvides(chatApiModule.provideResetAiApiDelegate(userApi));
    }
}
