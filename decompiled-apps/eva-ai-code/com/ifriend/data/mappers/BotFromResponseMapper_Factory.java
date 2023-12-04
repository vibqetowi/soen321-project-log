package com.ifriend.data.mappers;

import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class BotFromResponseMapper_Factory implements Factory<BotFromResponseMapper> {
    private final Provider<EthnicityFromBackendValueMapper> toEthnicityMapperProvider;
    private final Provider<GenderFromBackendString> toGenderMapperProvider;
    private final Provider<PersonalityFromBackendValueMapper> toPersonalityMapperProvider;

    public BotFromResponseMapper_Factory(Provider<EthnicityFromBackendValueMapper> provider, Provider<PersonalityFromBackendValueMapper> provider2, Provider<GenderFromBackendString> provider3) {
        this.toEthnicityMapperProvider = provider;
        this.toPersonalityMapperProvider = provider2;
        this.toGenderMapperProvider = provider3;
    }

    @Override // javax.inject.Provider
    public BotFromResponseMapper get() {
        return newInstance(this.toEthnicityMapperProvider.get(), this.toPersonalityMapperProvider.get(), this.toGenderMapperProvider.get());
    }

    public static BotFromResponseMapper_Factory create(Provider<EthnicityFromBackendValueMapper> provider, Provider<PersonalityFromBackendValueMapper> provider2, Provider<GenderFromBackendString> provider3) {
        return new BotFromResponseMapper_Factory(provider, provider2, provider3);
    }

    public static BotFromResponseMapper newInstance(EthnicityFromBackendValueMapper ethnicityFromBackendValueMapper, PersonalityFromBackendValueMapper personalityFromBackendValueMapper, GenderFromBackendString genderFromBackendString) {
        return new BotFromResponseMapper(ethnicityFromBackendValueMapper, personalityFromBackendValueMapper, genderFromBackendString);
    }
}
