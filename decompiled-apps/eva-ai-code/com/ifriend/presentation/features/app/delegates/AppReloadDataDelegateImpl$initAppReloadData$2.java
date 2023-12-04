package com.ifriend.presentation.features.app.delegates;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.models.profile.user.User;
import com.ifriend.domain.useCases.user.get.GetUserUseCase;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import com.ifriend.presentation.features.app.viewmodel.models.AppSystemState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AppReloadDataDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$initAppReloadData$2", f = "AppReloadDataDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class AppReloadDataDelegateImpl$initAppReloadData$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $this_initAppReloadData;
    int label;
    final /* synthetic */ AppReloadDataDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReloadDataDelegateImpl$initAppReloadData$2(AppReloadDataDelegateImpl appReloadDataDelegateImpl, AppViewModel appViewModel, Continuation<? super AppReloadDataDelegateImpl$initAppReloadData$2> continuation) {
        super(2, continuation);
        this.this$0 = appReloadDataDelegateImpl;
        this.$this_initAppReloadData = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AppReloadDataDelegateImpl$initAppReloadData$2(this.this$0, this.$this_initAppReloadData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AppReloadDataDelegateImpl$initAppReloadData$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        GetUserUseCase getUserUseCase;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            getUserUseCase = this.this$0.getUserUseCase;
            this.label = 1;
            obj = getUserUseCase.flow(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        FlowKt.launchIn(FlowKt.onEach((Flow) obj, new AnonymousClass1(this.$this_initAppReloadData, this.this$0, null)), ViewModelKt.getViewModelScope(this.$this_initAppReloadData));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppReloadDataDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, d2 = {"Lcom/ifriend/domain/models/profile/user/User;", "user", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$initAppReloadData$2$1", f = "AppReloadDataDelegate.kt", i = {}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$initAppReloadData$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<User, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppViewModel $this_initAppReloadData;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppReloadDataDelegateImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AppViewModel appViewModel, AppReloadDataDelegateImpl appReloadDataDelegateImpl, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$this_initAppReloadData = appViewModel;
            this.this$0 = appReloadDataDelegateImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_initAppReloadData, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(User user, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(user, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                User user = (User) this.L$0;
                UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.$this_initAppReloadData;
                boolean z = false;
                boolean z2 = uiStateDelegate.getUiState(uiStateDelegate).getAppSystemState() == AppSystemState.Background;
                boolean z3 = (user != null ? user.getSubscription() : null) == Subscription.PREMIUM;
                UiStateDelegate<AppReloadDataDelegateImpl.AppReloadDataState, Object> uiStateDelegate2 = this.this$0;
                boolean z4 = uiStateDelegate2.getUiState(uiStateDelegate2).getLastUserSubscription() == Subscription.NONE;
                if (z3 && z4 && z2) {
                    z = true;
                }
                UiStateDelegate<AppReloadDataDelegateImpl.AppReloadDataState, Object> uiStateDelegate3 = this.this$0;
                this.label = 1;
                if (uiStateDelegate3.reduce(uiStateDelegate3, new C01471(user, z), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: AppReloadDataDelegate.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ifriend/presentation/features/app/delegates/AppReloadDataDelegateImpl$AppReloadDataState;", "state", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.ifriend.presentation.features.app.delegates.AppReloadDataDelegateImpl$initAppReloadData$2$1$1  reason: invalid class name and collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C01471 extends Lambda implements Function1<AppReloadDataDelegateImpl.AppReloadDataState, AppReloadDataDelegateImpl.AppReloadDataState> {
            final /* synthetic */ boolean $isShouldReloadData;
            final /* synthetic */ User $user;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01471(User user, boolean z) {
                super(1);
                this.$user = user;
                this.$isShouldReloadData = z;
            }

            @Override // kotlin.jvm.functions.Function1
            public final AppReloadDataDelegateImpl.AppReloadDataState invoke(AppReloadDataDelegateImpl.AppReloadDataState state) {
                Intrinsics.checkNotNullParameter(state, "state");
                User user = this.$user;
                return AppReloadDataDelegateImpl.AppReloadDataState.copy$default(state, false, user != null ? user.getSubscription() : null, this.$isShouldReloadData, 1, null);
            }
        }
    }
}
