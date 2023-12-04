package com.ifriend.domain.newChat.chat.systems.messages.sending.send;

import com.ifriend.common_entities_engine.Event;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendMessageEvent.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendMessageEvent;", "Lcom/ifriend/common_entities_engine/Event;", "messageToSend", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend;)V", "getMessageToSend", "()Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SendMessageEvent implements Event {
    private final MessageToSend messageToSend;

    public SendMessageEvent(MessageToSend messageToSend) {
        Intrinsics.checkNotNullParameter(messageToSend, "messageToSend");
        this.messageToSend = messageToSend;
    }

    public final MessageToSend getMessageToSend() {
        return this.messageToSend;
    }
}
