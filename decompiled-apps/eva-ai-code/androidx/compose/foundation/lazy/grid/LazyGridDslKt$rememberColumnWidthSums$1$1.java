package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: LazyGridDsl.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "Landroidx/compose/foundation/lazy/grid/LazyGridSlots;", "Landroidx/compose/ui/unit/Density;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-0kLqBqw", "(Landroidx/compose/ui/unit/Density;J)Landroidx/compose/foundation/lazy/grid/LazyGridSlots;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class LazyGridDslKt$rememberColumnWidthSums$1$1 extends Lambda implements Function2<Density, Constraints, LazyGridSlots> {
    final /* synthetic */ GridCells $columns;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridDslKt$rememberColumnWidthSums$1$1(PaddingValues paddingValues, GridCells gridCells, Arrangement.Horizontal horizontal) {
        super(2);
        this.$contentPadding = paddingValues;
        this.$columns = gridCells;
        this.$horizontalArrangement = horizontal;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ LazyGridSlots invoke(Density density, Constraints constraints) {
        return m876invoke0kLqBqw(density, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-0kLqBqw  reason: not valid java name */
    public final LazyGridSlots m876invoke0kLqBqw(Density $receiver, long j) {
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        if (!(Constraints.m5551getMaxWidthimpl(j) != Integer.MAX_VALUE)) {
            throw new IllegalArgumentException("LazyVerticalGrid's width should be bound by parent.".toString());
        }
        int m5551getMaxWidthimpl = Constraints.m5551getMaxWidthimpl(j) - $receiver.mo582roundToPx0680j_4(Dp.m5607constructorimpl(PaddingKt.calculateStartPadding(this.$contentPadding, LayoutDirection.Ltr) + PaddingKt.calculateEndPadding(this.$contentPadding, LayoutDirection.Ltr)));
        GridCells gridCells = this.$columns;
        Arrangement.Horizontal horizontal = this.$horizontalArrangement;
        int[] intArray = CollectionsKt.toIntArray(gridCells.calculateCrossAxisCellSizes($receiver, m5551getMaxWidthimpl, $receiver.mo582roundToPx0680j_4(horizontal.mo661getSpacingD9Ej5fM())));
        int[] iArr = new int[intArray.length];
        horizontal.arrange($receiver, m5551getMaxWidthimpl, intArray, LayoutDirection.Ltr, iArr);
        return new LazyGridSlots(intArray, iArr);
    }
}
