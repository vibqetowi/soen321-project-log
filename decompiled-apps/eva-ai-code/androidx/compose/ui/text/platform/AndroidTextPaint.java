package androidx.compose.ui.text.platform;

import android.text.TextPaint;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.ShaderBrush;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AndroidTextPaint.android.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J/\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020\u0005ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020)ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013J\u0010\u0010-\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0010\u0010.\u001a\u00020\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dR4\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f*\u0004\b\n\u0010\u000bR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0014\u001a\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "<set-?>", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU$delegate", "(Landroidx/compose/ui/text/platform/AndroidTextPaint;)Ljava/lang/Object;", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "composePaint", "Landroidx/compose/ui/graphics/Paint;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release$annotations", "()V", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", TtmlNode.ATTR_TTS_TEXT_DECORATION, "Landroidx/compose/ui/text/style/TextDecoration;", "setBrush", "", "brush", "Landroidx/compose/ui/graphics/Brush;", "size", "Landroidx/compose/ui/geometry/Size;", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setColor", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setDrawStyle", "setShadow", "setTextDecoration", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AndroidTextPaint extends TextPaint {
    private final Paint composePaint;
    private DrawStyle drawStyle;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    public AndroidTextPaint(int i, float f) {
        super(i);
        this.density = f;
        this.composePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.textDecoration = TextDecoration.Companion.getNone();
        this.shadow = Shadow.Companion.getNone();
    }

    public final Shadow getShadow$ui_text_release() {
        return this.shadow;
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        Intrinsics.checkNotNullParameter(shadow, "<set-?>");
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        setUnderlineText(textDecoration.contains(TextDecoration.Companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(TextDecoration.Companion.getLineThrough()));
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.Companion.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m3018getXimpl(this.shadow.m3617getOffsetF1C5BW0()), Offset.m3019getYimpl(this.shadow.m3617getOffsetF1C5BW0()), ColorKt.m3345toArgb8_81llA(this.shadow.m3616getColor0d7_KjU()));
        }
    }

    /* renamed from: setBrush-12SF9DM$default  reason: not valid java name */
    public static /* synthetic */ void m5339setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        androidTextPaint.m5342setBrush12SF9DM(brush, j, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if ((r9 != androidx.compose.ui.geometry.Size.Companion.m3095getUnspecifiedNHjbRc()) != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r0 = r7.composePaint;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (java.lang.Float.isNaN(r11) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0036, code lost:
        r11 = r7.composePaint.getAlpha();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        r11 = kotlin.ranges.RangesKt.coerceIn(r11, 0.0f, 1.0f);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        r8.mo3238applyToPq9zytI(r9, r0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if ((((androidx.compose.ui.graphics.SolidColor) r8).m3626getValue0d7_KjU() != androidx.compose.ui.graphics.Color.Companion.m3327getUnspecified0d7_KjU()) == false) goto L15;
     */
    /* renamed from: setBrush-12SF9DM  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5342setBrush12SF9DM(Brush brush, long j, float f) {
        if (brush instanceof SolidColor) {
        }
        if (brush instanceof ShaderBrush) {
        }
        if (brush == null) {
            this.composePaint.setShader(null);
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            this.composePaint.mo3143setStylek9PVt8s(PaintingStyle.Companion.m3558getFillTiuSbCo());
        } else if (drawStyle instanceof Stroke) {
            this.composePaint.mo3143setStylek9PVt8s(PaintingStyle.Companion.m3559getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            this.composePaint.setStrokeWidth(stroke.getWidth());
            this.composePaint.setStrokeMiterLimit(stroke.getMiter());
            this.composePaint.mo3142setStrokeJoinWw9F2mQ(stroke.m3909getJoinLxFBmk8());
            this.composePaint.mo3141setStrokeCapBeK7IIE(stroke.m3908getCapKaPHkGw());
            this.composePaint.setPathEffect(stroke.getPathEffect());
        }
    }

    /* renamed from: getBlendMode-0nO6VwU  reason: not valid java name */
    public final int m5340getBlendMode0nO6VwU() {
        return this.composePaint.mo3132getBlendMode0nO6VwU();
    }

    /* renamed from: setBlendMode-s9anfk8  reason: not valid java name */
    public final void m5341setBlendModes9anfk8(int i) {
        this.composePaint.mo3138setBlendModes9anfk8(i);
    }

    /* renamed from: setColor-8_81llA  reason: not valid java name */
    public final void m5343setColor8_81llA(long j) {
        if (j != Color.Companion.m3327getUnspecified0d7_KjU()) {
            this.composePaint.mo3139setColor8_81llA(j);
            this.composePaint.setShader(null);
        }
    }
}
