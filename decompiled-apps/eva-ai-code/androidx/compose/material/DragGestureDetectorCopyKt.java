package androidx.compose.material;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: DragGestureDetectorCopy.kt */
@Metadata(d1 = {"\u0000Z\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ag\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f26\u0010\r\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00130\u000eH\u0080@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a]\u0010\u0016\u001a\u0004\u0018\u00010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00130\u000e2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00050\u0018H\u0082Hø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00020\u001e2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a!\u0010!\u001a\u00020\u0005*\u00020\"2\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0013\u0010\u0000\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u0013\u0010\u0003\u001a\u00020\u0001X\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"defaultTouchSlop", "Landroidx/compose/ui/unit/Dp;", "F", "mouseSlop", "mouseToTouchSlopRatio", "", "awaitHorizontalPointerSlopOrCancellation", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerType", "Landroidx/compose/ui/input/pointer/PointerType;", "onPointerSlopReached", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "change", "overSlop", "", "awaitHorizontalPointerSlopOrCancellation-gDDlDlE", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitPointerSlopOrCancellation", "getDragDirectionValue", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "awaitPointerSlopOrCancellation-pn7EDYM", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isPointerUp", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "isPointerUp-DmW0f2w", "(Landroidx/compose/ui/input/pointer/PointerEvent;J)Z", "pointerSlop", "Landroidx/compose/ui/platform/ViewConfiguration;", "pointerSlop-E8SPZFQ", "(Landroidx/compose/ui/platform/ViewConfiguration;I)F", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DragGestureDetectorCopyKt {
    private static final float defaultTouchSlop;
    private static final float mouseSlop;
    private static final float mouseToTouchSlopRatio;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x011d -> B:57:0x0169). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x015c -> B:53:0x015f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0183 -> B:57:0x0169). Please submit an issue!!! */
    /* renamed from: awaitHorizontalPointerSlopOrCancellation-gDDlDlE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1345awaitHorizontalPointerSlopOrCancellationgDDlDlE(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Continuation<? super PointerInputChange> continuation) {
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
        int i2;
        AwaitPointerEventScope awaitPointerEventScope2;
        Function2<? super PointerInputChange, ? super Float, Unit> function22;
        Ref.LongRef longRef;
        Object obj;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
        float f;
        float f2;
        Ref.LongRef longRef2;
        Object obj2;
        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
        float f3;
        float f4;
        int size;
        int i3;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        PointerInputChange pointerInputChange3;
        Object awaitPointerEvent$default;
        if (continuation instanceof DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) {
            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = (DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1) continuation;
            if ((dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label & Integer.MIN_VALUE) != 0) {
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label -= Integer.MIN_VALUE;
                Object obj3 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
                int i4 = 1;
                PointerEventPass pointerEventPass = null;
                if (i2 == 0) {
                    if (i2 == 1) {
                        float f5 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f6 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        ResultKt.throwOnFailure(obj3);
                        DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f4 = f5;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        obj2 = coroutine_suspended;
                        f3 = f6;
                        function22 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        longRef2 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$14;
                        PointerEvent pointerEvent = (PointerEvent) obj3;
                        List<PointerInputChange> changes = pointerEvent.getChanges();
                        size = changes.size();
                        int i5 = 0;
                        i3 = 0;
                        while (true) {
                            if (i3 < size) {
                            }
                            i3++;
                        }
                        Intrinsics.checkNotNull(pointerInputChange);
                        pointerInputChange2 = pointerInputChange;
                        if (!pointerInputChange2.isConsumed()) {
                        }
                        return null;
                    } else if (i2 == 2) {
                        float f7 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$1;
                        float f8 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.F$0;
                        PointerInputChange pointerInputChange4 = (PointerInputChange) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$3;
                        ResultKt.throwOnFailure(obj3);
                        f2 = f7;
                        awaitPointerEventScope2 = (AwaitPointerEventScope) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$1;
                        longRef2 = (Ref.LongRef) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$2;
                        obj2 = coroutine_suspended;
                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                        f = f8;
                        function22 = (Function2) dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.L$0;
                        if (!pointerInputChange4.isConsumed()) {
                            obj = obj2;
                            longRef = longRef2;
                            i4 = 1;
                            pointerEventPass = null;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                            awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                            if (awaitPointerEvent$default == obj) {
                                return obj;
                            }
                            float f9 = f;
                            f4 = f2;
                            obj3 = awaitPointerEvent$default;
                            longRef2 = longRef;
                            obj2 = obj;
                            dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12;
                            f3 = f9;
                            PointerEvent pointerEvent2 = (PointerEvent) obj3;
                            List<PointerInputChange> changes2 = pointerEvent2.getChanges();
                            size = changes2.size();
                            int i52 = 0;
                            i3 = 0;
                            while (true) {
                                if (i3 < size) {
                                    pointerInputChange = null;
                                    break;
                                }
                                pointerInputChange = changes2.get(i3);
                                if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef2.element)) {
                                    break;
                                }
                                i3++;
                            }
                            Intrinsics.checkNotNull(pointerInputChange);
                            pointerInputChange2 = pointerInputChange;
                            if (!pointerInputChange2.isConsumed()) {
                                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange2)) {
                                    List<PointerInputChange> changes3 = pointerEvent2.getChanges();
                                    int size2 = changes3.size();
                                    while (true) {
                                        if (i52 >= size2) {
                                            pointerInputChange3 = null;
                                            break;
                                        }
                                        pointerInputChange3 = changes3.get(i52);
                                        if (pointerInputChange3.getPressed()) {
                                            break;
                                        }
                                        i52++;
                                    }
                                    PointerInputChange pointerInputChange5 = pointerInputChange3;
                                    if (pointerInputChange5 != null) {
                                        longRef2.element = pointerInputChange5.m4425getIdJ3iCeTQ();
                                        f2 = f4;
                                        f = f3;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                        obj = obj2;
                                        longRef = longRef2;
                                    }
                                } else {
                                    f2 = (Offset.m3018getXimpl(pointerInputChange2.m4426getPositionF1C5BW0()) - Offset.m3018getXimpl(pointerInputChange2.m4427getPreviousPositionF1C5BW0())) + f4;
                                    if (Math.abs(f2) < f3) {
                                        PointerEventPass pointerEventPass2 = PointerEventPass.Final;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$0 = function22;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$1 = awaitPointerEventScope2;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$2 = longRef2;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.L$3 = pointerInputChange2;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$0 = f3;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.F$1 = f2;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13.label = 2;
                                        if (awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13) == obj2) {
                                            return obj2;
                                        }
                                        f = f3;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                        pointerInputChange4 = pointerInputChange2;
                                        if (!pointerInputChange4.isConsumed()) {
                                        }
                                    } else {
                                        function22.invoke(pointerInputChange2, Boxing.boxFloat(f2 - (Math.signum(f2) * f3)));
                                        if (pointerInputChange2.isConsumed()) {
                                            return pointerInputChange2;
                                        }
                                        f = f3;
                                        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$13;
                                        obj = obj2;
                                        longRef = longRef2;
                                        f2 = 0.0f;
                                    }
                                }
                                i4 = 1;
                                pointerEventPass = null;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                                if (awaitPointerEvent$default == obj) {
                                }
                            }
                        }
                        return null;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                ResultKt.throwOnFailure(obj3);
                if (m1347isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
                    return null;
                }
                float m1348pointerSlopE8SPZFQ = m1348pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
                Ref.LongRef longRef3 = new Ref.LongRef();
                longRef3.element = j;
                awaitPointerEventScope2 = awaitPointerEventScope;
                function22 = function2;
                longRef = longRef3;
                obj = coroutine_suspended;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1;
                f = m1348pointerSlopE8SPZFQ;
                f2 = 0.0f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$0 = function22;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$1 = awaitPointerEventScope2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$2 = longRef;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.L$3 = pointerEventPass;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$0 = f;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.F$1 = f2;
                dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12.label = i4;
                awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, pointerEventPass, dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$12, i4, pointerEventPass);
                if (awaitPointerEvent$default == obj) {
                }
            }
        }
        dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 = new DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(continuation);
        Object obj32 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = dragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1.label;
        int i42 = 1;
        PointerEventPass pointerEventPass3 = null;
        if (i2 == 0) {
        }
    }

    /* renamed from: awaitPointerSlopOrCancellation-pn7EDYM  reason: not valid java name */
    private static final Object m1346awaitPointerSlopOrCancellationpn7EDYM(AwaitPointerEventScope awaitPointerEventScope, long j, int i, Function2<? super PointerInputChange, ? super Float, Unit> function2, Function1<? super Offset, Float> function1, Continuation<? super PointerInputChange> continuation) {
        float f;
        PointerInputChange pointerInputChange;
        PointerInputChange pointerInputChange2;
        if (m1347isPointerUpDmW0f2w(awaitPointerEventScope.getCurrentEvent(), j)) {
            return null;
        }
        float m1348pointerSlopE8SPZFQ = m1348pointerSlopE8SPZFQ(awaitPointerEventScope.getViewConfiguration(), i);
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.element = j;
        float f2 = 0.0f;
        while (true) {
            InlineMarker.mark(0);
            Object awaitPointerEvent$default = AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope, null, continuation, 1, null);
            InlineMarker.mark(1);
            PointerEvent pointerEvent = (PointerEvent) awaitPointerEvent$default;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            int size = changes.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    f = f2;
                    pointerInputChange = null;
                    break;
                }
                pointerInputChange = changes.get(i2);
                f = f2;
                if (Boolean.valueOf(PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), longRef.element)).booleanValue()) {
                    break;
                }
                i2++;
                f2 = f;
            }
            Intrinsics.checkNotNull(pointerInputChange);
            PointerInputChange pointerInputChange3 = pointerInputChange;
            if (pointerInputChange3.isConsumed()) {
                return null;
            }
            if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange3)) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                int size2 = changes2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        pointerInputChange2 = null;
                        break;
                    }
                    pointerInputChange2 = changes2.get(i3);
                    if (Boolean.valueOf(pointerInputChange2.getPressed()).booleanValue()) {
                        break;
                    }
                    i3++;
                }
                PointerInputChange pointerInputChange4 = pointerInputChange2;
                if (pointerInputChange4 == null) {
                    return null;
                }
                longRef.element = pointerInputChange4.m4425getIdJ3iCeTQ();
            } else {
                float floatValue = f + (function1.invoke(Offset.m3007boximpl(pointerInputChange3.m4426getPositionF1C5BW0())).floatValue() - function1.invoke(Offset.m3007boximpl(pointerInputChange3.m4427getPreviousPositionF1C5BW0())).floatValue());
                if (Math.abs(floatValue) < m1348pointerSlopE8SPZFQ) {
                    PointerEventPass pointerEventPass = PointerEventPass.Final;
                    InlineMarker.mark(0);
                    awaitPointerEventScope.awaitPointerEvent(pointerEventPass, continuation);
                    InlineMarker.mark(1);
                    if (pointerInputChange3.isConsumed()) {
                        return null;
                    }
                    f = floatValue;
                } else {
                    function2.invoke(pointerInputChange3, Float.valueOf(floatValue - (Math.signum(floatValue) * m1348pointerSlopE8SPZFQ)));
                    if (pointerInputChange3.isConsumed()) {
                        return pointerInputChange3;
                    }
                    f = 0.0f;
                    f2 = f;
                }
            }
            f2 = f;
        }
    }

    /* renamed from: isPointerUp-DmW0f2w  reason: not valid java name */
    private static final boolean m1347isPointerUpDmW0f2w(PointerEvent pointerEvent, long j) {
        PointerInputChange pointerInputChange;
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                pointerInputChange = null;
                break;
            }
            pointerInputChange = changes.get(i);
            if (PointerId.m4409equalsimpl0(pointerInputChange.m4425getIdJ3iCeTQ(), j)) {
                break;
            }
            i++;
        }
        PointerInputChange pointerInputChange2 = pointerInputChange;
        if (pointerInputChange2 != null && pointerInputChange2.getPressed()) {
            z = true;
        }
        return true ^ z;
    }

    /* renamed from: pointerSlop-E8SPZFQ  reason: not valid java name */
    public static final float m1348pointerSlopE8SPZFQ(ViewConfiguration pointerSlop, int i) {
        Intrinsics.checkNotNullParameter(pointerSlop, "$this$pointerSlop");
        return PointerType.m4498equalsimpl0(i, PointerType.Companion.m4503getMouseT8wyACA()) ? pointerSlop.getTouchSlop() * mouseToTouchSlopRatio : pointerSlop.getTouchSlop();
    }

    static {
        float m5607constructorimpl = Dp.m5607constructorimpl((float) 0.125d);
        mouseSlop = m5607constructorimpl;
        float m5607constructorimpl2 = Dp.m5607constructorimpl(18);
        defaultTouchSlop = m5607constructorimpl2;
        mouseToTouchSlopRatio = m5607constructorimpl / m5607constructorimpl2;
    }
}
