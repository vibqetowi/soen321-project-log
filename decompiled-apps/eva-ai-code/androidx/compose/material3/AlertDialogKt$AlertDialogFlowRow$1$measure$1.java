package androidx.compose.material3;

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
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
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
        MeasureScope measureScope = this.$this_Layout;
        float f = this.$mainAxisSpacing;
        int i = this.$mainAxisLayoutSize;
        List<Integer> list = this.$crossAxisPositions;
        int i2 = 0;
        for (Object obj : this.$sequences) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            List list2 = (List) obj;
            int size = list2.size();
            int[] iArr = new int[size];
            int i4 = 0;
            while (i4 < size) {
                iArr[i4] = ((Placeable) list2.get(i4)).getWidth() + (i4 < CollectionsKt.getLastIndex(list2) ? measureScope.mo582roundToPx0680j_4(f) : 0);
                i4++;
            }
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            int[] iArr2 = new int[size];
            for (int i5 = 0; i5 < size; i5++) {
                iArr2[i5] = 0;
            }
            end.arrange(measureScope, i, iArr, measureScope.getLayoutDirection(), iArr2);
            int i6 = 0;
            for (Object obj2 : list2) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Placeable.PlacementScope.place$default(layout, (Placeable) obj2, iArr2[i6], list.get(i2).intValue(), 0.0f, 4, null);
                i6 = i7;
            }
            i2 = i3;
        }
    }
}
