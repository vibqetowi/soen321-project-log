package com.ifriend.presentation.navigation.navflow;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigator;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.navigation.compose.NavHostKt;
import com.ifriend.presentation.features.app.di.AppPresentationProvider;
import com.ifriend.presentation.features.app.di.AppPresentationProviderKt;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.chatcall.flow.ChatCallEntry;
import com.ifriend.presentation.features.purchases.benefits.flow.BenefitsPremiumActiveEntry;
import com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: NavHostFlowFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class NavHostFlowFragment$onViewCreated$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AppPresentationProvider $appPresentationProvider;
    final /* synthetic */ AppViewModelProvider $appViewModelProvider;
    final /* synthetic */ Bundle $args;
    final /* synthetic */ NavHostNavigationType $navigationType;
    final /* synthetic */ NavHostFlowFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostFlowFragment$onViewCreated$1$1(NavHostFlowFragment navHostFlowFragment, AppViewModelProvider appViewModelProvider, AppPresentationProvider appPresentationProvider, NavHostNavigationType navHostNavigationType, Bundle bundle) {
        super(2);
        this.this$0 = navHostFlowFragment;
        this.$appViewModelProvider = appViewModelProvider;
        this.$appPresentationProvider = appPresentationProvider;
        this.$navigationType = navHostNavigationType;
        this.$args = bundle;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732697201, i, -1, "com.ifriend.presentation.navigation.navflow.NavHostFlowFragment.onViewCreated.<anonymous>.<anonymous> (NavHostFlowFragment.kt:88)");
            }
            NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], composer, 8);
            NavHostFlowFragment navHostFlowFragment = this.this$0;
            composer.startReplaceableGroup(92232837);
            ComposerKt.sourceInformation(composer, "CC(rememberAction)");
            composer.startReplaceableGroup(-492369756);
            ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
            NavHostFlowFragment$onViewCreated$1$1$invoke$$inlined$rememberAction$1 rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new NavHostFlowFragment$onViewCreated$1$1$invoke$$inlined$rememberAction$1(rememberNavController, navHostFlowFragment);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            composer.endReplaceableGroup();
            ChatCallEntry chatCallEntry = new ChatCallEntry();
            BenefitsPremiumActiveEntry benefitsPremiumActiveEntry = new BenefitsPremiumActiveEntry();
            ChatSubscriptionEntry chatSubscriptionEntry = new ChatSubscriptionEntry();
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, 850304920, true, new AnonymousClass1(this.this$0, this.$appViewModelProvider, this.$appPresentationProvider, this.$navigationType, this.$args, rememberNavController, chatCallEntry, benefitsPremiumActiveEntry, chatSubscriptionEntry, (Function0) rememberedValue)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NavHostFlowFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.navigation.navflow.NavHostFlowFragment$onViewCreated$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ AppPresentationProvider $appPresentationProvider;
        final /* synthetic */ AppViewModelProvider $appViewModelProvider;
        final /* synthetic */ Bundle $args;
        final /* synthetic */ BenefitsPremiumActiveEntry $benefitsPremium;
        final /* synthetic */ ChatCallEntry $chatCallEntry;
        final /* synthetic */ ChatSubscriptionEntry $chatSubscriptionEntry;
        final /* synthetic */ NavHostController $navController;
        final /* synthetic */ NavHostNavigationType $navigationType;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ NavHostFlowFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NavHostFlowFragment navHostFlowFragment, AppViewModelProvider appViewModelProvider, AppPresentationProvider appPresentationProvider, NavHostNavigationType navHostNavigationType, Bundle bundle, NavHostController navHostController, ChatCallEntry chatCallEntry, BenefitsPremiumActiveEntry benefitsPremiumActiveEntry, ChatSubscriptionEntry chatSubscriptionEntry, Function0<Unit> function0) {
            super(2);
            this.this$0 = navHostFlowFragment;
            this.$appViewModelProvider = appViewModelProvider;
            this.$appPresentationProvider = appPresentationProvider;
            this.$navigationType = navHostNavigationType;
            this.$args = bundle;
            this.$navController = navHostController;
            this.$chatCallEntry = chatCallEntry;
            this.$benefitsPremium = benefitsPremiumActiveEntry;
            this.$chatSubscriptionEntry = chatSubscriptionEntry;
            this.$onBackClick = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(850304920, i, -1, "com.ifriend.presentation.navigation.navflow.NavHostFlowFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (NavHostFlowFragment.kt:100)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader()), AppViewModelProviderKt.getLocalAppViewModelProvider().provides(this.$appViewModelProvider), AppPresentationProviderKt.getLocalAppPresentationProvider().provides(this.$appPresentationProvider)}, ComposableLambdaKt.composableLambda(composer, -1100852520, true, new C01851(this.this$0, this.$navigationType, this.$args, this.$navController, this.$chatCallEntry, this.$benefitsPremium, this.$chatSubscriptionEntry, this.$onBackClick)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: NavHostFlowFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.navigation.navflow.NavHostFlowFragment$onViewCreated$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01851 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ Bundle $args;
            final /* synthetic */ BenefitsPremiumActiveEntry $benefitsPremium;
            final /* synthetic */ ChatCallEntry $chatCallEntry;
            final /* synthetic */ ChatSubscriptionEntry $chatSubscriptionEntry;
            final /* synthetic */ NavHostController $navController;
            final /* synthetic */ NavHostNavigationType $navigationType;
            final /* synthetic */ Function0<Unit> $onBackClick;
            final /* synthetic */ NavHostFlowFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01851(NavHostFlowFragment navHostFlowFragment, NavHostNavigationType navHostNavigationType, Bundle bundle, NavHostController navHostController, ChatCallEntry chatCallEntry, BenefitsPremiumActiveEntry benefitsPremiumActiveEntry, ChatSubscriptionEntry chatSubscriptionEntry, Function0<Unit> function0) {
                super(2);
                this.this$0 = navHostFlowFragment;
                this.$navigationType = navHostNavigationType;
                this.$args = bundle;
                this.$navController = navHostController;
                this.$chatCallEntry = chatCallEntry;
                this.$benefitsPremium = benefitsPremiumActiveEntry;
                this.$chatSubscriptionEntry = chatSubscriptionEntry;
                this.$onBackClick = function0;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                String startDestination;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1100852520, i, -1, "com.ifriend.presentation.navigation.navflow.NavHostFlowFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NavHostFlowFragment.kt:105)");
                    }
                    startDestination = this.this$0.getStartDestination(this.$navigationType, this.$args);
                    NavHostKt.NavHost(this.$navController, startDestination, null, null, null, null, null, null, null, new C01861(this.this$0, this.$navigationType, this.$args, this.$chatCallEntry, this.$benefitsPremium, this.$chatSubscriptionEntry, this.$onBackClick), composer, 8, TypedValues.PositionType.TYPE_CURVE_FIT);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: NavHostFlowFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.presentation.navigation.navflow.NavHostFlowFragment$onViewCreated$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C01861 extends Lambda implements Function1<NavGraphBuilder, Unit> {
                final /* synthetic */ Bundle $args;
                final /* synthetic */ BenefitsPremiumActiveEntry $benefitsPremium;
                final /* synthetic */ ChatCallEntry $chatCallEntry;
                final /* synthetic */ ChatSubscriptionEntry $chatSubscriptionEntry;
                final /* synthetic */ NavHostNavigationType $navigationType;
                final /* synthetic */ Function0<Unit> $onBackClick;
                final /* synthetic */ NavHostFlowFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01861(NavHostFlowFragment navHostFlowFragment, NavHostNavigationType navHostNavigationType, Bundle bundle, ChatCallEntry chatCallEntry, BenefitsPremiumActiveEntry benefitsPremiumActiveEntry, ChatSubscriptionEntry chatSubscriptionEntry, Function0<Unit> function0) {
                    super(1);
                    this.this$0 = navHostFlowFragment;
                    this.$navigationType = navHostNavigationType;
                    this.$args = bundle;
                    this.$chatCallEntry = chatCallEntry;
                    this.$benefitsPremium = benefitsPremiumActiveEntry;
                    this.$chatSubscriptionEntry = chatSubscriptionEntry;
                    this.$onBackClick = function0;
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
                    invoke2(navGraphBuilder);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(NavGraphBuilder NavHost) {
                    Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
                    this.this$0.addArgs(NavHost, this.$navigationType, this.$args);
                    this.$chatCallEntry.featureNavigation(NavHost, this.$onBackClick);
                    this.$benefitsPremium.featureNavigation(NavHost, this.$onBackClick);
                    this.$chatSubscriptionEntry.featureNavigation(NavHost, this.$onBackClick);
                }
            }
        }
    }
}
