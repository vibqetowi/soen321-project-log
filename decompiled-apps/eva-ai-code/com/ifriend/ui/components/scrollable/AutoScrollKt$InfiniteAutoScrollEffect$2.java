package com.ifriend.ui.components.scrollable;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AutoScroll.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoScrollKt$InfiniteAutoScrollEffect$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ float $scrollDx;
    final /* synthetic */ ScrollableState $this_InfiniteAutoScrollEffect;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoScrollKt$InfiniteAutoScrollEffect$2(ScrollableState scrollableState, boolean z, float f, AnimationSpec<Float> animationSpec, int i, int i2) {
        super(2);
        this.$this_InfiniteAutoScrollEffect = scrollableState;
        this.$enabled = z;
        this.$scrollDx = f;
        this.$animationSpec = animationSpec;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AutoScrollKt.m7066InfiniteAutoScrollEffect942rkJo(this.$this_InfiniteAutoScrollEffect, this.$enabled, this.$scrollDx, this.$animationSpec, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
