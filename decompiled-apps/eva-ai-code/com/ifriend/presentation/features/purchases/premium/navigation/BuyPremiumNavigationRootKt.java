package com.ifriend.presentation.features.purchases.premium.navigation;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.android.billingclient.api.BillingFlowParams;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import com.ifriend.ui.components.brush.LinearGradientKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a;\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00050\tj\u0002`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fH\u0007¢\u0006\u0002\u0010\u000e\"\u0011\u0010\u0000\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, d2 = {"premiumBackgroundGradient", "Landroidx/compose/ui/graphics/Brush;", "getPremiumBackgroundGradient", "()Landroidx/compose/ui/graphics/Brush;", "BuyPremiumNavigationRoot", "", "viewModel", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel;", "closeFeature", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "onAppLaunchBillingFlow", "Lkotlin/Function1;", "Lcom/android/billingclient/api/BillingFlowParams;", "(Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/purchases/premium/viewmodel/BuyPremiumViewModel$UiState;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumNavigationRootKt {
    public static final Brush getPremiumBackgroundGradient() {
        return LinearGradientKt.m7018linearGradienteBVf0pg$default(Brush.Companion, CollectionsKt.listOf((Object[]) new Color[]{Color.m3281boximpl(ColorKt.Color(3863958936L)), Color.m3281boximpl(ColorKt.Color(3862377822L)), Color.m3281boximpl(ColorKt.Color(3858759680L))}), null, 0, 325.0f, false, 22, null);
    }

    public static final void BuyPremiumNavigationRoot(BuyPremiumViewModel viewModel, final Function0<Unit> closeFeature, final Function1<? super BillingFlowParams, Unit> onAppLaunchBillingFlow, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(closeFeature, "closeFeature");
        Intrinsics.checkNotNullParameter(onAppLaunchBillingFlow, "onAppLaunchBillingFlow");
        Composer startRestartGroup = composer.startRestartGroup(-553863110);
        ComposerKt.sourceInformation(startRestartGroup, "C(BuyPremiumNavigationRoot)P(2)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-553863110, i, -1, "com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRoot (BuyPremiumNavigationRoot.kt:49)");
        }
        BuyPremiumViewModel buyPremiumViewModel = viewModel;
        UiStateDelegateExKt.CollectEventEffect(buyPremiumViewModel, new Object[0], null, null, new FlowCollector<BuyPremiumViewModel.Event>() { // from class: com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$1
            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(BuyPremiumViewModel.Event event, Continuation continuation) {
                return emit2(event, (Continuation<? super Unit>) continuation);
            }

            /* renamed from: emit  reason: avoid collision after fix types in other method */
            public final Object emit2(BuyPremiumViewModel.Event event, Continuation<? super Unit> continuation) {
                if (event instanceof BuyPremiumViewModel.Event.CloseFeature) {
                    closeFeature.invoke();
                } else if (event instanceof BuyPremiumViewModel.Event.LaunchBillingFlow) {
                    onAppLaunchBillingFlow.invoke(((BuyPremiumViewModel.Event.LaunchBillingFlow) event).getParams());
                }
                return Unit.INSTANCE;
            }
        }, startRestartGroup, 72, 6);
        State collectUiState = UiStateDelegateExKt.collectUiState(buyPremiumViewModel, null, startRestartGroup, 8, 1);
        NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 8);
        NavHostKt.NavHost(rememberNavController, BuyPremiumGraph.BuyPremium, BackgroundKt.background$default(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null), getPremiumBackgroundGradient(), null, 0.0f, 6, null), null, null, null, null, null, null, new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2(viewModel, rememberNavController, collectUiState, closeFeature), startRestartGroup, 56, 504);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$3(viewModel, closeFeature, onAppLaunchBillingFlow, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BuyPremiumViewModel.UiState BuyPremiumNavigationRoot$lambda$0(State<BuyPremiumViewModel.UiState> state) {
        return state.getValue();
    }
}
