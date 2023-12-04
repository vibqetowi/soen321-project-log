package com.ifriend.core.remote.datasources.billing;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.ifriend.core.remote.datasources.billing.models.BillingVerifyPurchaseRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingVerifyPurchaseRemoteParams;
import com.ifriend.core.remote.services.AppBillingApiService;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRemoteDataSource.kt */
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource$confirmPurchase$2", f = "BillingRemoteDataSource.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE, ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource$confirmPurchase$2 extends SuspendLambda implements Function1<Continuation<? super BillingVerifyPurchaseRemote>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ Double $price;
    final /* synthetic */ String $receipt;
    Object L$0;
    int label;
    final /* synthetic */ BillingRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRemoteDataSource$confirmPurchase$2(BillingRemoteDataSource billingRemoteDataSource, Double d, String str, String str2, Continuation<? super BillingRemoteDataSource$confirmPurchase$2> continuation) {
        super(1, continuation);
        this.this$0 = billingRemoteDataSource;
        this.$price = d;
        this.$receipt = str;
        this.$currency = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingRemoteDataSource$confirmPurchase$2(this.this$0, this.$price, this.$receipt, this.$currency, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super BillingVerifyPurchaseRemote> continuation) {
        return ((BillingRemoteDataSource$confirmPurchase$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppBillingApiService appBillingApiService;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            appBillingApiService = this.this$0.apiService;
            this.L$0 = appBillingApiService;
            this.label = 1;
            obj = this.this$0.provideUserId(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        } else {
            appBillingApiService = (AppBillingApiService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        Double d = this.$price;
        BillingVerifyPurchaseRemoteParams.Meta meta = d != null ? new BillingVerifyPurchaseRemoteParams.Meta(d.doubleValue(), this.$currency) : null;
        this.L$0 = null;
        this.label = 2;
        obj = appBillingApiService.confirmPurchase(str, new BillingVerifyPurchaseRemoteParams("android", this.$receipt, "google", meta), this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
