package com.ifriend.presentation.common.uistate;

import androidx.core.app.NotificationCompat;
import com.facebook.internal.NativeProtocol;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
/* compiled from: UiStateDelegate.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J/\u0010\u000f\u001a\u00020\u0010*\u00020\u00112!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u0013H'JC\u0010\u0017\u001a\u00020\u0018*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0019\u001a\u00020\u00112!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u0013H&JD\u0010\u001b\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002!\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00028\u00000\u0013H§@ø\u0001\u0000¢\u0006\u0002\u0010\u001cJ)\u0010\u001d\u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00028\u0001H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001fJD\u0010 \u001a\u00020\u0010*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00028\u00000\u0013H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u001cR\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "UiState", "Event", "", "singleEvents", "Lkotlinx/coroutines/flow/Flow;", "getSingleEvents", "()Lkotlinx/coroutines/flow/Flow;", "uiStateFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getUiStateFlow", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;)Ljava/lang/Object;", "asyncReduce", "", "Lkotlinx/coroutines/CoroutineScope;", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "asyncUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "transform", "reduce", "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendEvent", NotificationCompat.CATEGORY_EVENT, "(Lcom/ifriend/presentation/common/uistate/UiStateDelegate;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUiState", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface UiStateDelegate<UiState, Event> {
    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.asyncUpdateInternalState")
    void asyncReduce(CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> function1);

    Job asyncUpdateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, CoroutineScope coroutineScope, Function1<? super UiState, ? extends UiState> function1);

    Flow<Event> getSingleEvents();

    UiState getUiState(UiStateDelegate<UiState, Event> uiStateDelegate);

    StateFlow<UiState> getUiStateFlow();

    @Deprecated(message = "use method UiStateDelegate<UiState, Event>.updateUiState")
    Object reduce(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation);

    Object sendEvent(UiStateDelegate<UiState, Event> uiStateDelegate, Event event, Continuation<? super Unit> continuation);

    Object updateUiState(UiStateDelegate<UiState, Event> uiStateDelegate, Function1<? super UiState, ? extends UiState> function1, Continuation<? super Unit> continuation);
}
