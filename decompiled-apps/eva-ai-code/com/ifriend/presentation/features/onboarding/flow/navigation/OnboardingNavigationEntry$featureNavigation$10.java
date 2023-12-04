package com.ifriend.presentation.features.onboarding.flow.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.onboarding.steps.view.info.OnboardingInfoScreenKt;
import com.ifriend.presentation.features.onboarding.steps.view.info.OnboardingInfoState;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.OnboardingLastStepViewModel;
import com.ifriend.presentation.features.onboarding.steps.viewmodel.factory.OnboardingStepViewModelFactory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OnboardingNavigationEntry.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class OnboardingNavigationEntry$featureNavigation$10 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ OnboardingStepViewModelFactory $factory;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingNavigationEntry$featureNavigation$10(OnboardingStepViewModelFactory onboardingStepViewModelFactory) {
        super(4);
        this.$factory = onboardingStepViewModelFactory;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(AnimatedContentScope onboardingComposable, NavBackStackEntry it, Composer composer, int i) {
        CreationExtras.Empty empty;
        Intrinsics.checkNotNullParameter(onboardingComposable, "$this$onboardingComposable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-672262224, i, -1, "com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry.featureNavigation.<anonymous> (OnboardingNavigationEntry.kt:330)");
        }
        OnboardingStepViewModelFactory onboardingStepViewModelFactory = this.$factory;
        composer.startReplaceableGroup(1729797275);
        ComposerKt.sourceInformation(composer, "CC(viewModel)P(3,2,1)*80@3834L7,90@4209L68:ViewModel.kt#3tja67");
        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, 6);
        if (current == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if (current instanceof HasDefaultViewModelProviderFactory) {
            empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
        } else {
            empty = CreationExtras.Empty.INSTANCE;
        }
        ViewModel viewModel = ViewModelKt.viewModel(OnboardingLastStepViewModel.class, current, null, onboardingStepViewModelFactory, empty, composer, 36936, 0);
        composer.endReplaceableGroup();
        OnboardingLastStepViewModel onboardingLastStepViewModel = (OnboardingLastStepViewModel) viewModel;
        OnboardingInfoScreenKt.OnboardingInfoScreen(invoke$lambda$0(UiStateDelegateExKt.collectUiState(onboardingLastStepViewModel, null, composer, 8, 1)), null, new AnonymousClass1(onboardingLastStepViewModel), composer, 0, 2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingNavigationEntry.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry$featureNavigation$10$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, OnboardingLastStepViewModel.class, "onButtonClick", "onButtonClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((OnboardingLastStepViewModel) this.receiver).onButtonClick();
        }
    }

    private static final OnboardingInfoState invoke$lambda$0(State<OnboardingInfoState> state) {
        return state.getValue();
    }
}
