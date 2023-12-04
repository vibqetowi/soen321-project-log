package com.ifriend.chat.new_chat.di;

import com.ifriend.chat.new_chat.list.player.AudioPlayerSettings;
import com.ifriend.domain.data.UserRepository;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory implements Factory<AudioPlayerSettings> {
    private final Provider<UserRepository> userRepositoryProvider;

    public ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory(Provider<UserRepository> provider) {
        this.userRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioPlayerSettings get() {
        return audioAudioPlayerSettings(this.userRepositoryProvider.get());
    }

    public static ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory create(Provider<UserRepository> provider) {
        return new ChatScreenModule_Companion_AudioAudioPlayerSettingsFactory(provider);
    }

    public static AudioPlayerSettings audioAudioPlayerSettings(UserRepository userRepository) {
        return (AudioPlayerSettings) Preconditions.checkNotNullFromProvides(ChatScreenModule.Companion.audioAudioPlayerSettings(userRepository));
    }
}
