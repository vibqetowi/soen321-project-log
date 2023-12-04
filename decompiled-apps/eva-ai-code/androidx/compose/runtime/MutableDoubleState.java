package androidx.compose.runtime;

import kotlin.Metadata;
/* compiled from: SnapshotDoubleState.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\n\bg\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0018\u0010\u0004\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00038W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/DoubleState;", "Landroidx/compose/runtime/MutableState;", "", "doubleValue", "getDoubleValue", "()D", "setDoubleValue", "(D)V", "value", "getValue", "()Ljava/lang/Double;", "setValue", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MutableDoubleState extends DoubleState, MutableState<Double> {
    @Override // androidx.compose.runtime.DoubleState
    double getDoubleValue();

    @Override // androidx.compose.runtime.DoubleState, androidx.compose.runtime.State
    Double getValue();

    void setDoubleValue(double d);

    void setValue(double d);

    /* compiled from: SnapshotDoubleState.kt */
    /* renamed from: androidx.compose.runtime.MutableDoubleState$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ double access$getValue$jd(MutableDoubleState mutableDoubleState) {
            return $default$getValue(mutableDoubleState).doubleValue();
        }

        public static Double $default$getValue(MutableDoubleState _this) {
            return Double.valueOf(_this.getDoubleValue());
        }
    }

    /* compiled from: SnapshotDoubleState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Double getValue(MutableDoubleState mutableDoubleState) {
            return Double.valueOf(CC.access$getValue$jd(mutableDoubleState));
        }

        @Deprecated
        public static void setValue(MutableDoubleState mutableDoubleState, double d) {
            mutableDoubleState.setDoubleValue(d);
        }
    }
}
