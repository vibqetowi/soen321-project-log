package com.ifriend.app.di.modules;

import com.ifriend.domain.data.AudioMessageRepository;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory implements Factory<AudioMessageRepository> {
    private final Provider<Preferences> preferencesProvider;

    public MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public AudioMessageRepository get() {
        return provicedsAudioMessageRepository(this.preferencesProvider.get());
    }

    public static MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory create(Provider<Preferences> provider) {
        return new MessagesModule_Companion_ProvicedsAudioMessageRepositoryFactory(provider);
    }

    public static AudioMessageRepository provicedsAudioMessageRepository(Preferences preferences) {
        return (AudioMessageRepository) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provicedsAudioMessageRepository(preferences));
    }
}
