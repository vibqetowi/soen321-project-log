package androidx.compose.runtime;

import kotlin.Metadata;
/* compiled from: SnapshotLongState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0012\u0010\u0003\u001a\u00020\u0002X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/LongState;", "Landroidx/compose/runtime/State;", "", "longValue", "getLongValue", "()J", "value", "getValue", "()Ljava/lang/Long;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface LongState extends State<Long> {
    long getLongValue();

    @Override // androidx.compose.runtime.State
    Long getValue();

    /* compiled from: SnapshotLongState.kt */
    /* renamed from: androidx.compose.runtime.LongState$-CC  reason: invalid class name */
    /* loaded from: classes3.dex */
    public final /* synthetic */ class CC {
        public static /* synthetic */ long access$getValue$jd(LongState longState) {
            return $default$getValue(longState).longValue();
        }

        public static Long $default$getValue(LongState _this) {
            return Long.valueOf(_this.getLongValue());
        }
    }

    /* compiled from: SnapshotLongState.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static Long getValue(LongState longState) {
            return Long.valueOf(CC.access$getValue$jd(longState));
        }
    }
}
