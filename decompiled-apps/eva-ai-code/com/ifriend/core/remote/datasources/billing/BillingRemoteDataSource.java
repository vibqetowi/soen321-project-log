package com.ifriend.core.remote.datasources.billing;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.ifriend.core.local.api.AuthLocalDataSource;
import com.ifriend.core.remote.common.RetryKt;
import com.ifriend.core.remote.datasources.billing.models.BillingProductRemote;
import com.ifriend.core.remote.datasources.billing.models.BillingVerifyPurchaseRemote;
import com.ifriend.core.remote.services.AppBillingApiService;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BillingRemoteDataSource.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J+\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0012J9\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0011\u0010\u0019\u001a\u00020\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/BillingRemoteDataSource;", "", "apiService", "Lcom/ifriend/core/remote/services/AppBillingApiService;", "authLocalDataSource", "Lcom/ifriend/core/local/api/AuthLocalDataSource;", "(Lcom/ifriend/core/remote/services/AppBillingApiService;Lcom/ifriend/core/local/api/AuthLocalDataSource;)V", "confirmPurchase", "Lcom/ifriend/core/remote/datasources/billing/models/BillingVerifyPurchaseRemote;", "receipt", "", FirebaseAnalytics.Param.PRICE, "", FirebaseAnalytics.Param.CURRENCY, "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProducts", "", "Lcom/ifriend/core/remote/datasources/billing/models/BillingProductRemote;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getReceipt", "productId", FirebaseAnalytics.Param.QUANTITY, "", "signature", "(Ljava/lang/String;DILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "provideUserId", "Companion", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingRemoteDataSource {
    public static final Companion Companion = new Companion(null);
    private static final String METHOD = "google";
    private static final String SHOP = "android";
    private final AppBillingApiService apiService;
    private final AuthLocalDataSource authLocalDataSource;

    @Inject
    public BillingRemoteDataSource(AppBillingApiService apiService, AuthLocalDataSource authLocalDataSource) {
        Intrinsics.checkNotNullParameter(apiService, "apiService");
        Intrinsics.checkNotNullParameter(authLocalDataSource, "authLocalDataSource");
        this.apiService = apiService;
        this.authLocalDataSource = authLocalDataSource;
    }

    /* compiled from: BillingRemoteDataSource.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ifriend/core/remote/datasources/billing/BillingRemoteDataSource$Companion;", "", "()V", "METHOD", "", "SHOP", "remote-datasource"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object provideUserId(Continuation<? super String> continuation) {
        BillingRemoteDataSource$provideUserId$1 billingRemoteDataSource$provideUserId$1;
        int i;
        if (continuation instanceof BillingRemoteDataSource$provideUserId$1) {
            billingRemoteDataSource$provideUserId$1 = (BillingRemoteDataSource$provideUserId$1) continuation;
            if ((billingRemoteDataSource$provideUserId$1.label & Integer.MIN_VALUE) != 0) {
                billingRemoteDataSource$provideUserId$1.label -= Integer.MIN_VALUE;
                Object obj = billingRemoteDataSource$provideUserId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = billingRemoteDataSource$provideUserId$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    AuthLocalDataSource authLocalDataSource = this.authLocalDataSource;
                    billingRemoteDataSource$provideUserId$1.label = 1;
                    obj = authLocalDataSource.getUserId(billingRemoteDataSource$provideUserId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                String str = (String) obj;
                return str != null ? "" : str;
            }
        }
        billingRemoteDataSource$provideUserId$1 = new BillingRemoteDataSource$provideUserId$1(this, continuation);
        Object obj2 = billingRemoteDataSource$provideUserId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = billingRemoteDataSource$provideUserId$1.label;
        if (i != 0) {
        }
        String str2 = (String) obj2;
        if (str2 != null) {
        }
    }

    public final Object getProducts(Continuation<? super List<BillingProductRemote>> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new BillingRemoteDataSource$getProducts$2(this, null), continuation);
    }

    public final Object getReceipt(String str, double d, int i, String str2, String str3, Continuation<? super String> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new BillingRemoteDataSource$getReceipt$2(this, str2, str3, i, d, str, null), continuation);
    }

    public final Object confirmPurchase(String str, Double d, String str2, Continuation<? super BillingVerifyPurchaseRemote> continuation) {
        return RetryKt.oneTimeRetryRemoteRequest(new BillingRemoteDataSource$confirmPurchase$2(this, d, str, str2, null), continuation);
    }
}
