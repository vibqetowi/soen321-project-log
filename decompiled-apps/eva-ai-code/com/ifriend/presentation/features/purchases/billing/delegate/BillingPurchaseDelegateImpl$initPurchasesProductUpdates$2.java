package com.ifriend.presentation.features.purchases.billing.delegate;

import com.ifriend.domain.data.TagsProvider;
import com.ifriend.domain.models.Tag;
import com.ifriend.domain.models.TagKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingPurchaseDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.purchases.billing.delegate.BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2", f = "BillingPurchaseDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ BillingPurchaseDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2(BillingPurchaseDelegateImpl billingPurchaseDelegateImpl, Continuation<? super BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2> continuation) {
        super(2, continuation);
        this.this$0 = billingPurchaseDelegateImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingPurchaseDelegateImpl$initPurchasesProductUpdates$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TagsProvider tagsProvider;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BillingPurchaseDelegateImpl billingPurchaseDelegateImpl = this.this$0;
        tagsProvider = billingPurchaseDelegateImpl.tagsProvider;
        List<Tag> current = tagsProvider.current();
        boolean z = false;
        if (current != null && TagKt.contains(current, "customer")) {
            z = true;
        }
        billingPurchaseDelegateImpl.isCustomer = z;
        return Unit.INSTANCE;
    }
}
