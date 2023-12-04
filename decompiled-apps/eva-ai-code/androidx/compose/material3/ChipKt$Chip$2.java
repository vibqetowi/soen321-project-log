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
public final class ChipKt$Chip$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ ChipColors $colors;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ long $labelColor;
    final /* synthetic */ TextStyle $labelTextStyle;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ float $minHeight;
    final /* synthetic */ PaddingValues $paddingValues;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChipKt$Chip$2(Function2<? super Composer, ? super Integer, Unit> function2, TextStyle textStyle, long j, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, ChipColors chipColors, boolean z, int i, float f, PaddingValues paddingValues, int i2) {
        super(2);
        this.$label = function2;
        this.$labelTextStyle = textStyle;
        this.$labelColor = j;
        this.$leadingIcon = function22;
        this.$trailingIcon = function23;
        this.$colors = chipColors;
        this.$enabled = z;
        this.$$dirty = i;
        this.$minHeight = f;
        this.$paddingValues = paddingValues;
        this.$$dirty1 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ComposerKt.sourceInformation(composer, "C1336@67086L32,1337@67165L33,1329@66819L473:Chip.kt#uh7d8r");
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1985962652, i, -1, "androidx.compose.material3.Chip.<anonymous> (Chip.kt:1328)");
            }
            Function2<Composer, Integer, Unit> function2 = this.$label;
            TextStyle textStyle = this.$labelTextStyle;
            long j = this.$labelColor;
            Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
            Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
            ChipColors chipColors = this.$colors;
            boolean z = this.$enabled;
            int i2 = this.$$dirty;
            long m3301unboximpl = chipColors.leadingIconContentColor$material3_release(z, composer, ((i2 >> 24) & 112) | ((i2 >> 6) & 14)).getValue().m3301unboximpl();
            ChipColors chipColors2 = this.$colors;
            boolean z2 = this.$enabled;
            int i3 = this.$$dirty;
            long m3301unboximpl2 = chipColors2.trailingIconContentColor$material3_release(z2, composer, ((i3 >> 24) & 112) | ((i3 >> 6) & 14)).getValue().m3301unboximpl();
            float f = this.$minHeight;
            PaddingValues paddingValues = this.$paddingValues;
            int i4 = this.$$dirty;
            int i5 = this.$$dirty1;
            ChipKt.m1619ChipContentfe0OD_I(function2, textStyle, j, function22, null, function23, m3301unboximpl, m3301unboximpl2, f, paddingValues, composer, ((i4 >> 9) & 14) | 24576 | ((i4 >> 9) & 112) | ((i4 >> 9) & 896) | ((i4 >> 9) & 7168) | (458752 & (i4 >> 6)) | ((i5 << 18) & 234881024) | ((i5 << 18) & 1879048192));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
