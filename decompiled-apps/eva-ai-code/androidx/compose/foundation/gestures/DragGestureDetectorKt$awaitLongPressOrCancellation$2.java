package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", f = "DragGestureDetector.kt", i = {0, 0, 1, 1, 1}, l = {811, 828}, m = "invokeSuspend", n = {"$this$withTimeout", "finished", "$this$withTimeout", NotificationCompat.CATEGORY_EVENT, "finished"}, s = {"L$0", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$awaitLongPressOrCancellation$2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $currentDown;
    final /* synthetic */ Ref.ObjectRef<PointerInputChange> $longPress;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$awaitLongPressOrCancellation$2(Ref.ObjectRef<PointerInputChange> objectRef, Ref.ObjectRef<PointerInputChange> objectRef2, Continuation<? super DragGestureDetectorKt$awaitLongPressOrCancellation$2> continuation) {
        super(2, continuation);
        this.$currentDown = objectRef;
        this.$longPress = objectRef2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2 = new DragGestureDetectorKt$awaitLongPressOrCancellation$2(this.$currentDown, this.$longPress, continuation);
        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = obj;
        return dragGestureDetectorKt$awaitLongPressOrCancellation$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$awaitLongPressOrCancellation$2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v12, types: [androidx.compose.ui.input.pointer.PointerInputChange, T] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v14, types: [T] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00ca -> B:44:0x00cc). Please submit an issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$2;
        AwaitPointerEventScope awaitPointerEventScope;
        int i;
        Object obj2;
        AwaitPointerEventScope awaitPointerEventScope2;
        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$22;
        int size;
        int i2;
        int i3;
        int size2;
        int i4;
        int i5;
        Object awaitPointerEvent;
        int i6;
        T t;
        PointerInputChange pointerInputChange;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        Object obj3 = null;
        int i8 = 1;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            dragGestureDetectorKt$awaitLongPressOrCancellation$2 = this;
            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
            i = 0;
            if (i == 0) {
            }
        } else if (i7 == 1) {
            i = this.I$0;
            ResultKt.throwOnFailure(obj);
            obj2 = obj;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            dragGestureDetectorKt$awaitLongPressOrCancellation$22 = this;
            PointerEvent pointerEvent = (PointerEvent) obj2;
            List<PointerInputChange> changes = pointerEvent.getChanges();
            size = changes.size();
            i2 = 0;
            while (true) {
                if (i2 >= size) {
                }
                i2++;
            }
            if (i3 != 0) {
            }
            List<PointerInputChange> changes2 = pointerEvent.getChanges();
            size2 = changes2.size();
            i4 = 0;
            while (true) {
                if (i4 < size2) {
                }
                i4++;
            }
            if (i5 != 0) {
            }
            dragGestureDetectorKt$awaitLongPressOrCancellation$22.L$0 = awaitPointerEventScope2;
            dragGestureDetectorKt$awaitLongPressOrCancellation$22.L$1 = pointerEvent;
            dragGestureDetectorKt$awaitLongPressOrCancellation$22.I$0 = i;
            dragGestureDetectorKt$awaitLongPressOrCancellation$22.label = 2;
            awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Final, dragGestureDetectorKt$awaitLongPressOrCancellation$22);
            if (awaitPointerEvent != coroutine_suspended) {
            }
        } else if (i7 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            i = this.I$0;
            PointerEvent pointerEvent2 = (PointerEvent) this.L$1;
            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            awaitPointerEvent = obj;
            DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$23 = this;
            List<PointerInputChange> changes3 = ((PointerEvent) awaitPointerEvent).getChanges();
            int size3 = changes3.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size3) {
                    i6 = 0;
                    break;
                } else if (changes3.get(i9).isConsumed()) {
                    i6 = i8;
                    break;
                } else {
                    i9++;
                }
            }
            if (i6 != 0) {
                i = i8;
            }
            if (!DragGestureDetectorKt.m536isPointerUpDmW0f2w(pointerEvent2, dragGestureDetectorKt$awaitLongPressOrCancellation$23.$currentDown.element.m4425getIdJ3iCeTQ())) {
                List<PointerInputChange> changes4 = pointerEvent2.getChanges();
                int size4 = changes4.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size4) {
                        pointerInputChange = null;
                        break;
                    }
                    pointerInputChange = changes4.get(i10);
                    if (pointerInputChange.getPressed()) {
                        break;
                    }
                    i10++;
                }
                PointerInputChange pointerInputChange2 = pointerInputChange;
                if (pointerInputChange2 != 0) {
                    dragGestureDetectorKt$awaitLongPressOrCancellation$23.$currentDown.element = pointerInputChange2;
                    dragGestureDetectorKt$awaitLongPressOrCancellation$23.$longPress.element = dragGestureDetectorKt$awaitLongPressOrCancellation$23.$currentDown.element;
                } else {
                    i = i8;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    obj3 = null;
                    dragGestureDetectorKt$awaitLongPressOrCancellation$2 = dragGestureDetectorKt$awaitLongPressOrCancellation$23;
                    if (i == 0) {
                        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$0 = awaitPointerEventScope;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$2.L$1 = obj3;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$2.I$0 = i;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$2.label = i8;
                        obj2 = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, dragGestureDetectorKt$awaitLongPressOrCancellation$2);
                        if (obj2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        DragGestureDetectorKt$awaitLongPressOrCancellation$2 dragGestureDetectorKt$awaitLongPressOrCancellation$24 = dragGestureDetectorKt$awaitLongPressOrCancellation$2;
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$22 = dragGestureDetectorKt$awaitLongPressOrCancellation$24;
                        PointerEvent pointerEvent3 = (PointerEvent) obj2;
                        List<PointerInputChange> changes5 = pointerEvent3.getChanges();
                        size = changes5.size();
                        i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                i3 = i8;
                                break;
                            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes5.get(i2))) {
                                i3 = 0;
                                break;
                            } else {
                                i2++;
                            }
                        }
                        if (i3 != 0) {
                            i = i8;
                        }
                        List<PointerInputChange> changes22 = pointerEvent3.getChanges();
                        size2 = changes22.size();
                        i4 = 0;
                        while (true) {
                            if (i4 < size2) {
                                i5 = 0;
                                break;
                            }
                            PointerInputChange pointerInputChange3 = changes22.get(i4);
                            if (((pointerInputChange3.isConsumed() || PointerEventKt.m4372isOutOfBoundsjwHxaWs(pointerInputChange3, awaitPointerEventScope2.mo4326getSizeYbymL2g(), awaitPointerEventScope2.mo4325getExtendedTouchPaddingNHjbRc())) ? i8 : 0) != 0) {
                                i5 = i8;
                                break;
                            }
                            i4++;
                        }
                        if (i5 != 0) {
                            i = i8;
                        }
                        dragGestureDetectorKt$awaitLongPressOrCancellation$22.L$0 = awaitPointerEventScope2;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$22.L$1 = pointerEvent3;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$22.I$0 = i;
                        dragGestureDetectorKt$awaitLongPressOrCancellation$22.label = 2;
                        awaitPointerEvent = awaitPointerEventScope2.awaitPointerEvent(PointerEventPass.Final, dragGestureDetectorKt$awaitLongPressOrCancellation$22);
                        if (awaitPointerEvent != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        dragGestureDetectorKt$awaitLongPressOrCancellation$23 = dragGestureDetectorKt$awaitLongPressOrCancellation$22;
                        pointerEvent2 = pointerEvent3;
                        List<PointerInputChange> changes32 = ((PointerEvent) awaitPointerEvent).getChanges();
                        int size32 = changes32.size();
                        int i92 = 0;
                        while (true) {
                            if (i92 >= size32) {
                            }
                            i92++;
                        }
                        if (i6 != 0) {
                        }
                        if (!DragGestureDetectorKt.m536isPointerUpDmW0f2w(pointerEvent2, dragGestureDetectorKt$awaitLongPressOrCancellation$23.$currentDown.element.m4425getIdJ3iCeTQ())) {
                            Ref.ObjectRef<PointerInputChange> objectRef = dragGestureDetectorKt$awaitLongPressOrCancellation$23.$longPress;
                            List<PointerInputChange> changes6 = pointerEvent2.getChanges();
                            Ref.ObjectRef<PointerInputChange> objectRef2 = dragGestureDetectorKt$awaitLongPressOrCancellation$23.$currentDown;
                            int size5 = changes6.size();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= size5) {
                                    t = 0;
                                    break;
                                }
                                t = changes6.get(i11);
                                List<PointerInputChange> list = changes6;
                                if (PointerId.m4409equalsimpl0(((PointerInputChange) t).m4425getIdJ3iCeTQ(), objectRef2.element.m4425getIdJ3iCeTQ())) {
                                    break;
                                }
                                i11++;
                                changes6 = list;
                            }
                            objectRef.element = t;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                }
            }
            awaitPointerEventScope = awaitPointerEventScope2;
            obj3 = null;
            i8 = 1;
            dragGestureDetectorKt$awaitLongPressOrCancellation$2 = dragGestureDetectorKt$awaitLongPressOrCancellation$23;
            if (i == 0) {
            }
        }
    }
}
