package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingState;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/chat/presentation/ui/infoOnboarding/models/InfoOnboardingState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InfoOnboardingViewModel$setSlide$1 extends Lambda implements Function1<InfoOnboardingState, InfoOnboardingState> {
    final /* synthetic */ InfoOnboardingSlide $slide;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingViewModel$setSlide$1(InfoOnboardingSlide infoOnboardingSlide) {
        super(1);
        this.$slide = infoOnboardingSlide;
    }

    @Override // kotlin.jvm.functions.Function1
    public final InfoOnboardingState invoke(InfoOnboardingState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.copy(this.$slide);
    }
}
