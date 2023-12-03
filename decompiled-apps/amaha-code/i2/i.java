package i2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.theinnerhour.b2b.utils.Constants;
import j0.g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import k0.a;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: VectorDrawableCompat.java */
/* loaded from: classes.dex */
public final class i extends i2.h {
    public static final PorterDuff.Mode D = PorterDuff.Mode.SRC_IN;
    public final float[] A;
    public final Matrix B;
    public final Rect C;

    /* renamed from: v  reason: collision with root package name */
    public g f19684v;

    /* renamed from: w  reason: collision with root package name */
    public PorterDuffColorFilter f19685w;

    /* renamed from: x  reason: collision with root package name */
    public ColorFilter f19686x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f19687y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f19688z;

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class d {
        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class g extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public int f19729a;

        /* renamed from: b  reason: collision with root package name */
        public f f19730b;

        /* renamed from: c  reason: collision with root package name */
        public ColorStateList f19731c;

        /* renamed from: d  reason: collision with root package name */
        public PorterDuff.Mode f19732d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f19733e;
        public Bitmap f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f19734g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f19735h;

        /* renamed from: i  reason: collision with root package name */
        public int f19736i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f19737j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f19738k;

        /* renamed from: l  reason: collision with root package name */
        public Paint f19739l;

        public g(g gVar) {
            this.f19731c = null;
            this.f19732d = i.D;
            if (gVar != null) {
                this.f19729a = gVar.f19729a;
                f fVar = new f(gVar.f19730b);
                this.f19730b = fVar;
                if (gVar.f19730b.f19719e != null) {
                    fVar.f19719e = new Paint(gVar.f19730b.f19719e);
                }
                if (gVar.f19730b.f19718d != null) {
                    this.f19730b.f19718d = new Paint(gVar.f19730b.f19718d);
                }
                this.f19731c = gVar.f19731c;
                this.f19732d = gVar.f19732d;
                this.f19733e = gVar.f19733e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19729a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public g() {
            this.f19731c = null;
            this.f19732d = i.D;
            this.f19730b = new f();
        }
    }

    public i() {
        this.f19688z = true;
        this.A = new float[9];
        this.B = new Matrix();
        this.C = new Rect();
        this.f19684v = new g();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bf, code lost:
        if (r10 == false) goto L66;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        boolean z10;
        boolean z11;
        Paint paint;
        boolean z12;
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.C;
        copyBounds(rect);
        if (rect.width() > 0 && rect.height() > 0) {
            ColorFilter colorFilter = this.f19686x;
            if (colorFilter == null) {
                colorFilter = this.f19685w;
            }
            Matrix matrix = this.B;
            canvas.getMatrix(matrix);
            float[] fArr = this.A;
            matrix.getValues(fArr);
            boolean z13 = false;
            float abs = Math.abs(fArr[0]);
            float abs2 = Math.abs(fArr[4]);
            float abs3 = Math.abs(fArr[1]);
            float abs4 = Math.abs(fArr[3]);
            if (abs3 != 0.0f || abs4 != 0.0f) {
                abs = 1.0f;
                abs2 = 1.0f;
            }
            int min = Math.min((int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID, (int) (rect.width() * abs));
            int min2 = Math.min((int) Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID, (int) (rect.height() * abs2));
            if (min > 0 && min2 > 0) {
                int save = canvas.save();
                canvas.translate(rect.left, rect.top);
                if (isAutoMirrored() && k0.a.b(this) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    canvas.translate(rect.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                rect.offsetTo(0, 0);
                g gVar = this.f19684v;
                Bitmap bitmap = gVar.f;
                if (bitmap != null) {
                    if (min == bitmap.getWidth() && min2 == gVar.f.getHeight()) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                }
                gVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
                gVar.f19738k = true;
                if (!this.f19688z) {
                    g gVar2 = this.f19684v;
                    gVar2.f.eraseColor(0);
                    Canvas canvas2 = new Canvas(gVar2.f);
                    f fVar = gVar2.f19730b;
                    fVar.a(fVar.f19720g, f.f19714p, canvas2, min, min2);
                } else {
                    g gVar3 = this.f19684v;
                    if (!gVar3.f19738k && gVar3.f19734g == gVar3.f19731c && gVar3.f19735h == gVar3.f19732d && gVar3.f19737j == gVar3.f19733e && gVar3.f19736i == gVar3.f19730b.getRootAlpha()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        g gVar4 = this.f19684v;
                        gVar4.f.eraseColor(0);
                        Canvas canvas3 = new Canvas(gVar4.f);
                        f fVar2 = gVar4.f19730b;
                        fVar2.a(fVar2.f19720g, f.f19714p, canvas3, min, min2);
                        g gVar5 = this.f19684v;
                        gVar5.f19734g = gVar5.f19731c;
                        gVar5.f19735h = gVar5.f19732d;
                        gVar5.f19736i = gVar5.f19730b.getRootAlpha();
                        gVar5.f19737j = gVar5.f19733e;
                        gVar5.f19738k = false;
                    }
                }
                g gVar6 = this.f19684v;
                if (gVar6.f19730b.getRootAlpha() < 255) {
                    z13 = true;
                }
                if (!z13 && colorFilter == null) {
                    paint = null;
                } else {
                    if (gVar6.f19739l == null) {
                        Paint paint2 = new Paint();
                        gVar6.f19739l = paint2;
                        paint2.setFilterBitmap(true);
                    }
                    gVar6.f19739l.setAlpha(gVar6.f19730b.getRootAlpha());
                    gVar6.f19739l.setColorFilter(colorFilter);
                    paint = gVar6.f19739l;
                }
                canvas.drawBitmap(gVar6.f, (Rect) null, rect, paint);
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.C0349a.a(drawable);
        }
        return this.f19684v.f19730b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f19684v.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.b.c(drawable);
        }
        return this.f19686x;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f19683u != null && Build.VERSION.SDK_INT >= 24) {
            return new h(this.f19683u.getConstantState());
        }
        this.f19684v.f19729a = getChangingConfigurations();
        return this.f19684v;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f19684v.f19730b.f19722i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f19684v.f19730b.f19721h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return a.C0349a.d(drawable);
        }
        return this.f19684v.f19733e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f19684v;
            if (gVar != null) {
                f fVar = gVar.f19730b;
                if (fVar.f19727n == null) {
                    fVar.f19727n = Boolean.valueOf(fVar.f19720g.a());
                }
                if (fVar.f19727n.booleanValue() || ((colorStateList = this.f19684v.f19731c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f19687y && super.mutate() == this) {
            this.f19684v = new g(this.f19684v);
            this.f19687y = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f19684v;
        ColorStateList colorStateList = gVar.f19731c;
        if (colorStateList != null && (mode = gVar.f19732d) != null) {
            this.f19685w = a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        } else {
            z10 = false;
        }
        f fVar = gVar.f19730b;
        if (fVar.f19727n == null) {
            fVar.f19727n = Boolean.valueOf(fVar.f19720g.a());
        }
        if (fVar.f19727n.booleanValue()) {
            boolean b10 = gVar.f19730b.f19720g.b(iArr);
            gVar.f19738k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setAlpha(i6);
        } else if (this.f19684v.f19730b.getRootAlpha() != i6) {
            this.f19684v.f19730b.setRootAlpha(i6);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.C0349a.e(drawable, z10);
        } else {
            this.f19684v.f19733e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f19686x = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            k0.a.d(drawable, i6);
        } else {
            setTintList(ColorStateList.valueOf(i6));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.h(drawable, colorStateList);
            return;
        }
        g gVar = this.f19684v;
        if (gVar.f19731c != colorStateList) {
            gVar.f19731c = colorStateList;
            this.f19685w = a(colorStateList, gVar.f19732d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.i(drawable, mode);
            return;
        }
        g gVar = this.f19684v;
        if (gVar.f19732d != mode) {
            gVar.f19732d = mode;
            this.f19685w = a(gVar.f19731c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public final Drawable.ConstantState f19740a;

        public h(Drawable.ConstantState constantState) {
            this.f19740a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f19740a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f19740a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            i iVar = new i();
            iVar.f19683u = (VectorDrawable) this.f19740a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f19683u = (VectorDrawable) this.f19740a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f19683u = (VectorDrawable) this.f19740a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static abstract class e extends d {

        /* renamed from: a  reason: collision with root package name */
        public g.a[] f19710a;

        /* renamed from: b  reason: collision with root package name */
        public String f19711b;

        /* renamed from: c  reason: collision with root package name */
        public int f19712c;

        /* renamed from: d  reason: collision with root package name */
        public final int f19713d;

        public e() {
            this.f19710a = null;
            this.f19712c = 0;
        }

        public g.a[] getPathData() {
            return this.f19710a;
        }

        public String getPathName() {
            return this.f19711b;
        }

        public void setPathData(g.a[] aVarArr) {
            if (!j0.g.a(this.f19710a, aVarArr)) {
                this.f19710a = j0.g.e(aVarArr);
                return;
            }
            g.a[] aVarArr2 = this.f19710a;
            for (int i6 = 0; i6 < aVarArr.length; i6++) {
                aVarArr2[i6].f21628a = aVarArr[i6].f21628a;
                int i10 = 0;
                while (true) {
                    float[] fArr = aVarArr[i6].f21629b;
                    if (i10 < fArr.length) {
                        aVarArr2[i6].f21629b[i10] = fArr[i10];
                        i10++;
                    }
                }
            }
        }

        public e(e eVar) {
            this.f19710a = null;
            this.f19712c = 0;
            this.f19711b = eVar.f19711b;
            this.f19713d = eVar.f19713d;
            this.f19710a = j0.g.e(eVar.f19710a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        ColorStateList colorStateList;
        f fVar;
        int i6;
        Drawable drawable = this.f19683u;
        if (drawable != null) {
            a.b.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f19684v;
        gVar.f19730b = new f();
        TypedArray f2 = i0.h.f(resources, theme, attributeSet, i2.a.f19657a);
        g gVar2 = this.f19684v;
        f fVar2 = gVar2.f19730b;
        int c10 = i0.h.c(f2, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (c10 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (c10 != 5) {
            if (c10 != 9) {
                switch (c10) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f19732d = mode;
        int i10 = 1;
        if (i0.h.e(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            f2.getValue(1, typedValue);
            int i11 = typedValue.type;
            if (i11 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i11 >= 28 && i11 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f2.getResources();
                int resourceId = f2.getResourceId(1, 0);
                ThreadLocal<TypedValue> threadLocal = i0.b.f19612a;
                try {
                    colorStateList = i0.b.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e10) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e10);
                }
            }
            if (colorStateList != null) {
                gVar2.f19731c = colorStateList;
            }
            boolean z10 = gVar2.f19733e;
            if (i0.h.e(xmlPullParser, "autoMirrored")) {
                z10 = f2.getBoolean(5, z10);
            }
            gVar2.f19733e = z10;
            fVar2.f19723j = i0.h.b(f2, xmlPullParser, "viewportWidth", 7, fVar2.f19723j);
            float b10 = i0.h.b(f2, xmlPullParser, "viewportHeight", 8, fVar2.f19724k);
            fVar2.f19724k = b10;
            if (fVar2.f19723j > 0.0f) {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
            } else if (b10 > 0.0f) {
                fVar2.f19721h = f2.getDimension(3, fVar2.f19721h);
                float dimension = f2.getDimension(2, fVar2.f19722i);
                fVar2.f19722i = dimension;
                if (fVar2.f19721h <= 0.0f) {
                    throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires width > 0");
                } else if (dimension > 0.0f) {
                    fVar2.setAlpha(i0.h.b(f2, xmlPullParser, "alpha", 4, fVar2.getAlpha()));
                    String string = f2.getString(0);
                    if (string != null) {
                        fVar2.f19726m = string;
                        fVar2.f19728o.put(string, fVar2);
                    }
                    f2.recycle();
                    gVar.f19729a = getChangingConfigurations();
                    gVar.f19738k = true;
                    g gVar3 = this.f19684v;
                    f fVar3 = gVar3.f19730b;
                    ArrayDeque arrayDeque = new ArrayDeque();
                    arrayDeque.push(fVar3.f19720g);
                    int eventType = xmlPullParser.getEventType();
                    int depth = xmlPullParser.getDepth() + 1;
                    boolean z11 = true;
                    for (int i12 = 3; eventType != i10 && (xmlPullParser.getDepth() >= depth || eventType != i12); i12 = 3) {
                        if (eventType == 2) {
                            String name = xmlPullParser.getName();
                            c cVar = (c) arrayDeque.peek();
                            boolean equals = "path".equals(name);
                            t.b<String, Object> bVar = fVar3.f19728o;
                            fVar = fVar3;
                            if (equals) {
                                b bVar2 = new b();
                                TypedArray f10 = i0.h.f(resources, theme, attributeSet, i2.a.f19659c);
                                if (i0.h.e(xmlPullParser, "pathData")) {
                                    String string2 = f10.getString(0);
                                    if (string2 != null) {
                                        bVar2.f19711b = string2;
                                    }
                                    String string3 = f10.getString(2);
                                    if (string3 != null) {
                                        bVar2.f19710a = j0.g.c(string3);
                                    }
                                    bVar2.f19690g = i0.h.a(f10, xmlPullParser, theme, "fillColor", 1);
                                    i6 = depth;
                                    bVar2.f19692i = i0.h.b(f10, xmlPullParser, "fillAlpha", 12, bVar2.f19692i);
                                    int c11 = i0.h.c(f10, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = bVar2.f19696m;
                                    if (c11 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (c11 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (c11 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    bVar2.f19696m = cap;
                                    int c12 = i0.h.c(f10, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = bVar2.f19697n;
                                    if (c12 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (c12 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (c12 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    bVar2.f19697n = join;
                                    bVar2.f19698o = i0.h.b(f10, xmlPullParser, "strokeMiterLimit", 10, bVar2.f19698o);
                                    bVar2.f19689e = i0.h.a(f10, xmlPullParser, theme, "strokeColor", 3);
                                    bVar2.f19691h = i0.h.b(f10, xmlPullParser, "strokeAlpha", 11, bVar2.f19691h);
                                    bVar2.f = i0.h.b(f10, xmlPullParser, "strokeWidth", 4, bVar2.f);
                                    bVar2.f19694k = i0.h.b(f10, xmlPullParser, "trimPathEnd", 6, bVar2.f19694k);
                                    bVar2.f19695l = i0.h.b(f10, xmlPullParser, "trimPathOffset", 7, bVar2.f19695l);
                                    bVar2.f19693j = i0.h.b(f10, xmlPullParser, "trimPathStart", 5, bVar2.f19693j);
                                    bVar2.f19712c = i0.h.c(f10, xmlPullParser, "fillType", 13, bVar2.f19712c);
                                } else {
                                    i6 = depth;
                                }
                                f10.recycle();
                                cVar.f19700b.add(bVar2);
                                if (bVar2.getPathName() != null) {
                                    bVar.put(bVar2.getPathName(), bVar2);
                                }
                                gVar3.f19729a |= bVar2.f19713d;
                                z11 = false;
                            } else {
                                i6 = depth;
                                if ("clip-path".equals(name)) {
                                    a aVar = new a();
                                    if (i0.h.e(xmlPullParser, "pathData")) {
                                        TypedArray f11 = i0.h.f(resources, theme, attributeSet, i2.a.f19660d);
                                        String string4 = f11.getString(0);
                                        if (string4 != null) {
                                            aVar.f19711b = string4;
                                        }
                                        String string5 = f11.getString(1);
                                        if (string5 != null) {
                                            aVar.f19710a = j0.g.c(string5);
                                        }
                                        aVar.f19712c = i0.h.c(f11, xmlPullParser, "fillType", 2, 0);
                                        f11.recycle();
                                    }
                                    cVar.f19700b.add(aVar);
                                    if (aVar.getPathName() != null) {
                                        bVar.put(aVar.getPathName(), aVar);
                                    }
                                    gVar3.f19729a |= aVar.f19713d;
                                } else if ("group".equals(name)) {
                                    c cVar2 = new c();
                                    TypedArray f12 = i0.h.f(resources, theme, attributeSet, i2.a.f19658b);
                                    cVar2.f19701c = i0.h.b(f12, xmlPullParser, "rotation", 5, cVar2.f19701c);
                                    cVar2.f19702d = f12.getFloat(1, cVar2.f19702d);
                                    cVar2.f19703e = f12.getFloat(2, cVar2.f19703e);
                                    cVar2.f = i0.h.b(f12, xmlPullParser, "scaleX", 3, cVar2.f);
                                    cVar2.f19704g = i0.h.b(f12, xmlPullParser, "scaleY", 4, cVar2.f19704g);
                                    cVar2.f19705h = i0.h.b(f12, xmlPullParser, "translateX", 6, cVar2.f19705h);
                                    cVar2.f19706i = i0.h.b(f12, xmlPullParser, "translateY", 7, cVar2.f19706i);
                                    String string6 = f12.getString(0);
                                    if (string6 != null) {
                                        cVar2.f19709l = string6;
                                    }
                                    cVar2.c();
                                    f12.recycle();
                                    cVar.f19700b.add(cVar2);
                                    arrayDeque.push(cVar2);
                                    if (cVar2.getGroupName() != null) {
                                        bVar.put(cVar2.getGroupName(), cVar2);
                                    }
                                    gVar3.f19729a = cVar2.f19708k | gVar3.f19729a;
                                }
                            }
                        } else {
                            fVar = fVar3;
                            i6 = depth;
                            if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                                arrayDeque.pop();
                            }
                        }
                        eventType = xmlPullParser.next();
                        fVar3 = fVar;
                        depth = i6;
                        i10 = 1;
                    }
                    if (!z11) {
                        this.f19685w = a(gVar.f19731c, gVar.f19732d);
                        return;
                    }
                    throw new XmlPullParserException("no path defined");
                } else {
                    throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires height > 0");
                }
            } else {
                throw new XmlPullParserException(f2.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
            }
        }
        colorStateList = null;
        if (colorStateList != null) {
        }
        boolean z102 = gVar2.f19733e;
        if (i0.h.e(xmlPullParser, "autoMirrored")) {
        }
        gVar2.f19733e = z102;
        fVar2.f19723j = i0.h.b(f2, xmlPullParser, "viewportWidth", 7, fVar2.f19723j);
        float b102 = i0.h.b(f2, xmlPullParser, "viewportHeight", 8, fVar2.f19724k);
        fVar2.f19724k = b102;
        if (fVar2.f19723j > 0.0f) {
        }
    }

    public i(g gVar) {
        this.f19688z = true;
        this.A = new float[9];
        this.B = new Matrix();
        this.C = new Rect();
        this.f19684v = gVar;
        this.f19685w = a(gVar.f19731c, gVar.f19732d);
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class b extends e {

        /* renamed from: e  reason: collision with root package name */
        public i0.c f19689e;
        public float f;

        /* renamed from: g  reason: collision with root package name */
        public i0.c f19690g;

        /* renamed from: h  reason: collision with root package name */
        public float f19691h;

        /* renamed from: i  reason: collision with root package name */
        public float f19692i;

        /* renamed from: j  reason: collision with root package name */
        public float f19693j;

        /* renamed from: k  reason: collision with root package name */
        public float f19694k;

        /* renamed from: l  reason: collision with root package name */
        public float f19695l;

        /* renamed from: m  reason: collision with root package name */
        public Paint.Cap f19696m;

        /* renamed from: n  reason: collision with root package name */
        public Paint.Join f19697n;

        /* renamed from: o  reason: collision with root package name */
        public float f19698o;

        public b() {
            this.f = 0.0f;
            this.f19691h = 1.0f;
            this.f19692i = 1.0f;
            this.f19693j = 0.0f;
            this.f19694k = 1.0f;
            this.f19695l = 0.0f;
            this.f19696m = Paint.Cap.BUTT;
            this.f19697n = Paint.Join.MITER;
            this.f19698o = 4.0f;
        }

        @Override // i2.i.d
        public final boolean a() {
            if (!this.f19690g.b() && !this.f19689e.b()) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        @Override // i2.i.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean b(int[] iArr) {
            boolean z10;
            i0.c cVar;
            i0.c cVar2 = this.f19690g;
            boolean z11 = true;
            if (cVar2.b()) {
                ColorStateList colorStateList = cVar2.f19614b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != cVar2.f19615c) {
                    cVar2.f19615c = colorForState;
                    z10 = true;
                    cVar = this.f19689e;
                    if (cVar.b()) {
                        ColorStateList colorStateList2 = cVar.f19614b;
                        int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                        if (colorForState2 != cVar.f19615c) {
                            cVar.f19615c = colorForState2;
                            return z11 | z10;
                        }
                    }
                    z11 = false;
                    return z11 | z10;
                }
            }
            z10 = false;
            cVar = this.f19689e;
            if (cVar.b()) {
            }
            z11 = false;
            return z11 | z10;
        }

        public float getFillAlpha() {
            return this.f19692i;
        }

        public int getFillColor() {
            return this.f19690g.f19615c;
        }

        public float getStrokeAlpha() {
            return this.f19691h;
        }

        public int getStrokeColor() {
            return this.f19689e.f19615c;
        }

        public float getStrokeWidth() {
            return this.f;
        }

        public float getTrimPathEnd() {
            return this.f19694k;
        }

        public float getTrimPathOffset() {
            return this.f19695l;
        }

        public float getTrimPathStart() {
            return this.f19693j;
        }

        public void setFillAlpha(float f) {
            this.f19692i = f;
        }

        public void setFillColor(int i6) {
            this.f19690g.f19615c = i6;
        }

        public void setStrokeAlpha(float f) {
            this.f19691h = f;
        }

        public void setStrokeColor(int i6) {
            this.f19689e.f19615c = i6;
        }

        public void setStrokeWidth(float f) {
            this.f = f;
        }

        public void setTrimPathEnd(float f) {
            this.f19694k = f;
        }

        public void setTrimPathOffset(float f) {
            this.f19695l = f;
        }

        public void setTrimPathStart(float f) {
            this.f19693j = f;
        }

        public b(b bVar) {
            super(bVar);
            this.f = 0.0f;
            this.f19691h = 1.0f;
            this.f19692i = 1.0f;
            this.f19693j = 0.0f;
            this.f19694k = 1.0f;
            this.f19695l = 0.0f;
            this.f19696m = Paint.Cap.BUTT;
            this.f19697n = Paint.Join.MITER;
            this.f19698o = 4.0f;
            this.f19689e = bVar.f19689e;
            this.f = bVar.f;
            this.f19691h = bVar.f19691h;
            this.f19690g = bVar.f19690g;
            this.f19712c = bVar.f19712c;
            this.f19692i = bVar.f19692i;
            this.f19693j = bVar.f19693j;
            this.f19694k = bVar.f19694k;
            this.f19695l = bVar.f19695l;
            this.f19696m = bVar.f19696m;
            this.f19697n = bVar.f19697n;
            this.f19698o = bVar.f19698o;
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class c extends d {

        /* renamed from: a  reason: collision with root package name */
        public final Matrix f19699a;

        /* renamed from: b  reason: collision with root package name */
        public final ArrayList<d> f19700b;

        /* renamed from: c  reason: collision with root package name */
        public float f19701c;

        /* renamed from: d  reason: collision with root package name */
        public float f19702d;

        /* renamed from: e  reason: collision with root package name */
        public float f19703e;
        public float f;

        /* renamed from: g  reason: collision with root package name */
        public float f19704g;

        /* renamed from: h  reason: collision with root package name */
        public float f19705h;

        /* renamed from: i  reason: collision with root package name */
        public float f19706i;

        /* renamed from: j  reason: collision with root package name */
        public final Matrix f19707j;

        /* renamed from: k  reason: collision with root package name */
        public final int f19708k;

        /* renamed from: l  reason: collision with root package name */
        public String f19709l;

        public c() {
            this.f19699a = new Matrix();
            this.f19700b = new ArrayList<>();
            this.f19701c = 0.0f;
            this.f19702d = 0.0f;
            this.f19703e = 0.0f;
            this.f = 1.0f;
            this.f19704g = 1.0f;
            this.f19705h = 0.0f;
            this.f19706i = 0.0f;
            this.f19707j = new Matrix();
            this.f19709l = null;
        }

        @Override // i2.i.d
        public final boolean a() {
            int i6 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f19700b;
                if (i6 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i6).a()) {
                    return true;
                }
                i6++;
            }
        }

        @Override // i2.i.d
        public final boolean b(int[] iArr) {
            int i6 = 0;
            boolean z10 = false;
            while (true) {
                ArrayList<d> arrayList = this.f19700b;
                if (i6 < arrayList.size()) {
                    z10 |= arrayList.get(i6).b(iArr);
                    i6++;
                } else {
                    return z10;
                }
            }
        }

        public final void c() {
            Matrix matrix = this.f19707j;
            matrix.reset();
            matrix.postTranslate(-this.f19702d, -this.f19703e);
            matrix.postScale(this.f, this.f19704g);
            matrix.postRotate(this.f19701c, 0.0f, 0.0f);
            matrix.postTranslate(this.f19705h + this.f19702d, this.f19706i + this.f19703e);
        }

        public String getGroupName() {
            return this.f19709l;
        }

        public Matrix getLocalMatrix() {
            return this.f19707j;
        }

        public float getPivotX() {
            return this.f19702d;
        }

        public float getPivotY() {
            return this.f19703e;
        }

        public float getRotation() {
            return this.f19701c;
        }

        public float getScaleX() {
            return this.f;
        }

        public float getScaleY() {
            return this.f19704g;
        }

        public float getTranslateX() {
            return this.f19705h;
        }

        public float getTranslateY() {
            return this.f19706i;
        }

        public void setPivotX(float f) {
            if (f != this.f19702d) {
                this.f19702d = f;
                c();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f19703e) {
                this.f19703e = f;
                c();
            }
        }

        public void setRotation(float f) {
            if (f != this.f19701c) {
                this.f19701c = f;
                c();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f) {
                this.f = f;
                c();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f19704g) {
                this.f19704g = f;
                c();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f19705h) {
                this.f19705h = f;
                c();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f19706i) {
                this.f19706i = f;
                c();
            }
        }

        public c(c cVar, t.b<String, Object> bVar) {
            e aVar;
            this.f19699a = new Matrix();
            this.f19700b = new ArrayList<>();
            this.f19701c = 0.0f;
            this.f19702d = 0.0f;
            this.f19703e = 0.0f;
            this.f = 1.0f;
            this.f19704g = 1.0f;
            this.f19705h = 0.0f;
            this.f19706i = 0.0f;
            Matrix matrix = new Matrix();
            this.f19707j = matrix;
            this.f19709l = null;
            this.f19701c = cVar.f19701c;
            this.f19702d = cVar.f19702d;
            this.f19703e = cVar.f19703e;
            this.f = cVar.f;
            this.f19704g = cVar.f19704g;
            this.f19705h = cVar.f19705h;
            this.f19706i = cVar.f19706i;
            String str = cVar.f19709l;
            this.f19709l = str;
            this.f19708k = cVar.f19708k;
            if (str != null) {
                bVar.put(str, this);
            }
            matrix.set(cVar.f19707j);
            ArrayList<d> arrayList = cVar.f19700b;
            for (int i6 = 0; i6 < arrayList.size(); i6++) {
                d dVar = arrayList.get(i6);
                if (dVar instanceof c) {
                    this.f19700b.add(new c((c) dVar, bVar));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else if (dVar instanceof a) {
                        aVar = new a((a) dVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f19700b.add(aVar);
                    String str2 = aVar.f19711b;
                    if (str2 != null) {
                        bVar.put(str2, aVar);
                    }
                }
            }
        }
    }

    /* compiled from: VectorDrawableCompat.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: p  reason: collision with root package name */
        public static final Matrix f19714p = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        public final Path f19715a;

        /* renamed from: b  reason: collision with root package name */
        public final Path f19716b;

        /* renamed from: c  reason: collision with root package name */
        public final Matrix f19717c;

        /* renamed from: d  reason: collision with root package name */
        public Paint f19718d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f19719e;
        public PathMeasure f;

        /* renamed from: g  reason: collision with root package name */
        public final c f19720g;

        /* renamed from: h  reason: collision with root package name */
        public float f19721h;

        /* renamed from: i  reason: collision with root package name */
        public float f19722i;

        /* renamed from: j  reason: collision with root package name */
        public float f19723j;

        /* renamed from: k  reason: collision with root package name */
        public float f19724k;

        /* renamed from: l  reason: collision with root package name */
        public int f19725l;

        /* renamed from: m  reason: collision with root package name */
        public String f19726m;

        /* renamed from: n  reason: collision with root package name */
        public Boolean f19727n;

        /* renamed from: o  reason: collision with root package name */
        public final t.b<String, Object> f19728o;

        public f() {
            this.f19717c = new Matrix();
            this.f19721h = 0.0f;
            this.f19722i = 0.0f;
            this.f19723j = 0.0f;
            this.f19724k = 0.0f;
            this.f19725l = 255;
            this.f19726m = null;
            this.f19727n = null;
            this.f19728o = new t.b<>();
            this.f19720g = new c();
            this.f19715a = new Path();
            this.f19716b = new Path();
        }

        public final void a(c cVar, Matrix matrix, Canvas canvas, int i6, int i10) {
            int i11;
            float f;
            float f2;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            Path.FillType fillType;
            Path.FillType fillType2;
            cVar.f19699a.set(matrix);
            Matrix matrix2 = cVar.f19699a;
            matrix2.preConcat(cVar.f19707j);
            canvas.save();
            char c10 = 0;
            int i12 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f19700b;
                if (i12 < arrayList.size()) {
                    d dVar = arrayList.get(i12);
                    if (dVar instanceof c) {
                        a((c) dVar, matrix2, canvas, i6, i10);
                    } else if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f10 = i6 / this.f19723j;
                        float f11 = i10 / this.f19724k;
                        float min = Math.min(f10, f11);
                        Matrix matrix3 = this.f19717c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f10, f11);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        i11 = i12;
                        float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                        float f12 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), hypot);
                        if (max > 0.0f) {
                            f = Math.abs(f12) / max;
                        } else {
                            f = 0.0f;
                        }
                        if (f != 0.0f) {
                            eVar.getClass();
                            Path path = this.f19715a;
                            path.reset();
                            g.a[] aVarArr = eVar.f19710a;
                            if (aVarArr != null) {
                                g.a.b(aVarArr, path);
                            }
                            Path path2 = this.f19716b;
                            path2.reset();
                            if (eVar instanceof a) {
                                if (eVar.f19712c == 0) {
                                    fillType2 = Path.FillType.WINDING;
                                } else {
                                    fillType2 = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType2);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f13 = bVar.f19693j;
                                if (f13 != 0.0f || bVar.f19694k != 1.0f) {
                                    float f14 = bVar.f19695l;
                                    float f15 = (f13 + f14) % 1.0f;
                                    float f16 = (bVar.f19694k + f14) % 1.0f;
                                    if (this.f == null) {
                                        this.f = new PathMeasure();
                                    }
                                    this.f.setPath(path, false);
                                    float length = this.f.getLength();
                                    float f17 = f15 * length;
                                    float f18 = f16 * length;
                                    path.reset();
                                    if (f17 > f18) {
                                        this.f.getSegment(f17, length, path, true);
                                        f2 = 0.0f;
                                        this.f.getSegment(0.0f, f18, path, true);
                                    } else {
                                        f2 = 0.0f;
                                        this.f.getSegment(f17, f18, path, true);
                                    }
                                    path.rLineTo(f2, f2);
                                }
                                path2.addPath(path, matrix3);
                                i0.c cVar2 = bVar.f19690g;
                                if (cVar2.f19613a != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && cVar2.f19615c == 0) {
                                    z11 = false;
                                } else {
                                    z11 = true;
                                }
                                if (z11) {
                                    if (this.f19719e == null) {
                                        Paint paint = new Paint(1);
                                        this.f19719e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f19719e;
                                    Shader shader = cVar2.f19613a;
                                    if (shader != null) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z15) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f19692i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i13 = cVar2.f19615c;
                                        float f19 = bVar.f19692i;
                                        PorterDuff.Mode mode = i.D;
                                        paint2.setColor((i13 & 16777215) | (((int) (Color.alpha(i13) * f19)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    if (bVar.f19712c == 0) {
                                        fillType = Path.FillType.WINDING;
                                    } else {
                                        fillType = Path.FillType.EVEN_ODD;
                                    }
                                    path2.setFillType(fillType);
                                    canvas.drawPath(path2, paint2);
                                }
                                i0.c cVar3 = bVar.f19689e;
                                if (cVar3.f19613a != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12 && cVar3.f19615c == 0) {
                                    z13 = false;
                                } else {
                                    z13 = true;
                                }
                                if (z13) {
                                    if (this.f19718d == null) {
                                        z14 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f19718d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z14 = true;
                                    }
                                    Paint paint4 = this.f19718d;
                                    Paint.Join join = bVar.f19697n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.f19696m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f19698o);
                                    Shader shader2 = cVar3.f19613a;
                                    if (shader2 == null) {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f19691h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i14 = cVar3.f19615c;
                                        float f20 = bVar.f19691h;
                                        PorterDuff.Mode mode2 = i.D;
                                        paint4.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f20)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f * f * min);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                        i12 = i11 + 1;
                        c10 = 0;
                    }
                    i11 = i12;
                    i12 = i11 + 1;
                    c10 = 0;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f19725l;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i6) {
            this.f19725l = i6;
        }

        public f(f fVar) {
            this.f19717c = new Matrix();
            this.f19721h = 0.0f;
            this.f19722i = 0.0f;
            this.f19723j = 0.0f;
            this.f19724k = 0.0f;
            this.f19725l = 255;
            this.f19726m = null;
            this.f19727n = null;
            t.b<String, Object> bVar = new t.b<>();
            this.f19728o = bVar;
            this.f19720g = new c(fVar.f19720g, bVar);
            this.f19715a = new Path(fVar.f19715a);
            this.f19716b = new Path(fVar.f19716b);
            this.f19721h = fVar.f19721h;
            this.f19722i = fVar.f19722i;
            this.f19723j = fVar.f19723j;
            this.f19724k = fVar.f19724k;
            this.f19725l = fVar.f19725l;
            this.f19726m = fVar.f19726m;
            String str = fVar.f19726m;
            if (str != null) {
                bVar.put(str, this);
            }
            this.f19727n = fVar.f19727n;
        }
    }
}
