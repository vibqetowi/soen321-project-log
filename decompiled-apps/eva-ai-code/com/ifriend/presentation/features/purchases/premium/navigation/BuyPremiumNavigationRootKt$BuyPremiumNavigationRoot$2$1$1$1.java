package com.ifriend.presentation.features.purchases.premium.navigation;

import com.ifriend.presentation.features.purchases.premium.model.BuyPremiumPlanUiParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$1 extends FunctionReferenceImpl implements Function1<BuyPremiumPlanUiParams, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$1(Object obj) {
        super(1, obj, BuyPremiumViewModel.class, "onItemClick", "onItemClick(Lcom/ifriend/presentation/features/purchases/premium/model/BuyPremiumPlanUiParams;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BuyPremiumPlanUiParams buyPremiumPlanUiParams) {
        invoke2(buyPremiumPlanUiParams);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(BuyPremiumPlanUiParams p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((BuyPremiumViewModel) this.receiver).onItemClick(p0);
    }
}
