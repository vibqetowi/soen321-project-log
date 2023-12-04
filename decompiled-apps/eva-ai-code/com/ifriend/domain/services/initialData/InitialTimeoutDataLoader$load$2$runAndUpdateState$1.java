package com.ifriend.domain.services.initialData;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InitialTimeoutDataLoader.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.domain.services.initialData.InitialTimeoutDataLoader$load$2", f = "InitialTimeoutDataLoader.kt", i = {0}, l = {21}, m = "invokeSuspend$runAndUpdateState", n = {"success"}, s = {"L$0"})
/* loaded from: classes6.dex */
public final class InitialTimeoutDataLoader$load$2$runAndUpdateState$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InitialTimeoutDataLoader$load$2$runAndUpdateState$1(Continuation<? super InitialTimeoutDataLoader$load$2$runAndUpdateState$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return InitialTimeoutDataLoader$load$2.invokeSuspend$runAndUpdateState(null, null, null, this);
    }
}
