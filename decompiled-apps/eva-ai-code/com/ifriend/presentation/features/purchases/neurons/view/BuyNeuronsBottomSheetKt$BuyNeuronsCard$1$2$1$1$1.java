package com.ifriend.presentation.features.purchases.neurons.view;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyNeuronsBottomSheet.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyNeuronsBottomSheetKt$BuyNeuronsCard$1$2$1$1$1 extends Lambda implements Function3<AnimatedVisibilityScope, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ BuyNeuronsClicks $clicks;
    final /* synthetic */ BuyNeuronsViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetKt$BuyNeuronsCard$1$2$1$1$1(BuyNeuronsViewModel.UiState uiState, BuyNeuronsClicks buyNeuronsClicks, int i) {
        super(3);
        this.$state = uiState;
        this.$clicks = buyNeuronsClicks;
        this.$$dirty = i;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer, Integer num) {
        invoke(animatedVisibilityScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1624230049, i, -1, "com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BuyNeuronsBottomSheet.kt:117)");
        }
        BuyNeuronsBottomSheetKt.BuyNeuronsContent(this.$state.getProducts(), this.$state.isContinueEnabled(), this.$state.getActionLabel(), this.$clicks, composer, (this.$$dirty << 6) & 7168);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
