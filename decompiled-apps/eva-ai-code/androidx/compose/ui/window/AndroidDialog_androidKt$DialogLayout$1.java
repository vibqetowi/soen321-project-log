package androidx.compose.ui.window;

import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidDialog.android.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class AndroidDialog_androidKt$DialogLayout$1 implements MeasurePolicy {
    public static final AndroidDialog_androidKt$DialogLayout$1 INSTANCE = new AndroidDialog_androidKt$DialogLayout$1();

    AndroidDialog_androidKt$DialogLayout$1() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v18 */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
        Object obj;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(measurables.get(i).mo4545measureBRTryo0(j));
        }
        ArrayList arrayList2 = arrayList;
        Placeable placeable = null;
        int i2 = 1;
        if (arrayList2.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList2.get(0);
            int width = ((Placeable) obj).getWidth();
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (1 <= lastIndex) {
                int i3 = 1;
                while (true) {
                    Object obj2 = arrayList2.get(i3);
                    int width2 = ((Placeable) obj2).getWidth();
                    if (width < width2) {
                        obj = obj2;
                        width = width2;
                    }
                    if (i3 == lastIndex) {
                        break;
                    }
                    i3++;
                }
            }
        }
        Placeable placeable2 = (Placeable) obj;
        int width3 = placeable2 != null ? placeable2.getWidth() : Constraints.m5553getMinWidthimpl(j);
        if (!arrayList2.isEmpty()) {
            Object obj3 = arrayList2.get(0);
            int height = ((Placeable) obj3).getHeight();
            int lastIndex2 = CollectionsKt.getLastIndex(arrayList2);
            Object obj4 = obj3;
            if (1 <= lastIndex2) {
                while (true) {
                    Object obj5 = arrayList2.get(i2);
                    int height2 = ((Placeable) obj5).getHeight();
                    obj3 = obj4;
                    if (height < height2) {
                        obj3 = obj5;
                        height = height2;
                    }
                    if (i2 == lastIndex2) {
                        break;
                    }
                    i2++;
                    obj4 = obj3;
                }
            }
            placeable = obj3;
        }
        Placeable placeable3 = placeable;
        return MeasureScope.CC.layout$default(Layout, width3, placeable3 != null ? placeable3.getHeight() : Constraints.m5552getMinHeightimpl(j), null, new AndroidDialog_androidKt$DialogLayout$1$measure$1(arrayList2), 4, null);
    }
}
