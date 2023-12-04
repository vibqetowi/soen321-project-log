package com.ifriend.presentation.features.purchases.benefits.flow;

import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.navigation.NavGraphBuilder;
import com.ifriend.presentation.navigation.FeatureRoute;
import com.ifriend.presentation.navigation.destination.BenefitsPremiumActiveDestination;
import com.ifriend.ui.navigation.AppnavigationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: BenefitsPremiumActiveEntry.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J!\u0010\u0007\u001a\u00020\b2\u0010\u0010\n\u001a\f\u0012\u0004\u0012\u00020\b0\u000bj\u0002`\fR\u00020\t¢\u0006\u0002\u0010\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, d2 = {"Lcom/ifriend/presentation/features/purchases/benefits/flow/BenefitsPremiumActiveEntry;", "Lcom/ifriend/presentation/navigation/FeatureRoute;", "()V", "featureRoute", "", "getFeatureRoute", "()Ljava/lang/String;", "featureNavigation", "", "Landroidx/navigation/NavGraphBuilder;", "closeFeature", "Lkotlin/Function0;", "Lcom/ifriend/ui/tools/OnClick;", "(Landroidx/navigation/NavGraphBuilder;Lkotlin/jvm/functions/Function0;)V", "presentation_release", "state", "Lcom/ifriend/presentation/features/purchases/benefits/viewmodel/ActivePremiumBenefitsViewModel$UiState;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BenefitsPremiumActiveEntry implements FeatureRoute {
    public static final int $stable = 0;
    private final String featureRoute = BenefitsPremiumActiveDestination.INSTANCE.getDestination();

    @Override // com.ifriend.presentation.navigation.FeatureRoute
    public String getFeatureRoute() {
        return this.featureRoute;
    }

    public final void featureNavigation(NavGraphBuilder context_receiver_0, Function0<Unit> closeFeature) {
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(closeFeature, "closeFeature");
        AppnavigationKt.nonAnimationComposable$default(context_receiver_0, BenefitsPremiumActiveDestination.INSTANCE.getDestination(), null, null, ComposableLambdaKt.composableLambdaInstance(737088068, true, new BenefitsPremiumActiveEntry$featureNavigation$1(closeFeature)), 6, null);
    }
}
