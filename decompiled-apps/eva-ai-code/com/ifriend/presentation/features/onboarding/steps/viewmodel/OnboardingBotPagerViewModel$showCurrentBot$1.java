package com.ifriend.presentation.features.onboarding.steps.viewmodel;

import com.ifriend.domain.models.profile.bot.Bot;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.onboarding.steps.view.selectbot.OnboardingBotPagerState;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ExtensionsKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingBotPagerViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/onboarding/steps/view/selectbot/OnboardingBotPagerState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingBotPagerViewModel$showCurrentBot$1 extends Lambda implements Function1<OnboardingBotPagerState, OnboardingBotPagerState> {
    final /* synthetic */ Bot $currentBot;
    final /* synthetic */ OnboardingBotPagerViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingBotPagerViewModel$showCurrentBot$1(OnboardingBotPagerViewModel onboardingBotPagerViewModel, Bot bot) {
        super(1);
        this.this$0 = onboardingBotPagerViewModel;
        this.$currentBot = bot;
    }

    @Override // kotlin.jvm.functions.Function1
    public final OnboardingBotPagerState invoke(OnboardingBotPagerState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String string = this.this$0.resources.getString(R.string.onboarding__select_bot__title_current);
        OnboardingBotPagerState.Bot[] botArr = new OnboardingBotPagerState.Bot[1];
        String name = this.$currentBot.getName();
        if (name == null) {
            name = "";
        }
        botArr[0] = new OnboardingBotPagerState.Bot("", "", name, "", "", "", "", false);
        return OnboardingBotPagerState.copy$default(state, string, null, false, false, ExtensionsKt.persistentListOf(botArr), 0, 0, 74, null);
    }
}
