package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.ConstraintsKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Intrinsic.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J)\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u0013\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016J)\u0010\u0015\u001a\u00020\u0016*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u001c\u0010\u001a\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fH\u0016R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/IntrinsicSizeModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "enforceIncoming", "", "getEnforceIncoming", "()Z", "calculateContentConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureScope;", "measurable", "Landroidx/compose/ui/layout/Measurable;", "constraints", "calculateContentConstraints-l58MMJ0", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface IntrinsicSizeModifier extends LayoutModifier {
    /* renamed from: calculateContentConstraints-l58MMJ0 */
    long mo701calculateContentConstraintsl58MMJ0(MeasureScope measureScope, Measurable measurable, long j);

    boolean getEnforceIncoming();

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    MeasureResult mo298measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i);

    @Override // androidx.compose.ui.layout.LayoutModifier
    int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i);

    /* compiled from: Intrinsic.kt */
    /* renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static boolean $default$getEnforceIncoming(IntrinsicSizeModifier _this) {
            return true;
        }

        /* renamed from: $default$measure-3p2s80s */
        public static MeasureResult m702$default$measure3p2s80s(IntrinsicSizeModifier _this, MeasureScope measure, Measurable measurable, long j) {
            Intrinsics.checkNotNullParameter(measure, "$this$measure");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            long mo701calculateContentConstraintsl58MMJ0 = _this.mo701calculateContentConstraintsl58MMJ0(measure, measurable, j);
            if (_this.getEnforceIncoming()) {
                mo701calculateContentConstraintsl58MMJ0 = ConstraintsKt.m5563constrainN9IONVI(j, mo701calculateContentConstraintsl58MMJ0);
            }
            Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(mo701calculateContentConstraintsl58MMJ0);
            return MeasureScope.CC.layout$default(measure, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new IntrinsicSizeModifier$measure$1(mo4545measureBRTryo0), 4, null);
        }

        public static int $default$minIntrinsicWidth(IntrinsicSizeModifier _this, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicWidth(i);
        }

        public static int $default$minIntrinsicHeight(IntrinsicSizeModifier _this, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.minIntrinsicHeight(i);
        }

        public static int $default$maxIntrinsicWidth(IntrinsicSizeModifier _this, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicWidth(i);
        }

        public static int $default$maxIntrinsicHeight(IntrinsicSizeModifier _this, IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return measurable.maxIntrinsicHeight(i);
        }
    }
}
