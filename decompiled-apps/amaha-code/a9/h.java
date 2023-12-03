package a9;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
/* compiled from: SubtitlePainter.java */
/* loaded from: classes.dex */
public final class h {
    public int A;
    public int B;
    public int C;
    public int D;
    public StaticLayout E;
    public StaticLayout F;
    public int G;
    public int H;
    public int I;
    public Rect J;

    /* renamed from: a  reason: collision with root package name */
    public final float f417a;

    /* renamed from: b  reason: collision with root package name */
    public final float f418b;

    /* renamed from: c  reason: collision with root package name */
    public final float f419c;

    /* renamed from: d  reason: collision with root package name */
    public final float f420d;

    /* renamed from: e  reason: collision with root package name */
    public final float f421e;
    public final TextPaint f;

    /* renamed from: g  reason: collision with root package name */
    public final Paint f422g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f423h;

    /* renamed from: i  reason: collision with root package name */
    public CharSequence f424i;

    /* renamed from: j  reason: collision with root package name */
    public Layout.Alignment f425j;

    /* renamed from: k  reason: collision with root package name */
    public Bitmap f426k;

    /* renamed from: l  reason: collision with root package name */
    public float f427l;

    /* renamed from: m  reason: collision with root package name */
    public int f428m;

    /* renamed from: n  reason: collision with root package name */
    public int f429n;

    /* renamed from: o  reason: collision with root package name */
    public float f430o;

    /* renamed from: p  reason: collision with root package name */
    public int f431p;

    /* renamed from: q  reason: collision with root package name */
    public float f432q;
    public float r;

    /* renamed from: s  reason: collision with root package name */
    public int f433s;

    /* renamed from: t  reason: collision with root package name */
    public int f434t;

    /* renamed from: u  reason: collision with root package name */
    public int f435u;

    /* renamed from: v  reason: collision with root package name */
    public int f436v;

    /* renamed from: w  reason: collision with root package name */
    public int f437w;

    /* renamed from: x  reason: collision with root package name */
    public float f438x;

    /* renamed from: y  reason: collision with root package name */
    public float f439y;

    /* renamed from: z  reason: collision with root package name */
    public float f440z;

    public h(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f421e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f420d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f417a = round;
        this.f418b = round;
        this.f419c = round;
        TextPaint textPaint = new TextPaint();
        this.f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f422g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f423h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public final void a(Canvas canvas, boolean z10) {
        int i6;
        if (z10) {
            StaticLayout staticLayout = this.E;
            StaticLayout staticLayout2 = this.F;
            if (staticLayout != null && staticLayout2 != null) {
                int save = canvas.save();
                canvas.translate(this.G, this.H);
                if (Color.alpha(this.f435u) > 0) {
                    Paint paint = this.f422g;
                    paint.setColor(this.f435u);
                    canvas.drawRect(-this.I, 0.0f, staticLayout.getWidth() + this.I, staticLayout.getHeight(), paint);
                }
                int i10 = this.f437w;
                TextPaint textPaint = this.f;
                boolean z11 = true;
                if (i10 == 1) {
                    textPaint.setStrokeJoin(Paint.Join.ROUND);
                    textPaint.setStrokeWidth(this.f417a);
                    textPaint.setColor(this.f436v);
                    textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                    staticLayout2.draw(canvas);
                } else {
                    float f = this.f418b;
                    if (i10 == 2) {
                        float f2 = this.f419c;
                        textPaint.setShadowLayer(f, f2, f2, this.f436v);
                    } else if (i10 == 3 || i10 == 4) {
                        if (i10 != 3) {
                            z11 = false;
                        }
                        int i11 = -1;
                        if (z11) {
                            i6 = -1;
                        } else {
                            i6 = this.f436v;
                        }
                        if (z11) {
                            i11 = this.f436v;
                        }
                        float f10 = f / 2.0f;
                        textPaint.setColor(this.f433s);
                        textPaint.setStyle(Paint.Style.FILL);
                        float f11 = -f10;
                        textPaint.setShadowLayer(f, f11, f11, i6);
                        staticLayout2.draw(canvas);
                        textPaint.setShadowLayer(f, f10, f10, i11);
                    }
                }
                textPaint.setColor(this.f433s);
                textPaint.setStyle(Paint.Style.FILL);
                staticLayout.draw(canvas);
                textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                canvas.restoreToCount(save);
                return;
            }
            return;
        }
        this.J.getClass();
        this.f426k.getClass();
        canvas.drawBitmap(this.f426k, (Rect) null, this.J, this.f423h);
    }
}
