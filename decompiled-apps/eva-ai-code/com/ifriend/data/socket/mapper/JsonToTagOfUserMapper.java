package com.ifriend.data.socket.mapper;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.TagOfUser;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToTagOfUserMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToTagOfUserMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/models/TagOfUser;", "()V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToTagOfUserMapper implements Mapper<JSONObject, TagOfUser> {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        if ((r0 != null ? r0 instanceof java.lang.String : true) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r6 != null ? r6 instanceof org.json.JSONObject : true) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TagOfUser map(JSONObject from) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(from, "from");
        String str = null;
        if (from.has(SocketMessageKeys.DETAILS_KEY)) {
            obj = from.get(SocketMessageKeys.DETAILS_KEY);
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return (TagOfUser) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has(ViewHierarchyConstants.TAG_KEY)) {
            obj2 = jSONObject.get(ViewHierarchyConstants.TAG_KEY);
        }
        obj2 = null;
        String str2 = (String) obj2;
        if (str2 == null) {
            return (TagOfUser) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("user-id")) {
            Object obj3 = jSONObject.get("user-id");
            if (obj3 != null ? obj3 instanceof String : true) {
                str = obj3;
            }
        }
        String str3 = str;
        return str3 == null ? (TagOfUser) UtilsKt.unexpectedNull() : new TagOfUser(new Tag(str2), new UserId(str3));
    }
}
