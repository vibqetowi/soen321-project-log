package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.Volatile;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StateFlow.kt */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00010\u00052\b\u0012\u0004\u0012\u0002H\u00010\u0006B\r\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u001f\u0010\u0018\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0003H\u0014J\u001d\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030$2\u0006\u0010%\u001a\u00020\u0011H\u0014¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010)J&\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00112\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020(H\u0016J\u0015\u00102\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00103J\u001a\u00104\u001a\u00020\u001e2\b\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00106\u001a\u00020\bH\u0002R\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bX\u0082\u0004R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/StateFlowSlot;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "initialState", "", "(Ljava/lang/Object;)V", "_state", "Lkotlinx/atomicfu/AtomicRef;", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "sequence", "", "value", "getValue$annotations", "()V", "getValue", "()Ljava/lang/Object;", "setValue", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "createSlot", "createSlotArray", "", "size", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "emit", "", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fuse", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "resetReplayCache", "tryEmit", "(Ljava/lang/Object;)Z", "updateState", "expectedState", "newState", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state");
    @Volatile
    private volatile Object _state;
    private int sequence;

    public static /* synthetic */ void getValue$annotations() {
    }

    public StateFlowImpl(Object obj) {
        this._state = obj;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        T t = (T) _state$FU.get(this);
        if (t == symbol) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        updateState(null, t);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        return updateState(t, t2);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        setValue(t);
        return true;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        setValue(t);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ba, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r11, r12) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:59:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6 A[Catch: all -> 0x0074, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:59:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00dd A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:14:0x003f, B:34:0x00a9, B:36:0x00b1, B:38:0x00b6, B:48:0x00d7, B:50:0x00dd, B:40:0x00bc, B:44:0x00c3, B:19:0x005d, B:22:0x0070, B:33:0x0098), top: B:59:0x0025 }] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00db -> B:34:0x00a9). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00ed -> B:34:0x00a9). Please submit an issue!!! */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        StateFlowImpl$collect$1 stateFlowImpl$collect$1;
        Object coroutine_suspended;
        int i;
        StateFlowImpl<T> stateFlowImpl;
        StateFlowSlot stateFlowSlot;
        FlowCollector flowCollector2;
        Job job;
        Object obj;
        FlowCollector<? super T> flowCollector3;
        StateFlowSlot stateFlowSlot2;
        boolean takePending;
        Object obj2;
        try {
            if (continuation instanceof StateFlowImpl$collect$1) {
                stateFlowImpl$collect$1 = (StateFlowImpl$collect$1) continuation;
                if ((stateFlowImpl$collect$1.label & Integer.MIN_VALUE) != 0) {
                    stateFlowImpl$collect$1.label -= Integer.MIN_VALUE;
                    Object obj3 = stateFlowImpl$collect$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stateFlowImpl$collect$1.label;
                    StateFlowSlot stateFlowSlot3 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj3);
                        StateFlowSlot allocateSlot = allocateSlot();
                        try {
                            if (flowCollector instanceof SubscribedFlowCollector) {
                                stateFlowImpl$collect$1.L$0 = this;
                                stateFlowImpl$collect$1.L$1 = flowCollector;
                                stateFlowImpl$collect$1.L$2 = allocateSlot;
                                stateFlowImpl$collect$1.label = 1;
                                if (((SubscribedFlowCollector) flowCollector).onSubscription(stateFlowImpl$collect$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            stateFlowImpl = this;
                            stateFlowSlot = allocateSlot;
                        } catch (Throwable th) {
                            th = th;
                            stateFlowImpl = this;
                            stateFlowSlot3 = allocateSlot;
                            stateFlowImpl.freeSlot((AbstractSharedFlowSlot) stateFlowSlot3);
                            throw th;
                        }
                    } else if (i == 1) {
                        stateFlowSlot = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        flowCollector = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                    } else if (i == 2) {
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (Job) stateFlowImpl$collect$1.L$3;
                        StateFlowSlot stateFlowSlot4 = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        FlowCollector<? super T> flowCollector4 = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        stateFlowSlot2 = stateFlowSlot4;
                        flowCollector3 = flowCollector4;
                        takePending = stateFlowSlot2.takePending();
                        stateFlowSlot3 = stateFlowSlot2;
                        flowCollector2 = flowCollector3;
                        if (!takePending) {
                        }
                        Object obj4 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj4 == NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj4;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        obj = stateFlowImpl$collect$1.L$4;
                        job = (Job) stateFlowImpl$collect$1.L$3;
                        StateFlowSlot stateFlowSlot5 = (StateFlowSlot) stateFlowImpl$collect$1.L$2;
                        FlowCollector flowCollector5 = (FlowCollector) stateFlowImpl$collect$1.L$1;
                        stateFlowImpl = (StateFlowImpl) stateFlowImpl$collect$1.L$0;
                        ResultKt.throwOnFailure(obj3);
                        stateFlowSlot3 = stateFlowSlot5;
                        flowCollector2 = flowCollector5;
                        Object obj42 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                            JobKt.ensureActive(job);
                        }
                        if (obj != null) {
                            stateFlowSlot2 = stateFlowSlot3;
                            flowCollector3 = flowCollector2;
                        }
                        obj2 = obj42 == NullSurrogateKt.NULL ? null : obj42;
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj42;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = obj42;
                        stateFlowSlot2 = stateFlowSlot3;
                        flowCollector3 = flowCollector2;
                        takePending = stateFlowSlot2.takePending();
                        stateFlowSlot3 = stateFlowSlot2;
                        flowCollector2 = flowCollector3;
                        if (!takePending) {
                            stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                            stateFlowImpl$collect$1.L$1 = flowCollector3;
                            stateFlowImpl$collect$1.L$2 = stateFlowSlot2;
                            stateFlowImpl$collect$1.L$3 = job;
                            stateFlowImpl$collect$1.L$4 = obj;
                            stateFlowImpl$collect$1.label = 3;
                            Object awaitPending = stateFlowSlot2.awaitPending(stateFlowImpl$collect$1);
                            stateFlowSlot3 = stateFlowSlot2;
                            flowCollector2 = flowCollector3;
                            if (awaitPending == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        Object obj422 = _state$FU.get(stateFlowImpl);
                        if (job != null) {
                        }
                        if (obj != null) {
                        }
                        if (obj422 == NullSurrogateKt.NULL) {
                        }
                        stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                        stateFlowImpl$collect$1.L$1 = flowCollector2;
                        stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
                        stateFlowImpl$collect$1.L$3 = job;
                        stateFlowImpl$collect$1.L$4 = obj422;
                        stateFlowImpl$collect$1.label = 2;
                        if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                        }
                    }
                    flowCollector2 = flowCollector;
                    job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key);
                    obj = null;
                    stateFlowSlot3 = stateFlowSlot;
                    Object obj4222 = _state$FU.get(stateFlowImpl);
                    if (job != null) {
                    }
                    if (obj != null) {
                    }
                    if (obj4222 == NullSurrogateKt.NULL) {
                    }
                    stateFlowImpl$collect$1.L$0 = stateFlowImpl;
                    stateFlowImpl$collect$1.L$1 = flowCollector2;
                    stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
                    stateFlowImpl$collect$1.L$3 = job;
                    stateFlowImpl$collect$1.L$4 = obj4222;
                    stateFlowImpl$collect$1.label = 2;
                    if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            flowCollector2 = flowCollector;
            job = (Job) stateFlowImpl$collect$1.getContext().get(Job.Key);
            obj = null;
            stateFlowSlot3 = stateFlowSlot;
            Object obj42222 = _state$FU.get(stateFlowImpl);
            if (job != null) {
            }
            if (obj != null) {
            }
            if (obj42222 == NullSurrogateKt.NULL) {
            }
            stateFlowImpl$collect$1.L$0 = stateFlowImpl;
            stateFlowImpl$collect$1.L$1 = flowCollector2;
            stateFlowImpl$collect$1.L$2 = stateFlowSlot3;
            stateFlowImpl$collect$1.L$3 = job;
            stateFlowImpl$collect$1.L$4 = obj42222;
            stateFlowImpl$collect$1.label = 2;
            if (flowCollector2.emit(obj2, stateFlowImpl$collect$1) == coroutine_suspended) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        stateFlowImpl$collect$1 = new StateFlowImpl$collect$1(this, continuation);
        Object obj32 = stateFlowImpl$collect$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stateFlowImpl$collect$1.label;
        StateFlowSlot stateFlowSlot32 = 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int i) {
        return new StateFlowSlot[i];
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, coroutineContext, i, bufferOverflow);
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i;
        StateFlowSlot[] slots;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.areEqual(obj3, obj)) {
                return false;
            }
            if (Intrinsics.areEqual(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.sequence;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.sequence = i3;
                StateFlowSlot[] slots2 = getSlots();
                Unit unit = Unit.INSTANCE;
                while (true) {
                    StateFlowSlot[] stateFlowSlotArr = slots2;
                    if (stateFlowSlotArr != null) {
                        for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                            if (stateFlowSlot != null) {
                                stateFlowSlot.makePending();
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.sequence;
                        if (i == i3) {
                            this.sequence = i3 + 1;
                            return true;
                        }
                        slots = getSlots();
                        Unit unit2 = Unit.INSTANCE;
                    }
                    slots2 = slots;
                    i3 = i;
                }
            } else {
                this.sequence = i2 + 2;
                return true;
            }
        }
    }
}
