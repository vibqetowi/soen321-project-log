package com.ifriend.presentation.features.onboarding.steps.view.common;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.ifriend.presentation.R;
import kotlin.Metadata;
/* compiled from: OnboardingImageComponents.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"OnboardingEyeImage", "", "(Landroidx/compose/runtime/Composer;I)V", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingImageComponentsKt {
    public static final void OnboardingEyeImage(Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-45411770);
        ComposerKt.sourceInformation(startRestartGroup, "C(OnboardingEyeImage)");
        if (i != 0 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-45411770, i, -1, "com.ifriend.presentation.features.onboarding.steps.view.common.OnboardingEyeImage (OnboardingImageComponents.kt:11)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_eye, startRestartGroup, 0), "Eye icon", SizeKt.m797sizeVpY3zN4(Modifier.Companion, Dp.m5607constructorimpl(30), Dp.m5607constructorimpl(22)), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 440, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new OnboardingImageComponentsKt$OnboardingEyeImage$1(i));
    }
}
