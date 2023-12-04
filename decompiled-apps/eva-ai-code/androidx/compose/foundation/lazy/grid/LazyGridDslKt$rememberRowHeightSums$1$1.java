package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridDslKt$rememberRowHeightSums$1$1 extends Lambda implements Function2<Density, Constraints, LazyGridSlots> {
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ GridCells $rows;
    final /* synthetic */ Arrangement.Vertical $verticalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberRowHeightSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Vertical vertical) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$rows = gridCells;
        this.$verticalArrangement = vertical;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
        return m877invoke0kLqBqw(density, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridSlots m877invoke0kLqBqw(Density $receiver, long j) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (!(Constraints.m5550getMaxHeightimpl(j) != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("LazyHorizontalGrid's height should be bound by parent.".toString());
        }
        int m5550getMaxHeightimpl = Constraints.m5550getMaxHeightimpl(j) - $receiver.mo582roundToPx0680j_4(Dp.m5607constructorimpl(this.$contentPadding.mo700calculateTopPaddingD9Ej5fM() + this.$contentPadding.mo697calculateBottomPaddingD9Ej5fM()));
        GridCells gridCells = this.$rows;
        Arrangement.Vertical vertical = this.$verticalArrangement;
        int[] intArray = CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes($receiver, m5550getMaxHeightimpl, $receiver.mo582roundToPx0680j_4(vertical.mo661getSpacingD9Ej5fM())));
        int[] iArr = new int[intArray.length];
        vertical.arrange($receiver, m5550getMaxHeightimpl, intArray, iArr);
        return new LazyGridSlots(intArray, iArr);
    }
}
