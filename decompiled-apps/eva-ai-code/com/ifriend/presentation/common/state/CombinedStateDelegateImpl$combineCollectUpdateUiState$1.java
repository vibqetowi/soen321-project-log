package com.ifriend.presentation.common.state;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0007\u0010\u0006\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u00032\u0006\u0010\u0004\u001a\u00028\u00022\u0006\u0010\u0005\u001a\u00028\u0000H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "UiState", "State", "Event", "state", "value", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.ifriend.presentation.common.state.CombinedStateDelegateImpl$combineCollectUpdateUiState$1", f = "CombinedStateDelegate.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl$combineCollectUpdateUiState$1 extends SuspendLambda implements Function3<State, T, Continuation<? super UiState>, Object> {
    final /* synthetic */ CombinedStateDelegate<UiState, State, Event> $this_combineCollectUpdateUiState;
    final /* synthetic */ Function4<State, UiState, T, Continuation<? super UiState>, Object> $transform;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombinedStateDelegateImpl$combineCollectUpdateUiState$1(Function4<? super State, ? super UiState, ? super T, ? super Continuation<? super UiState>, ? extends Object> function4, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Continuation<? super CombinedStateDelegateImpl$combineCollectUpdateUiState$1> continuation) {
        super(3, continuation);
        this.$transform = function4;
        this.$this_combineCollectUpdateUiState = combinedStateDelegate;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((CombinedStateDelegateImpl$combineCollectUpdateUiState$1) obj, obj2, (Continuation) obj3);
    }

    public final Object invoke(State state, T t, Continuation<? super UiState> continuation) {
        CombinedStateDelegateImpl$combineCollectUpdateUiState$1 combinedStateDelegateImpl$combineCollectUpdateUiState$1 = new CombinedStateDelegateImpl$combineCollectUpdateUiState$1(this.$transform, this.$this_combineCollectUpdateUiState, continuation);
        combinedStateDelegateImpl$combineCollectUpdateUiState$1.L$0 = state;
        combinedStateDelegateImpl$combineCollectUpdateUiState$1.L$1 = t;
        return combinedStateDelegateImpl$combineCollectUpdateUiState$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Object obj2 = this.L$0;
            Object obj3 = this.L$1;
            Function4<State, UiState, T, Continuation<? super UiState>, Object> function4 = this.$transform;
            UiStateDelegate uiStateDelegate = this.$this_combineCollectUpdateUiState;
            Object uiState = uiStateDelegate.getUiState(uiStateDelegate);
            this.L$0 = null;
            this.label = 1;
            obj = function4.invoke(obj2, uiState, obj3, this);
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
