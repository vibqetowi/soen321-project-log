package androidx.compose.material3.windowsizeclass;

import androidx.compose.ui.unit.Dp;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WindowSizeClass.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0014\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0000H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005J\u000f\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "", "value", "", "constructor-impl", "(I)I", "compareTo", "other", "compareTo-GxU_lZo", "(II)I", "equals", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", "Companion", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* loaded from: classes3.dex */
public final class WindowWidthSizeClass implements Comparable<WindowWidthSizeClass> {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Compact = m2848constructorimpl(0);
    private static final int Medium = m2848constructorimpl(1);
    private static final int Expanded = m2848constructorimpl(2);

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ WindowWidthSizeClass m2846boximpl(int i) {
        return new WindowWidthSizeClass(i);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    private static int m2848constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m2849equalsimpl(int i, Object obj) {
        return (obj instanceof WindowWidthSizeClass) && i == ((WindowWidthSizeClass) obj).m2854unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m2850equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m2851hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(Object obj) {
        return m2849equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2851hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ int m2854unboximpl() {
        return this.value;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(WindowWidthSizeClass windowWidthSizeClass) {
        return m2853compareToGxU_lZo(windowWidthSizeClass.m2854unboximpl());
    }

    private /* synthetic */ WindowWidthSizeClass(int i) {
        this.value = i;
    }

    /* renamed from: compareTo-GxU_lZo  reason: not valid java name */
    public static int m2847compareToGxU_lZo(int i, int i2) {
        return Intrinsics.compare(i, i2);
    }

    /* renamed from: compareTo-GxU_lZo  reason: not valid java name */
    public int m2853compareToGxU_lZo(int i) {
        return m2847compareToGxU_lZo(this.value, i);
    }

    public String toString() {
        return m2852toStringimpl(this.value);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m2852toStringimpl(int i) {
        String str;
        if (m2850equalsimpl0(i, Compact)) {
            str = "Compact";
        } else if (m2850equalsimpl0(i, Medium)) {
            str = "Medium";
        } else {
            str = m2850equalsimpl0(i, Expanded) ? "Expanded" : "";
        }
        return "WindowWidthSizeClass.".concat(str);
    }

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass$Companion;", "", "()V", "Compact", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "getCompact-Y0FxcvE", "()I", "I", "Expanded", "getExpanded-Y0FxcvE", "Medium", "getMedium-Y0FxcvE", "fromWidth", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "Landroidx/compose/ui/unit/Dp;", "fromWidth-rEPKUCk$material3_window_size_class_release", "(F)I", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getCompact-Y0FxcvE  reason: not valid java name */
        public final int m2856getCompactY0FxcvE() {
            return WindowWidthSizeClass.Compact;
        }

        /* renamed from: getMedium-Y0FxcvE  reason: not valid java name */
        public final int m2858getMediumY0FxcvE() {
            return WindowWidthSizeClass.Medium;
        }

        /* renamed from: getExpanded-Y0FxcvE  reason: not valid java name */
        public final int m2857getExpandedY0FxcvE() {
            return WindowWidthSizeClass.Expanded;
        }

        /* renamed from: fromWidth-rEPKUCk$material3_window_size_class_release  reason: not valid java name */
        public final int m2855fromWidthrEPKUCk$material3_window_size_class_release(float f) {
            if (Dp.m5606compareTo0680j_4(f, Dp.m5607constructorimpl((float) 0)) >= 0) {
                return Dp.m5606compareTo0680j_4(f, Dp.m5607constructorimpl((float) 600)) < 0 ? m2856getCompactY0FxcvE() : Dp.m5606compareTo0680j_4(f, Dp.m5607constructorimpl((float) 840)) < 0 ? m2858getMediumY0FxcvE() : m2857getExpandedY0FxcvE();
            }
            throw new IllegalArgumentException("Width must not be negative".toString());
        }
    }
}
