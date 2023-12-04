package com.ifriend.chat.new_chat.list.presentationSystems.audio.decode;

import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
import kotlinx.coroutines.CoroutineScope;
/* loaded from: classes6.dex */
public final class DecodingAudioEventsHandlingSystem_Factory implements Factory<DecodingAudioEventsHandlingSystem> {
    private final Provider<CoroutineScope> coroutineScopeProvider;
    private final Provider<DecodedAudioMessagesRepository> repositoryProvider;

    public DecodingAudioEventsHandlingSystem_Factory(Provider<DecodedAudioMessagesRepository> provider, Provider<CoroutineScope> provider2) {
        this.repositoryProvider = provider;
        this.coroutineScopeProvider = provider2;
    }

    @Override // javax.inject.Provider
    public DecodingAudioEventsHandlingSystem get() {
        return newInstance(this.repositoryProvider.get(), this.coroutineScopeProvider.get());
    }

    public static DecodingAudioEventsHandlingSystem_Factory create(Provider<DecodedAudioMessagesRepository> provider, Provider<CoroutineScope> provider2) {
        return new DecodingAudioEventsHandlingSystem_Factory(provider, provider2);
    }

    public static DecodingAudioEventsHandlingSystem newInstance(DecodedAudioMessagesRepository decodedAudioMessagesRepository, CoroutineScope coroutineScope) {
        return new DecodingAudioEventsHandlingSystem(decodedAudioMessagesRepository, coroutineScope);
    }
}
