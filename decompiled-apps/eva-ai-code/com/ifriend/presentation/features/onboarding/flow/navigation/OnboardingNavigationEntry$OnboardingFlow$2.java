package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$OnboardingFlow$2 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ OnboardingFlowViewModel $featureViewModel;
    final /* synthetic */ Function0<Unit> $finishFeature;
    final /* synthetic */ OnboardingNavigationEntry $tmp0_rcvr;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNavigationEntry$OnboardingFlow$2(OnboardingNavigationEntry onboardingNavigationEntry, OnboardingFlowViewModel onboardingFlowViewModel, Function0<Unit> function0, int i) {
        super(2);
        this.$tmp0_rcvr = onboardingNavigationEntry;
        this.$featureViewModel = onboardingFlowViewModel;
        this.$finishFeature = function0;
        this.$$changed = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        this.$tmp0_rcvr.OnboardingFlow(this.$featureViewModel, this.$finishFeature, composer, RecomposeScopeImplKt.updateChangedFlags(this.$$changed | 1));
    }
}
