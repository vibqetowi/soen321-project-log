package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AlertDialogKt$AlertDialogFlowRow$1$measure$1 extends Lambda implements Function1<Placeable.PlacementScope, Unit> {
    final /* synthetic */ List<Integer> $crossAxisPositions;
    final /* synthetic */ int $mainAxisLayoutSize;
    final /* synthetic */ float $mainAxisSpacing;
    final /* synthetic */ List<List<Placeable>> $sequences;
    final /* synthetic */ MeasureScope $this_Layout;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogKt$AlertDialogFlowRow$1$measure$1(List<List<Placeable>> list, MeasureScope measureScope, float f, int i, List<Integer> list2) {
        super(1);
        this.$sequences = list;
        this.$this_Layout = measureScope;
        this.$mainAxisSpacing = f;
        this.$mainAxisLayoutSize = i;
        this.$crossAxisPositions = list2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
        invoke2(placementScope);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        List<List<Placeable>> list = this.$sequences;
        MeasureScope measureScope = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i = this.$mainAxisLayoutSize;
        List<Integer> list2 = this.$crossAxisPositions;
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            List<Placeable> list3 = list.get(i2);
            int size2 = list3.size();
            int[] iArr = new int[size2];
            int i3 = 0;
            while (i3 < size2) {
                iArr[i3] = list3.get(i3).getWidth() + (i3 < CollectionsKt.getLastIndex(list3) ? measureScope.mo582roundToPx0680j_4(f) : 0);
                i3++;
            }
            Arrangement.Vertical bottom = Arrangement.INSTANCE.getBottom();
            int[] iArr2 = new int[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                iArr2[i4] = 0;
            }
            bottom.arrange(measureScope, i, iArr, iArr2);
            int size3 = list3.size();
            int i5 = 0;
            while (i5 < size3) {
                Placeable.PlacementScope.place$default(layout, list3.get(i5), iArr2[i5], list2.get(i2).intValue(), 0.0f, 4, null);
                i5++;
                size3 = size3;
                iArr2 = iArr2;
                list3 = list3;
                i2 = i2;
            }
            i2++;
        }
    }
}
