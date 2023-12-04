package com.ifriend.presentation.common.observers.exceptions;

import com.ifriend.presentation.common.observers.FlowObserver;
import com.ifriend.presentation.common.observers.FlowObserverEmitter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: ExceptionsObserver.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0011\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0001j\u0002`\u00042\u0011\u0012\t\u0012\u00070\u0002¢\u0006\u0002\b\u00030\u0005j\u0002`\u0006B\u0005¢\u0006\u0002\u0010\u0007J\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsObserver;", "Lcom/ifriend/presentation/common/observers/FlowObserver;", "", "Lkotlin/jvm/JvmSuppressWildcards;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsFlow;", "Lcom/ifriend/presentation/common/observers/FlowObserverEmitter;", "Lcom/ifriend/presentation/common/observers/exceptions/ExceptionsEmitter;", "()V", "state", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "emit", "", "value", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "Lkotlinx/coroutines/flow/Flow;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ExceptionsObserver implements FlowObserver<Throwable>, FlowObserverEmitter<Throwable> {
    public static final int $stable = 8;
    private final MutableSharedFlow<Throwable> state = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    @Override // com.ifriend.presentation.common.observers.FlowObserverEmitter
    public /* bridge */ /* synthetic */ Object emit(Throwable th, Continuation continuation) {
        return emit2(th, (Continuation<? super Unit>) continuation);
    }

    @Override // com.ifriend.presentation.common.observers.FlowObserver
    public Flow<Throwable> subscribe() {
        return FlowKt.asSharedFlow(this.state);
    }

    /* renamed from: emit  reason: avoid collision after fix types in other method */
    public Object emit2(Throwable th, Continuation<? super Unit> continuation) {
        Object emit = this.state.emit(th, continuation);
        return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
    }
}
