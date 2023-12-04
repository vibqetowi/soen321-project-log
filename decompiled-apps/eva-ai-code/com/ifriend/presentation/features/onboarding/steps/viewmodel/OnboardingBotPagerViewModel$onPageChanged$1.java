package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingBotPagerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingBotPagerViewModel$onPageChanged$1 extends Lambda implements Function1<OnboardingBotPagerState, OnboardingBotPagerState> {
    final /* synthetic */ int $currentPage;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotPagerViewModel$onPageChanged$1(int i) {
        super(1);
        this.$currentPage = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingBotPagerState invoke(OnboardingBotPagerState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return OnboardingBotPagerState.copy$default(it, null, null, false, false, null, 0, this.$currentPage, 63, null);
    }
}
