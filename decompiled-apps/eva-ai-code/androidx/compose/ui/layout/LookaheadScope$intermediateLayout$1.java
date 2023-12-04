package androidx.compose.ui.layout;

import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LookaheadScope.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntermediateMeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "invoke-3p2s80s", "(Landroidx/compose/ui/layout/IntermediateMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LookaheadScope$intermediateLayout$1 extends Lambda implements Function3<IntermediateMeasureScope, Measurable, Constraints, MeasureResult> {
    final /* synthetic */ Function4<MeasureScope, Measurable, Constraints, IntSize, MeasureResult> $measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScope$intermediateLayout$1(Function4<? super MeasureScope, ? super Measurable, ? super Constraints, ? super IntSize, ? extends MeasureResult> function4) {
        super(3);
        this.$measure = function4;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ MeasureResult invoke(IntermediateMeasureScope intermediateMeasureScope, Measurable measurable, Constraints constraints) {
        return m4571invoke3p2s80s(intermediateMeasureScope, measurable, constraints.m5557unboximpl());
    }

    /* renamed from: invoke-3p2s80s  reason: not valid java name */
    public final MeasureResult m4571invoke3p2s80s(IntermediateMeasureScope intermediateLayout, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(intermediateLayout, "$this$intermediateLayout");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return this.$measure.invoke(intermediateLayout, measurable, Constraints.m5539boximpl(j), IntSize.m5759boximpl(intermediateLayout.mo4548getLookaheadSizeYbymL2g()));
    }
}
