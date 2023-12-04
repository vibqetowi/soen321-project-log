package com.ifriend.data.mappers;

import com.ifriend.domain.models.profile.bot.Ethnicity;
import kotlin.Metadata;
/* compiled from: EthnicityMappers.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;", "", "()V", "map", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "from", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EthnicityFromBackendValueMapper {
    public final Ethnicity map(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1904309000:
                    if (str.equals("caucasian")) {
                        return Ethnicity.WHITE;
                    }
                    break;
                case -1077775052:
                    if (str.equals("african")) {
                        return Ethnicity.BLACK;
                    }
                    break;
                case 93111524:
                    if (str.equals("asian")) {
                        return Ethnicity.ASIAN;
                    }
                    break;
                case 102744836:
                    if (str.equals("latin")) {
                        return Ethnicity.LATINO;
                    }
                    break;
                case 106069776:
                    if (str.equals("other")) {
                        return Ethnicity.OTHER;
                    }
                    break;
            }
        }
        return null;
    }
}
