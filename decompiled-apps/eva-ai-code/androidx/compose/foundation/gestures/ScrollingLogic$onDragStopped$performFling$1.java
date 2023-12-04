package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/ui/unit/Velocity;", "velocity", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {464, 466, 468}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
public final class ScrollingLogic$onDragStopped$performFling$1 extends SuspendLambda implements Function2<Velocity, Continuation<? super Velocity>, Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$onDragStopped$performFling$1(ScrollingLogic scrollingLogic, Continuation<? super ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((Velocity) obj).m5841unboximpl();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, Continuation<? super Velocity> continuation) {
        return m612invokesFctU(velocity.m5841unboximpl(), continuation);
    }

    /* renamed from: invoke-sF-c-tU  reason: not valid java name */
    public final Object m612invokesFctU(long j, Continuation<? super Velocity> continuation) {
        return ((ScrollingLogic$onDragStopped$performFling$1) create(Velocity.m5823boximpl(j), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m4312dispatchPreFlingQWom1Mo;
        long j;
        long m5835minusAH228Gc;
        Object m600doFlingAnimationQWom1Mo;
        long j2;
        Object m4310dispatchPostFlingRZ2iAVY;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long j3 = this.J$0;
            this.J$0 = j3;
            this.label = 1;
            m4312dispatchPreFlingQWom1Mo = this.this$0.getNestedScrollDispatcher().getValue().m4312dispatchPreFlingQWom1Mo(j3, this);
            if (m4312dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j3;
        } else if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    long j4 = this.J$1;
                    long j5 = this.J$0;
                    ResultKt.throwOnFailure(obj);
                    j = j5;
                    j2 = j4;
                    m4310dispatchPostFlingRZ2iAVY = obj;
                    return Velocity.m5823boximpl(Velocity.m5835minusAH228Gc(j, Velocity.m5835minusAH228Gc(j2, ((Velocity) m4310dispatchPostFlingRZ2iAVY).m5841unboximpl())));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j6 = this.J$1;
            long j7 = this.J$0;
            ResultKt.throwOnFailure(obj);
            m600doFlingAnimationQWom1Mo = obj;
            j = j7;
            m5835minusAH228Gc = j6;
            long m5841unboximpl = ((Velocity) m600doFlingAnimationQWom1Mo).m5841unboximpl();
            this.J$0 = j;
            this.J$1 = m5841unboximpl;
            this.label = 3;
            j2 = m5841unboximpl;
            m4310dispatchPostFlingRZ2iAVY = this.this$0.getNestedScrollDispatcher().getValue().m4310dispatchPostFlingRZ2iAVY(Velocity.m5835minusAH228Gc(m5835minusAH228Gc, m5841unboximpl), m5841unboximpl, this);
            if (m4310dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Velocity.m5823boximpl(Velocity.m5835minusAH228Gc(j, Velocity.m5835minusAH228Gc(j2, ((Velocity) m4310dispatchPostFlingRZ2iAVY).m5841unboximpl())));
        } else {
            j = this.J$0;
            ResultKt.throwOnFailure(obj);
            m4312dispatchPreFlingQWom1Mo = obj;
        }
        m5835minusAH228Gc = Velocity.m5835minusAH228Gc(j, ((Velocity) m4312dispatchPreFlingQWom1Mo).m5841unboximpl());
        this.J$0 = j;
        this.J$1 = m5835minusAH228Gc;
        this.label = 2;
        m600doFlingAnimationQWom1Mo = this.this$0.m600doFlingAnimationQWom1Mo(m5835minusAH228Gc, this);
        if (m600doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        long m5841unboximpl2 = ((Velocity) m600doFlingAnimationQWom1Mo).m5841unboximpl();
        this.J$0 = j;
        this.J$1 = m5841unboximpl2;
        this.label = 3;
        j2 = m5841unboximpl2;
        m4310dispatchPostFlingRZ2iAVY = this.this$0.getNestedScrollDispatcher().getValue().m4310dispatchPostFlingRZ2iAVY(Velocity.m5835minusAH228Gc(m5835minusAH228Gc, m5841unboximpl2), m5841unboximpl2, this);
        if (m4310dispatchPostFlingRZ2iAVY == coroutine_suspended) {
        }
        return Velocity.m5823boximpl(Velocity.m5835minusAH228Gc(j, Velocity.m5835minusAH228Gc(j2, ((Velocity) m4310dispatchPostFlingRZ2iAVY).m5841unboximpl())));
    }
}
