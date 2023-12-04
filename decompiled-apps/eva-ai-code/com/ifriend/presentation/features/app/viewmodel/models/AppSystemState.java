package com.ifriend.presentation.features.app.viewmodel.models;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppSystemState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/ifriend/presentation/features/app/viewmodel/models/AppSystemState;", "", "(Ljava/lang/String;I)V", "Background", "Foreground", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppSystemState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppSystemState[] $VALUES;
    public static final AppSystemState Background = new AppSystemState("Background", 0);
    public static final AppSystemState Foreground = new AppSystemState("Foreground", 1);

    private static final /* synthetic */ AppSystemState[] $values() {
        return new AppSystemState[]{Background, Foreground};
    }

    public static EnumEntries<AppSystemState> getEntries() {
        return $ENTRIES;
    }

    public static AppSystemState valueOf(String str) {
        return (AppSystemState) Enum.valueOf(AppSystemState.class, str);
    }

    public static AppSystemState[] values() {
        return (AppSystemState[]) $VALUES.clone();
    }

    private AppSystemState(String str, int i) {
    }

    static {
        AppSystemState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
