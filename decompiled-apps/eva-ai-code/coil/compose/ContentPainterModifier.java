package coil.compose;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorValueInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: ContentPainterModifier.kt */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0014\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J\t\u0010\u0016\u001a\u00020\tHÂ\u0003J\t\u0010\u0017\u001a\u00020\u000bHÂ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\rHÂ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u001d\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010\u0013J\t\u0010$\u001a\u00020%HÖ\u0001J\f\u0010&\u001a\u00020'*\u00020(H\u0016J\u001c\u0010)\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0016J\u001c\u0010.\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001fH\u0016J)\u00100\u001a\u000201*\u0002022\u0006\u0010+\u001a\u0002032\u0006\u0010\"\u001a\u00020!H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u001fH\u0016J\u001c\u00107\u001a\u00020\u001f*\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010/\u001a\u00020\u001fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00068"}, d2 = {"Lcoil/compose/ContentPainterModifier;", "Landroidx/compose/ui/layout/LayoutModifier;", "Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/platform/InspectorValueInfo;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "coil-compose-base_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ContentPainterModifier extends InspectorValueInfo implements LayoutModifier, DrawModifier {
    private final Alignment alignment;
    private final float alpha;
    private final ColorFilter colorFilter;
    private final ContentScale contentScale;
    private final Painter painter;

    private final Painter component1() {
        return this.painter;
    }

    private final Alignment component2() {
        return this.alignment;
    }

    private final ContentScale component3() {
        return this.contentScale;
    }

    private final float component4() {
        return this.alpha;
    }

    private final ColorFilter component5() {
        return this.colorFilter;
    }

    public static /* synthetic */ ContentPainterModifier copy$default(ContentPainterModifier contentPainterModifier, Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, Object obj) {
        if ((i & 1) != 0) {
            painter = contentPainterModifier.painter;
        }
        if ((i & 2) != 0) {
            alignment = contentPainterModifier.alignment;
        }
        Alignment alignment2 = alignment;
        if ((i & 4) != 0) {
            contentScale = contentPainterModifier.contentScale;
        }
        ContentScale contentScale2 = contentScale;
        if ((i & 8) != 0) {
            f = contentPainterModifier.alpha;
        }
        float f2 = f;
        if ((i & 16) != 0) {
            colorFilter = contentPainterModifier.colorFilter;
        }
        return contentPainterModifier.copy(painter, alignment2, contentScale2, f2, colorFilter);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return Modifier.Element.CC.$default$all(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return Modifier.Element.CC.$default$any(this, function1);
    }

    public final ContentPainterModifier copy(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        return new ContentPainterModifier(painter, alignment, contentScale, f, colorFilter);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContentPainterModifier) {
            ContentPainterModifier contentPainterModifier = (ContentPainterModifier) obj;
            return Intrinsics.areEqual(this.painter, contentPainterModifier.painter) && Intrinsics.areEqual(this.alignment, contentPainterModifier.alignment) && Intrinsics.areEqual(this.contentScale, contentPainterModifier.contentScale) && Float.compare(this.alpha, contentPainterModifier.alpha) == 0 && Intrinsics.areEqual(this.colorFilter, contentPainterModifier.colorFilter);
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldIn(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return Modifier.Element.CC.$default$foldOut(this, obj, function2);
    }

    public int hashCode() {
        int hashCode = ((((((this.painter.hashCode() * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.floatToIntBits(this.alpha)) * 31;
        ColorFilter colorFilter = this.colorFilter;
        return hashCode + (colorFilter == null ? 0 : colorFilter.hashCode());
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return Modifier.CC.$default$then(this, modifier);
    }

    public String toString() {
        return "ContentPainterModifier(painter=" + this.painter + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo298measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(m6167modifyConstraintsZezNO4M(j));
        return MeasureScope.CC.layout$default(measureScope, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new ContentPainterModifier$measure$1(mo4545measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo3914getIntrinsicSizeNHjbRc() != Size.Companion.m3095getUnspecifiedNHjbRc()) {
            int minIntrinsicWidth = intrinsicMeasurable.minIntrinsicWidth(Constraints.m5550getMaxHeightimpl(m6167modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m3087getWidthimpl(m6166calculateScaledSizeE7KxVPU(SizeKt.Size(minIntrinsicWidth, i)))), minIntrinsicWidth);
        }
        return intrinsicMeasurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo3914getIntrinsicSizeNHjbRc() != Size.Companion.m3095getUnspecifiedNHjbRc()) {
            int maxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(Constraints.m5550getMaxHeightimpl(m6167modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null))));
            return Math.max(MathKt.roundToInt(Size.m3087getWidthimpl(m6166calculateScaledSizeE7KxVPU(SizeKt.Size(maxIntrinsicWidth, i)))), maxIntrinsicWidth);
        }
        return intrinsicMeasurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo3914getIntrinsicSizeNHjbRc() != Size.Companion.m3095getUnspecifiedNHjbRc()) {
            int minIntrinsicHeight = intrinsicMeasurable.minIntrinsicHeight(Constraints.m5551getMaxWidthimpl(m6167modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m3084getHeightimpl(m6166calculateScaledSizeE7KxVPU(SizeKt.Size(i, minIntrinsicHeight)))), minIntrinsicHeight);
        }
        return intrinsicMeasurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        if (this.painter.mo3914getIntrinsicSizeNHjbRc() != Size.Companion.m3095getUnspecifiedNHjbRc()) {
            int maxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(Constraints.m5551getMaxWidthimpl(m6167modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null))));
            return Math.max(MathKt.roundToInt(Size.m3084getHeightimpl(m6166calculateScaledSizeE7KxVPU(SizeKt.Size(i, maxIntrinsicHeight)))), maxIntrinsicHeight);
        }
        return intrinsicMeasurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m6166calculateScaledSizeE7KxVPU(long j) {
        if (Size.m3089isEmptyimpl(j)) {
            return Size.Companion.m3096getZeroNHjbRc();
        }
        long mo3914getIntrinsicSizeNHjbRc = this.painter.mo3914getIntrinsicSizeNHjbRc();
        boolean z = true;
        if (mo3914getIntrinsicSizeNHjbRc == Size.Companion.m3095getUnspecifiedNHjbRc()) {
            return j;
        }
        float m3087getWidthimpl = Size.m3087getWidthimpl(mo3914getIntrinsicSizeNHjbRc);
        if (!((Float.isInfinite(m3087getWidthimpl) || Float.isNaN(m3087getWidthimpl)) ? false : true)) {
            m3087getWidthimpl = Size.m3087getWidthimpl(j);
        }
        float m3084getHeightimpl = Size.m3084getHeightimpl(mo3914getIntrinsicSizeNHjbRc);
        if (Float.isInfinite(m3084getHeightimpl) || Float.isNaN(m3084getHeightimpl)) {
            z = false;
        }
        if (!z) {
            m3084getHeightimpl = Size.m3084getHeightimpl(j);
        }
        long Size = SizeKt.Size(m3087getWidthimpl, m3084getHeightimpl);
        return ScaleFactorKt.m4638timesUQTWf7w(Size, this.contentScale.mo4536computeScaleFactorH7hwNQA(Size, j));
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m6167modifyConstraintsZezNO4M(long j) {
        float m6188constrainWidthK40F9xA;
        int m5552getMinHeightimpl;
        float m6187constrainHeightK40F9xA;
        boolean m5549getHasFixedWidthimpl = Constraints.m5549getHasFixedWidthimpl(j);
        boolean m5548getHasFixedHeightimpl = Constraints.m5548getHasFixedHeightimpl(j);
        if (m5549getHasFixedWidthimpl && m5548getHasFixedHeightimpl) {
            return j;
        }
        boolean z = true;
        boolean z2 = Constraints.m5547getHasBoundedWidthimpl(j) && Constraints.m5546getHasBoundedHeightimpl(j);
        long mo3914getIntrinsicSizeNHjbRc = this.painter.mo3914getIntrinsicSizeNHjbRc();
        if (mo3914getIntrinsicSizeNHjbRc == Size.Companion.m3095getUnspecifiedNHjbRc()) {
            return z2 ? Constraints.m5542copyZbe2FdA$default(j, Constraints.m5551getMaxWidthimpl(j), 0, Constraints.m5550getMaxHeightimpl(j), 0, 10, null) : j;
        }
        if (z2 && (m5549getHasFixedWidthimpl || m5548getHasFixedHeightimpl)) {
            m6188constrainWidthK40F9xA = Constraints.m5551getMaxWidthimpl(j);
            m5552getMinHeightimpl = Constraints.m5550getMaxHeightimpl(j);
        } else {
            float m3087getWidthimpl = Size.m3087getWidthimpl(mo3914getIntrinsicSizeNHjbRc);
            float m3084getHeightimpl = Size.m3084getHeightimpl(mo3914getIntrinsicSizeNHjbRc);
            m6188constrainWidthK40F9xA = !Float.isInfinite(m3087getWidthimpl) && !Float.isNaN(m3087getWidthimpl) ? UtilsKt.m6188constrainWidthK40F9xA(j, m3087getWidthimpl) : Constraints.m5553getMinWidthimpl(j);
            if (Float.isInfinite(m3084getHeightimpl) || Float.isNaN(m3084getHeightimpl)) {
                z = false;
            }
            if (!z) {
                m5552getMinHeightimpl = Constraints.m5552getMinHeightimpl(j);
            } else {
                m6187constrainHeightK40F9xA = UtilsKt.m6187constrainHeightK40F9xA(j, m3084getHeightimpl);
                long m6166calculateScaledSizeE7KxVPU = m6166calculateScaledSizeE7KxVPU(SizeKt.Size(m6188constrainWidthK40F9xA, m6187constrainHeightK40F9xA));
                return Constraints.m5542copyZbe2FdA$default(j, ConstraintsKt.m5565constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m3087getWidthimpl(m6166calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5564constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m3084getHeightimpl(m6166calculateScaledSizeE7KxVPU))), 0, 10, null);
            }
        }
        m6187constrainHeightK40F9xA = m5552getMinHeightimpl;
        long m6166calculateScaledSizeE7KxVPU2 = m6166calculateScaledSizeE7KxVPU(SizeKt.Size(m6188constrainWidthK40F9xA, m6187constrainHeightK40F9xA));
        return Constraints.m5542copyZbe2FdA$default(j, ConstraintsKt.m5565constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m3087getWidthimpl(m6166calculateScaledSizeE7KxVPU2))), 0, ConstraintsKt.m5564constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m3084getHeightimpl(m6166calculateScaledSizeE7KxVPU2))), 0, 10, null);
    }

    @Override // androidx.compose.ui.draw.DrawModifier
    public void draw(ContentDrawScope contentDrawScope) {
        long m6166calculateScaledSizeE7KxVPU = m6166calculateScaledSizeE7KxVPU(contentDrawScope.mo3762getSizeNHjbRc());
        long mo2908alignKFBX0sM = this.alignment.mo2908alignKFBX0sM(UtilsKt.m6189toIntSizeuvyYCjk(m6166calculateScaledSizeE7KxVPU), UtilsKt.m6189toIntSizeuvyYCjk(contentDrawScope.mo3762getSizeNHjbRc()), contentDrawScope.getLayoutDirection());
        ContentDrawScope contentDrawScope2 = contentDrawScope;
        float m5717component1impl = IntOffset.m5717component1impl(mo2908alignKFBX0sM);
        float m5718component2impl = IntOffset.m5718component2impl(mo2908alignKFBX0sM);
        contentDrawScope2.getDrawContext().getTransform().translate(m5717component1impl, m5718component2impl);
        this.painter.m3920drawx_KDEd0(contentDrawScope2, m6166calculateScaledSizeE7KxVPU, this.alpha, this.colorFilter);
        contentDrawScope2.getDrawContext().getTransform().translate(-m5717component1impl, -m5718component2impl);
        contentDrawScope.drawContent();
    }

    public ContentPainterModifier(Painter painter, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        super(InspectableValueKt.isDebugInspectorInfoEnabled() ? new ContentPainterModifier$special$$inlined$debugInspectorInfo$1(painter, alignment, contentScale, f, colorFilter) : InspectableValueKt.getNoInspectorInfo());
        this.painter = painter;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }
}
