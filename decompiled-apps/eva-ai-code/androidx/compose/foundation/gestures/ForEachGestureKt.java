package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
/* compiled from: ForEachGesture.kt */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u0006H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a>\u0010\b\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u001a>\u0010\u000f\u001a\u00020\u0004*\u00020\u00062'\u0010\t\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"allPointersUp", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "awaitAllPointersUp", "", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitEachGesture", "block", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "forEachGesture", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ForEachGestureKt {
    /* JADX WARN: Can't wrap try/catch for region: R(6:1|(2:3|(4:5|6|7|(1:(4:(1:(1:12)(2:37|38))(2:39|40)|13|14|(3:19|20|(1:22)(6:23|24|(1:26)|13|14|(2:16|17)(0)))(0))(7:41|42|24|(0)|13|14|(0)(0)))(3:43|14|(0)(0))))|45|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        r10 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        r0.L$0 = r2;
        r0.L$1 = r9;
        r0.L$2 = r8;
        r0.label = 3;
        r10 = awaitAllPointersUp((androidx.compose.ui.input.pointer.PointerInputScope) r2, r0);
        r2 = r2;
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00af, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b0, code lost:
        throw r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.compose.ui.input.pointer.PointerInputScope, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0093 -> B:18:0x0054). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00ad -> B:18:0x0054). Please submit an issue!!! */
    @Deprecated(message = "Use awaitEachGesture instead. forEachGesture() can drop events between gestures.", replaceWith = @ReplaceWith(expression = "awaitEachGesture(block)", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object forEachGesture(PointerInputScope pointerInputScope, Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        ForEachGestureKt$forEachGesture$1 forEachGestureKt$forEachGesture$1;
        PointerInputScope pointerInputScope2;
        Object awaitAllPointersUp;
        CoroutineContext coroutineContext;
        PointerInputScope pointerInputScope3;
        CoroutineContext coroutineContext2;
        PointerInputScope pointerInputScope4;
        if (continuation instanceof ForEachGestureKt$forEachGesture$1) {
            forEachGestureKt$forEachGesture$1 = (ForEachGestureKt$forEachGesture$1) continuation;
            if ((forEachGestureKt$forEachGesture$1.label & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$forEachGesture$1.label -= Integer.MIN_VALUE;
                Object obj = forEachGestureKt$forEachGesture$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                pointerInputScope2 = forEachGestureKt$forEachGesture$1.label;
                if (pointerInputScope2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    coroutineContext = forEachGestureKt$forEachGesture$1.getContext();
                    pointerInputScope3 = pointerInputScope;
                    if (JobKt.isActive(coroutineContext)) {
                    }
                } else if (pointerInputScope2 != 1) {
                    if (pointerInputScope2 == 2) {
                        CoroutineContext coroutineContext3 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                        function2 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                        PointerInputScope pointerInputScope5 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pointerInputScope4 = pointerInputScope5;
                        coroutineContext2 = coroutineContext3;
                    } else if (pointerInputScope2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        function2 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                        ResultKt.throwOnFailure(obj);
                        pointerInputScope4 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                        coroutineContext2 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope3 = pointerInputScope4;
                    if (JobKt.isActive(coroutineContext)) {
                        try {
                        } catch (CancellationException e) {
                            pointerInputScope2 = pointerInputScope3;
                            pointerInputScope = coroutineContext;
                            e = e;
                            if (!JobKt.isActive(pointerInputScope)) {
                            }
                        }
                        forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope3;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = coroutineContext;
                        forEachGestureKt$forEachGesture$1.label = 1;
                        if (function2.invoke(pointerInputScope3, forEachGestureKt$forEachGesture$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pointerInputScope2 = pointerInputScope3;
                        pointerInputScope = coroutineContext;
                        forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope2;
                        forEachGestureKt$forEachGesture$1.L$1 = function2;
                        forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                        forEachGestureKt$forEachGesture$1.label = 2;
                        awaitAllPointersUp = awaitAllPointersUp((PointerInputScope) pointerInputScope2, forEachGestureKt$forEachGesture$1);
                        pointerInputScope4 = pointerInputScope2;
                        coroutineContext2 = pointerInputScope;
                        if (awaitAllPointersUp == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        coroutineContext = coroutineContext2;
                        pointerInputScope3 = pointerInputScope4;
                        if (JobKt.isActive(coroutineContext)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    CoroutineContext coroutineContext4 = (CoroutineContext) forEachGestureKt$forEachGesture$1.L$2;
                    function2 = (Function2) forEachGestureKt$forEachGesture$1.L$1;
                    PointerInputScope pointerInputScope6 = (PointerInputScope) forEachGestureKt$forEachGesture$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputScope2 = pointerInputScope6;
                    pointerInputScope = coroutineContext4;
                    forEachGestureKt$forEachGesture$1.L$0 = pointerInputScope2;
                    forEachGestureKt$forEachGesture$1.L$1 = function2;
                    forEachGestureKt$forEachGesture$1.L$2 = pointerInputScope;
                    forEachGestureKt$forEachGesture$1.label = 2;
                    awaitAllPointersUp = awaitAllPointersUp((PointerInputScope) pointerInputScope2, forEachGestureKt$forEachGesture$1);
                    pointerInputScope4 = pointerInputScope2;
                    coroutineContext2 = pointerInputScope;
                    if (awaitAllPointersUp == coroutine_suspended) {
                    }
                    coroutineContext = coroutineContext2;
                    pointerInputScope3 = pointerInputScope4;
                    if (JobKt.isActive(coroutineContext)) {
                    }
                }
            }
        }
        forEachGestureKt$forEachGesture$1 = new ForEachGestureKt$forEachGesture$1(continuation);
        Object obj2 = forEachGestureKt$forEachGesture$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        pointerInputScope2 = forEachGestureKt$forEachGesture$1.label;
        if (pointerInputScope2 != 0) {
        }
    }

    public static final boolean allPointersUp(AwaitPointerEventScope awaitPointerEventScope) {
        Intrinsics.checkNotNullParameter(awaitPointerEventScope, "<this>");
        List<PointerInputChange> changes = awaitPointerEventScope.getCurrentEvent().getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            } else if (changes.get(i).getPressed()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        return !z;
    }

    public static final Object awaitAllPointersUp(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitAllPointersUp$2(null), continuation);
        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
        if (allPointersUp(r7) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
        r8 = androidx.compose.ui.input.pointer.PointerEventPass.Final;
        r0.L$0 = r7;
        r0.label = 1;
        r8 = r7.awaitPointerEvent(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r8 != r1) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0070, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004a -> B:19:0x004d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAllPointersUp(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        ForEachGestureKt$awaitAllPointersUp$3 forEachGestureKt$awaitAllPointersUp$3;
        int i;
        if (continuation instanceof ForEachGestureKt$awaitAllPointersUp$3) {
            forEachGestureKt$awaitAllPointersUp$3 = (ForEachGestureKt$awaitAllPointersUp$3) continuation;
            if ((forEachGestureKt$awaitAllPointersUp$3.label & Integer.MIN_VALUE) != 0) {
                forEachGestureKt$awaitAllPointersUp$3.label -= Integer.MIN_VALUE;
                Object obj = forEachGestureKt$awaitAllPointersUp$3.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = forEachGestureKt$awaitAllPointersUp$3.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    awaitPointerEventScope = (AwaitPointerEventScope) forEachGestureKt$awaitAllPointersUp$3.L$0;
                    ResultKt.throwOnFailure(obj);
                    List<PointerInputChange> changes = ((PointerEvent) obj).getChanges();
                    int size = changes.size();
                    boolean z = false;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (changes.get(i2).getPressed()) {
                            z = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        forEachGestureKt$awaitAllPointersUp$3 = new ForEachGestureKt$awaitAllPointersUp$3(continuation);
        Object obj2 = forEachGestureKt$awaitAllPointersUp$3.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = forEachGestureKt$awaitAllPointersUp$3.label;
        if (i != 0) {
        }
    }

    public static final Object awaitEachGesture(PointerInputScope pointerInputScope, Function2<? super AwaitPointerEventScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object awaitPointerEventScope = pointerInputScope.awaitPointerEventScope(new ForEachGestureKt$awaitEachGesture$2(continuation.getContext(), function2, null), continuation);
        return awaitPointerEventScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? awaitPointerEventScope : Unit.INSTANCE;
    }
}
