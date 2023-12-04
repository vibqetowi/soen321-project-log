package androidx.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
/* compiled from: FullyDrawnReporter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FullyDrawnReporterKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r4v4, types: [kotlin.Unit, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object reportWhenComplete(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        FullyDrawnReporterKt$reportWhenComplete$1 fullyDrawnReporterKt$reportWhenComplete$1;
        int i;
        FullyDrawnReporter fullyDrawnReporter2;
        try {
            if (continuation instanceof FullyDrawnReporterKt$reportWhenComplete$1) {
                fullyDrawnReporterKt$reportWhenComplete$1 = (FullyDrawnReporterKt$reportWhenComplete$1) continuation;
                if ((fullyDrawnReporterKt$reportWhenComplete$1.label & Integer.MIN_VALUE) != 0) {
                    fullyDrawnReporterKt$reportWhenComplete$1.label -= Integer.MIN_VALUE;
                    Object obj = fullyDrawnReporterKt$reportWhenComplete$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = fullyDrawnReporterKt$reportWhenComplete$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter.addReporter();
                        if (fullyDrawnReporter.isFullyDrawnReported()) {
                            return Unit.INSTANCE;
                        }
                        fullyDrawnReporterKt$reportWhenComplete$1.L$0 = fullyDrawnReporter;
                        fullyDrawnReporterKt$reportWhenComplete$1.label = 1;
                        fullyDrawnReporter2 = fullyDrawnReporter;
                        if (function1.invoke(fullyDrawnReporterKt$reportWhenComplete$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        FullyDrawnReporter fullyDrawnReporter3 = (FullyDrawnReporter) fullyDrawnReporterKt$reportWhenComplete$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        fullyDrawnReporter2 = fullyDrawnReporter3;
                    }
                    InlineMarker.finallyStart(1);
                    fullyDrawnReporter2.removeReporter();
                    InlineMarker.finallyEnd(1);
                    fullyDrawnReporter = Unit.INSTANCE;
                    return fullyDrawnReporter;
                }
            }
            if (i != 0) {
            }
            InlineMarker.finallyStart(1);
            fullyDrawnReporter2.removeReporter();
            InlineMarker.finallyEnd(1);
            fullyDrawnReporter = Unit.INSTANCE;
            return fullyDrawnReporter;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            throw th;
        }
        fullyDrawnReporterKt$reportWhenComplete$1 = new FullyDrawnReporterKt$reportWhenComplete$1(continuation);
        Object obj2 = fullyDrawnReporterKt$reportWhenComplete$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fullyDrawnReporterKt$reportWhenComplete$1.label;
    }

    private static final Object reportWhenComplete$$forInline(FullyDrawnReporter fullyDrawnReporter, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super Unit> continuation) {
        fullyDrawnReporter.addReporter();
        if (fullyDrawnReporter.isFullyDrawnReported()) {
            return Unit.INSTANCE;
        }
        try {
            function1.invoke(continuation);
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            throw th;
        }
    }
}
