package com.ifiend.billing.impl.data;

import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.core.common.core.CachedListData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/core/common/core/CachedListData;", "Lcom/ifriend/billing/api/models/BillingProduct;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingRepositoryImpl$cachedData$2 extends Lambda implements Function0<CachedListData<BillingProduct>> {
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$cachedData$2(BillingRepositoryImpl billingRepositoryImpl) {
        super(0);
        this.this$0 = billingRepositoryImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final CachedListData<BillingProduct> invoke() {
        return new CachedListData<>(300000L, null, new AnonymousClass1(this.this$0), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingRepositoryImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifiend.billing.impl.data.BillingRepositoryImpl$cachedData$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Continuation<? super List<? extends BillingProduct>>, Object>, SuspendFunction {
        AnonymousClass1(Object obj) {
            super(1, obj, BillingRepositoryImpl.class, "loadProducts", "loadProducts(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Continuation<? super List<? extends BillingProduct>> continuation) {
            return invoke2((Continuation<? super List<BillingProduct>>) continuation);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(Continuation<? super List<BillingProduct>> continuation) {
            Object loadProducts;
            loadProducts = ((BillingRepositoryImpl) this.receiver).loadProducts(continuation);
            return loadProducts;
        }
    }
}
