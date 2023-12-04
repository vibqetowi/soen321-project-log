package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.data.socket.generator.BotAudioMessageUrlGenerator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory implements Factory<BotAudioMessageUrlGenerator> {
    private final Provider<Context> contextProvider;

    public MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public BotAudioMessageUrlGenerator get() {
        return provideBotAudioMessageUrlGenerator(this.contextProvider.get());
    }

    public static MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory create(Provider<Context> provider) {
        return new MessagesModule_Companion_ProvideBotAudioMessageUrlGeneratorFactory(provider);
    }

    public static BotAudioMessageUrlGenerator provideBotAudioMessageUrlGenerator(Context context) {
        return (BotAudioMessageUrlGenerator) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideBotAudioMessageUrlGenerator(context));
    }
}
