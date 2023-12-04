package com.ifriend.chat.domain.billing;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ShowRateAppAfterPurchaseUseCase.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.ifriend.chat.domain.billing.ShowRateAppAfterPurchaseUseCase", f = "ShowRateAppAfterPurchaseUseCase.kt", i = {0, 0, 1, 2}, l = {20, 24, 29}, m = "showIfNeed", n = {"this", "purchaseType", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes6.dex */
public final class ShowRateAppAfterPurchaseUseCase$showIfNeed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ShowRateAppAfterPurchaseUseCase this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShowRateAppAfterPurchaseUseCase$showIfNeed$1(ShowRateAppAfterPurchaseUseCase showRateAppAfterPurchaseUseCase, Continuation<? super ShowRateAppAfterPurchaseUseCase$showIfNeed$1> continuation) {
        super(continuation);
        this.this$0 = showRateAppAfterPurchaseUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.showIfNeed(null, this);
    }
}
