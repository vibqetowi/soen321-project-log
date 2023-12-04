package androidx.compose.foundation.layout;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: FlowLayout.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class FlowLayoutKt$flowMeasurePolicy$1$measure$2 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ FlowResult $flowResult;
    final /* synthetic */ RowColumnMeasurementHelper $measureHelper;
    final /* synthetic */ int[] $outPosition;
    final /* synthetic */ MeasureScope $this_measure;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLayoutKt$flowMeasurePolicy$1$measure$2(FlowResult flowResult, RowColumnMeasurementHelper rowColumnMeasurementHelper, int[] iArr, MeasureScope measureScope) {
        super(1);
        this.$flowResult = flowResult;
        this.$measureHelper = rowColumnMeasurementHelper;
        this.$outPosition = iArr;
        this.$this_measure = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        MutableVector<RowColumnMeasureHelperResult> items = this.$flowResult.getItems();
        RowColumnMeasurementHelper rowColumnMeasurementHelper = this.$measureHelper;
        int[] iArr = this.$outPosition;
        MeasureScope measureScope = this.$this_measure;
        int size = items.getSize();
        if (size > 0) {
            RowColumnMeasureHelperResult[] content = items.getContent();
            int i = 0;
            do {
                rowColumnMeasurementHelper.placeHelper(layout, content[i], iArr[i], measureScope.getLayoutDirection());
                i++;
            } while (i < size);
        }
    }
}
