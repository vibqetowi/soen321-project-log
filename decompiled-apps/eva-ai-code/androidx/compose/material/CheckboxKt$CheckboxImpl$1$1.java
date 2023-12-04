package androidx.compose.material;

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
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt$CheckboxImpl$1$1 extends Lambda implements Function1<DrawScope, Unit> {
    final /* synthetic */ State<Color> $borderColor$delegate;
    final /* synthetic */ State<Color> $boxColor$delegate;
    final /* synthetic */ CheckDrawingCache $checkCache;
    final /* synthetic */ State<Float> $checkCenterGravitationShiftFraction$delegate;
    final /* synthetic */ State<Color> $checkColor$delegate;
    final /* synthetic */ State<Float> $checkDrawFraction$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckboxKt$CheckboxImpl$1$1(CheckDrawingCache checkDrawingCache, State<Color> state, State<Color> state2, State<Color> state3, State<Float> state4, State<Float> state5) {
        super(1);
        this.$checkCache = checkDrawingCache;
        this.$boxColor$delegate = state;
        this.$borderColor$delegate = state2;
        this.$checkColor$delegate = state3;
        this.$checkDrawFraction$delegate = state4;
        this.$checkCenterGravitationShiftFraction$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
        invoke2(drawScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(DrawScope Canvas) {
        float f;
        long CheckboxImpl$lambda$9;
        long CheckboxImpl$lambda$10;
        float f2;
        long CheckboxImpl$lambda$8;
        float CheckboxImpl$lambda$4;
        float CheckboxImpl$lambda$6;
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        f = CheckboxKt.StrokeWidth;
        float floor = (float) Math.floor(Canvas.mo588toPx0680j_4(f));
        CheckboxImpl$lambda$9 = CheckboxKt.CheckboxImpl$lambda$9(this.$boxColor$delegate);
        CheckboxImpl$lambda$10 = CheckboxKt.CheckboxImpl$lambda$10(this.$borderColor$delegate);
        f2 = CheckboxKt.RadiusSize;
        CheckboxKt.m1290drawBox1wkBAMs(Canvas, CheckboxImpl$lambda$9, CheckboxImpl$lambda$10, Canvas.mo588toPx0680j_4(f2), floor);
        CheckboxImpl$lambda$8 = CheckboxKt.CheckboxImpl$lambda$8(this.$checkColor$delegate);
        CheckboxImpl$lambda$4 = CheckboxKt.CheckboxImpl$lambda$4(this.$checkDrawFraction$delegate);
        CheckboxImpl$lambda$6 = CheckboxKt.CheckboxImpl$lambda$6(this.$checkCenterGravitationShiftFraction$delegate);
        CheckboxKt.m1291drawCheck3IgeMak(Canvas, CheckboxImpl$lambda$8, CheckboxImpl$lambda$4, CheckboxImpl$lambda$6, floor, this.$checkCache);
    }
}
