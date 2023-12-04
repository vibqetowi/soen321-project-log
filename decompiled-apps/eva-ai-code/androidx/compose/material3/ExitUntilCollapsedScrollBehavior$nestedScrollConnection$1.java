package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
/* compiled from: AppBar.kt */
@Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"androidx/compose/material3/ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 implements NestedScrollConnection {
    final /* synthetic */ ExitUntilCollapsedScrollBehavior this$0;

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public /* synthetic */ Object mo597onPreFlingQWom1Mo(long j, Continuation continuation) {
        return NestedScrollConnection.CC.m4305onPreFlingQWom1Mo$suspendImpl(this, j, continuation);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior) {
        this.this$0 = exitUntilCollapsedScrollBehavior;
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo598onPreScrollOzD1aCk(long j, int i) {
        if (!this.this$0.getCanScroll().invoke().booleanValue() || Offset.m3019getYimpl(j) > 0.0f) {
            return Offset.Companion.m3034getZeroF1C5BW0();
        }
        float heightOffset = this.this$0.getState().getHeightOffset();
        this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m3019getYimpl(j));
        if (!(heightOffset == this.this$0.getState().getHeightOffset())) {
            return Offset.m3012copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
        }
        return Offset.Companion.m3034getZeroF1C5BW0();
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo596onPostScrollDzOQY0M(long j, long j2, int i) {
        if (this.this$0.getCanScroll().invoke().booleanValue()) {
            TopAppBarState state = this.this$0.getState();
            state.setContentOffset(state.getContentOffset() + Offset.m3019getYimpl(j));
            if (Offset.m3019getYimpl(j2) < 0.0f || Offset.m3019getYimpl(j) < 0.0f) {
                float heightOffset = this.this$0.getState().getHeightOffset();
                this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m3019getYimpl(j));
                return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset);
            }
            if ((Offset.m3019getYimpl(j) == 0.0f) && Offset.m3019getYimpl(j2) > 0.0f) {
                this.this$0.getState().setContentOffset(0.0f);
            }
            if (Offset.m3019getYimpl(j2) > 0.0f) {
                float heightOffset2 = this.this$0.getState().getHeightOffset();
                this.this$0.getState().setHeightOffset(this.this$0.getState().getHeightOffset() + Offset.m3019getYimpl(j2));
                return OffsetKt.Offset(0.0f, this.this$0.getState().getHeightOffset() - heightOffset2);
            }
            return Offset.Companion.m3034getZeroF1C5BW0();
        }
        return Offset.Companion.m3034getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo595onPostFlingRZ2iAVY(long j, long j2, Continuation<? super Velocity> continuation) {
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1 exitUntilCollapsedScrollBehavior$nestedScrollConnection$1;
        long j3;
        if (continuation instanceof ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) {
            exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 = (ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1) continuation;
            if ((exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label & Integer.MIN_VALUE) != 0) {
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label -= Integer.MIN_VALUE;
                obj = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.L$0 = this;
                    exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.J$0 = j2;
                    exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label = 1;
                    obj = NestedScrollConnection.CC.m4304onPostFlingRZ2iAVY$suspendImpl(this, j, j2, exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = this;
                } else if (i != 1) {
                    if (i == 2) {
                        j3 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.J$0;
                        ResultKt.throwOnFailure(obj);
                        return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j3, ((Velocity) obj).m5841unboximpl()));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    j2 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.J$0;
                    exitUntilCollapsedScrollBehavior$nestedScrollConnection$1 = (ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1) exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                long m5841unboximpl = ((Velocity) obj).m5841unboximpl();
                TopAppBarState state = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getState();
                float m5833getYimpl = Velocity.m5833getYimpl(j2);
                DecayAnimationSpec<Float> flingAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getFlingAnimationSpec();
                AnimationSpec<Float> snapAnimationSpec = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getSnapAnimationSpec();
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.L$0 = null;
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.J$0 = m5841unboximpl;
                exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label = 2;
                obj = AppBarKt.settleAppBar(state, m5833getYimpl, flingAnimationSpec, snapAnimationSpec, exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1);
                if (obj != coroutine_suspended) {
                    return coroutine_suspended;
                }
                j3 = m5841unboximpl;
                return Velocity.m5823boximpl(Velocity.m5836plusAH228Gc(j3, ((Velocity) obj).m5841unboximpl()));
            }
        }
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1 = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1(this, continuation);
        obj = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label;
        if (i != 0) {
        }
        long m5841unboximpl2 = ((Velocity) obj).m5841unboximpl();
        TopAppBarState state2 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getState();
        float m5833getYimpl2 = Velocity.m5833getYimpl(j2);
        DecayAnimationSpec<Float> flingAnimationSpec2 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getFlingAnimationSpec();
        AnimationSpec<Float> snapAnimationSpec2 = exitUntilCollapsedScrollBehavior$nestedScrollConnection$1.this$0.getSnapAnimationSpec();
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.L$0 = null;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.J$0 = m5841unboximpl2;
        exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1.label = 2;
        obj = AppBarKt.settleAppBar(state2, m5833getYimpl2, flingAnimationSpec2, snapAnimationSpec2, exitUntilCollapsedScrollBehavior$nestedScrollConnection$1$onPostFling$1);
        if (obj != coroutine_suspended) {
        }
    }
}
