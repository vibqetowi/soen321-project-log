package com.ifriend.billing.api.models;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BillingPurchaseProductType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/billing/api/models/BillingPurchaseProductType;", "", "(Ljava/lang/String;I)V", "SUBSCRIPTION", ViewHierarchyConstants.PURCHASE, "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingPurchaseProductType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BillingPurchaseProductType[] $VALUES;
    public static final BillingPurchaseProductType SUBSCRIPTION = new BillingPurchaseProductType("SUBSCRIPTION", 0);
    public static final BillingPurchaseProductType PURCHASE = new BillingPurchaseProductType(ViewHierarchyConstants.PURCHASE, 1);

    private static final /* synthetic */ BillingPurchaseProductType[] $values() {
        return new BillingPurchaseProductType[]{SUBSCRIPTION, PURCHASE};
    }

    public static EnumEntries<BillingPurchaseProductType> getEntries() {
        return $ENTRIES;
    }

    public static BillingPurchaseProductType valueOf(String str) {
        return (BillingPurchaseProductType) Enum.valueOf(BillingPurchaseProductType.class, str);
    }

    public static BillingPurchaseProductType[] values() {
        return (BillingPurchaseProductType[]) $VALUES.clone();
    }

    private BillingPurchaseProductType(String str, int i) {
    }

    static {
        BillingPurchaseProductType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
