package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingHeader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingHeaderKt$OnboardingHeader$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ Function0<Unit> $onBackClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingHeaderKt$OnboardingHeader$1$1(MutableInteractionSource mutableInteractionSource, Function0<Unit> function0, int i) {
        super(3);
        this.$interactionSource = mutableInteractionSource;
        this.$onBackClick = function0;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(471901455, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingHeader.<anonymous>.<anonymous> (OnboardingHeader.kt:42)");
        }
        Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.back_white, composer, 0);
        float f = 22;
        Modifier m797sizeVpY3zN4 = SizeKt.m797sizeVpY3zN4(Modifier.Companion, Dp.m5607constructorimpl(f), Dp.m5607constructorimpl(f));
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        Function0<Unit> function0 = this.$onBackClick;
        composer.startReplaceableGroup(1157296644);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        boolean changed = composer.changed(function0);
        OnboardingHeaderKt$OnboardingHeader$1$1$1$1 rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new OnboardingHeaderKt$OnboardingHeader$1$1$1$1(function0);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        ImageKt.Image(painterResource, "Back", ClickableKt.m452clickableO2vRcR0$default(m797sizeVpY3zN4, mutableInteractionSource, null, false, null, null, rememberedValue, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, (Composer) composer, 56, 120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
