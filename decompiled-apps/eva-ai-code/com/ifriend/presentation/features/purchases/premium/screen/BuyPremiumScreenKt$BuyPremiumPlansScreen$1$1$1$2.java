package com.ifriend.presentation.features.purchases.premium.screen;

import androidx.compose.foundation.lazy.grid.LazyGridScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2 extends Lambda implements Function1<LazyGridScope, Unit> {
    final /* synthetic */ BuyPremiumClicks $clicks;
    final /* synthetic */ BuyPremiumViewModel.UiState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2(BuyPremiumViewModel.UiState uiState, BuyPremiumClicks buyPremiumClicks) {
        super(1);
        this.$state = uiState;
        this.$clicks = buyPremiumClicks;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LazyGridScope lazyGridScope) {
        invoke2(lazyGridScope);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<BuyPremiumPlanUiParams, Object> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(BuyPremiumPlanUiParams it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getId();
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(LazyGridScope LazyVerticalGrid) {
        Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
        ImmutableList<BuyPremiumPlanUiParams> items = this.$state.getItems();
        AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
        BuyPremiumClicks buyPremiumClicks = this.$clicks;
        LazyVerticalGrid.items(items.size(), anonymousClass1 != null ? new BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$$inlined$items$default$2(anonymousClass1, items) : null, null, new BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$$inlined$items$default$4(BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$$inlined$items$default$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new BuyPremiumScreenKt$BuyPremiumPlansScreen$1$1$1$2$invoke$$inlined$items$default$5(items, buyPremiumClicks)));
    }
}
