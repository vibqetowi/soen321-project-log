package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
/* compiled from: OutlineResolver.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.J\u001b\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u001fø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u00102J\u001b\u00103\u001a\u00020,2\u0006\u0010$\u001a\u00020\u001cø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b4\u00105J6\u00103\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020#2\u0006\u00106\u001a\u00020!2\u0006\u0010+\u001a\u00020\u00062\u0006\u00107\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003J\b\u00108\u001a\u00020,H\u0002J\u0010\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\nH\u0002J\u0010\u0010;\u001a\u00020,2\u0006\u0010<\u001a\u00020=H\u0002J\u0010\u0010>\u001a\u00020,2\u0006\u0010?\u001a\u00020(H\u0002J3\u0010@\u001a\u00020\u0006*\u0004\u0018\u00010(2\u0006\u0010A\u001a\u00020\u001f2\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010B\u001a\u00020!H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\bC\u0010DR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010\u001b\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0019\u0010\u001e\u001a\u00020\u001fX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u0010$\u001a\u00020\u001cX\u0082\u000eø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\n\u0002\u0010\u001dR\u0010\u0010%\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/ui/platform/OutlineResolver;", "", "density", "Landroidx/compose/ui/unit/Density;", "(Landroidx/compose/ui/unit/Density;)V", "cacheIsDirty", "", "cachedOutline", "Landroid/graphics/Outline;", "cachedRrectPath", "Landroidx/compose/ui/graphics/Path;", "calculatedOutline", "Landroidx/compose/ui/graphics/Outline;", "clipPath", "getClipPath", "()Landroidx/compose/ui/graphics/Path;", "isSupportedOutline", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroid/graphics/Outline;", "outlineClipSupported", "getOutlineClipSupported", "()Z", "outlineNeeded", "outlinePath", "rectSize", "Landroidx/compose/ui/geometry/Size;", "J", "rectTopLeft", "Landroidx/compose/ui/geometry/Offset;", "roundedCornerRadius", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "size", "tmpOpPath", "tmpPath", "tmpRoundRect", "Landroidx/compose/ui/geometry/RoundRect;", "tmpTouchPointPath", "usePathForClip", "clipToOutline", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "isInOutline", "position", "isInOutline-k-4lQ0M", "(J)Z", "update", "update-uvyYCjk", "(J)V", "alpha", "elevation", "updateCache", "updateCacheWithPath", "composePath", "updateCacheWithRect", "rect", "Landroidx/compose/ui/geometry/Rect;", "updateCacheWithRoundRect", "roundRect", "isSameBounds", TypedValues.CycleType.S_WAVE_OFFSET, "radius", "isSameBounds-4L21HEs", "(Landroidx/compose/ui/geometry/RoundRect;JJF)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OutlineResolver {
    private boolean cacheIsDirty;
    private final Outline cachedOutline;
    private Path cachedRrectPath;
    private androidx.compose.ui.graphics.Outline calculatedOutline;
    private Density density;
    private boolean isSupportedOutline;
    private LayoutDirection layoutDirection;
    private boolean outlineNeeded;
    private Path outlinePath;
    private long rectSize;
    private long rectTopLeft;
    private float roundedCornerRadius;
    private Shape shape;
    private long size;
    private Path tmpOpPath;
    private Path tmpPath;
    private RoundRect tmpRoundRect;
    private Path tmpTouchPointPath;
    private boolean usePathForClip;

    public OutlineResolver(Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        this.density = density;
        this.isSupportedOutline = true;
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.cachedOutline = outline;
        this.size = Size.Companion.m3096getZeroNHjbRc();
        this.shape = RectangleShapeKt.getRectangleShape();
        this.rectTopLeft = Offset.Companion.m3034getZeroF1C5BW0();
        this.rectSize = Size.Companion.m3096getZeroNHjbRc();
        this.layoutDirection = LayoutDirection.Ltr;
    }

    public final Outline getOutline() {
        updateCache();
        if (this.outlineNeeded && this.isSupportedOutline) {
            return this.cachedOutline;
        }
        return null;
    }

    public final boolean getOutlineClipSupported() {
        return !this.usePathForClip;
    }

    public final Path getClipPath() {
        updateCache();
        return this.outlinePath;
    }

    public final boolean update(Shape shape, float f, boolean z, float f2, LayoutDirection layoutDirection, Density density) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        this.cachedOutline.setAlpha(f);
        boolean z2 = !Intrinsics.areEqual(this.shape, shape);
        if (z2) {
            this.shape = shape;
            this.cacheIsDirty = true;
        }
        boolean z3 = z || f2 > 0.0f;
        if (this.outlineNeeded != z3) {
            this.outlineNeeded = z3;
            this.cacheIsDirty = true;
        }
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            this.cacheIsDirty = true;
        }
        if (!Intrinsics.areEqual(this.density, density)) {
            this.density = density;
            this.cacheIsDirty = true;
        }
        return z2;
    }

    /* renamed from: isInOutline-k-4lQ0M  reason: not valid java name */
    public final boolean m4896isInOutlinek4lQ0M(long j) {
        androidx.compose.ui.graphics.Outline outline;
        if (this.outlineNeeded && (outline = this.calculatedOutline) != null) {
            return ShapeContainingUtilKt.isInOutline(outline, Offset.m3018getXimpl(j), Offset.m3019getYimpl(j), this.tmpTouchPointPath, this.tmpOpPath);
        }
        return true;
    }

    public final void clipToOutline(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Path clipPath = getClipPath();
        if (clipPath != null) {
            Canvas.CC.m3263clipPathmtrdDE$default(canvas, clipPath, 0, 2, null);
            return;
        }
        float f = this.roundedCornerRadius;
        if (f > 0.0f) {
            Path path = this.tmpPath;
            RoundRect roundRect = this.tmpRoundRect;
            if (path == null || !m4895isSameBounds4L21HEs(roundRect, this.rectTopLeft, this.rectSize, f)) {
                RoundRect m3072RoundRectgG7oq9Y = RoundRectKt.m3072RoundRectgG7oq9Y(Offset.m3018getXimpl(this.rectTopLeft), Offset.m3019getYimpl(this.rectTopLeft), Offset.m3018getXimpl(this.rectTopLeft) + Size.m3087getWidthimpl(this.rectSize), Offset.m3019getYimpl(this.rectTopLeft) + Size.m3084getHeightimpl(this.rectSize), CornerRadiusKt.CornerRadius$default(this.roundedCornerRadius, 0.0f, 2, null));
                if (path == null) {
                    path = AndroidPath_androidKt.Path();
                } else {
                    path.reset();
                }
                path.addRoundRect(m3072RoundRectgG7oq9Y);
                this.tmpRoundRect = m3072RoundRectgG7oq9Y;
                this.tmpPath = path;
            }
            Canvas.CC.m3263clipPathmtrdDE$default(canvas, path, 0, 2, null);
            return;
        }
        Canvas.CC.m3264clipRectN_I0leg$default(canvas, Offset.m3018getXimpl(this.rectTopLeft), Offset.m3019getYimpl(this.rectTopLeft), Offset.m3018getXimpl(this.rectTopLeft) + Size.m3087getWidthimpl(this.rectSize), Offset.m3019getYimpl(this.rectTopLeft) + Size.m3084getHeightimpl(this.rectSize), 0, 16, null);
    }

    /* renamed from: update-uvyYCjk  reason: not valid java name */
    public final void m4897updateuvyYCjk(long j) {
        if (Size.m3083equalsimpl0(this.size, j)) {
            return;
        }
        this.size = j;
        this.cacheIsDirty = true;
    }

    private final void updateCache() {
        if (this.cacheIsDirty) {
            this.rectTopLeft = Offset.Companion.m3034getZeroF1C5BW0();
            long j = this.size;
            this.rectSize = j;
            this.roundedCornerRadius = 0.0f;
            this.outlinePath = null;
            this.cacheIsDirty = false;
            this.usePathForClip = false;
            if (this.outlineNeeded && Size.m3087getWidthimpl(j) > 0.0f && Size.m3084getHeightimpl(this.size) > 0.0f) {
                this.isSupportedOutline = true;
                androidx.compose.ui.graphics.Outline mo470createOutlinePq9zytI = this.shape.mo470createOutlinePq9zytI(this.size, this.layoutDirection, this.density);
                this.calculatedOutline = mo470createOutlinePq9zytI;
                if (mo470createOutlinePq9zytI instanceof Outline.Rectangle) {
                    updateCacheWithRect(((Outline.Rectangle) mo470createOutlinePq9zytI).getRect());
                    return;
                } else if (mo470createOutlinePq9zytI instanceof Outline.Rounded) {
                    updateCacheWithRoundRect(((Outline.Rounded) mo470createOutlinePq9zytI).getRoundRect());
                    return;
                } else if (mo470createOutlinePq9zytI instanceof Outline.Generic) {
                    updateCacheWithPath(((Outline.Generic) mo470createOutlinePq9zytI).getPath());
                    return;
                } else {
                    return;
                }
            }
            this.cachedOutline.setEmpty();
        }
    }

    private final void updateCacheWithRect(Rect rect) {
        this.rectTopLeft = OffsetKt.Offset(rect.getLeft(), rect.getTop());
        this.rectSize = SizeKt.Size(rect.getWidth(), rect.getHeight());
        this.cachedOutline.setRect(MathKt.roundToInt(rect.getLeft()), MathKt.roundToInt(rect.getTop()), MathKt.roundToInt(rect.getRight()), MathKt.roundToInt(rect.getBottom()));
    }

    private final void updateCacheWithRoundRect(RoundRect roundRect) {
        float m2993getXimpl = CornerRadius.m2993getXimpl(roundRect.m3068getTopLeftCornerRadiuskKHJgLs());
        this.rectTopLeft = OffsetKt.Offset(roundRect.getLeft(), roundRect.getTop());
        this.rectSize = SizeKt.Size(roundRect.getWidth(), roundRect.getHeight());
        if (RoundRectKt.isSimple(roundRect)) {
            this.cachedOutline.setRoundRect(MathKt.roundToInt(roundRect.getLeft()), MathKt.roundToInt(roundRect.getTop()), MathKt.roundToInt(roundRect.getRight()), MathKt.roundToInt(roundRect.getBottom()), m2993getXimpl);
            this.roundedCornerRadius = m2993getXimpl;
            return;
        }
        Path path = this.cachedRrectPath;
        if (path == null) {
            path = AndroidPath_androidKt.Path();
            this.cachedRrectPath = path;
        }
        path.reset();
        path.addRoundRect(roundRect);
        updateCacheWithPath(path);
    }

    private final void updateCacheWithPath(Path path) {
        if (Build.VERSION.SDK_INT > 28 || path.isConvex()) {
            android.graphics.Outline outline = this.cachedOutline;
            if (path instanceof AndroidPath) {
                outline.setConvexPath(((AndroidPath) path).getInternalPath());
                this.usePathForClip = !this.cachedOutline.canClip();
            } else {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
        } else {
            this.isSupportedOutline = false;
            this.cachedOutline.setEmpty();
            this.usePathForClip = true;
        }
        this.outlinePath = path;
    }

    /* renamed from: isSameBounds-4L21HEs  reason: not valid java name */
    private final boolean m4895isSameBounds4L21HEs(RoundRect roundRect, long j, long j2, float f) {
        if (roundRect == null || !RoundRectKt.isSimple(roundRect)) {
            return false;
        }
        if (roundRect.getLeft() == Offset.m3018getXimpl(j)) {
            if (roundRect.getTop() == Offset.m3019getYimpl(j)) {
                if (roundRect.getRight() == Offset.m3018getXimpl(j) + Size.m3087getWidthimpl(j2)) {
                    if (roundRect.getBottom() == Offset.m3019getYimpl(j) + Size.m3084getHeightimpl(j2)) {
                        return (CornerRadius.m2993getXimpl(roundRect.m3068getTopLeftCornerRadiuskKHJgLs()) > f ? 1 : (CornerRadius.m2993getXimpl(roundRect.m3068getTopLeftCornerRadiuskKHJgLs()) == f ? 0 : -1)) == 0;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
