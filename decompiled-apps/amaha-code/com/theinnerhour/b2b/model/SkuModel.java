package com.theinnerhour.b2b.model;

import com.appsflyer.R;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SkuModel.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/theinnerhour/b2b/model/SkuModel;", "", "subscriptionType", "", "subscriptionPeriod", "discount", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDiscount", "()Ljava/lang/String;", "setDiscount", "(Ljava/lang/String;)V", "getSubscriptionPeriod", "setSubscriptionPeriod", "getSubscriptionType", "setSubscriptionType", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class SkuModel {
    private String discount;
    private String subscriptionPeriod;
    private String subscriptionType;

    public SkuModel(String str, String str2, String str3) {
        e.u(str, "subscriptionType", str2, "subscriptionPeriod", str3, "discount");
        this.subscriptionType = str;
        this.subscriptionPeriod = str2;
        this.discount = str3;
    }

    public final String getDiscount() {
        return this.discount;
    }

    public final String getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getSubscriptionType() {
        return this.subscriptionType;
    }

    public final void setDiscount(String str) {
        i.g(str, "<set-?>");
        this.discount = str;
    }

    public final void setSubscriptionPeriod(String str) {
        i.g(str, "<set-?>");
        this.subscriptionPeriod = str;
    }

    public final void setSubscriptionType(String str) {
        i.g(str, "<set-?>");
        this.subscriptionType = str;
    }
}
