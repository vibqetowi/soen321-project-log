package com.ifiend.billing.impl.data;

import com.android.billingclient.api.Purchase;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifiend.billing.impl.manager.BillingManager;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/android/billingclient/api/Purchase;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl$getPurchases$2", f = "BillingRepositoryImpl.kt", i = {1}, l = {137, TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", n = {"products"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class BillingRepositoryImpl$getPurchases$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Purchase>>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$getPurchases$2(BillingRepositoryImpl billingRepositoryImpl, Continuation<? super BillingRepositoryImpl$getPurchases$2> continuation) {
        super(2, continuation);
        this.this$0 = billingRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingRepositoryImpl$getPurchases$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Purchase>> continuation) {
        return ((BillingRepositoryImpl$getPurchases$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BillingManager billingManager;
        BillingManager billingManager2;
        List list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            billingManager = this.this$0.billingManager;
            this.label = 1;
            obj = billingManager.getPurchases("inapp", this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                list = (List) this.L$0;
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.plus((Collection) list, (Iterable) ((List) obj));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        List list2 = (List) obj;
        billingManager2 = this.this$0.billingManager;
        this.L$0 = list2;
        this.label = 2;
        Object purchases = billingManager2.getPurchases("subs", this);
        if (purchases == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = list2;
        obj = purchases;
        return CollectionsKt.plus((Collection) list, (Iterable) ((List) obj));
    }
}
