package com.ifriend.data.mappers;

import com.ifriend.domain.models.profile.bot.Personality;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PersonalityMappers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;", "", "()V", "map", "Lcom/ifriend/domain/models/profile/bot/Personality;", "from", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalityFromBackendValueMapper {
    public final Personality map(String str) {
        if (Intrinsics.areEqual(str, "flirty")) {
            return Personality.FLIRTY;
        }
        if (Intrinsics.areEqual(str, "friendly")) {
            return Personality.FRIENDLY;
        }
        return null;
    }
}
