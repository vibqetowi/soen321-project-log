package com.ifriend.presentation.features.purchases.premium.navigation;

import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$3 extends FunctionReferenceImpl implements Function0<Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$3(Object obj) {
        super(0, obj, BuyPremiumViewModel.class, "onContinueClick", "onContinueClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((BuyPremiumViewModel) this.receiver).onContinueClick();
    }
}
