package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OutlinedTextField.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B4\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J/\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1<Size, Unit> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> onLabelMeasured, boolean z, float f, PaddingValues paddingValues) {
        Intrinsics.checkNotNullParameter(onLabelMeasured, "onLabelMeasured");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        this.onLabelMeasured = onLabelMeasured;
        this.singleLine = z;
        this.animationProgress = f;
        this.paddingValues = paddingValues;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo272measure3p2s80s(MeasureScope measure, List<? extends Measurable> measurables, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Placeable placeable;
        Placeable placeable2;
        Object obj5;
        Object obj6;
        Object obj7;
        int m1919calculateWidthDHJA7U0;
        int m1918calculateHeightDHJA7U0;
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        int i2 = measure.mo582roundToPx0680j_4(this.paddingValues.mo697calculateBottomPaddingD9Ej5fM());
        long m5542copyZbe2FdA$default = Constraints.m5542copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        List<? extends Measurable> list = measurables;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj), "Leading")) {
                break;
            }
        }
        Measurable measurable = (Measurable) obj;
        Placeable mo4545measureBRTryo0 = measurable != null ? measurable.mo4545measureBRTryo0(m5542copyZbe2FdA$default) : null;
        int widthOrZero = TextFieldImplKt.widthOrZero(mo4545measureBRTryo0) + 0;
        int max = Math.max(0, TextFieldImplKt.heightOrZero(mo4545measureBRTryo0));
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj2), "Trailing")) {
                break;
            }
        }
        Measurable measurable2 = (Measurable) obj2;
        Placeable mo4545measureBRTryo02 = measurable2 != null ? measurable2.mo4545measureBRTryo0(ConstraintsKt.m5568offsetNN6EwU$default(m5542copyZbe2FdA$default, -widthOrZero, 0, 2, null)) : null;
        int widthOrZero2 = widthOrZero + TextFieldImplKt.widthOrZero(mo4545measureBRTryo02);
        int max2 = Math.max(max, TextFieldImplKt.heightOrZero(mo4545measureBRTryo02));
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj3), TextFieldImplKt.PrefixId)) {
                break;
            }
        }
        Measurable measurable3 = (Measurable) obj3;
        Placeable mo4545measureBRTryo03 = measurable3 != null ? measurable3.mo4545measureBRTryo0(ConstraintsKt.m5568offsetNN6EwU$default(m5542copyZbe2FdA$default, -widthOrZero2, 0, 2, null)) : null;
        int widthOrZero3 = widthOrZero2 + TextFieldImplKt.widthOrZero(mo4545measureBRTryo03);
        int max3 = Math.max(max2, TextFieldImplKt.heightOrZero(mo4545measureBRTryo03));
        Iterator<T> it4 = list.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj4), TextFieldImplKt.SuffixId)) {
                break;
            }
        }
        Measurable measurable4 = (Measurable) obj4;
        if (measurable4 != null) {
            i = max3;
            placeable = measurable4.mo4545measureBRTryo0(ConstraintsKt.m5568offsetNN6EwU$default(m5542copyZbe2FdA$default, -widthOrZero3, 0, 2, null));
        } else {
            i = max3;
            placeable = null;
        }
        int widthOrZero4 = widthOrZero3 + TextFieldImplKt.widthOrZero(placeable);
        int max4 = Math.max(i, TextFieldImplKt.heightOrZero(placeable));
        boolean z = this.animationProgress < 1.0f;
        int i3 = measure.mo582roundToPx0680j_4(this.paddingValues.mo698calculateLeftPaddingu2uoSUM(measure.getLayoutDirection())) + measure.mo582roundToPx0680j_4(this.paddingValues.mo699calculateRightPaddingu2uoSUM(measure.getLayoutDirection()));
        int i4 = z ? (-widthOrZero4) - i3 : -i3;
        int i5 = -i2;
        long m5567offsetNN6EwU = ConstraintsKt.m5567offsetNN6EwU(m5542copyZbe2FdA$default, i4, i5);
        Iterator<T> it5 = list.iterator();
        while (true) {
            if (!it5.hasNext()) {
                placeable2 = placeable;
                obj5 = null;
                break;
            }
            obj5 = it5.next();
            placeable2 = placeable;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj5), "Label")) {
                break;
            }
            placeable = placeable2;
        }
        Measurable measurable5 = (Measurable) obj5;
        Placeable mo4545measureBRTryo04 = measurable5 != null ? measurable5.mo4545measureBRTryo0(m5567offsetNN6EwU) : null;
        if (mo4545measureBRTryo04 != null) {
            this.onLabelMeasured.invoke(Size.m3075boximpl(SizeKt.Size(mo4545measureBRTryo04.getWidth(), mo4545measureBRTryo04.getHeight())));
        }
        int max5 = Math.max(TextFieldImplKt.heightOrZero(mo4545measureBRTryo04) / 2, measure.mo582roundToPx0680j_4(this.paddingValues.mo700calculateTopPaddingD9Ej5fM()));
        long m5542copyZbe2FdA$default2 = Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5567offsetNN6EwU(j, -widthOrZero4, i5 - max5), 0, 0, 0, 0, 11, null);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            Measurable measurable6 = (Measurable) it6.next();
            Iterator it7 = it6;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), "TextField")) {
                Placeable mo4545measureBRTryo05 = measurable6.mo4545measureBRTryo0(m5542copyZbe2FdA$default2);
                long m5542copyZbe2FdA$default3 = Constraints.m5542copyZbe2FdA$default(m5542copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                Iterator it8 = list.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    Object next = it8.next();
                    Iterator it9 = it8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) next), "Hint")) {
                        obj6 = next;
                        break;
                    }
                    it8 = it9;
                }
                Measurable measurable7 = (Measurable) obj6;
                Placeable mo4545measureBRTryo06 = measurable7 != null ? measurable7.mo4545measureBRTryo0(m5542copyZbe2FdA$default3) : null;
                long m5542copyZbe2FdA$default4 = Constraints.m5542copyZbe2FdA$default(ConstraintsKt.m5568offsetNN6EwU$default(m5542copyZbe2FdA$default, 0, -Math.max(max4, Math.max(TextFieldImplKt.heightOrZero(mo4545measureBRTryo05), TextFieldImplKt.heightOrZero(mo4545measureBRTryo06)) + max5 + i2), 1, null), 0, 0, 0, 0, 11, null);
                Iterator<T> it10 = list.iterator();
                while (true) {
                    if (!it10.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it10.next();
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId((Measurable) obj7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                }
                Measurable measurable8 = (Measurable) obj7;
                Placeable mo4545measureBRTryo07 = measurable8 != null ? measurable8.mo4545measureBRTryo0(m5542copyZbe2FdA$default4) : null;
                int heightOrZero = TextFieldImplKt.heightOrZero(mo4545measureBRTryo07);
                m1919calculateWidthDHJA7U0 = OutlinedTextFieldKt.m1919calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(mo4545measureBRTryo0), TextFieldImplKt.widthOrZero(mo4545measureBRTryo02), TextFieldImplKt.widthOrZero(mo4545measureBRTryo03), TextFieldImplKt.widthOrZero(placeable2), mo4545measureBRTryo05.getWidth(), TextFieldImplKt.widthOrZero(mo4545measureBRTryo04), TextFieldImplKt.widthOrZero(mo4545measureBRTryo06), z, j, measure.getDensity(), this.paddingValues);
                m1918calculateHeightDHJA7U0 = OutlinedTextFieldKt.m1918calculateHeightDHJA7U0(TextFieldImplKt.heightOrZero(mo4545measureBRTryo0), TextFieldImplKt.heightOrZero(mo4545measureBRTryo02), TextFieldImplKt.heightOrZero(mo4545measureBRTryo03), TextFieldImplKt.heightOrZero(placeable2), mo4545measureBRTryo05.getHeight(), TextFieldImplKt.heightOrZero(mo4545measureBRTryo04), TextFieldImplKt.heightOrZero(mo4545measureBRTryo06), TextFieldImplKt.heightOrZero(mo4545measureBRTryo07), j, measure.getDensity(), this.paddingValues);
                int i6 = m1918calculateHeightDHJA7U0 - heightOrZero;
                for (Measurable measurable9 : list) {
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable9), TextFieldImplKt.ContainerId)) {
                        return MeasureScope.CC.layout$default(measure, m1919calculateWidthDHJA7U0, m1918calculateHeightDHJA7U0, null, new OutlinedTextFieldMeasurePolicy$measure$2(m1918calculateHeightDHJA7U0, m1919calculateWidthDHJA7U0, mo4545measureBRTryo0, mo4545measureBRTryo02, mo4545measureBRTryo03, placeable2, mo4545measureBRTryo05, mo4545measureBRTryo04, mo4545measureBRTryo06, measurable9.mo4545measureBRTryo0(ConstraintsKt.Constraints(m1919calculateWidthDHJA7U0 != Integer.MAX_VALUE ? m1919calculateWidthDHJA7U0 : 0, m1919calculateWidthDHJA7U0, i6 != Integer.MAX_VALUE ? i6 : 0, i6)), mo4545measureBRTryo07, this, measure), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            it6 = it7;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicHeight(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicHeight$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$maxIntrinsicWidth$1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> measurables, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        return intrinsicWidth(intrinsicMeasureScope, measurables, i, OutlinedTextFieldMeasurePolicy$minIntrinsicWidth$1.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int m1919calculateWidthDHJA7U0;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj7 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), "TextField")) {
                int intValue = function2.invoke(obj7, Integer.valueOf(i)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int intValue5 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it5.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int intValue6 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    Object next = it6.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj;
                m1919calculateWidthDHJA7U0 = OutlinedTextFieldKt.m1919calculateWidthDHJA7U0(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intrinsicMeasurable6 != null ? function2.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0, this.animationProgress < 1.0f, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1919calculateWidthDHJA7U0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int m1918calculateHeightDHJA7U0;
        List<? extends IntrinsicMeasurable> list2 = list;
        for (Object obj8 : list2) {
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj8), "TextField")) {
                int intValue = function2.invoke(obj8, Integer.valueOf(i)).intValue();
                Iterator<T> it = list2.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj2), "Label")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) obj2;
                int intValue2 = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it2.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj3), "Trailing")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) obj3;
                int intValue3 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it3.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj4), "Leading")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) obj4;
                int intValue4 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj5 = null;
                        break;
                    }
                    obj5 = it4.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) obj5;
                int intValue5 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it5 = list2.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj6 = null;
                        break;
                    }
                    obj6 = it5.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) obj6;
                int intValue6 = intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it6 = list2.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj7 = null;
                        break;
                    }
                    obj7 = it6.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) obj7), "Hint")) {
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable6 = (IntrinsicMeasurable) obj7;
                int intValue7 = intrinsicMeasurable6 != null ? function2.invoke(intrinsicMeasurable6, Integer.valueOf(i)).intValue() : 0;
                Iterator<T> it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        break;
                    }
                    Object next = it7.next();
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId((IntrinsicMeasurable) next), TextFieldImplKt.SupportingId)) {
                        obj = next;
                        break;
                    }
                }
                IntrinsicMeasurable intrinsicMeasurable7 = (IntrinsicMeasurable) obj;
                m1918calculateHeightDHJA7U0 = OutlinedTextFieldKt.m1918calculateHeightDHJA7U0(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, intValue7, intrinsicMeasurable7 != null ? function2.invoke(intrinsicMeasurable7, Integer.valueOf(i)).intValue() : 0, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
                return m1918calculateHeightDHJA7U0;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
