package com.ifriend.app.di.modules;

import android.content.Context;
import com.ifriend.data.socket.generator.MediaPlayerPlaybackControllerGenerator;
import com.ifriend.domain.storage.token.UserTokenProvider;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory implements Factory<MediaPlayerPlaybackControllerGenerator> {
    private final Provider<Context> contextProvider;
    private final Provider<UserTokenProvider> tokenProvider;

    public MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory(Provider<Context> provider, Provider<UserTokenProvider> provider2) {
        this.contextProvider = provider;
        this.tokenProvider = provider2;
    }

    @Override // javax.inject.Provider
    public MediaPlayerPlaybackControllerGenerator get() {
        return provideMediaPlayerPlaybackControllerGenerator(this.contextProvider.get(), this.tokenProvider.get());
    }

    public static MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory create(Provider<Context> provider, Provider<UserTokenProvider> provider2) {
        return new MessagesModule_Companion_ProvideMediaPlayerPlaybackControllerGeneratorFactory(provider, provider2);
    }

    public static MediaPlayerPlaybackControllerGenerator provideMediaPlayerPlaybackControllerGenerator(Context context, UserTokenProvider userTokenProvider) {
        return (MediaPlayerPlaybackControllerGenerator) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideMediaPlayerPlaybackControllerGenerator(context, userTokenProvider));
    }
}
