package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Chip.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChipKt$SelectableChip$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $avatar;
    final /* synthetic */ SelectableChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ boolean $selected;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$SelectableChip$2(SelectableChipColors selectableChipColors, boolean z, boolean z2, int i, int i2, Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, float f, PaddingValues paddingValues) {
        super(2);
        this.$colors = selectableChipColors;
        this.$enabled = z;
        this.$selected = z2;
        this.$$dirty = i;
        this.$$dirty1 = i2;
        this.$label = function2;
        this.$labelTextStyle = textStyle;
        this.$leadingIcon = function22;
        this.$avatar = function23;
        this.$trailingIcon = function24;
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1384@68695L29,1386@68811L42,1387@68900L43,1379@68510L527:Chip.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-577614814, i, -1, "androidx.compose.material3.SelectableChip.<anonymous> (Chip.kt:1378)");
            }
            SelectableChipColors selectableChipColors = this.$colors;
            boolean z = this.$enabled;
            boolean z2 = this.$selected;
            int i2 = this.$$dirty;
            long m3301unboximpl = selectableChipColors.labelColor$material3_release(z, z2, composer, ((i2 << 3) & 112) | ((i2 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m3301unboximpl();
            SelectableChipColors selectableChipColors2 = this.$colors;
            boolean z3 = this.$enabled;
            boolean z4 = this.$selected;
            int i3 = this.$$dirty;
            long m3301unboximpl2 = selectableChipColors2.leadingIconContentColor$material3_release(z3, z4, composer, ((i3 << 3) & 112) | ((i3 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m3301unboximpl();
            SelectableChipColors selectableChipColors3 = this.$colors;
            boolean z5 = this.$enabled;
            boolean z6 = this.$selected;
            int i4 = this.$$dirty;
            long m3301unboximpl3 = selectableChipColors3.trailingIconContentColor$material3_release(z5, z6, composer, ((i4 << 3) & 112) | ((i4 >> 9) & 14) | ((this.$$dirty1 << 6) & 896)).getValue().m3301unboximpl();
            Function2<Composer, Integer, Unit> function2 = this.$label;
            TextStyle textStyle = this.$labelTextStyle;
            Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function23 = this.$avatar;
            Function2<Composer, Integer, Unit> function24 = this.$trailingIcon;
            float f = this.$minHeight;
            PaddingValues paddingValues = this.$paddingValues;
            int i5 = this.$$dirty;
            int i6 = ((i5 >> 12) & 14) | ((i5 >> 12) & 112) | ((i5 >> 9) & 7168) | ((i5 >> 9) & 57344) | ((i5 >> 9) & 458752);
            int i7 = this.$$dirty1;
            ChipKt.m1619ChipContentfe0OD_I(function2, textStyle, m3301unboximpl, function22, function23, function24, m3301unboximpl2, m3301unboximpl3, f, paddingValues, composer, ((i7 << 15) & 1879048192) | i6 | ((i7 << 15) & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
