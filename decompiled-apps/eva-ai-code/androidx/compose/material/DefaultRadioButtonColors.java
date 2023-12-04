package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RadioButton.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J&\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007R\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u0007\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, d2 = {"Landroidx/compose/material/DefaultRadioButtonColors;", "Landroidx/compose/material/RadioButtonColors;", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledColor", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "equals", "", "other", "", "hashCode", "", "radioColor", "Landroidx/compose/runtime/State;", "enabled", "selected", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultRadioButtonColors implements RadioButtonColors {
    private final long disabledColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ DefaultRadioButtonColors(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    private DefaultRadioButtonColors(long j, long j2, long j3) {
        this.selectedColor = j;
        this.unselectedColor = j2;
        this.disabledColor = j3;
    }

    @Override // androidx.compose.material.RadioButtonColors
    public State<Color> radioColor(boolean z, boolean z2, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        composer.startReplaceableGroup(1243421834);
        ComposerKt.sourceInformation(composer, "C(radioColor):RadioButton.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1243421834, i, -1, "androidx.compose.material.DefaultRadioButtonColors.radioColor (RadioButton.kt:187)");
        }
        if (!z) {
            j = this.disabledColor;
        } else if (!z2) {
            j = this.unselectedColor;
        } else {
            j = this.selectedColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-1052799107);
            ComposerKt.sourceInformation(composer, "197@7711L75");
            rememberUpdatedState = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1052799002);
            ComposerKt.sourceInformation(composer, "199@7816L28");
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3281boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DefaultRadioButtonColors defaultRadioButtonColors = (DefaultRadioButtonColors) obj;
        return Color.m3292equalsimpl0(this.selectedColor, defaultRadioButtonColors.selectedColor) && Color.m3292equalsimpl0(this.unselectedColor, defaultRadioButtonColors.unselectedColor) && Color.m3292equalsimpl0(this.disabledColor, defaultRadioButtonColors.disabledColor);
    }

    public int hashCode() {
        return (((Color.m3298hashCodeimpl(this.selectedColor) * 31) + Color.m3298hashCodeimpl(this.unselectedColor)) * 31) + Color.m3298hashCodeimpl(this.disabledColor);
    }
}
