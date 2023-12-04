package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* compiled from: Scrollable.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$scrollableNestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScrollableKt$scrollableNestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ State<ScrollingLogic> $scrollLogic;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
    public /* synthetic */ Object mo597onPreFlingQWom1Mo(long j, Continuation continuation) {
        return NestedScrollConnection.CC.m4305onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ScrollableKt$scrollableNestedScrollConnection$1(State<ScrollingLogic> state, boolean z) {
        this.$scrollLogic = state;
        this.$enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
    public long mo598onPreScrollOzD1aCk(long j, int i) {
        if (NestedScrollSource.m4317equalsimpl0(i, NestedScrollSource.Companion.m4323getFlingWNlRxjI())) {
            this.$scrollLogic.getValue().registerNestedFling(true);
        }
        return Offset.Companion.m3034getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
    public long mo596onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.$enabled) {
            return this.$scrollLogic.getValue().m602performRawScrollMKHz9U(j2);
        }
        return Offset.Companion.m3034getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo595onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1;
        int i;
        long m5843getZero9UxMQ8M;
        ScrollableKt$scrollableNestedScrollConnection$1 scrollableKt$scrollableNestedScrollConnection$1;
        if (continuation instanceof ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) {
            scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = (ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1) continuation;
            if ((scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                Object obj = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (this.$enabled) {
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.L$0 = this;
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0 = j2;
                        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label = 1;
                        obj = this.$scrollLogic.getValue().m600doFlingAnimationQWom1Mo(j2, scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        scrollableKt$scrollableNestedScrollConnection$1 = this;
                    } else {
                        m5843getZero9UxMQ8M = Velocity.Companion.m5843getZero9UxMQ8M();
                        scrollableKt$scrollableNestedScrollConnection$1 = this;
                        Velocity m5823boximpl = Velocity.m5823boximpl(m5843getZero9UxMQ8M);
                        State<ScrollingLogic> state = scrollableKt$scrollableNestedScrollConnection$1.$scrollLogic;
                        m5823boximpl.m5841unboximpl();
                        state.getValue().registerNestedFling(false);
                        return m5823boximpl;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.J$0;
                    scrollableKt$scrollableNestedScrollConnection$1 = (ScrollableKt$scrollableNestedScrollConnection$1) scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                m5843getZero9UxMQ8M = Velocity.m5835minusAH228Gc(j2, ((Velocity) obj).m5841unboximpl());
                Velocity m5823boximpl2 = Velocity.m5823boximpl(m5843getZero9UxMQ8M);
                State<ScrollingLogic> state2 = scrollableKt$scrollableNestedScrollConnection$1.$scrollLogic;
                m5823boximpl2.m5841unboximpl();
                state2.getValue().registerNestedFling(false);
                return m5823boximpl2;
            }
        }
        scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 = new ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(this, continuation);
        Object obj2 = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = scrollableKt$scrollableNestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        m5843getZero9UxMQ8M = Velocity.m5835minusAH228Gc(j2, ((Velocity) obj2).m5841unboximpl());
        Velocity m5823boximpl22 = Velocity.m5823boximpl(m5843getZero9UxMQ8M);
        State<ScrollingLogic> state22 = scrollableKt$scrollableNestedScrollConnection$1.$scrollLogic;
        m5823boximpl22.m5841unboximpl();
        state22.getValue().registerNestedFling(false);
        return m5823boximpl22;
    }
}
