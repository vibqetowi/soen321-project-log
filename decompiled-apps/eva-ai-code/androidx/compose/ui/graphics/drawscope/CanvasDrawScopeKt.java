package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: CanvasDrawScope.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"DefaultDensity", "Landroidx/compose/ui/unit/Density;", "asDrawTransform", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "Landroidx/compose/ui/graphics/drawscope/DrawContext;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CanvasDrawScopeKt {
    private static final Density DefaultDensity = DensityKt.Density(1.0f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final DrawTransform asDrawTransform(final DrawContext drawContext) {
        return new DrawTransform() { // from class: androidx.compose.ui.graphics.drawscope.CanvasDrawScopeKt$asDrawTransform$1
            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getSize-NH-jbRc  reason: not valid java name */
            public long mo3773getSizeNHjbRc() {
                return DrawContext.this.mo3768getSizeNHjbRc();
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: getCenter-F1C5BW0  reason: not valid java name */
            public long mo3772getCenterF1C5BW0() {
                return SizeKt.m3097getCenteruvyYCjk(mo3773getSizeNHjbRc());
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void inset(float f, float f2, float f3, float f4) {
                Canvas canvas = DrawContext.this.getCanvas();
                DrawContext drawContext2 = DrawContext.this;
                long Size = SizeKt.Size(Size.m3087getWidthimpl(mo3773getSizeNHjbRc()) - (f3 + f), Size.m3084getHeightimpl(mo3773getSizeNHjbRc()) - (f4 + f2));
                if (!(Size.m3087getWidthimpl(Size) >= 0.0f && Size.m3084getHeightimpl(Size) >= 0.0f)) {
                    throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
                }
                drawContext2.mo3769setSizeuvyYCjk(Size);
                canvas.translate(f, f2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipRect-N_I0leg  reason: not valid java name */
            public void mo3771clipRectN_I0leg(float f, float f2, float f3, float f4, int i) {
                DrawContext.this.getCanvas().mo3113clipRectN_I0leg(f, f2, f3, f4, i);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: clipPath-mtrdD-E  reason: not valid java name */
            public void mo3770clipPathmtrdDE(Path path, int i) {
                Intrinsics.checkNotNullParameter(path, "path");
                DrawContext.this.getCanvas().mo3112clipPathmtrdDE(path, i);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            public void translate(float f, float f2) {
                DrawContext.this.getCanvas().translate(f, f2);
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: rotate-Uv8p0NA  reason: not valid java name */
            public void mo3774rotateUv8p0NA(float f, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j));
                canvas.rotate(f);
                canvas.translate(-Offset.m3018getXimpl(j), -Offset.m3019getYimpl(j));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: scale-0AR0LA0  reason: not valid java name */
            public void mo3775scale0AR0LA0(float f, float f2, long j) {
                Canvas canvas = DrawContext.this.getCanvas();
                canvas.translate(Offset.m3018getXimpl(j), Offset.m3019getYimpl(j));
                canvas.scale(f, f2);
                canvas.translate(-Offset.m3018getXimpl(j), -Offset.m3019getYimpl(j));
            }

            @Override // androidx.compose.ui.graphics.drawscope.DrawTransform
            /* renamed from: transform-58bKbWc  reason: not valid java name */
            public void mo3776transform58bKbWc(float[] matrix) {
                Intrinsics.checkNotNullParameter(matrix, "matrix");
                DrawContext.this.getCanvas().mo3115concat58bKbWc(matrix);
            }
        };
    }
}
