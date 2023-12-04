package com.ifriend.core.remote.datasources.billing;

import com.ifriend.core.remote.datasources.billing.models.BillingReceiptRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingReceiptRemoteParams;
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
@Metadata(d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource$getReceipt$2", f = "BillingRemoteDataSource.kt", i = {}, l = {34, 33}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource$getReceipt$2 extends SuspendLambda implements Function1<Continuation<? super String>, Object> {
    final /* synthetic */ double $price;
    final /* synthetic */ String $productId;
    final /* synthetic */ int $quantity;
    final /* synthetic */ String $receipt;
    final /* synthetic */ String $signature;
    Object L$0;
    int label;
    final /* synthetic */ BillingRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRemoteDataSource$getReceipt$2(BillingRemoteDataSource billingRemoteDataSource, String str, String str2, int i, double d, String str3, Continuation<? super BillingRemoteDataSource$getReceipt$2> continuation) {
        super(1, continuation);
        this.this$0 = billingRemoteDataSource;
        this.$signature = str;
        this.$receipt = str2;
        this.$quantity = i;
        this.$price = d;
        this.$productId = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingRemoteDataSource$getReceipt$2(this.this$0, this.$signature, this.$receipt, this.$quantity, this.$price, this.$productId, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super String> continuation) {
        return ((BillingRemoteDataSource$getReceipt$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                String receipt = ((BillingReceiptRemote) obj).getReceipt();
                return receipt != null ? "" : receipt;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            appBillingApiService = (AppBillingApiService) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        BillingReceiptRemoteParams.GetReceiptRequisitesRequest getReceiptRequisitesRequest = new BillingReceiptRemoteParams.GetReceiptRequisitesRequest(this.$signature, this.$receipt);
        this.L$0 = null;
        this.label = 2;
        obj = appBillingApiService.getReceipt((String) obj, new BillingReceiptRemoteParams(this.$quantity, this.$price, "google", "android", this.$productId, getReceiptRequisitesRequest), this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        String receipt2 = ((BillingReceiptRemote) obj).getReceipt();
        if (receipt2 != null) {
        }
    }
}
