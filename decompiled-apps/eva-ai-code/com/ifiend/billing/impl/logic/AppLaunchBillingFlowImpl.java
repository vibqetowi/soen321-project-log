package com.ifiend.billing.impl.logic;

import android.app.Activity;
import com.android.billingclient.api.BillingFlowParams;
import com.facebook.internal.NativeProtocol;
import com.ifiend.billing.impl.manager.BillingManager;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppLaunchBillingFlowImpl.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J2\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002ø\u0001\u0002¢\u0006\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/ifiend/billing/impl/logic/AppLaunchBillingFlowImpl;", "Lcom/ifriend/billing/api/logic/AppLaunchBillingFlow;", "billingManager", "Lcom/ifiend/billing/impl/manager/BillingManager;", "(Lcom/ifiend/billing/impl/manager/BillingManager;)V", "launchBillingFlow", "Lkotlin/Result;", "", "activity", "Landroid/app/Activity;", NativeProtocol.WEB_DIALOG_PARAMS, "Lcom/android/billingclient/api/BillingFlowParams;", "launchBillingFlow-0E7RQCE", "(Landroid/app/Activity;Lcom/android/billingclient/api/BillingFlowParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppLaunchBillingFlowImpl implements AppLaunchBillingFlow {
    private final BillingManager billingManager;

    @Inject
    public AppLaunchBillingFlowImpl(BillingManager billingManager) {
        Intrinsics.checkNotNullParameter(billingManager, "billingManager");
        this.billingManager = billingManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    @Override // com.ifriend.billing.api.logic.AppLaunchBillingFlow
    /* renamed from: launchBillingFlow-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo6781launchBillingFlow0E7RQCE(Activity activity, BillingFlowParams billingFlowParams, Continuation<? super Result<Unit>> continuation) {
        AppLaunchBillingFlowImpl$launchBillingFlow$1 appLaunchBillingFlowImpl$launchBillingFlow$1;
        int i;
        if (continuation instanceof AppLaunchBillingFlowImpl$launchBillingFlow$1) {
            appLaunchBillingFlowImpl$launchBillingFlow$1 = (AppLaunchBillingFlowImpl$launchBillingFlow$1) continuation;
            if ((appLaunchBillingFlowImpl$launchBillingFlow$1.label & Integer.MIN_VALUE) != 0) {
                appLaunchBillingFlowImpl$launchBillingFlow$1.label -= Integer.MIN_VALUE;
                Object obj = appLaunchBillingFlowImpl$launchBillingFlow$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appLaunchBillingFlowImpl$launchBillingFlow$1.label;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.throwOnFailure(obj);
                        return ((Result) obj).m7280unboximpl();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                BillingManager billingManager = this.billingManager;
                appLaunchBillingFlowImpl$launchBillingFlow$1.label = 1;
                Object mo6783launchBillingFlow0E7RQCE = billingManager.mo6783launchBillingFlow0E7RQCE(activity, billingFlowParams, appLaunchBillingFlowImpl$launchBillingFlow$1);
                return mo6783launchBillingFlow0E7RQCE == coroutine_suspended ? coroutine_suspended : mo6783launchBillingFlow0E7RQCE;
            }
        }
        appLaunchBillingFlowImpl$launchBillingFlow$1 = new AppLaunchBillingFlowImpl$launchBillingFlow$1(this, continuation);
        Object obj2 = appLaunchBillingFlowImpl$launchBillingFlow$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appLaunchBillingFlowImpl$launchBillingFlow$1.label;
        if (i == 0) {
        }
    }
}
