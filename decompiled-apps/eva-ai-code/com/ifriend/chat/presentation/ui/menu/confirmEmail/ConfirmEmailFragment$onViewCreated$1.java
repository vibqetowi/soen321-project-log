package com.ifriend.chat.presentation.ui.menu.confirmEmail;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.widget.Toast;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import com.ifriend.presentation.common.uistate.UiStateDelegateExKt;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmEmailViewModel;
import com.ifriend.presentation.features.profile.confirmemail.ConfirmUserEmailScreenKt;
import com.ifriend.presentation.navigation.AppFlowCoordinator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Lambda;
/* compiled from: ConfirmEmailFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ConfirmEmailFragment$onViewCreated$1 extends Lambda implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ConfirmEmailFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfirmEmailFragment$onViewCreated$1(ConfirmEmailFragment confirmEmailFragment) {
        super(2);
        this.this$0 = confirmEmailFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmEmailFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment$onViewCreated$1$2  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass2 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ConfirmEmailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ConfirmEmailFragment confirmEmailFragment) {
            super(0);
            this.this$0 = confirmEmailFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            try {
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.APP_EMAIL");
                intent.addFlags(268435456);
                this.this$0.startActivity(intent);
                this.this$0.getAnalyticsCheckMyInboxClickedUseCase().handle();
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(this.this$0.getContext(), "There is no email client installed.", 0).show();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmEmailFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment$onViewCreated$1$3  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass3 extends Lambda implements Function0<Unit> {
        final /* synthetic */ ConfirmEmailFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(ConfirmEmailFragment confirmEmailFragment) {
            super(0);
            this.this$0 = confirmEmailFragment;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.this$0.showGetConfirmationPopup();
        }
    }

    public final void invoke(Composer composer, int i) {
        ConfirmEmailViewModel viewModel;
        if ((i & 11) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1426468808, i, -1, "com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment.onViewCreated.<anonymous> (ConfirmEmailFragment.kt:51)");
            }
            viewModel = this.this$0.getViewModel();
            ConfirmUserEmailScreenKt.ConfirmUserEmailScreen(invoke$lambda$0(UiStateDelegateExKt.collectUiState(viewModel, null, composer, ConfirmEmailViewModel.$stable, 1)), new AnonymousClass1(this.this$0.getAppFlowCoordinator()), new AnonymousClass2(this.this$0), new AnonymousClass3(this.this$0), composer, ConfirmEmailViewModel.UiState.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ConfirmEmailFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.chat.presentation.ui.menu.confirmEmail.ConfirmEmailFragment$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        AnonymousClass1(Object obj) {
            super(0, obj, AppFlowCoordinator.class, "back", "back()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((AppFlowCoordinator) this.receiver).back();
        }
    }

    private static final ConfirmEmailViewModel.UiState invoke$lambda$0(State<ConfirmEmailViewModel.UiState> state) {
        return state.getValue();
    }
}
