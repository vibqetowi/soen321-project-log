package com.ifriend.popup.api;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupResultModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/popup/api/UpgradePopupResultModel;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "UPGRADE_CLICK", "SECOND_BUTTON_CLICK", "CANCEL", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UpgradePopupResultModel implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UpgradePopupResultModel[] $VALUES;
    public static final UpgradePopupResultModel UPGRADE_CLICK = new UpgradePopupResultModel("UPGRADE_CLICK", 0);
    public static final UpgradePopupResultModel SECOND_BUTTON_CLICK = new UpgradePopupResultModel("SECOND_BUTTON_CLICK", 1);
    public static final UpgradePopupResultModel CANCEL = new UpgradePopupResultModel("CANCEL", 2);

    private static final /* synthetic */ UpgradePopupResultModel[] $values() {
        return new UpgradePopupResultModel[]{UPGRADE_CLICK, SECOND_BUTTON_CLICK, CANCEL};
    }

    public static EnumEntries<UpgradePopupResultModel> getEntries() {
        return $ENTRIES;
    }

    public static UpgradePopupResultModel valueOf(String str) {
        return (UpgradePopupResultModel) Enum.valueOf(UpgradePopupResultModel.class, str);
    }

    public static UpgradePopupResultModel[] values() {
        return (UpgradePopupResultModel[]) $VALUES.clone();
    }

    private UpgradePopupResultModel(String str, int i) {
    }

    static {
        UpgradePopupResultModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
