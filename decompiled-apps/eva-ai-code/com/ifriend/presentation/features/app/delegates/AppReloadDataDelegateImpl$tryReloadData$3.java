package com.ifriend.presentation.features.app.delegates;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl$tryReloadData$3 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ViewModel $$context_receiver_0;
    final /* synthetic */ AppReloadDataDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReloadDataDelegateImpl$tryReloadData$3(AppReloadDataDelegateImpl appReloadDataDelegateImpl, ViewModel viewModel) {
        super(1);
        this.this$0 = appReloadDataDelegateImpl;
        this.$$context_receiver_0 = viewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppReloadDataDelegate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$tryReloadData$3$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<AppReloadDataDelegateImpl.AppReloadDataState, AppReloadDataDelegateImpl.AppReloadDataState> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AppReloadDataDelegateImpl.AppReloadDataState invoke(AppReloadDataDelegateImpl.AppReloadDataState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return AppReloadDataDelegateImpl.AppReloadDataState.copy$default(state, false, null, false, 2, null);
        }
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.this$0.asyncReduce(ViewModelKt.getViewModelScope(this.$$context_receiver_0), AnonymousClass1.INSTANCE);
    }
}
