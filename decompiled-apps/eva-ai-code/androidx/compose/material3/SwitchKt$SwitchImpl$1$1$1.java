package androidx.compose.material3;

import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.math.MathKt;
/* compiled from: Switch.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SwitchKt$SwitchImpl$1$1$1 extends Lambda implements Function1<Density, IntOffset> {
    final /* synthetic */ float $thumbOffset;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1$1(float f) {
        super(1);
        this.$thumbOffset = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
        return IntOffset.m5716boximpl(m2091invokeBjo55l4(density));
    }

    /* renamed from: invoke-Bjo55l4  reason: not valid java name */
    public final long m2091invokeBjo55l4(Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffsetKt.IntOffset(MathKt.roundToInt(this.$thumbOffset), 0);
    }
}
