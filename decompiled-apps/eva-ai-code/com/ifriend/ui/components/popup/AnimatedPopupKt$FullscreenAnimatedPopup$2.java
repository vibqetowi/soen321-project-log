package com.ifriend.ui.components.popup;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AnimatedPopup.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "transition", "Landroidx/compose/animation/core/MutableTransitionState;", "", "invoke", "(Landroidx/compose/animation/core/MutableTransitionState;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AnimatedPopupKt$FullscreenAnimatedPopup$2 extends Lambda implements Function3<MutableTransitionState<Boolean>, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ Function2<Composer, Integer, Unit> $content;
    final /* synthetic */ EnterTransition $contentEnter;
    final /* synthetic */ ExitTransition $contentExit;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimatedPopupKt$FullscreenAnimatedPopup$2(EnterTransition enterTransition, ExitTransition exitTransition, int i, Function2<? super Composer, ? super Integer, Unit> function2) {
        super(3);
        this.$contentEnter = enterTransition;
        this.$contentExit = exitTransition;
        this.$$dirty = i;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(MutableTransitionState<Boolean> mutableTransitionState, Composer composer, Integer num) {
        invoke(mutableTransitionState, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(MutableTransitionState<Boolean> transition, Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(transition, "transition");
        if ((i & 14) == 0) {
            i2 = (composer.changed(transition) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 91) != 18 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1408515939, i2, -1, "com.ifriend.ui.components.popup.FullscreenAnimatedPopup.<anonymous> (AnimatedPopup.kt:89)");
            }
            int i3 = (i2 & 14) | 196656 | MutableTransitionState.$stable;
            int i4 = this.$$dirty;
            AnimatedVisibilityKt.AnimatedVisibility(transition, SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), this.$contentEnter, this.$contentExit, (String) null, ComposableLambdaKt.composableLambda(composer, 1447223867, true, new AnonymousClass1(this.$content, this.$$dirty)), composer, ((i4 >> 12) & 7168) | i3 | ((i4 >> 12) & 896), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AnimatedPopup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.ui.components.popup.AnimatedPopupKt$FullscreenAnimatedPopup$2$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(3);
            this.$content = function2;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1447223867, i, -1, "com.ifriend.ui.components.popup.FullscreenAnimatedPopup.<anonymous>.<anonymous> (AnimatedPopup.kt:95)");
            }
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 24) & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
