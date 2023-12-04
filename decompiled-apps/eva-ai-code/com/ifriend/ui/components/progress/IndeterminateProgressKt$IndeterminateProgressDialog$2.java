package com.ifriend.ui.components.progress;

import androidx.compose.animation.core.DurationBasedAnimationSpec;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: IndeterminateProgress.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class IndeterminateProgressKt$IndeterminateProgressDialog$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ DurationBasedAnimationSpec<Float> $animation;
    final /* synthetic */ RepeatMode $repeatMode;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndeterminateProgressKt$IndeterminateProgressDialog$2(DurationBasedAnimationSpec<Float> durationBasedAnimationSpec, RepeatMode repeatMode, int i) {
        super(2);
        this.$animation = durationBasedAnimationSpec;
        this.$repeatMode = repeatMode;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(384458766, i, -1, "com.ifriend.ui.components.progress.IndeterminateProgressDialog.<anonymous> (IndeterminateProgress.kt:85)");
            }
            IndeterminateProgressKt.m7059IndeterminateProgresssW7UJKQ(null, Color.Companion.m3326getTransparent0d7_KjU(), this.$animation, this.$repeatMode, composer, ((this.$$dirty << 6) & 7168) | 560, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
