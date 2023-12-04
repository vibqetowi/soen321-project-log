package com.ifriend.billing.api.logic;

import android.app.Activity;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
/* compiled from: AppLaunchBillingFlow.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J2\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH§@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "", "launchBillingFlow", "Lkotlin/Result;", "", "activity", "Landroid/app/Activity;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "launchBillingFlow-0E7RQCE", "(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppLaunchBillingFlow {
    /* renamed from: launchBillingFlow-0E7RQCE */
    Object mo6781launchBillingFlow0E7RQCE(Activity activity, BillingFlowParams billingFlowParams, Continuation<? super Result<Unit>> continuation);
}
