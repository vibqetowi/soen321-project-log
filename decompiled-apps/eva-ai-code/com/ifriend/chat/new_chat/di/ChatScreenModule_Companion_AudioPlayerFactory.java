package com.ifriend.chat.new_chat.di;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import com.ifriend.chat.new_chat.list.player.AudioPlayerSettings;
import com.ifriend.common_utils.Logger;
import com.ifriend.domain.CoroutineDispatchers;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatScreenModule_Companion_AudioPlayerFactory implements Factory<AudioPlayer> {
    private final Provider<Context> contextProvider;
    private final Provider<CoroutineDispatchers> dispatchersProvider;
    private final Provider<Logger> loggerProvider;
    private final Provider<AudioPlayerSettings> playerSettingsProvider;
    private final Provider<Lifecycle> screenLifecycleProvider;

    public ChatScreenModule_Companion_AudioPlayerFactory(Provider<Context> provider, Provider<AudioPlayerSettings> provider2, Provider<Lifecycle> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        this.contextProvider = provider;
        this.playerSettingsProvider = provider2;
        this.screenLifecycleProvider = provider3;
        this.dispatchersProvider = provider4;
        this.loggerProvider = provider5;
    }

    @Override // javax.inject.Provider
    public AudioPlayer get() {
        return audioPlayer(this.contextProvider.get(), this.playerSettingsProvider.get(), this.screenLifecycleProvider.get(), this.dispatchersProvider.get(), this.loggerProvider.get());
    }

    public static ChatScreenModule_Companion_AudioPlayerFactory create(Provider<Context> provider, Provider<AudioPlayerSettings> provider2, Provider<Lifecycle> provider3, Provider<CoroutineDispatchers> provider4, Provider<Logger> provider5) {
        return new ChatScreenModule_Companion_AudioPlayerFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static AudioPlayer audioPlayer(Context context, AudioPlayerSettings audioPlayerSettings, Lifecycle lifecycle, CoroutineDispatchers coroutineDispatchers, Logger logger) {
        return (AudioPlayer) Preconditions.checkNotNullFromProvides(ChatScreenModule.Companion.audioPlayer(context, audioPlayerSettings, lifecycle, coroutineDispatchers, logger));
    }
}
