package com.ifriend.data.storages.neurones;

import io.grpc.netty.shaded.io.netty.internal.tcnative.SSL;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NeuronsCostsStorageImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.storages.neurones.NeuronsCostsStorageImpl", f = "NeuronsCostsStorageImpl.kt", i = {0, 1, 1}, l = {LockFreeTaskQueueCore.CLOSED_SHIFT, SSL.SSL_PROTOCOL_TLS, 63}, m = "freeGenerationsAmount", n = {"this", "this", "authData"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes6.dex */
public final class NeuronsCostsStorageImpl$freeGenerationsAmount$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NeuronsCostsStorageImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NeuronsCostsStorageImpl$freeGenerationsAmount$1(NeuronsCostsStorageImpl neuronsCostsStorageImpl, Continuation<? super NeuronsCostsStorageImpl$freeGenerationsAmount$1> continuation) {
        super(continuation);
        this.this$0 = neuronsCostsStorageImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object freeGenerationsAmount;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        freeGenerationsAmount = this.this$0.freeGenerationsAmount(this);
        return freeGenerationsAmount;
    }
}
