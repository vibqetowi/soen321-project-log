package com.ifiend.billing.impl.manager;

import android.app.Activity;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.facebook.internal.NativeProtocol;
import com.ifriend.billing.api.models.BillingProductsResult;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
/* compiled from: BillingManager.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\u00192\u0006\u0010\u001a\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00192\u0006\u0010\u001a\u001a\u00020\u0014H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ2\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0010H§@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\"\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u001fH¦@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b&\u0010\u000eR\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"Lcom/ifiend/billing/impl/manager/BillingManager;", "", "billingProductUpdatesFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifiend/billing/impl/manager/PurchasesUpdatedState;", "getBillingProductUpdatesFlow", "()Lkotlinx/coroutines/flow/Flow;", "consumeAsync", "", "purchase", "Lcom/android/billingclient/api/Purchase;", "(Lcom/android/billingclient/api/Purchase;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "endConnect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBillingFlowParams", "Lcom/android/billingclient/api/BillingFlowParams;", "product", "Lcom/android/billingclient/api/ProductDetails;", "billingProductType", "", "(Lcom/android/billingclient/api/ProductDetails;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "Lcom/ifriend/billing/api/models/BillingProductsResult;", "productIds", "", "productType", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPurchases", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchBillingFlow", "Lkotlin/Result;", "activity", "Landroid/app/Activity;", NativeProtocol.WEB_DIALOG_PARAMS, "launchBillingFlow-0E7RQCE", "(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startBillingConnection", "startBillingConnection-IoAF18A", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface BillingManager {
    Object consumeAsync(Purchase purchase, Continuation<? super Boolean> continuation);

    Object endConnect(Continuation<? super Unit> continuation);

    Object getBillingFlowParams(ProductDetails productDetails, String str, Continuation<? super BillingFlowParams> continuation);

    Flow<PurchasesUpdatedState> getBillingProductUpdatesFlow();

    Object getProducts(List<String> list, String str, Continuation<? super BillingProductsResult> continuation);

    Object getPurchases(String str, Continuation<? super List<? extends Purchase>> continuation);

    /* renamed from: launchBillingFlow-0E7RQCE  reason: not valid java name */
    Object mo6783launchBillingFlow0E7RQCE(Activity activity, BillingFlowParams billingFlowParams, Continuation<? super Result<Unit>> continuation);

    /* renamed from: startBillingConnection-IoAF18A  reason: not valid java name */
    Object mo6784startBillingConnectionIoAF18A(Continuation<? super Result<Unit>> continuation);
}
