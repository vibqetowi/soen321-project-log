package com.ifriend.presentation.features.update.delegate;

import com.ifriend.domain.logic.updates.UpdatePromptInteractor;
import com.ifriend.presentation.features.update.analytics.InAppUpdateAnalytics;
import com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InAppUpdateDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.features.update.delegate.InAppUpdateDelegateImpl$handleStartUpdateResult$1", f = "InAppUpdateDelegate.kt", i = {}, l = {226}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class InAppUpdateDelegateImpl$handleStartUpdateResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ InAppUpdateDelegateImpl.State $stateValue;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InAppUpdateDelegateImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateDelegateImpl$handleStartUpdateResult$1(InAppUpdateDelegateImpl inAppUpdateDelegateImpl, InAppUpdateDelegateImpl.State state, Continuation<? super InAppUpdateDelegateImpl$handleStartUpdateResult$1> continuation) {
        super(2, continuation);
        this.this$0 = inAppUpdateDelegateImpl;
        this.$stateValue = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InAppUpdateDelegateImpl$handleStartUpdateResult$1(this.this$0, this.$stateValue, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InAppUpdateDelegateImpl$handleStartUpdateResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InAppUpdateAnalytics inAppUpdateAnalytics;
        String str;
        UpdatePromptInteractor updatePromptInteractor;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            inAppUpdateAnalytics = this.this$0.inAppUpdateAnalytics;
            str = this.this$0.userId;
            updatePromptInteractor = this.this$0.updatePromptInteractor;
            this.L$0 = inAppUpdateAnalytics;
            this.L$1 = str;
            this.label = 1;
            Object dismissCount = updatePromptInteractor.getDismissCount(this);
            if (dismissCount == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            obj = dismissCount;
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            str2 = (String) this.L$1;
            inAppUpdateAnalytics = (InAppUpdateAnalytics) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        inAppUpdateAnalytics.trackUpdatePopupClick(str2, ((Number) obj).intValue() + 1, this.$stateValue.getInfo().availableVersionCode());
        return Unit.INSTANCE;
    }
}
