package com.ifriend.data.repository.benefits;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PremiumBenefitsRepositoryImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.data.repository.benefits.PremiumBenefitsRepositoryImpl", f = "PremiumBenefitsRepositoryImpl.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2}, l = {20, 30, 40, 73}, m = "getAll", n = {"this", "botName", "$this$getAll_u24lambda_u240", "this", "botName", "$this$getAll_u24lambda_u240", "this", "botName", "$this$getAll_u24lambda_u240"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3"})
/* loaded from: classes6.dex */
public final class PremiumBenefitsRepositoryImpl$getAll$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PremiumBenefitsRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PremiumBenefitsRepositoryImpl$getAll$1(PremiumBenefitsRepositoryImpl premiumBenefitsRepositoryImpl, Continuation<? super PremiumBenefitsRepositoryImpl$getAll$1> continuation) {
        super(continuation);
        this.this$0 = premiumBenefitsRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.getAll(null, this);
    }
}
