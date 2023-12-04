package com.ifriend.presentation.common.uistate;

import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
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
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: UiStateDelegate.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ/\u0010\u0019\u001a\u00020\u001a*\u00020\u001b2!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001dH\u0017JC\u0010!\u001a\u00020\"*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010#\u001a\u00020\u001b2!\u0010$\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001dH\u0016JD\u0010%\u001a\u00020\u001a*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b( \u0012\u0004\u0012\u00028\u00000\u001dH\u0097@ø\u0001\u0000¢\u0006\u0002\u0010&J)\u0010'\u001a\u00020\u001a*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010(\u001a\u00028\u0001H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)JD\u0010*\u001a\u00020\u001a*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032!\u0010$\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u001dH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/ifriend/presentation/common/uistate/UiStateDelegateImpl;", "UiState", "Event", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "initialUiState", "singleLiveEventCapacity", "", "mutexState", "Lkotlinx/coroutines/sync/Mutex;", "(Ljava/lang/Object;ILkotlinx/coroutines/sync/Mutex;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "singleEventsChannel", "Lkotlinx/coroutines/channels/Channel;", "uiMutableStateFlow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Ljava/lang/Object;", "asyncReduce", "", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiStateDelegateImpl<UiState, Event> implements UiStateDelegate<UiState, Event> {
    public static final int $stable = 8;
    private final Mutex mutexState;
    private final Channel<Event> singleEventsChannel;
    private final MutableStateFlow<UiState> uiMutableStateFlow;

    public UiStateDelegateImpl(UiState uistate, int i, Mutex mutexState) {
        Intrinsics.checkNotNullParameter(mutexState, "mutexState");
        this.mutexState = mutexState;
        this.uiMutableStateFlow = StateFlowKt.MutableStateFlow(uistate);
        this.singleEventsChannel = ChannelKt.Channel$default(i, null, null, 6, null);
    }

    public /* synthetic */ UiStateDelegateImpl(Object obj, int i, Mutex mutex, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i2 & 2) != 0 ? -2 : i, (i2 & 4) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return FlowKt.asStateFlow(this.uiMutableStateFlow);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.uiMutableStateFlow.getValue();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return FlowKt.receiveAsFlow(this.singleEventsChannel);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        UiStateDelegateImpl$reduce$1 uiStateDelegateImpl$reduce$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        UiStateDelegateImpl<UiState, Event> uiStateDelegateImpl;
        Mutex mutex2;
        MutableStateFlow<UiState> mutableStateFlow;
        UiState invoke;
        try {
            if (continuation instanceof UiStateDelegateImpl$reduce$1) {
                uiStateDelegateImpl$reduce$1 = (UiStateDelegateImpl$reduce$1) continuation;
                if ((uiStateDelegateImpl$reduce$1.label & Integer.MIN_VALUE) != 0) {
                    uiStateDelegateImpl$reduce$1.label -= Integer.MIN_VALUE;
                    Object obj = uiStateDelegateImpl$reduce$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = uiStateDelegateImpl$reduce$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutexState;
                        uiStateDelegateImpl$reduce$1.L$0 = this;
                        uiStateDelegateImpl$reduce$1.L$1 = uiStateDelegate;
                        uiStateDelegateImpl$reduce$1.L$2 = function1;
                        uiStateDelegateImpl$reduce$1.L$3 = mutex;
                        uiStateDelegateImpl$reduce$1.label = 1;
                        if (mutex.lock(null, uiStateDelegateImpl$reduce$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        uiStateDelegateImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            mutex2 = (Mutex) uiStateDelegateImpl$reduce$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        function1 = (Function1) uiStateDelegateImpl$reduce$1.L$2;
                        uiStateDelegateImpl = (UiStateDelegateImpl) uiStateDelegateImpl$reduce$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) uiStateDelegateImpl$reduce$1.L$3;
                        uiStateDelegate = (UiStateDelegate) uiStateDelegateImpl$reduce$1.L$1;
                    }
                    mutableStateFlow = uiStateDelegateImpl.uiMutableStateFlow;
                    invoke = function1.invoke(uiStateDelegate.getUiState(uiStateDelegate));
                    uiStateDelegateImpl$reduce$1.L$0 = mutex;
                    uiStateDelegateImpl$reduce$1.L$1 = null;
                    uiStateDelegateImpl$reduce$1.L$2 = null;
                    uiStateDelegateImpl$reduce$1.L$3 = null;
                    uiStateDelegateImpl$reduce$1.label = 2;
                    if (mutableStateFlow.emit(invoke, uiStateDelegateImpl$reduce$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            mutableStateFlow = uiStateDelegateImpl.uiMutableStateFlow;
            invoke = function1.invoke(uiStateDelegate.getUiState(uiStateDelegate));
            uiStateDelegateImpl$reduce$1.L$0 = mutex;
            uiStateDelegateImpl$reduce$1.L$1 = null;
            uiStateDelegateImpl$reduce$1.L$2 = null;
            uiStateDelegateImpl$reduce$1.L$3 = null;
            uiStateDelegateImpl$reduce$1.label = 2;
            if (mutableStateFlow.emit(invoke, uiStateDelegateImpl$reduce$1) != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        uiStateDelegateImpl$reduce$1 = new UiStateDelegateImpl$reduce$1(this, continuation);
        Object obj2 = uiStateDelegateImpl$reduce$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uiStateDelegateImpl$reduce$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        UiStateDelegateImpl$updateUiState$1 uiStateDelegateImpl$updateUiState$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        UiStateDelegateImpl<UiState, Event> uiStateDelegateImpl;
        Mutex mutex2;
        MutableStateFlow<UiState> mutableStateFlow;
        UiState invoke;
        try {
            if (continuation instanceof UiStateDelegateImpl$updateUiState$1) {
                uiStateDelegateImpl$updateUiState$1 = (UiStateDelegateImpl$updateUiState$1) continuation;
                if ((uiStateDelegateImpl$updateUiState$1.label & Integer.MIN_VALUE) != 0) {
                    uiStateDelegateImpl$updateUiState$1.label -= Integer.MIN_VALUE;
                    Object obj = uiStateDelegateImpl$updateUiState$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = uiStateDelegateImpl$updateUiState$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.mutexState;
                        uiStateDelegateImpl$updateUiState$1.L$0 = this;
                        uiStateDelegateImpl$updateUiState$1.L$1 = uiStateDelegate;
                        uiStateDelegateImpl$updateUiState$1.L$2 = function1;
                        uiStateDelegateImpl$updateUiState$1.L$3 = mutex;
                        uiStateDelegateImpl$updateUiState$1.label = 1;
                        if (mutex.lock(null, uiStateDelegateImpl$updateUiState$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        uiStateDelegateImpl = this;
                    } else if (i != 1) {
                        if (i == 2) {
                            mutex2 = (Mutex) uiStateDelegateImpl$updateUiState$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Unit unit = Unit.INSTANCE;
                                mutex2.unlock(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th) {
                                th = th;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        function1 = (Function1) uiStateDelegateImpl$updateUiState$1.L$2;
                        uiStateDelegateImpl = (UiStateDelegateImpl) uiStateDelegateImpl$updateUiState$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = (Mutex) uiStateDelegateImpl$updateUiState$1.L$3;
                        uiStateDelegate = (UiStateDelegate) uiStateDelegateImpl$updateUiState$1.L$1;
                    }
                    mutableStateFlow = uiStateDelegateImpl.uiMutableStateFlow;
                    invoke = function1.invoke(uiStateDelegate.getUiState(uiStateDelegate));
                    uiStateDelegateImpl$updateUiState$1.L$0 = mutex;
                    uiStateDelegateImpl$updateUiState$1.L$1 = null;
                    uiStateDelegateImpl$updateUiState$1.L$2 = null;
                    uiStateDelegateImpl$updateUiState$1.L$3 = null;
                    uiStateDelegateImpl$updateUiState$1.label = 2;
                    if (mutableStateFlow.emit(invoke, uiStateDelegateImpl$updateUiState$1) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    mutex2 = mutex;
                    Unit unit2 = Unit.INSTANCE;
                    mutex2.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            mutableStateFlow = uiStateDelegateImpl.uiMutableStateFlow;
            invoke = function1.invoke(uiStateDelegate.getUiState(uiStateDelegate));
            uiStateDelegateImpl$updateUiState$1.L$0 = mutex;
            uiStateDelegateImpl$updateUiState$1.L$1 = null;
            uiStateDelegateImpl$updateUiState$1.L$2 = null;
            uiStateDelegateImpl$updateUiState$1.L$3 = null;
            uiStateDelegateImpl$updateUiState$1.label = 2;
            if (mutableStateFlow.emit(invoke, uiStateDelegateImpl$updateUiState$1) != coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        uiStateDelegateImpl$updateUiState$1 = new UiStateDelegateImpl$updateUiState$1(this, continuation);
        Object obj2 = uiStateDelegateImpl$updateUiState$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = uiStateDelegateImpl$updateUiState$1.label;
        if (i != 0) {
        }
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        Object send = this.singleEventsChannel.send(event, continuation);
        return send == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? send : Unit.INSTANCE;
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState", replaceWith = @ReplaceWith(expression = "asyncUpdateInternalState { }", imports = {}))
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UiStateDelegateImpl$asyncReduce$1(this, action, null), 3, null);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new UiStateDelegateImpl$asyncUpdateUiState$1(uiStateDelegate, transform, null), 3, null);
        return launch$default;
    }
}
