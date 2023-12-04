package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: ChatRemovedMessageMapper.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/ChatRemovedMessageMapper;", "", "()V", "map", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$MessageRemoved;", "json", "Lorg/json/JSONObject;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatRemovedMessageMapper {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
        if ((r0 instanceof java.lang.String) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0016, code lost:
        if ((r6 instanceof org.json.JSONObject) != false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessagesSourceMessage.Chat.MessageRemoved map(JSONObject json) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(json, "json");
        String str = null;
        if (json.has(SocketMessageKeys.DETAILS_KEY)) {
            obj = json.get(SocketMessageKeys.DETAILS_KEY);
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return (MessagesSourceMessage.Chat.MessageRemoved) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("id")) {
            obj2 = jSONObject.get("id");
        }
        obj2 = null;
        String str2 = (String) obj2;
        if (str2 == null) {
            str2 = "";
        }
        if (jSONObject.has("sender")) {
            Object obj3 = jSONObject.get("sender");
            if (obj3 instanceof String) {
                str = obj3;
            }
        }
        String str3 = str;
        return new MessagesSourceMessage.Chat.MessageRemoved(str3 != null ? str3 : "", str2);
    }
}
