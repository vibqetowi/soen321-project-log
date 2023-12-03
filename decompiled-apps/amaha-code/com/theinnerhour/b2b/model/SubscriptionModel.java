package com.theinnerhour.b2b.model;

import com.theinnerhour.b2b.utils.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
/* compiled from: SubscriptionModel.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0018\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\nR$\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\b\"\u0004\b \u0010\n¨\u0006#"}, d2 = {"Lcom/theinnerhour/b2b/model/SubscriptionModel;", "", "Lhs/k;", "SubscriptionModel", "", "status", "Ljava/lang/String;", "getStatus", "()Ljava/lang/String;", "setStatus", "(Ljava/lang/String;)V", "", "startTime", "J", "getStartTime", "()J", "setStartTime", "(J)V", "expiryTime", "getExpiryTime", "setExpiryTime", "plan", "getPlan", "setPlan", "priceAmountMicros", "Ljava/lang/Long;", "getPriceAmountMicros", "()Ljava/lang/Long;", "setPriceAmountMicros", "(Ljava/lang/Long;)V", "priceCurrencyCode", "getPriceCurrencyCode", "setPriceCurrencyCode", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class SubscriptionModel {
    private long expiryTime;
    private long startTime;
    private String status = Constants.STATE_NOT_PURCHASED;
    private String plan = Constants.SUBSCRIPTION_NONE;
    private Long priceAmountMicros = 0L;
    private String priceCurrencyCode = "";

    public final long getExpiryTime() {
        return this.expiryTime;
    }

    public final String getPlan() {
        return this.plan;
    }

    public final Long getPriceAmountMicros() {
        return this.priceAmountMicros;
    }

    public final String getPriceCurrencyCode() {
        return this.priceCurrencyCode;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final String getStatus() {
        return this.status;
    }

    public final void setExpiryTime(long j10) {
        this.expiryTime = j10;
    }

    public final void setPlan(String str) {
        i.g(str, "<set-?>");
        this.plan = str;
    }

    public final void setPriceAmountMicros(Long l2) {
        this.priceAmountMicros = l2;
    }

    public final void setPriceCurrencyCode(String str) {
        this.priceCurrencyCode = str;
    }

    public final void setStartTime(long j10) {
        this.startTime = j10;
    }

    public final void setStatus(String str) {
        i.g(str, "<set-?>");
        this.status = str;
    }

    public final void SubscriptionModel() {
    }
}
