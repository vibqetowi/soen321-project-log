package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.snapshots.StateObject;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: DerivedState.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ IdentityArrayMap<StateObject, Integer> $newDependencies;
    final /* synthetic */ DerivedSnapshotState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState<T> derivedSnapshotState, IdentityArrayMap<StateObject, Integer> identityArrayMap, int i) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = identityArrayMap;
        this.$nestedCalculationLevel = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object it) {
        SnapshotThreadLocal snapshotThreadLocal;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it == this.this$0) {
            throw new IllegalStateException("A derived state calculation cannot read itself".toString());
        }
        if (it instanceof StateObject) {
            snapshotThreadLocal = SnapshotStateKt__DerivedStateKt.calculationBlockNestedLevel;
            Object obj = snapshotThreadLocal.get();
            Intrinsics.checkNotNull(obj);
            int intValue = ((Number) obj).intValue();
            IdentityArrayMap<StateObject, Integer> identityArrayMap = this.$newDependencies;
            int i = intValue - this.$nestedCalculationLevel;
            Integer num = identityArrayMap.get(it);
            identityArrayMap.set(it, Integer.valueOf(Math.min(i, num != null ? num.intValue() : Integer.MAX_VALUE)));
        }
    }
}
