package x6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
/* compiled from: PieChartRenderer.java */
/* loaded from: classes.dex */
public final class h extends d {

    /* renamed from: g  reason: collision with root package name */
    public final p6.c f37630g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f37631h;

    /* renamed from: i  reason: collision with root package name */
    public final Paint f37632i;

    /* renamed from: j  reason: collision with root package name */
    public final Paint f37633j;

    /* renamed from: k  reason: collision with root package name */
    public final TextPaint f37634k;

    /* renamed from: l  reason: collision with root package name */
    public final Paint f37635l;

    /* renamed from: m  reason: collision with root package name */
    public StaticLayout f37636m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f37637n;

    /* renamed from: o  reason: collision with root package name */
    public final RectF f37638o;

    /* renamed from: p  reason: collision with root package name */
    public final RectF[] f37639p;

    /* renamed from: q  reason: collision with root package name */
    public WeakReference<Bitmap> f37640q;
    public Canvas r;

    /* renamed from: s  reason: collision with root package name */
    public final Path f37641s;

    /* renamed from: t  reason: collision with root package name */
    public final RectF f37642t;

    /* renamed from: u  reason: collision with root package name */
    public final Path f37643u;

    /* renamed from: v  reason: collision with root package name */
    public final Path f37644v;

    /* renamed from: w  reason: collision with root package name */
    public final RectF f37645w;

    public h(p6.c cVar, n6.a aVar, y6.g gVar) {
        super(aVar, gVar);
        this.f37638o = new RectF();
        this.f37639p = new RectF[]{new RectF(), new RectF(), new RectF()};
        this.f37641s = new Path();
        this.f37642t = new RectF();
        this.f37643u = new Path();
        this.f37644v = new Path();
        this.f37645w = new RectF();
        this.f37630g = cVar;
        Paint paint = new Paint(1);
        this.f37631h = paint;
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f37632i = paint2;
        paint2.setColor(-1);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAlpha(R.styleable.AppCompatTheme_textAppearanceListItemSmall);
        TextPaint textPaint = new TextPaint(1);
        this.f37634k = textPaint;
        textPaint.setColor(-16777216);
        textPaint.setTextSize(y6.f.c(12.0f));
        this.f.setTextSize(y6.f.c(13.0f));
        this.f.setColor(-1);
        this.f.setTextAlign(Paint.Align.CENTER);
        Paint paint3 = new Paint(1);
        this.f37635l = paint3;
        paint3.setColor(-1);
        paint3.setTextAlign(Paint.Align.CENTER);
        paint3.setTextSize(y6.f.c(13.0f));
        Paint paint4 = new Paint(1);
        this.f37633j = paint4;
        paint4.setStyle(Paint.Style.STROKE);
    }

    public static float o(y6.c cVar, float f, float f2, float f10, float f11, float f12, float f13) {
        double d10 = (f12 + f13) * 0.017453292f;
        float cos = (((float) Math.cos(d10)) * f) + cVar.f38276b;
        float sin = (((float) Math.sin(d10)) * f) + cVar.f38277c;
        double d11 = ((f13 / 2.0f) + f12) * 0.017453292f;
        float cos2 = (((float) Math.cos(d11)) * f) + cVar.f38276b;
        float sin2 = (((float) Math.sin(d11)) * f) + cVar.f38277c;
        double pow = Math.pow(cos - f10, 2.0d);
        return (float) ((f - ((float) (Math.tan(((180.0d - f2) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(sin - f11, 2.0d) + pow) / 2.0d)))) - Math.sqrt(Math.pow(sin2 - ((sin + f11) / 2.0f), 2.0d) + Math.pow(cos2 - ((cos + f10) / 2.0f), 2.0d)));
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0124  */
    @Override // x6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Canvas canvas) {
        p6.c cVar;
        Iterator it;
        boolean z10;
        float f;
        float p10;
        p6.c cVar2;
        float f2;
        Iterator it2;
        h hVar;
        v6.g gVar;
        RectF rectF;
        int i6;
        float[] fArr;
        int i10;
        float f10;
        int i11;
        float f11;
        y6.c cVar3;
        boolean z11;
        boolean z12;
        float f12;
        float f13;
        int i12;
        y6.c cVar4;
        RectF rectF2;
        int i13;
        float f14;
        y6.g gVar2 = (y6.g) this.f16181b;
        int i14 = (int) gVar2.f38301c;
        int i15 = (int) gVar2.f38302d;
        WeakReference<Bitmap> weakReference = this.f37640q;
        if (weakReference == null || weakReference.get().getWidth() != i14 || this.f37640q.get().getHeight() != i15) {
            if (i14 > 0 && i15 > 0) {
                this.f37640q = new WeakReference<>(Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_4444));
                this.r = new Canvas(this.f37640q.get());
            } else {
                return;
            }
        }
        this.f37640q.get().eraseColor(0);
        p6.c cVar5 = this.f37630g;
        Iterator it3 = ((r6.l) cVar5.getData()).f30512i.iterator();
        h hVar2 = this;
        while (it3.hasNext()) {
            v6.g gVar3 = (v6.g) it3.next();
            if (gVar3.isVisible() && gVar3.c0() > 0) {
                float rotationAngle = cVar5.getRotationAngle();
                hVar2.f37621c.getClass();
                RectF circleBox = cVar5.getCircleBox();
                int c0 = gVar3.c0();
                float[] drawAngles = cVar5.getDrawAngles();
                y6.c centerCircleBox = cVar5.getCenterCircleBox();
                float radius = cVar5.getRadius();
                if (cVar5.f27939g0 && !cVar5.f27940h0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    f = (cVar5.getHoleRadius() / 100.0f) * radius;
                } else {
                    f = 0.0f;
                }
                int i16 = 0;
                for (int i17 = 0; i17 < c0; i17++) {
                    if (Math.abs(gVar3.x(i17).f30503u) > y6.f.f38293d) {
                        i16++;
                    }
                }
                if (i16 <= 1) {
                    p10 = 0.0f;
                } else {
                    p10 = hVar2.p(gVar3);
                }
                h hVar3 = hVar2;
                int i18 = 0;
                float f15 = 0.0f;
                while (i18 < c0) {
                    float f16 = drawAngles[i18];
                    if (Math.abs(gVar3.x(i18).a()) > y6.f.f38293d) {
                        if (!cVar5.m()) {
                            cVar2 = cVar5;
                            it2 = it3;
                            hVar = hVar2;
                        } else {
                            it2 = it3;
                            hVar = hVar2;
                            int i19 = 0;
                            while (true) {
                                t6.c[] cVarArr = cVar5.S;
                                cVar2 = cVar5;
                                if (i19 >= cVarArr.length) {
                                    break;
                                } else if (((int) cVarArr[i19].f32419a) == i18) {
                                    z11 = true;
                                    break;
                                } else {
                                    i19++;
                                    cVar5 = cVar2;
                                }
                            }
                            if (z11) {
                                if (p10 > 0.0f && f16 <= 180.0f) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                Paint paint = hVar3.f37622d;
                                paint.setColor(gVar3.B(i18));
                                if (i16 == 1) {
                                    f12 = 0.0f;
                                } else {
                                    f12 = p10 / (radius * 0.017453292f);
                                }
                                float f17 = (((f12 / 2.0f) + f15) * 1.0f) + rotationAngle;
                                float f18 = (f16 - f12) * 1.0f;
                                if (f18 < 0.0f) {
                                    gVar = gVar3;
                                    i6 = c0;
                                    f13 = 0.0f;
                                } else {
                                    gVar = gVar3;
                                    i6 = c0;
                                    f13 = f18;
                                }
                                Path path = hVar3.f37641s;
                                path.reset();
                                fArr = drawAngles;
                                int i20 = i16;
                                f2 = p10;
                                double d10 = f17 * 0.017453292f;
                                boolean z13 = z12;
                                float cos = (((float) Math.cos(d10)) * radius) + centerCircleBox.f38276b;
                                float sin = centerCircleBox.f38277c + (((float) Math.sin(d10)) * radius);
                                int i21 = (f13 > 360.0f ? 1 : (f13 == 360.0f ? 0 : -1));
                                if (i21 >= 0 && f13 % 360.0f <= y6.f.f38293d) {
                                    i12 = i18;
                                    path.addCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, radius, Path.Direction.CW);
                                } else {
                                    i12 = i18;
                                    path.moveTo(cos, sin);
                                    path.arcTo(circleBox, f17, f13);
                                }
                                RectF rectF3 = hVar3.f37642t;
                                float f19 = centerCircleBox.f38276b;
                                float f20 = centerCircleBox.f38277c;
                                rectF = circleBox;
                                rectF3.set(f19 - f, f20 - f, f19 + f, f20 + f);
                                if (z10 && (f > 0.0f || z13)) {
                                    if (z13) {
                                        i10 = i20;
                                        rectF2 = rectF3;
                                        f10 = f;
                                        i11 = i12;
                                        i13 = 1;
                                        f11 = radius;
                                        cVar4 = centerCircleBox;
                                        float o10 = o(centerCircleBox, radius, f16 * 1.0f, cos, sin, f17, f13);
                                        if (o10 < 0.0f) {
                                            o10 = -o10;
                                        }
                                        f = Math.max(f10, o10);
                                    } else {
                                        f10 = f;
                                        f11 = radius;
                                        cVar4 = centerCircleBox;
                                        i11 = i12;
                                        i10 = i20;
                                        rectF2 = rectF3;
                                        i13 = 1;
                                    }
                                    if (i10 != i13 && f != 0.0f) {
                                        f14 = f2 / (f * 0.017453292f);
                                    } else {
                                        f14 = 0.0f;
                                    }
                                    float f21 = (((f14 / 2.0f) + f15) * 1.0f) + rotationAngle;
                                    float f22 = (f16 - f14) * 1.0f;
                                    if (f22 < 0.0f) {
                                        f22 = 0.0f;
                                    }
                                    float f23 = f21 + f22;
                                    if (i21 >= 0 && f13 % 360.0f <= y6.f.f38293d) {
                                        path.addCircle(cVar4.f38276b, cVar4.f38277c, f, Path.Direction.CCW);
                                    } else {
                                        double d11 = 0.017453292f * f23;
                                        path.lineTo((((float) Math.cos(d11)) * f) + cVar4.f38276b, (f * ((float) Math.sin(d11))) + cVar4.f38277c);
                                        path.arcTo(rectF2, f23, -f22);
                                    }
                                    cVar3 = cVar4;
                                } else {
                                    f10 = f;
                                    f11 = radius;
                                    cVar3 = centerCircleBox;
                                    i11 = i12;
                                    i10 = i20;
                                    if (f13 % 360.0f > y6.f.f38293d) {
                                        if (z13) {
                                            float o11 = o(cVar3, f11, f16 * 1.0f, cos, sin, f17, f13);
                                            double d12 = 0.017453292f * ((f13 / 2.0f) + f17);
                                            path.lineTo((((float) Math.cos(d12)) * o11) + cVar3.f38276b, (o11 * ((float) Math.sin(d12))) + cVar3.f38277c);
                                        } else {
                                            path.lineTo(cVar3.f38276b, cVar3.f38277c);
                                        }
                                    }
                                }
                                path.close();
                                this.r.drawPath(path, paint);
                                hVar2 = this;
                                hVar3 = hVar2;
                                f15 = (f16 * 1.0f) + f15;
                                i18 = i11 + 1;
                                centerCircleBox = cVar3;
                                f = f10;
                                i16 = i10;
                                it3 = it2;
                                cVar5 = cVar2;
                                gVar3 = gVar;
                                c0 = i6;
                                drawAngles = fArr;
                                p10 = f2;
                                circleBox = rectF;
                                radius = f11;
                            } else {
                                f2 = p10;
                            }
                        }
                        z11 = false;
                        if (z11) {
                        }
                    } else {
                        cVar2 = cVar5;
                        f2 = p10;
                        it2 = it3;
                        hVar = hVar2;
                    }
                    gVar = gVar3;
                    rectF = circleBox;
                    i6 = c0;
                    fArr = drawAngles;
                    i10 = i16;
                    f10 = f;
                    i11 = i18;
                    f11 = radius;
                    cVar3 = centerCircleBox;
                    hVar2 = hVar;
                    f15 = (f16 * 1.0f) + f15;
                    i18 = i11 + 1;
                    centerCircleBox = cVar3;
                    f = f10;
                    i16 = i10;
                    it3 = it2;
                    cVar5 = cVar2;
                    gVar3 = gVar;
                    c0 = i6;
                    drawAngles = fArr;
                    p10 = f2;
                    circleBox = rectF;
                    radius = f11;
                }
                cVar = cVar5;
                it = it3;
                y6.c.d(centerCircleBox);
            } else {
                cVar = cVar5;
                it = it3;
            }
            it3 = it;
            cVar5 = cVar;
        }
    }

    @Override // x6.d
    public final void f(Canvas canvas) {
        float radius;
        y6.c cVar;
        RectF rectF;
        p6.c cVar2 = this.f37630g;
        if (cVar2.f27939g0 && this.r != null) {
            float radius2 = cVar2.getRadius();
            float holeRadius = (cVar2.getHoleRadius() / 100.0f) * radius2;
            y6.c centerCircleBox = cVar2.getCenterCircleBox();
            Paint paint = this.f37631h;
            if (Color.alpha(paint.getColor()) > 0) {
                this.r.drawCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, holeRadius, paint);
            }
            Paint paint2 = this.f37632i;
            if (Color.alpha(paint2.getColor()) > 0 && cVar2.getTransparentCircleRadius() > cVar2.getHoleRadius()) {
                int alpha = paint2.getAlpha();
                float transparentCircleRadius = (cVar2.getTransparentCircleRadius() / 100.0f) * radius2;
                this.f37621c.getClass();
                paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                Path path = this.f37643u;
                path.reset();
                path.addCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, transparentCircleRadius, Path.Direction.CW);
                path.addCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, holeRadius, Path.Direction.CCW);
                this.r.drawPath(path, paint2);
                paint2.setAlpha(alpha);
            }
            y6.c.d(centerCircleBox);
        }
        canvas.drawBitmap(this.f37640q.get(), 0.0f, 0.0f, (Paint) null);
        CharSequence centerText = cVar2.getCenterText();
        if (cVar2.f27945m0 && centerText != null) {
            y6.c centerCircleBox2 = cVar2.getCenterCircleBox();
            y6.c centerTextOffset = cVar2.getCenterTextOffset();
            float f = centerCircleBox2.f38276b + centerTextOffset.f38276b;
            float f2 = centerCircleBox2.f38277c + centerTextOffset.f38277c;
            if (cVar2.f27939g0 && !cVar2.f27940h0) {
                radius = (cVar2.getHoleRadius() / 100.0f) * cVar2.getRadius();
            } else {
                radius = cVar2.getRadius();
            }
            RectF[] rectFArr = this.f37639p;
            RectF rectF2 = rectFArr[0];
            rectF2.left = f - radius;
            rectF2.top = f2 - radius;
            rectF2.right = f + radius;
            rectF2.bottom = f2 + radius;
            RectF rectF3 = rectFArr[1];
            rectF3.set(rectF2);
            float centerTextRadiusPercent = cVar2.getCenterTextRadiusPercent() / 100.0f;
            if (centerTextRadiusPercent > 0.0d) {
                rectF3.inset((rectF3.width() - (rectF3.width() * centerTextRadiusPercent)) / 2.0f, (rectF3.height() - (rectF3.height() * centerTextRadiusPercent)) / 2.0f);
            }
            boolean equals = centerText.equals(this.f37637n);
            RectF rectF4 = this.f37638o;
            if (equals && rectF3.equals(rectF4)) {
                cVar = centerTextOffset;
                rectF = rectF2;
            } else {
                rectF4.set(rectF3);
                this.f37637n = centerText;
                cVar = centerTextOffset;
                rectF = rectF2;
                this.f37636m = new StaticLayout(centerText, 0, centerText.length(), this.f37634k, (int) Math.max(Math.ceil(rectF4.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
            }
            canvas.save();
            Path path2 = this.f37644v;
            path2.reset();
            path2.addOval(rectF, Path.Direction.CW);
            canvas.clipPath(path2);
            canvas.translate(rectF3.left, ((rectF3.height() - this.f37636m.getHeight()) / 2.0f) + rectF3.top);
            this.f37636m.draw(canvas);
            canvas.restore();
            y6.c.d(centerCircleBox2);
            y6.c.d(cVar);
        }
    }

    @Override // x6.d
    public final void g(Canvas canvas, t6.c[] cVarArr) {
        boolean z10;
        float f;
        p6.c cVar;
        float[] fArr;
        float[] fArr2;
        int i6;
        RectF rectF;
        float f2;
        float f10;
        v6.g gVar;
        float f11;
        int i10;
        float d10;
        boolean z11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        Paint paint;
        float f17;
        int i12;
        Paint paint2;
        int i13;
        float f18;
        float f19;
        float f20;
        t6.c[] cVarArr2 = cVarArr;
        this.f37621c.getClass();
        p6.c cVar2 = this.f37630g;
        float rotationAngle = cVar2.getRotationAngle();
        float[] drawAngles = cVar2.getDrawAngles();
        float[] absoluteAngles = cVar2.getAbsoluteAngles();
        y6.c centerCircleBox = cVar2.getCenterCircleBox();
        float radius = cVar2.getRadius();
        if (cVar2.f27939g0 && !cVar2.f27940h0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f = (cVar2.getHoleRadius() / 100.0f) * radius;
        } else {
            f = 0.0f;
        }
        RectF rectF2 = this.f37645w;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        int i14 = 0;
        while (i14 < cVarArr2.length) {
            int i15 = (int) cVarArr2[i14].f32419a;
            if (i15 < drawAngles.length) {
                r6.l lVar = (r6.l) cVar2.getData();
                if (cVarArr2[i14].f == 0) {
                    gVar = lVar.i();
                } else {
                    lVar.getClass();
                    gVar = null;
                }
                if (gVar != null && gVar.f0()) {
                    int c0 = gVar.c0();
                    int i16 = 0;
                    for (int i17 = 0; i17 < c0; i17++) {
                        if (Math.abs(gVar.x(i17).f30503u) > y6.f.f38293d) {
                            i16++;
                        }
                    }
                    if (i15 == 0) {
                        i10 = 1;
                        f11 = 0.0f;
                    } else {
                        f11 = absoluteAngles[i15 - 1] * 1.0f;
                        i10 = 1;
                    }
                    if (i16 <= i10) {
                        d10 = 0.0f;
                    } else {
                        d10 = gVar.d();
                    }
                    float f21 = drawAngles[i15];
                    float S = gVar.S();
                    float f22 = radius + S;
                    fArr = drawAngles;
                    rectF2.set(cVar2.getCircleBox());
                    float f23 = -S;
                    rectF2.inset(f23, f23);
                    if (d10 > 0.0f && f21 <= 180.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Paint paint3 = this.f37622d;
                    paint3.setColor(gVar.B(i15));
                    if (i16 == 1) {
                        f12 = 0.0f;
                    } else {
                        f12 = d10 / (radius * 0.017453292f);
                    }
                    if (i16 == 1) {
                        f13 = 0.0f;
                    } else {
                        f13 = d10 / (f22 * 0.017453292f);
                    }
                    float f24 = (((f12 / 2.0f) + f11) * 1.0f) + rotationAngle;
                    float f25 = (f21 - f12) * 1.0f;
                    if (f25 < 0.0f) {
                        f14 = 0.0f;
                    } else {
                        f14 = f25;
                    }
                    float f26 = (((f13 / 2.0f) + f11) * 1.0f) + rotationAngle;
                    float f27 = (f21 - f13) * 1.0f;
                    if (f27 < 0.0f) {
                        cVar = cVar2;
                        f15 = 0.0f;
                    } else {
                        f15 = f27;
                        cVar = cVar2;
                    }
                    Path path = this.f37641s;
                    path.reset();
                    int i18 = (f14 > 360.0f ? 1 : (f14 == 360.0f ? 0 : -1));
                    if (i18 >= 0 && f14 % 360.0f <= y6.f.f38293d) {
                        fArr2 = absoluteAngles;
                        path.addCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, f22, Path.Direction.CW);
                        i11 = i14;
                        f16 = f;
                        paint = paint3;
                        f10 = radius;
                        f17 = f11;
                    } else {
                        fArr2 = absoluteAngles;
                        i11 = i14;
                        f16 = f;
                        paint = paint3;
                        double d11 = f26 * 0.017453292f;
                        f10 = radius;
                        f17 = f11;
                        path.moveTo((((float) Math.cos(d11)) * f22) + centerCircleBox.f38276b, (f22 * ((float) Math.sin(d11))) + centerCircleBox.f38277c);
                        path.arcTo(rectF2, f26, f15);
                    }
                    if (z11) {
                        double d12 = f24 * 0.017453292f;
                        float cos = centerCircleBox.f38276b + (((float) Math.cos(d12)) * f10);
                        float sin = (((float) Math.sin(d12)) * f10) + centerCircleBox.f38277c;
                        int i19 = i11;
                        f2 = f16;
                        paint2 = paint;
                        rectF = rectF2;
                        i6 = i19;
                        i13 = 1;
                        i12 = i16;
                        f18 = o(centerCircleBox, f10, f21 * 1.0f, cos, sin, f24, f14);
                    } else {
                        i12 = i16;
                        i6 = i11;
                        f2 = f16;
                        paint2 = paint;
                        i13 = 1;
                        rectF = rectF2;
                        f18 = 0.0f;
                    }
                    RectF rectF3 = this.f37642t;
                    float f28 = centerCircleBox.f38276b;
                    float f29 = centerCircleBox.f38277c;
                    rectF3.set(f28 - f2, f29 - f2, f28 + f2, f29 + f2);
                    if (z10 && (f2 > 0.0f || z11)) {
                        if (z11) {
                            if (f18 < 0.0f) {
                                f18 = -f18;
                            }
                            f19 = Math.max(f2, f18);
                        } else {
                            f19 = f2;
                        }
                        if (i12 != i13 && f19 != 0.0f) {
                            f20 = d10 / (f19 * 0.017453292f);
                        } else {
                            f20 = 0.0f;
                        }
                        float f30 = (((f20 / 2.0f) + f17) * 1.0f) + rotationAngle;
                        float f31 = (f21 - f20) * 1.0f;
                        if (f31 < 0.0f) {
                            f31 = 0.0f;
                        }
                        float f32 = f30 + f31;
                        if (i18 >= 0 && f14 % 360.0f <= y6.f.f38293d) {
                            path.addCircle(centerCircleBox.f38276b, centerCircleBox.f38277c, f19, Path.Direction.CCW);
                        } else {
                            double d13 = f32 * 0.017453292f;
                            path.lineTo((((float) Math.cos(d13)) * f19) + centerCircleBox.f38276b, (f19 * ((float) Math.sin(d13))) + centerCircleBox.f38277c);
                            path.arcTo(rectF3, f32, -f31);
                        }
                    } else if (f14 % 360.0f > y6.f.f38293d) {
                        if (z11) {
                            double d14 = ((f14 / 2.0f) + f24) * 0.017453292f;
                            path.lineTo((((float) Math.cos(d14)) * f18) + centerCircleBox.f38276b, (f18 * ((float) Math.sin(d14))) + centerCircleBox.f38277c);
                        } else {
                            path.lineTo(centerCircleBox.f38276b, centerCircleBox.f38277c);
                        }
                    }
                    path.close();
                    this.r.drawPath(path, paint2);
                    i14 = i6 + 1;
                    f = f2;
                    cVar2 = cVar;
                    drawAngles = fArr;
                    absoluteAngles = fArr2;
                    rectF2 = rectF;
                    radius = f10;
                    cVarArr2 = cVarArr;
                }
            }
            cVar = cVar2;
            fArr = drawAngles;
            fArr2 = absoluteAngles;
            i6 = i14;
            rectF = rectF2;
            f2 = f;
            f10 = radius;
            i14 = i6 + 1;
            f = f2;
            cVar2 = cVar;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            rectF2 = rectF;
            radius = f10;
            cVarArr2 = cVarArr;
        }
        y6.c.d(centerCircleBox);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x030d  */
    @Override // x6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i(Canvas canvas) {
        p6.c cVar;
        float f;
        float[] fArr;
        float[] fArr2;
        int i6;
        List list;
        boolean z10;
        y6.c cVar2;
        r6.l lVar;
        float f2;
        float f10;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        boolean z14;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        p6.c cVar3;
        y6.c cVar4;
        double d10;
        float f14;
        float f15;
        v6.g gVar;
        Paint paint;
        Paint paint2;
        int i13;
        List list2;
        r6.l lVar2;
        y6.c cVar5;
        int i14;
        int i15;
        r6.m mVar;
        boolean z15;
        int i16;
        int i17;
        float f16;
        float f17;
        y6.c cVar6;
        Paint paint3;
        Paint paint4;
        h hVar = this;
        p6.c cVar7 = hVar.f37630g;
        y6.c centerCircleBox = cVar7.getCenterCircleBox();
        float radius = cVar7.getRadius();
        float rotationAngle = cVar7.getRotationAngle();
        float[] drawAngles = cVar7.getDrawAngles();
        float[] absoluteAngles = cVar7.getAbsoluteAngles();
        hVar.f37621c.getClass();
        float holeRadius = cVar7.getHoleRadius() / 100.0f;
        float f18 = (radius / 10.0f) * 3.6f;
        if (cVar7.f27939g0) {
            f18 = (radius - (radius * holeRadius)) / 2.0f;
        }
        float f19 = radius - f18;
        r6.l lVar3 = (r6.l) cVar7.getData();
        List list3 = lVar3.f30512i;
        float j10 = lVar3.j();
        boolean z16 = cVar7.f27937d0;
        canvas.save();
        float c10 = y6.f.c(5.0f);
        int i18 = 0;
        int i19 = 0;
        while (i19 < list3.size()) {
            v6.g gVar2 = (v6.g) list3.get(i19);
            boolean W = gVar2.W();
            if (!W && !z16) {
                i6 = i19;
                list = list3;
                cVar = cVar7;
                f = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                z10 = z16;
                cVar2 = centerCircleBox;
                lVar = lVar3;
            } else {
                int k02 = gVar2.k0();
                int I = gVar2.I();
                hVar.d(gVar2);
                Paint paint5 = hVar.f;
                int i20 = i18;
                float c11 = y6.f.c(4.0f) + y6.f.a(paint5, "Q");
                s6.c u10 = gVar2.u();
                int c0 = gVar2.c0();
                int i21 = i19;
                Paint paint6 = hVar.f37633j;
                List list4 = list3;
                paint6.setColor(gVar2.z());
                paint6.setStrokeWidth(y6.f.c(gVar2.C()));
                float p10 = hVar.p(gVar2);
                y6.c c12 = y6.c.c(gVar2.d0());
                r6.l lVar4 = lVar3;
                c12.f38276b = y6.f.c(c12.f38276b);
                c12.f38277c = y6.f.c(c12.f38277c);
                int i22 = 0;
                while (i22 < c0) {
                    y6.c cVar8 = c12;
                    r6.m x10 = gVar2.x(i22);
                    if (i20 == 0) {
                        f2 = 0.0f;
                    } else {
                        f2 = absoluteAngles[i20 - 1] * 1.0f;
                    }
                    int i23 = c0;
                    float f20 = ((((drawAngles[i20] - ((p10 / (f19 * 0.017453292f)) / 2.0f)) / 2.0f) + f2) * 1.0f) + rotationAngle;
                    float f21 = rotationAngle;
                    if (cVar7.f27941i0) {
                        f10 = (x10.f30503u / j10) * 100.0f;
                    } else {
                        f10 = x10.f30503u;
                    }
                    float[] fArr3 = drawAngles;
                    float[] fArr4 = absoluteAngles;
                    double d11 = f20 * 0.017453292f;
                    int i24 = i22;
                    float cos = (float) Math.cos(d11);
                    Paint paint7 = paint5;
                    float sin = (float) Math.sin(d11);
                    if (z16 && k02 == 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (W && I == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = z16;
                    if (z16) {
                        i10 = 1;
                        if (k02 == 1) {
                            z13 = true;
                            if (!W && I == i10) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (z11 && !z12) {
                                f16 = sin;
                                i16 = I;
                                i17 = k02;
                                gVar = gVar2;
                                paint = paint6;
                                paint2 = paint7;
                                cVar3 = cVar7;
                                cVar4 = centerCircleBox;
                                i13 = i21;
                                list2 = list4;
                                lVar2 = lVar4;
                                cVar5 = cVar8;
                                i14 = i23;
                                i15 = i24;
                                mVar = x10;
                                z15 = z17;
                                f17 = cos;
                            } else {
                                float D = gVar2.D();
                                float O = gVar2.O();
                                i11 = I;
                                float U = gVar2.U() / 100.0f;
                                i12 = k02;
                                if (!cVar7.f27939g0) {
                                    float f22 = radius * holeRadius;
                                    f11 = defpackage.e.e(radius, f22, U, f22);
                                } else {
                                    f11 = U * radius;
                                }
                                if (!gVar2.L()) {
                                    f12 = O * f19 * ((float) Math.abs(Math.sin(d11)));
                                } else {
                                    f12 = O * f19;
                                }
                                float f23 = centerCircleBox.f38276b;
                                float f24 = (f11 * cos) + f23;
                                float f25 = centerCircleBox.f38277c;
                                float f26 = (f11 * sin) + f25;
                                float f27 = (D + 1.0f) * f19;
                                f13 = (f27 * cos) + f23;
                                float f28 = f25 + (f27 * sin);
                                cVar3 = cVar7;
                                cVar4 = centerCircleBox;
                                d10 = f20 % 360.0d;
                                Paint paint8 = hVar.f37635l;
                                if (d10 < 90.0d && d10 <= 270.0d) {
                                    f15 = f13 - f12;
                                    paint7.setTextAlign(Paint.Align.RIGHT);
                                    if (z11) {
                                        paint8.setTextAlign(Paint.Align.RIGHT);
                                    }
                                    f14 = f15 - c10;
                                } else {
                                    float f29 = f13 + f12;
                                    paint7.setTextAlign(Paint.Align.LEFT);
                                    if (z11) {
                                        paint8.setTextAlign(Paint.Align.LEFT);
                                    }
                                    f14 = f29 + c10;
                                    f15 = f29;
                                }
                                if (gVar2.z() != 1122867) {
                                    Paint paint9 = paint6;
                                    canvas.drawLine(f24, f26, f13, f28, paint9);
                                    canvas.drawLine(f13, f28, f15, f28, paint9);
                                }
                                if (!z11 && z12) {
                                    i14 = i23;
                                    f16 = sin;
                                    i16 = i11;
                                    i17 = i12;
                                    gVar = gVar2;
                                    paint = paint6;
                                    i13 = i21;
                                    z15 = z17;
                                    paint2 = paint7;
                                    list2 = list4;
                                    cVar5 = cVar8;
                                    mVar = x10;
                                    lVar2 = lVar4;
                                    f17 = cos;
                                    h(canvas, u10, f10, x10, 0, f14, f28, gVar2.J(i24));
                                    if (i24 < lVar2.d()) {
                                        mVar.getClass();
                                    }
                                    i15 = i24;
                                } else {
                                    gVar = gVar2;
                                    paint = paint6;
                                    paint2 = paint7;
                                    i13 = i21;
                                    list2 = list4;
                                    lVar2 = lVar4;
                                    cVar5 = cVar8;
                                    i14 = i23;
                                    i15 = i24;
                                    mVar = x10;
                                    z15 = z17;
                                    i16 = i11;
                                    i17 = i12;
                                    f16 = sin;
                                    f17 = cos;
                                    if (!z11) {
                                        if (i15 < lVar2.d()) {
                                            mVar.getClass();
                                        }
                                    } else if (z12) {
                                        h(canvas, u10, f10, mVar, 0, f14, (c11 / 2.0f) + f28, gVar.J(i15));
                                    }
                                }
                            }
                            if (z13 && !z14) {
                                cVar6 = cVar4;
                                paint4 = paint2;
                            } else {
                                cVar6 = cVar4;
                                float f30 = (f19 * f17) + cVar6.f38276b;
                                float f31 = (f19 * f16) + cVar6.f38277c;
                                paint3 = paint2;
                                paint3.setTextAlign(Paint.Align.CENTER);
                                if (!z13 && z14) {
                                    paint4 = paint3;
                                    h(canvas, u10, f10, mVar, 0, f30, f31, gVar.J(i15));
                                    if (i15 < lVar2.d()) {
                                        mVar.getClass();
                                    }
                                } else {
                                    paint4 = paint3;
                                    if (!z13) {
                                        if (i15 < lVar2.d()) {
                                            mVar.getClass();
                                        }
                                    } else if (z14) {
                                        h(canvas, u10, f10, mVar, 0, f30, f31 + (c11 / 2.0f), gVar.J(i15));
                                    }
                                }
                            }
                            mVar.getClass();
                            i20++;
                            i22 = i15 + 1;
                            gVar2 = gVar;
                            z16 = z15;
                            c0 = i14;
                            I = i16;
                            k02 = i17;
                            paint6 = paint;
                            c12 = cVar5;
                            paint5 = paint4;
                            rotationAngle = f21;
                            drawAngles = fArr3;
                            cVar7 = cVar3;
                            hVar = this;
                            lVar4 = lVar2;
                            centerCircleBox = cVar6;
                            list4 = list2;
                            absoluteAngles = fArr4;
                            i21 = i13;
                        }
                    } else {
                        i10 = 1;
                    }
                    z13 = false;
                    if (!W) {
                    }
                    z14 = false;
                    if (z11) {
                    }
                    float D2 = gVar2.D();
                    float O2 = gVar2.O();
                    i11 = I;
                    float U2 = gVar2.U() / 100.0f;
                    i12 = k02;
                    if (!cVar7.f27939g0) {
                    }
                    if (!gVar2.L()) {
                    }
                    float f232 = centerCircleBox.f38276b;
                    float f242 = (f11 * cos) + f232;
                    float f252 = centerCircleBox.f38277c;
                    float f262 = (f11 * sin) + f252;
                    float f272 = (D2 + 1.0f) * f19;
                    f13 = (f272 * cos) + f232;
                    float f282 = f252 + (f272 * sin);
                    cVar3 = cVar7;
                    cVar4 = centerCircleBox;
                    d10 = f20 % 360.0d;
                    Paint paint82 = hVar.f37635l;
                    if (d10 < 90.0d) {
                    }
                    float f292 = f13 + f12;
                    paint7.setTextAlign(Paint.Align.LEFT);
                    if (z11) {
                    }
                    f14 = f292 + c10;
                    f15 = f292;
                    if (gVar2.z() != 1122867) {
                    }
                    if (!z11) {
                    }
                    gVar = gVar2;
                    paint = paint6;
                    paint2 = paint7;
                    i13 = i21;
                    list2 = list4;
                    lVar2 = lVar4;
                    cVar5 = cVar8;
                    i14 = i23;
                    i15 = i24;
                    mVar = x10;
                    z15 = z17;
                    i16 = i11;
                    i17 = i12;
                    f16 = sin;
                    f17 = cos;
                    if (!z11) {
                    }
                    if (z13) {
                    }
                    cVar6 = cVar4;
                    float f302 = (f19 * f17) + cVar6.f38276b;
                    float f312 = (f19 * f16) + cVar6.f38277c;
                    paint3 = paint2;
                    paint3.setTextAlign(Paint.Align.CENTER);
                    if (!z13) {
                    }
                    paint4 = paint3;
                    if (!z13) {
                    }
                    mVar.getClass();
                    i20++;
                    i22 = i15 + 1;
                    gVar2 = gVar;
                    z16 = z15;
                    c0 = i14;
                    I = i16;
                    k02 = i17;
                    paint6 = paint;
                    c12 = cVar5;
                    paint5 = paint4;
                    rotationAngle = f21;
                    drawAngles = fArr3;
                    cVar7 = cVar3;
                    hVar = this;
                    lVar4 = lVar2;
                    centerCircleBox = cVar6;
                    list4 = list2;
                    absoluteAngles = fArr4;
                    i21 = i13;
                }
                cVar = cVar7;
                f = rotationAngle;
                fArr = drawAngles;
                fArr2 = absoluteAngles;
                i6 = i21;
                list = list4;
                z10 = z16;
                cVar2 = centerCircleBox;
                lVar = lVar4;
                y6.c.d(c12);
                i18 = i20;
            }
            i19 = i6 + 1;
            hVar = this;
            z16 = z10;
            lVar3 = lVar;
            centerCircleBox = cVar2;
            list3 = list;
            rotationAngle = f;
            drawAngles = fArr;
            absoluteAngles = fArr2;
            cVar7 = cVar;
        }
        y6.c.d(centerCircleBox);
        canvas.restore();
    }

    public final float p(v6.g gVar) {
        if (!gVar.v()) {
            return gVar.d();
        }
        float d10 = gVar.d();
        RectF rectF = ((y6.g) this.f16181b).f38300b;
        if (d10 / Math.min(rectF.width(), rectF.height()) > (gVar.r() / ((r6.l) this.f37630g.getData()).j()) * 2.0f) {
            return 0.0f;
        }
        return gVar.d();
    }

    @Override // x6.d
    public final void m() {
    }
}
