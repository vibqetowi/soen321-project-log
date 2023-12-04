package com.ifriend.presentation.common.state;

import com.ifriend.presentation.common.uistate.UiStateDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\r\u0010\f\u001a\u00028\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u0004\"\u0004\b\u0005\u0010\u0005\"\u0004\b\u0006\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00052\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\u0006\u0010\n\u001a\u00028\u00022\u0006\u0010\u000b\u001a\u00028\u0003H\u008a@"}, d2 = {"T1", "T2", "T3", "T4", "UiState", "State", "Event", "state", "value1", "value2", "value3", "value4", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$7", f = "CombinedStateDelegate.kt", i = {}, l = {178}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$combineCollectUpdateUiState$7 extends SuspendLambda implements Function6<State, T1, T2, T3, T4, Continuation<? super UiState>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_combineCollectUpdateUiState;
    final /* synthetic */ Function7<State, UiState, T1, T2, T3, T4, Continuation<? super UiState>, Object> $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$combineCollectUpdateUiState$7(Function7<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super UiState>, ? extends Object> function7, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Continuation<? super CombinedStateDelegateImpl$combineCollectUpdateUiState$7> continuation) {
        super(6, continuation);
        this.$transform = function7;
        this.$this_combineCollectUpdateUiState = combinedStateDelegate;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return invoke((CombinedStateDelegateImpl$combineCollectUpdateUiState$7) obj, obj2, obj3, obj4, obj5, (Continuation) obj6);
    }

    public final Object invoke(State state, T1 t1, T2 t2, T3 t3, T4 t4, Continuation<? super UiState> continuation) {
        CombinedStateDelegateImpl$combineCollectUpdateUiState$7 combinedStateDelegateImpl$combineCollectUpdateUiState$7 = new CombinedStateDelegateImpl$combineCollectUpdateUiState$7(this.$transform, this.$this_combineCollectUpdateUiState, continuation);
        combinedStateDelegateImpl$combineCollectUpdateUiState$7.L$0 = state;
        combinedStateDelegateImpl$combineCollectUpdateUiState$7.L$1 = t1;
        combinedStateDelegateImpl$combineCollectUpdateUiState$7.L$2 = t2;
        combinedStateDelegateImpl$combineCollectUpdateUiState$7.L$3 = t3;
        combinedStateDelegateImpl$combineCollectUpdateUiState$7.L$4 = t4;
        return combinedStateDelegateImpl$combineCollectUpdateUiState$7.invokeSuspend(Unit.INSTANCE);
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
            Object obj6 = this.L$4;
            Function7<State, UiState, T1, T2, T3, T4, Continuation<? super UiState>, Object> function7 = this.$transform;
            UiStateDelegate uiStateDelegate = this.$this_combineCollectUpdateUiState;
            Object uiState = uiStateDelegate.getUiState(uiStateDelegate);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = function7.invoke(obj2, uiState, obj3, obj4, obj5, obj6, this);
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
