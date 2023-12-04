package com.ifiend.billing.impl.manager;

import android.content.Context;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.PurchasesUpdatedListener;
import com.ifriend.core.utils.CoroutinesKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingManagerImpl.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/android/billingclient/api/BillingClient;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingManagerImpl$billing$1 extends Lambda implements Function0<BillingClient> {
    final /* synthetic */ BillingManagerImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingManagerImpl$billing$1(BillingManagerImpl billingManagerImpl) {
        super(0);
        this.this$0 = billingManagerImpl;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final BillingClient invoke() {
        Context context;
        context = this.this$0.context;
        BillingClient.Builder enablePendingPurchases = BillingClient.newBuilder(context).enablePendingPurchases();
        final BillingManagerImpl billingManagerImpl = this.this$0;
        return enablePendingPurchases.setListener(new PurchasesUpdatedListener() { // from class: com.ifiend.billing.impl.manager.BillingManagerImpl$billing$1$$ExternalSyntheticLambda0
            @Override // com.android.billingclient.api.PurchasesUpdatedListener
            public final void onPurchasesUpdated(BillingResult billingResult, List list) {
                BillingManagerImpl$billing$1.invoke$lambda$0(BillingManagerImpl.this, billingResult, list);
            }
        }).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$0(BillingManagerImpl this$0, BillingResult billingResult, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        CoroutinesKt.safeLaunch$default(this$0, new BillingManagerImpl$billing$1$1$1(this$0, billingResult, null), null, new BillingManagerImpl$billing$1$1$2(this$0, billingResult, list, null), 2, null);
    }
}
