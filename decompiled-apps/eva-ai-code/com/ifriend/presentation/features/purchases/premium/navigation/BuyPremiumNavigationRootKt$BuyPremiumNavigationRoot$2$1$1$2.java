package com.ifriend.presentation.features.purchases.premium.navigation;

import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ NavHostController $navController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$2(NavHostController navHostController) {
        super(0);
        this.$navController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        NavController.navigate$default(this.$navController, BuyPremiumGraph.BuyPremiumInfo, null, null, 6, null);
    }
}
