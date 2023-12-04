package com.ifriend.data.socket.mapper;

import androidx.autofill.HintConstants;
import com.ifriend.data.mappers.EthnicityFromBackendValueMapper;
import com.ifriend.data.mappers.GenderFromBackendString;
import com.ifriend.data.mappers.PersonalityFromBackendValueMapper;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.profile.Birthday;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToBotDataChangedMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToBotDataChangedMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$BotDataChanged;", "genderMapper", "Lcom/ifriend/data/mappers/GenderFromBackendString;", "ethnicityMapper", "Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;", "personalityMapper", "Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;", "(Lcom/ifriend/data/mappers/GenderFromBackendString;Lcom/ifriend/data/mappers/EthnicityFromBackendValueMapper;Lcom/ifriend/data/mappers/PersonalityFromBackendValueMapper;)V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToBotDataChangedMapper implements Mapper<JSONObject, MessagesSourceMessage.BotDataChanged> {
    private final EthnicityFromBackendValueMapper ethnicityMapper;
    private final GenderFromBackendString genderMapper;
    private final PersonalityFromBackendValueMapper personalityMapper;

    public JsonToBotDataChangedMapper(GenderFromBackendString genderMapper, EthnicityFromBackendValueMapper ethnicityMapper, PersonalityFromBackendValueMapper personalityMapper) {
        Intrinsics.checkNotNullParameter(genderMapper, "genderMapper");
        Intrinsics.checkNotNullParameter(ethnicityMapper, "ethnicityMapper");
        Intrinsics.checkNotNullParameter(personalityMapper, "personalityMapper");
        this.genderMapper = genderMapper;
        this.ethnicityMapper = ethnicityMapper;
        this.personalityMapper = personalityMapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        if ((r11 != null ? r11 instanceof org.json.JSONObject : true) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
        if ((r0 instanceof java.lang.String) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
        if ((r1 instanceof java.lang.String) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0088, code lost:
        if ((r1 instanceof java.lang.String) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a2, code lost:
        if ((r1 instanceof java.lang.String) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r11 != null ? r11 instanceof org.json.JSONObject : true) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessagesSourceMessage.BotDataChanged map(JSONObject from) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Intrinsics.checkNotNullParameter(from, "from");
        String str = null;
        if (from.has(SocketMessageKeys.DETAILS_KEY)) {
            obj = from.get(SocketMessageKeys.DETAILS_KEY);
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return (MessagesSourceMessage.BotDataChanged) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("newValue")) {
            obj2 = jSONObject.get("newValue");
        }
        obj2 = null;
        JSONObject jSONObject2 = (JSONObject) obj2;
        if (jSONObject2 == null) {
            return (MessagesSourceMessage.BotDataChanged) UtilsKt.unexpectedNull();
        }
        if (jSONObject2.has("name")) {
            obj3 = jSONObject2.get("name");
        }
        obj3 = null;
        String str2 = (String) obj3;
        GenderFromBackendString genderFromBackendString = this.genderMapper;
        if (jSONObject2.has(HintConstants.AUTOFILL_HINT_GENDER)) {
            obj4 = jSONObject2.get(HintConstants.AUTOFILL_HINT_GENDER);
        }
        obj4 = null;
        Gender map = genderFromBackendString.map((String) obj4);
        Birthday.Companion companion = Birthday.Companion;
        if (jSONObject2.has("birthday")) {
            obj5 = jSONObject2.get("birthday");
        }
        obj5 = null;
        Birthday fromDatetime = companion.fromDatetime((String) obj5);
        EthnicityFromBackendValueMapper ethnicityFromBackendValueMapper = this.ethnicityMapper;
        if (jSONObject2.has("ethnicity")) {
            obj6 = jSONObject2.get("ethnicity");
        }
        obj6 = null;
        Ethnicity map2 = ethnicityFromBackendValueMapper.map((String) obj6);
        PersonalityFromBackendValueMapper personalityFromBackendValueMapper = this.personalityMapper;
        if (jSONObject2.has("personality")) {
            Object obj7 = jSONObject2.get("personality");
            if (obj7 instanceof String) {
                str = obj7;
            }
        }
        return new MessagesSourceMessage.BotDataChanged(str2, map, fromDatetime, map2, personalityFromBackendValueMapper.map(str));
    }
}
