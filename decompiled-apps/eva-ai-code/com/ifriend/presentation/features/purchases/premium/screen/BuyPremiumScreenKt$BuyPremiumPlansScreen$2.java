package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumPlansScreen$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BuyPremiumClicks $clicks;
    final /* synthetic */ BuyPremiumViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPlansScreen$2(BuyPremiumViewModel.UiState uiState, BuyPremiumClicks buyPremiumClicks, int i) {
        super(2);
        this.$state = uiState;
        this.$clicks = buyPremiumClicks;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyPremiumScreenKt.BuyPremiumPlansScreen(this.$state, this.$clicks, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
