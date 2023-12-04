package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsContent$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $actionLabel;
    final /* synthetic */ BuyNeuronsClicks $clicks;
    final /* synthetic */ boolean $isContinueEnabled;
    final /* synthetic */ ImmutableList<BuyNeuronsProductUiParams> $list;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsContent$2(ImmutableList<BuyNeuronsProductUiParams> immutableList, boolean z, String str, BuyNeuronsClicks buyNeuronsClicks, int i) {
        super(2);
        this.$list = immutableList;
        this.$isContinueEnabled = z;
        this.$actionLabel = str;
        this.$clicks = buyNeuronsClicks;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyNeuronsBottomSheetKt.BuyNeuronsContent(this.$list, this.$isContinueEnabled, this.$actionLabel, this.$clicks, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
