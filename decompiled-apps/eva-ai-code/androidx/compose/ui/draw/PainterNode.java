package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001d\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101J\u001d\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0019\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b<\u0010=J\u0019\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J)\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "maxIntrinsicWidth", ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        DrawModifierNode.CC.$default$onMeasureResultChanged(this);
    }

    public final Painter getPainter() {
        return this.painter;
    }

    public final void setPainter(Painter painter) {
        Intrinsics.checkNotNullParameter(painter, "<set-?>");
        this.painter = painter;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i & 4) != 0 ? Alignment.Companion.getCenter() : alignment, (i & 8) != 0 ? ContentScale.Companion.getInside() : contentScale, (i & 16) != 0 ? 1.0f : f, (i & 32) != 0 ? null : colorFilter);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final void setAlignment(Alignment alignment) {
        Intrinsics.checkNotNullParameter(alignment, "<set-?>");
        this.alignment = alignment;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final void setContentScale(ContentScale contentScale) {
        Intrinsics.checkNotNullParameter(contentScale, "<set-?>");
        this.contentScale = contentScale;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f, ColorFilter colorFilter) {
        Intrinsics.checkNotNullParameter(painter, "painter");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(contentScale, "contentScale");
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f;
        this.colorFilter = colorFilter;
    }

    private final boolean getUseIntrinsicSize() {
        if (this.sizeToIntrinsics) {
            return (this.painter.mo3914getIntrinsicSizeNHjbRc() > Size.Companion.m3095getUnspecifiedNHjbRc() ? 1 : (this.painter.mo3914getIntrinsicSizeNHjbRc() == Size.Companion.m3095getUnspecifiedNHjbRc() ? 0 : -1)) != 0;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo500measure3p2s80s(MeasureScope measure, Measurable measurable, long j) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable mo4545measureBRTryo0 = measurable.mo4545measureBRTryo0(m2928modifyConstraintsZezNO4M(j));
        return MeasureScope.CC.layout$default(measure, mo4545measureBRTryo0.getWidth(), mo4545measureBRTryo0.getHeight(), null, new PainterNode$measure$1(mo4545measureBRTryo0), 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m2928modifyConstraintsZezNO4M = m2928modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m5553getMinWidthimpl(m2928modifyConstraintsZezNO4M), measurable.minIntrinsicWidth(i));
        }
        return measurable.minIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m2928modifyConstraintsZezNO4M = m2928modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i, 7, null));
            return Math.max(Constraints.m5553getMinWidthimpl(m2928modifyConstraintsZezNO4M), measurable.maxIntrinsicWidth(i));
        }
        return measurable.maxIntrinsicWidth(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m2928modifyConstraintsZezNO4M = m2928modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m5552getMinHeightimpl(m2928modifyConstraintsZezNO4M), measurable.minIntrinsicHeight(i));
        }
        return measurable.minIntrinsicHeight(i);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        if (getUseIntrinsicSize()) {
            long m2928modifyConstraintsZezNO4M = m2928modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i, 0, 0, 13, null));
            return Math.max(Constraints.m5552getMinHeightimpl(m2928modifyConstraintsZezNO4M), measurable.maxIntrinsicHeight(i));
        }
        return measurable.maxIntrinsicHeight(i);
    }

    /* renamed from: calculateScaledSize-E7KxVPU  reason: not valid java name */
    private final long m2925calculateScaledSizeE7KxVPU(long j) {
        float m3087getWidthimpl;
        float m3084getHeightimpl;
        if (getUseIntrinsicSize()) {
            if (!m2927hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.mo3914getIntrinsicSizeNHjbRc())) {
                m3087getWidthimpl = Size.m3087getWidthimpl(j);
            } else {
                m3087getWidthimpl = Size.m3087getWidthimpl(this.painter.mo3914getIntrinsicSizeNHjbRc());
            }
            if (!m2926hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.mo3914getIntrinsicSizeNHjbRc())) {
                m3084getHeightimpl = Size.m3084getHeightimpl(j);
            } else {
                m3084getHeightimpl = Size.m3084getHeightimpl(this.painter.mo3914getIntrinsicSizeNHjbRc());
            }
            long Size = SizeKt.Size(m3087getWidthimpl, m3084getHeightimpl);
            if (!(Size.m3087getWidthimpl(j) == 0.0f)) {
                if (!(Size.m3084getHeightimpl(j) == 0.0f)) {
                    return ScaleFactorKt.m4638timesUQTWf7w(Size, this.contentScale.mo4536computeScaleFactorH7hwNQA(Size, j));
                }
            }
            return Size.Companion.m3096getZeroNHjbRc();
        }
        return j;
    }

    /* renamed from: modifyConstraints-ZezNO4M  reason: not valid java name */
    private final long m2928modifyConstraintsZezNO4M(long j) {
        int m5553getMinWidthimpl;
        int m5552getMinHeightimpl;
        boolean z = true;
        boolean z2 = Constraints.m5547getHasBoundedWidthimpl(j) && Constraints.m5546getHasBoundedHeightimpl(j);
        if (!Constraints.m5549getHasFixedWidthimpl(j) || !Constraints.m5548getHasFixedHeightimpl(j)) {
            z = false;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m5542copyZbe2FdA$default(j, Constraints.m5551getMaxWidthimpl(j), 0, Constraints.m5550getMaxHeightimpl(j), 0, 10, null);
        }
        long mo3914getIntrinsicSizeNHjbRc = this.painter.mo3914getIntrinsicSizeNHjbRc();
        if (m2927hasSpecifiedAndFiniteWidthuvyYCjk(mo3914getIntrinsicSizeNHjbRc)) {
            m5553getMinWidthimpl = MathKt.roundToInt(Size.m3087getWidthimpl(mo3914getIntrinsicSizeNHjbRc));
        } else {
            m5553getMinWidthimpl = Constraints.m5553getMinWidthimpl(j);
        }
        if (m2926hasSpecifiedAndFiniteHeightuvyYCjk(mo3914getIntrinsicSizeNHjbRc)) {
            m5552getMinHeightimpl = MathKt.roundToInt(Size.m3084getHeightimpl(mo3914getIntrinsicSizeNHjbRc));
        } else {
            m5552getMinHeightimpl = Constraints.m5552getMinHeightimpl(j);
        }
        long m2925calculateScaledSizeE7KxVPU = m2925calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m5565constrainWidthK40F9xA(j, m5553getMinWidthimpl), ConstraintsKt.m5564constrainHeightK40F9xA(j, m5552getMinHeightimpl)));
        return Constraints.m5542copyZbe2FdA$default(j, ConstraintsKt.m5565constrainWidthK40F9xA(j, MathKt.roundToInt(Size.m3087getWidthimpl(m2925calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m5564constrainHeightK40F9xA(j, MathKt.roundToInt(Size.m3084getHeightimpl(m2925calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float m3087getWidthimpl;
        float m3084getHeightimpl;
        long m3096getZeroNHjbRc;
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        long mo3914getIntrinsicSizeNHjbRc = this.painter.mo3914getIntrinsicSizeNHjbRc();
        if (m2927hasSpecifiedAndFiniteWidthuvyYCjk(mo3914getIntrinsicSizeNHjbRc)) {
            m3087getWidthimpl = Size.m3087getWidthimpl(mo3914getIntrinsicSizeNHjbRc);
        } else {
            m3087getWidthimpl = Size.m3087getWidthimpl(contentDrawScope.mo3762getSizeNHjbRc());
        }
        if (m2926hasSpecifiedAndFiniteHeightuvyYCjk(mo3914getIntrinsicSizeNHjbRc)) {
            m3084getHeightimpl = Size.m3084getHeightimpl(mo3914getIntrinsicSizeNHjbRc);
        } else {
            m3084getHeightimpl = Size.m3084getHeightimpl(contentDrawScope.mo3762getSizeNHjbRc());
        }
        long Size = SizeKt.Size(m3087getWidthimpl, m3084getHeightimpl);
        if (!(Size.m3087getWidthimpl(contentDrawScope.mo3762getSizeNHjbRc()) == 0.0f)) {
            if (!(Size.m3084getHeightimpl(contentDrawScope.mo3762getSizeNHjbRc()) == 0.0f)) {
                m3096getZeroNHjbRc = ScaleFactorKt.m4638timesUQTWf7w(Size, this.contentScale.mo4536computeScaleFactorH7hwNQA(Size, contentDrawScope.mo3762getSizeNHjbRc()));
                long j = m3096getZeroNHjbRc;
                long mo2908alignKFBX0sM = this.alignment.mo2908alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(j)), MathKt.roundToInt(Size.m3084getHeightimpl(j))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(contentDrawScope.mo3762getSizeNHjbRc())), MathKt.roundToInt(Size.m3084getHeightimpl(contentDrawScope.mo3762getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
                float m5725getXimpl = IntOffset.m5725getXimpl(mo2908alignKFBX0sM);
                float m5726getYimpl = IntOffset.m5726getYimpl(mo2908alignKFBX0sM);
                ContentDrawScope contentDrawScope2 = contentDrawScope;
                contentDrawScope2.getDrawContext().getTransform().translate(m5725getXimpl, m5726getYimpl);
                this.painter.m3920drawx_KDEd0(contentDrawScope2, j, this.alpha, this.colorFilter);
                contentDrawScope2.getDrawContext().getTransform().translate(-m5725getXimpl, -m5726getYimpl);
                contentDrawScope.drawContent();
            }
        }
        m3096getZeroNHjbRc = Size.Companion.m3096getZeroNHjbRc();
        long j2 = m3096getZeroNHjbRc;
        long mo2908alignKFBX0sM2 = this.alignment.mo2908alignKFBX0sM(IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(j2)), MathKt.roundToInt(Size.m3084getHeightimpl(j2))), IntSizeKt.IntSize(MathKt.roundToInt(Size.m3087getWidthimpl(contentDrawScope.mo3762getSizeNHjbRc())), MathKt.roundToInt(Size.m3084getHeightimpl(contentDrawScope.mo3762getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float m5725getXimpl2 = IntOffset.m5725getXimpl(mo2908alignKFBX0sM2);
        float m5726getYimpl2 = IntOffset.m5726getYimpl(mo2908alignKFBX0sM2);
        ContentDrawScope contentDrawScope22 = contentDrawScope;
        contentDrawScope22.getDrawContext().getTransform().translate(m5725getXimpl2, m5726getYimpl2);
        this.painter.m3920drawx_KDEd0(contentDrawScope22, j2, this.alpha, this.colorFilter);
        contentDrawScope22.getDrawContext().getTransform().translate(-m5725getXimpl2, -m5726getYimpl2);
        contentDrawScope.drawContent();
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk  reason: not valid java name */
    private final boolean m2927hasSpecifiedAndFiniteWidthuvyYCjk(long j) {
        if (Size.m3083equalsimpl0(j, Size.Companion.m3095getUnspecifiedNHjbRc())) {
            return false;
        }
        float m3087getWidthimpl = Size.m3087getWidthimpl(j);
        return !Float.isInfinite(m3087getWidthimpl) && !Float.isNaN(m3087getWidthimpl);
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk  reason: not valid java name */
    private final boolean m2926hasSpecifiedAndFiniteHeightuvyYCjk(long j) {
        if (Size.m3083equalsimpl0(j, Size.Companion.m3095getUnspecifiedNHjbRc())) {
            return false;
        }
        float m3084getHeightimpl = Size.m3084getHeightimpl(j);
        return !Float.isInfinite(m3084getHeightimpl) && !Float.isNaN(m3084getHeightimpl);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
