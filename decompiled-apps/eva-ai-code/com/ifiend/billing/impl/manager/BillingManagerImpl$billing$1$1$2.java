package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.manager.BillingManagerImpl$billing$1$1$2", f = "BillingManagerImpl.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingManagerImpl$billing$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BillingResult $billingResult;
    final /* synthetic */ List<Purchase> $purchases;
    int label;
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$billing$1$1$2(BillingManagerImpl billingManagerImpl, BillingResult billingResult, List<Purchase> list, Continuation<? super BillingManagerImpl$billing$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = billingManagerImpl;
        this.$billingResult = billingResult;
        this.$purchases = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingManagerImpl$billing$1$1$2(this.this$0, this.$billingResult, this.$purchases, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingManagerImpl$billing$1$1$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleUpdates;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BillingManagerImpl billingManagerImpl = this.this$0;
            BillingResult billingResult = this.$billingResult;
            Intrinsics.checkNotNullExpressionValue(billingResult, "$billingResult");
            this.label = 1;
            handleUpdates = billingManagerImpl.handleUpdates(billingResult, this.$purchases, this);
            if (handleUpdates == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
