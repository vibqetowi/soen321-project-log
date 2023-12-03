package yb;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: m  reason: collision with root package name */
    public static final g f38451m = new g(0.5f);

    /* renamed from: a  reason: collision with root package name */
    public final df.b f38452a;

    /* renamed from: b  reason: collision with root package name */
    public final df.b f38453b;

    /* renamed from: c  reason: collision with root package name */
    public final df.b f38454c;

    /* renamed from: d  reason: collision with root package name */
    public final df.b f38455d;

    /* renamed from: e  reason: collision with root package name */
    public final c f38456e;
    public final c f;

    /* renamed from: g  reason: collision with root package name */
    public final c f38457g;

    /* renamed from: h  reason: collision with root package name */
    public final c f38458h;

    /* renamed from: i  reason: collision with root package name */
    public final e f38459i;

    /* renamed from: j  reason: collision with root package name */
    public final e f38460j;

    /* renamed from: k  reason: collision with root package name */
    public final e f38461k;

    /* renamed from: l  reason: collision with root package name */
    public final e f38462l;

    public i(a aVar) {
        this.f38452a = aVar.f38463a;
        this.f38453b = aVar.f38464b;
        this.f38454c = aVar.f38465c;
        this.f38455d = aVar.f38466d;
        this.f38456e = aVar.f38467e;
        this.f = aVar.f;
        this.f38457g = aVar.f38468g;
        this.f38458h = aVar.f38469h;
        this.f38459i = aVar.f38470i;
        this.f38460j = aVar.f38471j;
        this.f38461k = aVar.f38472k;
        this.f38462l = aVar.f38473l;
    }

    public static a a(Context context, int i6, int i10, c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i6);
        if (i10 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i10);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(ug.l.I);
        try {
            int i11 = obtainStyledAttributes.getInt(0, 0);
            int i12 = obtainStyledAttributes.getInt(3, i11);
            int i13 = obtainStyledAttributes.getInt(4, i11);
            int i14 = obtainStyledAttributes.getInt(2, i11);
            int i15 = obtainStyledAttributes.getInt(1, i11);
            c c10 = c(obtainStyledAttributes, 5, cVar);
            c c11 = c(obtainStyledAttributes, 8, c10);
            c c12 = c(obtainStyledAttributes, 9, c10);
            c c13 = c(obtainStyledAttributes, 7, c10);
            c c14 = c(obtainStyledAttributes, 6, c10);
            a aVar = new a();
            df.b t02 = f6.b.t0(i12);
            aVar.f38463a = t02;
            float b10 = a.b(t02);
            if (b10 != -1.0f) {
                aVar.e(b10);
            }
            aVar.f38467e = c11;
            df.b t03 = f6.b.t0(i13);
            aVar.f38464b = t03;
            float b11 = a.b(t03);
            if (b11 != -1.0f) {
                aVar.f(b11);
            }
            aVar.f = c12;
            df.b t04 = f6.b.t0(i14);
            aVar.f38465c = t04;
            float b12 = a.b(t04);
            if (b12 != -1.0f) {
                aVar.d(b12);
            }
            aVar.f38468g = c13;
            df.b t05 = f6.b.t0(i15);
            aVar.f38466d = t05;
            float b13 = a.b(t05);
            if (b13 != -1.0f) {
                aVar.c(b13);
            }
            aVar.f38469h = c14;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i6, int i10) {
        yb.a aVar = new yb.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ug.l.f34141y, i6, i10);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i6, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i6);
        if (peekValue == null) {
            return cVar;
        }
        int i10 = peekValue.type;
        if (i10 == 5) {
            return new yb.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        if (i10 == 6) {
            return new g(peekValue.getFraction(1.0f, 1.0f));
        }
        return cVar;
    }

    public final boolean d(RectF rectF) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (this.f38462l.getClass().equals(e.class) && this.f38460j.getClass().equals(e.class) && this.f38459i.getClass().equals(e.class) && this.f38461k.getClass().equals(e.class)) {
            z10 = true;
        } else {
            z10 = false;
        }
        float a10 = this.f38456e.a(rectF);
        if (this.f.a(rectF) == a10 && this.f38458h.a(rectF) == a10 && this.f38457g.a(rectF) == a10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((this.f38453b instanceof h) && (this.f38452a instanceof h) && (this.f38454c instanceof h) && (this.f38455d instanceof h)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 && z11 && z12) {
            return true;
        }
        return false;
    }

    public final i e(float f) {
        a aVar = new a(this);
        aVar.e(f);
        aVar.f(f);
        aVar.d(f);
        aVar.c(f);
        return new i(aVar);
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public df.b f38463a;

        /* renamed from: b  reason: collision with root package name */
        public df.b f38464b;

        /* renamed from: c  reason: collision with root package name */
        public df.b f38465c;

        /* renamed from: d  reason: collision with root package name */
        public df.b f38466d;

        /* renamed from: e  reason: collision with root package name */
        public c f38467e;
        public c f;

        /* renamed from: g  reason: collision with root package name */
        public c f38468g;

        /* renamed from: h  reason: collision with root package name */
        public c f38469h;

        /* renamed from: i  reason: collision with root package name */
        public final e f38470i;

        /* renamed from: j  reason: collision with root package name */
        public final e f38471j;

        /* renamed from: k  reason: collision with root package name */
        public final e f38472k;

        /* renamed from: l  reason: collision with root package name */
        public final e f38473l;

        public a() {
            this.f38463a = new h();
            this.f38464b = new h();
            this.f38465c = new h();
            this.f38466d = new h();
            this.f38467e = new yb.a(0.0f);
            this.f = new yb.a(0.0f);
            this.f38468g = new yb.a(0.0f);
            this.f38469h = new yb.a(0.0f);
            this.f38470i = new e();
            this.f38471j = new e();
            this.f38472k = new e();
            this.f38473l = new e();
        }

        public static float b(df.b bVar) {
            if (bVar instanceof h) {
                return ((h) bVar).B;
            }
            if (bVar instanceof d) {
                return ((d) bVar).B;
            }
            return -1.0f;
        }

        public final i a() {
            return new i(this);
        }

        public final void c(float f) {
            this.f38469h = new yb.a(f);
        }

        public final void d(float f) {
            this.f38468g = new yb.a(f);
        }

        public final void e(float f) {
            this.f38467e = new yb.a(f);
        }

        public final void f(float f) {
            this.f = new yb.a(f);
        }

        public a(i iVar) {
            this.f38463a = new h();
            this.f38464b = new h();
            this.f38465c = new h();
            this.f38466d = new h();
            this.f38467e = new yb.a(0.0f);
            this.f = new yb.a(0.0f);
            this.f38468g = new yb.a(0.0f);
            this.f38469h = new yb.a(0.0f);
            this.f38470i = new e();
            this.f38471j = new e();
            this.f38472k = new e();
            this.f38473l = new e();
            this.f38463a = iVar.f38452a;
            this.f38464b = iVar.f38453b;
            this.f38465c = iVar.f38454c;
            this.f38466d = iVar.f38455d;
            this.f38467e = iVar.f38456e;
            this.f = iVar.f;
            this.f38468g = iVar.f38457g;
            this.f38469h = iVar.f38458h;
            this.f38470i = iVar.f38459i;
            this.f38471j = iVar.f38460j;
            this.f38472k = iVar.f38461k;
            this.f38473l = iVar.f38462l;
        }
    }

    public i() {
        this.f38452a = new h();
        this.f38453b = new h();
        this.f38454c = new h();
        this.f38455d = new h();
        this.f38456e = new yb.a(0.0f);
        this.f = new yb.a(0.0f);
        this.f38457g = new yb.a(0.0f);
        this.f38458h = new yb.a(0.0f);
        this.f38459i = new e();
        this.f38460j = new e();
        this.f38461k = new e();
        this.f38462l = new e();
    }
}
