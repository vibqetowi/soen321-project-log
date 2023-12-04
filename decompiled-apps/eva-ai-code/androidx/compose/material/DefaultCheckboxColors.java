package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkbox.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B`\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0016J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0014\u001a\u00020\u0015H\u0017ø\u0001\u0000¢\u0006\u0002\u0010\u0019R\u0019\u0010\n\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0005\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0002\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\f\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\r\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\t\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0006\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u0003X\u0082\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001a"}, d2 = {"Landroidx/compose/material/DefaultCheckboxColors;", "Landroidx/compose/material/CheckboxColors;", "checkedCheckmarkColor", "Landroidx/compose/ui/graphics/Color;", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "borderColor", "Landroidx/compose/runtime/State;", "enabled", "", "state", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "checkmarkColor", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultCheckboxColors implements CheckboxColors {
    private final long checkedBorderColor;
    private final long checkedBoxColor;
    private final long checkedCheckmarkColor;
    private final long disabledBorderColor;
    private final long disabledCheckedBoxColor;
    private final long disabledIndeterminateBorderColor;
    private final long disabledIndeterminateBoxColor;
    private final long disabledUncheckedBoxColor;
    private final long uncheckedBorderColor;
    private final long uncheckedBoxColor;
    private final long uncheckedCheckmarkColor;

    /* compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    private DefaultCheckboxColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.checkedCheckmarkColor = j;
        this.uncheckedCheckmarkColor = j2;
        this.checkedBoxColor = j3;
        this.uncheckedBoxColor = j4;
        this.disabledCheckedBoxColor = j5;
        this.disabledUncheckedBoxColor = j6;
        this.disabledIndeterminateBoxColor = j7;
        this.checkedBorderColor = j8;
        this.uncheckedBorderColor = j9;
        this.disabledBorderColor = j10;
        this.disabledIndeterminateBorderColor = j11;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> checkmarkColor(ToggleableState state, Composer composer, int i) {
        long j;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(544656267);
        ComposerKt.sourceInformation(composer, "C(checkmarkColor)422@16505L61:Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        if (state == ToggleableState.Off) {
            j = this.uncheckedCheckmarkColor;
        } else {
            j = this.checkedCheckmarkColor;
        }
        State<Color> m329animateColorAsStateeuL9pac = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return m329animateColorAsStateeuL9pac;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> boxColor(boolean z, ToggleableState state, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(840901029);
        ComposerKt.sourceInformation(composer, "C(boxColor):Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBoxColor;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.uncheckedBoxColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 == 1) {
                j = this.disabledCheckedBoxColor;
            } else if (i3 == 2) {
                j = this.disabledIndeterminateBoxColor;
            } else if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.disabledUncheckedBoxColor;
            }
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-2010643468);
            ComposerKt.sourceInformation(composer, "444@17433L61");
            rememberUpdatedState = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
            ComposerKt.sourceInformation(composer, "446@17524L28");
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3281boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    public State<Color> borderColor(boolean z, ToggleableState state, Composer composer, int i) {
        long j;
        State<Color> rememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-1568341342);
        ComposerKt.sourceInformation(composer, "C(borderColor):Checkbox.kt#jmzs0o");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                j = this.checkedBorderColor;
            } else if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            } else {
                j = this.uncheckedBorderColor;
            }
        } else {
            int i3 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    j = this.disabledIndeterminateBorderColor;
                } else if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            j = this.disabledBorderColor;
        }
        long j2 = j;
        if (z) {
            composer.startReplaceableGroup(-796405227);
            ComposerKt.sourceInformation(composer, "468@18393L61");
            rememberUpdatedState = SingleValueAnimationKt.m329animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
            ComposerKt.sourceInformation(composer, "470@18484L28");
            rememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3281boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberUpdatedState;
    }
}
