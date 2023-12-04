package com.ifriend.data.memorycached.chats.mappers;

import com.ifriend.data.mappers.GenderFromBackendString;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatConfigMapper_Factory implements Factory<ChatConfigMapper> {
    private final Provider<GenderFromBackendString> genderFromBackendStringProvider;
    private final Provider<PersonalityFromBackendValueMapper> personalityFromBackendValueMapperProvider;

    public ChatConfigMapper_Factory(Provider<PersonalityFromBackendValueMapper> provider, Provider<GenderFromBackendString> provider2) {
        this.personalityFromBackendValueMapperProvider = provider;
        this.genderFromBackendStringProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatConfigMapper get() {
        return newInstance(this.personalityFromBackendValueMapperProvider.get(), this.genderFromBackendStringProvider.get());
    }

    public static ChatConfigMapper_Factory create(Provider<PersonalityFromBackendValueMapper> provider, Provider<GenderFromBackendString> provider2) {
        return new ChatConfigMapper_Factory(provider, provider2);
    }

    public static ChatConfigMapper newInstance(PersonalityFromBackendValueMapper personalityFromBackendValueMapper, GenderFromBackendString genderFromBackendString) {
        return new ChatConfigMapper(personalityFromBackendValueMapper, genderFromBackendString);
    }
}
