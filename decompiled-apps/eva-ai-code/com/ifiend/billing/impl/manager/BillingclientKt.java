package com.ifiend.billing.impl.manager;

import com.android.billingclient.api.AcknowledgePurchaseParams;
import com.android.billingclient.api.AcknowledgePurchaseResponseListener;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
/* compiled from: billingclient.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a;\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\n\u0010\r\u001a\u00020\u000e*\u00020\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"acknowledgePurchaseAsync", "Lcom/android/billingclient/api/BillingResult;", "Lcom/android/billingclient/api/BillingClient;", "purchaseToken", "", "(Lcom/android/billingclient/api/BillingClient;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acknowledgePurchaseWithRetry", "maxRetries", "", "retryDelayMillis", "", "errorResponseCode", "(Lcom/android/billingclient/api/BillingClient;Ljava/lang/String;IJILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isSuccessful", "", "impl_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingclientKt {
    public static final Object acknowledgePurchaseAsync(BillingClient billingClient, String str, Continuation<? super BillingResult> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        AcknowledgePurchaseParams build = AcknowledgePurchaseParams.newBuilder().setPurchaseToken(str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        billingClient.acknowledgePurchase(build, new AcknowledgePurchaseResponseListener() { // from class: com.ifiend.billing.impl.manager.BillingclientKt$acknowledgePurchaseAsync$2$acknowledgePurchaseResponseListener$1
            @Override // com.android.billingclient.api.AcknowledgePurchaseResponseListener
            public final void onAcknowledgePurchaseResponse(BillingResult billingResult) {
                Intrinsics.checkNotNullParameter(billingResult, "billingResult");
                Continuation<BillingResult> continuation2 = safeContinuation2;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m7271constructorimpl(billingResult));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(1:(4:11|12|13|(4:15|16|17|(1:19)(3:21|22|(1:24)(2:25|(1:27)(2:28|(2:37|(2:34|35)(1:36))(0)))))(0))(2:38|39))(4:40|41|22|(0)(0)))(2:42|(4:44|16|17|(0)(0))(2:45|(0)(0)))))|47|6|7|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8 A[Catch: Exception -> 0x00d3, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d3, blocks: (B:13:0x0040, B:27:0x009f, B:30:0x00a8, B:18:0x0063), top: B:44:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00bf -> B:34:0x00c6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object acknowledgePurchaseWithRetry(BillingClient billingClient, String str, int i, long j, int i2, Continuation<? super BillingResult> continuation) {
        BillingclientKt$acknowledgePurchaseWithRetry$1 billingclientKt$acknowledgePurchaseWithRetry$1;
        int i3;
        int i4;
        long j2;
        int i5;
        int i6;
        BillingclientKt$acknowledgePurchaseWithRetry$1 billingclientKt$acknowledgePurchaseWithRetry$12;
        Object obj;
        BillingClient billingClient2;
        String str2;
        int i7;
        BillingClient billingClient3;
        String str3;
        int i8;
        long j3;
        int i9;
        BillingResult billingResult;
        Object acknowledgePurchaseAsync;
        if (continuation instanceof BillingclientKt$acknowledgePurchaseWithRetry$1) {
            billingclientKt$acknowledgePurchaseWithRetry$1 = (BillingclientKt$acknowledgePurchaseWithRetry$1) continuation;
            if ((billingclientKt$acknowledgePurchaseWithRetry$1.label & Integer.MIN_VALUE) != 0) {
                billingclientKt$acknowledgePurchaseWithRetry$1.label -= Integer.MIN_VALUE;
                Object obj2 = billingclientKt$acknowledgePurchaseWithRetry$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i3 = billingclientKt$acknowledgePurchaseWithRetry$1.label;
                BillingResult billingResult2 = null;
                if (i3 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    if (i >= 0) {
                        j2 = j;
                        i5 = i2;
                        i6 = 0;
                        billingclientKt$acknowledgePurchaseWithRetry$12 = billingclientKt$acknowledgePurchaseWithRetry$1;
                        obj = coroutine_suspended;
                        billingClient2 = billingClient;
                        str2 = str;
                        i7 = i;
                        billingclientKt$acknowledgePurchaseWithRetry$12.L$0 = billingClient2;
                        billingclientKt$acknowledgePurchaseWithRetry$12.L$1 = str2;
                        billingclientKt$acknowledgePurchaseWithRetry$12.L$2 = null;
                        billingclientKt$acknowledgePurchaseWithRetry$12.I$0 = i7;
                        billingclientKt$acknowledgePurchaseWithRetry$12.J$0 = j2;
                        billingclientKt$acknowledgePurchaseWithRetry$12.I$1 = i5;
                        billingclientKt$acknowledgePurchaseWithRetry$12.I$2 = i6;
                        billingclientKt$acknowledgePurchaseWithRetry$12.label = 1;
                        acknowledgePurchaseAsync = acknowledgePurchaseAsync(billingClient2, str2, billingclientKt$acknowledgePurchaseWithRetry$12);
                        if (acknowledgePurchaseAsync != obj) {
                        }
                    } else {
                        i4 = i2;
                        if (billingResult2 == null) {
                        }
                    }
                } else if (i3 == 1) {
                    i9 = billingclientKt$acknowledgePurchaseWithRetry$1.I$2;
                    i4 = billingclientKt$acknowledgePurchaseWithRetry$1.I$1;
                    j3 = billingclientKt$acknowledgePurchaseWithRetry$1.J$0;
                    i8 = billingclientKt$acknowledgePurchaseWithRetry$1.I$0;
                    str3 = (String) billingclientKt$acknowledgePurchaseWithRetry$1.L$1;
                    billingClient3 = (BillingClient) billingclientKt$acknowledgePurchaseWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    billingResult = (BillingResult) obj2;
                    if (!isSuccessful(billingResult)) {
                    }
                } else if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    i9 = billingclientKt$acknowledgePurchaseWithRetry$1.I$2;
                    i4 = billingclientKt$acknowledgePurchaseWithRetry$1.I$1;
                    j3 = billingclientKt$acknowledgePurchaseWithRetry$1.J$0;
                    int i10 = billingclientKt$acknowledgePurchaseWithRetry$1.I$0;
                    BillingResult billingResult3 = (BillingResult) billingclientKt$acknowledgePurchaseWithRetry$1.L$2;
                    String str4 = (String) billingclientKt$acknowledgePurchaseWithRetry$1.L$1;
                    BillingClient billingClient4 = (BillingClient) billingclientKt$acknowledgePurchaseWithRetry$1.L$0;
                    ResultKt.throwOnFailure(obj2);
                    billingClient2 = billingClient4;
                    billingclientKt$acknowledgePurchaseWithRetry$12 = billingclientKt$acknowledgePurchaseWithRetry$1;
                    str2 = str4;
                    Object obj3 = coroutine_suspended;
                    i7 = i10;
                    if (i9 == i7) {
                        obj = obj3;
                        i6 = i9 + 1;
                        i5 = i4;
                        j2 = j3;
                        try {
                            billingclientKt$acknowledgePurchaseWithRetry$12.L$0 = billingClient2;
                            billingclientKt$acknowledgePurchaseWithRetry$12.L$1 = str2;
                            billingclientKt$acknowledgePurchaseWithRetry$12.L$2 = null;
                            billingclientKt$acknowledgePurchaseWithRetry$12.I$0 = i7;
                            billingclientKt$acknowledgePurchaseWithRetry$12.J$0 = j2;
                            billingclientKt$acknowledgePurchaseWithRetry$12.I$1 = i5;
                            billingclientKt$acknowledgePurchaseWithRetry$12.I$2 = i6;
                            billingclientKt$acknowledgePurchaseWithRetry$12.label = 1;
                            acknowledgePurchaseAsync = acknowledgePurchaseAsync(billingClient2, str2, billingclientKt$acknowledgePurchaseWithRetry$12);
                        } catch (Exception unused) {
                            i4 = i5;
                            billingResult2 = BillingResult.newBuilder().setResponseCode(i4).build();
                            if (billingResult2 == null) {
                            }
                        }
                        if (acknowledgePurchaseAsync != obj) {
                            return obj;
                        }
                        billingClient3 = billingClient2;
                        obj2 = acknowledgePurchaseAsync;
                        Object obj4 = obj;
                        str3 = str2;
                        billingclientKt$acknowledgePurchaseWithRetry$1 = billingclientKt$acknowledgePurchaseWithRetry$12;
                        i8 = i7;
                        coroutine_suspended = obj4;
                        long j4 = j2;
                        i4 = i5;
                        i9 = i6;
                        j3 = j4;
                        billingResult = (BillingResult) obj2;
                        if (!isSuccessful(billingResult)) {
                            return billingResult;
                        }
                        billingclientKt$acknowledgePurchaseWithRetry$1.L$0 = billingClient3;
                        billingclientKt$acknowledgePurchaseWithRetry$1.L$1 = str3;
                        billingclientKt$acknowledgePurchaseWithRetry$1.L$2 = billingResult;
                        billingclientKt$acknowledgePurchaseWithRetry$1.I$0 = i8;
                        billingclientKt$acknowledgePurchaseWithRetry$1.J$0 = j3;
                        billingclientKt$acknowledgePurchaseWithRetry$1.I$1 = i4;
                        billingclientKt$acknowledgePurchaseWithRetry$1.I$2 = i9;
                        billingclientKt$acknowledgePurchaseWithRetry$1.label = 2;
                        if (DelayKt.delay(j3, billingclientKt$acknowledgePurchaseWithRetry$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        String str5 = str3;
                        billingResult3 = billingResult;
                        billingClient2 = billingClient3;
                        obj3 = coroutine_suspended;
                        i7 = i8;
                        billingclientKt$acknowledgePurchaseWithRetry$12 = billingclientKt$acknowledgePurchaseWithRetry$1;
                        str2 = str5;
                        if (i9 == i7) {
                            billingResult2 = billingResult3;
                            if (billingResult2 == null) {
                                BillingResult build = BillingResult.newBuilder().setResponseCode(i4).build();
                                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                                return build;
                            }
                            return billingResult2;
                        }
                    }
                }
            }
        }
        billingclientKt$acknowledgePurchaseWithRetry$1 = new BillingclientKt$acknowledgePurchaseWithRetry$1(continuation);
        Object obj22 = billingclientKt$acknowledgePurchaseWithRetry$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i3 = billingclientKt$acknowledgePurchaseWithRetry$1.label;
        BillingResult billingResult22 = null;
        if (i3 != 0) {
        }
    }

    public static /* synthetic */ Object acknowledgePurchaseWithRetry$default(BillingClient billingClient, String str, int i, long j, int i2, Continuation continuation, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            j = 1000;
        }
        long j2 = j;
        if ((i3 & 8) != 0) {
            i2 = 6;
        }
        return acknowledgePurchaseWithRetry(billingClient, str, i4, j2, i2, continuation);
    }

    public static final boolean isSuccessful(BillingResult billingResult) {
        Intrinsics.checkNotNullParameter(billingResult, "<this>");
        return billingResult.getResponseCode() == 0;
    }
}
