package com.ifriend.presentation.common.state;

import androidx.exifinterface.media.ExifInterface;
import com.ifriend.presentation.common.uistate.UiStateDelegate;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005J^\u0010\u0006\u001a\u00020\u0007*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\t26\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00000\u000bH&J\u009c\u0002\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0012\"\u0004\b\u0005\u0010\u0013\"\u0004\b\u0006\u0010\u0014*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00162\u009b\u0001\u0010\n\u001a\u0096\u0001\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001d\u0012\u0013\u0012\u0011H\u0014¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\u001aH&ø\u0001\u0000¢\u0006\u0002\u0010!Jó\u0001\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0012\"\u0004\b\u0005\u0010\u0013*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00130\u00162\u0086\u0001\u0010\n\u001a\u0081\u0001\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001c\u0012\u0013\u0012\u0011H\u0013¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0\"H&ø\u0001\u0000¢\u0006\u0002\u0010#JÈ\u0001\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0003\u0010\u0011\"\u0004\b\u0004\u0010\u0012*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00110\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00162p\u0010\n\u001al\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H\u0011¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u0011H\u0012¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0$H&ø\u0001\u0000¢\u0006\u0002\u0010%J\u009f\u0001\u0010\u0010\u001a\u00020\u0007\"\u0004\b\u0003\u0010&*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\u0006\u0010\b\u001a\u00020\t2\f\u0010'\u001a\b\u0012\u0004\u0012\u0002H&0\u00162[\u0010\n\u001aW\b\u0001\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u0011H&¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b()\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f\u0012\u0006\u0012\u0004\u0018\u00010 0(H&ø\u0001\u0000¢\u0006\u0002\u0010*J_\u0010+\u001a\u00020,*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u000026\u0010\n\u001a2\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\u000bH¦@ø\u0001\u0000¢\u0006\u0002\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/ifriend/presentation/common/state/CombinedStateDelegate;", "UiState", "State", "Event", "Lcom/ifriend/presentation/common/uistate/UiStateDelegate;", "Lcom/ifriend/presentation/common/state/InternalStateDelegate;", "collectUpdateUiState", "Lkotlinx/coroutines/Job;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transform", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "state", "uiState", "combineCollectUpdateUiState", "T1", "T2", "T3", "T4", "flow1", "Lkotlinx/coroutines/flow/Flow;", "flow2", "flow3", "flow4", "Lkotlin/Function7;", "value1", "value2", "value3", "value4", "Lkotlin/coroutines/Continuation;", "", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function7;)Lkotlinx/coroutines/Job;", "Lkotlin/Function6;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function6;)Lkotlinx/coroutines/Job;", "Lkotlin/Function5;", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function5;)Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "flow", "Lkotlin/Function4;", "value", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function4;)Lkotlinx/coroutines/Job;", "updateUiState", "", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface CombinedStateDelegate<UiState, State, Event> extends UiStateDelegate<UiState, Event>, InternalStateDelegate<State> {
    Job collectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Function2<? super State, ? super UiState, ? extends UiState> function2);

    <T> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T> flow, Function4<? super State, ? super UiState, ? super T, ? super Continuation<? super UiState>, ? extends Object> function4);

    <T1, T2> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow, Flow<? extends T2> flow2, Function5<? super State, ? super UiState, ? super T1, ? super T2, ? super Continuation<? super UiState>, ? extends Object> function5);

    <T1, T2, T3> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Function6<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super Continuation<? super UiState>, ? extends Object> function6);

    <T1, T2, T3, T4> Job combineCollectUpdateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Function7<? super State, ? super UiState, ? super T1, ? super T2, ? super T3, ? super T4, ? super Continuation<? super UiState>, ? extends Object> function7);

    Object updateUiState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Function2<? super UiState, ? super State, ? extends UiState> function2, Continuation<? super Unit> continuation);
}
