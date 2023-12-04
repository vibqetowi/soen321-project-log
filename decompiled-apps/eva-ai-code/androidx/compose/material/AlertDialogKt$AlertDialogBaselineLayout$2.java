package androidx.compose.material;

import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AlertDialog.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n"}, d2 = {"Landroidx/compose/ui/layout/MeasureScope;", "", "Landroidx/compose/ui/layout/Measurable;", "measurables", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogBaselineLayout$2 implements MeasurePolicy {
    public static final AlertDialogKt$AlertDialogBaselineLayout$2 INSTANCE = new AlertDialogKt$AlertDialogBaselineLayout$2();

    AlertDialogKt$AlertDialogBaselineLayout$2() {
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

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0123  */
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MeasureResult mo272measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j) {
        Object obj;
        Object obj2;
        int i;
        int i2;
        long j2;
        int i3;
        int i4;
        long j3;
        int i5;
        int i6;
        long j4;
        Intrinsics.checkNotNullParameter(Layout, "$this$Layout");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "title")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo4545measureBRTryo0 = measurable != null ? measurable.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "text")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo4545measureBRTryo02 = measurable2 != null ? measurable2.mo4545measureBRTryo0(Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 11, null)) : null;
        int max = Math.max(mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getWidth() : 0, mo4545measureBRTryo02 != null ? mo4545measureBRTryo02.getWidth() : 0);
        if (mo4545measureBRTryo0 != null) {
            int intValue = Integer.valueOf(mo4545measureBRTryo0.get(AlignmentLineKt.getFirstBaseline())).intValue();
            Integer valueOf = intValue == Integer.MIN_VALUE ? null : Integer.valueOf(intValue);
            if (valueOf != null) {
                i = valueOf.intValue();
                if (mo4545measureBRTryo0 != null) {
                    int i7 = mo4545measureBRTryo0.get(AlignmentLineKt.getLastBaseline());
                    Integer valueOf2 = i7 == Integer.MIN_VALUE ? null : Integer.valueOf(i7);
                    if (valueOf2 != null) {
                        i2 = valueOf2.intValue();
                        j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                        i3 = Layout.mo581roundToPxR2X_6o(j2) - i;
                        if (mo4545measureBRTryo02 != null) {
                            int i8 = mo4545measureBRTryo02.get(AlignmentLineKt.getFirstBaseline());
                            Integer valueOf3 = i8 != Integer.MIN_VALUE ? Integer.valueOf(i8) : null;
                            if (valueOf3 != null) {
                                i4 = valueOf3.intValue();
                                if (mo4545measureBRTryo0 != null) {
                                    j4 = AlertDialogKt.TextBaselineDistanceFromTop;
                                    i5 = Layout.mo581roundToPxR2X_6o(j4);
                                } else {
                                    j3 = AlertDialogKt.TextBaselineDistanceFromTitle;
                                    i5 = Layout.mo581roundToPxR2X_6o(j3);
                                }
                                int height = mo4545measureBRTryo0 == null ? mo4545measureBRTryo0.getHeight() + i3 : 0;
                                if (mo4545measureBRTryo0 != null) {
                                    i6 = i5 - i4;
                                } else {
                                    i6 = (i2 == 0 ? height - i4 : (i3 + i2) - i4) + i5;
                                }
                                if (mo4545measureBRTryo02 != null) {
                                    if (i2 == 0) {
                                        r14 = (mo4545measureBRTryo02.getHeight() + i5) - i4;
                                    } else {
                                        r14 = ((mo4545measureBRTryo02.getHeight() + i5) - i4) - ((mo4545measureBRTryo0 != null ? mo4545measureBRTryo0.getHeight() : 0) - i2);
                                    }
                                }
                                return MeasureScope.CC.layout$default(Layout, max, r14 + height, null, new AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(mo4545measureBRTryo0, i3, mo4545measureBRTryo02, i6), 4, null);
                            }
                        }
                        i4 = 0;
                        if (mo4545measureBRTryo0 != null) {
                        }
                        if (mo4545measureBRTryo0 == null) {
                        }
                        if (mo4545measureBRTryo0 != null) {
                        }
                        if (mo4545measureBRTryo02 != null) {
                        }
                        return MeasureScope.CC.layout$default(Layout, max, r14 + height, null, new AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(mo4545measureBRTryo0, i3, mo4545measureBRTryo02, i6), 4, null);
                    }
                }
                i2 = 0;
                j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
                i3 = Layout.mo581roundToPxR2X_6o(j2) - i;
                if (mo4545measureBRTryo02 != null) {
                }
                i4 = 0;
                if (mo4545measureBRTryo0 != null) {
                }
                if (mo4545measureBRTryo0 == null) {
                }
                if (mo4545measureBRTryo0 != null) {
                }
                if (mo4545measureBRTryo02 != null) {
                }
                return MeasureScope.CC.layout$default(Layout, max, r14 + height, null, new AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(mo4545measureBRTryo0, i3, mo4545measureBRTryo02, i6), 4, null);
            }
        }
        i = 0;
        if (mo4545measureBRTryo0 != null) {
        }
        i2 = 0;
        j2 = AlertDialogKt.TitleBaselineDistanceFromTop;
        i3 = Layout.mo581roundToPxR2X_6o(j2) - i;
        if (mo4545measureBRTryo02 != null) {
        }
        i4 = 0;
        if (mo4545measureBRTryo0 != null) {
        }
        if (mo4545measureBRTryo0 == null) {
        }
        if (mo4545measureBRTryo0 != null) {
        }
        if (mo4545measureBRTryo02 != null) {
        }
        return MeasureScope.CC.layout$default(Layout, max, r14 + height, null, new AlertDialogKt$AlertDialogBaselineLayout$2$measure$1(mo4545measureBRTryo0, i3, mo4545measureBRTryo02, i6), 4, null);
    }
}
