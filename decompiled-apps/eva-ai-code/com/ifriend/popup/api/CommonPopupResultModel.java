package com.ifriend.popup.api;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupResultModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/popup/api/CommonPopupResultModel;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "ACTION_CLICK", "CANCEL", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonPopupResultModel implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommonPopupResultModel[] $VALUES;
    public static final CommonPopupResultModel ACTION_CLICK = new CommonPopupResultModel("ACTION_CLICK", 0);
    public static final CommonPopupResultModel CANCEL = new CommonPopupResultModel("CANCEL", 1);

    private static final /* synthetic */ CommonPopupResultModel[] $values() {
        return new CommonPopupResultModel[]{ACTION_CLICK, CANCEL};
    }

    public static EnumEntries<CommonPopupResultModel> getEntries() {
        return $ENTRIES;
    }

    public static CommonPopupResultModel valueOf(String str) {
        return (CommonPopupResultModel) Enum.valueOf(CommonPopupResultModel.class, str);
    }

    public static CommonPopupResultModel[] values() {
        return (CommonPopupResultModel[]) $VALUES.clone();
    }

    private CommonPopupResultModel(String str, int i) {
    }

    static {
        CommonPopupResultModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
