package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Checkbox.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $borderColor;
    final /* synthetic */ State<Color> $boxColor;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction;
    final /* synthetic */ State<Color> $checkColor;
    final /* synthetic */ State<Float> $checkDrawFraction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5, CheckDrawingCache checkDrawingCache) {
        super(1);
        this.$boxColor = state;
        this.$borderColor = state2;
        this.$checkColor = state3;
        this.$checkDrawFraction = state4;
        this.$checkCenterGravitationShiftFraction = state5;
        this.$checkCache = checkDrawingCache;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(Canvas.mo588toPx0680j_4(f));
        long m3301unboximpl = this.$boxColor.getValue().m3301unboximpl();
        long m3301unboximpl2 = this.$borderColor.getValue().m3301unboximpl();
        f2 = CheckboxKt.RadiusSize;
        CheckboxKt.m1616drawBox1wkBAMs(Canvas, m3301unboximpl, m3301unboximpl2, Canvas.mo588toPx0680j_4(f2), floor);
        CheckboxKt.m1617drawCheck3IgeMak(Canvas, this.$checkColor.getValue().m3301unboximpl(), this.$checkDrawFraction.getValue().floatValue(), this.$checkCenterGravitationShiftFraction.getValue().floatValue(), floor, this.$checkCache);
    }
}
