package com.ifriend.chat.presentation.ui.infoOnboarding;

import com.ifriend.chat.presentation.ui.infoOnboarding.models.InfoOnboardingAction;
import com.ifriend.domain.logic.infoonboarding.InfoOnboardingSlide;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: InfoOnboardingFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ InfoOnboardingSlide $screen;
    final /* synthetic */ InfoOnboardingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfoOnboardingFragment$onViewCreated$1$1$1$1$1$onPositiveButtonClick$1(InfoOnboardingFragment infoOnboardingFragment, InfoOnboardingSlide infoOnboardingSlide) {
        super(0);
        this.this$0 = infoOnboardingFragment;
        this.$screen = infoOnboardingSlide;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        InfoOnboardingViewModel viewModel;
        viewModel = this.this$0.getViewModel();
        viewModel.clickButton(this.$screen, InfoOnboardingAction.Yes);
    }
}
