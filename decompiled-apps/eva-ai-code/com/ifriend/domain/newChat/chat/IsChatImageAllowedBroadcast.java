package com.ifriend.domain.newChat.chat;

import com.ifriend.domain.newChat.chat.models.ChatMessage;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import org.apache.http.cookie.ClientCookie;
/* compiled from: IsChatImageAllowedBroadcast.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H¦Bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"Lcom/ifriend/domain/newChat/chat/IsChatImageAllowedBroadcast;", "", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "chatMessage", "Lcom/ifriend/domain/newChat/chat/models/ChatMessage;", "(Lcom/ifriend/domain/newChat/chat/models/ChatMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface IsChatImageAllowedBroadcast {
    Object invoke(ChatMessage chatMessage, Continuation<? super Flow<Boolean>> continuation);
}
