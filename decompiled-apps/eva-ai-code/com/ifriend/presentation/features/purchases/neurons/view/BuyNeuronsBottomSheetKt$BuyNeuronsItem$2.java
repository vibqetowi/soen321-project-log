package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsItem$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ BuyNeuronsProductUiParams $item;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Function0<Unit> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsItem$2(BuyNeuronsProductUiParams buyNeuronsProductUiParams, Function0<Unit> function0, Modifier modifier, int i, int i2) {
        super(2);
        this.$item = buyNeuronsProductUiParams;
        this.$onClick = function0;
        this.$modifier = modifier;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyNeuronsBottomSheetKt.BuyNeuronsItem(this.$item, this.$onClick, this.$modifier, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1), this.$$default);
    }
}
