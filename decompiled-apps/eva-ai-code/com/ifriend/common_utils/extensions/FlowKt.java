package com.ifriend.common_utils.extensions;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
/* compiled from: flow.kt */
@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\u001ac\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2$\b\u0004\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001an\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032$\b\u0002\u0010\u0011\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b2\"\u0010\u0013\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"collectIn", "Lkotlinx/coroutines/Job;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/flow/Flow;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", TtmlNode.START, "Lkotlinx/coroutines/CoroutineStart;", "collector", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "onEachSafe", "error", "", NativeProtocol.WEB_DIALOG_ACTION, "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "common_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FlowKt {
    public static /* synthetic */ Job collectIn$default(Flow flow, CoroutineScope coroutineScope, CoroutineContext context, CoroutineStart start, Function2 collector, int i, Object obj) {
        if ((i & 2) != 0) {
            context = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 4) != 0) {
            start = CoroutineStart.DEFAULT;
        }
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(collector, "collector");
        return BuildersKt.launch(coroutineScope, context, start, new FlowKt$collectIn$1(flow, collector, null));
    }

    public static final <T> Job collectIn(Flow<? extends T> flow, CoroutineScope coroutineScope, CoroutineContext context, CoroutineStart start, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> collector) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(collector, "collector");
        return BuildersKt.launch(coroutineScope, context, start, new FlowKt$collectIn$1(flow, collector, null));
    }

    public static /* synthetic */ Flow onEachSafe$default(Flow flow, Function2 function2, Function2 function22, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = new FlowKt$onEachSafe$1(null);
        }
        return onEachSafe(flow, function2, function22);
    }

    public static final <T> Flow<T> onEachSafe(Flow<? extends T> flow, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> error, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> action) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(error, "error");
        Intrinsics.checkNotNullParameter(action, "action");
        return kotlinx.coroutines.flow.FlowKt.flow(new FlowKt$onEachSafe$$inlined$transform$1(flow, null, action, error));
    }
}
