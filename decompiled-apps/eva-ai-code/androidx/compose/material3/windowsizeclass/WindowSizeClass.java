package androidx.compose.material3.windowsizeclass;

import androidx.compose.ui.unit.DpSize;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: WindowSizeClass.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u001a\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "", "widthSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowWidthSizeClass;", "heightSizeClass", "Landroidx/compose/material3/windowsizeclass/WindowHeightSizeClass;", "(II)V", "getHeightSizeClass-Pt018CI", "()I", "I", "getWidthSizeClass-Y0FxcvE", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WindowSizeClass {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int heightSizeClass;
    private final int widthSizeClass;

    public /* synthetic */ WindowSizeClass(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    private WindowSizeClass(int i, int i2) {
        this.widthSizeClass = i;
        this.heightSizeClass = i2;
    }

    /* renamed from: getWidthSizeClass-Y0FxcvE  reason: not valid java name */
    public final int m2844getWidthSizeClassY0FxcvE() {
        return this.widthSizeClass;
    }

    /* renamed from: getHeightSizeClass-Pt018CI  reason: not valid java name */
    public final int m2843getHeightSizeClassPt018CI() {
        return this.heightSizeClass;
    }

    /* compiled from: WindowSizeClass.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001d\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/material3/windowsizeclass/WindowSizeClass$Companion;", "", "()V", "calculateFromSize", "Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "size", "Landroidx/compose/ui/unit/DpSize;", "calculateFromSize-EaSLcWc", "(J)Landroidx/compose/material3/windowsizeclass/WindowSizeClass;", "material3-window-size-class_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: calculateFromSize-EaSLcWc  reason: not valid java name */
        public final WindowSizeClass m2845calculateFromSizeEaSLcWc(long j) {
            return new WindowSizeClass(WindowWidthSizeClass.Companion.m2855fromWidthrEPKUCk$material3_window_size_class_release(DpSize.m5705getWidthD9Ej5fM(j)), WindowHeightSizeClass.Companion.m2839fromHeightAt195nw$material3_window_size_class_release(DpSize.m5703getHeightD9Ej5fM(j)), null);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WindowSizeClass windowSizeClass = (WindowSizeClass) obj;
        return WindowWidthSizeClass.m2850equalsimpl0(this.widthSizeClass, windowSizeClass.widthSizeClass) && WindowHeightSizeClass.m2834equalsimpl0(this.heightSizeClass, windowSizeClass.heightSizeClass);
    }

    public int hashCode() {
        return (WindowWidthSizeClass.m2851hashCodeimpl(this.widthSizeClass) * 31) + WindowHeightSizeClass.m2835hashCodeimpl(this.heightSizeClass);
    }

    public String toString() {
        return "WindowSizeClass(" + ((Object) WindowWidthSizeClass.m2852toStringimpl(this.widthSizeClass)) + ", " + ((Object) WindowHeightSizeClass.m2836toStringimpl(this.heightSizeClass)) + ')';
    }
}
