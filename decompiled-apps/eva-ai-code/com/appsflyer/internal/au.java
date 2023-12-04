package com.appsflyer.internal;

import com.android.billingclient.api.BillingClientStateListener;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;
/* loaded from: classes2.dex */
final class au implements BillingClientStateListener {
    private /* synthetic */ av AFKeystoreWrapper;

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingServiceDisconnected() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public au(av avVar) {
        this.AFKeystoreWrapper = avVar;
    }

    @Override // com.android.billingclient.api.BillingClientStateListener
    public final void onBillingSetupFinished(final BillingResult billingResult) {
        final av avVar = this.AFKeystoreWrapper;
        avVar.valueOf.submit(new Runnable() { // from class: com.appsflyer.internal.av.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    if (billingResult.getResponseCode() == 0 && !avVar.AFInAppEventParameterName.AFInAppEventParameterName("ars_history_sent")) {
                        Purchase.PurchasesResult queryPurchases = avVar.values.queryPurchases("subs");
                        List purchasesList = queryPurchases.getPurchasesList();
                        if (queryPurchases.getResponseCode() == 0 && purchasesList != null && !purchasesList.isEmpty()) {
                            av.AFInAppEventType(avVar, true, purchasesList);
                            return;
                        }
                        AFLogger.AppsFlyer2dXConversionCallback("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.AppsFlyer2dXConversionCallback("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.AFInAppEventParameterName("Failed to log purchases history", th);
                }
            }
        });
    }
}
