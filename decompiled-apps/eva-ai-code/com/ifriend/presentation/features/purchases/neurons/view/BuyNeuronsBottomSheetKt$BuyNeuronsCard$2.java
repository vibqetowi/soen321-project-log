package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsCard$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BuyNeuronsClicks $clicks;
    final /* synthetic */ Function0<Unit> $onDismissRequest;
    final /* synthetic */ BuyNeuronsViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsCard$2(BuyNeuronsViewModel.UiState uiState, BuyNeuronsClicks buyNeuronsClicks, Function0<Unit> function0, int i) {
        super(2);
        this.$state = uiState;
        this.$clicks = buyNeuronsClicks;
        this.$onDismissRequest = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyNeuronsBottomSheetKt.BuyNeuronsCard(this.$state, this.$clicks, this.$onDismissRequest, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
