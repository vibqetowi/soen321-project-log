package androidx.compose.foundation.gestures;

import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fJ!\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b#\u0010$J!\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!H\u0086@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b(\u0010$J\u001b\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u00020\u0005J\u0006\u00100\u001a\u00020\u0005J'\u00101\u001a\u00020**\u0002022\u0006\u00103\u001a\u00020*2\u0006\u00104\u001a\u000205ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b9\u0010-J\n\u00108\u001a\u00020:*\u00020:J\u0017\u0010;\u001a\u00020**\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010-J\u0017\u0010=\u001a\u00020!*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010-J\u0017\u0010?\u001a\u00020:*\u00020*ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b@\u0010AJ\u0017\u0010?\u001a\u00020:*\u00020!ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u00020**\u00020:ø\u0001\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020!*\u00020!2\u0006\u0010G\u001a\u00020:ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bH\u0010IR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/gestures/ScrollingLogic;", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "reverseDirection", "", "nestedScrollDispatcher", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "scrollableState", "Landroidx/compose/foundation/gestures/ScrollableState;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "overscrollEffect", "Landroidx/compose/foundation/OverscrollEffect;", "(Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/runtime/State;Landroidx/compose/foundation/gestures/ScrollableState;Landroidx/compose/foundation/gestures/FlingBehavior;Landroidx/compose/foundation/OverscrollEffect;)V", "getFlingBehavior", "()Landroidx/compose/foundation/gestures/FlingBehavior;", "isNestedFlinging", "Landroidx/compose/runtime/MutableState;", "getNestedScrollDispatcher", "()Landroidx/compose/runtime/State;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getOverscrollEffect", "()Landroidx/compose/foundation/OverscrollEffect;", "getReverseDirection", "()Z", "getScrollableState", "()Landroidx/compose/foundation/gestures/ScrollableState;", "shouldDispatchOverscroll", "getShouldDispatchOverscroll", "doFlingAnimation", "Landroidx/compose/ui/unit/Velocity;", "available", "doFlingAnimation-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onDragStopped", "", "initialVelocity", "onDragStopped-sF-c-tU", "performRawScroll", "Landroidx/compose/ui/geometry/Offset;", "scroll", "performRawScroll-MK-Hz9U", "(J)J", "registerNestedFling", "isFlinging", "shouldScrollImmediately", "dispatchScroll", "Landroidx/compose/foundation/gestures/ScrollScope;", "availableDelta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "dispatchScroll-3eAAhYA", "(Landroidx/compose/foundation/gestures/ScrollScope;JI)J", "reverseIfNeeded", "reverseIfNeeded-MK-Hz9U", "", "singleAxisOffset", "singleAxisOffset-MK-Hz9U", "singleAxisVelocity", "singleAxisVelocity-AH228Gc", "toFloat", "toFloat-k-4lQ0M", "(J)F", "toFloat-TH1AsA0", "toOffset", "toOffset-tuRUvjQ", "(F)J", "update", "newValue", "update-QWom1Mo", "(JF)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollingLogic {
    private final FlingBehavior flingBehavior;
    private final MutableState<Boolean> isNestedFlinging;
    private final State<NestedScrollDispatcher> nestedScrollDispatcher;
    private final Orientation orientation;
    private final OverscrollEffect overscrollEffect;
    private final boolean reverseDirection;
    private final ScrollableState scrollableState;

    public ScrollingLogic(Orientation orientation, boolean z, State<NestedScrollDispatcher> nestedScrollDispatcher, ScrollableState scrollableState, FlingBehavior flingBehavior, OverscrollEffect overscrollEffect) {
        MutableState<Boolean> mutableStateOf$default;
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(nestedScrollDispatcher, "nestedScrollDispatcher");
        Intrinsics.checkNotNullParameter(scrollableState, "scrollableState");
        Intrinsics.checkNotNullParameter(flingBehavior, "flingBehavior");
        this.orientation = orientation;
        this.reverseDirection = z;
        this.nestedScrollDispatcher = nestedScrollDispatcher;
        this.scrollableState = scrollableState;
        this.flingBehavior = flingBehavior;
        this.overscrollEffect = overscrollEffect;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.isNestedFlinging = mutableStateOf$default;
    }

    public final Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getReverseDirection() {
        return this.reverseDirection;
    }

    public final State<NestedScrollDispatcher> getNestedScrollDispatcher() {
        return this.nestedScrollDispatcher;
    }

    public final ScrollableState getScrollableState() {
        return this.scrollableState;
    }

    public final FlingBehavior getFlingBehavior() {
        return this.flingBehavior;
    }

    public final OverscrollEffect getOverscrollEffect() {
        return this.overscrollEffect;
    }

    /* renamed from: toOffset-tuRUvjQ  reason: not valid java name */
    public final long m608toOffsettuRUvjQ(float f) {
        if (f == 0.0f) {
            return Offset.Companion.m3034getZeroF1C5BW0();
        }
        return this.orientation == Orientation.Horizontal ? OffsetKt.Offset(f, 0.0f) : OffsetKt.Offset(0.0f, f);
    }

    /* renamed from: singleAxisOffset-MK-Hz9U  reason: not valid java name */
    public final long m604singleAxisOffsetMKHz9U(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m3012copydBAh8RU$default(j, 0.0f, 0.0f, 1, null) : Offset.m3012copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: toFloat-k-4lQ0M  reason: not valid java name */
    public final float m607toFloatk4lQ0M(long j) {
        return this.orientation == Orientation.Horizontal ? Offset.m3018getXimpl(j) : Offset.m3019getYimpl(j);
    }

    /* renamed from: toFloat-TH1AsA0  reason: not valid java name */
    public final float m606toFloatTH1AsA0(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5832getXimpl(j) : Velocity.m5833getYimpl(j);
    }

    /* renamed from: singleAxisVelocity-AH228Gc  reason: not valid java name */
    public final long m605singleAxisVelocityAH228Gc(long j) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5828copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null) : Velocity.m5828copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
    }

    /* renamed from: update-QWom1Mo  reason: not valid java name */
    public final long m609updateQWom1Mo(long j, float f) {
        return this.orientation == Orientation.Horizontal ? Velocity.m5828copyOhffZ5M$default(j, f, 0.0f, 2, null) : Velocity.m5828copyOhffZ5M$default(j, 0.0f, f, 1, null);
    }

    public final float reverseIfNeeded(float f) {
        return this.reverseDirection ? f * (-1) : f;
    }

    /* renamed from: reverseIfNeeded-MK-Hz9U  reason: not valid java name */
    public final long m603reverseIfNeededMKHz9U(long j) {
        return this.reverseDirection ? Offset.m3025timestuRUvjQ(j, -1.0f) : j;
    }

    /* renamed from: dispatchScroll-3eAAhYA  reason: not valid java name */
    public final long m599dispatchScroll3eAAhYA(ScrollScope dispatchScroll, long j, int i) {
        Intrinsics.checkNotNullParameter(dispatchScroll, "$this$dispatchScroll");
        long m604singleAxisOffsetMKHz9U = m604singleAxisOffsetMKHz9U(j);
        ScrollingLogic$dispatchScroll$performScroll$1 scrollingLogic$dispatchScroll$performScroll$1 = new ScrollingLogic$dispatchScroll$performScroll$1(this, i, dispatchScroll);
        if (this.overscrollEffect != null && getShouldDispatchOverscroll()) {
            return this.overscrollEffect.mo416applyToScrollRhakbz0(m604singleAxisOffsetMKHz9U, i, scrollingLogic$dispatchScroll$performScroll$1);
        }
        return scrollingLogic$dispatchScroll$performScroll$1.invoke(Offset.m3007boximpl(m604singleAxisOffsetMKHz9U)).m3028unboximpl();
    }

    private final boolean getShouldDispatchOverscroll() {
        return this.scrollableState.getCanScrollForward() || this.scrollableState.getCanScrollBackward();
    }

    /* renamed from: performRawScroll-MK-Hz9U  reason: not valid java name */
    public final long m602performRawScrollMKHz9U(long j) {
        if (this.scrollableState.isScrollInProgress()) {
            return Offset.Companion.m3034getZeroF1C5BW0();
        }
        return m608toOffsettuRUvjQ(reverseIfNeeded(this.scrollableState.dispatchRawDelta(reverseIfNeeded(m607toFloatk4lQ0M(j)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* renamed from: onDragStopped-sF-c-tU  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m601onDragStoppedsFctU(long j, Continuation<? super Unit> continuation) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1;
        int i;
        ScrollingLogic scrollingLogic;
        if (continuation instanceof ScrollingLogic$onDragStopped$1) {
            scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1) continuation;
            if ((scrollingLogic$onDragStopped$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$onDragStopped$1.label -= Integer.MIN_VALUE;
                Object obj = scrollingLogic$onDragStopped$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$onDragStopped$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    registerNestedFling(true);
                    long m605singleAxisVelocityAH228Gc = m605singleAxisVelocityAH228Gc(j);
                    ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new ScrollingLogic$onDragStopped$performFling$1(this, null);
                    if (this.overscrollEffect != null && getShouldDispatchOverscroll()) {
                        OverscrollEffect overscrollEffect = this.overscrollEffect;
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.label = 1;
                        if (overscrollEffect.mo415applyToFlingBMRW4eQ(m605singleAxisVelocityAH228Gc, scrollingLogic$onDragStopped$performFling$1, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        Velocity m5823boximpl = Velocity.m5823boximpl(m605singleAxisVelocityAH228Gc);
                        scrollingLogic$onDragStopped$1.L$0 = this;
                        scrollingLogic$onDragStopped$1.label = 2;
                        if (scrollingLogic$onDragStopped$performFling$1.invoke(m5823boximpl, scrollingLogic$onDragStopped$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    scrollingLogic = this;
                } else if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    scrollingLogic = (ScrollingLogic) scrollingLogic$onDragStopped$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                scrollingLogic.registerNestedFling(false);
                return Unit.INSTANCE;
            }
        }
        scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, continuation);
        Object obj2 = scrollingLogic$onDragStopped$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$onDragStopped$1.label;
        if (i != 0) {
        }
        scrollingLogic.registerNestedFling(false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* renamed from: doFlingAnimation-QWom1Mo  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m600doFlingAnimationQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1;
        int i;
        Ref.LongRef longRef;
        if (continuation instanceof ScrollingLogic$doFlingAnimation$1) {
            scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1) continuation;
            if ((scrollingLogic$doFlingAnimation$1.label & Integer.MIN_VALUE) != 0) {
                scrollingLogic$doFlingAnimation$1.label -= Integer.MIN_VALUE;
                ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$12 = scrollingLogic$doFlingAnimation$1;
                Object obj = scrollingLogic$doFlingAnimation$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollingLogic$doFlingAnimation$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.LongRef longRef2 = new Ref.LongRef();
                    longRef2.element = j;
                    scrollingLogic$doFlingAnimation$12.L$0 = longRef2;
                    scrollingLogic$doFlingAnimation$12.label = 1;
                    if (ScrollableState.CC.scroll$default(this.scrollableState, null, new ScrollingLogic$doFlingAnimation$2(this, longRef2, j, null), scrollingLogic$doFlingAnimation$12, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    longRef = longRef2;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    longRef = (Ref.LongRef) scrollingLogic$doFlingAnimation$12.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m5823boximpl(longRef.element);
            }
        }
        scrollingLogic$doFlingAnimation$1 = new ScrollingLogic$doFlingAnimation$1(this, continuation);
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$122 = scrollingLogic$doFlingAnimation$1;
        Object obj2 = scrollingLogic$doFlingAnimation$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollingLogic$doFlingAnimation$122.label;
        if (i != 0) {
        }
        return Velocity.m5823boximpl(longRef.element);
    }

    public final boolean shouldScrollImmediately() {
        if (!this.scrollableState.isScrollInProgress() && !this.isNestedFlinging.getValue().booleanValue()) {
            OverscrollEffect overscrollEffect = this.overscrollEffect;
            if (!(overscrollEffect != null ? overscrollEffect.isInProgress() : false)) {
                return false;
            }
        }
        return true;
    }

    public final void registerNestedFling(boolean z) {
        this.isNestedFlinging.setValue(Boolean.valueOf(z));
    }
}
