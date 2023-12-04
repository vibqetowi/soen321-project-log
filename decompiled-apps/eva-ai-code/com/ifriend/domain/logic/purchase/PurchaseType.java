package com.ifriend.domain.logic.purchase;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PurchaseType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/domain/logic/purchase/PurchaseType;", "", "(Ljava/lang/String;I)V", "IN_APP", "SUBSCRIPTION", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PurchaseType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PurchaseType[] $VALUES;
    public static final PurchaseType IN_APP = new PurchaseType("IN_APP", 0);
    public static final PurchaseType SUBSCRIPTION = new PurchaseType("SUBSCRIPTION", 1);

    private static final /* synthetic */ PurchaseType[] $values() {
        return new PurchaseType[]{IN_APP, SUBSCRIPTION};
    }

    public static EnumEntries<PurchaseType> getEntries() {
        return $ENTRIES;
    }

    public static PurchaseType valueOf(String str) {
        return (PurchaseType) Enum.valueOf(PurchaseType.class, str);
    }

    public static PurchaseType[] values() {
        return (PurchaseType[]) $VALUES.clone();
    }

    private PurchaseType(String str, int i) {
    }

    static {
        PurchaseType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
