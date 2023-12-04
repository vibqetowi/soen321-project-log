package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1", f = "Scrollable.kt", i = {}, l = {336}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class MouseWheelScrollNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MouseWheelScrollNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollNode$pointerInputNode$1(MouseWheelScrollNode mouseWheelScrollNode, Continuation<? super MouseWheelScrollNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = mouseWheelScrollNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MouseWheelScrollNode$pointerInputNode$1 mouseWheelScrollNode$pointerInputNode$1 = new MouseWheelScrollNode$pointerInputNode$1(this.this$0, continuation);
        mouseWheelScrollNode$pointerInputNode$1.L$0 = obj;
        return mouseWheelScrollNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((MouseWheelScrollNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Scrollable.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1", f = "Scrollable.kt", i = {0}, l = {338}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.MouseWheelScrollNode$pointerInputNode$1$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ MouseWheelScrollNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MouseWheelScrollNode mouseWheelScrollNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = mouseWheelScrollNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x005b A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:13:0x003b). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AwaitPointerEventScope awaitPointerEventScope;
            AnonymousClass1 anonymousClass1;
            Object awaitScrollEvent;
            List<PointerInputChange> changes;
            boolean z;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                anonymousClass1 = this;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitScrollEvent = ScrollableKt.awaitScrollEvent(awaitPointerEventScope, anonymousClass1);
                if (awaitScrollEvent == coroutine_suspended) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                Object obj2 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                PointerEvent pointerEvent = (PointerEvent) obj;
                int size = pointerEvent.getChanges().size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = true;
                        break;
                    } else if (!(!changes.get(i2).isConsumed())) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    ScrollConfig mouseWheelScrollConfig = anonymousClass12.this$0.getMouseWheelScrollConfig();
                    MouseWheelScrollNode mouseWheelScrollNode = anonymousClass12.this$0;
                    long mo506calculateMouseWheelScroll8xgXZGE = mouseWheelScrollConfig.mo506calculateMouseWheelScroll8xgXZGE(awaitPointerEventScope2, pointerEvent, awaitPointerEventScope2.mo4326getSizeYbymL2g());
                    ScrollingLogic value = mouseWheelScrollNode.getScrollingLogicState().getValue();
                    if (!(value.getScrollableState().dispatchRawDelta(value.reverseIfNeeded(value.m607toFloatk4lQ0M(mo506calculateMouseWheelScroll8xgXZGE))) == 0.0f)) {
                        List<PointerInputChange> changes2 = pointerEvent.getChanges();
                        int size2 = changes2.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            changes2.get(i3).consume();
                        }
                    }
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitScrollEvent = ScrollableKt.awaitScrollEvent(awaitPointerEventScope, anonymousClass1);
                if (awaitScrollEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj3 = coroutine_suspended;
                anonymousClass12 = anonymousClass1;
                obj = awaitScrollEvent;
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj2 = obj3;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                int size3 = pointerEvent2.getChanges().size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size3) {
                    }
                    i22++;
                }
                if (z) {
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitScrollEvent = ScrollableKt.awaitScrollEvent(awaitPointerEventScope, anonymousClass1);
                if (awaitScrollEvent == coroutine_suspended) {
                }
            }
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(new AnonymousClass1(this.this$0, null), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
