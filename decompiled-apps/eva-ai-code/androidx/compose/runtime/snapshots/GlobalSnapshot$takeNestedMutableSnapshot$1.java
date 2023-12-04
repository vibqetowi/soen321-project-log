package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GlobalSnapshot$takeNestedMutableSnapshot$1 extends Lambda implements Function1<SnapshotIdSet, MutableSnapshot> {
    final /* synthetic */ Function1<Object, Unit> $readObserver;
    final /* synthetic */ Function1<Object, Unit> $writeObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshot$takeNestedMutableSnapshot$1(Function1<Object, Unit> function1, Function1<Object, Unit> function12) {
        super(1);
        this.$readObserver = function1;
        this.$writeObserver = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final MutableSnapshot invoke(SnapshotIdSet invalid) {
        int i;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        synchronized (SnapshotKt.getLock()) {
            i = SnapshotKt.nextSnapshotId;
            SnapshotKt.nextSnapshotId = i + 1;
        }
        return new MutableSnapshot(i, invalid, this.$readObserver, this.$writeObserver);
    }
}
