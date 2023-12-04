package com.ifriend.presentation.features.purchases.benefits.flow;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import com.ifriend.ui.components.progress.IndeterminateProgressKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BenefitsPremiumActiveEntry.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.purchases.benefits.flow.ComposableSingletons$BenefitsPremiumActiveEntryKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$BenefitsPremiumActiveEntryKt$lambda1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    public static final ComposableSingletons$BenefitsPremiumActiveEntryKt$lambda1$1 INSTANCE = new ComposableSingletons$BenefitsPremiumActiveEntryKt$lambda1$1();

    ComposableSingletons$BenefitsPremiumActiveEntryKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-370785886, i, -1, "com.ifriend.presentation.features.purchases.benefits.flow.ComposableSingletons$BenefitsPremiumActiveEntryKt.lambda-1.<anonymous> (BenefitsPremiumActiveEntry.kt:107)");
        }
        IndeterminateProgressKt.m7059IndeterminateProgresssW7UJKQ(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), 0L, null, null, composer, 6, 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
