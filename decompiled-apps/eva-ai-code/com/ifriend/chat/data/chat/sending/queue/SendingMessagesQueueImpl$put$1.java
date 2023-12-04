package com.ifriend.chat.data.chat.sending.queue;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SendingMessagesQueueImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.queue.SendingMessagesQueueImpl", f = "SendingMessagesQueueImpl.kt", i = {0}, l = {21}, m = "put", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class SendingMessagesQueueImpl$put$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendingMessagesQueueImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendingMessagesQueueImpl$put$1(SendingMessagesQueueImpl sendingMessagesQueueImpl, Continuation<? super SendingMessagesQueueImpl$put$1> continuation) {
        super(continuation);
        this.this$0 = sendingMessagesQueueImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.put(null, null, this);
    }
}
