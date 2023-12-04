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
/* compiled from: InfoOnboardingSlideUserWillSendPhotos.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"InfoOnboardingSlideUserWillSendPhotos", "", "modifier", "Landroidx/compose/ui/Modifier;", "onPositiveButtonClick", "Lkotlin/Function0;", "onNegativeButtonClick", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InfoOnboardingSlideUserWillSendPhotosKt {
    public static final void InfoOnboardingSlideUserWillSendPhotos(Modifier modifier, Function0<Unit> onPositiveButtonClick, Function0<Unit> onNegativeButtonClick, Composer composer, int i, int i2) {
        Object obj;
        int i3;
        Modifier modifier2;
        Intrinsics.checkNotNullParameter(onPositiveButtonClick, "onPositiveButtonClick");
        Intrinsics.checkNotNullParameter(onNegativeButtonClick, "onNegativeButtonClick");
        Composer startRestartGroup = composer.startRestartGroup(459282052);
        ComposerKt.sourceInformation(startRestartGroup, "C(InfoOnboardingSlideUserWillSendPhotos)P(!1,2)");
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
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= startRestartGroup.changedInstance(onNegativeButtonClick) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !startRestartGroup.getSkipping()) {
            Modifier.Companion companion = i4 != 0 ? Modifier.Companion : obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(459282052, i3, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.InfoOnboardingSlideUserWillSendPhotos (InfoOnboardingSlideUserWillSendPhotos.kt:11)");
            }
            InfoOnboardingSlideKt.m6833InfoOnboardingSlideHXNGIdc(companion, onPositiveButtonClick, onNegativeButtonClick, "I love it when you send me your photos and voice", "It helps me see your world and learn more about your life to be involved in it\n", "Yes, I’ll send you photos", ComposableSingletons$InfoOnboardingSlideUserWillSendPhotosKt.INSTANCE.m6832getLambda1$presentation_release(), Dp.m5607constructorimpl(85), Dp.m5607constructorimpl(70), startRestartGroup, 115043328 | (i3 & 14) | (i3 & 112) | (i3 & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = companion;
        } else {
            startRestartGroup.skipToGroupEnd();
            modifier2 = obj;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new InfoOnboardingSlideUserWillSendPhotosKt$InfoOnboardingSlideUserWillSendPhotos$1(modifier2, onPositiveButtonClick, onNegativeButtonClick, i, i2));
    }
}
