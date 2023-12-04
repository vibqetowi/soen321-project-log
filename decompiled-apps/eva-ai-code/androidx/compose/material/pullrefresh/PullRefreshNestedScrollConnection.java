package androidx.compose.material.pullrefresh;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PullRefresh.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001Bf\u0012!\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003\u00121\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ-\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u001aH\u0096@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0002\u001a\u001d\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R>\u0010\b\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshNestedScrollConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPull", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "pullDelta", "onRelease", "Lkotlin/Function2;", "flingVelocity", "Lkotlin/coroutines/Continuation;", "", "enabled", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Z)V", "Lkotlin/jvm/functions/Function2;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "consumed", "available", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection implements NestedScrollConnection {
    private final boolean enabled;
    private final Function1<Float, Float> onPull;
    private final Function2<Float, Continuation<? super Float>, Object> onRelease;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo595onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return NestedScrollConnection.CC.m4304onPostFlingRZ2iAVY$suspendImpl(this, j, j2, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshNestedScrollConnection(Function1<? super Float, Float> onPull, Function2<? super Float, ? super Continuation<? super Float>, ? extends Object> onRelease, boolean z) {
        Intrinsics.checkNotNullParameter(onPull, "onPull");
        Intrinsics.checkNotNullParameter(onRelease, "onRelease");
        this.onPull = onPull;
        this.onRelease = onRelease;
        this.enabled = z;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo598onPreScrollOzD1aCk(long j, int i) {
        return !this.enabled ? Offset.Companion.m3034getZeroF1C5BW0() : (!NestedScrollSource.m4317equalsimpl0(i, NestedScrollSource.Companion.m4322getDragWNlRxjI()) || Offset.m3019getYimpl(j) >= 0.0f) ? Offset.Companion.m3034getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m3019getYimpl(j))).floatValue());
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo596onPostScrollDzOQY0M(long j, long j2, int i) {
        return !this.enabled ? Offset.Companion.m3034getZeroF1C5BW0() : (!NestedScrollSource.m4317equalsimpl0(i, NestedScrollSource.Companion.m4322getDragWNlRxjI()) || Offset.m3019getYimpl(j2) <= 0.0f) ? Offset.Companion.m3034getZeroF1C5BW0() : OffsetKt.Offset(0.0f, this.onPull.invoke(Float.valueOf(Offset.m3019getYimpl(j2))).floatValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo597onPreFlingQWom1Mo(long j, Continuation<? super Velocity> continuation) {
        PullRefreshNestedScrollConnection$onPreFling$1 pullRefreshNestedScrollConnection$onPreFling$1;
        int i;
        float f;
        if (continuation instanceof PullRefreshNestedScrollConnection$onPreFling$1) {
            pullRefreshNestedScrollConnection$onPreFling$1 = (PullRefreshNestedScrollConnection$onPreFling$1) continuation;
            if ((pullRefreshNestedScrollConnection$onPreFling$1.label & Integer.MIN_VALUE) != 0) {
                pullRefreshNestedScrollConnection$onPreFling$1.label -= Integer.MIN_VALUE;
                Object obj = pullRefreshNestedScrollConnection$onPreFling$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pullRefreshNestedScrollConnection$onPreFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Function2<Float, Continuation<? super Float>, Object> function2 = this.onRelease;
                    Float boxFloat = Boxing.boxFloat(Velocity.m5833getYimpl(j));
                    pullRefreshNestedScrollConnection$onPreFling$1.F$0 = 0.0f;
                    pullRefreshNestedScrollConnection$onPreFling$1.label = 1;
                    obj = function2.invoke(boxFloat, pullRefreshNestedScrollConnection$onPreFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    f = 0.0f;
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    f = pullRefreshNestedScrollConnection$onPreFling$1.F$0;
                    ResultKt.throwOnFailure(obj);
                }
                return Velocity.m5823boximpl(VelocityKt.Velocity(f, ((Number) obj).floatValue()));
            }
        }
        pullRefreshNestedScrollConnection$onPreFling$1 = new PullRefreshNestedScrollConnection$onPreFling$1(this, continuation);
        Object obj2 = pullRefreshNestedScrollConnection$onPreFling$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pullRefreshNestedScrollConnection$onPreFling$1.label;
        if (i != 0) {
        }
        return Velocity.m5823boximpl(VelocityKt.Velocity(f, ((Number) obj2).floatValue()));
    }
}
