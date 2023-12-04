package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.data.networking.datasources.chat.models.response.client.ChatMessageRemote;
import com.ifriend.data.repository.chat.messages.mappers.ChatMessageMapper;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.newChat.chat.models.ChatMessage;
import com.ifriend.infrastructure.UtilsKt;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToChatMessageMapper.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToChatMessageMapper;", "", "chatMessageMapper", "Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageMapper;", "gson", "Lcom/google/gson/Gson;", "(Lcom/ifriend/data/repository/chat/messages/mappers/ChatMessageMapper;Lcom/google/gson/Gson;)V", "map", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "from", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToChatMessageMapper {
    private final ChatMessageMapper chatMessageMapper;
    private final Gson gson;

    @Inject
    public JsonToChatMessageMapper(ChatMessageMapper chatMessageMapper, Gson gson) {
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.chatMessageMapper = chatMessageMapper;
        this.gson = gson;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if ((r6 instanceof org.json.JSONObject) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object map(JSONObject jSONObject, Continuation<? super ChatMessage> continuation) {
        JsonToChatMessageMapper$map$1 jsonToChatMessageMapper$map$1;
        int i;
        Object obj;
        try {
            if (continuation instanceof JsonToChatMessageMapper$map$1) {
                jsonToChatMessageMapper$map$1 = (JsonToChatMessageMapper$map$1) continuation;
                if ((jsonToChatMessageMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                    jsonToChatMessageMapper$map$1.label -= Integer.MIN_VALUE;
                    Object obj2 = jsonToChatMessageMapper$map$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = jsonToChatMessageMapper$map$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        if (jSONObject.has(SocketMessageKeys.DETAILS_KEY)) {
                            obj = jSONObject.get(SocketMessageKeys.DETAILS_KEY);
                        }
                        obj = null;
                        JSONObject jSONObject2 = (JSONObject) obj;
                        if (jSONObject2 == null) {
                            return UtilsKt.unexpectedNull();
                        }
                        ChatMessageRemote chatMessageRemote = (ChatMessageRemote) this.gson.fromJson(jSONObject2.toString(), new TypeToken<ChatMessageRemote>() { // from class: com.ifriend.data.socket.mapper.JsonToChatMessageMapper$map$messageTypeToken$1
                        }.getType());
                        ChatMessageMapper chatMessageMapper = this.chatMessageMapper;
                        Intrinsics.checkNotNull(chatMessageRemote);
                        jsonToChatMessageMapper$map$1.label = 1;
                        obj2 = chatMessageMapper.map(chatMessageRemote, (Continuation<? super ChatMessage>) jsonToChatMessageMapper$map$1);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        ResultKt.throwOnFailure(obj2);
                    }
                    return (ChatMessage) obj2;
                }
            }
            if (i != 0) {
            }
            return (ChatMessage) obj2;
        } catch (Throwable unused) {
            return null;
        }
        jsonToChatMessageMapper$map$1 = new JsonToChatMessageMapper$map$1(this, continuation);
        Object obj22 = jsonToChatMessageMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = jsonToChatMessageMapper$map$1.label;
    }
}
