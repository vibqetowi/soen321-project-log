package com.ifriend.registration.presentation.ui;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import com.ifriend.presentation.features.update.model.InAppUpdateState;
import com.ifriend.presentation.features.update.view.InAppUpdatePopupKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
/* compiled from: RegistrationActivity.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RegistrationActivity$onCreate$2$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RegistrationActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegistrationActivity$onCreate$2$1(RegistrationActivity registrationActivity) {
        super(2);
        this.this$0 = registrationActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        RegistrationViewModel viewModel;
        RegistrationViewModel viewModel2;
        RegistrationViewModel viewModel3;
        RegistrationViewModel viewModel4;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498137353, i, -1, "com.ifriend.registration.presentation.ui.RegistrationActivity.onCreate.<anonymous>.<anonymous> (RegistrationActivity.kt:102)");
            }
            viewModel = this.this$0.getViewModel();
            State collectAsState = SnapshotStateKt.collectAsState(viewModel.getInAppUpdateState(), null, composer, 8, 1);
            boolean isVisible = invoke$lambda$0(collectAsState).isVisible();
            boolean canClose = invoke$lambda$0(collectAsState).getCanClose();
            viewModel2 = this.this$0.getViewModel();
            viewModel3 = this.this$0.getViewModel();
            InAppUpdatePopupKt.InAppUpdatesPopup(isVisible, canClose, new AnonymousClass1(viewModel2), new AnonymousClass2(viewModel3), composer, 0);
            boolean isVisibleSnackbar = invoke$lambda$0(collectAsState).isVisibleSnackbar();
            viewModel4 = this.this$0.getViewModel();
            InAppUpdatePopupKt.InAppUpdateDownloadedSnackbar(isVisibleSnackbar, new AnonymousClass3(viewModel4), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegistrationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.RegistrationActivity$onCreate$2$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, RegistrationViewModel.class, "onUpdateClick", "onUpdateClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RegistrationViewModel) this.receiver).onUpdateClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegistrationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.RegistrationActivity$onCreate$2$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass2(Object obj) {
            super(0, obj, RegistrationViewModel.class, "onUpdatePopupDismiss", "onUpdatePopupDismiss()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RegistrationViewModel) this.receiver).onUpdatePopupDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RegistrationActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.registration.presentation.ui.RegistrationActivity$onCreate$2$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass3 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass3(Object obj) {
            super(0, obj, RegistrationViewModel.class, "onUpdateSnackbarClick", "onUpdateSnackbarClick()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((RegistrationViewModel) this.receiver).onUpdateSnackbarClick();
        }
    }

    private static final InAppUpdateState invoke$lambda$0(State<InAppUpdateState> state) {
        return state.getValue();
    }
}
