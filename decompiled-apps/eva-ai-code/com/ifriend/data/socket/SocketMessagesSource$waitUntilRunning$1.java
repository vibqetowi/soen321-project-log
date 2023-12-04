package com.ifriend.data.socket;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SocketMessagesSource.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.socket.SocketMessagesSource", f = "SocketMessagesSource.kt", i = {}, l = {132, 137}, m = "waitUntilRunning", n = {}, s = {})
/* loaded from: classes6.dex */
public final class SocketMessagesSource$waitUntilRunning$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SocketMessagesSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocketMessagesSource$waitUntilRunning$1(SocketMessagesSource socketMessagesSource, Continuation<? super SocketMessagesSource$waitUntilRunning$1> continuation) {
        super(continuation);
        this.this$0 = socketMessagesSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.waitUntilRunning(this);
    }
}
