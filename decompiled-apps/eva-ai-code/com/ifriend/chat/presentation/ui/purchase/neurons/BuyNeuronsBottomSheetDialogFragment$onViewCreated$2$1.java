package com.ifriend.chat.presentation.ui.purchase.neurons;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.purchases.neurons.model.BuyNeuronsProductUiParams;
import com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsBottomSheetKt;
import com.ifriend.presentation.features.purchases.neurons.view.BuyNeuronsClicks;
import com.ifriend.presentation.features.purchases.neurons.viewmodel.BuyNeuronsViewModel;
import com.ifriend.ui.theme.AppThemeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
        super(2);
        this.this$0 = buyNeuronsBottomSheetDialogFragment;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ BuyNeuronsBottomSheetDialogFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BuyNeuronsBottomSheetDialogFragment buyNeuronsBottomSheetDialogFragment) {
            super(2);
            this.this$0 = buyNeuronsBottomSheetDialogFragment;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            BuyNeuronsViewModel viewModel;
            BuyNeuronsViewModel viewModel2;
            BuyNeuronsViewModel viewModel3;
            BuyNeuronsViewModel viewModel4;
            BuyNeuronsViewModel viewModel5;
            BuyNeuronsViewModel viewModel6;
            if ((i & 11) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(866508092, i, -1, "com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous>.<anonymous> (BuyNeuronsBottomSheetDialogFragment.kt:175)");
                }
                viewModel = this.this$0.getViewModel();
                BuyNeuronsViewModel.UiState invoke$lambda$0 = invoke$lambda$0(UiStateDelegateExKt.collectUiState(viewModel, null, composer, BuyNeuronsViewModel.$stable, 1));
                viewModel2 = this.this$0.getViewModel();
                viewModel3 = this.this$0.getViewModel();
                viewModel4 = this.this$0.getViewModel();
                viewModel5 = this.this$0.getViewModel();
                viewModel6 = this.this$0.getViewModel();
                BuyNeuronsBottomSheetKt.BuyNeuronsCard(invoke$lambda$0, new BuyNeuronsClicks(new C01311(viewModel2), new AnonymousClass2(viewModel3), new AnonymousClass3(viewModel4), new AnonymousClass4(viewModel5), new AnonymousClass5(viewModel6)), new AnonymousClass6(this.this$0), composer, BuyNeuronsViewModel.UiState.$stable | (BuyNeuronsClicks.$stable << 3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C01311 extends FunctionReferenceImpl implements Function1<BuyNeuronsProductUiParams, Unit> {
            C01311(Object obj) {
                super(1, obj, BuyNeuronsViewModel.class, "onItemClick", "onItemClick(Lcom/ifriend/presentation/features/purchases/neurons/model/BuyNeuronsProductUiParams;)V", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(BuyNeuronsProductUiParams buyNeuronsProductUiParams) {
                invoke2(buyNeuronsProductUiParams);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(BuyNeuronsProductUiParams p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((BuyNeuronsViewModel) this.receiver).onItemClick(p0);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$2  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass2(Object obj) {
                super(0, obj, BuyNeuronsViewModel.class, "onContinueClick", "onContinueClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((BuyNeuronsViewModel) this.receiver).onContinueClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$3  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass3(Object obj) {
                super(0, obj, BuyNeuronsViewModel.class, "onPrivacyClick", "onPrivacyClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((BuyNeuronsViewModel) this.receiver).onPrivacyClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$4  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass4 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass4(Object obj) {
                super(0, obj, BuyNeuronsViewModel.class, "onRestoreClick", "onRestoreClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((BuyNeuronsViewModel) this.receiver).onRestoreClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$5  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass5 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass5(Object obj) {
                super(0, obj, BuyNeuronsViewModel.class, "onTermsClick", "onTermsClick()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((BuyNeuronsViewModel) this.receiver).onTermsClick();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BuyNeuronsBottomSheetDialogFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment$onViewCreated$2$1$1$6  reason: invalid class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class AnonymousClass6 extends FunctionReferenceImpl implements Function0<Unit> {
            AnonymousClass6(Object obj) {
                super(0, obj, BuyNeuronsBottomSheetDialogFragment.class, "dismiss", "dismiss()V", 0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((BuyNeuronsBottomSheetDialogFragment) this.receiver).dismiss();
            }
        }

        private static final BuyNeuronsViewModel.UiState invoke$lambda$0(State<BuyNeuronsViewModel.UiState> state) {
            return state.getValue();
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
                ComposerKt.traceEventStart(1456432469, i, -1, "com.ifriend.chat.presentation.ui.purchase.neurons.BuyNeuronsBottomSheetDialogFragment.onViewCreated.<anonymous>.<anonymous> (BuyNeuronsBottomSheetDialogFragment.kt:174)");
            }
            AppThemeKt.AppTheme(null, null, null, null, ComposableLambdaKt.composableLambda(composer, 866508092, true, new AnonymousClass1(this.this$0)), composer, 24576, 15);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }
}
