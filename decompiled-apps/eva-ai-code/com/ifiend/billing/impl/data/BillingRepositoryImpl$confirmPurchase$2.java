package com.ifiend.billing.impl.data;

import com.android.billingclient.api.Purchase;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifriend.billing.api.models.BillingPrice;
import com.ifriend.billing.api.models.BillingProduct;
import com.ifriend.core.remote.datasources.billing.BillingRemoteDataSource;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.ws.WebSocketProtocol;
/* compiled from: BillingRepositoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifiend.billing.impl.data.BillingRepositoryImpl$confirmPurchase$2", f = "BillingRepositoryImpl.kt", i = {1}, l = {115, 118, 120, WebSocketProtocol.PAYLOAD_SHORT, 128}, m = "invokeSuspend", n = {"receipt"}, s = {"L$0"})
/* loaded from: classes6.dex */
final class BillingRepositoryImpl$confirmPurchase$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ Purchase $purchase;
    Object L$0;
    int label;
    final /* synthetic */ BillingRepositoryImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingRepositoryImpl$confirmPurchase$2(BillingRepositoryImpl billingRepositoryImpl, Purchase purchase, Continuation<? super BillingRepositoryImpl$confirmPurchase$2> continuation) {
        super(2, continuation);
        this.this$0 = billingRepositoryImpl;
        this.$purchase = purchase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingRepositoryImpl$confirmPurchase$2(this.this$0, this.$purchase, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BillingRepositoryImpl$confirmPurchase$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        BillingRemoteDataSource billingRemoteDataSource;
        Double boxDouble;
        String str2;
        BillingPrice priceFormBackend;
        BillingManager billingManager;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            obj = this.this$0.getReceipt(this.$purchase, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                str = (String) this.L$0;
                ResultKt.throwOnFailure(obj);
                BillingProduct billingProduct = (BillingProduct) obj;
                billingRemoteDataSource = this.this$0.billingRemoteDataSource;
                boxDouble = billingProduct == null ? Boxing.boxDouble(billingProduct.backendPrice()) : null;
                String currencySymbol = (billingProduct != null || (priceFormBackend = billingProduct.getPriceFormBackend()) == null) ? null : priceFormBackend.currencySymbol();
                str2 = currencySymbol != null ? currencySymbol : "";
                this.L$0 = null;
                this.label = 3;
                if (billingRemoteDataSource.confirmPurchase(str, boxDouble, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.label = 4;
                obj = this.this$0.hasSubscription(this.$purchase, this);
                if (obj == coroutine_suspended) {
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return Boxing.boxBoolean(true);
            } else if (i == 3) {
                ResultKt.throwOnFailure(obj);
                this.label = 4;
                obj = this.this$0.hasSubscription(this.$purchase, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                return Boxing.boxBoolean(true);
            } else if (i != 4) {
                if (i == 5) {
                    ResultKt.throwOnFailure(obj);
                    return Boxing.boxBoolean(true);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                if (!((Boolean) obj).booleanValue()) {
                    billingManager = this.this$0.billingManager;
                    this.label = 5;
                    if (billingManager.consumeAsync(this.$purchase, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Boxing.boxBoolean(true);
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        str = (String) obj;
        List<String> products = this.$purchase.getProducts();
        Intrinsics.checkNotNullExpressionValue(products, "getProducts(...)");
        String str3 = (String) CollectionsKt.first((List<? extends Object>) products);
        if (str3 == null) {
            str3 = "";
        }
        this.L$0 = str;
        this.label = 2;
        obj = this.this$0.getProduct(str3, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        BillingProduct billingProduct2 = (BillingProduct) obj;
        billingRemoteDataSource = this.this$0.billingRemoteDataSource;
        if (billingProduct2 == null) {
        }
        if (billingProduct2 != null) {
        }
        if (currencySymbol != null) {
        }
        this.L$0 = null;
        this.label = 3;
        if (billingRemoteDataSource.confirmPurchase(str, boxDouble, str2, this) == coroutine_suspended) {
        }
        this.label = 4;
        obj = this.this$0.hasSubscription(this.$purchase, this);
        if (obj == coroutine_suspended) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Boxing.boxBoolean(true);
    }
}
