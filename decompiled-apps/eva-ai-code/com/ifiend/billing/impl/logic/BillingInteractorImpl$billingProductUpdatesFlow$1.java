package com.ifiend.billing.impl.logic;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifiend.billing.impl.manager.PurchasesUpdatedState;
import com.ifriend.billing.api.models.BillingPurchasesResult;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingInteractorImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "state", "Lcom/ifriend/billing/api/models/BillingPurchasesResult;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.logic.BillingInteractorImpl$billingProductUpdatesFlow$1", f = "BillingInteractorImpl.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingInteractorImpl$billingProductUpdatesFlow$1 extends SuspendLambda implements Function2<PurchasesUpdatedState, Continuation<? super BillingPurchasesResult>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BillingInteractorImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingInteractorImpl$billingProductUpdatesFlow$1(BillingInteractorImpl billingInteractorImpl, Continuation<? super BillingInteractorImpl$billingProductUpdatesFlow$1> continuation) {
        super(2, continuation);
        this.this$0 = billingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BillingInteractorImpl$billingProductUpdatesFlow$1 billingInteractorImpl$billingProductUpdatesFlow$1 = new BillingInteractorImpl$billingProductUpdatesFlow$1(this.this$0, continuation);
        billingInteractorImpl$billingProductUpdatesFlow$1.L$0 = obj;
        return billingInteractorImpl$billingProductUpdatesFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PurchasesUpdatedState purchasesUpdatedState, Continuation<? super BillingPurchasesResult> continuation) {
        return ((BillingInteractorImpl$billingProductUpdatesFlow$1) create(purchasesUpdatedState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PurchasesUpdatedState purchasesUpdatedState = (PurchasesUpdatedState) this.L$0;
            if (purchasesUpdatedState instanceof PurchasesUpdatedState.Failure) {
                if (((PurchasesUpdatedState.Failure) purchasesUpdatedState).getResponseCode() == 1) {
                    return BillingPurchasesResult.UserCanceledFailure.INSTANCE;
                }
                return BillingPurchasesResult.Failure.INSTANCE;
            } else if (purchasesUpdatedState instanceof PurchasesUpdatedState.Successful) {
                this.label = 1;
                obj = this.this$0.handleSuccessfulPurchases(((PurchasesUpdatedState.Successful) purchasesUpdatedState).getPurchase(), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (Intrinsics.areEqual(purchasesUpdatedState, PurchasesUpdatedState.SuccessfulWithEmptyPurchase.INSTANCE)) {
                return new BillingPurchasesResult.Successful(CollectionsKt.emptyList());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return (BillingPurchasesResult) obj;
    }
}
