package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class DecodingAudioInitialStateSystem_Factory implements Factory<DecodingAudioInitialStateSystem> {
    private final Provider<DecodedAudioMessagesRepository> repositoryProvider;

    public DecodingAudioInitialStateSystem_Factory(Provider<DecodedAudioMessagesRepository> provider) {
        this.repositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public DecodingAudioInitialStateSystem get() {
        return newInstance(this.repositoryProvider.get());
    }

    public static DecodingAudioInitialStateSystem_Factory create(Provider<DecodedAudioMessagesRepository> provider) {
        return new DecodingAudioInitialStateSystem_Factory(provider);
    }

    public static DecodingAudioInitialStateSystem newInstance(DecodedAudioMessagesRepository decodedAudioMessagesRepository) {
        return new DecodingAudioInitialStateSystem(decodedAudioMessagesRepository);
    }
}
