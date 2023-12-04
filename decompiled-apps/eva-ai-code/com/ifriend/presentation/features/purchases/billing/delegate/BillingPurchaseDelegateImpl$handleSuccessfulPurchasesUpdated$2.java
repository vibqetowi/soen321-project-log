package com.ifriend.presentation.features.purchases.billing.delegate;

import com.android.billingclient.api.Purchase;
import com.ifriend.presentation.features.purchases.billing.models.PurchaseReason;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2", f = "BillingPurchaseDelegate.kt", i = {}, l = {217, 219, 223, 224}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<Purchase> $purchases;
    int label;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, List<? extends Purchase> list, Continuation<? super BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2> continuation) {
        super(2, continuation);
        this.this$0 = billingPurchaseDelegateImpl;
        this.$purchases = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2(this.this$0, this.$purchases, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingPurchaseDelegateImpl$handleSuccessfulPurchasesUpdated$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PurchaseReason purchaseReason;
        PurchaseReason purchaseReason2;
        Object buyChatMessages;
        Object generateAvatar;
        String str;
        Object buyProductSuccessful;
        Object handleBuyChatSubscriptionSuccessful;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            purchaseReason = this.this$0.purchaseReason;
            if (Intrinsics.areEqual(purchaseReason, PurchaseReason.Purchase.INSTANCE)) {
                str = this.this$0.chatId;
                if (!StringsKt.isBlank(str)) {
                    this.label = 1;
                    handleBuyChatSubscriptionSuccessful = this.this$0.handleBuyChatSubscriptionSuccessful(this.$purchases, this);
                    if (handleBuyChatSubscriptionSuccessful == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    this.label = 2;
                    buyProductSuccessful = this.this$0.buyProductSuccessful(this.$purchases, this);
                    if (buyProductSuccessful == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (purchaseReason instanceof PurchaseReason.GenerateAvatar) {
                this.label = 3;
                generateAvatar = this.this$0.generateAvatar(this.$purchases, this);
                if (generateAvatar == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (!(purchaseReason instanceof PurchaseReason.BuyMessage)) {
                throw new NoWhenBranchMatchedException();
            } else {
                BillingPurchaseDelegateImpl billingPurchaseDelegateImpl = this.this$0;
                purchaseReason2 = billingPurchaseDelegateImpl.purchaseReason;
                this.label = 4;
                buyChatMessages = billingPurchaseDelegateImpl.buyChatMessages((PurchaseReason.BuyMessage) purchaseReason2, this.$purchases, this);
                if (buyChatMessages == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else if (i != 1 && i != 2 && i != 3 && i != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
