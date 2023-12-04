package com.ifriend.ui.components.popup;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedPopupKt$AnimatedPopup$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ Function3<MutableTransitionState<Boolean>, Composer, Integer, Unit> $content;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ Function3<MutableTransitionState<Boolean>, Composer, Integer, Unit> $scrim;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedPopupKt$AnimatedPopup$3(boolean z, Function0<Unit> function0, Function3<? super MutableTransitionState<Boolean>, ? super Composer, ? super Integer, Unit> function3, Function3<? super MutableTransitionState<Boolean>, ? super Composer, ? super Integer, Unit> function32, int i, int i2) {
        super(2);
        this.$isVisible = z;
        this.$onDismiss = function0;
        this.$scrim = function3;
        this.$content = function32;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedPopupKt.AnimatedPopup(this.$isVisible, this.$onDismiss, this.$scrim, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
