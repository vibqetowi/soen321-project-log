package com.ifriend.data.repository.chat.messages.mappers;

import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatAudioContentMessageMapper_Factory implements Factory<ChatAudioContentMessageMapper> {
    private final Provider<BotAudioMessageUrlGenerator> botAudioMessageUrlGeneratorProvider;
    private final Provider<UserAudioMessageUrlGenerator> userAudioMessageUrlGeneratorProvider;

    public ChatAudioContentMessageMapper_Factory(Provider<BotAudioMessageUrlGenerator> provider, Provider<UserAudioMessageUrlGenerator> provider2) {
        this.botAudioMessageUrlGeneratorProvider = provider;
        this.userAudioMessageUrlGeneratorProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatAudioContentMessageMapper get() {
        return newInstance(this.botAudioMessageUrlGeneratorProvider.get(), this.userAudioMessageUrlGeneratorProvider.get());
    }

    public static ChatAudioContentMessageMapper_Factory create(Provider<BotAudioMessageUrlGenerator> provider, Provider<UserAudioMessageUrlGenerator> provider2) {
        return new ChatAudioContentMessageMapper_Factory(provider, provider2);
    }

    public static ChatAudioContentMessageMapper newInstance(BotAudioMessageUrlGenerator botAudioMessageUrlGenerator, UserAudioMessageUrlGenerator userAudioMessageUrlGenerator) {
        return new ChatAudioContentMessageMapper(botAudioMessageUrlGenerator, userAudioMessageUrlGenerator);
    }
}
