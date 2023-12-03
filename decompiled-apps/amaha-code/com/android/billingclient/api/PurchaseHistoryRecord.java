package com.android.billingclient.api;

import android.text.TextUtils;
import org.json.JSONObject;
/* compiled from: com.android.billingclient:billing@@5.0.0 */
/* loaded from: classes.dex */
public final class PurchaseHistoryRecord {

    /* renamed from: a  reason: collision with root package name */
    public final String f5861a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5862b;

    /* renamed from: c  reason: collision with root package name */
    public final JSONObject f5863c;

    public PurchaseHistoryRecord(String str, String str2) {
        this.f5861a = str;
        this.f5862b = str2;
        this.f5863c = new JSONObject(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryRecord)) {
            return false;
        }
        PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
        if (TextUtils.equals(this.f5861a, purchaseHistoryRecord.f5861a) && TextUtils.equals(this.f5862b, purchaseHistoryRecord.f5862b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f5861a.hashCode();
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.f5861a));
    }
}
