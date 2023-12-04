package com.ifriend.chat.presentation.ui.chat.message;

import com.ifriend.domain.data.AudioMessageRepository;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatAudioMessageFacadeImpl_Factory implements Factory<ChatAudioMessageFacadeImpl> {
    private final Provider<AudioMessageRepository> audioMessageRepositoryProvider;

    public ChatAudioMessageFacadeImpl_Factory(Provider<AudioMessageRepository> provider) {
        this.audioMessageRepositoryProvider = provider;
    }

    @Override // javax.inject.Provider
    public ChatAudioMessageFacadeImpl get() {
        return newInstance(this.audioMessageRepositoryProvider.get());
    }

    public static ChatAudioMessageFacadeImpl_Factory create(Provider<AudioMessageRepository> provider) {
        return new ChatAudioMessageFacadeImpl_Factory(provider);
    }

    public static ChatAudioMessageFacadeImpl newInstance(AudioMessageRepository audioMessageRepository) {
        return new ChatAudioMessageFacadeImpl(audioMessageRepository);
    }
}
