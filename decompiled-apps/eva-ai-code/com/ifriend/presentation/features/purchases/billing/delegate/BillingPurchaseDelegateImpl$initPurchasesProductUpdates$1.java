package com.ifriend.presentation.features.purchases.billing.delegate;

import androidx.lifecycle.ViewModel;
import com.ifriend.billing.api.models.BillingPurchasesResult;
import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "purchaseState", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1", f = "BillingPurchaseDelegate.kt", i = {}, l = {187, 191}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1 extends SuspendLambda implements Function2<BillingPurchasesResult, Continuation<? super Unit>, Object> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, ViewModel viewModel, Continuation<? super BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1> continuation) {
        super(2, continuation);
        this.this$0 = billingPurchaseDelegateImpl;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1 billingPurchaseDelegateImpl$initPurchasesProductUpdates$1 = new BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1(this.this$0, this.$$context_receiver_0, continuation);
        billingPurchaseDelegateImpl$initPurchasesProductUpdates$1.L$0 = obj;
        return billingPurchaseDelegateImpl$initPurchasesProductUpdates$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BillingPurchasesResult billingPurchasesResult, Continuation<? super Unit> continuation) {
        return ((BillingPurchaseDelegateImpl$initPurchasesProductUpdates$1) create(billingPurchasesResult, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BillingPurchasesResult billingPurchasesResult = (BillingPurchasesResult) this.L$0;
            if (billingPurchasesResult instanceof BillingPurchasesResult.Failure) {
                mutableSharedFlow2 = this.this$0.billingPurchaseState;
                this.label = 1;
                if (mutableSharedFlow2.emit(ProductPurchaseEvent.BuyProductFailure.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (Intrinsics.areEqual(billingPurchasesResult, BillingPurchasesResult.UserCanceledFailure.INSTANCE)) {
                mutableSharedFlow = this.this$0.billingPurchaseState;
                this.label = 2;
                if (mutableSharedFlow.emit(ProductPurchaseEvent.BuyProductUserCanceled.INSTANCE, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (billingPurchasesResult instanceof BillingPurchasesResult.Successful) {
                this.this$0.handleSuccessfulPurchasesUpdated(this.$$context_receiver_0, ((BillingPurchasesResult.Successful) billingPurchasesResult).getPurchases());
            }
        } else if (i != 1 && i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
