package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.presentation.features.purchases.billing.models.ProductPurchaseEvent;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "throwable", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1", f = "BillingPurchaseDelegate.kt", i = {}, l = {208, 212}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1 extends SuspendLambda implements Function2<Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1> continuation) {
        super(2, continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1 billingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1 = new BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1(this.this$0, continuation);
        billingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1.L$0 = obj;
        return billingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Throwable th, Continuation<? super Unit> continuation) {
        return ((BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$1) create(th, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PurchaseReason purchaseReason;
        Object trackInAppPurchaseError;
        MutableSharedFlow mutableSharedFlow;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            BillingPurchaseDelegateImpl billingPurchaseDelegateImpl = this.this$0;
            purchaseReason = billingPurchaseDelegateImpl.purchaseReason;
            this.label = 1;
            trackInAppPurchaseError = billingPurchaseDelegateImpl.trackInAppPurchaseError(purchaseReason, (Throwable) this.L$0, this);
            if (trackInAppPurchaseError == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        mutableSharedFlow = this.this$0.billingPurchaseState;
        this.label = 2;
        if (mutableSharedFlow.emit(ProductPurchaseEvent.InAppPurchaseFailure.INSTANCE, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
