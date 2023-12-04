package com.ifriend.data.socket.mapper;

import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToNeuronsSpentMapper.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToDailyNeuronsReceivedMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$DailyNeuronsReceived;", "()V", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToDailyNeuronsReceivedMapper implements Mapper<JSONObject, MessagesSourceMessage.DailyNeuronsReceived> {
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if ((r5 != null ? r5 instanceof org.json.JSONObject : true) != false) goto L4;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessagesSourceMessage.DailyNeuronsReceived map(JSONObject from) {
        Object obj;
        Intrinsics.checkNotNullParameter(from, "from");
        Integer num = null;
        if (from.has(SocketMessageKeys.DETAILS_KEY)) {
            obj = from.get(SocketMessageKeys.DETAILS_KEY);
        }
        obj = null;
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject == null) {
            return (MessagesSourceMessage.DailyNeuronsReceived) UtilsKt.unexpectedNull();
        }
        if (jSONObject.has("amount")) {
            Object obj2 = jSONObject.get("amount");
            if (obj2 != null ? obj2 instanceof Integer : true) {
                num = obj2;
            }
        }
        Integer num2 = num;
        if (num2 == null) {
            return (MessagesSourceMessage.DailyNeuronsReceived) UtilsKt.unexpectedNull();
        }
        return new MessagesSourceMessage.DailyNeuronsReceived(num2.intValue());
    }
}
