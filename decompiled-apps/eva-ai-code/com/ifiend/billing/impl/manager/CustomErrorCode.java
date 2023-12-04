package com.ifiend.billing.impl.manager;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CustomErrorCode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/ifiend/billing/impl/manager/CustomErrorCode;", "", "code", "", "(Ljava/lang/String;II)V", "getCode", "()I", "RETRY_SERVICE_DISCONNECTED", "ACKNOWLEDGE_PURCHASE", "impl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CustomErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CustomErrorCode[] $VALUES;
    private final int code;
    public static final CustomErrorCode RETRY_SERVICE_DISCONNECTED = new CustomErrorCode("RETRY_SERVICE_DISCONNECTED", 0, -1001);
    public static final CustomErrorCode ACKNOWLEDGE_PURCHASE = new CustomErrorCode("ACKNOWLEDGE_PURCHASE", 1, -1002);

    private static final /* synthetic */ CustomErrorCode[] $values() {
        return new CustomErrorCode[]{RETRY_SERVICE_DISCONNECTED, ACKNOWLEDGE_PURCHASE};
    }

    public static EnumEntries<CustomErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static CustomErrorCode valueOf(String str) {
        return (CustomErrorCode) Enum.valueOf(CustomErrorCode.class, str);
    }

    public static CustomErrorCode[] values() {
        return (CustomErrorCode[]) $VALUES.clone();
    }

    private CustomErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        CustomErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
