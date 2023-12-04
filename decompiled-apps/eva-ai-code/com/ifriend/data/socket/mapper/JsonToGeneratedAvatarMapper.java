package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.data.generateAvatar.AvatarGenerationStatus;
import com.ifriend.domain.models.avatar.GeneratedAvatars;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: JsonToGeneratedAvatarMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToGeneratedAvatarMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/models/avatar/GeneratedAvatars;", "()V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToGeneratedAvatarMapper implements Mapper<JSONObject, GeneratedAvatars> {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
        if ((r3 instanceof java.lang.String) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
        if ((r4 instanceof java.lang.String) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if ((r6 instanceof java.lang.String) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0086, code lost:
        if ((r9 instanceof org.json.JSONArray) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001f, code lost:
        if ((r0 instanceof java.lang.String) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public GeneratedAvatars map(JSONObject from) {
        Object obj;
        Object obj2;
        Object obj3;
        AvatarGenerationStatus avatarGenerationStatus;
        Object obj4;
        Object obj5;
        JSONObject jSONObject;
        Intrinsics.checkNotNullParameter(from, "from");
        JSONObject jSONObject2 = from.getJSONObject(SocketMessageKeys.DETAILS_KEY);
        Intrinsics.checkNotNull(jSONObject2);
        String str = null;
        if (jSONObject2.has("id")) {
            obj = jSONObject2.get("id");
        }
        obj = null;
        String str2 = (String) obj;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        if (jSONObject2.has("userId")) {
            obj2 = jSONObject2.get("userId");
        }
        obj2 = null;
        String str4 = (String) obj2;
        if (str4 == null) {
            str4 = "";
        }
        if (jSONObject2.has("status")) {
            obj3 = jSONObject2.get("status");
        }
        obj3 = null;
        if (Intrinsics.areEqual((String) obj3, "success")) {
            avatarGenerationStatus = AvatarGenerationStatus.SUCCESS;
        } else {
            avatarGenerationStatus = AvatarGenerationStatus.ERROR;
        }
        if (jSONObject2.has("description")) {
            obj4 = jSONObject2.get("description");
        }
        obj4 = null;
        String str5 = (String) obj4;
        if (str5 == null) {
            if (jSONObject2.has("avatars")) {
                obj5 = jSONObject2.get("avatars");
            }
            obj5 = null;
            JSONArray jSONArray = (JSONArray) obj5;
            if (jSONArray != null && (jSONObject = jSONArray.getJSONObject(0)) != null) {
                if (jSONObject.has("description")) {
                    Object obj6 = jSONObject.get("description");
                    if (obj6 instanceof String) {
                        str = obj6;
                    }
                }
                str = str;
            }
            if (str != null) {
                str3 = str;
            }
        } else {
            str3 = str5;
        }
        return new GeneratedAvatars(str2, str4, avatarGenerationStatus, str3);
    }
}
