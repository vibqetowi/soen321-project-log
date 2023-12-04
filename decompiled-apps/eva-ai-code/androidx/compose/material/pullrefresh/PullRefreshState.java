package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
/* compiled from: PullRefreshState.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B3\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\u0010\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\tH\u0002J\b\u00108\u001a\u00020\tH\u0002J\u0015\u00109\u001a\u00020\t2\u0006\u0010:\u001a\u00020\tH\u0000¢\u0006\u0002\b;J\u0015\u0010<\u001a\u00020\t2\u0006\u0010=\u001a\u00020\tH\u0000¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020\u00072\u0006\u00102\u001a\u00020\u0014H\u0000¢\u0006\u0002\b@J\u0015\u0010A\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\bBJ\u0015\u0010C\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0002\bDR+\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u00148B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R+\u0010\u001c\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0013\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0011R+\u0010 \u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0013\u001a\u0004\b!\u0010\u000f\"\u0004\b\"\u0010\u0011R\u001b\u0010$\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010(\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010\u0011R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b/\u0010\u000fR\u0011\u00100\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b1\u0010\u000fR\u0014\u00102\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u000f¨\u0006E"}, d2 = {"Landroidx/compose/material/pullrefresh/PullRefreshState;", "", "animationScope", "Lkotlinx/coroutines/CoroutineScope;", "onRefreshState", "Landroidx/compose/runtime/State;", "Lkotlin/Function0;", "", "refreshingOffset", "", "threshold", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/State;FF)V", "<set-?>", "_position", "get_position", "()F", "set_position", "(F)V", "_position$delegate", "Landroidx/compose/runtime/MutableFloatState;", "", "_refreshing", "get_refreshing", "()Z", "set_refreshing", "(Z)V", "_refreshing$delegate", "Landroidx/compose/runtime/MutableState;", "_refreshingOffset", "get_refreshingOffset", "set_refreshingOffset", "_refreshingOffset$delegate", "_threshold", "get_threshold", "set_threshold", "_threshold$delegate", "adjustedDistancePulled", "getAdjustedDistancePulled", "adjustedDistancePulled$delegate", "Landroidx/compose/runtime/State;", "distancePulled", "getDistancePulled", "setDistancePulled", "distancePulled$delegate", "mutatorMutex", "Landroidx/compose/foundation/MutatorMutex;", "position", "getPosition$material_release", "progress", "getProgress", "refreshing", "getRefreshing$material_release", "getThreshold$material_release", "animateIndicatorTo", "Lkotlinx/coroutines/Job;", TypedValues.CycleType.S_WAVE_OFFSET, "calculateIndicatorPosition", "onPull", "pullDelta", "onPull$material_release", "onRelease", "velocity", "onRelease$material_release", "setRefreshing", "setRefreshing$material_release", "setRefreshingOffset", "setRefreshingOffset$material_release", "setThreshold", "setThreshold$material_release", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;
    private final MutableFloatState _position$delegate;
    private final MutableState _refreshing$delegate;
    private final MutableFloatState _refreshingOffset$delegate;
    private final MutableFloatState _threshold$delegate;
    private final State adjustedDistancePulled$delegate;
    private final CoroutineScope animationScope;
    private final MutableFloatState distancePulled$delegate;
    private final MutatorMutex mutatorMutex;
    private final State<Function0<Unit>> onRefreshState;

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(CoroutineScope animationScope, State<? extends Function0<Unit>> onRefreshState, float f, float f2) {
        MutableState mutableStateOf$default;
        Intrinsics.checkNotNullParameter(animationScope, "animationScope");
        Intrinsics.checkNotNullParameter(onRefreshState, "onRefreshState");
        this.animationScope = animationScope;
        this.onRefreshState = onRefreshState;
        this.adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new PullRefreshState$adjustedDistancePulled$2(this));
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this._refreshing$delegate = mutableStateOf$default;
        this._position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f2);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.mutatorMutex = new MutatorMutex();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final void set_refreshing(boolean z) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f) {
        this._position$delegate.setFloatValue(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f) {
        this.distancePulled$delegate.setFloatValue(f);
    }

    private final float get_threshold() {
        return this._threshold$delegate.getFloatValue();
    }

    private final void set_threshold(float f) {
        this._threshold$delegate.setFloatValue(f);
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset$delegate.getFloatValue();
    }

    private final void set_refreshingOffset(float f) {
        this._refreshingOffset$delegate.setFloatValue(f);
    }

    public final float onPull$material_release(float f) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float coerceAtLeast = RangesKt.coerceAtLeast(getDistancePulled() + f, 0.0f);
        float distancePulled = coerceAtLeast - getDistancePulled();
        setDistancePulled(coerceAtLeast);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float f) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if ((getDistancePulled() == 0.0f) || f < 0.0f) {
            f = 0.0f;
        }
        setDistancePulled(0.0f);
        return f;
    }

    public final void setRefreshing$material_release(boolean z) {
        if (get_refreshing() != z) {
            set_refreshing(z);
            setDistancePulled(0.0f);
            animateIndicatorTo(z ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setThreshold$material_release(float f) {
        set_threshold(f);
    }

    public final void setRefreshingOffset$material_release(float f) {
        if (get_refreshingOffset() == f) {
            return;
        }
        set_refreshingOffset(f);
        if (getRefreshing$material_release()) {
            animateIndicatorTo(f);
        }
    }

    private final Job animateIndicatorTo(float f) {
        Job launch$default;
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, f, null), 3, null);
        return launch$default;
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float coerceIn = RangesKt.coerceIn(Math.abs(getProgress()) - 1.0f, 0.0f, 2.0f);
        return getThreshold$material_release() + (getThreshold$material_release() * (coerceIn - (((float) Math.pow(coerceIn, 2)) / 4)));
    }
}
