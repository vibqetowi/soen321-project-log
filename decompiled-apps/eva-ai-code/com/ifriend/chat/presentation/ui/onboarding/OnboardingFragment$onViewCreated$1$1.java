package com.ifriend.chat.presentation.ui.onboarding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.fragment.app.FragmentActivity;
import com.ifriend.chat.presentation.ui.AppActivity;
import com.ifriend.presentation.features.app.di.AppViewModelProvider;
import com.ifriend.presentation.features.app.di.AppViewModelProviderKt;
import com.ifriend.presentation.features.onboarding.flow.navigation.OnboardingNavigationEntry;
import com.ifriend.presentation.features.onboarding.flow.viewmodel.OnboardingFlowViewModel;
import com.ifriend.ui.components.providers.AppLocalProviderKt;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: OnboardingFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class OnboardingFragment$onViewCreated$1$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ OnboardingNavigationEntry $entry;
    final /* synthetic */ OnboardingFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnboardingFragment$onViewCreated$1$1(OnboardingFragment onboardingFragment, OnboardingNavigationEntry onboardingNavigationEntry) {
        super(2);
        this.this$0 = onboardingFragment;
        this.$entry = onboardingNavigationEntry;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnboardingFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment$onViewCreated$1$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ OnboardingNavigationEntry $entry;
        final /* synthetic */ OnboardingFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(OnboardingFragment onboardingFragment, OnboardingNavigationEntry onboardingNavigationEntry) {
            super(2);
            this.this$0 = onboardingFragment;
            this.$entry = onboardingNavigationEntry;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1513397500, i, -1, "com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (OnboardingFragment.kt:49)");
                }
                ProvidableCompositionLocal<AppViewModelProvider> localAppViewModelProvider = AppViewModelProviderKt.getLocalAppViewModelProvider();
                FragmentActivity activity = this.this$0.getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.ifriend.chat.presentation.ui.AppActivity");
                CompositionLocalKt.CompositionLocalProvider(new ProvidedValue[]{AppLocalProviderKt.getLocalAppImageLoaderProvider().provides(this.this$0.getImageLoader()), localAppViewModelProvider.provides(((AppActivity) activity).getAppViewModelProvider())}, ComposableLambdaKt.composableLambda(composer, -179116476, true, new C01291(this.$entry, this.this$0)), composer, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: OnboardingFragment.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment$onViewCreated$1$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01291 extends Lambda implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ OnboardingNavigationEntry $entry;
            final /* synthetic */ OnboardingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01291(OnboardingNavigationEntry onboardingNavigationEntry, OnboardingFragment onboardingFragment) {
                super(2);
                this.$entry = onboardingNavigationEntry;
                this.this$0 = onboardingFragment;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                OnboardingFlowViewModel viewModel;
                OnboardingFlowViewModel viewModel2;
                if ((i & 11) != 2 || !composer.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-179116476, i, -1, "com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingFragment.kt:53)");
                    }
                    OnboardingNavigationEntry onboardingNavigationEntry = this.$entry;
                    viewModel = this.this$0.getViewModel();
                    viewModel2 = this.this$0.getViewModel();
                    onboardingNavigationEntry.OnboardingFlow(viewModel, new C01301(viewModel2), composer, OnboardingFlowViewModel.$stable | (OnboardingNavigationEntry.$stable << 6));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer.skipToGroupEnd();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: OnboardingFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment$onViewCreated$1$1$1$1$1  reason: invalid class name and collision with other inner class name */
            /* loaded from: classes6.dex */
            public /* synthetic */ class C01301 extends FunctionReferenceImpl implements Function0<Unit> {
                C01301(Object obj) {
                    super(0, obj, OnboardingFlowViewModel.class, "leaveFeature", "leaveFeature()V", 0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                @Override // kotlin.jvm.functions.Function0
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    ((OnboardingFlowViewModel) this.receiver).leaveFeature();
                }
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
                ComposerKt.traceEventStart(1963571229, i, -1, "com.ifriend.chat.presentation.ui.onboarding.OnboardingFragment.onViewCreated.<anonymous>.<anonymous> (OnboardingFragment.kt:48)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, -1513397500, true, new AnonymousClass1(this.this$0, this.$entry)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
