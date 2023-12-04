package com.ifriend.presentation.common.state;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: InternalStateDelegate.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J=\u0010\n\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\f\u001a\u00020\r2!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00000\u000fH&J>\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00002!\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00000\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0015R\u001c\u0010\u0003\u001a\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "State", "", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Ljava/lang/Object;", "internalStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "updateInternalState", "", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface InternalStateDelegate<State> {
    Job asyncUpdateInternalState(InternalStateDelegate<State> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super State, ? extends State> function1);

    State getInternalState(InternalStateDelegate<State> internalStateDelegate);

    StateFlow<State> getInternalStateFlow(InternalStateDelegate<State> internalStateDelegate);

    Object updateInternalState(InternalStateDelegate<State> internalStateDelegate, Function1<? super State, ? extends State> function1, Continuation<? super Unit> continuation);
}
