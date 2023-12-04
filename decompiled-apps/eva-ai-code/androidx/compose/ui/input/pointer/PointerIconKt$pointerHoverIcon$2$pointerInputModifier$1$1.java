package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PointerIcon.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1", f = "PointerIcon.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ PointerIconModifierLocal $pointerIconModifierLocal;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1(PointerIconModifierLocal pointerIconModifierLocal, Continuation<? super PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1> continuation) {
        super(2, continuation);
        this.$pointerIconModifierLocal = pointerIconModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1 pointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1 = new PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1(this.$pointerIconModifierLocal, continuation);
        pointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1.L$0 = obj;
        return pointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PointerIcon.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1", f = "PointerIcon.kt", i = {0}, l = {112}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope"}, s = {"L$0"})
    /* renamed from: androidx.compose.ui.input.pointer.PointerIconKt$pointerHoverIcon$2$pointerInputModifier$1$1$1  reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerIconModifierLocal $pointerIconModifierLocal;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PointerIconModifierLocal pointerIconModifierLocal, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$pointerIconModifierLocal = pointerIconModifierLocal;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$pointerIconModifierLocal, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0036 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
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
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                Object obj2 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                PointerEvent pointerEvent = (PointerEvent) obj;
                if (PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4380getEnter7fucELk())) {
                    anonymousClass12.$pointerIconModifierLocal.enter();
                } else if (PointerEventType.m4376equalsimpl0(pointerEvent.m4369getType7fucELk(), PointerEventType.Companion.m4381getExit7fucELk())) {
                    anonymousClass12.$pointerIconModifierLocal.exit();
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj3 = coroutine_suspended;
                anonymousClass12 = anonymousClass1;
                obj = awaitPointerEvent;
                awaitPointerEventScope2 = awaitPointerEventScope;
                obj2 = obj3;
                PointerEvent pointerEvent2 = (PointerEvent) obj;
                if (PointerEventType.m4376equalsimpl0(pointerEvent2.m4369getType7fucELk(), PointerEventType.Companion.m4380getEnter7fucELk())) {
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                awaitPointerEventScope = awaitPointerEventScope2;
                anonymousClass1.L$0 = awaitPointerEventScope;
                anonymousClass1.label = 1;
                awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(PointerEventPass.Main, anonymousClass1);
                if (awaitPointerEvent == coroutine_suspended) {
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
            if (((PointerInputScope) this.L$0).awaitPointerEventScope(new AnonymousClass1(this.$pointerIconModifierLocal, null), this) == coroutine_suspended) {
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
