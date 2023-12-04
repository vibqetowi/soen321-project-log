package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnapshotStateExtensions.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/UnboxedFloatState;", "Landroidx/compose/runtime/FloatState;", "baseState", "Landroidx/compose/runtime/State;", "", "(Landroidx/compose/runtime/State;)V", "floatValue", "getFloatValue", "()F", "value", "getValue", "()Ljava/lang/Float;", "toString", "", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnboxedFloatState implements FloatState {
    private final State<Float> baseState;

    public UnboxedFloatState(State<Float> baseState) {
        Intrinsics.checkNotNullParameter(baseState, "baseState");
        this.baseState = baseState;
    }

    @Override // androidx.compose.runtime.FloatState
    public float getFloatValue() {
        return this.baseState.getValue().floatValue();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.runtime.FloatState, androidx.compose.runtime.State
    public Float getValue() {
        return this.baseState.getValue();
    }

    public String toString() {
        return "UnboxedFloatState(baseState=" + this.baseState + ")@" + hashCode();
    }
}
