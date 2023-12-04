package com.ifriend.data.socket;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: SocketMessagesSource.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "it", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.data.socket.SocketMessagesSource$waitUntilRunning$2", f = "SocketMessagesSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
final class SocketMessagesSource$waitUntilRunning$2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SocketMessagesSource$waitUntilRunning$2(Continuation<? super SocketMessagesSource$waitUntilRunning$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SocketMessagesSource$waitUntilRunning$2 socketMessagesSource$waitUntilRunning$2 = new SocketMessagesSource$waitUntilRunning$2(continuation);
        socketMessagesSource$waitUntilRunning$2.Z$0 = ((Boolean) obj).booleanValue();
        return socketMessagesSource$waitUntilRunning$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(bool.booleanValue(), continuation);
    }

    public final Object invoke(boolean z, Continuation<? super Boolean> continuation) {
        return ((SocketMessagesSource$waitUntilRunning$2) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.Z$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
