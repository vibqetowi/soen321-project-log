package com.ifriend.chat.new_chat.list.presentationSystems.audio.playback;

import com.ifriend.chat.new_chat.list.player.AudioPlayer;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class AudioPlaybackSystem_Factory implements Factory<AudioPlaybackSystem> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<AudioPlayer> playerProvider;

    public AudioPlaybackSystem_Factory(Provider<AudioPlayer> provider, Provider<CoroutineScope> provider2) {
        this.playerProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public AudioPlaybackSystem get() {
        return newInstance(this.playerProvider.get(), this.coroutineScopeProvider.get());
    }

    public static AudioPlaybackSystem_Factory create(Provider<AudioPlayer> provider, Provider<CoroutineScope> provider2) {
        return new AudioPlaybackSystem_Factory(provider, provider2);
    }

    public static AudioPlaybackSystem newInstance(AudioPlayer audioPlayer, CoroutineScope coroutineScope) {
        return new AudioPlaybackSystem(audioPlayer, coroutineScope);
    }
}
