package com.ifriend.presentation.features.purchases.premium.navigation;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.compose.NavGraphBuilderKt;
import com.ifriend.presentation.R;
import com.ifriend.presentation.features.purchases.benefits.screen.PremiumBenefitsScreenKt;
import com.ifriend.presentation.features.purchases.common.model.SubscriptionBenefitsGroupUiParams;
import com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumClicks;
import com.ifriend.presentation.features.purchases.premium.screen.BuyPremiumScreenKt;
import com.ifriend.presentation.features.purchases.premium.viewmodel.BuyPremiumViewModel;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.ws.WebSocketProtocol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BuyPremiumNavigationRoot.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2 extends Lambda implements Function1<NavGraphBuilder, Unit> {
    final /* synthetic */ Function0<Unit> $closeFeature;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ State<BuyPremiumViewModel.UiState> $state$delegate;
    final /* synthetic */ BuyPremiumViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2(BuyPremiumViewModel buyPremiumViewModel, NavHostController navHostController, State<BuyPremiumViewModel.UiState> state, Function0<Unit> function0) {
        super(1);
        this.$viewModel = buyPremiumViewModel;
        this.$navController = navHostController;
        this.$state$delegate = state;
        this.$closeFeature = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
        invoke2(navGraphBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumNavigationRoot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $closeFeature;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ State<BuyPremiumViewModel.UiState> $state$delegate;
        final /* synthetic */ BuyPremiumViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BuyPremiumViewModel buyPremiumViewModel, NavHostController navHostController, State<BuyPremiumViewModel.UiState> state, Function0<Unit> function0) {
            super(4);
            this.$viewModel = buyPremiumViewModel;
            this.$navController = navHostController;
            this.$state$delegate = state;
            this.$closeFeature = function0;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
            BuyPremiumViewModel.UiState BuyPremiumNavigationRoot$lambda$0;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1890809368, i, -1, "com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRoot.<anonymous>.<anonymous> (BuyPremiumNavigationRoot.kt:70)");
            }
            BuyPremiumNavigationRoot$lambda$0 = BuyPremiumNavigationRootKt.BuyPremiumNavigationRoot$lambda$0(this.$state$delegate);
            Object obj = this.$viewModel;
            NavHostController navHostController = this.$navController;
            Function0<Unit> function0 = this.$closeFeature;
            composer.startReplaceableGroup(511388516);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1,2):Composables.kt#9igjgp");
            boolean changed = composer.changed(obj) | composer.changed(navHostController);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                Object buyPremiumClicks = new BuyPremiumClicks(new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$1(obj), function0, new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$2(navHostController), new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$3(obj), new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$4(obj), new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$5(obj), new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$1$1$6(obj));
                composer.updateRememberedValue(buyPremiumClicks);
                rememberedValue = buyPremiumClicks;
            }
            composer.endReplaceableGroup();
            BuyPremiumScreenKt.BuyPremiumScreen(BuyPremiumNavigationRoot$lambda$0, (BuyPremiumClicks) rememberedValue, composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        NavGraphBuilderKt.composable$default(NavHost, BuyPremiumGraph.BuyPremium, null, null, null, null, null, null, ComposableLambdaKt.composableLambdaInstance(1890809368, true, new AnonymousClass1(this.$viewModel, this.$navController, this.$state$delegate, this.$closeFeature)), WebSocketProtocol.PAYLOAD_SHORT, null);
        NavGraphBuilderKt.composable$default(NavHost, BuyPremiumGraph.BuyPremiumInfo, null, null, AnonymousClass2.INSTANCE, AnonymousClass3.INSTANCE, null, null, ComposableLambdaKt.composableLambdaInstance(784511105, true, new AnonymousClass4(this.$navController, this.$state$delegate)), 102, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumNavigationRoot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/EnterTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, EnterTransition> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        AnonymousClass2() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final EnterTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> composable) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            return AnimatedContentTransitionScope.CC.m275slideIntoContainermOhB8PU$default(composable, AnimatedContentTransitionScope.SlideDirection.Companion.m288getStartDKzdypw(), null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumNavigationRoot.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/animation/ExitTransition;", "Landroidx/compose/animation/AnimatedContentTransitionScope;", "Landroidx/navigation/NavBackStackEntry;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function1<AnimatedContentTransitionScope<NavBackStackEntry>, ExitTransition> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        AnonymousClass3() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final ExitTransition invoke(AnimatedContentTransitionScope<NavBackStackEntry> composable) {
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            return AnimatedContentTransitionScope.CC.m276slideOutOfContainermOhB8PU$default(composable, AnimatedContentTransitionScope.SlideDirection.Companion.m285getEndDKzdypw(), null, null, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyPremiumNavigationRoot.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedContentScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedContentScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$4  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass4 extends Lambda implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ State<BuyPremiumViewModel.UiState> $state$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(NavHostController navHostController, State<BuyPremiumViewModel.UiState> state) {
            super(4);
            this.$navController = navHostController;
            this.$state$delegate = state;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.runtime.Composer] */
        /* JADX WARN: Type inference failed for: r11v4 */
        public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
            BuyPremiumViewModel.UiState BuyPremiumNavigationRoot$lambda$0;
            Intrinsics.checkNotNullParameter(composable, "$this$composable");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(784511105, i, -1, "com.ifriend.presentation.features.purchases.premium.navigation.BuyPremiumNavigationRoot.<anonymous>.<anonymous> (BuyPremiumNavigationRoot.kt:94)");
            }
            String upperCase = StringResources_androidKt.stringResource(R.string.premium_benefits__screen_title, composer, 0).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            BuyPremiumNavigationRoot$lambda$0 = BuyPremiumNavigationRootKt.BuyPremiumNavigationRoot$lambda$0(this.$state$delegate);
            ImmutableList<SubscriptionBenefitsGroupUiParams> benefits = BuyPremiumNavigationRoot$lambda$0.getBenefits();
            NavHostController navHostController = this.$navController;
            composer.startReplaceableGroup(-264211419);
            ComposerKt.sourceInformation(composer, "CC(rememberAction)P(1)");
            composer.startReplaceableGroup(1157296644);
            ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
            boolean changed = composer.changed(navHostController);
            BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$4$invoke$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new BuyPremiumNavigationRootKt$BuyPremiumNavigationRoot$2$4$invoke$$inlined$rememberAction$1(navHostController);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            PremiumBenefitsScreenKt.PremiumBenefits(upperCase, benefits, rememberedValue, WindowInsetsPadding_androidKt.statusBarsPadding(SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null)), composer, 64, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
