package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToAvatarAnimationGeneratedMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToAvatarAnimationGeneratedMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AvatarAnimationGenerated;", "()V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToAvatarAnimationGeneratedMapper implements Mapper<JSONObject, MessagesSourceMessage.AvatarAnimationGenerated> {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        if ((r1 instanceof java.lang.String) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        if ((r0 instanceof java.lang.String) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessagesSourceMessage.AvatarAnimationGenerated map(JSONObject from) {
        Object obj;
        Object obj2;
        MessagesSourceMessage.AvatarAnimationGenerated.AvatarAnimationGeneratedStatus avatarAnimationGeneratedStatus;
        Intrinsics.checkNotNullParameter(from, "from");
        JSONObject jSONObject = from.getJSONObject(SocketMessageKeys.DETAILS_KEY);
        Intrinsics.checkNotNull(jSONObject);
        String str = null;
        if (jSONObject.has("avatarId")) {
            obj = jSONObject.get("avatarId");
        }
        obj = null;
        String str2 = (String) obj;
        if (str2 == null) {
            return (MessagesSourceMessage.AvatarAnimationGenerated) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("animationPath")) {
            obj2 = jSONObject.get("animationPath");
        }
        obj2 = null;
        String str3 = (String) obj2;
        if (jSONObject.has("animationStatus")) {
            Object obj3 = jSONObject.get("animationStatus");
            if (obj3 instanceof String) {
                str = obj3;
            }
        }
        String str4 = str;
        if (Intrinsics.areEqual(str4, "no_face_detected")) {
            avatarAnimationGeneratedStatus = MessagesSourceMessage.AvatarAnimationGenerated.AvatarAnimationGeneratedStatus.NO_FACE_DETECTED;
        } else {
            avatarAnimationGeneratedStatus = Intrinsics.areEqual(str4, "success") ? MessagesSourceMessage.AvatarAnimationGenerated.AvatarAnimationGeneratedStatus.SUCCESS : MessagesSourceMessage.AvatarAnimationGenerated.AvatarAnimationGeneratedStatus.UNKNOWN;
        }
        return new MessagesSourceMessage.AvatarAnimationGenerated(str2, str3, avatarAnimationGeneratedStatus);
    }
}
