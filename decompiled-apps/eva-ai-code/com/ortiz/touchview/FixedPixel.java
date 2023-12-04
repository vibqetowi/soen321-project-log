package com.ortiz.touchview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FixedPixel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ortiz/touchview/FixedPixel;", "", "(Ljava/lang/String;I)V", "CENTER", "TOP_LEFT", "BOTTOM_RIGHT", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FixedPixel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FixedPixel[] $VALUES;
    public static final FixedPixel CENTER = new FixedPixel("CENTER", 0);
    public static final FixedPixel TOP_LEFT = new FixedPixel("TOP_LEFT", 1);
    public static final FixedPixel BOTTOM_RIGHT = new FixedPixel("BOTTOM_RIGHT", 2);

    private static final /* synthetic */ FixedPixel[] $values() {
        return new FixedPixel[]{CENTER, TOP_LEFT, BOTTOM_RIGHT};
    }

    public static EnumEntries<FixedPixel> getEntries() {
        return $ENTRIES;
    }

    public static FixedPixel valueOf(String str) {
        return (FixedPixel) Enum.valueOf(FixedPixel.class, str);
    }

    public static FixedPixel[] values() {
        return (FixedPixel[]) $VALUES.clone();
    }

    private FixedPixel(String str, int i) {
    }

    static {
        FixedPixel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
