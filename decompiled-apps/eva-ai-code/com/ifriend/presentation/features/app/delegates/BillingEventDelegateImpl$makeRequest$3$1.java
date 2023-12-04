package com.ifriend.presentation.features.app.delegates;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BillingEventDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl$makeRequest$3$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    final /* synthetic */ BillingEventDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingEventDelegateImpl$makeRequest$3$1(AppViewModel appViewModel, BillingEventDelegateImpl billingEventDelegateImpl) {
        super(1);
        this.$$context_receiver_0 = appViewModel;
        this.this$0 = billingEventDelegateImpl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BillingEventDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/app/viewmodel/AppViewModel$UiState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$makeRequest$3$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<AppViewModel.UiState, AppViewModel.UiState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppViewModel.UiState invoke(AppViewModel.UiState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return AppViewModel.UiState.copy$default(state, false, null, 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
        uiStateDelegate.asyncUpdateUiState(uiStateDelegate, ViewModelKt.getViewModelScope((ViewModel) uiStateDelegate), AnonymousClass1.INSTANCE);
        this.this$0.requestProductsJob = null;
    }
}
