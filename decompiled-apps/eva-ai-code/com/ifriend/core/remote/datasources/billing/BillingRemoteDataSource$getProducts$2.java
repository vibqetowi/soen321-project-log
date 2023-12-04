package com.ifriend.core.remote.datasources.billing;

import com.ifriend.core.remote.datasources.billing.models.BillingProductRemote;
import com.ifriend.core.remote.services.AppBillingApiService;
import java.util.List;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"", "Lcom/ifriend/core/remote/datasources/billing/models/BillingProductRemote;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource$getProducts$2", f = "BillingRemoteDataSource.kt", i = {}, l = {23, 23}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource$getProducts$2 extends SuspendLambda implements Function1<Continuation<? super List<? extends BillingProductRemote>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BillingRemoteDataSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRemoteDataSource$getProducts$2(BillingRemoteDataSource billingRemoteDataSource, Continuation<? super BillingRemoteDataSource$getProducts$2> continuation) {
        super(1, continuation);
        this.this$0 = billingRemoteDataSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new BillingRemoteDataSource$getProducts$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends BillingProductRemote>> continuation) {
        return invoke2((Continuation<? super List<BillingProductRemote>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(Continuation<? super List<BillingProductRemote>> continuation) {
        return ((BillingRemoteDataSource$getProducts$2) create(continuation)).invokeSuspend(Unit.INSTANCE);
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
        this.L$0 = null;
        this.label = 2;
        obj = appBillingApiService.getProducts((String) obj, this);
        return obj == coroutine_suspended ? coroutine_suspended : obj;
    }
}
