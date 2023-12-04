package com.ifriend.app.di.modules;

import com.ifriend.domain.data.DecodedAudioMessagesRepository;
import com.ifriend.domain.data.Preferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory implements Factory<DecodedAudioMessagesRepository> {
    private final Provider<Preferences> preferencesProvider;

    public MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory(Provider<Preferences> provider) {
        this.preferencesProvider = provider;
    }

    @Override // javax.inject.Provider
    public DecodedAudioMessagesRepository get() {
        return bindsDecodedAudioMessagesRepository(this.preferencesProvider.get());
    }

    public static MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory create(Provider<Preferences> provider) {
        return new MessagesModule_Companion_BindsDecodedAudioMessagesRepositoryFactory(provider);
    }

    public static DecodedAudioMessagesRepository bindsDecodedAudioMessagesRepository(Preferences preferences) {
        return (DecodedAudioMessagesRepository) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.bindsDecodedAudioMessagesRepository(preferences));
    }
}
