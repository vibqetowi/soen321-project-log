package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isGranted", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$launcher$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ InfoOnboardingSlide $screen;
    final /* synthetic */ InfoOnboardingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingFragment$onViewCreated$1$1$1$1$1$1$2$launcher$1(InfoOnboardingFragment infoOnboardingFragment, InfoOnboardingSlide infoOnboardingSlide) {
        super(1);
        this.this$0 = infoOnboardingFragment;
        this.$screen = infoOnboardingSlide;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        InfoOnboardingViewModel viewModel;
        InfoOnboardingAction infoOnboardingAction;
        viewModel = this.this$0.getViewModel();
        InfoOnboardingSlide infoOnboardingSlide = this.$screen;
        if (z) {
            infoOnboardingAction = InfoOnboardingAction.Allow;
        } else {
            infoOnboardingAction = InfoOnboardingAction.Deny;
        }
        viewModel.clickButton(infoOnboardingSlide, infoOnboardingAction);
    }
}
