package com.ifriend.chat.data.chat.sending.queue;

import com.facebook.share.internal.ShareConstants;
import com.ifriend.domain.newChat.chat.models.MessageToSend;
import com.ifriend.domain.newChat.chat.systems.messages.sending.send.SendingMessagesQueue;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MessageToSendToQueuedMessageMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.queue.MessageToSendToQueuedMessageMapper", f = "MessageToSendToQueuedMessageMapper.kt", i = {0, 0}, l = {18}, m = "map", n = {ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "chatId"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class MessageToSendToQueuedMessageMapper$map$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MessageToSendToQueuedMessageMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageToSendToQueuedMessageMapper$map$1(MessageToSendToQueuedMessageMapper messageToSendToQueuedMessageMapper, Continuation<? super MessageToSendToQueuedMessageMapper$map$1> continuation) {
        super(continuation);
        this.this$0 = messageToSendToQueuedMessageMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.map((MessageToSend) null, (String) null, (Continuation<? super SendingMessagesQueue.QueuedMessage>) this);
    }
}
