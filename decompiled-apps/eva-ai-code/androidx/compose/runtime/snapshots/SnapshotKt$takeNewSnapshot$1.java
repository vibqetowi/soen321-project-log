package androidx.compose.runtime.snapshots;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Snapshot.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/runtime/snapshots/Snapshot;", "invalid", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invoke", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/Snapshot;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SnapshotKt$takeNewSnapshot$1 extends Lambda implements Function1<SnapshotIdSet, T> {
    final /* synthetic */ Function1<SnapshotIdSet, T> $block;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotKt$takeNewSnapshot$1(Function1<? super SnapshotIdSet, ? extends T> function1) {
        super(1);
        this.$block = function1;
    }

    /* JADX WARN: Incorrect return type in method signature: (Landroidx/compose/runtime/snapshots/SnapshotIdSet;)TT; */
    @Override // kotlin.jvm.functions.Function1
    public final Snapshot invoke(SnapshotIdSet invalid) {
        SnapshotIdSet snapshotIdSet;
        Intrinsics.checkNotNullParameter(invalid, "invalid");
        Snapshot snapshot = (Snapshot) this.$block.invoke(invalid);
        synchronized (SnapshotKt.getLock()) {
            snapshotIdSet = SnapshotKt.openSnapshots;
            SnapshotKt.openSnapshots = snapshotIdSet.set(snapshot.getId());
            Unit unit = Unit.INSTANCE;
        }
        return snapshot;
    }
}
