package androidx.compose.foundation;

import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.ImageBitmapConfig;
import androidx.compose.ui.graphics.ImageBitmapKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
/* compiled from: Border.kt */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JI\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R/\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, brush, shape);
    }

    private BorderModifierNode(float f, Brush brushParameter, Shape shapeParameter) {
        Intrinsics.checkNotNullParameter(brushParameter, "brushParameter");
        Intrinsics.checkNotNullParameter(shapeParameter, "shapeParameter");
        this.width = f;
        this.brush = brushParameter;
        this.shape = shapeParameter;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new BorderModifierNode$drawWithCacheModifierNode$1(this)));
    }

    /* renamed from: getWidth-D9Ej5fM  reason: not valid java name */
    public final float m439getWidthD9Ej5fM() {
        return this.width;
    }

    /* renamed from: setWidth-0680j_4  reason: not valid java name */
    public final void m440setWidth0680j_4(float f) {
        if (Dp.m5612equalsimpl0(this.width, f)) {
            return;
        }
        this.width = f;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final void setBrush(Brush value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.brush, value)) {
            return;
        }
        this.brush = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.shape, value)) {
            return;
        }
        this.shape = value;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00da, code lost:
        if (androidx.compose.ui.graphics.ImageBitmapConfig.m3508equalsimpl(r14, r5 != null ? androidx.compose.ui.graphics.ImageBitmapConfig.m3506boximpl(r5.mo3127getConfig_sVssgQ()) : null) != false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final DrawResult drawGenericBorder(CacheDrawScope cacheDrawScope, Brush brush, Outline.Generic generic, boolean z, float f) {
        int m3514getArgb8888_sVssgQ;
        ColorFilter colorFilter;
        ?? r12;
        Canvas canvas;
        if (z) {
            return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawGenericBorder$1(generic, brush));
        }
        if (brush instanceof SolidColor) {
            m3514getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m3513getAlpha8_sVssgQ();
            colorFilter = ColorFilter.Companion.m3332tintxETnrds$default(ColorFilter.Companion, ((SolidColor) brush).m3626getValue0d7_KjU(), 0, 2, null);
        } else {
            m3514getArgb8888_sVssgQ = ImageBitmapConfig.Companion.m3514getArgb8888_sVssgQ();
            colorFilter = null;
        }
        Rect bounds = generic.getPath().getBounds();
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        Path obtainPath = borderCache.obtainPath();
        obtainPath.reset();
        obtainPath.addRect(bounds);
        obtainPath.mo3152opN5in7k0(obtainPath, generic.getPath(), PathOperation.Companion.m3583getDifferenceb3I0S0c());
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        long IntSize = IntSizeKt.IntSize((int) Math.ceil(bounds.getWidth()), (int) Math.ceil(bounds.getHeight()));
        BorderCache borderCache2 = this.borderCache;
        Intrinsics.checkNotNull(borderCache2);
        ImageBitmap imageBitmap = borderCache2.imageBitmap;
        Canvas canvas2 = borderCache2.canvas;
        ImageBitmapConfig m3506boximpl = imageBitmap != null ? ImageBitmapConfig.m3506boximpl(imageBitmap.mo3127getConfig_sVssgQ()) : null;
        boolean z2 = false;
        if (!(m3506boximpl == null ? false : ImageBitmapConfig.m3509equalsimpl0(m3506boximpl.m3512unboximpl(), ImageBitmapConfig.Companion.m3514getArgb8888_sVssgQ()))) {
        }
        z2 = true;
        if (imageBitmap == null || canvas2 == null || Size.m3087getWidthimpl(cacheDrawScope.m2924getSizeNHjbRc()) > imageBitmap.getWidth() || Size.m3084getHeightimpl(cacheDrawScope.m2924getSizeNHjbRc()) > imageBitmap.getHeight() || !z2) {
            ImageBitmap m3519ImageBitmapx__hDU$default = ImageBitmapKt.m3519ImageBitmapx__hDU$default(IntSize.m5767getWidthimpl(IntSize), IntSize.m5766getHeightimpl(IntSize), m3514getArgb8888_sVssgQ, false, null, 24, null);
            borderCache2.imageBitmap = m3519ImageBitmapx__hDU$default;
            Canvas Canvas = androidx.compose.ui.graphics.CanvasKt.Canvas(m3519ImageBitmapx__hDU$default);
            borderCache2.canvas = Canvas;
            r12 = m3519ImageBitmapx__hDU$default;
            canvas = Canvas;
        } else {
            r12 = imageBitmap;
            canvas = canvas2;
        }
        CanvasDrawScope canvasDrawScope = borderCache2.canvasDrawScope;
        if (canvasDrawScope == null) {
            canvasDrawScope = new CanvasDrawScope();
            borderCache2.canvasDrawScope = canvasDrawScope;
        }
        CanvasDrawScope canvasDrawScope2 = canvasDrawScope;
        long m5777toSizeozmzZPI = IntSizeKt.m5777toSizeozmzZPI(IntSize);
        LayoutDirection layoutDirection = cacheDrawScope.getLayoutDirection();
        CanvasDrawScope.DrawParams drawParams = canvasDrawScope2.getDrawParams();
        Density component1 = drawParams.component1();
        LayoutDirection component2 = drawParams.component2();
        Canvas component3 = drawParams.component3();
        long m3764component4NHjbRc = drawParams.m3764component4NHjbRc();
        CanvasDrawScope.DrawParams drawParams2 = canvasDrawScope2.getDrawParams();
        drawParams2.setDensity(cacheDrawScope);
        drawParams2.setLayoutDirection(layoutDirection);
        drawParams2.setCanvas(canvas);
        drawParams2.m3767setSizeuvyYCjk(m5777toSizeozmzZPI);
        canvas.save();
        CanvasDrawScope canvasDrawScope3 = canvasDrawScope2;
        DrawScope.CC.m3842drawRectnJ9OG0$default(canvasDrawScope3, Color.Companion.m3317getBlack0d7_KjU(), 0L, m5777toSizeozmzZPI, 0.0f, null, null, BlendMode.Companion.m3208getClear0nO6VwU(), 58, null);
        float f2 = -bounds.getLeft();
        float f3 = -bounds.getTop();
        canvasDrawScope3.getDrawContext().getTransform().translate(f2, f3);
        DrawScope.CC.m3837drawPathGBMwjPU$default(canvasDrawScope3, generic.getPath(), brush, 0.0f, new Stroke(f * 2, 0.0f, 0, 0, null, 30, null), null, 0, 52, null);
        float f4 = 1;
        float m3087getWidthimpl = (Size.m3087getWidthimpl(canvasDrawScope3.mo3762getSizeNHjbRc()) + f4) / Size.m3087getWidthimpl(canvasDrawScope3.mo3762getSizeNHjbRc());
        float m3084getHeightimpl = (Size.m3084getHeightimpl(canvasDrawScope3.mo3762getSizeNHjbRc()) + f4) / Size.m3084getHeightimpl(canvasDrawScope3.mo3762getSizeNHjbRc());
        long mo3761getCenterF1C5BW0 = canvasDrawScope3.mo3761getCenterF1C5BW0();
        DrawContext drawContext = canvasDrawScope3.getDrawContext();
        long mo3768getSizeNHjbRc = drawContext.mo3768getSizeNHjbRc();
        drawContext.getCanvas().save();
        drawContext.getTransform().mo3775scale0AR0LA0(m3087getWidthimpl, m3084getHeightimpl, mo3761getCenterF1C5BW0);
        DrawScope.CC.m3837drawPathGBMwjPU$default(canvasDrawScope3, obtainPath, brush, 0.0f, null, null, BlendMode.Companion.m3208getClear0nO6VwU(), 28, null);
        drawContext.getCanvas().restore();
        drawContext.mo3769setSizeuvyYCjk(mo3768getSizeNHjbRc);
        canvasDrawScope3.getDrawContext().getTransform().translate(-f2, -f3);
        canvas.restore();
        CanvasDrawScope.DrawParams drawParams3 = canvasDrawScope2.getDrawParams();
        drawParams3.setDensity(component1);
        drawParams3.setLayoutDirection(component2);
        drawParams3.setCanvas(component3);
        drawParams3.m3767setSizeuvyYCjk(m3764component4NHjbRc);
        r12.prepareToDraw();
        objectRef.element = r12;
        return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawGenericBorder$3(bounds, objectRef, IntSize, colorFilter));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck  reason: not valid java name */
    public final DrawResult m438drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, Brush brush, Outline.Rounded rounded, long j, long j2, boolean z, float f) {
        Path createRoundRectPath;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$1(z, brush, rounded.getRoundRect().m3068getTopLeftCornerRadiuskKHJgLs(), f / 2, f, j, j2, new Stroke(f, 0.0f, 0, 0, null, 30, null)));
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        createRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f, z);
        return cacheDrawScope.onDrawWithContent(new BorderModifierNode$drawRoundRectBorder$2(createRoundRectPath, brush));
    }
}
