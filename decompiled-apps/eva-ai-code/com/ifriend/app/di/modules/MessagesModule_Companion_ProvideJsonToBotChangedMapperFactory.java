package com.ifriend.app.di.modules;

import com.ifriend.data.mappers.EthnicityFromBackendValueMapper;
import com.ifriend.data.mappers.GenderFromBackendString;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import org.json.JSONObject;
/* loaded from: classes6.dex */
public final class MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory implements Factory<Mapper<JSONObject, MessagesSourceMessage.BotDataChanged>> {
    private final Provider<EthnicityFromBackendValueMapper> ethnicityMapperProvider;
    private final Provider<GenderFromBackendString> genderMapperProvider;
    private final Provider<PersonalityFromBackendValueMapper> personalityMapperProvider;

    public MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory(Provider<GenderFromBackendString> provider, Provider<EthnicityFromBackendValueMapper> provider2, Provider<PersonalityFromBackendValueMapper> provider3) {
        this.genderMapperProvider = provider;
        this.ethnicityMapperProvider = provider2;
        this.personalityMapperProvider = provider3;
    }

    @Override // javax.inject.Provider
    public Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> get() {
        return provideJsonToBotChangedMapper(this.genderMapperProvider.get(), this.ethnicityMapperProvider.get(), this.personalityMapperProvider.get());
    }

    public static MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory create(Provider<GenderFromBackendString> provider, Provider<EthnicityFromBackendValueMapper> provider2, Provider<PersonalityFromBackendValueMapper> provider3) {
        return new MessagesModule_Companion_ProvideJsonToBotChangedMapperFactory(provider, provider2, provider3);
    }

    public static Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> provideJsonToBotChangedMapper(GenderFromBackendString genderFromBackendString, EthnicityFromBackendValueMapper ethnicityFromBackendValueMapper, PersonalityFromBackendValueMapper personalityFromBackendValueMapper) {
        return (Mapper) Preconditions.checkNotNullFromProvides(MessagesModule.Companion.provideJsonToBotChangedMapper(genderFromBackendString, ethnicityFromBackendValueMapper, personalityFromBackendValueMapper));
    }
}
