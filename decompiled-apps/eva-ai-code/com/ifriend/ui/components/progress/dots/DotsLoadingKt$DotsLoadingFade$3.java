package com.ifriend.ui.components.progress.dots;

import androidx.compose.animation.core.Easing;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DotsLoading.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DotsLoadingKt$DotsLoadingFade$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ long $dotsColor;
    final /* synthetic */ int $dotsCount;
    final /* synthetic */ float $dotsSize;
    final /* synthetic */ int $duration;
    final /* synthetic */ Easing $easing;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ DotsLoadingState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsLoadingKt$DotsLoadingFade$3(DotsLoadingState dotsLoadingState, Modifier modifier, int i, float f, long j, int i2, Easing easing, int i3, int i4) {
        super(2);
        this.$state = dotsLoadingState;
        this.$modifier = modifier;
        this.$dotsCount = i;
        this.$dotsSize = f;
        this.$dotsColor = j;
        this.$duration = i2;
        this.$easing = easing;
        this.$$changed = i3;
        this.$$default = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        DotsLoadingKt.m7061DotsLoadingFadeDDuSU3M(this.$state, this.$modifier, this.$dotsCount, this.$dotsSize, this.$dotsColor, this.$duration, this.$easing, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
