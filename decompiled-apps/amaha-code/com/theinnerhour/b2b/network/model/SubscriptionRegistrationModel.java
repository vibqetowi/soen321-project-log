package com.theinnerhour.b2b.network.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import tf.b;
/* compiled from: SubscriptionRegistrationModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/theinnerhour/b2b/network/model/SubscriptionRegistrationModel;", "", "purchaseToken", "", "sku", "firebaseId", "access_key", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccess_key", "()Ljava/lang/String;", "getFirebaseId", "getPurchaseToken", "getSku", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SubscriptionRegistrationModel {
    @b("access_key")
    private final String access_key;
    @b("firebaseId")
    private final String firebaseId;
    @b("purchaseToken")
    private final String purchaseToken;
    @b("sku")
    private final String sku;

    public SubscriptionRegistrationModel(String purchaseToken, String sku, String firebaseId, String access_key) {
        i.g(purchaseToken, "purchaseToken");
        i.g(sku, "sku");
        i.g(firebaseId, "firebaseId");
        i.g(access_key, "access_key");
        this.purchaseToken = purchaseToken;
        this.sku = sku;
        this.firebaseId = firebaseId;
        this.access_key = access_key;
    }

    public final String getAccess_key() {
        return this.access_key;
    }

    public final String getFirebaseId() {
        return this.firebaseId;
    }

    public final String getPurchaseToken() {
        return this.purchaseToken;
    }

    public final String getSku() {
        return this.sku;
    }
}
