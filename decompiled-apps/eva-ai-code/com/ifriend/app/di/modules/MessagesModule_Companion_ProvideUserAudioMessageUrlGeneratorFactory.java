package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.data.socket.generator.UserAudioMessageUrlGenerator;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory implements Factory<UserAudioMessageUrlGenerator> {
    private final Provider<Context> contextProvider;

    public MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    @Override // javax.inject.Provider
    public UserAudioMessageUrlGenerator get() {
        return provideUserAudioMessageUrlGenerator(this.contextProvider.get());
    }

    public static MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory create(Provider<Context> provider) {
        return new MessagesModule_Companion_ProvideUserAudioMessageUrlGeneratorFactory(provider);
    }

    public static UserAudioMessageUrlGenerator provideUserAudioMessageUrlGenerator(Context context) {
        return (UserAudioMessageUrlGenerator) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideUserAudioMessageUrlGenerator(context));
    }
}
