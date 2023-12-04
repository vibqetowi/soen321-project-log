package com.ifriend.chat.presentation.ui.infoOnboarding.slides;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.location.LocationRequestCompat;
import com.ifriend.chat.presentation.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingSlideUserWillReceivePhotos.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.chat.presentation.ui.infoOnboarding.slides.ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt$lambda1$1 INSTANCE = new ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt$lambda1$1();

    ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt$lambda1$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(111552115, i, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.ComposableSingletons$InfoOnboardingSlideUserWillReceivePhotosKt.lambda-1.<anonymous> (InfoOnboardingSlideUserWillReceivePhotos.kt:26)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.info_onboarding_cherry, composer, 0), (String) null, SizeKt.m781height3ABfNKs(SizeKt.m800width3ABfNKs(Modifier.Companion, Dp.m5607constructorimpl(144)), Dp.m5607constructorimpl(146)), (Alignment) null, ContentScale.Companion.getFillWidth(), 0.0f, (ColorFilter) null, composer, 25016, (int) LocationRequestCompat.QUALITY_LOW_POWER);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
