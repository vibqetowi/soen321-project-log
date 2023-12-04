package com.ifriend.ui.components.scrollable;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.google.logging.type.LogSeverity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: AutoScroll.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0082@ø\u0001\u0001¢\u0006\u0002\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"InfiniteAutoScrollEffect", "", "Landroidx/compose/foundation/gestures/ScrollableState;", "enabled", "", "scrollDx", "Landroidx/compose/ui/unit/Dp;", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "InfiniteAutoScrollEffect-942rkJo", "(Landroidx/compose/foundation/gestures/ScrollableState;ZFLandroidx/compose/animation/core/AnimationSpec;Landroidx/compose/runtime/Composer;II)V", "autoScroll", "(Landroidx/compose/foundation/gestures/ScrollableState;FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "common_ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoScrollKt {
    /* renamed from: InfiniteAutoScrollEffect-942rkJo  reason: not valid java name */
    public static final void m7066InfiniteAutoScrollEffect942rkJo(ScrollableState InfiniteAutoScrollEffect, boolean z, float f, AnimationSpec<Float> animationSpec, Composer composer, int i, int i2) {
        TweenSpec tweenSpec;
        int i3;
        Intrinsics.checkNotNullParameter(InfiniteAutoScrollEffect, "$this$InfiniteAutoScrollEffect");
        Composer startRestartGroup = composer.startRestartGroup(218212037);
        ComposerKt.sourceInformation(startRestartGroup, "C(InfiniteAutoScrollEffect)P(1,2:c#ui.unit.Dp)");
        boolean z2 = (i2 & 1) != 0 ? true : z;
        float m5607constructorimpl = (i2 & 2) != 0 ? Dp.m5607constructorimpl(24) : f;
        if ((i2 & 4) != 0) {
            tweenSpec = AnimationSpecKt.tween$default(LogSeverity.EMERGENCY_VALUE, 0, EasingKt.getLinearEasing(), 2, null);
            i3 = i & (-7169);
        } else {
            tweenSpec = animationSpec;
            i3 = i;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(218212037, i3, -1, "com.ifriend.ui.components.scrollable.InfiniteAutoScrollEffect (AutoScroll.kt:19)");
        }
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object consume = startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        float mo588toPx0680j_4 = ((Density) consume).mo588toPx0680j_4(m5607constructorimpl);
        int i4 = i3 >> 3;
        EffectsKt.LaunchedEffect(Boolean.valueOf(z2), Dp.m5605boximpl(m5607constructorimpl), Float.valueOf(mo588toPx0680j_4), new AutoScrollKt$InfiniteAutoScrollEffect$1(z2, InfiniteAutoScrollEffect, mo588toPx0680j_4, tweenSpec, null), startRestartGroup, (i4 & 14) | 4096 | (i4 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AutoScrollKt$InfiniteAutoScrollEffect$2(InfiniteAutoScrollEffect, z2, m5607constructorimpl, tweenSpec, i, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object autoScroll(ScrollableState scrollableState, float f, AnimationSpec<Float> animationSpec, Continuation<? super Unit> continuation) {
        Object scroll = scrollableState.scroll(MutatePriority.PreventUserInput, new AutoScrollKt$autoScroll$2(f, animationSpec, new Ref.FloatRef(), null), continuation);
        return scroll == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? scroll : Unit.INSTANCE;
    }
}
