package com.ifriend.presentation.common.state;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u000b\u0010\n\u001a\u00028\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u00052\u0006\u0010\u0006\u001a\u00028\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00012\u0006\u0010\t\u001a\u00028\u0002H\u008a@"}, d2 = {"T1", "T2", "T3", "UiState", "State", "Event", "state", "value1", "value2", "value3", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$5", f = "CombinedStateDelegate.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$combineCollectUpdateUiState$5 extends SuspendLambda implements Function5<State, T1, T2, T3, Continuation<? super UiState>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_combineCollectUpdateUiState;
    final /* synthetic */ Function6<State, UiState, T1, T2, T3, Continuation<? super UiState>, Object> $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$combineCollectUpdateUiState$5(Function6<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super Continuation<? super UiState>, ? extends Object> function6, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Continuation<? super CombinedStateDelegateImpl$combineCollectUpdateUiState$5> continuation) {
        super(5, continuation);
        this.$transform = function6;
        this.$this_combineCollectUpdateUiState = combinedStateDelegate;
    }

    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return invoke((CombinedStateDelegateImpl$combineCollectUpdateUiState$5) obj, obj2, obj3, obj4, (Continuation) obj5);
    }

    public final Object invoke(State state, T1 t1, T2 t2, T3 t3, Continuation<? super UiState> continuation) {
        CombinedStateDelegateImpl$combineCollectUpdateUiState$5 combinedStateDelegateImpl$combineCollectUpdateUiState$5 = new CombinedStateDelegateImpl$combineCollectUpdateUiState$5(this.$transform, this.$this_combineCollectUpdateUiState, continuation);
        combinedStateDelegateImpl$combineCollectUpdateUiState$5.L$0 = state;
        combinedStateDelegateImpl$combineCollectUpdateUiState$5.L$1 = t1;
        combinedStateDelegateImpl$combineCollectUpdateUiState$5.L$2 = t2;
        combinedStateDelegateImpl$combineCollectUpdateUiState$5.L$3 = t3;
        return combinedStateDelegateImpl$combineCollectUpdateUiState$5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            Object obj4 = this.L$2;
            Object obj5 = this.L$3;
            Function6<State, UiState, T1, T2, T3, Continuation<? super UiState>, Object> function6 = this.$transform;
            UiStateDelegate uiStateDelegate = this.$this_combineCollectUpdateUiState;
            Object uiState = uiStateDelegate.getUiState(uiStateDelegate);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = function6.invoke(obj2, uiState, obj3, obj4, obj5, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
