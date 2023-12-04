package com.ifriend.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RateUsRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.RateUsRepositoryImpl", f = "RateUsRepositoryImpl.kt", i = {0, 0}, l = {32, 19}, m = "review", n = {"this", "review"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
public final class RateUsRepositoryImpl$review$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RateUsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RateUsRepositoryImpl$review$1(RateUsRepositoryImpl rateUsRepositoryImpl, Continuation<? super RateUsRepositoryImpl$review$1> continuation) {
        super(continuation);
        this.this$0 = rateUsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.review(null, this);
    }
}
