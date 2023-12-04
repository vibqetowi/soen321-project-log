package androidx.compose.foundation.layout;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: WindowInsets.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/layout/PaddingValuesInsets;", "Landroidx/compose/foundation/layout/WindowInsets;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Landroidx/compose/foundation/layout/PaddingValues;)V", "equals", "", "other", "", "getBottom", "", "density", "Landroidx/compose/ui/unit/Density;", "getLeft", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getRight", "getTop", "hashCode", "toString", "", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PaddingValuesInsets implements WindowInsets {
    private final PaddingValues paddingValues;

    public PaddingValuesInsets(PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getLeft(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo582roundToPx0680j_4(this.paddingValues.mo698calculateLeftPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getTop(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo582roundToPx0680j_4(this.paddingValues.mo700calculateTopPaddingD9Ej5fM());
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getRight(Density density, LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return density.mo582roundToPx0680j_4(this.paddingValues.mo699calculateRightPaddingu2uoSUM(layoutDirection));
    }

    @Override // androidx.compose.foundation.layout.WindowInsets
    public int getBottom(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo582roundToPx0680j_4(this.paddingValues.mo697calculateBottomPaddingD9Ej5fM());
    }

    public String toString() {
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        float mo698calculateLeftPaddingu2uoSUM = this.paddingValues.mo698calculateLeftPaddingu2uoSUM(layoutDirection);
        float mo700calculateTopPaddingD9Ej5fM = this.paddingValues.mo700calculateTopPaddingD9Ej5fM();
        float mo699calculateRightPaddingu2uoSUM = this.paddingValues.mo699calculateRightPaddingu2uoSUM(layoutDirection);
        float mo697calculateBottomPaddingD9Ej5fM = this.paddingValues.mo697calculateBottomPaddingD9Ej5fM();
        return "PaddingValues(" + ((Object) Dp.m5618toStringimpl(mo698calculateLeftPaddingu2uoSUM)) + ", " + ((Object) Dp.m5618toStringimpl(mo700calculateTopPaddingD9Ej5fM)) + ", " + ((Object) Dp.m5618toStringimpl(mo699calculateRightPaddingu2uoSUM)) + ", " + ((Object) Dp.m5618toStringimpl(mo697calculateBottomPaddingD9Ej5fM)) + ')';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PaddingValuesInsets) {
            return Intrinsics.areEqual(((PaddingValuesInsets) obj).paddingValues, this.paddingValues);
        }
        return false;
    }

    public int hashCode() {
        return this.paddingValues.hashCode();
    }
}
