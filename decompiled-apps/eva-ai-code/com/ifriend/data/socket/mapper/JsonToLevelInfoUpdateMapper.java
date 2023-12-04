package com.ifriend.data.socket.mapper;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToLevelInfoUpdateMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToLevelInfoUpdateMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$LevelInfoUpdate;", "()V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToLevelInfoUpdateMapper implements Mapper<JSONObject, MessagesSourceMessage.LevelInfoUpdate> {
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0135, code lost:
        if ((r8 != null ? r8 instanceof java.lang.String : true) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x014d, code lost:
        if ((r12 != null ? r12 instanceof org.json.JSONObject : true) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r0 != null ? r0 instanceof java.lang.String : true) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        if ((r1 != null ? r1 instanceof org.json.JSONObject : true) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x007e, code lost:
        if ((r4 != null ? r4 instanceof java.lang.Integer : true) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x009c, code lost:
        if ((r5 != null ? r5 instanceof java.lang.Integer : true) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
        if ((r1 != null ? r1 instanceof java.lang.Integer : true) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d8, code lost:
        if ((r12 != null ? r12 instanceof org.json.JSONObject : true) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f9, code lost:
        if ((r6 != null ? r6 instanceof java.lang.Integer : true) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0117, code lost:
        if ((r7 != null ? r7 instanceof java.lang.Integer : true) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r12 != null ? r12 instanceof org.json.JSONObject : true) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessagesSourceMessage.LevelInfoUpdate map(JSONObject from) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Intrinsics.checkNotNullParameter(from, "from");
        String str = null;
        if (from.has(SocketMessageKeys.DETAILS_KEY)) {
            obj = from.get(SocketMessageKeys.DETAILS_KEY);
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("userId")) {
            obj2 = jSONObject.get("userId");
        }
        obj2 = null;
        String str2 = (String) obj2;
        if (str2 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("current")) {
            obj3 = jSONObject.get("current");
        }
        obj3 = null;
        JSONObject jSONObject2 = (JSONObject) obj3;
        if (jSONObject2 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        if (jSONObject2.has(FirebaseAnalytics.Param.LEVEL)) {
            obj4 = jSONObject2.get(FirebaseAnalytics.Param.LEVEL);
        }
        obj4 = null;
        Integer num = (Integer) obj4;
        if (num == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        int intValue = num.intValue();
        if (jSONObject2.has("currentPoints")) {
            obj5 = jSONObject2.get("currentPoints");
        }
        obj5 = null;
        Integer num2 = (Integer) obj5;
        if (num2 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        int intValue2 = num2.intValue();
        if (jSONObject2.has("nextLevelPoints")) {
            obj6 = jSONObject2.get("nextLevelPoints");
        }
        obj6 = null;
        Integer num3 = (Integer) obj6;
        if (num3 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        int intValue3 = num3.intValue();
        if (jSONObject.has("changes")) {
            obj7 = jSONObject.get("changes");
        }
        obj7 = null;
        JSONObject jSONObject3 = (JSONObject) obj7;
        if (jSONObject3 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        if (jSONObject3.has("experienceChanged")) {
            obj8 = jSONObject3.get("experienceChanged");
        }
        obj8 = null;
        Integer num4 = (Integer) obj8;
        if (num4 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        int intValue4 = num4.intValue();
        if (jSONObject3.has("levelChanged")) {
            obj9 = jSONObject3.get("levelChanged");
        }
        obj9 = null;
        Integer num5 = (Integer) obj9;
        if (num5 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        int intValue5 = num5.intValue();
        if (jSONObject3.has("levelChangedMessage")) {
            obj10 = jSONObject3.get("levelChangedMessage");
        }
        obj10 = null;
        String str3 = (String) obj10;
        if (jSONObject3.has("reason")) {
            obj11 = jSONObject3.get("reason");
        }
        obj11 = null;
        JSONObject jSONObject4 = (JSONObject) obj11;
        if (jSONObject4 == null) {
            return (MessagesSourceMessage.LevelInfoUpdate) UtilsKt.unexpectedNull();
        }
        if (jSONObject4.has("messageTag")) {
            Object obj12 = jSONObject4.get("messageTag");
            if (obj12 != null ? obj12 instanceof String : true) {
                str = obj12;
            }
        }
        return new MessagesSourceMessage.LevelInfoUpdate(str2, new MessagesSourceMessage.LevelInfoUpdate.CurrentLevelInfo(intValue, intValue2, intValue3), new MessagesSourceMessage.LevelInfoUpdate.Changes(intValue4, intValue5, str3, new MessagesSourceMessage.LevelInfoUpdate.Changes.Reason(str)));
    }
}
