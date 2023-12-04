package com.ifriend.ui.components.progress;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.components.shadow.ColoredShadowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: GlowingProgressBar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "invoke", "(Landroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlowingProgressBarKt$GlowingProgressBar$1$1 extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
    final /* synthetic */ AnimationSpec<Dp> $animationSpec;
    final /* synthetic */ float $progress;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlowingProgressBarKt$GlowingProgressBar$1$1(float f, AnimationSpec<Dp> animationSpec) {
        super(3);
        this.$progress = f;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
        invoke(boxWithConstraintsScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(BoxWithConstraintsScope BoxWithConstraints, Composer composer, int i) {
        int i2;
        float m5607constructorimpl;
        Modifier m7067coloredShadowPRYyx80;
        Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((i & 14) == 0) {
            i2 = (composer.changed(BoxWithConstraints) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2030345716, i, -1, "com.ifriend.ui.components.progress.GlowingProgressBar.<anonymous>.<anonymous> (GlowingProgressBar.kt:55)");
            }
            float f = this.$progress;
            if (!(f == 0.0f)) {
                m5607constructorimpl = ((Dp) RangesKt.coerceAtLeast(Dp.m5605boximpl(Dp.m5607constructorimpl(f * BoxWithConstraints.mo687getMaxWidthD9Ej5fM())), Dp.m5605boximpl(BoxWithConstraints.mo686getMaxHeightD9Ej5fM()))).m5621unboximpl();
            } else {
                m5607constructorimpl = Dp.m5607constructorimpl(0);
            }
            m7067coloredShadowPRYyx80 = ColoredShadowKt.m7067coloredShadowPRYyx80(BackgroundKt.m420backgroundbw27NRU(SizeKt.m800width3ABfNKs(SizeKt.fillMaxHeight$default(Modifier.Companion, 0.0f, 1, null), invoke$lambda$0(AnimateAsStateKt.m341animateDpAsStateAjpBEmI(m5607constructorimpl, this.$animationSpec, "GlowingProgressAnimation", null, composer, 448, 8))), Color.Companion.m3328getWhite0d7_KjU(), RoundedCornerShapeKt.getCircleShape()), Color.Companion.m3328getWhite0d7_KjU(), (r17 & 2) != 0 ? 0.2f : 0.7f, Dp.m5607constructorimpl(15), Dp.m5607constructorimpl(10), (r17 & 16) != 0 ? Dp.m5607constructorimpl(0) : 0.0f, (r17 & 32) != 0 ? Dp.m5607constructorimpl(0) : 0.0f);
            BoxKt.Box(m7067coloredShadowPRYyx80, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m5621unboximpl();
    }
}
