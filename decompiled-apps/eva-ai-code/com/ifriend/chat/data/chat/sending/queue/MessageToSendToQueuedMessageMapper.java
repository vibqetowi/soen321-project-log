package com.ifriend.chat.data.chat.sending.queue;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.data.AuthDataProvider;
import com.ifriend.domain.data.DoubleSuspendMapper;
import com.ifriend.domain.models.profile.user.AuthData;
import com.ifriend.domain.models.profile.user.UserId;
import com.ifriend.domain.newChat.chat.models.MessageTag;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import java.util.UUID;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: MessageToSendToQueuedMessageMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J!\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/ifriend/chat/data/chat/sending/queue/MessageToSendToQueuedMessageMapper;", "Lcom/ifriend/domain/data/DoubleSuspendMapper;", "Lcom/ifriend/domain/newChat/chat/models/MessageToSend;", "", "Lcom/ifriend/domain/newChat/chat/systems/messages/sending/send/SendingMessagesQueue$QueuedMessage;", "authProvider", "Lcom/ifriend/domain/data/AuthDataProvider;", "(Lcom/ifriend/domain/data/AuthDataProvider;)V", "map", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "chatId", "(Lcom/ifriend/domain/newChat/chat/models/MessageToSend;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageToSendToQueuedMessageMapper implements DoubleSuspendMapper<MessageToSend, String, SendingMessagesQueue.QueuedMessage> {
    private final AuthDataProvider authProvider;

    @Inject
    public MessageToSendToQueuedMessageMapper(AuthDataProvider authProvider) {
        Intrinsics.checkNotNullParameter(authProvider, "authProvider");
        this.authProvider = authProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0061  */
    @Override // com.ifriend.domain.data.DoubleSuspendMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object map(MessageToSend messageToSend, String str, Continuation<? super SendingMessagesQueue.QueuedMessage> continuation) {
        MessageToSendToQueuedMessageMapper$map$1 messageToSendToQueuedMessageMapper$map$1;
        int i;
        String value;
        UserId userId;
        if (continuation instanceof MessageToSendToQueuedMessageMapper$map$1) {
            messageToSendToQueuedMessageMapper$map$1 = (MessageToSendToQueuedMessageMapper$map$1) continuation;
            if ((messageToSendToQueuedMessageMapper$map$1.label & Integer.MIN_VALUE) != 0) {
                messageToSendToQueuedMessageMapper$map$1.label -= Integer.MIN_VALUE;
                Object obj = messageToSendToQueuedMessageMapper$map$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = messageToSendToQueuedMessageMapper$map$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthDataProvider authDataProvider = this.authProvider;
                    messageToSendToQueuedMessageMapper$map$1.L$0 = messageToSend;
                    messageToSendToQueuedMessageMapper$map$1.L$1 = str;
                    messageToSendToQueuedMessageMapper$map$1.label = 1;
                    obj = authDataProvider.lastAuthData(messageToSendToQueuedMessageMapper$map$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    str = (String) messageToSendToQueuedMessageMapper$map$1.L$1;
                    messageToSend = (MessageToSend) messageToSendToQueuedMessageMapper$map$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                MessageToSend messageToSend2 = messageToSend;
                String str2 = str;
                AuthData authData = (AuthData) obj;
                value = (authData != null || (userId = authData.getUserId()) == null) ? null : userId.getValue();
                if (value == null) {
                    value = "";
                }
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                long j = 1000;
                return new SendingMessagesQueue.QueuedMessage(uuid, MessageTag.Companion.createFrom(value), j * (System.currentTimeMillis() / j), messageToSend2, str2);
            }
        }
        messageToSendToQueuedMessageMapper$map$1 = new MessageToSendToQueuedMessageMapper$map$1(this, continuation);
        Object obj2 = messageToSendToQueuedMessageMapper$map$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = messageToSendToQueuedMessageMapper$map$1.label;
        if (i != 0) {
        }
        MessageToSend messageToSend22 = messageToSend;
        String str22 = str;
        AuthData authData2 = (AuthData) obj2;
        if (authData2 != null) {
        }
        if (value == null) {
        }
        String uuid2 = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
        long j2 = 1000;
        return new SendingMessagesQueue.QueuedMessage(uuid2, MessageTag.Companion.createFrom(value), j2 * (System.currentTimeMillis() / j2), messageToSend22, str22);
    }
}
