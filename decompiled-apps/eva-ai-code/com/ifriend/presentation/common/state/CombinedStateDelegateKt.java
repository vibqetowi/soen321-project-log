package com.ifriend.presentation.common.state;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
/* compiled from: CombinedStateDelegate.kt */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00052!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0004\u0012\u0002H\u00030\bR\u00020\u0006¢\u0006\u0002\u0010\f\u001a{\u0010\r\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132$\b\u0004\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"asyncUpdateInternalState", "Lkotlinx/coroutines/Job;", "UiState", "State", "Event", "Lcom/ifriend/presentation/common/state/CombinedStateDelegate;", "Landroidx/lifecycle/ViewModel;", "transform", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/lifecycle/ViewModel;Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "collectInternalState", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", TtmlNode.START, "Lkotlinx/coroutines/CoroutineStart;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lcom/ifriend/presentation/common/state/CombinedStateDelegate;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CombinedStateDelegateKt {
    public static /* synthetic */ Job collectInternalState$default(CombinedStateDelegate combinedStateDelegate, CoroutineScope coroutineScope, CoroutineContext context, CoroutineStart start, Function2 collector, int i, Object obj) {
        if ((i & 2) != 0) {
            context = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 4) != 0) {
            start = CoroutineStart.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(collector, "collector");
        return BuildersKt.launch(coroutineScope, context, start, new CombinedStateDelegateKt$collectInternalState$1(combinedStateDelegate, coroutineScope, start, collector, null));
    }

    public static final <UiState, State, Event> Job collectInternalState(CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, CoroutineScope coroutineScope, CoroutineContext context, CoroutineStart start, Function2<? super State, ? super Continuation<? super Unit>, ? extends Object> collector) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(collector, "collector");
        return BuildersKt.launch(coroutineScope, context, start, new CombinedStateDelegateKt$collectInternalState$1(combinedStateDelegate, coroutineScope, start, collector, null));
    }

    public static final <UiState, State, Event> Job asyncUpdateInternalState(ViewModel context_receiver_0, CombinedStateDelegate<UiState, State, Event> combinedStateDelegate, Function1<? super State, ? extends State> transform) {
        Intrinsics.checkNotNullParameter(combinedStateDelegate, "<this>");
        Intrinsics.checkNotNullParameter(context_receiver_0, "$context_receiver_0");
        Intrinsics.checkNotNullParameter(transform, "transform");
        return combinedStateDelegate.asyncUpdateInternalState(combinedStateDelegate, ViewModelKt.getViewModelScope(context_receiver_0), transform);
    }
}
