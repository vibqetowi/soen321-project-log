package com.ifriend.chat.presentation.ui.chat.presentation.home;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.features.home.navigation.HomeNavigator;
import com.ifriend.presentation.features.home.ui.HomeScreenKt;
import com.ifriend.presentation.features.home.viewmodel.HomeViewModel;
import com.ifriend.presentation.features.profile.menu.model.ProfileMenuUiState;
import com.ifriend.presentation.features.profile.menu.view.ProfileMenuContentKt;
import com.ifriend.presentation.features.profile.menu.view.ProfileMenuNavigator;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: HomeFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class HomeFragment$onViewCreated$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$1$1(HomeFragment homeFragment) {
        super(2);
        this.this$0 = homeFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HomeFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ HomeFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(HomeFragment homeFragment) {
            super(2);
            this.this$0 = homeFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(247241018, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:52)");
                }
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader())}, ComposableLambdaKt.composableLambda(composer, 1581522042, true, new C01181(this.this$0)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HomeFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01181 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ HomeFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01181(HomeFragment homeFragment) {
                super(2);
                this.this$0 = homeFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                HomeViewModel viewModel;
                HomeViewModel viewModel2;
                HomeViewModel viewModel3;
                HomeViewModel viewModel4;
                HomeViewModel viewModel5;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1581522042, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (HomeFragment.kt:55)");
                    }
                    viewModel = this.this$0.getViewModel();
                    State collectAsState = SnapshotStateKt.collectAsState(viewModel.getProfileMenuState(), null, composer, 8, 1);
                    viewModel2 = this.this$0.getViewModel();
                    HomeScreenKt.HomeScreen(viewModel2, invoke$lambda$0(collectAsState).isConfirmEmailVisible(), new HomeNavigator(new C01191(this.this$0.getFlowCoordinator()), new AnonymousClass2(this.this$0.getFlowCoordinator()), new AnonymousClass3(this.this$0.getFlowCoordinator())), composer, HomeViewModel.$stable | (HomeNavigator.$stable << 6));
                    ProfileMenuUiState invoke$lambda$0 = invoke$lambda$0(collectAsState);
                    viewModel3 = this.this$0.getViewModel();
                    AnonymousClass4 anonymousClass4 = new AnonymousClass4(viewModel3);
                    HomeFragment homeFragment = this.this$0;
                    composer.startReplaceableGroup(-492369756);
                    ComposerKt.sourceInformation(composer, "CC(remember):Composables.kt#9igjgp");
                    Object rememberedValue = composer.rememberedValue();
                    if (rememberedValue == Composer.Companion.getEmpty()) {
                        viewModel4 = homeFragment.getViewModel();
                        viewModel5 = homeFragment.getViewModel();
                        rememberedValue = new ProfileMenuNavigator(new HomeFragment$onViewCreated$1$1$1$1$5$1(homeFragment.getFlowCoordinator()), HomeFragment$onViewCreated$1$1$1$1$5$2.INSTANCE, new HomeFragment$onViewCreated$1$1$1$1$5$3(homeFragment.getFlowCoordinator()), new HomeFragment$onViewCreated$1$1$1$1$5$4(viewModel4), new HomeFragment$onViewCreated$1$1$1$1$5$5(viewModel5));
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceableGroup();
                    ProfileMenuContentKt.m6951ProfileMenuContentjA1GFJw(invoke$lambda$0, anonymousClass4, (ProfileMenuNavigator) rememberedValue, 0L, 0L, composer, ProfileMenuUiState.$stable | (ProfileMenuNavigator.$stable << 6), 24);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C01191 extends AdaptedFunctionReference implements Function1<String, Unit> {
                C01191(Object obj) {
                    super(1, obj, AppFlowCoordinator.class, "goToChat", "goToChat(Ljava/lang/String;ZZ)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    AppFlowCoordinator.DefaultImpls.goToChat$default((AppFlowCoordinator) this.receiver, p0, false, false, 6, null);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1$1$2  reason: invalid class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<String, Unit> {
                AnonymousClass2(Object obj) {
                    super(1, obj, AppFlowCoordinator.class, "goToChatStore", "goToChatStore(Ljava/lang/String;)V", 0);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(String str) {
                    invoke2(str);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(String p0) {
                    Intrinsics.checkNotNullParameter(p0, "p0");
                    ((AppFlowCoordinator) this.receiver).goToChatStore(p0);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1$1$3  reason: invalid class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass3(Object obj) {
                    super(0, obj, AppFlowCoordinator.class, "goToConfirmEmail", "goToConfirmEmail()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((AppFlowCoordinator) this.receiver).goToConfirmEmail();
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: HomeFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment$onViewCreated$1$1$1$1$4  reason: invalid class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
                AnonymousClass4(Object obj) {
                    super(0, obj, HomeViewModel.class, "hideProfileMenu", "hideProfileMenu()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((HomeViewModel) this.receiver).hideProfileMenu();
                }
            }

            private static final ProfileMenuUiState invoke$lambda$0(State<ProfileMenuUiState> state) {
                return state.getValue();
            }
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-570757549, i, -1, "com.ifriend.chat.presentation.ui.chat.presentation.home.HomeFragment.onViewCreated.<anonymous>.<anonymous> (HomeFragment.kt:51)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, 247241018, true, new AnonymousClass1(this.this$0)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
