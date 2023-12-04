package com.ifriend.presentation.common.state;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: InternalStateDelegate.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J=\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0012\u001a\u00020\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00000\u0015H\u0016J>\u0010\u0019\u001a\u00020\u001a*\b\u0012\u0004\u0012\u00028\u00000\u00022!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00028\u00000\u0015H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001bR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r*\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lcom/ifriend/presentation/common/state/InternalStateDelegateImpl;", "State", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "mutexState", "Lkotlinx/coroutines/sync/Mutex;", "initialState", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;)V", "internalMutableState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Ljava/lang/Object;", "internalStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "updateInternalState", "", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalStateDelegateImpl<State> implements InternalStateDelegate<State> {
    public static final int $stable = 8;
    private final MutableStateFlow<State> internalMutableState;
    private final Mutex mutexState;

    public InternalStateDelegateImpl(Mutex mutexState, State state) {
        Intrinsics.checkNotNullParameter(mutexState, "mutexState");
        this.mutexState = mutexState;
        this.internalMutableState = StateFlowKt.MutableStateFlow(state);
    }

    public /* synthetic */ InternalStateDelegateImpl(Mutex mutex, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex, obj);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<State> getInternalStateFlow(InternalStateDelegate<State> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.internalMutableState;
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public State getInternalState(InternalStateDelegate<State> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.internalMutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateInternalState(InternalStateDelegate<State> internalStateDelegate, Function1<? super State, ? extends State> function1, Continuation<? super Unit> continuation) {
        InternalStateDelegateImpl$updateInternalState$1 internalStateDelegateImpl$updateInternalState$1;
        int i;
        Mutex mutex;
        InternalStateDelegateImpl<State> internalStateDelegateImpl;
        MutableStateFlow<State> mutableStateFlow;
        Object obj;
        try {
            if (continuation instanceof InternalStateDelegateImpl$updateInternalState$1) {
                internalStateDelegateImpl$updateInternalState$1 = (InternalStateDelegateImpl$updateInternalState$1) continuation;
                if ((internalStateDelegateImpl$updateInternalState$1.label & Integer.MIN_VALUE) != 0) {
                    internalStateDelegateImpl$updateInternalState$1.label -= Integer.MIN_VALUE;
                    Object obj2 = internalStateDelegateImpl$updateInternalState$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = internalStateDelegateImpl$updateInternalState$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj2);
                        mutex = this.mutexState;
                        internalStateDelegateImpl$updateInternalState$1.L$0 = this;
                        internalStateDelegateImpl$updateInternalState$1.L$1 = function1;
                        internalStateDelegateImpl$updateInternalState$1.L$2 = mutex;
                        internalStateDelegateImpl$updateInternalState$1.label = 1;
                        if (mutex.lock(null, internalStateDelegateImpl$updateInternalState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        internalStateDelegateImpl = this;
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        internalStateDelegateImpl = (InternalStateDelegateImpl) internalStateDelegateImpl$updateInternalState$1.L$0;
                        ResultKt.throwOnFailure(obj2);
                        mutex = (Mutex) internalStateDelegateImpl$updateInternalState$1.L$2;
                        function1 = (Function1) internalStateDelegateImpl$updateInternalState$1.L$1;
                    }
                    mutableStateFlow = internalStateDelegateImpl.internalMutableState;
                    do {
                        obj = (Object) mutableStateFlow.getValue();
                    } while (!mutableStateFlow.compareAndSet(obj, function1.invoke(obj)));
                    Unit unit = Unit.INSTANCE;
                    mutex.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            mutableStateFlow = internalStateDelegateImpl.internalMutableState;
            do {
                obj = (Object) mutableStateFlow.getValue();
            } while (!mutableStateFlow.compareAndSet(obj, function1.invoke(obj)));
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        internalStateDelegateImpl$updateInternalState$1 = new InternalStateDelegateImpl$updateInternalState$1(this, continuation);
        Object obj22 = internalStateDelegateImpl$updateInternalState$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = internalStateDelegateImpl$updateInternalState$1.label;
        if (i != 0) {
        }
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<State> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super State, ? extends State> transform) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new InternalStateDelegateImpl$asyncUpdateInternalState$1(internalStateDelegate, transform, null), 3, null);
        return launch$default;
    }
}
