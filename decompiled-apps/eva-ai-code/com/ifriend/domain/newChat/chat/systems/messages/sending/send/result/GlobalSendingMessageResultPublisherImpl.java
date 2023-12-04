package com.ifriend.domain.newChat.chat.systems.messages.sending.send.result;

import com.ifriend.domain.newChat.chat.models.MessageToSend;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: GlobalSendingMessageResultPublisherImpl.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisherImpl;", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/GlobalSendingMessageResultPublisher;", "()V", "observers", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "addObserver", "", "observer", "post", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult;", "removeObserver", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GlobalSendingMessageResultPublisherImpl implements GlobalSendingMessageResultPublisher {
    private final List<SendingMessageResultObserver> observers = new ArrayList();

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher
    public void post(MessageToSend.SendingResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (!(result instanceof MessageToSend.SendingResult.Success)) {
            if (result instanceof MessageToSend.SendingResult.Error) {
                for (SendingMessageResultObserver sendingMessageResultObserver : this.observers) {
                    sendingMessageResultObserver.onError((MessageToSend.SendingResult.Error) result);
                }
                return;
            }
            return;
        }
        for (SendingMessageResultObserver sendingMessageResultObserver2 : this.observers) {
            sendingMessageResultObserver2.onSuccess((MessageToSend.SendingResult.Success) result);
        }
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher
    public void addObserver(SendingMessageResultObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.add(observer);
    }

    @Override // com.ifriend.domain.newChat.chat.systems.messages.sending.send.result.GlobalSendingMessageResultPublisher
    public void removeObserver(SendingMessageResultObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        this.observers.remove(observer);
    }
}
