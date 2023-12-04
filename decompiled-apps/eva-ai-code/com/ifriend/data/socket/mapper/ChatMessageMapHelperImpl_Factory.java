package com.ifriend.data.socket.mapper;

import android.content.Context;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import com.ifriend.domain.data.AuthDataProvider;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatMessageMapHelperImpl_Factory implements Factory<ChatMessageMapHelperImpl> {
    private final Provider<AuthDataProvider> authDataProvider;
    private final Provider<BotAudioMessageUrlGenerator> botAudioMessageUrlGeneratorProvider;
    private final Provider<Context> contextProvider;
    private final Provider<UserAudioMessageUrlGenerator> userAudioMessageUrlGeneratorProvider;

    public ChatMessageMapHelperImpl_Factory(Provider<AuthDataProvider> provider, Provider<BotAudioMessageUrlGenerator> provider2, Provider<UserAudioMessageUrlGenerator> provider3, Provider<Context> provider4) {
        this.authDataProvider = provider;
        this.botAudioMessageUrlGeneratorProvider = provider2;
        this.userAudioMessageUrlGeneratorProvider = provider3;
        this.contextProvider = provider4;
    }

    @Override // javax.inject.Provider
    public ChatMessageMapHelperImpl get() {
        return newInstance(this.authDataProvider.get(), this.botAudioMessageUrlGeneratorProvider.get(), this.userAudioMessageUrlGeneratorProvider.get(), this.contextProvider.get());
    }

    public static ChatMessageMapHelperImpl_Factory create(Provider<AuthDataProvider> provider, Provider<BotAudioMessageUrlGenerator> provider2, Provider<UserAudioMessageUrlGenerator> provider3, Provider<Context> provider4) {
        return new ChatMessageMapHelperImpl_Factory(provider, provider2, provider3, provider4);
    }

    public static ChatMessageMapHelperImpl newInstance(AuthDataProvider authDataProvider, BotAudioMessageUrlGenerator botAudioMessageUrlGenerator, UserAudioMessageUrlGenerator userAudioMessageUrlGenerator, Context context) {
        return new ChatMessageMapHelperImpl(authDataProvider, botAudioMessageUrlGenerator, userAudioMessageUrlGenerator, context);
    }
}
