package androidx.compose.foundation.gestures.snapping;

import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: SnapPositionInLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\n"}, d2 = {"Landroidx/compose/ui/unit/Density;", "", "layoutSize", "itemSize", "<anonymous parameter 2>", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
final class SnapPositionInLayout$Companion$CenterToCenter$1 implements SnapPositionInLayout {
    public static final SnapPositionInLayout$Companion$CenterToCenter$1 INSTANCE = new SnapPositionInLayout$Companion$CenterToCenter$1();

    SnapPositionInLayout$Companion$CenterToCenter$1() {
    }

    @Override // androidx.compose.foundation.gestures.snapping.SnapPositionInLayout
    public final int position(Density SnapPositionInLayout, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(SnapPositionInLayout, "$this$SnapPositionInLayout");
        return (i / 2) - (i2 / 2);
    }
}
