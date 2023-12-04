package com.ifriend.presentation.features.purchases.premium.view;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumItemKt$BuyPremiumItemIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ BuyPremiumPlanUiParams $item;
    final /* synthetic */ BoxScope $this_BuyPremiumItemIndicator;
    final /* synthetic */ float $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumItemKt$BuyPremiumItemIndicator$2(BoxScope boxScope, BuyPremiumPlanUiParams buyPremiumPlanUiParams, float f, int i) {
        super(2);
        this.$this_BuyPremiumItemIndicator = boxScope;
        this.$item = buyPremiumPlanUiParams;
        this.$topPadding = f;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyPremiumItemKt.m6995BuyPremiumItemIndicatorTDGSqEk(this.$this_BuyPremiumItemIndicator, this.$item, this.$topPadding, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
