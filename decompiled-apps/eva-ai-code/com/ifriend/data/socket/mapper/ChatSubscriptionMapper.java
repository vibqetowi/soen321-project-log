package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatSubscriptionRemote;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: ChatSubscriptionMapper.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ifriend/data/socket/mapper/ChatSubscriptionMapper;", "", "gson", "Lcom/google/gson/Gson;", "(Lcom/google/gson/Gson;)V", "map", "Lcom/ifriend/domain/socket/MessagesSourceMessage$Chat$ChatSubscription;", "json", "Lorg/json/JSONObject;", "isAvailable", "", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatSubscriptionMapper {
    private final Gson gson;

    @Inject
    public ChatSubscriptionMapper(Gson gson) {
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.gson = gson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
        if ((r4 instanceof org.json.JSONObject) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessagesSourceMessage.Chat.ChatSubscription map(JSONObject json, boolean z) {
        Object obj;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            if (json.has(SocketMessageKeys.DETAILS_KEY)) {
                obj = json.get(SocketMessageKeys.DETAILS_KEY);
            }
            obj = null;
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return (MessagesSourceMessage.Chat.ChatSubscription) UtilsKt.unexpectedNull();
            }
            return new MessagesSourceMessage.Chat.ChatSubscription(((ChatSubscriptionRemote) this.gson.fromJson(jSONObject.toString(), new TypeToken<ChatSubscriptionRemote>() { // from class: com.ifriend.data.socket.mapper.ChatSubscriptionMapper$map$messageTypeToken$1
            }.getType())).getChatId(), z);
        } catch (Throwable unused) {
            return null;
        }
    }
}
