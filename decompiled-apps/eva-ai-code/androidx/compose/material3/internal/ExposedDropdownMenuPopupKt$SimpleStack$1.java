package androidx.compose.material3.internal;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: ExposedDropdownMenuPopup.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuPopupKt$SimpleStack$1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopupKt$SimpleStack$1 INSTANCE = new ExposedDropdownMenuPopupKt$SimpleStack$1();

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$maxIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicHeight(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i) {
        return MeasurePolicy.CC.$default$minIntrinsicWidth(this, intrinsicMeasureScope, list, i);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i3 = 0;
            if (size == 1) {
                Placeable mo4545measureBRTryo0 = measurables.get(0).mo4545measureBRTryo0(j);
                return MeasureScope.CC.layout$default(Layout, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$2(mo4545measureBRTryo0), 4, null);
            }
            ArrayList arrayList = new ArrayList(measurables.size());
            int size2 = measurables.size();
            for (int i4 = 0; i4 < size2; i4++) {
                arrayList.add(measurables.get(i4).mo4545measureBRTryo0(j));
            }
            ArrayList arrayList2 = arrayList;
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (lastIndex >= 0) {
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    Placeable placeable = (Placeable) arrayList2.get(i3);
                    i5 = Math.max(i5, placeable.getWidth());
                    i6 = Math.max(i6, placeable.getHeight());
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
                i = i5;
                i2 = i6;
            } else {
                i = 0;
                i2 = 0;
            }
            return MeasureScope.CC.layout$default(Layout, i, i2, null, new ExposedDropdownMenuPopupKt$SimpleStack$1$measure$3(arrayList2), 4, null);
        }
        return MeasureScope.CC.layout$default(Layout, 0, 0, null, ExposedDropdownMenuPopupKt$SimpleStack$1$measure$1.INSTANCE, 4, null);
    }
}
