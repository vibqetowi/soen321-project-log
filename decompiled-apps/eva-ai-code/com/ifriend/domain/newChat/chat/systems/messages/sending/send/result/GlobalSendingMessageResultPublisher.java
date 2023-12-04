package com.ifriend.domain.newChat.chat.systems.messages.sending.send.result;

import com.ifriend.domain.newChat.chat.models.MessageToSend;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GlobalSendingMessageResultPublisher.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "", "addObserver", "", "observer", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "post", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", "removeObserver", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface GlobalSendingMessageResultPublisher {
    void addObserver(SendingMessageResultObserver sendingMessageResultObserver);

    void post(MessageToSend.SendingResult sendingResult);

    void removeObserver(SendingMessageResultObserver sendingMessageResultObserver);
}
