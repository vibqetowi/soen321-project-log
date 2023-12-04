package com.ifiend.billing.impl.data;

import com.ifriend.billing.api.exception.BillingManagerException;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.core.common.core.CachedListData;
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
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/ifriend/billing/api/models/BillingProduct;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl$fetchProducts$2", f = "BillingRepositoryImpl.kt", i = {}, l = {38}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl$fetchProducts$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends BillingProduct>>, Object> {
    int label;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$fetchProducts$2(BillingRepositoryImpl billingRepositoryImpl, Continuation<? super BillingRepositoryImpl$fetchProducts$2> continuation) {
        super(2, continuation);
        this.this$0 = billingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingRepositoryImpl$fetchProducts$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends BillingProduct>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super List<BillingProduct>>) continuation);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<BillingProduct>> continuation) {
        return ((BillingRepositoryImpl$fetchProducts$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CachedListData cachedData;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cachedData = this.this$0.getCachedData();
            this.label = 1;
            obj = cachedData.getData(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            throw BillingManagerException.BillingClientFetchProductsException.INSTANCE;
        }
        return list;
    }
}
