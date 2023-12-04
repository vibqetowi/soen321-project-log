package com.ifriend.presentation.features.purchases.chatsubscription.flow;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavHostController;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.features.app.di.AppPresentationProvider;
import com.ifriend.presentation.features.app.di.AppPresentationProviderKt;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.ui.ChatActiveSubscriptionScreenKt;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModel;
import com.ifriend.presentation.features.purchases.chatsubscription.activesubscription.viewmodel.ChatActiveSubscriptionViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.ui.ChatSubscriptionBenefitsScreenKt;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModel;
import com.ifriend.presentation.features.purchases.chatsubscription.benefits.viewmodel.ChatSubscriptionBenefitsViewModelFactory;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.ui.ChatBuySubscriptionScreenKt;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModel;
import com.ifriend.presentation.features.purchases.chatsubscription.subscription.viewmodel.ChatBuySubscriptionViewModelFactory;
import com.ifriend.presentation.navigation.compose.NavcontrollerKt;
import com.ifriend.presentation.navigation.destination.ChatSubscriptionDestination;
import com.ifriend.ui.navigation.AppnavigationKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: ChatSubscriptionEntry.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavGraphBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ChatSubscriptionEntry$ChatSubscriptionNavHost$1 extends Lambda implements Function1<NavGraphBuilder, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ NavHostController $featureNavController;
    final /* synthetic */ Function0<Unit> $onFeatureBackClick;
    final /* synthetic */ BuyChatSubscriptionBillingUiParams $params;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatSubscriptionEntry$ChatSubscriptionNavHost$1(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, Function0<Unit> function0, int i, NavHostController navHostController) {
        super(1);
        this.$params = buyChatSubscriptionBillingUiParams;
        this.$onFeatureBackClick = function0;
        this.$$dirty = i;
        this.$featureNavController = navHostController;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(NavGraphBuilder navGraphBuilder) {
        invoke2(navGraphBuilder);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatSubscriptionEntry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry$ChatSubscriptionNavHost$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ NavHostController $featureNavController;
        final /* synthetic */ Function0<Unit> $onFeatureBackClick;
        final /* synthetic */ BuyChatSubscriptionBillingUiParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, Function0<Unit> function0, int i, NavHostController navHostController) {
            super(4);
            this.$params = buyChatSubscriptionBillingUiParams;
            this.$onFeatureBackClick = function0;
            this.$$dirty = i;
            this.$featureNavController = navHostController;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope animatedComposable, NavBackStackEntry it, Composer composer, int i) {
            CreationExtras.Empty empty;
            Intrinsics.checkNotNullParameter(animatedComposable, "$this$animatedComposable");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(915100996, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry.ChatSubscriptionNavHost.<anonymous>.<anonymous> (ChatSubscriptionEntry.kt:149)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ChatBuySubscriptionViewModelFactory create = ((AppViewModelProvider) consume).provideChatSubscriptionViewModelFactory().create(this.$params);
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
            ViewModel viewModel = ViewModelKt.viewModel(ChatBuySubscriptionViewModel.class, current, null, create, empty, composer, 36936, 0);
            composer.endReplaceableGroup();
            ChatBuySubscriptionViewModel chatBuySubscriptionViewModel = (ChatBuySubscriptionViewModel) viewModel;
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume2 = composer.consume(AppPresentationProviderKt.getLocalAppPresentationProvider());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ChatBuySubscriptionScreenKt.ChatBuySubscriptionScreen(chatBuySubscriptionViewModel, ((AppPresentationProvider) consume2).provideAppLaunchBillingFlow(), this.$onFeatureBackClick, new C01801(this.$featureNavController), composer, (this.$$dirty & 896) | 72);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSubscriptionEntry.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry$ChatSubscriptionNavHost$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01801 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $featureNavController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01801(NavHostController navHostController) {
                super(0);
                this.$featureNavController = navHostController;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NavcontrollerKt.navigate(this.$featureNavController, ChatSubscriptionDestination.SubscriptionBenefits.INSTANCE);
            }
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(NavGraphBuilder NavHost) {
        Intrinsics.checkNotNullParameter(NavHost, "$this$NavHost");
        AppnavigationKt.animatedComposable$default(NavHost, ChatSubscriptionDestination.Subscription.INSTANCE.getDestination(), null, null, ComposableLambdaKt.composableLambdaInstance(915100996, true, new AnonymousClass1(this.$params, this.$onFeatureBackClick, this.$$dirty, this.$featureNavController)), 6, null);
        AppnavigationKt.animatedComposable$default(NavHost, ChatSubscriptionDestination.SubscriptionBenefits.INSTANCE.getDestination(), null, null, ComposableLambdaKt.composableLambdaInstance(-1250346885, true, new AnonymousClass2(this.$params, this.$featureNavController)), 6, null);
        AppnavigationKt.animatedComposable$default(NavHost, ChatSubscriptionDestination.ActiveSubscription.INSTANCE.getDestination(), null, null, ComposableLambdaKt.composableLambdaInstance(-1404119940, true, new AnonymousClass3(this.$params, this.$onFeatureBackClick, this.$$dirty)), 6, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatSubscriptionEntry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry$ChatSubscriptionNavHost$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
        final /* synthetic */ NavHostController $featureNavController;
        final /* synthetic */ BuyChatSubscriptionBillingUiParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, NavHostController navHostController) {
            super(4);
            this.$params = buyChatSubscriptionBillingUiParams;
            this.$featureNavController = navHostController;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope animatedComposable, NavBackStackEntry it, Composer composer, int i) {
            CreationExtras.Empty empty;
            Intrinsics.checkNotNullParameter(animatedComposable, "$this$animatedComposable");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1250346885, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry.ChatSubscriptionNavHost.<anonymous>.<anonymous> (ChatSubscriptionEntry.kt:168)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ChatSubscriptionBenefitsViewModelFactory create = ((AppViewModelProvider) consume).provideChatSubscriptionBenefitsViewModelFactory().create(this.$params);
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
            ViewModel viewModel = ViewModelKt.viewModel(ChatSubscriptionBenefitsViewModel.class, current, null, create, empty, composer, 36936, 0);
            composer.endReplaceableGroup();
            ChatSubscriptionBenefitsScreenKt.ChatSubscriptionBenefitsScreen((ChatSubscriptionBenefitsViewModel) viewModel, new AnonymousClass1(this.$featureNavController), composer, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: ChatSubscriptionEntry.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry$ChatSubscriptionNavHost$1$2$1  reason: invalid class name */
        /* loaded from: classes6.dex */
        public static final class AnonymousClass1 extends Lambda implements Function0<Unit> {
            final /* synthetic */ NavHostController $featureNavController;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NavHostController navHostController) {
                super(0);
                this.$featureNavController = navHostController;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                NavcontrollerKt.backTo(this.$featureNavController, ChatSubscriptionDestination.Subscription.INSTANCE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChatSubscriptionEntry.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "Landroidx/compose/animation/AnimatedVisibilityScope;", "it", "Landroidx/navigation/NavBackStackEntry;", "invoke", "(Landroidx/compose/animation/AnimatedVisibilityScope;Landroidx/navigation/NavBackStackEntry;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry$ChatSubscriptionNavHost$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function4<AnimatedVisibilityScope, NavBackStackEntry, Composer, Integer, Unit> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ Function0<Unit> $onFeatureBackClick;
        final /* synthetic */ BuyChatSubscriptionBillingUiParams $params;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams, Function0<Unit> function0, int i) {
            super(4);
            this.$params = buyChatSubscriptionBillingUiParams;
            this.$onFeatureBackClick = function0;
            this.$$dirty = i;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
            invoke(animatedVisibilityScope, navBackStackEntry, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedVisibilityScope animatedComposable, NavBackStackEntry it, Composer composer, int i) {
            CreationExtras.Empty empty;
            Intrinsics.checkNotNullParameter(animatedComposable, "$this$animatedComposable");
            Intrinsics.checkNotNullParameter(it, "it");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1404119940, i, -1, "com.ifriend.presentation.features.purchases.chatsubscription.flow.ChatSubscriptionEntry.ChatSubscriptionNavHost.<anonymous>.<anonymous> (ChatSubscriptionEntry.kt:184)");
            }
            ComposerKt.sourceInformationMarkerStart(composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = composer.consume(AppViewModelProviderKt.getLocalAppViewModelProvider());
            ComposerKt.sourceInformationMarkerEnd(composer);
            ChatActiveSubscriptionViewModelFactory create = ((AppViewModelProvider) consume).provideChatActiveSubscriptionViewModelFactory().create(this.$params);
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
            ViewModel viewModel = ViewModelKt.viewModel(ChatActiveSubscriptionViewModel.class, current, null, create, empty, composer, 36936, 0);
            composer.endReplaceableGroup();
            ChatActiveSubscriptionScreenKt.ChatActiveSubscriptionScreen((ChatActiveSubscriptionViewModel) viewModel, this.$onFeatureBackClick, composer, ((this.$$dirty >> 3) & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }
}
