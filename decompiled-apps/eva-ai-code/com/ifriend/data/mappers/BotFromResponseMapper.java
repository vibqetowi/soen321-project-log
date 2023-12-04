package com.ifriend.data.mappers;

import com.ifriend.data.networking.responses.BotDataResponse;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BotMappers.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/mappers/BotFromResponseMapper;", "", "toEthnicityMapper", "Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;", "toPersonalityMapper", "Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;", "toGenderMapper", "Lcom/ifriend/data/mappers/GenderFromBackendString;", "(Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;Lcom/ifriend/data/mappers/GenderFromBackendString;)V", "map", "Lcom/ifriend/domain/models/profile/bot/Bot;", "from", "Lcom/ifriend/data/networking/responses/BotDataResponse;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BotFromResponseMapper {
    private final EthnicityFromBackendValueMapper toEthnicityMapper;
    private final GenderFromBackendString toGenderMapper;
    private final PersonalityFromBackendValueMapper toPersonalityMapper;

    @Inject
    public BotFromResponseMapper(EthnicityFromBackendValueMapper toEthnicityMapper, PersonalityFromBackendValueMapper toPersonalityMapper, GenderFromBackendString toGenderMapper) {
        Intrinsics.checkNotNullParameter(toEthnicityMapper, "toEthnicityMapper");
        Intrinsics.checkNotNullParameter(toPersonalityMapper, "toPersonalityMapper");
        Intrinsics.checkNotNullParameter(toGenderMapper, "toGenderMapper");
        this.toEthnicityMapper = toEthnicityMapper;
        this.toPersonalityMapper = toPersonalityMapper;
        this.toGenderMapper = toGenderMapper;
    }

    public final Bot map(BotDataResponse from) {
        Intrinsics.checkNotNullParameter(from, "from");
        String name = from.getName();
        GenderFromBackendString genderFromBackendString = this.toGenderMapper;
        String gender = from.getGender();
        if (gender == null) {
            gender = "";
        }
        Gender map = genderFromBackendString.map(gender);
        Birthday fromDatetime = Birthday.Companion.fromDatetime(from.getBirthday());
        EthnicityFromBackendValueMapper ethnicityFromBackendValueMapper = this.toEthnicityMapper;
        String ethnicity = from.getEthnicity();
        if (ethnicity == null) {
            ethnicity = "";
        }
        Ethnicity map2 = ethnicityFromBackendValueMapper.map(ethnicity);
        PersonalityFromBackendValueMapper personalityFromBackendValueMapper = this.toPersonalityMapper;
        String personality = from.getPersonality();
        return new Bot(name, map, fromDatetime, map2, personalityFromBackendValueMapper.map(personality != null ? personality : ""), null, 32, null);
    }
}
