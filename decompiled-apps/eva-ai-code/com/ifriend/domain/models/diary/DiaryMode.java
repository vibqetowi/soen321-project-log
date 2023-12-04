package com.ifriend.domain.models.diary;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiaryMode.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ifriend/domain/models/diary/DiaryMode;", "", "(Ljava/lang/String;I)V", "HIDE", "LIGHT", "DARK", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiaryMode[] $VALUES;
    public static final DiaryMode HIDE = new DiaryMode("HIDE", 0);
    public static final DiaryMode LIGHT = new DiaryMode("LIGHT", 1);
    public static final DiaryMode DARK = new DiaryMode("DARK", 2);

    private static final /* synthetic */ DiaryMode[] $values() {
        return new DiaryMode[]{HIDE, LIGHT, DARK};
    }

    public static EnumEntries<DiaryMode> getEntries() {
        return $ENTRIES;
    }

    public static DiaryMode valueOf(String str) {
        return (DiaryMode) Enum.valueOf(DiaryMode.class, str);
    }

    public static DiaryMode[] values() {
        return (DiaryMode[]) $VALUES.clone();
    }

    private DiaryMode(String str, int i) {
    }

    static {
        DiaryMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
