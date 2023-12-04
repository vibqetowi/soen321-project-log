package com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.billing.api.logic.AppLaunchBillingFlow;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatBuySubscriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ AppLaunchBillingFlow $appLaunchBillingFlow;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ Function0<Unit> $onQuestionClick;
    final /* synthetic */ ChatBuySubscriptionViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatBuySubscriptionScreenKt$ChatBuySubscriptionScreen$3(ChatBuySubscriptionViewModel chatBuySubscriptionViewModel, AppLaunchBillingFlow appLaunchBillingFlow, Function0<Unit> function0, Function0<Unit> function02, int i) {
        super(2);
        this.$viewModel = chatBuySubscriptionViewModel;
        this.$appLaunchBillingFlow = appLaunchBillingFlow;
        this.$onBackClick = function0;
        this.$onQuestionClick = function02;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatBuySubscriptionScreenKt.ChatBuySubscriptionScreen(this.$viewModel, this.$appLaunchBillingFlow, this.$onBackClick, this.$onQuestionClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
