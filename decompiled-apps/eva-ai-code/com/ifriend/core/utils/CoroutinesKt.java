package com.ifriend.core.utils;

import androidx.exifinterface.media.ExifInterface;
import com.facebook.internal.NativeProtocol;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
/* compiled from: coroutines.kt */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001aJ\u0010\f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001az\u0010\f\u001a\u00020\u0001*\u00020\u000223\b\u0002\u0010\u0012\u001a-\b\u0001\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00182'\u0010\u0019\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013¢\u0006\u0002\b\u001aø\u0001\u0000¢\u0006\u0002\u0010\u001b\u001a4\u0010\u001c\u001a\u00020\t\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u0002H\r0\u001d2\u0006\u0010\u001e\u001a\u00020\u00022\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\t0\u0007\u001aM\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\r*\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u00072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\r0\b\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"launchPeriodAsync", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;", "repeatDelayMillis", "", "startDelayMillis", NativeProtocol.WEB_DIALOG_ACTION, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/CoroutineScope;JJLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "safeLaunch", ExifInterface.GPS_DIRECTION_TRUE, "handleError", "", "coroutine", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/Job;", "errorHandler", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "throwable", "context", "Lkotlin/coroutines/CoroutineContext;", "launchBody", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "safeLaunchIn", "Lkotlinx/coroutines/flow/Flow;", "scope", "supervisorSafeLaunch", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CoroutinesKt {
    public static /* synthetic */ Job safeLaunch$default(CoroutineScope coroutineScope, Function2 function2, CoroutineContext coroutineContext, Function2 function22, int i, Object obj) {
        if ((i & 1) != 0) {
            function2 = new CoroutinesKt$safeLaunch$2(null);
        }
        if ((i & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return safeLaunch(coroutineScope, function2, coroutineContext, function22);
    }

    public static final <T> void safeLaunchIn(Flow<? extends T> flow, CoroutineScope scope, Function1<? super Throwable, Unit> handleError) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        FlowKt.launchIn(FlowKt.m8846catch(flow, new CoroutinesKt$safeLaunchIn$1(handleError, null)), scope);
    }

    public static final Job launchPeriodAsync(CoroutineScope coroutineScope, long j, long j2, Function1<? super Continuation<? super Unit>, ? extends Object> action) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CoroutinesKt$launchPeriodAsync$1(j2, j, action, null), 3, null);
        return launch$default;
    }

    public static final <T> Object supervisorSafeLaunch(CoroutineScope coroutineScope, Function1<? super Throwable, Unit> function1, Function1<? super Continuation<? super T>, ? extends Object> function12, Continuation<? super Job> continuation) {
        return SupervisorKt.supervisorScope(new CoroutinesKt$supervisorSafeLaunch$2(new CoroutinesKt$supervisorSafeLaunch$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, function1), function12, null), continuation);
    }

    public static final <T> Job safeLaunch(CoroutineScope coroutineScope, Function1<? super Throwable, Unit> handleError, Function1<? super Continuation<? super T>, ? extends Object> coroutine) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(handleError, "handleError");
        Intrinsics.checkNotNullParameter(coroutine, "coroutine");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, new CoroutinesKt$safeLaunch$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, handleError), null, new CoroutinesKt$safeLaunch$1(coroutine, null), 2, null);
        return launch$default;
    }

    public static final Job safeLaunch(CoroutineScope coroutineScope, Function2<? super Throwable, ? super Continuation<? super Unit>, ? extends Object> errorHandler, CoroutineContext context, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> launchBody) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(errorHandler, "errorHandler");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(launchBody, "launchBody");
        launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, context.plus(new CoroutinesKt$safeLaunch$$inlined$CoroutineExceptionHandler$2(CoroutineExceptionHandler.Key, coroutineScope, errorHandler)), null, new CoroutinesKt$safeLaunch$4(launchBody), 2, null);
        return launch$default;
    }
}
