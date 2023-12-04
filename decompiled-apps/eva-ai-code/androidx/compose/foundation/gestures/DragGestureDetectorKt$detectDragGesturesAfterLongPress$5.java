package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DragGestureDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", f = "DragGestureDetector.kt", i = {0, 1, 2}, l = {235, 236, 241}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;
    final /* synthetic */ Function0<Unit> $onDragCancel;
    final /* synthetic */ Function0<Unit> $onDragEnd;
    final /* synthetic */ Function1<Offset, Unit> $onDragStart;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(Function1<? super Offset, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function2<? super PointerInputChange, ? super Offset, Unit> function2, Continuation<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> continuation) {
        super(2, continuation);
        this.$onDragStart = function1;
        this.$onDragEnd = function0;
        this.$onDragCancel = function02;
        this.$onDrag = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragEnd, this.$onDragCancel, this.$onDrag, continuation);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066 A[Catch: CancellationException -> 0x00c6, TryCatch #0 {CancellationException -> 0x00c6, blocks: (B:8:0x0015, B:31:0x008f, B:33:0x0097, B:35:0x00a6, B:37:0x00b2, B:38:0x00b5, B:39:0x00b8, B:40:0x00be, B:13:0x0027, B:25:0x0062, B:27:0x0066, B:16:0x002f, B:22:0x004e, B:19:0x003d), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0097 A[Catch: CancellationException -> 0x00c6, TryCatch #0 {CancellationException -> 0x00c6, blocks: (B:8:0x0015, B:31:0x008f, B:33:0x0097, B:35:0x00a6, B:37:0x00b2, B:38:0x00b5, B:39:0x00b8, B:40:0x00be, B:13:0x0027, B:25:0x0062, B:27:0x0066, B:16:0x002f, B:22:0x004e, B:19:0x003d), top: B:46:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: CancellationException -> 0x00c6, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x00c6, blocks: (B:8:0x0015, B:31:0x008f, B:33:0x0097, B:35:0x00a6, B:37:0x00b2, B:38:0x00b5, B:39:0x00b8, B:40:0x00be, B:13:0x0027, B:25:0x0062, B:27:0x0066, B:16:0x002f, B:22:0x004e, B:19:0x003d), top: B:46:0x0009 }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AwaitPointerEventScope awaitPointerEventScope;
        PointerInputChange pointerInputChange;
        AwaitPointerEventScope awaitPointerEventScope2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                this.L$0 = awaitPointerEventScope;
                this.label = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i != 1) {
                if (i == 2) {
                    awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange != null) {
                        this.$onDragStart.invoke(Offset.m3007boximpl(pointerInputChange.m4426getPositionF1C5BW0()));
                        this.L$0 = awaitPointerEventScope;
                        this.label = 3;
                        obj = DragGestureDetectorKt.m534dragjO51t88(awaitPointerEventScope, pointerInputChange.m4425getIdJ3iCeTQ(), new AnonymousClass1(this.$onDrag), this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                    return Unit.INSTANCE;
                } else if (i == 3) {
                    awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        List<PointerInputChange> changes = awaitPointerEventScope2.getCurrentEvent().getChanges();
                        int size = changes.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            PointerInputChange pointerInputChange2 = changes.get(i2);
                            if (PointerEventKt.changedToUp(pointerInputChange2)) {
                                pointerInputChange2.consume();
                            }
                        }
                        this.$onDragEnd.invoke();
                    } else {
                        this.$onDragCancel.invoke();
                    }
                    return Unit.INSTANCE;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            this.L$0 = awaitPointerEventScope;
            this.label = 2;
            obj = DragGestureDetectorKt.m524awaitLongPressOrCancellationrnUCldI(awaitPointerEventScope, ((PointerInputChange) obj).m4425getIdJ3iCeTQ(), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pointerInputChange = (PointerInputChange) obj;
            if (pointerInputChange != null) {
            }
            return Unit.INSTANCE;
        } catch (CancellationException e) {
            this.$onDragCancel.invoke();
            throw e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DragGestureDetector.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends Lambda implements Function1<PointerInputChange, Unit> {
        final /* synthetic */ Function2<PointerInputChange, Offset, Unit> $onDrag;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function2<? super PointerInputChange, ? super Offset, Unit> function2) {
            super(1);
            this.$onDrag = function2;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange) {
            invoke2(pointerInputChange);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(PointerInputChange it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$onDrag.invoke(it, Offset.m3007boximpl(PointerEventKt.positionChange(it)));
            it.consume();
        }
    }
}
