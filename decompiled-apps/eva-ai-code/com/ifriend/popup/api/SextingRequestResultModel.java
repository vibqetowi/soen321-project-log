package com.ifriend.popup.api;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupResultModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/popup/api/SextingRequestResultModel;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "REQUEST_SEXTING", "CANCEL", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SextingRequestResultModel implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SextingRequestResultModel[] $VALUES;
    public static final SextingRequestResultModel REQUEST_SEXTING = new SextingRequestResultModel("REQUEST_SEXTING", 0);
    public static final SextingRequestResultModel CANCEL = new SextingRequestResultModel("CANCEL", 1);

    private static final /* synthetic */ SextingRequestResultModel[] $values() {
        return new SextingRequestResultModel[]{REQUEST_SEXTING, CANCEL};
    }

    public static EnumEntries<SextingRequestResultModel> getEntries() {
        return $ENTRIES;
    }

    public static SextingRequestResultModel valueOf(String str) {
        return (SextingRequestResultModel) Enum.valueOf(SextingRequestResultModel.class, str);
    }

    public static SextingRequestResultModel[] values() {
        return (SextingRequestResultModel[]) $VALUES.clone();
    }

    private SextingRequestResultModel(String str, int i) {
    }

    static {
        SextingRequestResultModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
