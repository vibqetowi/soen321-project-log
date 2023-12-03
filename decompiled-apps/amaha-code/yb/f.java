package yb;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;
import yb.i;
import yb.j;
import yb.l;
/* compiled from: MaterialShapeDrawable.java */
/* loaded from: classes.dex */
public class f extends Drawable implements k0.b, m {
    public static final Paint Q;
    public final Path A;
    public final Path B;
    public final RectF C;
    public final RectF D;
    public final Region E;
    public final Region F;
    public i G;
    public final Paint H;
    public final Paint I;
    public final xb.a J;
    public final a K;
    public final j L;
    public PorterDuffColorFilter M;
    public PorterDuffColorFilter N;
    public final RectF O;
    public final boolean P;

    /* renamed from: u  reason: collision with root package name */
    public b f38424u;

    /* renamed from: v  reason: collision with root package name */
    public final l.f[] f38425v;

    /* renamed from: w  reason: collision with root package name */
    public final l.f[] f38426w;

    /* renamed from: x  reason: collision with root package name */
    public final BitSet f38427x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f38428y;

    /* renamed from: z  reason: collision with root package name */
    public final Matrix f38429z;

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        Q = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public f() {
        this(new i());
    }

    public final void b(RectF rectF, Path path) {
        j jVar = this.L;
        b bVar = this.f38424u;
        jVar.a(bVar.f38431a, bVar.f38439j, rectF, this.K, path);
        if (this.f38424u.f38438i != 1.0f) {
            Matrix matrix = this.f38429z;
            matrix.reset();
            float f = this.f38424u.f38438i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.O, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z10) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int d10;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z10) {
                colorForState = d(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z10 && (d10 = d((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(d10, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int d(int i6) {
        b bVar = this.f38424u;
        float f = bVar.f38443n + bVar.f38444o + bVar.f38442m;
        nb.a aVar = bVar.f38432b;
        if (aVar != null) {
            return aVar.a(f, i6);
        }
        return i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r0 != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        boolean z10;
        Paint.Style style;
        boolean z11;
        Paint.Style style2;
        boolean z12;
        boolean z13;
        boolean z14;
        float f;
        boolean z15;
        float f2;
        Paint paint = this.H;
        paint.setColorFilter(this.M);
        int alpha = paint.getAlpha();
        int i6 = this.f38424u.f38441l;
        paint.setAlpha(((i6 + (i6 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.I;
        paint2.setColorFilter(this.N);
        paint2.setStrokeWidth(this.f38424u.f38440k);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f38424u.f38441l;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z16 = this.f38428y;
        Path path = this.A;
        if (z16) {
            Paint.Style style3 = this.f38424u.f38449u;
            if ((style3 == Paint.Style.FILL_AND_STROKE || style3 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                f = paint2.getStrokeWidth() / 2.0f;
            } else {
                f = 0.0f;
            }
            float f10 = -f;
            i iVar = this.f38424u.f38431a;
            iVar.getClass();
            i.a aVar = new i.a(iVar);
            c cVar = iVar.f38456e;
            if (!(cVar instanceof g)) {
                cVar = new yb.b(f10, cVar);
            }
            aVar.f38467e = cVar;
            c cVar2 = iVar.f;
            if (!(cVar2 instanceof g)) {
                cVar2 = new yb.b(f10, cVar2);
            }
            aVar.f = cVar2;
            c cVar3 = iVar.f38458h;
            if (!(cVar3 instanceof g)) {
                cVar3 = new yb.b(f10, cVar3);
            }
            aVar.f38469h = cVar3;
            c cVar4 = iVar.f38457g;
            if (!(cVar4 instanceof g)) {
                cVar4 = new yb.b(f10, cVar4);
            }
            aVar.f38468g = cVar4;
            i iVar2 = new i(aVar);
            this.G = iVar2;
            float f11 = this.f38424u.f38439j;
            RectF rectF = this.D;
            rectF.set(h());
            Paint.Style style4 = this.f38424u.f38449u;
            if ((style4 == Paint.Style.FILL_AND_STROKE || style4 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                f2 = paint2.getStrokeWidth() / 2.0f;
            } else {
                f2 = 0.0f;
            }
            rectF.inset(f2, f2);
            this.L.a(iVar2, f11, rectF, null, this.B);
            b(h(), path);
            this.f38428y = false;
        }
        b bVar = this.f38424u;
        int i11 = bVar.f38445p;
        if (i11 != 1 && bVar.f38446q > 0) {
            if (i11 != 2) {
                int i12 = Build.VERSION.SDK_INT;
                if (!bVar.f38431a.d(h()) && !path.isConvex() && i12 < 29) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            }
            z10 = true;
            if (z10) {
                canvas.save();
                b bVar2 = this.f38424u;
                double sin = Math.sin(Math.toRadians(bVar2.f38447s));
                b bVar3 = this.f38424u;
                canvas.translate((int) (sin * bVar2.r), (int) (Math.cos(Math.toRadians(bVar3.f38447s)) * bVar3.r));
                if (!this.P) {
                    e(canvas);
                    canvas.restore();
                } else {
                    RectF rectF2 = this.O;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width >= 0 && height >= 0) {
                        Bitmap createBitmap = Bitmap.createBitmap((this.f38424u.f38446q * 2) + ((int) rectF2.width()) + width, (this.f38424u.f38446q * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(createBitmap);
                        float f12 = (getBounds().left - this.f38424u.f38446q) - width;
                        float f13 = (getBounds().top - this.f38424u.f38446q) - height;
                        canvas2.translate(-f12, -f13);
                        e(canvas2);
                        canvas.drawBitmap(createBitmap, f12, f13, (Paint) null);
                        createBitmap.recycle();
                        canvas.restore();
                    } else {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                }
            }
            b bVar4 = this.f38424u;
            style = bVar4.f38449u;
            if (style == Paint.Style.FILL_AND_STROKE && style != Paint.Style.FILL) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                f(canvas, paint, path, bVar4.f38431a, h());
            }
            style2 = this.f38424u.f38449u;
            if ((style2 != Paint.Style.FILL_AND_STROKE || style2 == Paint.Style.STROKE) && paint2.getStrokeWidth() > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                g(canvas);
            }
            paint.setAlpha(alpha);
            paint2.setAlpha(alpha2);
        }
        z10 = false;
        if (z10) {
        }
        b bVar42 = this.f38424u;
        style = bVar42.f38449u;
        if (style == Paint.Style.FILL_AND_STROKE) {
        }
        z11 = true;
        if (z11) {
        }
        style2 = this.f38424u.f38449u;
        if (style2 != Paint.Style.FILL_AND_STROKE) {
        }
        z12 = true;
        if (z12) {
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        if (this.f38427x.cardinality() > 0) {
            Log.w("f", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i6 = this.f38424u.r;
        Path path = this.A;
        xb.a aVar = this.J;
        if (i6 != 0) {
            canvas.drawPath(path, aVar.f37714a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            l.f fVar = this.f38425v[i10];
            int i11 = this.f38424u.f38446q;
            Matrix matrix = l.f.f38508b;
            fVar.a(matrix, aVar, i11, canvas);
            this.f38426w[i10].a(matrix, aVar, this.f38424u.f38446q, canvas);
        }
        if (this.P) {
            b bVar = this.f38424u;
            int sin = (int) (Math.sin(Math.toRadians(bVar.f38447s)) * bVar.r);
            b bVar2 = this.f38424u;
            int cos = (int) (Math.cos(Math.toRadians(bVar2.f38447s)) * bVar2.r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, Q);
            canvas.translate(sin, cos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, i iVar, RectF rectF) {
        if (iVar.d(rectF)) {
            float a10 = iVar.f.a(rectF) * this.f38424u.f38439j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void g(Canvas canvas) {
        boolean z10;
        Paint paint = this.I;
        Path path = this.B;
        i iVar = this.G;
        RectF rectF = this.D;
        rectF.set(h());
        Paint.Style style = this.f38424u.f38449u;
        float f = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f, f);
        f(canvas, paint, path, iVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38424u.f38441l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f38424u;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        b bVar = this.f38424u;
        if (bVar.f38445p == 2) {
            return;
        }
        if (bVar.f38431a.d(h())) {
            outline.setRoundRect(getBounds(), this.f38424u.f38431a.f38456e.a(h()) * this.f38424u.f38439j);
            return;
        }
        RectF h10 = h();
        Path path = this.A;
        b(h10, path);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 30) {
            outline.setPath(path);
        } else if (i6 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f38424u.f38437h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.E;
        region.set(bounds);
        RectF h10 = h();
        Path path = this.A;
        b(h10, path);
        Region region2 = this.F;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.C;
        rectF.set(getBounds());
        return rectF;
    }

    public final void i(Context context) {
        this.f38424u.f38432b = new nb.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f38428y = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f38424u.f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f38424u.f38435e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f38424u.f38434d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f38424u.f38433c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(float f) {
        b bVar = this.f38424u;
        if (bVar.f38443n != f) {
            bVar.f38443n = f;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        b bVar = this.f38424u;
        if (bVar.f38433c != colorStateList) {
            bVar.f38433c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z10;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f38424u.f38433c != null && color2 != (colorForState2 = this.f38424u.f38433c.getColorForState(iArr, (color2 = (paint2 = this.H).getColor())))) {
            paint2.setColor(colorForState2);
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f38424u.f38434d != null && color != (colorForState = this.f38424u.f38434d.getColorForState(iArr, (color = (paint = this.I).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z10;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter = this.M;
        PorterDuffColorFilter porterDuffColorFilter2 = this.N;
        b bVar = this.f38424u;
        this.M = c(bVar.f, bVar.f38436g, this.H, true);
        b bVar2 = this.f38424u;
        this.N = c(bVar2.f38435e, bVar2.f38436g, this.I, false);
        b bVar3 = this.f38424u;
        if (bVar3.f38448t) {
            this.J.a(bVar3.f.getColorForState(getState(), 0));
        }
        if (!s0.b.a(porterDuffColorFilter, this.M) || !s0.b.a(porterDuffColorFilter2, this.N)) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f38424u = new b(this.f38424u);
        return this;
    }

    public final void n() {
        b bVar = this.f38424u;
        float f = bVar.f38443n + bVar.f38444o;
        bVar.f38446q = (int) Math.ceil(0.75f * f);
        this.f38424u.r = (int) Math.ceil(f * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f38428y = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, qb.q.b
    public boolean onStateChange(int[] iArr) {
        boolean z10;
        boolean l2 = l(iArr);
        boolean m10 = m();
        if (!l2 && !m10) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            invalidateSelf();
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        b bVar = this.f38424u;
        if (bVar.f38441l != i6) {
            bVar.f38441l = i6;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38424u.getClass();
        super.invalidateSelf();
    }

    @Override // yb.m
    public final void setShapeAppearanceModel(i iVar) {
        this.f38424u.f38431a = iVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f38424u.f = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f38424u;
        if (bVar.f38436g != mode) {
            bVar.f38436g = mode;
            m();
            super.invalidateSelf();
        }
    }

    public f(Context context, AttributeSet attributeSet, int i6, int i10) {
        this(i.b(context, attributeSet, i6, i10).a());
    }

    public f(i iVar) {
        this(new b(iVar));
    }

    public f(b bVar) {
        j jVar;
        this.f38425v = new l.f[4];
        this.f38426w = new l.f[4];
        this.f38427x = new BitSet(8);
        this.f38429z = new Matrix();
        this.A = new Path();
        this.B = new Path();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new Region();
        this.F = new Region();
        Paint paint = new Paint(1);
        this.H = paint;
        Paint paint2 = new Paint(1);
        this.I = paint2;
        this.J = new xb.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            jVar = j.a.f38485a;
        } else {
            jVar = new j();
        }
        this.L = jVar;
        this.O = new RectF();
        this.P = true;
        this.f38424u = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.K = new a();
    }

    /* compiled from: MaterialShapeDrawable.java */
    /* loaded from: classes.dex */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public i f38431a;

        /* renamed from: b  reason: collision with root package name */
        public nb.a f38432b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f38433c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f38434d;

        /* renamed from: e  reason: collision with root package name */
        public final ColorStateList f38435e;
        public ColorStateList f;

        /* renamed from: g  reason: collision with root package name */
        public PorterDuff.Mode f38436g;

        /* renamed from: h  reason: collision with root package name */
        public Rect f38437h;

        /* renamed from: i  reason: collision with root package name */
        public final float f38438i;

        /* renamed from: j  reason: collision with root package name */
        public float f38439j;

        /* renamed from: k  reason: collision with root package name */
        public float f38440k;

        /* renamed from: l  reason: collision with root package name */
        public int f38441l;

        /* renamed from: m  reason: collision with root package name */
        public float f38442m;

        /* renamed from: n  reason: collision with root package name */
        public float f38443n;

        /* renamed from: o  reason: collision with root package name */
        public final float f38444o;

        /* renamed from: p  reason: collision with root package name */
        public final int f38445p;

        /* renamed from: q  reason: collision with root package name */
        public int f38446q;
        public int r;

        /* renamed from: s  reason: collision with root package name */
        public int f38447s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f38448t;

        /* renamed from: u  reason: collision with root package name */
        public final Paint.Style f38449u;

        public b(i iVar) {
            this.f38433c = null;
            this.f38434d = null;
            this.f38435e = null;
            this.f = null;
            this.f38436g = PorterDuff.Mode.SRC_IN;
            this.f38437h = null;
            this.f38438i = 1.0f;
            this.f38439j = 1.0f;
            this.f38441l = 255;
            this.f38442m = 0.0f;
            this.f38443n = 0.0f;
            this.f38444o = 0.0f;
            this.f38445p = 0;
            this.f38446q = 0;
            this.r = 0;
            this.f38447s = 0;
            this.f38448t = false;
            this.f38449u = Paint.Style.FILL_AND_STROKE;
            this.f38431a = iVar;
            this.f38432b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            f fVar = new f(this);
            fVar.f38428y = true;
            return fVar;
        }

        public b(b bVar) {
            this.f38433c = null;
            this.f38434d = null;
            this.f38435e = null;
            this.f = null;
            this.f38436g = PorterDuff.Mode.SRC_IN;
            this.f38437h = null;
            this.f38438i = 1.0f;
            this.f38439j = 1.0f;
            this.f38441l = 255;
            this.f38442m = 0.0f;
            this.f38443n = 0.0f;
            this.f38444o = 0.0f;
            this.f38445p = 0;
            this.f38446q = 0;
            this.r = 0;
            this.f38447s = 0;
            this.f38448t = false;
            this.f38449u = Paint.Style.FILL_AND_STROKE;
            this.f38431a = bVar.f38431a;
            this.f38432b = bVar.f38432b;
            this.f38440k = bVar.f38440k;
            this.f38433c = bVar.f38433c;
            this.f38434d = bVar.f38434d;
            this.f38436g = bVar.f38436g;
            this.f = bVar.f;
            this.f38441l = bVar.f38441l;
            this.f38438i = bVar.f38438i;
            this.r = bVar.r;
            this.f38445p = bVar.f38445p;
            this.f38448t = bVar.f38448t;
            this.f38439j = bVar.f38439j;
            this.f38442m = bVar.f38442m;
            this.f38443n = bVar.f38443n;
            this.f38444o = bVar.f38444o;
            this.f38446q = bVar.f38446q;
            this.f38447s = bVar.f38447s;
            this.f38435e = bVar.f38435e;
            this.f38449u = bVar.f38449u;
            if (bVar.f38437h != null) {
                this.f38437h = new Rect(bVar.f38437h);
            }
        }
    }
}
