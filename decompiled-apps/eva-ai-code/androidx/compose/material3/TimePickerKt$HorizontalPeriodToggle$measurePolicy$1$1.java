package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 implements MeasurePolicy {
    public static final TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1 INSTANCE = new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1();

    TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1() {
    }

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
    public final MeasureResult mo272measure3p2s80s(MeasureScope MeasurePolicy, List<? extends Measurable> measurables, long j) {
        Intrinsics.checkNotNullParameter(MeasurePolicy, "$this$MeasurePolicy");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        for (Measurable measurable : list) {
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "Spacer")) {
                Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, MathKt.roundToInt(MeasurePolicy.mo588toPx0680j_4(TimePickerTokens.INSTANCE.m2760getPeriodSelectorOutlineWidthD9Ej5fM())), 0, 0, 12, null));
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Spacer")) {
                        arrayList.add(obj);
                    }
                }
                ArrayList<Measurable> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (Measurable measurable2 : arrayList2) {
                    arrayList3.add(measurable2.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, Constraints.m5551getMaxWidthimpl(j) / 2, 0, 0, 12, null)));
                }
                return MeasureScope.CC.layout$default(MeasurePolicy, Constraints.m5551getMaxWidthimpl(j), Constraints.m5550getMaxHeightimpl(j), null, new TimePickerKt$HorizontalPeriodToggle$measurePolicy$1$1$measure$1(arrayList3, mo4545measureBRTryo0), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
