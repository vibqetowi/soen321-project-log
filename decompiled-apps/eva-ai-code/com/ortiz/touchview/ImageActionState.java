package com.ortiz.touchview;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ImageActionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ortiz/touchview/ImageActionState;", "", "(Ljava/lang/String;I)V", "NONE", "DRAG", "ZOOM", "FLING", "ANIMATE_ZOOM", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ImageActionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ImageActionState[] $VALUES;
    public static final ImageActionState NONE = new ImageActionState("NONE", 0);
    public static final ImageActionState DRAG = new ImageActionState("DRAG", 1);
    public static final ImageActionState ZOOM = new ImageActionState("ZOOM", 2);
    public static final ImageActionState FLING = new ImageActionState("FLING", 3);
    public static final ImageActionState ANIMATE_ZOOM = new ImageActionState("ANIMATE_ZOOM", 4);

    private static final /* synthetic */ ImageActionState[] $values() {
        return new ImageActionState[]{NONE, DRAG, ZOOM, FLING, ANIMATE_ZOOM};
    }

    public static EnumEntries<ImageActionState> getEntries() {
        return $ENTRIES;
    }

    public static ImageActionState valueOf(String str) {
        return (ImageActionState) Enum.valueOf(ImageActionState.class, str);
    }

    public static ImageActionState[] values() {
        return (ImageActionState[]) $VALUES.clone();
    }

    private ImageActionState(String str, int i) {
    }

    static {
        ImageActionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
