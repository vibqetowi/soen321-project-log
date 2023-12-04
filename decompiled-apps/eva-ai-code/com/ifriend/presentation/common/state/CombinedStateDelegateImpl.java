package com.ifriend.presentation.common.state;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import com.ifriend.presentation.common.uistate.UiStateDelegateImpl;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\b\u0012\u0004\u0012\u0002H\u00020\u0006B)\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ0\u0010\u001f\u001a\u00020 *\u00020!2!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00000#H\u0097\u0001J>\u0010'\u001a\u00020(*\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010)\u001a\u00020!2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00010#H\u0096\u0001JD\u0010+\u001a\u00020(*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010)\u001a\u00020!2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00000#H\u0096\u0001J^\u0010,\u001a\u00020(*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010)\u001a\u00020!26\u0010*\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00000-H\u0016J\u009c\u0002\u0010.\u001a\u00020(\"\u0004\b\u0003\u0010/\"\u0004\b\u0004\u00100\"\u0004\b\u0005\u00101\"\u0004\b\u0006\u00102*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010)\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H/0\u000f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u000f2\f\u00105\u001a\b\u0012\u0004\u0012\u0002H10\u000f2\f\u00106\u001a\b\u0012\u0004\u0012\u0002H20\u000f2\u009b\u0001\u0010*\u001a\u0096\u0001\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011H0¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H1¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(:\u0012\u0013\u0012\u0011H2¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010=07H\u0016ø\u0001\u0000¢\u0006\u0002\u0010>Jó\u0001\u0010.\u001a\u00020(\"\u0004\b\u0003\u0010/\"\u0004\b\u0004\u00100\"\u0004\b\u0005\u00101*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010)\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H/0\u000f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u000f2\f\u00105\u001a\b\u0012\u0004\u0012\u0002H10\u000f2\u0086\u0001\u0010*\u001a\u0081\u0001\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011H0¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H1¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(:\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010=0?H\u0016ø\u0001\u0000¢\u0006\u0002\u0010@JÈ\u0001\u0010.\u001a\u00020(\"\u0004\b\u0003\u0010/\"\u0004\b\u0004\u00100*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010)\u001a\u00020!2\f\u00103\u001a\b\u0012\u0004\u0012\u0002H/0\u000f2\f\u00104\u001a\b\u0012\u0004\u0012\u0002H00\u000f2p\u0010*\u001al\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H/¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011H0¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(9\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010=0AH\u0016ø\u0001\u0000¢\u0006\u0002\u0010BJ\u009f\u0001\u0010.\u001a\u00020(\"\u0004\b\u0003\u0010C*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00042\u0006\u0010)\u001a\u00020!2\f\u0010D\u001a\b\u0012\u0004\u0012\u0002HC0\u000f2[\u0010*\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011HC¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(F\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010=0EH\u0016ø\u0001\u0000¢\u0006\u0002\u0010GJD\u0010H\u001a\u00020 *\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00052!\u0010\"\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00000#H\u0097Aø\u0001\u0000¢\u0006\u0002\u0010IJ)\u0010J\u001a\u00020 *\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00052\u0006\u0010K\u001a\u00028\u0002H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010LJ>\u0010M\u001a\u00020 *\b\u0012\u0004\u0012\u00028\u00010\u00062!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00010#H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010NJ_\u0010O\u001a\u00020 *\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000426\u0010*\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0004\u0012\u00028\u00000-H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010PJD\u0010O\u001a\u00020 *\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u00052!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00028\u00000#H\u0096Aø\u0001\u0000¢\u0006\u0002\u0010IR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000fX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u00028\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013*\b\u0012\u0004\u0012\u00028\u00010\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00020\u0005X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/ifriend/presentation/common/state/CombinedStateDelegateImpl;", "UiState", "State", "Event", "Lcom/ifriend/presentation/common/state/CombinedStateDelegate;", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "initialUiState", "initialState", "singleLiveEventCapacity", "", "mutexState", "Lkotlinx/coroutines/sync/Mutex;", "(Ljava/lang/Object;Ljava/lang/Object;ILkotlinx/coroutines/sync/Mutex;)V", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "internalState", "getInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Ljava/lang/Object;", "internalStateFlow", "getInternalStateFlow", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;)Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Ljava/lang/Object;", "asyncReduce", "", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "asyncUpdateUiState", "collectUpdateUiState", "Lkotlin/Function2;", "combineCollectUpdateUiState", "T1", "T2", "T3", "T4", "flow1", "flow2", "flow3", "flow4", "Lkotlin/Function7;", "value1", "value2", "value3", "value4", "Lkotlin/coroutines/Continuation;", "", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/Job;", "Lkotlin/Function6;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/Job;", "Lkotlin/Function5;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "flow", "Lkotlin/Function4;", "value", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/Job;", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateInternalState", "(Lcom/ifriend/presentation/common/state/InternalStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CombinedStateDelegateImpl<UiState, State, Event> implements CombinedStateDelegate<UiState, State, Event>, UiStateDelegate<UiState, Event>, InternalStateDelegate<State> {
    public static final int $stable = 8;
    private final /* synthetic */ UiStateDelegateImpl<UiState, Event> $$delegate_0;
    private final /* synthetic */ InternalStateDelegateImpl<State> $$delegate_1;
    private final Mutex mutexState;

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    public void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> action) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        this.$$delegate_0.asyncReduce(coroutineScope, action);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Job asyncUpdateInternalState(InternalStateDelegate<State> internalStateDelegate, CoroutineScope coroutineScope, Function1<? super State, ? extends State> transform) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_1.asyncUpdateInternalState(internalStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return this.$$delegate_0.asyncUpdateUiState(uiStateDelegate, coroutineScope, transform);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public State getInternalState(InternalStateDelegate<State> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_1.getInternalState(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public StateFlow<State> getInternalStateFlow(InternalStateDelegate<State> internalStateDelegate) {
        Intrinsics.checkNotNullParameter(internalStateDelegate, "<this>");
        return this.$$delegate_1.getInternalStateFlow(internalStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Flow<Event> getSingleEvents() {
        return this.$$delegate_0.getSingleEvents();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate) {
        Intrinsics.checkNotNullParameter(uiStateDelegate, "<this>");
        return this.$$delegate_0.getUiState(uiStateDelegate);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public StateFlow<UiState> getUiStateFlow() {
        return this.$$delegate_0.getUiStateFlow();
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    public Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.reduce(uiStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.sendEvent(uiStateDelegate, event, continuation);
    }

    @Override // com.ifriend.presentation.common.state.InternalStateDelegate
    public Object updateInternalState(InternalStateDelegate<State> internalStateDelegate, Function1<? super State, ? extends State> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_1.updateInternalState(internalStateDelegate, function1, continuation);
    }

    @Override // com.ifriend.presentation.common.uistate.UiStateDelegate
    public Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation) {
        return this.$$delegate_0.updateUiState(uiStateDelegate, function1, continuation);
    }

    public CombinedStateDelegateImpl(UiState uistate, State state, int i, Mutex mutexState) {
        Intrinsics.checkNotNullParameter(mutexState, "mutexState");
        this.mutexState = mutexState;
        this.$$delegate_0 = new UiStateDelegateImpl<>(uistate, i, mutexState);
        this.$$delegate_1 = new InternalStateDelegateImpl<>(mutexState, state);
    }

    public /* synthetic */ CombinedStateDelegateImpl(Object obj, Object obj2, int i, Mutex mutex, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? MutexKt.Mutex$default(false, 1, null) : mutex);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public Object updateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Function2<? super UiState, ? super State, ? extends UiState> function2, Continuation<? super Unit> continuation) {
        Object updateUiState = combinedStateDelegate.updateUiState(combinedStateDelegate, new CombinedStateDelegateImpl$updateUiState$3(function2, combinedStateDelegate), continuation);
        return updateUiState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateUiState : Unit.INSTANCE;
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public Job collectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Function2<? super State, ? super UiState, ? extends UiState> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.launchIn(FlowKt.onEach(combinedStateDelegate.getInternalStateFlow(combinedStateDelegate), new CombinedStateDelegateImpl$collectUpdateUiState$1(combinedStateDelegate, transform, null)), coroutineScope);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T> flow, Function4<? super State, ? super UiState, ? super T, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.flowCombine(combinedStateDelegate.getInternalStateFlow(combinedStateDelegate), flow, new CombinedStateDelegateImpl$combineCollectUpdateUiState$1(transform, combinedStateDelegate, null)), new CombinedStateDelegateImpl$combineCollectUpdateUiState$2(combinedStateDelegate, null)), coroutineScope);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Function5<? super State, ? super UiState, ? super T1, ? super T2, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(combinedStateDelegate.getInternalStateFlow(combinedStateDelegate), flow1, flow2, new CombinedStateDelegateImpl$combineCollectUpdateUiState$3(transform, combinedStateDelegate, null)), new CombinedStateDelegateImpl$combineCollectUpdateUiState$4(combinedStateDelegate, null)), coroutineScope);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2, T3> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function6<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(combinedStateDelegate.getInternalStateFlow(combinedStateDelegate), flow1, flow2, flow3, new CombinedStateDelegateImpl$combineCollectUpdateUiState$5(transform, combinedStateDelegate, null)), new CombinedStateDelegateImpl$combineCollectUpdateUiState$6(combinedStateDelegate, null)), coroutineScope);
    }

    @Override // com.ifriend.presentation.common.state.CombinedStateDelegate
    public <T1, T2, T3, T4> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow1, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function7<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super UiState>, ? extends Object> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(flow1, "flow1");
        Intrinsics.checkNotNullParameter(flow2, "flow2");
        Intrinsics.checkNotNullParameter(flow3, "flow3");
        Intrinsics.checkNotNullParameter(flow4, "flow4");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return FlowKt.launchIn(FlowKt.onEach(FlowKt.combine(combinedStateDelegate.getInternalStateFlow(combinedStateDelegate), flow1, flow2, flow3, flow4, new CombinedStateDelegateImpl$combineCollectUpdateUiState$7(transform, combinedStateDelegate, null)), new CombinedStateDelegateImpl$combineCollectUpdateUiState$8(combinedStateDelegate, null)), coroutineScope);
    }
}
