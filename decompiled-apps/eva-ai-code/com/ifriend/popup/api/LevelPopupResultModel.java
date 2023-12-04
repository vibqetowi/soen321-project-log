package com.ifriend.popup.api;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PopupResultModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/popup/api/LevelPopupResultModel;", "", "Ljava/io/Serializable;", "(Ljava/lang/String;I)V", "ACTION_CLICK", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelPopupResultModel implements Serializable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LevelPopupResultModel[] $VALUES;
    public static final LevelPopupResultModel ACTION_CLICK = new LevelPopupResultModel("ACTION_CLICK", 0);

    private static final /* synthetic */ LevelPopupResultModel[] $values() {
        return new LevelPopupResultModel[]{ACTION_CLICK};
    }

    public static EnumEntries<LevelPopupResultModel> getEntries() {
        return $ENTRIES;
    }

    public static LevelPopupResultModel valueOf(String str) {
        return (LevelPopupResultModel) Enum.valueOf(LevelPopupResultModel.class, str);
    }

    public static LevelPopupResultModel[] values() {
        return (LevelPopupResultModel[]) $VALUES.clone();
    }

    private LevelPopupResultModel(String str, int i) {
    }

    static {
        LevelPopupResultModel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
