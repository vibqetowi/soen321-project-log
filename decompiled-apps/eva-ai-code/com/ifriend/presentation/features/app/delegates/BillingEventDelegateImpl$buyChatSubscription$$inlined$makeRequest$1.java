package com.ifriend.presentation.features.app.delegates;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.billing.api.logic.BillingInteractor;
import com.ifriend.domain.socket.notifications.UnableToOpenUpgradeScreen;
import com.ifriend.presentation.common.observers.appevents.params.BuyChatSubscriptionBillingUiParams;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$makeRequest$2;
import com.ifriend.presentation.features.app.viewmodel.AppViewModel;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: BillingEventDelegate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/ifriend/presentation/features/app/delegates/BillingEventDelegateImpl$makeRequest$2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.app.delegates.BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1", f = "BillingEventDelegate.kt", i = {}, l = {110, 183, 185, TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AppViewModel $$context_receiver_0;
    final /* synthetic */ AppViewModel $$context_receiver_0$inlined;
    final /* synthetic */ BuyChatSubscriptionBillingUiParams $params$inlined;
    Object L$0;
    int label;
    final /* synthetic */ BillingEventDelegateImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1(AppViewModel appViewModel, Continuation continuation, BillingEventDelegateImpl billingEventDelegateImpl, AppViewModel appViewModel2, BuyChatSubscriptionBillingUiParams buyChatSubscriptionBillingUiParams) {
        super(2, continuation);
        this.this$0 = billingEventDelegateImpl;
        this.$$context_receiver_0$inlined = appViewModel2;
        this.$params$inlined = buyChatSubscriptionBillingUiParams;
        this.$$context_receiver_0 = appViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1(this.$$context_receiver_0, continuation, this.this$0, this.$$context_receiver_0$inlined, this.$params$inlined);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BillingEventDelegateImpl$buyChatSubscription$$inlined$makeRequest$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0088  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BillingInteractor billingInteractor;
        Object mo6782startBillingConnectionIoAF18A;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate = this.$$context_receiver_0;
            this.label = 1;
            if (uiStateDelegate.updateUiState(uiStateDelegate, BillingEventDelegateImpl$makeRequest$2.AnonymousClass1.INSTANCE, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            if (i == 2) {
                ResultKt.throwOnFailure(obj);
                mo6782startBillingConnectionIoAF18A = ((Result) obj).m7280unboximpl();
                obj2 = mo6782startBillingConnectionIoAF18A;
                if (Result.m7278isSuccessimpl(obj2)) {
                    Unit unit = (Unit) obj2;
                    UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate2 = this.$$context_receiver_0$inlined;
                    this.L$0 = obj2;
                    this.label = 3;
                    if (uiStateDelegate2.sendEvent2(uiStateDelegate2, (AppViewModel.Event) new AppViewModel.Event.GoToBuyChatSubscription(this.$params$inlined), (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                if (Result.m7274exceptionOrNullimpl(obj2) != null) {
                }
                return Unit.INSTANCE;
            } else if (i != 3) {
                if (i == 4) {
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                obj2 = this.L$0;
                ResultKt.throwOnFailure(obj);
                if (Result.m7274exceptionOrNullimpl(obj2) != null) {
                    UiStateDelegate<AppViewModel.UiState, AppViewModel.Event> uiStateDelegate3 = this.$$context_receiver_0$inlined;
                    this.L$0 = obj2;
                    this.label = 4;
                    if (uiStateDelegate3.sendEvent2(uiStateDelegate3, (AppViewModel.Event) new AppViewModel.Event.ShowInternalNotification(new UnableToOpenUpgradeScreen()), (Continuation<? super Unit>) this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        } else {
            ResultKt.throwOnFailure(obj);
        }
        billingInteractor = this.this$0.billingInteractor;
        this.label = 2;
        mo6782startBillingConnectionIoAF18A = billingInteractor.mo6782startBillingConnectionIoAF18A(this);
        if (mo6782startBillingConnectionIoAF18A == coroutine_suspended) {
            return coroutine_suspended;
        }
        obj2 = mo6782startBillingConnectionIoAF18A;
        if (Result.m7278isSuccessimpl(obj2)) {
        }
        if (Result.m7274exceptionOrNullimpl(obj2) != null) {
        }
        return Unit.INSTANCE;
    }
}
