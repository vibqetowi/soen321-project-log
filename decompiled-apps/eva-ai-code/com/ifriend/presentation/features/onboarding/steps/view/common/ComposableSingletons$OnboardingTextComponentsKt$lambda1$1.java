package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingTextComponents.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0011\u0010\u0002\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "field", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "invoke", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.presentation.features.onboarding.steps.view.common.ComposableSingletons$OnboardingTextComponentsKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$OnboardingTextComponentsKt$lambda1$1 extends Lambda implements Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit> {
    public static final ComposableSingletons$OnboardingTextComponentsKt$lambda1$1 INSTANCE = new ComposableSingletons$OnboardingTextComponentsKt$lambda1$1();

    ComposableSingletons$OnboardingTextComponentsKt$lambda1$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer, Integer num) {
        invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Function2<? super Composer, ? super Integer, Unit> field, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(field, "field");
        if ((i & 14) == 0) {
            i |= composer.changedInstance(field) ? 4 : 2;
        }
        if ((i & 91) == 18 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1069963580, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.ComposableSingletons$OnboardingTextComponentsKt.lambda-1.<anonymous> (OnboardingTextComponents.kt:176)");
        }
        field.invoke(composer, Integer.valueOf(i & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
