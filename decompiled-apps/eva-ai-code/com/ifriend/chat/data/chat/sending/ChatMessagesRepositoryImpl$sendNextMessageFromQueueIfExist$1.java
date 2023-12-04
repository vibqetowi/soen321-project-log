package com.ifriend.chat.data.chat.sending;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatMessagesRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.data.chat.sending.ChatMessagesRepositoryImpl", f = "ChatMessagesRepositoryImpl.kt", i = {0}, l = {136, 137}, m = "sendNextMessageFromQueueIfExist", n = {"this"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ChatMessagesRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1(ChatMessagesRepositoryImpl chatMessagesRepositoryImpl, Continuation<? super ChatMessagesRepositoryImpl$sendNextMessageFromQueueIfExist$1> continuation) {
        super(continuation);
        this.this$0 = chatMessagesRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object sendNextMessageFromQueueIfExist;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        sendNextMessageFromQueueIfExist = this.this$0.sendNextMessageFromQueueIfExist(this);
        return sendNextMessageFromQueueIfExist;
    }
}
