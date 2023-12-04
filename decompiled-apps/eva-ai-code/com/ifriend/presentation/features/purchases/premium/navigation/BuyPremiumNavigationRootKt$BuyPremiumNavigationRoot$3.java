package com.ifriend.presentation.features.purchases.premium.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.android.billingclient.api.BillingFlowParams;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$3 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Function0<Unit> $closeFeature;
    final /* synthetic */ Function1<BillingFlowParams, Unit> $onAppLaunchBillingFlow;
    final /* synthetic */ BuyPremiumViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$3(BuyPremiumViewModel buyPremiumViewModel, Function0<Unit> function0, Function1<? super BillingFlowParams, Unit> function1, int i) {
        super(2);
        this.$viewModel = buyPremiumViewModel;
        this.$closeFeature = function0;
        this.$onAppLaunchBillingFlow = function1;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        BuyPremiumNavigationRootKt.BuyPremiumNavigationRoot(this.$viewModel, this.$closeFeature, this.$onAppLaunchBillingFlow, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
