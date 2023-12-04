package com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ChatActiveSubscriptionScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatActiveSubscriptionScreenKt$ChatActiveSubscriptionScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $onBackClick;
    final /* synthetic */ ChatActiveSubscriptionViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatActiveSubscriptionScreenKt$ChatActiveSubscriptionScreen$2(ChatActiveSubscriptionViewModel chatActiveSubscriptionViewModel, Function0<Unit> function0, int i) {
        super(2);
        this.$viewModel = chatActiveSubscriptionViewModel;
        this.$onBackClick = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        ChatActiveSubscriptionScreenKt.ChatActiveSubscriptionScreen(this.$viewModel, this.$onBackClick, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
