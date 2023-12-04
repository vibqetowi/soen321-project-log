package com.ifriend.chat.presentation.ui.infoOnboarding.slides;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingSlideTrackActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.ifriend.chat.presentation.ui.infoOnboarding.slides.ComposableSingletons$InfoOnboardingSlideTrackActivityKt$lambda-1$1  reason: invalid class name */
/* loaded from: classes6.dex */
final class ComposableSingletons$InfoOnboardingSlideTrackActivityKt$lambda1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$InfoOnboardingSlideTrackActivityKt$lambda1$1 INSTANCE = new ComposableSingletons$InfoOnboardingSlideTrackActivityKt$lambda1$1();

    ComposableSingletons$InfoOnboardingSlideTrackActivityKt$lambda1$1() {
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
                ComposerKt.traceEventStart(116534611, i, -1, "com.ifriend.chat.presentation.ui.infoOnboarding.slides.ComposableSingletons$InfoOnboardingSlideTrackActivityKt.lambda-1.<anonymous> (InfoOnboardingSlideTrackActivity.kt:20)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
