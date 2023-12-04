package com.ifriend.presentation.features.chatsettings.mappers;

import com.ifriend.presentation.common.mappers.GenderMapper;
import com.ifriend.presentation.common.mappers.PersonalityMapper;
import dagger.internal.Factory;
import javax.inject.Provider;
/* loaded from: classes6.dex */
public final class ChatSettingsActionTagsMapperUi_Factory implements Factory<ChatSettingsActionTagsMapperUi> {
    private final Provider<GenderMapper> genderMapperProvider;
    private final Provider<PersonalityMapper> personalityMapperProvider;

    public ChatSettingsActionTagsMapperUi_Factory(Provider<GenderMapper> provider, Provider<PersonalityMapper> provider2) {
        this.genderMapperProvider = provider;
        this.personalityMapperProvider = provider2;
    }

    @Override // javax.inject.Provider
    public ChatSettingsActionTagsMapperUi get() {
        return newInstance(this.genderMapperProvider.get(), this.personalityMapperProvider.get());
    }

    public static ChatSettingsActionTagsMapperUi_Factory create(Provider<GenderMapper> provider, Provider<PersonalityMapper> provider2) {
        return new ChatSettingsActionTagsMapperUi_Factory(provider, provider2);
    }

    public static ChatSettingsActionTagsMapperUi newInstance(GenderMapper genderMapper, PersonalityMapper personalityMapper) {
        return new ChatSettingsActionTagsMapperUi(genderMapper, personalityMapper);
    }
}
