package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: SelectionRegistrarImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "a", "Landroidx/compose/foundation/text/selection/Selectable;", "b", "invoke", "(Landroidx/compose/foundation/text/selection/Selectable;Landroidx/compose/foundation/text/selection/Selectable;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SelectionRegistrarImpl$sort$1 extends Lambda implements Function2<Selectable, Selectable, Integer> {
    final /* synthetic */ LayoutCoordinates $containerLayoutCoordinates;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionRegistrarImpl$sort$1(LayoutCoordinates layoutCoordinates) {
        super(2);
        this.$containerLayoutCoordinates = layoutCoordinates;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Integer invoke(Selectable a, Selectable b) {
        long m3034getZeroF1C5BW0;
        long m3034getZeroF1C5BW02;
        int compareValues;
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        LayoutCoordinates layoutCoordinates = a.getLayoutCoordinates();
        LayoutCoordinates layoutCoordinates2 = b.getLayoutCoordinates();
        if (layoutCoordinates != null) {
            m3034getZeroF1C5BW0 = this.$containerLayoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates, Offset.Companion.m3034getZeroF1C5BW0());
        } else {
            m3034getZeroF1C5BW0 = Offset.Companion.m3034getZeroF1C5BW0();
        }
        if (layoutCoordinates2 != null) {
            m3034getZeroF1C5BW02 = this.$containerLayoutCoordinates.mo4553localPositionOfR5De75A(layoutCoordinates2, Offset.Companion.m3034getZeroF1C5BW0());
        } else {
            m3034getZeroF1C5BW02 = Offset.Companion.m3034getZeroF1C5BW0();
        }
        if (Offset.m3019getYimpl(m3034getZeroF1C5BW0) == Offset.m3019getYimpl(m3034getZeroF1C5BW02)) {
            compareValues = ComparisonsKt.compareValues(Float.valueOf(Offset.m3018getXimpl(m3034getZeroF1C5BW0)), Float.valueOf(Offset.m3018getXimpl(m3034getZeroF1C5BW02)));
        } else {
            compareValues = ComparisonsKt.compareValues(Float.valueOf(Offset.m3019getYimpl(m3034getZeroF1C5BW0)), Float.valueOf(Offset.m3019getYimpl(m3034getZeroF1C5BW02)));
        }
        return Integer.valueOf(compareValues);
    }
}
