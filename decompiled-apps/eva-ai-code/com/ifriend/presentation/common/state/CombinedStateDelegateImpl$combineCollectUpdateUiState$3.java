package com.ifriend.presentation.common.state;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\t\u0010\b\u001a\u00028\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003\"\u0004\b\u0004\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001H\u008a@"}, d2 = {"T1", "T2", "UiState", "State", "Event", "state", "value1", "value2", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$3", f = "CombinedStateDelegate.kt", i = {}, l = {TsExtractor.TS_STREAM_TYPE_AC3}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$combineCollectUpdateUiState$3 extends SuspendLambda implements Function4<State, T1, T2, Continuation<? super UiState>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_combineCollectUpdateUiState;
    final /* synthetic */ Function5<State, UiState, T1, T2, Continuation<? super UiState>, Object> $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$combineCollectUpdateUiState$3(Function5<? super State, ? super UiState, ? super T1, ? super T2, ? super Continuation<? super UiState>, ? extends Object> function5, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Continuation<? super CombinedStateDelegateImpl$combineCollectUpdateUiState$3> continuation) {
        super(4, continuation);
        this.$transform = function5;
        this.$this_combineCollectUpdateUiState = combinedStateDelegate;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return invoke((CombinedStateDelegateImpl$combineCollectUpdateUiState$3) obj, obj2, obj3, (Continuation) obj4);
    }

    public final Object invoke(State state, T1 t1, T2 t2, Continuation<? super UiState> continuation) {
        CombinedStateDelegateImpl$combineCollectUpdateUiState$3 combinedStateDelegateImpl$combineCollectUpdateUiState$3 = new CombinedStateDelegateImpl$combineCollectUpdateUiState$3(this.$transform, this.$this_combineCollectUpdateUiState, continuation);
        combinedStateDelegateImpl$combineCollectUpdateUiState$3.L$0 = state;
        combinedStateDelegateImpl$combineCollectUpdateUiState$3.L$1 = t1;
        combinedStateDelegateImpl$combineCollectUpdateUiState$3.L$2 = t2;
        return combinedStateDelegateImpl$combineCollectUpdateUiState$3.invokeSuspend(Unit.INSTANCE);
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
            Function5<State, UiState, T1, T2, Continuation<? super UiState>, Object> function5 = this.$transform;
            UiStateDelegate uiStateDelegate = this.$this_combineCollectUpdateUiState;
            Object uiState = uiStateDelegate.getUiState(uiStateDelegate);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = function5.invoke(obj2, uiState, obj3, obj4, this);
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
