package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventType;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
/* compiled from: PointerMoveDetector.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2", f = "PointerMoveDetector.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class PointerMoveDetectorKt$detectMoves$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Offset, Unit> $onMove;
    final /* synthetic */ PointerEventPass $pointerEventPass;
    final /* synthetic */ PointerInputScope $this_detectMoves;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerMoveDetectorKt$detectMoves$2(PointerInputScope pointerInputScope, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super PointerMoveDetectorKt$detectMoves$2> continuation) {
        super(2, continuation);
        this.$this_detectMoves = pointerInputScope;
        this.$pointerEventPass = pointerEventPass;
        this.$onMove = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PointerMoveDetectorKt$detectMoves$2(this.$this_detectMoves, this.$pointerEventPass, this.$onMove, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PointerMoveDetectorKt$detectMoves$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineContext context = getContext();
            this.label = 1;
            if (this.$this_detectMoves.awaitPointerEventScope(new AnonymousClass1(context, this.$pointerEventPass, this.$onMove, null), this) == coroutine_suspended) {
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
    /* compiled from: PointerMoveDetector.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1", f = "PointerMoveDetector.kt", i = {0, 0}, l = {44}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "previousPosition"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.PointerMoveDetectorKt$detectMoves$2$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $currentContext;
        final /* synthetic */ Function1<Offset, Unit> $onMove;
        final /* synthetic */ PointerEventPass $pointerEventPass;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(CoroutineContext coroutineContext, PointerEventPass pointerEventPass, Function1<? super Offset, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$currentContext = coroutineContext;
            this.$pointerEventPass = pointerEventPass;
            this.$onMove = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$currentContext, this.$pointerEventPass, this.$onMove, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
        /* JADX WARN: Type inference failed for: r10v15, types: [T, androidx.compose.ui.geometry.Offset] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004c -> B:15:0x0052). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Ref.ObjectRef objectRef;
            AwaitPointerEventScope awaitPointerEventScope;
            AnonymousClass1 anonymousClass1;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                objectRef = new Ref.ObjectRef();
                awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                anonymousClass1 = this;
                if (JobKt.isActive(anonymousClass1.$currentContext)) {
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                ResultKt.throwOnFailure(obj);
                AwaitPointerEventScope awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                Ref.ObjectRef objectRef2 = (Ref.ObjectRef) this.L$1;
                Object obj2 = coroutine_suspended;
                AnonymousClass1 anonymousClass12 = this;
                PointerEvent pointerEvent = (PointerEvent) obj;
                int m4369getType7fucELk = pointerEvent.m4369getType7fucELk();
                if (!(!PointerEventType.m4376equalsimpl0(m4369getType7fucELk, PointerEventType.Companion.m4382getMove7fucELk()) ? true : PointerEventType.m4376equalsimpl0(m4369getType7fucELk, PointerEventType.Companion.m4380getEnter7fucELk())) ? true : PointerEventType.m4376equalsimpl0(m4369getType7fucELk, PointerEventType.Companion.m4381getExit7fucELk())) {
                    Offset m3007boximpl = Offset.m3007boximpl(((PointerInputChange) CollectionsKt.first((List<? extends Object>) pointerEvent.getChanges())).m4426getPositionF1C5BW0());
                    if (Offset.m3014equalsimpl(m3007boximpl.m3028unboximpl(), objectRef2.element)) {
                        m3007boximpl = null;
                    }
                    if (m3007boximpl != null) {
                        Function1<Offset, Unit> function1 = anonymousClass12.$onMove;
                        long m3028unboximpl = m3007boximpl.m3028unboximpl();
                        objectRef2.element = Offset.m3007boximpl(m3028unboximpl);
                        function1.invoke(Offset.m3007boximpl(m3028unboximpl));
                    }
                }
                anonymousClass1 = anonymousClass12;
                coroutine_suspended = obj2;
                objectRef = objectRef2;
                awaitPointerEventScope = awaitPointerEventScope2;
                if (JobKt.isActive(anonymousClass1.$currentContext)) {
                    anonymousClass1.L$0 = awaitPointerEventScope;
                    anonymousClass1.L$1 = objectRef;
                    anonymousClass1.label = 1;
                    Object awaitPointerEvent = awaitPointerEventScope.awaitPointerEvent(anonymousClass1.$pointerEventPass, anonymousClass1);
                    if (awaitPointerEvent == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Object obj3 = coroutine_suspended;
                    anonymousClass12 = anonymousClass1;
                    obj = awaitPointerEvent;
                    awaitPointerEventScope2 = awaitPointerEventScope;
                    objectRef2 = objectRef;
                    obj2 = obj3;
                    PointerEvent pointerEvent2 = (PointerEvent) obj;
                    int m4369getType7fucELk2 = pointerEvent2.m4369getType7fucELk();
                    if (!(!PointerEventType.m4376equalsimpl0(m4369getType7fucELk2, PointerEventType.Companion.m4382getMove7fucELk()) ? true : PointerEventType.m4376equalsimpl0(m4369getType7fucELk2, PointerEventType.Companion.m4380getEnter7fucELk())) ? true : PointerEventType.m4376equalsimpl0(m4369getType7fucELk2, PointerEventType.Companion.m4381getExit7fucELk())) {
                    }
                    anonymousClass1 = anonymousClass12;
                    coroutine_suspended = obj2;
                    objectRef = objectRef2;
                    awaitPointerEventScope = awaitPointerEventScope2;
                    if (JobKt.isActive(anonymousClass1.$currentContext)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }
}
