package com.ifriend.ui.components.popup;

import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedPopup.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedPopupKt$FullscreenAnimatedPopup$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ boolean $closeOnScrimClick;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ EnterTransition $contentEnter;
    final /* synthetic */ ExitTransition $contentExit;
    final /* synthetic */ boolean $isVisible;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ long $scrimColor;
    final /* synthetic */ EnterTransition $scrimEnter;
    final /* synthetic */ ExitTransition $scrimExit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedPopupKt$FullscreenAnimatedPopup$3(boolean z, Function0<Unit> function0, long j, EnterTransition enterTransition, ExitTransition exitTransition, boolean z2, EnterTransition enterTransition2, ExitTransition exitTransition2, Function2<? super Composer, ? super Integer, Unit> function2, int i, int i2) {
        super(2);
        this.$isVisible = z;
        this.$onDismiss = function0;
        this.$scrimColor = j;
        this.$scrimEnter = enterTransition;
        this.$scrimExit = exitTransition;
        this.$closeOnScrimClick = z2;
        this.$contentEnter = enterTransition2;
        this.$contentExit = exitTransition2;
        this.$content = function2;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AnimatedPopupKt.m7050FullscreenAnimatedPopupIkByU14(this.$isVisible, this.$onDismiss, this.$scrimColor, this.$scrimEnter, this.$scrimExit, this.$closeOnScrimClick, this.$contentEnter, this.$contentExit, this.$content, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
