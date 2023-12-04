package com.ifriend.data.socket.mapper;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SocketMessageToMessagesSourceMessageMapper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.mapper.SocketMessageToMessagesSourceMessageMapper", f = "SocketMessageToMessagesSourceMessageMapper.kt", i = {}, l = {36, 45}, m = "toMessagesSourceMessage", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SocketMessageToMessagesSourceMessageMapper this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1(SocketMessageToMessagesSourceMessageMapper socketMessageToMessagesSourceMessageMapper, Continuation<? super SocketMessageToMessagesSourceMessageMapper$toMessagesSourceMessage$1> continuation) {
        super(continuation);
        this.this$0 = socketMessageToMessagesSourceMessageMapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object messagesSourceMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        messagesSourceMessage = this.this$0.toMessagesSourceMessage(null, this);
        return messagesSourceMessage;
    }
}
