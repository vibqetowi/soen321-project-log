package com.ifriend.core.remote.common;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: retry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.core.remote.common.RetryKt", f = "retry.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {15, 18, 21}, m = "retryRemoteRequest", n = {"block", "currentDelay", "maxDelayMillis", "factor", "block", "currentDelay", "maxDelayMillis", "factor"}, s = {"L$0", "L$1", "J$0", "D$0", "L$0", "L$1", "J$0", "D$0"})
/* loaded from: classes6.dex */
public final class RetryKt$retryRemoteRequest$1<T> extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RetryKt$retryRemoteRequest$1(Continuation<? super RetryKt$retryRemoteRequest$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RetryKt.retryRemoteRequest(0, 0L, 0L, 0.0d, null, this);
    }
}
