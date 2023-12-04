package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsItemIndicator$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $alpha;
    final /* synthetic */ BuyNeuronsProductUiParams $item;
    final /* synthetic */ BoxScope $this_BuyNeuronsItemIndicator;
    final /* synthetic */ float $topPadding;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsItemIndicator$2(BoxScope boxScope, BuyNeuronsProductUiParams buyNeuronsProductUiParams, float f, float f2, int i) {
        super(2);
        this.$this_BuyNeuronsItemIndicator = boxScope;
        this.$item = buyNeuronsProductUiParams;
        this.$alpha = f;
        this.$topPadding = f2;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyNeuronsBottomSheetKt.m6989BuyNeuronsItemIndicatorgwO9Abs(this.$this_BuyNeuronsItemIndicator, this.$item, this.$alpha, this.$topPadding, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
