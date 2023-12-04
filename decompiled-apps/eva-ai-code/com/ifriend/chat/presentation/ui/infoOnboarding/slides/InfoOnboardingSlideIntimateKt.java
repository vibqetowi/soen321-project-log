package com.ifriend.chat.presentation.ui.infoOnboarding.slides;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InfoOnboardingSlideIntimate.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"InfoOnboardingSlideIntimate", "", "modifier", "Landroidx/compose/ui/Modifier;", "onPositiveButtonClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideIntimateKt {
    public static final void InfoOnboardingSlideIntimate(Modifier modifier, Function0<Unit> onPositiveButtonClick, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(2026771974);
        ComposerKt.sourceInformation(startRestartGroup, "C(InfoOnboardingSlideIntimate)");
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            obj = modifier;
        } else if ((i & 14) == 0) {
            obj = modifier;
            i3 = (startRestartGroup.changed(obj) ? 4 : 2) | i;
        } else {
            obj = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= startRestartGroup.changedInstance(onPositiveButtonClick) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2026771974, i3, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideIntimate (InfoOnboardingSlideIntimate.kt:10)");
            }
            InfoOnboardingSlideKt.m6833InfoOnboardingSlideHXNGIdc(companion, onPositiveButtonClick, null, "I wanna be open with you", "Let's chat and learn more about each other!", "Sure, let’s rock it", ComposableSingletons$InfoOnboardingSlideIntimateKt.INSTANCE.m6829getLambda1$presentation_release(), Dp.m5607constructorimpl(95), Dp.m5607constructorimpl(70), startRestartGroup, 115043712 | (i3 & 14) | (i3 & 112), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            obj = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new InfoOnboardingSlideIntimateKt$InfoOnboardingSlideIntimate$1(obj, onPositiveButtonClick, i, i2));
    }
}
