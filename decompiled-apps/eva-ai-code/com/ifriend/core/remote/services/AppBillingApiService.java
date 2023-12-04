package com.ifriend.core.remote.services;

import com.facebook.internal.NativeProtocol;
import com.ifriend.core.remote.datasources.billing.models.BillingProductRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingReceiptRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingReceiptRemoteParams;
import com.ifriend.core.remote.datasources.billing.models.BillingVerifyPurchaseRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingVerifyPurchaseRemoteParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
/* compiled from: AppBillingApiService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007H§@ø\u0001\u0000¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0001\u0010\f\u001a\u00020\u0005H§@ø\u0001\u0000¢\u0006\u0002\u0010\rJ%\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0010H§@ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/ifriend/core/remote/services/AppBillingApiService;", "", "confirmPurchase", "Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemote;", "userId", "", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams;", "(Ljava/lang/String;Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "Lcom/ifriend/core/remote/datasources/billing/models/BillingProductRemote;", "id", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceipt", "Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemote;", "Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams;", "(Ljava/lang/String;Lcom/ifriend/core/remote/datasources/billing/models/BillingReceiptRemoteParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppBillingApiService {
    @POST("credits/mall/{userId}/exchanges")
    Object confirmPurchase(@Path("userId") String str, @Body BillingVerifyPurchaseRemoteParams billingVerifyPurchaseRemoteParams, Continuation<? super BillingVerifyPurchaseRemote> continuation);

    @GET("credits/mall/{userId}/credits?shop=android")
    Object getProducts(@Path("userId") String str, Continuation<? super List<BillingProductRemote>> continuation);

    @POST("credits/mall/{userId}/receipts")
    Object getReceipt(@Path("userId") String str, @Body BillingReceiptRemoteParams billingReceiptRemoteParams, Continuation<? super BillingReceiptRemote> continuation);
}
