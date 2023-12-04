package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
/* compiled from: PointerInteropFilter.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", f = "PointerInteropFilter.android.kt", i = {}, l = {342}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PointerInteropFilter_androidKt$motionEventSpy$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<MotionEvent, Unit> $watcher;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerInteropFilter_androidKt$motionEventSpy$1(Function1<? super MotionEvent, Unit> function1, Continuation<? super PointerInteropFilter_androidKt$motionEventSpy$1> continuation) {
        super(2, continuation);
        this.$watcher = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.$watcher, continuation);
        pointerInteropFilter_androidKt$motionEventSpy$1.L$0 = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            pointerInputScope.setInterceptOutOfBoundsChildEvents(true);
            this.label = 1;
            if (pointerInputScope.awaitPointerEventScope(new AnonymousClass1(this.$watcher, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerInteropFilter.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", f = "PointerInteropFilter.android.kt", i = {0}, l = {344}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<MotionEvent, Unit> $watcher;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super MotionEvent, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$watcher = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$watcher, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0037 -> B:13:0x003c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AnonymousClass1 anonymousClass1;
            Object awaitPointerEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                anonymousClass1 = this;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Initial, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                Object obj2 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                MotionEvent motionEvent$ui_release = ((PointerEvent) obj).getMotionEvent$ui_release();
                if (motionEvent$ui_release != null) {
                    anonymousClass12.$watcher.invoke(motionEvent$ui_release);
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Initial, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj3 = coroutine_suspended;
                anonymousClass12 = anonymousClass1;
                obj = awaitPointerEvent;
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj2 = obj3;
                MotionEvent motionEvent$ui_release2 = ((PointerEvent) obj).getMotionEvent$ui_release();
                if (motionEvent$ui_release2 != null) {
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Initial, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
                }
            }
        }
    }
}
