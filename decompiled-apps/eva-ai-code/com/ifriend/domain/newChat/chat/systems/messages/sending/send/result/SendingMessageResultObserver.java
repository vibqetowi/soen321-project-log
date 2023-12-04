package com.ifriend.domain.newChat.chat.systems.messages.sending.send.result;

import com.ifriend.domain.newChat.chat.models.MessageToSend;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* compiled from: SendingMessageResultObserver.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/result/SendingMessageResultObserver;", "", "onError", "", "error", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Error;", "onSuccess", "result", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend$SendingResult$Success;", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SendingMessageResultObserver {

    /* compiled from: SendingMessageResultObserver.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onError(SendingMessageResultObserver sendingMessageResultObserver, MessageToSend.SendingResult.Error error) {
            Intrinsics.checkNotNullParameter(error, "error");
        }

        public static void onSuccess(SendingMessageResultObserver sendingMessageResultObserver, MessageToSend.SendingResult.Success result) {
            Intrinsics.checkNotNullParameter(result, "result");
        }
    }

    void onError(MessageToSend.SendingResult.Error error);

    void onSuccess(MessageToSend.SendingResult.Success success);
}
