package com.ifriend.chat.data.chat.sending;

import com.facebook.share.internal.ShareConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl", f = "ChatMessagesRepositoryImpl.kt", i = {0, 0, 0, 1, 1}, l = {389, 123}, m = "sendQueuedMessage", n = {"this", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl$sendQueuedMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessagesRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRepositoryImpl$sendQueuedMessage$1(ChatMessagesRepositoryImpl chatMessagesRepositoryImpl, Continuation<? super ChatMessagesRepositoryImpl$sendQueuedMessage$1> continuation) {
        super(continuation);
        this.this$0 = chatMessagesRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendQueuedMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendQueuedMessage = this.this$0.sendQueuedMessage(null, this);
        return sendQueuedMessage;
    }
}
