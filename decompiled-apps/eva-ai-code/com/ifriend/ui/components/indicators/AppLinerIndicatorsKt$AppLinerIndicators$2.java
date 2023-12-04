package com.ifriend.ui.components.indicators;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppLinerIndicators.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppLinerIndicatorsKt$AppLinerIndicators$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ float $indicatorHeight;
    final /* synthetic */ float $indicatorWidth;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ int $pageCount;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ long $selectedColor;
    final /* synthetic */ long $unselectedColor;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLinerIndicatorsKt$AppLinerIndicators$2(Modifier modifier, int i, PagerState pagerState, long j, long j2, float f, float f2, int i2, int i3) {
        super(2);
        this.$modifier = modifier;
        this.$pageCount = i;
        this.$pagerState = pagerState;
        this.$selectedColor = j;
        this.$unselectedColor = j2;
        this.$indicatorHeight = f;
        this.$indicatorWidth = f2;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AppLinerIndicatorsKt.m7041AppLinerIndicators4eDdRP8(this.$modifier, this.$pageCount, this.$pagerState, this.$selectedColor, this.$unselectedColor, this.$indicatorHeight, this.$indicatorWidth, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
