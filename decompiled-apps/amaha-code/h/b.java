package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.SparseArray;
import h.d;
import k0.a;
/* compiled from: DrawableContainerCompat.java */
/* loaded from: classes.dex */
public class b extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int G = 0;
    public boolean B;
    public a C;
    public long D;
    public long E;
    public C0266b F;

    /* renamed from: u  reason: collision with root package name */
    public c f16966u;

    /* renamed from: v  reason: collision with root package name */
    public Rect f16967v;

    /* renamed from: w  reason: collision with root package name */
    public Drawable f16968w;

    /* renamed from: x  reason: collision with root package name */
    public Drawable f16969x;

    /* renamed from: z  reason: collision with root package name */
    public boolean f16971z;

    /* renamed from: y  reason: collision with root package name */
    public int f16970y = 255;
    public int A = -1;

    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ b f16972u;

        public a(d dVar) {
            this.f16972u = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = this.f16972u;
            bVar.a(true);
            bVar.invalidateSelf();
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* loaded from: classes.dex */
    public static abstract class c extends Drawable.ConstantState {
        public boolean A;
        public ColorFilter B;
        public boolean C;
        public ColorStateList D;
        public PorterDuff.Mode E;
        public boolean F;
        public boolean G;

        /* renamed from: a  reason: collision with root package name */
        public final b f16974a;

        /* renamed from: b  reason: collision with root package name */
        public Resources f16975b;

        /* renamed from: c  reason: collision with root package name */
        public int f16976c;

        /* renamed from: d  reason: collision with root package name */
        public int f16977d;

        /* renamed from: e  reason: collision with root package name */
        public int f16978e;
        public SparseArray<Drawable.ConstantState> f;

        /* renamed from: g  reason: collision with root package name */
        public Drawable[] f16979g;

        /* renamed from: h  reason: collision with root package name */
        public int f16980h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f16981i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f16982j;

        /* renamed from: k  reason: collision with root package name */
        public Rect f16983k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16984l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f16985m;

        /* renamed from: n  reason: collision with root package name */
        public int f16986n;

        /* renamed from: o  reason: collision with root package name */
        public int f16987o;

        /* renamed from: p  reason: collision with root package name */
        public int f16988p;

        /* renamed from: q  reason: collision with root package name */
        public int f16989q;
        public boolean r;

        /* renamed from: s  reason: collision with root package name */
        public int f16990s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f16991t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f16992u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f16993v;

        /* renamed from: w  reason: collision with root package name */
        public boolean f16994w;

        /* renamed from: x  reason: collision with root package name */
        public int f16995x;

        /* renamed from: y  reason: collision with root package name */
        public int f16996y;

        /* renamed from: z  reason: collision with root package name */
        public int f16997z;

        public c(c cVar, b bVar, Resources resources) {
            Resources resources2;
            int i6;
            this.f16981i = false;
            this.f16984l = false;
            this.f16994w = true;
            this.f16996y = 0;
            this.f16997z = 0;
            this.f16974a = bVar;
            if (resources != null) {
                resources2 = resources;
            } else if (cVar != null) {
                resources2 = cVar.f16975b;
            } else {
                resources2 = null;
            }
            this.f16975b = resources2;
            if (cVar != null) {
                i6 = cVar.f16976c;
            } else {
                i6 = 0;
            }
            int i10 = b.G;
            i6 = resources != null ? resources.getDisplayMetrics().densityDpi : i6;
            i6 = i6 == 0 ? 160 : i6;
            this.f16976c = i6;
            if (cVar != null) {
                this.f16977d = cVar.f16977d;
                this.f16978e = cVar.f16978e;
                this.f16992u = true;
                this.f16993v = true;
                this.f16981i = cVar.f16981i;
                this.f16984l = cVar.f16984l;
                this.f16994w = cVar.f16994w;
                this.f16995x = cVar.f16995x;
                this.f16996y = cVar.f16996y;
                this.f16997z = cVar.f16997z;
                this.A = cVar.A;
                this.B = cVar.B;
                this.C = cVar.C;
                this.D = cVar.D;
                this.E = cVar.E;
                this.F = cVar.F;
                this.G = cVar.G;
                if (cVar.f16976c == i6) {
                    if (cVar.f16982j) {
                        this.f16983k = cVar.f16983k != null ? new Rect(cVar.f16983k) : null;
                        this.f16982j = true;
                    }
                    if (cVar.f16985m) {
                        this.f16986n = cVar.f16986n;
                        this.f16987o = cVar.f16987o;
                        this.f16988p = cVar.f16988p;
                        this.f16989q = cVar.f16989q;
                        this.f16985m = true;
                    }
                }
                if (cVar.r) {
                    this.f16990s = cVar.f16990s;
                    this.r = true;
                }
                if (cVar.f16991t) {
                    this.f16991t = true;
                }
                Drawable[] drawableArr = cVar.f16979g;
                this.f16979g = new Drawable[drawableArr.length];
                this.f16980h = cVar.f16980h;
                SparseArray<Drawable.ConstantState> sparseArray = cVar.f;
                if (sparseArray != null) {
                    this.f = sparseArray.clone();
                } else {
                    this.f = new SparseArray<>(this.f16980h);
                }
                int i11 = this.f16980h;
                for (int i12 = 0; i12 < i11; i12++) {
                    Drawable drawable = drawableArr[i12];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f.put(i12, constantState);
                        } else {
                            this.f16979g[i12] = drawableArr[i12];
                        }
                    }
                }
                return;
            }
            this.f16979g = new Drawable[10];
            this.f16980h = 0;
        }

        public final int a(Drawable drawable) {
            int i6 = this.f16980h;
            if (i6 >= this.f16979g.length) {
                int i10 = i6 + 10;
                d.a aVar = (d.a) this;
                Drawable[] drawableArr = new Drawable[i10];
                Drawable[] drawableArr2 = aVar.f16979g;
                if (drawableArr2 != null) {
                    System.arraycopy(drawableArr2, 0, drawableArr, 0, i6);
                }
                aVar.f16979g = drawableArr;
                int[][] iArr = new int[i10];
                System.arraycopy(aVar.H, 0, iArr, 0, i6);
                aVar.H = iArr;
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f16974a);
            this.f16979g[i6] = drawable;
            this.f16980h++;
            this.f16978e = drawable.getChangingConfigurations() | this.f16978e;
            this.r = false;
            this.f16991t = false;
            this.f16983k = null;
            this.f16982j = false;
            this.f16985m = false;
            this.f16992u = false;
            return i6;
        }

        public final void b() {
            this.f16985m = true;
            c();
            int i6 = this.f16980h;
            Drawable[] drawableArr = this.f16979g;
            this.f16987o = -1;
            this.f16986n = -1;
            this.f16989q = 0;
            this.f16988p = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                Drawable drawable = drawableArr[i10];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f16986n) {
                    this.f16986n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f16987o) {
                    this.f16987o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f16988p) {
                    this.f16988p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f16989q) {
                    this.f16989q = minimumHeight;
                }
            }
        }

        public final void c() {
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    int keyAt = this.f.keyAt(i6);
                    Drawable[] drawableArr = this.f16979g;
                    Drawable newDrawable = this.f.valueAt(i6).newDrawable(this.f16975b);
                    if (Build.VERSION.SDK_INT >= 23) {
                        k0.a.c(newDrawable, this.f16995x);
                    }
                    Drawable mutate = newDrawable.mutate();
                    mutate.setCallback(this.f16974a);
                    drawableArr[keyAt] = mutate;
                }
                this.f = null;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            int i6 = this.f16980h;
            Drawable[] drawableArr = this.f16979g;
            for (int i10 = 0; i10 < i6; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null) {
                    if (a.b.b(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = this.f.get(i10);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                }
            }
            return false;
        }

        public final Drawable d(int i6) {
            int indexOfKey;
            Drawable drawable = this.f16979g[i6];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<Drawable.ConstantState> sparseArray = this.f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i6)) < 0) {
                return null;
            }
            Drawable newDrawable = this.f.valueAt(indexOfKey).newDrawable(this.f16975b);
            if (Build.VERSION.SDK_INT >= 23) {
                k0.a.c(newDrawable, this.f16995x);
            }
            Drawable mutate = newDrawable.mutate();
            mutate.setCallback(this.f16974a);
            this.f16979g[i6] = mutate;
            this.f.removeAt(indexOfKey);
            if (this.f.size() == 0) {
                this.f = null;
            }
            return mutate;
        }

        public abstract void e();

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f16977d | this.f16978e;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z10) {
        boolean z11;
        Drawable drawable;
        boolean z12 = true;
        this.f16971z = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            long j10 = this.D;
            if (j10 != 0) {
                if (j10 <= uptimeMillis) {
                    drawable2.setAlpha(this.f16970y);
                    this.D = 0L;
                } else {
                    drawable2.setAlpha(((255 - (((int) ((j10 - uptimeMillis) * 255)) / this.f16966u.f16996y)) * this.f16970y) / 255);
                    z11 = true;
                    drawable = this.f16969x;
                    if (drawable == null) {
                        long j11 = this.E;
                        if (j11 != 0) {
                            if (j11 <= uptimeMillis) {
                                drawable.setVisible(false, false);
                                this.f16969x = null;
                                this.E = 0L;
                            } else {
                                drawable.setAlpha(((((int) ((j11 - uptimeMillis) * 255)) / this.f16966u.f16997z) * this.f16970y) / 255);
                                if (z10 && z12) {
                                    scheduleSelf(this.C, uptimeMillis + 16);
                                    return;
                                }
                                return;
                            }
                        }
                    } else {
                        this.E = 0L;
                    }
                    z12 = z11;
                    if (z10) {
                        return;
                    }
                    return;
                }
            }
        } else {
            this.D = 0L;
        }
        z11 = false;
        drawable = this.f16969x;
        if (drawable == null) {
        }
        z12 = z11;
        if (z10) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        c cVar = this.f16966u;
        if (theme != null) {
            cVar.c();
            int i6 = cVar.f16980h;
            Drawable[] drawableArr = cVar.f16979g;
            for (int i10 = 0; i10 < i6; i10++) {
                Drawable drawable = drawableArr[i10];
                if (drawable != null && a.b.b(drawable)) {
                    a.b.a(drawableArr[i10], theme);
                    cVar.f16978e |= drawableArr[i10].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                cVar.f16975b = resources;
                int i11 = resources.getDisplayMetrics().densityDpi;
                if (i11 == 0) {
                    i11 = 160;
                }
                int i12 = cVar.f16976c;
                cVar.f16976c = i11;
                if (i12 != i11) {
                    cVar.f16985m = false;
                    cVar.f16982j = false;
                    return;
                }
                return;
            }
            return;
        }
        cVar.getClass();
    }

    public c b() {
        throw null;
    }

    public final void c(Drawable drawable) {
        if (this.F == null) {
            this.F = new C0266b();
        }
        C0266b c0266b = this.F;
        c0266b.f16973u = drawable.getCallback();
        drawable.setCallback(c0266b);
        try {
            if (this.f16966u.f16996y <= 0 && this.f16971z) {
                drawable.setAlpha(this.f16970y);
            }
            c cVar = this.f16966u;
            if (cVar.C) {
                drawable.setColorFilter(cVar.B);
            } else {
                if (cVar.F) {
                    a.b.h(drawable, cVar.D);
                }
                c cVar2 = this.f16966u;
                if (cVar2.G) {
                    a.b.i(drawable, cVar2.E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f16966u.f16994w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                k0.a.c(drawable, k0.a.b(this));
            }
            a.C0349a.e(drawable, this.f16966u.A);
            Rect rect = this.f16967v;
            if (rect != null) {
                a.b.f(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            C0266b c0266b2 = this.F;
            Drawable.Callback callback = c0266b2.f16973u;
            c0266b2.f16973u = null;
            drawable.setCallback(callback);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f16966u.canApplyTheme();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(int i6) {
        a aVar;
        if (i6 == this.A) {
            return false;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f16966u.f16997z > 0) {
            Drawable drawable = this.f16969x;
            if (drawable != null) {
                drawable.setVisible(false, false);
            }
            Drawable drawable2 = this.f16968w;
            if (drawable2 != null) {
                this.f16969x = drawable2;
                this.E = this.f16966u.f16997z + uptimeMillis;
            } else {
                this.f16969x = null;
                this.E = 0L;
            }
        } else {
            Drawable drawable3 = this.f16968w;
            if (drawable3 != null) {
                drawable3.setVisible(false, false);
            }
        }
        if (i6 >= 0) {
            c cVar = this.f16966u;
            if (i6 < cVar.f16980h) {
                Drawable d10 = cVar.d(i6);
                this.f16968w = d10;
                this.A = i6;
                if (d10 != null) {
                    int i10 = this.f16966u.f16996y;
                    if (i10 > 0) {
                        this.D = uptimeMillis + i10;
                    }
                    c(d10);
                }
                if (this.D == 0 || this.E != 0) {
                    aVar = this.C;
                    if (aVar != null) {
                        this.C = new a((d) this);
                    } else {
                        unscheduleSelf(aVar);
                    }
                    a(true);
                }
                invalidateSelf();
                return true;
            }
        }
        this.f16968w = null;
        this.A = -1;
        if (this.D == 0) {
        }
        aVar = this.C;
        if (aVar != null) {
        }
        a(true);
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f16969x;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public void e(c cVar) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f16970y;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        c cVar = this.f16966u;
        return changingConfigurations | cVar.f16978e | cVar.f16977d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z10;
        c cVar = this.f16966u;
        if (cVar.f16992u) {
            z10 = cVar.f16993v;
        } else {
            cVar.c();
            cVar.f16992u = true;
            int i6 = cVar.f16980h;
            Drawable[] drawableArr = cVar.f16979g;
            int i10 = 0;
            while (true) {
                if (i10 < i6) {
                    if (drawableArr[i10].getConstantState() == null) {
                        cVar.f16993v = false;
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    cVar.f16993v = true;
                    z10 = true;
                    break;
                }
            }
        }
        if (z10) {
            this.f16966u.f16977d = getChangingConfigurations();
            return this.f16966u;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f16968w;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f16967v;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        c cVar = this.f16966u;
        if (cVar.f16984l) {
            if (!cVar.f16985m) {
                cVar.b();
            }
            return cVar.f16987o;
        }
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        c cVar = this.f16966u;
        if (cVar.f16984l) {
            if (!cVar.f16985m) {
                cVar.b();
            }
            return cVar.f16986n;
        }
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        c cVar = this.f16966u;
        if (cVar.f16984l) {
            if (!cVar.f16985m) {
                cVar.b();
            }
            return cVar.f16989q;
        }
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        c cVar = this.f16966u;
        if (cVar.f16984l) {
            if (!cVar.f16985m) {
                cVar.b();
            }
            return cVar.f16988p;
        }
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f16968w;
        int i6 = -2;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        c cVar = this.f16966u;
        if (cVar.r) {
            return cVar.f16990s;
        }
        cVar.c();
        int i10 = cVar.f16980h;
        Drawable[] drawableArr = cVar.f16979g;
        if (i10 > 0) {
            i6 = drawableArr[0].getOpacity();
        }
        for (int i11 = 1; i11 < i10; i11++) {
            i6 = Drawable.resolveOpacity(i6, drawableArr[i11].getOpacity());
        }
        cVar.f16990s = i6;
        cVar.r = true;
        return i6;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding;
        c cVar = this.f16966u;
        boolean z10 = true;
        Rect rect2 = null;
        if (!cVar.f16981i) {
            Rect rect3 = cVar.f16983k;
            if (rect3 == null && !cVar.f16982j) {
                cVar.c();
                Rect rect4 = new Rect();
                int i6 = cVar.f16980h;
                Drawable[] drawableArr = cVar.f16979g;
                for (int i10 = 0; i10 < i6; i10++) {
                    if (drawableArr[i10].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i11 = rect4.left;
                        if (i11 > rect2.left) {
                            rect2.left = i11;
                        }
                        int i12 = rect4.top;
                        if (i12 > rect2.top) {
                            rect2.top = i12;
                        }
                        int i13 = rect4.right;
                        if (i13 > rect2.right) {
                            rect2.right = i13;
                        }
                        int i14 = rect4.bottom;
                        if (i14 > rect2.bottom) {
                            rect2.bottom = i14;
                        }
                    }
                }
                cVar.f16982j = true;
                cVar.f16983k = rect2;
            } else {
                rect2 = rect3;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f16968w;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if ((this.f16966u.A && k0.a.b(this) == 1) ? false : false) {
            int i15 = rect.left;
            rect.left = rect.right;
            rect.right = i15;
        }
        return padding;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        c cVar = this.f16966u;
        if (cVar != null) {
            cVar.r = false;
            cVar.f16991t = false;
        }
        if (drawable == this.f16968w && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f16966u.A;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z10;
        Drawable drawable = this.f16969x;
        boolean z11 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f16969x = null;
            z10 = true;
        } else {
            z10 = false;
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f16971z) {
                this.f16968w.setAlpha(this.f16970y);
            }
        }
        if (this.E != 0) {
            this.E = 0L;
            z10 = true;
        }
        if (this.D != 0) {
            this.D = 0L;
        } else {
            z11 = z10;
        }
        if (z11) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.B && super.mutate() == this) {
            c b10 = b();
            b10.e();
            e(b10);
            this.B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f16969x;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i6) {
        boolean z10;
        c cVar = this.f16966u;
        int i10 = this.A;
        int i11 = cVar.f16980h;
        Drawable[] drawableArr = cVar.f16979g;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            Drawable drawable = drawableArr[i12];
            if (drawable != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = k0.a.c(drawable, i6);
                } else {
                    z10 = false;
                }
                if (i12 == i10) {
                    z11 = z10;
                }
            }
        }
        cVar.f16995x = i6;
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i6) {
        Drawable drawable = this.f16969x;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            return drawable2.setLevel(i6);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f16969x;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        if (drawable == this.f16968w && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i6) {
        if (!this.f16971z || this.f16970y != i6) {
            this.f16971z = true;
            this.f16970y = i6;
            Drawable drawable = this.f16968w;
            if (drawable != null) {
                if (this.D == 0) {
                    drawable.setAlpha(i6);
                } else {
                    a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        c cVar = this.f16966u;
        if (cVar.A != z10) {
            cVar.A = z10;
            Drawable drawable = this.f16968w;
            if (drawable != null) {
                a.C0349a.e(drawable, z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        c cVar = this.f16966u;
        cVar.C = true;
        if (cVar.B != colorFilter) {
            cVar.B = colorFilter;
            Drawable drawable = this.f16968w;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z10) {
        c cVar = this.f16966u;
        if (cVar.f16994w != z10) {
            cVar.f16994w = z10;
            Drawable drawable = this.f16968w;
            if (drawable != null) {
                drawable.setDither(z10);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            a.b.e(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i6, int i10, int i11, int i12) {
        Rect rect = this.f16967v;
        if (rect == null) {
            this.f16967v = new Rect(i6, i10, i11, i12);
        } else {
            rect.set(i6, i10, i11, i12);
        }
        Drawable drawable = this.f16968w;
        if (drawable != null) {
            a.b.f(drawable, i6, i10, i11, i12);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        c cVar = this.f16966u;
        cVar.F = true;
        if (cVar.D != colorStateList) {
            cVar.D = colorStateList;
            k0.a.e(this.f16968w, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f16966u;
        cVar.G = true;
        if (cVar.E != mode) {
            cVar.E = mode;
            k0.a.f(this.f16968w, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        Drawable drawable = this.f16969x;
        if (drawable != null) {
            drawable.setVisible(z10, z11);
        }
        Drawable drawable2 = this.f16968w;
        if (drawable2 != null) {
            drawable2.setVisible(z10, z11);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f16968w && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* compiled from: DrawableContainerCompat.java */
    /* renamed from: h.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0266b implements Drawable.Callback {

        /* renamed from: u  reason: collision with root package name */
        public Drawable.Callback f16973u;

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
            Drawable.Callback callback = this.f16973u;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j10);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f16973u;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
        }
    }
}
